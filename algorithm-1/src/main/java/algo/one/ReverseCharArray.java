package algo.one;

public class ReverseCharArray {

    public void reverseString(char[] s) {
        var start = 0;
        var end = s.length - 1;

        while (start < end) {
            var temp = s[end];
            s[end] = s[start];
            s[start] = temp;
            start++;
            end--;
        }
    }
}
