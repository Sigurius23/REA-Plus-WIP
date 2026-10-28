package p255jk;

import hk.C17365a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: jk.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C21746d {

    /* JADX INFO: renamed from: a */
    public String f83657a;

    /* JADX INFO: renamed from: b */
    public String f83658b;

    /* JADX INFO: renamed from: c */
    public String f83659c;

    /* JADX INFO: renamed from: d */
    public String f83660d;

    /* JADX INFO: renamed from: a */
    public JSONObject m61361a() {
        String str = this.f83660d;
        String str2 = this.f83659c;
        String str3 = this.f83658b;
        String str4 = this.f83657a;
        JSONObject jSONObject = new JSONObject();
        if (str4 != null) {
            try {
                if (str4.length() != 0) {
                    jSONObject.put("branch", str4);
                }
                if (str3 != null && str3.length() != 0) {
                    jSONObject.put("source", str3);
                }
                if (str2 != null && str2.length() != 0) {
                    jSONObject.put("version", str2);
                }
                if (str != null && str.length() != 0) {
                    jSONObject.put("versionId", str);
                    return jSONObject;
                }
            } catch (JSONException unused) {
                C17365a.f67285a.error("JSON Serialization of tacking plan object failed");
            }
        } else {
            if (str3 != null) {
                jSONObject.put("source", str3);
            }
            if (str2 != null) {
                jSONObject.put("version", str2);
            }
            if (str != null) {
                jSONObject.put("versionId", str);
                return jSONObject;
            }
        }
        return jSONObject;
    }
}
