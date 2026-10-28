package p62;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import f62.AbstractC14151a;
import gb1.AbstractC15673b0;
import h62.C16982b;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l62.AbstractC23380a;
import l83.C23454a0;
import l83.InterfaceC23459e;
import m62.C25120k;
import m62.InterfaceC25116g;
import m62.InterfaceC25119j;
import no0.C26957l;
import nq0.C27050m;
import nx1.C27225g;
import ny0.AbstractC27265l0;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22961h;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p329n0.AbstractC26071x;
import p329n0.C26053f;
import p329n0.C26057j;
import p329n0.C26068u;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p602x1.C37816b;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r62.AbstractC30987a;
import r62.AbstractC30988b;
import vu1.AbstractC36517h;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: p62.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lm62/g$e;", "viewState", "Lkotlin/Function1;", "Lm62/j;", "Ll83/a0;", "onViewEvent", "Ll62/a;", "onNavigationEvent", "f", "(Lm62/g$e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "refer-a-friend_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28948i {

    /* JADX INFO: renamed from: p62.i$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f117088w;

        public a(List list) {
            this.f117088w = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m87908a(int i13) {
            this.f117088w.get(i13);
            return null;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m87908a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: p62.i$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f117089w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f117090x;

        public b(List list, Function1 function1) {
            this.f117089w = list;
            this.f117090x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m87909a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            C25120k c25120k = (C25120k) this.f117089w.get(i13);
            c28655q.m87150e0(-1771216875);
            AbstractC30987a.m95515c(c25120k, String.valueOf(i13 + 1), this.f117090x, c28655q, 0);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m87909a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:101:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:105:0x041f  */
    /* JADX WARN: Code duplicated, block: B:107:0x042b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0439  */
    /* JADX WARN: Code duplicated, block: B:110:0x043b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0442 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x0444  */
    /* JADX WARN: Code duplicated, block: B:84:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:86:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:89:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:90:0x03de  */
    /* JADX WARN: Code duplicated, block: B:93:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:94:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:97:0x03f0  */
    /* JADX INFO: renamed from: f */
    public static final void m87902f(InterfaceC25116g.e viewState, Function1 function1, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        InterfaceC25116g.e eVar;
        C0213j c0213j;
        C0209i c0209i;
        C28676v0 c28676v0;
        C28676v0 c28676v1;
        boolean z4;
        long jM73366B;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R;
        C28676v0 c28676v2;
        String strM73656b;
        boolean z16;
        Object objM87133R2;
        Function1 onViewEvent = function1;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1384345829);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(new AbstractC22403o.a(AbstractC14151a.f50976c), null, null, c28655q, AbstractC22403o.a.f87639c, 3), null, AbstractC15673b0.m44028b0(AbstractC1102d.m3409f(1.0f, c2314t)), null, C39102j.f168205g, 0.0f, null, c28655q, 24624, 104);
            float f13 = 8;
            float f14 = 6 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC22953f.m66723l(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14)), 0.0f, 0.0f, 0.0f, f14, 7);
            C2305k c2305k = C2299e.f9111N;
            C22957g c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c0213j = c0213j2;
                c28655q.m87163l(c0213j);
            } else {
                c0213j = c0213j2;
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                c0209i = c0209i4;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                c0209i = c0209i4;
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 9 * f13, 7);
            TextResource textResourceM21278l = AbstractC8693b.m21278l("");
            C38072d c38072d = C38072d.f163053a;
            AbstractC6721d.a aVar = new AbstractC6721d.a(textResourceM21278l, null, AbstractC38963t7.m124375e(c38072d), AbstractC8693b.m21273g(AbstractC36517h.f156122e, c28655q, 0), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            int i15 = i14 & 112;
            boolean z17 = i15 == 32;
            Object objM87133R3 = c28655q.m87133R();
            C28676v0 c28676v3 = C28635l.f115821a;
            if (z17 || objM87133R3 == c28676v3) {
                objM87133R3 = new C28947h(onViewEvent, 0);
                c28655q.m87172p0(objM87133R3);
            }
            C0209i c0209i6 = c0209i;
            int i16 = i14;
            C0213j c0213j3 = c0213j;
            AbstractC6719b.m20143d(modifierM3398t2, aVar, null, (InterfaceC4339a) objM87133R3, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            float f15 = 2 * f13;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, f14, 0.0f, 0.0f, 13), f15, 0.0f, 2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            String strM73657c = viewState.getTitle();
            int i17 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM73657c, AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, ((float) 2.5d) * f13, 7), c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getT2(), null, c28655q, 48, C2886a.f11498d << 18, 196088);
            c28655q = c28655q;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 5 * f13, 7));
            C22961h c22961h = AbstractC22977m.f90657h;
            C26068u c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q, 3);
            eVar = viewState;
            int i18 = i16 & 896;
            boolean zM87157i = c28655q.m87157i(eVar) | (i18 == 256);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i) {
                c28676v0 = c28676v3;
            } else {
                if (objM87133R4 != c28676v0) {
                    c28676v0 = c28676v3;
                }
                c28676v1 = c28676v0;
                AbstractC22674j.m65718d(modifierM3409f2, c26068uM77569a, null, c22961h, null, null, false, null, (Function1) objM87133R4, c28655q, 24582, 492);
                AbstractC30988b.m95520c(eVar.getTutorialContent(), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 3 * f13, 7), c28655q, 48, 0);
                EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                String strM73655a = eVar.getContinueCtaText();
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f15, 0.0f, 2), 0.0f, 0.0f, 0.0f, f15, 7);
                if (eVar.getIsComplete()) {
                    c28655q.m87150e0(207754169);
                    jM73366B = c38072d.m121949b(c28655q, i17).getAccentAction();
                    z4 = false;
                } else {
                    z4 = false;
                    jM73366B = AbstractC25012a.m73366B(c28655q, 207755319, c38072d, c28655q, i17);
                }
                c28655q.m87173q(z4);
                long j7 = jM73366B;
                boolean zM87157i2 = c28655q.m87157i(eVar);
                if (i18 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z18 = zM87157i2 | z13;
                if (i15 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z18 | z14;
                objM87133R = c28655q.m87133R();
                if (z15) {
                    c28676v2 = c28676v1;
                } else {
                    c28676v2 = c28676v1;
                    if (objM87133R == c28676v2) {
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                    onViewEvent = function1;
                    AbstractC27282u.m82292h(modifierM3398t3, enumC27284v, strM73655a, false, j7, null, false, interfaceC4339a, c28655q, 54, 104);
                    strM73656b = eVar.getSkipCtaText();
                    if (strM73656b == null) {
                        c28655q.m87150e0(2146156688);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(2146156689);
                        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(strM73656b);
                        if (i15 == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z16 || objM87133R2 == c28676v2) {
                            objM87133R2 = new C26957l(onViewEvent, 29);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC27265l0.m82217i(null, null, textResourceM21278l2, null, null, false, null, null, false, false, null, null, (Function1) objM87133R2, c28655q, TextResource.$stable << 6, 0, 4091);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    AbstractC25012a.m73392y(c28655q, true, true, true);
                }
                objM87133R = new C26057j(eVar, onNavigationEvent, function1, 17);
                c28655q.m87172p0(objM87133R);
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                onViewEvent = function1;
                AbstractC27282u.m82292h(modifierM3398t3, enumC27284v, strM73655a, false, j7, null, false, interfaceC4339a2, c28655q, 54, 104);
                strM73656b = eVar.getSkipCtaText();
                if (strM73656b == null) {
                    c28655q.m87150e0(2146156688);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(2146156689);
                    TextResource textResourceM21278l3 = AbstractC8693b.m21278l(strM73656b);
                    if (i15 == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z16) {
                        objM87133R2 = new C26957l(onViewEvent, 29);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C26957l(onViewEvent, 29);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC27265l0.m82217i(null, null, textResourceM21278l3, null, null, false, null, null, false, false, null, null, (Function1) objM87133R2, c28655q, TextResource.$stable << 6, 0, 4091);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                AbstractC25012a.m73392y(c28655q, true, true, true);
            }
            c28676v0 = c28676v3;
            objM87133R4 = new C27050m(eVar, onNavigationEvent, 22);
            c28655q.m87172p0(objM87133R4);
            c28676v1 = c28676v0;
            AbstractC22674j.m65718d(modifierM3409f2, c26068uM77569a, null, c22961h, null, null, false, null, (Function1) objM87133R4, c28655q, 24582, 492);
            AbstractC30988b.m95520c(eVar.getTutorialContent(), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 3 * f13, 7), c28655q, 48, 0);
            EnumC27284v enumC27284v2 = EnumC27284v.TextLarge;
            String strM73655a2 = eVar.getContinueCtaText();
            Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f15, 0.0f, 2), 0.0f, 0.0f, 0.0f, f15, 7);
            if (eVar.getIsComplete()) {
                c28655q.m87150e0(207754169);
                jM73366B = c38072d.m121949b(c28655q, i17).getAccentAction();
                z4 = false;
            } else {
                z4 = false;
                jM73366B = AbstractC25012a.m73366B(c28655q, 207755319, c38072d, c28655q, i17);
            }
            c28655q.m87173q(z4);
            long j13 = jM73366B;
            boolean zM87157i3 = c28655q.m87157i(eVar);
            if (i18 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z19 = zM87157i3 | z13;
            if (i15 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z19 | z14;
            objM87133R = c28655q.m87133R();
            if (z15) {
                c28676v2 = c28676v1;
                if (objM87133R == c28676v2) {
                }
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                onViewEvent = function1;
                AbstractC27282u.m82292h(modifierM3398t4, enumC27284v2, strM73655a2, false, j13, null, false, interfaceC4339a3, c28655q, 54, 104);
                strM73656b = eVar.getSkipCtaText();
                if (strM73656b == null) {
                    c28655q.m87150e0(2146156688);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(2146156689);
                    TextResource textResourceM21278l4 = AbstractC8693b.m21278l(strM73656b);
                    if (i15 == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z16) {
                        objM87133R2 = new C26957l(onViewEvent, 29);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C26957l(onViewEvent, 29);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC27265l0.m82217i(null, null, textResourceM21278l4, null, null, false, null, null, false, false, null, null, (Function1) objM87133R2, c28655q, TextResource.$stable << 6, 0, 4091);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                AbstractC25012a.m73392y(c28655q, true, true, true);
            } else {
                c28676v2 = c28676v1;
            }
            objM87133R = new C26057j(eVar, onNavigationEvent, function1, 17);
            c28655q.m87172p0(objM87133R);
            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R;
            onViewEvent = function1;
            AbstractC27282u.m82292h(modifierM3398t4, enumC27284v2, strM73655a2, false, j13, null, false, interfaceC4339a4, c28655q, 54, 104);
            strM73656b = eVar.getSkipCtaText();
            if (strM73656b == null) {
                c28655q.m87150e0(2146156688);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(2146156689);
                TextResource textResourceM21278l5 = AbstractC8693b.m21278l(strM73656b);
                if (i15 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z16) {
                    objM87133R2 = new C26957l(onViewEvent, 29);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C26957l(onViewEvent, 29);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC27265l0.m82217i(null, null, textResourceM21278l5, null, null, false, null, null, false, false, null, null, (Function1) objM87133R2, c28655q, TextResource.$stable << 6, 0, 4091);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            AbstractC25012a.m73392y(c28655q, true, true, true);
        } else {
            eVar = viewState;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27225g((Object) eVar, onViewEvent, (InterfaceC23459e) onNavigationEvent, i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m87903g(Function1 function1) {
        function1.invoke(InterfaceC25119j.e.f98455a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m87904h(InterfaceC25116g.e eVar, Function1 function1, InterfaceC26064q LazyRow) {
        AbstractC22676k.m65750j(LazyRow, "$this$LazyRow");
        List<C25120k> listM73658d = eVar.m73658d();
        ((C26053f) LazyRow).m77529r(listM73658d.size(), null, new a(listM73658d), new C37816b(new b(listM73658d, function1), true, 2039820996));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m87905i(InterfaceC25116g.e eVar, Function1 function1, Function1 function2) {
        Object next;
        Iterator<T> it = eVar.m73658d().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C25120k) next).getIsShared());
        C25120k c25120k = (C25120k) next;
        if (c25120k != null) {
            function1.invoke(new AbstractC23380a.c(c25120k.getShareMessage(), c25120k.getCode(), C16982b.Companion.EnumC41682a.BOTTOM_CTA, String.valueOf(eVar.m73658d().indexOf(c25120k) + 1)));
        } else {
            function2.invoke(InterfaceC25119j.b.f98452a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m87906j(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(InterfaceC25119j.e.f98455a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m87907k(InterfaceC25116g.e eVar, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m87902f(eVar, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
