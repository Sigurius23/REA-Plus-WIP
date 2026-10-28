package m83;

import d93.InterfaceC11820a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import lc0.C23821c;
import p511u1.C34396c;
import p511u1.C34403j;
import p511u1.C34405l;
import p511u1.C34407n;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m83.f */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25244f implements Map, InterfaceC11820a {
    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set setEntrySet = entrySet();
        if (setEntrySet.isEmpty()) {
            return false;
        }
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (AbstractC22676k.m65745e(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new C34403j((C34396c) this);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (((C34396c) this).f144603x != map.size()) {
            return false;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : setEntrySet) {
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = get(key);
                if (AbstractC22676k.m65745e(value, obj2) && (obj2 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((C34396c) this).f144603x == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new C34405l((C34396c) this);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return ((C34396c) this).f144603x;
    }

    public final String toString() {
        return AbstractC25265s.m74110N0(entrySet(), ", ", "{", "}", new C23821c(this, 13), 24);
    }

    @Override // java.util.Map
    public final Collection values() {
        return new C34407n((C34396c) this);
    }
}
