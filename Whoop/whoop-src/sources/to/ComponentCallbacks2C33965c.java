package to;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: to.c */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C33965c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: E */
    public static final ComponentCallbacks2C33965c f142402E = new ComponentCallbacks2C33965c();

    /* JADX INFO: renamed from: w */
    public final AtomicBoolean f142403w = new AtomicBoolean();

    /* JADX INFO: renamed from: x */
    public final AtomicBoolean f142404x = new AtomicBoolean();

    /* JADX INFO: renamed from: y */
    public final ArrayList f142405y = new ArrayList();

    /* JADX INFO: renamed from: z */
    public boolean f142406z = false;

    /* JADX INFO: renamed from: a */
    public static void m107422a(Application application) {
        ComponentCallbacks2C33965c componentCallbacks2C33965c = f142402E;
        synchronized (componentCallbacks2C33965c) {
            try {
                if (!componentCallbacks2C33965c.f142406z) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C33965c);
                    application.registerComponentCallbacks(componentCallbacks2C33965c);
                    componentCallbacks2C33965c.f142406z = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m107423b(boolean z4) {
        synchronized (f142402E) {
            try {
                Iterator it = this.f142405y.iterator();
                while (it.hasNext()) {
                    ((InterfaceC33963b) it.next()).mo34606a(z4);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.f142403w.compareAndSet(true, false);
        this.f142404x.set(true);
        if (zCompareAndSet) {
            m107423b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.f142403w.compareAndSet(true, false);
        this.f142404x.set(true);
        if (zCompareAndSet) {
            m107423b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i13) {
        if (i13 == 20 && this.f142403w.compareAndSet(false, true)) {
            this.f142404x.set(true);
            m107423b(true);
        }
    }
}
