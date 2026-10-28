package p098dt;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import cu.AbstractC11112a;
import ge3.AbstractC15751g;
import gt.C16163b;
import gt.C16165d;
import gt.C16168g;
import gt.C16173l;
import ht.EnumC17622k;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p002a0.C0022g;
import p437qt.C30581d;
import p437qt.C30582e;
import p529uo.AbstractC35135w;
import p687zo.AbstractC40909b;
import pg3.C29205p;
import st.InterfaceC32956a;
import to.ComponentCallbacks2C33965c;

/* JADX INFO: renamed from: dt.g */
/* JADX INFO: loaded from: classes.dex */
public final class C12355g {

    /* JADX INFO: renamed from: j */
    public static final Object f41517j = new Object();

    /* JADX INFO: renamed from: k */
    public static final C0022g f41518k = new C0022g(0);

    /* JADX INFO: renamed from: a */
    public final Context f41519a;

    /* JADX INFO: renamed from: b */
    public final String f41520b;

    /* JADX INFO: renamed from: c */
    public final C12357i f41521c;

    /* JADX INFO: renamed from: d */
    public final C16168g f41522d;

    /* JADX INFO: renamed from: g */
    public final C16173l f41525g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC32956a f41526h;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f41523e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f41524f = new AtomicBoolean();

    /* JADX INFO: renamed from: i */
    public final CopyOnWriteArrayList f41527i = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public C12355g(Context context, String str, C12357i c12357i) {
        ?? arrayList;
        int i13 = 0;
        new CopyOnWriteArrayList();
        this.f41519a = context;
        AbstractC35135w.m111092d(str);
        this.f41520b = str;
        this.f41521c = c12357i;
        C12349a c12349a = AbstractC11112a.f35318w;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C16165d((String) it.next(), i13));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        EnumC17622k enumC17622k = EnumC17622k.f68344w;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i14 = 1;
        arrayList3.add(new C16165d(new FirebaseCommonRegistrar(), i14));
        arrayList3.add(new C16165d(new ExecutorsRegistrar(), i14));
        arrayList4.add(C16163b.m45708b(context, Context.class, new Class[0]));
        arrayList4.add(C16163b.m45708b(this, C12355g.class, new Class[0]));
        arrayList4.add(C16163b.m45708b(c12357i, C12357i.class, new Class[0]));
        C30582e c30582e = new C30582e(15);
        if (AbstractC15751g.m44427G(context) && AbstractC11112a.f35319x.get()) {
            arrayList4.add(C16163b.m45708b(c12349a, C12349a.class, new Class[0]));
        }
        C16168g c16168g = new C16168g(arrayList3, arrayList4, c30582e);
        this.f41522d = c16168g;
        Trace.endSection();
        this.f41525g = new C16173l(new C12351c(i13, this, context));
        this.f41526h = c16168g.mo1621e(C30581d.class);
        C12352d c12352d = new C12352d(this);
        m34610a();
        if (this.f41523e.get()) {
            ComponentCallbacks2C33965c.f142402E.f142403w.get();
        }
        this.f41527i.add(c12352d);
        Trace.endSection();
    }

    /* JADX INFO: renamed from: b */
    public static C12355g m34608b() {
        C12355g c12355g;
        synchronized (f41517j) {
            try {
                c12355g = (C12355g) f41518k.get("[DEFAULT]");
                if (c12355g == null) {
                    StringBuilder sb4 = new StringBuilder("Default FirebaseApp is not initialized in this process ");
                    if (AbstractC40909b.f176323f == null) {
                        AbstractC40909b.f176323f = Application.getProcessName();
                    }
                    sb4.append(AbstractC40909b.f176323f);
                    sb4.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                    throw new IllegalStateException(sb4.toString());
                }
                ((C30581d) c12355g.f41526h.get()).m93814b();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return c12355g;
    }

    /* JADX INFO: renamed from: e */
    public static C12355g m34609e(Context context, C12357i c12357i) {
        C12355g c12355g;
        AtomicReference atomicReference = C12353e.f41514a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = C12353e.f41514a;
            if (atomicReference2.get() == null) {
                C12353e c12353e = new C12353e();
                do {
                    if (atomicReference2.compareAndSet(null, c12353e)) {
                        ComponentCallbacks2C33965c.m107422a(application);
                        ComponentCallbacks2C33965c componentCallbacks2C33965c = ComponentCallbacks2C33965c.f142402E;
                        componentCallbacks2C33965c.getClass();
                        synchronized (componentCallbacks2C33965c) {
                            componentCallbacks2C33965c.f142405y.add(c12353e);
                        }
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f41517j) {
            C0022g c0022g = f41518k;
            AbstractC35135w.m111096h("FirebaseApp name [DEFAULT] already exists!", !c0022g.containsKey("[DEFAULT]"));
            AbstractC35135w.m111095g(context, "Application context cannot be null.");
            c12355g = new C12355g(context, "[DEFAULT]", c12357i);
            c0022g.put("[DEFAULT]", c12355g);
        }
        c12355g.m34612d();
        return c12355g;
    }

    /* JADX INFO: renamed from: a */
    public final void m34610a() {
        AbstractC35135w.m111096h("FirebaseApp was deleted", !this.f41524f.get());
    }

    /* JADX INFO: renamed from: c */
    public final String m34611c() {
        StringBuilder sb4 = new StringBuilder();
        m34610a();
        sb4.append(AbstractC40909b.m132600b(this.f41520b.getBytes(Charset.defaultCharset())));
        sb4.append("+");
        m34610a();
        sb4.append(AbstractC40909b.m132600b(this.f41521c.f41534b.getBytes(Charset.defaultCharset())));
        return sb4.toString();
    }

    /* JADX INFO: renamed from: d */
    public final void m34612d() {
        HashMap map;
        if (!AbstractC15751g.m44427G(this.f41519a)) {
            StringBuilder sb4 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            m34610a();
            sb4.append(this.f41520b);
            Log.i("FirebaseApp", sb4.toString());
            C12354f.m34607a(this.f41519a);
            return;
        }
        StringBuilder sb5 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        m34610a();
        sb5.append(this.f41520b);
        Log.i("FirebaseApp", sb5.toString());
        C16168g c16168g = this.f41522d;
        m34610a();
        boolean zEquals = "[DEFAULT]".equals(this.f41520b);
        AtomicReference atomicReference = c16168g.f61444f;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (!atomicReference.compareAndSet(null, boolValueOf)) {
            if (atomicReference.get() != null) {
                ((C30581d) this.f41526h.get()).m93814b();
            }
        }
        synchronized (c16168g) {
            map = new HashMap(c16168g.f61439a);
        }
        c16168g.m45709b(zEquals, map);
        ((C30581d) this.f41526h.get()).m93814b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12355g)) {
            return false;
        }
        C12355g c12355g = (C12355g) obj;
        c12355g.m34610a();
        return this.f41520b.equals(c12355g.f41520b);
    }

    public final int hashCode() {
        return this.f41520b.hashCode();
    }

    public final String toString() {
        C29205p c29205p = new C29205p(this);
        c29205p.m88707c(this.f41520b, "name");
        c29205p.m88707c(this.f41521c, "options");
        return c29205p.toString();
    }
}
