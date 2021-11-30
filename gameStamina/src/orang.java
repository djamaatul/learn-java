public class orang {
    String nama ;
    int energi = 0 ;
    int olah;
    orang(String nama,int energi){
        this.nama = nama;
        this.energi = energi;
    }
    void status(){
        System.out.println("Nama: " + this.nama + "\nEnergi :" + this.energi + "\n");
    }
    void  makan(int nilai){
        this.energi += nilai;
        System.out.println("Energi :" + this.energi);
    }
    void  olahraga(String olah){
        switch (olah) {
            case "sepak bola":
                this.olah  = 50;    
                break;
            case "badminton":
            this.olah  = 25;  
                break;
            default:
            this.olah = 10;
                break;
        }
        this.energi -= this.olah;
        System.out.println("Energi :" + this.energi);
    }
}
