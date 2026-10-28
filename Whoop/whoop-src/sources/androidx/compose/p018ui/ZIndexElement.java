package androidx.compose.p018ui;

import p000.AbstractC30802r;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p026b2.C2295a0;
import p027b3.C2404l2;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/ui/ZIndexElement;", "La3/h1;", "Lb2/a0;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class ZIndexElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final float f4773w;

    public ZIndexElement(float f13) {
        this.f4773w = f13;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C2295a0 c2295a0 = new C2295a0();
        c2295a0.f9096O = this.f4773w;
        return c2295a0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.f4773w, ((ZIndexElement) obj).f4773w) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4773w);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "zIndex";
        c2404l2.f9459c.m7292c(Float.valueOf(this.f4773w), "zIndex");
    }

    public final String toString() {
        return AbstractC30802r.m94763l(new StringBuilder("ZIndexElement(zIndex="), this.f4773w, ')');
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        ((C2295a0) abstractC2316v).f9096O = this.f4773w;
    }
}
