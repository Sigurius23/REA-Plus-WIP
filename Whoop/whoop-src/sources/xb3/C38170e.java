package xb3;

import d93.InterfaceC11820a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xb3.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C38170e implements Iterator, InterfaceC11820a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC38174i f163465E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f163466w;

    /* JADX INFO: renamed from: x */
    public final Iterator f163467x;

    /* JADX INFO: renamed from: y */
    public int f163468y;

    /* JADX INFO: renamed from: z */
    public Object f163469z;

    public C38170e(C38171f c38171f) {
        this.f163466w = 0;
        this.f163465E = c38171f;
        this.f163467x = c38171f.f163470a.iterator();
        this.f163468y = -1;
    }

    /* JADX INFO: renamed from: a */
    public void m122267a() {
        Object next;
        C38171f c38171f = (C38171f) this.f163465E;
        do {
            Iterator it = this.f163467x;
            if (!it.hasNext()) {
                this.f163468y = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) c38171f.f163472c.invoke(next)).booleanValue() != c38171f.f163471b);
        this.f163469z = next;
        this.f163468y = 1;
    }

    /* JADX INFO: renamed from: b */
    public boolean m122268b() {
        Iterator it;
        Iterator it3 = (Iterator) this.f163469z;
        if (it3 != null && it3.hasNext()) {
            this.f163468y = 1;
            return true;
        }
        do {
            Iterator it4 = this.f163467x;
            if (!it4.hasNext()) {
                this.f163468y = 2;
                this.f163469z = null;
                return false;
            }
            Object next = it4.next();
            C38172g c38172g = (C38172g) this.f163465E;
            it = (Iterator) c38172g.f163475c.invoke(c38172g.f163474b.invoke(next));
        } while (!it.hasNext());
        this.f163469z = it;
        this.f163468y = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f163466w) {
            case 0:
                if (this.f163468y == -1) {
                    m122267a();
                }
                return this.f163468y == 1;
            default:
                int i13 = this.f163468y;
                if (i13 == 1) {
                    return true;
                }
                if (i13 == 2) {
                    return false;
                }
                return m122268b();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f163466w) {
            case 0:
                if (this.f163468y == -1) {
                    m122267a();
                }
                if (this.f163468y == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f163469z;
                this.f163469z = null;
                this.f163468y = -1;
                return obj;
            default:
                int i13 = this.f163468y;
                if (i13 == 2) {
                    throw new NoSuchElementException();
                }
                if (i13 == 0 && !m122268b()) {
                    throw new NoSuchElementException();
                }
                this.f163468y = 0;
                Iterator it = (Iterator) this.f163469z;
                AbstractC22676k.m65747g(it);
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f163466w) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C38170e(C38172g c38172g) {
        this.f163466w = 1;
        this.f163465E = c38172g;
        this.f163467x = c38172g.f163473a.iterator();
    }
}
