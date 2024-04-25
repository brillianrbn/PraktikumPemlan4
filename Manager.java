package tugaspemlanpraktikum4;
import java.time.LocalDate;

public class Manager extends Pekerja{
    private String departemen;

    public Manager(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, int tahunMasuk, int bulanMasuk, int hariMasuk, int jumlahAnak, String departemen) {
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMasuk, bulanMasuk, hariMasuk, jumlahAnak);
        this.departemen = departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public double getTunjangan() {
        return super.getTunjangan() + (super.getGaji() * 0.10);
    }

    public String toString() {
        return super.toString();
    }
}        

