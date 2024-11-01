public class City {
    
    //atributos
    private String name;
    private String country;
    
    
    //constructor
    public City(String name, String country) {
        this.name = name;
        this.country = country;
    }


    //getters setters
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getCountry() {
        return country;
    }


    public void setCountry(String country) {
        this.country = country;
    }
    
    //detalles
    @Override
    public String toString() {
        return "Ciudad: " + name + ", Pais: " + country;
    }
}
