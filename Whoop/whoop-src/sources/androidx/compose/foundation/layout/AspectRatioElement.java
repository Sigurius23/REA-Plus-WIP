package androidx.compose.foundation.layout;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p291l0.C22980n;
import p315m0.AbstractC24868a;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/layout/AspectRatioElement;", "La3/h1;", "Ll0/n;", "foundation-layout"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class AspectRatioElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final float f4542w;

    /* JADX INFO: renamed from: x */
    public final boolean f4543x;

    public AspectRatioElement(float f13, boolean z4) {
        this.f4542w = f13;
        this.f4543x = z4;
        if (f13 > 0.0f) {
            return;
        }
        AbstractC24868a.m72899a("aspectRatio " + f13 + " must be > 0");
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C22980n c22980n = new C22980n();
        c22980n.f90668O = this.f4542w;
        c22980n.f90669P = this.f4543x;
        return c22980n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        if (aspectRatioElement != null && this.f4542w == aspectRatioElement.f4542w) {
            return this.f4543x == ((AspectRatioElement) obj).f4543x;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4543x) + (Float.hashCode(this.f4542w) * 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C22980n c22980n = (C22980n) abstractC2316v;
        c22980n.f90668O = this.f4542w;
        c22980n.f90669P = this.f4543x;
    }
}
