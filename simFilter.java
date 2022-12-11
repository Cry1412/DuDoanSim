import java.util.ArrayList;

public class simFilter {
    public int pow (int a, int b) {
        int pow = 1;
        for (int i = 0; i < b; i++) {
            pow *= a;
        }
        return pow;
    }

    public int[] tachSo (int a) {
        int [] so = new int[9];
        for (int i = 0; i < 9; i++) {
            so[i] = (a / pow(10, 8 - i)) % 10;
        }
        return so;
    }

    public boolean checkCuuQuy (int [] a){
        for (int i = 0; i < 1; i++) {
            if (a[i] == a[i + 1] & a[i + 1] == a[i + 2] & a[i + 2] == a[i + 3]
                    & a[i + 3] == a[i + 4] & a[i + 4] == a[i + 5] & a[i + 5] == a[i + 6]
                    & a[i + 6] == a[i + 7] & a[i + 7] == a[i + 8]) return true;
        }
        return false;
    }

    public boolean checkBatQuy (int [] a){
        for (int i = 0; i < 2; i++) {
            if (a[i] == a[i + 1] & a[i + 1] == a[i + 2] & a[i + 2] == a[i + 3]
                    & a[i + 3] == a[i + 4] & a[i + 4] == a[i + 5] & a[i + 5] == a[i + 6]
                    & a[i + 6] == a[i + 7]) return true;
        }
        return false;
    }

    public boolean checkThatQuy (int [] a){
        for (int i = 0; i < 3; i++) {
            if (a[i] == a[i + 1] & a[i + 1] == a[i + 2] & a[i + 2] == a[i + 3]
                    & a[i + 3] == a[i + 4] & a[i + 4] == a[i + 5] & a[i + 5] == a[i + 6]) return true;
        }
        return false;
    }

    public boolean checkLucQuy (int [] a){
        for (int i = 0; i < 4; i++) {
            if (a[i] == a[i + 1] & a[i + 1] == a[i + 2] & a[i + 2] == a[i + 3]
                    & a[i + 3] == a[i + 4] & a[i + 4] == a[i + 5]) return true;
        }
        return false;
    }
    public boolean checkNguQuy (int [] a){
        for (int i = 0; i < 5; i++) {
            if (a[i] == a[i + 1] & a[i + 1] == a[i + 2] & a[i + 2] == a[i + 3]
                & a[i + 3] == a[i + 4]) return true;
        }
        return false;
    }

    public boolean checkTuQuy (int [] a){
        for (int i = 0; i < 6; i++) {
            if (a[i] == a[i + 1] & a[i + 1] == a[i + 2] & a[i + 2] == a[i + 3]) return true;
        }
        return false;
    }

    public boolean checkTamQuy (int [] a){
        for (int i = 0; i < 7; i++) {
            if (a[i] == a[i + 1] & a[i + 1] == a[i + 2]) return true;
        }
        return false;
    }

    public boolean checkNhiQuy (int [] a){
        for (int i = 0; i < 8; i++) {
            if (a[i] == a[i + 1]) return true;
        }
        return false;
    }

    public boolean sort9 (int [] a){
        for (int i = 0; i < 1; i++) {
            int tang = 0;
            int giam = 0;
            for (int j = i; j < i + 8; j++) {
                if (a[j] == a[j + 1] + 1) giam++;
                if (a[j] == a[j + 1] - 1) tang++;
            }
            if (tang == 8 || giam == 8) return true;
        }
        return false;
    }

    public boolean sort8 (int [] a){
        for (int i = 0; i < 2; i++) {
            int tang = 0;
            int giam = 0;
            for (int j = i; j < i + 7; j++) {
                if (a[j] == a[j + 1] + 1) giam++;
                if (a[j] == a[j + 1] - 1) tang++;
            }
            if (tang == 7 || giam == 7) return true;
        }
        return false;
    }

