package ja3;

import c93.InterfaceC4339a;
import java.util.LinkedHashSet;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22700c;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22704g;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22709l;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import ub3.AbstractC34756j;
import va3.C35850h;
import z93.EnumC40212c;

/* JADX INFO: renamed from: ja3.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C21527w implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f82565w;

    /* JADX INFO: renamed from: x */
    public final AbstractC21500a0 f82566x;

    public /* synthetic */ C21527w(AbstractC21500a0 abstractC21500a0, int i13) {
        this.f82565w = i13;
        this.f82566x = abstractC21500a0;
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
    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f82565w) {
            case 0:
                C22704g kindFilter = C22704g.f89363m;
                InterfaceC22712o.f89379a.getClass();
                AbstractC22676k.m65750j(kindFilter, "kindFilter");
                List list = kindFilter.f89370a;
                EnumC40212c enumC40212c = EnumC40212c.f173640z;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                boolean zM65789a = kindFilter.m65789a(C22704g.f89362l);
                AbstractC21500a0 abstractC21500a0 = this.f82566x;
                C22709l c22709l = C22709l.f89376w;
                if (zM65789a) {
                    for (C35850h c35850h : abstractC21500a0.mo60467a(kindFilter, c22709l)) {
                        c22709l.invoke(c35850h);
                        AbstractC34756j.m109751a(linkedHashSet, abstractC21500a0.getContributedClassifier(c35850h, enumC40212c));
                    }
                }
                if (kindFilter.m65789a(C22704g.f89359i) && !list.contains(C22700c.f89348a)) {
                    for (C35850h c35850h2 : abstractC21500a0.mo60468b(kindFilter, c22709l)) {
                        c22709l.invoke(c35850h2);
                        linkedHashSet.addAll(abstractC21500a0.getContributedFunctions(c35850h2, enumC40212c));
                    }
                }
                if (kindFilter.m65789a(C22704g.f89360j) && !list.contains(C22700c.f89348a)) {
                    for (C35850h c35850h3 : abstractC21500a0.mo60473h(kindFilter)) {
                        c22709l.invoke(c35850h3);
                        linkedHashSet.addAll(abstractC21500a0.getContributedVariables(c35850h3, enumC40212c));
                    }
                }
                return AbstractC25265s.m74093D1(linkedHashSet);
            case 1:
                return this.f82566x.mo60470d();
            case 2:
                return this.f82566x.mo60468b(C22704g.f89366p, null);
            case 3:
                return this.f82566x.mo60473h(C22704g.f89367q);
            default:
                return this.f82566x.mo60467a(C22704g.f89365o, null);
        }
    }
}
