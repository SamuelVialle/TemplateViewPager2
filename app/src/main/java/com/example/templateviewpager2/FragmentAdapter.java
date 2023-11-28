package com.example.templateviewpager2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdapter extends FragmentStateAdapter {
                                // Pour corriger l'erreur lors de l'ajout de l'extension : [ALT] + [ENTER]

    /** Le constructeur de l'adapter **/
    public FragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    /** Cette méthode (ajoutée du fait de l'extension) sert à initialiser les Fragments dans leur context (env) **/
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new F01_Fragment();
            case 1:
                return new F02_Fragment();
            case 2:
                return new F03_Fragment();
        }
        return null;
    }

    /** Cette méthode (ajoutée du fait de l'extension) permet de compter le nombre de tab du tabLayout **/
    @Override
    public int getItemCount() {
        return 3;
    }
}
