package lh3;

import ch3.C4697n;
import ih3.C18529b;

/* JADX INFO: renamed from: lh3.j */
/* JADX INFO: loaded from: classes5.dex */
public class C24087j extends AbstractC24088k {

    /* JADX INFO: renamed from: x */
    private final C18529b f95151x;

    /* JADX INFO: renamed from: y */
    private final AbstractC24088k f95152y;

    public C24087j(AbstractC24088k abstractC24088k) {
        super(new C4697n(abstractC24088k, 3));
        this.f95152y = abstractC24088k;
        this.f95151x = new C18529b(abstractC24088k);
    }

    @Override // xg3.InterfaceC38281h
    public void onCompleted() {
        this.f95151x.onCompleted();
    }

    @Override // xg3.InterfaceC38281h
    public void onError(Throwable th3) {
        this.f95151x.onError(th3);
    }

    @Override // xg3.InterfaceC38281h
    public void onNext(Object obj) {
        this.f95151x.onNext(obj);
    }
}
