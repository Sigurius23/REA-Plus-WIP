package al;

import android.util.Log;
import com.google.crypto.tink.internal.C5101l0;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: al.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0960g {

    /* JADX INFO: renamed from: a */
    public final C5101l0 f3546a = new C5101l0(3);

    /* JADX INFO: renamed from: b */
    public final C0959f f3547b = new C0959f(0);

    /* JADX INFO: renamed from: c */
    public final HashMap f3548c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f3549d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final int f3550e;

    /* JADX INFO: renamed from: f */
    public int f3551f;

    public C0960g(int i13) {
        this.f3550e = i13;
    }

    /* JADX INFO: renamed from: a */
    public final void m2442a(int i13, Class cls) {
        NavigableMap navigableMapM2447f = m2447f(cls);
        Integer num = (Integer) navigableMapM2447f.get(Integer.valueOf(i13));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM2447f.remove(Integer.valueOf(i13));
                return;
            } else {
                navigableMapM2447f.put(Integer.valueOf(i13), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i13 + ", this: " + this);
    }

    /* JADX INFO: renamed from: b */
    public final void m2443b(int i13) {
        while (this.f3551f > i13) {
            Object objM16052d0 = this.f3546a.m16052d0();
            AbstractC29125c.m88538o(objM16052d0);
            C0956c c0956cM2445d = m2445d(objM16052d0.getClass());
            this.f3551f -= c0956cM2445d.m2436b() * c0956cM2445d.m2435a(objM16052d0);
            m2442a(c0956cM2445d.m2435a(objM16052d0), objM16052d0.getClass());
            if (Log.isLoggable(c0956cM2445d.m2437c(), 2)) {
                Log.v(c0956cM2445d.m2437c(), "evicted: " + c0956cM2445d.m2435a(objM16052d0));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized Object m2444c(int i13, Class cls) {
        C0958e c0958e;
        int i14;
        try {
            Integer num = (Integer) m2447f(cls).ceilingKey(Integer.valueOf(i13));
            if (num == null || ((i14 = this.f3551f) != 0 && this.f3550e / i14 < 2 && num.intValue() > i13 * 8)) {
                C0959f c0959f = this.f3547b;
                InterfaceC0962i interfaceC0962iM2441H0 = (InterfaceC0962i) ((ArrayDeque) c0959f.f3536x).poll();
                if (interfaceC0962iM2441H0 == null) {
                    interfaceC0962iM2441H0 = c0959f.m2441H0();
                }
                c0958e = (C0958e) interfaceC0962iM2441H0;
                c0958e.m2440b(i13, cls);
            } else {
                C0959f c0959f2 = this.f3547b;
                int iIntValue = num.intValue();
                InterfaceC0962i interfaceC0962iM2441H1 = (InterfaceC0962i) ((ArrayDeque) c0959f2.f3536x).poll();
                if (interfaceC0962iM2441H1 == null) {
                    interfaceC0962iM2441H1 = c0959f2.m2441H0();
                }
                c0958e = (C0958e) interfaceC0962iM2441H1;
                c0958e.m2440b(iIntValue, cls);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return m2446e(c0958e, cls);
    }

    /* JADX INFO: renamed from: d */
    public final C0956c m2445d(Class cls) {
        C0956c c0956c;
        HashMap map = this.f3549d;
        C0956c c0956c2 = (C0956c) map.get(cls);
        if (c0956c2 != null) {
            return c0956c2;
        }
        if (cls.equals(int[].class)) {
            c0956c = new C0956c(1);
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            c0956c = new C0956c(0);
        }
        map.put(cls, c0956c);
        return c0956c;
    }

    /* JADX INFO: renamed from: e */
    public final Object m2446e(C0958e c0958e, Class cls) {
        C0956c c0956cM2445d = m2445d(cls);
        Object objM16034M = this.f3546a.m16034M(c0958e);
        if (objM16034M != null) {
            this.f3551f -= c0956cM2445d.m2436b() * c0956cM2445d.m2435a(objM16034M);
            m2442a(c0956cM2445d.m2435a(objM16034M), cls);
        }
        if (objM16034M != null) {
            return objM16034M;
        }
        if (Log.isLoggable(c0956cM2445d.m2437c(), 2)) {
            Log.v(c0956cM2445d.m2437c(), "Allocated " + c0958e.f3543b + " bytes");
        }
        return c0956cM2445d.m2438d(c0958e.f3543b);
    }

    /* JADX INFO: renamed from: f */
    public final NavigableMap m2447f(Class cls) {
        HashMap map = this.f3548c;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m2448g(Object obj) {
        Class<?> cls = obj.getClass();
        C0956c c0956cM2445d = m2445d(cls);
        int iM2435a = c0956cM2445d.m2435a(obj);
        int iM2436b = c0956cM2445d.m2436b() * iM2435a;
        if (iM2436b <= this.f3550e / 2) {
            C0959f c0959f = this.f3547b;
            InterfaceC0962i interfaceC0962iM2441H0 = (InterfaceC0962i) ((ArrayDeque) c0959f.f3536x).poll();
            if (interfaceC0962iM2441H0 == null) {
                interfaceC0962iM2441H0 = c0959f.m2441H0();
            }
            C0958e c0958e = (C0958e) interfaceC0962iM2441H0;
            c0958e.m2440b(iM2435a, cls);
            this.f3546a.m16049b0(c0958e, obj);
            NavigableMap navigableMapM2447f = m2447f(cls);
            Integer num = (Integer) navigableMapM2447f.get(Integer.valueOf(c0958e.f3543b));
            Integer numValueOf = Integer.valueOf(c0958e.f3543b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM2447f.put(numValueOf, Integer.valueOf(iIntValue));
            this.f3551f += iM2436b;
            m2443b(this.f3550e);
        }
    }
}
