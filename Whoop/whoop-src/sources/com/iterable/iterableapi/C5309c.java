package com.iterable.iterableapi;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iterable.iterableapi.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C5309c {

    /* JADX INFO: renamed from: a */
    public final JSONObject f21650a;

    public C5309c(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f21650a = jSONObject;
        } else {
            this.f21650a = new JSONObject();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C5309c m16415a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", str);
            return new C5309c(jSONObject);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C5309c m16416b(JSONObject jSONObject) {
        if (jSONObject != null) {
            return new C5309c(jSONObject);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final String m16417c() {
        return this.f21650a.optString("type", null);
    }
}
