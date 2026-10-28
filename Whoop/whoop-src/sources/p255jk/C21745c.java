package p255jk;

import hk.C17365a;
import org.json.JSONException;
import org.json.JSONObject;
import re.C31278j0;
import re.C31298t0;

/* JADX INFO: renamed from: jk.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C21745c {

    /* JADX INFO: renamed from: a */
    public String f83655a;

    /* JADX INFO: renamed from: b */
    public String f83656b;

    /* JADX INFO: renamed from: a */
    public C31278j0 m61354a() {
        return new C31278j0(this);
    }

    /* JADX INFO: renamed from: b */
    public C31298t0 m61355b() {
        return new C31298t0(this);
    }

    /* JADX INFO: renamed from: c */
    public void m61356c(String str) {
        this.f83655a = str;
    }

    /* JADX INFO: renamed from: d */
    public void m61357d(String str) {
        this.f83656b = str;
    }

    /* JADX INFO: renamed from: e */
    public void m61358e(String str) {
        this.f83655a = str;
    }

    /* JADX INFO: renamed from: f */
    public void m61359f(String str) {
        this.f83656b = str;
    }

    /* JADX INFO: renamed from: g */
    public JSONObject m61360g() {
        String str = this.f83656b;
        String str2 = this.f83655a;
        JSONObject jSONObject = new JSONObject();
        if (str2 != null) {
            try {
                if (str2.length() != 0) {
                    jSONObject.put("source_name", str2);
                }
                if (str != null && str.length() != 0) {
                    jSONObject.put("source_version", str);
                    return jSONObject;
                }
            } catch (JSONException unused) {
                C17365a.f67285a.error("JSON Serialization of ingestion metadata object failed");
            }
        } else if (str != null) {
            jSONObject.put("source_version", str);
            return jSONObject;
        }
        return jSONObject;
    }
}
