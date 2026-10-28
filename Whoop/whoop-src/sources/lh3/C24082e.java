package lh3;

/* JADX INFO: renamed from: lh3.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C24082e extends AbstractC24088k {

    /* JADX INFO: renamed from: x */
    public final C24081d f95137x;

    public C24082e(C24081d c24081d) {
        super(c24081d);
        this.f95137x = c24081d;
    }

    /* JADX INFO: renamed from: Y */
    public static C24082e m71000Y() {
        C24081d c24081d = new C24081d();
        c24081d.lazySet(C24081d.f95133y);
        return new C24082e(c24081d);
    }

    @Override // xg3.InterfaceC38281h
    public final void onCompleted() {
        this.f95137x.onCompleted();
    }

    @Override // xg3.InterfaceC38281h
    public final void onError(Throwable th3) {
        this.f95137x.onError(th3);
    }

    @Override // xg3.InterfaceC38281h
    public final void onNext(Object obj) {
        this.f95137x.onNext(obj);
    }
}
