package m83;

import d93.InterfaceC11820a;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import p002a0.C0030i1;
import p511u1.AbstractC34409p;
import p511u1.C34398e;
import p511u1.C34399f;
import p511u1.C34412s;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;

/* JADX INFO: renamed from: m83.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C25266t implements Iterator, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f99159w = 0;

    /* JADX INFO: renamed from: x */
    public final Object f99160x;

    public C25266t(Enumeration enumeration) {
        this.f99160x = enumeration;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f99159w) {
            case 0:
                return ((Enumeration) this.f99160x).hasMoreElements();
            case 1:
                return ((C34399f) this.f99160x).f144606y;
            default:
                return ((C0030i1) this.f99160x).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f99159w) {
            case 0:
                return ((Enumeration) this.f99160x).nextElement();
            case 1:
                return (Map.Entry) ((C34399f) this.f99160x).next();
            default:
                return ((C0030i1) this.f99160x).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f99159w) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                ((C34399f) this.f99160x).remove();
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C25266t(Object[] array) {
        AbstractC22676k.m65750j(array, "array");
        this.f99160x = AbstractC22681m0.m65777h(array);
    }

    public C25266t(C34398e c34398e) {
        AbstractC34409p[] abstractC34409pArr = new AbstractC34409p[8];
        for (int i13 = 0; i13 < 8; i13++) {
            abstractC34409pArr[i13] = new C34412s(this);
        }
        this.f99160x = new C34399f(c34398e, abstractC34409pArr);
    }
}
