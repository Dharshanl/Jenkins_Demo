class Example extends TestExmple {
    
    public static void main(String[] args){
        animal();
        animal2();
        TestExmple.a = 5;
        System.out.println(a);
        System.out.println("The dog goes bow");
        TestExmple test = new Example();
        test.makeSound();
    }

    @Override
    public void makeSound() {
        System.out.println("Animal sound like dog");
    }

}


