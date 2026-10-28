package b00;

import bz.C3705d;
import bz.C3706e;
import bz.C3707f;
import p599wz.C37718g0;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: b00.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C2179a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC38802c8 f8661a;

    /* JADX INFO: renamed from: b */
    public final boolean f8662b;

    /* JADX INFO: renamed from: c */
    public final boolean f8663c;

    /* JADX INFO: renamed from: d */
    public final boolean f8664d;

    public C2179a(InterfaceC38802c8 stripeIntent, boolean z4, boolean z13, boolean z14) {
        AbstractC22676k.m65750j(stripeIntent, "stripeIntent");
        this.f8661a = stripeIntent;
        this.f8662b = z4;
        this.f8663c = z13;
        this.f8664d = z14;
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
    /* JADX INFO: renamed from: a */
    public final boolean m6860a() {
        if (!this.f8661a.mo124338q0()) {
            Object obj = C3705d.f15155a;
            C3707f c3707f = C3707f.f15157a;
            if (c3707f.equals(obj)) {
                return false;
            }
            if (c3707f.equals(C3706e.f15156a)) {
                return true;
            }
            if (!c3707f.equals(c3707f)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return this.f8662b;
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
    /* JADX INFO: renamed from: b */
    public final boolean m6861b() {
        if (this.f8661a.mo124338q0()) {
            return m6860a();
        }
        Object obj = C3705d.f15155a;
        C3707f c3707f = C3707f.f15157a;
        if (c3707f.equals(obj)) {
            return false;
        }
        if (c3707f.equals(C3706e.f15156a)) {
            return true;
        }
        if (c3707f.equals(c3707f)) {
            return m6860a();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2179a(C37718g0 configuration) {
        this(configuration.f161636w, configuration.f161616P, configuration.f161617Q, configuration.f161618R);
        AbstractC22676k.m65750j(configuration, "configuration");
    }
}
