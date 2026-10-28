package ml;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.fragment.app.C1271a;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.bumptech.glide.ComponentCallbacks2C4966h;
import g73.C15553a;
import g73.C15556d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import la.C23548b;
import p002a0.C0022g;
import p029b5.C2725d;
import p249jc.C21567b;
import pf.AbstractC29125c;
import tl.AbstractC33913l;

/* JADX INFO: renamed from: ml.g */
/* JADX INFO: loaded from: classes.dex */
public final class C25665g implements Handler.Callback {

    /* JADX INFO: renamed from: H */
    public static final C21567b f100923H = new C21567b(9);

    /* JADX INFO: renamed from: E */
    public final C21567b f100924E;

    /* JADX INFO: renamed from: w */
    public volatile ComponentCallbacks2C4966h f100927w;

    /* JADX INFO: renamed from: z */
    public final Handler f100930z;

    /* JADX INFO: renamed from: x */
    public final HashMap f100928x = new HashMap();

    /* JADX INFO: renamed from: y */
    public final HashMap f100929y = new HashMap();

    /* JADX INFO: renamed from: F */
    public final C0022g f100925F = new C0022g(0);

    /* JADX INFO: renamed from: G */
    public final C0022g f100926G = new C0022g(0);

    public C25665g() {
        new Bundle();
        this.f100924E = f100923H;
        this.f100930z = new Handler(Looper.getMainLooper(), this);
    }

