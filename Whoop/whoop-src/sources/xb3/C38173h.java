package xb3;

import c93.InterfaceC4339a;
import d93.InterfaceC11820a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import x83.C38091h;

/* JADX INFO: renamed from: xb3.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C38173h implements Iterator, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public Object f163476w;

    /* JADX INFO: renamed from: x */
    public int f163477x = -2;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C38091h f163478y;

    public C38173h(C38091h c38091h) {
        this.f163478y = c38091h;
    }

    /* JADX INFO: renamed from: a */
    public final void m122269a() {
        Object objInvoke;
        int i13 = this.f163477x;
        C38091h c38091h = this.f163478y;
        if (i13 == -2) {
            objInvoke = ((InterfaceC4339a) c38091h.f163138b).invoke();
        } else {
            Function1 function1 = (Function1) c38091h.f163139c;
            Object obj = this.f163476w;
            AbstractC22676k.m65747g(obj);
            objInvoke = function1.invoke(obj);
        }
        this.f163476w = objInvoke;
        this.f163477x = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f163477x < 0) {
            m122269a();
        }
        return this.f163477x == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f163477x < 0) {
            m122269a();
        }
        if (this.f163477x == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f163476w;
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f163477x = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
