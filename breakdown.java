public class breakdown 
{
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            if (i % 2 == 0) {
                break;// even numbers skip
            }
            System.out.println(i + "");
        }
    }
}


