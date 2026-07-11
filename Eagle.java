class Eagle extends Animal implements Bird {
    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " screeches in the sky!");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats fish and small rodents.");
    }

    @Override
    public void layEggs() {
        System.out.println(getName() + " laid an egg in the nest.");
    }
}