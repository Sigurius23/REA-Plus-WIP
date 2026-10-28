package p128ew;

import d93.InterfaceC11820a;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import l83.C23470p;
import p021av.C2088b;
import q83.AbstractC30060g;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ew.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C13715b implements Map, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final Map f48685w;

    /* JADX INFO: renamed from: x */
    public final C23470p f48686x = AbstractC30060g.m92088H(new C2088b(this, 12));

    public C13715b(Map map) {
        this.f48685w = map;
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
        String strM95641q;
        if (!(obj == null ? true : obj instanceof String)) {
            return false;
        }
        String str = (String) obj;
        Map map = (Map) this.f48686x.getValue();
        if (str != null) {
            Locale locale = Locale.ROOT;
            strM95641q = AbstractC31061c.m95641q(locale, "ROOT", str, locale, "this as java.lang.String).toLowerCase(locale)");
        } else {
            strM95641q = null;
        }
        return map.containsKey(strM95641q);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f48685w.containsValue((String) obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return ((Map) this.f48686x.getValue()).entrySet();
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        String strM95641q = null;
        if (!(obj == null ? true : obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        Map map = (Map) this.f48686x.getValue();
        if (str != null) {
            Locale locale = Locale.ROOT;
            strM95641q = AbstractC31061c.m95641q(locale, "ROOT", str, locale, "this as java.lang.String).toLowerCase(locale)");
        }
        return (String) map.get(strM95641q);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f48685w.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return ((Map) this.f48686x.getValue()).keySet();
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
        return this.f48685w.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f48685w.values();
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
