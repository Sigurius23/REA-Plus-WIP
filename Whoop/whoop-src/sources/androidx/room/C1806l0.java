package androidx.room;

import p518ub.AbstractC34729b;
import p549vb.C35858c;
import p578wb.C37024a;

/* JADX INFO: renamed from: androidx.room.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1806l0 extends AbstractC34729b {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1812n0 f7110b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1806l0(C1812n0 c1812n0, int i13) {
        super(i13);
        this.f7110b = c1812n0;
    }

    @Override // p518ub.AbstractC34729b
    /* JADX INFO: renamed from: c */
    public final void mo5428c(C35858c c35858c) {
        this.f7110b.m5441c(new C37024a(c35858c));
    }

    @Override // p518ub.AbstractC34729b
    /* JADX INFO: renamed from: d */
    public final void mo5429d(C35858c c35858c, int i13, int i14) {
        mo5431f(c35858c, i13, i14);
    }

    @Override // p518ub.AbstractC34729b
    /* JADX INFO: renamed from: e */
    public final void mo5430e(C35858c c35858c) {
        C37024a c37024a = new C37024a(c35858c);
        C1812n0 c1812n0 = this.f7110b;
        c1812n0.m5443e(c37024a);
        c1812n0.f7125h = c35858c;
    }

    @Override // p518ub.AbstractC34729b
    /* JADX INFO: renamed from: f */
    public final void mo5431f(C35858c c35858c, int i13, int i14) {
        this.f7110b.m5442d(i13, i14, new C37024a(c35858c));
    }
}
