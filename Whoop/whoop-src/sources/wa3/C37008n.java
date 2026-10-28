package wa3;

/* JADX INFO: renamed from: wa3.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C37008n implements Comparable {

    /* JADX INFO: renamed from: w */
    public final int f158357w;

    /* JADX INFO: renamed from: x */
    public final EnumC37011o0 f158358x;

    /* JADX INFO: renamed from: y */
    public final boolean f158359y;

    public C37008n(int i13, EnumC37011o0 enumC37011o0, boolean z4) {
        this.f158357w = i13;
        this.f158358x = enumC37011o0;
        this.f158359y = z4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f158357w - ((C37008n) obj).f158357w;
    }
}
