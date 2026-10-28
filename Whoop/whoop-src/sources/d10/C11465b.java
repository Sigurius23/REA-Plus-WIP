package d10;

import h20.InterfaceC16627b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d10.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C11465b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC16627b f36803a;

    public C11465b(InterfaceC16627b interfaceC16627b) {
        this.f36803a = interfaceC16627b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11465b) && AbstractC22676k.m65745e(this.f36803a, ((C11465b) obj).f36803a);
    }

    public final int hashCode() {
        InterfaceC16627b interfaceC16627b = this.f36803a;
        return (interfaceC16627b == null ? 0 : interfaceC16627b.hashCode()) * (-1807454463);
    }

    public final String toString() {
        return "PaymentElementCallbacks(createIntentCallback=" + this.f36803a + ", createIntentWithConfirmationTokenCallback=null, confirmCustomPaymentMethodCallback=null, externalPaymentMethodConfirmHandler=null, analyticEventCallback=null, rowSelectionCallback=null, shopPayHandlers=null, preparePaymentMethodHandler=null, createCardPresentSetupIntentCallback=null)";
    }
}
