package quanlinhansu;

public abstract class Teacher extends Person{
    
    private String major;

    public Teacher(String major, String name, int age, String job) {
        super(name, age, job);
        this.major = major;
    }

    

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Teacher [ Major: " + major + super.toString()+" "+']';
    }
    
    @Override
    public void level(){
        
    }    
    
}
