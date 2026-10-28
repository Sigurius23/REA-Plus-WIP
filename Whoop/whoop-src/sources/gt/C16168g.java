package gt;

import android.util.Log;
import androidx.lifecycle.RunnableC1605m;
import b23.C2342h;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import ht.EnumC17622k;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import p000.AbstractC11266d;
import p098dt.C12351c;
import p437qt.C30582e;
import p505ts.AbstractC34132o;
import pt.InterfaceC29508a;
import pt.InterfaceC29509b;
import q83.AbstractC30060g;
import st.InterfaceC32956a;

/* JADX INFO: renamed from: gt.g */
/* JADX INFO: loaded from: classes.dex */
public final class C16168g implements InterfaceC16164c {

    /* JADX INFO: renamed from: h */
    public static final C16167f f61438h = new C16167f(0);

    /* JADX INFO: renamed from: a */
    public final HashMap f61439a;

    /* JADX INFO: renamed from: b */
    public final HashMap f61440b;

    /* JADX INFO: renamed from: c */
    public final HashMap f61441c;

    /* JADX INFO: renamed from: d */
    public final HashSet f61442d;

    /* JADX INFO: renamed from: e */
    public final C16172k f61443e;

    /* JADX INFO: renamed from: f */
    public final AtomicReference f61444f;

    /* JADX INFO: renamed from: g */
    public final C30582e f61445g;

