package findIndexString_28_easy;

public class Main {
    public static void main(String[] args) {

    }

    public int findIndexString(String haystack, String needly) {
        if (needly.length() > haystack.length()) {
            return -1;
        }
        for (int i = 0; i <= haystack.length() - needly.length(); i++) {
            boolean match = true;
            for (int j = 0; j < needly.length(); j++) {
                if (haystack.charAt(i + j) != needly.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return 1;
            }
        }
        return -1;
    }
}
