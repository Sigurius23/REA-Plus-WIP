package p730qt2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.AbstractC2890e;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15676d;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import java.util.Locale;
import java.util.regex.Pattern;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22949e;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qb0.C30179a;
import qe0.C30301b;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: qt2.n */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lqt2/m;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d", "(Landroidx/compose/ui/Modifier;Lqt2/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30608n {
    /* JADX WARN: Code duplicated, block: B:101:0x031c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0324  */
    /* JADX WARN: Code duplicated, block: B:106:0x0334  */
    /* JADX WARN: Code duplicated, block: B:108:0x0342  */
    /* JADX WARN: Code duplicated, block: B:113:0x035a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0364  */
    /* JADX WARN: Code duplicated, block: B:117:0x0371  */
    /* JADX WARN: Code duplicated, block: B:120:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:122:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:124:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:127:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0094  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:55:0x014c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0150  */
    /* JADX WARN: Code duplicated, block: B:59:0x0165  */
    /* JADX WARN: Code duplicated, block: B:62:0x0176  */
    /* JADX WARN: Code duplicated, block: B:67:0x025b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0269  */
    /* JADX WARN: Code duplicated, block: B:73:0x0286  */
    /* JADX WARN: Code duplicated, block: B:75:0x0294  */
    /* JADX WARN: Code duplicated, block: B:76:0x0296  */
    /* JADX WARN: Code duplicated, block: B:79:0x029d  */
    /* JADX WARN: Code duplicated, block: B:85:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:88:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:92:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:94:0x02da  */
    /* JADX WARN: Code duplicated, block: B:97:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:98:0x02f9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v15 */
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
    /* JADX INFO: renamed from: d */
    public static final void m93924d(Modifier modifier, C30607m viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        Object obj;
        Function1 function3;
        String strM21274h;
        C17919x c17919x;
        long jM53363d;
        long j7;
        int i17;
        String strReplaceAll;
        float f13;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i18;
        int i19;
        C2314t c2314t;
        C2314t c2314t2;
        Function1 function5;
        ?? r10;
        Modifier modifierM3362g;
        String strConcat;
        int iHashCode2;
        TextResource textResourceM93916a;
        boolean z13;
        C28655q c28655q2;
        EnumC16313m0 enumC16313m0M93917b;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-598487044);
        if ((i13 & 6) == 0) {
            i15 = (c28655q3.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q3.m87153g(viewState) : c28655q3.m87157i(viewState) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q3.m87157i(function2) ? 256 : 128;
            }
            i16 = i15;
            if ((i16 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i16 & 1, z4)) {
                obj = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R2 = c28655q3.m87133R();
                    if (objM87133R2 == obj) {
                        objM87133R2 = new C30301b(26);
                        c28655q3.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                } else {
                    function3 = function2;
                }
                strM21274h = null;
                if (viewState.getNavDestination() == null) {
                    c28655q3.m87150e0(-1118125867);
                    c28655q3.m87173q(false);
                    c17919x = null;
                } else {
                    c28655q3.m87150e0(-1118125866);
                    c17919x = new C17919x(AbstractC31061c.m95624D(C38072d.f163053a, c28655q3, C38072d.f163054b, false));
                }
                if (c17919x == null) {
                    c28655q3.m87150e0(379575619);
                    jM53363d = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q3, C38072d.f163054b, false);
                } else {
                    c28655q3.m87150e0(379572643);
                    c28655q3.m87173q(false);
                    jM53363d = c17919x.f69639a;
                }
                j7 = jM53363d;
                TextResource textResourceM93920e = viewState.getTitle();
                i17 = TextResource.$stable;
                String lowerCase = AbstractC8693b.m21274h(textResourceM93920e, c28655q3, i17).toLowerCase(Locale.ROOT);
                AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                String strM125926K = AbstractC39421y.m125926K(lowerCase, " ", "_", false);
                Pattern patternCompile = Pattern.compile("[^a-z0-9_]");
                AbstractC22676k.m65749i(patternCompile, "compile(...)");
                strReplaceAll = patternCompile.matcher(strM125926K).replaceAll("");
                AbstractC22676k.m65749i(strReplaceAll, "replaceAll(...)");
                f13 = 4;
                float f14 = 1 * f13;
                function4 = function3;
                Modifier modifierM3398t = AbstractC1099a.m3398t(modifier, f14, 0.0f, 0.0f, 0.0f, 14);
                C2306l c2306l = C2299e.f9109L;
                C22949e c22949e = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q3, 48);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3398t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i2, c22994r1M66759a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S) {
                    i18 = i16;
                } else {
                    i18 = i16;
                    if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N);
                    Modifier modifierM44101d = AbstractC15676d.m44101d(new VerticalAlignElement(c2306l), strReplaceAll.concat("_title"));
                    String strM21274h2 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q3, i17);
                    C38072d c38072d = C38072d.f163053a;
                    int i25 = C38072d.f163054b;
                    C2886a t14 = c38072d.m121952e(c28655q3, i25).getT3();
                    long brandWhite = c38072d.m121949b(c28655q3, i25).getBrandWhite();
                    int i26 = C2886a.f11498d << 18;
                    i19 = i18;
                    AbstractC30795n.m94707h(strM21274h2, modifierM44101d, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t14, null, c28655q3, 0, i26, 196600);
                    c2314t = C2314t.f9131w;
                    AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3424u(f14, c2314t));
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q3, i17), AbstractC15676d.m44101d(new VerticalAlignElement(c2306l), strReplaceAll.concat("_count")), c38072d.m121949b(c28655q3, i25).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i25).getT3(), null, c28655q3, 0, i26, 196600);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC22953f.m66715b(c28655q3, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2, 7);
                    if (viewState.getNavDestination() != null) {
                        c28655q3.m87150e0(988019742);
                        if ((i19 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i19 & 112) != 32 || ((i19 & 64) != 0 && c28655q3.m87157i(viewState))) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z15 | z14;
                        objM87133R = c28655q3.m87133R();
                        if (!z16 || objM87133R == obj) {
                            function5 = function4;
                            objM87133R = new C30599e(1, function5, viewState);
                            c28655q3.m87172p0(objM87133R);
                        } else {
                            function5 = function4;
                        }
                        modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                        c2314t2 = c2314t;
                        r10 = 0;
                        c28655q3.m87173q(false);
                    } else {
                        c2314t2 = c2314t;
                        function5 = function4;
                        r10 = 0;
                        c28655q3.m87150e0(988131218);
                        c28655q3.m87173q(false);
                        modifierM3362g = c2314t2;
                    }
                    Modifier modifierMo3471e = modifierM3398t2.mo3471e(modifierM3362g);
                    if (viewState.getButtonTitle() != null) {
                        strConcat = strReplaceAll.concat("_edit_button");
                    } else {
                        strConcat = null;
                    }
                    Modifier modifierM44101d2 = AbstractC15676d.m44101d(modifierMo3471e, strConcat);
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, C2299e.f9107J, c28655q3, r10);
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM44101d2);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i2, c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N2);
                    VerticalAlignElement verticalAlignElement = new VerticalAlignElement(c2306l);
                    textResourceM93916a = viewState.getButtonTitle();
                    if (textResourceM93916a == null) {
                        c28655q3.m87150e0(398344885);
                    } else {
                        c28655q3.m87150e0(398344886);
                        strM21274h = AbstractC8693b.m21274h(textResourceM93916a, c28655q3, i17);
                    }
                    c28655q3.m87173q(r10);
                    if (strM21274h == null) {
                        strM21274h = "";
                    }
                    Function1 function6 = function5;
                    z13 = r10;
                    AbstractC30795n.m94707h(strM21274h, verticalAlignElement, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, c28655q3, 0, i26, 196600);
                    c28655q2 = c28655q3;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f14, c2314t2));
                    enumC16313m0M93917b = viewState.getIcon();
                    if (enumC16313m0M93917b == null) {
                        c28655q2.m87150e0(398557576);
                        c28655q2.m87173q(z13);
                    } else {
                        AbstractC15005f3.m43108b(AbstractC18489d0.m53378s(c28655q2, 398557577, enumC16313m0M93917b, c28655q2, 6), AbstractC8693b.m21275i("", c28655q2, 6), AbstractC1102d.m3419p(f13 * f13, c2314t2), j7, c28655q2, 384, 0);
                        c28655q2.m87173q(z13);
                    }
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    function2 = function6;
                    c28655q = c28655q2;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N);
                Modifier modifierM44101d3 = AbstractC15676d.m44101d(new VerticalAlignElement(c2306l), strReplaceAll.concat("_title"));
                String strM21274h3 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q3, i17);
                C38072d c38072d2 = C38072d.f163053a;
                int i27 = C38072d.f163054b;
                C2886a t15 = c38072d2.m121952e(c28655q3, i27).getT3();
                long brandWhite2 = c38072d2.m121949b(c28655q3, i27).getBrandWhite();
                int i28 = C2886a.f11498d << 18;
                i19 = i18;
                AbstractC30795n.m94707h(strM21274h3, modifierM44101d3, brandWhite2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t15, null, c28655q3, 0, i28, 196600);
                c2314t = C2314t.f9131w;
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3424u(f14, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q3, i17), AbstractC15676d.m44101d(new VerticalAlignElement(c2306l), strReplaceAll.concat("_count")), c38072d2.m121949b(c28655q3, i27).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, i27).getT3(), null, c28655q3, 0, i28, 196600);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC22953f.m66715b(c28655q3, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2, 7);
                if (viewState.getNavDestination() != null) {
                    c28655q3.m87150e0(988019742);
                    if ((i19 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i19 & 112) != 32) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    z16 = z15 | z14;
                    objM87133R = c28655q3.m87133R();
                    if (z16) {
                        function5 = function4;
                        objM87133R = new C30599e(1, function5, viewState);
                        c28655q3.m87172p0(objM87133R);
                    } else {
                        function5 = function4;
                        objM87133R = new C30599e(1, function5, viewState);
                        c28655q3.m87172p0(objM87133R);
                    }
                    modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    c2314t2 = c2314t;
                    r10 = 0;
                    c28655q3.m87173q(false);
                } else {
                    c2314t2 = c2314t;
                    function5 = function4;
                    r10 = 0;
                    c28655q3.m87150e0(988131218);
                    c28655q3.m87173q(false);
                    modifierM3362g = c2314t2;
                }
                Modifier modifierMo3471e2 = modifierM3398t3.mo3471e(modifierM3362g);
                if (viewState.getButtonTitle() != null) {
                    strConcat = strReplaceAll.concat("_edit_button");
                } else {
                    strConcat = null;
                }
                Modifier modifierM44101d4 = AbstractC15676d.m44101d(modifierMo3471e2, strConcat);
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22949e, C2299e.f9107J, c28655q3, r10);
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifierM44101d4);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i2, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N3);
                VerticalAlignElement verticalAlignElement2 = new VerticalAlignElement(c2306l);
                textResourceM93916a = viewState.getButtonTitle();
                if (textResourceM93916a == null) {
                    c28655q3.m87150e0(398344885);
                } else {
                    c28655q3.m87150e0(398344886);
                    strM21274h = AbstractC8693b.m21274h(textResourceM93916a, c28655q3, i17);
                }
                c28655q3.m87173q(r10);
                if (strM21274h == null) {
                    strM21274h = "";
                }
                Function1 function7 = function5;
                z13 = r10;
                AbstractC30795n.m94707h(strM21274h, verticalAlignElement2, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, c28655q3, 0, i28, 196600);
                c28655q2 = c28655q3;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f14, c2314t2));
                enumC16313m0M93917b = viewState.getIcon();
                if (enumC16313m0M93917b == null) {
                    c28655q2.m87150e0(398557576);
                    c28655q2.m87173q(z13);
                } else {
                    AbstractC15005f3.m43108b(AbstractC18489d0.m53378s(c28655q2, 398557577, enumC16313m0M93917b, c28655q2, 6), AbstractC8693b.m21275i("", c28655q2, 6), AbstractC1102d.m3419p(f13 * f13, c2314t2), j7, c28655q2, 384, 0);
                    c28655q2.m87173q(z13);
                }
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                function2 = function7;
                c28655q = c28655q2;
            } else {
                c28655q3.m87138X();
                c28655q = c28655q3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30179a(i13, i14, 13, modifier, viewState, function2);
            }
        }
        i15 |= 384;
        function2 = function1;
        i16 = i15;
        if ((i16 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q3.m87135U(i16 & 1, z4)) {
            obj = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R2 = c28655q3.m87133R();
                if (objM87133R2 == obj) {
                    objM87133R2 = new C30301b(26);
                    c28655q3.m87172p0(objM87133R2);
                }
                function3 = (Function1) objM87133R2;
            } else {
                function3 = function2;
            }
            strM21274h = null;
            if (viewState.getNavDestination() == null) {
                c28655q3.m87150e0(-1118125867);
                c28655q3.m87173q(false);
                c17919x = null;
            } else {
                c28655q3.m87150e0(-1118125866);
                c17919x = new C17919x(AbstractC31061c.m95624D(C38072d.f163053a, c28655q3, C38072d.f163054b, false));
            }
            if (c17919x == null) {
                c28655q3.m87150e0(379575619);
                jM53363d = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q3, C38072d.f163054b, false);
            } else {
                c28655q3.m87150e0(379572643);
                c28655q3.m87173q(false);
                jM53363d = c17919x.f69639a;
            }
            j7 = jM53363d;
            TextResource textResourceM93920e2 = viewState.getTitle();
            i17 = TextResource.$stable;
            String lowerCase2 = AbstractC8693b.m21274h(textResourceM93920e2, c28655q3, i17).toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
            String strM125926K2 = AbstractC39421y.m125926K(lowerCase2, " ", "_", false);
            Pattern patternCompile2 = Pattern.compile("[^a-z0-9_]");
            AbstractC22676k.m65749i(patternCompile2, "compile(...)");
            strReplaceAll = patternCompile2.matcher(strM125926K2).replaceAll("");
            AbstractC22676k.m65749i(strReplaceAll, "replaceAll(...)");
            f13 = 4;
            float f15 = 1 * f13;
            function4 = function3;
            Modifier modifierM3398t4 = AbstractC1099a.m3398t(modifier, f15, 0.0f, 0.0f, 0.0f, 14);
            C2306l c2306l2 = C2299e.f9109L;
            C22949e c22949e2 = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22949e2, c2306l2, c28655q3, 48);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q3.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q3, modifierM3398t4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i6, c22994r1M66759a4);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i7, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q3.f115903S) {
                i18 = i16;
                if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i8, modifierM118962N4);
                Modifier modifierM44101d5 = AbstractC15676d.m44101d(new VerticalAlignElement(c2306l2), strReplaceAll.concat("_title"));
                String strM21274h4 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q3, i17);
                C38072d c38072d3 = C38072d.f163053a;
                int i29 = C38072d.f163054b;
                C2886a t16 = c38072d3.m121952e(c28655q3, i29).getT3();
                long brandWhite3 = c38072d3.m121949b(c28655q3, i29).getBrandWhite();
                int i210 = C2886a.f11498d << 18;
                i19 = i18;
                AbstractC30795n.m94707h(strM21274h4, modifierM44101d5, brandWhite3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t16, null, c28655q3, 0, i210, 196600);
                c2314t = C2314t.f9131w;
                AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3424u(f15, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q3, i17), AbstractC15676d.m44101d(new VerticalAlignElement(c2306l2), strReplaceAll.concat("_count")), c38072d3.m121949b(c28655q3, i29).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q3, i29).getT3(), null, c28655q3, 0, i210, 196600);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC22953f.m66715b(c28655q3, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                Modifier modifierM3398t5 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2, 7);
                if (viewState.getNavDestination() != null) {
                    c28655q3.m87150e0(988019742);
                    if ((i19 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i19 & 112) != 32) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    z16 = z15 | z14;
                    objM87133R = c28655q3.m87133R();
                    if (z16) {
                        function5 = function4;
                        objM87133R = new C30599e(1, function5, viewState);
                        c28655q3.m87172p0(objM87133R);
                    } else {
                        function5 = function4;
                        objM87133R = new C30599e(1, function5, viewState);
                        c28655q3.m87172p0(objM87133R);
                    }
                    modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    c2314t2 = c2314t;
                    r10 = 0;
                    c28655q3.m87173q(false);
                } else {
                    c2314t2 = c2314t;
                    function5 = function4;
                    r10 = 0;
                    c28655q3.m87150e0(988131218);
                    c28655q3.m87173q(false);
                    modifierM3362g = c2314t2;
                }
                Modifier modifierMo3471e3 = modifierM3398t5.mo3471e(modifierM3362g);
                if (viewState.getButtonTitle() != null) {
                    strConcat = strReplaceAll.concat("_edit_button");
                } else {
                    strConcat = null;
                }
                Modifier modifierM44101d6 = AbstractC15676d.m44101d(modifierMo3471e3, strConcat);
                C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, c28655q3, r10);
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q3.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q3, modifierM44101d6);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i6, c22994r1M66759a5);
                AbstractC28683x.m87239G(c28655q3, c0209i7, interfaceC28653p1M87165m5);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i8, modifierM118962N5);
                VerticalAlignElement verticalAlignElement3 = new VerticalAlignElement(c2306l2);
                textResourceM93916a = viewState.getButtonTitle();
                if (textResourceM93916a == null) {
                    c28655q3.m87150e0(398344885);
                } else {
                    c28655q3.m87150e0(398344886);
                    strM21274h = AbstractC8693b.m21274h(textResourceM93916a, c28655q3, i17);
                }
                c28655q3.m87173q(r10);
                if (strM21274h == null) {
                    strM21274h = "";
                }
                Function1 function8 = function5;
                z13 = r10;
                AbstractC30795n.m94707h(strM21274h, verticalAlignElement3, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, c28655q3, 0, i210, 196600);
                c28655q2 = c28655q3;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f15, c2314t2));
                enumC16313m0M93917b = viewState.getIcon();
                if (enumC16313m0M93917b == null) {
                    c28655q2.m87150e0(398557576);
                    c28655q2.m87173q(z13);
                } else {
                    AbstractC15005f3.m43108b(AbstractC18489d0.m53378s(c28655q2, 398557577, enumC16313m0M93917b, c28655q2, 6), AbstractC8693b.m21275i("", c28655q2, 6), AbstractC1102d.m3419p(f13 * f13, c2314t2), j7, c28655q2, 384, 0);
                    c28655q2.m87173q(z13);
                }
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                function2 = function8;
                c28655q = c28655q2;
            } else {
                i18 = i16;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i9, modifierM118962N4);
            Modifier modifierM44101d7 = AbstractC15676d.m44101d(new VerticalAlignElement(c2306l2), strReplaceAll.concat("_title"));
            String strM21274h5 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q3, i17);
            C38072d c38072d4 = C38072d.f163053a;
            int i211 = C38072d.f163054b;
            C2886a t17 = c38072d4.m121952e(c28655q3, i211).getT3();
            long brandWhite4 = c38072d4.m121949b(c28655q3, i211).getBrandWhite();
            int i212 = C2886a.f11498d << 18;
            i19 = i18;
            AbstractC30795n.m94707h(strM21274h5, modifierM44101d7, brandWhite4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t17, null, c28655q3, 0, i212, 196600);
            c2314t = C2314t.f9131w;
            AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3424u(f15, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q3, i17), AbstractC15676d.m44101d(new VerticalAlignElement(c2306l2), strReplaceAll.concat("_count")), c38072d4.m121949b(c28655q3, i211).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q3, i211).getT3(), null, c28655q3, 0, i212, 196600);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(c28655q3, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            Modifier modifierM3398t6 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2, 7);
            if (viewState.getNavDestination() != null) {
                c28655q3.m87150e0(988019742);
                if ((i19 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i19 & 112) != 32) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                z16 = z15 | z14;
                objM87133R = c28655q3.m87133R();
                if (z16) {
                    function5 = function4;
                    objM87133R = new C30599e(1, function5, viewState);
                    c28655q3.m87172p0(objM87133R);
                } else {
                    function5 = function4;
                    objM87133R = new C30599e(1, function5, viewState);
                    c28655q3.m87172p0(objM87133R);
                }
                modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                c2314t2 = c2314t;
                r10 = 0;
                c28655q3.m87173q(false);
            } else {
                c2314t2 = c2314t;
                function5 = function4;
                r10 = 0;
                c28655q3.m87150e0(988131218);
                c28655q3.m87173q(false);
                modifierM3362g = c2314t2;
            }
            Modifier modifierMo3471e4 = modifierM3398t6.mo3471e(modifierM3362g);
            if (viewState.getButtonTitle() != null) {
                strConcat = strReplaceAll.concat("_edit_button");
            } else {
                strConcat = null;
            }
            Modifier modifierM44101d8 = AbstractC15676d.m44101d(modifierMo3471e4, strConcat);
            C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(c22949e2, C2299e.f9107J, c28655q3, r10);
            iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q3.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q3, modifierM44101d8);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i6, c22994r1M66759a6);
            AbstractC28683x.m87239G(c28655q3, c0209i7, interfaceC28653p1M87165m6);
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i9, modifierM118962N6);
            VerticalAlignElement verticalAlignElement4 = new VerticalAlignElement(c2306l2);
            textResourceM93916a = viewState.getButtonTitle();
            if (textResourceM93916a == null) {
                c28655q3.m87150e0(398344885);
            } else {
                c28655q3.m87150e0(398344886);
                strM21274h = AbstractC8693b.m21274h(textResourceM93916a, c28655q3, i17);
            }
            c28655q3.m87173q(r10);
            if (strM21274h == null) {
                strM21274h = "";
            }
            Function1 function9 = function5;
            z13 = r10;
            AbstractC30795n.m94707h(strM21274h, verticalAlignElement4, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getBtS(), null, c28655q3, 0, i212, 196600);
            c28655q2 = c28655q3;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f15, c2314t2));
            enumC16313m0M93917b = viewState.getIcon();
            if (enumC16313m0M93917b == null) {
                c28655q2.m87150e0(398557576);
                c28655q2.m87173q(z13);
            } else {
                AbstractC15005f3.m43108b(AbstractC18489d0.m53378s(c28655q2, 398557577, enumC16313m0M93917b, c28655q2, 6), AbstractC8693b.m21275i("", c28655q2, 6), AbstractC1102d.m3419p(f13 * f13, c2314t2), j7, c28655q2, 384, 0);
                c28655q2.m87173q(z13);
            }
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
            function2 = function9;
            c28655q = c28655q2;
        } else {
            c28655q3.m87138X();
            c28655q = c28655q3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30179a(i13, i14, 13, modifier, viewState, function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m93925e(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m93926f(Function1 function1, C30607m c30607m) {
        function1.invoke(c30607m.getNavDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m93927g(Modifier modifier, C30607m c30607m, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m93924d(modifier, c30607m, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
