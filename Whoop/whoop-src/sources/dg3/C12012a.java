package dg3;

import cg3.EnumC4578c;
import cg3.InterfaceC4579d;
import ih0.AbstractC18489d0;

/* JADX INFO: renamed from: dg3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C12012a implements InterfaceC4579d {

    /* JADX INFO: renamed from: w */
    public final EnumC4578c f39742w;

    /* JADX INFO: renamed from: x */
    public final int f39743x;

    /* JADX INFO: renamed from: y */
    public final int f39744y;

    public C12012a(EnumC4578c enumC4578c, int i13, int i14) {
        this.f39742w = enumC4578c;
        this.f39743x = i13;
        this.f39744y = i14;
    }

    @Override // cg3.InterfaceC4579d
    public final int getBeginIndex() {
        return this.f39743x;
    }

    @Override // cg3.InterfaceC4579d
    public final int getEndIndex() {
        return this.f39744y;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Link{type=");
        sb4.append(this.f39742w);
        sb4.append(", beginIndex=");
        sb4.append(this.f39743x);
        sb4.append(", endIndex=");
        return AbstractC18489d0.m53371l(sb4, this.f39744y, "}");
    }
}
