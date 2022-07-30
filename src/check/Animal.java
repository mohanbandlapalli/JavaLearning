package check;

abstract class Animal {

    public abstract void makeSound();

    public void move(){
        System.out.println(getClass().getSimpleName()+" is moving");
    }


}
