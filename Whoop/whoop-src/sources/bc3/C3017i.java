package bc3;

import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bc3.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C3017i implements InterfaceC3021j {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f12036w;

    /* JADX INFO: renamed from: x */
    public final Object f12037x;

    public /* synthetic */ C3017i(Object obj, int i13) {
        this.f12036w = i13;
        this.f12037x = obj;
    }

    @Override // bc3.InterfaceC3021j
    /* JADX INFO: renamed from: a */
    public final void mo8688a(Throwable th3) {
        switch (this.f12036w) {
            case 0:
                ((Function1) this.f12037x).invoke(th3);
                break;
            default:
                ((InterfaceC3056s0) this.f12037x).dispose();
                break;
        }
    }

    public final String toString() {
        switch (this.f12036w) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((Function1) this.f12037x).getClass().getSimpleName() + '@' + AbstractC3006f0.m8724r(this) + ']';
            default:
                return "DisposeOnCancel[" + ((InterfaceC3056s0) this.f12037x) + ']';
        }
    }
}
