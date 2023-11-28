# Le View Pager 2
## 1 - Définition
<div align="justify">
Le viewPager sert à balayer des vues pour naviguer entre des écrans frères tels que des onglets, 
avec un geste horizontal du doigt ou balayage. Ce schéma de navigation est également appelé pagination
horizontale. Cette rubrique vous explique comment créer une mise en page d'onglets avec des vues à 
balayer pour passer d'un onglet à l'autre, et comment afficher une barre de titre plutôt que des onglets.
</div>

## 2 - Implémentation
#### 2.1 - Les dépendances (librairies)
- Ajouter dans le fichier gradle(module) l'implémentation de la librairie
``` gradle
// La librairie du ViewPage2
implementation 'androidx.viewpager2:viewpager2:1.0.0'
```
#### 2.2 - Les Fragments
Ajouter les trois fragments dans le package principal : Clic droit sur le package principal → New → Fragment → Fragment(Blank).
Noter que comme pour les activités il est plus simple de créer un Fragment en utilisiant le GUI, plutôt que de créer une classe Java
puis, de l'associer à son delayout (attention, il s'agit de Fragments et n'apparaissent pas dans le Manifest)

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
Pour plus d'information se référer à : https://developer.android.com/jetpack/androidx/releases/viewpager2?hl=fr#androidx-deps
#### 2.3 - Modification du design des Fragments
Ajouter un 1 au fragment_f01, 2 au fragment_f02, 3 au fragme...

## 3 - Préparer le layout du Main
#### 3.1 - Ajouter 3 vectors asset dans le package drawable (un pour chaque onglet, ici rechercher 'looks' pour trouver 1, 2, 3)
Clic droit sur drawable → New → Vector Asset et ajouter les 3 icônes
#### 3.2 - Le layout activity_main.xml
- Ajout du container qui va recevoir les fragments dans le layout 
- Aout du TabLayout pour la gestion des onglets

## 4 - Le code de MainActivity
#### Ce référer à l'ordre des informations dans le MainActivity

## 5 - Les cycles de vie des Fragment
Avant de commencer cette étude il est préférable de suavegrader sa version dans Github puis de créer une seconde branche. Pour faire 
le test de cette façon, il sera possible d'un part de garder ce morceau de code comme un Template puis dans un second temps étudier 
les cycles de vie dans les fagments dans une branche que l'on pourra supprimer.






