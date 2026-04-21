import java.util.ArrayList;
import java.util.List;
class Park {
    private String name;
    private List<Attraction> attractions = new ArrayList<>();

    public Park(String name) {
        this.name = name;
    }
    public class Attraction {
        public String name;
        public String workingHours;
        double cost;

        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }
    }

}
