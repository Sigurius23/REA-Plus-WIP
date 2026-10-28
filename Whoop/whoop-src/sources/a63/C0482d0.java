package a63;

import e63.C12775d;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: a63.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0482d0 implements InterfaceC0492i0 {

    /* JADX INFO: renamed from: a */
    public final Function3 f1635a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0492i0 f1636b;

    public C0482d0(Function3 interceptor, InterfaceC0492i0 interfaceC0492i0) {
        AbstractC22676k.m65750j(interceptor, "interceptor");
        this.f1635a = interceptor;
        this.f1636b = interfaceC0492i0;
    }

    @Override // a63.InterfaceC0492i0
    /* JADX INFO: renamed from: a */
    public final Object mo1199a(C12775d c12775d, AbstractC32269c abstractC32269c) {
        return this.f1635a.invoke(this.f1636b, c12775d, abstractC32269c);
    }
}
