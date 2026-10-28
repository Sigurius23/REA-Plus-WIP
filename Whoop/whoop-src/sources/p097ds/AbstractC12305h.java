package p097ds;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: ds.h */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC12305h {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m34235a(Unsafe unsafe, AbstractC12311n abstractC12311n, long j7, C12310m c12310m, C12310m c12310m2) {
        while (!unsafe.compareAndSwapObject(abstractC12311n, j7, c12310m, c12310m2)) {
            if (unsafe.getObject(abstractC12311n, j7) != c12310m) {
                return false;
            }
        }
        return true;
    }
}
