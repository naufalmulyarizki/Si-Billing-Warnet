class Member {
    private Integer id;
    private String nama;

    Member(Integer id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    protected void aksesKomputer(Komputer com, Integer lama_jam_penggunaan) {
        com.pengakses = this.nama;
        com.tambahWaktu(lama_jam_penggunaan);
    }

    protected void tinggalkanKomputer(Komputer com) {
        com.pengakses = "";
        com.resetWaktu();
    }
}