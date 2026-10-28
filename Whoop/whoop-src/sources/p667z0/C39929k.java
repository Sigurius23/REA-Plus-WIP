package p667z0;

import e10.C12554k0;
import p043c4.InterfaceC3964i0;
import p636y3.C39178j;
import p636y3.C39179k;
import p636y3.C39180l;
import p636y3.EnumC39181m;

/* JADX INFO: renamed from: z0.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C39929k implements InterfaceC3964i0 {

    /* JADX INFO: renamed from: E */
    public C39178j f172366E;

    /* JADX INFO: renamed from: w */
    public final C12554k0 f172367w;

    /* JADX INFO: renamed from: x */
    public C39180l f172368x;

    /* JADX INFO: renamed from: y */
    public EnumC39181m f172369y;

    /* JADX INFO: renamed from: z */
    public C39180l f172370z;

    public C39929k(C12554k0 c12554k0) {
        this.f172367w = c12554k0;
    }

    @Override // p043c4.InterfaceC3964i0
    /* JADX INFO: renamed from: i */
    public final long mo11994i(C39179k c39179k, long j7, EnumC39181m enumC39181m, long j13) {
        C39178j c39178j = this.f172366E;
        if (c39178j != null) {
            C39180l c39180l = this.f172368x;
            if ((c39180l == null ? false : C39180l.m124799a(c39180l.f168422a, j7)) && this.f172369y == enumC39181m) {
                C39180l c39180l2 = this.f172370z;
                if (c39180l2 != null ? C39180l.m124799a(c39180l2.f168422a, j13) : false) {
                    return c39178j.f168416a;
                }
            }
        }
        long jMo11994i = this.f172367w.mo11994i(c39179k, j7, enumC39181m, j13);
        this.f172368x = new C39180l(j7);
        this.f172369y = enumC39181m;
        this.f172370z = new C39180l(j13);
        this.f172366E = new C39178j(jMo11994i);
        return jMo11994i;
    }
}
