public class Exception {
    public static void main(String[] args) {
        
        int a=10;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(NullPointerException e){
            throw e;
        }
    }
}
