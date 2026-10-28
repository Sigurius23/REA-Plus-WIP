package qu2;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: qu2.d */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C30636d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f125986w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f125987x;

    public /* synthetic */ C30636d(Function1 function1, int i13) {
        this.f125986w = i13;
        this.f125987x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f125986w) {
            case 0:
                return AbstractC30640h.m94133i0(this.f125987x);
            case 1:
                return AbstractC30640h.m94161v0(this.f125987x);
            default:
                return AbstractC30640h.m94163w0(this.f125987x);
        }
    }
}
