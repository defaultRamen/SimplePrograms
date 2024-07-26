// YouTubeで昔多分流行っていたスクロールすると文字が流れるように見えるものを生成します
// 使い方
// コンパイルできたらjava FlowingLetters <対象の文字列> <間隔数(0に近いほど動かすとなめらかになります)> <繰り返す回数>

public class FlowingLetters{
    public static void main(String[] args) {
        String target = args[0];
        int intervalNum = Integer.parseInt(args[1]);
        int repeatNum = Integer.parseInt(args[2]);
        StringBuilder interval = new StringBuilder();
        for (int i = 0; i < intervalNum; i++){
            interval.append(" ");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(target);
        System.out.println(sb.toString());
        for (int i = 0; i < repeatNum - 1; i++){
            System.out.println(sb.insert(0, interval).toString());
        }
        for (int i = 0; i < repeatNum - 1; i++){
            System.out.println(sb.delete(0, intervalNum));
        }
    }
}
