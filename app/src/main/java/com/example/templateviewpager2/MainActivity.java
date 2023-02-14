package com.example.templateviewpager2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
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


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        initViewPager();
        initTabLayout();
    }
}