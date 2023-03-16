import java.util.*;
public class Main {
    static void sleep(int sec){
        try {
            Thread.currentThread().sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception {
        ArrayList<Sepatu> sepatu = new ArrayList<>();
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println("================");
            System.out.println("   Menu Admin   ");
            System.out.println("================");
            System.out.println("1. Tambah sepatu");
            System.out.println("2. Tampil sepatu");
            System.out.println("3. Update sepatu");
            System.out.println("4. hapus  sepatu");
            System.out.println("5. keluar");
            System.out.print("Masukkan pilihan >> ");
            int pilihan = input.nextInt();
            switch(pilihan){
                case 1:
                    System.out.println("Tambah data");
                    System.out.print("Masukkan nama sepatu >> ");
                    String nama_sepatu = input.next();
                    System.out.print("Masukkan harga  >> ");
                    String hrg = input.next();
                    Sepatu sepatu_baru = new Sepatu(nama_sepatu, hrg);
                    sepatu.add(sepatu_baru);
                    sleep(1);
                    break;
                case 2:
                    System.out.println("Lihat data");
                    for(int i =0; i < sepatu.size(); i++){
                        sepatu.get(i).tampak();
                    }
                    System.out.println("");
                    sleep(1);
                    break;
                case 3:
                    System.out.println("Update Data");
                    System.out.print("Masukkan nama sepatu >> ");
                    String cari_kn = input.next();
                    for(Sepatu akn : sepatu){
                        if(akn.user_name.equals(cari_kn)){
                            System.out.print("Masukkan sepatu baru >> ");
                            akn.setName(input.next());
                            System.out.print("masukkan harga baru >> ");
                            akn.sethrg(input.next());
                            break;
                        }
                        else{
                            System.out.println("data salah");
                            sleep(1);
                        }
                    }
                    sleep(1);
                    break; 
                case 4:
                    System.out.println("hapus data");
                    System.out.print("Masukkan nama sepatu >>> ");
                    String us_nm = input.next();
                    for(int i = 0; i < sepatu.size();  i++){
                        if(sepatu.get(i).user_name.equals(us_nm)){
                            sepatu.remove(i);
                        }
                    }
                    sleep(1);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("=================");
                    System.out.println("pilihan tidak ada");
                    System.out.println("=================");
                    break;
            }
        }
        
    }
}
