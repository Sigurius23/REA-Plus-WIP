package qc3;

import sc3.AbstractC32408v;

/* JADX INFO: renamed from: qc3.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C30264p extends AbstractC32408v {

    /* JADX INFO: renamed from: e */
    public final EnumC30263o0 f123807e;

    public C30264p(EnumC30263o0 enumC30263o0) {
        super(AbstractC30252k.f123794a, enumC30263o0 == EnumC30263o0.f123804w ? 2 : 1, enumC30263o0 == EnumC30263o0.f123805x ? 2 : null);
        this.f123807e = enumC30263o0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C30264p) {
            return this.f123807e == ((C30264p) obj).f123807e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f123807e.hashCode();
    }
}
