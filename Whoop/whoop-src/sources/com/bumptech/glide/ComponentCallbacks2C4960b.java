package com.bumptech.glide;

import ad3.C0783z;
import al.C0960g;
import al.C0961h;
import al.InterfaceC0955b;
import android.R;
import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import cl.ExecutorServiceC4794b;
import cl.ThreadFactoryC4793a;
import com.bumptech.glide.integration.okhttp3.OkHttpGlideModule;
import io.sentry.hints.C20363j;
import j93.AbstractC21478l0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ml.C25665g;
import p002a0.C0022g;
import p005a3.C0223l1;
import p034bl.C3365e;
import p034bl.C3366f;
import p034bl.C3367g;
import p249jc.C21565a;
import p684zk.C40787l;
import pf.AbstractC29125c;
import tl.AbstractC33913l;
import u00.C34377e;

/* JADX INFO: renamed from: com.bumptech.glide.b */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C4960b implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: J */
    public static volatile ComponentCallbacks2C4960b f20290J;

    /* JADX INFO: renamed from: K */
    public static volatile boolean f20291K;

    /* JADX INFO: renamed from: E */
    public final C0223l1 f20292E;

    /* JADX INFO: renamed from: F */
    public final C0960g f20293F;

    /* JADX INFO: renamed from: G */
    public final C25665g f20294G;

    /* JADX INFO: renamed from: H */
    public final C21565a f20295H;

    /* JADX INFO: renamed from: I */
    public final ArrayList f20296I = new ArrayList();

    /* JADX INFO: renamed from: w */
    public final C40787l f20297w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC0955b f20298x;

    /* JADX INFO: renamed from: y */
    public final C3365e f20299y;

    /* JADX INFO: renamed from: z */
    public final C4961c f20300z;

    /* JADX WARN: Bottom block not found for handler: all -> 0x0371 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0378 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ComponentCallbacks2C4960b(android.content.Context r38, p684zk.C40787l r39, p034bl.C3365e r40, al.InterfaceC0955b r41, al.C0960g r42, ml.C25665g r43, p249jc.C21565a r44, io.sentry.hints.C20363j r45, p002a0.C0022g r46, java.util.List r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.ComponentCallbacks2C4960b.<init>(android.content.Context, zk.l, bl.e, al.b, al.g, ml.g, jc.a, io.sentry.hints.j, a0.g, java.util.List):void");
    }

    /* JADX INFO: renamed from: a */
    public static void m15526a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f20291K) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        f20291K = true;
        C0022g c0022g = new C0022g(0);
        C20363j c20363j = new C20363j(13);
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList<OkHttpGlideModule> arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(AbstractC21478l0.m60413S(str));
                        if (Log.isLoggable("ManifestParser", 3)) {
                            Log.d("ManifestParser", "Loaded Glide module: " + str);
                        }
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
            if (generatedAppGlideModule != null && !generatedAppGlideModule.m15525W().isEmpty()) {
                Set setM15525W = generatedAppGlideModule.m15525W();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    OkHttpGlideModule okHttpGlideModule = (OkHttpGlideModule) it.next();
                    if (setM15525W.contains(okHttpGlideModule.getClass())) {
                        if (Log.isLoggable("Glide", 3)) {
                            Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + okHttpGlideModule);
                        }
                        it.remove();
                    }
                }
            }
            if (Log.isLoggable("Glide", 3)) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Log.d("Glide", "Discovered GlideModule from manifest: " + ((OkHttpGlideModule) it3.next()).getClass());
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                ((OkHttpGlideModule) it4.next()).getClass();
            }
            if (ExecutorServiceC4794b.f19718y == 0) {
                ExecutorServiceC4794b.f19718y = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i13 = ExecutorServiceC4794b.f19718y;
            if (TextUtils.isEmpty("source")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            ExecutorServiceC4794b executorServiceC4794b = new ExecutorServiceC4794b(new ThreadPoolExecutor(i13, i13, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC4793a("source", false)));
            if (TextUtils.isEmpty("disk-cache")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
            }
            ExecutorServiceC4794b executorServiceC4794b2 = new ExecutorServiceC4794b(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC4793a("disk-cache", true)));
            if (ExecutorServiceC4794b.f19718y == 0) {
                ExecutorServiceC4794b.f19718y = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i14 = ExecutorServiceC4794b.f19718y >= 4 ? 2 : 1;
            if (TextUtils.isEmpty("animation")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
            }
            ExecutorServiceC4794b executorServiceC4794b3 = new ExecutorServiceC4794b(new ThreadPoolExecutor(i14, i14, 0L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC4793a("animation", true)));
            C3367g c3367g = new C3367g(new C3366f(applicationContext));
            C21565a c21565a = new C21565a(9);
            int i15 = c3367g.f13114a;
            InterfaceC0955b c0961h = i15 > 0 ? new C0961h(i15) : new C34377e(5);
            C0960g c0960g = new C0960g(c3367g.f13116c);
            C3365e c3365e = new C3365e(c3367g.f13115b);
            ComponentCallbacks2C4960b componentCallbacks2C4960b = new ComponentCallbacks2C4960b(applicationContext, new C40787l(c3365e, new C0783z(applicationContext), executorServiceC4794b2, executorServiceC4794b, new ExecutorServiceC4794b(new ThreadPoolExecutor(0, Integer.MAX_VALUE, ExecutorServiceC4794b.f19717x, timeUnit, new SynchronousQueue(), new ThreadFactoryC4793a("source-unlimited", false))), executorServiceC4794b3), c3365e, c0961h, c0960g, new C25665g(), c21565a, c20363j, c0022g, Collections.EMPTY_LIST);
            for (OkHttpGlideModule okHttpGlideModule2 : arrayList) {
                try {
                    okHttpGlideModule2.m15554a(componentCallbacks2C4960b.f20292E);
                } catch (AbstractMethodError e5) {
                    throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(okHttpGlideModule2.getClass().getName()), e5);
                }
            }
            applicationContext.registerComponentCallbacks(componentCallbacks2C4960b);
            f20290J = componentCallbacks2C4960b;
            f20291K = false;
        } catch (PackageManager.NameNotFoundException e13) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e13);
        }
    }

    /* JADX INFO: renamed from: c */
    public static ComponentCallbacks2C4960b m15527c(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f20290J == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e5);
            } catch (InstantiationException e13) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e13);
            } catch (NoSuchMethodException e14) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e14);
            } catch (InvocationTargetException e15) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e15);
            }
            synchronized (ComponentCallbacks2C4960b.class) {
                try {
                    if (f20290J == null) {
                        m15526a(context, generatedAppGlideModule);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return f20290J;
    }

    /* JADX INFO: renamed from: d */
    public static C25665g m15528d(Context context) {
        AbstractC29125c.m88539p(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m15527c(context).f20294G;
    }

    /* JADX INFO: renamed from: e */
    public static ComponentCallbacks2C4966h m15529e(Context context) {
        return m15528d(context).m75567f(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static ComponentCallbacks2C4966h m15530f(View view) {
        C25665g c25665gM15528d = m15528d(view.getContext());
        c25665gM15528d.getClass();
        if (AbstractC33913l.m107272g()) {
            return c25665gM15528d.m75567f(view.getContext().getApplicationContext());
        }
        AbstractC29125c.m88539p(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityM75561a = C25665g.m75561a(view.getContext());
        if (activityM75561a == null) {
            return c25665gM15528d.m75567f(view.getContext().getApplicationContext());
        }
        Fragment fragment = null;
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = null;
        if (activityM75561a instanceof AbstractActivityC1340r0) {
            AbstractActivityC1340r0 abstractActivityC1340r0 = (AbstractActivityC1340r0) activityM75561a;
            C0022g c0022g = c25665gM15528d.f100925F;
            c0022g.clear();
            C25665g.m75563c(abstractActivityC1340r0.getSupportFragmentManager().f5717c.m4059f(), c0022g);
            View viewFindViewById = abstractActivityC1340r0.findViewById(R.id.content);
            while (!view.equals(viewFindViewById) && (abstractComponentCallbacksC1320m0 = (AbstractComponentCallbacksC1320m0) c0022g.get(view)) == null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            c0022g.clear();
            return abstractComponentCallbacksC1320m0 != null ? c25665gM15528d.m75568g(abstractComponentCallbacksC1320m0) : c25665gM15528d.m75569h(abstractActivityC1340r0);
        }
        C0022g c0022g2 = c25665gM15528d.f100926G;
        c0022g2.clear();
        C25665g.m75562b(activityM75561a.getFragmentManager(), c0022g2);
        View viewFindViewById2 = activityM75561a.findViewById(R.id.content);
        while (!view.equals(viewFindViewById2) && (fragment = (Fragment) c0022g2.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        c0022g2.clear();
        if (fragment == null) {
            return c25665gM15528d.m75566e(activityM75561a);
        }
        if (fragment.getActivity() != null) {
            return !AbstractC33913l.m107272g() ? c25665gM15528d.m75565d(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible()) : c25665gM15528d.m75567f(fragment.getActivity().getApplicationContext());
        }
        throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
    }

    /* JADX INFO: renamed from: b */
    public final void m15531b() {
        char[] cArr = AbstractC33913l.f142093a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
        this.f20299y.m107262e(0L);
        this.f20298x.mo2431b();
        C0960g c0960g = this.f20293F;
        synchronized (c0960g) {
            c0960g.m2443b(0);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        m15531b();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i13) {
        long j7;
        char[] cArr = AbstractC33913l.f142093a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
        Iterator it = this.f20296I.iterator();
        while (it.hasNext()) {
            ((ComponentCallbacks2C4966h) it.next()).getClass();
        }
        C3365e c3365e = this.f20299y;
        c3365e.getClass();
        if (i13 >= 40) {
            c3365e.m107262e(0L);
        } else if (i13 >= 20 || i13 == 15) {
            synchronized (c3365e) {
                j7 = c3365e.f142086b;
            }
            c3365e.m107262e(j7 / 2);
        }
        this.f20298x.mo2430a(i13);
        C0960g c0960g = this.f20293F;
        synchronized (c0960g) {
            try {
                if (i13 >= 40) {
                    synchronized (c0960g) {
                        c0960g.m2443b(0);
                    }
                } else if (i13 >= 20 || i13 == 15) {
                    c0960g.m2443b(c0960g.f3550e / 2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
