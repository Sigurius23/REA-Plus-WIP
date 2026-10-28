package p284ko;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p690zr.AbstractC41047q;
import p690zr.C41048q0;

/* JADX INFO: renamed from: ko.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C22636t implements Map {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f89066w;

    /* JADX INFO: renamed from: x */
    public final Map f89067x;

    public /* synthetic */ C22636t(Map map, int i13) {
        this.f89066w = i13;
        this.f89067x = map;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m65573a(Object obj) {
        return m65574b().containsKey(obj);
    }

    /* JADX INFO: renamed from: b */
    public final Map m65574b() {
        switch (this.f89066w) {
            case 0:
                break;
        }
        return this.f89067x;
    }

    /* JADX INFO: renamed from: c */
    public final Set m65575c() {
        return m65574b().entrySet();
    }

    @Override // java.util.Map
    public final void clear() {
        m65574b().clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.f89066w) {
            case 0:
                return obj != null && m65573a(obj);
            default:
                return obj != null && m65573a(obj);
        }
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        C41048q0 c41048q0 = new C41048q0(entrySet().iterator());
        if (obj == null) {
            while (c41048q0.hasNext()) {
                if (c41048q0.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (c41048q0.hasNext()) {
            if (obj.equals(c41048q0.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final Object m65576d(Object obj) {
        return m65574b().get(obj);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m65577e() {
        return m65574b().isEmpty();
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.f89066w) {
            case 0:
                return AbstractC41047q.m133277g(m65575c(), new C22635s(1));
            default:
                return AbstractC41047q.m133277g(m65575c(), new C22635s(2));
        }
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        switch (this.f89066w) {
            case 0:
                return obj != null && AbstractC41047q.m133275e(obj, this);
            default:
                return obj != null && AbstractC41047q.m133275e(obj, this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final Set m65578g() {
        return m65574b().keySet();
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        switch (this.f89066w) {
            case 0:
                if (obj == null) {
                    return null;
                }
                return (List) m65576d(obj);
            default:
                if (obj == null) {
                    return null;
                }
                return (List) m65576d(obj);
        }
    }

    /* JADX INFO: renamed from: h */
    public final int m65579h() {
        return m65574b().size();
    }

    @Override // java.util.Map
    public final int hashCode() {
        switch (this.f89066w) {
            case 0:
                break;
        }
        return AbstractC41047q.m133280j(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.f89066w) {
            case 0:
                if (m65577e()) {
                    return true;
                }
                return m65579h() == 1 && m65573a(null);
            default:
                if (m65577e()) {
                    return true;
                }
                return m65579h() == 1 && m65573a(null);
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.f89066w) {
            case 0:
                return AbstractC41047q.m133277g(m65578g(), new C22635s(0));
            default:
                return AbstractC41047q.m133277g(m65578g(), new C22635s(3));
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return m65574b().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m65574b().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return m65574b().remove(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final int size() {
        int iM65579h;
        int iM65573a;
        switch (this.f89066w) {
            case 0:
                iM65579h = m65579h();
                iM65573a = m65573a(null);
                break;
            default:
                iM65579h = m65579h();
                iM65573a = m65573a(null);
                break;
        }
        return iM65579h - iM65573a;
    }

    public final String toString() {
        Map map;
        switch (this.f89066w) {
            case 0:
                map = this.f89067x;
                break;
            default:
                map = this.f89067x;
                break;
        }
        return map.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return m65574b().values();
    }
}
