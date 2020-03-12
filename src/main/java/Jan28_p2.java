public class Jan28_p2 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        
        while(count < 10) {            
            if(count % 3 == 0) {
                System.out.println(count);
                sum += count;
            }
            else if(count % 5 == 0) {
                System.out.println(count);
                sum += count;
            }
            //count = count + 1;
            //count += 1;
            count++;
        }
        System.out.println("Sum = " + sum);
    }
}
// print multiples of 3 then calculate their sum 