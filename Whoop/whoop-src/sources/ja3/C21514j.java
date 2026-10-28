package ja3;

import c93.InterfaceC4339a;
import com.iterable.iterableapi.C5327g1;
import db3.C11889a;
import fa3.AbstractC14323p;
import fa3.AbstractC14331x;
import ha3.C17059b;
import hg3.AbstractC17269i;
import ia3.C18295a;
import ia3.C18297c;
import ia3.C18299e;
import ia3.InterfaceC18300f;
import io.sentry.config.AbstractC20301a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ka3.C22309a;
import l83.C23465k;
import l83.InterfaceC23462h;
import lb3.AbstractC23811y;
import lb3.EnumC23761b1;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p005a3.C0237p;
import p249jc.C21567b;
import p547v8.AbstractC35785b;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.AbstractC31152r;
import r93.InterfaceC31117e;
import r93.InterfaceC31165x0;
import s93.C32304f;
import s93.C32305g;
import se.AbstractC32417h;
import u93.C34682j;
import u93.C34709w0;
import wb3.AbstractC37056f;
import x93.AbstractC38106a0;
import x93.C38108b0;
import x93.C38116h;
import x93.C38117i;
import x93.C38118j;
import x93.C38122n;
import x93.C38125q;
import x93.C38131w;
import x93.C38134z;
import xb3.AbstractC38176k;
import xb3.C38171f;

