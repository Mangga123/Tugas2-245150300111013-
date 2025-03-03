class Pegawai {
    private String nama;
    private String jabatan;
    private double gajiPokok;
    private double tunjangan;
    private double potongan;
    private double bonus;
    // Default Constructor
    public Pegawai() {
        this.nama = "";
        this.jabatan = "";
        this.gajiPokok = 0;
        this.tunjangan = 0;
        this.potongan = 0;
        this.bonus = 0;
    }
    // Overloading Constructor
    public Pegawai(String nama, String jabatan, double gajiPokok, double tunjangan, double potongan, double bonus) {
        this.nama = nama;
        this.jabatan = jabatan;
        setGajiPokok(gajiPokok);
        setTunjangan(tunjangan);
        setPotongan(potongan);
        setBonus(bonus);
    }
    // Getter dan Setter
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getJabatan() {
        return jabatan;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    public double getGajiPokok() {
        return gajiPokok;
    }
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = Math.max(gajiPokok, 0);
    }
    public double getTunjangan() {
        return tunjangan;
    }
    public void setTunjangan(double tunjangan) {
        this.tunjangan = Math.max(tunjangan, 0);
    }
    public double getPotongan() {
        return potongan;
    }

    public void setPotongan(double potongan) {
        this.potongan = Math.max(potongan, 0);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = Math.max(bonus, 0);
    }
    // Method untuk menghitung total gaji
    public double hitungGajiTotal() {
        return gajiPokok + tunjangan + bonus - potongan;
    }
    // Method untuk menampilkan informasi pegawai
    public String toString() {
        return String.format(
            "Nama: %s\nJabatan: %s\nGaji Pokok: %.2f\nTunjangan: %.2f\nBonus: %.2f\nPotongan: %.2f\nTotal Gaji: %.2f\n--------------------------", 
            nama, jabatan, gajiPokok, tunjangan, bonus, potongan, hitungGajiTotal()
        );
    }
    // Method untuk menambahkan bonus
    public void tambahBonus(double tambahanBonus) {
        setBonus(this.bonus + tambahanBonus);
    }
}
