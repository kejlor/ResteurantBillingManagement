import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {

    @Test
    public void shouldThrowIllegalArgumentException(){
        Course course = new Course("Brownie", 12);
        Restaurant restaurant = new Restaurant();
        Assertions.assertThrows(IllegalArgumentException.class, ()-> restaurant.addCourseToBill(course, -1));
    }
    @Test
    public void shouldAddOneCourseToRestaurant(){
        Course course = new Course("Steak", 20.99);
        Restaurant restaurant = new Restaurant();
        restaurant.addCourseToBill(course, 1);
        Assertions.assertEquals(20.99, restaurant.getBillValue());
    }

}