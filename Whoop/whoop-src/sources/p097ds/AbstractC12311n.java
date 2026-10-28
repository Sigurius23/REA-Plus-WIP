package p097ds;

import bi.AbstractC3269g;
import es.AbstractC13587a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import live.hms.video.factories.MediaConstraintsFactory;
import p031b9.AbstractC2875y;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: ds.n */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC12311n extends AbstractC13587a implements InterfaceFutureC12319v {

    /* JADX INFO: renamed from: E */
    public static final C12318u f41231E;

    /* JADX INFO: renamed from: F */
    public static final AbstractC3269g f41232F;

    /* JADX INFO: renamed from: G */
    public static final Object f41233G;

    /* JADX INFO: renamed from: z */
    public static final boolean f41234z;

    /* JADX INFO: renamed from: w */
    public volatile Object f41235w;

    /* JADX INFO: renamed from: x */
    public volatile C12300c f41236x;

    /* JADX INFO: renamed from: y */
    public volatile C12310m f41237y;

    static {
        boolean z4;
        Throwable th3;
        AbstractC3269g c12303f;
        try {
            z4 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", MediaConstraintsFactory.kValueFalse));
        } catch (SecurityException unused) {
            z4 = false;
        }
        f41234z = z4;
        f41231E = new C12318u(AbstractC12311n.class);
        Throwable th4 = null;
        try {
            c12303f = new C12309l();
            th3 = null;
        } catch (Error | Exception e5) {
            th3 = e5;
            try {
                c12303f = new C12301d(AtomicReferenceFieldUpdater.newUpdater(C12310m.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C12310m.class, C12310m.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC12311n.class, C12310m.class, "y"), AtomicReferenceFieldUpdater.newUpdater(AbstractC12311n.class, C12300c.class, "x"), AtomicReferenceFieldUpdater.newUpdater(AbstractC12311n.class, Object.class, StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH));
            } catch (Error | Exception e13) {
                th4 = e13;
                c12303f = new C12303f();
            }
        }
        f41232F = c12303f;
        if (th4 != null) {
            C12318u c12318u = f41231E;
            Logger loggerM34347a = c12318u.m34347a();
            Level level = Level.SEVERE;
            loggerM34347a.log(level, "UnsafeAtomicHelper is broken!", th3);
            c12318u.m34347a().log(level, "SafeAtomicHelper is broken!", th4);
        }
        f41233G = new Object();
    }

    /* JADX INFO: renamed from: e */
    public static void m34239e(AbstractC12311n abstractC12311n, boolean z4) {
        C12300c c12300c = null;
        while (true) {
            for (C12310m c12310mMo9521B = f41232F.mo9521B(abstractC12311n); c12310mMo9521B != null; c12310mMo9521B = c12310mMo9521B.f41230b) {
                Thread thread = c12310mMo9521B.f41229a;
                if (thread != null) {
                    c12310mMo9521B.f41229a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z4) {
                z4 = false;
            }
            abstractC12311n.mo34244c();
            C12300c c12300c2 = c12300c;
            C12300c c12300cMo9520A = f41232F.mo9520A(abstractC12311n);
            C12300c c12300c3 = c12300c2;
            while (c12300cMo9520A != null) {
                C12300c c12300c4 = c12300cMo9520A.f41214c;
                c12300cMo9520A.f41214c = c12300c3;
                c12300c3 = c12300cMo9520A;
                c12300cMo9520A = c12300c4;
            }
            while (c12300c3 != null) {
                c12300c = c12300c3.f41214c;
                Runnable runnable = c12300c3.f41212a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof RunnableC12302e) {
                    RunnableC12302e runnableC12302e = (RunnableC12302e) runnable;
                    abstractC12311n = runnableC12302e.f41220w;
                    if (abstractC12311n.f41235w == runnableC12302e) {
                        if (f41232F.mo9534k(abstractC12311n, runnableC12302e, m34242h(runnableC12302e.f41221x))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c12300c3.f41213b;
                    Objects.requireNonNull(executor);
                    m34240f(runnable, executor);
                }
                c12300c3 = c12300c;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m34240f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e5) {
            f41231E.m34347a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e5);
        }
    }

    /* JADX INFO: renamed from: g */
    public static Object m34241g(Object obj) throws ExecutionException {
        if (obj instanceof C12298a) {
            Throwable th3 = ((C12298a) obj).f41208b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th3);
            throw cancellationException;
        }
        if (obj instanceof C12299b) {
            throw new ExecutionException(((C12299b) obj).f41210a);
        }
        if (obj == f41233G) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static Object m34242h(InterfaceFutureC12319v interfaceFutureC12319v) {
        Object obj;
        Throwable th3;
        if (interfaceFutureC12319v instanceof InterfaceC12304g) {
            Object c12298a = ((AbstractC12311n) interfaceFutureC12319v).f41235w;
            if (c12298a instanceof C12298a) {
                C12298a c12298a2 = (C12298a) c12298a;
                if (c12298a2.f41207a) {
                    c12298a = c12298a2.f41208b != null ? new C12298a(c12298a2.f41208b, false) : C12298a.f41206d;
                }
            }
            Objects.requireNonNull(c12298a);
            return c12298a;
        }
        if (interfaceFutureC12319v instanceof AbstractC13587a) {
            AbstractC12311n abstractC12311n = (AbstractC12311n) ((AbstractC13587a) interfaceFutureC12319v);
            if (abstractC12311n instanceof InterfaceC12304g) {
                Object obj2 = abstractC12311n.f41235w;
                th3 = obj2 instanceof C12299b ? ((C12299b) obj2).f41210a : null;
                if (th3 != null) {
                    return new C12299b(th3);
                }
            } else {
                abstractC12311n.getClass();
            }
            if (th3 != null) {
                return new C12299b(th3);
            }
        }
        boolean zIsCancelled = interfaceFutureC12319v.isCancelled();
        boolean z4 = true;
        if ((!f41234z) && zIsCancelled) {
            C12298a c12298a3 = C12298a.f41206d;
            Objects.requireNonNull(c12298a3);
            return c12298a3;
        }
        boolean z13 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = interfaceFutureC12319v.get();
                        break;
                    } catch (Error e5) {
                        e = e5;
                        return new C12299b(e);
                    }
                } catch (InterruptedException unused) {
                    z13 = z4;
                } catch (Throwable th4) {
                    if (z13) {
                        Thread.currentThread().interrupt();
                    }
                    throw th4;
                }
            } catch (Error | Exception e13) {
                e = e13;
                return new C12299b(e);
            } catch (CancellationException e14) {
                if (zIsCancelled) {
                    return new C12298a(e14, false);
                }
                return new C12299b(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC12319v, e14));
            } catch (ExecutionException e15) {
                if (!zIsCancelled) {
                    return new C12299b(e15.getCause());
                }
                return new C12298a(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + interfaceFutureC12319v, e15), false);
            }
        }
        if (z13) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? f41233G : obj;
        }
        return new C12298a(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + interfaceFutureC12319v), false);
    }

    @Override // p097ds.InterfaceFutureC12319v
    /* JADX INFO: renamed from: a */
    public void mo31061a(Runnable runnable, Executor executor) {
        C12300c c12300c;
        C12300c c12300c2 = C12300c.f41211d;
        if (!isDone() && (c12300c = this.f41236x) != c12300c2) {
            C12300c c12300c3 = new C12300c(runnable, executor);
            do {
                c12300c3.f41214c = c12300c;
                if (f41232F.mo9533j(this, c12300c, c12300c3)) {
                    return;
                } else {
                    c12300c = this.f41236x;
                }
            } while (c12300c != c12300c2);
        }
        m34240f(runnable, executor);
    }

    /* JADX INFO: renamed from: b */
    public final void m34243b(StringBuilder sb4) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z4 = true;
                } catch (Throwable th3) {
                    if (z4) {
                        Thread.currentThread().interrupt();
                    }
                    throw th3;
                }
            } catch (CancellationException unused2) {
                sb4.append("CANCELLED");
                return;
            } catch (ExecutionException e5) {
                sb4.append("FAILURE, cause=[");
                sb4.append(e5.getCause());
                sb4.append("]");
                return;
            } catch (Exception e13) {
                sb4.append("UNKNOWN, cause=[");
                sb4.append(e13.getClass());
                sb4.append(" thrown from get()]");
                return;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        sb4.append("SUCCESS, result=[");
        m34245d(sb4, obj);
        sb4.append("]");
    }

    /* JADX INFO: renamed from: c */
    public void mo34244c() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z4) {
        C12298a c12298a;
        Object obj = this.f41235w;
        if (!(obj == null) && !(obj instanceof RunnableC12302e)) {
            return false;
        }
        if (f41234z) {
            c12298a = new C12298a(new CancellationException("Future.cancel() was called."), z4);
        } else {
            c12298a = z4 ? C12298a.f41205c : C12298a.f41206d;
            Objects.requireNonNull(c12298a);
        }
        AbstractC12311n abstractC12311n = this;
        boolean z13 = false;
        while (true) {
            if (f41232F.mo9534k(abstractC12311n, obj, c12298a)) {
                m34239e(abstractC12311n, z4);
                if (obj instanceof RunnableC12302e) {
                    InterfaceFutureC12319v interfaceFutureC12319v = ((RunnableC12302e) obj).f41221x;
                    if (interfaceFutureC12319v instanceof InterfaceC12304g) {
                        abstractC12311n = (AbstractC12311n) interfaceFutureC12319v;
                        obj = abstractC12311n.f41235w;
                        if ((obj == null) | (obj instanceof RunnableC12302e)) {
                            z13 = true;
                        }
                    } else {
                        interfaceFutureC12319v.cancel(z4);
                    }
                }
                return true;
            }
            obj = abstractC12311n.f41235w;
            if (!(obj instanceof RunnableC12302e)) {
                return z13;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m34245d(StringBuilder sb4, Object obj) {
        if (obj == null) {
            sb4.append("null");
        } else {
            if (obj == this) {
                sb4.append("this future");
                return;
            }
            sb4.append(obj.getClass().getName());
            sb4.append("@");
            sb4.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j7, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z4;
        long j13;
        C12310m c12310m = C12310m.f41228c;
        long nanos = timeUnit.toNanos(j7);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f41235w;
        if ((obj != null) && (!(obj instanceof RunnableC12302e))) {
            return m34241g(obj);
        }
        long j14 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C12310m c12310m2 = this.f41237y;
            if (c12310m2 != c12310m) {
                C12310m c12310m3 = new C12310m();
                z4 = true;
                while (true) {
                    AbstractC3269g abstractC3269g = f41232F;
                    abstractC3269g.mo9523Q(c12310m3, c12310m2);
                    if (abstractC3269g.mo9535l(this, c12310m2, c12310m3)) {
                        j13 = j14;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                m34247j(c12310m3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f41235w;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC12302e))) {
                                return m34241g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m34247j(c12310m3);
                        break;
                    }
                    long j15 = j14;
                    c12310m2 = this.f41237y;
                    if (c12310m2 != c12310m) {
                        j14 = j15;
                    }
                }
            }
            Object obj3 = this.f41235w;
            Objects.requireNonNull(obj3);
            return m34241g(obj3);
        }
        z4 = true;
        j13 = 0;
        while (nanos > j13) {
            Object obj4 = this.f41235w;
            if ((obj4 != null ? z4 : false) && (!(obj4 instanceof RunnableC12302e))) {
                return m34241g(obj4);
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
        if (nanos + 1000 < j13) {
            String strM8299l = AbstractC2875y.m8299l(string3, " (plus ");
            long j16 = -nanos;
            long jConvert = timeUnit.convert(j16, TimeUnit.NANOSECONDS);
            long nanos2 = j16 - timeUnit.toNanos(jConvert);
            boolean z13 = (jConvert == j13 || nanos2 > 1000) ? z4 : false;
            if (jConvert > j13) {
                String strM8299l2 = strM8299l + jConvert + " " + lowerCase;
                if (z13) {
                    strM8299l2 = AbstractC2875y.m8299l(strM8299l2, ",");
                }
                strM8299l = AbstractC2875y.m8299l(strM8299l2, " ");
            }
            if (z13) {
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
    /* JADX INFO: renamed from: i */
    public String mo34246i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f41235w instanceof C12298a;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f41235w;
        return (!(obj instanceof RunnableC12302e)) & (obj != null);
    }

    /* JADX INFO: renamed from: j */
    public final void m34247j(C12310m c12310m) {
        c12310m.f41229a = null;
        while (true) {
            C12310m c12310m2 = this.f41237y;
            if (c12310m2 == C12310m.f41228c) {
                return;
            }
            C12310m c12310m3 = null;
            while (c12310m2 != null) {
                C12310m c12310m4 = c12310m2.f41230b;
                if (c12310m2.f41229a != null) {
                    c12310m3 = c12310m2;
                } else if (c12310m3 != null) {
                    c12310m3.f41230b = c12310m4;
                    if (c12310m3.f41229a == null) {
                    }
                } else if (!f41232F.mo9535l(this, c12310m2, c12310m4)) {
                }
                c12310m2 = c12310m4;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: k */
    public boolean m34248k(Throwable th3) {
        th3.getClass();
        if (!f41232F.mo9534k(this, null, new C12299b(th3))) {
            return false;
        }
        m34239e(this, false);
        return true;
    }

    public final String toString() {
        String strMo34246i;
        StringBuilder sb4 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb4.append(getClass().getSimpleName());
        } else {
            sb4.append(getClass().getName());
        }
        sb4.append('@');
        sb4.append(Integer.toHexString(System.identityHashCode(this)));
        sb4.append("[status=");
        if (isCancelled()) {
            sb4.append("CANCELLED");
        } else if (isDone()) {
            m34243b(sb4);
        } else {
            int length = sb4.length();
            sb4.append("PENDING");
            Object obj = this.f41235w;
            if (obj instanceof RunnableC12302e) {
                sb4.append(", setFuture=[");
                InterfaceFutureC12319v interfaceFutureC12319v = ((RunnableC12302e) obj).f41221x;
                try {
                    if (interfaceFutureC12319v == this) {
                        sb4.append("this future");
                    } else {
                        sb4.append(interfaceFutureC12319v);
                    }
                } catch (Exception e5) {
                    e = e5;
                    sb4.append("Exception thrown from implementation: ");
                    sb4.append(e.getClass());
                } catch (StackOverflowError e13) {
                    e = e13;
                    sb4.append("Exception thrown from implementation: ");
                    sb4.append(e.getClass());
                }
                sb4.append("]");
            } else {
                try {
                    strMo34246i = mo34246i();
                    if (strMo34246i == null || strMo34246i.isEmpty()) {
                        strMo34246i = null;
                    }
                } catch (Exception | StackOverflowError e14) {
                    strMo34246i = "Exception thrown from implementation: " + e14.getClass();
                }
                if (strMo34246i != null) {
                    sb4.append(", info=[");
                    sb4.append(strMo34246i);
                    sb4.append("]");
                }
            }
            if (isDone()) {
                sb4.delete(length, sb4.length());
                m34243b(sb4);
            }
        }
        sb4.append("]");
        return sb4.toString();
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        C12310m c12310m = C12310m.f41228c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f41235w;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC12302e))) {
                return m34241g(obj2);
            }
            C12310m c12310m2 = this.f41237y;
            if (c12310m2 != c12310m) {
                C12310m c12310m3 = new C12310m();
                do {
                    AbstractC3269g abstractC3269g = f41232F;
                    abstractC3269g.mo9523Q(c12310m3, c12310m2);
                    if (abstractC3269g.mo9535l(this, c12310m2, c12310m3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f41235w;
                            } else {
                                m34247j(c12310m3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC12302e))));
                        return m34241g(obj);
                    }
                    c12310m2 = this.f41237y;
                } while (c12310m2 != c12310m);
            }
            Object obj3 = this.f41235w;
            Objects.requireNonNull(obj3);
            return m34241g(obj3);
        }
        throw new InterruptedException();
    }
}
