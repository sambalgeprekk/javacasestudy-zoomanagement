class FeedingSchedule {
    private ZooKeeper keeper;
    private Animal animal;
    private String time;
    private String foodType;

    public FeedingSchedule(ZooKeeper keeper, Animal animal, String time, String foodType) {
        this.keeper = keeper;
        this.animal = animal;
        this.time = time;
        this.foodType = foodType;
    }

    public void executeSchedule() {
        System.out.print("[" + time + "] Keeper " + keeper.getName());
        System.out.println(" feeds " + foodType + " to " + animal.getName() + ".");
        animal.eat();
    }
}