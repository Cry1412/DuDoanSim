public class SimAndPrice {
    private int Sim;
    private long Price;
    private String Type;

    /**
     * Constructor.
     */
    public SimAndPrice(){}

    public SimAndPrice(int Sim, long Price, String Type) {
        this.Sim = Sim;
        this.Price = Price;
        this.Type = Type;
    }

    // Getter and Setter
    public void setSim(int Sim) {
        this.Sim = Sim;
    }

    public int getSim() {
        return Sim;
    }

    public void setPrice(long Price) {
        this.Price = Price;
    }

    public long getPrice() {
        return Price;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getType() {
        return Type;
    }
}