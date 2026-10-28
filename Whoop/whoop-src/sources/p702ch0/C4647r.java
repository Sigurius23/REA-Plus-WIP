package p702ch0;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ch0.r */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C4647r implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18934w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f18935x;

    public /* synthetic */ C4647r(Function1 function1, int i13) {
        this.f18934w = i13;
        this.f18935x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f18934w) {
            case 0:
                return AbstractC4653u.m14648n(this.f18935x);
            case 1:
                return Function1.m14435i0(this.f18935x);
            default:
                return Function1.m14410S(this.f18935x);
        }
    }
}
