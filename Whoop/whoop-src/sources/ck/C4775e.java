package ck;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import androidx.lifecycle.C1578e1;
import androidx.room.C1849z1;
import bc3.AbstractC3006f0;
import com.iterable.iterableapi.C5317e;
import fk.InterfaceC14544a;
import hc3.AbstractC17182o;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import l83.C23454a0;
import l83.C23465k;
import l83.C23470p;
import m83.AbstractC25247g0;
import p007a6.C0410c;
import p015ak.AbstractC0938f;
import p120ek.C13270d;
import p173gj.C15903d;
import p173gj.C15906g;
import p173gj.EnumC15904e;
import p223ik.EnumC18597a;
import p223ik.InterfaceC18598b;
import p255jk.C21743a;
import p282kk.EnumC22535d;
import p282kk.InterfaceC22536e;
import p581we.C37199o;
import p650yj.AbstractC39586b;
import p683zj.WindowCallbackC40704c;
import p683zj.WindowCallbackC40705d;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: ck.e */
/* JADX INFO: loaded from: classes.dex */
public final class C4775e implements Application.ActivityLifecycleCallbacks, InterfaceC22536e {

    /* JADX INFO: renamed from: E */
    public final LinkedHashSet f19665E;

    /* JADX INFO: renamed from: F */
    public final LinkedHashSet f19666F;

    /* JADX INFO: renamed from: G */
    public boolean f19667G;

    /* JADX INFO: renamed from: w */
    public final C5317e f19668w;

    /* JADX INFO: renamed from: x */
    public PackageInfo f19669x;

    /* JADX INFO: renamed from: y */
    public C15903d f19670y;

    /* JADX INFO: renamed from: z */
    public C15906g f19671z;

    public C4775e(C5317e activityLifecycleObserver) {
        AbstractC22676k.m65750j(activityLifecycleObserver, "activityLifecycleObserver");
        this.f19668w = activityLifecycleObserver;
        this.f19665E = new LinkedHashSet();
        this.f19666F = new LinkedHashSet();
    }

    @Override // p282kk.InterfaceC22536e
    /* JADX INFO: renamed from: b */
    public final void mo15043b(C15903d c15903d) {
        PackageInfo packageInfo;
        this.f19670y = c15903d;
        C15906g c15906g = c15903d.f60128a;
        this.f19671z = c15906g;
        Context context = c15906g.f60153b;
        AbstractC22676k.m65748h(context, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) context;
        C15906g c15906g2 = this.f19671z;
        InterfaceC30057d interfaceC30057d = null;
        if (c15906g2 == null) {
            AbstractC22676k.m65757q("androidConfiguration");
            throw null;
        }
        if (c15906g2.f60169r.contains(EnumC15904e.f60147x)) {
            try {
                packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
                AbstractC22676k.m65749i(packageInfo, "{\n                applic…ageName, 0)\n            }");
            } catch (PackageManager.NameNotFoundException unused) {
                c15903d.f60138k.error("Cannot find package with application.packageName: " + application.getPackageName());
                packageInfo = new PackageInfo();
            }
            this.f19669x = packageInfo;
            C15903d c15903d2 = this.f19670y;
            if (c15903d2 == null) {
                AbstractC22676k.m65757q("androidAmplitude");
                throw null;
            }
            C37199o c37199o = new C37199o(c15903d2);
            PackageInfo packageInfo2 = this.f19669x;
            if (packageInfo2 == null) {
                AbstractC22676k.m65757q("packageInfo");
                throw null;
            }
            String str = packageInfo2.versionName;
            String string = Long.valueOf(packageInfo2.getLongVersionCode()).toString();
            InterfaceC18598b interfaceC18598bM44885f = c15903d2.m44885f();
            String strMo33426c = interfaceC18598bM44885f.mo33426c(EnumC18597a.APP_VERSION);
            String strMo33426c2 = interfaceC18598bM44885f.mo33426c(EnumC18597a.APP_BUILD);
            if (strMo33426c2 == null) {
                C15903d.m44880j(c15903d2, "[Amplitude] Application Installed", AbstractC25247g0.m73990Y(new C23465k("[Amplitude] Version", str), new C23465k("[Amplitude] Build", string)), 4);
            } else if (!AbstractC22676k.m65745e(string, strMo33426c2)) {
                C15903d.m44880j(c15903d2, "[Amplitude] Application Updated", AbstractC25247g0.m73990Y(new C23465k("[Amplitude] Previous Version", strMo33426c), new C23465k("[Amplitude] Previous Build", strMo33426c2), new C23465k("[Amplitude] Version", str), new C23465k("[Amplitude] Build", string)), 4);
            }
            AbstractC3006f0.m8732z(c15903d2.f60130c, c15903d2.f60133f, null, new C1578e1(c37199o, interfaceC18598bM44885f, str, string, (InterfaceC30057d) null, 8), 2);
            AbstractC3006f0.m8732z(c15903d.f60130c, AbstractC17182o.f65999a, null, new C0410c(this, interfaceC30057d, 11), 2);
        }
    }

