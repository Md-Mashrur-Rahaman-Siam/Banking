public class Banking {

    private String name;
    private String ID;
    private Double amountStored;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Double getAmountStored() {
        return amountStored;
    }

    public void setAmountStored(Double amountStored) {
        this.amountStored = amountStored;
    }

    public Banking(String name, String ID, Double amountStored) {
        this.name = name;
        this.ID = ID;
        this.amountStored = amountStored;
    }

    @Override
    public String toString() {
        return "Banking{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", amountStored=" + amountStored +
                '}';
    }

}
