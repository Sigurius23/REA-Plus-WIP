package mp;

/* JADX INFO: renamed from: mp.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C25786m extends AbstractC25788n {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ AbstractC25788n f101512E;

    /* JADX INFO: renamed from: y */
    public final transient int f101513y;

    /* JADX INFO: renamed from: z */
    public final transient int f101514z;

    public C25786m(AbstractC25788n abstractC25788n, int i13, int i14) {
        this.f101512E = abstractC25788n;
        this.f101513y = i13;
        this.f101514z = i14;
    }

    @Override // mp.AbstractC25774i
    /* JADX INFO: renamed from: c */
    public final int mo75980c() {
        return this.f101512E.mo75981d() + this.f101513y + this.f101514z;
    }

    @Override // mp.AbstractC25774i
    /* JADX INFO: renamed from: d */
    public final int mo75981d() {
        return this.f101512E.mo75981d() + this.f101513y;
    }

    @Override // mp.AbstractC25774i
    /* JADX INFO: renamed from: f */
    public final Object[] mo75983f() {
        return this.f101512E.mo75983f();
    }

    @Override // java.util.List
    public final Object get(int i13) {
        AbstractC25753b.m75993e(i13, this.f101514z);
        return this.f101512E.get(i13 + this.f101513y);
    }

    @Override // mp.AbstractC25788n, java.util.List
    /* JADX INFO: renamed from: j */
    public final AbstractC25788n subList(int i13, int i14) {
        AbstractC25753b.m76001m(i13, i14, this.f101514z);
        int i15 = this.f101513y;
        return this.f101512E.subList(i13 + i15, i14 + i15);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f101514z;
    }
}
