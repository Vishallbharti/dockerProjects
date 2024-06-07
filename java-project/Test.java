import java.util.*;
class Test{
    public static void main(String[] str){
        System.out.println("Java program started:");
        printSystemProperties();
    }

    public static void printSystemProperties(){
        System.out.println("Printing system properties using java program:");
        Properties props =  System.getProperties();
        System.out.println(props);
    }
}