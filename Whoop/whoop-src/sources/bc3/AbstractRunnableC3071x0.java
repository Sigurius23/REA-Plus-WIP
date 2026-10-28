package bc3;

import hc3.C17168b0;
import hc3.C17191x;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: bc3.x0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractRunnableC3071x0 implements Runnable, Comparable, InterfaceC3056s0 {
    private volatile Object _heap;

    /* JADX INFO: renamed from: w */
    public long f12106w;

    /* JADX INFO: renamed from: x */
    public int f12107x = -1;

    public AbstractRunnableC3071x0(long j7) {
        this.f12106w = j7;
    }

    /* JADX INFO: renamed from: b */
    public final int m8827b(long j7, C3074y0 c3074y0, AbstractC3077z0 abstractC3077z0) {
        synchronized (this) {
            if (this._heap == AbstractC3006f0.f12016b) {
                return 2;
            }
            synchronized (c3074y0) {
                try {
                    AbstractRunnableC3071x0[] abstractRunnableC3071x0Arr = c3074y0.f65964a;
                    AbstractRunnableC3071x0 abstractRunnableC3071x0 = abstractRunnableC3071x0Arr != null ? abstractRunnableC3071x0Arr[0] : null;
                    if (AbstractC3077z0.f12112G.get(abstractC3077z0) == 1) {
                        return 1;
                    }
                    if (abstractRunnableC3071x0 == null) {
                        c3074y0.f12108c = j7;
                    } else {
                        long j13 = abstractRunnableC3071x0.f12106w;
                        if (j13 - j7 < 0) {
                            j7 = j13;
                        }
                        if (j7 - c3074y0.f12108c > 0) {
                            c3074y0.f12108c = j7;
                        }
                    }
                    long j14 = this.f12106w;
                    long j15 = c3074y0.f12108c;
                    if (j14 - j15 < 0) {
                        this.f12106w = j15;
                    }
                    c3074y0.m48488a(this);
                    return 0;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8828c(C3074y0 c3074y0) {
        if (this._heap == AbstractC3006f0.f12016b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = c3074y0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j7 = this.f12106w - ((AbstractRunnableC3071x0) obj).f12106w;
        if (j7 > 0) {
            return 1;
        }
        return j7 < 0 ? -1 : 0;
    }

    @Override // bc3.InterfaceC3056s0
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C17191x c17191x = AbstractC3006f0.f12016b;
                if (obj == c17191x) {
                    return;
                }
                C3074y0 c3074y0 = obj instanceof C3074y0 ? (C3074y0) obj : null;
                if (c3074y0 != null) {
                    synchronized (c3074y0) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof C17168b0 ? (C17168b0) obj2 : null) != null) {
                            c3074y0.m48489b(this.f12107x);
                        }
                    }
                }
                this._heap = c17191x;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public String toString() {
        return AbstractC2875y.m8302o(new StringBuilder("Delayed[nanos="), this.f12106w, ']');
    }
}
