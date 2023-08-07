public class Hewan {
    private int umur;
    private String gender;
    private double bobot;

    // Constructor
    public Hewan(int umur, String gender, double bobot) {
        this.umur = umur;
        this.gender = gender;
        this.bobot = bobot;
    }

    // (Encapsulation)
    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getBobot() {
        return bobot;
    }

    public void setBobot(double bobot) {
            this.bobot = bobot;
    }

  // Method(Behavior)
     public void walk() {
        System.out.println("Berjalan");
    }
      

    public void eat() {
        System.out.println("Makan");
    }

     public void sleep() {
        System.out.println("Tidur");
    }
}

