package androidx.lifecycle;

import aa3.C0627i1;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import ec3.InterfaceC13075p1;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import m83.C25272z;
import n83.C26463f;
import p000.AbstractC30802r;
import p275k8.AbstractC22271a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.lifecycle.k1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1601k1 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f6268a;

    /* JADX INFO: renamed from: b */
    public final C0627i1 f6269b;

    public C1601k1(C26463f c26463f) {
        this.f6268a = new LinkedHashMap();
        this.f6269b = new C0627i1(c26463f);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5000a(String str) {
        C0627i1 c0627i1 = this.f6269b;
        c0627i1.getClass();
        return ((LinkedHashMap) c0627i1.f2195b).containsKey(str);
    }

    /* JADX INFO: renamed from: b */
    public final Object m5001b(String key) {
        Object value;
        AbstractC22676k.m65750j(key, "key");
        C0627i1 c0627i1 = this.f6269b;
        c0627i1.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0627i1.f2195b;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c0627i1.f2198e;
        try {
            InterfaceC13075p1 interfaceC13075p1 = (InterfaceC13075p1) linkedHashMap2.get(key);
            if (interfaceC13075p1 != null && (value = ((C13045h2) interfaceC13075p1).getValue()) != null) {
                return value;
            }
            return linkedHashMap.get(key);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(key);
            ((LinkedHashMap) c0627i1.f2197d).remove(key);
            linkedHashMap2.remove(key);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final C13081r1 m5002c(Object obj, String str) {
        C0627i1 c0627i1 = this.f6269b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0627i1.f2198e;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c0627i1.f2195b;
        if (linkedHashMap.containsKey(str)) {
            LinkedHashMap linkedHashMap3 = (LinkedHashMap) c0627i1.f2198e;
            Object objM36593c = linkedHashMap3.get(str);
            if (objM36593c == null) {
                if (!linkedHashMap2.containsKey(str)) {
                    linkedHashMap2.put(str, obj);
                }
                objM36593c = AbstractC13091v.m36593c(linkedHashMap2.get(str));
                linkedHashMap3.put(str, objM36593c);
            }
            return AbstractC13091v.m36598h((InterfaceC13075p1) objM36593c);
        }
        LinkedHashMap linkedHashMap4 = (LinkedHashMap) c0627i1.f2197d;
        Object objM36593c2 = linkedHashMap4.get(str);
        if (objM36593c2 == null) {
            if (!linkedHashMap2.containsKey(str)) {
                linkedHashMap2.put(str, obj);
            }
            objM36593c2 = AbstractC13091v.m36593c(linkedHashMap2.get(str));
            linkedHashMap4.put(str, objM36593c2);
        }
        return AbstractC13091v.m36598h((InterfaceC13075p1) objM36593c2);
    }

    /* JADX INFO: renamed from: d */
    public final void m5003d(String str) {
        C0627i1 c0627i1 = this.f6269b;
        c0627i1.getClass();
        ((LinkedHashMap) c0627i1.f2195b).remove(str);
        ((LinkedHashMap) c0627i1.f2197d).remove(str);
        ((LinkedHashMap) c0627i1.f2198e).remove(str);
        AbstractC30802r.m94771t(this.f6268a.remove(str));
    }

    /* JADX INFO: renamed from: e */
    public final void m5004e(Object obj, String key) {
        AbstractC22676k.m65750j(key, "key");
        if (obj != null) {
            List list = AbstractC22271a.f86914a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!((Class) it.next()).isInstance(obj));
            }
            throw new IllegalArgumentException(("Can't put value with type " + obj.getClass() + " into saved state").toString());
        }
        List list2 = AbstractC22271a.f86914a;
        Object obj2 = this.f6268a.get(key);
        C1630u0 c1630u0 = obj2 instanceof C1630u0 ? (C1630u0) obj2 : null;
        if (c1630u0 != null) {
            c1630u0.setValue(obj);
        }
        this.f6269b.m1630o(obj, key);
    }

    public C1601k1() {
        this.f6268a = new LinkedHashMap();
        this.f6269b = new C0627i1(C25272z.f99163w);
    }
}
