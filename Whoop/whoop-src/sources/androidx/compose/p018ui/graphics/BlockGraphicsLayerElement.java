package androidx.compose.p018ui.graphics;

import androidx.compose.p018ui.node.NodeCoordinator;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p208i2.C17905q;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;", "La3/h1;", "Li2/q;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class BlockGraphicsLayerElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final Function1 f4797w;

    public BlockGraphicsLayerElement(Function1 function1) {
        this.f4797w = function1;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C17905q(this.f4797w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BlockGraphicsLayerElement) {
            return this.f4797w == ((BlockGraphicsLayerElement) obj).f4797w;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4797w.hashCode();
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.m7401c("graphicsLayer");
        c2404l2.m7400b().m7292c(this.f4797w, "block");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C17905q c17905q = (C17905q) abstractC2316v;
        c17905q.f69606O = this.f4797w;
        NodeCoordinator nodeCoordinator = AbstractC0201g.m514n(c17905q, 2).f4859P;
        if (nodeCoordinator != null) {
            nodeCoordinator.m3512F1(c17905q.f69606O, true);
        }
    }
}
