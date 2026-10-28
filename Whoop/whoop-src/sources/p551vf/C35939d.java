package p551vf;

import p326mf.AbstractC25491k;
import p326mf.AbstractC25492l;
import p647yf.C39490c;
import p647yf.InterfaceC39508u;

/* JADX INFO: renamed from: vf.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C35939d extends AbstractC25491k {

    /* JADX INFO: renamed from: a */
    public final Long f153023a;

    /* JADX INFO: renamed from: b */
    public final boolean f153024b;

    /* JADX INFO: renamed from: c */
    public final boolean f153025c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ byte[] f153026d;

    public C35939d(AbstractC25492l abstractC25492l, byte[] bArr) {
        this.f153026d = bArr;
        this.f153023a = abstractC25492l.mo74901a();
        this.f153024b = abstractC25492l.mo74902c();
        this.f153025c = abstractC25492l.mo74904b();
    }

    @Override // p326mf.AbstractC25492l
    /* JADX INFO: renamed from: a */
    public final Long mo74901a() {
        return this.f153023a;
    }

    @Override // p326mf.AbstractC25492l
    /* JADX INFO: renamed from: b */
    public final boolean mo74904b() {
        return this.f153025c;
    }

    @Override // p326mf.AbstractC25492l
    /* JADX INFO: renamed from: c */
    public final boolean mo74902c() {
        return this.f153024b;
    }

    @Override // p326mf.AbstractC25491k
    /* JADX INFO: renamed from: d */
    public final InterfaceC39508u mo74903d() {
        return new C39490c(this.f153026d);
    }
}
