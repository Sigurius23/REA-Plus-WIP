package p073cq;

import p529uo.AbstractC35135w;

/* JADX INFO: renamed from: cq.i */
/* JADX INFO: loaded from: classes.dex */
public final class C11040i {

    /* JADX INFO: renamed from: a */
    public final C11052u f34644a = new C11052u();

    public C11040i() {
    }

    /* JADX INFO: renamed from: a */
    public final void m29686a(Exception exc) {
        this.f34644a.m29704c(exc);
    }

    /* JADX INFO: renamed from: b */
    public final void m29687b(Object obj) {
        this.f34644a.m29702a(obj);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m29688c(Exception exc) {
        C11052u c11052u = this.f34644a;
        c11052u.getClass();
        AbstractC35135w.m111095g(exc, "Exception must not be null");
        synchronized (c11052u.f34667a) {
            try {
                if (c11052u.f34669c) {
                    return false;
                }
                c11052u.f34669c = true;
                c11052u.f34672f = exc;
                c11052u.f34668b.m14764b(c11052u);
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m29689d(Object obj) {
        this.f34644a.m29703b(obj);
    }

    public C11040i(AbstractC11032a abstractC11032a) {
        abstractC11032a.mo29684a(new C11048q(0, this));
    }
}
