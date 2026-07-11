class Lion extends Animal implements Mammal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " roars loudly!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats raw meat.");
    }

    @Override
    public void nurse() {
        System.out.println(getName() + " is nursing its cubs.");
    }
}