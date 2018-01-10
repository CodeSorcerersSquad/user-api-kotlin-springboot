## User API - Kotlin Spring Boot

This is a basic example of how to use Kotlin in a Spring Boot application. See the [accompanying tutorial](http://kotlinlang.org/docs/tutorials/spring-boot-restful.html)
for more information.


To build:

```
$ ./gradlew build
```

To run:

```
$ ./gradlew bootRun
```

Test:
```sh
curl -X GET \
  http://localhost:8080/users
```