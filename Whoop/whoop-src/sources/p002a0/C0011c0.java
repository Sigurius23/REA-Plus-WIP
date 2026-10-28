package p002a0;

import d93.InterfaceC11820a;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a0.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0011c0 implements Map, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final C0057v0 f26w;

    /* JADX INFO: renamed from: x */
    public C0034k f27x;

    /* JADX INFO: renamed from: y */
    public C0034k f28y;

    /* JADX INFO: renamed from: z */
    public C0033j1 f29z;

    public C0011c0(C0057v0 parent) {
        AbstractC22676k.m65750j(parent, "parent");
        this.f26w = parent;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f26w.m125c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f26w.m126d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C0034k c0034k = this.f27x;
        if (c0034k != null) {
            return c0034k;
        }
        C0034k c0034k2 = new C0034k(this.f26w, 0);
        this.f27x = c0034k2;
        return c0034k2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0011c0.class != obj.getClass()) {
            return false;
        }
        return AbstractC22676k.m65745e(this.f26w, ((C0011c0) obj).f26w);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f26w.m129g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f26w.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f26w.m131i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0034k c0034k = this.f28y;
        if (c0034k != null) {
            return c0034k;
        }
        C0034k c0034k2 = new C0034k(this.f26w, 1);
        this.f28y = c0034k2;
        return c0034k2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f26w.f174e;
    }

    public final String toString() {
        return this.f26w.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        C0033j1 c0033j1 = this.f29z;
        if (c0033j1 != null) {
            return c0033j1;
        }
        C0033j1 c0033j2 = new C0033j1(this.f26w);
        this.f29z = c0033j2;
        return c0033j2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