    public boolean sort7 (int [] a){
        for (int i = 0; i < 3; i++) {
            int tang = 0;
            int giam = 0;
            for (int j = i; j < i + 6; j++) {
                if (a[j] == a[j + 1] + 1) giam++;
                if (a[j] == a[j + 1] - 1) tang++;
            }
            if (tang == 6 || giam == 6) return true;
        }
        return false;
    }

    public boolean sort6 (int [] a){
        for (int i = 0; i < 4; i++) {
            int tang = 0;
            int giam = 0;
            for (int j = i; j < i + 5; j++) {
                if (a[j] == a[j + 1] + 1) giam++;
                if (a[j] == a[j + 1] - 1) tang++;
            }
            if (tang == 5 || giam == 5) return true;
        }
        return false;
    }

    public boolean sort5 (int [] a){
        for (int i = 0; i < 5; i++) {
            int tang = 0;
            int giam = 0;
            for (int j = i; j < i + 4; j++) {
                if (a[j] == a[j + 1] + 1) giam++;
                if (a[j] == a[j + 1] - 1) tang++;
            }
            if (tang == 4 || giam == 4) return true;
        }
        return false;
    }

    public boolean sort4 (int [] a){
        for (int i = 0; i < 6; i++) {
            int tang = 0;
            int giam = 0;
            for (int j = i; j < i + 3; j++) {
                if (a[j] == a[j + 1] + 1) giam++;
                if (a[j] == a[j + 1] - 1) tang++;
            }
            if (tang == 3 || giam == 3) return true;
        }
        return false;
    }

    public boolean sort3 (int [] a){
        for (int i = 0; i < 7; i++) {
            int tang = 0;
            int giam = 0;
            for (int j = i; j < i + 2; j++) {
                if (a[j] == a[j + 1] + 1) giam++;
                if (a[j] == a[j + 1] - 1) tang++;
            }
            if (tang == 2 || giam == 2) return true;
        }
        return false;
    }

