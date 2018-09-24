# Java Polymorphisme

https://www.cours-gratuit.com/java/exercice-polymorphisme-java-tour-de-carte

Vous vous intéressez dans cet exercice à décrire les données d'un jeu simulant des combats de magiciens.

Dans ce jeu, il existe trois types de cartes : les terrains, les créatures et les sortilèges.

- Les terrains possèdent une couleur (parmi 5 : blanc('B'), bleu ('b'), noir ('n'), rouge ('r') et vert ('v').)
- Les créatures possèdent un nom, un nombre de points de dégâts et un nombre de points de vie.
- Les sortilèges possèdent un nom et une explication sous forme de texte.

De plus, chaque carte, indépendamment de son type, possède un coût. Celui d'un terrain est 0.

Dans un programme Magic.java, proposez (et implémentez) une hiérarchie de classes permettant de représenter des cartes de différents types.

Chaque classe aura un constructeur permettant de spécifier la/les valeurs de ses attributs. De plus, chaque constructeur devra afficher le type de la carte.

Le programme doit utiliser la conception orientée objet et ne doit pas comporter de duplication de code.

Ajoutez ensuite aux cartes une méthode afficher() qui, pour toute carte, affiche son coût et la valeur de ses arguments spécifiques.

Créez de plus une classe Jeu pour représenter un jeu de cartes, c'est-à-dire une collection de telles cartes.
Cette classe devra avoir une méthode piocher permettant d'ajouter une carte au jeu. On supposera qu'un jeu comporte au plus 10 cartes. Le jeu comportera également une méthode joue permettant de jouer une carte. Pour simplifier, on jouera les cartes dans l'ordre où elles sont stockées dans le jeu, et on mettra la carte jouée à null dans le jeu de cartes.

Pour finir, dans la méthode main, constituez un jeu contenant divers types de cartes et faites afficher le jeu grâce à une méthode afficher propre à cette classe.

Par exemple la méthode main pourrait ressembler à quelque chose comme cela  :

On change de main
Un nouveau terrain.
Une nouvelle créature.
Un sortilège de plus.
Là, j'ai en stock :
Un terrain bleu
Une créature Golem 4/6
Un sortilège Croissance Gigantesque
Je joue une carte...
La carte jouée est :
Un terrain bleu