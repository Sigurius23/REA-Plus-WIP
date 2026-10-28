package p163g1;

import android.text.SpannableString;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b30.C2647w2;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import d40.AbstractC11673r;
import d40.C11669n;
import d40.C11671p;
import g40.AbstractC15376j4;
import g40.InterfaceC15391m3;
import ge3.AbstractC15751g;
import i01.C17841d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p097ds.AbstractC12314q;
import p164g2.C15247s;
import p208i2.InterfaceC17869a1;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p412q3.C29891y;
import p412q3.InterfaceC29873g0;
import p530up.AbstractC35148d;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import wb3.AbstractC37056f;
import xb3.AbstractC38176k;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yb3.C39410n;
import yb3.C39412p;
import yb3.EnumC39413q;
import yb3.InterfaceC39407k;
import z30.C40039b;

/* JADX INFO: renamed from: g1.g4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15017g4 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f56189E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f56190F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f56191G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f56192H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56193w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f56194x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f56195y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f56196z;

    public C15017g4(C29891y c29891y, boolean z4, InterfaceC29873g0 interfaceC29873g0, InterfaceC21083i interfaceC21083i, InterfaceC4351m interfaceC4351m, InterfaceC17869a1 interfaceC17869a1, C15197y1 c15197y1) {
        this.f56195y = c29891y;
        this.f56194x = z4;
        this.f56196z = interfaceC29873g0;
        this.f56189E = interfaceC21083i;
        this.f56190F = interfaceC4351m;
        this.f56191G = interfaceC17869a1;
        this.f56192H = c15197y1;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x02fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x02ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:24:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:29:0x0115  */
    /* JADX WARN: Code duplicated, block: B:32:0x014b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0166  */
    /* JADX WARN: Code duplicated, block: B:36:0x0172  */
    /* JADX WARN: Code duplicated, block: B:38:0x017a  */
    /* JADX WARN: Code duplicated, block: B:39:0x017d  */
    /* JADX WARN: Code duplicated, block: B:41:0x018d  */
    /* JADX WARN: Code duplicated, block: B:43:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:49:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:53:0x0207  */
    /* JADX WARN: Code duplicated, block: B:59:0x0235  */
    /* JADX WARN: Code duplicated, block: B:62:0x026f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0273  */
    /* JADX WARN: Code duplicated, block: B:68:0x0294  */
    /* JADX WARN: Code duplicated, block: B:72:0x02d1 A[LOOP:1: B:70:0x02cb->B:72:0x02d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:82:0x0314 A[LOOP:3: B:80:0x030e->B:82:0x0314, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:89:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:92:0x03fe  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C2305k c2305k;
        C0209i c0209i;
        float f13;
        Function1 function1;
        int iM87266t;
        C2305k c2305k2;
        int i13;
        boolean z4;
        int iM87266t2;
        Function1 function2;
        boolean zM87153g;
        int i14;
        Object obj4;
        int iM87266t3;
        C0213j c0213j;
        C0209i c0209i2;
        ArrayList arrayList;
        Iterator it;
        ArrayList<String> arrayList2;
        String string;
        int i15 = this.f56193w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj5 = this.f56192H;
        Object obj6 = this.f56191G;
        Object obj7 = this.f56190F;
        Object obj8 = this.f56189E;
        Object obj9 = this.f56196z;
        Object obj10 = this.f56195y;
        switch (i15) {
            case 0:
                InterfaceC4351m interfaceC4351m = (InterfaceC4351m) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C28655q) composer).m87157i(interfaceC4351m) ? 4 : 2;
                }
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC21083i interfaceC21083i = (InterfaceC21083i) obj8;
                    InterfaceC17869a1 interfaceC17869a1 = (InterfaceC17869a1) obj6;
                    C15197y1 c15197y1 = (C15197y1) obj5;
                    boolean z13 = this.f56194x;
                    C15043i8.f56313a.m43132b(((C29891y) obj10).f122125a.f92135x, interfaceC4351m, z13, false, (InterfaceC29873g0) obj9, interfaceC21083i, false, null, (InterfaceC4351m) obj7, null, null, interfaceC17869a1, c15197y1, null, AbstractC37817c.m121344e(-185364670, c28655q, new C15006f4(z13, interfaceC21083i, c15197y1, interfaceC17869a1, 0)), c28655q, (iIntValue << 3) & 112, DfuBaseService.ERROR_REMOTE_MASK);
                } else {
                    c28655q.m87138X();
                }
                break;
            default:
                InterfaceC23013y ScrollableColumn = (InterfaceC23013y) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                C2305k c2305k3 = C2299e.f9110M;
                AbstractC22676k.m65750j(ScrollableColumn, "$this$ScrollableColumn");
                if ((iIntValue2 & 17) == 16) {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    }
                }
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, C11671p.f37685f.f37645b, 0.0f, 0.0f, 13);
                List<C40039b> list = (List) obj10;
                InterfaceC15391m3 interfaceC15391m3 = (InterfaceC15391m3) obj9;
                C15247s c15247s = (C15247s) obj8;
                InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) obj7;
                Integer num = (Integer) obj6;
                Function1 function3 = (Function1) obj5;
                C22957g c22957g = AbstractC22977m.f90652c;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k3, composer2, 0);
                int iM87266t4 = AbstractC28683x.m87266t(composer2);
                C28655q c28655q3 = (C28655q) composer2;
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(composer2, modifierM3398t);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j2);
                } else {
                    c28655q3.m87178s0();
                }
                C0209i c0209i3 = C0217k.f729g;
                AbstractC28683x.m87239G(composer2, c0209i3, c23010xM66775a);
                C0209i c0209i4 = C0217k.f728f;
                AbstractC28683x.m87239G(composer2, c0209i4, interfaceC28653p1M87165m);
                C0209i c0209i5 = C0217k.f732j;
                if (!c28655q3.f115903S) {
                    c2305k = c2305k3;
                    if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iM87266t4))) {
                    }
                    c0209i = C0217k.f726d;
                    AbstractC28683x.m87239G(composer2, c0209i, modifierM118962N);
                    f13 = 8;
                    function1 = function3;
                    Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f13, 1);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iM87266t = AbstractC28683x.m87266t(composer2);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer2, modifierM3396r);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j2);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(composer2, c0209i3, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(composer2, c0209i4, interfaceC28653p1M87165m2);
                    if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iM87266t))) {
                        AbstractC11266d.m30471y(iM87266t, c28655q3, iM87266t, c0209i5);
                    }
                    AbstractC28683x.m87239G(composer2, c0209i, modifierM118962N2);
                    Modifier modifierM3393o = AbstractC1099a.m3393o(AbstractC11673r.m31081j(), c2314t);
                    C37816b c37816bM121344e = AbstractC37817c.m121344e(271462224, composer2, new C2647w2(15, c15247s, interfaceC15391m3));
                    c2305k2 = c2305k;
                    AbstractC15376j4.m43589e(modifierM3393o, interfaceC15391m3, false, c37816bM121344e, composer2, 24576, 12);
                    c28655q3.m87173q(true);
                    if (this.f56194x) {
                        c28655q3.m87150e0(-1654296625);
                        AbstractC12314q.m34325e(0L, AbstractC1102d.m3409f(1.0f, c2314t), 6, composer2, 2);
                        c28655q3.m87173q(false);
                    } else if (AbstractC39414r.m125890i0((String) interfaceC28670t2.getValue())) {
                        c28655q3.m87150e0(-1650719783);
                        c28655q3.m87173q(false);
                    } else {
                        c28655q3.m87150e0(-1854471045);
                        if (list == null) {
                            z4 = false;
                        } else {
                            c28655q3.m87150e0(-1854469698);
                            if (list.isEmpty()) {
                                i13 = 1;
                                z4 = false;
                            } else {
                                AbstractC15751g.m44449b(AbstractC1099a.m3396r(c2314t, 0.0f, f13, 1), 0L, 0.0f, 0.0f, composer2, 6, 14);
                                Modifier modifierM3393o2 = AbstractC1099a.m3393o(AbstractC11673r.m31081j(), AbstractC1102d.m3409f(1.0f, c2314t));
                                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k2, composer2, 0);
                                iM87266t2 = AbstractC28683x.m87266t(composer2);
                                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
                                Modifier modifierM118962N3 = AbstractC37056f.m118962N(composer2, modifierM3393o2);
                                c28655q3.m87158i0();
                                if (c28655q3.f115903S) {
                                    composer2 = composer2;
                                    c28655q3.m87163l(c0213j2);
                                } else {
                                    composer2 = composer2;
                                    c28655q3.m87178s0();
                                }
                                AbstractC28683x.m87239G(composer2, c0209i3, c23010xM66775a2);
                                AbstractC28683x.m87239G(composer2, c0209i4, interfaceC28653p1M87165m3);
                                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iM87266t2))) {
                                    AbstractC11266d.m30471y(iM87266t2, c28655q3, iM87266t2, c0209i5);
                                }
                                AbstractC28683x.m87239G(composer2, c0209i, modifierM118962N3);
                                c28655q3.m87150e0(-915633687);
                                for (C40039b c40039b : list) {
                                    SpannableString spannableString = c40039b.f172758a;
                                    SpannableString spannableString2 = c40039b.f172759b;
                                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                                    c28655q3.m87150e0(-411929820);
                                    function2 = function1;
                                    zM87153g = c28655q3.m87153g(function2) | c28655q3.m87157i(c40039b);
                                    Object objM87133R = c28655q3.m87133R();
                                    if (!zM87153g || objM87133R == C28635l.f115821a) {
                                        i14 = 1;
                                        C17841d c17841d = new C17841d(function2, c40039b, i14);
                                        c28655q3.m87172p0(c17841d);
                                        obj4 = c17841d;
                                    } else {
                                        i14 = 1;
                                        obj4 = objM87133R;
                                    }
                                    c28655q3.m87173q(false);
                                    Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1092a.m3361f(modifierM3409f, false, null, (InterfaceC4339a) obj4, 7), 0.0f, f13, i14);
                                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k2, composer2, 0);
                                    iM87266t3 = AbstractC28683x.m87266t(composer2);
                                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q3.m87165m();
                                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(composer2, modifierM3396r2);
                                    InterfaceC0221l.f734a.getClass();
                                    c0213j = C0217k.f724b;
                                    c28655q3.m87158i0();
                                    if (c28655q3.f115903S) {
                                        c28655q3.m87163l(c0213j);
                                    } else {
                                        c28655q3.m87178s0();
                                    }
                                    AbstractC28683x.m87239G(composer2, C0217k.f729g, c23010xM66775a3);
                                    AbstractC28683x.m87239G(composer2, C0217k.f728f, interfaceC28653p1M87165m4);
                                    c0209i2 = C0217k.f732j;
                                    if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iM87266t3))) {
                                        AbstractC11266d.m30471y(iM87266t3, c28655q3, iM87266t3, c0209i2);
                                    }
                                    AbstractC28683x.m87239G(composer2, C0217k.f726d, modifierM118962N4);
                                    String strM125926K = AbstractC39421y.m125926K((String) interfaceC28670t2.getValue(), " ", "|", false);
                                    EnumC39413q enumC39413q = EnumC39413q.IGNORE_CASE;
                                    List listM122276E = AbstractC38176k.m122276E(C39412p.m125847b(spannableString, new C39412p(strM125926K, 0)));
                                    arrayList = new ArrayList(AbstractC25267u.m74163i0(listM122276E, 10));
                                    it = listM122276E.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((C39410n) ((InterfaceC39407k) it.next())).m125845c());
                                    }
                                    arrayList2 = new ArrayList();
                                    for (Object obj11 : arrayList) {
                                        if (!AbstractC39414r.m125890i0((String) obj11)) {
                                            arrayList2.add(obj11);
                                        }
                                    }
                                    string = spannableString.toString();
                                    AbstractC22676k.m65749i(string, "toString(...)");
                                    for (String str : arrayList2) {
                                        string = AbstractC39421y.m125926K(string, str, AbstractC11895b.m31996o("<b>", str, "</b>"), false);
                                    }
                                    function1 = function2;
                                    Composer composer3 = composer2;
                                    AbstractC15011f9.m43115c(AbstractC35148d.m111183n(string, null, null, composer3, 0, 6), null, AbstractC11673r.m31082k(composer3).f37671d, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, C15069l3.m43149c(composer3).f56282i, composer3, 0, 0, 131066);
                                    String string2 = spannableString2.toString();
                                    AbstractC22676k.m65749i(string2, "toString(...)");
                                    AbstractC15011f9.m43114b(string2, null, AbstractC11673r.m31082k(composer3).f37671d, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C15069l3.m43149c(composer3).f56282i, composer3, 0, 0, 65530);
                                    c28655q3.m87173q(true);
                                    AbstractC15751g.m44449b(null, 0L, 0.0f, 0.0f, composer3, 0, 15);
                                    composer2 = composer3;
                                }
                                i13 = 1;
                                z4 = false;
                                c28655q3.m87173q(false);
                                c28655q3.m87173q(true);
                            }
                            c28655q3.m87173q(z4);
                            c28655q3.m87150e0(-1854383634);
                            if (num != null) {
                                AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(num.intValue(), composer2, z4 ? 1 : 0);
                                Modifier modifierM3396r3 = AbstractC1099a.m3396r(c2314t, 0.0f, 16, i13);
                                C11669n c11669n = C11671p.f37680a;
                                AbstractC29125c.m88522c(abstractC26165aM88500I, null, AbstractC1136a.m3599a(AbstractC1099a.m3393o(AbstractC11673r.m31081j(), modifierM3396r3), "AutocompleteAttributionDrawable"), null, null, 0.0f, null, composer2, 48, 120);
                                z4 = false;
                            }
                            c28655q3.m87173q(z4);
                        }
                        c28655q3.m87173q(z4);
                    }
                    c28655q3.m87173q(true);
                } else {
                    c2305k = c2305k3;
                }
                AbstractC11266d.m30471y(iM87266t4, c28655q3, iM87266t4, c0209i5);
                c0209i = C0217k.f726d;
                AbstractC28683x.m87239G(composer2, c0209i, modifierM118962N);
                f13 = 8;
                function1 = function3;
                Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f13, 1);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iM87266t = AbstractC28683x.m87266t(composer2);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q3.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(composer2, modifierM3396r4);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j2);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(composer2, c0209i3, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(composer2, c0209i4, interfaceC28653p1M87165m5);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iM87266t, c28655q3, iM87266t, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iM87266t, c28655q3, iM87266t, c0209i5);
                }
                AbstractC28683x.m87239G(composer2, c0209i, modifierM118962N5);
                Modifier modifierM3393o3 = AbstractC1099a.m3393o(AbstractC11673r.m31081j(), c2314t);
                C37816b c37816bM121344e2 = AbstractC37817c.m121344e(271462224, composer2, new C2647w2(15, c15247s, interfaceC15391m3));
                c2305k2 = c2305k;
                AbstractC15376j4.m43589e(modifierM3393o3, interfaceC15391m3, false, c37816bM121344e2, composer2, 24576, 12);
                c28655q3.m87173q(true);
                if (this.f56194x) {
                    c28655q3.m87150e0(-1654296625);
                    AbstractC12314q.m34325e(0L, AbstractC1102d.m3409f(1.0f, c2314t), 6, composer2, 2);
                    c28655q3.m87173q(false);
                } else if (AbstractC39414r.m125890i0((String) interfaceC28670t2.getValue())) {
                    c28655q3.m87150e0(-1854471045);
                    if (list == null) {
                        z4 = false;
                    } else {
                        c28655q3.m87150e0(-1854469698);
                        if (list.isEmpty()) {
                            AbstractC15751g.m44449b(AbstractC1099a.m3396r(c2314t, 0.0f, f13, 1), 0L, 0.0f, 0.0f, composer2, 6, 14);
                            Modifier modifierM3393o4 = AbstractC1099a.m3393o(AbstractC11673r.m31081j(), AbstractC1102d.m3409f(1.0f, c2314t));
                            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g, c2305k2, composer2, 0);
                            iM87266t2 = AbstractC28683x.m87266t(composer2);
                            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q3.m87165m();
                            Modifier modifierM118962N6 = AbstractC37056f.m118962N(composer2, modifierM3393o4);
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                composer2 = composer2;
                                c28655q3.m87163l(c0213j2);
                            } else {
                                composer2 = composer2;
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(composer2, c0209i3, c23010xM66775a4);
                            AbstractC28683x.m87239G(composer2, c0209i4, interfaceC28653p1M87165m6);
                            if (c28655q3.f115903S) {
                                AbstractC11266d.m30471y(iM87266t2, c28655q3, iM87266t2, c0209i5);
                            } else {
                                AbstractC11266d.m30471y(iM87266t2, c28655q3, iM87266t2, c0209i5);
                            }
                            AbstractC28683x.m87239G(composer2, c0209i, modifierM118962N6);
                            c28655q3.m87150e0(-915633687);
                            while (r2.hasNext()) {
                                SpannableString spannableString3 = c40039b.f172758a;
                                SpannableString spannableString4 = c40039b.f172759b;
                                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                                c28655q3.m87150e0(-411929820);
                                function2 = function1;
                                zM87153g = c28655q3.m87153g(function2) | c28655q3.m87157i(c40039b);
                                Object objM87133R2 = c28655q3.m87133R();
                                if (zM87153g) {
                                    i14 = 1;
                                    C17841d c17841d2 = new C17841d(function2, c40039b, i14);
                                    c28655q3.m87172p0(c17841d2);
                                    obj4 = c17841d2;
                                } else {
                                    i14 = 1;
                                    C17841d c17841d3 = new C17841d(function2, c40039b, i14);
                                    c28655q3.m87172p0(c17841d3);
                                    obj4 = c17841d3;
                                }
                                c28655q3.m87173q(false);
                                Modifier modifierM3396r5 = AbstractC1099a.m3396r(AbstractC1092a.m3361f(modifierM3409f2, false, null, (InterfaceC4339a) obj4, 7), 0.0f, f13, i14);
                                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k2, composer2, 0);
                                iM87266t3 = AbstractC28683x.m87266t(composer2);
                                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q3.m87165m();
                                Modifier modifierM118962N7 = AbstractC37056f.m118962N(composer2, modifierM3396r5);
                                InterfaceC0221l.f734a.getClass();
                                c0213j = C0217k.f724b;
                                c28655q3.m87158i0();
                                if (c28655q3.f115903S) {
                                    c28655q3.m87163l(c0213j);
                                } else {
                                    c28655q3.m87178s0();
                                }
                                AbstractC28683x.m87239G(composer2, C0217k.f729g, c23010xM66775a5);
                                AbstractC28683x.m87239G(composer2, C0217k.f728f, interfaceC28653p1M87165m7);
                                c0209i2 = C0217k.f732j;
                                if (c28655q3.f115903S) {
                                    AbstractC11266d.m30471y(iM87266t3, c28655q3, iM87266t3, c0209i2);
                                } else {
                                    AbstractC11266d.m30471y(iM87266t3, c28655q3, iM87266t3, c0209i2);
                                }
                                AbstractC28683x.m87239G(composer2, C0217k.f726d, modifierM118962N7);
                                String strM125926K2 = AbstractC39421y.m125926K((String) interfaceC28670t2.getValue(), " ", "|", false);
                                EnumC39413q enumC39413q2 = EnumC39413q.IGNORE_CASE;
                                List listM122276E2 = AbstractC38176k.m122276E(C39412p.m125847b(spannableString3, new C39412p(strM125926K2, 0)));
                                arrayList = new ArrayList(AbstractC25267u.m74163i0(listM122276E2, 10));
                                it = listM122276E2.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((C39410n) ((InterfaceC39407k) it.next())).m125845c());
                                }
                                arrayList2 = new ArrayList();
                                while (r8.hasNext()) {
                                    if (!AbstractC39414r.m125890i0((String) obj11)) {
                                        arrayList2.add(obj11);
                                    }
                                }
                                string = spannableString3.toString();
                                AbstractC22676k.m65749i(string, "toString(...)");
                                while (r3.hasNext()) {
                                    string = AbstractC39421y.m125926K(string, str, AbstractC11895b.m31996o("<b>", str, "</b>"), false);
                                }
                                function1 = function2;
                                Composer composer4 = composer2;
                                AbstractC15011f9.m43115c(AbstractC35148d.m111183n(string, null, null, composer4, 0, 6), null, AbstractC11673r.m31082k(composer4).f37671d, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, C15069l3.m43149c(composer4).f56282i, composer4, 0, 0, 131066);
                                String string3 = spannableString4.toString();
                                AbstractC22676k.m65749i(string3, "toString(...)");
                                AbstractC15011f9.m43114b(string3, null, AbstractC11673r.m31082k(composer4).f37671d, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C15069l3.m43149c(composer4).f56282i, composer4, 0, 0, 65530);
                                c28655q3.m87173q(true);
                                AbstractC15751g.m44449b(null, 0L, 0.0f, 0.0f, composer4, 0, 15);
                                composer2 = composer4;
                            }
                            i13 = 1;
                            z4 = false;
                            c28655q3.m87173q(false);
                            c28655q3.m87173q(true);
                        } else {
                            i13 = 1;
                            z4 = false;
                        }
                        c28655q3.m87173q(z4);
                        c28655q3.m87150e0(-1854383634);
                        if (num != null) {
                            AbstractC26165a abstractC26165aM88500I2 = AbstractC29125c.m88500I(num.intValue(), composer2, z4 ? 1 : 0);
                            Modifier modifierM3396r6 = AbstractC1099a.m3396r(c2314t, 0.0f, 16, i13);
                            C11669n c11669n2 = C11671p.f37680a;
                            AbstractC29125c.m88522c(abstractC26165aM88500I2, null, AbstractC1136a.m3599a(AbstractC1099a.m3393o(AbstractC11673r.m31081j(), modifierM3396r6), "AutocompleteAttributionDrawable"), null, null, 0.0f, null, composer2, 48, 120);
                            z4 = false;
                        }
                        c28655q3.m87173q(z4);
                    }
                    c28655q3.m87173q(z4);
                } else {
                    c28655q3.m87150e0(-1650719783);
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(true);
                break;
        }
        return c23454a0;
    }

    public C15017g4(boolean z4, List list, InterfaceC15391m3 interfaceC15391m3, C15247s c15247s, InterfaceC28670t2 interfaceC28670t2, Integer num, Function1 function1) {
        this.f56194x = z4;
        this.f56195y = list;
        this.f56196z = interfaceC15391m3;
        this.f56189E = c15247s;
        this.f56190F = interfaceC28670t2;
        this.f56191G = num;
        this.f56192H = function1;
    }
}
