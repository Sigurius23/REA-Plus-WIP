package qc3;

import sc3.AbstractC32408v;

/* JADX INFO: renamed from: qc3.g0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C30241g0 extends AbstractC32408v {

    /* JADX INFO: renamed from: e */
    public final EnumC30263o0 f123782e;

    public C30241g0(EnumC30263o0 enumC30263o0) {
        super(AbstractC30281x0.f123839b, enumC30263o0 == EnumC30263o0.f123804w ? 2 : 1, enumC30263o0 == EnumC30263o0.f123805x ? 2 : null);
        this.f123782e = enumC30263o0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C30241g0) {
            return this.f123782e == ((C30241g0) obj).f123782e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f123782e.hashCode();
    }
}
