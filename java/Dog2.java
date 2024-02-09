class Dog2{
    void bark(){
        System.out.println("parent dog is barking");
    }
}
class ChildDog2 extends Dog2{
    void bark(){
        System.out.println("child dog is barking");
    }
}

public class DogOverridingB2 {
    public static void main(String[] args){
        ChildDog2 childDog2 = new ChildDog2;

        Dog2 dog2 = new Dog2;

        Dog2 dogb3 = new ChildDog2;

        dogb3.bark();
    }
}