package gf;

import d93.InterfaceC11820a;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import m83.C25264r;
import p715kotlin.jvm.internal.AbstractC22676k;
import xb3.InterfaceC38174i;

/* JADX INFO: renamed from: gf.q */
/* JADX INFO: loaded from: classes.dex */
public final class C15776q implements InterfaceC15770k, Map, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final Map f59456w;

    public C15776q(Map map) {
        this.f59456w = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f59456w.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        return this.f59456w.containsValue((List) obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f59456w.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15776q.class != obj.getClass()) {
            return false;
        }
        return AbstractC22676k.m65745e(this.f59456w, ((C15776q) obj).f59456w);
    }

    @Override // gf.InterfaceC15770k
    /* JADX INFO: renamed from: f */
    public final InterfaceC38174i mo14237f() {
        return new C25264r(new C15775p(this, null));
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return (List) this.f59456w.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f59456w.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f59456w.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f59456w.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f59456w.size();
    }

    public final String toString() {
        return this.f59456w.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f59456w.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
