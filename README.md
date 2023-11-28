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

## 3 - Préparer le layout du Main

#### 3.2 - Le layout activity_main.xml

- Aout du TabLayout pour la gestion des onglets

## 4 - Le code de MainActivity

#### Ce référer à l'ordre des informations dans le MainActivity

## 5 - Ajout de BaseActivity

## 6 - Les cycles de vie des Fragments

Avant de commencer cette étude il est préférable de sauvegrader sa version dans Github puis de créer
une seconde branche.

Pour faire le test de cette façon, il sera possible d'un part de garder ce morceau de code comme un
Template puis dans un second temps étudier
les cycles de vie dans les fagments dans une branche que l'on pourra supprimer.

<table><tr>
<td><img src="https://fr.linux-console.net/common-images/android-fragment-lifecycle/android-fragments-activity-450x428.png"/></td>
<td><img src="https://fr.linux-console.net/common-images/android-fragment-lifecycle/android-fragment-lifecycle-364x450.png"/></td>
</tr></table>


Dans le seconde branche ajouter les méthodes suivantes, on pour l'affichage des logs nous
utiliserons une class utils pour faciliter l'integration.

#### - onAttach() :

Cette méthode sera appelée en premier, avant même onCreate(), nous indiquant que votre fragment a
été attaché à une activité. L'activité qui hébergera votre fragment vous est transmise

#### - onCreateView() :

le système appelle ce rappel lorsqu'il est temps pour le fragment de dessiner son interface
utilisateur pour la première fois. Pour dessiner une interface utilisateur pour le fragment, un
composant View doit être renvoyé à partir de cette méthode qui est la racine de la mise en page du
fragment. Nous pouvons renvoyer null si le fragment ne fournit pas d'interface utilisateur

#### - onViewCreated() :

Ceci sera appelé après onCreateView(). Ceci est particulièrement utile lors de l'héritage de l'
implémentation onCreateView() mais nous devons configurer les vues résultantes, comme avec un
ListFragment et quand configurer un adaptateur

#### - onStart() :

la méthode onStart() est appelée une fois que le fragment devient visible

#### - onPause() :

le système appelle cette méthode comme première indication que l'utilisateur quitte le fragment.
C'est généralement là que vous devez valider les modifications qui doivent être conservées au-delà
de la session utilisateur en cours

#### - onStop() :

Fragment qui va être arrêté en appelant onStop()

#### - onDestroyView() :

il est appelé avant onDestroy(). C'est l'équivalent de onCreateView() où nous configurons
l'interface utilisateur. S'il y a des choses qui doivent être nettoyées spécifiques à l'interface
utilisateur, alors cette logique peut être mise en place dans onDestroyView()

#### - onDestroy() :

onDestroy() appelé pour effectuer le nettoyage final de l'état du fragment, mais il n'est pas
garanti qu'il soit appelé par la plate-forme Android.

#### - onDetach() :

il est appelé après onDestroy(), pour notifier que le fragment a été dissocié de son activité
d'hébergement








