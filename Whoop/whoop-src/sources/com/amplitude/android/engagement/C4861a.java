package com.amplitude.android.engagement;

import ad3.C0775r;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.lifecycle.RunnableC1645z0;
import com.amplitude.android.engagement.types.Action;
import com.amplitude.android.engagement.types.ButtonMeta;
import com.amplitude.android.engagement.types.Nudge;
import com.google.android.gms.common.C4989f;
import com.google.crypto.tink.internal.C5101l0;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import ih0.AbstractC18489d0;
import io.sentry.RunnableC20277c7;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlinx.serialization.internal.StringSerializer;
import l83.C23470p;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p005a3.C0226m0;
import p027b3.C2375f3;
import p027b3.ViewTreeObserverOnGlobalLayoutListenerC2396k;
import p031b9.AbstractC2875y;
import p197hj.C17319b;
import p197hj.C17320c;
import p197hj.C17324g;
import p197hj.C17325h;
import p197hj.C17326i;
import p197hj.C17327j;
import p197hj.C17328k;
import p197hj.C17329l;
import p197hj.C17330m;
import p197hj.C17333p;
import p197hj.C17334q;
import p197hj.C17338u;
import p197hj.EnumC17339v;
import p197hj.RunnableC17321d;
import p197hj.RunnableC17323f;
import p222ij.C18587m;
import p222ij.C18588n;
import p281kj.C22508c;
import p281kj.C22509d;
import p281kj.C22510e;
import p281kj.WindowCallbackC22511f;
import p319m4.AbstractC25012a;
import p328mj.C25600g;
import p585wj.AbstractC37316b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import xc3.AbstractC38195a;
import yb3.AbstractC39415s;

/* JADX INFO: renamed from: com.amplitude.android.engagement.a */
/* JADX INFO: loaded from: classes.dex */
public final class C4861a {

    /* JADX INFO: renamed from: n */
    public static final C23470p f20258n = AbstractC30060g.m92088H(C17325h.f67110x);

    /* JADX INFO: renamed from: o */
    public static final C5101l0 f20259o = new C5101l0("AmplitudeEngagement");

    /* JADX INFO: renamed from: a */
    public final String f20260a;

    /* JADX INFO: renamed from: b */
    public final AmplitudeInitOptions f20261b;

    /* JADX INFO: renamed from: c */
    public C0226m0 f20262c;

    /* JADX INFO: renamed from: d */
    public final C18587m f20263d;

    /* JADX INFO: renamed from: e */
    public final C4989f f20264e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f20265f;

    /* JADX INFO: renamed from: g */
    public final LinkedHashMap f20266g;

    /* JADX INFO: renamed from: h */
    public final C23470p f20267h;

    /* JADX INFO: renamed from: i */
    public final C13045h2 f20268i;

    /* JADX INFO: renamed from: j */
    public final C13081r1 f20269j;

    /* JADX INFO: renamed from: k */
    public WeakReference f20270k;

    /* JADX INFO: renamed from: l */
    public final C23470p f20271l;

    /* JADX INFO: renamed from: m */
    public final C23470p f20272m;

