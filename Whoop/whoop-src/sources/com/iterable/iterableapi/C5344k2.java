package com.iterable.iterableapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import java.security.KeyStore;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: com.iterable.iterableapi.k2 */
/* JADX INFO: loaded from: classes.dex */
public final class C5344k2 implements InterfaceC5348l2, InterfaceC5322f0 {

    /* JADX INFO: renamed from: w */
    public static final C5344k2 f21764w = new C5344k2();

    /* JADX INFO: renamed from: x */
    public static volatile int f21765x;

    /* JADX INFO: renamed from: d */
    public static final KeyStore m16496d() {
        char[] cArr = C5390z.f21892a;
        Object value = C5390z.f21893b.getValue();
        AbstractC22676k.m65749i(value, "getValue(...)");
        return (KeyStore) value;
    }

    /* JADX INFO: renamed from: e */
    public static void m16497e(JSONObject jSONObject) {
        try {
            jSONObject.put("createdAt", jSONObject.has("createdAt") ? Long.parseLong(jSONObject.getString("createdAt")) : new Date().getTime() / 1000);
        } catch (JSONException unused) {
            AbstractC12350b.m34595p("OnlineRequestProcessor", "Could not add createdAt timestamp to json object");
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m16498f(Context context) {
        boolean zM16499g = m16499g(AbstractC5362p1.f21803a);
        boolean zM16499g2 = m16499g(AbstractC5362p1.f21804b);
        if (zM16499g && zM16499g2) {
            AbstractC12350b.m34593n("FrameworkDetector", "Both Flutter and React Native frameworks detected. This is unexpected.");
            String packageName = context.getPackageName();
            AbstractC22676k.m65749i(packageName, "getPackageName(...)");
            if (AbstractC39421y.m125920E(packageName, ".flutter", false) || m16500h(context, AbstractC5365q1.f21809a)) {
                return 1;
            }
            m16500h(context, AbstractC5365q1.f21810b);
            return 2;
        }
        if (zM16499g) {
            return 1;
        }
        if (!zM16499g2) {
            if (m16500h(context, AbstractC5365q1.f21809a)) {
                return 1;
            }
            if (!m16500h(context, AbstractC5365q1.f21810b)) {
                return 3;
            }
        }
        return 2;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m16499g(List list) {
        boolean z4;
        List<String> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (String className : list2) {
                AbstractC22676k.m65750j(className, "className");
                try {
                    Class.forName(className);
                    z4 = true;
                } catch (ClassNotFoundException unused) {
                    z4 = false;
                }
                if (z4) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m16500h(Context context, List list) {
        try {
            Bundle bundle = context.getPackageManager().getPackageInfo(context.getPackageName(), 128).applicationInfo.metaData;
            List<String> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (String str : list2) {
                    if (bundle != null && bundle.containsKey(str)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e5) {
            AbstractC12350b.m34595p("FrameworkDetector", "Error checking manifest metadata: " + e5.getMessage());
            return false;
        }
    }

    @Override // com.iterable.iterableapi.InterfaceC5348l2
    /* JADX INFO: renamed from: a */
    public void mo16477a() {
    }

    @Override // com.iterable.iterableapi.InterfaceC5348l2
    /* JADX INFO: renamed from: b */
    public void mo16478b(String str, String str2, JSONObject jSONObject, String str3, C5392z1 c5392z1, InterfaceC5318e0 interfaceC5318e0) {
        m16497e(jSONObject);
        new AsyncTaskC5304a2().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new C5357o(str, str2, jSONObject, "POST", str3, c5392z1, interfaceC5318e0));
    }

    @Override // com.iterable.iterableapi.InterfaceC5348l2
    /* JADX INFO: renamed from: c */
    public void mo16479c(String str, String str2, JSONObject jSONObject, String str3, InterfaceC5322f0 interfaceC5322f0) {
        m16497e(jSONObject);
        new AsyncTaskC5304a2().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new C5357o(str, str2, jSONObject, "GET", str3, interfaceC5322f0));
    }

    @Override // com.iterable.iterableapi.InterfaceC5322f0
    /* JADX INFO: renamed from: i */
    public void mo11170i(String str) {
        if (str == null) {
            AbstractC12350b.m34595p("IterableApi", "Remote configuration returned null");
            return;
        }
        try {
            boolean z4 = new JSONObject(str).getBoolean("offlineMode");
            C5341k.f21742r.f21752j.m16059i0(z4);
            SharedPreferences.Editor editorEdit = C5341k.f21742r.f21743a.getSharedPreferences("itbl_saved_configuration", 0).edit();
            editorEdit.putBoolean("itbl_offline_mode", z4);
            editorEdit.apply();
        } catch (JSONException unused) {
            AbstractC12350b.m34595p("IterableApi", "Failed to read remote configuration");
        }
    }
}
