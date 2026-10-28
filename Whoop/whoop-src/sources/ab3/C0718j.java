package ab3;

import l83.C23454a0;
import lb3.AbstractC23811y;
import nb3.C26555l;
import nb3.EnumC26554k;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31109b0;

/* JADX INFO: renamed from: ab3.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C0718j extends AbstractC0715g {

    /* JADX INFO: renamed from: b */
    public final String f2699b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0718j(String message) {
        super(C23454a0.f92919a);
        AbstractC22676k.m65750j(message, "message");
        this.f2699b = message;
    }

    @Override // ab3.AbstractC0715g
    /* JADX INFO: renamed from: a */
    public final AbstractC23811y mo1776a(InterfaceC31109b0 module) {
        AbstractC22676k.m65750j(module, "module");
        return C26555l.m78682c(EnumC26554k.ERROR_CONSTANT_VALUE, this.f2699b);
    }

    @Override // ab3.AbstractC0715g
    /* JADX INFO: renamed from: b */
    public final Object mo1777b() {
        throw new UnsupportedOperationException();
    }

    @Override // ab3.AbstractC0715g
    public final String toString() {
        return this.f2699b;
    }
}
