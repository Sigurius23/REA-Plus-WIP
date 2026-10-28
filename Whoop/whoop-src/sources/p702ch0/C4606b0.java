package p702ch0;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import zg0.C40626i;

/* JADX INFO: renamed from: ch0.b0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C4606b0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18529w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C40626i f18530x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f18531y;

    public /* synthetic */ C4606b0(Function1 function1, C40626i c40626i) {
        this.f18531y = function1;
        this.f18530x = c40626i;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f18529w) {
            case 0:
                return AbstractC4609c0.m14293K(this.f18531y, this.f18530x);
            default:
                return Function1.m14404M(this.f18530x, this.f18531y);
        }
    }

    public /* synthetic */ C4606b0(C40626i c40626i, Function1 function1) {
        this.f18530x = c40626i;
        this.f18531y = function1;
    }
}
