package my;

import h20.AbstractC16737t1;
import h20.C16671i1;
import h20.C16689l1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: my.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C26029c {

    /* JADX INFO: renamed from: a */
    public final C16671i1 f102979a;

    /* JADX INFO: renamed from: b */
    public final C16689l1 f102980b;

    /* JADX INFO: renamed from: c */
    public final AbstractC16737t1 f102981c;

    public C26029c(C16671i1 c16671i1, C16689l1 billingDetailsCollectionConfiguration, AbstractC16737t1 cardBrandAcceptance) {
        AbstractC22676k.m65750j(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        AbstractC22676k.m65750j(cardBrandAcceptance, "cardBrandAcceptance");
        this.f102979a = c16671i1;
        this.f102980b = billingDetailsCollectionConfiguration;
        this.f102981c = cardBrandAcceptance;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26029c)) {
            return false;
        }
        C26029c c26029c = (C26029c) obj;
        return AbstractC22676k.m65745e(this.f102979a, c26029c.f102979a) && AbstractC22676k.m65745e(this.f102980b, c26029c.f102980b) && AbstractC22676k.m65745e(this.f102981c, c26029c.f102981c);
    }

    public final int hashCode() {
        C16671i1 c16671i1 = this.f102979a;
        return this.f102981c.hashCode() + ((this.f102980b.hashCode() + ((c16671i1 == null ? 0 : c16671i1.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "VolatileCommonConfiguration(defaultBillingDetails=" + this.f102979a + ", billingDetailsCollectionConfiguration=" + this.f102980b + ", cardBrandAcceptance=" + this.f102981c + ")";
    }
}
