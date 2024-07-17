// ユーザーデスクトップに空ファイルを指定した回数作成します
// ユーザー名・ファイル名・ファイルの拡張子・ファイル作成回数をそれぞれ半角区切りで入力してください
// 例: adminminzemi PrankFile hello 1000000

import java.nio.file.*;
import java.io.IOException;
import java.util.Scanner;

public class ManyFiles{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String info = scn.nextLine();
        scn.close();
        String[] splitInfo = info.split(" ");
        String pathStr = "C:\\Users\\" + splitInfo[0] + "\\Desktop\\";
        try {
            for(int i = 0; i < Integer.parseInt(splitInfo[3]); i++){
                Path filePath = Paths.get(pathStr + splitInfo[1] + i + "." + splitInfo[2]);
                Files.createFile(filePath);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
