import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.io.IOException;

public class ServerCheck {
    public static void main(String[] args) {
        final String hostName = args[0];

        URL url = null;
        URLConnection connection = null;
        HttpURLConnection httpcon = null;
        int responseCode = 0;

        final String RED = "\u001b[00;31m";
        final String GREEN = "\u001b[00;32m";
        final String END = "\u001b[00m";

        try {
            url = new URL(hostName);
            connection = url.openConnection();
            httpcon = (HttpURLConnection)connection;
            responseCode = httpcon.getResponseCode();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        final int firstNum = Integer.parseInt(Integer.toString(responseCode).substring(0,1));
        if (firstNum == 1 || firstNum == 4 || firstNum == 5) {
            System.out.println("サーバーの稼働状況: " + RED + "異常" + END);
            System.err.println(RED + "サーバーがダウンしています。 プログラムを終了します。" + END);
            System.exit(145);
        } else {
            System.out.println("サーバーの稼働状況: " + GREEN + "正常" + END);
        }


    }
}