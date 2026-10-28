package com.iterable.iterableapi;

import live.hms.video.utils.HMSConstantsKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iterable.iterableapi.t1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5374t1 {

    /* JADX INFO: renamed from: a */
    public final String f21832a;

    /* JADX INFO: renamed from: b */
    public final String f21833b;

    /* JADX INFO: renamed from: c */
    public final String f21834c;

    /* JADX INFO: renamed from: d */
    public final boolean f21835d;

    /* JADX INFO: renamed from: e */
    public final String f21836e;

    /* JADX INFO: renamed from: f */
    public final C5309c f21837f;

    public C5374t1(JSONObject jSONObject) {
        this.f21832a = jSONObject.optString("identifier");
        this.f21833b = jSONObject.optString("title");
        this.f21834c = jSONObject.optString("buttonType", HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY);
        this.f21835d = jSONObject.optBoolean("openApp", true);
        jSONObject.optBoolean("requiresUnlock", true);
        jSONObject.optInt("icon", 0);
        this.f21836e = jSONObject.optString("inputPlaceholder");
        jSONObject.optString("inputTitle");
        this.f21837f = C5309c.m16416b(jSONObject.optJSONObject("action"));
    }
}
