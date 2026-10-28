package gh3;

import bh3.AbstractC3258e;
import bh3.C3257d;
import bh3.InterfaceC3255b;
import xg3.AbstractC38292s;

/* JADX INFO: renamed from: gh3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C15856a extends AbstractC38292s {

    /* JADX INFO: renamed from: E */
    public final InterfaceC3255b f59947E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC3255b f59948F;

    /* JADX INFO: renamed from: G */
    public final C3257d f59949G = AbstractC3258e.f12762a;

    public C15856a(InterfaceC3255b interfaceC3255b, InterfaceC3255b interfaceC3255b2) {
        this.f59947E = interfaceC3255b;
        this.f59948F = interfaceC3255b2;
    }

    @Override // xg3.InterfaceC38281h
    public final void onCompleted() {
        this.f59949G.getClass();
    }

    @Override // xg3.InterfaceC38281h
    public final void onError(Throwable th3) {
        this.f59948F.mo9472b(th3);
    }

    @Override // xg3.AbstractC38292s, xg3.InterfaceC38281h
    public final void onNext(Object obj) {
        this.f59947E.mo9472b(obj);
    }
}
