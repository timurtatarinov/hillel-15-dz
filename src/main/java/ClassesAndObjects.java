public class ClassesAndObjects {
    public static void main(String[] args) {
        /**
        __________Код Алишева c 15-ого урока по 17-ый.              __________
        __________Для удобства потом лучше будет свернуть этот код. __________
        **/

        /*
        Person person1 = new Person();
        person1.setNameAndAge("Роман", 20);

        String s1 = "Вова";
        Person person2 = new Person();
        person2.setNameAndAge(s1, 30);

        person1.speak();
        person2.speak();
    }
}

class Person {
    String name;
    int age;

    void setNameAndAge(String username, int userage) {
        name = username;
        age = userage;
    }
    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }
    void speak(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + "," + " мне " + age + " лет");
        }
    }
    void sayHello(){
        System.out.println("Привет!");
    }
}
____________________________________________________________________________________________________*/

        /**
        __________Код Алишева 18-ого урока.                         __________
        **/

        Person person1 = new Person();
        person1.setName("jklj");
        person1.setAge(-4);
        System.out.println("Выводим значение в main методе: " + person1.getName());
        System.out.println("Выводим значение в main методе: " + person1.getAge())  ;

    }
}

class Person {
    private String name;
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Ты ввёл пустое имя");
        } else {
            name = userName;
        }
    }
    public String getName() { return name; }
    public void setAge(int userage) {
        if (userage < 0) {
            System.out.println("Возраст должен быть положительным");
        } else {
            age = userage;
        }
    }
    public int getAge() { return age; }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + "," + " мне " + age + " лет");
        }
    }
}