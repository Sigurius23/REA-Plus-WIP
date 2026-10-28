package h20;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38977v3;

/* JADX INFO: renamed from: h20.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C16693m {

    /* JADX INFO: renamed from: a */
    public final String f64212a;

    /* JADX INFO: renamed from: b */
    public final String f64213b;

    /* JADX INFO: renamed from: c */
    public final C38977v3 f64214c;

    public C16693m(String paymentElementCallbackIdentifier, String type, C38977v3 c38977v3) {
        AbstractC22676k.m65750j(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        AbstractC22676k.m65750j(type, "type");
        this.f64212a = paymentElementCallbackIdentifier;
        this.f64213b = type;
        this.f64214c = c38977v3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16693m)) {
            return false;
        }
        C16693m c16693m = (C16693m) obj;
        return AbstractC22676k.m65745e(this.f64212a, c16693m.f64212a) && AbstractC22676k.m65745e(this.f64213b, c16693m.f64213b) && AbstractC22676k.m65745e(this.f64214c, c16693m.f64214c);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.f64212a.hashCode() * 31, 31, this.f64213b);
        C38977v3 c38977v3 = this.f64214c;
        return iM30450d + (c38977v3 == null ? 0 : c38977v3.hashCode());
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ExternalPaymentMethodInput(paymentElementCallbackIdentifier=", this.f64212a, ", type=", this.f64213b, ", billingDetails=");
        sbM32001t.append(this.f64214c);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
