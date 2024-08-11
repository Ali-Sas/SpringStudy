package org.example.springcoure;

public class ClassicalMusic implements Music{

    private ClassicalMusic(){} // сделали так, чтоб объект нельзя создать с помощью оператора new. Просто дали самый строгий модификатор доступа для конструктора

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    public void doMyInit(){ // метод вызывается при создании бина
        System.out.println("ClassicalMusic doMyInit");
    }

    public void doMyDestroy(){ // метод вызывается при уничтожении бина
        System.out.println("ClassicalMusic doMyDestroy");
    }

    @Override
    public String getSong() {
        return "Классическая музыка";
    }
}
