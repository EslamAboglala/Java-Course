package chapter11.exercise;

public  abstract class Animal {
    public abstract void makeSound();

    public void eat(Animal animal){
        System.out.println(animal+"is eating right now!");
    }
}
