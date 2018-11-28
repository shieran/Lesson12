public abstract class Animal {
    private String name;
    private Colour color;

    public Animal(String name, Colour color) {
        this.name = name;
        this.color = color;
    }

    public Animal(){}

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


