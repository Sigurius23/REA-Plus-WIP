package ch3;

import java.util.concurrent.atomic.AtomicLong;
import p088dc.AbstractC11895b;
import xg3.InterfaceC38281h;

/* JADX INFO: renamed from: ch3.d */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC4677d {

    /* JADX INFO: renamed from: a */
    public static final C4672b f19135a = new C4672b(0);

    /* JADX INFO: renamed from: b */
    public static final C4672b f19136b = new C4672b(1);

    /* JADX INFO: renamed from: c */
    public static final C4713v f19137c = new C4713v(0);

    /* JADX INFO: renamed from: d */
    public static final C4713v f19138d = new C4713v(1);

    /* JADX INFO: renamed from: a */
    public static boolean m14744a(InterfaceC38281h interfaceC38281h, Object obj) {
        if (obj == f19135a) {
            interfaceC38281h.onCompleted();
            return true;
        }
        if (obj == f19136b) {
            interfaceC38281h.onNext(null);
            return false;
        }
        if (obj == null) {
            throw new IllegalArgumentException("The lite notification can not be null");
        }
        if (obj.getClass() == C4675c.class) {
            interfaceC38281h.onError(((C4675c) obj).f19132w);
            return true;
        }
        interfaceC38281h.onNext(obj);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static long m14745b(AtomicLong atomicLong, long j7) {
        long j13;
        long j14;
        do {
            j13 = atomicLong.get();
            j14 = j13 + j7;
            if (j14 < 0) {
                j14 = Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j13, j14));
        return j13;
    }

    /* JADX INFO: renamed from: c */
    public static Object m14746c(Object obj) {
        if (obj == f19136b) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public static long m14747d(AtomicLong atomicLong, long j7) {
        long j13;
        long j14;
        do {
            j13 = atomicLong.get();
            if (j13 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j14 = j13 - j7;
            if (j14 < 0) {
                throw new IllegalStateException(AbstractC11895b.m31994m(j14, "More produced than requested: "));
            }
        } while (!atomicLong.compareAndSet(j13, j14));
        return j14;
    }
}
