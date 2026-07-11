public class Main {
    public static void main(String[] args) {
        Lion simba = new Lion("Simba", 5);
        Eagle aquila = new Eagle("Aquila", 3);

        Enclosure safariZone = new Enclosure("Savannah & Sky Exhibit");
        safariZone.addAnimal(simba);
        safariZone.addAnimal(aquila);

        ZooKeeper john = new ZooKeeper("John Doe");
        john.assignSchedule(simba, "08:00 AM", "Beef Steaks");
        john.assignSchedule(aquila, "09:30 AM", "Fresh Salmon");

        safariZone.simulateBehaviors();
        System.out.println();
        john.performFeedingDuty();
    }
}