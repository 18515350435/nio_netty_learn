package com.atguigu.nio;

import java.nio.ByteBuffer;

public class NIOByteBufferPutGet {
    public static void main(String[] args) {

        //����һ��Buffer
        ByteBuffer buffer = ByteBuffer.allocateDirect(64);

        System.out.println(buffer.getInt());
        System.out.println(buffer.getInt());
        System.out.println(buffer.getInt());
        System.out.println(buffer.getInt());
        //���ͻ���ʽ��������
        buffer.putInt(100);
        buffer.putInt(101);
        buffer.putInt(102);
        buffer.putInt(103);

        //ȡ��
        buffer.flip();
        buffer.clear();
//        buffer.putInt(200);
//        buffer.putInt(201);
//        buffer.putInt(202);
//        buffer.putInt(203);

//        buffer.flip();
//        buffer.mark();
        System.out.println(buffer.getInt());
        System.out.println(buffer.getInt());
        System.out.println(buffer.getInt());
        System.out.println(buffer.getInt());
        System.out.println(buffer.getInt());
        System.out.println(buffer.getInt());
        System.out.println(buffer.getInt());
        System.out.println(buffer.getInt());
        System.out.println(buffer.getInt());
        System.out.println(buffer.getInt());
        System.out.println(buffer.getInt());
        System.out.println(buffer.getInt());
//
//        buffer.putInt(104);
//        buffer.putInt(105);
//        buffer.putInt(105);
//        buffer.putInt(105);
//        buffer.putInt(105);
//        buffer.putInt(105);
//        buffer.putInt(105);
//        buffer.flip();
//        System.out.println();
//        System.out.println(buffer.getInt());
//        System.out.println(buffer.getInt());
//        System.out.println(buffer.getInt());
//        System.out.println(buffer.getInt());
//        System.out.println(buffer.getInt());
//        System.out.println(buffer.getInt());
//        System.out.println(buffer.getInt());







    }
}
