package androidx.compose.foundation.text.input.internal;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p078d1.C11449b;
import p078d1.C11458k;
import p133f1.C13977s1;
import p268k0.AbstractC22086a;
import p510u0.C34354s0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifier;", "La3/h1;", "Ld1/k;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final /* data */ class LegacyAdaptingPlatformTextInputModifier extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final C11449b f4678w;

    /* JADX INFO: renamed from: x */
    public final C34354s0 f4679x;

    /* JADX INFO: renamed from: y */
    public final C13977s1 f4680y;

    public LegacyAdaptingPlatformTextInputModifier(C11449b c11449b, C34354s0 c34354s0, C13977s1 c13977s1) {
        this.f4678w = c11449b;
        this.f4679x = c34354s0;
        this.f4680y = c13977s1;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C11458k(this.f4678w, this.f4679x, this.f4680y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return AbstractC22676k.m65745e(this.f4678w, legacyAdaptingPlatformTextInputModifier.f4678w) && AbstractC22676k.m65745e(this.f4679x, legacyAdaptingPlatformTextInputModifier.f4679x) && AbstractC22676k.m65745e(this.f4680y, legacyAdaptingPlatformTextInputModifier.f4680y);
    }

    public final int hashCode() {
        return this.f4680y.hashCode() + ((this.f4679x.hashCode() + (this.f4678w.hashCode() * 31)) * 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f4678w + ", legacyTextFieldState=" + this.f4679x + ", textFieldSelectionManager=" + this.f4680y + ')';
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) throws Throwable {
        C11458k c11458k = (C11458k) abstractC2316v;
        if (c11458k.f9141N) {
            c11458k.f36755O.mo30719b();
            c11458k.f36755O.m30728k(c11458k);
        }
        C11449b c11449b = this.f4678w;
        c11458k.f36755O = c11449b;
        if (c11458k.f9141N) {
            if (c11449b.f36726a != null) {
                AbstractC22086a.m63160c("Expected textInputModifierNode to be null");
            }
            c11449b.f36726a = c11458k;
        }
        c11458k.f36756P = this.f4679x;
        c11458k.f36757Q = this.f4680y;
    }
}
