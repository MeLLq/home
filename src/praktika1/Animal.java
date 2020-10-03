public class Animal
    {
    String name;
    int age;
    Animal(String name, int age){ //конструктор
        this.name=name;
        this.age=age;
    }
    void Message(){
        System.out.println("This animal");
    }
}
class Mammal
{
    void Message2(){
        System.out.println("This Mammals");
    }
}
class app
{
    public static void main(String[] args) {
    Animal cat=new Animal("Jack",5);
    Animal dog=new Animal( "Barsik",4);
        System.out.println(dog.name);
        System.out.println(dog.age);
    }
}