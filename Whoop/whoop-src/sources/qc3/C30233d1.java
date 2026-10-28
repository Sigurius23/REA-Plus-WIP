package qc3;

import sc3.AbstractC32408v;

/* JADX INFO: renamed from: qc3.d1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C30233d1 extends AbstractC32408v {

    /* JADX INFO: renamed from: e */
    public final EnumC30263o0 f123771e;

    public C30233d1(EnumC30263o0 enumC30263o0) {
        super(AbstractC30261n0.f123801a, enumC30263o0 == EnumC30263o0.f123804w ? 2 : 1, enumC30263o0 == EnumC30263o0.f123805x ? 2 : null);
        this.f123771e = enumC30263o0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C30233d1) {
            return this.f123771e == ((C30233d1) obj).f123771e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f123771e.hashCode();
    }
}
