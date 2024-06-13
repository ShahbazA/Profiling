# POC for MVN profiling and spring boot profiling.

mvn spring-boot:run -Dspring.profiles.active=local -P local
mvn spring-boot:run -Dspring.profiles.active=dev -P dev

When 'dev' profile is active
http://localhost:8002/v1/api/home/dev - is secured
http://localhost:8002/v1/api/home/local - is NOT secured


When 'local' profile is active
http://localhost:8001/v1/api/home/local - is secured
http://localhost:8001/v1/api/home/dev - is NOT secured