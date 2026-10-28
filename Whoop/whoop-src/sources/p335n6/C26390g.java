package p335n6;

import c93.InterfaceC4351m;
import ov2.C28402f;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p719m22.C24947b;

/* JADX INFO: renamed from: n6.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C26390g implements InterfaceC26398o {

    /* JADX INFO: renamed from: a */
    public final InterfaceC26398o f104838a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC26398o f104839b;

    public C26390g(InterfaceC26398o interfaceC26398o, InterfaceC26398o interfaceC26398o2) {
        this.f104838a = interfaceC26398o;
        this.f104839b = interfaceC26398o2;
    }

    @Override // p335n6.InterfaceC26398o
    /* JADX INFO: renamed from: a */
    public final Object mo78097a(Object obj, InterfaceC4351m interfaceC4351m) {
        return this.f104839b.mo78097a(this.f104838a.mo78097a(obj, interfaceC4351m), interfaceC4351m);
    }

    @Override // p335n6.InterfaceC26398o
    /* JADX INFO: renamed from: b */
    public final boolean mo78098b(C28402f c28402f) {
        return this.f104838a.mo78098b(c28402f) && this.f104839b.mo78098b(c28402f);
    }

    @Override // p335n6.InterfaceC26398o
    /* JADX INFO: renamed from: c */
    public final boolean mo78099c(Function1 function1) {
        return this.f104838a.mo78099c(function1) || this.f104839b.mo78099c(function1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C26390g)) {
            return false;
        }
        C26390g c26390g = (C26390g) obj;
        return AbstractC22676k.m65745e(this.f104838a, c26390g.f104838a) && AbstractC22676k.m65745e(this.f104839b, c26390g.f104839b);
    }

    public final int hashCode() {
        return (this.f104839b.hashCode() * 31) + this.f104838a.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("["), (String) mo78097a("", new C24947b(7)), ']');
    }
}
