package xb3;

import d93.InterfaceC11820a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;

/* JADX INFO: renamed from: xb3.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C38175j implements Iterator, InterfaceC30057d, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public int f163479w;

    /* JADX INFO: renamed from: x */
    public Object f163480x;

    /* JADX INFO: renamed from: y */
    public Iterator f163481y;

    /* JADX INFO: renamed from: z */
    public InterfaceC30057d f163482z;

    /* JADX INFO: renamed from: a */
    public final RuntimeException m122270a() {
        int i13 = this.f163479w;
        if (i13 == 4) {
            return new NoSuchElementException();
        }
        if (i13 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f163479w);
    }

    /* JADX INFO: renamed from: b */
    public final void m122271b(Object obj, InterfaceC30057d frame) {
        this.f163480x = obj;
        this.f163479w = 3;
        this.f163482z = frame;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC22676k.m65750j(frame, "frame");
    }

    @Override // q83.InterfaceC30057d
    public final InterfaceC30063j getContext() {
        return C30064k.f122676w;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i13 = this.f163479w;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 == 2 || i13 == 3) {
                        return true;
                    }
                    if (i13 == 4) {
                        return false;
                    }
                    throw m122270a();
                }
                Iterator it = this.f163481y;
                AbstractC22676k.m65747g(it);
                if (it.hasNext()) {
                    this.f163479w = 2;
                    return true;
                }
                this.f163481y = null;
            }
            this.f163479w = 5;
            InterfaceC30057d interfaceC30057d = this.f163482z;
            AbstractC22676k.m65747g(interfaceC30057d);
            this.f163482z = null;
            interfaceC30057d.resumeWith(C23454a0.f92919a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i13 = this.f163479w;
        if (i13 == 0 || i13 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i13 == 2) {
            this.f163479w = 1;
            Iterator it = this.f163481y;
            AbstractC22676k.m65747g(it);
            return it.next();
        }
        if (i13 != 3) {
            throw m122270a();
        }
        this.f163479w = 0;
        Object obj = this.f163480x;
        this.f163480x = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // q83.InterfaceC30057d
    public final void resumeWith(Object obj) {
        AbstractC34132o.m107864I(obj);
        this.f163479w = 4;
    }
}
