public class Jan21{
     public static void main(String []args){
        System.out.println("Hello World");
        
        // Here we will assign Rusty to the string name, Strings must be inside double quotes ""
        String name = "Rusty";

        // Here we are assigning the whole integer value of 5 to the age variable. Note: 5.9 would be rounded down to 5
        int age = 5;
        
        // Create a Cat object with the name and age we defiend above and outputing this information to the console
        Cat cat = new Cat(name, age);
        System.out.println(cat.name + " is " + cat.age + " years old.");
        
        // These are the different data types in java.
        char c = cat.name.charAt(0);   // c is the first character of the cats name. or 'R' (characters must be in single quotes)
        boolean isOld = false;          // boolean is a true or false value
        double dollars = 2.250000001;   // double is a way to represent decimals in java.
        
        // Booleans can be used as if/else evaluations.
        if(isOld) {
            System.out.println("The cat is old");
        }
        else {
            System.out.println("The cat is young");
        }
        
        // the double equal sign is used as a comparision to determine if they are equal, while the != determines if they are not equal.
        if(cat.age == 5 && c != 'B') {
            System.out.println(cat.name + " is 5 and the first name does not start with B");
        }
        else {
            System.out.println(cat.name + " is not 5");
        }
     }
     
     
     
     // Cat class.. You do not need to know this just yet.
     public static class Cat {
        String name;
        int age;
        
        public Cat(String _name, int _age) {
            name = _name;
            age = _age;
        }
     }
}