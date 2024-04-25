package tugaspemlanpraktikum4;

public class Main {
    public static void main(String[] args) {
        System.out.println("=============\n" + "Kelas Manusia" + "\n=============");
        Manusia manusia1 = new Manusia("Adam", true, "111", true);
        System.out.println(manusia1);
        Manusia manusia2 = new Manusia("Bagus", true, "222", false);
        System.out.println(manusia2);
        Manusia manusia3 = new Manusia("Citra", false, "333", false);
        System.out.println(manusia3);

        System.out.println("\n=====================\n" + "Kelas MahasiswaFILKOM" + "\n=====================");
        MahasiswaFILKOM mahasiswaFILKOM1 = new MahasiswaFILKOM("Muhammad Brillian Rabbani", true, "235150407111044", true, "235150407111044", 4.00);
        System.out.println(mahasiswaFILKOM1);
        MahasiswaFILKOM mahasiswaFILKOM2 = new MahasiswaFILKOM("Zaid Ilman Faqih Umar", true, "235150408222055", true, "235150408222055", 3.40);
        System.out.println(mahasiswaFILKOM2);
        MahasiswaFILKOM mahasiswaFILKOM3 = new MahasiswaFILKOM("Erwin Trimulya Purwono", true, "235150409333066", true, "235150409333066", 3.75);
        System.out.println(mahasiswaFILKOM3);

        System.out.println("=============\n" + "Kelas Pekerja" + "\n=============");
        Pekerja pekerja1 = new Pekerja("Amir", true, "444", true, 200, 2020, 1, 1, 1);
        System.out.println(pekerja1);
        Pekerja pekerja2 = new Pekerja("Budi", true, "555", true, 400, 2010, 2, 2, 2);
        System.out.println(pekerja2);
        Pekerja pekerja3 = new Pekerja("Ceri", false, "666", true, 700, 2005, 3, 3, 10);
        System.out.println(pekerja3);
    
        System.out.println("\n=============\n" + "Kelas Manager" + "\n=============");
        Manager manager = new Manager("Bagus", true, "777", true, 8000, 2000, 1, 1, 0, "HRD");
        manager.setDepartemen("HRD");
        System.out.println(manager);
    }
}