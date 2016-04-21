package space.duplica.basic;

import static java.lang.System.out;

/***********************************************************************************
 * 基本数据类型 变量 数组
 *
 * @version 1.0
 * @auther yakirChen iamyakirchen@outlook.com  ~^o^~
 * @date 2016/4/16 00:39 .
 * @see java.lang.Byte
 * @see java.lang.Short
 * @see java.lang.Integer
 * @see java.lang.Long
 * @see java.lang.Float
 * @see java.lang.Double
 * @see java.lang.Character
 * @see java.lang.Boolean
 * @since 1.0
 ***********************************************************************************/
public class BasicDataType {

    /**
     * 基本类型概览 类型的最大值 最大值+1 最小值
     * <p>
     * `好多重复的代码 优化一下`
     *
     * @auther yakirChen iamyakirchen@outlook.com  ~^o^~
     * @version 1.0
     * @since 1.0
     */
    public void basicTypeInfo() {

        out.println("Byte 最大值:" + Byte.MAX_VALUE);
        out.println("Byte 最大值+1:" + Byte.MAX_VALUE + 1);
        out.println("Byte 最小值:" + Byte.MIN_VALUE);
        out.println("Byte 容量:" + Byte.SIZE + " " + Byte.SIZE / 2 + " 字节  \n");

        out.println("Short 最大值:" + Short.MAX_VALUE);
        out.println("Short 最大值+1:" + Short.MAX_VALUE + 1);
        out.println("Short 最小值:" + Short.MIN_VALUE);
        out.println("Short 容量:" + Short.SIZE + " " + Short.SIZE / 2 + "字节 \n");

        out.println("Integer 最大值:" + Integer.MAX_VALUE);
        out.println("Integer 最大值+1:" + Integer.MAX_VALUE + 1);
        out.println("Integer 最小值:" + Integer.MIN_VALUE);
        out.println("Short 容量:" + Integer.SIZE + " " + Integer.SIZE / 2 + "字节 \n");

        out.println("Long 最大值:" + Long.MAX_VALUE);
        out.println("Long 最大值+1:" + Long.MAX_VALUE + 1);
        out.println("Long 最小值:" + Long.MIN_VALUE);
        out.println("Short 容量:" + Long.SIZE + " " + Long.SIZE / 2 + "字节 \n");

        out.println("Float 最大值:" + Float.MAX_VALUE);
        out.println("Float 最大值+1:" + Float.MAX_VALUE + 1);
        out.println("Float 最小值:" + Float.MIN_VALUE);
        out.println("Short 容量:" + Float.SIZE + " " + Float.SIZE / 2 + "字节 \n");

        out.println("Double 最大值:" + Double.MAX_VALUE);
        out.println("Double 最大值+1:" + Double.MAX_VALUE + 1);
        out.println("Double 最小值:" + Double.MIN_VALUE);
        out.println("Short 容量:" + Double.SIZE + " " + Double.SIZE / 2 + "字节 \n");

        out.println("Character 最大值:" + Character.MAX_VALUE);
        out.println("Character 最大值+1:" + Character.MAX_VALUE + 1);
        out.println("Character 最小值:" + Character.MIN_VALUE);
        out.println("Short 容量:" + Character.SIZE + " " + Character.SIZE / 2 + "字节 \n");

        out.println("Boolean true & false:" + Boolean.TRUE + " " + Boolean.FALSE);
    }
}
