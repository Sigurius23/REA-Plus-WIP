package p403pp;

import bi.AbstractC3269g;
import com.google.android.gms.tasks.Task;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: pp.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C29406b extends AbstractFutureC29420p {

    /* JADX INFO: renamed from: M */
    public Task f119429M;

    /* JADX INFO: renamed from: N */
    public static Object m89685N(Object obj) throws ExecutionException {
        if (obj instanceof C29410f) {
            Throwable th3 = ((C29410f) obj).f119435a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th3);
            throw cancellationException;
        }
        if (obj instanceof C29411g) {
            throw new ExecutionException(((C29411g) obj).f119436a);
        }
        if (obj == AbstractFutureC29420p.f119453I) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: O */
    public static Object m89686O(C29406b c29406b) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                obj = c29406b.get();
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

    /* JADX INFO: renamed from: P */
    public static void m89687P(C29406b c29406b) {
        for (C29419o c29419oMo9530g0 = AbstractFutureC29420p.f119456L.mo9530g0(c29406b); c29419oMo9530g0 != null; c29419oMo9530g0 = c29419oMo9530g0.f119452b) {
            Thread thread = c29419oMo9530g0.f119451a;
            if (thread != null) {
                c29419oMo9530g0.f119451a = null;
                LockSupport.unpark(thread);
            }
        }
        c29406b.f119429M = null;
        C29412h c29412hMo9531h0 = AbstractFutureC29420p.f119456L.mo9531h0(c29406b);
        C29412h c29412h = null;
        while (c29412hMo9531h0 != null) {
            C29412h c29412h2 = c29412hMo9531h0.f119438a;
            c29412hMo9531h0.f119438a = c29412h;
            c29412h = c29412hMo9531h0;
            c29412hMo9531h0 = c29412h2;
        }
        if (c29412h != null) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m89688Q(StringBuilder sb4) {
        try {
            Object objM89686O = m89686O(this);
            sb4.append("SUCCESS, result=[");
            if (objM89686O == null) {
                sb4.append("null");
            } else if (objM89686O == this) {
                sb4.append("this future");
            } else {
                sb4.append(objM89686O.getClass().getName());
                sb4.append("@");
                sb4.append(Integer.toHexString(System.identityHashCode(objM89686O)));
            }
            sb4.append("]");
        } catch (CancellationException unused) {
            sb4.append("CANCELLED");
        } catch (ExecutionException e5) {
            sb4.append("FAILURE, cause=[");
            sb4.append(e5.getCause());
            sb4.append("]");
        } catch (Exception e13) {
            sb4.append("UNKNOWN, cause=[");
            sb4.append(e13.getClass());
            sb4.append(" thrown from get()]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        C29410f c29410f;
        Object obj = this.f119457F;
        if (obj != null) {
            return false;
        }
        if (AbstractFutureC29420p.f119455K) {
            c29410f = new C29410f(z4, new CancellationException("Future.cancel() was called."));
        } else {
            c29410f = z4 ? C29410f.f119433b : C29410f.f119434c;
            Objects.requireNonNull(c29410f);
        }
        if (!AbstractFutureC29420p.f119456L.mo9532i0(this, obj, c29410f)) {
            return false;
        }
        m89687P(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        C29419o c29419o = C29419o.f119450c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f119457F;
        if (obj2 != null) {
            return m89685N(obj2);
        }
        C29419o c29419o2 = this.f119459H;
        if (c29419o2 != c29419o) {
            C29419o c29419o3 = new C29419o();
            do {
                AbstractC3269g abstractC3269g = AbstractFutureC29420p.f119456L;
                abstractC3269g.mo9528e0(c29419o3, c29419o2);
                if (abstractC3269g.mo9529f0(this, c29419o2, c29419o3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m89692M(c29419o3);
                            throw new InterruptedException();
                        }
                        obj = this.f119457F;
                    } while (obj == null);
                    return m89685N(obj);
                }
                c29419o2 = this.f119459H;
            } while (c29419o2 != c29419o);
        }
        Object obj3 = this.f119457F;
        Objects.requireNonNull(obj3);
        return m89685N(obj3);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f119457F instanceof C29410f;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f119457F != null;
    }

    public final String toString() {
        String strConcat;
        StringBuilder sb4 = new StringBuilder();
        if (C29406b.class.getName().startsWith("com.google.common.util.concurrent.")) {
            sb4.append(C29406b.class.getSimpleName());
        } else {
            sb4.append(C29406b.class.getName());
        }
        sb4.append('@');
        sb4.append(Integer.toHexString(System.identityHashCode(this)));
        sb4.append("[status=");
        if (this.f119457F instanceof C29410f) {
            sb4.append("CANCELLED");
        } else if (isDone()) {
            m89688Q(sb4);
        } else {
            int length = sb4.length();
            sb4.append("PENDING");
            try {
                Task task = this.f119429M;
                strConcat = task == null ? "" : task.toString();
                if (strConcat == null || strConcat.isEmpty()) {
                    strConcat = null;
                }
            } catch (Throwable th3) {
                if ((th3 instanceof Error) && !(th3 instanceof StackOverflowError)) {
                    throw th3;
                }
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(th3.getClass()));
            }
            if (strConcat != null) {
                sb4.append(", info=[");
                sb4.append(strConcat);
                sb4.append("]");
            }
            if (isDone()) {
                sb4.delete(length, sb4.length());
                m89688Q(sb4);
            }
        }
        sb4.append("]");
        return sb4.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long j13;
        C29419o c29419o = C29419o.f119450c;
        long nanos = timeUnit.toNanos(j7);
        if (!Thread.interrupted()) {
            Object obj = this.f119457F;
            if (obj != null) {
                return m89685N(obj);
            }
            long j14 = 0;
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C29419o c29419o2 = this.f119459H;
                if (c29419o2 != c29419o) {
                    C29419o c29419o3 = new C29419o();
                    while (true) {
                        AbstractC3269g abstractC3269g = AbstractFutureC29420p.f119456L;
                        abstractC3269g.mo9528e0(c29419o3, c29419o2);
                        if (abstractC3269g.mo9529f0(this, c29419o2, c29419o3)) {
                            j13 = j14;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f119457F;
                                    if (obj2 != null) {
                                        return m89685N(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    m89692M(c29419o3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m89692M(c29419o3);
                            break;
                        }
                        long j15 = j14;
                        c29419o2 = this.f119459H;
                        if (c29419o2 != c29419o) {
                            j14 = j15;
                        }
                    }
                }
                Object obj3 = this.f119457F;
                Objects.requireNonNull(obj3);
                return m89685N(obj3);
            }
            j13 = 0;
            while (nanos > j13) {
                Object obj4 = this.f119457F;
                if (obj4 != null) {
                    return m89685N(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb4 = new StringBuilder(String.valueOf(j7).length() + 8 + String.valueOf(lowerCase2).length());
            AbstractC2875y.m8285A(sb4, "Waited ", j7, " ");
            sb4.append(lowerCase2);
            String string3 = sb4.toString();
            if (nanos + 1000 < j13) {
                String strConcat = string3.concat(" (plus ");
                long j16 = -nanos;
                long jConvert = timeUnit.convert(j16, TimeUnit.NANOSECONDS);
                long nanos2 = j16 - timeUnit.toNanos(jConvert);
                boolean z4 = jConvert == j13 || nanos2 > 1000;
                if (jConvert > j13) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(jConvert).length() + strConcat.length() + 1 + String.valueOf(lowerCase).length());
                    AbstractC2875y.m8285A(sb5, strConcat, jConvert, " ");
                    sb5.append(lowerCase);
                    String string4 = sb5.toString();
                    if (z4) {
                        string4 = string4.concat(",");
                    }
                    strConcat = string4.concat(" ");
                }
                if (z4) {
                    StringBuilder sb6 = new StringBuilder(String.valueOf(nanos2).length() + strConcat.length() + 13);
                    sb6.append(strConcat);
                    sb6.append(nanos2);
                    sb6.append(" nanoseconds ");
                    strConcat = sb6.toString();
                }
                string3 = strConcat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(AbstractC2875y.m8304q(new StringBuilder(string3.length() + 5 + String.valueOf(string).length()), string3, " for ", string));
        }
        throw new InterruptedException();
    }
}
