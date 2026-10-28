package nq2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.user.journey.model.yearinreview.StyleType;
import ih0.AbstractC18489d0;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m31.C25002h;
import no1.C26993g;
import no2.C26995a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: nq2.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lnq2/i;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Lnq2/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27065h {

    /* JADX INFO: renamed from: nq2.h$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f108189a;

        static {
            int[] iArr = new int[StyleType.values().length];
            try {
                iArr[StyleType.NUMBER_LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleType.NUMBER_MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleType.TEXT_LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f108189a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:101:0x026d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0275  */
    /* JADX WARN: Code duplicated, block: B:106:0x028e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0310  */
    /* JADX WARN: Code duplicated, block: B:110:0x031c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0373  */
    /* JADX WARN: Code duplicated, block: B:115:0x0380  */
    /* JADX WARN: Code duplicated, block: B:117:0x038f  */
    /* JADX WARN: Code duplicated, block: B:120:0x03a8 A[LOOP:0: B:118:0x03a2->B:120:0x03a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:122:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:125:0x03da  */
    /* JADX WARN: Code duplicated, block: B:128:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:61:0x0102  */
    /* JADX WARN: Code duplicated, block: B:63:0x0109  */
    /* JADX WARN: Code duplicated, block: B:64:0x010e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0111  */
    /* JADX WARN: Code duplicated, block: B:67:0x0116  */
    /* JADX WARN: Code duplicated, block: B:70:0x011b  */
    /* JADX WARN: Code duplicated, block: B:72:0x013b  */
    /* JADX WARN: Code duplicated, block: B:75:0x014d  */
    /* JADX WARN: Code duplicated, block: B:78:0x018e  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x021a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0222  */
    /* JADX WARN: Code duplicated, block: B:89:0x0232  */
    /* JADX WARN: Code duplicated, block: B:91:0x0240  */
    /* JADX WARN: Code duplicated, block: B:96:0x0266  */
    /* JADX WARN: Code duplicated, block: B:98:0x0269  */
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
    /* JADX INFO: renamed from: e */
    public static final void m81350e(C27066i c27066i, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        Function1 function2;
        int i17;
        int i18;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        float f13;
        float f14;
        float f15;
        float f16;
        Modifier modifier5;
        C22957g c22957g;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        InterfaceC35689r0 interfaceC35689r0M81358c;
        C0209i c0209i5;
        float f17;
        C2314t c2314t2;
        C0213j c0213j2;
        C0209i c0209i6;
        C0209i c0209i7;
        C0209i c0209i8;
        Modifier modifier6;
        C22957g c22957g2;
        int i19;
        boolean z13;
        int iHashCode2;
        int i24;
        int i25;
        char c3;
        C2886a c2886aM8442w;
        C38072d c38072d;
        int i26;
        int i27;
        float f18;
        boolean z14;
        int i28;
        C2314t c2314t3;
        TextResource textResourceM81360f;
        List<InterfaceC25312u> listM81357b;
        Iterator<T> it;
        Object objM87133R;
        Object objM87133R2;
        String strM81359e;
        String strM113135b;
        Object objM87133R3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1931884979);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(c27066i) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i29 = i14 & 2;
        if (i29 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i15;
                if ((i18 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i18 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i29 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C26993g(8);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function3 = (Function1) objM87133R3;
                    } else {
                        function3 = function2;
                    }
                    f13 = 3;
                    f14 = 4;
                    f15 = 8;
                    f16 = 2 * f15;
                    Modifier modifierM3394p = AbstractC1099a.m3394p(f16, AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, modifier4), f13, f14));
                    C2305k c2305k = C2299e.f9111N;
                    modifier5 = modifier4;
                    c22957g = AbstractC22977m.f90652c;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    interfaceC35689r0M81358c = c27066i.getLottieTesterSource();
                    if (interfaceC35689r0M81358c == null) {
                        strM81359e = c27066i.getLottieUrl();
                        if (strM81359e != null) {
                            strM113135b = InterfaceC35689r0.e.m113135b(strM81359e);
                        } else {
                            strM113135b = null;
                        }
                        if (strM113135b != null) {
                            interfaceC35689r0M81358c = InterfaceC35689r0.e.m113134a(strM113135b);
                        } else {
                            interfaceC35689r0M81358c = null;
                        }
                    }
                    if (interfaceC35689r0M81358c != null) {
                        c28655q.m87150e0(2018049177);
                        Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1099a.m3392n(AbstractC1102d.m3419p(80 * f14, c2314t), 0.0f, f13 * f15, 1), 0.0f, 1 * f14, 1);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C26995a(10);
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C26993g(9);
                            c28655q.m87172p0(objM87133R2);
                        }
                        c0209i6 = c0209i;
                        f17 = f14;
                        c0209i5 = c0209i4;
                        c2314t2 = c2314t;
                        modifier6 = modifier5;
                        c0213j2 = c0213j;
                        c0209i7 = c0209i2;
                        c0209i8 = c0209i3;
                        InterfaceC35689r0 interfaceC35689r0 = interfaceC35689r0M81358c;
                        i19 = i18;
                        c22957g2 = c22957g;
                        z13 = false;
                        AbstractC35684p.m113047h(modifierM3396r, interfaceC35689r0, false, 0.0f, 0, interfaceC4339a, (Function1) objM87133R2, null, null, c28655q, 1769478, 412);
                        c28655q.m87173q(false);
                    } else {
                        c0209i5 = c0209i4;
                        f17 = f14;
                        c2314t2 = c2314t;
                        c0213j2 = c0213j;
                        c0209i6 = c0209i;
                        c0209i7 = c0209i2;
                        c0209i8 = c0209i3;
                        modifier6 = modifier5;
                        c22957g2 = c22957g;
                        i19 = i18;
                        z13 = false;
                        if (c27066i.getImageUrl() != null) {
                            c28655q.m87150e0(2018479519);
                            AbstractC29125c.m88522c(AbstractC22404p.m64500i(new AbstractC22403o.c(c27066i.getImageUrl(), 0, 0, 0, 14, null), null, null, c28655q, AbstractC22403o.c.f87642f, 3), null, AbstractC1099a.m3394p(f16, AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(80 * f17, c2314t2))), null, null, 0.0f, null, c28655q, 432, 120);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(2018816613);
                            c28655q.m87173q(false);
                        }
                    }
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i8);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
                    TextResource textResourceM81362h = c27066i.getStatValueTitle();
                    i24 = TextResource.$stable;
                    String strM21274h = AbstractC8693b.m21274h(textResourceM81362h, c28655q, i24);
                    i25 = a.f108189a[c27066i.getStyleType().ordinal()];
                    if (i25 != 1) {
                        if (i25 != 2) {
                            c3 = 3;
                            if (i25 != 3) {
                                throw AbstractC11895b.m32003v(704559850, c28655q, z13);
                            }
                        } else {
                            c3 = 3;
                        }
                        c28655q.m87150e0(704566249);
                        c2886aM8442w = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getT2();
                        c28655q.m87173q(z13);
                    } else {
                        c3 = 3;
                        c28655q.m87150e0(704562601);
                        c2886aM8442w = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getN2();
                        c28655q.m87173q(z13);
                    }
                    C2886a c2886a = c2886aM8442w;
                    c38072d = C38072d.f163053a;
                    i26 = C38072d.f163054b;
                    long jM125430y = c38072d.m121949b(c28655q, i26).getBrandWhite();
                    i27 = C2886a.f11498d << 18;
                    f18 = f17;
                    C28655q c28655q2 = c28655q;
                    z14 = z13;
                    i28 = i19;
                    c2314t3 = c2314t2;
                    AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a, null, c28655q2, 0, i27, 196602);
                    c28655q = c28655q2;
                    textResourceM81360f = c27066i.getStatSubtitle();
                    if (textResourceM81360f == null) {
                        c28655q.m87150e0(366847936);
                        c28655q.m87173q(z14);
                    } else {
                        c28655q.m87150e0(366847937);
                        AbstractC11266d.m30469w(1, f18, c2314t3, c28655q);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM81360f, c28655q, i24), null, c27066i.getStatSubtitleColor().mo134584toComposableColorWaAFU9c(c28655q, z14 ? 1 : 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i26).getB1(), null, c28655q, 0, i27, 196602);
                        c28655q = c28655q;
                        c28655q.m87173q(z14);
                    }
                    listM81357b = c27066i.m81357b();
                    if (listM81357b == null) {
                        c28655q.m87150e0(367188688);
                        c28655q.m87173q(z14);
                        function3 = function3;
                    } else {
                        c28655q.m87150e0(367188689);
                        if (listM81357b.isEmpty()) {
                            c28655q.m87150e0(19517729);
                            c28655q.m87173q(z14);
                        } else {
                            c28655q.m87150e0(19216936);
                            AbstractC11266d.m30469w(6, f18, c2314t3, c28655q);
                            it = listM81357b.iterator();
                            while (it.hasNext()) {
                                AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, function3, c28655q, (i28 << 3) & 7168, 6);
                            }
                            c28655q.m87173q(z14);
                        }
                        c28655q.m87173q(z14);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    modifier3 = modifier6;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C25002h(i13, i14, 20, modifier3, function3, c27066i);
                }
            }
            i15 |= 384;
            function2 = function1;
            i18 = i15;
            if ((i18 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i18 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C26993g(8);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function3 = (Function1) objM87133R3;
                } else {
                    function3 = function2;
                }
                f13 = 3;
                f14 = 4;
                f15 = 8;
                f16 = 2 * f15;
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(f16, AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, modifier4), f13, f14));
                C2305k c2305k2 = C2299e.f9111N;
                modifier5 = modifier4;
                c22957g = AbstractC22977m.f90652c;
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k2, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                interfaceC35689r0M81358c = c27066i.getLottieTesterSource();
                if (interfaceC35689r0M81358c == null) {
                    strM81359e = c27066i.getLottieUrl();
                    if (strM81359e != null) {
                        strM113135b = InterfaceC35689r0.e.m113135b(strM81359e);
                    } else {
                        strM113135b = null;
                    }
                    if (strM113135b != null) {
                        interfaceC35689r0M81358c = InterfaceC35689r0.e.m113134a(strM113135b);
                    } else {
                        interfaceC35689r0M81358c = null;
                    }
                }
                if (interfaceC35689r0M81358c != null) {
                    c28655q.m87150e0(2018049177);
                    Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1099a.m3392n(AbstractC1102d.m3419p(80 * f14, c2314t), 0.0f, f13 * f15, 1), 0.0f, 1 * f14, 1);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C26995a(10);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C26993g(9);
                        c28655q.m87172p0(objM87133R2);
                    }
                    c0209i6 = c0209i;
                    f17 = f14;
                    c0209i5 = c0209i4;
                    c2314t2 = c2314t;
                    modifier6 = modifier5;
                    c0213j2 = c0213j;
                    c0209i7 = c0209i2;
                    c0209i8 = c0209i3;
                    InterfaceC35689r0 interfaceC35689r1 = interfaceC35689r0M81358c;
                    i19 = i18;
                    c22957g2 = c22957g;
                    z13 = false;
                    AbstractC35684p.m113047h(modifierM3396r2, interfaceC35689r1, false, 0.0f, 0, interfaceC4339a2, (Function1) objM87133R2, null, null, c28655q, 1769478, 412);
                    c28655q.m87173q(false);
                } else {
                    c0209i5 = c0209i4;
                    f17 = f14;
                    c2314t2 = c2314t;
                    c0213j2 = c0213j;
                    c0209i6 = c0209i;
                    c0209i7 = c0209i2;
                    c0209i8 = c0209i3;
                    modifier6 = modifier5;
                    c22957g2 = c22957g;
                    i19 = i18;
                    z13 = false;
                    if (c27066i.getImageUrl() != null) {
                        c28655q.m87150e0(2018479519);
                        AbstractC29125c.m88522c(AbstractC22404p.m64500i(new AbstractC22403o.c(c27066i.getImageUrl(), 0, 0, 0, 14, null), null, null, c28655q, AbstractC22403o.c.f87642f, 3), null, AbstractC1099a.m3394p(f16, AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(80 * f17, c2314t2))), null, null, 0.0f, null, c28655q, 432, 120);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(2018816613);
                        c28655q.m87173q(false);
                    }
                }
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i8);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i8);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N4);
                TextResource textResourceM81362h2 = c27066i.getStatValueTitle();
                i24 = TextResource.$stable;
                String strM21274h2 = AbstractC8693b.m21274h(textResourceM81362h2, c28655q, i24);
                i25 = a.f108189a[c27066i.getStyleType().ordinal()];
                if (i25 != 1) {
                    if (i25 != 2) {
                        c3 = 3;
                        if (i25 != 3) {
                            throw AbstractC11895b.m32003v(704559850, c28655q, z13);
                        }
                    } else {
                        c3 = 3;
                    }
                    c28655q.m87150e0(704566249);
                    c2886aM8442w = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getT2();
                    c28655q.m87173q(z13);
                } else {
                    c3 = 3;
                    c28655q.m87150e0(704562601);
                    c2886aM8442w = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getN2();
                    c28655q.m87173q(z13);
                }
                C2886a c2886a2 = c2886aM8442w;
                c38072d = C38072d.f163053a;
                i26 = C38072d.f163054b;
                long jM125430y2 = c38072d.m121949b(c28655q, i26).getBrandWhite();
                i27 = C2886a.f11498d << 18;
                f18 = f17;
                C28655q c28655q3 = c28655q;
                z14 = z13;
                i28 = i19;
                c2314t3 = c2314t2;
                AbstractC30795n.m94707h(strM21274h2, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a2, null, c28655q3, 0, i27, 196602);
                c28655q = c28655q3;
                textResourceM81360f = c27066i.getStatSubtitle();
                if (textResourceM81360f == null) {
                    c28655q.m87150e0(366847936);
                    c28655q.m87173q(z14);
                } else {
                    c28655q.m87150e0(366847937);
                    AbstractC11266d.m30469w(1, f18, c2314t3, c28655q);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM81360f, c28655q, i24), null, c27066i.getStatSubtitleColor().mo134584toComposableColorWaAFU9c(c28655q, z14 ? 1 : 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i26).getB1(), null, c28655q, 0, i27, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(z14);
                }
                listM81357b = c27066i.m81357b();
                if (listM81357b == null) {
                    c28655q.m87150e0(367188688);
                    c28655q.m87173q(z14);
                    function3 = function3;
                } else {
                    c28655q.m87150e0(367188689);
                    if (listM81357b.isEmpty()) {
                        c28655q.m87150e0(19216936);
                        AbstractC11266d.m30469w(6, f18, c2314t3, c28655q);
                        it = listM81357b.iterator();
                        while (it.hasNext()) {
                            AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, function3, c28655q, (i28 << 3) & 7168, 6);
                        }
                        c28655q.m87173q(z14);
                    } else {
                        c28655q.m87150e0(19517729);
                        c28655q.m87173q(z14);
                    }
                    c28655q.m87173q(z14);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier6;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C25002h(i13, i14, 20, modifier3, function3, c27066i);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i15;
            if ((i18 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i18 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i29 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C26993g(8);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function3 = (Function1) objM87133R3;
                } else {
                    function3 = function2;
                }
                f13 = 3;
                f14 = 4;
                f15 = 8;
                f16 = 2 * f15;
                Modifier modifierM3394p3 = AbstractC1099a.m3394p(f16, AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, modifier4), f13, f14));
                C2305k c2305k3 = C2299e.f9111N;
                modifier5 = modifier4;
                c22957g = AbstractC22977m.f90652c;
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g, c2305k3, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3394p3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a5);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N5);
                interfaceC35689r0M81358c = c27066i.getLottieTesterSource();
                if (interfaceC35689r0M81358c == null) {
                    strM81359e = c27066i.getLottieUrl();
                    if (strM81359e != null) {
                        strM113135b = InterfaceC35689r0.e.m113135b(strM81359e);
                    } else {
                        strM113135b = null;
                    }
                    if (strM113135b != null) {
                        interfaceC35689r0M81358c = InterfaceC35689r0.e.m113134a(strM113135b);
                    } else {
                        interfaceC35689r0M81358c = null;
                    }
                }
                if (interfaceC35689r0M81358c != null) {
                    c28655q.m87150e0(2018049177);
                    Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC1099a.m3392n(AbstractC1102d.m3419p(80 * f14, c2314t), 0.0f, f13 * f15, 1), 0.0f, 1 * f14, 1);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C26995a(10);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C26993g(9);
                        c28655q.m87172p0(objM87133R2);
                    }
                    c0209i6 = c0209i;
                    f17 = f14;
                    c0209i5 = c0209i4;
                    c2314t2 = c2314t;
                    modifier6 = modifier5;
                    c0213j2 = c0213j;
                    c0209i7 = c0209i2;
                    c0209i8 = c0209i3;
                    InterfaceC35689r0 interfaceC35689r2 = interfaceC35689r0M81358c;
                    i19 = i18;
                    c22957g2 = c22957g;
                    z13 = false;
                    AbstractC35684p.m113047h(modifierM3396r3, interfaceC35689r2, false, 0.0f, 0, interfaceC4339a3, (Function1) objM87133R2, null, null, c28655q, 1769478, 412);
                    c28655q.m87173q(false);
                } else {
                    c0209i5 = c0209i4;
                    f17 = f14;
                    c2314t2 = c2314t;
                    c0213j2 = c0213j;
                    c0209i6 = c0209i;
                    c0209i7 = c0209i2;
                    c0209i8 = c0209i3;
                    modifier6 = modifier5;
                    c22957g2 = c22957g;
                    i19 = i18;
                    z13 = false;
                    if (c27066i.getImageUrl() != null) {
                        c28655q.m87150e0(2018479519);
                        AbstractC29125c.m88522c(AbstractC22404p.m64500i(new AbstractC22403o.c(c27066i.getImageUrl(), 0, 0, 0, 14, null), null, null, c28655q, AbstractC22403o.c.f87642f, 3), null, AbstractC1099a.m3394p(f16, AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(80 * f17, c2314t2))), null, null, 0.0f, null, c28655q, 432, 120);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(2018816613);
                        c28655q.m87173q(false);
                    }
                }
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t2);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, c2305k3, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i8);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i8);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N6);
                TextResource textResourceM81362h3 = c27066i.getStatValueTitle();
                i24 = TextResource.$stable;
                String strM21274h3 = AbstractC8693b.m21274h(textResourceM81362h3, c28655q, i24);
                i25 = a.f108189a[c27066i.getStyleType().ordinal()];
                if (i25 != 1) {
                    if (i25 != 2) {
                        c3 = 3;
                        if (i25 != 3) {
                            throw AbstractC11895b.m32003v(704559850, c28655q, z13);
                        }
                    } else {
                        c3 = 3;
                    }
                    c28655q.m87150e0(704566249);
                    c2886aM8442w = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getT2();
                    c28655q.m87173q(z13);
                } else {
                    c3 = 3;
                    c28655q.m87150e0(704562601);
                    c2886aM8442w = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getN2();
                    c28655q.m87173q(z13);
                }
                C2886a c2886a3 = c2886aM8442w;
                c38072d = C38072d.f163053a;
                i26 = C38072d.f163054b;
                long jM125430y3 = c38072d.m121949b(c28655q, i26).getBrandWhite();
                i27 = C2886a.f11498d << 18;
                f18 = f17;
                C28655q c28655q4 = c28655q;
                z14 = z13;
                i28 = i19;
                c2314t3 = c2314t2;
                AbstractC30795n.m94707h(strM21274h3, null, jM125430y3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a3, null, c28655q4, 0, i27, 196602);
                c28655q = c28655q4;
                textResourceM81360f = c27066i.getStatSubtitle();
                if (textResourceM81360f == null) {
                    c28655q.m87150e0(366847936);
                    c28655q.m87173q(z14);
                } else {
                    c28655q.m87150e0(366847937);
                    AbstractC11266d.m30469w(1, f18, c2314t3, c28655q);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM81360f, c28655q, i24), null, c27066i.getStatSubtitleColor().mo134584toComposableColorWaAFU9c(c28655q, z14 ? 1 : 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i26).getB1(), null, c28655q, 0, i27, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(z14);
                }
                listM81357b = c27066i.m81357b();
                if (listM81357b == null) {
                    c28655q.m87150e0(367188688);
                    c28655q.m87173q(z14);
                    function3 = function3;
                } else {
                    c28655q.m87150e0(367188689);
                    if (listM81357b.isEmpty()) {
                        c28655q.m87150e0(19216936);
                        AbstractC11266d.m30469w(6, f18, c2314t3, c28655q);
                        it = listM81357b.iterator();
                        while (it.hasNext()) {
                            AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, function3, c28655q, (i28 << 3) & 7168, 6);
                        }
                        c28655q.m87173q(z14);
                    } else {
                        c28655q.m87150e0(19517729);
                        c28655q.m87173q(z14);
                    }
                    c28655q.m87173q(z14);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier6;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C25002h(i13, i14, 20, modifier3, function3, c27066i);
            }
        }
        i15 |= 384;
        function2 = function1;
        i18 = i15;
        if ((i18 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i18 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i29 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C26993g(8);
                    c28655q.m87172p0(objM87133R3);
                }
                function3 = (Function1) objM87133R3;
            } else {
                function3 = function2;
            }
            f13 = 3;
            f14 = 4;
            f15 = 8;
            f16 = 2 * f15;
            Modifier modifierM3394p4 = AbstractC1099a.m3394p(f16, AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, modifier4), f13, f14));
            C2305k c2305k4 = C2299e.f9111N;
            modifier5 = modifier4;
            c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g, c2305k4, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3394p4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a7);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m7);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N7);
            interfaceC35689r0M81358c = c27066i.getLottieTesterSource();
            if (interfaceC35689r0M81358c == null) {
                strM81359e = c27066i.getLottieUrl();
                if (strM81359e != null) {
                    strM113135b = InterfaceC35689r0.e.m113135b(strM81359e);
                } else {
                    strM113135b = null;
                }
                if (strM113135b != null) {
                    interfaceC35689r0M81358c = InterfaceC35689r0.e.m113134a(strM113135b);
                } else {
                    interfaceC35689r0M81358c = null;
                }
            }
            if (interfaceC35689r0M81358c != null) {
                c28655q.m87150e0(2018049177);
                Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC1099a.m3392n(AbstractC1102d.m3419p(80 * f14, c2314t), 0.0f, f13 * f15, 1), 0.0f, 1 * f14, 1);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C26995a(10);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C26993g(9);
                    c28655q.m87172p0(objM87133R2);
                }
                c0209i6 = c0209i;
                f17 = f14;
                c0209i5 = c0209i4;
                c2314t2 = c2314t;
                modifier6 = modifier5;
                c0213j2 = c0213j;
                c0209i7 = c0209i2;
                c0209i8 = c0209i3;
                InterfaceC35689r0 interfaceC35689r3 = interfaceC35689r0M81358c;
                i19 = i18;
                c22957g2 = c22957g;
                z13 = false;
                AbstractC35684p.m113047h(modifierM3396r4, interfaceC35689r3, false, 0.0f, 0, interfaceC4339a4, (Function1) objM87133R2, null, null, c28655q, 1769478, 412);
                c28655q.m87173q(false);
            } else {
                c0209i5 = c0209i4;
                f17 = f14;
                c2314t2 = c2314t;
                c0213j2 = c0213j;
                c0209i6 = c0209i;
                c0209i7 = c0209i2;
                c0209i8 = c0209i3;
                modifier6 = modifier5;
                c22957g2 = c22957g;
                i19 = i18;
                z13 = false;
                if (c27066i.getImageUrl() != null) {
                    c28655q.m87150e0(2018479519);
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(new AbstractC22403o.c(c27066i.getImageUrl(), 0, 0, 0, 14, null), null, null, c28655q, AbstractC22403o.c.f87642f, 3), null, AbstractC1099a.m3394p(f16, AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(80 * f17, c2314t2))), null, null, 0.0f, null, c28655q, 432, 120);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(2018816613);
                    c28655q.m87173q(false);
                }
            }
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t2);
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g2, c2305k4, c28655q, 48);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a8);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m8);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i8);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i8);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N8);
            TextResource textResourceM81362h4 = c27066i.getStatValueTitle();
            i24 = TextResource.$stable;
            String strM21274h4 = AbstractC8693b.m21274h(textResourceM81362h4, c28655q, i24);
            i25 = a.f108189a[c27066i.getStyleType().ordinal()];
            if (i25 != 1) {
                if (i25 != 2) {
                    c3 = 3;
                    if (i25 != 3) {
                        throw AbstractC11895b.m32003v(704559850, c28655q, z13);
                    }
                } else {
                    c3 = 3;
                }
                c28655q.m87150e0(704566249);
                c2886aM8442w = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getT2();
                c28655q.m87173q(z13);
            } else {
                c3 = 3;
                c28655q.m87150e0(704562601);
                c2886aM8442w = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getN2();
                c28655q.m87173q(z13);
            }
            C2886a c2886a4 = c2886aM8442w;
            c38072d = C38072d.f163053a;
            i26 = C38072d.f163054b;
            long jM125430y4 = c38072d.m121949b(c28655q, i26).getBrandWhite();
            i27 = C2886a.f11498d << 18;
            f18 = f17;
            C28655q c28655q5 = c28655q;
            z14 = z13;
            i28 = i19;
            c2314t3 = c2314t2;
            AbstractC30795n.m94707h(strM21274h4, null, jM125430y4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a4, null, c28655q5, 0, i27, 196602);
            c28655q = c28655q5;
            textResourceM81360f = c27066i.getStatSubtitle();
            if (textResourceM81360f == null) {
                c28655q.m87150e0(366847936);
                c28655q.m87173q(z14);
            } else {
                c28655q.m87150e0(366847937);
                AbstractC11266d.m30469w(1, f18, c2314t3, c28655q);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM81360f, c28655q, i24), null, c27066i.getStatSubtitleColor().mo134584toComposableColorWaAFU9c(c28655q, z14 ? 1 : 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i26).getB1(), null, c28655q, 0, i27, 196602);
                c28655q = c28655q;
                c28655q.m87173q(z14);
            }
            listM81357b = c27066i.m81357b();
            if (listM81357b == null) {
                c28655q.m87150e0(367188688);
                c28655q.m87173q(z14);
                function3 = function3;
            } else {
                c28655q.m87150e0(367188689);
                if (listM81357b.isEmpty()) {
                    c28655q.m87150e0(19216936);
                    AbstractC11266d.m30469w(6, f18, c2314t3, c28655q);
                    it = listM81357b.iterator();
                    while (it.hasNext()) {
                        AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, function3, c28655q, (i28 << 3) & 7168, 6);
                    }
                    c28655q.m87173q(z14);
                } else {
                    c28655q.m87150e0(19517729);
                    c28655q.m87173q(z14);
                }
                c28655q.m87173q(z14);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier3 = modifier6;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25002h(i13, i14, 20, modifier3, function3, c27066i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m81351f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m81352g() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m81353h(float f13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m81354i(C27066i c27066i, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m81350e(c27066i, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
