package p418q9;

import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: q9.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC30067b {

    /* JADX INFO: renamed from: a */
    public static final Object f122681a = new Object();

    /* JADX INFO: renamed from: b */
    public static final Object f122682b = new Object();

    /* JADX INFO: renamed from: c */
    public static boolean f122683c;

    /* JADX INFO: renamed from: d */
    public static long f122684d;

    /* JADX INFO: renamed from: a */
    public static long m92141a() {
        byte[] bArr;
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            Object obj = f122682b;
            synchronized (obj) {
            }
            datagramSocket.setSoTimeout(1000);
            synchronized (obj) {
            }
            InetAddress[] allByName = InetAddress.getAllByName("time.android.com");
            int length = allByName.length;
            byte b = 0;
            SocketTimeoutException socketTimeoutException = null;
            int i13 = 0;
            int i14 = 0;
            while (i13 < length) {
                byte[] bArr2 = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr2, 48, allByName[i13], 123);
                bArr2[b] = 27;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jCurrentTimeMillis == 0) {
                    Arrays.fill(bArr2, 40, 48, b);
                    bArr = bArr2;
                } else {
                    long j7 = jCurrentTimeMillis / 1000;
                    long j13 = jCurrentTimeMillis - (j7 * 1000);
                    long j14 = j7 + 2208988800L;
                    bArr = bArr2;
                    bArr[40] = (byte) (j14 >> 24);
                    bArr[41] = (byte) (j14 >> 16);
                    bArr[42] = (byte) (j14 >> 8);
                    bArr[43] = (byte) j14;
                    long j15 = (j13 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j15 >> 24);
                    bArr[45] = (byte) (j15 >> 16);
                    bArr[46] = (byte) (j15 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                }
                datagramSocket.send(datagramPacket);
                byte[] bArr3 = bArr;
                try {
                    datagramSocket.receive(new DatagramPacket(bArr3, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j16 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
                    byte b6 = bArr3[b];
                    int i15 = bArr3[1] & 255;
                    long jM92144d = m92144d(24, bArr3);
                    long jM92144d2 = m92144d(32, bArr3);
                    long jM92144d3 = m92144d(40, bArr3);
                    m92142b((byte) ((b6 >> 6) & 3), (byte) (b6 & 7), i15, jM92144d3);
                    long j17 = (j16 + (((jM92144d3 - j16) + (jM92144d2 - jM92144d)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j17;
                } catch (SocketTimeoutException e5) {
                    if (socketTimeoutException == 0) {
                        socketTimeoutException = e5;
                    } else {
                        SocketTimeoutException socketTimeoutException2 = socketTimeoutException;
                        socketTimeoutException2.addSuppressed(e5);
                        socketTimeoutException = socketTimeoutException2;
                    }
                    int i16 = i14 + 1;
                    if (i14 >= 10) {
                        socketTimeoutException.getClass();
                        throw socketTimeoutException;
                    }
                    i13++;
                    i14 = i16;
                    b = b;
                }
            }
            socketTimeoutException.getClass();
            throw socketTimeoutException;
        } catch (Throwable th3) {
            try {
                datagramSocket.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m92142b(byte b, byte b6, int i13, long j7) throws IOException {
        if (b == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b6 != 4 && b6 != 5) {
            throw new IOException(AbstractC2875y.m8295h(b6, "SNTP: Untrusted mode: "));
        }
        if (i13 == 0 || i13 > 15) {
            throw new IOException(AbstractC2875y.m8295h(i13, "SNTP: Untrusted stratum: "));
        }
        if (j7 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    /* JADX INFO: renamed from: c */
    public static long m92143c(int i13, byte[] bArr) {
        int i14 = bArr[i13];
        int i15 = bArr[i13 + 1];
        int i16 = bArr[i13 + 2];
        int i17 = bArr[i13 + 3];
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        if ((i15 & 128) == 128) {
            i15 = (i15 & 127) + 128;
        }
        if ((i16 & 128) == 128) {
            i16 = (i16 & 127) + 128;
        }
        if ((i17 & 128) == 128) {
            i17 = (i17 & 127) + 128;
        }
        return (((long) i14) << 24) + (((long) i15) << 16) + (((long) i16) << 8) + ((long) i17);
    }

    /* JADX INFO: renamed from: d */
    public static long m92144d(int i13, byte[] bArr) {
        long jM92143c = m92143c(i13, bArr);
        long jM92143c2 = m92143c(i13 + 4, bArr);
        if (jM92143c == 0 && jM92143c2 == 0) {
            return 0L;
        }
        return ((jM92143c2 * 1000) / 4294967296L) + ((jM92143c - 2208988800L) * 1000);
    }
}
