package p199ho;

/* JADX INFO: renamed from: ho.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C17526g implements Comparable {

    /* JADX INFO: renamed from: w */
    public final int f67789w;

    /* JADX INFO: renamed from: x */
    public final C17522c f67790x;

    public C17526g(int i13, C17522c c17522c) {
        this.f67789w = i13;
        this.f67790x = c17522c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f67789w, ((C17526g) obj).f67789w);
    }
}
