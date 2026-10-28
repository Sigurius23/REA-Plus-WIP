package p097ds;

import bi.AbstractC3269g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: ds.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C12309l extends AbstractC3269g {

    /* JADX INFO: renamed from: b */
    public static final Unsafe f41222b;

    /* JADX INFO: renamed from: c */
    public static final long f41223c;

    /* JADX INFO: renamed from: d */
    public static final long f41224d;

    /* JADX INFO: renamed from: e */
    public static final long f41225e;

    /* JADX INFO: renamed from: f */
    public static final long f41226f;

    /* JADX INFO: renamed from: g */
    public static final long f41227g;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e5) {
                throw new RuntimeException("Could not initialize intrinsics", e5.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new C12308k());
        }
        try {
            f41224d = unsafe.objectFieldOffset(AbstractC12311n.class.getDeclaredField("y"));
            f41223c = unsafe.objectFieldOffset(AbstractC12311n.class.getDeclaredField("x"));
            f41225e = unsafe.objectFieldOffset(AbstractC12311n.class.getDeclaredField(StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH));
            f41226f = unsafe.objectFieldOffset(C12310m.class.getDeclaredField("a"));
            f41227g = unsafe.objectFieldOffset(C12310m.class.getDeclaredField("b"));
            f41222b = unsafe;
        } catch (NoSuchFieldException e13) {
            throw new RuntimeException(e13);
        }
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: A */
    public final C12300c mo9520A(AbstractC12311n abstractC12311n) {
        C12300c c12300c;
        C12300c c12300c2 = C12300c.f41211d;
        do {
            c12300c = abstractC12311n.f41236x;
            if (c12300c2 == c12300c) {
                break;
            }
        } while (!mo9533j(abstractC12311n, c12300c, c12300c2));
        return c12300c;
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: B */
    public final C12310m mo9521B(AbstractC12311n abstractC12311n) {
        C12310m c12310m;
        C12310m c12310m2 = C12310m.f41228c;
        do {
            c12310m = abstractC12311n.f41237y;
            if (c12310m2 == c12310m) {
                break;
            }
        } while (!mo9535l(abstractC12311n, c12310m, c12310m2));
        return c12310m;
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: Q */
    public final void mo9523Q(C12310m c12310m, C12310m c12310m2) {
        f41222b.putObject(c12310m, f41227g, c12310m2);
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: R */
    public final void mo9524R(C12310m c12310m, Thread thread) {
        f41222b.putObject(c12310m, f41226f, thread);
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: j */
    public final boolean mo9533j(AbstractC12311n abstractC12311n, C12300c c12300c, C12300c c12300c2) {
        return AbstractC12306i.m34236a(f41222b, abstractC12311n, f41223c, c12300c, c12300c2);
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: k */
    public final boolean mo9534k(AbstractC12311n abstractC12311n, Object obj, Object obj2) {
        return AbstractC12307j.m34237a(f41222b, abstractC12311n, f41225e, obj, obj2);
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: l */
    public final boolean mo9535l(AbstractC12311n abstractC12311n, C12310m c12310m, C12310m c12310m2) {
        return AbstractC12305h.m34235a(f41222b, abstractC12311n, f41224d, c12310m, c12310m2);
    }
}
