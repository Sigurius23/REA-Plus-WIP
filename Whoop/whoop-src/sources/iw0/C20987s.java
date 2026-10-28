package iw0;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: iw0.s */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C20987s implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f79293w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f79294x;

    public /* synthetic */ C20987s(Function1 function1, int i13) {
        this.f79293w = i13;
        this.f79294x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f79293w) {
            case 0:
                return AbstractC20992x.m58443o1(this.f79294x);
            case 1:
                return AbstractC20992x.m58394X0(this.f79294x);
            default:
                return AbstractC20992x.m58398Z0(this.f79294x);
        }
    }
}
