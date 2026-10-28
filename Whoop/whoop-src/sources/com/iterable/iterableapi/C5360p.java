package com.iterable.iterableapi;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.iterable.iterableapi.p */
/* JADX INFO: loaded from: classes.dex */
public final class C5360p {

    /* JADX INFO: renamed from: a */
    public final boolean f21797a;

    /* JADX INFO: renamed from: b */
    public final int f21798b;

    /* JADX INFO: renamed from: c */
    public final String f21799c;

    /* JADX INFO: renamed from: d */
    public final JSONObject f21800d;

    /* JADX INFO: renamed from: e */
    public final String f21801e;

    public C5360p(boolean z4, int i13, String str, JSONObject jSONObject, String str2) {
        this.f21797a = z4;
        this.f21798b = i13;
        this.f21799c = str;
        this.f21800d = jSONObject;
        this.f21801e = str2;
    }

    /* JADX INFO: renamed from: a */
    public static C5360p m16506a(int i13, String str, JSONObject jSONObject, String str2) {
        return new C5360p(false, i13, str, jSONObject, str2);
    }

    /* JADX INFO: renamed from: b */
    public static C5360p m16507b(int i13, String str, JSONObject jSONObject) {
        return new C5360p(true, i13, str, jSONObject, null);
    }
}
