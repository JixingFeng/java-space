package space.duplica.basic;

/***********************************************************************************
 * 基本运算
 *
 * @version 1.0
 * @auther yakirChen iamyakirchen@outlook.com  ~^o^~
 * @date 2016/4/17 14:50 .
 * @since 1.0
 ***********************************************************************************/
public class BasicOperator {

    /**
     * 测试基本运算  运算
     * <p>
     * addition     加法运算
     * subtract     减法运算
     * multiply     乘法运算
     * divide       除法运算
     *
     * @param num01 double
     * @param num02 double
     * @version 1.0
     * @auther yakirChen iamyakirchen@outlook.com  ~^o^~
     * @since 1.0
     */
    public void basicFourOperator(double num01, double num02) {

        /* 基本四则运算 */
        double addition = num01 + num02;
        double subtract = num01 - num02;
        double multiply = num01 * num02;
        double divide = num02 > 0 ? num01 / num02 : 0;

        System.out.printf("加  :%.1f + %.1f = %.3f \n", num01, num02, addition);
        System.out.printf("减  :%.1f − %.1f = %.3f \n", num01, num02, subtract);
        System.out.printf("乘  :%.1f × %.1f = %.3f \n", num01, num02, multiply);
        System.out.printf("除  :%.1f ÷ %.1f = %.3f \n", num01, num02, divide);
    }

    /**
     * 基本运算 其余运算符
     * <p>
     * a++
     * ++a
     * a--
     * --a
     *
     * @param num01 int
     * @param num02 int
     * @version 1.0
     * @auther yakirChen iamyakirchen@outlook.com  ~^o^~
     * @since 1.0
     */
    public void basicAutoOperator(int num01, int num02) {

        System.out.println("number01\t" + num01 + "\tnumber02\t" + num02 + "\n-----------------------");

        int numPlus = num01++;
        System.out.printf("number01++  number01 %d , numPlus %d\n", num01, numPlus);

        int numPlus01 = ++numPlus;
        System.out.printf("++number01  number01 %d , numPlus01 %d\n", num01, numPlus01);

        int numSub = num01--;
        System.out.printf("number01--  number01 %d , numSub %d\n", num01, numSub);

        int numSub01 = ++numSub;
        System.out.printf("--number01  number01 %d , numSub01 %d\n", num01, numSub01);
    }

    /**
     * 正数 负数 相互转化
     * <p>
     * 负数: 用2的补码表示
     * 第一步，每一个二进制位都取相反值，0变成1，1变成0。比如，00001000的相反值就是11110111
     * 第二步，将上一步得到的值加1。11110111就变成11111000
     * <p>
     * 正数 -> 负数 : 正数的二进制表示取反加1
     * 负数 -> 正数 : 负数的二进制表示取反减1
     *
     * @version 1.0
     * @auther yakirChen iamyakirchen@outlook.com  ~^o^~
     * @since 1.0
     */
    public void positiveNegativeConvert(int num) {

        /* 取反 加一 , num 的 负值 */
        int numNegative = ~num + 0b1;
        System.out.println(numNegative);

        /* 负值转换成正值 取反 加一 */
        int numPositive = ~numNegative + 0b1;
        System.out.println(numPositive);
    }

    /**
     * 位运算
     * <p>
     * ~a               取反
     * a & b            按位与
     * a | b            按位或
     * a ^ b            按位异或
     * x >>  n          右移
     * x >>> n          右移填零
     * x <<  n          左移
     *
     * @param bit01 int
     * @param bit02 int
     * @version 1.0
     * @auther yakirChen iamyakirchen@outlook.com  ~^o^~
     * @since 1.0
     */
    public void basicBitOperator(int bit01, int bit02) {

        int bitNOT = ~bit01;
        System.out.printf("~%d = %d\n", bit01, bitNOT);

        int bitAnd = bit01 & bit02;
        System.out.printf("%d & %d = %d\n", bit01, bit02, bitAnd);

        int bitOr = bit01 | bit02;
        System.out.printf("%d | %d = %d\n", bit01, bit02, bitOr);

        int bitNot = bit01 ^ bit02;
        System.out.printf("%d ^ %d = %d\n", bit01, bit02, bitNot);


        /*
         *  左移 乘 2 右边低位用0填充
         *
         *  int 超出31位 就会丢失
         *  long 超出63位 就会丢失
         *
         *  左移 byte 和 short 时 计算数值类型会提升为 int 会得出意外的结果
         */
        byte byte64 = 64;
        int byteToInt = byte64 << 2;
        System.out.println("byteToInt: " + byteToInt);

        int shiftLeft = bit01 << bit02;
        System.out.printf("%d  <<  %d = %d\n", bit01, bit02, shiftLeft);

        /* 右移 */
        int shiftRight = bit01 >> bit02;
        System.out.printf("%d  >>  %d = %d\n", bit01, bit02, shiftRight);

        /* 右移零填充 */
        int shiftRightDup = bit01 >>> bit02;
        System.out.printf("%d  >>> %d = %d\n", bit01, bit02, shiftRightDup);
    }

    /**
     * 逻辑运算
     * <p>
     * a && b
     * a || b
     * a ^ b
     *
     * @param logic01 boolean
     * @param logic02 boolean
     * @version 1.0
     * @auther yakirChen iamyakirchen@outlook.com  ~^o^~
     * @since 1.0
     */
    public void basicLogicOperator(boolean logic01, boolean logic02) {

        boolean logicAnd = logic01 && logic02;
        System.out.printf("%b & %b = %b\n", logic01, logic02, logicAnd);

        boolean logicOr = logic01 || logic02;
        System.out.printf("%b | %b = %b\n", logic01, logic02, logicOr);

        boolean logicNot = logic01 ^ logic02;
        System.out.printf("%b ^ %b = %b\n", logic01, logic02, logicNot);
    }
}
