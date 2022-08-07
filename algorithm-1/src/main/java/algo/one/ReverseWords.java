package algo.one;

public class ReverseWords {

    public static void main(String[] args) {
        var reverser = new ReverseWords();

        System.out.println(reverser.reverseWords("Let's take LeetCode contest"));
    }

    public String reverseWords(String s) {
        var words = s.split(" ");
        var builder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                builder.append(words[i].charAt(j));
            }
            if (i != words.length - 1)
                builder.append(' ');
        }

        return builder.toString();
    }
}
