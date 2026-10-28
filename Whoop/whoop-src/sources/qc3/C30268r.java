package qc3;

import sc3.AbstractC32408v;

/* JADX INFO: renamed from: qc3.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C30268r extends AbstractC32408v {

    /* JADX INFO: renamed from: e */
    public final EnumC30263o0 f123812e;

    public C30268r(EnumC30263o0 enumC30263o0) {
        super(AbstractC30281x0.f123838a, enumC30263o0 == EnumC30263o0.f123804w ? 2 : 1, enumC30263o0 == EnumC30263o0.f123805x ? 2 : null);
        this.f123812e = enumC30263o0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C30268r) {
            return this.f123812e == ((C30268r) obj).f123812e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f123812e.hashCode();
    }
}
