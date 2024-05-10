class Main {
    int z;
    public void add(int x, int y){
        z = x+y;
        System.out.println("The addition of X and Y is =  "+z);
    }
    public void subs(int x, int y){
        z = x-y;
        System.out.println("The diff is equal to " +z);
    }
    public static class  Child extends Main{
        public void multi ( int x, int y){
            z = x*y;
            System.out.println("The resultant is : "+z);
        }
    }
    //public static class nope{
        public static void main (String[] args){
            int a = 10; int b = 30;
            Child obj = new Child();
            obj.add(a,b);
            obj.subs(a,b);
            obj.multi(a,b);
        }
   // }
}