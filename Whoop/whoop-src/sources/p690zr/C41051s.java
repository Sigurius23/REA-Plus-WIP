package p690zr;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p463rj.AbstractC31479j;

/* JADX INFO: renamed from: zr.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C41051s extends AbstractSet {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f177045w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C41055u f177046x;

    public /* synthetic */ C41051s(C41055u c41055u, int i13) {
        this.f177045w = i13;
        this.f177046x = c41055u;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f177045w) {
            case 0:
                this.f177046x.clear();
                break;
            default:
                this.f177046x.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f177045w) {
            case 0:
                C41055u c41055u = this.f177046x;
                Map mapM133297b = c41055u.m133297b();
                if (mapM133297b != null) {
                    return mapM133297b.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iM133299d = c41055u.m133299d(entry.getKey());
                    if (iM133299d != -1 && AbstractC31479j.m96940s(c41055u.m133305k()[iM133299d], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f177046x.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f177045w) {
            case 0:
                C41055u c41055u = this.f177046x;
                Map mapM133297b = c41055u.m133297b();
                return mapM133297b != null ? mapM133297b.entrySet().iterator() : new C41049r(c41055u, 1);
            default:
                C41055u c41055u2 = this.f177046x;
                Map mapM133297b2 = c41055u2.m133297b();
                return mapM133297b2 != null ? mapM133297b2.keySet().iterator() : new C41049r(c41055u2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f177045w) {
            case 0:
                C41055u c41055u = this.f177046x;
                Map mapM133297b = c41055u.m133297b();
                if (mapM133297b != null) {
                    return mapM133297b.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c41055u.m133301g()) {
                        int iM133298c = c41055u.m133298c();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c41055u.f177059w;
                        Objects.requireNonNull(obj2);
                        int iM133284n = AbstractC41047q.m133284n(key, value, iM133298c, obj2, c41055u.m133303i(), c41055u.m133304j(), c41055u.m133305k());
                        if (iM133284n != -1) {
                            c41055u.m133300e(iM133284n, iM133298c);
                            c41055u.f177055F--;
                            c41055u.f177054E += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                C41055u c41055u2 = this.f177046x;
                Map mapM133297b2 = c41055u2.m133297b();
                if (mapM133297b2 != null) {
                    return mapM133297b2.keySet().remove(obj);
                }
                return c41055u2.m133302h(obj) != C41055u.f177053J;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f177045w) {
            case 0:
                break;
        }
        return this.f177046x.size();
    }
}
