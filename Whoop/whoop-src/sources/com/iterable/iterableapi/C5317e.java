package com.iterable.iterableapi;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.whoop.service.network.model.UserSessionDto;
import dc3.C11923h;
import e93.AbstractC12889b;
import et.InterfaceC13595a;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p000.AbstractC30802r;
import p098dt.C12355g;
import p120ek.C13267a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import va3.AbstractC35854l;

/* JADX INFO: renamed from: com.iterable.iterableapi.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5317e implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f21675w;

    /* JADX INFO: renamed from: x */
    public final Object f21676x;

    public C5317e(int i13) {
        this.f21675w = i13;
        switch (i13) {
            case 2:
                this.f21676x = Collections.newSetFromMap(new WeakHashMap());
                break;
            default:
                this.f21676x = AbstractC30060g.m92111d(Integer.MAX_VALUE, 6, null);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m16428a(Activity activity, Bundle bundle) {
    }

    /* JADX INFO: renamed from: b */
    private final void m16429b(Activity activity) {
    }

    /* JADX INFO: renamed from: c */
    private final void m16430c(Activity activity) {
    }

    /* JADX INFO: renamed from: d */
    private final void m16431d(Activity activity) {
    }

    /* JADX INFO: renamed from: e */
    private final void m16432e(Activity activity, Bundle bundle) {
    }

    /* JADX INFO: renamed from: f */
    private final void m16433f(Activity activity, Bundle bundle) {
    }

    /* JADX INFO: renamed from: g */
    private final void m16434g(Activity activity) {
    }

    /* JADX INFO: renamed from: h */
    private final void m16435h(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f21675w) {
            case 0:
                break;
            case 1:
                AbstractC22676k.m65750j(activity, "activity");
                ((C11923h) this.f21676x).mo32218s(new C13267a(new WeakReference(activity), 1));
                break;
            default:
                Intent intent = activity.getIntent();
                if (intent != null && ((Set) this.f21676x).add(intent)) {
                    Bundle bundle2 = null;
                    try {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            bundle2 = extras.getBundle("gcm.n.analytics_data");
                        }
                    } catch (RuntimeException e5) {
                        Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e5);
                    }
                    if (bundle2 == null ? false : UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE.equals(bundle2.getString("google.c.a.e"))) {
                        if (bundle2 != null) {
                            if (UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE.equals(bundle2.getString("google.c.a.tc"))) {
                                C12355g c12355gM34608b = C12355g.m34608b();
                                c12355gM34608b.m34610a();
                                AbstractC30802r.m94771t(c12355gM34608b.f41522d.mo1617a(InterfaceC13595a.class));
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                                }
                                Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                            }
                        }
                        AbstractC35854l.m113836p(bundle2, "_no");
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f21675w) {
            case 1:
                AbstractC22676k.m65750j(activity, "activity");
                ((C11923h) this.f21676x).mo32218s(new C13267a(new WeakReference(activity), 6));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f21675w) {
            case 0:
                C5325g c5325g = (C5325g) this.f21676x;
                WeakReference weakReference = c5325g.f21688b;
                if ((weakReference != null ? (Activity) weakReference.get() : null) == activity) {
                    c5325g.f21688b = null;
                }
                break;
            case 1:
                AbstractC22676k.m65750j(activity, "activity");
                ((C11923h) this.f21676x).mo32218s(new C13267a(new WeakReference(activity), 4));
                break;
            default:
                if (activity.isFinishing()) {
                    ((Set) this.f21676x).remove(activity.getIntent());
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f21675w) {
            case 0:
                C5325g c5325g = (C5325g) this.f21676x;
                c5325g.f21688b = new WeakReference(activity);
                if (!c5325g.f21690d || AbstractC12889b.m36247M(activity.getPackageManager())) {
                    c5325g.f21690d = true;
                    for (WeakReference weakReference : c5325g.f21691e) {
                        if (weakReference.get() != null) {
                            ((InterfaceC5321f) weakReference.get()).mo16419b();
                        }
                    }
                }
                break;
            case 1:
                AbstractC22676k.m65750j(activity, "activity");
                ((C11923h) this.f21676x).mo32218s(new C13267a(new WeakReference(activity), 3));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        switch (this.f21675w) {
            case 1:
                AbstractC22676k.m65750j(activity, "activity");
                AbstractC22676k.m65750j(outState, "outState");
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f21675w) {
            case 0:
                C5325g c5325g = (C5325g) this.f21676x;
                c5325g.f21687a.removeCallbacks(c5325g.f21692f);
                c5325g.f21689c++;
                break;
            case 1:
                AbstractC22676k.m65750j(activity, "activity");
                ((C11923h) this.f21676x).mo32218s(new C13267a(new WeakReference(activity), 2));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.f21675w) {
            case 0:
                C5325g c5325g = (C5325g) this.f21676x;
                int i13 = c5325g.f21689c;
                if (i13 > 0) {
                    c5325g.f21689c = i13 - 1;
                }
                if (c5325g.f21689c == 0 && c5325g.f21690d) {
                    c5325g.f21687a.postDelayed(c5325g.f21692f, 1000L);
                    break;
                }
                break;
            case 1:
                AbstractC22676k.m65750j(activity, "activity");
                ((C11923h) this.f21676x).mo32218s(new C13267a(new WeakReference(activity), 5));
                break;
        }
    }

    public C5317e(C5325g c5325g) {
        this.f21675w = 0;
        this.f21676x = c5325g;
    }
}
