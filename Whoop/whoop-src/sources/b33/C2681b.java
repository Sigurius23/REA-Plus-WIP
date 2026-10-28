package b33;

import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b33.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2681b extends AbstractC2687h {

    /* JADX INFO: renamed from: a */
    public final long f10552a;

    /* JADX INFO: renamed from: b */
    public final String f10553b;

    /* JADX INFO: renamed from: c */
    public final String f10554c;

    public C2681b(long j7, String str, String coordinatorConnectId) {
        AbstractC22676k.m65750j(coordinatorConnectId, "coordinatorConnectId");
        this.f10552a = j7;
        this.f10553b = str;
        this.f10554c = coordinatorConnectId;
    }

    @Override // b33.AbstractC2687h
    /* JADX INFO: renamed from: a */
    public final long mo7577a() {
        return this.f10552a;
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
        if (!(obj instanceof C2681b)) {
            return false;
        }
        C2681b c2681b = (C2681b) obj;
        C2684e c2684e = C2684e.f10567w;
        return c2684e.equals(c2684e) && this.f10552a == c2681b.f10552a && this.f10553b.equals(c2681b.f10553b) && AbstractC22676k.m65745e(this.f10554c, c2681b.f10554c);
    }

    public final int hashCode() {
        return this.f10554c.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30451e(172965524, this.f10552a, 31), 31, this.f10553b);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("CoordinatorFlightSession(stage=");
        sb4.append(C2684e.f10567w);
        sb4.append(", startedAtMs=");
        sb4.append(this.f10552a);
        AbstractC11266d.m30444B(sb4, ", stageId=", this.f10553b, ", coordinatorConnectId=", this.f10554c);
        sb4.append(")");
        return sb4.toString();
    }
}
