package androidx.compose.foundation.layout;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p291l0.C22947d1;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/layout/LayoutWeightElement;", "La3/h1;", "Ll0/d1;", "foundation-layout"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class LayoutWeightElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final float f4552w;

    /* JADX INFO: renamed from: x */
    public final boolean f4553x;

    public LayoutWeightElement(float f13, boolean z4) {
        this.f4552w = f13;
        this.f4553x = z4;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C22947d1 c22947d1 = new C22947d1();
        c22947d1.f90578O = this.f4552w;
        c22947d1.f90579P = this.f4553x;
        return c22947d1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.f4552w == layoutWeightElement.f4552w && this.f4553x == layoutWeightElement.f4553x;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4553x) + (Float.hashCode(this.f4552w) * 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.m7401c("weight");
        float f13 = this.f4552w;
        c2404l2.m7402d(Float.valueOf(f13));
        c2404l2.m7400b().m7292c(Float.valueOf(f13), "weight");
        c2404l2.m7400b().m7292c(Boolean.valueOf(this.f4553x), "fill");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C22947d1 c22947d1 = (C22947d1) abstractC2316v;
        c22947d1.f90578O = this.f4552w;
        c22947d1.f90579P = this.f4553x;
    }
}
