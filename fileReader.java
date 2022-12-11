import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class fileReader {
    public simList Sample = new simList();
    public simList Test = new simList();
    public void insertFromFileFull() {
        File a = new File("C://Users//Asus//Desktop//train_dataset.csv");
        try {
            Scanner sc = new Scanner(a);
            String Sim = null;
            String Price = null;
            while (sc.hasNextLine()) {
                String firstline = sc.nextLine();
                int pos = firstline.indexOf(',');
                if (pos > 0) {
                    Price = firstline.substring(0, pos); // lay gia
                    Sim = firstline.substring(pos + 1); // lay sim
                }
                SimAndPrice newone = new SimAndPrice(Integer.parseInt(Sim), Long.parseLong(Price), "");
                Sample.addSim(newone);
            }
        } catch (IOException ex) {
            System.out.println("Loi doc file: " + ex);
        }
    }

    public void insertFromFile() {
        File a = new File("C://Users//Asus//Desktop//test.csv");
        try {
            Scanner sc = new Scanner(a);
            String Sim = null;
            while (sc.hasNextLine()) {
                String firstline = sc.nextLine();
                Sim = firstline;
                SimAndPrice newone = new SimAndPrice(Integer.parseInt(Sim), 0, "");
                Test.addSim(newone);
            }
        } catch (IOException ex) {
            System.out.println("Loi doc file: " + ex);
        }
    }

    public void exportToFile(ArrayList<SimAndPrice> a) {
        try {
            FileWriter file = new FileWriter("C://Users//Asus//Desktop//KPDL22-SIMPred-Nhom13.sol1.txt", true);
            file.flush();
            file.write("price_vnd,sim_number" + "\n");
            for (int i = 0; i < a.size(); i++) {
                file.write(a.get(i).getSim() + "," + a.get(i).getPrice() + "\n");
            }
            file.close();
        } catch (IOException e) {
            System.out.println("Khong tim thay file");
        }
    }
}
