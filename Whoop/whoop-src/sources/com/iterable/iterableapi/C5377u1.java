package com.iterable.iterableapi;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p098dt.AbstractC12350b;
import p268k0.AbstractC22086a;
import p389p0.C28561y0;

/* JADX INFO: renamed from: com.iterable.iterableapi.u1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5377u1 {

    /* JADX INFO: renamed from: a */
    public int f21844a;

    /* JADX INFO: renamed from: b */
    public int f21845b;

    /* JADX INFO: renamed from: c */
    public boolean f21846c;

    /* JADX INFO: renamed from: d */
    public final Object f21847d;

    /* JADX INFO: renamed from: e */
    public final Object f21848e;

    /* JADX INFO: renamed from: f */
    public final Object f21849f;

    public C5377u1(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f21844a = jSONObject.optInt("campaignId");
            this.f21845b = jSONObject.optInt("templateId");
            this.f21847d = jSONObject.optString("messageId");
            this.f21846c = jSONObject.optBoolean("isGhostPush");
            this.f21848e = C5309c.m16416b(jSONObject.optJSONObject("defaultAction"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("actionButtons");
            if (jSONArrayOptJSONArray != null) {
                this.f21849f = new ArrayList();
                for (int i13 = 0; i13 < jSONArrayOptJSONArray.length(); i13++) {
                    ((ArrayList) this.f21849f).add(new C5374t1(jSONArrayOptJSONArray.getJSONObject(i13)));
                }
            }
        } catch (JSONException e5) {
            AbstractC12350b.m34595p("IterableNoticationData", e5.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public C5374t1 m16519a(String str) {
        for (C5374t1 c5374t1 : (ArrayList) this.f21849f) {
            if (c5374t1.f21832a.equals(str)) {
                return c5374t1;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public int m16520b() {
        return this.f21844a;
    }

    /* JADX INFO: renamed from: c */
    public C5309c m16521c() {
        return (C5309c) this.f21848e;
    }

    /* JADX INFO: renamed from: d */
    public String m16522d() {
        return (String) this.f21847d;
    }

    /* JADX INFO: renamed from: e */
    public int m16523e() {
        return this.f21845b;
    }

    public C5377u1(Bundle bundle) {
        this(bundle.getString("itbl"));
    }

    public C5377u1(C28561y0 c28561y0, List list) {
        this.f21849f = c28561y0;
        this.f21847d = list;
        this.f21848e = new List[list.size()];
        if (list.isEmpty()) {
            AbstractC22086a.m63158a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
