package com.example.templateviewpager2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    /** 1 Initialisation des composants graphiques **/
    private TabLayout tabLayout;
    private ViewPager2 viewPager2;

    private void initUI(){
        tabLayout = findViewById(R.id.tabLayout);
        viewPager2 = findViewById(R.id.viewPager2);
    }

    /** 2 Le paramètrage du ViewPager 2 **/
    private FragmentAdapter adapter;

    private void initViewPager(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        adapter = new FragmentAdapter(fragmentManager, getLifecycle());
        viewPager2.setAdapter(adapter);
    }

    /** 3 Paramètrage du TabLayout **/
    private void initTabLayout(){
        // Les titres
        tabLayout.addTab(tabLayout.newTab().setText("ONE"));
        tabLayout.addTab(tabLayout.newTab().setText("TWO"));
        tabLayout.addTab(tabLayout.newTab().setText("TRI"));

        tabLayout.getTabAt(0).setIcon(R.drawable.looks_one_24);
        tabLayout.getTabAt(1).setIcon(R.drawable.looks_two_24);
        tabLayout.getTabAt(2).setIcon(R.drawable.looks_3_24);
    }

    /** 4 La gestion des clics sur les tabs **/
    private void gestionClickTab(){
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
                Log.i("TAG", "TabSelected: " + tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        initViewPager();
        initTabLayout();
        gestionClickTab();
    }
}