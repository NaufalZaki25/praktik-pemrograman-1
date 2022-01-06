public class Mahasiswa extends Family{
    private String studID;
    private String fullName;
    private double gpa;
    private int studSems;

    public Mahasiswa (String studID, String fullName, int studSems, double gpa) {
        this.studID = studID;
        this.fullName = fullName;
        this.studSems = studSems;
        this.gpa = gpa;
    }

    public void setstudID(String studID) {
        this.studID = studID;
    }
    public String getstudID() {
        return this.studID;
    }

    public void setfullName(String fullName) {
        this.fullName = fullName;
    }
    public String getfullName() {
        return this.fullName;
    }

    public void setstudSems(int studSems) {
        this.studSems = studSems;
    }
    public int getstudSems () {
        return this.studSems;
    }

    public void setgpa(double gpa) {
        this.gpa = gpa;
    }
    public double getgpa() {
        return this.gpa;
    }


    public void getDetail() {
        System.out.printf("%10s %20s %5s %5s %5s", this.studID, this.fullName, this.studSems, this.gpa, this.fathersName);
        System.out.println();        
    }
}