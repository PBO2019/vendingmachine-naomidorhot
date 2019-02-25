public class MesinKopi {
    private String JenisKopi;
    private String Topping;
    private int JumlahStokKopi;

    public void setJenisKopi(String kopi){
        this.JenisKopi = kopi;
    }

    public String getJenisKopi() {
        return JenisKopi;
    }


    public void setJumlahStokKopi(int jumlah){
        this.JumlahStokKopi = jumlah;
    }

    public int getJumlahStokKopi() {
        return JumlahStokKopi;
    }


    public void setTopping(String topping){
        this.Topping = topping;
    }

    public String getTopping() {
        return Topping;
    }
}

