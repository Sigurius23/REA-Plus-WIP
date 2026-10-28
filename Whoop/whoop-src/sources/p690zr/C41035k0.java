package p690zr;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p108e4.AbstractC12682p;
import p658yr.InterfaceC39719f;

/* JADX INFO: renamed from: zr.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C41035k0 extends AbstractC41036k1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f177010E;

    /* JADX INFO: renamed from: w */
    public int f177011w;

    /* JADX INFO: renamed from: x */
    public Object f177012x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f177013y;

    /* JADX INFO: renamed from: z */
    public final Iterator f177014z;

    public C41035k0() {
        this.f177011w = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        int i13 = this.f177011w;
        if (i13 == 4) {
            throw new IllegalStateException();
        }
        int iM35485e = AbstractC12682p.m35485e(i13);
        if (iM35485e == 0) {
            return true;
        }
        if (iM35485e == 2) {
            return false;
        }
        this.f177011w = 4;
        switch (this.f177013y) {
            case 0:
                do {
                    Iterator it = this.f177014z;
                    if (!it.hasNext()) {
                        this.f177011w = 3;
                        next = null;
                    } else {
                        next = it.next();
                    }
                    break;
                } while (!((InterfaceC39719f) this.f177010E).apply(next));
                break;
            default:
                do {
                    Iterator it3 = this.f177014z;
                    if (!it3.hasNext()) {
                        this.f177011w = 3;
                        next = null;
                    } else {
                        next = it3.next();
                    }
                    break;
                } while (!((C41018e1) this.f177010E).f176990x.contains(next));
                break;
        }
        this.f177012x = next;
        if (this.f177011w == 3) {
            return false;
        }
        this.f177011w = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f177011w = 2;
        Object obj = this.f177012x;
        this.f177012x = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41035k0(Iterator it, InterfaceC39719f interfaceC39719f) {
        this();
        this.f177013y = 0;
        this.f177014z = it;
        this.f177010E = interfaceC39719f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41035k0(C41018e1 c41018e1) {
        this();
        this.f177013y = 1;
        this.f177010E = c41018e1;
        this.f177014z = c41018e1.f176989w.iterator();
    }
}
