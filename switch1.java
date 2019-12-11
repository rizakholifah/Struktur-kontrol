public class switch1{
    public static void main(String[] args){

        String bulan = "Selasa";
        switch(bulan){
            case "Senin":
            System.out.println("Upacara !");
            break;
            case "Selasa":
            System.out.println("Olahraga");
            break;
            default:
            System.out.println("Libur Yeayy");
            break;
        }
    }
}