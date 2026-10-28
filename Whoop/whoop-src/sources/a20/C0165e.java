package a20;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p266jz.C22057e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a20.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C0165e extends AbstractC0166f {

    /* JADX INFO: renamed from: a */
    public final String f492a;

    /* JADX INFO: renamed from: b */
    public final String f493b;

    /* JADX INFO: renamed from: c */
    public final String f494c;

    /* JADX INFO: renamed from: d */
    public final C22057e f495d;

    public C0165e(String publishableKey, String financialConnectionsSessionSecret, String str, C22057e c22057e) {
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        AbstractC22676k.m65750j(financialConnectionsSessionSecret, "financialConnectionsSessionSecret");
        this.f492a = publishableKey;
        this.f493b = financialConnectionsSessionSecret;
        this.f494c = str;
        this.f495d = c22057e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0165e)) {
            return false;
        }
        C0165e c0165e = (C0165e) obj;
        return AbstractC22676k.m65745e(this.f492a, c0165e.f492a) && AbstractC22676k.m65745e(this.f493b, c0165e.f493b) && AbstractC22676k.m65745e(this.f494c, c0165e.f494c) && AbstractC22676k.m65745e(this.f495d, c0165e.f495d);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.f492a.hashCode() * 31, 31, this.f493b);
        String str = this.f494c;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        C22057e c22057e = this.f495d;
        return iHashCode + (c22057e != null ? c22057e.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("OpenConnectionsFlow(publishableKey=", this.f492a, ", financialConnectionsSessionSecret=", this.f493b, ", stripeAccountId=");
        sbM32001t.append(this.f494c);
        sbM32001t.append(", elementsSessionContext=");
        sbM32001t.append(this.f495d);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
