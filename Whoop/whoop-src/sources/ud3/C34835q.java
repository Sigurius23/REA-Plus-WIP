package ud3;

import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import wd3.AbstractC37174h;
import yd3.C39473d;
import zd3.C40572p;
import zd3.C40573q;

/* JADX INFO: renamed from: ud3.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C34835q {

    /* JADX INFO: renamed from: a */
    public final C40573q f146720a;

    public C34835q(long j7, TimeUnit timeUnit) {
        AbstractC22676k.m65750j(timeUnit, "timeUnit");
        C39473d taskRunner = C39473d.f169842l;
        AbstractC22676k.m65750j(taskRunner, "taskRunner");
        this.f146720a = new C40573q(taskRunner, j7, timeUnit);
    }

    /* JADX INFO: renamed from: a */
    public final void m109909a() {
        Socket socket;
        C40573q c40573q = this.f146720a;
        Iterator it = c40573q.f174745d.iterator();
        AbstractC22676k.m65749i(it, "iterator(...)");
        while (it.hasNext()) {
            C40572p c40572p = (C40572p) it.next();
            AbstractC22676k.m65747g(c40572p);
            synchronized (c40572p) {
                if (c40572p.f174740q.isEmpty()) {
                    it.remove();
                    c40572p.f174734k = true;
                    socket = c40572p.f174728e;
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                AbstractC37174h.m119136c(socket);
            }
        }
        if (c40573q.f174745d.isEmpty()) {
            c40573q.f174743b.m126118a();
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m109910b() {
        boolean zIsEmpty;
        ConcurrentLinkedQueue<C40572p> concurrentLinkedQueue = this.f146720a.f174745d;
        int i13 = 0;
        if (concurrentLinkedQueue != null && concurrentLinkedQueue.isEmpty()) {
            return 0;
        }
        for (C40572p c40572p : concurrentLinkedQueue) {
            AbstractC22676k.m65747g(c40572p);
            synchronized (c40572p) {
                zIsEmpty = c40572p.f174740q.isEmpty();
            }
            if (zIsEmpty && (i13 = i13 + 1) < 0) {
                AbstractC37056f.m118976c0();
                throw null;
            }
        }
        return i13;
    }

    public C34835q() {
        this(5L, TimeUnit.MINUTES);
    }
}