    @Override // p282kk.InterfaceC22536e
    public final EnumC22535d getType() {
        return EnumC22535d.f88576z;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC22676k.m65750j(activity, "activity");
        this.f19665E.add(Integer.valueOf(activity.hashCode()));
        C15906g c15906g = this.f19671z;
        if (c15906g == null) {
            AbstractC22676k.m65757q("androidConfiguration");
            throw null;
        }
        if (c15906g.f60169r.contains(EnumC15904e.f60149z)) {
            C15903d c15903d = this.f19670y;
            if (c15903d == null) {
                AbstractC22676k.m65757q("androidAmplitude");
                throw null;
            }
            if (((Boolean) ((C23470p) new C37199o(c15903d).f159041x).getValue()).booleanValue()) {
                WeakHashMap weakHashMap = AbstractC39586b.f170326a;
                AbstractC39586b.m126469a(activity, new C13270d(c15903d, 0), c15903d.f60138k);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        this.f19665E.remove(Integer.valueOf(activity.hashCode()));
        C15906g c15906g = this.f19671z;
        if (c15906g == null) {
            AbstractC22676k.m65757q("androidConfiguration");
            throw null;
        }
        if (c15906g.f60169r.contains(EnumC15904e.f60149z)) {
            C15903d c15903d = this.f19670y;
            if (c15903d == null) {
                AbstractC22676k.m65757q("androidAmplitude");
                throw null;
            }
            if (((Boolean) ((C23470p) new C37199o(c15903d).f159041x).getValue()).booleanValue()) {
                WeakHashMap weakHashMap = AbstractC39586b.f170326a;
                AbstractC39586b.m126470b(activity, c15903d.f60138k);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        C15903d c15903d = this.f19670y;
        Object[] objArr = 0;
        if (c15903d == null) {
            AbstractC22676k.m65757q("androidAmplitude");
            throw null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C21743a c21743a = new C21743a();
        c21743a.f83624M = "dummy_exit_foreground";
        c21743a.f83631c = Long.valueOf(jCurrentTimeMillis);
        c15903d.f60134g.mo44890N(c21743a);
        if (c15903d.f60128a.f60161j) {
            AbstractC3006f0.m8732z(c15903d.f60130c, c15903d.f60131d, null, new C1849z1(c15903d, objArr == true ? 1 : 0, 6), 2);
        }
        C15906g c15906g = this.f19671z;
        if (c15906g == null) {
            AbstractC22676k.m65757q("androidConfiguration");
            throw null;
        }
        if (c15906g.f60169r.contains(EnumC15904e.f60144E)) {
            C15903d c15903d2 = this.f19670y;
            if (c15903d2 == null) {
                AbstractC22676k.m65757q("androidAmplitude");
                throw null;
            }
            new C37199o(c15903d2);
            Window window = activity.getWindow();
            if (window == null) {
                c15903d2.f60138k.error("Failed to stop user interaction event tracking: Activity window is null");
                return;
            }
            Window.Callback callback = window.getCallback();
            WindowCallbackC40704c windowCallbackC40704c = callback instanceof WindowCallbackC40704c ? (WindowCallbackC40704c) callback : null;
            if (windowCallbackC40704c != null) {
                Window.Callback callbackM132177a = windowCallbackC40704c.m132177a();
                window.setCallback(callbackM132177a instanceof WindowCallbackC40705d ? null : callbackM132177a);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        C15903d c15903d = this.f19670y;
        C23454a0 c23454a0 = null;
        if (c15903d == null) {
            AbstractC22676k.m65757q("androidAmplitude");
            throw null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C21743a c21743a = new C21743a();
        c21743a.f83624M = "dummy_enter_foreground";
        c21743a.f83631c = Long.valueOf(jCurrentTimeMillis);
        c15903d.f60134g.mo44890N(c21743a);
        C15906g c15906g = this.f19671z;
        if (c15906g == null) {
            AbstractC22676k.m65757q("androidConfiguration");
            throw null;
        }
        if (c15906g.f60169r.contains(EnumC15904e.f60144E)) {
            C15903d c15903d2 = this.f19670y;
            if (c15903d2 == null) {
                AbstractC22676k.m65757q("androidAmplitude");
                throw null;
            }
            InterfaceC14544a interfaceC14544a = c15903d2.f60138k;
            new C37199o(c15903d2);
            Window window = activity.getWindow();
            if (window != null) {
                Window.Callback callback = window.getCallback();
                if (callback == null) {
                    callback = new WindowCallbackC40705d();
                }
                window.setCallback(new WindowCallbackC40704c(callback, activity, new C13270d(c15903d2, 1), (List) AbstractC0938f.m2367a().invoke(interfaceC14544a), c15903d2.f60138k));
                c23454a0 = C23454a0.f92919a;
            }
            if (c23454a0 == null) {
                interfaceC14544a.error("Failed to track user interaction event: Activity window is null");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        AbstractC22676k.m65750j(activity, "activity");
        AbstractC22676k.m65750j(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        CharSequence charSequenceLoadLabel;
        String string;
        AbstractC22676k.m65750j(activity, "activity");
        if (!this.f19665E.contains(Integer.valueOf(activity.hashCode()))) {
            onActivityCreated(activity, activity.getIntent().getExtras());
        }
        Integer numValueOf = Integer.valueOf(activity.hashCode());
        LinkedHashSet linkedHashSet = this.f19666F;
        linkedHashSet.add(numValueOf);
        C15906g c15906g = this.f19671z;
        String str = null;
        if (c15906g == null) {
            AbstractC22676k.m65757q("androidConfiguration");
            throw null;
        }
        if (c15906g.f60169r.contains(EnumC15904e.f60147x) && linkedHashSet.size() == 1) {
            C15903d c15903d = this.f19670y;
            if (c15903d == null) {
                AbstractC22676k.m65757q("androidAmplitude");
                throw null;
            }
            new C37199o(c15903d);
            PackageInfo packageInfo = this.f19669x;
            if (packageInfo == null) {
                AbstractC22676k.m65757q("packageInfo");
                throw null;
            }
            C15903d.m44880j(c15903d, "[Amplitude] Application Opened", AbstractC25247g0.m73990Y(new C23465k("[Amplitude] From Background", Boolean.valueOf(this.f19667G)), new C23465k("[Amplitude] Version", packageInfo.versionName), new C23465k("[Amplitude] Build", Long.valueOf(packageInfo.getLongVersionCode()).toString())), 4);
            this.f19667G = false;
        }
        C15906g c15906g2 = this.f19671z;
        if (c15906g2 == null) {
            AbstractC22676k.m65757q("androidConfiguration");
            throw null;
        }
        if (c15906g2.f60169r.contains(EnumC15904e.f60148y)) {
            C15903d c15903d2 = this.f19670y;
            if (c15903d2 == null) {
                AbstractC22676k.m65757q("androidAmplitude");
                throw null;
            }
            new C37199o(c15903d2);
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri referrer = activity.getReferrer();
                String string2 = referrer != null ? referrer.toString() : null;
                Uri data = intent.getData();
                if (data != null) {
                    String string3 = data.toString();
                    AbstractC22676k.m65749i(string3, "uri.toString()");
                    C15903d.m44880j(c15903d2, "[Amplitude] Deep Link Opened", AbstractC25247g0.m73990Y(new C23465k("[Amplitude] Link URL", string3), new C23465k("[Amplitude] Link Referrer", string2)), 4);
                }
            }
        }
        C15906g c15906g3 = this.f19671z;
        if (c15906g3 == null) {
            AbstractC22676k.m65757q("androidConfiguration");
            throw null;
        }
        if (c15906g3.f60169r.contains(EnumC15904e.f60149z)) {
            C15903d c15903d3 = this.f19670y;
            if (c15903d3 == null) {
                AbstractC22676k.m65757q("androidAmplitude");
                throw null;
            }
            InterfaceC14544a interfaceC14544a = c15903d3.f60138k;
            new C37199o(c15903d3);
            try {
                PackageManager packageManager = activity.getPackageManager();
                ActivityInfo activityInfo = packageManager != null ? packageManager.getActivityInfo(activity.getComponentName(), 128) : null;
                if (activityInfo != null && (charSequenceLoadLabel = activityInfo.loadLabel(packageManager)) != null && (string = charSequenceLoadLabel.toString()) != null) {
                    str = string;
                } else if (activityInfo != null) {
                    str = activityInfo.name;
                }
                C15903d.m44880j(c15903d3, "[Amplitude] Screen Viewed", AbstractC25247g0.m73989X(new C23465k("[Amplitude] Screen Name", str)), 4);
            } catch (PackageManager.NameNotFoundException e5) {
                interfaceC14544a.error("Failed to get activity info: " + e5);
            } catch (Exception e13) {
                interfaceC14544a.error("Failed to track screen viewed event: " + e13);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        Integer numValueOf = Integer.valueOf(activity.hashCode());
        LinkedHashSet linkedHashSet = this.f19666F;
        linkedHashSet.remove(numValueOf);
        C15906g c15906g = this.f19671z;
        if (c15906g == null) {
            AbstractC22676k.m65757q("androidConfiguration");
            throw null;
        }
        if (c15906g.f60169r.contains(EnumC15904e.f60147x) && linkedHashSet.isEmpty()) {
            C15903d c15903d = this.f19670y;
            if (c15903d == null) {
                AbstractC22676k.m65757q("androidAmplitude");
                throw null;
            }
            new C37199o(c15903d);
            C15903d.m44880j(c15903d, "[Amplitude] Application Backgrounded", null, 6);
            this.f19667G = true;
        }
    }
}
