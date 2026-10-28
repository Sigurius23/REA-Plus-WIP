package z00;

import androidx.core.app.NotificationCompat;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.model.StripeIntent$Status;
import com.stripe.android.model.StripeIntent$Usage;
import e93.AbstractC12889b;
import i93.C18283i;
import i93.C18284j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import m83.AbstractC25243e0;
import m83.AbstractC25267u;
import m83.C25271y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002a0.C0030i1;
import p474s.AbstractC32004s;
import p477s2.AbstractC32072d;
import p477s2.AbstractC32076h;
import p499t9.C33623c0;
import p499t9.C33647p;
import p598wy.InterfaceC37689b;
import p715kotlin.jvm.internal.AbstractC22676k;
import s30.AbstractC32100b;
import t83.C33617b;
import y00.AbstractC38792b8;
import y00.AbstractC38794c0;
import y00.AbstractC38956t0;
import y00.C38774a0;
import y00.C38783b;
import y00.C38793c;
import y00.C38823f;
import y00.C38843h;
import y00.C38857i3;
import y00.C38867j3;
import y00.C38887l3;
import y00.C38899m6;
import y00.C38915o4;
import y00.C38938r0;
import y00.C38947s0;
import y00.C38965u0;
import y00.C38991x;
import y00.C39000y;
import y00.EnumC38773a;
import y00.EnumC38807d3;
import y00.EnumC38817e3;
import y00.EnumC38837g3;
import y00.EnumC38847h3;
import y00.EnumC38853i;
import y00.EnumC38863j;
import y00.EnumC38974v0;
import y00.EnumC39009z;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: z00.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C39932a implements InterfaceC37689b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f172382w;

    /* JADX INFO: renamed from: x */
    public static final C39932a f172379x = new C39932a(0);

    /* JADX INFO: renamed from: y */
    public static final C39932a f172380y = new C39932a(1);

    /* JADX INFO: renamed from: z */
    public static final C39932a f172381z = new C39932a(2);

    /* JADX INFO: renamed from: E */
    public static final C39932a f172375E = new C39932a(3);

    /* JADX INFO: renamed from: F */
    public static final C39932a f172376F = new C39932a(4);

    /* JADX INFO: renamed from: G */
    public static final C39932a f172377G = new C39932a(5);

    /* JADX INFO: renamed from: H */
    public static final C39932a f172378H = new C39932a(6);

    public /* synthetic */ C39932a(int i13) {
        this.f172382w = i13;
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC38956t0 m128091b(JSONObject jSONObject) {
        C38899m6 c38899m6M128102a;
        C38843h c38843hM99777j;
        String strM99551t = AbstractC32004s.m99551t("object", jSONObject);
        if (strM99551t == null) {
            return null;
        }
        int iHashCode = strM99551t.hashCode();
        if (iHashCode == -1825227990) {
            if (strM99551t.equals("bank_account")) {
                return new C38938r0(AbstractC32072d.m99707q(jSONObject));
            }
            return null;
        }
        if (iHashCode == -896505829) {
            if (strM99551t.equals("source") && (c38899m6M128102a = C39939h.m128102a(jSONObject)) != null) {
                return new C38965u0(c38899m6M128102a);
            }
            return null;
        }
        if (iHashCode == 3046160 && strM99551t.equals("card") && (c38843hM99777j = AbstractC32076h.m99777j(jSONObject)) != null) {
            return new C38947s0(c38843hM99777j);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static C39000y m128092e(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("billing_address");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        String strM99551t = AbstractC32004s.m99551t("name", jSONObjectOptJSONObject);
        String strM99551t2 = AbstractC32004s.m99551t("line_1", jSONObjectOptJSONObject);
        String strM99551t3 = AbstractC32004s.m99551t("line_2", jSONObjectOptJSONObject);
        String strM99551t4 = AbstractC32004s.m99551t("locality", jSONObjectOptJSONObject);
        String strM99551t5 = AbstractC32004s.m99551t("postal_code", jSONObjectOptJSONObject);
        String strM99551t6 = AbstractC32004s.m99551t("administrative_area", jSONObjectOptJSONObject);
        String strM99551t7 = AbstractC32004s.m99551t("country_code", jSONObjectOptJSONObject);
        return new C39000y(strM99551t, strM99551t2, strM99551t3, strM99551t6, strM99551t4, strM99551t5, strM99551t7 != null ? new CountryCode(strM99551t7) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: f */
    public static AbstractC38794c0 m128093f(JSONObject jSONObject) throws JSONException {
        ?? arrayList;
        Object next;
        String strM99551t = AbstractC32004s.m99551t("type", jSONObject);
        if (strM99551t == null) {
            return null;
        }
        String string = jSONObject.getString("id");
        boolean zOptBoolean = jSONObject.optBoolean("is_default");
        String strM99551t2 = AbstractC32004s.m99551t("nickname", jSONObject);
        String str = (strM99551t2 == null || AbstractC39414r.m125890i0(strM99551t2)) ? null : strM99551t2;
        Locale locale = Locale.ROOT;
        String lowerCase = strM99551t.toLowerCase(locale);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        if (!lowerCase.equals("card")) {
            if (!lowerCase.equals("bank_account")) {
                return null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("bank_account_details");
            AbstractC22676k.m65747g(string);
            String string2 = jSONObject2.getString("last4");
            AbstractC22676k.m65749i(string2, "getString(...)");
            return new C38991x(string, string2, zOptBoolean, str, AbstractC32004s.m99551t("bank_account_name", jSONObject2), AbstractC32004s.m99551t("bank_icon_code", jSONObject2), m128092e(jSONObject), AbstractC32004s.m99551t("billing_email_address", jSONObject));
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("card_details");
        JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject("checks");
        JSONArray jSONArrayOptJSONArray = jSONObject3.optJSONArray("networks");
        if (jSONArrayOptJSONArray != null) {
            C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, jSONArrayOptJSONArray.length());
            arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i0, 10));
            Iterator it = c18284jM36278i0.iterator();
            while (((C18283i) it).f71138y) {
                arrayList.add(jSONArrayOptJSONArray.getString(((AbstractC25243e0) it).nextInt()));
            }
        } else {
            arrayList = C25271y.f99162w;
        }
        AbstractC22676k.m65747g(string);
        int i13 = jSONObject3.getInt("exp_year");
        int i14 = jSONObject3.getInt("exp_month");
        C33623c0 c33623c0 = EnumC38853i.f167238M;
        Object obj = null;
        String string3 = jSONObject3.getString("brand");
        AbstractC22676k.m65749i(string3, "getString(...)");
        String lowerCase2 = string3.toLowerCase(locale);
        AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
        if (lowerCase2.equals("american_express")) {
            lowerCase2 = "amex";
        } else if (lowerCase2.equals("diners_club")) {
            lowerCase2 = "diners";
        }
        c33623c0.getClass();
        EnumC38853i enumC38853iM106236i = C33623c0.m106236i(lowerCase2);
        String string4 = jSONObject3.getString("last4");
        AbstractC22676k.m65749i(string4, "getString(...)");
        C33647p c33647p = EnumC38974v0.f167763x;
        String string5 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.getString("cvc_check") : null;
        c33647p.getClass();
        Iterator it3 = EnumC38974v0.f167762I.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (!((EnumC38974v0) next).f167766w.equalsIgnoreCase(string5));
        EnumC38974v0 enumC38974v0 = (EnumC38974v0) next;
        if (enumC38974v0 == null) {
            enumC38974v0 = EnumC38974v0.Unknown;
        }
        EnumC38974v0 enumC38974v1 = enumC38974v0;
        C33623c0 c33623c1 = EnumC39009z.f167903y;
        String string6 = jSONObject3.getString("funding");
        c33623c1.getClass();
        for (Object obj2 : EnumC39009z.f167902F) {
            if (((EnumC39009z) obj2).f167905w.equals(string6)) {
                obj = obj2;
                break;
            }
        }
        EnumC39009z enumC39009z = (EnumC39009z) obj;
        if (enumC39009z == null) {
            enumC39009z = EnumC39009z.Unknown;
        }
        return new C38774a0(string, string4, zOptBoolean, str, m128092e(jSONObject), AbstractC32004s.m99551t("billing_email_address", jSONObject), i13, i14, enumC38853iM106236i, arrayList, enumC38974v1, enumC39009z);
    }

    /* JADX INFO: renamed from: a */
    public C38783b m128094a(JSONObject jSONObject) {
        Object next;
        String strM99551t = AbstractC32004s.m99551t("account_range_high", jSONObject);
        String strM99551t2 = AbstractC32004s.m99551t("account_range_low", jSONObject);
        Integer numValueOf = !jSONObject.has("pan_length") ? null : Integer.valueOf(jSONObject.optInt("pan_length"));
        boolean zOptBoolean = jSONObject.optBoolean("is_static", false);
        String strM99551t3 = AbstractC32004s.m99551t("brand", jSONObject);
        C33617b c33617b = EnumC38773a.f166881L;
        c33617b.getClass();
        C0030i1 c0030i1 = new C0030i1(c33617b, 2);
        do {
            if (!c0030i1.hasNext()) {
                next = null;
                break;
            }
            next = c0030i1.next();
        } while (!((EnumC38773a) next).f166884w.equals(strM99551t3));
        EnumC38773a enumC38773a = (EnumC38773a) next;
        if (strM99551t == null || strM99551t2 == null || numValueOf == null || enumC38773a == null) {
            return null;
        }
        C38823f c38823f = new C38823f(strM99551t2, strM99551t, zOptBoolean);
        String strM99551t4 = AbstractC32004s.m99551t("country", jSONObject);
        String strM99551t5 = AbstractC32004s.m99551t("funding", jSONObject);
        EnumC38863j.f167290x.getClass();
        return new C38783b(c38823f, numValueOf.intValue(), enumC38773a, C33647p.m106269k(strM99551t5), strM99551t4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: c */
    public C38887l3 m128095c(JSONObject jSONObject) {
        ?? arrayList;
        Object next;
        Object next2;
        Object next3;
        C38857i3 c38857i3;
        C38867j3 c38867j3;
        ?? arrayList2;
        Object obj;
        if (!"payment_intent".equals(AbstractC32004s.m99551t("object", jSONObject))) {
            return null;
        }
        String strM99551t = AbstractC32004s.m99551t("id", jSONObject);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("payment_method_types");
        C25271y c25271y = C25271y.f99162w;
        if (jSONArrayOptJSONArray != null) {
            C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, jSONArrayOptJSONArray.length());
            arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i0, 10));
            Iterator it = c18284jM36278i0.iterator();
            while (((C18283i) it).f71138y) {
                arrayList.add(jSONArrayOptJSONArray.getString(((AbstractC25243e0) it).nextInt()));
            }
        } else {
            arrayList = c25271y;
        }
        Long lValueOf = !jSONObject.has("amount") ? null : Long.valueOf(jSONObject.optLong("amount"));
        long jOptLong = jSONObject.optLong("canceled_at");
        C33623c0 c33623c0 = EnumC38807d3.f167003x;
        String strM99551t2 = AbstractC32004s.m99551t("cancellation_reason", jSONObject);
        c33623c0.getClass();
        Iterator it3 = EnumC38807d3.f167005z.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (!((EnumC38807d3) next).f167006w.equals(strM99551t2));
        EnumC38807d3 enumC38807d3 = (EnumC38807d3) next;
        C33647p c33647p = EnumC38817e3.f167062x;
        String strM99551t3 = AbstractC32004s.m99551t("capture_method", jSONObject);
        c33647p.getClass();
        Iterator it4 = EnumC38817e3.f167061G.iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (!((EnumC38817e3) next2).f167065w.equals(strM99551t3));
        EnumC38817e3 enumC38817e3 = (EnumC38817e3) next2;
        if (enumC38817e3 == null) {
            enumC38817e3 = EnumC38817e3.Automatic;
        }
        String strM99551t4 = AbstractC32004s.m99551t("client_secret", jSONObject);
        C33623c0 c33623c1 = EnumC38837g3.f167161x;
        String strM99551t5 = AbstractC32004s.m99551t("confirmation_method", jSONObject);
        c33623c1.getClass();
        Iterator it5 = EnumC38837g3.f167160F.iterator();
        do {
            if (!it5.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it5.next();
        } while (!((EnumC38837g3) next3).f167164w.equals(strM99551t5));
        EnumC38837g3 enumC38837g3 = (EnumC38837g3) next3;
        if (enumC38837g3 == null) {
            enumC38837g3 = EnumC38837g3.Automatic;
        }
        long jOptLong2 = jSONObject.optLong(AnalyticsRequestV2.PARAM_CREATED);
        String strM99549r = AbstractC32004s.m99549r(jSONObject);
        String strM99551t6 = AbstractC32004s.m99551t("description", jSONObject);
        boolean z4 = jSONObject.has("livemode") && jSONObject.optBoolean("livemode", false);
        ?? r10 = arrayList;
        EnumC38837g3 enumC38837g4 = enumC38837g3;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("payment_method");
        C38915o4 c38915o4M128096d = jSONObjectOptJSONObject != null ? new C39932a(29).m128096d(jSONObjectOptJSONObject) : null;
        String strM99551t7 = AbstractC32004s.m99551t("payment_method", jSONObject);
        if (c38915o4M128096d != null) {
            strM99551t7 = null;
        }
        if (strM99551t7 == null) {
            strM99551t7 = c38915o4M128096d != null ? c38915o4M128096d.f167527w : null;
        }
        String strM99551t8 = AbstractC32004s.m99551t("receipt_email", jSONObject);
        C33647p c33647p2 = StripeIntent$Status.f22249x;
        C38915o4 c38915o4 = c38915o4M128096d;
        String strM99551t9 = AbstractC32004s.m99551t(NotificationCompat.CATEGORY_STATUS, jSONObject);
        c33647p2.getClass();
        StripeIntent$Status stripeIntent$StatusM106270m = C33647p.m106270m(strM99551t9);
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("payment_method_options");
        String string = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        C33623c0 c33623c2 = StripeIntent$Usage.f22255x;
        String strM99551t10 = AbstractC32004s.m99551t("setup_future_usage", jSONObject);
        c33623c2.getClass();
        StripeIntent$Usage stripeIntent$UsageM106239n = C33623c0.m106239n(strM99551t10);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("last_payment_error");
        if (jSONObjectOptJSONObject3 != null) {
            String strM99551t11 = AbstractC32004s.m99551t("charge", jSONObjectOptJSONObject3);
            String strM99551t12 = AbstractC32004s.m99551t("code", jSONObjectOptJSONObject3);
            String strM99551t13 = AbstractC32004s.m99551t("decline_code", jSONObjectOptJSONObject3);
            String strM99551t14 = AbstractC32004s.m99551t("doc_url", jSONObjectOptJSONObject3);
            String strM99551t15 = AbstractC32004s.m99551t("message", jSONObjectOptJSONObject3);
            String strM99551t16 = AbstractC32004s.m99551t("param", jSONObjectOptJSONObject3);
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("payment_method");
            Object obj2 = null;
            C38915o4 c38915o4M128096d2 = jSONObjectOptJSONObject4 != null ? new C39932a(29).m128096d(jSONObjectOptJSONObject4) : null;
            C33647p c33647p3 = EnumC38847h3.f167218x;
            String strM99551t17 = AbstractC32004s.m99551t("type", jSONObjectOptJSONObject3);
            c33647p3.getClass();
            for (Object obj3 : EnumC38847h3.f167220z) {
                if (((EnumC38847h3) obj3).f167221w.equals(strM99551t17)) {
                    obj2 = obj3;
                    break;
                }
            }
            c38857i3 = new C38857i3(strM99551t11, strM99551t12, strM99551t13, strM99551t14, strM99551t15, strM99551t16, c38915o4M128096d2, (EnumC38847h3) obj2);
        } else {
            c25271y = c25271y;
            c38857i3 = null;
        }
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("shipping");
        if (jSONObjectOptJSONObject5 != null) {
            JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject5.optJSONObject("address");
            c38867j3 = new C38867j3(jSONObjectOptJSONObject6 != null ? new C38793c(AbstractC32004s.m99551t("city", jSONObjectOptJSONObject6), AbstractC32004s.m99551t("country", jSONObjectOptJSONObject6), AbstractC32004s.m99551t("line1", jSONObjectOptJSONObject6), AbstractC32004s.m99551t("line2", jSONObjectOptJSONObject6), AbstractC32004s.m99551t("postal_code", jSONObjectOptJSONObject6), AbstractC32004s.m99551t("state", jSONObjectOptJSONObject6)) : new C38793c(null, null, null, null, null, null), AbstractC32004s.m99551t("carrier", jSONObjectOptJSONObject5), AbstractC32004s.m99551t("name", jSONObjectOptJSONObject5), AbstractC32004s.m99551t("phone", jSONObjectOptJSONObject5), AbstractC32004s.m99551t("tracking_number", jSONObjectOptJSONObject5));
        } else {
            c38867j3 = null;
        }
        JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("next_action");
        AbstractC38792b8 abstractC38792b8M99869s = jSONObjectOptJSONObject7 != null ? AbstractC32100b.m99869s(jSONObjectOptJSONObject7) : null;
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("unactivated_payment_method_types");
        if (jSONArrayOptJSONArray2 != null) {
            C18284j c18284jM36278i1 = AbstractC12889b.m36278i0(0, jSONArrayOptJSONArray2.length());
            arrayList2 = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i1, 10));
            Iterator it6 = c18284jM36278i1.iterator();
            while (((C18283i) it6).f71138y) {
                arrayList2.add(jSONArrayOptJSONArray2.getString(((AbstractC25243e0) it6).nextInt()));
            }
        } else {
            arrayList2 = c25271y;
        }
        Iterable iterable = (Iterable) arrayList2;
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
        Iterator it7 = iterable.iterator();
        while (it7.hasNext()) {
            String lowerCase = ((String) it7.next()).toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            arrayList3.add(lowerCase);
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("link_funding_sources");
        if (jSONArrayOptJSONArray3 != null) {
            C18284j c18284jM36278i2 = AbstractC12889b.m36278i0(0, jSONArrayOptJSONArray3.length());
            ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i2, 10));
            Iterator it8 = c18284jM36278i2.iterator();
            while (((C18283i) it8).f71138y) {
                arrayList4.add(jSONArrayOptJSONArray3.getString(((AbstractC25243e0) it8).nextInt()));
            }
            obj = arrayList4;
        } else {
            obj = c25271y;
        }
        Iterable iterable2 = (Iterable) obj;
        ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(iterable2, 10));
        Iterator it9 = iterable2.iterator();
        while (it9.hasNext()) {
            String lowerCase2 = ((String) it9.next()).toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
            arrayList5.add(lowerCase2);
        }
        String strM99551t18 = AbstractC32004s.m99551t("country_code", jSONObject);
        JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject("automatic_payment_methods");
        return new C38887l3(strM99551t, r10, lValueOf, jOptLong, enumC38807d3, enumC38817e3, strM99551t4 == null ? "redacted_client_secret" : strM99551t4, enumC38837g4, strM99551t18, jOptLong2, strM99549r, strM99551t6, z4, c38915o4, strM99551t7, strM99551t8, stripeIntent$StatusM106270m, stripeIntent$UsageM106239n, c38857i3, c38867j3, arrayList3, arrayList5, abstractC38792b8M99869s, string, jSONObjectOptJSONObject8 != null && jSONObjectOptJSONObject8.optBoolean("enabled"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:168:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:57:0x0106  */
    /* JADX WARN: Code duplicated, block: B:60:0x012a  */
    /* JADX WARN: Code duplicated, block: B:62:0x013a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0146  */
    /* JADX WARN: Code duplicated, block: B:69:0x015f A[LOOP:3: B:67:0x0159->B:69:0x015f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x0173  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v9 java.lang.Object, still in use, count: 2, list:
          (r6v9 java.lang.Object) from 0x006a: PHI (r6 I:??) = (r6v6 java.lang.Object), (r6v9 java.lang.Object) binds: [B:20:0x0069, B:163:0x006a] A[DONT_GENERATE, DONT_INLINE]
          (r6v9 java.lang.Object) from 0x005e: CHECK_CAST (y00.r3) (r6v9 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX INFO: renamed from: d */
    public y00.C38915o4 m128096d(org.json.JSONObject r31) {
        /*
            Method dump skipped, instruction units count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z00.C39932a.m128096d(org.json.JSONObject):y00.o4");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0084  */
    /* JADX WARN: Code duplicated, block: B:81:0x021f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0223  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r0v31, types: [l83.m] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [y00.t] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r16v2, types: [y00.z3] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v12 java.lang.Object, still in use, count: 2, list:
          (r12v12 java.lang.Object) from 0x0434: PHI (r12 I:??) = (r12v9 java.lang.Object), (r12v12 java.lang.Object) binds: [B:173:0x0433, B:287:0x0434] A[DONT_GENERATE, DONT_INLINE]
          (r12v12 java.lang.Object) from 0x0428: CHECK_CAST (y00.r3) (r12v12 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // p598wy.InterfaceC37689b
    /* JADX INFO: renamed from: m */
    public final p565vy.InterfaceC36562b mo8011m(org.json.JSONObject r22) {
        /*
            Method dump skipped, instruction units count: 1722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z00.C39932a.mo8011m(org.json.JSONObject):vy.b");
    }
}
