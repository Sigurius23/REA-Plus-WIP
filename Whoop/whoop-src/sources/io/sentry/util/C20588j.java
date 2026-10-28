package io.sentry.util;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: io.sentry.util.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C20588j implements Serializable {

    /* JADX INFO: renamed from: y */
    public static final AtomicLong f77092y = new AtomicLong(System.nanoTime());

    /* JADX INFO: renamed from: w */
    public long f77093w;

    /* JADX INFO: renamed from: x */
    public final long f77094x;

    public C20588j() {
        long jM56719a = m56719a();
        long jM56719a2 = (m56719a() << 1) | 1;
        this.f77094x = jM56719a2;
        this.f77093w = jM56719a2 + jM56719a;
    }

    /* JADX INFO: renamed from: a */
    public static long m56719a() {
        AtomicLong atomicLong;
        long j7;
        long j13;
        do {
            atomicLong = f77092y;
            j7 = atomicLong.get();
            long j14 = (j7 >> 12) ^ j7;
            long j15 = j14 ^ (j14 << 25);
            j13 = (j15 ^ (j15 >> 27)) * 2685821657736338717L;
        } while (!atomicLong.compareAndSet(j7, j13));
        return j13;
    }

    /* JADX INFO: renamed from: b */
    public final void m56720b(byte[] bArr) {
        for (int i13 = 0; i13 < bArr.length; i13++) {
            long j7 = (this.f77093w * 6364136223846793005L) + this.f77094x;
            this.f77093w = j7;
            bArr[i13] = (byte) ((((j7 >>> 22) ^ j7) >>> ((int) ((j7 >>> 61) + 22))) >>> 24);
        }
    }

    /* JADX INFO: renamed from: c */
    public final double m56721c() {
        long j7 = this.f77093w * 6364136223846793005L;
        long j13 = this.f77094x;
        long j14 = j7 + j13;
        long j15 = (((j14 >>> 22) ^ j14) >>> ((int) ((j14 >>> 61) + 22))) & 4294967295L;
        long j16 = (j14 * 6364136223846793005L) + j13;
        this.f77093w = j16;
        return (((j15 >>> 6) << 27) + (((((j16 >>> 22) ^ j16) >>> ((int) ((j16 >>> 61) + 22))) & 4294967295L) >>> 5)) / 9.007199254740992E15d;
    }
}
