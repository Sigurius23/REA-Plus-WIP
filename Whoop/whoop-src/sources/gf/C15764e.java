package gf;

import d93.InterfaceC11824e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p088dc.AbstractC11894a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gf.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C15764e implements Map, InterfaceC11824e {

    /* JADX INFO: renamed from: w */
    public final LinkedHashMap f59427w = new LinkedHashMap();

    @Override // java.util.Map
    public final void clear() {
        this.f59427w.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return this.f59427w.containsKey(AbstractC11894a.m31949Q((String) obj));
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f59427w.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        Set<Map.Entry> setEntrySet = this.f59427w.entrySet();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new C15763d(((C15767h) entry.getKey()).f59432b, entry.getValue()));
        }
        return AbstractC25265s.m74101H1(arrayList);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof C15764e) {
            return AbstractC22676k.m65745e(this.f59427w, ((C15764e) obj).f59427w);
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj instanceof String) {
            return this.f59427w.get(AbstractC11894a.m31949Q((String) obj));
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f59427w.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f59427w.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new C15766g(this.f59427w.keySet());
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        String key = (String) obj;
        AbstractC22676k.m65750j(key, "key");
        return this.f59427w.put(AbstractC11894a.m31949Q(key), obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        AbstractC22676k.m65750j(from, "from");
        for (Map.Entry entry : from.entrySet()) {
            String key = (String) entry.getKey();
            Object value = entry.getValue();
            AbstractC22676k.m65750j(key, "key");
            this.f59427w.put(AbstractC11894a.m31949Q(key), value);
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj instanceof String) {
            return this.f59427w.remove(AbstractC11894a.m31949Q((String) obj));
        }
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f59427w.size();
    }

    public final String toString() {
        return this.f59427w.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f59427w.values();
    }
}
