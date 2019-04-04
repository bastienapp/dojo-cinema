# Salle de cinéma

Un employé de cinéma voudrait afficher la liste de tous les numéro de sièges présents dans une salle.

Dans une salle, les sièges sont répartis de la manière suivantes : 
* Il y a "x" rangées de sièges, numérotés de "1" à "x"
* Chaque rangées contient "y" colonnes de sièges, numérotés de "1" à "y"

Une numéro de siège se présente sur la forme "x-y", par exemple "12-34" (12ème rangée et 34ème colonne).

Écrire une méthode qui retourne un tableau comprenant tous les numéros des sièges, calculé à partir du nombre de rangées et du nombre de sièges par rangée.

Exemple de résultat attendu pour une salle de 26 rangées de 100 sièges : 

{
    "1-1",
    "1-2",
    "1-3",
    ...
    "1-99",
    "1-100",
    ...
    ...
    "26-98",
    "26-99",
    "26-100"
}

Rappel des commande junit :

    javac -cp .:junit-4.12.jar CinemaTest.java
    java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore CinemaTest