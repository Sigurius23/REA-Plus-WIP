package w00;

import com.stripe.android.p056ui.core.elements.ExternalPaymentMethodSpec;
import p479s4.AbstractC32128i;
import p696zy.InterfaceC41211c;
import u00.C34378f;
import v00.AbstractC35485p0;
import v00.C35459c0;

/* JADX INFO: renamed from: w00.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C36670w extends AbstractC35485p0 {

    /* JADX INFO: renamed from: a */
    public final ExternalPaymentMethodSpec f157067a;

    public C36670w(ExternalPaymentMethodSpec externalPaymentMethodSpec) {
        this.f157067a = externalPaymentMethodSpec;
    }

    @Override // v00.AbstractC35485p0
    /* JADX INFO: renamed from: l */
    public final C34378f mo112560l(C35459c0 c35459c0) {
        ExternalPaymentMethodSpec externalPaymentMethodSpec = this.f157067a;
        return new C34378f(externalPaymentMethodSpec.getType(), (InterfaceC41211c) AbstractC32128i.m100055i(externalPaymentMethodSpec.getLabel()), 0, (Integer) 0, externalPaymentMethodSpec.getLightImageUrl(), externalPaymentMethodSpec.getDarkImageUrl(), false, (InterfaceC41211c) null, (Integer) null, 770);
    }
}
