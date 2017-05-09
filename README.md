# microservices
microservices application written in spring-boot

# exécuter un service
se mettre à la racine du projet
* mvn clean package
* mvn sprin-boot:run
le microservice "word" peut s'exécuter avec différents profiles. Pour utiliser un profile test il faut faire :
`mvn sprin-boot:run -Drun.jvmArguments="-Dspring.profiles.active=test"`
les profiles valables sont:
* subject
* verb
* adjective
* article
* noun

# virtualisation

# Configuration
