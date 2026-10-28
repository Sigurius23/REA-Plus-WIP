package u93;

import androidx.health.platform.client.proto.C1533u;
import cb3.AbstractC4393e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kb3.C22342k;
import l83.C23465k;
import lb3.AbstractC23763c0;
import lb3.AbstractC23767d1;
import lb3.AbstractC23791o;
import lb3.AbstractC23811y;
import lb3.AbstractC23812y0;
import lb3.C23758a1;
import lb3.C23774g;
import lb3.C23779i;
import lb3.C23784k0;
import lb3.EnumC23776g1;
import lb3.InterfaceC23796q0;
import m83.AbstractC25267u;
import mb3.C25389f;
import ob3.InterfaceC27798h;
import p581we.C37199o;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22717t;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import r93.AbstractC31152r;
import r93.AbstractC31167y0;
import r93.C31112c0;
import r93.C31164x;
import r93.EnumC31106a0;
import r93.EnumC31120f;
import r93.InterfaceC31117e;
import r93.InterfaceC31135k;
import r93.InterfaceC31138l;
import r93.InterfaceC31141m;
import r93.InterfaceC31151q0;
import r93.InterfaceC31155s0;
import r93.InterfaceC31165x0;
import s93.InterfaceC32307i;
import va3.C35850h;
import wb3.AbstractC37056f;
import ya3.AbstractC39363f;

