public class Car {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public Car(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "My Car name is: " + name;
    }


    public static void main(String[] args){
        Car swift = new Car(4,4,120,"Swift","SW873", "Maruti");
        System.out.println(swift.toString());
    }


}

