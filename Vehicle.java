public abstract class Vehicle {
    
    //Atributos
    private int power;
    private int year;
    private String brand;
    

    //Construcor
    public Vehicle(int power, int year, String brand) {
        this.power = power;
        this.year = year;
        this.brand = brand;
    }

    //Getter and Setters
    public int getPower() {
        return power;
    }


    public void setPower(int power) {
        this.power = power;
    }


    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }


    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    //descripcion 
    @Override
    public String toString() {
        return "Fuerza: " + power +", año: " + year + ", marca: " + brand ;
    }
    
    

}
