package p108e4;

import p027b3.AbstractC2409m2;
import p635y2.InterfaceC39095g1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: e4.j */
/* JADX INFO: loaded from: classes.dex */
public final class C12676j extends AbstractC2409m2 implements InterfaceC39095g1 {

    /* JADX INFO: renamed from: x */
    public final C12672f f43346x;

    /* JADX INFO: renamed from: y */
    public final Function1 f43347y;

    public C12676j(C12672f c12672f, Function1 function1) {
        this.f43346x = c12672f;
        this.f43347y = function1;
    }

    public final boolean equals(Object obj) {
        C12676j c12676j = obj instanceof C12676j ? (C12676j) obj : null;
        return this.f43347y == (c12676j != null ? c12676j.f43347y : null);
    }

    @Override // p635y2.InterfaceC39095g1
    /* JADX INFO: renamed from: g */
    public final Object mo11571g() {
        return new C12675i(this.f43346x, this.f43347y);
    }

    public final int hashCode() {
        return this.f43347y.hashCode();
    }
}
