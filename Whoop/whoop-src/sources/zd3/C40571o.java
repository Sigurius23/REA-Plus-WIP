package zd3;

import ae3.C0793a;
import ae3.C0795c;
import ae3.C0801i;
import androidx.core.app.NotificationCompat;
import fe3.AbstractC14421e;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import m83.AbstractC25265s;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.AbstractC34798a0;
import ud3.C34826l0;
import ud3.C34832o0;
import ud3.C34843u;
import ud3.C34850x0;
import ud3.InterfaceC34821j;
import ud3.InterfaceC34823k;
import wd3.AbstractC37172f;
import wd3.AbstractC37174h;
import yd3.C39472c;

/* JADX INFO: renamed from: zd3.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C40571o implements InterfaceC34821j, Cloneable {

    /* JADX INFO: renamed from: E */
    public final AbstractC34798a0 f174705E;

    /* JADX INFO: renamed from: F */
    public final C40570n f174706F;

    /* JADX INFO: renamed from: G */
    public final AtomicBoolean f174707G;

    /* JADX INFO: renamed from: H */
    public Object f174708H;

    /* JADX INFO: renamed from: I */
    public InterfaceC40564h f174709I;

    /* JADX INFO: renamed from: J */
    public C40572p f174710J;

    /* JADX INFO: renamed from: K */
    public boolean f174711K;

    /* JADX INFO: renamed from: L */
    public C40563g f174712L;

    /* JADX INFO: renamed from: M */
    public boolean f174713M;

    /* JADX INFO: renamed from: N */
    public boolean f174714N;

    /* JADX INFO: renamed from: O */
    public boolean f174715O;

    /* JADX INFO: renamed from: P */
    public boolean f174716P;

    /* JADX INFO: renamed from: Q */
    public boolean f174717Q;

    /* JADX INFO: renamed from: R */
    public volatile boolean f174718R;

    /* JADX INFO: renamed from: S */
    public volatile C40563g f174719S;

    /* JADX INFO: renamed from: T */
    public final CopyOnWriteArrayList f174720T;

    /* JADX INFO: renamed from: w */
    public final C34826l0 f174721w;

    /* JADX INFO: renamed from: x */
    public final C34832o0 f174722x;

    /* JADX INFO: renamed from: y */
    public final boolean f174723y;

    /* JADX INFO: renamed from: z */
    public final C40573q f174724z;

    public C40571o(C34826l0 c34826l0, C34832o0 originalRequest, boolean z4) {
        AbstractC22676k.m65750j(originalRequest, "originalRequest");
        this.f174721w = c34826l0;
        this.f174722x = originalRequest;
        this.f174723y = z4;
        this.f174724z = c34826l0.f146648F.f146720a;
        this.f174705E = c34826l0.f146652d.mo8619b(this);
        C40570n c40570n = new C40570n(this);
        c40570n.mo79277g(c34826l0.f146671w, TimeUnit.MILLISECONDS);
        this.f174706F = c40570n;
        this.f174707G = new AtomicBoolean();
        this.f174717Q = true;
        this.f174720T = new CopyOnWriteArrayList();
        new AtomicReference(originalRequest.f146716e);
    }

    /* JADX INFO: renamed from: a */
    public static final String m131545a(C40571o c40571o) {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(c40571o.f174718R ? "canceled " : "");
        sb4.append(c40571o.f174723y ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb4.append(" to ");
        sb4.append(c40571o.f174722x.f146712a.m109881j());
        return sb4.toString();
    }

    /* JADX INFO: renamed from: b */
    public final void m131546b(C40572p connection) {
        AbstractC22676k.m65750j(connection, "connection");
        TimeZone timeZone = AbstractC37174h.f158962a;
        if (this.f174710J != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f174710J = connection;
        connection.f174740q.add(new C40569m(this, this.f174708H));
    }

    /* JADX INFO: renamed from: c */
    public final IOException m131547c(IOException iOException) {
        IOException interruptedIOException;
        Socket socketM131554j;
        TimeZone timeZone = AbstractC37174h.f158962a;
        C40572p c40572p = this.f174710J;
        if (c40572p != null) {
            synchronized (c40572p) {
                socketM131554j = m131554j();
            }
            if (this.f174710J == null) {
                if (socketM131554j != null) {
                    AbstractC37174h.m119136c(socketM131554j);
                }
                this.f174705E.connectionReleased(this, c40572p);
            } else if (socketM131554j != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f174711K && this.f174706F.m79171j()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException == null) {
            this.f174705E.callEnd(this);
            return interruptedIOException;
        }
        AbstractC34798a0 abstractC34798a0 = this.f174705E;
        AbstractC22676k.m65747g(interruptedIOException);
        abstractC34798a0.callFailed(this, interruptedIOException);
        return interruptedIOException;
    }

    public final void cancel() {
        if (this.f174718R) {
            return;
        }
        this.f174718R = true;
        C40563g c40563g = this.f174719S;
        if (c40563g != null) {
            c40563g.f174688d.cancel();
        }
        Iterator it = this.f174720T.iterator();
        AbstractC22676k.m65749i(it, "iterator(...)");
        while (it.hasNext()) {
            ((InterfaceC40578v) it.next()).cancel();
        }
        this.f174705E.canceled(this);
    }

    public final Object clone() {
        return new C40571o(this.f174721w, this.f174722x, this.f174723y);
    }

    /* JADX INFO: renamed from: d */
    public final void m131548d(InterfaceC34823k responseCallback) {
        AbstractC22676k.m65750j(responseCallback, "responseCallback");
        if (!this.f174707G.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        AbstractC14421e abstractC14421e = AbstractC14421e.f52594a;
        this.f174708H = AbstractC14421e.f52594a.mo41119h();
        this.f174705E.callStart(this);
        C34843u c34843u = this.f174721w.f146649a;
        RunnableC40568l runnableC40568l = new RunnableC40568l(this, responseCallback);
        c34843u.getClass();
        C34843u.m109919c(c34843u, runnableC40568l, null, null, 6);
    }

    /* JADX INFO: renamed from: e */
    public final C34850x0 m131549e() {
        if (!this.f174707G.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f174706F.m79170i();
        AbstractC14421e abstractC14421e = AbstractC14421e.f52594a;
        this.f174708H = AbstractC14421e.f52594a.mo41119h();
        this.f174705E.callStart(this);
        try {
            C34843u c34843u = this.f174721w.f146649a;
            synchronized (c34843u) {
                c34843u.f146758f.add(this);
            }
            C34850x0 c34850x0M131551g = m131551g();
            C34843u c34843u2 = this.f174721w.f146649a;
            c34843u2.getClass();
            C34843u.m109919c(c34843u2, null, this, null, 5);
            return c34850x0M131551g;
        } catch (Throwable th3) {
            C34843u c34843u3 = this.f174721w.f146649a;
            c34843u3.getClass();
            C34843u.m109919c(c34843u3, null, this, null, 5);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m131550f(boolean z4) {
        C40563g c40563g;
        synchronized (this) {
            if (!this.f174717Q) {
                throw new IllegalStateException("released");
            }
        }
        if (z4 && (c40563g = this.f174719S) != null) {
            c40563g.f174688d.cancel();
            c40563g.f174685a.m131552h(c40563g, true, true, true, true, null);
        }
        this.f174712L = null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0086  */
    /* JADX INFO: renamed from: g */
    public final C34850x0 m131551g() {
        ArrayList arrayList = new ArrayList();
        AbstractC25265s.m74141p0(arrayList, this.f174721w.f146650b);
        arrayList.add(new C0793a(this.f174721w, 1));
        arrayList.add(new C0793a(this.f174721w.f146658j));
        arrayList.add(new C0793a(this.f174721w.f146659k, 2));
        arrayList.add(C40557a.f174645w);
        if (!this.f174723y) {
            AbstractC25265s.m74141p0(arrayList, this.f174721w.f146651c);
        }
        arrayList.add(C0795c.f2944w);
        C34832o0 c34832o0 = this.f174722x;
        C34826l0 c34826l0 = this.f174721w;
        boolean z4 = false;
        try {
            try {
                C34850x0 c34850x0M1939b = new C0801i(this, arrayList, 0, null, c34832o0, c34826l0.f146672x, c34826l0.f146673y, c34826l0.f146674z).m1939b(this.f174722x);
                if (this.f174718R) {
                    AbstractC37172f.m119117b(c34850x0M1939b);
                    throw new IOException("Canceled");
                }
                m131553i(null);
                return c34850x0M1939b;
            } catch (IOException e5) {
                z4 = true;
                IOException iOExceptionM131553i = m131553i(e5);
                AbstractC22676k.m65748h(iOExceptionM131553i, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionM131553i;
            }
        } catch (Throwable th3) {
            if (!z4) {
                m131553i(null);
            }
            throw th3;
        }
        if (!z4) {
            m131553i(null);
        }
        throw th3;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x002d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x002f A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:8:0x0014, B:23:0x002f, B:25:0x0033, B:27:0x0037, B:29:0x003b, B:30:0x003d, B:32:0x0041, B:34:0x0045, B:36:0x0049, B:41:0x0052, B:14:0x001d, B:17:0x0023, B:20:0x0029), top: B:65:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0033 A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:8:0x0014, B:23:0x002f, B:25:0x0033, B:27:0x0037, B:29:0x003b, B:30:0x003d, B:32:0x0041, B:34:0x0045, B:36:0x0049, B:41:0x0052, B:14:0x001d, B:17:0x0023, B:20:0x0029), top: B:65:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0037 A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:8:0x0014, B:23:0x002f, B:25:0x0033, B:27:0x0037, B:29:0x003b, B:30:0x003d, B:32:0x0041, B:34:0x0045, B:36:0x0049, B:41:0x0052, B:14:0x001d, B:17:0x0023, B:20:0x0029), top: B:65:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x003b A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:8:0x0014, B:23:0x002f, B:25:0x0033, B:27:0x0037, B:29:0x003b, B:30:0x003d, B:32:0x0041, B:34:0x0045, B:36:0x0049, B:41:0x0052, B:14:0x001d, B:17:0x0023, B:20:0x0029), top: B:65:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x004f  */
    /* JADX INFO: renamed from: h */
    public final IOException m131552h(C40563g exchange, boolean z4, boolean z13, boolean z14, boolean z15, IOException iOException) {
        boolean z16;
        boolean z17;
        boolean z18;
        AbstractC22676k.m65750j(exchange, "exchange");
        if (exchange.equals(this.f174719S)) {
            synchronized (this) {
                z16 = false;
                if (z4) {
                    try {
                        if (this.f174713M) {
                            if (z4) {
                                this.f174713M = false;
                            }
                            if (z13) {
                                this.f174714N = false;
                            }
                            if (z15) {
                                this.f174715O = false;
                            }
                            if (z14) {
                                this.f174716P = false;
                            }
                            if (this.f174713M) {
                                z18 = false;
                            } else {
                                z18 = false;
                            }
                            if (z18) {
                                z16 = true;
                            }
                            boolean z19 = z16;
                            z16 = z18;
                            z17 = z19;
                        } else if ((!z13 && this.f174714N) || ((z15 && this.f174715O) || (z14 && this.f174716P))) {
                            if (z4) {
                                this.f174713M = false;
                            }
                            if (z13) {
                                this.f174714N = false;
                            }
                            if (z15) {
                                this.f174715O = false;
                            }
                            if (z14) {
                                this.f174716P = false;
                            }
                            if (this.f174713M || this.f174714N || this.f174715O || this.f174716P) {
                                z18 = false;
                            } else {
                                z18 = true;
                            }
                            if (z18 && !this.f174717Q) {
                                z16 = true;
                            }
                            boolean z110 = z16;
                            z16 = z18;
                            z17 = z110;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                } else {
                    z17 = !z13 ? false : false;
                }
            }
            if (z16) {
                this.f174719S = null;
                C40572p c40572p = this.f174710J;
                if (c40572p != null) {
                    synchronized (c40572p) {
                        c40572p.f174737n++;
                    }
                }
            }
            if (z17) {
                return m131547c(iOException);
            }
        }
        return iOException;
    }

    /* JADX INFO: renamed from: i */
    public final IOException m131553i(IOException iOException) {
        boolean z4;
        synchronized (this) {
            z4 = false;
            if (this.f174717Q) {
                this.f174717Q = false;
                if (!this.f174713M && !this.f174714N && !this.f174715O && !this.f174716P) {
                    z4 = true;
                }
            }
        }
        return z4 ? m131547c(iOException) : iOException;
    }

    /* JADX INFO: renamed from: j */
    public final Socket m131554j() {
        C40572p c40572p = this.f174710J;
        AbstractC22676k.m65747g(c40572p);
        TimeZone timeZone = AbstractC37174h.f158962a;
        ArrayList arrayList = c40572p.f174740q;
        Iterator it = arrayList.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (AbstractC22676k.m65745e(((Reference) it.next()).get(), this)) {
                break;
            }
            i13++;
        }
        if (i13 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i13);
        this.f174710J = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        c40572p.f174741r = System.nanoTime();
        C40573q c40573q = this.f174724z;
        ConcurrentLinkedQueue concurrentLinkedQueue = c40573q.f174745d;
        C39472c c39472c = c40573q.f174743b;
        TimeZone timeZone2 = AbstractC37174h.f158962a;
        if (!c40572p.f174734k) {
            c39472c.m126120d(c40573q.f174744c, 0L);
            return null;
        }
        c40572p.f174734k = true;
        concurrentLinkedQueue.remove(c40572p);
        if (concurrentLinkedQueue.isEmpty()) {
            c39472c.m126118a();
        }
        return c40572p.f174728e;
    }
}
