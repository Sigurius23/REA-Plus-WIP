package p148fg;

import eg.C13165n;
import gg.EnumC15819f;
import l83.C23454a0;
import p437qt.C30582e;
import p505ts.AbstractC34132o;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: fg.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C14447q {

    /* JADX INFO: renamed from: a */
    public final int f52727a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C14451u f52728b;

    public C14447q(C14451u c14451u, int i13) {
        this.f52728b = c14451u;
        this.f52727a = i13;
    }

    /* JADX INFO: renamed from: a */
    public final Object m41168a(C13165n c13165n) {
        Object objM41170a = C14451u.m41170a(this.f52728b, this.f52727a, c13165n);
        return objM41170a == EnumC31071a.f128113w ? objM41170a : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    public final Object m41169b(EnumC15819f enumC15819f, AbstractC32269c abstractC32269c) {
        C14446p c14446p;
        int i13;
        C14451u c14451u = this.f52728b;
        C30582e c30582e = c14451u.f52743a;
        if (abstractC32269c instanceof C14446p) {
            c14446p = (C14446p) abstractC32269c;
            int i14 = c14446p.f52726z;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c14446p.f52726z = i14 - Integer.MIN_VALUE;
            } else {
                c14446p = new C14446p(this, abstractC32269c);
            }
        } else {
            c14446p = new C14446p(this, abstractC32269c);
        }
        Object obj = c14446p.f52724x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c14446p.f52726z;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            int iOrdinal = enumC15819f.ordinal();
            if (iOrdinal == 2 || iOrdinal == 3) {
                c30582e.getClass();
                i13 = 10;
            } else {
                c30582e.getClass();
                i13 = 5;
            }
            c14446p.f52723w = i13;
            c14446p.f52726z = 1;
            if (c14451u.m41172c(i13, c14446p) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = c14446p.f52723w;
            AbstractC34132o.m107864I(obj);
        }
        return new C14447q(c14451u, i13);
    }
}
