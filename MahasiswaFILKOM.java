package tugaspemlanpraktikum4;

public class MahasiswaFILKOM extends Manusia{
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nama, boolean jenisKelamin, String nik, boolean menikah, String nim, double ipk) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public double getIpk() {
        return ipk;
    }

    public String getStatus() {
        String[] prodi = {"", "Teknik Informatika", "Teknik Komputer", "Sistem Informasi", "", "Pendidikan Teknologi Informasi", "Teknologi Informasi"};
        int angkatan = Integer.parseInt(nim.substring(0, 2)) + 2000;
        int prodiCode = Integer.parseInt(nim.substring(6, 7));
        String prodiName = prodi[prodiCode];
        return prodiName + ", " + angkatan;
    }

    public double getBeasiswa() {
        if (ipk >= 3.0 && ipk <= 3.5) {
            return 50;
        } else if (ipk > 3.5 && ipk <= 4) {
            return 75;
        } else {
            return 0;
        }
    }

    public String toString() {
        return super.toString() + ", NIM: " + nim + ", IPK: " + ipk + ", Status: " + getStatus();
    }
}