package s20;

import h20.C16671i1;
import h20.C16689l1;
import i20.C17928b;
import java.util.LinkedHashMap;
import java.util.Map;
import l40.C23328a;
import l83.C23470p;
import m83.AbstractC25247g0;
import o20.C27457b;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.EnumC29820h;
import q80.C30036h;
import q83.AbstractC30060g;
import u30.C34496a;
import v00.InterfaceC35471i0;
import w30.InterfaceC36786c;

/* JADX INFO: renamed from: s20.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C32077a {

    /* JADX INFO: renamed from: a */
    public final String f133022a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC36786c f133023b;

    /* JADX INFO: renamed from: c */
    public final String f133024c;

    /* JADX INFO: renamed from: d */
    public final C34496a f133025d;

    /* JADX INFO: renamed from: e */
    public final C16671i1 f133026e;

    /* JADX INFO: renamed from: f */
    public final C17928b f133027f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC35471i0 f133028g;

    /* JADX INFO: renamed from: h */
    public final boolean f133029h;

    /* JADX INFO: renamed from: i */
    public final C16689l1 f133030i;

    /* JADX INFO: renamed from: j */
    public final C23470p f133031j;

    public C32077a(String paymentMethodCode, InterfaceC36786c cbcEligibility, String merchantName, C34496a c34496a, C16671i1 c16671i1, C17928b c17928b, InterfaceC35471i0 paymentMethodSaveConsentBehavior, boolean z4, C16689l1 billingDetailsCollectionConfiguration) {
        AbstractC22676k.m65750j(paymentMethodCode, "paymentMethodCode");
        AbstractC22676k.m65750j(cbcEligibility, "cbcEligibility");
        AbstractC22676k.m65750j(merchantName, "merchantName");
        AbstractC22676k.m65750j(paymentMethodSaveConsentBehavior, "paymentMethodSaveConsentBehavior");
        AbstractC22676k.m65750j(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        this.f133022a = paymentMethodCode;
        this.f133023b = cbcEligibility;
        this.f133024c = merchantName;
        this.f133025d = c34496a;
        this.f133026e = c16671i1;
        this.f133027f = c17928b;
        this.f133028g = paymentMethodSaveConsentBehavior;
        this.f133029h = z4;
        this.f133030i = billingDetailsCollectionConfiguration;
        this.f133031j = AbstractC30060g.m92088H(new C30036h(this, 24));
    }

    /* JADX INFO: renamed from: a */
    public final C27457b m99782a() {
        Map map = (Map) this.f133031j.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new C23328a((String) entry.getValue(), true));
        }
        return new C27457b(linkedHashMap, EnumC29820h.f121895z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32077a)) {
            return false;
        }
        C32077a c32077a = (C32077a) obj;
        return AbstractC22676k.m65745e(this.f133022a, c32077a.f133022a) && AbstractC22676k.m65745e(this.f133023b, c32077a.f133023b) && AbstractC22676k.m65745e(this.f133024c, c32077a.f133024c) && AbstractC22676k.m65745e(this.f133025d, c32077a.f133025d) && AbstractC22676k.m65745e(this.f133026e, c32077a.f133026e) && AbstractC22676k.m65745e(this.f133027f, c32077a.f133027f) && AbstractC22676k.m65745e(this.f133028g, c32077a.f133028g) && this.f133029h == c32077a.f133029h && AbstractC22676k.m65745e(this.f133030i, c32077a.f133030i);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.f133023b.hashCode() + (this.f133022a.hashCode() * 31)) * 31, 31, this.f133024c);
        C34496a c34496a = this.f133025d;
        int iHashCode = (iM30450d + (c34496a == null ? 0 : c34496a.hashCode())) * 31;
        C16671i1 c16671i1 = this.f133026e;
        int iHashCode2 = (iHashCode + (c16671i1 == null ? 0 : c16671i1.hashCode())) * 31;
        C17928b c17928b = this.f133027f;
        return this.f133030i.hashCode() + AbstractC2875y.m8289b((this.f133028g.hashCode() + ((iHashCode2 + (c17928b != null ? c17928b.hashCode() : 0)) * 31)) * 31, 31, this.f133029h);
    }

    public final String toString() {
        return "FormArguments(paymentMethodCode=" + this.f133022a + ", cbcEligibility=" + this.f133023b + ", merchantName=" + this.f133024c + ", amount=" + this.f133025d + ", billingDetails=" + this.f133026e + ", shippingDetails=" + this.f133027f + ", paymentMethodSaveConsentBehavior=" + this.f133028g + ", hasIntentToSetup=" + this.f133029h + ", billingDetailsCollectionConfiguration=" + this.f133030i + ")";
    }
}
