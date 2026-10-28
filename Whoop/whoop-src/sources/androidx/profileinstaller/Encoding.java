package androidx.profileinstaller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;

/* JADX INFO: loaded from: classes5.dex */
class Encoding {
    static final int SIZEOF_BYTE = 8;
    static final int UINT_16_SIZE = 2;
    static final int UINT_32_SIZE = 4;
    static final int UINT_8_SIZE = 1;

    private Encoding() {
    }

    public static int bitsToBytes(int i13) {
        return ((i13 + 7) & (-8)) / 8;
    }

    public static byte[] compress(byte[] bArr) throws IOException {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th3) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            deflater.end();
            throw th5;
        }
    }

    public static RuntimeException error(String str) {
        return new IllegalStateException(str);
    }

    public static byte[] read(InputStream inputStream, int i13) throws IOException {
        byte[] bArr = new byte[i13];
        int i14 = 0;
        while (i14 < i13) {
            int i15 = inputStream.read(bArr, i14, i13 - i14);
            if (i15 < 0) {
                throw error(AbstractC2875y.m8295h(i13, "Not enough bytes to read: "));
            }
            i14 += i15;
        }
        return bArr;
    }

    public static byte[] readCompressed(InputStream inputStream, int i13, int i14) throws IOException {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i14];
            byte[] bArr2 = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS];
            int i15 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i15 < i13) {
                int i16 = inputStream.read(bArr2);
                if (i16 < 0) {
                    throw error("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i13 + " bytes");
                }
                inflater.setInput(bArr2, 0, i16);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i14 - iInflate);
                    i15 += i16;
                } catch (DataFormatException e5) {
                    throw error(e5.getMessage());
                }
            }
            if (i15 == i13) {
                if (!inflater.finished()) {
                    throw error("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw error("Didn't read enough bytes during decompression. expected=" + i13 + " actual=" + i15);
        } catch (Throwable th3) {
            inflater.end();
            throw th3;
        }
    }

    public static String readString(InputStream inputStream, int i13) throws IOException {
        return new String(read(inputStream, i13), StandardCharsets.UTF_8);
    }

    public static long readUInt(InputStream inputStream, int i13) throws IOException {
        byte[] bArr = read(inputStream, i13);
        long j7 = 0;
        for (int i14 = 0; i14 < i13; i14++) {
            j7 += ((long) (bArr[i14] & 255)) << (i14 * 8);
        }
        return j7;
    }

    public static int readUInt16(InputStream inputStream) throws IOException {
        return (int) readUInt(inputStream, 2);
    }

    public static long readUInt32(InputStream inputStream) throws IOException {
        return readUInt(inputStream, 4);
    }

    public static int readUInt8(InputStream inputStream) throws IOException {
        return (int) readUInt(inputStream, 1);
    }

    public static int utf8Length(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    public static void writeAll(InputStream inputStream, OutputStream outputStream, FileLock fileLock) throws IOException {
        if (fileLock == null || !fileLock.isValid()) {
            throw new IOException("Unable to acquire a lock on the underlying file channel.");
        }
        byte[] bArr = new byte[512];
        while (true) {
            int i13 = inputStream.read(bArr);
            if (i13 <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i13);
            }
        }
    }

    public static void writeCompressed(OutputStream outputStream, byte[] bArr) throws IOException {
        writeUInt32(outputStream, bArr.length);
        byte[] bArrCompress = compress(bArr);
        writeUInt32(outputStream, bArrCompress.length);
        outputStream.write(bArrCompress);
    }

    public static void writeString(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static void writeUInt(OutputStream outputStream, long j7, int i13) throws IOException {
        byte[] bArr = new byte[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            bArr[i14] = (byte) ((j7 >> (i14 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static void writeUInt16(OutputStream outputStream, int i13) throws IOException {
        writeUInt(outputStream, i13, 2);
    }

    public static void writeUInt32(OutputStream outputStream, long j7) throws IOException {
        writeUInt(outputStream, j7, 4);
    }

    public static void writeUInt8(OutputStream outputStream, int i13) throws IOException {
        writeUInt(outputStream, i13, 1);
    }
}
