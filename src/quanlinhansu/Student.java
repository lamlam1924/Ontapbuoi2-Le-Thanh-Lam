
package quanlinhansu;

public abstract class Student extends Person{
    
    private String mssv;

    public Student(String mssv, String name, int age, String job) {
        super(name, age, job);
        this.mssv = mssv;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    @Override
    public String toString() {
        return "Student [ MSSV: " + mssv + super.toString()+" "+']';
    }

    
    
    public abstract void level();
}
