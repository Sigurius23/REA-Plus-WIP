package lh3;

/* JADX INFO: renamed from: lh3.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C24086i extends AbstractC24088k {

    /* JADX INFO: renamed from: y */
    public static final Object[] f95149y = new Object[0];

    /* JADX INFO: renamed from: x */
    public final C24081d f95150x;

    public C24086i(C24081d c24081d) {
        super(c24081d);
        this.f95150x = c24081d;
    }

    @Override // xg3.InterfaceC38281h
    public final void onCompleted() {
        this.f95150x.onCompleted();
    }

    @Override // xg3.InterfaceC38281h
    public final void onError(Throwable th3) {
        this.f95150x.onError(th3);
    }

    @Override // xg3.InterfaceC38281h
    public final void onNext(Object obj) {
        this.f95150x.onNext(obj);
    }
}
