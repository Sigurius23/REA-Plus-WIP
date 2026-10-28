package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.lifecycle.h1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1590h1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m4980a(Activity activity, EnumC1632v event) {
        AbstractC22676k.m65750j(event, "event");
        if (activity instanceof InterfaceC1585g0) {
            AbstractC1638x lifecycle = ((InterfaceC1585g0) activity).getLifecycle();
            if (lifecycle instanceof C1593i0) {
                ((C1593i0) lifecycle).m4991g(event);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m4981b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            FragmentC1598j1.a.Companion.getClass();
            C1594i1.m4995a(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC1598j1(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
