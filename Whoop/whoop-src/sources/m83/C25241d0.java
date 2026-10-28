package m83;

import d93.InterfaceC11820a;
import java.util.Iterator;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import xb3.C38167b;

/* JADX INFO: renamed from: m83.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C25241d0 implements Iterator, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f99122w = 0;

    /* JADX INFO: renamed from: x */
    public final Iterator f99123x;

    /* JADX INFO: renamed from: y */
    public int f99124y;

    public C25241d0(Iterator iterator) {
        AbstractC22676k.m65750j(iterator, "iterator");
        this.f99123x = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f99122w) {
            case 0:
                return this.f99123x.hasNext();
        }
        while (true) {
            int i13 = this.f99124y;
            it = this.f99123x;
            if (i13 > 0 && it.hasNext()) {
                it.next();
                this.f99124y--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f99122w) {
            case 0:
                int i13 = this.f99124y;
                this.f99124y = i13 + 1;
                if (i13 >= 0) {
                    return new C25239c0(i13, this.f99123x.next());
                }
                AbstractC37056f.m118977d0();
                throw null;
        }
        while (true) {
            int i14 = this.f99124y;
            it = this.f99123x;
            if (i14 > 0 && it.hasNext()) {
                it.next();
                this.f99124y--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f99122w) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C25241d0(C38167b c38167b) {
        this.f99123x = c38167b.f163462a.iterator();
        this.f99124y = c38167b.f163463b;
    }
}
