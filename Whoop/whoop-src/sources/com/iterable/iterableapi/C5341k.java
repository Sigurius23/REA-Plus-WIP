package com.iterable.iterableapi;

import android.content.Context;
import com.google.crypto.tink.internal.C5101l0;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p009a8.RunnableC0533c;
import p014aj.C0928c;
import p098dt.AbstractC12350b;

/* JADX INFO: renamed from: com.iterable.iterableapi.k */
/* JADX INFO: loaded from: classes.dex */
public final class C5341k {

    /* JADX INFO: renamed from: r */
    public static volatile C5341k f21742r = new C5341k();

    /* JADX INFO: renamed from: a */
    public Context f21743a;

    /* JADX INFO: renamed from: c */
    public String f21745c;

    /* JADX INFO: renamed from: d */
    public String f21746d;

    /* JADX INFO: renamed from: e */
    public String f21747e;

    /* JADX INFO: renamed from: f */
    public String f21748f;

    /* JADX INFO: renamed from: g */
    public String f21749g;

    /* JADX INFO: renamed from: h */
    public String f21750h;

    /* JADX INFO: renamed from: i */
    public boolean f21751i;

    /* JADX INFO: renamed from: k */
    public C5333i f21753k;

    /* JADX INFO: renamed from: l */
    public C5315d1 f21754l;

    /* JADX INFO: renamed from: m */
    public C5310c0 f21755m;

    /* JADX INFO: renamed from: n */
    public C5369s f21756n;

    /* JADX INFO: renamed from: p */
    public C5359o1 f21758p;

    /* JADX INFO: renamed from: j */
    public final C5101l0 f21752j = new C5101l0(new C0928c(this, 6));

    /* JADX INFO: renamed from: o */
    public final HashMap f21757o = new HashMap();

    /* JADX INFO: renamed from: q */
    public final C5333i f21759q = new C5333i(this);

    /* JADX INFO: renamed from: b */
    public C5381w f21744b = new C5381w(new C5378v(0));

    /* JADX INFO: renamed from: f */
    public static C5341k m16480f() {
        return f21742r;
    }

    /* JADX INFO: renamed from: j */
    public static String m16481j(String str) {
        if (str == null || str.isEmpty()) {
            return "null";
        }
        if (str.length() == 1) {
            return "*";
        }
        return str.charAt(0) + "***";
    }

