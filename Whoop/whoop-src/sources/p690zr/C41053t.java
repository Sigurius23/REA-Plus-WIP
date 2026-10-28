package p690zr;

import java.util.Map;
import p463rj.AbstractC31479j;

/* JADX INFO: renamed from: zr.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C41053t extends AbstractC41039m {

    /* JADX INFO: renamed from: w */
    public final Object f177050w;

    /* JADX INFO: renamed from: x */
    public int f177051x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C41055u f177052y;

    public C41053t(C41055u c41055u, int i13) {
        this.f177052y = c41055u;
        Object obj = C41055u.f177053J;
        this.f177050w = c41055u.m133304j()[i13];
        this.f177051x = i13;
    }

    /* JADX INFO: renamed from: a */
    public final void m133294a() {
        int i13 = this.f177051x;
        Object obj = this.f177050w;
        C41055u c41055u = this.f177052y;
        if (i13 != -1 && i13 < c41055u.size()) {
            if (AbstractC31479j.m96940s(obj, c41055u.m133304j()[this.f177051x])) {
                return;
            }
        }
        Object obj2 = C41055u.f177053J;
        this.f177051x = c41055u.m133299d(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f177050w;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C41055u c41055u = this.f177052y;
        Map mapM133297b = c41055u.m133297b();
        if (mapM133297b != null) {
            return mapM133297b.get(this.f177050w);
        }
        m133294a();
        int i13 = this.f177051x;
        if (i13 == -1) {
            return null;
        }
        return c41055u.m133305k()[i13];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C41055u c41055u = this.f177052y;
        Map mapM133297b = c41055u.m133297b();
        Object obj2 = this.f177050w;
        if (mapM133297b != null) {
            return mapM133297b.put(obj2, obj);
        }
        m133294a();
        int i13 = this.f177051x;
        if (i13 == -1) {
            c41055u.put(obj2, obj);
            return null;
        }
        Object obj3 = c41055u.m133305k()[i13];
        c41055u.m133305k()[this.f177051x] = obj;
        return obj3;
    }
}
