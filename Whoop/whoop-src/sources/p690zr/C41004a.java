package p690zr;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: zr.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C41004a implements Iterator {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C41052s0 f176946E;

    /* JADX INFO: renamed from: w */
    public final Iterator f176947w;

    /* JADX INFO: renamed from: x */
    public Object f176948x = null;

    /* JADX INFO: renamed from: y */
    public Collection f176949y = null;

    /* JADX INFO: renamed from: z */
    public Iterator f176950z = EnumC41038l0.f177021w;

    public C41004a(C41052s0 c41052s0) {
        this.f176946E = c41052s0;
        this.f176947w = c41052s0.f177049z.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f176947w.hasNext() || this.f176950z.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f176950z.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f176947w.next();
            this.f176948x = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f176949y = collection;
            this.f176950z = collection.iterator();
        }
        return this.f176950z.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f176950z.remove();
        Collection collection = this.f176949y;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f176947w.remove();
        }
        this.f176946E.f177047E--;
    }
}
