
package quanlinhansu;


public class Main {

    public static void main(String[] args) {
        Person st = new Student("ABC", "Minh", 19, "Student") {
            @Override
            public void level() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        } ;
            
        System.out.println(st.toString());
        
        Person tc = new Teacher("Math", "Hihi", 20, "Teacher") {} ;
        
        System.out.println(tc.toString());
        
    }
}    

    
   

