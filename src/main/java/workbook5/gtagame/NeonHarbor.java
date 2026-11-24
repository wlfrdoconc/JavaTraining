package workbook5.gtagame;

public class NeonHarbor {
    public static void main(String[] args) {
        System.out.println("=== NEON HARBOR ===");

        // OBJECTS: Create game characters and vehicles
        Player jax = new Player("Jax");
        Police officer = new Police("Officer Vega");
        Vehicle mustang = new Mustang("Shadow GT");
        Vehicle bike = new Motorcycle("Night Rider");

        // INTERFACE: Different objects can be stolen
        Stealable[] targets = {mustang, new SupplyCrate()};
        for (Stealable target : targets) {
            target.steal();
        }

        // COMPOSITION: Player has a vehicle
        jax.enterVehicle(mustang);
        jax.increaseWantedLevel();

        System.out.println("\n--- THE ESCAPE ---");

        // POLYMORPHISM: Same method, different behavior
        Vehicle[] vehicles = {mustang, bike};
        for (Vehicle vehicle : vehicles) {
            vehicle.drive();
        }

        // POLYMORPHISM: Characters act differently
        Character[] characters = {jax, officer};
        for (Character character : characters) {
            character.act();
        }

        officer.chase(jax);
        jax.takeDamage(120);

        System.out.println("Jax health: " + jax.getHealth());
        System.out.println("Wanted level: " + jax.getWantedLevel());
        System.out.println("=== GAME OVER ===");
    }
}

// INTERFACE: A contract for anything stealable
interface Stealable {
    void steal();
}

// ENCAPSULATION: Protect health from invalid values
class Character {
    private String name;
    private int health = 100;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        if (damage > 0) {
            health = Math.max(0, health - damage);
        }
    }

    public void act() {
        System.out.println(name + " looks around.");
    }
}

// INHERITANCE: Player is a Character
class Player extends Character {
    private int wantedLevel = 0;
    private Vehicle vehicle; // COMPOSITION: has-a Vehicle

    public Player(String name) {
        super(name); // Call parent constructor
    }

    public void enterVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        System.out.println(getName() + " enters " + vehicle.getName());
    }

    public void increaseWantedLevel() {
        wantedLevel = Math.min(5, wantedLevel + 1);
    }

    public int getWantedLevel() {
        return wantedLevel;
    }

    @Override // OVERRIDING: Player-specific behavior
    public void act() {
        System.out.println(getName() + " attempts to escape!");
    }
}

// INHERITANCE: Police is a Character
class Police extends Character {
    public Police(String name) {
        super(name);
    }

    @Override
    public void act() {
        System.out.println(getName() + " calls for backup!");
    }

    public void chase(Player player) {
        System.out.println(getName() + " chases " + player.getName());
    }
}

// ABSTRACTION: Vehicle defines a common blueprint
abstract class Vehicle implements Stealable {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void drive();
}


// ABSTRACTION: Weapon defines a common blueprint
abstract class Weapon implements Stealable {

    private String name;
    private double damage;
    private double cost;

    public void equipWeapon() {

    }

    public void unequipWeapon() {

    }

    public void weaponAction() {

    }

    @Override
    public void steal() {
        System.out.println("You stole the " + name + "!");
    }

}

// INHERITANCE: Mustang is a Vehicle
class Mustang extends Vehicle {
    public Mustang(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println(getName() + " roars down the street!");
    }

    @Override
    public void steal() {
        System.out.println("Jax steals the Mustang!");
    }
}

// INHERITANCE: Motorcycle is a Vehicle
class Motorcycle extends Vehicle {
    public Motorcycle(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println(getName() + " speeds through traffic!");
    }

    @Override
    public void steal() {
        System.out.println("A motorcycle is stolen!");
    }
}

// INTERFACE: Unrelated class, same stealable ability
class SupplyCrate implements Stealable {
    @Override
    public void steal() {
        System.out.println("Jax steals a supply crate!");
    }
}
