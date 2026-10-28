package p371ok;

import al.AbstractC0954a;
import hg3.AbstractC17269i;
import m83.AbstractC25260n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ok.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C27990g extends AbstractC0954a {

    /* JADX INFO: renamed from: y */
    public final String f112885y;

    public C27990g(JSONObject jSONObject) throws JSONException {
        super(EnumC27986c.TOO_MANY_REQUESTS, 4);
        this.f112885y = AbstractC17269i.m48874U(jSONObject);
        if (jSONObject.has("exceeded_daily_quota_users")) {
            AbstractC22676k.m65749i(jSONObject.getJSONObject("exceeded_daily_quota_users").keySet(), "response.getJSONObject(\"…ly_quota_users\").keySet()");
        }
        if (jSONObject.has("exceeded_daily_quota_devices")) {
            AbstractC22676k.m65749i(jSONObject.getJSONObject("exceeded_daily_quota_devices").keySet(), "response.getJSONObject(\"…_quota_devices\").keySet()");
        }
        if (jSONObject.has("throttled_events")) {
            JSONArray jSONArray = jSONObject.getJSONArray("throttled_events");
            AbstractC22676k.m65749i(jSONArray, "response.getJSONArray(\"throttled_events\")");
            AbstractC25260n.m74057a1(AbstractC17269i.m48911q0(jSONArray));
        }
        if (jSONObject.has("throttled_users")) {
            AbstractC22676k.m65749i(jSONObject.getJSONObject("throttled_users").keySet(), "response.getJSONObject(\"throttled_users\").keySet()");
        }
        if (jSONObject.has("throttled_devices")) {
            AbstractC22676k.m65749i(jSONObject.getJSONObject("throttled_devices").keySet(), "response.getJSONObject(\"…ottled_devices\").keySet()");
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final String m84420H0() {
        return this.f112885y;
    }
}
