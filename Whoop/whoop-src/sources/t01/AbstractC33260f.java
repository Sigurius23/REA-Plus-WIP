package t01;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import no0.C26949h;
import oq1.C28119c;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25305n;
import p720m91.InterfaceC25312u;
import pp2.C29451o;
import qz0.AbstractC30795n;
import sy0.AbstractC33088k;
import sy0.C33082e;
import wb3.AbstractC37056f;
import x81.C38072d;
import y21.AbstractC39162i;
import y21.C39155b;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: t01.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lt01/c;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;Lt01/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33260f {
    /* JADX INFO: renamed from: h */
    public static final void m105514h(Modifier modifier, final C33257c state, final Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        Float fValueOf;
        InterfaceC4339a interfaceC4339a;
        InterfaceC25312u interfaceC25312u;
        C0209i c0209i;
        C28655q c28655q2;
        int i16;
        C0209i c0209i2;
        boolean z4;
        double d3;
        int i17;
        C2306l c2306l;
        Modifier modifierM3599a;
        float f13;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(1309123850);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q3.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q3.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q3.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i18 != 0 ? c2314t : modifier2;
            boolean zM87153g = c28655q3.m87153g(state.m105500b());
            Object objM87133R = c28655q3.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            InterfaceC4339a interfaceC4339a2 = null;
            if (zM87153g || objM87133R == c28676v0) {
                List<InterfaceC25312u> listM105500b = state.m105500b();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listM105500b) {
                    if (obj instanceof C39155b) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    C39155b c39155b = (C39155b) it.next();
                    float fMax = Math.max(c39155b.getUpperBound(), c39155b.getSliderValue());
                    while (it.hasNext()) {
                        C39155b c39155b2 = (C39155b) it.next();
                        fMax = Math.max(fMax, Math.max(c39155b2.getUpperBound(), c39155b2.getSliderValue()));
                    }
                    fValueOf = Float.valueOf(fMax);
                } else {
                    fValueOf = null;
                }
                objM87133R = AbstractC3855a.m11831o(fValueOf != null ? fValueOf.floatValue() : 0.0f, c28655q3);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            if (state.getExpandViaEndItem()) {
                c28655q3.m87150e0(1806113892);
                c28655q3.m87173q(false);
                interfaceC4339a = null;
            } else {
                c28655q3.m87150e0(1806027557);
                boolean zM87157i = ((i15 & 896) == 256) | c28655q3.m87157i(state);
                Object objM87133R2 = c28655q3.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    final int i19 = 0;
                    objM87133R2 = new InterfaceC4339a() { // from class: t01.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    return AbstractC33260f.m105515i(onViewEvent, state);
                                case 1:
                                    return AbstractC33260f.m105516j(onViewEvent, state);
                                default:
                                    return AbstractC33260f.m105517k(onViewEvent, state);
                            }
                        }
                    };
                    c28655q3.m87172p0(objM87133R2);
                }
                c28655q3.m87173q(false);
                interfaceC4339a = (InterfaceC4339a) objM87133R2;
            }
            if (!state.getEndItemChip().getIsClickable()) {
                c28655q3.m87150e0(1806222515);
                c28655q3.m87173q(false);
            } else if (state.getExpandViaEndItem()) {
                c28655q3.m87150e0(1806263932);
                boolean zM87157i2 = ((i15 & 896) == 256) | c28655q3.m87157i(state);
                Object objM87133R3 = c28655q3.m87133R();
                if (zM87157i2 || objM87133R3 == c28676v0) {
                    final int i24 = 1;
                    objM87133R3 = new InterfaceC4339a() { // from class: t01.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i24) {
                                case 0:
                                    return AbstractC33260f.m105515i(onViewEvent, state);
                                case 1:
                                    return AbstractC33260f.m105516j(onViewEvent, state);
                                default:
                                    return AbstractC33260f.m105517k(onViewEvent, state);
                            }
                        }
                    };
                    c28655q3.m87172p0(objM87133R3);
                }
                interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                c28655q3.m87173q(false);
            } else if (state.getIsExpanded() || !state.getHasCollapsibleContent()) {
                c28655q3.m87150e0(1806520115);
                c28655q3.m87173q(false);
            } else {
                c28655q3.m87150e0(1806415677);
                boolean zM87157i3 = ((i15 & 896) == 256) | c28655q3.m87157i(state);
                Object objM87133R4 = c28655q3.m87133R();
                if (zM87157i3 || objM87133R4 == c28676v0) {
                    final int i25 = 2;
                    objM87133R4 = new InterfaceC4339a() { // from class: t01.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i25) {
                                case 0:
                                    return AbstractC33260f.m105515i(onViewEvent, state);
                                case 1:
                                    return AbstractC33260f.m105516j(onViewEvent, state);
                                default:
                                    return AbstractC33260f.m105517k(onViewEvent, state);
                            }
                        }
                    };
                    c28655q3.m87172p0(objM87133R4);
                }
                interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
                c28655q3.m87173q(false);
            }
            InterfaceC4339a interfaceC4339a3 = interfaceC4339a2;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
            float f14 = 8;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f14), C2299e.f9110M, c28655q3, 6);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i3 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i3, c23010xM66775a);
            C0209i c0209i4 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i4, interfaceC28653p1M87165m);
            C0209i c0209i5 = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i5);
            }
            C0209i c0209i6 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i6, modifierM118962N);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C2306l c2306l2 = C2299e.f9108K;
            C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q((float) 1.5d, f14, c2306l2, c28655q3, 54);
            int iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM3409f2);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i3, c22994r1M53376q);
            AbstractC28683x.m87239G(c28655q3, c0209i4, interfaceC28653p1M87165m2);
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i6, modifierM118962N2);
            InterfaceC25312u interfaceC25312uM105504g = state.getLeadingItem();
            if (interfaceC25312uM105504g == null) {
                c28655q3.m87150e0(-1315072785);
                c28655q3.m87173q(false);
                c0209i = c0209i4;
                c28655q2 = c28655q3;
                i16 = 6;
                c0209i2 = c0209i3;
            } else {
                c28655q3.m87150e0(-1315072784);
                if (interfaceC25312uM105504g instanceof C33082e) {
                    interfaceC25312u = interfaceC25312uM105504g;
                    C33082e c33082e = (C33082e) interfaceC25312u;
                    if (c33082e.getCheckboxType() instanceof AbstractC33088k.c) {
                        c28655q3.m87150e0(2061506791);
                        c0209i = c0209i4;
                        c28655q2 = c28655q3;
                        i16 = 6;
                        c0209i2 = c0209i3;
                        AbstractC33261g.m105525d(c33082e, AbstractC8693b.m21278l(!AbstractC39414r.m125890i0(c33082e.getLabel()) ? c33082e.getLabel() : state.getTitle()), onViewEvent, null, c28655q2, i15 & 896, 8);
                        z4 = false;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z4);
                } else {
                    interfaceC25312u = interfaceC25312uM105504g;
                }
                c0209i = c0209i4;
                c28655q2 = c28655q3;
                i16 = 6;
                c0209i2 = c0209i3;
                c28655q2.m87150e0(66517235);
                AbstractC25303l.m74291r(interfaceC25312u, null, null, onViewEvent, c28655q2, (i15 << 3) & 7168, 6);
                z4 = false;
                c28655q2.m87173q(false);
                c28655q2.m87173q(z4);
            }
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            if (interfaceC4339a != null) {
                f13 = 1.0f;
                i17 = i16;
                c2306l = c2306l2;
                d3 = 0.0d;
                modifierM3599a = AbstractC1136a.m3599a(AbstractC1092a.m3362g(c2314t, false, null, null, interfaceC4339a, 15), "CollapsibleRowHeader");
            } else {
                d3 = 0.0d;
                i17 = i16;
                c2306l = c2306l2;
                modifierM3599a = c2314t;
                f13 = 1.0f;
            }
            Modifier modifierMo3471e = layoutWeightElement.mo3471e(modifierM3599a);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q2, 48);
            int iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC28653p1M87165m3);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N3);
            String strM105505h = state.getTitle();
            C38072d c38072d = C38072d.f163053a;
            C2886a t14 = c38072d.m121952e(c28655q2, i17).getT4();
            long brandWhite = c38072d.m121949b(c28655q2, i17).getBrandWhite();
            if (f13 <= d3) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            float f15 = f13;
            C28655q c28655q4 = c28655q2;
            AbstractC30795n.m94707h(strM105505h, new LayoutWeightElement(f15 > Float.MAX_VALUE ? Float.MAX_VALUE : f15, true), brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t14, null, c28655q4, 0, 0, 196600);
            c28655q4.m87173q(true);
            AbstractC33255a.m105494b(state.getEndItemChip(), interfaceC4339a3, null, c28655q4, 0, 4);
            c28655q4.m87173q(true);
            boolean z13 = !state.getIsExpanded();
            C37816b c37816bM121344e = AbstractC37817c.m121344e(1744735576, c28655q4, new C28119c(21, state, onViewEvent));
            C23016z c23016z = C23016z.f90757a;
            AbstractC1090b.m3350e(c23016z, z13, null, null, null, null, c37816bM121344e, c28655q4, 1572870, 30);
            AbstractC1090b.m3350e(c23016z, state.getIsExpanded(), null, null, null, null, AbstractC37817c.m121344e(1853757839, c28655q4, new C26949h(interfaceC28601c1, state, onViewEvent, 18)), c28655q4, 1572870, 30);
            c28655q = c28655q4;
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q = c28655q3;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33259e(modifier3, state, onViewEvent, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m105515i(Function1 function1, C33257c c33257c) {
        function1.invoke(new C33263i(c33257c.getTitle()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m105516j(Function1 function1, C33257c c33257c) {
        function1.invoke(new C33262h(c33257c.getTitle()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m105517k(Function1 function1, C33257c c33257c) {
        function1.invoke(new C33263i(c33257c.getTitle()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m105518l(C33257c c33257c, Function1 function1, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        InterfaceC25312u interfaceC25312uM105499a = c33257c.getBodyItem();
        if (interfaceC25312uM105499a == null) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-276638901);
            c28655q.m87173q(false);
        } else {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(-276638900);
            AbstractC25303l.m74291r(interfaceC25312uM105499a, null, null, function1, c28655q2, 0, 6);
            c28655q2.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m105519m(InterfaceC28601c1 interfaceC28601c1, C33257c c33257c, Function1 function1, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        AbstractC28683x.m87247a(AbstractC39162i.m124706V().mo86977a(interfaceC28601c1), AbstractC37817c.m121344e(-1285120433, composer, new C29451o(10, c33257c, function1)), composer, 56);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m105520n(C33257c c33257c, Function1 function1, Composer composer, int i13) {
        Object objValueOf;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * 8), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
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
            c28655q.m87150e0(-2139335945);
            int i14 = 0;
            for (Object obj : c33257c.m105500b()) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                InterfaceC25312u interfaceC25312u = (InterfaceC25312u) obj;
                InterfaceC25305n interfaceC25305n = interfaceC25312u instanceof InterfaceC25305n ? (InterfaceC25305n) interfaceC25312u : null;
                if (interfaceC25305n == null || (objValueOf = interfaceC25305n.getId()) == null) {
                    objValueOf = Integer.valueOf(i14);
                }
                c28655q.m87144b0(-385894633, objValueOf);
                AbstractC25303l.m74291r(interfaceC25312u, null, null, function1, c28655q, 0, 6);
                c28655q.m87173q(false);
                i14 = i15;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m105521o(Modifier modifier, C33257c c33257c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m105514h(modifier, c33257c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
