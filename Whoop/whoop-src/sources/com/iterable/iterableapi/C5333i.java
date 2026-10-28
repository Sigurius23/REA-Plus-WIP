package com.iterable.iterableapi;

import android.content.SharedPreferences;
import android.os.Build;
import androidx.core.app.NotificationManagerCompat;
import com.google.crypto.tink.internal.C5101l0;
import e93.AbstractC12889b;
import org.json.JSONException;
import org.json.JSONObject;
import p014aj.C0928c;
import p098dt.AbstractC12350b;

/* JADX INFO: renamed from: com.iterable.iterableapi.i */
/* JADX INFO: loaded from: classes.dex */
public final class C5333i implements InterfaceC5321f {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f21707w = 1;

    /* JADX INFO: renamed from: x */
    public C5341k f21708x;

    public /* synthetic */ C5333i() {
    }

    /* JADX INFO: renamed from: c */
    private final void m16450c() {
    }

    /* JADX INFO: renamed from: d */
    private final void m16451d() {
    }

    @Override // com.iterable.iterableapi.InterfaceC5321f
    /* JADX INFO: renamed from: a */
    public final void mo16418a() {
        int i13 = this.f21707w;
    }

    @Override // com.iterable.iterableapi.InterfaceC5321f
    /* JADX INFO: renamed from: b */
    public final void mo16419b() {
        switch (this.f21707w) {
            case 0:
                C5341k c5341k = this.f21708x;
                if (!c5341k.f21751i) {
                    c5341k.f21751i = true;
                    C5341k.f21742r.f21744b.getClass();
                    if (C5341k.f21742r.m16489i()) {
                        C5341k.f21742r.m16490k();
                    }
                    C5101l0 c5101l0 = c5341k.f21752j;
                    C5344k2 c5344k2 = new C5344k2();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.putOpt("platform", "Android");
                        jSONObject.putOpt("appPackageName", ((C5341k) ((C0928c) c5101l0.f21443x).f3421x).f21743a.getPackageName());
                        jSONObject.put("SDKVersion", "3.6.6");
                        jSONObject.put("systemVersion", Build.VERSION.RELEASE);
                        InterfaceC5348l2 interfaceC5348l2M16040T = c5101l0.m16040T();
                        C5341k c5341k2 = (C5341k) ((C0928c) c5101l0.f21443x).f3421x;
                        interfaceC5348l2M16040T.mo16479c(c5341k2.f21745c, "mobile/getRemoteConfiguration", jSONObject, c5341k2.f21749g, c5344k2);
                    } catch (JSONException e5) {
                        e5.printStackTrace();
                    }
                }
                if (c5341k.f21743a == null || C5341k.f21742r.f21743a == null) {
                    AbstractC12350b.m34579a0("IterableApi", "onForeground: _applicationContext is null");
                } else {
                    boolean zAreNotificationsEnabled = NotificationManagerCompat.from(c5341k.f21743a).areNotificationsEnabled();
                    SharedPreferences sharedPreferences = C5341k.f21742r.f21743a.getSharedPreferences("com.iterable.iterableapi", 0);
                    boolean zContains = sharedPreferences.contains("itbl_notifications_enabled");
                    boolean z4 = sharedPreferences.getBoolean("itbl_notifications_enabled", false);
                    if (C5341k.f21742r.m16489i()) {
                        AbstractC12889b.m36256V(c5341k.f21743a);
                        C5341k.f21742r.f21744b.getClass();
                        if (zContains && z4 != zAreNotificationsEnabled) {
                            C5341k.f21742r.m16490k();
                        }
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putBoolean("itbl_notifications_enabled", zAreNotificationsEnabled);
                        editorEdit.apply();
                    }
                }
                break;
            default:
                System.currentTimeMillis();
                C5341k c5341k3 = this.f21708x;
                if (!c5341k3.m16482a() && c5341k3.f21748f == null) {
                    c5341k3.f21744b.getClass();
                    break;
                }
                break;
        }
    }

    public C5333i(C5341k c5341k) {
        this.f21708x = c5341k;
    }
}
