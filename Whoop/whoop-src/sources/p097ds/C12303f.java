package p097ds;

import bi.AbstractC3269g;

/* JADX INFO: renamed from: ds.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C12303f extends AbstractC3269g {
    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: A */
    public final C12300c mo9520A(AbstractC12311n abstractC12311n) {
        C12300c c12300c;
        C12300c c12300c2 = C12300c.f41211d;
        synchronized (abstractC12311n) {
            try {
                c12300c = abstractC12311n.f41236x;
                if (c12300c != c12300c2) {
                    abstractC12311n.f41236x = c12300c2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return c12300c;
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: B */
    public final C12310m mo9521B(AbstractC12311n abstractC12311n) {
        C12310m c12310m;
        C12310m c12310m2 = C12310m.f41228c;
        synchronized (abstractC12311n) {
            try {
                c12310m = abstractC12311n.f41237y;
                if (c12310m != c12310m2) {
                    abstractC12311n.f41237y = c12310m2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return c12310m;
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: Q */
    public final void mo9523Q(C12310m c12310m, C12310m c12310m2) {
        c12310m.f41230b = c12310m2;
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: R */
    public final void mo9524R(C12310m c12310m, Thread thread) {
        c12310m.f41229a = thread;
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: j */
    public final boolean mo9533j(AbstractC12311n abstractC12311n, C12300c c12300c, C12300c c12300c2) {
        synchronized (abstractC12311n) {
            try {
                if (abstractC12311n.f41236x != c12300c) {
                    return false;
                }
                abstractC12311n.f41236x = c12300c2;
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: k */
    public final boolean mo9534k(AbstractC12311n abstractC12311n, Object obj, Object obj2) {
        synchronized (abstractC12311n) {
            try {
                if (abstractC12311n.f41235w != obj) {
                    return false;
                }
                abstractC12311n.f41235w = obj2;
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // bi.AbstractC3269g
    /* JADX INFO: renamed from: l */
    public final boolean mo9535l(AbstractC12311n abstractC12311n, C12310m c12310m, C12310m c12310m2) {
        synchronized (abstractC12311n) {
            try {
                if (abstractC12311n.f41237y != c12310m) {
                    return false;
                }
                abstractC12311n.f41237y = c12310m2;
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
