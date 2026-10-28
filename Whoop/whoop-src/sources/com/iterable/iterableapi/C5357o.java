package com.iterable.iterableapi;

import org.json.JSONException;
import org.json.JSONObject;
import p098dt.AbstractC12350b;

/* JADX INFO: renamed from: com.iterable.iterableapi.o */
/* JADX INFO: loaded from: classes.dex */
public final class C5357o {

    /* JADX INFO: renamed from: a */
    public final String f21783a;

    /* JADX INFO: renamed from: b */
    public final String f21784b;

    /* JADX INFO: renamed from: c */
    public final JSONObject f21785c;

    /* JADX INFO: renamed from: d */
    public final String f21786d;

    /* JADX INFO: renamed from: e */
    public final String f21787e;

    /* JADX INFO: renamed from: f */
    public EnumC5353n f21788f = EnumC5353n.f21774w;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5322f0 f21789g;

    /* JADX INFO: renamed from: h */
    public final C5392z1 f21790h;

    public C5357o(String str, String str2, JSONObject jSONObject, String str3, String str4, C5392z1 c5392z1, InterfaceC5318e0 interfaceC5318e0) {
        this.f21783a = str;
        this.f21784b = str2;
        this.f21785c = jSONObject;
        this.f21786d = str3;
        this.f21787e = str4;
        this.f21790h = c5392z1;
    }

    /* JADX INFO: renamed from: a */
    public static C5357o m16501a(JSONObject jSONObject) {
        try {
            return new C5357o(jSONObject.getString("apiKey"), jSONObject.getString("resourcePath"), jSONObject.getJSONObject("data"), jSONObject.getString("requestType"), jSONObject.has("authToken") ? jSONObject.getString("authToken") : "", null, null);
        } catch (JSONException unused) {
            AbstractC12350b.m34595p("IterableApiRequest", "Failed to create Iterable request from JSON");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m16502b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("apiKey", this.f21783a);
        jSONObject.put("resourcePath", this.f21784b);
        jSONObject.put("authToken", this.f21787e);
        jSONObject.put("requestType", this.f21786d);
        jSONObject.put("data", this.f21785c);
        return jSONObject;
    }

    public C5357o(String str, String str2, JSONObject jSONObject, String str3, String str4, InterfaceC5322f0 interfaceC5322f0) {
        this.f21783a = str;
        this.f21784b = str2;
        this.f21785c = jSONObject;
        this.f21786d = str3;
        this.f21787e = str4;
        this.f21789g = interfaceC5322f0;
    }
}
