import java.io.*;
import java.util.ArrayList;

public class LotteryTicket {
    private static void searchWinner(BufferedReader in) {
        try {
            String[] arr;
            String winNumber = in.readLine();
            int countNumber = Integer.parseInt(in.readLine());

            for (int i = 0, count = 0; i < countNumber; i++, count = 0) {
                arr = in.readLine().split(" ");

                for (String s : arr)
                    count += winNumber.contains(s) ? 1 : 0;

                System.out.println(count >= 3 ? "Lucky" : "Unlucky");
            }
        }
        catch (IOException exception) {
            exception.getMessage();
        }
    }

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        searchWinner(bufferedReader);
    }
}
