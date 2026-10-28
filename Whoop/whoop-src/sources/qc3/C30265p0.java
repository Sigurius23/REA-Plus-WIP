package qc3;

import sc3.AbstractC32408v;

/* JADX INFO: renamed from: qc3.p0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C30265p0 extends AbstractC32408v {

    /* JADX INFO: renamed from: e */
    public final EnumC30263o0 f123808e;

    public C30265p0(EnumC30263o0 enumC30263o0) {
        super(AbstractC30281x0.f123840c, enumC30263o0 == EnumC30263o0.f123804w ? 2 : 1, enumC30263o0 == EnumC30263o0.f123805x ? 2 : null);
        this.f123808e = enumC30263o0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C30265p0) {
            return this.f123808e == ((C30265p0) obj).f123808e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f123808e.hashCode();
    }
}
