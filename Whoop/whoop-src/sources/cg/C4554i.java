package cg;

import gf.InterfaceC15770k;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import p437qt.C30582e;
import p715kotlin.jvm.internal.AbstractC22676k;
import tg.C33770b;
import xb3.InterfaceC38174i;

/* JADX INFO: renamed from: cg.i */
/* JADX INFO: loaded from: classes.dex */
public final class C4554i implements InterfaceC15770k {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ int f18348y = 0;

    /* JADX INFO: renamed from: w */
    public final InterfaceC15770k f18349w;

    /* JADX INFO: renamed from: x */
    public final boolean f18350x;

    static {
        new C4552g().m14233b();
    }

    public C4554i(InterfaceC15770k interfaceC15770k, boolean z4) {
        this.f18349w = interfaceC15770k;
        this.f18350x = z4;
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
        if (!(obj instanceof C33770b)) {
            return false;
        }
        return this.f18349w.containsKey((C33770b) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        return this.f18349w.containsValue((List) obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f18349w.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4554i.class != obj.getClass()) {
            return false;
        }
        C4554i c4554i = (C4554i) obj;
        return AbstractC22676k.m65745e(this.f18349w, c4554i.f18349w) && this.f18350x == c4554i.f18350x;
    }

    @Override // gf.InterfaceC15770k
    /* JADX INFO: renamed from: f */
    public final InterfaceC38174i mo14237f() {
        return this.f18349w.mo14237f();
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof C33770b)) {
            return null;
        }
        return (List) this.f18349w.get((C33770b) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return Boolean.hashCode(this.f18350x) + (this.f18349w.hashCode() * 31);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f18349w.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f18349w.keySet();
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
        return this.f18349w.size();
    }

    public final String toString() {
        return C30582e.m93815c(this.f18349w.mo14237f(), this.f18350x);
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f18349w.values();
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
