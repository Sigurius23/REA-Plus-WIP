package d30;

import h20.C16687l;
import java.util.List;
import p031b9.AbstractC2875y;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d30.s0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11561s0 {

    /* JADX INFO: renamed from: a */
    public final List f37285a;

    /* JADX INFO: renamed from: b */
    public final boolean f37286b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC11559r0 f37287c;

    /* JADX INFO: renamed from: d */
    public final C16687l f37288d;

    /* JADX INFO: renamed from: e */
    public final EnumC11553o0 f37289e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC41211c f37290f;

    public C11561s0(List displayablePaymentMethods, boolean z4, InterfaceC11559r0 interfaceC11559r0, C16687l c16687l, EnumC11553o0 availableSavedPaymentMethodAction, InterfaceC41211c interfaceC41211c) {
        AbstractC22676k.m65750j(displayablePaymentMethods, "displayablePaymentMethods");
        AbstractC22676k.m65750j(availableSavedPaymentMethodAction, "availableSavedPaymentMethodAction");
        this.f37285a = displayablePaymentMethods;
        this.f37286b = z4;
        this.f37287c = interfaceC11559r0;
        this.f37288d = c16687l;
        this.f37289e = availableSavedPaymentMethodAction;
        this.f37290f = interfaceC41211c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11561s0)) {
            return false;
        }
        C11561s0 c11561s0 = (C11561s0) obj;
        return AbstractC22676k.m65745e(this.f37285a, c11561s0.f37285a) && this.f37286b == c11561s0.f37286b && AbstractC22676k.m65745e(this.f37287c, c11561s0.f37287c) && AbstractC22676k.m65745e(this.f37288d, c11561s0.f37288d) && this.f37289e == c11561s0.f37289e && AbstractC22676k.m65745e(this.f37290f, c11561s0.f37290f);
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(this.f37285a.hashCode() * 31, 31, this.f37286b);
        InterfaceC11559r0 interfaceC11559r0 = this.f37287c;
        int iHashCode = (iM8289b + (interfaceC11559r0 == null ? 0 : interfaceC11559r0.hashCode())) * 31;
        C16687l c16687l = this.f37288d;
        int iHashCode2 = (this.f37289e.hashCode() + ((iHashCode + (c16687l == null ? 0 : c16687l.hashCode())) * 31)) * 31;
        InterfaceC41211c interfaceC41211c = this.f37290f;
        return iHashCode2 + (interfaceC41211c != null ? interfaceC41211c.hashCode() : 0);
    }

    public final String toString() {
        return "State(displayablePaymentMethods=" + this.f37285a + ", isProcessing=" + this.f37286b + ", selection=" + this.f37287c + ", displayedSavedPaymentMethod=" + this.f37288d + ", availableSavedPaymentMethodAction=" + this.f37289e + ", mandate=" + this.f37290f + ")";
    }
}
