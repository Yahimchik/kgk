# Используем официальный образ для Java (например, OpenJDK)
FROM openjdk:17-jdk-slim

# Обновляем пакеты и устанавливаем необходимые зависимости
RUN apt-get update && apt-get install -y apt-transport-https ca-certificates curl gnupg2

# Устанавливаем git
RUN apt-get install -y git

# Устанавливаем maven для сборки проекта
RUN apt-get install -y maven

# Клонируем репозиторий
RUN git clone https://github.com/Yahimchik/kgk.git /app

# Переходим в директорию проекта
WORKDIR /app

# Собираем проект с помощью Maven
RUN mvn clean install

# Открываем порт для приложения
EXPOSE 9090

# Запускаем приложение
CMD ["mvn", "spring-boot:run"]
