package androidx.compose.foundation.layout;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p291l0.C23015y1;
import p636y3.C39174f;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;", "La3/h1;", "Ll0/y1;", "foundation-layout"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class UnspecifiedConstraintsElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final float f4574w;

    /* JADX INFO: renamed from: x */
    public final float f4575x;

    public UnspecifiedConstraintsElement(float f13, float f14) {
        this.f4574w = f13;
        this.f4575x = f14;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C23015y1 c23015y1 = new C23015y1();
        c23015y1.f90755O = this.f4574w;
        c23015y1.f90756P = this.f4575x;
        return c23015y1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return C39174f.m124782b(this.f4574w, unspecifiedConstraintsElement.f4574w) && C39174f.m124782b(this.f4575x, unspecifiedConstraintsElement.f4575x);
    }

    public final int hashCode() {
        return Float.hashCode(this.f4575x) + (Float.hashCode(this.f4574w) * 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.m7401c("defaultMinSize");
        c2404l2.m7400b().m7292c(new C39174f(this.f4574w), "minWidth");
        c2404l2.m7400b().m7292c(new C39174f(this.f4575x), "minHeight");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C23015y1 c23015y1 = (C23015y1) abstractC2316v;
        c23015y1.f90755O = this.f4574w;
        c23015y1.f90756P = this.f4575x;
    }
}
