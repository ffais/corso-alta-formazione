FROM java:8

WORKDIR /app
ADD . /app

RUN ./mvnw package -Dmaven.test.skip=true

CMD ./mvnw spring-boot:run
