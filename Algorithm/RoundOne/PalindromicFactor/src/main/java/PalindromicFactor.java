import java.io.*;
import java.util.ArrayList;

public class PalindromicFactor {
    private static String dataInput() {
        String data = null;
        try {
            InputStream inputStream = System.in;
            Reader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            data = bufferedReader.readLine();
        }
        catch (IOException exception) {
            exception.getMessage();
        }
        return data;
    }

    private static String fiendMinSubstring(ArrayList<String> substrings) {
        String minStr = "zzz";

        for (String str : substrings)
            minStr = minStr.compareTo(str) < 0 && minStr.length() <= str.length()? minStr: str;

        return minStr;
    }

    private static ArrayList<String> fiendPalindrome(String line) {
        ArrayList<String> substrings = new ArrayList<>();
        int lengthLine = line.length() - 1;

        for (int start = 0; start < lengthLine; ++start) {
            if (line.charAt(start) == line.charAt(start + 1))
                substrings.add(line.substring(start, start + 2));
            else if (start < lengthLine - 1 && line.charAt(start) == line.charAt(start + 2))
                substrings.add(line.substring(start, start + 3));
        }

        return substrings;
    }

    public static void main(String[] args) {
        String data = dataInput();
        ArrayList<String> arrayList = fiendPalindrome(data);

        System.out.println(arrayList.size() == 0? "-1": fiendMinSubstring(arrayList));
    }
}
