package com.example.templateviewpager2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    /**
     * 1 Initialisation des composants graphiques
     **/
    private TabLayout tabLayout;
    private ViewPager2 viewPager2;

    private void initUI() { // Ne pas oublier de l'ajouter dans le cycle de vie du onCreate (1.1)
        tabLayout = findViewById(R.id.tabLayout);
        viewPager2 = findViewById(R.id.viewPager2);
    }

    /**
     * 2 Le paramètrage du ViewPager 2
     **/
    private FragmentAdapter adapter; // Cette déclaration ne se place pas ici mais pour l'exemple c'est plus simple

    private void initViewPager() {  // Ne pas oublier de l'ajouter dans le cycle de vie du onCreate (2.1)
        FragmentManager fragmentManager = getSupportFragmentManager();
        adapter = new FragmentAdapter(fragmentManager, getLifecycle());
        viewPager2.setAdapter(adapter);
    }

    /**
     * 3 Paramètrage du TabLayout
     **/
    private void initTabLayout() { // Ne pas oublier de l'ajouter dans le cycle de vie du onCreate (3.1)
//        // Cas n°1 : Affiche juste le titre (version simple et concaténée)
//        tabLayout.addTab(tabLayout.newTab().setText("ONE"));
//        tabLayout.addTab(tabLayout.newTab().setText("TWO"));
//        tabLayout.addTab(tabLayout.newTab().setText("TRI"));

        // Déclaration et valorisation des objects Tab(onglets) du TabLayout (valable pour tous les exemples suivants)
        TabLayout.Tab tabLayout1 = tabLayout.newTab();
        TabLayout.Tab tabLayout2 = tabLayout.newTab();
        TabLayout.Tab tabLayout3 = tabLayout.newTab();

        // Ajout des Tab au tabLayout
        tabLayout.addTab(tabLayout1);
        tabLayout.addTab(tabLayout2);
        tabLayout.addTab(tabLayout3);

//        // Cas n°2 : Affiche du titre (version dé-concaténée)
//        // Association du texte
//        tabLayout1.setText("ONE");
//        tabLayout2.setText("TWO");
//        tabLayout3.setText("THREE");

//        // Cas n°3 : Affiche juste les icônes
//        tabLayout1.setIcon(R.drawable.looks_one_24);
//        tabLayout2.setIcon(R.drawable.looks_two_24);
//        tabLayout3.setIcon(R.drawable.looks_3_24);

        // Cas n°3 Affiche le texte et les icônes
        tabLayout1.setText("ONE").setIcon(R.drawable.looks_one_24);
        tabLayout2.setText("TWO").setIcon(R.drawable.looks_two_24);
        tabLayout3.setText("THREE").setIcon(R.drawable.looks_three_24);

//        // Noter qu'il est possible de faire référence aux tab par leur index pour ajouter les icônes
//        tabLayout.getTabAt(0).setIcon(R.drawable.looks_one_24);
//        tabLayout.getTabAt(1).setIcon(R.drawable.looks_two_24);
//        tabLayout.getTabAt(2).setIcon(R.drawable.looks_3_24);
    }

    /**
     * 4 La gestion des clics sur les tabs se fait grâce à la méthode addOnTabSelectedListener
     * trois méthodes sont ajouter lors de la création du nouvel object,
     * - lorqu'elle est sélectionnée
     * - lorsuq'elle n'est pas sélectionnée
     * - lorsqu'elle est re-sélectionnée
     **/
    private void gestionClickTab() { // Ne pas oublier de l'ajouter dans le onCreate (4.1)
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                // Dans un premier temps on regardde l'action dans les logds
                Log.i("TAG", "TabSelected: " + tab.getPosition());
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {/* Rien ici dans le cadre de cet exemple */}

            @Override
            public void onTabReselected(TabLayout.Tab tab) {/* Rien ici dans le cadre de cet exemple */}
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI(); // 1.1
        initViewPager(); // 2.1
        initTabLayout(); // 3.1
        gestionClickTab(); // 4.1
    }

}