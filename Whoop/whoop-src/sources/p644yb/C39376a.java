package p644yb;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.startup.StartupException;
import com.whoop.android.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: yb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C39376a {

    /* JADX INFO: renamed from: d */
    public static volatile C39376a f169429d;

    /* JADX INFO: renamed from: e */
    public static final Object f169430e = new Object();

    /* JADX INFO: renamed from: c */
    public final Context f169433c;

    /* JADX INFO: renamed from: b */
    public final HashSet f169432b = new HashSet();

    /* JADX INFO: renamed from: a */
    public final HashMap f169431a = new HashMap();

    public C39376a(Context context) {
        this.f169433c = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: c */
    public static C39376a m125585c(Context context) {
        if (f169429d == null) {
            synchronized (f169430e) {
                try {
                    if (f169429d == null) {
                        f169429d = new C39376a(context);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return f169429d;
    }

    /* JADX INFO: renamed from: a */
    public final void m125586a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f169433c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f169432b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC39377b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    m125587b((Class) it3.next(), hashSet2);
                }
            } catch (ClassNotFoundException e5) {
                throw new StartupException(e5);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m125587b(Class cls, HashSet hashSet) {
        Object objCreate;
        HashMap map = this.f169431a;
        if (AbstractC29125c.m88496E()) {
            try {
                Trace.beginSection(AbstractC29125c.m88517Z(cls.getSimpleName()));
            } catch (Throwable th3) {
                Trace.endSection();
                throw th3;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC39377b interfaceC39377b = (InterfaceC39377b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listDependencies = interfaceC39377b.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            m125587b(cls2, hashSet);
                        }
                    }
                }
                objCreate = interfaceC39377b.create(this.f169433c);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th4) {
                throw new StartupException(th4);
            }
        }
        Trace.endSection();
        return objCreate;
    }

    /* JADX INFO: renamed from: d */
    public final Object m125588d(Class cls) {
        Object objM125587b;
        synchronized (f169430e) {
            try {
                objM125587b = this.f169431a.get(cls);
                if (objM125587b == null) {
                    objM125587b = m125587b(cls, new HashSet());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return objM125587b;
    }
}
