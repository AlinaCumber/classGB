public class Employers {
    String name;
    String position;
    String email;
    String number;
    int salary;
    int age;

    public Employers (String name, String position, String email, String number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public String toString () {
        return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                name, position, email, number, salary, age);
    }


    public void print () {
        System.out.println(this);
    }







}
