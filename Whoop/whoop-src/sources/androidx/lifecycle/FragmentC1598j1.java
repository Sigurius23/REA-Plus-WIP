package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.lifecycle.j1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m65681d2 = {"Landroidx/lifecycle/j1;", "Landroid/app/Fragment;", "<init>", "()V", "androidx/lifecycle/d2", "a", "androidx/lifecycle/h1", "lifecycle-runtime_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public class FragmentC1598j1 extends Fragment {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ int f6263x = 0;

    /* JADX INFO: renamed from: w */
    public C1575d2 f6264w;

    /* JADX INFO: renamed from: androidx.lifecycle.j1$a */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final C1594i1 Companion = new C1594i1();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            C1594i1.m4995a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC22676k.m65750j(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            AbstractC22676k.m65750j(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC22676k.m65750j(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            AbstractC22676k.m65750j(activity, "activity");
            int i13 = FragmentC1598j1.f6263x;
            AbstractC1590h1.m4980a(activity, EnumC1632v.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC22676k.m65750j(activity, "activity");
            int i13 = FragmentC1598j1.f6263x;
            AbstractC1590h1.m4980a(activity, EnumC1632v.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC22676k.m65750j(activity, "activity");
            int i13 = FragmentC1598j1.f6263x;
            AbstractC1590h1.m4980a(activity, EnumC1632v.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            AbstractC22676k.m65750j(activity, "activity");
            int i13 = FragmentC1598j1.f6263x;
            AbstractC1590h1.m4980a(activity, EnumC1632v.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            AbstractC22676k.m65750j(activity, "activity");
            int i13 = FragmentC1598j1.f6263x;
            AbstractC1590h1.m4980a(activity, EnumC1632v.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            AbstractC22676k.m65750j(activity, "activity");
            int i13 = FragmentC1598j1.f6263x;
            AbstractC1590h1.m4980a(activity, EnumC1632v.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC22676k.m65750j(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            AbstractC22676k.m65750j(activity, "activity");
            AbstractC22676k.m65750j(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC22676k.m65750j(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC22676k.m65750j(activity, "activity");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4997a(EnumC1632v enumC1632v) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            AbstractC22676k.m65749i(activity, "getActivity(...)");
            AbstractC1590h1.m4980a(activity, enumC1632v);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m4997a(EnumC1632v.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m4997a(EnumC1632v.ON_DESTROY);
        this.f6264w = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m4997a(EnumC1632v.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C1575d2 c1575d2 = this.f6264w;
        if (c1575d2 != null) {
            ((ProcessLifecycleOwner) c1575d2.f6205a).m4968a();
        }
        m4997a(EnumC1632v.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C1575d2 c1575d2 = this.f6264w;
        if (c1575d2 != null) {
            ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) c1575d2.f6205a;
            int i13 = processLifecycleOwner.f6178w + 1;
            processLifecycleOwner.f6178w = i13;
            if (i13 == 1 && processLifecycleOwner.f6181z) {
                processLifecycleOwner.f6175F.m4991g(EnumC1632v.ON_START);
                processLifecycleOwner.f6181z = false;
            }
        }
        m4997a(EnumC1632v.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m4997a(EnumC1632v.ON_STOP);
    }
}
