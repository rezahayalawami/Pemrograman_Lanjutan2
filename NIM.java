package Algoritme;

public class NIM {
    private String nim;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJenjangPendidikan() {
        char kodeJp = nim.charAt(0);
        if (kodeJp == '1') {
            return "S1 (SARJANA)";
        } else if (kodeJp == '2') {
            return "S2 (MAGISTER)";
        } else if (kodeJp == '3') {
            return "S3 (DOKTOR)";
        }
        return "code not found";
    }


    public String TahunMasuk() {
        char TM1 = nim.charAt(1);
        char TM2 = nim.charAt(2);
        if (TM1 == '1' && TM2 == '9') {
            return "2019";
        } else if (TM1 == '2' && TM2 == '0') {
            return "2020";
        } else if (TM1 == '2' && TM2 == '1') {
            return "2021";
        }
        return "code not found";
    }


    public String getFakultas() {
        char kodeF = nim.charAt(3);
        if (kodeF == '1') {
            return "TARBIYAH DAN KEGURUAN";
        } else if (kodeF == '2') {
            return "SYARIAH DAN HUKUM";
        } else if (kodeF == '3') {
            return "USHULUDDIN";
        } else if (kodeF == '4') {
            return "DAKWAH DAN KOMUNIKASI";
        } else if (kodeF == '5') {
            return "SAINS DAN TEKNOLOGI";
        } else if (kodeF == '6') {
            return "PSIKOLOGI";
        } else if (kodeF == '7') {
            return "EKONOMI DAN ILMU SOSIAL";
        } else if (kodeF == '8') {
            return "PERTANIAN DAN PETERNAKAN";
        }
        return "code not found";
    }


    public String getJurusan() {
        char kodeJ = nim.charAt(5);
        if (kodeJ == '1') {
            return "TEKNIK INFORMATIKA";
        } else if (kodeJ == '2') {
            return "TEKNIK INDUSTRI";
        } else if (kodeJ == '3') {
            return "SISTEM INFORMASI";
        } else if (kodeJ == '4') {
            return "MATEMATIKA";
        } else if (kodeJ == '5') {
            return "TEKNIK ELEKTRO";
        }
        return "code not found";
    }


    public String getJenisKelamin() {
        char kodeJk = nim.charAt(6);
        if (kodeJk == '1') {
            return "LAKI-LAKI";
        } else if (kodeJk == '2') {
            return "PEREMPUAN";
        }
        return "code not found";
    }


    public String getNomorUrutMahasiswa() {
        char NUM1 = nim.charAt(7);
        char NUM2 = nim.charAt(8);
        char NUM3 = nim.charAt(9);
        char NUM4 = nim.charAt(10);
        return" " + NUM1 + NUM2 + NUM3 + NUM4 ;
    }

}
