package p403pp;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: pp.m */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC29417m {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m89691a(Unsafe unsafe, AbstractFutureC29420p abstractFutureC29420p, long j7, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(abstractFutureC29420p, j7, obj, obj2)) {
            if (unsafe.getObject(abstractFutureC29420p, j7) != obj) {
                return false;
            }
        }
        return true;
    }
}
