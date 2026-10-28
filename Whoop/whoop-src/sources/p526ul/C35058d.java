package p526ul;

/* JADX INFO: renamed from: ul.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C35058d {

    /* JADX INFO: renamed from: a */
    public volatile boolean f148549a;

    /* JADX INFO: renamed from: a */
    public final void m110830a(boolean z4) {
        this.f148549a = z4;
    }

    /* JADX INFO: renamed from: b */
    public final void m110831b() {
        if (this.f148549a) {
            throw new IllegalStateException("Already released");
        }
    }
}
