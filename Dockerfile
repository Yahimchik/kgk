# Используем официальный образ JDK 17
FROM eclipse-temurin:17-jdk

# Устанавливаем рабочую директорию в контейнере
WORKDIR /app

# Копируем jar-файл в контейнер
COPY ./target/*.jar app.jar

# Открываем порт 8080
EXPOSE 8080

# Запускаем приложение
ENTRYPOINT ["java", "-jar", "app.jar"]
