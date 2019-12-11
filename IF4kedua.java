public class IF4kedua{
    public static void main(String[] args){
        String username = "rizakholifah";
        String password = "apaya123";

        if(username == "rizakholifah"){
            if(password == "apaya123"){
                System.out.println("Login Berhasil :)");
            }
            else{
                System.out.println("Password Yang Anda Masukan Salah!");
            }
        }
        else{
            System.out.println("Username Tidak Ditemukan");
        }
    }
}