import java.util.Map;
import java.util.TreeMap;

public class Restaurant {

    Map<Course, Integer> orderedFood = new TreeMap<>();

    public void addCourseToBill(Course course){
        addCourseToBill(course, 1);
    }

    public void addCourseToBill(Course course, int ammount) {
        if (orderedFood.containsKey(course)) {
            ammount = orderedFood.get(course) + ammount;
        }
        orderedFood.put(course, ammount);
    }

    public double getBillValue(){
        double billValue = 0;

        for (Map.Entry<Course, Integer> tableOrder : orderedFood.entrySet()){
            billValue += tableOrder.getKey().getPrice() * tableOrder.getValue();
        }

        return  billValue;
    }
}
