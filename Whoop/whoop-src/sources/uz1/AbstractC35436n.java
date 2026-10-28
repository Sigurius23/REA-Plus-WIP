package uz1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b01.C2194o;
import bb2.C2928d;
import bb2.C2929e;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.navigation.C9598e;
import gb1.AbstractC15676d;
import ih0.AbstractC18489d0;
import j93.AbstractC21478l0;
import kd1.AbstractC22403o;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p040c0.AbstractC3760m1;
import p077d0.AbstractC11348f;
import p095dp.AbstractC12240d;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p409q0.AbstractC29677c0;
import p409q0.C29674b;
import p409q0.InterfaceC29694r;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import qx0.C30745a;
import r80.AbstractC31061c;
import sc0.C32355c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: uz1.n */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a)\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Luz1/o;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "i", "(Landroidx/compose/ui/Modifier;Luz1/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "pageCount", "activePage", "s", "(IILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "isActive", "o", "(ZLandroidx/compose/runtime/Composer;I)V", "Li2/x;", "color", "native-store_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35436n {
    /* JADX INFO: renamed from: i */
    public static final void m112480i(Modifier modifier, final C35437o state, final Function1 onViewEvent, Composer composer, final int i13, final int i14) {
        Modifier modifier2;
        int i15;
        final Modifier modifier3;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1081259730);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            final Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            if (state.m112492a().isEmpty()) {
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u == null) {
                    return;
                }
                final int i17 = 0;
                interfaceC4351m = new InterfaceC4351m() { // from class: uz1.l
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i17) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC35436n.m112481j(modifier4, state, onViewEvent, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC35436n.m112485n(modifier4, state, onViewEvent, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
            } else {
                Modifier modifier5 = modifier4;
                boolean zM87157i = c28655q.m87157i(state);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C32355c(state, 23);
                    c28655q.m87172p0(objM87133R);
                }
                C29674b c29674bM91150b = AbstractC29677c0.m91150b((InterfaceC4339a) objM87133R, 0, 0, c28655q, 3);
                float f13 = ((float) r1) * 8;
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC15676d.m44101d(AbstractC1102d.m3409f(1.0f, modifier5), "Shop Home Primary Carousel"), f13, 0.0f, 2);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                AbstractC12240d.m34066d(c29674bM91150b, AbstractC1102d.m3409f(1.0f, c2314t), null, null, 0, f13, C2299e.f9107J, null, false, null, null, null, AbstractC37817c.m121344e(1232876709, c28655q, new C2194o(5, state, onViewEvent)), c28655q, 1769520, 24576, 16284);
                m112490s(state.m112492a().size(), c29674bM91150b.m91162k(), null, c28655q, 0, 4);
                c28655q.m87173q(true);
                modifier3 = modifier5;
            }
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
        c28655q.m87138X();
        modifier3 = modifier2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i18 = 1;
            interfaceC4351m = new InterfaceC4351m() { // from class: uz1.l
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    switch (i18) {
                        case 0:
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC35436n.m112481j(modifier3, state, onViewEvent, i13, i14, (Composer) obj, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj2).intValue();
                            return AbstractC35436n.m112485n(modifier3, state, onViewEvent, i13, i14, (Composer) obj, iIntValue2);
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m112481j(Modifier modifier, C35437o c35437o, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m112480i(modifier, c35437o, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final int m112482k(C35437o c35437o) {
        return c35437o.m112492a().size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m112483l(C35437o c35437o, Function1 function1, InterfaceC29694r HorizontalPager, int i13, Composer composer, int i14) {
        AbstractC22676k.m65750j(HorizontalPager, "$this$HorizontalPager");
        AbstractC25303l.m74291r(c35437o.m112492a().get(i13), AbstractC35427e.m112411b(), new C30745a(21), function1, composer, AbstractC22403o.f87638a | C9598e.f28134d | (C25307p.f99300b << 3), 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final Modifier m112484m(C35440r it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1490944863);
        Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, 1 * 8, 7);
        c28655q.m87173q(false);
        return modifierM3398t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m112485n(Modifier modifier, C35437o c35437o, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m112480i(modifier, c35437o, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final void m112486o(boolean z4, Composer composer, int i13) {
        int i14;
        long jM53363d;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-267507239);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            if (z4) {
                c28655q.m87150e0(623585411);
                jM53363d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(623586496);
                jM53363d = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            InterfaceC28670t2 interfaceC28670t2M11569a = AbstractC3760m1.m11569a(jM53363d, AbstractC11348f.m30574v(300, 0, null, 6), "pageIndicatorColor", c28655q, 432, 8);
            float f13 = 2 * 4;
            Modifier modifierM3419p = AbstractC1102d.m3419p(f13, C2314t.f9131w);
            boolean zM87153g = c28655q.m87153g(interfaceC28670t2M11569a);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C2928d(f13, interfaceC28670t2M11569a, 3);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21478l0.m60421a(modifierM3419p, (Function1) objM87133R, c28655q, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2929e(z4, i13, 4);
        }
    }

    /* JADX INFO: renamed from: p */
    private static final long m112487p(InterfaceC28670t2 interfaceC28670t2) {
        return ((C17919x) interfaceC28670t2.getValue()).f69639a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m112488q(float f13, InterfaceC28670t2 interfaceC28670t2, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        long jM112487p = m112487p(interfaceC28670t2);
        float fMo743q0 = Canvas.mo743q0(f13);
        InterfaceC22131e.m63374D(Canvas, jM112487p, 0L, (((long) Float.floatToRawIntBits(Canvas.mo743q0(f13))) & 4294967295L) | (Float.floatToRawIntBits(fMo743q0) << 32), (((long) Float.floatToRawIntBits(Canvas.mo743q0(f13))) << 32) | (((long) Float.floatToRawIntBits(Canvas.mo743q0(f13))) & 4294967295L), null, 0.0f, 242);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m112489r(boolean z4, int i13, Composer composer, int i14) {
        m112486o(z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final void m112490s(final int i13, final int i14, Modifier modifier, Composer composer, final int i15, final int i16) {
        int i17;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-924863304);
        if ((i15 & 6) == 0) {
            i17 = (c28655q.m87149e(i13) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= c28655q.m87149e(i14) ? 32 : 16;
        }
        int i18 = i16 & 4;
        if (i18 != 0) {
            i17 |= 384;
        } else if ((i15 & 384) == 0) {
            i17 |= c28655q.m87153g(modifier) ? 256 : 128;
        }
        if (c28655q.m87135U(i17 & 1, (i17 & 147) != 146)) {
            if (i18 != 0) {
                modifier = C2314t.f9131w;
            }
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier);
            C22949e c22949e = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(2 * 8, C2299e.f9111N), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(-277124488);
            int i19 = 0;
            while (i19 < i13) {
                m112486o(i19 == i14, c28655q, 0);
                i19++;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        final Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: uz1.m
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC35436n.m112491t(i13, i14, modifier2, i15, i16, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m112491t(int i13, int i14, Modifier modifier, int i15, int i16, Composer composer, int i17) {
        m112490s(i13, i14, modifier, composer, AbstractC28683x.m87244L(i15 | 1), i16);
        return C23454a0.f92919a;
    }
}
