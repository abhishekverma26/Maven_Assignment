public class Application {
    public static void main(String[] args){
        //StringFunctions class is from <string-api> sub-module
        String name = "First Assignment";
        int size = StringFunctions.sizeofString(name);
        String reversed_string = StringFunctions.reverseString(name);
        System.out.println("Size of string = "+size+"\nReversed String = "+reversed_string);
    }
}
