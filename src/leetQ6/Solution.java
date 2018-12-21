package leetQ6;

/**
 * 字符串反转，
 * z 字形反转
 *
 * @param numRows ： z 字形的深度
 */
public class Solution {
    public static void main(String[] args) {
        String testString = "zhangzhongwen";//13
        System.out.println(convert(testString, 3));
    }

    public static String convert(String s, int numRows) {
        StringBuilder answer = new StringBuilder();
        if (s == null || numRows == 0 || numRows == 1 || s.length() <= numRows) {
            answer.append(s);
        } else {
            for (int i = 1; i <= numRows; i++) {
                if (i == 1 || i == numRows) {
                    for (int j = i - 1; j < s.length(); j += (numRows - 1) * 2) {
                        answer.append(s.charAt(j));
                    }
                } else {
                    int flag = 0;
                    for (int j = i - 1; j < s.length(); flag++) {
                        answer.append(s.charAt(j));
                        if (flag % 2 == 0) {
                            j += 2 * (numRows - i);
                        } else {
                            j += 2 * (i - 1);
                        }
                    }
                }
            }
        }

        return answer.toString();
    }

    private static int factorial(int numRows) {
      /*  if (numRows == 0 || numRows == 1) {
            return 1;
        }*/
        return numRows << 1;//乘以 2
    }
}

