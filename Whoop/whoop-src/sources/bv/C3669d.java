package bv;

import p021av.AbstractC2091e;

/* JADX INFO: renamed from: bv.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C3669d extends AbstractC2091e {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f14927e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3669d(String str, int i13) {
        super(str);
        this.f14927e = i13;
    }

    @Override // p021av.AbstractC2091e
    /* JADX INFO: renamed from: e */
    public final String mo6602e() {
        switch (this.f14927e) {
            case 0:
                return "image";
            case 1:
                return "raster-array";
            case 2:
                return "raster-dem";
            case 3:
                return "raster";
            default:
                return "vector";
        }
    }
}
