public class landVehicle extends Vehicle {

    //atributos
    private short type;
    private City city;
    

    //constructor
    public landVehicle(int power, int year, String brand, short type, City city) {
        super(power, year, brand);
        this.type = type;
        this.city = city;
    }

    //getters...
    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }


    //descripcion..
    @Override
    public String toString() {
        return "poder: " + getPower() + ", ano: " + getYear() + ", Marca: " + getBrand()
        + ", tipo: " + type + ", ciudad: " + city;
    }
    
}
