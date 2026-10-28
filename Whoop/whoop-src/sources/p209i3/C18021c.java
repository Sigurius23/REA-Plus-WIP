package p209i3;

import p005a3.InterfaceC0216j2;
import p026b2.AbstractC2316v;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: i3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C18021c extends AbstractC2316v implements InterfaceC0216j2 {

    /* JADX INFO: renamed from: O */
    public boolean f69935O;

    /* JADX INFO: renamed from: P */
    public final boolean f69936P;

    /* JADX INFO: renamed from: Q */
    public Function1 f69937Q;

    public C18021c(Function1 function1, boolean z4, boolean z13) {
        this.f69935O = z4;
        this.f69936P = z13;
        this.f69937Q = function1;
    }

    @Override // p005a3.InterfaceC0216j2
    /* JADX INFO: renamed from: H0 */
    public final boolean mo542H0() {
        return this.f69935O;
    }

    @Override // p005a3.InterfaceC0216j2
    /* JADX INFO: renamed from: n */
    public final void mo471n(InterfaceC18044z interfaceC18044z) {
        this.f69937Q.invoke(interfaceC18044z);
    }

    @Override // p005a3.InterfaceC0216j2
    /* JADX INFO: renamed from: p */
    public final boolean mo544p() {
        return this.f69936P;
    }
}
