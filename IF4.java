public class IF4{
    public static void main(String[] args){
        boolean hujan = true;
        boolean adaPayung = true;

        if(hujan == true){
            if(adaPayung == true){
                System.out.println("Boleh Keluar Rumah Karena Ada Payung");
            }
            else{
                System.out.println("Tidak Ada Payung Jadi Tidak Bisa Keluar Rumah");
            }
        }
        else{
            if(adaPayung == true){
                System.out.println("Boleh Keluar Rumah Dan Boleh Bawa Payung");
            }
            else{
                System.out.println("Boleh Keluar Rumah Meski Tidak Ada Payung");
            }
        }
    }
}