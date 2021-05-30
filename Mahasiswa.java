package gui;

import Algoritme.NIM;

public class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String JenjangPendidikan() {
        char kodeJp = nim.charAt(0);
        if (kodeJp == '1') {
            return "Jenjang Pendidikan = S1 (SARJANA)";
        } else if (kodeJp == '2') {
            return "Jenjang Pendidikan = S2 (MAGISTER)";
        } else if (kodeJp == '3') {
            return "Jenjang Pendidikan = S3 (DOKTOR)";
        }
        return "code not found";
    }


    public String TahunMasuk() {
        char TM1 = nim.charAt(1);
        char TM2 = nim.charAt(2);
        if (TM1 == '1' && TM2 == '9') {
            return "Tahun Masuk = 2019";
        } else if (TM1 == '2' && TM2 == '0') {
            return "Tahun Masuk = 2020";
        } else if (TM1 == '2' && TM2 == '1') {
            return "Tahun Masuk = 2021";
        }
        return "code not found";
    }


    public String MenentukanFakultas() {
        char kodeF = nim.charAt(3);
        if (kodeF == '1') {
            return "Fakultas = Tarbiyah dan Keguruan";
        } else if (kodeF == '2') {
            return "Fakultas = Syariah dan Hukum";
        } else if (kodeF == '3') {
            return "Fakultas = Ushuluddin";
        } else if (kodeF == '4') {
            return "Fakultas = Dakwah dan Komunikasi";
        } else if (kodeF == '5') {
            return "Fakultas = Sains dan Teknologi";
        } else if (kodeF == '6') {
            return "Fakultas = Psikologi";
        } else if (kodeF == '7') {
            return "Fakultas = Ekonomi dan Ilmu Sosial";
        } else if (kodeF == '8') {
            return "Fakultas = Pertanian dan Peternakan";
        }
        return "code not found";
    }


    public String MenentukanJurusan() {
        char kodeJ = nim.charAt(5);
        if (kodeJ == '1') {
            return "Jurusan = Teknik Informatika";
        } else if (kodeJ == '2') {
            return "Jurusan = Teknik Industri";
        } else if (kodeJ == '3') {
            return "Jurusan = Sistem Informasi";
        } else if (kodeJ == '4') {
            return "Jurusan = Matematika";
        } else if (kodeJ == '5') {
            return "Jurusan = Teknik Elektro";
        }
        return "code not found";
    }


    public String JenisKelamin() {
        char kodeJk = nim.charAt(6);
        if (kodeJk == '1') {
            return "Jenis Kelamin = Laki-laki";
        } else if (kodeJk == '2') {
            return "Jenis Kelamin = Perempuan";
        }
        return "code not found";
    }


    public String NomorUrutMahasiswa() {
        char NUM1 = nim.charAt(7);
        char NUM2 = nim.charAt(8);
        char NUM3 = nim.charAt(9);
        char NUM4 = nim.charAt(10);
        return" Nomor Urut Mahasiswa = " + NUM1 + NUM2 + NUM3 + NUM4 ;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' +
                ", nim='" + nim + '\'' +
                '}';

    }


}
