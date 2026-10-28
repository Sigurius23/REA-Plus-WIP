package p236j;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.ActivityOptionsCompat;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1577e0;
import androidx.lifecycle.InterfaceC1585g0;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import p098dt.AbstractC12350b;
import p267k.AbstractC22081b;
import p715kotlin.jvm.internal.AbstractC22676k;
import xb3.AbstractC38176k;
import xb3.C38166a;

/* JADX INFO: renamed from: j.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21071j {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f79930a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f79931b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f79932c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public final ArrayList f79933d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final transient LinkedHashMap f79934e = new LinkedHashMap();

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f79935f = new LinkedHashMap();

    /* JADX INFO: renamed from: g */
    public final Bundle f79936g = new Bundle();

    /* JADX INFO: renamed from: a */
    public final boolean m58912a(int i13, int i14, Intent intent) {
        String str = (String) this.f79930a.get(Integer.valueOf(i13));
        if (str == null) {
            return false;
        }
        C21067f c21067f = (C21067f) this.f79934e.get(str);
        if ((c21067f != null ? c21067f.f79921a : null) != null) {
            ArrayList arrayList = this.f79933d;
            if (arrayList.contains(str)) {
                c21067f.f79921a.mo364a(c21067f.f79922b.parseResult(i14, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f79935f.remove(str);
        this.f79936g.putParcelable(str, new C21062a(i14, intent));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo42997b(int i13, AbstractC22081b abstractC22081b, Object obj, ActivityOptionsCompat activityOptionsCompat);

    /* JADX INFO: renamed from: c */
    public final C21070i m58913c(final String key, InterfaceC1585g0 interfaceC1585g0, final AbstractC22081b contract, final InterfaceC21063b callback) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(contract, "contract");
        AbstractC22676k.m65750j(callback, "callback");
        AbstractC1638x lifecycle = interfaceC1585g0.getLifecycle();
        if (lifecycle.mo4987b().compareTo(EnumC1635w.f6328z) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + interfaceC1585g0 + " is attempting to register while current state is " + lifecycle.mo4987b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        m58915e(key);
        LinkedHashMap linkedHashMap = this.f79932c;
        C21068g c21068g = (C21068g) linkedHashMap.get(key);
        if (c21068g == null) {
            c21068g = new C21068g(lifecycle);
        }
        InterfaceC1577e0 interfaceC1577e0 = new InterfaceC1577e0() { // from class: j.e
            @Override // androidx.lifecycle.InterfaceC1577e0
            /* JADX INFO: renamed from: h */
            public final void mo4080h(InterfaceC1585g0 interfaceC1585g1, EnumC1632v event) {
                AbstractC21071j abstractC21071j = this.f79917w;
                LinkedHashMap linkedHashMap2 = abstractC21071j.f79934e;
                AbstractC22676k.m65750j(interfaceC1585g1, "<anonymous parameter 0>");
                AbstractC22676k.m65750j(event, "event");
                EnumC1632v enumC1632v = EnumC1632v.ON_START;
                String str = key;
                if (enumC1632v != event) {
                    if (EnumC1632v.ON_STOP == event) {
                        linkedHashMap2.remove(str);
                        return;
                    } else {
                        if (EnumC1632v.ON_DESTROY == event) {
                            abstractC21071j.m58916f(str);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = abstractC21071j.f79936g;
                LinkedHashMap linkedHashMap3 = abstractC21071j.f79935f;
                AbstractC22081b abstractC22081b = contract;
                InterfaceC21063b interfaceC21063b = callback;
                linkedHashMap2.put(str, new C21067f(abstractC22081b, interfaceC21063b));
                if (linkedHashMap3.containsKey(str)) {
                    Object obj = linkedHashMap3.get(str);
                    linkedHashMap3.remove(str);
                    interfaceC21063b.mo364a(obj);
                }
                C21062a c21062a = (C21062a) AbstractC12350b.m34600u(bundle, C21062a.class, str);
                if (c21062a != null) {
                    bundle.remove(str);
                    interfaceC21063b.mo364a(abstractC22081b.parseResult(c21062a.f79915w, c21062a.f79916x));
                }
            }
        };
        c21068g.f79923a.mo4986a(interfaceC1577e0);
        c21068g.f79924b.add(interfaceC1577e0);
        linkedHashMap.put(key, c21068g);
        return new C21070i(this, key, contract, 0);
    }

    /* JADX INFO: renamed from: d */
    public final C21070i m58914d(String key, AbstractC22081b contract, InterfaceC21063b interfaceC21063b) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(contract, "contract");
        m58915e(key);
        this.f79934e.put(key, new C21067f(contract, interfaceC21063b));
        LinkedHashMap linkedHashMap = this.f79935f;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            interfaceC21063b.mo364a(obj);
        }
        Bundle bundle = this.f79936g;
        C21062a c21062a = (C21062a) AbstractC12350b.m34600u(bundle, C21062a.class, key);
        if (c21062a != null) {
            bundle.remove(key);
            interfaceC21063b.mo364a(contract.parseResult(c21062a.f79915w, c21062a.f79916x));
        }
        return new C21070i(this, key, contract, 1);
    }

    /* JADX INFO: renamed from: e */
    public final void m58915e(String str) {
        LinkedHashMap linkedHashMap = this.f79931b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : (C38166a) AbstractC38176k.m122287w(C21069h.f79925w)) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f79930a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: f */
    public final void m58916f(String key) {
        Integer num;
        AbstractC22676k.m65750j(key, "key");
        if (!this.f79933d.contains(key) && (num = (Integer) this.f79931b.remove(key)) != null) {
            this.f79930a.remove(num);
        }
        this.f79934e.remove(key);
        LinkedHashMap linkedHashMap = this.f79935f;
        if (linkedHashMap.containsKey(key)) {
            StringBuilder sbM53375p = AbstractC18489d0.m53375p("Dropping pending result for request ", key, ": ");
            sbM53375p.append(linkedHashMap.get(key));
            Log.w("ActivityResultRegistry", sbM53375p.toString());
            linkedHashMap.remove(key);
        }
        Bundle bundle = this.f79936g;
        if (bundle.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((C21062a) AbstractC12350b.m34600u(bundle, C21062a.class, key)));
            bundle.remove(key);
        }
        LinkedHashMap linkedHashMap2 = this.f79932c;
        C21068g c21068g = (C21068g) linkedHashMap2.get(key);
        if (c21068g != null) {
            ArrayList arrayList = c21068g.f79924b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c21068g.f79923a.mo4988d((InterfaceC1577e0) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(key);
        }
    }
}
