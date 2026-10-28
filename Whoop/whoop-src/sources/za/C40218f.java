package za;

/* JADX INFO: renamed from: za.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C40218f implements Comparable {

    /* JADX INFO: renamed from: w */
    public final int f173672w;

    /* JADX INFO: renamed from: x */
    public final C40214b f173673x;

    public C40218f(int i13, C40214b c40214b) {
        this.f173672w = i13;
        this.f173673x = c40214b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f173672w, ((C40218f) obj).f173672w);
    }
}
