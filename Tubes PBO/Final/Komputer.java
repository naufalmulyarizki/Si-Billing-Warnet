class Komputer {
    private Integer no_komputer;
    private Integer biaya;
    private Integer lama_penggunaan;
    protected String pengakses;

    Komputer(Integer no_komputer, Integer biaya_per_jam) {
        this.no_komputer = no_komputer;
        this.biaya = biaya_per_jam;
        this.lama_penggunaan = 0;
    }

    protected void tambahWaktu(Integer lama_penggunaan) {
        this.lama_penggunaan = this.lama_penggunaan + lama_penggunaan;
    }

    protected void resetWaktu() {
        this.lama_penggunaan = 0;
    }

    protected Integer getTotalBiaya() {
        return this.biaya * this.lama_penggunaan;
    }

    protected void displayStatus() {
        System.out.println("\nNO Komputer\t:\t".concat(this.no_komputer.toString()));
        System.out.println("Biaya\t\t:\tRp. ".concat(this.biaya.toString()));
        System.out.println("Lama\t\t:\t".concat(this.lama_penggunaan.toString()).concat(" jam"));
        System.out.println("Total Biaya\t:\tRp.".concat(this.getTotalBiaya().toString()));
        System.out.println("Pengakses\t:\t".concat(this.pengakses).concat("\n"));
    }
}
