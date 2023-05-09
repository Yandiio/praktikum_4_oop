/**
 * @author Yandi Fenanda
 * @createdOn 08/05/23 Monday
 */
class OrangTua {
    String nama;
    int umur, berat;

    public static void main(String[] args) {
        OrangTua anak1 = new OrangTua();
        OrangTua anak2 = new OrangTua();
        anak1.nama = "yuli";
        anak1.berat = 45;
        anak1.umur = 35;

        System.out.println("Nama anak pertama " + anak1.nama);
        System.out.println("Berat badan " + anak1.berat);
        anak1.makan();

        anak2.nama = "yuna";
        anak2.berat = 80;
        anak2.umur = 19;
        System.out.println("nama anak kedua " + anak2.nama);
        System.out.println("Berat badan " + anak2.berat);
        anak2.jalan();
    }

    void makan() {
        System.out.println("makan sate");

    }

    void tidur() {
        System.out.println("tidur ngorok");
    }

    void jalan() {
        System.out.println("jalan-jalan ");
    }

    class anak1 extends OrangTua {
        void renang() {
            System.out.println(" renang gaya batu");
        }
    }

    class anak2 extends OrangTua {
        void bernyanyi() {
            System.out.println("bernyanyi dangdut");
        }
    }
}