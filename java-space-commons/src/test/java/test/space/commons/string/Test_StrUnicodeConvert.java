package test.space.commons.string;

import org.junit.Test;
import space.commons.string.StringUnicodeConvert;

/***********************************************************************************
 * 测试字符串和Unicode相互转化
 *
 * @version 1.0
 * @auther yakirChen iamyakirchen@outlook.com  ~^o^~
 * @date 2016/04/21 00:30 .
 * @since 1.0
 ***********************************************************************************/
public class Test_StrUnicodeConvert {

    /**
     * 测试 str2Unicode
     *
     * @version 1.0
     * @auther yakirChen iamyakirchen@outlook.com  ~^o^~
     * @see space.commons.string.StringUnicodeConvert#str2UnicodeByToArray(String)   int[]
     * @since 1.0
     */
    @Test
    public void testStr2UnicodeByToArray() {
        int[] result = new StringUnicodeConvert().str2UnicodeByToArray("iamyakirChen 大家好");
        for (int single : result) {
            System.out.println(single);
        }
    }

    /**
     * 测试 str2UnicodeByGetChars
     *
     * @version 1.0
     * @auther yakirChen iamyakirchen@outlook.com  ~^o^~
     * @see space.commons.string.StringUnicodeConvert#str2UnicodeByGetChars(String) char[]
     * @since 1.0
     */
    @Test
    public void testStr2UnicodeByGetChars() {
        char[] result = new StringUnicodeConvert().str2UnicodeByGetChars("iamyakirChen 大家好");
        for (int single : result) {
            System.out.println(single);
        }
    }
}
