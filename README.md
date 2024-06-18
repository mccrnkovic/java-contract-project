# Upute za pokretanje u Dockeru:

1. Preuzeti image sa DockerHuba:  
   a. [postgres](https://hub.docker.com/_/postgres)  
   b. [openjdk](https://hub.docker.com/_/openjdk)

2. Otvoriti novi terminal i ući u direktorij _crnkovic_
3. Izvršiti sljedeće naredbe:  
   a. ```mvn clean install -DskipTests```  
   b. ```docker compose up -d```
4. Za testiranje aplikacije pristupiti endpointovima na _http://localhost:2222_
