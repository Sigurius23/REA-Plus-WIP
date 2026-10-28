package to;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.C1271a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p529uo.AbstractC35135w;

/* JADX INFO: renamed from: to.h */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC33975h {

    /* JADX INFO: renamed from: w */
    public final Object f142437w;

    public AbstractC33975h(InterfaceC33977i interfaceC33977i) {
        this.f142437w = interfaceC33977i;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC33977i m107437b(Activity activity) {
        FragmentC34000t0 fragmentC34000t0;
        C34002u0 c34002u0;
        AbstractC35135w.m111095g(activity, "Activity must not be null");
        if (!(activity instanceof AbstractActivityC1340r0)) {
            WeakHashMap weakHashMap = FragmentC34000t0.f142489x;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference != null && (fragmentC34000t0 = (FragmentC34000t0) weakReference.get()) != null) {
                return fragmentC34000t0;
            }
            try {
                FragmentC34000t0 fragmentC34000t1 = (FragmentC34000t0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (fragmentC34000t1 == null || fragmentC34000t1.isRemoving()) {
                    fragmentC34000t1 = new FragmentC34000t0();
                    activity.getFragmentManager().beginTransaction().add(fragmentC34000t1, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(fragmentC34000t1));
                return fragmentC34000t1;
            } catch (ClassCastException e5) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e5);
            }
        }
        AbstractActivityC1340r0 abstractActivityC1340r0 = (AbstractActivityC1340r0) activity;
        WeakHashMap weakHashMap2 = C34002u0.f142492x;
        AbstractC1329o1 supportFragmentManager = abstractActivityC1340r0.getSupportFragmentManager();
        WeakHashMap weakHashMap3 = C34002u0.f142492x;
        WeakReference weakReference2 = (WeakReference) weakHashMap3.get(abstractActivityC1340r0);
        if (weakReference2 != null && (c34002u0 = (C34002u0) weakReference2.get()) != null) {
            return c34002u0;
        }
        try {
            C34002u0 c34002u1 = (C34002u0) supportFragmentManager.m4140E("SLifecycleFragmentImpl");
            if (c34002u1 == null || c34002u1.isRemoving()) {
                c34002u1 = new C34002u0();
                C1271a c1271a = new C1271a(supportFragmentManager);
                c1271a.mo4042d(0, c34002u1, "SLifecycleFragmentImpl", 1);
                c1271a.m4047k(true, true);
            }
            weakHashMap3.put(abstractActivityC1340r0, new WeakReference(c34002u1));
            return c34002u1;
        } catch (ClassCastException e13) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e13);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, to.i] */
    /* JADX INFO: renamed from: a */
    public final Activity m107438a() {
        Activity activityMo107445k = this.f142437w.mo107445k();
        AbstractC35135w.m111094f(activityMo107445k);
        return activityMo107445k;
    }

    /* JADX INFO: renamed from: c */
    public void mo107439c(int i13, int i14, Intent intent) {
    }

    /* JADX INFO: renamed from: d */
    public void mo107440d(Bundle bundle) {
    }

    /* JADX INFO: renamed from: e */
    public void mo107416e() {
    }

    /* JADX INFO: renamed from: f */
    public void mo107441f() {
    }

    /* JADX INFO: renamed from: g */
    public void mo107442g(Bundle bundle) {
    }

    /* JADX INFO: renamed from: h */
    public void mo107443h() {
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo29700i();
}
