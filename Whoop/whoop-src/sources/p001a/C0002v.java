package p001a;

/* JADX INFO: renamed from: a.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C0002v extends IllegalStateException {

    /* JADX INFO: renamed from: w */
    public final Exception f5w;

    public C0002v(Exception exc, String str) {
        super(str);
        this.f5w = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f5w;
    }
}
