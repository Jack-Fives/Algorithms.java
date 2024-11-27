import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;

    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        int odds = odds();
        int evens = evens();
        int twoNums = twoNums();
        int greaterThanFive = greaterThanFive();
        int greatest = greatest();
        int least = least();
        int sum = sum();
        System.out.println(odds);
        System.out.println(evens);
        System.out.println(twoNums);
        System.out.println(greaterThanFive);
        System.out.println(greatest);
        System.out.println(least);
        System.out.println(sum);
        s.close();
    }

    public static int odds() throws FileNotFoundException{
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        return odds;
    }
    public static int evens() throws FileNotFoundException{
        s = new Scanner(f);
        int evens = 0;
        while (s.hasNext()){
            if(s.nextInt() % 2 == 0){
                evens++;
            }
        }
        return evens;
    }
    public static int twoNums() throws FileNotFoundException{
        s = new Scanner(f);
        int twoNums = 0;
        while(s.hasNext()){
            int a = s.nextInt();
            if((a / 100 == 0)&&(a - 10>0)){
                twoNums++;
            }
        }
        return twoNums;
    }
    public static int greaterThanFive() throws FileNotFoundException{
        s = new Scanner(f);
        int greaterThanFive = 0;
        while(s.hasNext()){
            if(s.nextInt()>500){
                greaterThanFive++;
            }
        }
        return greaterThanFive;
    }
    public static int greatest() throws FileNotFoundException{
        s = new Scanner(f);
        int greatest = 0;
        while(s.hasNext()){
            if(s.nextInt()>greatest){
                greatest = s.nextInt();
            }

        }
        return greatest;
    }
    public static int least() throws FileNotFoundException{
        s = new Scanner(f);
        int least = 999;
        while(s.hasNext()){
            if(s.nextInt()<least){
                least = s.nextInt();
            }

        }
        return least;
    }
    public static int sum() throws FileNotFoundException{
        s = new Scanner(f);
        int sum = 0;
        while(s.hasNext()){
            sum = sum + s.nextInt();
        }
        return sum;
    }
  
}