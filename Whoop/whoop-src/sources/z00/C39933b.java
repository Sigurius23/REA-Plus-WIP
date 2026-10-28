package z00;

import com.stripe.android.model.C5649d0;
import com.stripe.android.model.C5662q;
import com.stripe.android.model.C5665t;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.EnumC5664s;
import com.stripe.android.model.EnumC5667v;
import com.stripe.android.model.MobileFallbackWebviewParams;
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
import p474s.AbstractC32004s;
import p565vy.InterfaceC36562b;
import p598wy.InterfaceC37689b;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: z00.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C39933b implements InterfaceC37689b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: a */
    public static ConsumerSession m128097a(JSONObject jSONObject) throws JSONException {
        ?? arrayList;
        MobileFallbackWebviewParams mobileFallbackWebviewParams;
        Object next;
        Object next2;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("consumer_session");
        Object obj = null;
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("verification_sessions");
        if (jSONArrayOptJSONArray != null) {
            C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, jSONArrayOptJSONArray.length());
            ArrayList<JSONObject> arrayList2 = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i0, 10));
            Iterator it = c18284jM36278i0.iterator();
            while (((C18283i) it).f71138y) {
                arrayList2.add(jSONArrayOptJSONArray.getJSONObject(((AbstractC25243e0) it).nextInt()));
            }
            arrayList = new ArrayList();
            for (JSONObject jSONObject2 : arrayList2) {
                AbstractC22676k.m65747g(jSONObject2);
                C5665t c5665t = EnumC5667v.f22270x;
                String string = jSONObject2.getString("type");
                AbstractC22676k.m65749i(string, "getString(...)");
                String lowerCase = string.toLowerCase(Locale.ROOT);
                AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                c5665t.getClass();
                Iterator it3 = EnumC5667v.f22269H.iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!((EnumC5667v) next).f22273w.equalsIgnoreCase(lowerCase));
                EnumC5667v enumC5667v = (EnumC5667v) next;
                if (enumC5667v == null) {
                    enumC5667v = EnumC5667v.Unknown;
                }
                C5662q c5662q = EnumC5664s.f22262x;
                String string2 = jSONObject2.getString("state");
                AbstractC22676k.m65749i(string2, "getString(...)");
                String lowerCase2 = string2.toLowerCase(Locale.ROOT);
                AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
                c5662q.getClass();
                Iterator it4 = EnumC5664s.f22261G.iterator();
                do {
                    if (!it4.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it4.next();
                } while (!((EnumC5664s) next2).f22265w.equalsIgnoreCase(lowerCase2));
                EnumC5664s enumC5664s = (EnumC5664s) next2;
                if (enumC5664s == null) {
                    enumC5664s = EnumC5664s.Unknown;
                }
                arrayList.add(new ConsumerSession.VerificationSession(enumC5667v, enumC5664s));
            }
        } else {
            arrayList = C25271y.f99162w;
        }
        ?? r10 = arrayList;
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("mobile_fallback_webview_params");
        if (jSONObjectOptJSONObject2 != null) {
            C5649d0 c5649d0 = MobileFallbackWebviewParams.WebviewRequirementType.Companion;
            String string3 = jSONObjectOptJSONObject2.getString("webview_requirement_type");
            AbstractC22676k.m65749i(string3, "getString(...)");
            c5649d0.getClass();
            for (Object obj2 : MobileFallbackWebviewParams.WebviewRequirementType.getEntries()) {
                if (AbstractC39421y.m125921F(((MobileFallbackWebviewParams.WebviewRequirementType) obj2).getValue(), string3, true)) {
                    obj = obj2;
                    break;
                }
            }
            MobileFallbackWebviewParams.WebviewRequirementType webviewRequirementType = (MobileFallbackWebviewParams.WebviewRequirementType) obj;
            if (webviewRequirementType == null) {
                webviewRequirementType = MobileFallbackWebviewParams.WebviewRequirementType.Unknown;
            }
            mobileFallbackWebviewParams = new MobileFallbackWebviewParams(webviewRequirementType, AbstractC32004s.m99551t("webview_open_url", jSONObjectOptJSONObject2));
        } else {
            mobileFallbackWebviewParams = null;
        }
        String string4 = jSONObjectOptJSONObject.getString("client_secret");
        AbstractC22676k.m65749i(string4, "getString(...)");
        String string5 = jSONObjectOptJSONObject.getString("email_address");
        AbstractC22676k.m65749i(string5, "getString(...)");
        String string6 = jSONObjectOptJSONObject.getString("redacted_formatted_phone_number");
        AbstractC22676k.m65749i(string6, "getString(...)");
        String string7 = jSONObjectOptJSONObject.getString("redacted_phone_number");
        AbstractC22676k.m65749i(string7, "getString(...)");
        return new ConsumerSession(string4, string5, string6, string7, AbstractC32004s.m99551t("unredacted_phone_number", jSONObjectOptJSONObject), AbstractC32004s.m99551t("phone_number_country", jSONObjectOptJSONObject), r10, mobileFallbackWebviewParams);
    }

    @Override // p598wy.InterfaceC37689b
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ InterfaceC36562b mo8011m(JSONObject jSONObject) {
        return m128097a(jSONObject);
    }
}
