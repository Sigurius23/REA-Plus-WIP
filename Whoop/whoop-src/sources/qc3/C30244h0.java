package qc3;

import sc3.AbstractC32408v;

/* JADX INFO: renamed from: qc3.h0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C30244h0 extends AbstractC32408v {

    /* JADX INFO: renamed from: e */
    public final EnumC30263o0 f123785e;

    public C30244h0(EnumC30263o0 enumC30263o0) {
        super(AbstractC30248i1.f123790b, enumC30263o0 == EnumC30263o0.f123804w ? 2 : 1, enumC30263o0 == EnumC30263o0.f123805x ? 2 : null);
        this.f123785e = enumC30263o0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C30244h0) {
            return this.f123785e == ((C30244h0) obj).f123785e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f123785e.hashCode();
    }
}
