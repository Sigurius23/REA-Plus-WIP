package p292l1;

import c93.InterfaceC4339a;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l1.j2 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C23117j2 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91343w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C23196w3 f91344x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f91345y;

    public /* synthetic */ C23117j2(C23196w3 c23196w3, InterfaceC4339a interfaceC4339a, int i13) {
        this.f91343w = i13;
        this.f91344x = c23196w3;
        this.f91345y = interfaceC4339a;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f91343w) {
            case 0:
                if (!this.f91344x.m67153e()) {
                    this.f91345y.invoke();
                }
                break;
            default:
                if (!this.f91344x.m67153e()) {
                    this.f91345y.invoke();
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
