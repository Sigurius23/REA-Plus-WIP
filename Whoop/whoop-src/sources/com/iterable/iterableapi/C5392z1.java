package com.iterable.iterableapi;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iterable.iterableapi.z1 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C5392z1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C5357o f21894a;

    /* JADX INFO: renamed from: a */
    public final void m16544a(JSONObject jSONObject) {
        C5357o c5357o = this.f21894a;
        try {
            new AsyncTaskC5304a2().execute(new C5357o(c5357o.f21783a, c5357o.f21784b, c5357o.f21785c, c5357o.f21786d, jSONObject.getString("newAuthToken"), c5357o.f21789g));
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
    }
}
