package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");

        // Создание и запуск потока
        MyThread mt1 = MyThread.createAndStart("Порожденный поток №1"); // Создание и запуск выполняемого объекта
        MyThread mt2 = MyThread.createAndStart("Порожденный поток №2");
        MyThread mt3 = MyThread.createAndStart("Порожденный поток №3");

        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException exc) {
                System.out.println("Прерывание основного потока");
            }
        } while (mt1.isAlive() ||
                 mt2.isAlive() ||
                 mt3.isAlive());
        System.out.println("Завершение основного потока");
    }
}