    public C4861a(Application context, String apiKey, AmplitudeInitOptions amplitudeInitOptions) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(apiKey, "apiKey");
        this.f20260a = apiKey;
        this.f20261b = amplitudeInitOptions;
        new WeakReference(context.getApplicationContext());
        new LinkedHashMap();
        this.f20265f = new LinkedHashMap();
        this.f20266g = new LinkedHashMap();
        this.f20267h = AbstractC30060g.m92088H(new C17324g(this, 1));
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(null);
        this.f20268i = c13045h2M36593c;
        this.f20269j = AbstractC13091v.m36598h(c13045h2M36593c);
        this.f20271l = AbstractC30060g.m92088H(C17325h.f67112z);
        this.f20272m = AbstractC30060g.m92088H(C17325h.f67111y);
        EnumC17339v logLevel = amplitudeInitOptions.getOptions().getLogLevel();
        C5101l0 c5101l0 = f20259o;
        c5101l0.getClass();
        AbstractC22676k.m65750j(logLevel, "logLevel");
        c5101l0.f21444y = logLevel;
        Context applicationContext = context.getApplicationContext();
        AbstractC22676k.m65749i(applicationContext, "context.applicationContext");
        this.f20264e = new C4989f(applicationContext, 1);
        c5101l0.m16030H(new C17324g(this, 0));
        Context applicationContext2 = context.getApplicationContext();
        AbstractC22676k.m65749i(applicationContext2, "context.applicationContext");
        this.f20263d = new C18587m(applicationContext2, this);
        m15521g();
        C17328k c17328k = new C17328k(this);
        C17338u c17338u = C17338u.f67142w;
        C17338u.f67144y.add(c17328k);
        m15520f(c17338u.m49083a());
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC17321d(this, 1), 100L);
    }

    /* JADX INFO: renamed from: a */
    public final void m15515a(C17319b options) {
        AbstractC22676k.m65750j(options, "options");
        C17320c c17320c = options.f67095a;
        String str = c17320c.f67098b;
        String str2 = c17320c.f67097a;
        C5101l0 c5101l0 = f20259o;
        if (str2 == null && str == null) {
            c5101l0.m16067m0("User ID or Device ID must be set for targeting to work");
        }
        if (str2 == null) {
            str2 = "undefined";
        }
        if (str == null) {
            str = "undefined";
        }
        String string = new JSONObject(c17320c.f67099c).toString();
        AbstractC22676k.m65749i(string, "JSONObject(options.user.userProperties).toString()");
        C18587m c18587m = this.f20263d;
        C18588n c18588n = c18587m.f72611i;
        if (c18588n == null) {
            AbstractC22676k.m65757q("integrationsBridge");
            throw null;
        }
        c18588n.f72613a.clear();
        Function1[] function1Arr = options.f67096b;
        C18588n c18588n2 = c18587m.f72611i;
        if (c18588n2 == null) {
            AbstractC22676k.m65757q("integrationsBridge");
            throw null;
        }
        for (Function1 track : function1Arr) {
            AbstractC22676k.m65750j(track, "track");
            c18588n2.f72613a.add(track);
        }
        c5101l0.m16030H(new C2375f3(str2, str, string, 2));
        StringBuilder sb4 = new StringBuilder("\n            window.engagement.boot({\n                user: {\n                    user_id: \"");
        AbstractC11266d.m30444B(sb4, str2, "\",\n                    device_id: \"", str, "\",\n                    user_properties: ");
        sb4.append(string);
        sb4.append("\n                },\n                integrations: [\n                  {\n                    track: (event) => {\n                        IntegrationsBridge.track(JSON.stringify(event));\n                    },\n                  },\n                ]\n            })\n            ");
        c18587m.m53801a(AbstractC39415s.m125909s(sb4.toString()), C17326i.f67114x);
    }

    /* JADX INFO: renamed from: b */
    public final void m15516b(Nudge nudge) {
        String strM1833d;
        C17327j c17327j = new C17327j(nudge, 1);
        C5101l0 c5101l0 = f20259o;
        c5101l0.m16030H(c17327j);
        try {
            C0775r c0775r = AbstractC37316b.f159546a;
            c0775r.getClass();
            strM1833d = c0775r.m1833d(Nudge.Companion.serializer(), nudge);
        } catch (Exception e5) {
            c5101l0.m16067m0(AbstractC2875y.m8298k(e5, new StringBuilder("Failed to serialize to JSON string: ")));
            strM1833d = null;
        }
        if (strM1833d == null) {
            return;
        }
        this.f20263d.m53801a("globalThis.nudgeActions.dismissNudge(" + strM1833d + ')', null);
    }

    /* JADX INFO: renamed from: c */
    public final void m15517c(int i13, Action action, ButtonMeta meta) {
        String strM1833d;
        AbstractC22676k.m65750j(meta, "meta");
        C17329l c17329l = new C17329l(i13, action, meta);
        C5101l0 c5101l0 = f20259o;
        c5101l0.m16030H(c17329l);
        String strM1833d2 = null;
        try {
            C0775r c0775r = AbstractC37316b.f159546a;
            c0775r.getClass();
            strM1833d = c0775r.m1833d(ButtonMeta.Companion.serializer(), meta);
        } catch (Exception e5) {
            c5101l0.m16067m0(AbstractC2875y.m8298k(e5, new StringBuilder("Failed to serialize to JSON string: ")));
            strM1833d = null;
        }
        if (strM1833d == null) {
            return;
        }
        try {
            C0775r c0775r2 = AbstractC37316b.f159546a;
            c0775r2.getClass();
            strM1833d2 = c0775r2.m1833d(AbstractC38195a.m122336d(Action.Companion.serializer()), action);
        } catch (Exception e13) {
            c5101l0.m16067m0(AbstractC2875y.m8298k(e13, new StringBuilder("Failed to serialize to JSON string: ")));
        }
        if (strM1833d2 == null) {
            return;
        }
        this.f20263d.m53801a(AbstractC25012a.m73377j(AbstractC18489d0.m53373n(i13, "globalThis.nudgeActions.execNudgeAction(", ", ", strM1833d2, ", "), strM1833d, ')'), C17330m.f67123x);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002f  */
    /* JADX INFO: renamed from: d */
    public final void m15518d(int i13, int i14, String str) {
        String strM1833d;
        C17333p c17333p = new C17333p(i13, i14, str);
        C5101l0 c5101l0 = f20259o;
        c5101l0.m16030H(c17333p);
        if (str != null) {
            try {
                C0775r c0775r = AbstractC37316b.f159546a;
                c0775r.getClass();
                strM1833d = c0775r.m1833d(StringSerializer.INSTANCE, str);
            } catch (Exception e5) {
                c5101l0.m16067m0(AbstractC2875y.m8298k(e5, new StringBuilder("Failed to serialize to JSON string: ")));
                strM1833d = null;
            }
            if (strM1833d == null) {
                strM1833d = "undefined";
            }
        } else {
            strM1833d = "undefined";
        }
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "globalThis.nudgeActions.handleLinkTap(", ", ", ", ");
        sbM30465s.append(strM1833d);
        sbM30465s.append(')');
        this.f20263d.m53801a(sbM30465s.toString(), null);
    }

    /* JADX INFO: renamed from: e */
    public final void m15519e(Activity activity, boolean z4) {
        if (activity == null) {
            activity = C17338u.f67142w.m49083a();
        }
        C5101l0 c5101l0 = f20259o;
        if (activity == null) {
            c5101l0.m16067m0("No activity available for smart interactions injection");
            return;
        }
        if (!z4) {
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC17323f(this, activity, 0), 1000L);
            return;
        }
        Window window = activity.getWindow();
        if (window == null) {
            c5101l0.m16067m0("Failed to find window for smart interactions injection");
            return;
        }
        if (window.getCallback() instanceof WindowCallbackC22511f) {
            return;
        }
        WeakReference weakReference = new WeakReference(window.getCallback());
        this.f20270k = weakReference;
        Window.Callback callback = (Window.Callback) weakReference.get();
        if (callback != null) {
            window.setCallback(new WindowCallbackC22511f(callback, new C17334q(this, 0)));
            c5101l0.m16031I("Injected smart interactions window callback successfully");
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m15520f(Activity activity) {
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver = (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            C0226m0 c0226m0 = this.f20262c;
            if (c0226m0 != null) {
                c0226m0.invoke();
            }
            this.f20262c = null;
            ViewTreeObserverOnGlobalLayoutListenerC2396k viewTreeObserverOnGlobalLayoutListenerC2396k = new ViewTreeObserverOnGlobalLayoutListenerC2396k(this, 1);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2396k);
            this.f20262c = new C0226m0(6, viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC2396k);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m15521g() {
        ((C22510e) this.f20271l.getValue()).f88222a = new C17334q(this, 1);
        int i13 = 2;
        ((C22509d) this.f20272m.getValue()).f88216a = new C17324g(this, i13);
        ((C22508c) f20258n.getValue()).f88215a = new C17334q(this, i13);
    }

    /* JADX INFO: renamed from: h */
    public final void m15522h() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        Handler handler4;
        Window.Callback callback;
        C5101l0 c5101l0 = f20259o;
        int i13 = ((EnumC17339v) c5101l0.f21444y).f67150w;
        EnumC17339v enumC17339v = EnumC17339v.DEBUG;
        if (4 <= i13) {
            c5101l0.m16045Z(enumC17339v, "AmplitudeEngagement.sdk#shutdown()");
        }
        this.f20263d.m53801a("window.engagement.shutdown()", null);
        C17338u c17338u = C17338u.f67142w;
        Activity activityM49083a = c17338u.m49083a();
        if (activityM49083a != null) {
            activityM49083a.runOnUiThread(new RunnableC17321d(this, 0));
        }
        this.f20265f.clear();
        C25600g c25600g = (C25600g) this.f20267h.getValue();
        c25600g.getClass();
        Activity activityM49083a2 = c17338u.m49083a();
        if (activityM49083a2 != null) {
            activityM49083a2.runOnUiThread(new RunnableC1645z0(c25600g, 17));
        }
        this.f20268i.m36570j(null);
        if (4 <= ((EnumC17339v) c5101l0.f21444y).f67150w) {
            c5101l0.m16045Z(enumC17339v, "AmplitudeEngagement.sdk[internal]#resetSmartInteractions()");
        }
        WeakReference weakReference = this.f20270k;
        if (weakReference != null && (callback = (Window.Callback) weakReference.get()) != null) {
            Activity activityM49083a3 = c17338u.m49083a();
            Window window = activityM49083a3 != null ? activityM49083a3.getWindow() : null;
            if (window != null) {
                window.setCallback(callback);
            }
            this.f20270k = null;
        }
        C23470p c23470p = this.f20271l;
        ((C22510e) c23470p.getValue()).m65011a();
        C23470p c23470p2 = this.f20272m;
        C22509d c22509d = (C22509d) c23470p2.getValue();
        c22509d.f88217b = false;
        RunnableC20277c7 runnableC20277c7 = c22509d.f88219d;
        if (runnableC20277c7 != null && (handler4 = c22509d.f88218c) != null) {
            handler4.removeCallbacks(runnableC20277c7);
        }
        c22509d.f88218c = null;
        c22509d.f88219d = null;
        RunnableC1645z0 runnableC1645z0 = c22509d.f88221f;
        if (runnableC1645z0 != null && (handler3 = c22509d.f88220e) != null) {
            handler3.removeCallbacks(runnableC1645z0);
        }
        c22509d.f88220e = null;
        c22509d.f88221f = null;
        ((C22508c) f20258n.getValue()).f88215a = null;
        ((C22510e) c23470p.getValue()).m65011a();
        C22509d c22509d2 = (C22509d) c23470p2.getValue();
        c22509d2.f88217b = false;
        RunnableC20277c7 runnableC20277c8 = c22509d2.f88219d;
        if (runnableC20277c8 != null && (handler2 = c22509d2.f88218c) != null) {
            handler2.removeCallbacks(runnableC20277c8);
        }
        c22509d2.f88218c = null;
        c22509d2.f88219d = null;
        RunnableC1645z0 runnableC1645z1 = c22509d2.f88221f;
        if (runnableC1645z1 != null && (handler = c22509d2.f88220e) != null) {
            handler.removeCallbacks(runnableC1645z1);
        }
        c22509d2.f88220e = null;
        c22509d2.f88221f = null;
        m15521g();
    }
}
