package z00;

import androidx.core.app.NotificationCompat;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.model.StripeIntent$Status;
import com.stripe.android.model.StripeIntent$Usage;
import e93.AbstractC12889b;
import i93.C18283i;
import i93.C18284j;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
import java.util.concurrent.TimeUnit;
import l83.C23465k;
import m83.AbstractC25243e0;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p474s.AbstractC32004s;
import p477s2.AbstractC32072d;
import p477s2.AbstractC32076h;
import p499t9.C33623c0;
import p499t9.C33647p;
import p565vy.InterfaceC36562b;
import p598wy.InterfaceC37689b;
import p715kotlin.jvm.internal.AbstractC22676k;
import s30.AbstractC32100b;
import y00.C38781a7;
import y00.C38790b6;
import y00.C38791b7;
import y00.C38793c;
import y00.C38801c7;
import y00.C38811d7;
import y00.C38830f6;
import y00.C38840g6;
import y00.C38842g8;
import y00.C38915o4;
import y00.C38917o6;
import y00.C38926p6;
import y00.C38935q6;
import y00.EnumC38800c6;
import y00.EnumC38820e6;
import y00.EnumC38832f8;
import y00.EnumC38908n6;

/* JADX INFO: renamed from: z00.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C39938g implements InterfaceC37689b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f172388w;

    public /* synthetic */ C39938g(int i13) {
        this.f172388w = i13;
    }

    /* JADX INFO: renamed from: b */
    public static C38917o6 m128098b(JSONObject jSONObject) {
        Object next;
        C33647p c33647p = EnumC38908n6.f167479x;
        String strM99551t = AbstractC32004s.m99551t("type", jSONObject);
        c33647p.getClass();
        Iterator it = EnumC38908n6.f167481z.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((EnumC38908n6) next).f167482w.equals(strM99551t));
        EnumC38908n6 enumC38908n6 = (EnumC38908n6) next;
        if (enumC38908n6 != null) {
            return new C38917o6(enumC38908n6, !jSONObject.has("amount") ? null : Integer.valueOf(jSONObject.optInt("amount")), AbstractC32004s.m99551t("currency", jSONObject), AbstractC32004s.m99551t("description", jSONObject), jSONObject.has("quantity") ? Integer.valueOf(jSONObject.optInt("quantity")) : null);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static C38842g8 m128099d(JSONObject jSONObject) {
        Object next;
        String strM99551t = AbstractC32004s.m99551t("id", jSONObject);
        Long lValueOf = !jSONObject.has(AnalyticsRequestV2.PARAM_CREATED) ? null : Long.valueOf(jSONObject.optLong(AnalyticsRequestV2.PARAM_CREATED));
        C33647p c33647p = EnumC38832f8.f167151x;
        String strM99551t2 = AbstractC32004s.m99551t("type", jSONObject);
        c33647p.getClass();
        Iterator it = EnumC38832f8.f167150F.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((EnumC38832f8) next).f167154w.equals(strM99551t2));
        EnumC38832f8 enumC38832f8 = (EnumC38832f8) next;
        if (enumC38832f8 == null || strM99551t == null || lValueOf == null) {
            return null;
        }
        boolean z4 = false;
        if (jSONObject.has("used") && jSONObject.optBoolean("used", false)) {
            z4 = true;
        }
        if (jSONObject.has("livemode") && jSONObject.optBoolean("livemode", z4)) {
            z4 = true;
        }
        Date date = new Date(TimeUnit.SECONDS.toMillis(lValueOf.longValue()));
        int iOrdinal = enumC38832f8.ordinal();
        if (iOrdinal == 0) {
            boolean z13 = z4;
            EnumC38832f8 enumC38832f9 = EnumC38832f8.Card;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("card");
            if (jSONObjectOptJSONObject != null) {
                return new C38842g8(strM99551t, enumC38832f9, date, z13, z4, null, AbstractC32076h.m99777j(jSONObjectOptJSONObject), 32);
            }
            return null;
        }
        if (iOrdinal != 1) {
            return new C38842g8(strM99551t, enumC38832f8, date, z4, z4, null, null, 96);
        }
        boolean z14 = z4;
        EnumC38832f8 enumC38832f10 = EnumC38832f8.BankAccount;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("bank_account");
        if (jSONObjectOptJSONObject2 != null) {
            return new C38842g8(strM99551t, enumC38832f10, date, z14, z4, AbstractC32072d.m99707q(jSONObjectOptJSONObject2), null, 64);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: a */
    public C38840g6 m128100a(JSONObject jSONObject) {
        String str;
        ?? arrayList;
        ?? arrayList2;
        Object next;
        C38830f6 c38830f6;
        if (!"setup_intent".equals(AbstractC32004s.m99551t("object", jSONObject))) {
            return null;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("payment_method");
        C38915o4 c38915o4M128096d = jSONObjectOptJSONObject != null ? new C39932a(29).m128096d(jSONObjectOptJSONObject) : null;
        String strM99551t = AbstractC32004s.m99551t("payment_method", jSONObject);
        if (c38915o4M128096d != null) {
            strM99551t = null;
        }
        if (strM99551t != null) {
            str = strM99551t;
        } else if (c38915o4M128096d != null) {
            strM99551t = c38915o4M128096d.f167527w;
            str = strM99551t;
        } else {
            str = null;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("unactivated_payment_method_types");
        RandomAccess randomAccess = C25271y.f99162w;
        if (jSONArrayOptJSONArray != null) {
            C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, jSONArrayOptJSONArray.length());
            arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i0, 10));
            Iterator it = c18284jM36278i0.iterator();
            while (((C18283i) it).f71138y) {
                arrayList.add(jSONArrayOptJSONArray.getString(((AbstractC25243e0) it).nextInt()));
            }
        } else {
            arrayList = randomAccess;
        }
        Iterable iterable = (Iterable) arrayList;
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
        Iterator it3 = iterable.iterator();
        while (it3.hasNext()) {
            String lowerCase = ((String) it3.next()).toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            arrayList3.add(lowerCase);
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("link_funding_sources");
        if (jSONArrayOptJSONArray2 != null) {
            C18284j c18284jM36278i1 = AbstractC12889b.m36278i0(0, jSONArrayOptJSONArray2.length());
            arrayList2 = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i1, 10));
            Iterator it4 = c18284jM36278i1.iterator();
            while (((C18283i) it4).f71138y) {
                arrayList2.add(jSONArrayOptJSONArray2.getString(((AbstractC25243e0) it4).nextInt()));
            }
        } else {
            arrayList2 = randomAccess;
        }
        Iterable iterable2 = (Iterable) arrayList2;
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(iterable2, 10));
        Iterator it5 = iterable2.iterator();
        while (it5.hasNext()) {
            String lowerCase2 = ((String) it5.next()).toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
            arrayList4.add(lowerCase2);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("payment_method_options");
        String string = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("automatic_payment_methods");
        boolean z4 = jSONObjectOptJSONObject3 != null && jSONObjectOptJSONObject3.optBoolean("enabled");
        String strM99551t2 = AbstractC32004s.m99551t("id", jSONObject);
        long jOptLong = jSONObject.optLong(AnalyticsRequestV2.PARAM_CREATED);
        String strM99551t3 = AbstractC32004s.m99551t("client_secret", jSONObject);
        C33647p c33647p = EnumC38800c6.f166978x;
        String strM99551t4 = AbstractC32004s.m99551t("cancellation_reason", jSONObject);
        c33647p.getClass();
        Iterator it6 = EnumC38800c6.f166980z.iterator();
        do {
            if (!it6.hasNext()) {
                next = null;
                break;
            }
            next = it6.next();
        } while (!((EnumC38800c6) next).f166981w.equals(strM99551t4));
        EnumC38800c6 enumC38800c6 = (EnumC38800c6) next;
        String strM99551t5 = AbstractC32004s.m99551t("country_code", jSONObject);
        String strM99551t6 = AbstractC32004s.m99551t("description", jSONObject);
        boolean zOptBoolean = jSONObject.optBoolean("livemode");
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("payment_method_types");
        if (jSONArrayOptJSONArray3 != null) {
            C18284j c18284jM36278i2 = AbstractC12889b.m36278i0(0, jSONArrayOptJSONArray3.length());
            ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i2, 10));
            Iterator it7 = c18284jM36278i2.iterator();
            while (((C18283i) it7).f71138y) {
                arrayList5.add(jSONArrayOptJSONArray3.getString(((AbstractC25243e0) it7).nextInt()));
            }
            randomAccess = arrayList5;
        }
        C33647p c33647p2 = StripeIntent$Status.f22249x;
        String strM99551t7 = AbstractC32004s.m99551t(NotificationCompat.CATEGORY_STATUS, jSONObject);
        c33647p2.getClass();
        StripeIntent$Status stripeIntent$StatusM106270m = C33647p.m106270m(strM99551t7);
        C33623c0 c33623c0 = StripeIntent$Usage.f22255x;
        String strM99551t8 = AbstractC32004s.m99551t("usage", jSONObject);
        c33623c0.getClass();
        StripeIntent$Usage stripeIntent$UsageM106239n = C33623c0.m106239n(strM99551t8);
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("last_setup_error");
        if (jSONObjectOptJSONObject4 != null) {
            String strM99551t9 = AbstractC32004s.m99551t("code", jSONObjectOptJSONObject4);
            String strM99551t10 = AbstractC32004s.m99551t("decline_code", jSONObjectOptJSONObject4);
            String strM99551t11 = AbstractC32004s.m99551t("doc_url", jSONObjectOptJSONObject4);
            String strM99551t12 = AbstractC32004s.m99551t("message", jSONObjectOptJSONObject4);
            String strM99551t13 = AbstractC32004s.m99551t("param", jSONObjectOptJSONObject4);
            JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject4.optJSONObject("payment_method");
            Object obj = null;
            C38915o4 c38915o4M128096d2 = jSONObjectOptJSONObject5 != null ? new C39932a(29).m128096d(jSONObjectOptJSONObject5) : null;
            C33623c0 c33623c1 = EnumC38820e6.f167072x;
            String strM99551t14 = AbstractC32004s.m99551t("type", jSONObjectOptJSONObject4);
            c33623c1.getClass();
            for (Object obj2 : EnumC38820e6.f167074z) {
                if (((EnumC38820e6) obj2).f167075w.equals(strM99551t14)) {
                    obj = obj2;
                    break;
                }
            }
            c38830f6 = new C38830f6(strM99551t9, strM99551t10, strM99551t11, strM99551t12, strM99551t13, c38915o4M128096d2, (EnumC38820e6) obj);
        } else {
            strM99551t5 = strM99551t5;
            c38830f6 = null;
        }
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("next_action");
        return new C38840g6(strM99551t2, enumC38800c6, jOptLong, strM99551t5, strM99551t3, strM99551t6, zOptBoolean, c38915o4M128096d, str, randomAccess, stripeIntent$StatusM106270m, stripeIntent$UsageM106239n, c38830f6, arrayList3, arrayList4, jSONObjectOptJSONObject6 != null ? AbstractC32100b.m99869s(jSONObjectOptJSONObject6) : null, string, z4);
    }

    /* JADX INFO: renamed from: c */
    public C38935q6 m128101c(JSONObject jSONObject) {
        C38926p6 c38926p6;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("items");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, jSONArrayOptJSONArray.length());
        ArrayList<JSONObject> arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i0, 10));
        Iterator it = c18284jM36278i0.iterator();
        while (((C18283i) it).f71138y) {
            arrayList.add(jSONArrayOptJSONArray.optJSONObject(((AbstractC25243e0) it).nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (JSONObject jSONObject2 : arrayList) {
            AbstractC22676k.m65747g(jSONObject2);
            C38917o6 c38917o6M128098b = m128098b(jSONObject2);
            if (c38917o6M128098b != null) {
                arrayList2.add(c38917o6M128098b);
            }
        }
        Integer numValueOf = !jSONObject.has("amount") ? null : Integer.valueOf(jSONObject.optInt("amount"));
        String strM99551t = AbstractC32004s.m99551t("currency", jSONObject);
        String strM99551t2 = AbstractC32004s.m99551t(NotificationCompat.CATEGORY_EMAIL, jSONObject);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("shipping");
        if (jSONObjectOptJSONObject != null) {
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("address");
            c38926p6 = new C38926p6(jSONObjectOptJSONObject2 != null ? new C38793c(AbstractC32004s.m99551t("city", jSONObjectOptJSONObject2), AbstractC32004s.m99551t("country", jSONObjectOptJSONObject2), AbstractC32004s.m99551t("line1", jSONObjectOptJSONObject2), AbstractC32004s.m99551t("line2", jSONObjectOptJSONObject2), AbstractC32004s.m99551t("postal_code", jSONObjectOptJSONObject2), AbstractC32004s.m99551t("state", jSONObjectOptJSONObject2)) : null, AbstractC32004s.m99551t("carrier", jSONObjectOptJSONObject), AbstractC32004s.m99551t("name", jSONObjectOptJSONObject), AbstractC32004s.m99551t("phone", jSONObjectOptJSONObject), AbstractC32004s.m99551t("tracking_number", jSONObjectOptJSONObject));
        } else {
            c38926p6 = null;
        }
        return new C38935q6(numValueOf, strM99551t, strM99551t2, arrayList2, c38926p6);
    }

    @Override // p598wy.InterfaceC37689b
    /* JADX INFO: renamed from: m */
    public final InterfaceC36562b mo8011m(JSONObject jSONObject) throws JSONException {
        long j7;
        String str;
        C38781a7 c38781a7;
        ArrayList arrayList;
        switch (this.f172388w) {
            case 0:
                String strM99551t = AbstractC32004s.m99551t("id", jSONObject);
                if (strM99551t != null) {
                    return new C38790b6(strM99551t, AbstractC32004s.m99551t("passive_captcha_site_key", jSONObject), AbstractC32004s.m99551t("passive_captcha_rqdata", jSONObject));
                }
                return null;
            case 1:
                return m128100a(jSONObject);
            case 2:
                return m128098b(jSONObject);
            case 3:
                return m128101c(jSONObject);
            case 4:
                String string = jSONObject.getString("id");
                long j13 = jSONObject.getLong(AnalyticsRequestV2.PARAM_CREATED);
                boolean z4 = jSONObject.getBoolean("livemode");
                String string2 = jSONObject.getString("source");
                String strOptString = jSONObject.optString("state");
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ares");
                if (jSONObjectOptJSONObject != null) {
                    String strM99551t2 = AbstractC32004s.m99551t("threeDSServerTransID", jSONObjectOptJSONObject);
                    String strM99551t3 = AbstractC32004s.m99551t("acsChallengeMandated", jSONObjectOptJSONObject);
                    String strM99551t4 = AbstractC32004s.m99551t("acsSignedContent", jSONObjectOptJSONObject);
                    String string3 = jSONObjectOptJSONObject.getString("acsTransID");
                    String strM99551t5 = AbstractC32004s.m99551t("acsURL", jSONObjectOptJSONObject);
                    String strM99551t6 = AbstractC32004s.m99551t("authenticationType", jSONObjectOptJSONObject);
                    String strM99551t7 = AbstractC32004s.m99551t("cardholderInfo", jSONObjectOptJSONObject);
                    String string4 = jSONObjectOptJSONObject.getString("messageType");
                    String string5 = jSONObjectOptJSONObject.getString("messageVersion");
                    String strM99551t8 = AbstractC32004s.m99551t("sdkTransID", jSONObjectOptJSONObject);
                    String strM99551t9 = AbstractC32004s.m99551t("transStatus", jSONObjectOptJSONObject);
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("messageExtension");
                    if (jSONArrayOptJSONArray != null) {
                        C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, jSONArrayOptJSONArray.length());
                        ArrayList<JSONObject> arrayList2 = new ArrayList();
                        Iterator it = c18284jM36278i0.iterator();
                        while (((C18283i) it).f71138y) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(((AbstractC25243e0) it).nextInt());
                            if (jSONObjectOptJSONObject2 != null) {
                                arrayList2.add(jSONObjectOptJSONObject2);
                            }
                        }
                        arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
                        for (JSONObject json : arrayList2) {
                            AbstractC22676k.m65750j(json, "json");
                            JSONObject jSONObjectOptJSONObject3 = json.optJSONObject("data");
                            Map map = C25272z.f99163w;
                            if (jSONObjectOptJSONObject3 != null) {
                                JSONArray jSONArrayNames = jSONObjectOptJSONObject3.names();
                                if (jSONArrayNames == null) {
                                    jSONArrayNames = new JSONArray();
                                }
                                JSONArray jSONArray = jSONArrayNames;
                                C18284j c18284jM36278i1 = AbstractC12889b.m36278i0(0, jSONArray.length());
                                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i1, 10));
                                Iterator it3 = c18284jM36278i1.iterator();
                                while (((C18283i) it3).f71138y) {
                                    arrayList3.add(jSONArray.getString(((AbstractC25243e0) it3).nextInt()));
                                }
                                ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(arrayList3, 10));
                                for (Iterator it4 = arrayList3.iterator(); it4.hasNext(); it4 = it4) {
                                    String str2 = (String) it4.next();
                                    arrayList4.add(AbstractC25247g0.m73989X(new C23465k(str2, jSONObjectOptJSONObject3.getString(str2))));
                                }
                                Iterator it5 = arrayList4.iterator();
                                Map mapM73995d0 = map;
                                while (it5.hasNext()) {
                                    mapM73995d0 = AbstractC25247g0.m73995d0(mapM73995d0, (Map) it5.next());
                                }
                                map = mapM73995d0;
                            }
                            arrayList.add(new C38791b7(AbstractC32004s.m99551t("name", json), json.optBoolean("criticalityIndicator"), AbstractC32004s.m99551t("id", json), AbstractC25247g0.m74001j0(map)));
                            string = string;
                            j13 = j13;
                        }
                        j7 = j13;
                        str = string;
                    } else {
                        j7 = j13;
                        str = string;
                        arrayList = null;
                    }
                    c38781a7 = new C38781a7(strM99551t2, strM99551t3, strM99551t4, string3, strM99551t5, strM99551t6, strM99551t7, arrayList, string4, string5, strM99551t8, strM99551t9);
                } else {
                    j7 = j13;
                    str = string;
                    c38781a7 = null;
                }
                JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("error");
                return new C38811d7(str, c38781a7, Long.valueOf(j7), string2, strOptString, z4, jSONObjectOptJSONObject4 != null ? new C38801c7(jSONObjectOptJSONObject4.getString("threeDSServerTransID"), AbstractC32004s.m99551t("acsTransID", jSONObjectOptJSONObject4), AbstractC32004s.m99551t("dsTransID", jSONObjectOptJSONObject4), jSONObjectOptJSONObject4.getString("errorCode"), jSONObjectOptJSONObject4.getString("errorComponent"), jSONObjectOptJSONObject4.getString("errorDescription"), jSONObjectOptJSONObject4.getString("errorDetail"), AbstractC32004s.m99551t("errorMessageType", jSONObjectOptJSONObject4), jSONObjectOptJSONObject4.getString("messageType"), jSONObjectOptJSONObject4.getString("messageVersion"), AbstractC32004s.m99551t("sdkTransID", jSONObjectOptJSONObject4)) : null, AbstractC32004s.m99551t("fallback_redirect_url", jSONObject), AbstractC32004s.m99551t("creq", jSONObject));
            default:
                return m128099d(jSONObject);
        }
    }
}
