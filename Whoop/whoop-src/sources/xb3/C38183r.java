package xb3;

import d93.InterfaceC11820a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: xb3.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C38183r implements Iterator, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final Iterator f163494w;

    /* JADX INFO: renamed from: x */
    public int f163495x = -1;

    /* JADX INFO: renamed from: y */
    public Object f163496y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C38180o f163497z;

    public C38183r(C38180o c38180o) {
        this.f163497z = c38180o;
        this.f163494w = c38180o.f163487b.iterator();
    }

    /* JADX INFO: renamed from: a */
    public final void m122291a() {
        Iterator it = this.f163494w;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((Function1) this.f163497z.f163488c).invoke(next)).booleanValue()) {
                this.f163495x = 1;
                this.f163496y = next;
                return;
            }
        }
        this.f163495x = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f163495x == -1) {
            m122291a();
        }
        return this.f163495x == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f163495x == -1) {
            m122291a();
        }
        if (this.f163495x == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f163496y;
        this.f163496y = null;
        this.f163495x = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
