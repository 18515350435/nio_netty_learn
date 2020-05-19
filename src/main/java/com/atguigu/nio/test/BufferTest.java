package com.atguigu.nio.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

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
    public static void main(String[] args) throws Exception {
        File file = new File("D://data.txt");
        long len = file.length();
        byte[] ds = new byte[(int) len];
        MappedByteBuffer mappedByteBuffer = new RandomAccessFile(file, "r")
                .getChannel()
                .map(FileChannel.MapMode.READ_ONLY, 0, len);

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
