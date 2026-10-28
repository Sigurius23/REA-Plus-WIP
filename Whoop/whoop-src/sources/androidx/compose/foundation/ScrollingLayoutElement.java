package androidx.compose.foundation;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p031b9.AbstractC2875y;
import p132f0.C13812o1;
import p132f0.C13821r1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/ScrollingLayoutElement;", "La3/h1;", "Lf0/o1;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class ScrollingLayoutElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final C13821r1 f4508w;

    /* JADX INFO: renamed from: x */
    public final boolean f4509x;

    public ScrollingLayoutElement(C13821r1 c13821r1, boolean z4) {
        this.f4508w = c13821r1;
        this.f4509x = z4;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C13812o1 c13812o1 = new C13812o1();
        c13812o1.f49281O = this.f4508w;
        c13812o1.f49282P = this.f4509x;
        return c13812o1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return AbstractC22676k.m65745e(this.f4508w, scrollingLayoutElement.f4508w) && this.f4509x == scrollingLayoutElement.f4509x;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4509x) + AbstractC2875y.m8289b(this.f4508w.hashCode() * 31, 31, false);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.m7401c("scroll");
        c2404l2.m7400b().m7292c(this.f4508w, "state");
        c2404l2.m7400b().m7292c(Boolean.FALSE, "reverseScrolling");
        c2404l2.m7400b().m7292c(Boolean.valueOf(this.f4509x), "isVertical");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C13812o1 c13812o1 = (C13812o1) abstractC2316v;
        c13812o1.f49281O = this.f4508w;
        c13812o1.f49282P = this.f4509x;
    }
}
