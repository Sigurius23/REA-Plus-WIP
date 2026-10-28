package wb3;

import aa3.EnumC0647q;
import ih0.AbstractC18489d0;
import j93.C21462d0;
import j93.EnumC21464e0;
import j93.InterfaceC21456a0;
import j93.InterfaceC21458b0;
import j93.InterfaceC21461d;
import j93.InterfaceC21463e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import lb3.AbstractC23773f1;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import ob3.C27791a;
import ob3.EnumC27792b;
import ob3.EnumC27806p;
import ob3.InterfaceC27793c;
import ob3.InterfaceC27794d;
import ob3.InterfaceC27795e;
import ob3.InterfaceC27796f;
import ob3.InterfaceC27797g;
import ob3.InterfaceC27798h;
import ob3.InterfaceC27799i;
import ob3.InterfaceC27800j;
import ob3.InterfaceC27801k;
import ob3.InterfaceC27802l;
import ob3.InterfaceC27803m;
import ob3.InterfaceC27805o;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p477s2.AbstractC32073e;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.KClassImpl;
import p715kotlin.reflect.jvm.internal.KTypeParameterImpl;
import p715kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: wb3.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C37066p implements InterfaceC27805o {

    /* JADX INFO: renamed from: w */
    public static final C37066p f158572w = new C37066p();

    /* JADX INFO: renamed from: o0 */
    public static void m119006o0(Object obj) {
        throw new KotlinReflectionInternalError(AbstractC18489d0.m53369j(obj, "This method should not be called on ", " with a new kotlin-reflect implementation. Please file an issue at https://kotl.in/issue"));
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: A */
    public boolean mo74526A(InterfaceC27797g interfaceC27797g) {
        AbstractC22676k.m65750j(interfaceC27797g, "<this>");
        return !AbstractC22676k.m65745e(mo74544T(mo74557f(interfaceC27797g)), mo74544T(mo74570l0(interfaceC27797g)));
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: B */
    public boolean mo74527B(InterfaceC27801k interfaceC27801k) {
        AbstractC22676k.m65750j(interfaceC27801k, "<this>");
        C21462d0 c21462d0 = ((C37060j) interfaceC27801k).f158559a;
        C21462d0 c21462d1 = C21462d0.f82423c;
        return AbstractC22676k.m65745e(c21462d0, C21462d0.f82423c);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: C */
    public boolean mo74528C(InterfaceC27802l interfaceC27802l) {
        AbstractC22676k.m65750j(interfaceC27802l, "<this>");
        return interfaceC27802l instanceof InterfaceC21461d;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: D */
    public InterfaceC27801k mo74529D(InterfaceC27800j interfaceC27800j, int i13) {
        AbstractC22676k.m65750j(interfaceC27800j, "<this>");
        if (interfaceC27800j instanceof InterfaceC27799i) {
            return mo74536K((InterfaceC27797g) interfaceC27800j, i13);
        }
        if (interfaceC27800j instanceof C27791a) {
            E e5 = ((C27791a) interfaceC27800j).get(i13);
            AbstractC22676k.m65749i(e5, "get(...)");
            return (InterfaceC27801k) e5;
        }
        throw new IllegalStateException(("unknown type argument list type: " + interfaceC27800j + ", " + AbstractC22671h0.f89337a.getOrCreateKotlinClass(interfaceC27800j.getClass())).toString());
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: E */
    public int mo74530E(InterfaceC27802l interfaceC27802l) {
        AbstractC22676k.m65750j(interfaceC27802l, "<this>");
        if (interfaceC27802l instanceof InterfaceC21461d) {
            return AbstractC37056f.m118975c((InterfaceC21461d) interfaceC27802l).size();
        }
        return 0;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: F */
    public InterfaceC27797g mo74531F(InterfaceC27797g interfaceC27797g) {
        m119006o0(interfaceC27797g);
        throw null;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: G */
    public InterfaceC27798h mo74532G(InterfaceC27798h interfaceC27798h) {
        int i13;
        EnumC27792b enumC27792b = EnumC27792b.f112043w;
        InterfaceC21456a0 interfaceC21456a0 = (InterfaceC21456a0) interfaceC27798h;
        InterfaceC21463e classifier = interfaceC21456a0.getClassifier();
        InterfaceC21461d interfaceC21461d = classifier instanceof InterfaceC21461d ? (InterfaceC21461d) classifier : null;
        if (interfaceC21461d != null) {
            List arguments = interfaceC21456a0.getArguments();
            List list = arguments;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((C21462d0) it.next()).f82424a != EnumC21464e0.f82426w) {
                        List listM118975c = AbstractC37056f.m118975c(interfaceC21461d);
                        if (listM118975c.size() != arguments.size()) {
                            break;
                        }
                        List list2 = arguments;
                        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                        Iterator it3 = list2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            C21462d0 c21462d0M121626I = (C21462d0) it3.next();
                            EnumC21464e0 enumC21464e0 = c21462d0M121626I.f82424a;
                            if (enumC21464e0 != EnumC21464e0.f82426w) {
                                InterfaceC21456a0 interfaceC21456a1 = c21462d0M121626I.f82425b;
                                if (enumC21464e0 != EnumC21464e0.f82427x) {
                                    interfaceC21456a1 = null;
                                }
                                C21462d0 c21462d0 = C21462d0.f82423c;
                                c21462d0M121626I = AbstractC37978j.m121626I(new C37053c(interfaceC21456a1, new C37054d(c21462d0M121626I), false));
                            }
                            arrayList.add(c21462d0M121626I);
                        }
                        C37061k c37061k = new C37061k(AbstractC25247g0.m74000i0(AbstractC25265s.m74107K1(AbstractC37056f.m118975c(interfaceC21461d), arrayList)));
                        int size = arguments.size();
                        for (i13 = 0; i13 < size; i13++) {
                            C21462d0 c21462d1 = (C21462d0) arguments.get(i13);
                            if (c21462d1.f82424a != EnumC21464e0.f82426w) {
                                List upperBounds = ((InterfaceC21458b0) listM118975c.get(i13)).getUpperBounds();
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it4 = upperBounds.iterator();
                                while (it4.hasNext()) {
                                    InterfaceC21456a0 interfaceC21456a2 = c37061k.m119005a((InterfaceC21456a0) it4.next()).f82425b;
                                    AbstractC22676k.m65747g(interfaceC21456a2);
                                    arrayList2.add(interfaceC21456a2);
                                }
                                if (c21462d1.f82424a == EnumC21464e0.f82428y) {
                                    InterfaceC21456a0 interfaceC21456a3 = c21462d1.f82425b;
                                    AbstractC22676k.m65747g(interfaceC21456a3);
                                    arrayList2.add(interfaceC21456a3);
                                }
                                InterfaceC21456a0 interfaceC21456a4 = ((C21462d0) arrayList.get(i13)).f82425b;
                                AbstractC22676k.m65748h(interfaceC21456a4, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.types.CapturedKType");
                                ((C37053c) interfaceC21456a4).f158540y.f158543x = arrayList2;
                            }
                        }
                        boolean zIsMarkedNullable = interfaceC21456a0.isMarkedNullable();
                        List annotations = interfaceC21456a0.getAnnotations();
                        boolean z4 = interfaceC21456a0 instanceof AbstractC37051a;
                        AbstractC37051a abstractC37051a = z4 ? (AbstractC37051a) interfaceC21456a0 : null;
                        InterfaceC21456a0 interfaceC21456a0Mo118940a = abstractC37051a != null ? abstractC37051a.mo118940a() : null;
                        AbstractC37051a abstractC37051a2 = z4 ? (AbstractC37051a) interfaceC21456a0 : null;
                        return new C37067q(interfaceC21461d, arrayList, zIsMarkedNullable, annotations, interfaceC21456a0Mo118940a, false, false, false, abstractC37051a2 != null ? abstractC37051a2.mo118941b() : null, null);
                    }
                }
            }
        }
        return null;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: H */
    public boolean mo74533H(InterfaceC27802l c3, InterfaceC27802l c7) {
        AbstractC22676k.m65750j(c3, "c1");
        AbstractC22676k.m65750j(c7, "c2");
        return c3.equals(c7);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: I */
    public void mo74534I(InterfaceC27798h interfaceC27798h, InterfaceC27802l interfaceC27802l) {
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: J */
    public boolean mo74535J(InterfaceC27802l interfaceC27802l) {
        if (!(interfaceC27802l instanceof KClassImpl)) {
            return false;
        }
        KClassImpl kClassImpl = (KClassImpl) interfaceC27802l;
        return (!kClassImpl.isFinal() || kClassImpl.getClassKind$kotlin_reflection() == EnumC0647q.ENUM_CLASS || kClassImpl.getClassKind$kotlin_reflection() == EnumC0647q.ENUM_ENTRY || kClassImpl.getClassKind$kotlin_reflection() == EnumC0647q.ANNOTATION_CLASS) ? false : true;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: K */
    public InterfaceC27801k mo74536K(InterfaceC27797g interfaceC27797g, int i13) {
        AbstractC22676k.m65750j(interfaceC27797g, "<this>");
        return new C37060j((C21462d0) ((InterfaceC21456a0) interfaceC27797g).getArguments().get(i13));
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: M */
    public InterfaceC27800j mo74537M(InterfaceC27798h interfaceC27798h) {
        AbstractC22676k.m65750j(interfaceC27798h, "<this>");
        return (InterfaceC27800j) interfaceC27798h;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: N */
    public InterfaceC27802l mo74538N(InterfaceC27797g interfaceC27797g) {
        AbstractC22676k.m65750j(interfaceC27797g, "<this>");
        InterfaceC27798h interfaceC27798hMo74562h0 = mo74562h0(interfaceC27797g);
        if (interfaceC27798hMo74562h0 == null) {
            interfaceC27798hMo74562h0 = mo74557f(interfaceC27797g);
        }
        return mo74544T(interfaceC27798hMo74562h0);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: O */
    public EnumC27792b mo74539O(InterfaceC27794d interfaceC27794d) {
        return EnumC27792b.f112043w;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: P */
    public boolean mo74540P(InterfaceC27798h interfaceC27798h) {
        mo74572m0(mo74544T(interfaceC27798h));
        return false;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: Q */
    public InterfaceC27797g mo74541Q(InterfaceC27797g interfaceC27797g) {
        m119006o0(interfaceC27797g);
        throw null;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: R */
    public boolean mo74542R(InterfaceC27797g interfaceC27797g) {
        AbstractC22676k.m65750j(interfaceC27797g, "<this>");
        return ((InterfaceC21456a0) interfaceC27797g).isMarkedNullable();
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: S */
    public InterfaceC27801k mo74543S(InterfaceC27798h interfaceC27798h, int i13) {
        if (i13 < 0 || i13 >= mo74559g(interfaceC27798h)) {
            return null;
        }
        return mo74536K(interfaceC27798h, i13);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: T */
    public InterfaceC27802l mo74544T(InterfaceC27798h interfaceC27798h) {
        Class<?> componentType;
        AbstractC22676k.m65750j(interfaceC27798h, "<this>");
        if (interfaceC27798h instanceof C37053c) {
            return ((C37053c) interfaceC27798h).f158540y;
        }
        AbstractC37051a abstractC37051a = (AbstractC37051a) interfaceC27798h;
        if (abstractC37051a.mo118943d()) {
            return C37064n.f158569x;
        }
        InterfaceC21463e classifier = abstractC37051a.getClassifier();
        KClassImpl kClassImpl = classifier instanceof KClassImpl ? (KClassImpl) classifier : null;
        if (kClassImpl != null && (componentType = AbstractC21598x.m60663S(kClassImpl).getComponentType()) != null && !componentType.isPrimitive()) {
            return (InterfaceC27802l) AbstractC22671h0.f89337a.getOrCreateKotlinClass(Object[].class);
        }
        InterfaceC21463e interfaceC21463eMo118941b = abstractC37051a.mo118941b();
        if (interfaceC21463eMo118941b == null) {
            interfaceC21463eMo118941b = abstractC37051a.getClassifier();
        }
        AbstractC22676k.m65748h(interfaceC21463eMo118941b, "null cannot be cast to non-null type org.jetbrains.kotlin.types.model.TypeConstructorMarker");
        return (InterfaceC27802l) interfaceC21463eMo118941b;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: U */
    public void mo74545U(InterfaceC27797g interfaceC27797g) {
        AbstractC22676k.m65750j(interfaceC27797g, "<this>");
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: V */
    public boolean mo74546V(InterfaceC27798h a5, InterfaceC27798h b) {
        AbstractC22676k.m65750j(a5, "a");
        AbstractC22676k.m65750j(b, "b");
        return false;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: W */
    public boolean mo74547W(AbstractC23773f1 abstractC23773f1) {
        AbstractC22676k.m65750j(abstractC23773f1, "<this>");
        return mo74542R(mo74557f(abstractC23773f1)) != mo74542R(mo74570l0(abstractC23773f1));
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: X */
    public Collection mo74548X(InterfaceC27798h interfaceC27798h) {
        m119006o0(interfaceC27798h);
        throw null;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: Y */
    public int mo74549Y(InterfaceC27800j interfaceC27800j) {
        AbstractC22676k.m65750j(interfaceC27800j, "<this>");
        if (interfaceC27800j instanceof InterfaceC27798h) {
            return mo74559g((InterfaceC27797g) interfaceC27800j);
        }
        if (interfaceC27800j instanceof C27791a) {
            return ((C27791a) interfaceC27800j).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + interfaceC27800j + ", " + AbstractC22671h0.f89337a.getOrCreateKotlinClass(interfaceC27800j.getClass())).toString());
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: Z */
    public InterfaceC27797g mo74550Z(InterfaceC27801k interfaceC27801k) {
        AbstractC22676k.m65750j(interfaceC27801k, "<this>");
        return (InterfaceC27797g) ((C37060j) interfaceC27801k).f158559a.f82425b;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: a */
    public InterfaceC27798h mo74457a(InterfaceC27796f interfaceC27796f) {
        AbstractC37051a abstractC37051aMo118949j = ((AbstractC37051a) interfaceC27796f).mo118949j();
        AbstractC22676k.m65748h(abstractC37051aMo118949j, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.types.AbstractKType");
        return abstractC37051aMo118949j;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: a0 */
    public void mo74551a0(InterfaceC27798h interfaceC27798h) {
        AbstractC22676k.m65750j(interfaceC27798h, "<this>");
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: b */
    public InterfaceC27798h mo74458b(InterfaceC27796f interfaceC27796f) {
        AbstractC37051a abstractC37051aMo118946g = ((AbstractC37051a) interfaceC27796f).mo118946g();
        AbstractC22676k.m65748h(abstractC37051aMo118946g, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.types.AbstractKType");
        return abstractC37051aMo118946g;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: b0 */
    public boolean mo74552b0(InterfaceC27802l interfaceC27802l) {
        return interfaceC27802l.equals(AbstractC22671h0.f89337a.getOrCreateKotlinClass(Object.class));
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: c0 */
    public InterfaceC27803m mo74553c0(InterfaceC27802l interfaceC27802l, int i13) {
        AbstractC22676k.m65750j(interfaceC27802l, "<this>");
        Object obj = AbstractC37056f.m118975c((InterfaceC21461d) interfaceC27802l).get(i13);
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeParameterImpl");
        return (KTypeParameterImpl) obj;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: d */
    public InterfaceC27798h mo74460d(InterfaceC27798h interfaceC27798h) {
        AbstractC22676k.m65750j(interfaceC27798h, "<this>");
        return ((AbstractC37051a) interfaceC27798h).mo118948i(false);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: d0 */
    public boolean mo74554d0(InterfaceC27794d interfaceC27794d) {
        AbstractC22676k.m65750j(interfaceC27794d, "<this>");
        return false;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: e */
    public boolean mo74555e(InterfaceC27797g interfaceC27797g) {
        AbstractC22676k.m65750j(interfaceC27797g, "<this>");
        InterfaceC27798h interfaceC27798hMo74562h0 = mo74562h0(interfaceC27797g);
        return (interfaceC27798hMo74562h0 != null ? mo74564i0(interfaceC27798hMo74562h0) : null) != null;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: e0 */
    public InterfaceC27801k mo74556e0(InterfaceC27797g interfaceC27797g) {
        m119006o0(interfaceC27797g);
        throw null;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: f */
    public InterfaceC27798h mo74557f(InterfaceC27797g interfaceC27797g) {
        AbstractC22676k.m65750j(interfaceC27797g, "<this>");
        InterfaceC27796f interfaceC27796fMo74581r = mo74581r(interfaceC27797g);
        if (interfaceC27796fMo74581r != null) {
            return mo74458b(interfaceC27796fMo74581r);
        }
        InterfaceC27798h interfaceC27798hMo74562h0 = mo74562h0(interfaceC27797g);
        AbstractC22676k.m65747g(interfaceC27798hMo74562h0);
        return interfaceC27798hMo74562h0;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: f0 */
    public boolean mo74558f0(InterfaceC27797g interfaceC27797g) {
        AbstractC22676k.m65750j(interfaceC27797g, "<this>");
        InterfaceC27798h interfaceC27798hMo74562h0 = mo74562h0(interfaceC27797g);
        return (interfaceC27798hMo74562h0 != null ? m119007n0(interfaceC27798hMo74562h0) : null) != null;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: g */
    public int mo74559g(InterfaceC27797g interfaceC27797g) {
        AbstractC22676k.m65750j(interfaceC27797g, "<this>");
        return ((InterfaceC21456a0) interfaceC27797g).getArguments().size();
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: g0 */
    public boolean mo74560g0(InterfaceC27794d interfaceC27794d) {
        return false;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: h */
    public boolean mo74561h(InterfaceC27798h interfaceC27798h) {
        AbstractC22676k.m65750j(interfaceC27798h, "<this>");
        if (!mo74584u(mo74538N(interfaceC27798h))) {
            return false;
        }
        m119006o0(interfaceC27798h);
        throw null;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: h0 */
    public InterfaceC27798h mo74562h0(InterfaceC27797g interfaceC27797g) {
        AbstractC22676k.m65750j(interfaceC27797g, "<this>");
        if (mo74581r(interfaceC27797g) != null) {
            return null;
        }
        return (InterfaceC27798h) interfaceC27797g;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: i */
    public EnumC27806p mo74563i(InterfaceC27801k interfaceC27801k) {
        AbstractC22676k.m65750j(interfaceC27801k, "<this>");
        EnumC21464e0 enumC21464e0 = ((C37060j) interfaceC27801k).f158559a.f82424a;
        if (enumC21464e0 == null) {
            return EnumC27806p.OUT;
        }
        int iOrdinal = enumC21464e0.ordinal();
        if (iOrdinal == 0) {
            return EnumC27806p.INV;
        }
        if (iOrdinal == 1) {
            return EnumC27806p.IN;
        }
        if (iOrdinal == 2) {
            return EnumC27806p.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: i0 */
    public InterfaceC27794d mo74564i0(InterfaceC27798h interfaceC27798h) {
        InterfaceC27795e interfaceC27795eM119007n0 = m119007n0(interfaceC27798h);
        if (interfaceC27795eM119007n0 != null) {
            m119006o0(interfaceC27795eM119007n0);
            throw null;
        }
        InterfaceC27799i interfaceC27799i = (InterfaceC27799i) interfaceC27798h;
        if (interfaceC27799i instanceof InterfaceC27794d) {
            return (InterfaceC27794d) interfaceC27799i;
        }
        return null;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: j */
    public boolean mo74565j(InterfaceC27798h interfaceC27798h) {
        AbstractC22676k.m65750j(interfaceC27798h, "<this>");
        return mo74528C(mo74544T(interfaceC27798h));
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: j0 */
    public boolean mo74566j0(InterfaceC27797g interfaceC27797g) {
        AbstractC22676k.m65750j(interfaceC27797g, "<this>");
        return false;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: k */
    public InterfaceC27793c mo74567k(InterfaceC27794d interfaceC27794d) {
        return ((C37053c) interfaceC27794d).f158540y;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: k0 */
    public InterfaceC27797g mo74568k0(InterfaceC27794d interfaceC27794d) {
        return (InterfaceC27797g) ((C37053c) interfaceC27794d).f158539x;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: l */
    public EnumC27806p mo74569l(InterfaceC27803m interfaceC27803m) {
        AbstractC22676k.m65750j(interfaceC27803m, "<this>");
        int iOrdinal = ((InterfaceC21458b0) interfaceC27803m).getVariance().ordinal();
        if (iOrdinal == 0) {
            return EnumC27806p.INV;
        }
        if (iOrdinal == 1) {
            return EnumC27806p.IN;
        }
        if (iOrdinal == 2) {
            return EnumC27806p.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: l0 */
    public InterfaceC27798h mo74570l0(InterfaceC27797g interfaceC27797g) {
        AbstractC22676k.m65750j(interfaceC27797g, "<this>");
        InterfaceC27796f interfaceC27796fMo74581r = mo74581r(interfaceC27797g);
        if (interfaceC27796fMo74581r != null) {
            return mo74457a(interfaceC27796fMo74581r);
        }
        InterfaceC27798h interfaceC27798hMo74562h0 = mo74562h0(interfaceC27797g);
        AbstractC22676k.m65747g(interfaceC27798hMo74562h0);
        return interfaceC27798hMo74562h0;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: m */
    public boolean mo74571m(InterfaceC27798h interfaceC27798h) {
        AbstractC22676k.m65750j(interfaceC27798h, "<this>");
        return m119007n0(interfaceC27798h) != null;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: m0 */
    public boolean mo74572m0(InterfaceC27802l interfaceC27802l) {
        AbstractC22676k.m65750j(interfaceC27802l, "<this>");
        return false;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: n */
    public AbstractC32073e mo74573n(InterfaceC27798h interfaceC27798h) {
        C37061k c37061k = C37061k.f158560b;
        InterfaceC21456a0 interfaceC21456a0 = (InterfaceC21456a0) interfaceC27798h;
        C37066p c37066p = f158572w;
        InterfaceC27802l interfaceC27802lMo74544T = c37066p.mo74544T((AbstractC37051a) interfaceC21456a0);
        int iMo74530E = c37066p.mo74530E(interfaceC27802lMo74544T);
        ArrayList arrayList = new ArrayList(iMo74530E);
        for (int i13 = 0; i13 < iMo74530E; i13++) {
            arrayList.add((InterfaceC21458b0) c37066p.mo74553c0(interfaceC27802lMo74544T, i13));
        }
        return new C37065o(!arrayList.isEmpty() ? new C37061k(AbstractC25247g0.m74000i0(AbstractC25265s.m74107K1(arrayList, interfaceC21456a0.getArguments()))) : C37061k.f158560b);
    }

    /* JADX INFO: renamed from: n0 */
    public InterfaceC27795e m119007n0(InterfaceC27798h interfaceC27798h) {
        AbstractC22676k.m65750j(interfaceC27798h, "<this>");
        if ((interfaceC27798h instanceof AbstractC37051a) && ((AbstractC37051a) interfaceC27798h).mo118942c()) {
            return (InterfaceC27795e) interfaceC27798h;
        }
        return null;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: o */
    public boolean mo74575o(InterfaceC27797g interfaceC27797g) {
        AbstractC22676k.m65750j(interfaceC27797g, "<this>");
        return false;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: p */
    public void mo74577p(InterfaceC27798h interfaceC27798h) {
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: q */
    public boolean mo74579q(InterfaceC27803m interfaceC27803m, InterfaceC27802l interfaceC27802l) {
        m119006o0(interfaceC27803m);
        throw null;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: r */
    public InterfaceC27796f mo74581r(InterfaceC27797g interfaceC27797g) {
        AbstractC22676k.m65750j(interfaceC27797g, "<this>");
        if (!(interfaceC27797g instanceof AbstractC37051a) || ((AbstractC37051a) interfaceC27797g).mo118946g() == null) {
            return null;
        }
        return (InterfaceC27796f) interfaceC27797g;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: s */
    public Collection mo74582s(InterfaceC27802l interfaceC27802l) {
        AbstractC22676k.m65750j(interfaceC27802l, "<this>");
        if (interfaceC27802l instanceof InterfaceC21461d) {
            List<InterfaceC21456a0> supertypes = ((InterfaceC21461d) interfaceC27802l).getSupertypes();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(supertypes, 10));
            for (InterfaceC21456a0 interfaceC21456a0 : supertypes) {
                AbstractC22676k.m65748h(interfaceC21456a0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.model.KotlinTypeMarker");
                arrayList.add((InterfaceC27797g) interfaceC21456a0);
            }
            return arrayList;
        }
        if (interfaceC27802l instanceof InterfaceC21458b0) {
            List<InterfaceC21456a0> upperBounds = ((InterfaceC21458b0) interfaceC27802l).getUpperBounds();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(upperBounds, 10));
            for (InterfaceC21456a0 interfaceC21456a1 : upperBounds) {
                AbstractC22676k.m65748h(interfaceC21456a1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.model.KotlinTypeMarker");
                arrayList2.add((InterfaceC27797g) interfaceC21456a1);
            }
            return arrayList2;
        }
        if (!(interfaceC27802l instanceof C37054d)) {
            StringBuilder sbM73380m = AbstractC25012a.m73380m("Unsupported type constructor: ", interfaceC27802l, " (");
            sbM73380m.append(interfaceC27802l.getClass().getName());
            sbM73380m.append(')');
            throw new IllegalStateException(sbM73380m.toString().toString());
        }
        ArrayList<InterfaceC21456a0> arrayList3 = ((C37054d) interfaceC27802l).f158543x;
        if (arrayList3 == null) {
            AbstractC22676k.m65757q("supertypes");
            throw null;
        }
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(arrayList3, 10));
        for (InterfaceC21456a0 interfaceC21456a2 : arrayList3) {
            AbstractC22676k.m65748h(interfaceC21456a2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.model.KotlinTypeMarker");
            arrayList4.add((InterfaceC27797g) interfaceC21456a2);
        }
        return arrayList4;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: t */
    public boolean mo74583t(InterfaceC27802l interfaceC27802l) {
        return !(interfaceC27802l instanceof C37054d);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: u */
    public boolean mo74584u(InterfaceC27802l interfaceC27802l) {
        AbstractC22676k.m65750j(interfaceC27802l, "<this>");
        return interfaceC27802l.equals(AbstractC22671h0.f89337a.getOrCreateKotlinClass(Void.class));
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: v */
    public boolean mo74585v(InterfaceC27802l interfaceC27802l) {
        AbstractC22676k.m65750j(interfaceC27802l, "<this>");
        return false;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: x */
    public InterfaceC27801k mo74586x(InterfaceC27793c interfaceC27793c) {
        AbstractC22676k.m65750j(interfaceC27793c, "<this>");
        return new C37060j(((C37054d) interfaceC27793c).f158542w);
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: y */
    public InterfaceC27794d mo74587y(InterfaceC27799i interfaceC27799i) {
        if (interfaceC27799i instanceof InterfaceC27794d) {
            return (InterfaceC27794d) interfaceC27799i;
        }
        return null;
    }

    @Override // ob3.InterfaceC27805o
    /* JADX INFO: renamed from: z */
    public InterfaceC27797g mo74588z(ArrayList arrayList) {
        m119006o0(this);
        throw null;
    }
}
