/* Ricardo Pluviose *\

*/




public class TestScores {  
    
    int test1, test2, test3;
    double average;
    
 
    public TestScores() {
        
    }
    
    public TestScores (int test1, int test2, int test3) {
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }
    
    public int getTest1(){
        return test1;
    }
    
    public void setTest1(int test1){
        this.test1 = test1;
    }
    
    
     public int getTest2(){
        return test2;
    }
    
    public void setTest2(int test2){
        this.test2 = test2;
    }
    
     public int getTest3(){
        return test3;
    }
    
    public void setTest3(int test3){
        this.test3 = test3;
    }
    
    
        //Action method 
    public double CalcAverageScore() {
     
        average = ((this.test1 + this.test2 + this.test3) / 3.0 );
        return average;
    }
    
public String CalcGrade(){
    String letterGrade = "";
    double averageGd = CalcAverageScore();
    
       if(averageGd >= 90 && averageGd < 100) 
           return letterGrade = "A";
           
       else if(averageGd >= 80 && averageGd < 89)
            return letterGrade = "B";
       
       else if(averageGd >= 70 && averageGd < 79)
            return letterGrade = "C";
       
       else if (averageGd >= 60 && averageGd < 69)
            return letterGrade = "D";
       
       else if(averageGd < 60)
            return letterGrade = "F";
       
       return letterGrade = "Invalid";     
}
}     
  