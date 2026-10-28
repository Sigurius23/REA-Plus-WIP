package com.iterable.iterableapi;

import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import com.google.crypto.tink.internal.C5101l0;
import e93.AbstractC12889b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p014aj.C0928c;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.iterable.iterableapi.j */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC5337j implements Runnable {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ String f21713E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ HashMap f21714F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C5341k f21715G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ String f21716w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f21717x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f21718y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f21719z;

    public RunnableC5337j(C5341k c5341k, String str, String str2, String str3, String str4, String str5, HashMap map) {
        this.f21715G = c5341k;
        this.f21716w = str;
        this.f21717x = str2;
        this.f21718y = str3;
        this.f21719z = str4;
        this.f21713E = str5;
        this.f21714F = map;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        int iM16498f;
        C5341k c5341k = this.f21715G;
        String str = this.f21716w;
        String str2 = this.f21717x;
        String str3 = this.f21718y;
        String str4 = this.f21719z;
        String str5 = this.f21713E;
        HashMap map = this.f21714F;
        if (c5341k.m16482a()) {
            if (str4 == null) {
                AbstractC12350b.m34595p("IterableApi", "registerDeviceToken: applicationName is null, check that pushIntegrationName is set in IterableConfig");
            }
            c5341k.f21744b.getClass();
            c5341k.f21744b.getClass();
            C5101l0 c5101l0 = c5341k.f21752j;
            Context context = ((C5341k) ((C0928c) c5101l0.f21443x).f3421x).f21743a;
            JSONObject jSONObject = new JSONObject();
            try {
                c5101l0.m16027B(jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                }
                jSONObject2.put("tokenRegistrationType", "FCM");
                jSONObject2.put("firebaseCompatible", true);
                C5341k.f21742r.f21744b.getClass();
                AbstractC22676k.m65750j(context, "context");
                int i13 = C5344k2.f21765x;
                if (i13 == 0) {
                    synchronized (C5344k2.f21764w) {
                        iM16498f = C5344k2.f21765x;
                        if (iM16498f == 0) {
                            iM16498f = C5344k2.m16498f(context);
                            C5344k2.f21765x = iM16498f;
                        }
                    }
                    i13 = iM16498f;
                }
                AbstractC12889b.m36255U(jSONObject2, context, ((C5341k) ((C0928c) c5101l0.f21443x).f3421x).m16485d(), new C5305b(i13, i13 == 3 ? "3.6.6" : null));
                jSONObject2.put("notificationsEnabled", NotificationManagerCompat.from(context).areNotificationsEnabled());
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("token", str5);
                jSONObject3.put("platform", "GCM");
                jSONObject3.put("applicationName", str4);
                jSONObject3.putOpt("dataFields", jSONObject2);
                jSONObject.put("device", jSONObject3);
                if (str == null && str2 != null) {
                    jSONObject.put("preferUserId", true);
                }
                c5101l0.m16056g0("users/registerDeviceToken", jSONObject, str3, null, null);
            } catch (JSONException e5) {
                AbstractC12350b.m34596q("IterableApiClient", "registerDeviceToken: exception", e5);
            }
        }
    }
}
