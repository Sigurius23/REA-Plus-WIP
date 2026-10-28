package n92;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.iterable.iterableapi.AbstractC5375u;
import com.iterable.iterableapi.C5310c0;
import com.iterable.iterableapi.C5314d0;
import com.iterable.iterableapi.C5315d1;
import com.iterable.iterableapi.C5325g;
import com.iterable.iterableapi.C5333i;
import com.iterable.iterableapi.C5341k;
import com.iterable.iterableapi.C5347l1;
import com.iterable.iterableapi.C5359o1;
import com.iterable.iterableapi.C5378v;
import com.iterable.iterableapi.C5381w;
import com.iterable.iterableapi.InterfaceC5385x0;
import com.iterable.iterableapi.RunnableC5343k1;
import e93.AbstractC12889b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p098dt.AbstractC12350b;
import p581we.C37199o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n92.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Ln92/g;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "", "apiKey", "Lcom/iterable/iterableapi/w;", "config", "Ll83/a0;", "a", "(Landroid/content/Context;Ljava/lang/String;Lcom/iterable/iterableapi/w;)V", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26485g {
    /* JADX INFO: renamed from: a */
    public final void m78532a(Context appContext, String apiKey, C5381w config) {
        AbstractC22676k.m65750j(appContext, "appContext");
        AbstractC22676k.m65750j(apiKey, "apiKey");
        AbstractC22676k.m65750j(config, "config");
        C5341k.f21742r.f21743a = appContext.getApplicationContext();
        C5341k.f21742r.f21745c = apiKey;
        C5341k.f21742r.f21744b = config;
        int i13 = 0;
        if (C5341k.f21742r.f21744b == null) {
            C5341k.f21742r.f21744b = new C5381w(new C5378v(0));
        }
        C5341k c5341k = C5341k.f21742r;
        if (c5341k.f21743a != null) {
            C5359o1 c5359o1M16487g = c5341k.m16487g();
            if (c5359o1M16487g != null) {
                c5341k.f21746d = c5359o1M16487g.m16504b("iterable-email");
                c5341k.f21747e = c5359o1M16487g.m16504b("iterable-user-id");
                c5341k.f21748f = c5359o1M16487g.m16504b("iterable-unknown-user-id");
                c5341k.f21749g = c5359o1M16487g.m16504b("iterable-auth-token");
            } else {
                AbstractC12350b.m34595p("IterableApi", "retrieveEmailAndUserId: Shared preference creation failed. Could not retrieve email/userId");
            }
            c5341k.f21744b.getClass();
        }
        AbstractC12889b.m36256V(appContext);
        C5325g c5325g = C5325g.f21686i;
        c5325g.getClass();
        if (!C5325g.f21685h) {
            C5325g.f21685h = true;
            ((Application) appContext.getApplicationContext()).registerActivityLifecycleCallbacks(c5325g.f21693g);
        }
        c5325g.m16438a(C5341k.f21742r.f21759q);
        if (C5341k.f21742r.f21754l == null) {
            C5341k c5341k2 = C5341k.f21742r;
            C5341k c5341k3 = C5341k.f21742r;
            InterfaceC5385x0 interfaceC5385x0 = C5341k.f21742r.f21744b.f21879e;
            C5341k.f21742r.f21744b.getClass();
            C5341k.f21742r.f21744b.getClass();
            c5341k2.f21754l = new C5315d1(c5341k3, interfaceC5385x0);
        }
        if (C5341k.f21742r.f21755m == null) {
            C5341k c5341k4 = C5341k.f21742r;
            C5341k iterableApi = C5341k.f21742r;
            AbstractC22676k.m65750j(iterableApi, "iterableApi");
            C5310c0 c5310c0 = new C5310c0();
            new LinkedHashMap();
            new ArrayList();
            new ArrayList();
            C37199o c37199o = new C37199o();
            c37199o.f159040w = new LinkedHashMap();
            c37199o.f159041x = new C5314d0(null);
            c5310c0.f21652x = c37199o;
            c5310c0.f21651w = iterableApi;
            AbstractC22676k.m65749i(iterableApi.f21743a, "getMainActivityContext(...)");
            iterableApi.f21744b.getClass();
            c5341k4.f21755m = c5310c0;
        }
        if (C5341k.f21742r.f21753k == null) {
            C5341k c5341k5 = C5341k.f21742r;
            C5341k c5341k6 = C5341k.f21742r;
            C5333i c5333i = new C5333i();
            C5341k c5341k7 = C5341k.f21742r;
            c5333i.f21708x = c5341k6;
            c5325g.m16438a(c5333i);
            c5341k5.f21753k = c5333i;
        }
        C5341k.f21742r.f21752j.m16059i0(appContext.getSharedPreferences("itbl_saved_configuration", 0).getBoolean("itbl_offline_mode", false));
        AbstractC12889b.m36256V(appContext);
        if (!C5341k.f21742r.m16482a() && C5341k.f21742r.f21748f == null) {
            C5341k.f21742r.f21744b.getClass();
        }
        if (AbstractC12889b.m36247M(appContext.getPackageManager())) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                AbstractC12889b.m36255U(jSONObject2, appContext, C5341k.f21742r.m16485d(), null);
                jSONObject.put("FireTV", jSONObject2);
                C5341k c5341k8 = C5341k.f21742r;
                if (c5341k8.m16482a() || c5341k8.f21748f != null) {
                    c5341k8.f21752j.m16065l0(jSONObject);
                } else {
                    C5341k.f21742r.f21744b.getClass();
                }
            } catch (JSONException e5) {
                AbstractC12350b.m34596q("IterableApi", "initialize: exception", e5);
            }
        }
        C5347l1 c5347l1 = AbstractC5375u.f21838a;
        synchronized (c5347l1.f21769d) {
            try {
                if (c5347l1.f21768c) {
                    AbstractC12350b.m34593n("IterableInitCallbackMgr", "notifyInitializationComplete called but already initialized");
                    return;
                }
                c5347l1.f21768c = true;
                AbstractC12350b.m34593n("IterableInitCallbackMgr", "Notifying initialization completion to " + c5347l1.f21766a.size() + " subscribers and " + c5347l1.f21767b.size() + " one-time callbacks");
                Iterator it = c5347l1.f21766a.iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    if (Looper.myLooper() != Looper.getMainLooper()) {
                        new Handler(Looper.getMainLooper()).post(new RunnableC5343k1(i13));
                    } else {
                        try {
                            throw null;
                        } catch (Exception e13) {
                            AbstractC12350b.m34596q("IterableInitCallbackMgr", "Exception in subscriber initialization callback", e13);
                        }
                    }
                }
                c5347l1.f21766a.clear();
                if (c5347l1.f21767b.poll() != null) {
                    throw new ClassCastException();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
