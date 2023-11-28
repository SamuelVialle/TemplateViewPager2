# Le View Pager 2

## Part 1 - Le ViewPAge

#### 1.1 - Définition

<div align="justify">
Le viewPager sert à balayer des vues pour naviguer entre des écrans frères tels que des onglets, 
avec un geste horizontal du doigt ou balayage. Ce schéma de navigation est également appelé pagination
horizontale. Cette rubrique vous explique comment créer une mise en page d'onglets avec des vues à 
balayer pour passer d'un onglet à l'autre.
</div>

#### 1.2 - Implémentations des dépendances (librairies)

- Ajouter dans le fichier gradle(module) l'implémentation de la librairie

``` gradle
// La librairie du ViewPage2
implementation 'androidx.viewpager2:viewpager2:1.0.0'
```

#### 1.3 Ajout dans le design de activity_main

- Ajout du container qui va recevoir les fragments dans le layout : le viewPager2

``` xml
    <androidx.viewpager2.widget.ViewPager2
        android:id="@+id/viewPager2"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        app:layout_constraintBottom_toTopOf="@+id/tabLayout"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
``` 

#### 1.4 - Ajouter 3 vectors asset dans le package drawable (un pour chaque onglet, ici rechercher 'looks' pour trouver 1, 2, 3)

- Clic droit sur drawable → New → Vector Asset et ajouter les 3 icônes

#### 1.5 - Ajout du TabLayouts

- Les Tabs seront ajouter directement dans le code de MainActivity

``` xml
       <com.google.android.material.tabs.TabLayout
        android:id="@+id/tabLayout"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toStartOf="parent" /> 
``` 

## Part 2 - Les Fragments
Ajouter les trois fragments dans le package principal : Clic droit sur le package principal → New → Fragment → Fragment(Blank).
Noter que comme pour les activités il est plus simple de créer un Fragment en utilisiant le GUI, plutôt que de créer une classe Java
puis, de l'associer à son delayout (attention, il s'agit de Fragments et n'apparaissent pas dans le Manifest)

#### 2.2 - Ajustement du code des fragements
Supprimer le code Java des dîts fichiers et ne garder que la méthode onCreateView (cf ci-dessous).
``` java
public class F01_Fragment extends Fragment {
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_f01, container, false);
        return view;
    }
}
```

Pour plus d'information se référer
à : https://developer.android.com/jetpack/androidx/releases/viewpager2?hl=fr#androidx-deps

#### 2.3 - Modification du design des Fragments

Ajouter un 1 au fragment_f01, 2 au fragment_f02, 3 au fragme...

## 3 - Le code de MainActivity

#### Ce référer à l'ordre des informations dans le MainActivity








