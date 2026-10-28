package z00;

import androidx.core.app.NotificationCompat;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.model.Source$Status;
import com.stripe.android.model.Source$Usage;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import p098dt.AbstractC12350b;
import p474s.AbstractC32004s;
import p481s6.AbstractC32229a;
import p482s7.AbstractC32237a;
import p499t9.C33623c0;
import p499t9.C33647p;
import p565vy.InterfaceC36562b;
import p598wy.InterfaceC37689b;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38890l6;
import y00.C38899m6;
import y00.C38935q6;
import y00.C39007y6;

/* JADX INFO: renamed from: z00.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C39939h implements InterfaceC37689b {

    /* JADX INFO: renamed from: w */
    public static final Set f172389w = AbstractC12350b.m34570S("card");

    /* JADX WARN: Code duplicated, block: B:30:0x008d  */
    /* JADX INFO: renamed from: a */
    public static C38899m6 m128102a(JSONObject jSONObject) {
        C39007y6 c39007y6;
        C38890l6 c38890l6;
        Object next;
        JSONObject jSONObjectOptJSONObject;
        InterfaceC36562b interfaceC36562bM100262i;
        C39007y6 c39007y7;
        String strOptString = jSONObject.optString("object");
        if (AbstractC22676k.m65745e(strOptString, "card")) {
            return new C38899m6(AbstractC32004s.m99551t("id", jSONObject), null, null, null, null, null, null, null, null, AbstractC32229a.m100262i(jSONObject), "card", "card", null, null, null);
        }
        Object obj = null;
        if (!AbstractC22676k.m65745e(strOptString, "source")) {
            return null;
        }
        String strM99551t = AbstractC32004s.m99551t("type", jSONObject);
        if (strM99551t == null) {
            strM99551t = "unknown";
        }
        String str = strM99551t.equals("card") ? "card" : "unknown";
        Map mapM99544m = AbstractC32004s.m99544m(jSONObject.optJSONObject(strM99551t));
        if (f172389w.contains(strM99551t)) {
            if (jSONObject.has(strM99551t)) {
                if (strM99551t.equals("owner")) {
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("owner");
                    if (jSONObjectOptJSONObject2 != null) {
                        interfaceC36562bM100262i = AbstractC32237a.m100301p(jSONObjectOptJSONObject2);
                    } else {
                        interfaceC36562bM100262i = null;
                    }
                } else if (!strM99551t.equals("card") || (jSONObjectOptJSONObject = jSONObject.optJSONObject("card")) == null) {
                    interfaceC36562bM100262i = null;
                } else {
                    interfaceC36562bM100262i = AbstractC32229a.m100262i(jSONObjectOptJSONObject);
                }
                if (!(interfaceC36562bM100262i instanceof C39007y6)) {
                    interfaceC36562bM100262i = null;
                }
                c39007y7 = (C39007y6) interfaceC36562bM100262i;
            } else {
                c39007y7 = null;
            }
            c39007y6 = c39007y7;
        } else {
            c39007y6 = null;
        }
        String strM99551t2 = AbstractC32004s.m99551t("id", jSONObject);
        Long lM99550s = AbstractC32004s.m99550s("amount", jSONObject);
        String strM99551t3 = AbstractC32004s.m99551t("client_secret", jSONObject);
        Long lM99550s2 = AbstractC32004s.m99550s(AnalyticsRequestV2.PARAM_CREATED, jSONObject);
        String strM99551t4 = AbstractC32004s.m99551t("currency", jSONObject);
        boolean zOptBoolean = jSONObject.optBoolean("livemode");
        if (jSONObject.has("owner")) {
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("owner");
            C38890l6 c38890l6M100301p = jSONObjectOptJSONObject3 != null ? AbstractC32237a.m100301p(jSONObjectOptJSONObject3) : null;
            if (c38890l6M100301p == null) {
                c38890l6M100301p = null;
            }
            c38890l6 = c38890l6M100301p;
        } else {
            c38890l6 = null;
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("source_order");
        C38935q6 c38935q6M128101c = jSONObjectOptJSONObject4 != null ? new C39938g(3).m128101c(jSONObjectOptJSONObject4) : null;
        String strM99551t5 = AbstractC32004s.m99551t("statement_descriptor", jSONObject);
        C33647p c33647p = Source$Status.f22218x;
        String strM99551t6 = AbstractC32004s.m99551t(NotificationCompat.CATEGORY_STATUS, jSONObject);
        c33647p.getClass();
        Iterator it = Source$Status.f22220z.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((Source$Status) next).f22221w.equals(strM99551t6));
        Source$Status source$Status = (Source$Status) next;
        C33623c0 c33623c0 = Source$Usage.f22222x;
        String strM99551t7 = AbstractC32004s.m99551t("usage", jSONObject);
        c33623c0.getClass();
        for (Object obj2 : Source$Usage.f22224z) {
            if (((Source$Usage) obj2).f22225w.equals(strM99551t7)) {
                obj = obj2;
                break;
            }
        }
        return new C38899m6(strM99551t2, lM99550s, strM99551t3, lM99550s2, strM99551t4, Boolean.valueOf(zOptBoolean), c38890l6, source$Status, mapM99544m, c39007y6, str, strM99551t, (Source$Usage) obj, c38935q6M128101c, strM99551t5);
    }

    @Override // p598wy.InterfaceC37689b
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ InterfaceC36562b mo8011m(JSONObject jSONObject) {
        return m128102a(jSONObject);
    }
}
