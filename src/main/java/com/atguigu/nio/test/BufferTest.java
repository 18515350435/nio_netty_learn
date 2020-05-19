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
     * byteBuffer可以存不同的类型，但是取的时候得按顺序取（字节码会自动识别）
     * 但如果循环取不同类型，会取错值。
     * 像intBuffer，只能存int类型。但他底层最后还是用byteBuffer
     * 总结，byteBuffer真牛逼
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
        byteBuffer.putChar('我');
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
