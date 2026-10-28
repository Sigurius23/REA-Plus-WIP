package p080d4;

import hg3.AbstractC17269i;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import live.hms.video.factories.MediaConstraintsFactory;
import p031b9.AbstractC2875y;
import p097ds.InterfaceFutureC12319v;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: d4.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11649h implements InterfaceFutureC12319v {

    /* JADX INFO: renamed from: F */
    public static final AbstractC17269i f37622F;

    /* JADX INFO: renamed from: G */
    public static final Object f37623G;

    /* JADX INFO: renamed from: w */
    public volatile Object f37625w;

    /* JADX INFO: renamed from: x */
    public volatile C11645d f37626x;

    /* JADX INFO: renamed from: y */
    public volatile C11648g f37627y;

    /* JADX INFO: renamed from: z */
    public static final boolean f37624z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", MediaConstraintsFactory.kValueFalse));

    /* JADX INFO: renamed from: E */
    public static final Logger f37621E = Logger.getLogger(AbstractC11649h.class.getName());

    static {
        AbstractC17269i c11647f;
        try {
            c11647f = new C11646e(AtomicReferenceFieldUpdater.newUpdater(C11648g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C11648g.class, C11648g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC11649h.class, C11648g.class, "y"), AtomicReferenceFieldUpdater.newUpdater(AbstractC11649h.class, C11645d.class, "x"), AtomicReferenceFieldUpdater.newUpdater(AbstractC11649h.class, Object.class, StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH));
            th = null;
        } catch (Throwable th3) {
            th = th3;
            c11647f = new C11647f();
        }
        f37622F = c11647f;
        if (th != null) {
            f37621E.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f37623G = new Object();
    }

    /* JADX INFO: renamed from: d */
    public static void m31057d(AbstractC11649h abstractC11649h) {
        C11648g c11648g;
        C11645d c11645d;
        C11645d c11645d2;
        C11645d c11645d3;
        do {
            c11648g = abstractC11649h.f37627y;
        } while (!f37622F.mo31056y(abstractC11649h, c11648g, C11648g.f37618c));
        while (true) {
            c11645d = null;
            if (c11648g == null) {
                break;
            }
            Thread thread = c11648g.f37619a;
            if (thread != null) {
                c11648g.f37619a = null;
                LockSupport.unpark(thread);
            }
            c11648g = c11648g.f37620b;
        }
        abstractC11649h.mo31063c();
        do {
            c11645d2 = abstractC11649h.f37626x;
        } while (!f37622F.mo31054w(abstractC11649h, c11645d2, C11645d.f37609d));
        while (true) {
            c11645d3 = c11645d;
            c11645d = c11645d2;
            if (c11645d == null) {
                break;
            }
            c11645d2 = c11645d.f37612c;
            c11645d.f37612c = c11645d3;
        }
        while (c11645d3 != null) {
            C11645d c11645d4 = c11645d3.f37612c;
            m31058e(c11645d3.f37610a, c11645d3.f37611b);
            c11645d3 = c11645d4;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m31058e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e5) {
            f37621E.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e5);
        }
    }

    /* JADX INFO: renamed from: f */
    public static Object m31059f(Object obj) throws ExecutionException {
        if (obj instanceof C11642a) {
            Throwable th3 = ((C11642a) obj).f37606b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th3);
            throw cancellationException;
        }
        if (obj instanceof C11644c) {
            throw new ExecutionException(((C11644c) obj).f37608a);
        }
        if (obj == f37623G) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: g */
    public static Object m31060g(Future future) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th3) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th3;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // p097ds.InterfaceFutureC12319v
    /* JADX INFO: renamed from: a */
    public final void mo31061a(Runnable runnable, Executor executor) {
        executor.getClass();
        C11645d c11645d = this.f37626x;
        C11645d c11645d2 = C11645d.f37609d;
        if (c11645d != c11645d2) {
            C11645d c11645d3 = new C11645d(runnable, executor);
            do {
                c11645d3.f37612c = c11645d;
                if (f37622F.mo31054w(this, c11645d, c11645d3)) {
                    return;
                } else {
                    c11645d = this.f37626x;
                }
            } while (c11645d != c11645d2);
        }
        m31058e(runnable, executor);
    }

    /* JADX INFO: renamed from: b */
    public final void m31062b(StringBuilder sb4) {
        try {
            Object objM31060g = m31060g(this);
            sb4.append("SUCCESS, result=[");
            sb4.append(objM31060g == this ? "this future" : String.valueOf(objM31060g));
            sb4.append("]");
        } catch (CancellationException unused) {
            sb4.append("CANCELLED");
        } catch (RuntimeException e5) {
            sb4.append("UNKNOWN, cause=[");
            sb4.append(e5.getClass());
            sb4.append(" thrown from get()]");
        } catch (ExecutionException e13) {
            sb4.append("FAILURE, cause=[");
            sb4.append(e13.getCause());
            sb4.append("]");
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo31063c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        C11642a c11642a;
        Object obj = this.f37625w;
        if (obj == null) {
            if (f37624z) {
                c11642a = new C11642a(new CancellationException("Future.cancel() was called."), z4);
            } else {
                c11642a = z4 ? C11642a.f37603c : C11642a.f37604d;
            }
            if (f37622F.mo31055x(this, obj, c11642a)) {
                m31057d(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C11648g c11648g = C11648g.f37618c;
        long nanos = timeUnit.toNanos(j7);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f37625w;
        if (obj != null) {
            return m31059f(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C11648g c11648g2 = this.f37627y;
            if (c11648g2 != c11648g) {
                C11648g c11648g3 = new C11648g();
                while (true) {
                    AbstractC17269i abstractC17269i = f37622F;
                    abstractC17269i.mo31052h0(c11648g3, c11648g2);
                    if (abstractC17269i.mo31056y(this, c11648g2, c11648g3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m31065i(c11648g3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f37625w;
                            if (obj2 != null) {
                                return m31059f(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m31065i(c11648g3);
                        break;
                    }
                    c11648g2 = this.f37627y;
                    if (c11648g2 == c11648g) {
                    }
                }
            }
            return m31059f(this.f37625w);
        }
        while (nanos > 0) {
            Object obj3 = this.f37625w;
            if (obj3 != null) {
                return m31059f(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "Waited ", " ");
        sbM125596b.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbM125596b.toString();
        if (nanos + 1000 < 0) {
            String strM8299l = AbstractC2875y.m8299l(string3, " (plus ");
            long j13 = -nanos;
            long jConvert = timeUnit.convert(j13, TimeUnit.NANOSECONDS);
            long nanos2 = j13 - timeUnit.toNanos(jConvert);
            boolean z4 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strM8299l2 = strM8299l + jConvert + " " + lowerCase;
                if (z4) {
                    strM8299l2 = AbstractC2875y.m8299l(strM8299l2, ",");
                }
                strM8299l = AbstractC2875y.m8299l(strM8299l2, " ");
            }
            if (z4) {
                strM8299l = strM8299l + nanos2 + " nanoseconds ";
            }
            string3 = AbstractC2875y.m8299l(strM8299l, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC2875y.m8299l(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(AbstractC18489d0.m53370k(string3, " for ", string));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public String mo31064h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: i */
    public final void m31065i(C11648g c11648g) {
        c11648g.f37619a = null;
        while (true) {
            C11648g c11648g2 = this.f37627y;
            if (c11648g2 == C11648g.f37618c) {
                return;
            }
            C11648g c11648g3 = null;
            while (c11648g2 != null) {
                C11648g c11648g4 = c11648g2.f37620b;
                if (c11648g2.f37619a != null) {
                    c11648g3 = c11648g2;
                } else if (c11648g3 != null) {
                    c11648g3.f37620b = c11648g4;
                    if (c11648g3.f37619a == null) {
                    }
                } else if (!f37622F.mo31056y(this, c11648g2, c11648g4)) {
                }
                c11648g2 = c11648g4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f37625w instanceof C11642a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f37625w != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m31066j(Object obj) {
        if (obj == null) {
            obj = f37623G;
        }
        if (!f37622F.mo31055x(this, null, obj)) {
            return false;
        }
        m31057d(this);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo31067k(Throwable th3) {
        if (!f37622F.mo31055x(this, null, new C11644c(th3))) {
            return false;
        }
        m31057d(this);
        return true;
    }

    public final String toString() {
        String strMo31064h;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(super.toString());
        sb4.append("[status=");
        if (this.f37625w instanceof C11642a) {
            sb4.append("CANCELLED");
        } else if (isDone()) {
            m31062b(sb4);
        } else {
            try {
                strMo31064h = mo31064h();
            } catch (RuntimeException e5) {
                strMo31064h = "Exception thrown from implementation: " + e5.getClass();
            }
            if (strMo31064h != null && !strMo31064h.isEmpty()) {
                sb4.append("PENDING, info=[");
                sb4.append(strMo31064h);
                sb4.append("]");
            } else if (isDone()) {
                m31062b(sb4);
            } else {
                sb4.append("PENDING");
            }
        }
        sb4.append("]");
        return sb4.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        C11648g c11648g = C11648g.f37618c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f37625w;
            if (obj2 != null) {
                return m31059f(obj2);
            }
            C11648g c11648g2 = this.f37627y;
            if (c11648g2 != c11648g) {
                C11648g c11648g3 = new C11648g();
                do {
                    AbstractC17269i abstractC17269i = f37622F;
                    abstractC17269i.mo31052h0(c11648g3, c11648g2);
                    if (abstractC17269i.mo31056y(this, c11648g2, c11648g3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f37625w;
                            } else {
                                m31065i(c11648g3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m31059f(obj);
                    }
                    c11648g2 = this.f37627y;
                } while (c11648g2 != c11648g);
            }
            return m31059f(this.f37625w);
        }
        throw new InterruptedException();
    }
}
