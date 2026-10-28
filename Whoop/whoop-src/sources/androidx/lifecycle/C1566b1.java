package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.lifecycle.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1566b1 extends AbstractC1611o {
    final /* synthetic */ ProcessLifecycleOwner this$0;

    /* JADX INFO: renamed from: androidx.lifecycle.b1$a */
    public static final class a extends AbstractC1611o {
        final /* synthetic */ ProcessLifecycleOwner this$0;

        public a(ProcessLifecycleOwner processLifecycleOwner) {
            this.this$0 = processLifecycleOwner;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC22676k.m65750j(activity, "activity");
            this.this$0.m4968a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC22676k.m65750j(activity, "activity");
            ProcessLifecycleOwner processLifecycleOwner = this.this$0;
            int i13 = processLifecycleOwner.f6178w + 1;
            processLifecycleOwner.f6178w = i13;
            if (i13 == 1 && processLifecycleOwner.f6181z) {
                processLifecycleOwner.f6175F.m4991g(EnumC1632v.ON_START);
                processLifecycleOwner.f6181z = false;
            }
        }
    }

    public C1566b1(ProcessLifecycleOwner processLifecycleOwner) {
        this.this$0 = processLifecycleOwner;
    }

    @Override // androidx.lifecycle.AbstractC1611o, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC22676k.m65750j(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i13 = FragmentC1598j1.f6263x;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            AbstractC22676k.m65748h(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((FragmentC1598j1) fragmentFindFragmentByTag).f6264w = this.this$0.f6177H;
        }
    }

    @Override // androidx.lifecycle.AbstractC1611o, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i13 = processLifecycleOwner.f6179x - 1;
        processLifecycleOwner.f6179x = i13;
        if (i13 == 0) {
            Handler handler = processLifecycleOwner.f6174E;
            AbstractC22676k.m65747g(handler);
            handler.postDelayed(processLifecycleOwner.f6176G, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC22676k.m65750j(activity, "activity");
        AbstractC1562a1.m4971a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC1611o, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i13 = processLifecycleOwner.f6178w - 1;
        processLifecycleOwner.f6178w = i13;
        if (i13 == 0 && processLifecycleOwner.f6180y) {
            processLifecycleOwner.f6175F.m4991g(EnumC1632v.ON_STOP);
            processLifecycleOwner.f6181z = true;
        }
    }
}
