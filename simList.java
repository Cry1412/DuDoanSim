import java.util.ArrayList;

public class simList {
    public ArrayList<SimAndPrice> SimList;

    public simList() {
        SimList = new ArrayList<SimAndPrice>();
    }

    public void addSim(SimAndPrice w) {
        SimList.add(w);
    }
}
