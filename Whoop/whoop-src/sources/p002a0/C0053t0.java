package p002a0;

import c93.InterfaceC4351m;
import d93.InterfaceC11820a;
import ih0.AbstractC18489d0;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import p540v1.C35523a;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;
import xb3.C38170e;
import xb3.C38172g;
import xb3.C38175j;
import xb3.C38180o;
import xb3.C38181p;

/* JADX INFO: renamed from: a0.t0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0053t0 implements Iterator, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f162w;

    /* JADX INFO: renamed from: x */
    public int f163x;

    /* JADX INFO: renamed from: y */
    public Object f164y;

    /* JADX INFO: renamed from: z */
    public final Object f165z;

    public C0053t0(Object obj, Map map) {
        this.f162w = 2;
        this.f164y = obj;
        this.f165z = map;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f162w) {
            case 0:
                return ((C38175j) this.f164y).hasNext();
            case 1:
                return ((C38175j) this.f164y).hasNext();
            case 2:
                return this.f163x < ((Map) this.f165z).size();
            case 3:
                C38181p c38181p = (C38181p) this.f165z;
                Iterator it = (Iterator) this.f164y;
                while (this.f163x < c38181p.f163490b && it.hasNext()) {
                    it.next();
                    this.f163x++;
                }
                return this.f163x < c38181p.f163491c && it.hasNext();
            default:
                return ((Iterator) this.f164y).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f162w) {
            case 0:
                return ((C38175j) this.f164y).next();
            case 1:
                return ((C38175j) this.f164y).next();
            case 2:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f164y;
                this.f163x++;
                Object obj2 = ((Map) this.f165z).get(obj);
                if (obj2 == null) {
                    throw new ConcurrentModificationException(AbstractC18489d0.m53369j(obj, "Hash code of an element (", ") has changed after it was added to the persistent set."));
                }
                this.f164y = ((C35523a) obj2).f151144b;
                return obj;
            case 3:
                C38181p c38181p = (C38181p) this.f165z;
                Iterator it = (Iterator) this.f164y;
                while (this.f163x < c38181p.f163490b && it.hasNext()) {
                    it.next();
                    this.f163x++;
                }
                int i13 = this.f163x;
                if (i13 >= c38181p.f163491c) {
                    throw new NoSuchElementException();
                }
                this.f163x = i13 + 1;
                return it.next();
            default:
                InterfaceC4351m interfaceC4351m = (InterfaceC4351m) ((C38180o) this.f165z).f163488c;
                int i14 = this.f163x;
                this.f163x = i14 + 1;
                if (i14 >= 0) {
                    return interfaceC4351m.invoke(Integer.valueOf(i14), ((Iterator) this.f164y).next());
                }
                AbstractC37056f.m118977d0();
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f162w) {
            case 0:
                int i13 = this.f163x;
                if (i13 != -1) {
                    ((C0055u0) this.f165z).f168x.m118h(i13);
                    this.f163x = -1;
                    return;
                }
                return;
            case 1:
                int i14 = this.f163x;
                if (i14 != -1) {
                    ((C0063y0) this.f165z).f200x.m148m(i14);
                    this.f163x = -1;
                    return;
                }
                return;
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0053t0(C38180o c38180o) {
        this.f162w = 4;
        this.f165z = c38180o;
        this.f164y = new C38170e((C38172g) c38180o.f163487b);
    }

    public C0053t0(C38181p c38181p) {
        this.f162w = 3;
        this.f165z = c38181p;
        this.f164y = c38181p.f163489a.iterator();
    }

    public C0053t0(C0063y0 c0063y0) {
        this.f162w = 1;
        this.f165z = c0063y0;
        this.f163x = -1;
        this.f164y = AbstractC35745c.m113247i(new C0061x0(c0063y0, this, null));
    }

    public C0053t0(C0055u0 c0055u0) {
        this.f162w = 0;
        this.f165z = c0055u0;
        this.f163x = -1;
        this.f164y = AbstractC35745c.m113247i(new C0051s0(c0055u0, this, null));
    }
}
