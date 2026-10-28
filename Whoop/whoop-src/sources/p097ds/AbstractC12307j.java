package p097ds;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: ds.j */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC12307j {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m34237a(Unsafe unsafe, AbstractC12311n abstractC12311n, long j7, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(abstractC12311n, j7, obj, obj2)) {
            if (unsafe.getObject(abstractC12311n, j7) != obj) {
                return false;
            }
        }
        return true;
    }
}
