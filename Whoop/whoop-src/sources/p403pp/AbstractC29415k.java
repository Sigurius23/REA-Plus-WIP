package p403pp;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: pp.k */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC29415k {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m89689a(Unsafe unsafe, AbstractFutureC29420p abstractFutureC29420p, long j7, C29419o c29419o, C29419o c29419o2) {
        while (!unsafe.compareAndSwapObject(abstractFutureC29420p, j7, c29419o, c29419o2)) {
            if (unsafe.getObject(abstractFutureC29420p, j7) != c29419o) {
                return false;
            }
        }
        return true;
    }
}
