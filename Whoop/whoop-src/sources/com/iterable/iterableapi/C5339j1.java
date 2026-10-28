package com.iterable.iterableapi;

import android.content.Context;
import android.graphics.Rect;
import ge3.AbstractC15751g;
import java.io.File;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;
import p005a3.C0237p;
import p098dt.AbstractC12350b;

/* JADX INFO: renamed from: com.iterable.iterableapi.j1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5339j1 {

    /* JADX INFO: renamed from: a */
    public final String f21720a;

    /* JADX INFO: renamed from: b */
    public final C5319e1 f21721b;

    /* JADX INFO: renamed from: c */
    public final JSONObject f21722c;

    /* JADX INFO: renamed from: d */
    public final Date f21723d;

    /* JADX INFO: renamed from: e */
    public final Date f21724e;

    /* JADX INFO: renamed from: f */
    public final C5335i1 f21725f;

    /* JADX INFO: renamed from: g */
    public final double f21726g;

    /* JADX INFO: renamed from: h */
    public final Boolean f21727h;

    /* JADX INFO: renamed from: i */
    public final C5331h1 f21728i;

    /* JADX INFO: renamed from: j */
    public final Long f21729j;

    /* JADX INFO: renamed from: k */
    public boolean f21730k = false;

    /* JADX INFO: renamed from: l */
    public boolean f21731l = false;

    /* JADX INFO: renamed from: m */
    public boolean f21732m = false;

    /* JADX INFO: renamed from: n */
    public boolean f21733n = false;

    /* JADX INFO: renamed from: o */
    public boolean f21734o = false;

    /* JADX INFO: renamed from: p */
    public C0237p f21735p;

    /* JADX INFO: renamed from: q */
    public final boolean f21736q;

    /* JADX INFO: renamed from: r */
    public C0237p f21737r;

    public C5339j1(String str, C5319e1 c5319e1, JSONObject jSONObject, Date date, Date date2, C5335i1 c5335i1, Double d3, Boolean bool, C5331h1 c5331h1, Long l7, boolean z4) {
        Boolean boolValueOf;
        boolean z13 = false;
        this.f21720a = str;
        this.f21721b = c5319e1;
        this.f21722c = jSONObject;
        this.f21723d = date;
        this.f21724e = date2;
        this.f21725f = c5335i1;
        this.f21726g = d3.doubleValue();
        if (bool != null) {
            if (bool.booleanValue() && !z4) {
                z13 = true;
            }
            boolValueOf = Boolean.valueOf(z13);
        } else {
            boolValueOf = null;
        }
        this.f21727h = boolValueOf;
        this.f21728i = c5331h1;
        this.f21729j = l7;
        this.f21736q = z4;
    }

    /* JADX INFO: renamed from: a */
    public static int m16453a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0;
        }
        if ("AutoExpand".equalsIgnoreCase(jSONObject.optString("displayOption"))) {
            return -1;
        }
        return jSONObject.optInt("percentage", 0);
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m16454b(int i13) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (i13 == -1) {
            jSONObject.putOpt("displayOption", "AutoExpand");
            return jSONObject;
        }
        jSONObject.putOpt("percentage", Integer.valueOf(i13));
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m16455c(Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("top", m16454b(rect.top));
        jSONObject.putOpt("left", m16454b(rect.left));
        jSONObject.putOpt("bottom", m16454b(rect.bottom));
        jSONObject.putOpt("right", m16454b(rect.right));
        return jSONObject;
    }

    /* JADX INFO: renamed from: d */
    public static C5339j1 m16456d(JSONObject jSONObject, C0237p c0237p) {
        Long lValueOf;
        Rect rect;
        double dOptDouble;
        String strOptString;
        C5319e1 c5319e1;
        String str;
        if (jSONObject != null) {
            String strOptString2 = jSONObject.optString("messageId");
            try {
                long j7 = jSONObject.getLong("campaignId");
                lValueOf = j7 >= 0 ? Long.valueOf(j7) : null;
            } catch (JSONException unused) {
            }
            boolean zOptBoolean = jSONObject.optBoolean("jsonOnly", false);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("customPayload");
            if (jSONObjectOptJSONObject == null && zOptBoolean) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            if (zOptBoolean) {
                c5319e1 = new C5319e1("", new Rect(), 0.0d, new C5327g1(false, new C5323f1(0.0d, null)));
            } else {
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("content");
                if (jSONObjectOptJSONObject2 != null) {
                    if (jSONObjectOptJSONObject == null) {
                        jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("payload");
                    }
                    String strOptString3 = jSONObjectOptJSONObject2.optString("html", null);
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("inAppDisplaySettings");
                    if (jSONObjectOptJSONObject3 == null) {
                        rect = new Rect(0, 0, 0, 0);
                    } else {
                        rect = new Rect();
                        rect.top = m16453a(jSONObjectOptJSONObject3.optJSONObject("top"));
                        rect.left = m16453a(jSONObjectOptJSONObject3.optJSONObject("left"));
                        rect.bottom = m16453a(jSONObjectOptJSONObject3.optJSONObject("bottom"));
                        rect.right = m16453a(jSONObjectOptJSONObject3.optJSONObject("right"));
                    }
                    Rect rect2 = rect;
                    double dOptDouble2 = jSONObjectOptJSONObject2.optDouble("backgroundAlpha", 0.0d);
                    boolean zOptBoolean2 = jSONObjectOptJSONObject3.optBoolean("shouldAnimate", false);
                    JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("bgColor");
                    if (jSONObjectOptJSONObject4 != null) {
                        strOptString = jSONObjectOptJSONObject4.optString("hex");
                        dOptDouble = jSONObjectOptJSONObject4.optDouble("alpha");
                    } else {
                        dOptDouble = 0.0d;
                        strOptString = null;
                    }
                    c5319e1 = new C5319e1(strOptString3, rect2, dOptDouble2, new C5327g1(zOptBoolean2, new C5323f1(dOptDouble, strOptString)));
                }
            }
            long jOptLong = jSONObject.optLong("createdAt");
            Date date = jOptLong != 0 ? new Date(jOptLong) : null;
            long jOptLong2 = jSONObject.optLong("expiresAt");
            Date date2 = jOptLong2 != 0 ? new Date(jOptLong2) : null;
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("trigger");
            C5335i1 c5335i1 = jSONObjectOptJSONObject5 == null ? new C5335i1() : new C5335i1(jSONObjectOptJSONObject5);
            double dOptDouble3 = jSONObject.optDouble("priorityLevel", 300.5d);
            Boolean boolValueOf = jSONObject.has("saveToInbox") ? Boolean.valueOf(jSONObject.optBoolean("saveToInbox")) : null;
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("inboxMetadata");
            C5331h1 c5331h1 = jSONObjectOptJSONObject6 == null ? null : new C5331h1(jSONObjectOptJSONObject6.optString("title"), jSONObjectOptJSONObject6.optString("subtitle"), jSONObjectOptJSONObject6.optString("icon"));
            Double dValueOf = Double.valueOf(dOptDouble3);
            C5319e1 c5319e2 = c5319e1;
            C5339j1 c5339j1 = new C5339j1(strOptString2, c5319e2, jSONObjectOptJSONObject, date, date2, c5335i1, dValueOf, boolValueOf, c5331h1, lValueOf, zOptBoolean);
            c5339j1.f21735p = c0237p;
            if (!zOptBoolean && (str = c5319e2.f21677a) != null && !str.isEmpty()) {
                c5339j1.f21733n = true;
            }
            c5339j1.f21730k = jSONObject.optBoolean("processed", false);
            c5339j1.f21731l = jSONObject.optBoolean("consumed", false);
            c5339j1.f21732m = jSONObject.optBoolean("read", false);
            return c5339j1;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final C5319e1 m16457e() {
        C5319e1 c5319e1 = this.f21721b;
        if (c5319e1.f21677a == null && !this.f21736q) {
            C0237p c0237p = this.f21735p;
            c0237p.getClass();
            File file = new File(((Context) c0237p.f812x).getFilesDir(), "com.iterable.sdk");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, "IterableInAppFileStorage");
            if (!file2.exists()) {
                file2.mkdirs();
            }
            c5319e1.f21677a = AbstractC15751g.m44436P(new File(new File(file2, this.f21720a), "index.html"));
        }
        return c5319e1;
    }

    /* JADX INFO: renamed from: f */
    public final Date m16458f() {
        return this.f21724e;
    }

    /* JADX INFO: renamed from: g */
    public final String m16459g() {
        return this.f21720a;
    }

    /* JADX INFO: renamed from: h */
    public final double m16460h() {
        return this.f21726g;
    }

    /* JADX INFO: renamed from: i */
    public final int m16461i() {
        return this.f21725f.f21710b;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m16462j() {
        return this.f21733n;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m16463k() {
        return this.f21731l;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m16464l() {
        Boolean bool = this.f21727h;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m16465m() {
        return this.f21736q;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m16466n() {
        return this.f21734o;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m16467o() {
        return this.f21730k;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m16468p() {
        return this.f21732m;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m16469q() {
        return m16464l() && this.f21725f.f21710b == 3;
    }

    /* JADX INFO: renamed from: r */
    public final void m16470r() {
        this.f21734o = true;
    }

    /* JADX INFO: renamed from: s */
    public final void m16471s() {
        this.f21731l = true;
        C0237p c0237p = this.f21737r;
        if (c0237p != null) {
            HandlerC5361p0 handlerC5361p0 = (HandlerC5361p0) c0237p.f814z;
            if (handlerC5361p0.hasMessages(100)) {
                return;
            }
            handlerC5361p0.sendEmptyMessageDelayed(100, 100L);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m16472t() {
        this.f21733n = false;
    }

    /* JADX INFO: renamed from: u */
    public final void m16473u(C0237p c0237p) {
        this.f21737r = c0237p;
    }

    /* JADX INFO: renamed from: v */
    public final void m16474v() {
        this.f21730k = true;
        C0237p c0237p = this.f21737r;
        if (c0237p != null) {
            HandlerC5361p0 handlerC5361p0 = (HandlerC5361p0) c0237p.f814z;
            if (handlerC5361p0.hasMessages(100)) {
                return;
            }
            handlerC5361p0.sendEmptyMessageDelayed(100, 100L);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m16475w(boolean z4) {
        this.f21732m = z4;
        C0237p c0237p = this.f21737r;
        if (c0237p != null) {
            HandlerC5361p0 handlerC5361p0 = (HandlerC5361p0) c0237p.f814z;
            if (handlerC5361p0.hasMessages(100)) {
                return;
            }
            handlerC5361p0.sendEmptyMessageDelayed(100, 100L);
        }
    }

    /* JADX INFO: renamed from: x */
    public final JSONObject m16476x() {
        C5319e1 c5319e1 = this.f21721b;
        C5327g1 c5327g1 = c5319e1.f21680d;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.putOpt("messageId", this.f21720a);
            Long l7 = this.f21729j;
            if (l7 != null && l7.longValue() >= 0) {
                jSONObject.put("campaignId", l7);
            }
            Date date = this.f21723d;
            if (date != null) {
                jSONObject.putOpt("createdAt", Long.valueOf(date.getTime()));
            }
            Date date2 = this.f21724e;
            if (date2 != null) {
                jSONObject.putOpt("expiresAt", Long.valueOf(date2.getTime()));
            }
            boolean z4 = this.f21736q;
            boolean z13 = true;
            if (z4) {
                jSONObject.put("jsonOnly", 1);
            }
            jSONObject.putOpt("trigger", this.f21725f.f21709a);
            jSONObject.putOpt("priorityLevel", Double.valueOf(this.f21726g));
            JSONObject jSONObjectM16455c = m16455c(c5319e1.f21678b);
            jSONObjectM16455c.put("shouldAnimate", c5327g1.f21694w);
            if (((C5323f1) c5327g1.f21695x).f21683a != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("alpha", ((C5323f1) c5327g1.f21695x).f21684b);
                jSONObject3.putOpt("hex", ((C5323f1) c5327g1.f21695x).f21683a);
                jSONObjectM16455c.put("bgColor", jSONObject3);
            }
            jSONObject2.putOpt("inAppDisplaySettings", jSONObjectM16455c);
            double d3 = c5319e1.f21679c;
            if (d3 != 0.0d) {
                jSONObject2.putOpt("backgroundAlpha", Double.valueOf(d3));
            }
            jSONObject.putOpt("content", jSONObject2);
            jSONObject.putOpt("customPayload", this.f21722c);
            Boolean bool = this.f21727h;
            if (bool != null) {
                if (!bool.booleanValue() || z4) {
                    z13 = false;
                }
                jSONObject.putOpt("saveToInbox", Boolean.valueOf(z13));
            }
            C5331h1 c5331h1 = this.f21728i;
            if (c5331h1 != null) {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.putOpt("title", c5331h1.f21703a);
                    jSONObject4.putOpt("subtitle", c5331h1.f21704b);
                    jSONObject4.putOpt("icon", c5331h1.f21705c);
                } catch (JSONException e5) {
                    AbstractC12350b.m34596q("IterableInAppMessage", "Error while serializing inbox metadata", e5);
                }
                jSONObject.putOpt("inboxMetadata", jSONObject4);
            }
            jSONObject.putOpt("processed", Boolean.valueOf(this.f21730k));
            jSONObject.putOpt("consumed", Boolean.valueOf(this.f21731l));
            jSONObject.putOpt("read", Boolean.valueOf(this.f21732m));
            return jSONObject;
        } catch (JSONException e13) {
            AbstractC12350b.m34596q("IterableInAppMessage", "Error while serializing an in-app message", e13);
            return jSONObject;
        }
    }
}
