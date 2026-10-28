package p390p1;

import a11.C0132j;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.C1586g1;
import androidx.room.AbstractC1772c1;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ec3.C13084s1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import l83.C23454a0;
import lb3.C23805v;
import m83.AbstractC25260n;
import m83.C25271y;
import p002a0.C0020f0;
import p005a3.C0264x;
import p007a6.C0458v;
import p088dc.AbstractC11895b;
import p410q1.C29755b0;
import p410q1.C29775l0;
import p446r1.C30849c;
import p474s.C31983m2;
import p602x1.C37820f;
import p602x1.C37821g;
import p668z1.C39967p;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: p1.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC28683x {

    /* JADX INFO: renamed from: a */
    public static final Object f116018a = new Object();

    /* JADX INFO: renamed from: b */
    public static final C28624i0 f116019b = new C28624i0();

    /* JADX INFO: renamed from: A */
    public static final InterfaceC28601c1 m87233A(Composer composer, InterfaceC4351m interfaceC4351m, Object obj) {
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = m87272z(obj);
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
        boolean zM87157i = c28655q.m87157i(interfaceC4351m);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i || objM87133R2 == c28676v0) {
            objM87133R2 = new C28658q2(interfaceC4351m, interfaceC28601c1, null, 0);
            c28655q.m87172p0(objM87133R2);
        }
        m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
        return interfaceC28601c1;
    }

    /* JADX INFO: renamed from: B */
    public static final InterfaceC28601c1 m87234B(Object obj, Object obj2, Object obj3, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = m87272z(obj);
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
        boolean zM87157i = c28655q.m87157i(interfaceC4351m);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i || objM87133R2 == c28676v0) {
            objM87133R2 = new C28658q2(interfaceC4351m, interfaceC28601c1, null, 1);
            c28655q.m87172p0(objM87133R2);
        }
        m87254h(obj2, obj3, (InterfaceC4351m) objM87133R2, c28655q);
        return interfaceC28601c1;
    }

    /* JADX INFO: renamed from: C */
    public static final InterfaceC28601c1 m87235C(Object obj, Object[] objArr, InterfaceC4351m interfaceC4351m, C28655q c28655q) {
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = m87272z(obj);
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zM87157i = c28655q.m87157i(interfaceC4351m);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i || objM87133R2 == c28676v0) {
            objM87133R2 = new C28662r2(interfaceC4351m, interfaceC28601c1, null, 1);
            c28655q.m87172p0(objM87133R2);
        }
        m87256j(objArrCopyOf, (InterfaceC4351m) objM87133R2, c28655q);
        return interfaceC28601c1;
    }

    /* JADX INFO: renamed from: D */
    public static final Object m87236D(InterfaceC28653p1 interfaceC28653p1, AbstractC28669t1 abstractC28669t1) {
        AbstractC22676k.m65748h(abstractC28669t1, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Object objMo86978b = interfaceC28653p1.get(abstractC28669t1);
        if (objMo86978b == null) {
            objMo86978b = abstractC28669t1.mo86978b();
        }
        return ((InterfaceC28682w2) objMo86978b).mo86979a(interfaceC28653p1);
    }

    /* JADX INFO: renamed from: E */
    public static final C28647o m87237E(Composer composer) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87142a0(206, AbstractC28659r.f115943e);
        if (c28655q.f115903S) {
            C28626i2.m87035y(c28655q.f115893I);
        }
        Object objM87125J = c28655q.m87125J();
        C28643n c28643n = objM87125J instanceof C28643n ? (C28643n) objM87125J : null;
        if (c28643n == null) {
            c28643n = new C28643n(new C28647o(c28655q, c28655q.f115904T, c28655q.f115922q, c28655q.f115887C, c28655q.f115913h.f116002T));
            c28655q.m87174q0(c28643n);
        }
        C28647o c28647o = c28643n.f115849w;
        c28647o.f115865f.setValue(c28655q.m87165m());
        c28655q.m87173q(false);
        return c28647o;
    }

    /* JADX INFO: renamed from: F */
    public static final InterfaceC28601c1 m87238F(Object obj, Composer composer) {
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            objM87133R = m87272z(obj);
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
        interfaceC28601c1.setValue(obj);
        return interfaceC28601c1;
    }

    /* JADX INFO: renamed from: G */
    public static final void m87239G(Composer composer, InterfaceC4351m interfaceC4351m, Object obj) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), obj)) {
            c28655q.m87172p0(obj);
            c28655q.m87143b(obj, interfaceC4351m);
        }
    }

    /* JADX INFO: renamed from: H */
    public static final C13084s1 m87240H(InterfaceC4339a interfaceC4339a) {
        return new C13084s1(new C1586g1(interfaceC4339a, null));
    }

    /* JADX INFO: renamed from: I */
    public static final int m87241I(C0020f0 c0020f0) {
        int iM28c;
        int i13 = c0020f0.f47b;
        int iM28c2 = c0020f0.m28c(0);
        while (c0020f0.f47b != 0 && c0020f0.m28c(0) == iM28c2) {
            c0020f0.m32g(0, c0020f0.m29d());
            c0020f0.m31f(c0020f0.f47b - 1);
            int i14 = c0020f0.f47b;
            int i15 = i14 >>> 1;
            int i16 = 0;
            while (i16 < i15) {
                int iM28c3 = c0020f0.m28c(i16);
                int i17 = (i16 + 1) * 2;
                int i18 = i17 - 1;
                int iM28c4 = c0020f0.m28c(i18);
                if (i17 < i14 && (iM28c = c0020f0.m28c(i17)) > iM28c4) {
                    if (iM28c <= iM28c3) {
                        break;
                    }
                    c0020f0.m32g(i16, iM28c);
                    c0020f0.m32g(i17, iM28c3);
                    i16 = i17;
                } else {
                    if (iM28c4 <= iM28c3) {
                        break;
                    }
                    c0020f0.m32g(i16, iM28c4);
                    c0020f0.m32g(i18, iM28c3);
                    i16 = i18;
                }
            }
        }
        return iM28c2;
    }

    /* JADX INFO: renamed from: J */
    public static final C39967p m87242J(Collection collection) {
        C39967p c39967p = new C39967p();
        c39967p.addAll(collection);
        return c39967p;
    }

    /* JADX INFO: renamed from: K */
    public static final void m87243K(Composer composer, InterfaceC4351m interfaceC4351m, Object obj) {
        C28655q c28655q = (C28655q) composer;
        boolean z4 = c28655q.f115903S;
        if (z4 || !AbstractC22676k.m65745e(c28655q.m87133R(), obj)) {
            c28655q.m87172p0(obj);
            if (z4) {
                return;
            }
            c28655q.m87143b(obj, interfaceC4351m);
        }
    }

    /* JADX INFO: renamed from: L */
    public static final int m87244L(int i13) {
        int i14 = 306783378 & i13;
        int i15 = 613566756 & i13;
        return (i13 & (-920350135)) | (i15 >> 1) | i14 | ((i14 << 1) & i15);
    }

    /* JADX INFO: renamed from: M */
    public static final C37821g m87245M(C28673u1[] c28673u1Arr, InterfaceC28653p1 interfaceC28653p1, InterfaceC28653p1 interfaceC28653p2) {
        C37821g c37821g = C37821g.f161967z;
        C37820f c37820f = new C37820f(c37821g);
        c37820f.f161966G = c37821g;
        for (C28673u1 c28673u1 : c28673u1Arr) {
            AbstractC28669t1 abstractC28669t1 = c28673u1.f115966a;
            if (c28673u1.f115971f || !interfaceC28653p1.containsKey(abstractC28669t1)) {
                c37820f.put(abstractC28669t1, abstractC28669t1.m87197c(c28673u1, (InterfaceC28682w2) interfaceC28653p2.get(abstractC28669t1)));
            }
        }
        return c37820f.build();
    }

    /* JADX INFO: renamed from: N */
    public static final Object m87246N(Function1 function1, InterfaceC30057d interfaceC30057d) {
        return m87268v(interfaceC30057d.getContext()).mo7286k(new C23805v(function1, 1), interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
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
    public static final void m87247a(C28673u1 c28673u1, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        InterfaceC28682w2 interfaceC28682w2;
        boolean z4;
        C28677v1 c28677v1M87180u;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-149765515);
        C0264x c0264x = c28655q.f115929x;
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        c28655q.m87142a0(201, AbstractC28659r.f115940b);
        Object objM87133R = c28655q.m87133R();
        if (AbstractC22676k.m65745e(objM87133R, C28635l.f115821a)) {
            interfaceC28682w2 = null;
        } else {
            AbstractC22676k.m65748h(objM87133R, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            interfaceC28682w2 = (InterfaceC28682w2) objM87133R;
        }
        AbstractC28669t1 abstractC28669t1 = c28673u1.f115966a;
        InterfaceC28682w2 interfaceC28682w2M87197c = abstractC28669t1.m87197c(c28673u1, interfaceC28682w2);
        boolean zEquals = interfaceC28682w2M87197c.equals(interfaceC28682w2);
        if (!zEquals) {
            c28655q.m87172p0(interfaceC28682w2M87197c);
        }
        if (!c28655q.f115903S) {
            C28610e2 c28610e2 = c28655q.f115891G;
            Object objM86990b = c28610e2.m86990b(c28610e2.f115739b, c28610e2.f115744g);
            AbstractC22676k.m65748h(objM86990b, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC28653p1 interfaceC28653p1 = (InterfaceC28653p1) objM86990b;
            if (!(c28655q.m87121F() && zEquals) && (c28673u1.f115971f || !interfaceC28653p1M87165m.containsKey(abstractC28669t1))) {
                interfaceC28653p1M87165m = ((C37821g) interfaceC28653p1M87165m).m121348c(abstractC28669t1, interfaceC28682w2M87197c);
            } else if ((zEquals && !c28655q.f115928w) || !c28655q.f115928w) {
                interfaceC28653p1M87165m = interfaceC28653p1;
            }
            if (c28655q.f115930y || interfaceC28653p1 != interfaceC28653p1M87165m) {
                z4 = true;
            }
            if (z4 && !c28655q.f115903S) {
                c28655q.m87131P(interfaceC28653p1M87165m);
            }
            c0264x.m799c(c28655q.f115928w ? 1 : 0);
            c28655q.f115928w = z4;
            c28655q.f115895K = interfaceC28653p1M87165m;
            c28655q.m87139Y(AbstractC28659r.f115941c, 202, interfaceC28653p1M87165m, 0);
            AbstractC11895b.m31978A((i13 >> 3) & 14, interfaceC4351m, c28655q, false, false);
            c28655q.f115928w = c0264x.m798b() != 0;
            c28655q.f115895K = null;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0132j(c28673u1, interfaceC4351m, i13, 14);
            }
        }
        if (c28673u1.f115971f || !interfaceC28653p1M87165m.containsKey(abstractC28669t1)) {
            interfaceC28653p1M87165m = ((C37821g) interfaceC28653p1M87165m).m121348c(abstractC28669t1, interfaceC28682w2M87197c);
        }
        c28655q.f115894J = true;
        z4 = false;
        if (z4) {
            c28655q.m87131P(interfaceC28653p1M87165m);
        }
        c0264x.m799c(c28655q.f115928w ? 1 : 0);
        c28655q.f115928w = z4;
        c28655q.f115895K = interfaceC28653p1M87165m;
        c28655q.m87139Y(AbstractC28659r.f115941c, 202, interfaceC28653p1M87165m, 0);
        AbstractC11895b.m31978A((i13 >> 3) & 14, interfaceC4351m, c28655q, false, false);
        c28655q.f115928w = c0264x.m798b() != 0;
        c28655q.f115895K = null;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0132j(c28673u1, interfaceC4351m, i13, 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
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
    public static final void m87248b(C28673u1[] c28673u1Arr, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        InterfaceC28653p1 interfaceC28653p1M87170o0;
        boolean z4;
        C28677v1 c28677v1M87180u;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(415205898);
        C0264x c0264x = c28655q.f115929x;
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        c28655q.m87142a0(201, AbstractC28659r.f115940b);
        if (c28655q.f115903S) {
            interfaceC28653p1M87170o0 = c28655q.m87170o0(interfaceC28653p1M87165m, m87245M(c28673u1Arr, interfaceC28653p1M87165m, C37821g.f161967z));
            c28655q.f115894J = true;
        } else {
            C28610e2 c28610e2 = c28655q.f115891G;
            Object objM86996h = c28610e2.m86996h(c28610e2.f115744g, 0);
            AbstractC22676k.m65748h(objM86996h, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC28653p1 interfaceC28653p1 = (InterfaceC28653p1) objM86996h;
            C28610e2 c28610e3 = c28655q.f115891G;
            Object objM86996h2 = c28610e3.m86996h(c28610e3.f115744g, 1);
            AbstractC22676k.m65748h(objM86996h2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC28653p1 interfaceC28653p2 = (InterfaceC28653p1) objM86996h2;
            C37821g c37821gM87245M = m87245M(c28673u1Arr, interfaceC28653p1M87165m, interfaceC28653p2);
            if (!c28655q.m87121F() || c28655q.f115930y || !interfaceC28653p2.equals(c37821gM87245M)) {
                interfaceC28653p1M87170o0 = c28655q.m87170o0(interfaceC28653p1M87165m, c37821gM87245M);
                if (c28655q.f115930y || !AbstractC22676k.m65745e(interfaceC28653p1M87170o0, interfaceC28653p1)) {
                    z4 = true;
                }
                if (z4 && !c28655q.f115903S) {
                    c28655q.m87131P(interfaceC28653p1M87170o0);
                }
                c0264x.m799c(c28655q.f115928w ? 1 : 0);
                c28655q.f115928w = z4;
                c28655q.f115895K = interfaceC28653p1M87170o0;
                c28655q.m87139Y(AbstractC28659r.f115941c, 202, interfaceC28653p1M87170o0, 0);
                AbstractC11895b.m31978A((i13 >> 3) & 14, interfaceC4351m, c28655q, false, false);
                c28655q.f115928w = c0264x.m798b() != 0;
                c28655q.f115895K = null;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0132j(c28673u1Arr, interfaceC4351m, i13, 15);
                }
            }
            c28655q.f115917l = c28655q.f115891G.m87007s() + c28655q.f115917l;
            interfaceC28653p1M87170o0 = interfaceC28653p1;
        }
        z4 = false;
        if (z4) {
            c28655q.m87131P(interfaceC28653p1M87170o0);
        }
        c0264x.m799c(c28655q.f115928w ? 1 : 0);
        c28655q.f115928w = z4;
        c28655q.f115895K = interfaceC28653p1M87170o0;
        c28655q.m87139Y(AbstractC28659r.f115941c, 202, interfaceC28653p1M87170o0, 0);
        AbstractC11895b.m31978A((i13 >> 3) & 14, interfaceC4351m, c28655q, false, false);
        c28655q.f115928w = c0264x.m798b() != 0;
        c28655q.f115895K = null;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0132j(c28673u1Arr, interfaceC4351m, i13, 15);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m87249c(Object obj, Object obj2, Object obj3, Function1 function1, Composer composer) {
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(obj) | c28655q.m87153g(obj2) | c28655q.m87153g(obj3);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C28616g0(function1);
            c28655q.m87172p0(objM87133R);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m87250d(Object obj, Object obj2, Function1 function1, Composer composer) {
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(obj) | c28655q.m87153g(obj2);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C28616g0(function1);
            c28655q.m87172p0(objM87133R);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m87251e(Object obj, Function1 function1, Composer composer) {
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(obj);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C28616g0(function1);
            c28655q.m87172p0(objM87133R);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m87252f(Object[] objArr, Function1 function1, Composer composer) {
        boolean zM87153g = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zM87153g |= ((C28655q) composer).m87153g(obj);
        }
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            c28655q.m87172p0(new C28616g0(function1));
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m87253g(Composer composer, InterfaceC4351m interfaceC4351m, Object obj) {
        C28655q c28655q = (C28655q) composer;
        InterfaceC30063j interfaceC30063j = c28655q.f115902R;
        boolean zM87153g = c28655q.m87153g(obj);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C28664s0(interfaceC30063j, interfaceC4351m);
            c28655q.m87172p0(objM87133R);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m87254h(Object obj, Object obj2, InterfaceC4351m interfaceC4351m, Composer composer) {
        C28655q c28655q = (C28655q) composer;
        InterfaceC30063j interfaceC30063j = c28655q.f115902R;
        boolean zM87153g = c28655q.m87153g(obj) | c28655q.m87153g(obj2);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C28664s0(interfaceC30063j, interfaceC4351m);
            c28655q.m87172p0(objM87133R);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m87255i(Object obj, Object obj2, Object obj3, InterfaceC4351m interfaceC4351m, Composer composer) {
        C28655q c28655q = (C28655q) composer;
        InterfaceC30063j interfaceC30063j = c28655q.f115902R;
        boolean zM87153g = c28655q.m87153g(obj) | c28655q.m87153g(obj2) | c28655q.m87153g(obj3);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C28664s0(interfaceC30063j, interfaceC4351m);
            c28655q.m87172p0(objM87133R);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m87256j(Object[] objArr, InterfaceC4351m interfaceC4351m, C28655q c28655q) {
        InterfaceC30063j interfaceC30063j = c28655q.f115902R;
        boolean zM87153g = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zM87153g |= c28655q.m87153g(obj);
        }
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            c28655q.m87172p0(new C28664s0(interfaceC30063j, interfaceC4351m));
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m87257k(InterfaceC4339a interfaceC4339a, Composer composer) {
        C29775l0 c29775l0 = ((C28655q) composer).f115897M.f121747b.f121744a;
        c29775l0.m91239g0(C29755b0.f121758d);
        AbstractC1772c1.m5378O(c29775l0, 0, interfaceC4339a);
    }

    /* JADX INFO: renamed from: l */
    public static final void m87258l(C0020f0 c0020f0, int i13) {
        if (c0020f0.f47b == 0 || !(c0020f0.m28c(0) == i13 || c0020f0.m28c(c0020f0.f47b - 1) == i13)) {
            int i14 = c0020f0.f47b;
            c0020f0.m26a(i13);
            while (i14 > 0) {
                int i15 = ((i14 + 1) >>> 1) - 1;
                int iM28c = c0020f0.m28c(i15);
                if (i13 <= iM28c) {
                    break;
                }
                c0020f0.m32g(i14, iM28c);
                i14 = i15;
            }
            c0020f0.m32g(i14, i13);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m87259m(C28626i2 c28626i2, List list, C28679w c28679w) {
        List list2 = list;
        if (list2.isEmpty()) {
            return;
        }
        int size = list2.size();
        for (int i13 = 0; i13 < size; i13++) {
            int iM87058c = c28626i2.m87058c((C28591a) list.get(i13));
            int iM87048M = c28626i2.m87048M(c28626i2.f115782b, c28626i2.m87072r(iM87058c));
            Object obj = iM87048M < c28626i2.m87062g(c28626i2.f115782b, c28626i2.m87072r(iM87058c + 1)) ? c28626i2.f115783c[c28626i2.m87063h(iM87048M)] : C28635l.f115821a;
            C28677v1 c28677v1 = obj instanceof C28677v1 ? (C28677v1) obj : null;
            if (c28677v1 != null) {
                c28677v1.f115979a = c28679w;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static final InterfaceC28601c1 m87260n(InterfaceC13058l interfaceC13058l, Object obj, InterfaceC30063j interfaceC30063j, Composer composer, int i13, int i14) {
        if ((i14 & 2) != 0) {
            interfaceC30063j = C30064k.f122676w;
        }
        InterfaceC30063j interfaceC30063j2 = interfaceC30063j;
        C28655q c28655q = (C28655q) composer;
        boolean zM87157i = c28655q.m87157i(interfaceC30063j2) | c28655q.m87157i(interfaceC13058l);
        Object objM87133R = c28655q.m87133R();
        if (zM87157i || objM87133R == C28635l.f115821a) {
            objM87133R = new C0458v(interfaceC30063j2, interfaceC13058l, (InterfaceC30057d) null, 18);
            c28655q.m87172p0(objM87133R);
        }
        return m87234B(obj, interfaceC13058l, interfaceC30063j2, (InterfaceC4351m) objM87133R, c28655q, ((i13 >> 3) & 14) | ((i13 << 3) & 112) | (i13 & 896));
    }

    /* JADX INFO: renamed from: o */
    public static final InterfaceC28601c1 m87261o(InterfaceC13037f2 interfaceC13037f2, Composer composer, int i13) {
        return m87260n(interfaceC13037f2, interfaceC13037f2.getValue(), C30064k.f122676w, composer, i13 & 14, 0);
    }

    /* JADX INFO: renamed from: p */
    public static final InterfaceC2994c0 m87262p(Composer composer) {
        return new C28602c2(((C28655q) composer).f115902R);
    }

    /* JADX INFO: renamed from: q */
    public static final C30849c m87263q() {
        C31983m2 c31983m2 = AbstractC28654p2.f115884b;
        C30849c c30849c = (C30849c) c31983m2.m99482f();
        if (c30849c != null) {
            return c30849c;
        }
        C30849c c30849c2 = new C30849c(new C28651p[0]);
        c31983m2.m99492s(c30849c2);
        return c30849c2;
    }

    /* JADX INFO: renamed from: r */
    public static final C28612f0 m87264r(InterfaceC4339a interfaceC4339a) {
        C31983m2 c31983m2 = AbstractC28654p2.f115883a;
        return new C28612f0(interfaceC4339a, null);
    }

    /* JADX INFO: renamed from: s */
    public static final C28612f0 m87265s(InterfaceC4339a interfaceC4339a, InterfaceC28650o2 interfaceC28650o2) {
        C31983m2 c31983m2 = AbstractC28654p2.f115883a;
        return new C28612f0(interfaceC4339a, interfaceC28650o2);
    }

    /* JADX INFO: renamed from: t */
    public static final int m87266t(Composer composer) {
        composer.getClass();
        return Long.hashCode(((C28655q) composer).f115904T);
    }

    /* JADX INFO: renamed from: u */
    public static final long m87267u(C28655q c28655q) {
        return c28655q.f115904T;
    }

    /* JADX INFO: renamed from: v */
    public static final InterfaceC28680w0 m87268v(InterfaceC30063j interfaceC30063j) {
        InterfaceC28680w0 interfaceC28680w0 = (InterfaceC28680w0) interfaceC30063j.get(C28676v0.f115975x);
        if (interfaceC28680w0 != null) {
            return interfaceC28680w0;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    /* JADX INFO: renamed from: w */
    public static final void m87269w() {
        throw new IllegalStateException("Invalid applier");
    }

    /* JADX INFO: renamed from: x */
    public static List m87270x(C28626i2 c28626i2, int i13, C28626i2 c28626i3, boolean z4, boolean z13, boolean z14) {
        List list;
        boolean z15;
        int iM87074t = c28626i2.m87074t(i13);
        int i14 = i13 + iM87074t;
        int iM87061f = c28626i2.m87061f(i13);
        int iM87061f2 = c28626i2.m87061f(i14);
        int i15 = iM87061f2 - iM87061f;
        boolean z16 = i13 >= 0 && (c28626i2.f115782b[(c28626i2.m87072r(i13) * 5) + 1] & 201326592) != 0;
        c28626i3.m87076v(iM87074t);
        c28626i3.m87077w(i15, c28626i3.f115800t);
        if (c28626i2.f115787g < i14) {
            c28626i2.m87036A(i14);
        }
        if (c28626i2.f115791k < iM87061f2) {
            c28626i2.m87037B(iM87061f2, i14);
        }
        int[] iArr = c28626i3.f115782b;
        int i16 = c28626i3.f115800t;
        int i17 = i16 * 5;
        AbstractC25260n.m74064e0(i17, i13 * 5, c28626i2.f115782b, iArr, i14 * 5);
        Object[] objArr = c28626i3.f115783c;
        int i18 = c28626i3.f115789i;
        System.arraycopy(c28626i2.f115783c, iM87061f, objArr, i18, i15);
        int i19 = c28626i3.f115802v;
        iArr[i17 + 2] = i19;
        int i24 = i16 - i13;
        int i25 = i16 + iM87074t;
        int iM87062g = i18 - c28626i3.m87062g(iArr, i16);
        int i26 = c28626i3.f115793m;
        int i27 = c28626i3.f115792l;
        int length = objArr.length;
        boolean z17 = z16;
        int i28 = i26;
        int i29 = i16;
        while (i29 < i25) {
            if (i29 != i16) {
                int i34 = (i29 * 5) + 2;
                iArr[i34] = iArr[i34] + i24;
            }
            int[] iArr2 = iArr;
            iArr2[(i29 * 5) + 4] = C28626i2.m87034i(c28626i3.m87062g(iArr, i29) + iM87062g, i28 < i29 ? 0 : c28626i3.f115791k, i27, length);
            if (i29 == i28) {
                i28++;
            }
            i29++;
            i16 = i16;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        c28626i3.f115793m = i28;
        int iM87027b = AbstractC28622h2.m87027b(c28626i2.f115784d, i13, c28626i2.m87070p());
        int iM87027b2 = AbstractC28622h2.m87027b(c28626i2.f115784d, i14, c28626i2.m87070p());
        if (iM87027b < iM87027b2) {
            ArrayList arrayList = c28626i2.f115784d;
            ArrayList arrayList2 = new ArrayList(iM87027b2 - iM87027b);
            for (int i35 = iM87027b; i35 < iM87027b2; i35++) {
                C28591a c28591a = (C28591a) arrayList.get(i35);
                c28591a.f115705a += i24;
                arrayList2.add(c28591a);
            }
            c28626i3.f115784d.addAll(AbstractC28622h2.m87027b(c28626i3.f115784d, c28626i3.f115800t, c28626i3.m87070p()), arrayList2);
            arrayList.subList(iM87027b, iM87027b2).clear();
            list = arrayList2;
        } else {
            list = C25271y.f99162w;
        }
        List list2 = list;
        if (!list2.isEmpty()) {
            HashMap map = c28626i2.f115785e;
            HashMap map2 = c28626i3.f115785e;
            if (map != null && map2 != null) {
                int size = list2.size();
                for (int i36 = 0; i36 < size; i36++) {
                }
            }
        }
        int i37 = c28626i3.f115802v;
        c28626i3.m87049N(i19);
        int iM87039D = c28626i2.m87039D(c28626i2.f115782b, i13);
        if (!z14) {
            z15 = false;
        } else if (z4) {
            boolean z18 = iM87039D >= 0;
            if (z18) {
                c28626i2.m87050O();
                c28626i2.m87056a(iM87039D - c28626i2.f115800t);
                c28626i2.m87050O();
            }
            c28626i2.m87056a(i13 - c28626i2.f115800t);
            boolean zM87042G = c28626i2.m87042G();
            if (z18) {
                c28626i2.m87047L();
                c28626i2.m87064j();
                c28626i2.m87047L();
                c28626i2.m87064j();
            }
            z15 = zM87042G;
        } else {
            boolean zM87043H = c28626i2.m87043H(i13, iM87074t);
            c28626i2.m87044I(iM87061f, i15, i13 - 1);
            z15 = zM87043H;
        }
        if (z15) {
            AbstractC28659r.m87192c("Unexpectedly removed anchors");
        }
        int i38 = c28626i3.f115795o;
        int i39 = iArr3[i17 + 1];
        c28626i3.f115795o = i38 + ((1073741824 & i39) != 0 ? 1 : i39 & 67108863);
        if (z13) {
            c28626i3.f115800t = i25;
            c28626i3.f115789i = i18 + i15;
        }
        if (z17) {
            c28626i3.m87054S(i19);
        }
        return list;
    }

    /* JADX INFO: renamed from: y */
    public static final C28617g1 m87271y(float f13) {
        return new C28617g1(f13);
    }

    /* JADX INFO: renamed from: z */
    public static C28633k1 m87272z(Object obj) {
        return new C28633k1(obj, C28676v0.f115974F);
    }
}
