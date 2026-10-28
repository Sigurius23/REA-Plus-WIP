package androidx.compose.animation;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p026b2.C2299e;
import p026b2.C2307m;
import p027b3.C2404l2;
import p040c0.C3772q1;
import p077d0.InterfaceC11337c0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/animation/SizeAnimationModifierElement;", "La3/h1;", "Lc0/q1;", "animation"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final /* data */ class SizeAnimationModifierElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC11337c0 f4471w;

    public SizeAnimationModifierElement(InterfaceC11337c0 interfaceC11337c0) {
        this.f4471w = interfaceC11337c0;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C3772q1(this.f4471w);
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
        if (!(obj instanceof SizeAnimationModifierElement) || !AbstractC22676k.m65745e(this.f4471w, ((SizeAnimationModifierElement) obj).f4471w)) {
            return false;
        }
        C2307m c2307m = C2299e.f9114w;
        return c2307m.equals(c2307m);
    }

    public final int hashCode() {
        return (Float.hashCode(-1.0f) + (Float.hashCode(-1.0f) * 31) + (this.f4471w.hashCode() * 31)) * 31;
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.m7401c("animateContentSize");
        c2404l2.m7400b().m7292c(this.f4471w, "animationSpec");
        c2404l2.m7400b().m7292c(C2299e.f9114w, "alignment");
        c2404l2.m7400b().m7292c(null, "finishedListener");
    }

    public final String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.f4471w + ", alignment=" + C2299e.f9114w + ", finishedListener=null)";
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        ((C3772q1) abstractC2316v).f15396P = this.f4471w;
    }
}
