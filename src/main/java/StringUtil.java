public class StringUtil {
    public String drop(int n, String str) {
        if (str.length() > n) {
            return str.substring(n, str.length());
        }
        return "";
    }

    public String take(int n, String str) {
        if (str.length() >= n) {
            return str.substring(0, n);
        }
        return str;
    }
}
