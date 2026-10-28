package io.sentry.android.fragment;

import android.os.Bundle;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks;
import com.whoop.data.repositories.C6656c;
import io.sentry.C20315e;
import io.sentry.C20337g0;
import io.sentry.C20371i4;
import io.sentry.EnumC20374i7;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20308d1;
import io.sentry.InterfaceC20408l1;
import java.util.Set;
import java.util.WeakHashMap;
import live.hms.video.media.tracks.HMSTrackSource;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;

/* JADX INFO: renamed from: io.sentry.android.fragment.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C20175c extends FragmentManager$FragmentLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final InterfaceC20308d1 f75780a;

    /* JADX INFO: renamed from: b */
    public final Set f75781b;

    /* JADX INFO: renamed from: c */
    public final boolean f75782c;

    /* JADX INFO: renamed from: d */
    public final WeakHashMap f75783d;

    public C20175c(C20371i4 scopes, Set filterFragmentLifecycleBreadcrumbs, boolean z4) {
        AbstractC22676k.m65750j(scopes, "scopes");
        AbstractC22676k.m65750j(filterFragmentLifecycleBreadcrumbs, "filterFragmentLifecycleBreadcrumbs");
        this.f75780a = scopes;
        this.f75781b = filterFragmentLifecycleBreadcrumbs;
        this.f75782c = z4;
        this.f75783d = new WeakHashMap();
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    /* JADX INFO: renamed from: a */
    public final void mo4030a(AbstractC1329o1 abstractC1329o1, AbstractComponentCallbacksC1320m0 fragment, AbstractActivityC1340r0 context) {
        AbstractC22676k.m65750j(fragment, "fragment");
        AbstractC22676k.m65750j(context, "context");
        m56084l(fragment, EnumC20174b.ATTACHED);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    /* JADX INFO: renamed from: b */
    public final void mo4031b(AbstractC1329o1 abstractC1329o1, AbstractComponentCallbacksC1320m0 fragment) {
        AbstractC22676k.m65750j(fragment, "fragment");
        m56084l(fragment, EnumC20174b.CREATED);
        if (fragment.isAdded()) {
            InterfaceC20308d1 interfaceC20308d1 = this.f75780a;
            if (interfaceC20308d1.mo56432l().isEnableScreenTracking()) {
                interfaceC20308d1.mo56439s(new C6656c(9, this, fragment));
            }
            if (interfaceC20308d1.mo56432l().isTracingEnabled() && this.f75782c) {
                WeakHashMap weakHashMap = this.f75783d;
                if (weakHashMap.containsKey(fragment)) {
                    return;
                }
                C22669g0 c22669g0 = new C22669g0();
                interfaceC20308d1.mo56439s(new C6656c(c22669g0, 10));
                String canonicalName = fragment.getClass().getCanonicalName();
                if (canonicalName == null) {
                    canonicalName = fragment.getClass().getSimpleName();
                }
                InterfaceC20408l1 interfaceC20408l1 = (InterfaceC20408l1) c22669g0.f89336w;
                InterfaceC20408l1 interfaceC20408l1Mo56465w = interfaceC20408l1 != null ? interfaceC20408l1.mo56465w("ui.load", canonicalName) : null;
                if (interfaceC20408l1Mo56465w != null) {
                    weakHashMap.put(fragment, interfaceC20408l1Mo56465w);
                    interfaceC20408l1Mo56465w.mo56462t().f76314I = "auto.ui.fragment";
                }
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    /* JADX INFO: renamed from: c */
    public final void mo4032c(AbstractC1329o1 abstractC1329o1, AbstractComponentCallbacksC1320m0 fragment) {
        AbstractC22676k.m65750j(fragment, "fragment");
        m56084l(fragment, EnumC20174b.DESTROYED);
        m56085m(fragment);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    /* JADX INFO: renamed from: d */
    public final void mo4033d(AbstractC1329o1 abstractC1329o1, AbstractComponentCallbacksC1320m0 fragment) {
        AbstractC22676k.m65750j(fragment, "fragment");
        m56084l(fragment, EnumC20174b.DETACHED);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    /* JADX INFO: renamed from: e */
    public final void mo4034e(AbstractC1329o1 abstractC1329o1, AbstractComponentCallbacksC1320m0 fragment) {
        AbstractC22676k.m65750j(fragment, "fragment");
        m56084l(fragment, EnumC20174b.PAUSED);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    /* JADX INFO: renamed from: f */
    public final void mo4035f(AbstractC1329o1 abstractC1329o1, AbstractComponentCallbacksC1320m0 fragment) {
        AbstractC22676k.m65750j(fragment, "fragment");
        m56084l(fragment, EnumC20174b.RESUMED);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    /* JADX INFO: renamed from: g */
    public final void mo4036g(AbstractC1329o1 abstractC1329o1, AbstractComponentCallbacksC1320m0 fragment, Bundle bundle) {
        AbstractC22676k.m65750j(fragment, "fragment");
        m56084l(fragment, EnumC20174b.SAVE_INSTANCE_STATE);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    /* JADX INFO: renamed from: h */
    public final void mo4037h(AbstractC1329o1 abstractC1329o1, AbstractComponentCallbacksC1320m0 fragment) {
        AbstractC22676k.m65750j(fragment, "fragment");
        m56084l(fragment, EnumC20174b.STARTED);
        m56085m(fragment);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    /* JADX INFO: renamed from: i */
    public final void mo4038i(AbstractC1329o1 abstractC1329o1, AbstractComponentCallbacksC1320m0 fragment) {
        AbstractC22676k.m65750j(fragment, "fragment");
        m56084l(fragment, EnumC20174b.STOPPED);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    /* JADX INFO: renamed from: j */
    public final void mo4039j(AbstractC1329o1 abstractC1329o1, AbstractComponentCallbacksC1320m0 fragment, View view) {
        AbstractC22676k.m65750j(fragment, "fragment");
        AbstractC22676k.m65750j(view, "view");
        m56084l(fragment, EnumC20174b.VIEW_CREATED);
    }

    @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
    /* JADX INFO: renamed from: k */
    public final void mo4040k(AbstractC1329o1 abstractC1329o1, AbstractComponentCallbacksC1320m0 fragment) {
        AbstractC22676k.m65750j(fragment, "fragment");
        m56084l(fragment, EnumC20174b.VIEW_DESTROYED);
    }

    /* JADX INFO: renamed from: l */
    public final void m56084l(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, EnumC20174b enumC20174b) {
        if (this.f75781b.contains(enumC20174b)) {
            C20315e c20315e = new C20315e();
            c20315e.f76286E = NotificationCompat.CATEGORY_NAVIGATION;
            c20315e.m56470c(enumC20174b.getBreadcrumbName$sentry_android_fragment_release(), "state");
            String canonicalName = abstractComponentCallbacksC1320m0.getClass().getCanonicalName();
            if (canonicalName == null) {
                canonicalName = abstractComponentCallbacksC1320m0.getClass().getSimpleName();
            }
            c20315e.m56470c(canonicalName, HMSTrackSource.SCREEN);
            c20315e.f76288G = "ui.fragment.lifecycle";
            c20315e.f76290I = EnumC20436n5.INFO;
            C20337g0 c20337g0 = new C20337g0();
            c20337g0.m56493d(abstractComponentCallbacksC1320m0, "android:fragment");
            this.f75780a.mo56429i(c20315e, c20337g0);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m56085m(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        InterfaceC20408l1 interfaceC20408l1;
        if (this.f75780a.mo56432l().isTracingEnabled() && this.f75782c) {
            WeakHashMap weakHashMap = this.f75783d;
            if (weakHashMap.containsKey(abstractComponentCallbacksC1320m0) && (interfaceC20408l1 = (InterfaceC20408l1) weakHashMap.get(abstractComponentCallbacksC1320m0)) != null) {
                EnumC20374i7 enumC20374i7Mo56450c = interfaceC20408l1.mo56450c();
                if (enumC20374i7Mo56450c == null) {
                    enumC20374i7Mo56450c = EnumC20374i7.OK;
                }
                interfaceC20408l1.mo56456l(enumC20374i7Mo56450c);
            }
        }
    }
}
