class StaticBinding 
{

    public  static void  add(int a, int b)
    {
        System.out.println(a+b);
    }


    public  static void  add(int a, int b, int c )
    {
        System.out.println(a+b +c);
    }

    public static void main(String[] args)
    {
            StaticBinding sb = new StaticBinding();
            sb.add(10,20);
            sb.add(10,20,30);
    }
}