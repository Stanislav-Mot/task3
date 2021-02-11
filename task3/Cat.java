package task3;
/*Создаем два класса. Класс Cat и класс для запуска приложения. У кота есть имя и
  возраст. Есть дефолтное значение имени и возраста.
  При запуске приложения используем три цикла. Первый while создает 10 котиков и
  выводит дефолтное имя и возраст.
  Во втором цикле for создаем 10 котиков, вводим им возраст и имя через геттер, сеттер, и
  выводим в консоль.
  Третий цикл do while создает 10 котиков вводит имя и возраст через конструктор.
  Выводим в консоль.
  Четвертый цикл foreach. Массив из пяти котиков, у них выводим имя и возраст. Способ
  инициализации возраста и имени - на ваше усмотрение*/
public class Cat{
    private String name = "Barsik";
    private int age = 12;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name cat: " + name + " and him age: " + age;
    }
}








