package p039c;

/* JADX INFO: renamed from: c.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C3719c extends IllegalStateException {

    /* JADX INFO: renamed from: w */
    public final Exception f15195w;

    public C3719c(Exception exc, String str) {
        super(str);
        this.f15195w = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f15195w;
    }
}