    public boolean cach6 (int [] a){
        for(int i= 0;i<4;i++){
            if(a[i]==a[i+2]&&a[i+2]==a[i+4]){
                if( ((a[i+1]==a[i+3]+1)&&(a[i+3]==a[i+5]+1)) || ((a[i+1]==a[i+3]-1)&&(a[i+3]==a[i+5]-1))  ){
                    return true;
                }
            }
            if(a[i+1]==a[i+3]&&a[i+3]==a[i+5]){
                if( ((a[i]==a[i+2]+1)&&(a[i+2]==a[i+4]+1)) || ((a[i]==a[i+2]-1)&&(a[i+2]==a[i+4]-1))  ){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean g7SPECIAL (int[] a) {
        for (int i = 0; i < 3; i++) {
            if (a[i] != a[i+1] & a[i+1] == a[i+2] & a[i+2] == a[i+3] & a[i+3] == a[i+4] & a[i+4] == a[i+5] && a[i] == a[i+6]
            ) return true;
            else if(a[i] != a[i+1] & a[i] == a[i+2] & a[i+2] == a[i+3] & a[i+3] == a[i+4] & a[i+4] == a[i+6] && a[i+1] == a[i+5]
            ) return true;
            else if(a[i] != a[i+3] & a[i] == a[i+1] & a[i+1] == a[i+2] & a[i+2] == a[i+4] & a[i+4] == a[i+5] && a[i+5] == a[i+6]
            ) return true;
            else if(a[i] != a[i+1] & a[i+1] == a[i+3] & a[i+3] == a[i+5] & a[i] == a[i+2] & a[i+2] == a[i+4] && a[i+4] == a[i+6]
            ) return true;
            else if(a[i] != a[i+2] & a[i] == a[i+1] & a[i+1] == a[i+3] & a[i+2] == a[i+4] & a[i+3] == a[i+5] && a[i+5] == a[i+6]
            ) return true;
            else if(a[i] != a[i+1] & a[i+1] == a[i+2] & a[i] == a[i+3] & a[i+2] == a[i+4] & a[i+4] == a[i+5] && a[i+3] == a[i+6]
            ) return true;
            else if(a[i] != a[i+2] & a[i] == a[i+1] & a[i+1] == a[i+5] & a[i+2] == a[i+3] & a[i+3] == a[i+4] && a[i+5] == a[i+6]
            ) return true;
        }
        return false;
    }

    public boolean g6XXYYXX (int[] a) {
        for (int i = 0; i < 4; i++) {
            if (a[i+1] != a[i+2] & a[i] == a[i+1] & a[i+2] == a[i+3] & a[i] == a[i+4] & a[i] == a[i+5]
            ) return true;
        }
        return false;
    }

    public boolean g6XYYYYX (int[] a) {
        for (int i = 0; i < 4; i++) {
            if (a[i] != a[i+1] & a[i+1] == a[i+2] & a[i+2] == a[i+3] & a[i+3] == a[i+4] & a[i] == a[i+5]
            ) return true;
        }
        return false;
    }

    public boolean g6XYXXYX (int[] a) {
        for(int i = 0; i < 4; i++) {
            int k = 0;
            int[] b = new int[6];
            for (int j = i; j < i + 6; j++) {
                b[k] = a[j];
                k++;
            }
            if (b[2] == b[3] && b[0] == b[5] && b[0] == b[2] && b[1] == b[4] && b[0] != b[1]) {
                return true;
            }
        }
        return false;
    }

    public boolean g6XYZZYX (int [] a){
        for (int i = 0; i < 4; i++) {
            if (a[i] == a[i + 5] & a[i + 1] == a[i + 4] & a[i + 2] == a[i + 3] & a[i] != a[i + 1] & a[i + 1] != a[i + 2] & a[i + 2] != a[i]){ return true;}
        }
        return false;
    }

    public boolean g6XYZXYZ (int[] a) {
        for(int i = 0; i < 4; i++) {
            int k = 0;
            int[] b = new int[6];
            for (int j = i; j < i + 6; j++) {
                b[k] = a[j];
                k++;
            }
            if (b[0] != b[1] && b[1] != b[2] && b[2] != b[0] && b[0] == b[3] && b[1] == b[4] && b[2]==b[5]) {
                return true;
            }
        }
        return false;
    }

    public boolean g6XYXYXY (int[] a) {
        for(int i = 0; i < 4; i++) {
            int k = 0;
            int[] b = new int[6];
            for (int j = i; j < i + 6; j++) {
                b[k] = a[j];
                k++;
            }
            if (b[0] != b[1] && b[0] == b[2] && b[2] == b[4] && b[1] == b[3] && b[3] == b[5] ) {
                return true;
            }
        }
        return false;
    }

    public boolean g5XYYYX (int[] a) {
        for(int i = 0; i < 5; i++) {
            int k = 0;
            int[] b = new int[5];
            for (int j = i; j < i + 5; j++) {
                b[k] = a[j];
                k++;
            }
            if (b[0]!=b[1] && b[1]==b[2] && b[2]==b[3] && b[0]==b[4] ) {
                return true;
            }
        }
        return false;
    }

    public boolean g5XYXYX (int[] a) {
        for(int i = 0; i < 5; i++) {
            int k = 0;
            int[] b = new int[5];
            for (int j = i; j < i + 5; j++) {
                b[k] = a[j];
                k++;
            }
            if (b[0]!=b[1] && b[1]==b[3] && b[0]==b[2] && b[2]==b[4] ) {
                return true;
            }
        }
        return false;
    }

    public boolean g5XXYXX (int[] a) {
        for(int i = 0; i < 5; i++) {
            int k = 0;
            int[] b = new int[5];
            for (int j = i; j < i + 5; j++) {
                b[k] = a[j];
                k++;
            }
            if (b[1]!=b[2] && b[1]==b[0] && b[1]==b[3] && b[3]==b[4] ) {
                return true;
            }
        }
        return false;
    }

    public boolean g4XYYX (int[] a) {
        for(int i = 0; i < 6; i++) {
            int k = 0;
            int[] b = new int[4];
            for (int j = i; j < i + 4; j++) {
                b[k] = a[j];
                k++;
            }
            if (b[0]!=b[1] && b[1]==b[2] && b[0]==b[3] ) {
                return true;
            }
        }
        return false;
    }

    public boolean g8XYXYXYXY(int[] a) {
        for(int i = 0; i < 2; i++) {
            int k = 0;
            int[] b = new int[8];
            for (int j = i; j < i + 8; j++) {
                b[k] = a[j];
                k++;
            }
            if (b[0] != b[1] && b[0] == b[2] && b[2] == b[4] && b[1] == b[3] && b[3] == b[5] && b[5]==b[7] && b[4]==b[6] ) {
                return true;
            }
        }
        return false;
    }

    public boolean g4XYXY(int[] a) {
        for (int i = 0; i < 6; i++) {
            if (a[i] != a[i + 1] & a[i] == a[i + 2] & a[i + 1] == a[i + 3]) return true;
        }
        return false;
    }

    public void checkAll (ArrayList<SimAndPrice> SimList) {
        for (int i = 0; i < SimList.size(); i++) {
            SimAndPrice temp = SimList.get(i);
            int [] Simtemp = tachSo(temp.getSim());
            if (checkCuuQuy(Simtemp)) temp.setType("CuuQuy");
            else if (sort9(Simtemp)) temp.setType("sort9");
            else if (sort8(Simtemp)) temp.setType("sort8");
            else if (g8XYXYXYXY(Simtemp)) temp.setType("g8");
            else if (checkBatQuy(Simtemp)) temp.setType("BatQuy");
            else if (sort7(Simtemp)) temp.setType("sort7");
            else if (g7SPECIAL(Simtemp)) temp.setType("g7special");
            else if (checkThatQuy(Simtemp)) temp.setType("ThatQuy");
            else if (sort6(Simtemp)) temp.setType("sort6");
            else if (cach6(Simtemp)) temp.setType("cach6");
            else if (g6XXYYXX(Simtemp)) temp.setType("g6XXYYXX");
            else if (g6XYYYYX(Simtemp)) temp.setType("g6XYYYYX");
            else if (g6XYXXYX(Simtemp)) temp.setType("g6XYXXYX");
            else if (g6XYZZYX(Simtemp)) temp.setType("g6XYZZYX");
            else if (g6XYZXYZ(Simtemp)) temp.setType("g6XYZXYZ");
            else if (g6XYXYXY(Simtemp)) temp.setType("g6XYXYXY");
            else if (checkLucQuy(Simtemp)) temp.setType("LucQuy");
            else if (sort5(Simtemp)) temp.setType("sort5");
            else if (g5XYYYX(Simtemp)) temp.setType("g5XYYYX");
            else if (checkNguQuy(Simtemp)) temp.setType("NguQuy");
            else if (g5XYXYX(Simtemp)) temp.setType("g5XYXYX");
            else if (g5XXYXX(Simtemp)) temp.setType("g5XXYXX");
            else if (sort4(Simtemp)) temp.setType("sort4");
            else if (g4XYYX(Simtemp)) temp.setType("g4XYYX");
            else if (checkTuQuy(Simtemp)) temp.setType("TuQuy");
            else if (g4XYXY(Simtemp)) temp.setType("g4XYXY");
            else if (checkTamQuy(Simtemp)) temp.setType("TamQuy");
            else if (sort3(Simtemp)) temp.setType("sort3");
            else if (checkNhiQuy(Simtemp)) temp.setType("NhiQuy");
            else temp.setType("nothing");
        }
    }
}


