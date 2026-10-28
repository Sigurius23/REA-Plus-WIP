package p403pp;

import bi.AbstractC3269g;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: pp.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C29418n extends AbstractC3269g {

    /* JADX INFO: renamed from: b */
    public static final Unsafe f119444b;

    /* JADX INFO: renamed from: c */
    public static final long f119445c;

    /* JADX INFO: renamed from: d */
    public static final long f119446d;

    /* JADX INFO: renamed from: e */
    public static final long f119447e;

    /* JADX INFO: renamed from: f */
    public static final long f119448f;

    /* JADX INFO: renamed from: g */
    public static final long f119449g;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(C29421q.f119460a);
            }
            try {
                f119446d = unsafe.objectFieldOffset(AbstractFutureC29420p.class.getDeclaredField("H"));
                f119445c = unsafe.objectFieldOffset(AbstractFutureC29420p.class.getDeclaredField("G"));
                f119447e = unsafe.objectFieldOffset(AbstractFutureC29420p.class.getDeclaredField("F"));
                f119448f = unsafe.objectFieldOffset(C29419o.class.getDeclaredField("a"));
                f119449g = unsafe.objectFieldOffset(C29419o.class.getDeclaredField("b"));
                f119444b = unsafe;
            } catch (NoSuchFieldException e5) {
                throw new RuntimeException(e5);
            }
        } catch (PrivilegedActionException e13) {
            throw new RuntimeException("Could not initialize intrinsics", e13.getCause());
        }
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: d0 */
    public final void mo9527d0(C29419o c29419o, Thread thread) {
        f119444b.putObject(c29419o, f119448f, thread);
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: e0 */
    public final void mo9528e0(C29419o c29419o, C29419o c29419o2) {
        f119444b.putObject(c29419o, f119449g, c29419o2);
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: f0 */
    public final boolean mo9529f0(AbstractFutureC29420p abstractFutureC29420p, C29419o c29419o, C29419o c29419o2) {
        return AbstractC29415k.m89689a(f119444b, abstractFutureC29420p, f119446d, c29419o, c29419o2);
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: g0 */
    public final C29419o mo9530g0(C29406b c29406b) {
        C29419o c29419o;
        C29419o c29419o2 = C29419o.f119450c;
        do {
            c29419o = c29406b.f119459H;
            if (c29419o2 == c29419o) {
                break;
            }
        } while (!mo9529f0(c29406b, c29419o, c29419o2));
        return c29419o;
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: h0 */
    public final C29412h mo9531h0(C29406b c29406b) {
        C29412h c29412h;
        C29412h c29412h2 = C29412h.f119437b;
        do {
            c29412h = c29406b.f119458G;
            if (c29412h2 == c29412h) {
                break;
            }
        } while (!AbstractC29416l.m89690a(f119444b, c29406b, f119445c, c29412h));
        return c29412h;
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: i0 */
    public final boolean mo9532i0(AbstractFutureC29420p abstractFutureC29420p, Object obj, Object obj2) {
        return AbstractC29417m.m89691a(f119444b, abstractFutureC29420p, f119447e, obj, obj2);
    }
}
