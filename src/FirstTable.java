public class FirstTable {

    public static void main(String[] args) {

        Course brownie = new Course("Brownie", 5.99);
        Course steakAndMashedPotatoes = new Course("Steak and mashed potatoes", 12.99);
        Course fishAndChips = new Course("Fish and chips", 9.99);
        Restaurant restaurant = new Restaurant();
        restaurant.addCourseToBill(brownie, 2);
        restaurant.addCourseToBill(steakAndMashedPotatoes, 1);
        restaurant.addCourseToBill(fishAndChips, 1);
        System.out.println("You need to pay " + restaurant.getBillValue() + " dollars for your food");

    }

}
