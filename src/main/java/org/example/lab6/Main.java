package org.example.lab6;

public class Main {

    public static void main(String[] args) {
//        // Получаем экземпляр ApplicationProperties, чтобы инициализировать свойства базы данных
//        ApplicationProperties applicationProperties = ApplicationProperties.getInstance();
//
//        // Запускаем сервис базы данных
//        DatabaseService databaseService = new DatabaseService();
//        databaseService.exec();
        DatabaseService service = new DatabaseService();
        service.exec();
    }
}