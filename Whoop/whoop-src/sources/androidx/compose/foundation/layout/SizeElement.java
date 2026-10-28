package androidx.compose.foundation.layout;

import p000.AbstractC11266d;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p027b3.C2431r;
import p291l0.C23006v1;
import p636y3.C39174f;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "La3/h1;", "Ll0/v1;", "foundation-layout"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class SizeElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: E */
    public final boolean f4568E;

    /* JADX INFO: renamed from: F */
    public final C2431r f4569F;

    /* JADX INFO: renamed from: w */
    public final float f4570w;

    /* JADX INFO: renamed from: x */
    public final float f4571x;

    /* JADX INFO: renamed from: y */
    public final float f4572y;

    /* JADX INFO: renamed from: z */
    public final float f4573z;

    public SizeElement(float f13, float f14, float f15, float f16, boolean z4) {
        C2431r c2431r = C2431r.f9521F;
        this.f4570w = f13;
        this.f4571x = f14;
        this.f4572y = f15;
        this.f4573z = f16;
        this.f4568E = z4;
        this.f4569F = c2431r;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C23006v1 c23006v1 = new C23006v1();
        c23006v1.f90734O = this.f4570w;
        c23006v1.f90735P = this.f4571x;
        c23006v1.f90736Q = this.f4572y;
        c23006v1.f90737R = this.f4573z;
        c23006v1.f90738S = this.f4568E;
        return c23006v1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return C39174f.m124782b(this.f4570w, sizeElement.f4570w) && C39174f.m124782b(this.f4571x, sizeElement.f4571x) && C39174f.m124782b(this.f4572y, sizeElement.f4572y) && C39174f.m124782b(this.f4573z, sizeElement.f4573z) && this.f4568E == sizeElement.f4568E;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4568E) + AbstractC11266d.m30447a(this.f4573z, AbstractC11266d.m30447a(this.f4572y, AbstractC11266d.m30447a(this.f4571x, Float.hashCode(this.f4570w) * 31, 31), 31), 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        this.f4569F.getClass();
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C23006v1 c23006v1 = (C23006v1) abstractC2316v;
        c23006v1.f90734O = this.f4570w;
        c23006v1.f90735P = this.f4571x;
        c23006v1.f90736Q = this.f4572y;
        c23006v1.f90737R = this.f4573z;
        c23006v1.f90738S = this.f4568E;
    }

    public /* synthetic */ SizeElement(float f13, float f14, float f15, float f16, int i13, boolean z4) {
        this((i13 & 1) != 0 ? Float.NaN : f13, (i13 & 2) != 0 ? Float.NaN : f14, (i13 & 4) != 0 ? Float.NaN : f15, (i13 & 8) != 0 ? Float.NaN : f16, z4);
    }
}
