package qc3;

import sc3.AbstractC32408v;

/* JADX INFO: renamed from: qc3.b1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C30227b1 extends AbstractC32408v {

    /* JADX INFO: renamed from: e */
    public final EnumC30263o0 f123766e;

    public C30227b1(EnumC30263o0 enumC30263o0) {
        super(AbstractC30261n0.f123802b, enumC30263o0 == EnumC30263o0.f123804w ? 2 : 1, enumC30263o0 == EnumC30263o0.f123805x ? 2 : null);
        this.f123766e = enumC30263o0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C30227b1) {
            return this.f123766e == ((C30227b1) obj).f123766e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f123766e.hashCode();
    }
}
