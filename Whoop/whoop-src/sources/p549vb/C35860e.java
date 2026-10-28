package p549vb;

/* JADX INFO: renamed from: vb.e */
/* JADX INFO: loaded from: classes.dex */
public final class C35860e extends RuntimeException {

    /* JADX INFO: renamed from: w */
    public final EnumC35861f f152671w;

    /* JADX INFO: renamed from: x */
    public final Throwable f152672x;

    public C35860e(EnumC35861f enumC35861f, Throwable th3) {
        super(th3);
        this.f152671w = enumC35861f;
        this.f152672x = th3;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f152672x;
    }
}
