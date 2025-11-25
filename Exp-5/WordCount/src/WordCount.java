import java.io.*;

public class WordCount {
    public static void main() {
        String filePath = "article.txt";
        String word="hello";
        int count=0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String input = null;
            while ((input = br.readLine()) != null) {
                input=input.toLowerCase();
                int index=input.indexOf(word);
                while(index!=-1){
                    count++;
                    index=input.indexOf(word,index+1);
                }
            }
            bw.write("单词" + word + "在文章" + filePath + "中出现的次数为：" + count);

            br.close();
            bw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
