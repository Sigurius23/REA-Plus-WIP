package af3;

import io.sentry.cache.tape.C20287d;
import io.sentry.cache.tape.C20291h;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import wa3.AbstractC36990e;
import wa3.C37018u;
import wa3.C37023z;

/* JADX INFO: renamed from: af3.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C0845u implements Iterator {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3044w;

    /* JADX INFO: renamed from: x */
    public Object f3045x;

    /* JADX INFO: renamed from: y */
    public Object f3046y;

    public C0845u(AbstractC0844t abstractC0844t, AbstractC0844t abstractC0844t2) {
        this.f3044w = 0;
        this.f3045x = abstractC0844t;
        this.f3046y = abstractC0844t2;
    }

    /* JADX INFO: renamed from: a */
    public C37018u m2060a() {
        C37018u c37018u;
        Stack stack = (Stack) this.f3045x;
        C37018u c37018u2 = (C37018u) this.f3046y;
        if (c37018u2 == null) {
            throw new NoSuchElementException();
        }
        while (!stack.isEmpty()) {
            AbstractC36990e abstractC36990e = ((C37023z) stack.pop()).f158398z;
            while (abstractC36990e instanceof C37023z) {
                C37023z c37023z = (C37023z) abstractC36990e;
                stack.push(c37023z);
                abstractC36990e = c37023z.f158397y;
            }
            C37018u c37018u3 = (C37018u) abstractC36990e;
            if (c37018u3.f158387x.length != 0) {
                c37018u = c37018u3;
                this.f3046y = c37018u;
                return c37018u2;
            }
        }
        c37018u = null;
        this.f3046y = c37018u;
        return c37018u2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3044w) {
            case 0:
                AbstractC0844t abstractC0844t = (AbstractC0844t) this.f3045x;
                return (abstractC0844t == null || abstractC0844t == ((AbstractC0844t) this.f3046y)) ? false : true;
            case 1:
                return ((C20291h) this.f3045x).hasNext();
            default:
                return ((C37018u) this.f3046y) != null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3044w) {
            case 0:
                AbstractC0844t abstractC0844t = (AbstractC0844t) this.f3045x;
                this.f3045x = abstractC0844t.f3042e;
                return abstractC0844t;
            case 1:
                return ((C20287d) this.f3046y).f76169y.mo2349i((byte[]) ((C20291h) this.f3045x).next());
            default:
                return m2060a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3044w) {
            case 0:
                throw new UnsupportedOperationException("remove");
            case 1:
                ((C20291h) this.f3045x).remove();
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0845u(C20287d c20287d, C20291h c20291h) {
        this.f3044w = 1;
        this.f3046y = c20287d;
        this.f3045x = c20291h;
    }

    public C0845u(AbstractC36990e abstractC36990e) {
        this.f3044w = 2;
        this.f3045x = new Stack();
        while (abstractC36990e instanceof C37023z) {
            C37023z c37023z = (C37023z) abstractC36990e;
            ((Stack) this.f3045x).push(c37023z);
            abstractC36990e = c37023z.f158397y;
        }
        this.f3046y = (C37018u) abstractC36990e;
    }
}
