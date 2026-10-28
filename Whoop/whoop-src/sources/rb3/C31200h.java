package rb3;

import cb3.AbstractC4393e;
import fb3.C14342c;
import fb3.InterfaceC14343d;
import hg3.AbstractC17269i;
import io.sentry.config.AbstractC20301a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jb3.C21561u;
import lb3.AbstractC23763c0;
import lb3.AbstractC23773f1;
import lb3.AbstractC23811y;
import m83.AbstractC25265s;
import mb3.InterfaceC25387d;
import o93.AbstractC27736h;
import o93.AbstractC27741m;
import o93.EnumC27738j;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31107a1;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import r93.InterfaceC31135k;
import r93.InterfaceC31151q0;
import r93.InterfaceC31162w;
import r93.InterfaceC31163w0;
import u93.AbstractC34670d;
import u93.AbstractC34690n;
import u93.AbstractC34711x0;
import u93.C34709w0;
import va3.C35845c;
import va3.C35850h;
import xa3.C38148i;
import ya3.AbstractC39365h;

/* JADX INFO: renamed from: rb3.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C31200h implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f128534w;

    /* JADX INFO: renamed from: x */
    public static final C31200h f128531x = new C31200h(0);

    /* JADX INFO: renamed from: y */
    public static final C31200h f128532y = new C31200h(1);

    /* JADX INFO: renamed from: z */
    public static final C31200h f128533z = new C31200h(2);

    /* JADX INFO: renamed from: E */
    public static final C31200h f128525E = new C31200h(3);

    /* JADX INFO: renamed from: F */
    public static final C31200h f128526F = new C31200h(4);

    /* JADX INFO: renamed from: G */
    public static final C31200h f128527G = new C31200h(5);

    /* JADX INFO: renamed from: H */
    public static final C31200h f128528H = new C31200h(6);

    /* JADX INFO: renamed from: I */
    public static final C31200h f128529I = new C31200h(7);

    /* JADX INFO: renamed from: J */
    public static final C31200h f128530J = new C31200h(8);

    public /* synthetic */ C31200h(int i13) {
        this.f128534w = i13;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC23763c0 abstractC23763c0Mo60594i;
        AbstractC23773f1 abstractC23773f1M56322U;
        AbstractC23811y returnType;
        C35845c c35845cM13808f;
        AbstractC23811y returnType2;
        boolean zM74525b;
        boolean z4 = true;
        switch (this.f128534w) {
            case 0:
                AbstractC22676k.m65750j((InterfaceC31162w) obj, "<this>");
                return null;
            case 1:
                AbstractC22676k.m65750j((InterfaceC31162w) obj, "<this>");
                return null;
            case 2:
                AbstractC22676k.m65750j((InterfaceC31162w) obj, "<this>");
                return null;
            case 3:
                InterfaceC31162w Checks = (InterfaceC31162w) obj;
                List list = AbstractC31210r.f128555d;
                AbstractC22676k.m65750j(Checks, "$this$Checks");
                List listMo78676v = Checks.mo78676v();
                AbstractC22676k.m65749i(listMo78676v, "getValueParameters(...)");
                InterfaceC31107a1 interfaceC31107a1 = (InterfaceC31107a1) AbstractC25265s.m74114R0(listMo78676v);
                if (interfaceC31107a1 == null || AbstractC4393e.m13803a(interfaceC31107a1) || ((C34709w0) interfaceC31107a1).f146190K != null) {
                    return "last parameter should not have a default value or be a vararg";
                }
                return null;
            case 4:
                InterfaceC31162w Checks2 = (InterfaceC31162w) obj;
                List list2 = AbstractC31210r.f128555d;
                AbstractC22676k.m65750j(Checks2, "$this$Checks");
                InterfaceC31135k interfaceC31135kMo60581g = Checks2.mo60581g();
                AbstractC22676k.m65749i(interfaceC31135kMo60581g, "getContainingDeclaration(...)");
                if (interfaceC31135kMo60581g instanceof InterfaceC31117e) {
                    C35850h c35850h = AbstractC27736h.f111789e;
                    if (AbstractC27736h.m83810b((InterfaceC31117e) interfaceC31135kMo60581g, AbstractC27741m.f111843a)) {
                        return null;
                    }
                }
                Collection collectionMo78673h = Checks2.mo78673h();
                AbstractC22676k.m65749i(collectionMo78673h, "getOverriddenDescriptors(...)");
                Collection collection = collectionMo78673h;
                if (!collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        InterfaceC31135k interfaceC31135kMo60581g2 = ((InterfaceC31162w) it.next()).mo60581g();
                        AbstractC22676k.m65749i(interfaceC31135kMo60581g2, "getContainingDeclaration(...)");
                        if (interfaceC31135kMo60581g2 instanceof InterfaceC31117e) {
                            C35850h c35850h2 = AbstractC27736h.f111789e;
                            if (AbstractC27736h.m83810b((InterfaceC31117e) interfaceC31135kMo60581g2, AbstractC27741m.f111843a)) {
                                return null;
                            }
                        }
                    }
                }
                InterfaceC31135k interfaceC31135kMo60581g3 = Checks2.mo60581g();
                InterfaceC31117e interfaceC31117e = interfaceC31135kMo60581g3 instanceof InterfaceC31117e ? (InterfaceC31117e) interfaceC31135kMo60581g3 : null;
                if (interfaceC31117e != null) {
                    if (!AbstractC39365h.m125541e(interfaceC31117e)) {
                        interfaceC31117e = null;
                    }
                    if (interfaceC31117e != null && (abstractC23763c0Mo60594i = interfaceC31117e.mo60594i()) != null && (abstractC23773f1M56322U = AbstractC20301a.m56322U(abstractC23763c0Mo60594i)) != null && (returnType = Checks2.getReturnType()) != null && AbstractC22676k.m65745e(((AbstractC34690n) Checks2).getName(), AbstractC31211s.f128559d)) {
                        C35850h c35850h3 = AbstractC27736h.f111789e;
                        if ((AbstractC27736h.m83801C(returnType, AbstractC27741m.f111857h) || AbstractC27736h.m83804F(returnType)) && Checks2.mo78676v().size() == 1) {
                            AbstractC23811y type = ((AbstractC34711x0) ((InterfaceC31107a1) Checks2.mo78676v().get(0))).getType();
                            AbstractC22676k.m65749i(type, "getType(...)");
                            if (AbstractC22676k.m65745e(AbstractC20301a.m56322U(type), abstractC23773f1M56322U) && Checks2.mo78671c0().isEmpty() && Checks2.mo78667B() == null) {
                                return null;
                            }
                        }
                    }
                }
                StringBuilder sb4 = new StringBuilder("must override ''equals()'' in Any");
                InterfaceC31135k interfaceC31135kMo60581g4 = Checks2.mo60581g();
                AbstractC22676k.m65749i(interfaceC31135kMo60581g4, "getContainingDeclaration(...)");
                if (AbstractC39365h.m125541e(interfaceC31135kMo60581g4)) {
                    C38148i c38148i = C38148i.f163319d;
                    InterfaceC31135k interfaceC31135kMo60581g5 = Checks2.mo60581g();
                    AbstractC22676k.m65748h(interfaceC31135kMo60581g5, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    AbstractC23763c0 abstractC23763c0Mo60594i2 = ((InterfaceC31117e) interfaceC31135kMo60581g5).mo60594i();
                    AbstractC22676k.m65749i(abstractC23763c0Mo60594i2, "getDefaultType(...)");
                    sb4.append(" or define ''equals(other: " + c38148i.m122188X(AbstractC20301a.m56322U(abstractC23763c0Mo60594i2)) + "): Boolean''");
                }
                return sb4.toString();
            case 5:
                InterfaceC31162w Checks3 = (InterfaceC31162w) obj;
                List list3 = AbstractC31210r.f128555d;
                AbstractC22676k.m65750j(Checks3, "$this$Checks");
                InterfaceC31151q0 interfaceC31151q0Mo78677y = Checks3.mo78677y();
                if (interfaceC31151q0Mo78677y == null) {
                    interfaceC31151q0Mo78677y = Checks3.mo78667B();
                }
                if (interfaceC31151q0Mo78677y == null) {
                    z4 = false;
                } else {
                    AbstractC23811y returnType3 = Checks3.getReturnType();
                    if (!(returnType3 != null ? InterfaceC25387d.f99472a.m74525b(returnType3, ((AbstractC34670d) interfaceC31151q0Mo78677y).getType()) : false)) {
                        InterfaceC14343d value = interfaceC31151q0Mo78677y.getValue();
                        AbstractC22676k.m65749i(value, "getValue(...)");
                        if (value instanceof C14342c) {
                            InterfaceC31117e interfaceC31117e2 = ((C14342c) value).f52395w;
                            if (interfaceC31117e2.mo60493U() && (c35845cM13808f = AbstractC4393e.m13808f(interfaceC31117e2)) != null) {
                                InterfaceC31126h interfaceC31126hM48866M = AbstractC17269i.m48866M(AbstractC4393e.m13812j(interfaceC31117e2), c35845cM13808f);
                                InterfaceC31163w0 interfaceC31163w0 = interfaceC31126hM48866M instanceof InterfaceC31163w0 ? (InterfaceC31163w0) interfaceC31126hM48866M : null;
                                if (interfaceC31163w0 == null || (returnType2 = Checks3.getReturnType()) == null) {
                                    zM74525b = false;
                                } else {
                                    zM74525b = InterfaceC25387d.f99472a.m74525b(returnType2, ((C21561u) interfaceC31163w0).m60590K0());
                                }
                            } else {
                                zM74525b = false;
                            }
                        } else {
                            zM74525b = false;
                        }
                        if (!zM74525b) {
                            z4 = false;
                        }
                    }
                }
                if (z4) {
                    return null;
                }
                return "receiver must be a supertype of the return type";
            case 6:
                AbstractC27736h abstractC27736h = (AbstractC27736h) obj;
                C31212t c31212t = C31212t.f128576c;
                AbstractC22676k.m65750j(abstractC27736h, "<this>");
                return abstractC27736h.m83831t(EnumC27738j.BOOLEAN);
            case 7:
                AbstractC27736h abstractC27736h2 = (AbstractC27736h) obj;
                C31213u c31213u = C31213u.f128577c;
                AbstractC22676k.m65750j(abstractC27736h2, "<this>");
                return abstractC27736h2.m83831t(EnumC27738j.INT);
            default:
                AbstractC27736h abstractC27736h3 = (AbstractC27736h) obj;
                C31214v c31214v = C31214v.f128578c;
                AbstractC22676k.m65750j(abstractC27736h3, "<this>");
                return abstractC27736h3.m83834x();
        }
    }
}
