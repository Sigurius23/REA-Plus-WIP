package p002a0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: a0.g */
/* JADX INFO: loaded from: classes.dex */
public class C0022g extends C0021f1 implements Map {

    /* JADX INFO: renamed from: E */
    public C0010c f51E;

    /* JADX INFO: renamed from: F */
    public C0016e f52F;

    /* JADX INFO: renamed from: z */
    public C0004a f53z;

    public C0022g(C0022g c0022g) {
        super(0);
        mo39h(c0022g);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C0004a c0004a = this.f53z;
        if (c0004a != null) {
            return c0004a;
        }
        C0004a c0004a2 = new C0004a(this, 0);
        this.f53z = c0004a2;
        return c0004a2;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0010c c0010c = this.f51E;
        if (c0010c != null) {
            return c0010c;
        }
        C0010c c0010c2 = new C0010c(this);
        this.f51E = c0010c2;
        return c0010c2;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m43l(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m44m(Collection collection) {
        int i13 = this.f50y;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i13 != this.f50y;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m45n(Collection collection) {
        int i13 = this.f50y;
        for (int i14 = i13 - 1; i14 >= 0; i14--) {
            if (!collection.contains(m38g(i14))) {
                mo40i(i14);
            }
        }
        return i13 != this.f50y;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m34b(map.size() + this.f50y);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C0016e c0016e = this.f52F;
        if (c0016e != null) {
            return c0016e;
        }
        C0016e c0016e2 = new C0016e(this);
        this.f52F = c0016e2;
        return c0016e2;
    }
}
