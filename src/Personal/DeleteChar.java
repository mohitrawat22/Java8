package Personal;

public class DeleteChar {
    public static void main(String [] args) {
        String str = "mohitt";
        //StringBuilder sb = new StringBuilder(str);
       // sb.deleteCharAt(2);
        //System.out.println(sb);
        str = str.replace('t', Character.MIN_VALUE);
        System.out.println(str);
    }
}
