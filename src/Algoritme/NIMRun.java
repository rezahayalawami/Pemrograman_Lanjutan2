package Algoritme;

public class NIMRun {
    public static void main(String[] args) {
        String nim = "12050120347";
        NIM objNim = new NIM();
        objNim.setNim(nim);
        System.out.println("Jenjang Pendidikan = "+objNim.getJenjangPendidikan());
        System.out.println("Tahun Masuk = "+objNim.TahunMasuk());
        System.out.println("Fakultas = "+objNim.getFakultas());
        System.out.println("Jurusan = "+objNim.getJurusan());
        System.out.println("Jenis kelamin = "+objNim.getJenisKelamin());
        System.out.println("Nomor Urut Mahasiswa = "+objNim.getNomorUrutMahasiswa());
    }
}