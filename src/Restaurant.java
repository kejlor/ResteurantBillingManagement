import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Restaurant {

    Map<Course, Integer> orderedFood = new TreeMap<>();

    public void addCourseToBill(Course course){
        addCourseToBill(course, 1);
    }

    public void addCourseToBill(Course course, int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Illegal amount!");
        }
        if (orderedFood.containsKey(course)) {
            amount = orderedFood.get(course) + amount;
        }
        orderedFood.put(course, amount);
    }


    public double getBillValue(){
        double billValue = 0;

        for (Map.Entry<Course, Integer> tableOrder : orderedFood.entrySet()){
            billValue += tableOrder.getKey().getPrice() * tableOrder.getValue();
        }

        return  billValue;
    }
}
