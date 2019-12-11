public class tugasIF{
    public static void main(String[] args){  
        try{
        int a = Integer.parseInt(args[0]);
        if(a > 100){
            System.out.println("Nilai Tidak Valid");
        }
        else if(a >= 84 ){
            System.out.println("Grade A");
        }
        else if(a >= 74){
            System.out.println("Grade B");
        }
        else if(a >= 64){
            System.out.println("Grade C");
        }
        else if(a >= 44){
            System.out.println("Grade D");
        }
        else if(a >= 0){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Nilai Tidak Valid");
        }
    }
    catch(Exception e){
        System.out.println("Nilai Tidak Valid");
    }
    }
}