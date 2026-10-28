package com.iterable.iterableapi;

import aws.smithy.kotlin.runtime.serde.DeserializationException;
import ih0.AbstractC18489d0;
import org.json.JSONException;
import org.json.JSONObject;
import p088dc.AbstractC11895b;
import p303lg.AbstractC24026e;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: com.iterable.iterableapi.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C5363q {

    /* JADX INFO: renamed from: a */
    public final String f21805a;

    /* JADX INFO: renamed from: b */
    public final int f21806b;

    /* JADX INFO: renamed from: c */
    public int f21807c;

    public /* synthetic */ C5363q(int i13, int i14, String str) {
        this.f21806b = i13;
        this.f21807c = i14;
        this.f21805a = str;
    }

    /* JADX INFO: renamed from: a */
    public void m16508a(int i13, String str) {
        int i14 = this.f21807c + i13;
        int i15 = this.f21806b;
        if (i14 <= i15) {
            this.f21807c = i14;
            return;
        }
        String strConcat = "Unexpected end-of-doc while ".concat(str);
        int iMax = Math.max(0, this.f21807c - 3);
        int iMin = Math.min(i15 - 1, this.f21807c + 3);
        throw new DeserializationException(AbstractC11895b.m31992k('\n', strConcat, "At offset " + this.f21807c + " (showing range " + iMax + '-' + iMin + "):\n" + AbstractC24026e.f94896a.m125852f(AbstractC18489d0.m53368i(iMin, this.f21805a, 1, iMax, "substring(...)"), "·") + '\n' + (AbstractC39421y.m125925J(this.f21807c - iMax, " ") + '^')));
    }

    /* JADX INFO: renamed from: b */
    public boolean m16509b(String str) {
        if (!AbstractC39421y.m125929N(this.f21805a, this.f21807c, str, false)) {
            return false;
        }
        this.f21807c = str.length() + this.f21807c;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public boolean m16510c(String str) {
        return m16514g(this.f21807c + Math.min(str.length(), this.f21806b - this.f21807c)).equals(str);
    }

    /* JADX INFO: renamed from: d */
    public char m16511d(String str) {
        int i13 = this.f21807c;
        int i14 = i13 + 1;
        String str2 = this.f21805a;
        int i15 = this.f21806b;
        if (i14 <= i15) {
            this.f21807c = i14;
            return str2.charAt(i13);
        }
        String strConcat = "Unexpected end-of-doc while ".concat(str);
        int iMax = Math.max(0, this.f21807c - 3);
        int iMin = Math.min(i15 - 1, this.f21807c + 3);
        throw new DeserializationException(AbstractC11895b.m31992k('\n', strConcat, "At offset " + this.f21807c + " (showing range " + iMax + '-' + iMin + "):\n" + AbstractC24026e.f94896a.m125852f(AbstractC18489d0.m53368i(iMin, str2, 1, iMax, "substring(...)"), "·") + '\n' + (AbstractC39421y.m125925J(this.f21807c - iMax, " ") + '^')));
    }

    /* JADX INFO: renamed from: e */
    public String m16512e(String str, String str2) {
        int i13 = this.f21807c;
        String str3 = this.f21805a;
        int iM125888g0 = AbstractC39414r.m125888g0(str3, str, i13, false, 4);
        if (iM125888g0 >= 0) {
            String strM16514g = m16514g(iM125888g0);
            this.f21807c = iM125888g0;
            return strM16514g;
        }
        String strConcat = "Unexpected end-of-doc while ".concat(str2);
        int iMax = Math.max(0, this.f21807c - 3);
        int iMin = Math.min(this.f21806b - 1, this.f21807c + 3);
        throw new DeserializationException(AbstractC11895b.m31992k('\n', strConcat, "At offset " + this.f21807c + " (showing range " + iMax + '-' + iMin + "):\n" + AbstractC24026e.f94896a.m125852f(AbstractC18489d0.m53368i(iMin, str3, 1, iMax, "substring(...)"), "·") + '\n' + (AbstractC39421y.m125925J(this.f21807c - iMax, " ") + '^')));
    }

    /* JADX INFO: renamed from: f */
    public void m16513f(String str) {
        int i13 = this.f21807c;
        int i14 = i13 - 1;
        int i15 = this.f21806b;
        if (i14 <= i15) {
            this.f21807c = i13 - 1;
            return;
        }
        String strConcat = "Unexpected end-of-doc while ".concat(str);
        int iMax = Math.max(0, this.f21807c - 3);
        int iMin = Math.min(i15 - 1, this.f21807c + 3);
        throw new DeserializationException(AbstractC11895b.m31992k('\n', strConcat, "At offset " + this.f21807c + " (showing range " + iMax + '-' + iMin + "):\n" + AbstractC24026e.f94896a.m125852f(AbstractC18489d0.m53368i(iMin, this.f21805a, 1, iMax, "substring(...)"), "·") + '\n' + (AbstractC39421y.m125925J(this.f21807c - iMax, " ") + '^')));
    }

    /* JADX INFO: renamed from: g */
    public String m16514g(int i13) {
        String strSubstring = this.f21805a.substring(this.f21807c, i13);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: h */
    public JSONObject m16515h() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("campaignId", this.f21806b);
            jSONObject.put("templateId", this.f21807c);
            jSONObject.put("messageId", this.f21805a);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public C5363q(String str) {
        this.f21805a = str;
        this.f21806b = str.length();
    }

    public C5363q(int i13, int i14, int i15, long j7, String str) {
        this.f21805a = str;
        this.f21807c = i13;
        this.f21806b = i14;
    }
}
