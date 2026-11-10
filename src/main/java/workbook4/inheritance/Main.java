package workbook4.inheritance;

public class Main {

    public static void main(String[] args) {

        // Create Dog object
        Dog dogOne = new Dog("Robert", 5);

        dogOne.introduce();
        dogOne.eat();
        dogOne.makeSound();
        dogOne.sleep();

        System.out.println();

        // Create Cat object
        Cat catOne = new Cat("Marl", 4);

        catOne.introduce();
        catOne.eat();
        catOne.makeSound();
        catOne.sleep();

        System.out.println();

        // Create Bird object
        Bird birdOne = new Bird("Sam", 3);

        birdOne.introduce();
        birdOne.eat();
        birdOne.makeSound();
        birdOne.sleep();
    }

    static class Animal {
        private String name;
        private int age;

        // Update constructor to include age
        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }


        // Getter
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        // Animal methods
        public void eat() {
            System.out.print(name + " is eating...\n");
        }

        // Add a method sleep() to Animal and have Dog, Cat, and Bird extend form it

        public void sleep() {
            System.out.print(name + " is sleeping...\n");
        }

        public void introduce() {
            System.out.print(name + " is " + age + " years old.\n");
        }

    }

    static class Dog extends Animal {

        public Dog(String name, int age) {
            super(name, age);
        }

        public void makeSound() {
            System.out.print(getName() + " says: Bark!\n");
        }
    }

    static class Cat extends Animal {

        public Cat(String name, int age) {
            super(name, age);
        }

        public void makeSound() {
            System.out.print(getName() + " says: Meow!\n");
        }
    }

    static class Bird extends Animal {

        public Bird(String name, int age) {
            super(name, age); // Calls the parent's constructor
        }


        public void makeSound() {
            System.out.print(getName() + " says: Chirp chirp!\n");
        }
    }

}