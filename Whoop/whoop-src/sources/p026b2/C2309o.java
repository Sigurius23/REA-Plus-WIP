package p026b2;

import androidx.compose.p018ui.Modifier;
import c93.InterfaceC4351m;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b2.o */
/* JADX INFO: loaded from: classes.dex */
public final class C2309o implements Modifier {

    /* JADX INFO: renamed from: w */
    public final Modifier f9124w;

    /* JADX INFO: renamed from: x */
    public final Modifier f9125x;

    public C2309o(Modifier modifier, Modifier modifier2) {
        this.f9124w = modifier;
        this.f9125x = modifier2;
    }

    @Override // androidx.compose.p018ui.Modifier
    /* JADX INFO: renamed from: a */
    public final Object mo3469a(Object obj, InterfaceC4351m interfaceC4351m) {
        return this.f9125x.mo3469a(this.f9124w.mo3469a(obj, interfaceC4351m), interfaceC4351m);
    }

    @Override // androidx.compose.p018ui.Modifier
    /* JADX INFO: renamed from: c */
    public final boolean mo3470c(Function1 function1) {
        return this.f9124w.mo3470c(function1) && this.f9125x.mo3470c(function1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2309o)) {
            return false;
        }
        C2309o c2309o = (C2309o) obj;
        return AbstractC22676k.m65745e(this.f9124w, c2309o.f9124w) && AbstractC22676k.m65745e(this.f9125x, c2309o.f9125x);
    }

    public final int hashCode() {
        return (this.f9125x.hashCode() * 31) + this.f9124w.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("["), (String) mo3469a("", C2308n.f9123w), ']');
    }
}
