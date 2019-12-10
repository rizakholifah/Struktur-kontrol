public class IF3{
    public static void main(String[] args){
        boolean hujan = true;
        boolean adaPayung = false;
        if(hujan == true && adaPayung == true){
            System.out.println("Boleh Keluar Rumah");
        }
        else if(hujan == true && adaPayung == false){
            System.out.println("Tidak Boleh Keluar Rumah");
        }
        else if(hujan == false && adaPayung == true){
            System.out.println("Boleh Keluar Rumah Tapi Payungnya Ga Kepake");
        }
        else{
            System.out.println("Boleh Keluar Rumah Meski Gada Payung");
        }
    }
}