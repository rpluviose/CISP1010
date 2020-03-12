import javax.swing.JOptionPane;

public class Nametest {
    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null, "Hello World");
//        String name = JOptionPane.showInputDialog(null, "What is your name?");
//        JOptionPane.showMessageDialog(null, "Hello, " + name);
        
        Human me = new Human("Brennan", "Huber", "Brennan Huber", 25, 500, 7, 'm', 1111);
        Human you = new Human();
        
        System.out.println(me.first_name);    // this is not good. Use 'me.getName()'
        System.out.println(you.first_name);
        
        me.last_name = "Underwood";
        //me.full_name = "Brennan Underwood";
        
        System.out.println(me.first_name + " " + me.last_name);
        System.out.println(me.full_name);   // this is now stale data because I never updated it... dont do unnessary work.
 /*       
        you.setName("Jared");
        System.out.println(you.name);
 */
        me.walk();
        you.walk(5);
    }
}   
