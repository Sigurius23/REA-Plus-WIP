package p690zr;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: renamed from: zr.c */
/* JADX INFO: loaded from: classes6.dex */
public class C41010c implements Iterator {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f176966w = 0;

    /* JADX INFO: renamed from: x */
    public final Iterator f176967x;

    /* JADX INFO: renamed from: y */
    public Object f176968y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f176969z;

    public C41010c(C41037l c41037l) {
        this.f176969z = c41037l;
        Collection collection = c41037l.f177018x;
        this.f176968y = collection;
        this.f176967x = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: renamed from: a */
    public void m133235a() {
        C41037l c41037l = (C41037l) this.f176969z;
        c41037l.m133268c();
        if (c41037l.f177018x != ((Collection) this.f176968y)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f176966w) {
            case 0:
                break;
            case 1:
                break;
            default:
                m133235a();
                break;
        }
        return this.f176967x.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f176966w) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f176967x.next();
                this.f176968y = (Collection) entry.getValue();
                return ((C41013d) this.f176969z).m133238a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f176967x.next();
                this.f176968y = entry2;
                return entry2.getKey();
            default:
                m133235a();
                return this.f176967x.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f176966w) {
            case 0:
                if (!(((Collection) this.f176968y) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f176967x.remove();
                ((C41013d) this.f176969z).f176982z.f177047E -= ((Collection) this.f176968y).size();
                ((Collection) this.f176968y).clear();
                this.f176968y = null;
                return;
            case 1:
                Map.Entry entry = (Map.Entry) this.f176968y;
                if (!(entry != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection collection = (Collection) entry.getValue();
                this.f176967x.remove();
                ((C41016e) this.f176969z).f176985x.f177047E -= collection.size();
                collection.clear();
                this.f176968y = null;
                return;
            default:
                this.f176967x.remove();
                C41037l c41037l = (C41037l) this.f176969z;
                c41037l.f177015E.f177047E--;
                c41037l.m133269d();
                return;
        }
    }

    public C41010c(C41037l c41037l, ListIterator listIterator) {
        this.f176969z = c41037l;
        this.f176968y = c41037l.f177018x;
        this.f176967x = listIterator;
    }

    public C41010c(C41016e c41016e, Iterator it) {
        this.f176967x = it;
        this.f176969z = c41016e;
    }

    public C41010c(C41013d c41013d) {
        this.f176969z = c41013d;
        this.f176967x = c41013d.f176981y.entrySet().iterator();
    }
}
