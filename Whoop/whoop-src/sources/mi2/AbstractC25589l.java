package mi2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import di2.AbstractC12055a;
import ev2.C13698g;
import j11.AbstractC21211n;
import java.io.IOException;
import ji2.C21723b;
import ji2.C21729h;
import ji2.C21733l;
import ji2.InterfaceC21730i;
import l83.C23454a0;
import m83.C25272z;
import mf2.C25514e;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.C39169a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: mi2.l */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000f\u0010\f\u001a+\u0010\u0010\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u0019\u0010\u0014\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lji2/l;", "parentViewState", "Lkotlin/Function1;", "Lji2/i;", "Ll83/a0;", "onViewEvent", "Lkotlin/Function0;", "onBackPressed", "v", "(Lji2/l;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "viewState", "t", "(Lji2/l;Landroidx/compose/runtime/Composer;I)V", "l", "(Lji2/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "x", "p", "Landroidx/compose/ui/Modifier;", "Ly3/f;", "padding", "z", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "strava_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25589l {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final InterfaceC39130s0 m75286A(float f13, InterfaceC39133t0 layout, InterfaceC39124q0 measurable, C39169a c39169a) {
        AbstractC22676k.m65750j(layout, "$this$layout");
        AbstractC22676k.m65750j(measurable, "measurable");
        long j7 = c39169a.f168407a;
        AbstractC39104j1 abstractC39104j1Mo448T = measurable.mo448T(C39169a.m124758b(j7, 0, layout.mo724F(f13) + C39169a.m124765i(j7), 0, 0, 13));
        return layout.mo86822W(abstractC39104j1Mo448T.f168211w, abstractC39104j1Mo448T.f168212x, C25272z.f99163w, new C25587j(abstractC39104j1Mo448T, f13, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m75287B(AbstractC39104j1 abstractC39104j1, float f13, AbstractC39101i1 layout) {
        AbstractC22676k.m65750j(layout, "$this$layout");
        layout.m124632f(abstractC39104j1, -layout.mo724F(f13), 0, 0.0f);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final void m75299l(C21733l c21733l, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-669698266);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c21733l) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C21723b c21723bM61294a = c21733l.getDisconnectConfirmationModal();
            if (c21723bM61294a == null) {
                c28655q.m87150e0(-857785054);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-857785053);
                int i15 = i14;
                TextResource textResourceM61203d = c21723bM61294a.getTitle();
                TextResource textResourceM61200a = c21723bM61294a.getDescription();
                TextResource textResourceM61201b = c21723bM61294a.getPrimaryButtonText();
                TextResource textResourceM61202c = c21723bM61294a.getSecondaryButtonText();
                int i16 = i15 & 112;
                boolean z4 = i16 == 32;
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (z4 || objM87133R == c28676v0) {
                    objM87133R = new C25514e(function1, 5);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                boolean z13 = i16 == 32;
                Object objM87133R2 = c28655q.m87133R();
                if (z13 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C25514e(function1, 6);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                int i17 = TextResource.$stable;
                AbstractC21211n.m59497o(null, textResourceM61203d, textResourceM61200a, textResourceM61201b, false, null, null, null, null, textResourceM61202c, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a, null, interfaceC4339a2, null, null, null, c28655q, (i17 << 3) | (i17 << 6) | (i17 << 9) | (i17 << 27), 0, 0, 247463409);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25578a(c21733l, function1, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m75300m(Function1 function1) {
        function1.invoke(new InterfaceC21730i.f(null, null, null, false, 15, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m75301n(Function1 function1) {
        function1.invoke(InterfaceC21730i.c.f83508a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m75302o(C21733l c21733l, Function1 function1, int i13, Composer composer, int i14) {
        m75299l(c21733l, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final void m75303p(C21733l c21733l, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-227310642);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c21733l) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (c21733l.getIsError()) {
            c28655q.m87150e0(1352231270);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
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
            AbstractC33208p0.b bVar = new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC12055a.f39968c), false, null, 6, null);
            TextResource textResourceM21267a = AbstractC8693b.m21267a();
            TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC12055a.f39967b);
            int i15 = i14 & 112;
            boolean z4 = i15 == 32;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C25514e(function1, 3);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean z13 = i15 == 32;
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C25514e(function1, 4);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC33199m0.m105214F(bVar, textResourceM21267a, interfaceC4339a, c8688bM21277k, (InterfaceC4339a) objM87133R2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4064);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(1352829012);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25578a(c21733l, function1, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m75304q(Function1 function1) {
        function1.invoke(new InterfaceC21730i.f(null, null, null, false, 15, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m75305r(Function1 function1) {
        function1.invoke(new InterfaceC21730i.f(null, null, null, false, 15, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m75306s(C21733l c21733l, Function1 function1, int i13, Composer composer, int i14) {
        m75303p(c21733l, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final void m75307t(C21733l c21733l, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(43600403);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c21733l) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            c28655q.m87138X();
        } else if (c21733l.getIsLoading()) {
            c28655q.m87150e0(-1049682094);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
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
            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(1819905967);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25588k(c21733l, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m75308u(C21733l c21733l, int i13, Composer composer, int i14) {
        m75307t(c21733l, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    public static final void m75309v(C21733l parentViewState, Function1 onViewEvent, InterfaceC4339a onBackPressed, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        AbstractC22676k.m65750j(parentViewState, "parentViewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onBackPressed, "onBackPressed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-313413200);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(parentViewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onBackPressed) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            int i15 = i14 & 14;
            m75311x(parentViewState, c28655q, i15);
            int i16 = i14 & 126;
            m75303p(parentViewState, onViewEvent, c28655q, i16);
            int i17 = i14 & 1022;
            AbstractC25586i.m75281z(parentViewState, onViewEvent, onBackPressed, c28655q, i17);
            AbstractC25593p.m75321h(parentViewState, onViewEvent, onBackPressed, c28655q, i17);
            m75307t(parentViewState, c28655q, i15);
            m75299l(parentViewState, onViewEvent, c28655q, i16);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25585h(parentViewState, onViewEvent, onBackPressed, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m75310w(C21733l c21733l, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m75309v(c21733l, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    private static final void m75311x(C21733l c21733l, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1500490848);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c21733l) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C21729h c21729hM61298e = c21733l.getSuccess();
            if (c21729hM61298e == null) {
                c28655q.m87150e0(896845872);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(896845873);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
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
                AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21277k(AbstractC12055a.f39975j), 0L, null, 6, null), c21729hM61298e.getMessageDisplay(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25588k(c21733l, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m75312y(C21733l c21733l, int i13, Composer composer, int i14) {
        m75311x(c21733l, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    public static final Modifier m75313z(Modifier removeParentPadding, float f13) {
        AbstractC22676k.m65750j(removeParentPadding, "$this$removeParentPadding");
        return AbstractC1131a.m3498b(removeParentPadding, new C13698g(f13, 4));
    }
}
