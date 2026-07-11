import java.util.ArrayList;
import java.util.List;

class ZooKeeper {
    private String name;
    private List<FeedingSchedule> schedules;

    public ZooKeeper(String name) {
        this.name = name;
        this.schedules = new ArrayList<>();
    }

    public String getName() { return name; }

    public void assignSchedule(Animal animal, String time, String foodType) {
        FeedingSchedule schedule = new FeedingSchedule(this, animal, time, foodType);
        schedules.add(schedule);
    }

    public void performFeedingDuty() {
        System.out.println("--- " + name + " starts feeding shift ---");
        for (FeedingSchedule schedule : schedules) {
            schedule.executeSchedule();
        }
    }
}