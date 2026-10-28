package p390p1;

import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: p1.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C28616g0 implements InterfaceC28691z1 {

    /* JADX INFO: renamed from: w */
    public final Function1 f115771w;

    /* JADX INFO: renamed from: x */
    public InterfaceC28620h0 f115772x;

    public C28616g0(Function1 function1) {
        this.f115771w = function1;
    }

    @Override // p390p1.InterfaceC28691z1
    /* JADX INFO: renamed from: a */
    public final void mo15502a() {
        this.f115772x = (InterfaceC28620h0) this.f115771w.invoke(AbstractC28683x.f116019b);
    }

    @Override // p390p1.InterfaceC28691z1
    /* JADX INFO: renamed from: c */
    public final void mo15503c() {
    }

    @Override // p390p1.InterfaceC28691z1
    /* JADX INFO: renamed from: d */
    public final void mo15504d() {
        InterfaceC28620h0 interfaceC28620h0 = this.f115772x;
        if (interfaceC28620h0 != null) {
            interfaceC28620h0.dispose();
        }
        this.f115772x = null;
    }
}
