package gf;

import d93.InterfaceC11824e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m83.C25264r;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import xb3.InterfaceC38174i;

/* JADX INFO: renamed from: gf.s */
/* JADX INFO: loaded from: classes.dex */
public final class C15778s implements Map, InterfaceC15772m, InterfaceC11824e {

    /* JADX INFO: renamed from: w */
    public final LinkedHashMap f59466w;

    public C15778s(LinkedHashMap linkedHashMap) {
        this.f59466w = linkedHashMap;
    }

    @Override // gf.InterfaceC15772m
    /* JADX INFO: renamed from: C */
    public final boolean mo14230C(Object obj, Collection values) {
        AbstractC22676k.m65750j(values, "values");
        Object arrayList = get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList();
            put(obj, arrayList);
        }
        return ((List) arrayList).addAll(values);
    }

    @Override // java.util.Map
    public final void clear() {
        this.f59466w.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f59466w.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!AbstractC22681m0.m65776g(obj)) {
            return false;
        }
        List value = (List) obj;
        AbstractC22676k.m65750j(value, "value");
        return this.f59466w.containsValue(value);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f59466w.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15778s.class != obj.getClass()) {
            return false;
        }
        return this.f59466w.equals(((C15778s) obj).f59466w);
    }

    @Override // gf.InterfaceC15772m
    /* JADX INFO: renamed from: f */
    public final InterfaceC38174i mo14235f() {
        return new C25264r(new C15777r(this, null));
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return (List) this.f59466w.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f59466w.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f59466w.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f59466w.keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        List value = (List) obj2;
        AbstractC22676k.m65750j(value, "value");
        return (List) this.f59466w.put(obj, value);
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        AbstractC22676k.m65750j(from, "from");
        this.f59466w.putAll(from);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return (List) this.f59466w.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f59466w.size();
    }

    public final String toString() {
        return this.f59466w.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f59466w.values();
    }
}