    /* JADX INFO: renamed from: a */
    public final boolean m16482a() {
        if (m16489i()) {
            return true;
        }
        AbstractC12350b.m34579a0("IterableApi", "Iterable SDK must be initialized with an API key and user email/userId before calling SDK methods");
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m16483b() {
        if (m16489i()) {
            this.f21744b.getClass();
            this.f21744b.getClass();
            m16490k();
            m16486e().m16426i();
            C5310c0 c5310c0 = this.f21755m;
            if (c5310c0 == null) {
                throw new RuntimeException("IterableApi must be initialized before calling getEmbeddedManager(). Make sure you call IterableApi#initialize() in Application#onCreate");
            }
            c5310c0.f21651w.f21744b.getClass();
        }
    }

    /* JADX INFO: renamed from: c */
    public final C5369s m16484c() {
        if (this.f21756n == null) {
            this.f21744b.getClass();
            this.f21756n = new C5369s(this, this.f21744b.f21880f);
        }
        return this.f21756n;
    }

    /* JADX INFO: renamed from: d */
    public final String m16485d() {
        if (this.f21750h == null) {
            String string = this.f21743a.getSharedPreferences("com.iterable.iterableapi", 0).getString("itbl_deviceid", null);
            this.f21750h = string;
            if (string == null) {
                this.f21750h = UUID.randomUUID().toString();
                this.f21743a.getSharedPreferences("com.iterable.iterableapi", 0).edit().putString("itbl_deviceid", this.f21750h).apply();
            }
        }
        return this.f21750h;
    }

    /* JADX INFO: renamed from: e */
    public final C5315d1 m16486e() {
        C5315d1 c5315d1 = this.f21754l;
        if (c5315d1 != null) {
            return c5315d1;
        }
        throw new RuntimeException("IterableApi must be initialized before calling getInAppManager(). Make sure you call IterableApi#initialize() in Application#onCreate");
    }

    /* JADX INFO: renamed from: g */
    public final C5359o1 m16487g() {
        if (this.f21743a == null) {
            return null;
        }
        if (this.f21758p == null) {
            try {
                Context context = this.f21743a;
                this.f21744b.getClass();
                this.f21744b.getClass();
                this.f21758p = new C5359o1(context);
            } catch (Exception e5) {
                AbstractC12350b.m34596q("IterableApi", "Failed to create IterableKeychain", e5);
            }
        }
        return this.f21758p;
    }

    /* JADX INFO: renamed from: h */
    public final void m16488h(C5339j1 c5339j1, EnumC5358o0 enumC5358o0, EnumC5303a1 enumC5303a1) {
        if (m16482a()) {
            C5101l0 c5101l0 = this.f21752j;
            JSONObject jSONObject = new JSONObject();
            try {
                c5101l0.m16027B(jSONObject);
                jSONObject.put("messageId", c5339j1.m16459g());
                if (enumC5358o0 != null) {
                    jSONObject.put("deleteAction", enumC5358o0.toString());
                }
                if (enumC5303a1 != null) {
                    jSONObject.put("messageContext", C5101l0.m16025Q(c5339j1, enumC5303a1));
                    jSONObject.put("deviceInfo", c5101l0.m16036O());
                }
                c5101l0.m16056g0("events/inAppConsume", jSONObject, ((C5341k) ((C0928c) c5101l0.f21443x).f3421x).f21749g, null, null);
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m16489i() {
        if (this.f21745c != null) {
            return (this.f21746d == null && this.f21747e == null) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final void m16490k() {
        if (m16482a()) {
            String str = this.f21746d;
            String str2 = this.f21747e;
            String str3 = this.f21749g;
            String packageName = this.f21744b.f21875a;
            if (packageName == null) {
                packageName = this.f21743a.getPackageName();
            }
            new AsyncTaskC5389y1().execute(new C5386x1(str, str2, str3, packageName, 1));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m16491l(boolean z4) {
        if (m16489i()) {
            String str = this.f21749g;
            if (str == null || str.equalsIgnoreCase(null)) {
                if (z4) {
                    m16483b();
                    return;
                }
                return;
            }
            this.f21749g = null;
            if (this.f21743a == null) {
                return;
            }
            C5359o1 c5359o1M16487g = m16487g();
            if (c5359o1M16487g != null) {
                c5359o1M16487g.m16505c("iterable-email", this.f21746d);
                c5359o1M16487g.m16505c("iterable-user-id", this.f21747e);
                c5359o1M16487g.m16505c("iterable-unknown-user-id", this.f21748f);
                c5359o1M16487g.m16505c("iterable-auth-token", this.f21749g);
            } else {
                AbstractC12350b.m34595p("IterableApi", "Shared preference creation failed. ");
            }
            m16483b();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m16492m(String str) {
        RunnableC0533c runnableC0533c = new RunnableC0533c(10, this, str);
        m16481j(str);
        C5347l1 c5347l1 = AbstractC5375u.f21838a;
        runnableC0533c.run();
    }

    /* JADX INFO: renamed from: n */
    public final void m16493n(String str, String str2) {
        if (m16482a()) {
            C5101l0 c5101l0 = this.f21752j;
            c5101l0.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                c5101l0.m16027B(jSONObject);
                jSONObject.put("messageId", str);
                jSONObject.put("clickedUrl", str2);
                c5101l0.m16055f0("events/trackInAppClick", jSONObject);
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m16494o(String str, String str2, EnumC5342k0 enumC5342k0, EnumC5303a1 enumC5303a1) {
        C5339j1 c5339j1M16421d = m16486e().m16421d(str);
        if (c5339j1M16421d == null) {
            AbstractC12350b.m34579a0("IterableApi", "trackInAppClose: could not find an in-app message with ID: " + str);
            return;
        }
        if (m16482a()) {
            C5101l0 c5101l0 = this.f21752j;
            JSONObject jSONObject = new JSONObject();
            try {
                c5101l0.m16027B(jSONObject);
                jSONObject.put("messageId", c5339j1M16421d.m16459g());
                jSONObject.putOpt("clickedUrl", str2);
                jSONObject.put("closeAction", enumC5342k0.toString());
                jSONObject.put("messageContext", C5101l0.m16025Q(c5339j1M16421d, enumC5303a1));
                jSONObject.put("deviceInfo", c5101l0.m16036O());
                c5101l0.m16055f0("events/trackInAppClose", jSONObject);
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }
        AbstractC12350b.m34557F();
    }
}
