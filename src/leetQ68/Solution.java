package leetQ68;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangzhongwen on 2019/1/24
 */
public class Solution {
    public static void main(String[] args) {
        List<String> ans = fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16);
        for (String i : ans) {
            System.out.println(i);
        }
    }

    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> lines = new ArrayList<>();
        StringBuilder lineBuilder = new StringBuilder(maxWidth);
        int spaceLeft = maxWidth - words[0].length(), wordFrom = 0;
        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            int len = word.length();
            if (len + i - wordFrom <= spaceLeft) {
                spaceLeft -= len;
            } else {
                String line = makeLine(words, wordFrom, i - 1, spaceLeft, lineBuilder);
                lines.add(line);
                spaceLeft = maxWidth - len;
                wordFrom = i;
            }
        }

        lineBuilder.setLength(0);
        lineBuilder.append(words[wordFrom]);
        for (int i = wordFrom + 1; i < words.length; i++) {
            lineBuilder.append(' ');
            spaceLeft--;
            lineBuilder.append(words[i]);
        }
        while (spaceLeft-- > 0) lineBuilder.append(' ');
        lines.add(lineBuilder.toString());

        return lines;
    }

    private static String makeLine(
            String[] words, int wordFrom, int wordTo, int spaceLeft, StringBuilder lineBuilder) {
        lineBuilder.setLength(0);
        lineBuilder.append(words[wordFrom]);
        if (wordTo == wordFrom) {
            while (spaceLeft-- > 0) {
                lineBuilder.append(' ');
            }
            return lineBuilder.toString();
        }
        // 填充空白数
        int spaceSlotCnt = wordTo - wordFrom;
        int minCnt = spaceLeft / spaceSlotCnt, split = spaceLeft % spaceSlotCnt;
        for (int i = 0; i < spaceSlotCnt; i++) {
            int spaceCnt = i < split ? minCnt + 1 : minCnt;
            for (int j = 0; j < spaceCnt; j++) {
                lineBuilder.append(' ');
            }
            lineBuilder.append(words[wordFrom + i + 1]);
        }
        return lineBuilder.toString();
    }
}
