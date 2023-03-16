public class Sepatu {
    String user_name;
    String harga;
    Sepatu(String us_name, String hrg){
        this.user_name = us_name;
        this.harga = hrg;
    }
    void setName(String us_name){
        this.user_name = us_name;
    }
    void sethrg(String hrg){
        this.harga = hrg;
    }
    void tampak(){
        System.out.println("=================================");
        System.out.println("1. Merk Sepatu = " + this.user_name);
        System.out.println("2. Harga  = " + this.harga);
        System.out.println("=================================");
    }
}
