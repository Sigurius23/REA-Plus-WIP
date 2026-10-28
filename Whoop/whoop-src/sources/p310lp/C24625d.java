package p310lp;

import p249jc.AbstractC21598x;

/* JADX INFO: renamed from: lp.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C24625d extends AbstractC24626e {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ AbstractC24626e f96354E;

    /* JADX INFO: renamed from: y */
    public final transient int f96355y;

    /* JADX INFO: renamed from: z */
    public final transient int f96356z;

    public C24625d(AbstractC24626e abstractC24626e, int i13, int i14) {
        this.f96354E = abstractC24626e;
        this.f96355y = i13;
        this.f96356z = i14;
    }

    @Override // p310lp.AbstractC24622a
    /* JADX INFO: renamed from: a */
    public final Object[] mo71954a() {
        return this.f96354E.mo71954a();
    }

    @Override // p310lp.AbstractC24622a
    /* JADX INFO: renamed from: c */
    public final int mo71955c() {
        return this.f96354E.mo71955c() + this.f96355y;
    }

    @Override // p310lp.AbstractC24622a
    /* JADX INFO: renamed from: d */
    public final int mo71956d() {
        return this.f96354E.mo71955c() + this.f96355y + this.f96356z;
    }

    @Override // p310lp.AbstractC24626e, java.util.List
    /* JADX INFO: renamed from: g */
    public final AbstractC24626e subList(int i13, int i14) {
        AbstractC21598x.m60648D0(i13, i14, this.f96356z);
        int i15 = this.f96355y;
        return this.f96354E.subList(i13 + i15, i14 + i15);
    }

    @Override // java.util.List
    public final Object get(int i13) {
        AbstractC21598x.m60646C0(i13, this.f96356z);
        return this.f96354E.get(i13 + this.f96355y);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f96356z;
    }
}
