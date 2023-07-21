public class Lesson20 {
    public static void main(String[] args) {
        Human1 human1 = new Human1();
    }
}

//__________Пришлось назвать клас "Human" -- "Human1", потому что в "Lesson19" он уже присутствует.__________

class Human1 {

    private String name;
    private int age;

    public Human1() {
        System.out.println("Привет из первого конструктора!");
        this.name = "Имя по умочанию";
        this.age = 0;
    }
    public Human1(String name) {
        System.out.println("Привет из второго конструктора!");
        this.name = name;
    }
    public Human1(String name, int age) {
        System.out.println("Привет из третего конструктора!");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

}