    /* JADX INFO: renamed from: a */
    public static Activity m75561a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m75561a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m75562b(FragmentManager fragmentManager, C0022g c0022g) {
        for (Fragment fragment : fragmentManager.getFragments()) {
            if (fragment.getView() != null) {
                c0022g.put(fragment.getView(), fragment);
                m75562b(fragment.getChildFragmentManager(), c0022g);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m75563c(List list, Map map) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = (AbstractComponentCallbacksC1320m0) it.next();
            if (abstractComponentCallbacksC1320m0 != null && abstractComponentCallbacksC1320m0.getView() != null) {
                map.put(abstractComponentCallbacksC1320m0.getView(), abstractComponentCallbacksC1320m0);
                m75563c(abstractComponentCallbacksC1320m0.getChildFragmentManager().f5717c.m4059f(), map);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m75564k(Context context) {
        Activity activityM75561a = m75561a(context);
        return activityM75561a == null || !activityM75561a.isFinishing();
    }

    /* JADX INFO: renamed from: d */
    public final ComponentCallbacks2C4966h m75565d(Activity activity, FragmentManager fragmentManager, Fragment fragment, boolean z4) {
        FragmentC25664f fragmentC25664fM75570i = m75570i(fragmentManager, fragment, z4);
        ComponentCallbacks2C4966h componentCallbacks2C4966hM75556b = fragmentC25664fM75570i.m75556b();
        if (componentCallbacks2C4966hM75556b != null) {
            return componentCallbacks2C4966hM75556b;
        }
        ComponentCallbacks2C4960b componentCallbacks2C4960bM15527c = ComponentCallbacks2C4960b.m15527c(activity);
        C2725d c2725dM75555a = fragmentC25664fM75570i.m75555a();
        C23548b c23548bM75557c = fragmentC25664fM75570i.m75557c();
        this.f100924E.getClass();
        ComponentCallbacks2C4966h componentCallbacks2C4966h = new ComponentCallbacks2C4966h(componentCallbacks2C4960bM15527c, c2725dM75555a, c23548bM75557c, activity);
        fragmentC25664fM75570i.m75560f(componentCallbacks2C4966h);
        return componentCallbacks2C4966h;
    }

    /* JADX INFO: renamed from: e */
    public final ComponentCallbacks2C4966h m75566e(Activity activity) {
        if (AbstractC33913l.m107272g()) {
            return m75567f(activity.getApplicationContext());
        }
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        return m75565d(activity, activity.getFragmentManager(), null, m75564k(activity));
    }

    /* JADX INFO: renamed from: f */
    public final ComponentCallbacks2C4966h m75567f(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = AbstractC33913l.f142093a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof AbstractActivityC1340r0) {
                return m75569h((AbstractActivityC1340r0) context);
            }
            if (context instanceof Activity) {
                return m75566e((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return m75567f(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f100927w == null) {
            synchronized (this) {
                try {
                    if (this.f100927w == null) {
                        ComponentCallbacks2C4960b componentCallbacks2C4960bM15527c = ComponentCallbacks2C4960b.m15527c(context.getApplicationContext());
                        C21567b c21567b = this.f100924E;
                        C15553a c15553a = new C15553a(26);
                        C15556d c15556d = new C15556d(26);
                        Context applicationContext = context.getApplicationContext();
                        c21567b.getClass();
                        this.f100927w = new ComponentCallbacks2C4966h(componentCallbacks2C4960bM15527c, c15553a, c15556d, applicationContext);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return this.f100927w;
    }

    /* JADX INFO: renamed from: g */
    public final ComponentCallbacks2C4966h m75568g(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        AbstractC29125c.m88539p(abstractComponentCallbacksC1320m0.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (AbstractC33913l.m107272g()) {
            return m75567f(abstractComponentCallbacksC1320m0.getContext().getApplicationContext());
        }
        return m75572l(abstractComponentCallbacksC1320m0.getContext(), abstractComponentCallbacksC1320m0.getChildFragmentManager(), abstractComponentCallbacksC1320m0, abstractComponentCallbacksC1320m0.isVisible());
    }

    /* JADX INFO: renamed from: h */
    public final ComponentCallbacks2C4966h m75569h(AbstractActivityC1340r0 abstractActivityC1340r0) {
        if (AbstractC33913l.m107272g()) {
            return m75567f(abstractActivityC1340r0.getApplicationContext());
        }
        if (abstractActivityC1340r0.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        return m75572l(abstractActivityC1340r0, abstractActivityC1340r0.getSupportFragmentManager(), null, m75564k(abstractActivityC1340r0));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object obj;
        Object objRemove;
        Object obj2;
        Object obj3;
        int i13 = message.what;
        boolean z4 = true;
        if (i13 != 1) {
            if (i13 != 2) {
                obj3 = null;
                z4 = false;
                obj2 = null;
            } else {
                obj = (AbstractC1329o1) message.obj;
                objRemove = this.f100929y.remove(obj);
            }
            if (z4 && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
            }
            return z4;
        }
        obj = (FragmentManager) message.obj;
        objRemove = this.f100928x.remove(obj);
        Object obj4 = objRemove;
        obj2 = obj;
        obj3 = obj4;
        if (z4) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z4;
    }

    /* JADX INFO: renamed from: i */
    public final FragmentC25664f m75570i(FragmentManager fragmentManager, Fragment fragment, boolean z4) {
        FragmentC25664f fragmentC25664f = (FragmentC25664f) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (fragmentC25664f != null) {
            return fragmentC25664f;
        }
        HashMap map = this.f100928x;
        FragmentC25664f fragmentC25664f2 = (FragmentC25664f) map.get(fragmentManager);
        if (fragmentC25664f2 == null) {
            fragmentC25664f2 = new FragmentC25664f();
            fragmentC25664f2.m75559e(fragment);
            if (z4) {
                fragmentC25664f2.m75555a().m7695b();
            }
            map.put(fragmentManager, fragmentC25664f2);
            fragmentManager.beginTransaction().add(fragmentC25664f2, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f100930z.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return fragmentC25664f2;
    }

    /* JADX INFO: renamed from: j */
    public final C25667i m75571j(AbstractC1329o1 abstractC1329o1, AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, boolean z4) {
        C25667i c25667i = (C25667i) abstractC1329o1.m4140E("com.bumptech.glide.manager");
        if (c25667i != null) {
            return c25667i;
        }
        HashMap map = this.f100929y;
        C25667i c25667i2 = (C25667i) map.get(abstractC1329o1);
        if (c25667i2 == null) {
            c25667i2 = new C25667i();
            c25667i2.m75575C(abstractComponentCallbacksC1320m0);
            if (z4) {
                c25667i2.m75577y().m7695b();
            }
            map.put(abstractC1329o1, c25667i2);
            C1271a c1271a = new C1271a(abstractC1329o1);
            c1271a.mo4042d(0, c25667i2, "com.bumptech.glide.manager", 1);
            c1271a.m4047k(true, true);
            this.f100930z.obtainMessage(2, abstractC1329o1).sendToTarget();
        }
        return c25667i2;
    }

    /* JADX INFO: renamed from: l */
    public final ComponentCallbacks2C4966h m75572l(Context context, AbstractC1329o1 abstractC1329o1, AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, boolean z4) {
        C25667i c25667iM75571j = m75571j(abstractC1329o1, abstractComponentCallbacksC1320m0, z4);
        ComponentCallbacks2C4966h componentCallbacks2C4966hM75578z = c25667iM75571j.m75578z();
        if (componentCallbacks2C4966hM75578z != null) {
            return componentCallbacks2C4966hM75578z;
        }
        ComponentCallbacks2C4960b componentCallbacks2C4960bM15527c = ComponentCallbacks2C4960b.m15527c(context);
        C2725d c2725dM75577y = c25667iM75571j.m75577y();
        C23548b c23548bM75573A = c25667iM75571j.m75573A();
        this.f100924E.getClass();
        ComponentCallbacks2C4966h componentCallbacks2C4966h = new ComponentCallbacks2C4966h(componentCallbacks2C4960bM15527c, c2725dM75577y, c23548bM75573A, context);
        c25667iM75571j.m75576D(componentCallbacks2C4966h);
        return componentCallbacks2C4966h;
    }
}