/* JADX INFO: renamed from: u93.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C34667b0 extends AbstractC34669c0 {

    /* JADX INFO: renamed from: E */
    public ArrayList f146037E;

    /* JADX INFO: renamed from: F */
    public C23779i f146038F;

    /* JADX INFO: renamed from: w */
    public final AbstractC34669c0 f146039w;

    /* JADX INFO: renamed from: x */
    public final C23758a1 f146040x;

    /* JADX INFO: renamed from: y */
    public C23758a1 f146041y;

    /* JADX INFO: renamed from: z */
    public ArrayList f146042z;

    public C34667b0(AbstractC34669c0 abstractC34669c0, C23758a1 c23758a1) {
        this.f146039w = abstractC34669c0;
        this.f146040x = c23758a1;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m109554E(int i13) {
        String str = (i13 == 2 || i13 == 3 || i13 == 5 || i13 == 6 || i13 == 8 || i13 == 10 || i13 == 13 || i13 == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i13 == 2 || i13 == 3 || i13 == 5 || i13 == 6 || i13 == 8 || i13 == 10 || i13 == 13 || i13 == 23) ? 3 : 2];
        if (i13 == 2) {
            objArr[0] = "typeArguments";
        } else if (i13 == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i13 == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i13 == 6) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i13 == 8) {
            objArr[0] = "typeArguments";
        } else if (i13 == 10) {
            objArr[0] = "typeSubstitution";
        } else if (i13 == 13) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i13 != 23) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        } else {
            objArr[0] = "substitutor";
        }
        switch (i13) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case 13:
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 11:
                objArr[1] = "getMemberScope";
                break;
            case 12:
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getDefaultType";
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                objArr[1] = "getContextReceivers";
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                objArr[1] = "getConstructors";
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[1] = "getAnnotations";
                break;
            case 20:
                objArr[1] = "getName";
                break;
            case 21:
                objArr[1] = "getOriginal";
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                objArr[1] = "getContainingDeclaration";
                break;
            case 24:
                objArr[1] = "substitute";
                break;
            case 25:
                objArr[1] = "getKind";
                break;
            case 26:
                objArr[1] = "getModality";
                break;
            case 27:
                objArr[1] = "getVisibility";
                break;
            case 28:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 29:
                objArr[1] = "getSource";
                break;
            case 30:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 31:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i13 == 2 || i13 == 3 || i13 == 5 || i13 == 6 || i13 == 8 || i13 == 10) {
            objArr[2] = "getMemberScope";
        } else if (i13 == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i13 == 23) {
            objArr[2] = "substitute";
        }
        String str2 = String.format(str, objArr);
        if (i13 != 2 && i13 != 3 && i13 != 5 && i13 != 6 && i13 != 8 && i13 != 10 && i13 != 13 && i13 != 23) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    /* JADX INFO: renamed from: G */
    public final C23758a1 m109555G() {
        if (this.f146041y == null) {
            C23758a1 c23758a1 = this.f146040x;
            if (c23758a1.f94122a.mo69908e()) {
                this.f146041y = c23758a1;
            } else {
                List parameters = this.f146039w.mo60496e().getParameters();
                this.f146042z = new ArrayList(parameters.size());
                this.f146041y = AbstractC23791o.m69894m(parameters, c23758a1.m69821f(), this, this.f146042z);
                ArrayList arrayList = this.f146042z;
                AbstractC22676k.m65750j(arrayList, "<this>");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!((InterfaceC31165x0) obj).mo95861D()) {
                        arrayList2.add(obj);
                    }
                }
                this.f146037E = arrayList2;
            }
        }
        return this.f146041y;
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: H */
    public final InterfaceC22712o mo60487H() {
        InterfaceC22712o interfaceC22712oMo60487H = this.f146039w.mo60487H();
        if (interfaceC22712oMo60487H != null) {
            return interfaceC22712oMo60487H;
        }
        m109554E(28);
        throw null;
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: I */
    public final AbstractC31167y0 mo60488I() {
        AbstractC31167y0 abstractC31167y0Mo60488I = this.f146039w.mo60488I();
        if (abstractC31167y0Mo60488I == null) {
            return null;
        }
        boolean z4 = abstractC31167y0Mo60488I instanceof C31164x;
        C23758a1 c23758a1 = this.f146040x;
        if (z4) {
            C31164x c31164x = (C31164x) abstractC31167y0Mo60488I;
            C35850h c35850h = c31164x.f128381a;
            AbstractC23763c0 abstractC23763c0 = (AbstractC23763c0) c31164x.f128382b;
            if (abstractC23763c0 != null && !c23758a1.f94122a.mo69908e()) {
                abstractC23763c0 = (AbstractC23763c0) m109555G().m69823i(abstractC23763c0, EnumC23776g1.INVARIANT);
            }
            return new C31164x(c35850h, abstractC23763c0);
        }
        if (!(abstractC31167y0Mo60488I instanceof C31112c0)) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList<C23465k> arrayList = ((C31112c0) abstractC31167y0Mo60488I).f128313a;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        for (C23465k c23465k : arrayList) {
            C35850h c35850h2 = (C35850h) c23465k.f92937w;
            AbstractC23763c0 abstractC23763c1 = (AbstractC23763c0) ((InterfaceC27798h) c23465k.f92938x);
            if (abstractC23763c1 != null && !c23758a1.f94122a.mo69908e()) {
                abstractC23763c1 = (AbstractC23763c0) m109555G().m69823i(abstractC23763c1, EnumC23776g1.INVARIANT);
            }
            arrayList2.add(new C23465k(c35850h2, abstractC23763c1));
        }
        return new C31112c0(arrayList2);
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: K */
    public final InterfaceC22712o mo60489K() {
        AbstractC4393e.m13811i(AbstractC39363f.m125521c(this.f146039w));
        return mo60499l(C25389f.f99474a);
    }

    @Override // r93.InterfaceC31168z
    /* JADX INFO: renamed from: L */
    public final boolean mo60490L() {
        return this.f146039w.mo60490L();
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: M */
    public final List mo60578M() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m109554E(17);
        throw null;
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: N */
    public final boolean mo60491N() {
        return this.f146039w.mo60491N();
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: Q */
    public final boolean mo60492Q() {
        return this.f146039w.mo60492Q();
    }

    @Override // r93.InterfaceC31135k
    /* JADX INFO: renamed from: T */
    public final Object mo78659T(InterfaceC31141m interfaceC31141m, Object obj) {
        return interfaceC31141m.visitClassDescriptor(this, obj);
    }

    @Override // r93.InterfaceC31168z
    /* JADX INFO: renamed from: U */
    public final boolean mo60493U() {
        return this.f146039w.mo60493U();
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: V */
    public final InterfaceC22712o mo60494V() {
        InterfaceC22712o interfaceC22712oMo60494V = this.f146039w.mo60494V();
        if (interfaceC22712oMo60494V != null) {
            return interfaceC22712oMo60494V;
        }
        m109554E(15);
        throw null;
    }

    @Override // u93.AbstractC34669c0, r93.InterfaceC31117e, r93.InterfaceC31135k
    /* JADX INFO: renamed from: a */
    public final InterfaceC31117e mo78660a() {
        InterfaceC31117e interfaceC31117eMo78660a = this.f146039w.mo78660a();
        if (interfaceC31117eMo78660a != null) {
            return interfaceC31117eMo78660a;
        }
        m109554E(21);
        throw null;
    }

    @Override // u93.AbstractC34669c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC22712o mo78653b(AbstractC23812y0 abstractC23812y0, C25389f c25389f) {
        InterfaceC22712o interfaceC22712oMo78653b = this.f146039w.mo78653b(abstractC23812y0, c25389f);
        if (!this.f146040x.f94122a.mo69908e()) {
            return new C22717t(interfaceC22712oMo78653b, m109555G());
        }
        if (interfaceC22712oMo78653b != null) {
            return interfaceC22712oMo78653b;
        }
        m109554E(7);
        throw null;
    }

    @Override // r93.InterfaceC31159u0
    /* JADX INFO: renamed from: d */
    public final InterfaceC31138l mo60593d(C23758a1 c23758a1) {
        if (c23758a1 != null) {
            return c23758a1.f94122a.mo69908e() ? this : new C34667b0(this, C23758a1.m69819e(c23758a1.m69821f(), m109555G().m69821f()));
        }
        m109554E(23);
        throw null;
    }

    @Override // r93.InterfaceC31126h
    /* JADX INFO: renamed from: e */
    public final InterfaceC23796q0 mo60496e() {
        InterfaceC23796q0 interfaceC23796q0Mo60496e = this.f146039w.mo60496e();
        if (this.f146040x.f94122a.mo69908e()) {
            if (interfaceC23796q0Mo60496e != null) {
                return interfaceC23796q0Mo60496e;
            }
            m109554E(0);
            throw null;
        }
        if (this.f146038F == null) {
            C23758a1 c23758a1M109555G = m109555G();
            Collection supertypes = interfaceC23796q0Mo60496e.getSupertypes();
            ArrayList arrayList = new ArrayList(supertypes.size());
            Iterator it = supertypes.iterator();
            while (it.hasNext()) {
                arrayList.add(c23758a1M109555G.m69823i((AbstractC23811y) it.next(), EnumC23776g1.INVARIANT));
            }
            this.f146038F = new C23779i(this, this.f146042z, arrayList, C22342k.f87183e);
        }
        C23779i c23779i = this.f146038F;
        if (c23779i != null) {
            return c23779i;
        }
        m109554E(1);
        throw null;
    }

    @Override // r93.InterfaceC31135k
    /* JADX INFO: renamed from: g */
    public final InterfaceC31135k mo60581g() {
        InterfaceC31135k interfaceC31135kMo60581g = this.f146039w.mo60581g();
        if (interfaceC31135kMo60581g != null) {
            return interfaceC31135kMo60581g;
        }
        m109554E(22);
        throw null;
    }

    @Override // s93.InterfaceC32299a
    public final InterfaceC32307i getAnnotations() {
        InterfaceC32307i annotations = this.f146039w.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        m109554E(19);
        throw null;
    }

    @Override // r93.InterfaceC31117e
    public final Collection getConstructors() {
        Collection<C34682j> constructors = this.f146039w.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.size());
        for (C34682j c34682j : constructors) {
            C34682j c34682j2 = c34682j;
            c34682j2.getClass();
            C34708w c34708wM109631P0 = c34682j2.m109631P0(C23758a1.f94121b);
            c34708wM109631P0.f146162E = c34682j.mo109561I0();
            c34708wM109631P0.mo68179p(c34682j2.mo60498k());
            c34708wM109631P0.mo68184w(c34682j2.getVisibility());
            c34708wM109631P0.mo68172f(c34682j2.getKind());
            c34708wM109631P0.f146170M = false;
            arrayList.add(((C34682j) c34708wM109631P0.f146181X.mo88262M0(c34708wM109631P0)).mo60593d(m109555G()));
        }
        return arrayList;
    }

    @Override // r93.InterfaceC31117e
    public final EnumC31120f getKind() {
        EnumC31120f kind = this.f146039w.getKind();
        if (kind != null) {
            return kind;
        }
        m109554E(25);
        throw null;
    }

    @Override // r93.InterfaceC31135k
    public final C35850h getName() {
        C35850h name = this.f146039w.getName();
        if (name != null) {
            return name;
        }
        m109554E(20);
        throw null;
    }

    @Override // r93.InterfaceC31138l
    public final InterfaceC31155s0 getSource() {
        return InterfaceC31155s0.f128370q;
    }

    @Override // r93.InterfaceC31117e, r93.InterfaceC31168z, r93.InterfaceC31144n
    public final AbstractC31152r getVisibility() {
        AbstractC31152r visibility = this.f146039w.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        m109554E(27);
        throw null;
    }

    @Override // r93.InterfaceC31117e, r93.InterfaceC31126h
    /* JADX INFO: renamed from: i */
    public final AbstractC23763c0 mo60594i() {
        C23784k0 c23784k0M119197l;
        List listM69848d = AbstractC23767d1.m69848d(mo60496e().getParameters());
        InterfaceC32307i annotations = getAnnotations();
        if (annotations.isEmpty()) {
            C23784k0.f94165x.getClass();
            c23784k0M119197l = C23784k0.f94166y;
        } else {
            C37199o c37199o = C23784k0.f94165x;
            List listM118958J = AbstractC37056f.m118958J(new C23774g(annotations));
            c37199o.getClass();
            c23784k0M119197l = C37199o.m119197l(listM118958J);
        }
        return AbstractC23791o.m69892k(listM69848d, mo60489K(), c23784k0M119197l, mo60496e(), false);
    }

    @Override // r93.InterfaceC31168z
    public final boolean isExternal() {
        return this.f146039w.isExternal();
    }

    @Override // r93.InterfaceC31117e
    public final boolean isInline() {
        return this.f146039w.isInline();
    }

    @Override // r93.InterfaceC31129i
    public final boolean isInner() {
        return this.f146039w.isInner();
    }

    @Override // r93.InterfaceC31117e
    public final boolean isValue() {
        return this.f146039w.isValue();
    }

    @Override // r93.InterfaceC31117e, r93.InterfaceC31129i
    /* JADX INFO: renamed from: j */
    public final List mo60497j() {
        m109555G();
        ArrayList arrayList = this.f146037E;
        if (arrayList != null) {
            return arrayList;
        }
        m109554E(30);
        throw null;
    }

    @Override // r93.InterfaceC31117e, r93.InterfaceC31168z
    /* JADX INFO: renamed from: k */
    public final EnumC31106a0 mo60498k() {
        EnumC31106a0 enumC31106a0Mo60498k = this.f146039w.mo60498k();
        if (enumC31106a0Mo60498k != null) {
            return enumC31106a0Mo60498k;
        }
        m109554E(26);
        throw null;
    }

    @Override // u93.AbstractC34669c0
    /* JADX INFO: renamed from: l */
    public final InterfaceC22712o mo60499l(C25389f c25389f) {
        InterfaceC22712o interfaceC22712oMo60499l = this.f146039w.mo60499l(c25389f);
        if (!this.f146040x.f94122a.mo69908e()) {
            return new C22717t(interfaceC22712oMo60499l, m109555G());
        }
        if (interfaceC22712oMo60499l != null) {
            return interfaceC22712oMo60499l;
        }
        m109554E(14);
        throw null;
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: n */
    public final InterfaceC22712o mo95863n(AbstractC23812y0 abstractC23812y0) {
        AbstractC4393e.m13811i(AbstractC39363f.m125521c(this));
        return mo78653b(abstractC23812y0, C25389f.f99474a);
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: o0 */
    public final boolean mo60500o0() {
        return this.f146039w.mo60500o0();
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: q0 */
    public final InterfaceC31151q0 mo95864q0() {
        throw new UnsupportedOperationException();
    }

    @Override // r93.InterfaceC31117e
    /* JADX INFO: renamed from: s */
    public final C34682j mo60501s() {
        return this.f146039w.mo60501s();
    }
}
