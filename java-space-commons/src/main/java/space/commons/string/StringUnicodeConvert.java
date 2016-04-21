package space.commons.string;

/***********************************************************************************
 * Unicode 字符串相互转化
 *
 * @version 1.0
 * @auther yakirChen iamyakirchen@outlook.com  ~^o^~
 * @date 2016/04/21 00:26 .
 * @since 1.0
 ***********************************************************************************/
public class StringUnicodeConvert {

    /**
     * 字符串 -> Unicode
     *
     * @param str 输入字符串
     * @return
     * @auther yakirChen iamyakirchen@outlook.com  ~^o^~
     * <p>
     * chars 返回 IntStream
     * @version 1.0
     * @see java.lang.String#chars()                IntStream
     * @see java.util.stream.IntStream#toArray()    int[]
     * @since 1.0
     */
    public int[] str2UnicodeByToArray(String str) {
        int[] result = str.chars().toArray();
        return result;
    }

    /**
     * 字符串 -> Unicode
     *
     * @param str 输入字符串
     * @return
     * @version 1.0
     * @auther yakirChen iamyakirchen@outlook.com  ~^o^~
     * @since 1.0
     */
    public char[] str2UnicodeByGetChars(String str) {
        /* 字符串长度 */
        int len = str.length();
        /* 结果 */
        char[] result = new char[len];
        /* 开始截取字符串位置 */
        int start = 0;
        /* 偏移量 */
        int Offset = 0;
        /* 获取字符串字符数组 */
        str.getChars(start, str.length(), result, Offset);
        return result;
    }

    /**
     * Unicode -> 字符串
     *
     * @param unicodes
     * @return
     * @version 1.0
     * @auther yakirChen iamyakirchen@outlook.com  ~^o^~
     * @since 1.0
     */
    public String unicode2Str(int[] unicodes) {

        // TODO

        return "";
    }
}
