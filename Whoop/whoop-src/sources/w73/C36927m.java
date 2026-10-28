package w73;

import l73.InterfaceC23413d;
import n73.InterfaceC26443b;
import q73.EnumC30024c;

/* JADX INFO: renamed from: w73.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C36927m implements InterfaceC23413d, InterfaceC26443b {

    /* JADX INFO: renamed from: w */
    public final InterfaceC23413d f157995w;

    /* JADX INFO: renamed from: x */
    public InterfaceC26443b f157996x;

    public C36927m(InterfaceC23413d interfaceC23413d) {
        this.f157995w = interfaceC23413d;
    }

    @Override // l73.InterfaceC23413d
    /* JADX INFO: renamed from: b */
    public final void mo13591b(InterfaceC26443b interfaceC26443b) {
        if (EnumC30024c.m91917c(this.f157996x, interfaceC26443b)) {
            this.f157996x = interfaceC26443b;
            this.f157995w.mo13591b(this);
        }
    }

    @Override // n73.InterfaceC26443b
    public final void dispose() {
        this.f157996x.dispose();
    }

    @Override // n73.InterfaceC26443b
    public final boolean isDisposed() {
        return this.f157996x.isDisposed();
    }

    @Override // l73.InterfaceC23413d
    public final void onComplete() {
        this.f157995w.onComplete();
    }

    @Override // l73.InterfaceC23413d
    public final void onError(Throwable th3) {
        this.f157995w.onError(th3);
    }

    @Override // l73.InterfaceC23413d
    public final void onNext(Object obj) {
        this.f157995w.onNext(obj);
    }
}
