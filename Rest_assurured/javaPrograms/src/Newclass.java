class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();  // What will this print?
    }
}