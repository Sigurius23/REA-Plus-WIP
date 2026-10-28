package sg2;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;
import rg2.C31397i;

/* JADX INFO: renamed from: sg2.k */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C32460k implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f134443w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f134444x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C31397i f134445y;

    public /* synthetic */ C32460k(Function1 function1, C31397i c31397i, int i13) {
        this.f134443w = i13;
        this.f134444x = function1;
        this.f134445y = c31397i;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f134443w) {
            case 0:
                return AbstractC32461l.m101367g(this.f134444x, this.f134445y);
            default:
                return C32462m.m101377d(this.f134444x, this.f134445y);
        }
    }
}
