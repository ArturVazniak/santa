import java.util.HashMap;
import java.util.Map;

public class Santa {

    private Map<Location, Integer> locationCount;
    public Santa(String directions) {

        locationCount = new HashMap<Location, Integer>();
        locationCount.put(new Location(0, 0), 1);

        int x = 0;
        int y = 0;
        for (int i = 0; i < directions.length(); i++) {
            switch (directions.charAt(i)) {
                case '>':
                    x += 1;
                    break;
                case '<':
                    x -= 1;
                    break;
                case '^':
                    y += 1;
                    break;
                case 'v':
                    y -= 1;
                    break;
                default:
                    throw new IllegalArgumentException();
            }
            Location loc = new Location(x, y);
            int t = locationCount.getOrDefault(loc, 0);
            locationCount.put(loc, t+1);
        }
    }

    public String toString() {
        return locationCount.toString();
    }

}
