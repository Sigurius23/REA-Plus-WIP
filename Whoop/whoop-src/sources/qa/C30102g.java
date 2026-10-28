package qa;

/* JADX INFO: renamed from: qa.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C30102g implements Comparable {

    /* JADX INFO: renamed from: w */
    public final long f122830w;

    /* JADX INFO: renamed from: x */
    public final byte[] f122831x;

    public C30102g(long j7, byte[] bArr) {
        this.f122830w = j7;
        this.f122831x = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f122830w, ((C30102g) obj).f122830w);
    }
}
