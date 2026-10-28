package p108e4;

import p635y2.InterfaceC39072a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: e4.i */
/* JADX INFO: loaded from: classes.dex */
public final class C12675i implements InterfaceC39072a0 {

    /* JADX INFO: renamed from: w */
    public final C12672f f43343w;

    /* JADX INFO: renamed from: x */
    public final Function1 f43344x;

    /* JADX INFO: renamed from: y */
    public final Object f43345y;

    public C12675i(C12672f c12672f, Function1 function1) {
        this.f43343w = c12672f;
        this.f43344x = function1;
        this.f43345y = c12672f.f43332c;
    }

    @Override // p635y2.InterfaceC39072a0
    /* JADX INFO: renamed from: T */
    public final Object mo35475T() {
        return this.f43345y;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12675i)) {
            return false;
        }
        C12675i c12675i = (C12675i) obj;
        return AbstractC22676k.m65745e(this.f43343w.f43332c, c12675i.f43343w.f43332c) && this.f43344x == c12675i.f43344x;
    }

    public final int hashCode() {
        return this.f43344x.hashCode() + (this.f43343w.f43332c.hashCode() * 31);
    }
}
