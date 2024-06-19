
package quanlinhansu;

public class Engineer extends Person{
    
    private String about;

    public Engineer(String about, String name, int age, String job) {
        super(name, age, job);
        this.about = about;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public String toString() {
        return "Engineer{" + "about=" + about + '}';
    }
    
    @Override
    public void level(){
       
    }

    
    
    
}
