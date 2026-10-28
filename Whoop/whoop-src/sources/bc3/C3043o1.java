package bc3;

import hc3.C17175h;

/* JADX INFO: renamed from: bc3.o1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3043o1 extends AbstractC3035m1 {

    /* JADX INFO: renamed from: E */
    public final C3060t1 f12065E;

    /* JADX INFO: renamed from: F */
    public final C3047p1 f12066F;

    /* JADX INFO: renamed from: G */
    public final C3049q f12067G;

    /* JADX INFO: renamed from: H */
    public final Object f12068H;

    public C3043o1(C3060t1 c3060t1, C3047p1 c3047p1, C3049q c3049q, Object obj) {
        this.f12065E = c3060t1;
        this.f12066F = c3047p1;
        this.f12067G = c3049q;
        this.f12068H = obj;
    }

    @Override // bc3.AbstractC3035m1
    /* JADX INFO: renamed from: i */
    public final boolean mo8685i() {
        return false;
    }

    @Override // bc3.AbstractC3035m1
    /* JADX INFO: renamed from: j */
    public final void mo8686j(Throwable th3) {
        C3049q c3049q = this.f12067G;
        C3049q c3049qM8798O = C3060t1.m8798O(c3049q);
        C3060t1 c3060t1 = this.f12065E;
        C3047p1 c3047p1 = this.f12066F;
        Object obj = this.f12068H;
        if (c3049qM8798O == null || !c3060t1.m8815Y(c3047p1, c3049qM8798O, obj)) {
            c3047p1.f12073w.m48525c(new C17175h(2), 2);
            C3049q c3049qM8798O2 = C3060t1.m8798O(c3049q);
            if (c3049qM8798O2 == null || !c3060t1.m8815Y(c3047p1, c3049qM8798O2, obj)) {
                c3060t1.mo8694j(c3060t1.m8823z(c3047p1, obj));
            }
        }
    }
}
