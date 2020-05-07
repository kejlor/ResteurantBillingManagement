public class FirstTable {

    public static void main(String[] args) {

        Course brownie = new Course("Brownie", 5.99);
        Course steakAndMashedPotatoes = new Course("Steak and mashed potatoes", 12.99);
        Course fishAndChips = new Course("Fish and chips", 9.99);
        Restaurant resteurant = new Restaurant();
        resteurant.addCourseToBill(brownie, 2);
        resteurant.addCourseToBill(steakAndMashedPotatoes, 1);
        resteurant.addCourseToBill(fishAndChips, 1);
        System.out.println("You need to pay: " + resteurant.getBillValue() + " for our food");

    }

}
