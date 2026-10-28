package p097ds;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: ds.i */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC12306i {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m34236a(Unsafe unsafe, AbstractC12311n abstractC12311n, long j7, C12300c c12300c, C12300c c12300c2) {
        while (!unsafe.compareAndSwapObject(abstractC12311n, j7, c12300c, c12300c2)) {
            if (unsafe.getObject(abstractC12311n, j7) != c12300c) {
                return false;
            }
        }
        return true;
    }
}
