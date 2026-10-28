package p403pp;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: pp.l */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC29416l {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m89690a(Unsafe unsafe, C29406b c29406b, long j7, Object obj) {
        while (true) {
            Unsafe unsafe2 = unsafe;
            C29406b c29406b2 = c29406b;
            long j13 = j7;
            Object obj2 = obj;
            if (unsafe2.compareAndSwapObject(c29406b2, j13, obj2, C29412h.f119437b)) {
                return true;
            }
            if (unsafe2.getObject(c29406b2, j13) != obj2) {
                return false;
            }
            unsafe = unsafe2;
            c29406b = c29406b2;
            j7 = j13;
            obj = obj2;
        }
    }
}
