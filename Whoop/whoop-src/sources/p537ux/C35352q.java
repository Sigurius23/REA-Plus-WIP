package p537ux;

import cd.C4421a;
import ih0.AbstractC18489d0;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import k40.AbstractC22186a;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.C25271y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import y00.EnumC38853i;
import y00.EnumC38863j;

/* JADX INFO: renamed from: ux.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C35352q {

    /* JADX INFO: renamed from: f */
    public static final List f150591f = AbstractC37056f.m118959K("PAN_ONLY", "CRYPTOGRAM_3DS");

    /* JADX INFO: renamed from: g */
    public static final List f150592g = AbstractC37056f.m118959K("AMEX", "DISCOVER", "MASTERCARD", "VISA");

    /* JADX INFO: renamed from: h */
    public static final Object f150593h = AbstractC25247g0.m73990Y(new C23465k("AMEX", EnumC38853i.AmericanExpress), new C23465k("DISCOVER", EnumC38853i.Discover), new C23465k("MASTERCARD", EnumC38853i.MasterCard), new C23465k("VISA", EnumC38853i.Visa), new C23465k("JCB", EnumC38853i.JCB));

    /* JADX INFO: renamed from: a */
    public final C4421a f150594a;

    /* JADX INFO: renamed from: b */
    public final boolean f150595b;

    /* JADX INFO: renamed from: c */
    public final List f150596c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC35320a f150597d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC35322b f150598e;

    public C35352q(C4421a c4421a, boolean z4, List additionalEnabledNetworks, InterfaceC35320a cardBrandFilter, InterfaceC35322b cardFundingFilter) {
        AbstractC22676k.m65750j(additionalEnabledNetworks, "additionalEnabledNetworks");
        AbstractC22676k.m65750j(cardBrandFilter, "cardBrandFilter");
        AbstractC22676k.m65750j(cardFundingFilter, "cardFundingFilter");
        this.f150594a = c4421a;
        this.f150595b = z4;
        this.f150596c = additionalEnabledNetworks;
        this.f150597d = cardBrandFilter;
        this.f150598e = cardFundingFilter;
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m112194c(C35352q c35352q, C35350p transactionInfo, C35340k c35340k, C35338j c35338j, boolean z4, Boolean bool) throws JSONException {
        String str;
        c35352q.getClass();
        AbstractC22676k.m65750j(transactionInfo, "transactionInfo");
        String str2 = c35340k.f150555w;
        JSONObject jSONObjectPut = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0).put("allowedPaymentMethods", new JSONArray().put(c35352q.m112195a(c35338j, bool, false)));
        JSONObject jSONObject = new JSONObject();
        String str3 = transactionInfo.f150584w;
        Locale locale = Locale.ROOT;
        String upperCase = str3.toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        JSONObject jSONObjectPut2 = jSONObject.put("currencyCode", upperCase).put("totalPriceStatus", transactionInfo.f150585x.f150577w);
        String str4 = transactionInfo.f150586y;
        if (str4 != null) {
            String upperCase2 = str4.toUpperCase(locale);
            AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
            jSONObjectPut2.put("countryCode", upperCase2);
        }
        String str5 = transactionInfo.f150587z;
        if (str5 != null) {
            jSONObjectPut2.put("transactionId", str5);
        }
        Long l7 = transactionInfo.f150581E;
        if (l7 != null) {
            long jLongValue = l7.longValue();
            String upperCase3 = str3.toUpperCase(locale);
            AbstractC22676k.m65749i(upperCase3, "toUpperCase(...)");
            Currency currency = Currency.getInstance(upperCase3);
            AbstractC22676k.m65749i(currency, "getInstance(...)");
            int iM63530a = AbstractC22186a.m63530a(currency);
            int length = String.valueOf(jLongValue).length();
            StringBuilder sb4 = new StringBuilder();
            if (iM63530a == 0) {
                for (int i13 = 0; i13 < length; i13++) {
                    sb4.append('#');
                }
                DecimalFormat decimalFormat = new DecimalFormat(sb4.toString(), DecimalFormatSymbols.getInstance(Locale.ROOT));
                decimalFormat.setCurrency(currency);
                decimalFormat.setGroupingUsed(false);
                str = decimalFormat.format(jLongValue);
                AbstractC22676k.m65749i(str, "format(...)");
            } else {
                int i14 = length - iM63530a;
                for (int i15 = 0; i15 < i14; i15++) {
                    sb4.append('#');
                }
                if (length <= iM63530a) {
                    sb4.append('0');
                }
                sb4.append('.');
                for (int i16 = 0; i16 < iM63530a; i16++) {
                    sb4.append('0');
                }
                double dPow = jLongValue / Math.pow(10.0d, iM63530a);
                DecimalFormat decimalFormat2 = new DecimalFormat(sb4.toString(), DecimalFormatSymbols.getInstance(Locale.ROOT));
                decimalFormat2.setCurrency(currency);
                decimalFormat2.setGroupingUsed(false);
                str = decimalFormat2.format(dPow);
                AbstractC22676k.m65749i(str, "format(...)");
            }
            jSONObjectPut2.put("totalPrice", str);
        }
        String str6 = transactionInfo.f150582F;
        if (str6 != null) {
            jSONObjectPut2.put("totalPriceLabel", str6);
        }
        EnumC35346n enumC35346n = transactionInfo.f150583G;
        if (enumC35346n != null) {
            jSONObjectPut2.put("checkoutOption", enumC35346n.f150569w);
        }
        AbstractC22676k.m65749i(jSONObjectPut2, "apply(...)");
        JSONObject jSONObjectPut3 = jSONObjectPut.put("transactionInfo", jSONObjectPut2).put("emailRequired", z4);
        JSONObject jSONObject2 = new JSONObject();
        if (str2 != null && str2.length() != 0) {
            jSONObject2.put("merchantName", str2);
        }
        jSONObject2.put("softwareInfo", new JSONObject().put("id", c35340k.f150556x.f150564w.f150561w).put("version", "22.6.1"));
        jSONObjectPut3.put("merchantInfo", jSONObject2);
        return jSONObjectPut3;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public final JSONObject m112195a(C35338j c35338j, Boolean bool, boolean z4) throws JSONException {
        List listM118958J;
        ArrayList arrayListM74129g1;
        String strM53370k;
        List list = this.f150596c;
        List list2 = C25271y.f99162w;
        boolean z13 = this.f150595b;
        List list3 = f150592g;
        if (z4) {
            List list4 = list3;
            listM118958J = z13 ? AbstractC37056f.m118958J("JCB") : null;
            if (listM118958J != null) {
                list2 = listM118958J;
            }
            arrayListM74129g1 = AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(list4, list2), list);
        } else {
            List list5 = list3;
            listM118958J = z13 ? AbstractC37056f.m118958J("JCB") : null;
            if (listM118958J != null) {
                list2 = listM118958J;
            }
            ArrayList arrayListM74129g2 = AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(list5, list2), list);
            ArrayList arrayList = new ArrayList();
            for (Object obj : arrayListM74129g2) {
                EnumC38853i enumC38853i = (EnumC38853i) f150593h.get((String) obj);
                if (enumC38853i == null) {
                    enumC38853i = EnumC38853i.Unknown;
                }
                if (this.f150597d.mo112179o(enumC38853i)) {
                    arrayList.add(obj);
                }
            }
            arrayListM74129g1 = arrayList;
        }
        JSONObject jSONObjectPut = new JSONObject().put("allowedAuthMethods", new JSONArray((Collection) f150591f)).put("allowedCardNetworks", new JSONArray((Collection) arrayListM74129g1));
        AbstractC22676k.m65749i(jSONObjectPut, "put(...)");
        if (c35338j != null && c35338j.f150548w) {
            jSONObjectPut.put("billingAddressRequired", true);
            jSONObjectPut.put("billingAddressParameters", new JSONObject().put("phoneNumberRequired", c35338j.f150550y).put("format", c35338j.f150549x.f150544w));
        }
        EnumC38863j enumC38863j = EnumC38863j.Credit;
        InterfaceC35322b interfaceC35322b = this.f150598e;
        jSONObjectPut.put("allowCreditCards", interfaceC35322b.mo112183F(enumC38863j) & bool.booleanValue());
        jSONObjectPut.put("allowPrepaidCards", interfaceC35322b.mo112183F(EnumC38863j.Prepaid));
        JSONObject jSONObjectPut2 = new JSONObject().put("type", "CARD").put("parameters", jSONObjectPut);
        C4421a c4421a = this.f150594a;
        c4421a.getClass();
        JSONObject jSONObjectPut3 = new JSONObject().put("type", "PAYMENT_GATEWAY");
        JSONObject jSONObjectPut4 = new JSONObject().put("gateway", "stripe").put("stripe:version", "StripeAndroid/" + c4421a.f17887d);
        String str = c4421a.f17886c;
        String str2 = c4421a.f17885b;
        if (str2 != null && (strM53370k = AbstractC18489d0.m53370k(str, "/", str2)) != null) {
            str = strM53370k;
        }
        JSONObject jSONObjectPut5 = jSONObjectPut3.put("parameters", jSONObjectPut4.put("stripe:publishableKey", str));
        AbstractC22676k.m65749i(jSONObjectPut5, "put(...)");
        JSONObject jSONObjectPut6 = jSONObjectPut2.put("tokenizationSpecification", jSONObjectPut5);
        AbstractC22676k.m65749i(jSONObjectPut6, "put(...)");
        return jSONObjectPut6;
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m112196b(C35338j c35338j, Boolean bool, Boolean bool2) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0).put("allowedPaymentMethods", new JSONArray().put(m112195a(c35338j, bool2, true)));
        jSONObjectPut.put("existingPaymentMethodRequired", bool.booleanValue());
        AbstractC22676k.m65749i(jSONObjectPut, "apply(...)");
        return jSONObjectPut;
    }

    public /* synthetic */ C35352q(C4421a c4421a, List list, InterfaceC35320a interfaceC35320a, InterfaceC35322b interfaceC35322b, int i13) {
        this(c4421a, false, (i13 & 4) != 0 ? C25271y.f99162w : list, interfaceC35320a, interfaceC35322b);
    }
}
