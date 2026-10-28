package xa3;

import ab3.AbstractC0715g;
import ab3.AbstractC0727s;
import ab3.C0709a;
import ab3.C0710b;
import ab3.C0725q;
import ab3.C0726r;
import ab3.C0728t;
import cb3.AbstractC4393e;
import com.squareup.wire.AbstractC5583n;
import fa3.C14328u;
import io.sentry.config.AbstractC20301a;
import j93.InterfaceC21493z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kb3.C22340i;
import kb3.EnumC22341j;
import l83.C23470p;
import lb3.AbstractC23763c0;
import lb3.AbstractC23767d1;
import lb3.AbstractC23773f1;
import lb3.AbstractC23791o;
import lb3.AbstractC23797r;
import lb3.AbstractC23804u0;
import lb3.AbstractC23811y;
import lb3.C23756a;
import lb3.C23785l;
import lb3.C23809x;
import lb3.C23813z;
import lb3.InterfaceC23796q0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import nb3.C26552i;
import nb3.C26553j;
import nb3.C26555l;
import nb3.EnumC26554k;
import o93.AbstractC27736h;
import o93.AbstractC27741m;
import p014aj.C0929d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p108e4.C12669c;
import p249jc.AbstractC21598x;
import p484s9.AbstractC32281f;
import p557vo.AbstractC36221c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29938w0;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import r93.AbstractC31146o;
import r93.AbstractC31150q;
import r93.AbstractC31152r;
import r93.C31121f0;
import r93.EnumC31106a0;
import r93.EnumC31120f;
import r93.InterfaceC31107a1;
import r93.InterfaceC31108b;
import r93.InterfaceC31109b0;
import r93.InterfaceC31110b1;
import r93.InterfaceC31111c;
import r93.InterfaceC31117e;
import r93.InterfaceC31124g0;
import r93.InterfaceC31126h;
import r93.InterfaceC31129i;
import r93.InterfaceC31135k;
import r93.InterfaceC31136k0;
import r93.InterfaceC31138l;
import r93.InterfaceC31145n0;
import r93.InterfaceC31149p0;
import r93.InterfaceC31151q0;
import r93.InterfaceC31163w0;
import r93.InterfaceC31165x0;
import r93.InterfaceC31168z;
import s93.EnumC32302d;
import s93.InterfaceC32299a;
import s93.InterfaceC32300b;
import sb3.AbstractC32350a;
import u93.AbstractC34670d;
import u93.AbstractC34690n;
import u93.AbstractC34711x0;
import u93.C34682j;
import u93.C34691n0;
import u93.C34693o0;
import u93.C34706v;
import u93.C34709w0;
import v20.C35567g;
import v63.AbstractC35744b;
import va3.AbstractC35846d;
import va3.C35848f;
import va3.C35850h;
import wb3.AbstractC37056f;
import ya3.AbstractC39363f;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: xa3.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C38148i implements InterfaceC38150k {

    /* JADX INFO: renamed from: c */
    public static final C38148i f163318c;

    /* JADX INFO: renamed from: d */
    public static final C38148i f163319d;

    /* JADX INFO: renamed from: e */
    public static final C38148i f163320e;

    /* JADX INFO: renamed from: a */
    public final C38151l f163321a;

    /* JADX INFO: renamed from: b */
    public final C23470p f163322b = AbstractC30060g.m92088H(new C14328u(this, 14));

    static {
        AbstractC36221c.m115323d(C38143d.f163303x);
        AbstractC36221c.m115323d(C38143d.f163305z);
        AbstractC36221c.m115323d(C38143d.f163293E);
        AbstractC36221c.m115323d(C38143d.f163294F);
        AbstractC36221c.m115323d(C38143d.f163295G);
        AbstractC36221c.m115323d(C38143d.f163296H);
        f163318c = AbstractC36221c.m115323d(C38143d.f163297I);
        AbstractC36221c.m115323d(C38143d.f163298J);
        f163319d = AbstractC36221c.m115323d(C38143d.f163299K);
        f163320e = AbstractC36221c.m115323d(C38143d.f163300L);
        AbstractC36221c.m115323d(C38143d.f163304y);
    }

    public C38148i(C38151l c38151l) {
        this.f163321a = c38151l;
    }

    /* JADX INFO: renamed from: W */
    public static void m122161W(StringBuilder sb4) {
        int length = sb4.length();
        if (length == 0 || sb4.charAt(length - 1) != ' ') {
            sb4.append(' ');
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m122162i0(AbstractC23811y abstractC23811y) {
        if (!AbstractC5583n.m16756P(abstractC23811y)) {
            return false;
        }
        List listMo69842X = abstractC23811y.mo69842X();
        if ((listMo69842X instanceof Collection) && listMo69842X.isEmpty()) {
            return true;
        }
        Iterator it = listMo69842X.iterator();
        while (it.hasNext()) {
            if (((AbstractC23804u0) it.next()).mo69869c()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public static final void m122163o(C38148i c38148i, InterfaceC31145n0 interfaceC31145n0, StringBuilder sb4) {
        boolean zM122215r = c38148i.m122215r();
        C38151l c38151l = c38148i.f163321a;
        if (!zM122215r) {
            C12669c c12669c = c38151l.f163372g;
            InterfaceC21493z[] interfaceC21493zArr = C38151l.f163341Y;
            if (!((Boolean) c12669c.getValue(c38151l, interfaceC21493zArr[5])).booleanValue()) {
                List listMo78671c0 = interfaceC31145n0.mo78671c0();
                AbstractC22676k.m65749i(listMo78671c0, "getContextReceiverParameters(...)");
                c38148i.m122168C(sb4, listMo78671c0);
                if (c38148i.m122214q().contains(EnumC38149j.ANNOTATIONS)) {
                    c38148i.m122221y(sb4, interfaceC31145n0, null);
                    C34706v c34706vMo78670b0 = interfaceC31145n0.mo78670b0();
                    if (c34706vMo78670b0 != null) {
                        c38148i.m122221y(sb4, c34706vMo78670b0, EnumC32302d.FIELD);
                    }
                    C34706v c34706vMo78668C = interfaceC31145n0.mo78668C();
                    if (c34706vMo78668C != null) {
                        c38148i.m122221y(sb4, c34706vMo78668C, EnumC32302d.PROPERTY_DELEGATE_FIELD);
                    }
                    if (((EnumC38156q) c38151l.f163349H.getValue(c38151l, interfaceC21493zArr[32])) == EnumC38156q.f163402x) {
                        C34691n0 getter = interfaceC31145n0.getGetter();
                        if (getter != null) {
                            c38148i.m122221y(sb4, getter, EnumC32302d.PROPERTY_GETTER);
                        }
                        InterfaceC31149p0 setter = interfaceC31145n0.getSetter();
                        if (setter != null) {
                            c38148i.m122221y(sb4, setter, EnumC32302d.PROPERTY_SETTER);
                            List listMo78676v = ((C34693o0) setter).mo78676v();
                            AbstractC22676k.m65749i(listMo78676v, "getValueParameters(...)");
                            InterfaceC31107a1 interfaceC31107a1 = (InterfaceC31107a1) AbstractC25265s.m74142p1(listMo78676v);
                            AbstractC22676k.m65747g(interfaceC31107a1);
                            c38148i.m122221y(sb4, interfaceC31107a1, EnumC32302d.SETTER_PARAMETER);
                        }
                    }
                }
                AbstractC31152r visibility = interfaceC31145n0.getVisibility();
                AbstractC22676k.m65749i(visibility, "getVisibility(...)");
                c38148i.m122204g0(visibility, sb4);
                c38148i.m122179N(sb4, c38148i.m122214q().contains(EnumC38149j.CONST) && interfaceC31145n0.isConst(), "const");
                c38148i.m122176K(interfaceC31145n0, sb4);
                c38148i.m122178M(interfaceC31145n0, sb4);
                c38148i.m122184S(interfaceC31145n0, sb4);
                c38148i.m122179N(sb4, c38148i.m122214q().contains(EnumC38149j.LATEINIT) && interfaceC31145n0.mo78672d0(), "lateinit");
                c38148i.m122175J(interfaceC31145n0, sb4);
            }
            c38148i.m122198d0(interfaceC31145n0, sb4, false);
            List typeParameters = interfaceC31145n0.getTypeParameters();
            AbstractC22676k.m65749i(typeParameters, "getTypeParameters(...)");
            c38148i.m122196c0(typeParameters, sb4, true);
            c38148i.m122186U(interfaceC31145n0, sb4);
        }
        c38148i.m122181P(interfaceC31145n0, sb4, true);
        sb4.append(": ");
        AbstractC23811y type = interfaceC31145n0.getType();
        AbstractC22676k.m65749i(type, "getType(...)");
        sb4.append(c38148i.m122188X(type));
        c38148i.m122187V(interfaceC31145n0, sb4);
        c38148i.m122173H(interfaceC31145n0, sb4);
        List typeParameters2 = interfaceC31145n0.getTypeParameters();
        AbstractC22676k.m65749i(typeParameters2, "getTypeParameters(...)");
        c38148i.m122206h0(sb4, typeParameters2);
    }

    /* JADX INFO: renamed from: v */
    public static EnumC31106a0 m122164v(InterfaceC31168z interfaceC31168z) {
        if (interfaceC31168z instanceof InterfaceC31117e) {
            return ((InterfaceC31117e) interfaceC31168z).getKind() == EnumC31120f.f128329x ? EnumC31106a0.f128307E : EnumC31106a0.f128310x;
        }
        InterfaceC31135k interfaceC31135kMo60581g = interfaceC31168z.mo60581g();
        InterfaceC31117e interfaceC31117e = interfaceC31135kMo60581g instanceof InterfaceC31117e ? (InterfaceC31117e) interfaceC31135kMo60581g : null;
        if (interfaceC31117e != null && (interfaceC31168z instanceof InterfaceC31111c)) {
            InterfaceC31111c interfaceC31111c = (InterfaceC31111c) interfaceC31168z;
            Collection collectionMo78673h = interfaceC31111c.mo78673h();
            AbstractC22676k.m65749i(collectionMo78673h, "getOverriddenDescriptors(...)");
            if (!collectionMo78673h.isEmpty() && interfaceC31117e.mo60498k() != EnumC31106a0.f128310x) {
                return EnumC31106a0.f128312z;
            }
            if (interfaceC31117e.getKind() != EnumC31120f.f128329x || AbstractC22676k.m65745e(interfaceC31111c.getVisibility(), AbstractC31150q.f128349a)) {
                return EnumC31106a0.f128310x;
            }
            EnumC31106a0 enumC31106a0Mo60498k = interfaceC31111c.mo60498k();
            EnumC31106a0 enumC31106a0 = EnumC31106a0.f128307E;
            return enumC31106a0Mo60498k == enumC31106a0 ? enumC31106a0 : EnumC31106a0.f128312z;
        }
        return EnumC31106a0.f128310x;
    }

    /* JADX INFO: renamed from: A */
    public final void m122166A(InterfaceC31129i interfaceC31129i, StringBuilder sb4) {
        List listMo60497j = interfaceC31129i.mo60497j();
        AbstractC22676k.m65749i(listMo60497j, "getDeclaredTypeParameters(...)");
        List parameters = interfaceC31129i.mo60496e().getParameters();
        AbstractC22676k.m65749i(parameters, "getParameters(...)");
        if (m122218u() && interfaceC31129i.isInner() && parameters.size() > listMo60497j.size()) {
            sb4.append(" /*captured type parameters: ");
            m122194b0(sb4, parameters.subList(listMo60497j.size(), parameters.size()));
            sb4.append("*/");
        }
    }

    /* JADX INFO: renamed from: B */
    public final String m122167B(AbstractC0715g abstractC0715g) {
        C38151l c38151l = this.f163321a;
        Function1 function1 = (Function1) c38151l.f163387v.getValue(c38151l, C38151l.f163341Y[20]);
        if (function1 != null) {
            return (String) function1.invoke(abstractC0715g);
        }
        if (abstractC0715g instanceof C0710b) {
            Iterable iterable = (Iterable) ((C0710b) abstractC0715g).mo1777b();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strM122167B = m122167B((AbstractC0715g) it.next());
                if (strM122167B != null) {
                    arrayList.add(strM122167B);
                }
            }
            return AbstractC25265s.m74110N0(arrayList, ", ", "{", "}", null, 56);
        }
        if (abstractC0715g instanceof C0709a) {
            return AbstractC39414r.m125898q0(m122220x((InterfaceC32300b) ((C0709a) abstractC0715g).mo1777b(), null), "@");
        }
        if (!(abstractC0715g instanceof C0728t)) {
            return abstractC0715g.toString();
        }
        AbstractC0727s abstractC0727s = (AbstractC0727s) ((C0728t) abstractC0715g).mo1777b();
        if (abstractC0727s instanceof C0725q) {
            return ((C0725q) abstractC0727s).m1786a() + "::class";
        }
        if (!(abstractC0727s instanceof C0726r)) {
            throw new NoWhenBranchMatchedException();
        }
        C0726r c0726r = (C0726r) abstractC0727s;
        String strM95633i = c0726r.m1788b().m113773a().f152613a.f152616a;
        int iM1787a = c0726r.m1787a();
        for (int i13 = 0; i13 < iM1787a; i13++) {
            strM95633i = AbstractC31061c.m95633i('>', "kotlin.Array<", strM95633i);
        }
        return AbstractC2875y.m8299l(strM95633i, "::class");
    }

    /* JADX INFO: renamed from: C */
    public final void m122168C(StringBuilder sb4, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb4.append("context(");
        Iterator it = list.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            int i14 = i13 + 1;
            AbstractC23811y type = ((AbstractC34670d) ((InterfaceC31151q0) it.next())).getType();
            AbstractC22676k.m65749i(type, "getType(...)");
            sb4.append(m122172G(type, true));
            if (i13 == AbstractC37056f.m118951C(list)) {
                sb4.append(") ");
            } else {
                sb4.append(", ");
            }
            i13 = i14;
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m122169D(StringBuilder sb4, AbstractC23763c0 abstractC23763c0) {
        m122221y(sb4, abstractC23763c0, null);
        if (AbstractC23791o.m69886e(abstractC23763c0)) {
            boolean zM56315N = AbstractC20301a.m56315N(abstractC23763c0);
            C38151l c38151l = this.f163321a;
            if (zM56315N && ((Boolean) c38151l.f163363V.getValue(c38151l, C38151l.f163341Y[47])).booleanValue()) {
                C26555l c26555l = C26555l.f105564a;
                AbstractC20301a.m56315N(abstractC23763c0);
                InterfaceC23796q0 interfaceC23796q0Mo69844i0 = abstractC23763c0.mo69844i0();
                AbstractC22676k.m65748h(interfaceC23796q0Mo69844i0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                sb4.append(m122170E(((C26553j) interfaceC23796q0Mo69844i0).f105530x[0]));
            } else {
                if (!(abstractC23763c0 instanceof C26552i) || ((Boolean) c38151l.f163365X.getValue(c38151l, C38151l.f163341Y[49])).booleanValue()) {
                    sb4.append(abstractC23763c0.mo69844i0().toString());
                } else {
                    sb4.append(((C26552i) abstractC23763c0).f105525H);
                }
                sb4.append(m122189Y(abstractC23763c0.mo69842X()));
            }
        } else {
            InterfaceC23796q0 interfaceC23796q0Mo69844i1 = abstractC23763c0.mo69844i0();
            InterfaceC31126h interfaceC31126hMo1784d = abstractC23763c0.mo69844i0().mo1784d();
            C29938w0 c29938w0M60686k = AbstractC21598x.m60686k(abstractC23763c0, interfaceC31126hMo1784d instanceof InterfaceC31129i ? (InterfaceC31129i) interfaceC31126hMo1784d : null, 0);
            if (c29938w0M60686k == null) {
                sb4.append(m122190Z(interfaceC23796q0Mo69844i1));
                sb4.append(m122189Y(abstractC23763c0.mo69842X()));
            } else {
                m122185T(sb4, c29938w0M60686k);
            }
        }
        if (abstractC23763c0.mo69814k0()) {
            sb4.append("?");
        }
        if (abstractC23763c0 instanceof C23785l) {
            sb4.append(" & Any");
        }
    }

    /* JADX INFO: renamed from: E */
    public final String m122170E(String str) {
        int iOrdinal = m122216s().ordinal();
        if (iOrdinal == 0) {
            return str;
        }
        if (iOrdinal == 1) {
            return AbstractC11895b.m31996o("<font color=red><b>", str, "</b></font>");
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: F */
    public final String m122171F(String lowerRendered, String upperRendered, AbstractC27736h abstractC27736h) {
        AbstractC22676k.m65750j(lowerRendered, "lowerRendered");
        AbstractC22676k.m65750j(upperRendered, "upperRendered");
        if (AbstractC35744b.m113240m(lowerRendered, upperRendered)) {
            return AbstractC39421y.m125930O(upperRendered, "(", false) ? AbstractC11895b.m31996o("(", lowerRendered, ")!") : lowerRendered.concat("!");
        }
        String strM113236i = AbstractC35744b.m113236i(lowerRendered, upperRendered, new C38145f(this, abstractC27736h, 0), new C38145f(this, abstractC27736h, 1), new C35567g(this));
        if (strM113236i != null) {
            return strM113236i;
        }
        return "(" + lowerRendered + ".." + upperRendered + ')';
    }

    /* JADX INFO: renamed from: G */
    public final String m122172G(AbstractC23811y abstractC23811y, boolean z4) {
        String strM122188X = m122188X(abstractC23811y);
        return ((!m122162i0(abstractC23811y) || AbstractC23767d1.m69849e(abstractC23811y)) && !(abstractC23811y instanceof C23785l) && (!z4 || abstractC23811y.getAnnotations().isEmpty())) ? strM122188X : AbstractC31061c.m95633i(')', "(", strM122188X);
    }

    /* JADX INFO: renamed from: H */
    public final void m122173H(InterfaceC31110b1 interfaceC31110b1, StringBuilder sb4) {
        AbstractC0715g abstractC0715gMo78669W;
        String strM122167B;
        C38151l c38151l = this.f163321a;
        if (!((Boolean) c38151l.f163386u.getValue(c38151l, C38151l.f163341Y[19])).booleanValue() || (abstractC0715gMo78669W = interfaceC31110b1.mo78669W()) == null || (strM122167B = m122167B(abstractC0715gMo78669W)) == null) {
            return;
        }
        sb4.append(" = ");
        sb4.append(m122213p(strM122167B));
    }

    /* JADX INFO: renamed from: I */
    public final String m122174I(String str) {
        int iOrdinal = m122216s().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            C38151l c38151l = this.f163321a;
            if (!((Boolean) c38151l.f163364W.getValue(c38151l, C38151l.f163341Y[48])).booleanValue()) {
                return AbstractC11895b.m31996o("<b>", str, "</b>");
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: J */
    public final void m122175J(InterfaceC31111c interfaceC31111c, StringBuilder sb4) {
        if (m122214q().contains(EnumC38149j.MEMBER_KIND) && m122218u() && interfaceC31111c.getKind() != 1) {
            sb4.append("/*");
            sb4.append(AbstractC32350a.m100713u(AbstractC30007c.m91828C(interfaceC31111c.getKind())));
            sb4.append("*/ ");
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m122176K(InterfaceC31168z interfaceC31168z, StringBuilder sb4) {
        m122179N(sb4, interfaceC31168z.isExternal(), "external");
        boolean z4 = false;
        m122179N(sb4, m122214q().contains(EnumC38149j.EXPECT) && interfaceC31168z.mo60493U(), "expect");
        if (m122214q().contains(EnumC38149j.ACTUAL) && interfaceC31168z.mo60490L()) {
            z4 = true;
        }
        m122179N(sb4, z4, "actual");
    }

    /* JADX INFO: renamed from: L */
    public final void m122177L(EnumC31106a0 enumC31106a0, StringBuilder sb4, EnumC31106a0 enumC31106a1) {
        C38151l c38151l = this.f163321a;
        if (((Boolean) c38151l.f163381p.getValue(c38151l, C38151l.f163341Y[14])).booleanValue() || enumC31106a0 != enumC31106a1) {
            m122179N(sb4, m122214q().contains(EnumC38149j.MODALITY), AbstractC32350a.m100713u(enumC31106a0.name()));
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m122178M(InterfaceC31111c interfaceC31111c, StringBuilder sb4) {
        if (AbstractC39363f.m125535q(interfaceC31111c) && interfaceC31111c.mo60498k() == EnumC31106a0.f128310x) {
            return;
        }
        C38151l c38151l = this.f163321a;
        if (((EnumC38154o) c38151l.f163343B.getValue(c38151l, C38151l.f163341Y[26])) == EnumC38154o.f163394w && interfaceC31111c.mo60498k() == EnumC31106a0.f128312z && !interfaceC31111c.mo78673h().isEmpty()) {
            return;
        }
        EnumC31106a0 enumC31106a0Mo60498k = interfaceC31111c.mo60498k();
        AbstractC22676k.m65749i(enumC31106a0Mo60498k, "getModality(...)");
        m122177L(enumC31106a0Mo60498k, sb4, m122164v(interfaceC31111c));
    }

    /* JADX INFO: renamed from: N */
    public final void m122179N(StringBuilder sb4, boolean z4, String str) {
        if (z4) {
            sb4.append(m122174I(str));
            sb4.append(" ");
        }
    }

    /* JADX INFO: renamed from: O */
    public final String m122180O(C35850h c35850h, boolean z4) {
        String strM122213p = m122213p(AbstractC35744b.m113235h(c35850h));
        C38151l c38151l = this.f163321a;
        return (((Boolean) c38151l.f163364W.getValue(c38151l, C38151l.f163341Y[48])).booleanValue() && m122216s() == EnumC38159t.f163405x && z4) ? AbstractC11895b.m31996o("<b>", strM122213p, "</b>") : strM122213p;
    }

    /* JADX INFO: renamed from: P */
    public final void m122181P(InterfaceC31135k interfaceC31135k, StringBuilder sb4, boolean z4) {
        C35850h name = interfaceC31135k.getName();
        AbstractC22676k.m65749i(name, "getName(...)");
        sb4.append(m122180O(name, z4));
    }

    /* JADX INFO: renamed from: Q */
    public final void m122182Q(StringBuilder sb4, AbstractC23811y abstractC23811y) throws IOException {
        AbstractC23773f1 abstractC23773f1Mo69863p0 = abstractC23811y.mo69863p0();
        C23756a c23756a = abstractC23773f1Mo69863p0 instanceof C23756a ? (C23756a) abstractC23773f1Mo69863p0 : null;
        if (c23756a == null) {
            m122183R(sb4, abstractC23811y);
            return;
        }
        C38151l c38151l = this.f163321a;
        C12669c c12669c = c38151l.f163359R;
        InterfaceC21493z[] interfaceC21493zArr = C38151l.f163341Y;
        if (((Boolean) c12669c.getValue(c38151l, interfaceC21493zArr[42])).booleanValue()) {
            m122183R(sb4, c23756a.m69805A0());
            if (((Boolean) c38151l.f163360S.getValue(c38151l, interfaceC21493zArr[43])).booleanValue()) {
                EnumC38159t enumC38159tM122216s = m122216s();
                C38157r c38157r = EnumC38159t.f163405x;
                if (enumC38159tM122216s == c38157r) {
                    sb4.append("<font color=\"808080\"><i>");
                }
                sb4.append(" /* ");
                sb4.append("from: ");
                m122183R(sb4, c23756a.m69813z0());
                sb4.append(" */");
                if (m122216s() == c38157r) {
                    sb4.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        m122183R(sb4, c23756a.m69813z0());
        if (((Boolean) c38151l.f163358Q.getValue(c38151l, interfaceC21493zArr[41])).booleanValue()) {
            EnumC38159t enumC38159tM122216s2 = m122216s();
            C38157r c38157r2 = EnumC38159t.f163405x;
            if (enumC38159tM122216s2 == c38157r2) {
                sb4.append("<font color=\"808080\"><i>");
            }
            sb4.append(" /* ");
            sb4.append("= ");
            m122183R(sb4, c23756a.m69805A0());
            sb4.append(" */");
            if (m122216s() == c38157r2) {
                sb4.append("</i></font>");
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m122183R(StringBuilder sb4, AbstractC23811y abstractC23811y) throws IOException {
        C35850h c35850hM16796w;
        String strM122213p;
        C38151l c38151l = this.f163321a;
        if ((abstractC23811y instanceof C23813z) && c38151l.m122222o()) {
            C22340i c22340i = ((C23813z) abstractC23811y).f94212z;
            if (c22340i.f87177y == EnumC22341j.f87178w || c22340i.f87177y == EnumC22341j.f87179x) {
                sb4.append("<Not computed yet>");
                return;
            }
        }
        AbstractC23773f1 abstractC23773f1Mo69863p0 = abstractC23811y.mo69863p0();
        if (abstractC23773f1Mo69863p0 instanceof AbstractC23797r) {
            sb4.append(((AbstractC23797r) abstractC23773f1Mo69863p0).mo64130v0(this, this));
            return;
        }
        if (!(abstractC23773f1Mo69863p0 instanceof AbstractC23763c0)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC23763c0 abstractC23763c0 = (AbstractC23763c0) abstractC23773f1Mo69863p0;
        if (abstractC23763c0.equals(AbstractC23767d1.f94138b) || abstractC23763c0.mo69844i0() == AbstractC23767d1.f94137a.f105526x) {
            sb4.append("???");
            return;
        }
        InterfaceC23796q0 interfaceC23796q0Mo69844i0 = abstractC23763c0.mo69844i0();
        if ((interfaceC23796q0Mo69844i0 instanceof C26553j) && ((C26553j) interfaceC23796q0Mo69844i0).f105529w == EnumC26554k.UNINFERRED_TYPE_VARIABLE) {
            if (!((Boolean) c38151l.f163385t.getValue(c38151l, C38151l.f163341Y[18])).booleanValue()) {
                sb4.append("???");
                return;
            }
            InterfaceC23796q0 interfaceC23796q0Mo69844i1 = abstractC23763c0.mo69844i0();
            AbstractC22676k.m65748h(interfaceC23796q0Mo69844i1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
            sb4.append(m122170E(((C26553j) interfaceC23796q0Mo69844i1).f105530x[0]));
            return;
        }
        if (AbstractC23791o.m69886e(abstractC23763c0)) {
            m122169D(sb4, abstractC23763c0);
            return;
        }
        if (!m122162i0(abstractC23763c0)) {
            m122169D(sb4, abstractC23763c0);
            return;
        }
        int length = sb4.length();
        ((C38148i) this.f163322b.getValue()).m122221y(sb4, abstractC23763c0, null);
        boolean z4 = sb4.length() != length;
        AbstractC23811y abstractC23811yM16752L = AbstractC5583n.m16752L(abstractC23763c0);
        List listM16746E = AbstractC5583n.m16746E(abstractC23763c0);
        boolean zM16758R = AbstractC5583n.m16758R(abstractC23763c0);
        boolean zMo69814k0 = abstractC23763c0.mo69814k0();
        boolean z13 = zMo69814k0 || (z4 && abstractC23811yM16752L != null);
        if (z13) {
            if (zM16758R) {
                sb4.insert(length, '(');
            } else {
                if (z4) {
                    AbstractC35846d.m113784i(AbstractC39414r.m125891j0(sb4));
                    if (sb4.charAt(AbstractC39414r.m125884c0(sb4) - 1) != ')') {
                        sb4.insert(AbstractC39414r.m125884c0(sb4), "()");
                    }
                }
                sb4.append("(");
            }
        }
        m122179N(sb4, zM16758R, "suspend");
        if (!listM16746E.isEmpty()) {
            sb4.append("context(");
            Iterator it = listM16746E.subList(0, AbstractC37056f.m118951C(listM16746E)).iterator();
            while (it.hasNext()) {
                m122182Q(sb4, (AbstractC23811y) it.next());
                sb4.append(", ");
            }
            m122182Q(sb4, (AbstractC23811y) AbstractC25265s.m74112P0(listM16746E));
            sb4.append(") ");
        }
        if (abstractC23811yM16752L != null) {
            boolean z14 = (m122162i0(abstractC23811yM16752L) && !abstractC23811yM16752L.mo69814k0()) || AbstractC5583n.m16758R(abstractC23811yM16752L) || !abstractC23811yM16752L.getAnnotations().isEmpty() || (abstractC23811yM16752L instanceof C23785l);
            if (z14) {
                sb4.append("(");
            }
            m122182Q(sb4, abstractC23811yM16752L);
            if (z14) {
                sb4.append(")");
            }
            sb4.append(".");
        }
        sb4.append("(");
        if (!AbstractC5583n.m16755O(abstractC23763c0) || abstractC23763c0.mo69842X().size() > 1) {
            int i13 = 0;
            for (AbstractC23804u0 typeProjection : AbstractC5583n.m16754N(abstractC23763c0)) {
                int i14 = i13 + 1;
                if (i13 > 0) {
                    sb4.append(", ");
                }
                if (((Boolean) c38151l.f163362U.getValue(c38151l, C38151l.f163341Y[45])).booleanValue()) {
                    AbstractC23811y abstractC23811yMo69868b = typeProjection.mo69868b();
                    AbstractC22676k.m65749i(abstractC23811yMo69868b, "getType(...)");
                    c35850hM16796w = AbstractC5583n.m16796w(abstractC23811yMo69868b);
                } else {
                    c35850hM16796w = null;
                }
                if (c35850hM16796w != null) {
                    sb4.append(m122180O(c35850hM16796w, false));
                    sb4.append(": ");
                }
                AbstractC22676k.m65750j(typeProjection, "typeProjection");
                StringBuilder sb5 = new StringBuilder();
                AbstractC25265s.m74109M0(AbstractC37056f.m118958J(typeProjection), sb5, ", ", null, null, new C38147h(this, 0), 60);
                sb4.append(sb5.toString());
                i13 = i14;
            }
        } else {
            sb4.append("???");
        }
        sb4.append(") ");
        int iOrdinal = m122216s().ordinal();
        if (iOrdinal == 0) {
            strM122213p = m122213p("->");
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            strM122213p = "&rarr;";
        }
        sb4.append(strM122213p);
        sb4.append(" ");
        m122182Q(sb4, AbstractC5583n.m16753M(abstractC23763c0));
        if (z13) {
            sb4.append(")");
        }
        if (zMo69814k0) {
            sb4.append("?");
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m122184S(InterfaceC31111c interfaceC31111c, StringBuilder sb4) {
        if (m122214q().contains(EnumC38149j.OVERRIDE) && !interfaceC31111c.mo78673h().isEmpty()) {
            C38151l c38151l = this.f163321a;
            if (((EnumC38154o) c38151l.f163343B.getValue(c38151l, C38151l.f163341Y[26])) != EnumC38154o.f163395x) {
                m122179N(sb4, true, "override");
                if (m122218u()) {
                    sb4.append("/*");
                    sb4.append(interfaceC31111c.mo78673h().size());
                    sb4.append("*/ ");
                }
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m122185T(StringBuilder sb4, C29938w0 c29938w0) {
        C29938w0 c29938w0M91571u = c29938w0.m91571u();
        if (c29938w0M91571u != null) {
            m122185T(sb4, c29938w0M91571u);
            sb4.append('.');
            C35850h name = c29938w0.m91569s().getName();
            AbstractC22676k.m65749i(name, "getName(...)");
            sb4.append(m122180O(name, false));
        } else {
            InterfaceC23796q0 interfaceC23796q0Mo60496e = c29938w0.m91569s().mo60496e();
            AbstractC22676k.m65749i(interfaceC23796q0Mo60496e, "getTypeConstructor(...)");
            sb4.append(m122190Z(interfaceC23796q0Mo60496e));
        }
        sb4.append(m122189Y(c29938w0.m91568r()));
    }

    /* JADX INFO: renamed from: U */
    public final void m122186U(InterfaceC31111c interfaceC31111c, StringBuilder sb4) {
        InterfaceC31151q0 interfaceC31151q0Mo78667B = interfaceC31111c.mo78667B();
        if (interfaceC31151q0Mo78667B != null) {
            m122221y(sb4, interfaceC31151q0Mo78667B, EnumC32302d.RECEIVER);
            AbstractC23811y type = ((AbstractC34670d) interfaceC31151q0Mo78667B).getType();
            AbstractC22676k.m65749i(type, "getType(...)");
            sb4.append(m122172G(type, false));
            sb4.append(".");
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m122187V(InterfaceC31111c interfaceC31111c, StringBuilder sb4) {
        InterfaceC31151q0 interfaceC31151q0Mo78667B;
        C38151l c38151l = this.f163321a;
        if (((Boolean) c38151l.f163347F.getValue(c38151l, C38151l.f163341Y[30])).booleanValue() && (interfaceC31151q0Mo78667B = interfaceC31111c.mo78667B()) != null) {
            sb4.append(" on ");
            AbstractC23811y type = ((AbstractC34670d) interfaceC31151q0Mo78667B).getType();
            AbstractC22676k.m65749i(type, "getType(...)");
            sb4.append(m122188X(type));
        }
    }

    /* JADX INFO: renamed from: X */
    public final String m122188X(AbstractC23811y type) {
        AbstractC22676k.m65750j(type, "type");
        StringBuilder sb4 = new StringBuilder();
        C38151l c38151l = this.f163321a;
        m122182Q(sb4, (AbstractC23811y) ((Function1) c38151l.f163390y.getValue(c38151l, C38151l.f163341Y[23])).invoke(type));
        return sb4.toString();
    }

    /* JADX INFO: renamed from: Y */
    public final String m122189Y(List typeArguments) throws IOException {
        AbstractC22676k.m65750j(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(m122213p("<"));
        AbstractC25265s.m74109M0(typeArguments, sb4, ", ", null, null, new C38147h(this, 0), 60);
        sb4.append(m122213p(">"));
        return sb4.toString();
    }

    /* JADX INFO: renamed from: Z */
    public final String m122190Z(InterfaceC23796q0 typeConstructor) {
        AbstractC22676k.m65750j(typeConstructor, "typeConstructor");
        InterfaceC31126h klass = typeConstructor.mo1784d();
        if ((klass instanceof InterfaceC31165x0) || (klass instanceof InterfaceC31117e) || (klass instanceof InterfaceC31163w0)) {
            AbstractC22676k.m65750j(klass, "klass");
            if (C26555l.m78685f(klass)) {
                return klass.mo60496e().toString();
            }
            C38151l c38151l = this.f163321a;
            return ((InterfaceC38142c) c38151l.f163367b.getValue(c38151l, C38151l.f163341Y[0])).mo122160a(klass, this);
        }
        if (klass == null) {
            return typeConstructor instanceof C23809x ? ((C23809x) typeConstructor).m69913e(C38146g.f163312x) : typeConstructor.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + klass.getClass()).toString());
    }

    @Override // xa3.InterfaceC38150k
    /* JADX INFO: renamed from: a */
    public final void mo122191a() {
        this.f163321a.mo122191a();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m122192a0(InterfaceC31165x0 interfaceC31165x0, StringBuilder sb4, boolean z4) {
        if (z4) {
            sb4.append(m122213p("<"));
        }
        if (m122218u()) {
            sb4.append("/*");
            sb4.append(interfaceC31165x0.getIndex());
            sb4.append("*/ ");
        }
        m122179N(sb4, interfaceC31165x0.isReified(), "reified");
        String str = interfaceC31165x0.getVariance().f94154w;
        boolean z13 = true;
        m122179N(sb4, str.length() > 0, str);
        m122221y(sb4, interfaceC31165x0, null);
        m122181P(interfaceC31165x0, sb4, z4);
        int size = interfaceC31165x0.getUpperBounds().size();
        if ((size > 1 && !z4) || size == 1) {
            AbstractC23811y abstractC23811y = (AbstractC23811y) interfaceC31165x0.getUpperBounds().iterator().next();
            if (abstractC23811y == null) {
                AbstractC27736h.m83809a(141);
                throw null;
            }
            if (!AbstractC27736h.m83813y(abstractC23811y) || !abstractC23811y.mo69814k0()) {
                sb4.append(" : ");
                sb4.append(m122188X(abstractC23811y));
            }
        } else if (z4) {
            for (AbstractC23811y abstractC23811y2 : interfaceC31165x0.getUpperBounds()) {
                if (abstractC23811y2 == null) {
                    AbstractC27736h.m83809a(141);
                    throw null;
                }
                if (!AbstractC27736h.m83813y(abstractC23811y2) || !abstractC23811y2.mo69814k0()) {
                    if (z13) {
                        sb4.append(" : ");
                    } else {
                        sb4.append(" & ");
                    }
                    sb4.append(m122188X(abstractC23811y2));
                    z13 = false;
                }
            }
        }
        if (z4) {
            sb4.append(m122213p(">"));
        }
    }

    @Override // xa3.InterfaceC38150k
    /* JADX INFO: renamed from: b */
    public final void mo122193b() {
        this.f163321a.mo122193b();
    }

    /* JADX INFO: renamed from: b0 */
    public final void m122194b0(StringBuilder sb4, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m122192a0((InterfaceC31165x0) it.next(), sb4, false);
            if (it.hasNext()) {
                sb4.append(", ");
            }
        }
    }

    @Override // xa3.InterfaceC38150k
    /* JADX INFO: renamed from: c */
    public final void mo122195c(InterfaceC38142c interfaceC38142c) {
        this.f163321a.mo122195c(interfaceC38142c);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m122196c0(List list, StringBuilder sb4, boolean z4) {
        C38151l c38151l = this.f163321a;
        if (((Boolean) c38151l.f163388w.getValue(c38151l, C38151l.f163341Y[21])).booleanValue() || list.isEmpty()) {
            return;
        }
        sb4.append(m122213p("<"));
        m122194b0(sb4, list);
        sb4.append(m122213p(">"));
        if (z4) {
            sb4.append(" ");
        }
    }

    @Override // xa3.InterfaceC38150k
    /* JADX INFO: renamed from: d */
    public final void mo122197d() {
        this.f163321a.mo122197d();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m122198d0(InterfaceC31110b1 interfaceC31110b1, StringBuilder sb4, boolean z4) {
        if (z4 || !(interfaceC31110b1 instanceof InterfaceC31107a1)) {
            sb4.append(m122174I(interfaceC31110b1.mo78666A() ? "var" : "val"));
            sb4.append(" ");
        }
    }

    @Override // xa3.InterfaceC38150k
    /* JADX INFO: renamed from: e */
    public final void mo122199e() {
        this.f163321a.mo122199e();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0068  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e0 */
    public final void m122200e0(InterfaceC31107a1 interfaceC31107a1, boolean z4, StringBuilder sb4, boolean z13) {
        boolean z14;
        if (z13) {
            sb4.append(m122174I("value-parameter"));
            sb4.append(" ");
        }
        if (m122218u()) {
            sb4.append("/*");
            sb4.append(((C34709w0) interfaceC31107a1).f146186G);
            sb4.append("*/ ");
        }
        m122221y(sb4, interfaceC31107a1, null);
        C34709w0 c34709w0 = (C34709w0) interfaceC31107a1;
        m122179N(sb4, c34709w0.f146188I, "crossinline");
        m122179N(sb4, c34709w0.f146189J, "noinline");
        C38151l c38151l = this.f163321a;
        C12669c c12669c = c38151l.f163383r;
        InterfaceC21493z[] interfaceC21493zArr = C38151l.f163341Y;
        boolean z15 = false;
        if (((Boolean) c12669c.getValue(c38151l, interfaceC21493zArr[16])).booleanValue()) {
            InterfaceC31108b interfaceC31108bM109626K0 = c34709w0.mo60581g();
            C34682j c34682j = interfaceC31108bM109626K0 instanceof C34682j ? (C34682j) interfaceC31108bM109626K0 : null;
            if (c34682j == null || !c34682j.f146080e0) {
                z14 = false;
            } else {
                z14 = true;
            }
        } else {
            z14 = false;
        }
        if (z14) {
            m122179N(sb4, ((Boolean) c38151l.f163384s.getValue(c38151l, interfaceC21493zArr[17])).booleanValue(), "actual");
        }
        AbstractC23811y type = ((AbstractC34711x0) interfaceC31107a1).getType();
        AbstractC22676k.m65749i(type, "getType(...)");
        AbstractC23811y abstractC23811y = c34709w0.f146190K;
        AbstractC23811y abstractC23811y2 = abstractC23811y == null ? type : abstractC23811y;
        m122179N(sb4, abstractC23811y != null, "vararg");
        if (z14 || (z13 && !m122215r())) {
            m122198d0(interfaceC31107a1, sb4, z14);
        }
        if (z4) {
            m122181P(interfaceC31107a1, sb4, z13);
            sb4.append(": ");
        }
        sb4.append(m122188X(abstractC23811y2));
        m122173H(interfaceC31107a1, sb4);
        if (m122218u() && abstractC23811y != null) {
            sb4.append(" /*");
            sb4.append(m122188X(type));
            sb4.append("*/");
        }
        if (((Function1) c38151l.f163391z.getValue(c38151l, interfaceC21493zArr[24])) != null) {
            if (c38151l.m122222o() ? c34709w0.m109625J0() : AbstractC4393e.m13803a(interfaceC31107a1)) {
                z15 = true;
            }
        }
        if (z15) {
            StringBuilder sb5 = new StringBuilder(" = ");
            Function1 function1 = (Function1) c38151l.f163391z.getValue(c38151l, interfaceC21493zArr[24]);
            AbstractC22676k.m65747g(function1);
            sb5.append((String) function1.invoke(interfaceC31107a1));
            sb4.append(sb5.toString());
        }
    }

    @Override // xa3.InterfaceC38150k
    /* JADX INFO: renamed from: f */
    public final Set mo122201f() {
        return this.f163321a.mo122201f();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX INFO: renamed from: f0 */
    public final void m122202f0(Collection collection, boolean z4, StringBuilder builder) {
        boolean z13;
        C38151l c38151l = this.f163321a;
        int iOrdinal = ((EnumC38155p) c38151l.f163346E.getValue(c38151l, C38151l.f163341Y[29])).ordinal();
        if (iOrdinal == 0) {
            z13 = true;
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (!z4) {
                z13 = true;
            }
            z13 = false;
        }
        int size = collection.size();
        m122217t().getClass();
        AbstractC22676k.m65750j(builder, "builder");
        builder.append("(");
        Iterator it = collection.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            int i14 = i13 + 1;
            InterfaceC31107a1 parameter = (InterfaceC31107a1) it.next();
            m122217t().getClass();
            AbstractC22676k.m65750j(parameter, "parameter");
            m122200e0(parameter, z13, builder, false);
            m122217t().getClass();
            if (i13 != size - 1) {
                builder.append(", ");
            }
            i13 = i14;
        }
        m122217t().getClass();
        builder.append(")");
    }

    @Override // xa3.InterfaceC38150k
    /* JADX INFO: renamed from: g */
    public final EnumC38140a mo122203g() {
        return this.f163321a.mo122203g();
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m122204g0(AbstractC31152r abstractC31152r, StringBuilder sb4) {
        if (!m122214q().contains(EnumC38149j.VISIBILITY)) {
            return false;
        }
        C38151l c38151l = this.f163321a;
        C12669c c12669c = c38151l.f163379n;
        InterfaceC21493z[] interfaceC21493zArr = C38151l.f163341Y;
        if (((Boolean) c12669c.getValue(c38151l, interfaceC21493zArr[12])).booleanValue()) {
            abstractC31152r = AbstractC31150q.m95879g(((AbstractC31146o) abstractC31152r).f128347a.mo95872c());
        }
        if (!((Boolean) c38151l.f163380o.getValue(c38151l, interfaceC21493zArr[13])).booleanValue() && abstractC31152r.equals(AbstractC31150q.f128358j)) {
            return false;
        }
        sb4.append(m122174I(((AbstractC31146o) abstractC31152r).f128347a.mo95868b()));
        sb4.append(" ");
        return true;
    }

    @Override // xa3.InterfaceC38150k
    /* JADX INFO: renamed from: h */
    public final void mo122205h() {
        this.f163321a.mo122205h();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m122206h0(StringBuilder sb4, List list) {
        C38151l c38151l = this.f163321a;
        if (((Boolean) c38151l.f163388w.getValue(c38151l, C38151l.f163341Y[21])).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC31165x0 interfaceC31165x0 = (InterfaceC31165x0) it.next();
            List upperBounds = interfaceC31165x0.getUpperBounds();
            AbstractC22676k.m65749i(upperBounds, "getUpperBounds(...)");
            for (AbstractC23811y abstractC23811y : AbstractC25265s.m74161z0(upperBounds, 1)) {
                StringBuilder sb5 = new StringBuilder();
                C35850h name = interfaceC31165x0.getName();
                AbstractC22676k.m65749i(name, "getName(...)");
                sb5.append(m122180O(name, false));
                sb5.append(" : ");
                AbstractC22676k.m65747g(abstractC23811y);
                sb5.append(m122188X(abstractC23811y));
                arrayList.add(sb5.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb4.append(" ");
        sb4.append(m122174I("where"));
        sb4.append(" ");
        AbstractC25265s.m74109M0(arrayList, sb4, ", ", null, null, null, 124);
    }

    @Override // xa3.InterfaceC38150k
    /* JADX INFO: renamed from: i */
    public final void mo122207i(EnumC38155p enumC38155p) {
        this.f163321a.mo122207i(enumC38155p);
    }

    @Override // xa3.InterfaceC38150k
    /* JADX INFO: renamed from: j */
    public final void mo122208j() {
        this.f163321a.mo122208j();
    }

    @Override // xa3.InterfaceC38150k
    /* JADX INFO: renamed from: k */
    public final void mo122209k(Set set) {
        AbstractC22676k.m65750j(set, "<set-?>");
        this.f163321a.mo122209k(set);
    }

    @Override // xa3.InterfaceC38150k
    /* JADX INFO: renamed from: l */
    public final void mo122210l(LinkedHashSet linkedHashSet) {
        this.f163321a.mo122210l(linkedHashSet);
    }

    @Override // xa3.InterfaceC38150k
    /* JADX INFO: renamed from: m */
    public final void mo122211m() {
        this.f163321a.mo122211m();
    }

    @Override // xa3.InterfaceC38150k
    /* JADX INFO: renamed from: n */
    public final void mo122212n() {
        C38158s c38158s = EnumC38159t.f163404w;
        this.f163321a.mo122212n();
    }

    /* JADX INFO: renamed from: p */
    public final String m122213p(String str) {
        return m122216s().mo122223a(str);
    }

    /* JADX INFO: renamed from: q */
    public final Set m122214q() {
        C38151l c38151l = this.f163321a;
        return (Set) c38151l.f163370e.getValue(c38151l, C38151l.f163341Y[3]);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m122215r() {
        C38151l c38151l = this.f163321a;
        return ((Boolean) c38151l.f163371f.getValue(c38151l, C38151l.f163341Y[4])).booleanValue();
    }

    /* JADX INFO: renamed from: s */
    public final EnumC38159t m122216s() {
        C38151l c38151l = this.f163321a;
        return (EnumC38159t) c38151l.f163345D.getValue(c38151l, C38151l.f163341Y[28]);
    }

    /* JADX INFO: renamed from: t */
    public final C38144e m122217t() {
        C38151l c38151l = this.f163321a;
        return (C38144e) c38151l.f163344C.getValue(c38151l, C38151l.f163341Y[27]);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m122218u() {
        C38151l c38151l = this.f163321a;
        return ((Boolean) c38151l.f163375j.getValue(c38151l, C38151l.f163341Y[8])).booleanValue();
    }

    /* JADX INFO: renamed from: w */
    public final String m122219w(InterfaceC31135k declarationDescriptor) {
        InterfaceC31135k interfaceC31135kMo60581g;
        String str;
        AbstractC22676k.m65750j(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb4 = new StringBuilder();
        declarationDescriptor.mo78659T(new C0929d(this), sb4);
        C38151l c38151l = this.f163321a;
        C12669c c12669c = c38151l.f163368c;
        InterfaceC21493z[] interfaceC21493zArr = C38151l.f163341Y;
        if (((Boolean) c12669c.getValue(c38151l, interfaceC21493zArr[1])).booleanValue() && !(declarationDescriptor instanceof InterfaceC31124g0) && !(declarationDescriptor instanceof InterfaceC31136k0) && (interfaceC31135kMo60581g = declarationDescriptor.mo60581g()) != null && !(interfaceC31135kMo60581g instanceof InterfaceC31109b0)) {
            sb4.append(" ");
            int iOrdinal = m122216s().ordinal();
            if (iOrdinal == 0) {
                str = "defined in";
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "<i>defined in</i>";
            }
            sb4.append(str);
            sb4.append(" ");
            C35848f c35848fM125524f = AbstractC39363f.m125524f(interfaceC31135kMo60581g);
            AbstractC22676k.m65749i(c35848fM125524f, "getFqName(...)");
            sb4.append(c35848fM125524f.m113793c() ? "root package" : m122213p(AbstractC35744b.m113237j(C35848f.m113790f(c35848fM125524f))));
            if (((Boolean) c38151l.f163369d.getValue(c38151l, interfaceC21493zArr[2])).booleanValue() && (interfaceC31135kMo60581g instanceof InterfaceC31124g0) && (declarationDescriptor instanceof InterfaceC31138l)) {
                ((InterfaceC31138l) declarationDescriptor).getSource().getClass();
            }
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: x */
    public final String m122220x(InterfaceC32300b annotation, EnumC32302d enumC32302d) throws IOException {
        C34682j c34682jMo60501s;
        List listMo78676v;
        AbstractC22676k.m65750j(annotation, "annotation");
        StringBuilder sb4 = new StringBuilder();
        sb4.append('@');
        if (enumC32302d != null) {
            sb4.append(enumC32302d.m100550a() + ':');
        }
        AbstractC23811y type = annotation.getType();
        sb4.append(m122188X(type));
        C38151l c38151l = this.f163321a;
        if (AbstractC32281f.m100453u(c38151l)) {
            Map mapMo43952a = annotation.mo43952a();
            List list = null;
            InterfaceC31117e interfaceC31117eM13806d = ((Boolean) c38151l.f163350I.getValue(c38151l, C38151l.f163341Y[33])).booleanValue() ? AbstractC4393e.m13806d(annotation) : null;
            if (interfaceC31117eM13806d != null && (c34682jMo60501s = interfaceC31117eM13806d.mo60501s()) != null && (listMo78676v = c34682jMo60501s.mo78676v()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listMo78676v) {
                    if (((C34709w0) ((InterfaceC31107a1) obj)).m109625J0()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((AbstractC34690n) ((InterfaceC31107a1) it.next())).getName());
                }
                list = arrayList2;
            }
            if (list == null) {
                list = C25271y.f99162w;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (!mapMo43952a.containsKey((C35850h) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((C35850h) it3.next()).m113817b() + " = ...");
            }
            Set<Map.Entry> setEntrySet = mapMo43952a.entrySet();
            ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(setEntrySet, 10));
            for (Map.Entry entry : setEntrySet) {
                C35850h c35850h = (C35850h) entry.getKey();
                AbstractC0715g abstractC0715g = (AbstractC0715g) entry.getValue();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(c35850h.m113817b());
                sb5.append(" = ");
                sb5.append(!list.contains(c35850h) ? m122167B(abstractC0715g) : "...");
                arrayList5.add(sb5.toString());
            }
            List listM74150t1 = AbstractC25265s.m74150t1(AbstractC25265s.m74129g1(arrayList4, arrayList5));
            if (AbstractC32281f.m100454v(c38151l) || !listM74150t1.isEmpty()) {
                AbstractC25265s.m74109M0(listM74150t1, sb4, ", ", "(", ")", null, 112);
            }
        }
        if (m122218u() && (AbstractC23791o.m69886e(type) || (type.mo69844i0().mo1784d() instanceof C31121f0))) {
            sb4.append(" /* annotation class not found */");
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: y */
    public final void m122221y(StringBuilder sb4, InterfaceC32299a interfaceC32299a, EnumC32302d enumC32302d) {
        if (m122214q().contains(EnumC38149j.ANNOTATIONS)) {
            boolean z4 = interfaceC32299a instanceof AbstractC23811y;
            C38151l c38151l = this.f163321a;
            Set setMo122201f = z4 ? c38151l.mo122201f() : (Set) c38151l.f163352K.getValue(c38151l, C38151l.f163341Y[35]);
            Function1 function1 = (Function1) c38151l.f163354M.getValue(c38151l, C38151l.f163341Y[37]);
            for (InterfaceC32300b interfaceC32300b : interfaceC32299a.getAnnotations()) {
                if (!AbstractC25265s.m74155w0(setMo122201f, interfaceC32300b.mo43953b()) && !AbstractC22676k.m65745e(interfaceC32300b.mo43953b(), AbstractC27741m.f111867r) && (function1 == null || ((Boolean) function1.invoke(interfaceC32300b)).booleanValue())) {
                    sb4.append(m122220x(interfaceC32300b, enumC32302d));
                    if (((Boolean) c38151l.f163351J.getValue(c38151l, C38151l.f163341Y[34])).booleanValue()) {
                        sb4.append('\n');
                    } else {
                        sb4.append(" ");
                    }
                }
            }
        }
    }
}
