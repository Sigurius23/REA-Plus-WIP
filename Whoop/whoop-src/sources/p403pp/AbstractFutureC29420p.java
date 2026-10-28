package p403pp;

import bi.AbstractC3269g;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import live.hms.video.factories.MediaConstraintsFactory;
import p035bp.AbstractC3511b;
import p097ds.C12318u;

/* JADX INFO: renamed from: pp.p */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractFutureC29420p extends AbstractC3511b implements Future {

    /* JADX INFO: renamed from: I */
    public static final Object f119453I = new Object();

    /* JADX INFO: renamed from: J */
    public static final C12318u f119454J = new C12318u();

    /* JADX INFO: renamed from: K */
    public static final boolean f119455K;

    /* JADX INFO: renamed from: L */
    public static final AbstractC3269g f119456L;

    /* JADX INFO: renamed from: F */
    public volatile Object f119457F;

    /* JADX INFO: renamed from: G */
    public volatile C29412h f119458G;

    /* JADX INFO: renamed from: H */
    public volatile C29419o f119459H;

    static {
        boolean z4;
        AbstractC3269g c29414j;
        Throwable th3;
        Throwable th4;
        try {
            z4 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", MediaConstraintsFactory.kValueFalse));
        } catch (SecurityException unused) {
            z4 = false;
        }
        f119455K = z4;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th5 = null;
        if (property == null || property.contains("Android")) {
            try {
                c29414j = new C29418n();
            } catch (Error | Exception e5) {
                try {
                    c29414j = new C29413i();
                } catch (Error | Exception e13) {
                    th5 = e13;
                    c29414j = new C29414j();
                }
                th3 = th5;
                th4 = e5;
            }
        } else {
            try {
                c29414j = new C29413i();
            } catch (NoClassDefFoundError unused2) {
                c29414j = new C29414j();
            }
        }
        th3 = null;
        th4 = null;
        f119456L = c29414j;
        if (th3 != null) {
            C12318u c12318u = f119454J;
            Logger loggerM34348b = c12318u.m34348b();
            Level level = Level.SEVERE;
            loggerM34348b.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th4);
            c12318u.m34348b().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th3);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m89692M(C29419o c29419o) {
        c29419o.f119451a = null;
        while (true) {
            C29419o c29419o2 = this.f119459H;
            if (c29419o2 != C29419o.f119450c) {
                C29419o c29419o3 = null;
                while (c29419o2 != null) {
                    C29419o c29419o4 = c29419o2.f119452b;
                    if (c29419o2.f119451a != null) {
                        c29419o3 = c29419o2;
                    } else if (c29419o3 != null) {
                        c29419o3.f119452b = c29419o4;
                        if (c29419o3.f119451a == null) {
                        }
                    } else if (!f119456L.mo9529f0(this, c29419o2, c29419o4)) {
                    }
                    c29419o2 = c29419o4;
                }
                return;
            }
            return;
        }
    }
}
