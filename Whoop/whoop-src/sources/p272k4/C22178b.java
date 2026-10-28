package p272k4;

import p108e4.AbstractC12682p;
import p108e4.C12685s;
import p242j4.C21302b;
import p242j4.C21307g;
import p319m4.AbstractC25021j;
import p319m4.C25013b;

/* JADX INFO: renamed from: k4.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C22178b extends C21307g {

    /* JADX INFO: renamed from: n0 */
    public int f86002n0;

    /* JADX INFO: renamed from: o0 */
    public int f86003o0;

    /* JADX INFO: renamed from: p0 */
    public C25013b f86004p0;

    public C22178b(C12685s c12685s) {
        super(c12685s, 5);
    }

    @Override // p242j4.C21307g, p242j4.C21302b, p242j4.InterfaceC21308h
    public final void apply() {
        mo59831s();
        int iM35485e = AbstractC12682p.m35485e(this.f86002n0);
        int i13 = 1;
        if (iM35485e != 1 && iM35485e != 3) {
            if (iM35485e != 4) {
                i13 = iM35485e != 5 ? 0 : 3;
            } else {
                i13 = 2;
            }
        }
        C25013b c25013b = this.f86004p0;
        c25013b.f97851t0 = i13;
        c25013b.f97853v0 = this.f86003o0;
    }

    @Override // p242j4.C21302b
    /* JADX INFO: renamed from: k */
    public final C21302b mo59819k(int i13) {
        this.f86003o0 = i13;
        return this;
    }

    @Override // p242j4.C21302b
    /* JADX INFO: renamed from: l */
    public final C21302b mo59820l(Float f13) {
        this.f86003o0 = this.f81470k0.m35493c(f13);
        return this;
    }

    @Override // p242j4.C21307g
    /* JADX INFO: renamed from: s */
    public final AbstractC25021j mo59831s() {
        if (this.f86004p0 == null) {
            this.f86004p0 = new C25013b();
        }
        return this.f86004p0;
    }

    /* JADX INFO: renamed from: t */
    public final void m63485t(int i13) {
        this.f86002n0 = i13;
    }
}
