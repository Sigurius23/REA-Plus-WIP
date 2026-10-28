package tl;

import ed3.C13117a;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;
import sh.C32487m;

/* JADX INFO: renamed from: tl.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC33902a {
    static {
        new AtomicReference();
    }

    /* JADX INFO: renamed from: a */
    public static MappedByteBuffer m107251a(File file) throws Throwable {
        Throwable th3;
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                    try {
                        channel.close();
                    } catch (IOException unused) {
                    }
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused2) {
                    }
                    return mappedByteBufferLoad;
                } catch (Throwable th4) {
                    th3 = th4;
                    fileChannel = channel;
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (randomAccessFile == null) {
                        throw th3;
                    }
                    try {
                        randomAccessFile.close();
                        throw th3;
                    } catch (IOException unused4) {
                        throw th3;
                    }
                }
            } catch (Throwable th5) {
                th3 = th5;
            }
        } catch (Throwable th6) {
            th3 = th6;
            randomAccessFile = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m107252b(ByteBuffer byteBuffer) {
        C13117a c13117a;
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            c13117a = null;
        } else {
            byte[] bArrArray = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset();
            int iLimit = byteBuffer.limit();
            c13117a = new C13117a();
            c13117a.f45381a = bArrArray;
            c13117a.f45382b = iArrayOffset;
            c13117a.f45383c = iLimit;
        }
        if (c13117a != null && c13117a.f45382b == 0 && c13117a.f45383c == c13117a.f45381a.length) {
            return byteBuffer.array();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        byteBufferAsReadOnlyBuffer.position(0);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: c */
    public static void m107253c(ByteBuffer byteBuffer, File file) {
        RandomAccessFile randomAccessFile;
        byteBuffer.position(0);
        FileChannel channel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                channel = randomAccessFile.getChannel();
                channel.write(byteBuffer);
                channel.force(false);
                channel.close();
                randomAccessFile.close();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th3) {
                th = th3;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            randomAccessFile = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static C32487m m107254d(ByteBuffer byteBuffer) {
        return new C32487m(byteBuffer);
    }
}
