package androidx.compose.p018ui.input.pointer;

import p005a3.AbstractC0207h1;
import p005a3.C0241q;
import p026b2.AbstractC2316v;
import p027b3.C2365d3;
import p027b3.C2404l2;
import p031b9.AbstractC2875y;
import p510u0.AbstractC34339n0;
import p512u2.C34447a;
import p512u2.C34448a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/ui/input/pointer/StylusHoverIconModifierElement;", "La3/h1;", "Lu2/a0;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class StylusHoverIconModifierElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final C0241q f4836w;

    public StylusHoverIconModifierElement(C0241q c0241q) {
        this.f4836w = c0241q;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C34448a0(AbstractC34339n0.f144246b, this.f4836w);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StylusHoverIconModifierElement)) {
            return false;
        }
        StylusHoverIconModifierElement stylusHoverIconModifierElement = (StylusHoverIconModifierElement) obj;
        C34447a c34447a = AbstractC34339n0.f144246b;
        return c34447a.equals(c34447a) && AbstractC22676k.m65745e(this.f4836w, stylusHoverIconModifierElement.f4836w);
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(1022 * 31, 31, false);
        C0241q c0241q = this.f4836w;
        return iM8289b + (c0241q != null ? c0241q.hashCode() : 0);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "stylusHoverIcon";
        C2365d3 c2365d3 = c2404l2.f9459c;
        c2365d3.m7292c(AbstractC34339n0.f144246b, "icon");
        c2365d3.m7292c(Boolean.FALSE, "overrideDescendants");
        c2365d3.m7292c(this.f4836w, "touchBoundsExpansion");
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + AbstractC34339n0.f144246b + ", overrideDescendants=false, touchBoundsExpansion=" + this.f4836w + ')';
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C34448a0 c34448a0 = (C34448a0) abstractC2316v;
        C34447a c34447a = AbstractC34339n0.f144246b;
        if (!AbstractC22676k.m65745e(c34448a0.f144758P, c34447a)) {
            c34448a0.f144758P = c34447a;
            if (c34448a0.f144759Q) {
                c34448a0.m108925Z0();
            }
        }
        c34448a0.f144757O = this.f4836w;
    }
}