    public C16168g(ArrayList arrayList, ArrayList arrayList2, C30582e c30582e) {
        EnumC17622k enumC17622k = EnumC17622k.f68344w;
        this.f61439a = new HashMap();
        this.f61440b = new HashMap();
        this.f61441c = new HashMap();
        this.f61442d = new HashSet();
        this.f61444f = new AtomicReference();
        C16172k c16172k = new C16172k();
        this.f61443e = c16172k;
        this.f61445g = c30582e;
        ArrayList<C16163b> arrayList3 = new ArrayList();
        arrayList3.add(C16163b.m45708b(c16172k, C16172k.class, InterfaceC29509b.class, InterfaceC29508a.class));
        arrayList3.add(C16163b.m45708b(this, C16168g.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C16163b c16163b = (C16163b) it.next();
            if (c16163b != null) {
                arrayList3.add(c16163b);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList4.add(it3.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC32956a) it4.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f61445g.m93821p(componentRegistrar));
                        it4.remove();
                    }
                } catch (InvalidRegistrarException e5) {
                    it4.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e5);
                }
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                for (Object obj : ((C16163b) it5.next()).f61429b.toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.f61442d.contains(obj.toString())) {
                            it5.remove();
                            break;
                        }
                        this.f61442d.add(obj.toString());
                    }
                }
            }
            if (this.f61439a.isEmpty()) {
                AbstractC30060g.m92128s(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f61439a.keySet());
                arrayList6.addAll(arrayList3);
                AbstractC30060g.m92128s(arrayList6);
            }
            for (C16163b c16163b2 : arrayList3) {
                this.f61439a.put(c16163b2, new C16173l(new C12351c(1, this, c16163b2)));
            }
            arrayList5.addAll(m45711g(arrayList3));
            arrayList5.addAll(m45712j());
            m45710c();
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) this.f61444f.get();
        if (bool != null) {
            m45709b(bool.booleanValue(), this.f61439a);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m45709b(boolean z4, HashMap map) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            C16163b c16163b = (C16163b) entry.getKey();
            InterfaceC32956a interfaceC32956a = (InterfaceC32956a) entry.getValue();
            int i13 = c16163b.f61431d;
            if (i13 == 1 || (i13 == 2 && z4)) {
                interfaceC32956a.get();
            }
        }
        C16172k c16172k = this.f61443e;
        synchronized (c16172k) {
            try {
                arrayDeque = c16172k.f61455b;
                if (arrayDeque != null) {
                    c16172k.f61455b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw AbstractC11266d.m30454h(it);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m45710c() {
        for (C16163b c16163b : this.f61439a.keySet()) {
            for (C16171j c16171j : c16163b.f61430c) {
                if (c16171j.f61452b == 2 && !this.f61441c.containsKey(c16171j.f61451a)) {
                    HashMap map = this.f61441c;
                    C16177p c16177p = c16171j.f61451a;
                    Set set = Collections.EMPTY_SET;
                    C16174m c16174m = new C16174m();
                    c16174m.f61461b = null;
                    c16174m.f61460a = Collections.newSetFromMap(new ConcurrentHashMap());
                    c16174m.f61460a.addAll(set);
                    map.put(c16177p, c16174m);
                } else if (this.f61440b.containsKey(c16171j.f61451a)) {
                    continue;
                } else {
                    int i13 = c16171j.f61452b;
                    if (i13 == 1) {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + c16163b + ": " + c16171j.f61451a);
                    }
                    if (i13 != 2) {
                        HashMap map2 = this.f61440b;
                        C16177p c16177p2 = c16171j.f61451a;
                        C2342h c2342h = C16175n.f61462c;
                        C16167f c16167f = C16175n.f61463d;
                        C16175n c16175n = new C16175n();
                        c16175n.f61464a = c2342h;
                        c16175n.f61465b = c16167f;
                        map2.put(c16177p2, c16175n);
                    }
                }
            }
        }
    }

    @Override // gt.InterfaceC16164c
    /* JADX INFO: renamed from: f */
    public final synchronized InterfaceC32956a mo1622f(C16177p c16177p) {
        AbstractC34132o.m107884h(c16177p, "Null interface requested.");
        return (InterfaceC32956a) this.f61440b.get(c16177p);
    }

    /* JADX INFO: renamed from: g */
    public final ArrayList m45711g(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C16163b c16163b = (C16163b) it.next();
            if (c16163b.f61432e == 0) {
                InterfaceC32956a interfaceC32956a = (InterfaceC32956a) this.f61439a.get(c16163b);
                for (C16177p c16177p : c16163b.f61429b) {
                    HashMap map = this.f61440b;
                    if (map.containsKey(c16177p)) {
                        arrayList2.add(new RunnableC1605m(6, (C16175n) ((InterfaceC32956a) map.get(c16177p)), interfaceC32956a));
                    } else {
                        map.put(c16177p, interfaceC32956a);
                    }
                }
            }
        }
        return arrayList2;
    }

    @Override // gt.InterfaceC16164c
    /* JADX INFO: renamed from: i */
    public final synchronized InterfaceC32956a mo1625i(C16177p c16177p) {
        C16174m c16174m = (C16174m) this.f61441c.get(c16177p);
        if (c16174m != null) {
            return c16174m;
        }
        return f61438h;
    }

    /* JADX INFO: renamed from: j */
    public final ArrayList m45712j() {
        HashMap map = this.f61441c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : this.f61439a.entrySet()) {
            C16163b c16163b = (C16163b) entry.getKey();
            if (c16163b.f61432e != 0) {
                InterfaceC32956a interfaceC32956a = (InterfaceC32956a) entry.getValue();
                for (C16177p c16177p : c16163b.f61429b) {
                    if (!map2.containsKey(c16177p)) {
                        map2.put(c16177p, new HashSet());
                    }
                    ((Set) map2.get(c16177p)).add(interfaceC32956a);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                C16174m c16174m = (C16174m) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new RunnableC1605m(7, c16174m, (InterfaceC32956a) it.next()));
                }
            } else {
                C16177p c16177p2 = (C16177p) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                C16174m c16174m2 = new C16174m();
                c16174m2.f61461b = null;
                c16174m2.f61460a = Collections.newSetFromMap(new ConcurrentHashMap());
                c16174m2.f61460a.addAll(set);
                map.put(c16177p2, c16174m2);
            }
        }
        return arrayList;
    }
}
