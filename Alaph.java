public class Main

{

    public static void main(String[] args) 
    {
        Scanner s=new Scanner (System.in);
        char c=s.next().charAt(0);

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println( "Alphabet");
        else
            System.out.println("No");
    }
}
