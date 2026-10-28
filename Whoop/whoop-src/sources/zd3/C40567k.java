package zd3;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import u93.C34671d0;
import wd3.AbstractC37174h;
import yd3.C39473d;

/* JADX INFO: renamed from: zd3.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C40567k implements InterfaceC40564h {

    /* JADX INFO: renamed from: E */
    public final CopyOnWriteArrayList f174694E;

    /* JADX INFO: renamed from: F */
    public final LinkedBlockingDeque f174695F;

    /* JADX INFO: renamed from: w */
    public final C40574r f174696w;

    /* JADX INFO: renamed from: x */
    public final C39473d f174697x;

    /* JADX INFO: renamed from: y */
    public final long f174698y;

    /* JADX INFO: renamed from: z */
    public long f174699z;

    public C40567k(C40574r c40574r, C39473d taskRunner) {
        AbstractC22676k.m65750j(taskRunner, "taskRunner");
        this.f174696w = c40574r;
        this.f174697x = taskRunner;
        this.f174698y = TimeUnit.MILLISECONDS.toNanos(250L);
        this.f174699z = Long.MIN_VALUE;
        this.f174694E = new CopyOnWriteArrayList();
        this.f174695F = new LinkedBlockingDeque();
    }

    @Override // zd3.InterfaceC40564h
    /* JADX INFO: renamed from: a */
    public final C40572p mo131541a() throws IOException {
        C40577u c40577uM131544d;
        long j7;
        C40577u c40577u;
        IOException iOException = null;
        while (true) {
            try {
                if (this.f174694E.isEmpty() && !this.f174696w.m131560a(null)) {
                    m131543c();
                    AbstractC22676k.m65747g(iOException);
                    throw iOException;
                }
                if (this.f174696w.f174757l.f174718R) {
                    throw new IOException("Canceled");
                }
                C34671d0 c34671d0 = this.f174697x.f169843a;
                long jNanoTime = System.nanoTime();
                long j13 = this.f174699z - jNanoTime;
                if (this.f174694E.isEmpty() || j13 <= 0) {
                    c40577uM131544d = m131544d();
                    j7 = this.f174698y;
                    this.f174699z = jNanoTime + j7;
                } else {
                    j7 = j13;
                    c40577uM131544d = null;
                }
                if (c40577uM131544d == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f174694E;
                    if (copyOnWriteArrayList.isEmpty() || (c40577u = (C40577u) this.f174695F.poll(j7, timeUnit)) == null) {
                        c40577uM131544d = null;
                    } else {
                        copyOnWriteArrayList.remove(c40577u.f174765a);
                        c40577uM131544d = c40577u;
                    }
                    if (c40577uM131544d == null) {
                    }
                }
                boolean z4 = false;
                if (c40577uM131544d.f174766b == null && c40577uM131544d.f174767c == null) {
                    m131543c();
                    if (!c40577uM131544d.f174765a.mo131523b()) {
                        c40577uM131544d = c40577uM131544d.f174765a.mo131524d();
                    }
                    if (c40577uM131544d.f174766b == null && c40577uM131544d.f174767c == null) {
                        z4 = true;
                    }
                    if (z4) {
                        C40572p c40572pMo131522a = c40577uM131544d.f174765a.mo131522a();
                        m131543c();
                        return c40572pMo131522a;
                    }
                }
                Throwable th3 = c40577uM131544d.f174767c;
                if (th3 != null) {
                    if (!(th3 instanceof IOException)) {
                        throw th3;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th3;
                    } else {
                        AbstractC29125c.m88530g(iOException, th3);
                    }
                }
                InterfaceC40578v interfaceC40578v = c40577uM131544d.f174766b;
                if (interfaceC40578v != null) {
                    this.f174696w.f174762q.addFirst(interfaceC40578v);
                }
            } catch (Throwable th4) {
                m131543c();
                throw th4;
            }
        }
    }

    @Override // zd3.InterfaceC40564h
    /* JADX INFO: renamed from: b */
    public final C40574r mo131542b() {
        return this.f174696w;
    }

    /* JADX INFO: renamed from: c */
    public final void m131543c() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f174694E;
        Iterator it = copyOnWriteArrayList.iterator();
        AbstractC22676k.m65749i(it, "iterator(...)");
        while (it.hasNext()) {
            InterfaceC40578v interfaceC40578v = (InterfaceC40578v) it.next();
            interfaceC40578v.cancel();
            InterfaceC40578v interfaceC40578vMo131525f = interfaceC40578v.mo131525f();
            if (interfaceC40578vMo131525f != null) {
                this.f174696w.f174762q.addLast(interfaceC40578vMo131525f);
            }
        }
        copyOnWriteArrayList.clear();
    }

    /* JADX INFO: renamed from: d */
    public final C40577u m131544d() {
        InterfaceC40578v c40565i;
        C40574r c40574r = this.f174696w;
        if (c40574r.m131560a(null)) {
            try {
                c40565i = c40574r.m131561b();
            } catch (Throwable th3) {
                c40565i = new C40565i(th3);
            }
            if (c40565i.mo131523b()) {
                return new C40577u(c40565i, null, null, 6);
            }
            if (c40565i instanceof C40565i) {
                return ((C40565i) c40565i).f174691a;
            }
            this.f174694E.add(c40565i);
            this.f174697x.m126126d().m126120d(new C40566j(AbstractC37174h.f158963b + " connect " + c40574r.f174755j.f146519h.m109881j(), c40565i, this), 0L);
        }
        return null;
    }
}
