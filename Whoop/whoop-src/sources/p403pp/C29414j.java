package p403pp;

import bi.AbstractC3269g;

/* JADX INFO: renamed from: pp.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C29414j extends AbstractC3269g {
    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: d0 */
    public final void mo9527d0(C29419o c29419o, Thread thread) {
        c29419o.f119451a = thread;
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: e0 */
    public final void mo9528e0(C29419o c29419o, C29419o c29419o2) {
        c29419o.f119452b = c29419o2;
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: f0 */
    public final boolean mo9529f0(AbstractFutureC29420p abstractFutureC29420p, C29419o c29419o, C29419o c29419o2) {
        synchronized (abstractFutureC29420p) {
            try {
                if (abstractFutureC29420p.f119459H != c29419o) {
                    return false;
                }
                abstractFutureC29420p.f119459H = c29419o2;
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: g0 */
    public final C29419o mo9530g0(C29406b c29406b) {
        C29419o c29419o;
        C29419o c29419o2 = C29419o.f119450c;
        synchronized (c29406b) {
            try {
                c29419o = c29406b.f119459H;
                if (c29419o != c29419o2) {
                    c29406b.f119459H = c29419o2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return c29419o;
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: h0 */
    public final C29412h mo9531h0(C29406b c29406b) {
        C29412h c29412h;
        C29412h c29412h2 = C29412h.f119437b;
        synchronized (c29406b) {
            try {
                c29412h = c29406b.f119458G;
                if (c29412h != c29412h2) {
                    c29406b.f119458G = c29412h2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return c29412h;
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: i0 */
    public final boolean mo9532i0(AbstractFutureC29420p abstractFutureC29420p, Object obj, Object obj2) {
        synchronized (abstractFutureC29420p) {
            try {
                if (abstractFutureC29420p.f119457F != obj) {
                    return false;
                }
                abstractFutureC29420p.f119457F = obj2;
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
