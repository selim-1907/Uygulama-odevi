public class Maraton {
    private int[] derece;
    private String[] kosucular;

    public Maraton(int[] derece, String[] kosucular) {
        this.derece = derece;
        this.kosucular = kosucular;
    }

    public int[] getDerece() {
        return derece;
    }

    public void setDerece(int[] derece) {
        this.derece = derece;
    }

    public String[] getKosucular() {
        return kosucular;
    }

    public void setKosucular(String[] kosucular) {
        this.kosucular = kosucular;
    }

    public void Hizlilar() {
        for (int i = 0; i <derece.length; i++) {
            for (int j = i+1; j < derece.length ; j++) {
                if (derece[i] > derece[j]) {
                    int temp = derece[i];
                    derece[i] = derece[j];
                    derece[j] = temp;
                    String tem2 = kosucular[i];
                    kosucular[i] = kosucular[j];
                    kosucular[j] = kosucular[i];
                    kosucular[j] = tem2;
                }
            }
        }
        System.out.println("Brinci : " + kosucular[0]+" " + derece[0]+"'");
        System.out.println("İkinci : " + kosucular[1]+" " + derece[1]+"'");
        System.out.println("Üçüncü : " + kosucular[2]+" " + derece[2]+"'");
    }


    public void klasman() {
        int Aklasman = 0, Bklasman = 0, Cklasman = 0;
        for (int i = 0; i < derece.length; i++) {
            if (200 < derece[i] && derece[i] < 300) {
                Aklasman++;
            } else if (300 < derece[i] && derece[i] < 400) {
                Bklasman++;
            } else Cklasman++;

        }
        System.out.println("A" + " -> " + Aklasman);
        System.out.println("B" + " -> " + Bklasman);
        System.out.println("C" + " -> " + Cklasman);
    }
    }




