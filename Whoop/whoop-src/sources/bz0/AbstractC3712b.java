package bz0;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import g61.EnumC15533f;
import i91.AbstractC18249c;
import j61.C21372f;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import p91.AbstractC29011e;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: bz0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lj61/f;", "lineState", "Ll83/a0;", "b", "(Landroidx/compose/ui/Modifier;Lj61/f;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3712b {

    /* JADX INFO: renamed from: bz0.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15169a;

        static {
            int[] iArr = new int[EnumC15533f.values().length];
            try {
                iArr[EnumC15533f.X_AXIS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC15533f.Y_AXIS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f15169a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:51:0x0120  */
    /* JADX WARN: Code duplicated, block: B:52:0x0124  */
    /* JADX WARN: Code duplicated, block: B:57:0x0145  */
    /* JADX WARN: Code duplicated, block: B:60:0x0154  */
    /* JADX WARN: Code duplicated, block: B:61:0x0166  */
    /* JADX WARN: Code duplicated, block: B:63:0x017d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0188  */
    /* JADX WARN: Code duplicated, block: B:66:0x0198  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ae  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
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
    public static final void m11530b(Modifier modifier, C21372f c21372f, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C21372f c21372f2;
        Modifier modifier3;
        C28655q c28655q;
        Modifier modifier4;
        C21372f c21372f3;
        int i16;
        float f13;
        int iHashCode;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        Modifier modifier5;
        String label;
        InterfaceC39332e labelColorOverride;
        C17919x c17919xM31989h;
        long jMo134584toComposableColorWaAFU9c;
        Modifier modifier6;
        float f14;
        C2314t c2314t;
        ?? r14;
        float f15;
        C28655q c28655q2;
        Modifier modifier7;
        C28655q c28655q3;
        int i17;
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(-291417178);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q4.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i14 & 2) != 0) {
                i17 = 16;
            } else {
                if ((i13 & 64) == 0 ? c28655q4.m87153g(c21372f) : c28655q4.m87157i(c21372f)) {
                    i17 = 32;
                } else {
                    i17 = 16;
                }
            }
            i15 |= i17;
        }
        if (c28655q4.m87135U(i15 & 1, (i15 & 19) != 18)) {
            c28655q4.m87140Z();
            int i19 = i13 & 1;
            C2314t c2314t2 = C2314t.f9131w;
            if (i19 == 0 || c28655q4.m87118C()) {
                if (i18 != 0) {
                    modifier2 = c2314t2;
                }
                if ((i14 & 2) != 0) {
                    modifier4 = modifier2;
                    c21372f3 = new C21372f(0.0f, null, null, null, null, null, null, 127, null);
                }
                c28655q4.m87175r();
                i16 = a.f15169a[c21372f3.getAxis().ordinal()];
                if (i16 != 1) {
                    c28655q4.m87150e0(-1480053155);
                    f13 = 1;
                    Modifier modifierM88149j = AbstractC29011e.m88149j(c2314t2, 0.0f, f13 - c21372f3.getPosition(), c21372f3.getAnchorPoint());
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM88149j);
                    InterfaceC0221l.f734a.getClass();
                    interfaceC4339a = C0217k.f724b;
                    c28655q4.m87158i0();
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(interfaceC4339a);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N);
                    modifier5 = modifier4;
                    label = c21372f3.getLabel();
                    if (label == null) {
                        c28655q4.m87150e0(1320217806);
                        c28655q4.m87173q(false);
                        f14 = f13;
                        modifier6 = modifier5;
                        f15 = 1.0f;
                        c2314t = c2314t2;
                        r14 = 0;
                        c28655q2 = c28655q4;
                    } else {
                        c28655q4.m87150e0(1320217807);
                        C2886a b6 = C38072d.f163053a.m121952e(c28655q4, 6).getB4();
                        labelColorOverride = c21372f3.getLabelColorOverride();
                        if (labelColorOverride == null) {
                            c28655q4.m87150e0(-1405276090);
                            c28655q4.m87173q(false);
                            c17919xM31989h = null;
                        } else {
                            c28655q4.m87150e0(1894331163);
                            c17919xM31989h = AbstractC11895b.m31989h(c28655q4, false, labelColorOverride.mo134584toComposableColorWaAFU9c(c28655q4, 0));
                        }
                        if (c17919xM31989h == null) {
                            c28655q4.m87150e0(1894332763);
                            jMo134584toComposableColorWaAFU9c = c21372f3.getLabelStyle().getColor().mo134584toComposableColorWaAFU9c(c28655q4, 0);
                            c28655q4.m87173q(false);
                        } else {
                            c28655q4.m87150e0(1894330283);
                            c28655q4.m87173q(false);
                            jMo134584toComposableColorWaAFU9c = c17919xM31989h.f69639a;
                        }
                        modifier6 = modifier5;
                        f14 = f13;
                        AbstractC30795n.m94707h(label, null, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q4, 0, 0, 196602);
                        C28655q c28655q5 = c28655q4;
                        c2314t = c2314t2;
                        AbstractC22953f.m66715b(c28655q5, AbstractC1102d.m3424u(5, c2314t));
                        r14 = 0;
                        c28655q5.m87173q(false);
                        f15 = 1.0f;
                        c28655q2 = c28655q5;
                    }
                    modifier7 = modifier6;
                    AbstractC22989q.m66760a(AbstractC18249c.m52565c(AbstractC1102d.m3411h(f14, AbstractC1102d.m3409f(f15, c2314t)).mo3471e(modifier7), AbstractC18249c.m52577o(c21372f3.getColor().mo134584toComposableColorWaAFU9c(c28655q2, r14))), c28655q2, r14);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(r14);
                    c28655q3 = c28655q2;
                } else {
                    if (i16 == 2) {
                        throw AbstractC11895b.m32003v(-879028995, c28655q4, false);
                    }
                    c28655q4.m87150e0(-1479088125);
                    AbstractC22989q.m66760a(AbstractC18249c.m52565c(AbstractC1102d.m3424u(1, AbstractC29011e.m88149j(AbstractC1102d.m3406c(1.0f, c2314t2), c21372f3.getPosition(), 0.0f, c21372f3.getAnchorPoint())).mo3471e(modifier4), AbstractC18249c.m52577o(c21372f3.getColor().mo134584toComposableColorWaAFU9c(c28655q4, 0))), c28655q4, 0);
                    c28655q4.m87173q(false);
                    modifier7 = modifier4;
                    c28655q3 = c28655q4;
                }
                modifier3 = modifier7;
                c21372f2 = c21372f3;
                c28655q = c28655q3;
            } else {
                c28655q4.m87138X();
            }
            c21372f3 = c21372f;
            modifier4 = modifier2;
            c28655q4.m87175r();
            i16 = a.f15169a[c21372f3.getAxis().ordinal()];
            if (i16 != 1) {
                c28655q4.m87150e0(-1480053155);
                f13 = 1;
                Modifier modifierM88149j2 = AbstractC29011e.m88149j(c2314t2, 0.0f, f13 - c21372f3.getPosition(), c21372f3.getAnchorPoint());
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, modifierM88149j2);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N2);
                modifier5 = modifier4;
                label = c21372f3.getLabel();
                if (label == null) {
                    c28655q4.m87150e0(1320217806);
                    c28655q4.m87173q(false);
                    f14 = f13;
                    modifier6 = modifier5;
                    f15 = 1.0f;
                    c2314t = c2314t2;
                    r14 = 0;
                    c28655q2 = c28655q4;
                } else {
                    c28655q4.m87150e0(1320217807);
                    C2886a b8 = C38072d.f163053a.m121952e(c28655q4, 6).getB4();
                    labelColorOverride = c21372f3.getLabelColorOverride();
                    if (labelColorOverride == null) {
                        c28655q4.m87150e0(-1405276090);
                        c28655q4.m87173q(false);
                        c17919xM31989h = null;
                    } else {
                        c28655q4.m87150e0(1894331163);
                        c17919xM31989h = AbstractC11895b.m31989h(c28655q4, false, labelColorOverride.mo134584toComposableColorWaAFU9c(c28655q4, 0));
                    }
                    if (c17919xM31989h == null) {
                        c28655q4.m87150e0(1894332763);
                        jMo134584toComposableColorWaAFU9c = c21372f3.getLabelStyle().getColor().mo134584toComposableColorWaAFU9c(c28655q4, 0);
                        c28655q4.m87173q(false);
                    } else {
                        c28655q4.m87150e0(1894330283);
                        c28655q4.m87173q(false);
                        jMo134584toComposableColorWaAFU9c = c17919xM31989h.f69639a;
                    }
                    modifier6 = modifier5;
                    f14 = f13;
                    AbstractC30795n.m94707h(label, null, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b8, null, c28655q4, 0, 0, 196602);
                    C28655q c28655q6 = c28655q4;
                    c2314t = c2314t2;
                    AbstractC22953f.m66715b(c28655q6, AbstractC1102d.m3424u(5, c2314t));
                    r14 = 0;
                    c28655q6.m87173q(false);
                    f15 = 1.0f;
                    c28655q2 = c28655q6;
                }
                modifier7 = modifier6;
                AbstractC22989q.m66760a(AbstractC18249c.m52565c(AbstractC1102d.m3411h(f14, AbstractC1102d.m3409f(f15, c2314t)).mo3471e(modifier7), AbstractC18249c.m52577o(c21372f3.getColor().mo134584toComposableColorWaAFU9c(c28655q2, r14))), c28655q2, r14);
                c28655q2.m87173q(true);
                c28655q2.m87173q(r14);
                c28655q3 = c28655q2;
            } else {
                if (i16 == 2) {
                    throw AbstractC11895b.m32003v(-879028995, c28655q4, false);
                }
                c28655q4.m87150e0(-1479088125);
                AbstractC22989q.m66760a(AbstractC18249c.m52565c(AbstractC1102d.m3424u(1, AbstractC29011e.m88149j(AbstractC1102d.m3406c(1.0f, c2314t2), c21372f3.getPosition(), 0.0f, c21372f3.getAnchorPoint())).mo3471e(modifier4), AbstractC18249c.m52577o(c21372f3.getColor().mo134584toComposableColorWaAFU9c(c28655q4, 0))), c28655q4, 0);
                c28655q4.m87173q(false);
                modifier7 = modifier4;
                c28655q3 = c28655q4;
            }
            modifier3 = modifier7;
            c21372f2 = c21372f3;
            c28655q = c28655q3;
        } else {
            c28655q4.m87138X();
            c21372f2 = c21372f;
            modifier3 = modifier2;
            c28655q = c28655q4;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3711a(modifier3, i13, c21372f2, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m11531c(Modifier modifier, C21372f c21372f, int i13, int i14, Composer composer, int i15) {
        m11530b(modifier, c21372f, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
