package p316m1;

import js2.C21930h;
import p005a3.InterfaceC0216j2;
import p005a3.InterfaceC0240p2;
import p026b2.AbstractC2316v;
import p209i3.InterfaceC18044z;

/* JADX INFO: renamed from: m1.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C24895c0 extends AbstractC2316v implements InterfaceC0240p2, InterfaceC0216j2 {

    /* JADX INFO: renamed from: O */
    public C21930h f97520O;

    /* JADX INFO: renamed from: P */
    public boolean f97521P;

    @Override // p005a3.InterfaceC0216j2
    /* JADX INFO: renamed from: H0 */
    public final boolean mo542H0() {
        return true;
    }

    @Override // p005a3.InterfaceC0240p2
    /* JADX INFO: renamed from: f */
    public final Object mo276f() {
        return C24897d0.f97525a;
    }

    @Override // p005a3.InterfaceC0216j2
    /* JADX INFO: renamed from: n */
    public final void mo471n(InterfaceC18044z interfaceC18044z) {
        if (this.f97521P) {
            return;
        }
        this.f97520O.invoke(interfaceC18044z);
    }
}
