package n10;

import d10.AbstractC11464a;
import d10.C11465b;
import g73.C15556d;
import p715kotlin.jvm.internal.AbstractC22676k;
import v03.InterfaceC35517d;
import v03.InterfaceC35521h;

/* JADX INFO: renamed from: n10.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C26137k0 implements InterfaceC35517d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f103550w;

    /* JADX INFO: renamed from: x */
    public final C15556d f103551x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC35521h f103552y;

    public /* synthetic */ C26137k0(C15556d c15556d, InterfaceC35517d interfaceC35517d, int i13) {
        this.f103550w = i13;
        this.f103551x = c15556d;
        this.f103552y = interfaceC35517d;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        switch (this.f103550w) {
            case 0:
                String paymentElementCallbackIdentifier = (String) this.f103552y.get();
                this.f103551x.getClass();
                AbstractC22676k.m65750j(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
                C11465b c11465bM30761a = AbstractC11464a.m30761a(paymentElementCallbackIdentifier);
                if (c11465bM30761a != null) {
                    return c11465bM30761a.f36803a;
                }
                return null;
            case 1:
                String paymentElementCallbackIdentifier2 = (String) this.f103552y.get();
                this.f103551x.getClass();
                AbstractC22676k.m65750j(paymentElementCallbackIdentifier2, "paymentElementCallbackIdentifier");
                AbstractC11464a.m30761a(paymentElementCallbackIdentifier2);
                return null;
            default:
                String paymentElementCallbackIdentifier3 = (String) this.f103552y.get();
                this.f103551x.getClass();
                AbstractC22676k.m65750j(paymentElementCallbackIdentifier3, "paymentElementCallbackIdentifier");
                AbstractC11464a.m30761a(paymentElementCallbackIdentifier3);
                return null;
        }
    }
}
