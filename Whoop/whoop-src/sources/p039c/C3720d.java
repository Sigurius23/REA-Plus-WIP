package p039c;

/* JADX INFO: renamed from: c.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C3720d extends IllegalStateException {

    /* JADX INFO: renamed from: w */
    public final Exception f15196w;

    public C3720d(Exception exc, String str) {
        super(str);
        this.f15196w = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f15196w;
    }
}
