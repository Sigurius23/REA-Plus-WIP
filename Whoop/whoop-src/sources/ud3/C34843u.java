package ud3;

import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m83.AbstractC25265s;
import mc.C25411h;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import wd3.AbstractC37174h;
import wd3.ThreadFactoryC37173g;
import zd3.C40571o;
import zd3.RunnableC40568l;

/* JADX INFO: renamed from: ud3.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C34843u {

    /* JADX INFO: renamed from: c */
    public ThreadPoolExecutor f146755c;

    /* JADX INFO: renamed from: a */
    public int f146753a = 64;

    /* JADX INFO: renamed from: b */
    public int f146754b = 5;

    /* JADX INFO: renamed from: d */
    public final ArrayDeque f146756d = new ArrayDeque();

    /* JADX INFO: renamed from: e */
    public final ArrayDeque f146757e = new ArrayDeque();

    /* JADX INFO: renamed from: f */
    public final ArrayDeque f146758f = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public static void m109919c(C34843u c34843u, RunnableC40568l runnableC40568l, C40571o c40571o, RunnableC40568l runnableC40568l2, int i13) {
        C25411h c25411h;
        RunnableC40568l runnableC40568lM109921b;
        if ((i13 & 1) != 0) {
            runnableC40568l = null;
        }
        if ((i13 & 2) != 0) {
            c40571o = null;
        }
        if ((i13 & 4) != 0) {
            runnableC40568l2 = null;
        }
        c34843u.getClass();
        TimeZone timeZone = AbstractC37174h.f158962a;
        boolean zIsShutdown = ((ThreadPoolExecutor) c34843u.m109920a()).isShutdown();
        synchronized (c34843u) {
            if (c40571o != null) {
                try {
                    if (!c34843u.f146758f.remove(c40571o)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (runnableC40568l2 != null) {
                runnableC40568l2.f174701x.decrementAndGet();
                if (!c34843u.f146757e.remove(runnableC40568l2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (runnableC40568l != null) {
                c34843u.f146756d.add(runnableC40568l);
                C40571o c40571o2 = runnableC40568l.f174702y;
                if (!c40571o2.f174723y && (runnableC40568lM109921b = c34843u.m109921b(c40571o2.f174722x.f146712a.f146565d)) != null) {
                    runnableC40568l.f174701x = runnableC40568lM109921b.f174701x;
                }
            }
            if ((c40571o != null || runnableC40568l2 != null) && (zIsShutdown || c34843u.f146757e.isEmpty())) {
                c34843u.f146758f.isEmpty();
            }
            if (zIsShutdown) {
                List listM74093D1 = AbstractC25265s.m74093D1(c34843u.f146756d);
                c34843u.f146756d.clear();
                c25411h = new C25411h(listM74093D1);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = c34843u.f146756d.iterator();
                AbstractC22676k.m65749i(it, "iterator(...)");
                while (it.hasNext()) {
                    RunnableC40568l runnableC40568l3 = (RunnableC40568l) it.next();
                    if (c34843u.f146757e.size() >= c34843u.f146753a) {
                        break;
                    }
                    if (runnableC40568l3.f174701x.get() < c34843u.f146754b) {
                        it.remove();
                        runnableC40568l3.f174701x.incrementAndGet();
                        arrayList.add(runnableC40568l3);
                        c34843u.f146757e.add(runnableC40568l3);
                    }
                }
                c25411h = new C25411h(arrayList);
            }
        }
        int size = c25411h.f99515a.size();
        boolean z4 = true;
        for (int i14 = 0; i14 < size; i14++) {
            RunnableC40568l runnableC40568l4 = (RunnableC40568l) c25411h.f99515a.get(i14);
            if (runnableC40568l4 == runnableC40568l) {
                z4 = false;
            } else {
                C40571o c40571o3 = runnableC40568l4.f174702y;
                c40571o3.f174705E.dispatcherQueueEnd(c40571o3, c34843u);
            }
            if (zIsShutdown) {
                runnableC40568l4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                C40571o c40571o4 = runnableC40568l4.f174702y;
                c40571o4.m131553i(interruptedIOException);
                runnableC40568l4.f174700w.onFailure(c40571o4, interruptedIOException);
            } else {
                ExecutorService executorServiceM109920a = c34843u.m109920a();
                runnableC40568l4.getClass();
                C40571o c40571o5 = runnableC40568l4.f174702y;
                AbstractC22676k.m65750j(c40571o5.f174721w.f146649a, "<this>");
                try {
                    try {
                        ((ThreadPoolExecutor) executorServiceM109920a).execute(runnableC40568l4);
                    } catch (RejectedExecutionException e5) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e5);
                        C40571o c40571o6 = runnableC40568l4.f174702y;
                        c40571o6.m131553i(interruptedIOException2);
                        runnableC40568l4.f174700w.onFailure(c40571o6, interruptedIOException2);
                        C34843u c34843u2 = c40571o5.f174721w.f146649a;
                        c34843u2.getClass();
                        m109919c(c34843u2, null, null, runnableC40568l4, 3);
                    }
                } catch (Throwable th4) {
                    C34843u c34843u3 = c40571o5.f174721w.f146649a;
                    c34843u3.getClass();
                    m109919c(c34843u3, null, null, runnableC40568l4, 3);
                    throw th4;
                }
            }
        }
        if (!z4 || runnableC40568l == null) {
            return;
        }
        C40571o c40571o7 = runnableC40568l.f174702y;
        c40571o7.f174705E.dispatcherQueueStart(c40571o7, c34843u);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized ExecutorService m109920a() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (this.f146755c == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String name = AbstractC37174h.f158963b + " Dispatcher";
                AbstractC22676k.m65750j(name, "name");
                this.f146755c = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new ThreadFactoryC37173g(name, false));
            }
            threadPoolExecutor = this.f146755c;
            AbstractC22676k.m65747g(threadPoolExecutor);
        } catch (Throwable th3) {
            throw th3;
        }
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: b */
    public final RunnableC40568l m109921b(String str) {
        Iterator it = this.f146757e.iterator();
        AbstractC22676k.m65749i(it, "iterator(...)");
        while (it.hasNext()) {
            RunnableC40568l runnableC40568l = (RunnableC40568l) it.next();
            if (AbstractC22676k.m65745e(runnableC40568l.f174702y.f174722x.f146712a.f146565d, str)) {
                return runnableC40568l;
            }
        }
        Iterator it3 = this.f146756d.iterator();
        AbstractC22676k.m65749i(it3, "iterator(...)");
        while (it3.hasNext()) {
            RunnableC40568l runnableC40568l2 = (RunnableC40568l) it3.next();
            if (AbstractC22676k.m65745e(runnableC40568l2.f174702y.f174722x.f146712a.f146565d, str)) {
                return runnableC40568l2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized int m109922d() {
        return this.f146757e.size() + this.f146758f.size();
    }

    /* JADX INFO: renamed from: e */
    public final void m109923e(int i13) {
        if (i13 < 1) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "max < 1: ").toString());
        }
        synchronized (this) {
            this.f146754b = i13;
        }
        m109919c(this, null, null, null, 7);
    }
}
