package androidx.room;

import java.util.concurrent.locks.ReentrantLock;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.room.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1787g0 {

    /* JADX INFO: renamed from: b */
    public final long[] f7065b;

    /* JADX INFO: renamed from: c */
    public final boolean[] f7066c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f7067d;

    /* JADX INFO: renamed from: f */
    public volatile boolean f7069f;

    /* JADX INFO: renamed from: a */
    public final ReentrantLock f7064a = new ReentrantLock();

    /* JADX INFO: renamed from: e */
    public final ReentrantLock f7068e = new ReentrantLock();

    public C1787g0(int i13) {
        this.f7065b = new long[i13];
        this.f7066c = new boolean[i13];
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5417a(int[] tableIds) {
        AbstractC22676k.m65750j(tableIds, "tableIds");
        ReentrantLock reentrantLock = this.f7064a;
        reentrantLock.lock();
        try {
            boolean z4 = false;
            for (int i13 : tableIds) {
                long[] jArr = this.f7065b;
                long j7 = jArr[i13];
                jArr[i13] = 1 + j7;
                if (j7 == 0) {
                    this.f7067d = true;
                    z4 = true;
                }
            }
            return z4 || this.f7067d || this.f7069f;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5418b(int[] tableIds) {
        AbstractC22676k.m65750j(tableIds, "tableIds");
        ReentrantLock reentrantLock = this.f7064a;
        reentrantLock.lock();
        try {
            boolean z4 = false;
            for (int i13 : tableIds) {
                long[] jArr = this.f7065b;
                long j7 = jArr[i13];
                jArr[i13] = j7 - 1;
                if (j7 == 1) {
                    this.f7067d = true;
                    z4 = true;
                }
            }
            return z4 || this.f7067d || this.f7069f;
        } finally {
            reentrantLock.unlock();
        }
    }
}
