package androidx.compose.p018ui.layout;

import android.annotation.SuppressLint;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0207h1;
import p005a3.C0230n0;
import p026b2.AbstractC2316v;
import p635y2.C39119o1;
import p635y2.RunnableC39123q;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/ui/layout/RulerProviderModifierElement;", "La3/h1;", "Ly2/o1;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
@SuppressLint({"ModifierNodeInspectableProperties"})
final class RulerProviderModifierElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final RunnableC39123q f4849w;

    public RulerProviderModifierElement(RunnableC39123q runnableC39123q) {
        this.f4849w = runnableC39123q;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C39119o1(this.f4849w);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        RulerProviderModifierElement rulerProviderModifierElement = obj instanceof RulerProviderModifierElement ? (RulerProviderModifierElement) obj : null;
        return (rulerProviderModifierElement != null ? rulerProviderModifierElement.f4849w : null) == this.f4849w;
    }

    public final int hashCode() {
        return this.f4849w.hashCode();
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C39119o1 c39119o1 = (C39119o1) abstractC2316v;
        RunnableC39123q runnableC39123q = c39119o1.f168249O;
        RunnableC39123q runnableC39123q2 = this.f4849w;
        if (runnableC39123q != runnableC39123q2) {
            c39119o1.f168249O = runnableC39123q2;
            C0230n0.m575v0(AbstractC0201g.m516p(c39119o1), false, 7);
        }
    }
}
