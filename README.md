
# créer le point jar et exécuter un service
se mettre à la racine du projet
* `mvn clean package`
* `mvn sprin-boot:run`  

le microservice "word" peut s'exécuter avec différents profiles. Pour utiliser un profile test il faut faire :  
`mvn sprin-boot:run -Drun.jvmArguments="-Dspring.profiles.active=test"`
les profiles valables sont:
* subject
* verb
* adjective
* article
* noun

Pour un bon fonctionnement, il faut exécuter les microservices dans l'ordre suivant :
1. config-server
2. Eureka-server
2. ensuite exécuter n'importe lequel des sevices
# virtualisation

# Configuration
Dans chaque projet se trouve un fichier `bootstrap.yml` sous le repertoire **src/main/resources/**. Dans ce fichier ce trouve les paramètres de configuration:
* le nom de l'application tel que Eureka-server le voit
* le port sur lequel le service tourne
* l'adresse à laquelle se trouve le config-server  

Pour le projet "Word" le port n'est pas spécifié car un port aléatoire parmi les ports disponibles est attribué au lancement du service. Deux autres fichiers de configuration (application.yml et challenge.yml), servis par le config-server, sont hébergés sur <https://www.hithub.com/nykykof/ConfigData>. Ces fichiers contiennent entre autres, les listes de mot utilisées par le microservice Word. 
