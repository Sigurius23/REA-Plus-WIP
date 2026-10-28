package th;

/* JADX INFO: renamed from: th.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C33805c implements AutoCloseable {

    /* JADX INFO: renamed from: w */
    public final C33804b f141588w;

    /* JADX INFO: renamed from: x */
    public boolean f141589x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C33807e f141590y;

    public C33805c(C33807e c33807e, C33804b c33804b) {
        this.f141590y = c33807e;
        this.f141588w = c33804b;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f141589x) {
            return;
        }
        this.f141589x = true;
        C33807e c33807e = this.f141590y;
        synchronized (c33807e.f141595H) {
            C33804b c33804b = this.f141588w;
            int i13 = c33804b.f141586h - 1;
            c33804b.f141586h = i13;
            if (i13 == 0 && c33804b.f141584f) {
                c33807e.m106964T(c33804b);
            }
        }
    }
}
