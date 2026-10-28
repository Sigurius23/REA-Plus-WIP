package androidx.compose.foundation.layout;

import p000.AbstractC11266d;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p291l0.C22970j1;
import p315m0.AbstractC24868a;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "La3/h1;", "Ll0/j1;", "foundation-layout"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class PaddingElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: E */
    public final Function1 f4561E;

    /* JADX INFO: renamed from: w */
    public final float f4562w;

    /* JADX INFO: renamed from: x */
    public final float f4563x;

    /* JADX INFO: renamed from: y */
    public final float f4564y;

    /* JADX INFO: renamed from: z */
    public final float f4565z;

    public PaddingElement(float f13, float f14, float f15, float f16, Function1 function1) {
        this.f4562w = f13;
        this.f4563x = f14;
        this.f4564y = f15;
        this.f4565z = f16;
        this.f4561E = function1;
        boolean z4 = true;
        boolean z13 = (f13 >= 0.0f || Float.isNaN(f13)) & (f14 >= 0.0f || Float.isNaN(f14)) & (f15 >= 0.0f || Float.isNaN(f15));
        if (f16 < 0.0f && !Float.isNaN(f16)) {
            z4 = false;
        }
        if (!z13 || !z4) {
            AbstractC24868a.m72899a("Padding must be non-negative");
        }
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C22970j1 c22970j1 = new C22970j1();
        c22970j1.f90630O = this.f4562w;
        c22970j1.f90631P = this.f4563x;
        c22970j1.f90632Q = this.f4564y;
        c22970j1.f90633R = this.f4565z;
        c22970j1.f90634S = true;
        return c22970j1;
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && C39174f.m124782b(this.f4562w, paddingElement.f4562w) && C39174f.m124782b(this.f4563x, paddingElement.f4563x) && C39174f.m124782b(this.f4564y, paddingElement.f4564y) && C39174f.m124782b(this.f4565z, paddingElement.f4565z);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC11266d.m30447a(this.f4565z, AbstractC11266d.m30447a(this.f4564y, AbstractC11266d.m30447a(this.f4563x, Float.hashCode(this.f4562w) * 31, 31), 31), 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        this.f4561E.invoke(c2404l2);
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C22970j1 c22970j1 = (C22970j1) abstractC2316v;
        c22970j1.f90630O = this.f4562w;
        c22970j1.f90631P = this.f4563x;
        c22970j1.f90632Q = this.f4564y;
        c22970j1.f90633R = this.f4565z;
        c22970j1.f90634S = true;
    }
}
