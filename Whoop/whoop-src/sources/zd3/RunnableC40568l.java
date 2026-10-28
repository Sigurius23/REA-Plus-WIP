package zd3;

import fe3.AbstractC14421e;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34843u;
import ud3.InterfaceC34823k;

/* JADX INFO: renamed from: zd3.l */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC40568l implements Runnable {

    /* JADX INFO: renamed from: w */
    public final InterfaceC34823k f174700w;

    /* JADX INFO: renamed from: x */
    public volatile AtomicInteger f174701x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C40571o f174702y;

    public RunnableC40568l(C40571o c40571o, InterfaceC34823k responseCallback) {
        AbstractC22676k.m65750j(responseCallback, "responseCallback");
        this.f174702y = c40571o;
        this.f174700w = responseCallback;
        this.f174701x = new AtomicInteger(0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34843u c34843u;
        String str = "OkHttp " + this.f174702y.f174722x.f146712a.m109881j();
        C40571o c40571o = this.f174702y;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(str);
        try {
            c40571o.f174706F.m79170i();
            boolean z4 = false;
            try {
                try {
                    try {
                        this.f174700w.onResponse(c40571o, c40571o.m131551g());
                        c34843u = c40571o.f174721w.f146649a;
                    } catch (IOException e5) {
                        e = e5;
                        z4 = true;
                        if (z4) {
                            AbstractC14421e abstractC14421e = AbstractC14421e.f52594a;
                            AbstractC14421e.f52594a.mo41121j("Callback failure for " + C40571o.m131545a(c40571o), 4, e);
                        } else {
                            this.f174700w.onFailure(c40571o, e);
                        }
                        c34843u = c40571o.f174721w.f146649a;
                    } catch (Throwable th3) {
                        th = th3;
                        z4 = true;
                        c40571o.cancel();
                        if (!z4) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.initCause(th);
                            this.f174700w.onFailure(c40571o, iOException);
                        }
                        if (!(th instanceof InterruptedException)) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        c34843u = c40571o.f174721w.f146649a;
                    }
                } catch (Throwable th4) {
                    C34843u c34843u2 = c40571o.f174721w.f146649a;
                    c34843u2.getClass();
                    C34843u.m109919c(c34843u2, null, null, this, 3);
                    throw th4;
                }
            } catch (IOException e13) {
                e = e13;
            } catch (Throwable th5) {
                th = th5;
            }
            c34843u.getClass();
            C34843u.m109919c(c34843u, null, null, this, 3);
            threadCurrentThread.setName(name);
        } catch (Throwable th6) {
            threadCurrentThread.setName(name);
            throw th6;
        }
    }
}
