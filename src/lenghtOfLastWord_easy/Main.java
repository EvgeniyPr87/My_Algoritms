package lenghtOfLastWord_easy;

public class Main {
    public static void main(String[] args) {


    }
public int lenghtOfLastWord(String s){
        int length=0;
        int i=s.length()-1;

        while (i>=0 && s.charAt(i)==' '){
            i--;

        }
        while (i>=0 && s.charAt(i)!=' '){
            length++;
            i--;
        }
        return length;
}
}
