package p739ui0;

import a81.C0559j;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import com.whoop.whoopaction.domain.models.LoadingTreatment;
import java.util.List;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC14983d3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p555vl.AbstractC36095b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25306o;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;
import p736sz0.Function0;
import ri0.C31446e;
import ri0.InterfaceC31443b;
import s01.C32049e;
import so2.C32848f;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ui0.k */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\f\u001a\u00020\u0004*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u000e\u001a\u00020\u0004*\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lri0/e$b;", "viewState", "Lkotlin/Function1;", "Lri0/b;", "Ll83/a0;", "onEvent", "m", "(Lri0/e$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ll0/y;", "", "Lm91/o;", "items", "r", "(Ll0/y;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "j", "(Ll0/y;Lri0/e$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35009k {
    /* JADX INFO: renamed from: j */
    private static final void m110543j(InterfaceC23013y interfaceC23013y, C31446e.b bVar, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1419284645);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC23013y) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(bVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            c28655q.m87138X();
        } else if (bVar.getState().getType() instanceof AbstractC33208p0.b) {
            c28655q.m87150e0(2044356888);
            boolean zM87157i = ((i14 & 896) == 256) | c28655q.m87157i(bVar);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C35007i(bVar, function1, 3);
                c28655q.m87172p0(objM87133R);
            }
            float f13 = 8;
            AbstractC14983d3.m43104a((InterfaceC4339a) objM87133R, AbstractC1099a.m3398t(((C23016z) interfaceC23013y).m66778b(C2314t.f9131w, C2299e.f9110M), 1 * f13, 4 * f13, 0.0f, 0.0f, 12), false, C35002d.f148071a.m110514b(), c28655q, 24576, 12);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(2044832583);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32049e(interfaceC23013y, bVar, function1, i13, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m110544k(C31446e.b bVar, Function1 function1) {
        InterfaceC31443b interfaceC31443bM96827a = bVar.getBackClickEvent();
        if (interfaceC31443bM96827a != null) {
            function1.invoke(interfaceC31443bM96827a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m110545l(InterfaceC23013y interfaceC23013y, C31446e.b bVar, Function1 function1, int i13, Composer composer, int i14) {
        m110543j(interfaceC23013y, bVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX INFO: renamed from: m */
    public static final void m110546m(C31446e.b viewState, Function1 onEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        int i15;
        C2314t c2314t;
        C0209i c0209i;
        boolean z4;
        C0209i c0209i2;
        C0209i c0209i3;
        C28655q c28655q2;
        C28655q c28655q3;
        ?? r10;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(1100688448);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q4.m87157i(viewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q4.m87157i(onEvent) ? 32 : 16;
        }
        if (c28655q4.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t2);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM3407d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            C0209i c0209i4 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i4, interfaceC39127r0M66763d);
            C0209i c0209i5 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i5, interfaceC28653p1M87165m);
            C0209i c0209i6 = C0217k.f732j;
            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i6);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i7, modifierM118962N);
            LoadingTreatment loadingTreatmentM96828b = viewState.getPollingTreatment();
            if (loadingTreatmentM96828b != null) {
                c28655q4.m87150e0(-1942574235);
                AbstractC35004f.m110517c(loadingTreatmentM96828b, c28655q4, LoadingTreatment.$stable);
                c28655q4.m87173q(false);
                i15 = i14;
                c2314t = c2314t2;
                c0209i = c0209i7;
                r10 = 0;
                c0209i2 = c0209i5;
                c0209i3 = c0209i6;
                c0213j = c0213j;
                c0209i4 = c0209i4;
                c28655q3 = c28655q4;
            } else {
                c28655q4.m87150e0(-1942479034);
                C33211q0 c33211q0M96831e = viewState.getState();
                boolean z13 = c33211q0M96831e.getType() instanceof AbstractC33208p0.h;
                Object obj = C28635l.f115821a;
                if (z13) {
                    TextResource textResourceM114676d = AbstractC36095b.m114676d(c28655q4, 1396546936, c33211q0M96831e);
                    boolean zM87157i = ((i14 & 112) == 32) | c28655q4.m87157i(viewState);
                    Object objM87133R = c28655q4.m87133R();
                    if (zM87157i || objM87133R == obj) {
                        objM87133R = new C35007i(viewState, onEvent, 0);
                        c28655q4.m87172p0(objM87133R);
                    }
                    i15 = i14;
                    c0209i2 = c0209i5;
                    c0209i = c0209i7;
                    c0209i3 = c0209i6;
                    c2314t = c2314t2;
                    z4 = false;
                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(textResourceM114676d, 0L, (InterfaceC4339a) objM87133R, 2, null), c33211q0M96831e.getSupportText(), null, null, null, false, false, null, null, null, false, false, c28655q4, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                    C28655q c28655q5 = c28655q4;
                    c28655q5.m87173q(false);
                    c28655q2 = c28655q5;
                } else {
                    i15 = i14;
                    c2314t = c2314t2;
                    c0209i = c0209i7;
                    z4 = false;
                    c0209i2 = c0209i5;
                    c0209i3 = c0209i6;
                    c28655q4.m87150e0(1396911527);
                    C33211q0 c33211q0M96831e2 = viewState.getState();
                    int i16 = i15 & 112;
                    boolean zM87157i2 = c28655q4.m87157i(viewState) | (i16 == 32);
                    Object objM87133R2 = c28655q4.m87133R();
                    if (zM87157i2 || objM87133R2 == obj) {
                        objM87133R2 = new C35007i(viewState, onEvent, 1);
                        c28655q4.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                    boolean zM87157i3 = c28655q4.m87157i(viewState) | (i16 == 32);
                    Object objM87133R3 = c28655q4.m87133R();
                    if (zM87157i3 || objM87133R3 == obj) {
                        objM87133R3 = new C35007i(viewState, onEvent, 2);
                        c28655q4.m87172p0(objM87133R3);
                    }
                    Function0.m105274p(c33211q0M96831e2, interfaceC4339a, (InterfaceC4339a) objM87133R3, c28655q4, C33211q0.f138501k, 0);
                    c28655q4.m87173q(false);
                    c28655q2 = c28655q4;
                }
                c28655q2.m87173q(z4);
                r10 = z4;
                c28655q3 = c28655q2;
            }
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, r10);
            int iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, c2314t);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i4, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i, modifierM118962N2);
            int i17 = i15 << 3;
            int i18 = (i17 & 112) | 6;
            int i19 = i17 & 896;
            C23016z c23016z = C23016z.f90757a;
            m110543j(c23016z, viewState, onEvent, c28655q3, i18 | i19);
            List<C25306o> listM96832f = viewState.m96832f();
            if (listM96832f == null) {
                c28655q3.m87150e0(1686254930);
                c28655q3.m87173q(r10);
            } else {
                c28655q3.m87150e0(1686254931);
                m110551r(c23016z, listM96832f, onEvent, c28655q3, i19 | 6);
                c28655q3.m87173q(r10);
            }
            c28655q3.m87173q(true);
            c28655q3.m87173q(true);
            c28655q = c28655q3;
        } else {
            c28655q4.m87138X();
            c28655q = c28655q4;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32848f(viewState, onEvent, i13, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m110547n(C31446e.b bVar, Function1 function1) {
        InterfaceC31443b interfaceC31443bM96829c = bVar.getPrimaryClickEvent();
        if (interfaceC31443bM96829c != null) {
            function1.invoke(interfaceC31443bM96829c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m110548o(C31446e.b bVar, Function1 function1) {
        InterfaceC31443b interfaceC31443bM96829c = bVar.getPrimaryClickEvent();
        if (interfaceC31443bM96829c != null) {
            function1.invoke(interfaceC31443bM96829c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m110549p(C31446e.b bVar, Function1 function1) {
        InterfaceC31443b interfaceC31443bM96830d = bVar.getSecondaryClickEvent();
        if (interfaceC31443bM96830d != null) {
            function1.invoke(interfaceC31443bM96830d);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m110550q(C31446e.b bVar, Function1 function1, int i13, Composer composer, int i14) {
        m110546m(bVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final void m110551r(final InterfaceC23013y interfaceC23013y, final List<C25306o> list, final Function1 function1, Composer composer, final int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1774458102);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87153g(interfaceC23013y) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(list) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            c28655q.m87138X();
        } else {
            if (list.isEmpty()) {
                C28677v1 c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i15 = 0;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ui0.j
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i15) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC35009k.m110552s(interfaceC23013y, list, function1, i13, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC35009k.m110554u(interfaceC23013y, list, function1, i13, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                    return;
                }
                return;
            }
            Modifier modifierM66778b = ((C23016z) interfaceC23013y).m66778b(AbstractC1099a.m3394p(2 * 8, AbstractC1102d.m3409f(1.0f, C2314t.f9131w)), C2299e.f9111N);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66778b);
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
            c28655q.m87150e0(1543159886);
            for (C25306o c25306o : list) {
                boolean zM87157i = ((i14 & 896) == 256) | c28655q.m87157i(c25306o);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C0559j(function1, c25306o, 5);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC25303l.m74290q(c25306o, null, null, (Function1) objM87133R, c28655q, C25306o.f99297c, 6);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u2 = c28655q.m87180u();
        if (c28677v1M87180u2 != null) {
            final int i16 = 1;
            c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: ui0.j
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    switch (i16) {
                        case 0:
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC35009k.m110552s(interfaceC23013y, list, function1, i13, (Composer) obj, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj2).intValue();
                            return AbstractC35009k.m110554u(interfaceC23013y, list, function1, i13, (Composer) obj, iIntValue2);
                    }
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m110552s(InterfaceC23013y interfaceC23013y, List list, Function1 function1, int i13, Composer composer, int i14) {
        m110551r(interfaceC23013y, list, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m110553t(Function1 function1, C25306o c25306o, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC31443b.j(it, c25306o.getState()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m110554u(InterfaceC23013y interfaceC23013y, List list, Function1 function1, int i13, Composer composer, int i14) {
        m110551r(interfaceC23013y, list, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
