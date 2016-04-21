package test.space.duplicate.basic;

import org.junit.Test;
import space.duplica.basic.BasicOperator;

/***********************************************************************************
 * - 测试基本运算符
 *
 * @auther yakirChen iamyakirchen@outlook.com  ~^o^~
 * @date On 2016/4/17 15:02 .
 * @since 1.0
 ***********************************************************************************/
public class Test_BasicOperator {

    private BasicOperator basicOperator = new BasicOperator();

    /**
     * 四则运算
     *
     * @auther yakirChen iamyakirchen@outlook.com  ~^o^~
     * @see BasicOperator#basicFourOperator(double, double)
     */
    @Test
    public void testBasicFourOperator() {
        basicOperator.basicFourOperator(9, 80);
    }

    /**
     * ++ --
     *
     * @auther yakirChen iamyakirchen@outlook.com  ~^o^~
     * @see BasicOperator#basicAutoOperator(int, int)
     */
    @Test
    public void testBasicOthers() {
        basicOperator.basicAutoOperator(8, 90);
    }

    /**
     * 正数 负数 相互转化
     *
     * @auther yakirChen iamyakirchen@outlook.com  ~^o^~
     */
    @Test
    public void testPositiveNegativeConvert() {
        basicOperator.positiveNegativeConvert(9);
    }

    /**
     * 位运算
     *
     * @auther yakirChen iamyakirchen@outlook.com  ~^o^~
     * @see BasicOperator#basicBitOperator(int, int)
     */
    @Test
    public void testBasicBitOperator() {
        basicOperator.basicBitOperator(1, 1);
        System.out.println("-------------------------");
        basicOperator.basicBitOperator(-1, 1);
    }

    /**
     * 逻辑运算
     *
     * @auther yakirChen iamyakirchen@outlook.com  ~^o^~
     * @see BasicOperator#basicLogicOperator(boolean, boolean)
     */
    @Test
    public void testBasicLogicOp() {
        basicOperator.basicLogicOperator(Boolean.TRUE, Boolean.TRUE);
        System.out.println();
        basicOperator.basicLogicOperator(Boolean.FALSE, Boolean.FALSE);
        System.out.println();
        basicOperator.basicLogicOperator(Boolean.TRUE, Boolean.FALSE);
    }


}
