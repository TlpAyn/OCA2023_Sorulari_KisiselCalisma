package Sor_129_TryCatch;

public class Try {
    public static void main(String[] args) {
int ans = 0;
        try{
            int num =10;
            int div =0;
             ans = num /div ;

// Yukaruda int ans i tanimlayinca ve deger atamayinca sadece yazdirdaki ans hata veriyor ! cunku ans degerini ariyor .
            // Yukaridaaki ans a deger verince program hata vermiyor ve her iki ansi da goruyor .
            // Yukarida ans a hicbir deger vermeyince iki yerde birden hata veriyor program ! 

        }catch (ArithmeticException ae){

            ans=0;
        }catch (Exception e){
            System.out.println("Invalid calcl.");

        }
        System.out.println("Answer ="+ ans);
    }


}