public class Course implements Comparable<Course> {

    String name;
    double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Course o) {
        if(o == null){
            return 1;
        }
        int comparision = this.getName().compareTo(o.getName());
        if (comparision != 0){
            return comparision;
        }
        return Double.compare(this.getPrice(), o.getPrice());
    }
}
