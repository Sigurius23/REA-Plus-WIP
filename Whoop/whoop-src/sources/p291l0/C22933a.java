package p291l0;

import p635y2.AbstractC39071a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l0.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C22933a {

    /* JADX INFO: renamed from: a */
    public final AbstractC39071a f90534a;

    public C22933a(AbstractC39071a abstractC39071a) {
        this.f90534a = abstractC39071a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C22933a) && AbstractC22676k.m65745e(this.f90534a, ((C22933a) obj).f90534a);
    }

    public final int hashCode() {
        return this.f90534a.hashCode();
    }

    public final String toString() {
        return "Value(alignmentLine=" + this.f90534a + ')';
    }
}
