package com.iterable.iterableapi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.AbstractActivityC1340r0;
import com.google.crypto.tink.internal.C5101l0;
import e93.AbstractC12889b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p005a3.C0237p;
import p014aj.C0928c;
import p014aj.C0929d;
import p037bu.C3632c;
import p098dt.AbstractC12350b;
import qg3.C30352d;

/* JADX INFO: renamed from: com.iterable.iterableapi.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5315d1 implements InterfaceC5321f {

    /* JADX INFO: renamed from: E */
    public final C0929d f21658E;

    /* JADX INFO: renamed from: F */
    public final C5325g f21659F;

    /* JADX INFO: renamed from: G */
    public final double f21660G;

    /* JADX INFO: renamed from: H */
    public final ArrayList f21661H;

    /* JADX INFO: renamed from: I */
    public long f21662I;

    /* JADX INFO: renamed from: J */
    public long f21663J;

    /* JADX INFO: renamed from: K */
    public boolean f21664K;

    /* JADX INFO: renamed from: w */
    public final C5341k f21665w;

    /* JADX INFO: renamed from: x */
    public final Context f21666x;

    /* JADX INFO: renamed from: y */
    public final C0237p f21667y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC5385x0 f21668z;

    public C5315d1(C5341k c5341k, InterfaceC5385x0 interfaceC5385x0) {
        C0237p c0237p = new C0237p(c5341k.f21743a);
        C5325g c5325g = C5325g.f21686i;
        C0929d c0929d = new C0929d(c5325g);
        this.f21661H = new ArrayList();
        this.f21662I = 0L;
        this.f21663J = 0L;
        this.f21664K = false;
        this.f21665w = c5341k;
        this.f21666x = c5341k.f21743a;
        this.f21668z = interfaceC5385x0;
        this.f21660G = 30.0d;
        this.f21667y = c0237p;
        this.f21658E = c0929d;
        this.f21659F = c5325g;
        c5325g.m16438a(this);
        m16426i();
    }

    /* JADX INFO: renamed from: c */
    public static void m16420c(C5315d1 c5315d1, ArrayList arrayList) {
        C0237p c0237p = c5315d1.f21667y;
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            C5339j1 c5339j1 = (C5339j1) it.next();
            map.put(c5339j1.m16459g(), c5339j1);
            boolean z13 = c0237p.m718y(c5339j1.m16459g()) != null;
            if (!z13) {
                synchronized (c0237p) {
                    ((Map) c0237p.f813y).put(c5339j1.m16459g(), c5339j1);
                    c5339j1.m16473u(c0237p);
                    HandlerC5361p0 handlerC5361p0 = (HandlerC5361p0) c0237p.f814z;
                    if (!handlerC5361p0.hasMessages(100)) {
                        handlerC5361p0.sendEmptyMessageDelayed(100, 100L);
                    }
                }
                if (!c5339j1.m16468p()) {
                    C5341k c5341k = c5315d1.f21665w;
                    if (c5341k.m16482a()) {
                        C5101l0 c5101l0 = c5341k.f21752j;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            c5101l0.m16027B(jSONObject);
                            jSONObject.put("messageId", c5339j1.m16459g());
                            jSONObject.put("messageContext", C5101l0.m16025Q(c5339j1, null));
                            jSONObject.put("deviceInfo", c5101l0.m16036O());
                            c5101l0.m16055f0("events/trackInAppDelivery", jSONObject);
                        } catch (JSONException e5) {
                            e5.printStackTrace();
                        }
                    }
                }
                z4 = true;
            }
            if (z13) {
                C5339j1 c5339j1M718y = c0237p.m718y(c5339j1.m16459g());
                if (!c5339j1M718y.m16468p() && c5339j1.m16468p()) {
                    c5339j1M718y.m16475w(c5339j1.m16468p());
                    z4 = true;
                }
            }
        }
        for (C5339j1 c5339j2 : c0237p.m719z()) {
            if (!map.containsKey(c5339j2.m16459g())) {
                c0237p.m680K(c5339j2);
                z4 = true;
            }
        }
        c5315d1.m16425h();
        if (z4) {
            c5315d1.m16422e();
        }
    }

    @Override // com.iterable.iterableapi.InterfaceC5321f
    /* JADX INFO: renamed from: a */
    public final void mo16418a() {
    }

    @Override // com.iterable.iterableapi.InterfaceC5321f
    /* JADX INFO: renamed from: b */
    public final void mo16419b() {
        if (System.currentTimeMillis() - this.f21662I > 60000) {
            m16426i();
        } else {
            m16425h();
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized C5339j1 m16421d(String str) {
        return this.f21667y.m718y(str);
    }

    /* JADX INFO: renamed from: e */
    public final void m16422e() {
        new Handler(Looper.getMainLooper()).post(new RunnableC5311c1(this, 1));
    }

    /* JADX INFO: renamed from: f */
    public final void m16423f() {
        ArrayList<C5339j1> arrayList;
        WeakReference weakReference = this.f21659F.f21688b;
        if ((weakReference != null ? (Activity) weakReference.get() : null) != null) {
            this.f21658E.getClass();
            if (C5379v0.f21859N == null && (System.currentTimeMillis() - this.f21663J) / 1000.0d >= this.f21660G && !this.f21664K) {
                AbstractC12350b.m34557F();
                synchronized (this) {
                    arrayList = new ArrayList();
                    for (C5339j1 c5339j1 : this.f21667y.m719z()) {
                        if (!c5339j1.m16463k() && (c5339j1.m16458f() == null || System.currentTimeMillis() <= c5339j1.m16458f().getTime())) {
                            arrayList.add(c5339j1);
                        }
                    }
                }
                Collections.sort(arrayList, new C5307b1());
                for (C5339j1 c5339j2 : arrayList) {
                    if (!c5339j2.m16467o() && !c5339j2.m16463k() && c5339j2.m16461i() == 1 && !c5339j2.m16468p()) {
                        AbstractC12350b.m34593n("IterableInAppManager", "Calling onNewInApp on " + c5339j2.m16459g());
                        EnumC5382w0 enumC5382w0Mo16414a = this.f21668z.mo16414a(c5339j2);
                        AbstractC12350b.m34593n("IterableInAppManager", "Response: " + enumC5382w0Mo16414a);
                        c5339j2.m16474v();
                        if (c5339j2.m16465m()) {
                            synchronized (this) {
                                c5339j2.m16475w(true);
                                m16422e();
                            }
                            c5339j2.m16471s();
                            this.f21665w.m16488h(c5339j2, null, null);
                            return;
                        }
                        if (enumC5382w0Mo16414a == EnumC5382w0.f21883w) {
                            boolean zM16464l = c5339j2.m16464l();
                            C5388y0 c5388y0 = EnumC5303a1.f21630w;
                            C0929d c0929d = this.f21658E;
                            C30352d c30352d = new C30352d(this, c5339j2, false, 8);
                            c0929d.getClass();
                            if (c5339j2.m16465m()) {
                                return;
                            }
                            WeakReference weakReference2 = ((C5325g) c0929d.f3422w).f21688b;
                            Activity activity = weakReference2 != null ? (Activity) weakReference2.get() : null;
                            if (activity != null) {
                                String str = c5339j2.m16457e().f21677a;
                                String strM16459g = c5339j2.m16459g();
                                double d3 = c5339j2.m16457e().f21679c;
                                Rect rect = c5339j2.m16457e().f21678b;
                                boolean z4 = c5339j2.m16457e().f21680d.f21694w;
                                C5323f1 c5323f1 = (C5323f1) c5339j2.m16457e().f21680d.f21695x;
                                if (!(activity instanceof AbstractActivityC1340r0)) {
                                    AbstractC12350b.m34579a0("IterableInAppManager", "To display in-app notifications, the context must be of an instance of: FragmentActivity");
                                    return;
                                }
                                AbstractActivityC1340r0 abstractActivityC1340r0 = (AbstractActivityC1340r0) activity;
                                if (str != null) {
                                    if (C5379v0.f21859N != null) {
                                        AbstractC12350b.m34579a0("IterableInAppManager", "Skipping the in-app notification: another notification is already being displayed");
                                        return;
                                    }
                                    C5379v0.f21859N = new C5379v0();
                                    Bundle bundle = new Bundle();
                                    bundle.putString("HTML", str);
                                    bundle.putBoolean("CallbackOnCancel", true);
                                    bundle.putString("MessageId", strM16459g);
                                    bundle.putDouble("BackgroundAlpha", d3);
                                    bundle.putParcelable("InsetPadding", rect);
                                    bundle.putString("InAppBgColor", c5323f1.f21683a);
                                    bundle.putDouble("InAppBgAlpha", c5323f1.f21684b);
                                    bundle.putBoolean("ShouldAnimate", z4);
                                    C5379v0.f21860O = c30352d;
                                    C5379v0.f21861P = c5388y0;
                                    C5379v0.f21859N.setArguments(bundle);
                                    C5379v0.f21859N.show(abstractActivityC1340r0.getSupportFragmentManager(), "iterable_in_app");
                                    synchronized (this) {
                                        c5339j2.m16475w(true);
                                        m16422e();
                                    }
                                    if (zM16464l) {
                                        return;
                                    }
                                    c5339j2.m16470r();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m16424g(C5339j1 c5339j1, C5350m0 c5350m0, C5388y0 c5388y0) {
        AbstractC12350b.m34557F();
        c5339j1.m16471s();
        this.f21665w.m16488h(c5339j1, c5350m0, c5388y0);
        m16422e();
    }

    /* JADX INFO: renamed from: h */
    public final void m16425h() {
        AbstractC12350b.m34557F();
        double dCurrentTimeMillis = (System.currentTimeMillis() - this.f21663J) / 1000.0d;
        double d3 = this.f21660G;
        if (dCurrentTimeMillis >= d3) {
            m16423f();
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC5311c1(this, 0), (long) (((d3 - ((System.currentTimeMillis() - this.f21663J) / 1000.0d)) + 2.0d) * 1000.0d));
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m16426i() {
        AbstractC12350b.m34557F();
        C3632c c3632c = new C3632c(this);
        C5341k c5341k = this.f21665w;
        if (c5341k.m16482a()) {
            C5101l0 c5101l0 = c5341k.f21752j;
            C0928c c0928c = (C0928c) c5101l0.f21443x;
            C5341k c5341k2 = (C5341k) c0928c.f3421x;
            JSONObject jSONObject = new JSONObject();
            c5101l0.m16027B(jSONObject);
            try {
                c5101l0.m16027B(jSONObject);
                jSONObject.put("count", 100);
                jSONObject.put("platform", AbstractC12889b.m36247M(c5341k2.f21743a.getPackageManager()) ? "OTT" : "Android");
                jSONObject.put("SDKVersion", "3.6.6");
                jSONObject.put("systemVersion", Build.VERSION.RELEASE);
                jSONObject.put("packageName", c5341k2.f21743a.getPackageName());
                InterfaceC5348l2 interfaceC5348l2M16040T = c5101l0.m16040T();
                C5341k c5341k3 = (C5341k) c0928c.f3421x;
                interfaceC5348l2M16040T.mo16479c(c5341k3.f21745c, "inApp/getMessages", jSONObject, c5341k3.f21749g, c3632c);
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }
    }
}
