package b30;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p636y3.C39174f;

/* JADX INFO: renamed from: b30.h4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2535h4 {

    /* JADX INFO: renamed from: a */
    public final float f9843a;

    /* JADX INFO: renamed from: b */
    public final float f9844b;

    /* JADX INFO: renamed from: c */
    public final float f9845c;

    public C2535h4(float f13, float f14, float f15) {
        this.f9843a = f13;
        this.f9844b = f14;
        this.f9845c = f15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2535h4)) {
            return false;
        }
        C2535h4 c2535h4 = (C2535h4) obj;
        return C39174f.m124782b(this.f9843a, c2535h4.f9843a) && C39174f.m124782b(this.f9844b, c2535h4.f9844b) && C39174f.m124782b(this.f9845c, c2535h4.f9845c);
    }

    public final int hashCode() {
        return Float.hashCode(this.f9845c) + AbstractC11266d.m30447a(this.f9844b, Float.hashCode(this.f9843a) * 31, 31);
    }

    public final String toString() {
        return AbstractC25012a.m73376i(C39174f.m124783c(this.f9845c), ")", AbstractC11895b.m32001t("PrimaryButtonShape(cornerRadius=", C39174f.m124783c(this.f9843a), ", borderStrokeWidth=", C39174f.m124783c(this.f9844b), ", height="));
    }
}