/* JADX INFO: renamed from: ja3.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C21514j implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f82522w = 0;

    /* JADX INFO: renamed from: x */
    public final C41113q f82523x;

    /* JADX INFO: renamed from: y */
    public final C21519o f82524y;

    public C21514j(C21519o c21519o, C41113q c41113q) {
        this.f82524y = c21519o;
        this.f82523x = c41113q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, l83.h] */
    /* JADX WARN: Type inference failed for: r2v0, types: [ja3.a0, ja3.o] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v8, types: [ha3.b, u93.j, u93.x] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12 */
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
    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        ?? arrayList;
        ?? r10;
        C23465k c23465k;
        switch (this.f82522w) {
            case 0:
                ?? r14 = this.f82524y;
                C38122n c38122n = r14.f82540o;
                C41113q c41113q = r14.f82465b;
                InterfaceC31117e interfaceC31117e = r14.f82539n;
                Constructor<?>[] declaredConstructors = c38122n.f163232a.getDeclaredConstructors();
                AbstractC22676k.m65749i(declaredConstructors, "getDeclaredConstructors(...)");
                boolean z4 = false;
                List<C38125q> listM122276E = AbstractC38176k.m122276E(AbstractC38176k.m122272A(new C38171f(AbstractC25260n.m74050X(declaredConstructors), false, C38117i.f163227w), C38118j.f163228w));
                ArrayList arrayList2 = new ArrayList(listM122276E.size());
                for (C38125q c38125q : listM122276E) {
                    C18297c c18297cM48897j0 = AbstractC17269i.m48897j0(c41113q, c38125q);
                    C18295a c18295a = (C18295a) c41113q.f177224x;
                    C17059b c17059bM48175a1 = C17059b.m48175a1(interfaceC31117e, c18297cM48897j0, z4, c18295a.f71232j.m118692c(c38125q));
                    C41113q c41113q2 = new C41113q(c18295a, new C18299e(c41113q, c17059bM48175a1, c38125q, interfaceC31117e.mo60497j().size()), (InterfaceC23462h) c41113q.f177226z);
                    C5327g1 c5327g1M60466n = AbstractC21500a0.m60466n(c41113q2, c17059bM48175a1, c38125q.m122114k());
                    List listMo60497j = interfaceC31117e.mo60497j();
                    AbstractC22676k.m65749i(listMo60497j, "getDeclaredTypeParameters(...)");
                    List list = listMo60497j;
                    ArrayList typeParameters = c38125q.getTypeParameters();
                    ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(typeParameters, 10));
                    Iterator it = typeParameters.iterator();
                    while (it.hasNext()) {
                        InterfaceC31165x0 interfaceC31165x0Mo52687a = ((InterfaceC18300f) c41113q2.f177225y).mo52687a((C38108b0) it.next());
                        AbstractC22676k.m65747g(interfaceC31165x0Mo52687a);
                        arrayList3.add(interfaceC31165x0Mo52687a);
                    }
                    c17059bM48175a1.m109569Y0(c5327g1M60466n.m16441c(), AbstractC32417h.m101190U(c38125q.m122121f()), AbstractC25265s.m74129g1(list, arrayList3));
                    c17059bM48175a1.mo48178R0(false);
                    c17059bM48175a1.mo48180S0(c5327g1M60466n.m16442d());
                    c17059bM48175a1.m109633T0(interfaceC31117e.mo60594i());
                    ((C18295a) c41113q2.f177224x).f71229g.getClass();
                    arrayList2.add(c17059bM48175a1);
                    z4 = false;
                }
                boolean zM122106g = c38122n.m122106g();
                Class cls = c38122n.f163232a;
                C41113q c41113q3 = this.f82523x;
                C32304f c32304f = C32305g.f133684a;
                if (zM122106g) {
                    C17059b c17059bM48175a2 = C17059b.m48175a1(interfaceC31117e, c32304f, true, ((C18295a) c41113q.f177224x).f71232j.m118692c(c38122n));
                    ArrayList arrayListM122105f = c38122n.m122105f();
                    ArrayList arrayList4 = new ArrayList(arrayListM122105f.size());
                    C22309a c22309aM113400W = AbstractC35785b.m113400W(EnumC23761b1.f94124x, false, null, 6);
                    int i13 = 0;
                    for (Iterator it3 = arrayListM122105f.iterator(); it3.hasNext(); it3 = it3) {
                        C38134z c38134z = (C38134z) it3.next();
                        arrayList4.add(new C34709w0(c17059bM48175a2, null, i13, c32304f, c38134z.m122119d(), ((C0237p) c41113q.f177222E).m695Z(c38134z.m122130j(), c22309aM113400W), false, false, false, null, ((C18295a) c41113q.f177224x).f71232j.m118692c(c38134z)));
                        i13++;
                    }
                    c17059bM48175a2.mo48180S0(false);
                    AbstractC31152r PROTECTED_AND_PACKAGE = interfaceC31117e.getVisibility();
                    AbstractC22676k.m65749i(PROTECTED_AND_PACKAGE, "getVisibility(...)");
                    if (PROTECTED_AND_PACKAGE.equals(AbstractC14323p.f52286b)) {
                        PROTECTED_AND_PACKAGE = AbstractC14323p.f52287c;
                        AbstractC22676k.m65749i(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
                    }
                    c17059bM48175a2.m109568X0(arrayList4, PROTECTED_AND_PACKAGE);
                    c17059bM48175a2.mo48178R0(false);
                    c17059bM48175a2.m109633T0(interfaceC31117e.mo60594i());
                    String strM56347o = AbstractC20301a.m56347o(c17059bM48175a2, 2);
                    if (arrayList2.isEmpty()) {
                        arrayList2.add(c17059bM48175a2);
                        ((C18295a) c41113q3.f177224x).f71229g.getClass();
                    } else {
                        Iterator it4 = arrayList2.iterator();
                        do {
                            if (!it4.hasNext()) {
                                arrayList2.add(c17059bM48175a2);
                                ((C18295a) c41113q3.f177224x).f71229g.getClass();
                            }
                        } while (!AbstractC22676k.m65745e(AbstractC20301a.m56347o((C34682j) it4.next(), 2), strM56347o));
                    }
                }
                ((C11889a) ((C18295a) c41113q3.f177224x).f71246x).m31916a(interfaceC31117e, arrayList2, c41113q3);
                C21567b c21567b = ((C18295a) c41113q3.f177224x).f71240r;
                boolean zIsEmpty = arrayList2.isEmpty();
                List listM118960L = arrayList2;
                if (zIsEmpty) {
                    boolean zIsAnnotation = cls.isAnnotation();
                    cls.isInterface();
                    if (zIsAnnotation) {
                        C18295a c18295a2 = (C18295a) c41113q.f177224x;
                        C0237p c0237p = (C0237p) c41113q.f177222E;
                        ?? M48175a1 = C17059b.m48175a1(interfaceC31117e, c32304f, true, c18295a2.f71232j.m118692c(c38122n));
                        if (zIsAnnotation) {
                            Collection collectionM122103d = c38122n.m122103d();
                            arrayList = new ArrayList(collectionM122103d.size());
                            C22309a c22309aM113400W2 = AbstractC35785b.m113400W(EnumC23761b1.f94124x, true, null, 6);
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList<C38131w> arrayList6 = new ArrayList();
                            Iterator it5 = collectionM122103d.iterator();
                            while (it5.hasNext()) {
                                Object next = it5.next();
                                Iterator it6 = it5;
                                if (AbstractC22676k.m65745e(((C38131w) next).m122119d(), AbstractC14331x.f52307b)) {
                                    arrayList5.add(next);
                                } else {
                                    arrayList6.add(next);
                                }
                                it5 = it6;
                            }
                            arrayList5.size();
                            C38131w c38131w = (C38131w) AbstractC25265s.m74100H0(arrayList5);
                            if (c38131w != null) {
                                AbstractC38106a0 abstractC38106a0M122127l = c38131w.m122127l();
                                if (abstractC38106a0M122127l instanceof C38116h) {
                                    C38116h c38116h = (C38116h) abstractC38106a0M122127l;
                                    c23465k = new C23465k(c0237p.m694Y(c38116h, c22309aM113400W2, true), c0237p.m695Z(c38116h.m122100c(), c22309aM113400W2));
                                } else {
                                    c23465k = new C23465k(c0237p.m695Z(abstractC38106a0M122127l, c22309aM113400W2), null);
                                }
                                r14.m60513o(arrayList, M48175a1, 0, c38131w, (AbstractC23811y) c23465k.f92937w, (AbstractC23811y) c23465k.f92938x);
                            } else {
                                c38131w = c38131w;
                            }
                            int i14 = c38131w != null ? 1 : 0;
                            int i15 = 0;
                            for (C38131w c38131w2 : arrayList6) {
                                r14.m60513o(arrayList, M48175a1, i15 + i14, c38131w2, c0237p.m695Z(c38131w2.m122127l(), c22309aM113400W2), null);
                                i15++;
                            }
                        } else {
                            arrayList = Collections.EMPTY_LIST;
                        }
                        M48175a1.mo48180S0(false);
                        AbstractC31152r PROTECTED_AND_PACKAGE2 = interfaceC31117e.getVisibility();
                        AbstractC22676k.m65749i(PROTECTED_AND_PACKAGE2, "getVisibility(...)");
                        if (PROTECTED_AND_PACKAGE2.equals(AbstractC14323p.f52286b)) {
                            PROTECTED_AND_PACKAGE2 = AbstractC14323p.f52287c;
                            AbstractC22676k.m65749i(PROTECTED_AND_PACKAGE2, "PROTECTED_AND_PACKAGE");
                        }
                        M48175a1.m109568X0(arrayList, PROTECTED_AND_PACKAGE2);
                        M48175a1.mo48178R0(true);
                        M48175a1.m109633T0(interfaceC31117e.mo60594i());
                        ((C18295a) c41113q.f177224x).f71229g.getClass();
                        r10 = M48175a1;
                    } else {
                        r10 = 0;
                    }
                    listM118960L = AbstractC37056f.m118960L(r10);
                }
                return AbstractC25265s.m74093D1(c21567b.m60615n(c41113q3, listM118960L));
            default:
                C41113q c41113q4 = this.f82523x;
                return AbstractC25265s.m74103I1(((C11889a) ((C18295a) c41113q4.f177224x).f71246x).m31921f(this.f82524y.f82539n, c41113q4));
        }
    }

    public C21514j(C41113q c41113q, C21519o c21519o) {
        this.f82523x = c41113q;
        this.f82524y = c21519o;
    }
}
