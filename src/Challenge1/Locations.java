package Challenge1;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new HashMap<>();
    private static Map<String, Integer> tempExit = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {

//        ******** TRY WITH RESOURCES *******
//        try(FileWriter locFile = new FileWriter("locations.txt");
//            FileWriter dirFile = new FileWriter("directions.txt")) {
//            for(Location location : locations.values()) {
//                locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
//                for(String direction : location.getExits().keySet()) {
//                    dirFile.write(location.getLocationID() + "," + direction + "," + location.getExits().get(direction) + "\n");
//                }
//            }
//        }

//        try with resources ensures that the file writer stream automatically closes whether the code executes or throws an exception
//        this means you don't need a finally block
//        with try resources the error that is thrown back would be in the try block as opposed to the finally block which is more helpful

//        ********** REGULAR TRY *************
//        FileWriter locFile = null;
//        try {
//            locFile = new FileWriter("locations.txt");
//            for (Location location : locations.values()) {
//                locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
//            }
//        } finally {
//            System.out.println("in finally block");
//            if(locFile != null) {
//                System.out.println("attempting to close locFile");
//                locFile.close();
//            }
//        }
    }

    static {

//        **** READ IN LOCATIONS ****
//        try(Scanner s = new Scanner(new FileReader("locations_big.txt"))) {
//            s.useDelimiter(",");
//            while(s.hasNextLine()) {
//                int loc = s.nextInt();
//                s.skip(s.delimiter());
//                String description = s.nextLine();
//                System.out.println("Imported loc: " + loc + ": " + description);
//                Map<String, Integer> tempExit = new HashMap<>();
//                locations.put(loc, new Location(loc, description, tempExit));
//            }
//        } catch(IOException e) {
//            e.printStackTrace();
//        }
//
////        **** READ IN DIRECTIONS ****
//        try(BufferedReader dir = new BufferedReader(new FileReader("directions_big.txt"))) {
//            String input;
//            while((input = dir.readLine()) != null) {
////                ** READING BY CHARACTER **
////                int loc = s.nextInt();
////                String direction = s.next();
////                s.skip(s.delimiter());
////                String dest = s.nextLine();
////                int destination = Integer.parseInt(dest);
////                ** READING BY LINE **
////                String input = s.nextLine();
//                String[] data = input.split(",");
//                int loc = Integer.parseInt(data[0]);
//                String direction = data[1];
//                int destination = Integer.parseInt(data[2]);
//                System.out.println(loc + ": " + direction + ": " + destination);
//                Location location = locations.get(loc);
//                location.addExit(direction, destination);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        Map<String, Integer> tempExit = new HashMap<String, Integer>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "You are in the forest",tempExit));

        Map<String, String> vocabulary = new HashMap<String, String>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");
    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
