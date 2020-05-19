package com.atguigu.nio.test;

import java.nio.ByteBuffer;

/**
 * @Author Badribbit
 * @create 2019/4/8 11:22
 */
public class BufferTest {
    /**
     * byteBuffer���Դ治ͬ�����ͣ�����ȡ��ʱ��ð�˳��ȡ���ֽ�����Զ�ʶ��
     * �����ѭ��ȡ��ͬ���ͣ���ȡ��ֵ��
     * ��intBuffer��ֻ�ܴ�int���͡������ײ��������byteBuffer
     * �ܽᣬbyteBuffer��ţ��
     * @param args
     */
    public static void main(String[] args) {
        ByteBuffer byteBuffer=ByteBuffer.allocate(64);
        byteBuffer.putInt(123);
        byteBuffer.putLong(123213123L);
        byteBuffer.putChar('��');
        byteBuffer.putShort((short)2);

        byteBuffer.flip();
        System.out.println(byteBuffer.getInt());
        System.out.println(byteBuffer.getLong());
        System.out.println(byteBuffer.getChar());
        System.out.println(byteBuffer.getShort());
//        byteBuffer.flip();
//        System.out.println(byteBuffer.getInt());
//        System.out.println(byteBuffer.getLong());
//        System.out.println(byteBuffer.getChar());
//        System.out.println(byteBuffer.getShort());
//        byteBuffer.flip();
//        while (byteBuffer.hasRemaining()){
//            System.out.println(byteBuffer.get());
//        }

    }
}
