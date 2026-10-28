package o63;

import d93.InterfaceC11824e;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o63.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C27613d implements Map, InterfaceC11824e {

    /* JADX INFO: renamed from: w */
    public final LinkedHashMap f111142w = new LinkedHashMap();

    @Override // java.util.Map
    public final void clear() {
        this.f111142w.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f111142w.containsKey(new C27614e((String) obj));
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f111142w.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new C27618i(this.f111142w.entrySet(), C27612c.f111138x, C27612c.f111139y);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C27613d)) {
            return false;
        }
        return AbstractC22676k.m65745e(((C27613d) obj).f111142w, this.f111142w);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj instanceof String) {
            return this.f111142w.get(AbstractC12350b.m34587h((String) obj));
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f111142w.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f111142w.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new C27618i(this.f111142w.keySet(), C27612c.f111140z, C27612c.f111137E);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object value) {
        String key = (String) obj;
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(value, "value");
        return this.f111142w.put(AbstractC12350b.m34587h(key), value);
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        AbstractC22676k.m65750j(from, "from");
        for (Map.Entry entry : from.entrySet()) {
            String key = (String) entry.getKey();
            Object value = entry.getValue();
            AbstractC22676k.m65750j(key, "key");
            AbstractC22676k.m65750j(value, "value");
            this.f111142w.put(AbstractC12350b.m34587h(key), value);
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj instanceof String) {
            return this.f111142w.remove(AbstractC12350b.m34587h((String) obj));
        }
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f111142w.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f111142w.values();
    }
}
