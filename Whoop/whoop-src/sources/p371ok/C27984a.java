package p371ok;

import al.AbstractC0954a;
import hg3.AbstractC17269i;
import java.util.Set;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25235a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ok.a */
/* JADX INFO: loaded from: classes.dex */
public final class C27984a extends AbstractC0954a {

    /* JADX INFO: renamed from: E */
    public final Set f112870E;

    /* JADX INFO: renamed from: F */
    public final Set f112871F;

    /* JADX INFO: renamed from: G */
    public final Set f112872G;

    /* JADX INFO: renamed from: y */
    public final String f112873y;

    /* JADX INFO: renamed from: z */
    public final Set f112874z;

    public C27984a(JSONObject jSONObject) throws JSONException {
        super(EnumC27986c.BAD_REQUEST, 4);
        this.f112873y = AbstractC17269i.m48874U(jSONObject);
        C25235a0 c25235a0 = C25235a0.f99113w;
        this.f112874z = c25235a0;
        this.f112870E = c25235a0;
        this.f112871F = c25235a0;
        this.f112872G = c25235a0;
        if (jSONObject.has("events_with_invalid_fields")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("events_with_invalid_fields");
            AbstractC22676k.m65749i(jSONObject2, "response.getJSONObject(\"…nts_with_invalid_fields\")");
            this.f112874z = AbstractC17269i.m48856A(jSONObject2);
        }
        if (jSONObject.has("events_with_missing_fields")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("events_with_missing_fields");
            AbstractC22676k.m65749i(jSONObject3, "response.getJSONObject(\"…nts_with_missing_fields\")");
            this.f112870E = AbstractC17269i.m48856A(jSONObject3);
        }
        if (jSONObject.has("silenced_devices")) {
            Object jSONArray = jSONObject.getJSONArray("silenced_devices");
            AbstractC22676k.m65749i(jSONArray, "response.getJSONArray(\"silenced_devices\")");
            this.f112872G = AbstractC25265s.m74103I1((Iterable) jSONArray);
        }
        if (jSONObject.has("silenced_events")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("silenced_events");
            AbstractC22676k.m65749i(jSONArray2, "response.getJSONArray(\"silenced_events\")");
            this.f112871F = AbstractC25260n.m74057a1(AbstractC17269i.m48911q0(jSONArray2));
        }
    }
}
