package mp;

import java.io.Serializable;
import java.util.Map;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: mp.o */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC25790o implements Map, Serializable {

    /* JADX INFO: renamed from: x */
    public static final Map.Entry[] f101520x = new Map.Entry[0];

    /* JADX INFO: renamed from: w */
    public transient AbstractC25792p f101521w;

    @Override // java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AbstractC25792p entrySet() {
        AbstractC25792p c25796r = this.f101521w;
        if (c25796r == null) {
            C25798s c25798s = (C25798s) this;
            c25796r = c25798s.isEmpty() ? C25812z.f101557J : new C25796r(c25798s);
            this.f101521w = c25796r;
        }
        return c25796r;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return ((C25798s) this).f101534z.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return ((C25798s) this).entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC25753b.m75990b(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((C25798s) this).size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        C25798s c25798s = (C25798s) this;
        int size = c25798s.size();
        if (size < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(size, "size cannot be negative but was: "));
        }
        StringBuilder sb4 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb4.append('{');
        boolean z4 = true;
        for (Map.Entry entry : c25798s.entrySet()) {
            if (!z4) {
                sb4.append(", ");
            }
            sb4.append(entry.getKey());
            sb4.append('=');
            sb4.append(entry.getValue());
            z4 = false;
        }
        sb4.append('}');
        return sb4.toString();
    }
}
