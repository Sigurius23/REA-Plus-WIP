package p623xr;

import p460rg.AbstractC31375j;

/* JADX INFO: renamed from: xr.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C38610f extends AbstractC38611g {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ AbstractC38611g f166113E;

    /* JADX INFO: renamed from: y */
    public final transient int f166114y;

    /* JADX INFO: renamed from: z */
    public final transient int f166115z;

    public C38610f(AbstractC38611g abstractC38611g, int i13, int i14) {
        this.f166113E = abstractC38611g;
        this.f166114y = i13;
        this.f166115z = i14;
    }

    @Override // p623xr.AbstractC38608d
    /* JADX INFO: renamed from: c */
    public final int mo123807c() {
        return this.f166113E.mo123808d() + this.f166114y + this.f166115z;
    }

    @Override // p623xr.AbstractC38608d
    /* JADX INFO: renamed from: d */
    public final int mo123808d() {
        return this.f166113E.mo123808d() + this.f166114y;
    }

    @Override // p623xr.AbstractC38608d
    /* JADX INFO: renamed from: e */
    public final Object[] mo123809e() {
        return this.f166113E.mo123809e();
    }

    @Override // p623xr.AbstractC38611g, java.util.List
    /* JADX INFO: renamed from: f */
    public final AbstractC38611g subList(int i13, int i14) {
        AbstractC31375j.m96488d(i13, i14, this.f166115z);
        int i15 = this.f166114y;
        return this.f166113E.subList(i13 + i15, i14 + i15);
    }

    @Override // java.util.List
    public final Object get(int i13) {
        AbstractC31375j.m96486b(i13, this.f166115z);
        return this.f166113E.get(i13 + this.f166114y);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f166115z;
    }
}
