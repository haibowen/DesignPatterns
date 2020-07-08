package com.example.decoratoriodemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {


    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    //实现两个read 方法，一个针对字节，一个针对字节数组
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase(c));

    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = offset; i < offset + result; i++) {
            b[i] = (byte) Character.toLowerCase(b[i]);
        }
        return result;
    }
}
