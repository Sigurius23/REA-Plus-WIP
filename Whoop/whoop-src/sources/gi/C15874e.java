package gi;

import p461rh.C31430s;

/* JADX INFO: renamed from: gi.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C15874e implements InterfaceC15879j {
    @Override // gi.InterfaceC15879j
    /* JADX INFO: renamed from: a */
    public final Object mo44780a(C31430s c31430s) {
        return C15878i.f59992c;
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
        if (!(obj instanceof C15874e)) {
            return false;
        }
        C15878i c15878i = C15878i.f59992c;
        return c15878i.equals(c15878i);
    }

    public final int hashCode() {
        return C15878i.f59992c.hashCode();
    }

    public final String toString() {
        return "RealSizeResolver(size=" + C15878i.f59992c + ')';
    }
}
