package io.sentry.android.fragment;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractC1329o1;
import io.sentry.C20371i4;
import io.sentry.C20412l5;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20545t1;
import java.io.Closeable;
import java.util.Set;
import m83.C25235a0;
import p249jc.AbstractC21598x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\rB!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lio/sentry/android/fragment/FragmentLifecycleIntegration;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Lio/sentry/t1;", "Ljava/io/Closeable;", "Landroid/app/Application;", "application", "", "Lio/sentry/android/fragment/b;", "filterFragmentLifecycleBreadcrumbs", "", "enableAutoFragmentLifecycleTracing", "<init>", "(Landroid/app/Application;Ljava/util/Set;Z)V", "(Landroid/app/Application;)V", "enableFragmentLifecycleBreadcrumbs", "(Landroid/app/Application;ZZ)V", "sentry-android-fragment_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class FragmentLifecycleIntegration implements Application.ActivityLifecycleCallbacks, InterfaceC20545t1, Closeable {

    /* JADX INFO: renamed from: E */
    public C20513q6 f75775E;

    /* JADX INFO: renamed from: w */
    public final Application f75776w;

    /* JADX INFO: renamed from: x */
    public final Set f75777x;

    /* JADX INFO: renamed from: y */
    public final boolean f75778y;

    /* JADX INFO: renamed from: z */
    public C20371i4 f75779z;

    static {
        C20412l5.m56626d().m56628b("maven:io.sentry:sentry-android-fragment", "8.41.0");
    }

    public FragmentLifecycleIntegration(Application application, Set<? extends EnumC20174b> filterFragmentLifecycleBreadcrumbs, boolean z4) {
        AbstractC22676k.m65750j(application, "application");
        AbstractC22676k.m65750j(filterFragmentLifecycleBreadcrumbs, "filterFragmentLifecycleBreadcrumbs");
        this.f75776w = application;
        this.f75777x = filterFragmentLifecycleBreadcrumbs;
        this.f75778y = z4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f75776w.unregisterActivityLifecycleCallbacks(this);
        C20513q6 c20513q6 = this.f75775E;
        if (c20513q6 != null) {
            if (c20513q6 != null) {
                c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "FragmentLifecycleIntegration removed.", new Object[0]);
            } else {
                AbstractC22676k.m65757q("options");
                throw null;
            }
        }
    }

    @Override // io.sentry.InterfaceC20545t1
    /* JADX INFO: renamed from: m */
    public final void mo55878m(C20513q6 c20513q6) {
        this.f75779z = C20371i4.f76402a;
        this.f75775E = c20513q6;
        this.f75776w.registerActivityLifecycleCallbacks(this);
        c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "FragmentLifecycleIntegration installed.", new Object[0]);
        AbstractC21598x.m60683i("FragmentLifecycle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC1329o1 supportFragmentManager;
        AbstractC22676k.m65750j(activity, "activity");
        AbstractActivityC1340r0 abstractActivityC1340r0 = activity instanceof AbstractActivityC1340r0 ? (AbstractActivityC1340r0) activity : null;
        if (abstractActivityC1340r0 == null || (supportFragmentManager = abstractActivityC1340r0.getSupportFragmentManager()) == null) {
            return;
        }
        C20371i4 c20371i4 = this.f75779z;
        if (c20371i4 != null) {
            supportFragmentManager.m4154X(new C20175c(c20371i4, this.f75777x, this.f75778y), true);
        } else {
            AbstractC22676k.m65757q("scopes");
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        AbstractC22676k.m65750j(activity, "activity");
        AbstractC22676k.m65750j(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentLifecycleIntegration(Application application) {
        this(application, (Set<? extends EnumC20174b>) EnumC20174b.states, false);
        AbstractC22676k.m65750j(application, "application");
        EnumC20174b.Companion.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentLifecycleIntegration(Application application, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(application, "application");
        EnumC20174b.Companion.getClass();
        Set set = z4 ? EnumC20174b.states : null;
        this(application, (Set<? extends EnumC20174b>) (set == null ? C25235a0.f99113w : set), z13);
    }
}
