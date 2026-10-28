package p690zr;

import java.util.Comparator;

/* JADX INFO: renamed from: zr.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C41059w extends AbstractC41063y {
    /* JADX INFO: renamed from: f */
    public static AbstractC41063y m133307f(int i13) {
        if (i13 < 0) {
            return AbstractC41063y.f177073b;
        }
        return i13 > 0 ? AbstractC41063y.f177074c : AbstractC41063y.f177072a;
    }

    @Override // p690zr.AbstractC41063y
    /* JADX INFO: renamed from: a */
    public final AbstractC41063y mo133308a(int i13, int i14) {
        return m133307f(Integer.compare(i13, i14));
    }

    @Override // p690zr.AbstractC41063y
    /* JADX INFO: renamed from: b */
    public final AbstractC41063y mo133309b(Object obj, Object obj2, Comparator comparator) {
        return m133307f(comparator.compare(obj, obj2));
    }

    @Override // p690zr.AbstractC41063y
    /* JADX INFO: renamed from: c */
    public final AbstractC41063y mo133310c(boolean z4, boolean z13) {
        return m133307f(Boolean.compare(z4, z13));
    }

    @Override // p690zr.AbstractC41063y
    /* JADX INFO: renamed from: d */
    public final AbstractC41063y mo133311d(boolean z4, boolean z13) {
        return m133307f(Boolean.compare(z13, z4));
    }

    @Override // p690zr.AbstractC41063y
    /* JADX INFO: renamed from: e */
    public final int mo133312e() {
        return 0;
    }
}
