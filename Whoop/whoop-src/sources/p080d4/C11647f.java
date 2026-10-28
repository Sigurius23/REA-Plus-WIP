package p080d4;

import hg3.AbstractC17269i;

/* JADX INFO: renamed from: d4.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C11647f extends AbstractC17269i {
    @Override // hg3.AbstractC17269i
    /* JADX INFO: renamed from: h0 */
    public final void mo31052h0(C11648g c11648g, C11648g c11648g2) {
        c11648g.f37620b = c11648g2;
    }

    @Override // hg3.AbstractC17269i
    /* JADX INFO: renamed from: i0 */
    public final void mo31053i0(C11648g c11648g, Thread thread) {
        c11648g.f37619a = thread;
    }

    @Override // hg3.AbstractC17269i
    /* JADX INFO: renamed from: w */
    public final boolean mo31054w(AbstractC11649h abstractC11649h, C11645d c11645d, C11645d c11645d2) {
        synchronized (abstractC11649h) {
            try {
                if (abstractC11649h.f37626x != c11645d) {
                    return false;
                }
                abstractC11649h.f37626x = c11645d2;
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // hg3.AbstractC17269i
    /* JADX INFO: renamed from: x */
    public final boolean mo31055x(AbstractC11649h abstractC11649h, Object obj, Object obj2) {
        synchronized (abstractC11649h) {
            try {
                if (abstractC11649h.f37625w != obj) {
                    return false;
                }
                abstractC11649h.f37625w = obj2;
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // hg3.AbstractC17269i
    /* JADX INFO: renamed from: y */
    public final boolean mo31056y(AbstractC11649h abstractC11649h, C11648g c11648g, C11648g c11648g2) {
        synchronized (abstractC11649h) {
            try {
                if (abstractC11649h.f37627y != c11648g) {
                    return false;
                }
                abstractC11649h.f37627y = c11648g2;
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
