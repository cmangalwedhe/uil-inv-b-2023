import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Rishita {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("rishita.dat"));
        TreeMap<String, ArrayList<Course>> map = new TreeMap<>();

        while (file.hasNextLine()) {
            String[] split = file.nextLine().split(",");
            map.computeIfAbsent(split[2], a -> new ArrayList<>()).add(new Course(split[0], split[1]));
        }

        for (String a: map.keySet()) {
            Collections.sort(map.get(a));
        }

        for (String a: map.keySet()) {
            System.out.println(a);
            List<Course> courses = map.get(a);

            for (Course o: courses) {
                System.out.println("   " + o.courseNumber + "   " + o.major);
            }
        }
    }
}

class Course implements Comparable<Course> {
    String major, courseNumber;

    public Course(String major, String courseNumber) {
        this.major = major;
        this.courseNumber = courseNumber;
    }

    @Override
    public int compareTo(Course o) {
        return courseNumber.compareTo(o.courseNumber);
    }
}