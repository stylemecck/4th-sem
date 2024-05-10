import java.util.Scanner;

class inhertiance {
    //user desire input
    double z;
    public void Addition(double x, double y){
        z = x + y;
        System.out.println("The addition of the two number is : "+z);
    }
    public void subs (double x, double y){
        z = x - y;
        System.out.println("The difference between two number is : " +z);
    }
    public static class Satyam extends  inhertiance{
        public void Multi (double x, double y){
            z = x * y;
            System.out.println("The result is : "+z);
        }
        public void divide (double x, double y){
            z = x/y;
            System.out.println("The division of the two element is :" +z);
        }
    }

    public static void main (String[] args){
        System.out.println("The the Value of elements");
        Scanner newInput = new Scanner(System.in);
        Double x  = newInput.nextDouble();
        Double y = newInput.nextDouble();

        Satyam obj = new Satyam();
        obj.Addition(x,y);
        obj.subs(x,y);
        obj.Multi(x,y);
        obj.divide(x,y);

    }
}
