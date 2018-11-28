public enum Colour {
    BLACK("black"),
    WHITE("white"),
    YELLOW("yellow"),;

    private String colourName;
    private Colour(String colourName){
        this.colourName=colourName;
    }

    public String getColourName() {
        return colourName;
    }

    @Override
    public String toString() {
        return "Colour{" +
                "colourName='" + colourName + '\'' +
                '}';
    }
}
