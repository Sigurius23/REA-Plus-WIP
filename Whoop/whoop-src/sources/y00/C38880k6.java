package y00;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25272z;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: y00.k6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38880k6 {

    /* JADX INFO: renamed from: a */
    public final String f167329a;

    /* JADX INFO: renamed from: b */
    public final String f167330b;

    /* JADX INFO: renamed from: c */
    public final String f167331c;

    /* JADX INFO: renamed from: d */
    public final String f167332d;

    /* JADX INFO: renamed from: e */
    public final String f167333e;

    /* JADX INFO: renamed from: f */
    public final Locale f167334f;

    /* JADX INFO: renamed from: g */
    public final Long f167335g;

    /* JADX INFO: renamed from: h */
    public final String f167336h;

    /* JADX INFO: renamed from: i */
    public final String f167337i;

    /* JADX INFO: renamed from: j */
    public final EnumC38884l0 f167338j;

    /* JADX INFO: renamed from: k */
    public final String f167339k;

    /* JADX INFO: renamed from: l */
    public final String f167340l;

    public C38880k6(String email, String str, String str2, String countryInferringMethod, String str3, Locale locale, Long l7, String str4, String str5, EnumC38884l0 consentAction, String str6, String str7) {
        AbstractC22676k.m65750j(email, "email");
        AbstractC22676k.m65750j(countryInferringMethod, "countryInferringMethod");
        AbstractC22676k.m65750j(consentAction, "consentAction");
        this.f167329a = email;
        this.f167330b = str;
        this.f167331c = str2;
        this.f167332d = countryInferringMethod;
        this.f167333e = str3;
        this.f167334f = locale;
        this.f167335g = l7;
        this.f167336h = str4;
        this.f167337i = str5;
        this.f167338j = consentAction;
        this.f167339k = str6;
        this.f167340l = str7;
    }

    /* JADX INFO: renamed from: a */
    public final Map m124357a() {
        String lowerCase = this.f167329a.toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("email_address", lowerCase), new C23465k("amount", this.f167335g), new C23465k("currency", this.f167336h), new C23465k("consent_action", this.f167338j.f167364w), new C23465k("request_surface", this.f167337i), new C23465k("country_inferring_method", this.f167332d));
        Locale locale = this.f167334f;
        if (locale != null) {
            linkedHashMapM73993b0.put("locale", locale.toLanguageTag());
        }
        String str = this.f167330b;
        if (str != null) {
            if (AbstractC39414r.m125890i0(str)) {
                str = null;
            }
            if (str != null) {
                linkedHashMapM73993b0.put("phone_number", str);
            }
        }
        String str2 = this.f167331c;
        if (str2 != null) {
            if (AbstractC39414r.m125890i0(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                linkedHashMapM73993b0.put("country", str2);
            }
        }
        String str3 = this.f167333e;
        if (str3 != null) {
            String str4 = AbstractC39414r.m125890i0(str3) ? null : str3;
            if (str4 != null) {
                linkedHashMapM73993b0.put("legal_name", str4);
            }
        }
        String str5 = this.f167339k;
        if (str5 != null) {
            linkedHashMapM73993b0.put("android_verification_token", str5);
        }
        String str6 = this.f167340l;
        if (str6 != null) {
            linkedHashMapM73993b0.put("app_id", str6);
        }
        linkedHashMapM73993b0.putAll(C25272z.f99163w);
        return AbstractC25247g0.m74001j0(linkedHashMapM73993b0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38880k6)) {
            return false;
        }
        C38880k6 c38880k6 = (C38880k6) obj;
        return AbstractC22676k.m65745e(this.f167329a, c38880k6.f167329a) && AbstractC22676k.m65745e(this.f167330b, c38880k6.f167330b) && AbstractC22676k.m65745e(this.f167331c, c38880k6.f167331c) && AbstractC22676k.m65745e(this.f167332d, c38880k6.f167332d) && AbstractC22676k.m65745e(this.f167333e, c38880k6.f167333e) && AbstractC22676k.m65745e(this.f167334f, c38880k6.f167334f) && AbstractC22676k.m65745e(this.f167335g, c38880k6.f167335g) && AbstractC22676k.m65745e(this.f167336h, c38880k6.f167336h) && this.f167337i.equals(c38880k6.f167337i) && this.f167338j == c38880k6.f167338j && AbstractC22676k.m65745e(this.f167339k, c38880k6.f167339k) && AbstractC22676k.m65745e(this.f167340l, c38880k6.f167340l);
    }

    public final int hashCode() {
        int iHashCode = this.f167329a.hashCode() * 31;
        String str = this.f167330b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f167331c;
        int iM30450d = AbstractC11266d.m30450d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f167332d);
        String str3 = this.f167333e;
        int iHashCode3 = (iM30450d + (str3 == null ? 0 : str3.hashCode())) * 31;
        Locale locale = this.f167334f;
        int iHashCode4 = (iHashCode3 + (locale == null ? 0 : locale.hashCode())) * 31;
        Long l7 = this.f167335g;
        int iHashCode5 = (iHashCode4 + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str4 = this.f167336h;
        int iHashCode6 = (this.f167338j.hashCode() + AbstractC11266d.m30450d((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 961, 31, this.f167337i)) * 31;
        String str5 = this.f167339k;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f167340l;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SignUpParams(email=", this.f167329a, ", phoneNumber=", this.f167330b, ", country=");
        AbstractC11266d.m30444B(sbM32001t, this.f167331c, ", countryInferringMethod=", this.f167332d, ", name=");
        sbM32001t.append(this.f167333e);
        sbM32001t.append(", locale=");
        sbM32001t.append(this.f167334f);
        sbM32001t.append(", amount=");
        sbM32001t.append(this.f167335g);
        sbM32001t.append(", currency=");
        sbM32001t.append(this.f167336h);
        sbM32001t.append(", incentiveEligibilitySession=null, requestSurface=");
        sbM32001t.append(this.f167337i);
        sbM32001t.append(", consentAction=");
        sbM32001t.append(this.f167338j);
        sbM32001t.append(", verificationToken=");
        return AbstractC11266d.m30464r(sbM32001t, this.f167339k, ", appId=", this.f167340l, ")");
    }
}
