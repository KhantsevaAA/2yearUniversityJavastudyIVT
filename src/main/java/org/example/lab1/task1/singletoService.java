package org.example.lab1.task1;


class SingletonService {
    public void exec() {
        Connection connection1 = Connection.getInstance();
        Connection connection2 = Connection.getInstance();
        System.out.println(connection1.toString());
        System.out.println(connection2.toString());
    }
}