
public class Human {
    String first_name;
    String last_name;
    String full_name;
    int age;
    double weight;
    int height;
    char sex;
    int social;
    
    public Human(String _first_name, String _last_name, String _full_name, int _age, double _weight, int _height, char _sex, int _social) {
        first_name = _first_name;
        last_name = _last_name;
        full_name = _full_name;
        age = _age;
        weight = _weight;
        height = _height;
        sex = _sex;
        social = _social;
    }
    
    public Human() {
        
    }
    
    public void setName(String _name) {
        this.first_name = _name;
    }
    
//    private void setName(String _name) {
//         this.name = _name;
//    }
    
    public void walk() {
        System.out.println("Human is walking");
    }
    
    public void walk(int speed) {
        System.out.println("Human is walking at " + speed + " ");
    }
    

}
    
