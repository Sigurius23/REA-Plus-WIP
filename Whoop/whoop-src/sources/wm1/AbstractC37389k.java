package wm1;

import a11.C0137o;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import b11.C2276c;
import b91.AbstractC2890e;
import b91.C2886a;
import bp0.C3529q;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.local.room.dao.persistent.C6493d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import e93.AbstractC12889b;
import i91.AbstractC18247a;
import ih0.AbstractC18489d0;
import j81.AbstractC21418b;
import j81.C21419c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25260n;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p031b9.AbstractC2875y;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p077d0.C11407v;
import p088dc.AbstractC11895b;
import p132f0.C13815p1;
import p132f0.C13821r1;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC23004v;
import p294l3.C23285v0;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p557vo.AbstractC36220b;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p636y3.C39178j;
import p636y3.C39183o;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: wm1.k */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a?\u0010\u001e\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00140\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001aC\u0010#\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u00022\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0!2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00140\u001bH\u0003¢\u0006\u0004\b#\u0010$\u001a3\u0010'\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u000f2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00140\u001bH\u0003¢\u0006\u0004\b'\u0010(\u001a)\u0010)\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b)\u0010*\u001a)\u0010+\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u0002H\u0003¢\u0006\u0004\b+\u0010,\u001a)\u0010-\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u0002H\u0003¢\u0006\u0004\b-\u0010,¨\u00062²\u0006\f\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\f\u0010 \u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010.\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u00100\u001a\u00020/8\nX\u008a\u0084\u0002²\u0006\f\u00101\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, m65681d2 = {"", "scrollOffset", "Lwm1/b;", "Q", "(I)Lwm1/b;", "", "start", "end", "fraction", "S", "(FFF)F", "Lwm1/l;", "state", "", "dialId", "Lwm1/c;", "R", "(Lwm1/l;Ljava/lang/String;)Lwm1/c;", "", "isScrolling", "Ll83/a0;", "p", "(ZLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "Lf0/r1;", "scrollState", "Lkotlin/Function1;", "", "onEvent", "K", "(Landroidx/compose/ui/Modifier;Lwm1/l;Lf0/r1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "animationState", "", "dials", "I", "(Landroidx/compose/ui/Modifier;Lwm1/b;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "dial", "onDeepDiveClicked", "D", "(Lwm1/b;Lwm1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "r", "(Lwm1/c;Lwm1/b;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "A", "(Landroidx/compose/ui/Modifier;Lwm1/c;Lwm1/b;Landroidx/compose/runtime/Composer;II)V", "x", "iconAlpha", "Ly3/f;", "iconSize", "alphaAnim", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37389k {
    /* JADX INFO: renamed from: A */
    private static final void m119693A(Modifier modifier, C37381c c37381c, C37380b c37380b, Composer composer, int i13, int i14) {
        int i15;
        C37380b c37380b2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2013840620);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(c37381c) : c28655q.m87157i(c37381c) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            c37380b2 = c37380b;
            i15 |= c28655q.m87153g(c37380b2) ? 256 : 128;
        } else {
            c37380b2 = c37380b;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            m119735x(AbstractC34132o.m107879c(m119694B(AbstractC11352g.m30588b(c37380b2.getShouldHideValue() ? 1.0f : 0.0f, AbstractC11348f.m30574v(300, 0, null, 6), null, null, c28655q, 48, 28)), modifier), c37381c, c37380b2, c28655q, (((TextResource.$stable | AbstractC18247a.f71043a) | C9598e.f28134d) << 3) | (i15 & 112) | (i15 & 896), 0);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37386h(modifier2, c37381c, c37380b, i13, i14, 1);
        }
    }

    /* JADX INFO: renamed from: B */
    private static final float m119694B(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m119695C(Modifier modifier, C37381c c37381c, C37380b c37380b, int i13, int i14, Composer composer, int i15) {
        m119693A(modifier, c37381c, c37380b, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    private static final void m119696D(final C37380b c37380b, final C37381c c37381c, final Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-382527436);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(c37380b) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(c37381c) : c28655q.m87157i(c37381c) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            C37380b.Companion aVar = C37380b.INSTANCE;
            float fM36283m = AbstractC12889b.m36283m((aVar.m119680e() - c37380b.getProgressDialSize()) / (aVar.m119680e() - aVar.m119679d()), 0.0f, 1.0f);
            long j7 = 0;
            long jM115310r = AbstractC36220b.m115310r((j7 << 32) | (j7 & 4294967295L), (((long) ((int) interfaceC39171c.mo743q0(8))) & 4294967295L) | (((long) ((int) interfaceC39171c.mo743q0(-30))) << 32), fM36283m);
            int i16 = i15 & 896;
            int i17 = i15 & 112;
            int i18 = i15 & 14;
            boolean z4 = (i16 == 256) | (i17 == 32 || ((i15 & 64) != 0 && c28655q.m87157i(c37381c))) | (i18 == 4);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                final int i19 = 0;
                objM87133R = new InterfaceC4339a() { // from class: wm1.j
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i19) {
                            case 0:
                                return AbstractC37389k.m119697E(function1, c37381c, c37380b);
                            default:
                                return AbstractC37389k.m119699G(function1, c37381c, c37380b);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM5391i = AbstractC1772c1.m5391i(c2314t, false, null, (InterfaceC4339a) objM87133R, 3);
            boolean zM87151f = c28655q.m87151f(jM115310r);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87151f || objM87133R2 == c28676v0) {
                objM87133R2 = new C6493d(jM115310r, 6);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM3390l = AbstractC1099a.m3390l(modifierM5391i, (Function1) objM87133R2);
            boolean z13 = (i16 == 256) | (i17 == 32 || ((i15 & 64) != 0 && c28655q.m87157i(c37381c))) | (i18 == 4);
            Object objM87133R3 = c28655q.m87133R();
            if (z13 || objM87133R3 == c28676v0) {
                final int i24 = 1;
                objM87133R3 = new InterfaceC4339a() { // from class: wm1.j
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i24) {
                            case 0:
                                return AbstractC37389k.m119697E(function1, c37381c, c37380b);
                            default:
                                return AbstractC37389k.m119699G(function1, c37381c, c37380b);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            Modifier modifierM5391i2 = AbstractC1772c1.m5391i(modifierM3390l, false, null, (InterfaceC4339a) objM87133R3, 3);
            C2307m c2307m = C2299e.f9102E;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM5391i2);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            AbstractC21418b.m60229c(AbstractC1102d.m3419p(c37380b.getProgressDialSize(), c2314t), c37381c.m119687g(c37380b.getProgressDialSize(), c37380b.getDialStrokeWidth(), c37380b.getShouldHideOptimalRange()), null, c28655q, C21419c.f82183l << 3, 4);
            int i25 = TextResource.$stable | AbstractC18247a.f71043a | C9598e.f28134d;
            m119693A(null, c37381c, c37380b, c28655q, (i25 << 3) | i17 | ((i15 << 6) & 896), 1);
            c28655q.m87173q(true);
            m119729r(c37381c, c37380b, null, c28655q, ((i15 >> 3) & 14) | i25 | ((i15 << 3) & 112), 4);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0137o(c37380b, c37381c, function1, i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m119697E(Function1 function1, C37381c c37381c, C37380b c37380b) {
        function1.invoke(new C37382d(c37381c.getDestination(), c37380b.getAnalyticSource()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C39178j m119698F(long j7, InterfaceC39171c offset) {
        AbstractC22676k.m65750j(offset, "$this$offset");
        return new C39178j(j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m119699G(Function1 function1, C37381c c37381c, C37380b c37380b) {
        function1.invoke(new C37382d(c37381c.getDestination(), c37380b.getAnalyticSource()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m119700H(C37380b c37380b, C37381c c37381c, Function1 function1, int i13, Composer composer, int i14) {
        m119696D(c37380b, c37381c, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I */
    private static final void m119701I(Modifier modifier, C37380b c37380b, List<C37381c> list, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-702133449);
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
            i15 |= c28655q.m87153g(c37380b) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(list) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, modifier2), 0.0f, c37380b.getBackgroundPadding(), 0.0f, 0.0f, 13), 2 * 8, 0.0f, 2);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
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
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90657h, C2299e.f9108K, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            c28655q.m87150e0(-1139718189);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                int i17 = i15 >> 3;
                m119696D(c37380b, (C37381c) it.next(), function1, c28655q, (i17 & 896) | (i17 & 14) | (((TextResource.$stable | AbstractC18247a.f71043a) | C9598e.f28134d) << 3));
            }
            AbstractC25012a.m73392y(c28655q, false, true, true);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier3 = modifier2;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2276c((Object) modifier3, (Object) c37380b, (Object) list, (Object) function1, i13, i14, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m119702J(Modifier modifier, C37380b c37380b, List list, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m119701I(modifier, c37380b, list, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cb  */
    /* JADX INFO: renamed from: K */
    public static final void m119703K(Modifier modifier, C37390l state, C13821r1 c13821r1, Function1 onEvent, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        C13821r1 c13821r2;
        Modifier modifier3;
        C13821r1 c13821r1M92099U;
        Object objM87133R;
        C28676v0 c28676v0;
        boolean zM87149e;
        Object objM87133R2;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1724282449);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= ((i14 & 4) == 0 && c28655q.m87153g(c13821r1)) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(onEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                if (i16 != 0) {
                    modifier = C2314t.f9131w;
                }
                if ((i14 & 4) != 0) {
                    i15 &= -897;
                    modifier3 = modifier;
                    c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                }
                c28655q.m87175r();
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87264r(new C13815p1(c13821r1M92099U, 2));
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) objM87133R;
                zM87149e = c28655q.m87149e(c13821r1M92099U.f49318a.m87024x());
                objM87133R2 = c28655q.m87133R();
                if (zM87149e || objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87264r(new C13815p1(c13821r1M92099U, 3));
                    c28655q.m87172p0(objM87133R2);
                }
                List listM74077r0 = AbstractC25260n.m74077r0(new C37381c[]{m119710R(state, "SLEEP_GAUGE_STICKY"), m119710R(state, "RECOVERY_GAUGE_STICKY"), m119710R(state, "STRAIN_GAUGE_STICKY")});
                m119727p(m119705M(interfaceC28670t2), c28655q, 0);
                m119701I(modifier3, m119707O((InterfaceC28670t2) objM87133R2), listM74077r0, onEvent, c28655q, (i15 & 7168) | (i15 & 14) | (((TextResource.$stable | AbstractC18247a.f71043a) | C9598e.f28134d) << 6), 0);
                c13821r2 = c13821r1M92099U;
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
                if ((i14 & 4) != 0) {
                    i15 &= -897;
                }
            }
            modifier3 = modifier;
            c13821r1M92099U = c13821r1;
            c28655q.m87175r();
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87264r(new C13815p1(c13821r1M92099U, 2));
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28670t2 interfaceC28670t3 = (InterfaceC28670t2) objM87133R;
            zM87149e = c28655q.m87149e(c13821r1M92099U.f49318a.m87024x());
            objM87133R2 = c28655q.m87133R();
            if (zM87149e) {
                objM87133R2 = AbstractC28683x.m87264r(new C13815p1(c13821r1M92099U, 3));
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = AbstractC28683x.m87264r(new C13815p1(c13821r1M92099U, 3));
                c28655q.m87172p0(objM87133R2);
            }
            List listM74077r1 = AbstractC25260n.m74077r0(new C37381c[]{m119710R(state, "SLEEP_GAUGE_STICKY"), m119710R(state, "RECOVERY_GAUGE_STICKY"), m119710R(state, "STRAIN_GAUGE_STICKY")});
            m119727p(m119705M(interfaceC28670t3), c28655q, 0);
            m119701I(modifier3, m119707O((InterfaceC28670t2) objM87133R2), listM74077r1, onEvent, c28655q, (i15 & 7168) | (i15 & 14) | (((TextResource.$stable | AbstractC18247a.f71043a) | C9598e.f28134d) << 6), 0);
            c13821r2 = c13821r1M92099U;
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
            c13821r2 = c13821r1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2276c((Object) modifier2, (Object) state, (Object) c13821r2, (Object) onEvent, i13, i14, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final boolean m119704L(C13821r1 c13821r1) {
        return c13821r1.f49318a.m87024x() > 0;
    }

    /* JADX INFO: renamed from: M */
    private static final boolean m119705M(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C37380b m119706N(C13821r1 c13821r1) {
        return m119709Q(c13821r1.f49318a.m87024x());
    }

    /* JADX INFO: renamed from: O */
    private static final C37380b m119707O(InterfaceC28670t2 interfaceC28670t2) {
        return (C37380b) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m119708P(Modifier modifier, C37390l c37390l, C13821r1 c13821r1, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m119703K(modifier, c37390l, c13821r1, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Q */
    public static final C37380b m119709Q(int i13) {
        String str;
        float fMo7226i = AbstractC11333b0.f36310a.mo7226i(AbstractC12889b.m36283m(i13 / 1000, 0.0f, 1.0f));
        C37380b.Companion aVar = C37380b.INSTANCE;
        float fM36249O = AbstractC12889b.m36249O(aVar.m119680e(), aVar.m119679d(), fMo7226i);
        float f13 = 16;
        float f14 = 1 - fMo7226i;
        float f15 = 4;
        float fM36283m = AbstractC12889b.m36283m(f13 * f14, f15, f13);
        float fM119711S = m119711S(28.0f, 10.0f, fMo7226i);
        float fM119711S2 = m119711S(21.0f, 10.0f, fMo7226i);
        float f16 = 8;
        float fM36283m2 = AbstractC12889b.m36283m(f16 * f14, f15, f16);
        float f17 = 6;
        float fM36283m3 = AbstractC12889b.m36283m(f14 * f17, 3, f17);
        float f18 = 13 * f15;
        boolean z4 = false;
        if (Float.compare(fM36249O, f18) > 0) {
            z4 = true;
        }
        boolean z13 = Float.compare(fM36249O, f18) <= 0;
        if (C39174f.m124782b(fM36249O, aVar.m119680e())) {
            str = "home_big";
        } else {
            str = C39174f.m124782b(fM36249O, aVar.m119679d()) ? "home_small_scroll" : "home_mid_scroll";
        }
        return new C37380b(fM36249O, fM36283m, fM119711S, fM119711S2, fM36283m2, fM36283m3, z4, z13, str, null);
    }

    /* JADX INFO: renamed from: R */
    private static final C37381c m119710R(C37390l c37390l, String str) {
        Object next;
        Iterator<T> it = c37390l.m119738a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((C37381c) next).getId(), str));
        C37381c c37381c = (C37381c) next;
        if (c37381c != null) {
            return c37381c;
        }
        throw new NoSuchElementException(AbstractC11895b.m31996o("Dial with ID '", str, "' not found"));
    }

    /* JADX INFO: renamed from: S */
    private static final float m119711S(float f13, float f14, float f15) {
        return AbstractC2875y.m8288a(f14, f13, f15, f13);
    }

    /* JADX INFO: renamed from: p */
    private static final void m119727p(final boolean z4, Composer composer, final int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1025737973);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C37380b.Companion aVar = C37380b.INSTANCE;
            AbstractC1090b.m3351f(!z4, null, aVar.m119677b().m11562a(aVar.m119676a()), aVar.m119678c().m11563a(aVar.m119681f()), null, C37379a.f159880a.m119661b(), c28655q, 200064, 18);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: wm1.i
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC37389k.m119728q(z4, i13, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m119728q(boolean z4, int i13, Composer composer, int i14) {
        m119727p(z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0246  */
    /* JADX WARN: Code duplicated, block: B:103:0x0254  */
    /* JADX WARN: Code duplicated, block: B:106:0x0277  */
    /* JADX WARN: Code duplicated, block: B:108:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:110:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:113:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x009e  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:60:0x00be  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x0112  */
    /* JADX WARN: Code duplicated, block: B:67:0x0123  */
    /* JADX WARN: Code duplicated, block: B:69:0x0127  */
    /* JADX WARN: Code duplicated, block: B:72:0x0146  */
    /* JADX WARN: Code duplicated, block: B:74:0x014d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0162  */
    /* JADX WARN: Code duplicated, block: B:80:0x0185  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:87:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:89:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:92:0x0202  */
    /* JADX WARN: Code duplicated, block: B:94:0x0206  */
    /* JADX WARN: Code duplicated, block: B:97:0x0235  */
    /* JADX WARN: Code duplicated, block: B:98:0x0239  */
    /* JADX INFO: renamed from: r */
    private static final void m119729r(C37381c c37381c, C37380b c37380b, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int length;
        boolean z13;
        char c3;
        int i16;
        float f13;
        long jM115310r;
        boolean z14;
        InterfaceC28670t2 interfaceC28670t2M30588b;
        float f14;
        InterfaceC28670t2 interfaceC28670t2M30587a;
        C2314t c2314t2;
        Modifier modifierM3398t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean zM87151f;
        Object objM87133R;
        C2306l c2306l;
        int iHashCode2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(939988735);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(c37381c) : c28655q.m87157i(c37381c) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(c37380b) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                float fMo743q0 = interfaceC39171c.mo743q0(c37380b.getProgressDialSize()) / 2;
                float fMo743q1 = interfaceC39171c.mo743q0(28);
                final String strM21274h = AbstractC8693b.m21274h(c37381c.getTitle(), c28655q, TextResource.$stable);
                length = strM21274h.length();
                if (length >= 0 || length >= 6) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (z13) {
                    f13 = 0;
                } else {
                    if (length == 6) {
                        f13 = 3;
                    } else {
                        c3 = ' ';
                        if (length == 7) {
                            f13 = 6;
                        } else {
                            if (length == 8) {
                                i16 = 10;
                            } else if (length == 9) {
                                f13 = 8;
                            } else {
                                i16 = 14;
                            }
                            f13 = i16;
                        }
                    }
                    long jMo743q0 = (((long) ((int) ((fMo743q0 + fMo743q1) + interfaceC39171c.mo743q0(f13)))) << c3) | (((long) ((int) (-interfaceC39171c.mo743q0(26)))) & 4294967295L);
                    long j7 = 0;
                    C37380b.Companion aVar = C37380b.INSTANCE;
                    final float fM36283m = AbstractC12889b.m36283m((aVar.m119680e() - c37380b.getProgressDialSize()) / (aVar.m119680e() - aVar.m119679d()), 0.0f, 1.0f);
                    jM115310r = AbstractC36220b.m115310r((j7 << c3) | (j7 & 4294967295L), jMo743q0, fM36283m);
                    if (c37381c.getTitleEndIcon() == null && C39174f.m124782b(c37380b.getProgressDialSize(), aVar.m119680e())) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    float f15 = z14 ? 1.0f : 0.0f;
                    C11407v c11407v = AbstractC11333b0.f36310a;
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(f15, AbstractC11348f.m30574v(300, 0, c11407v, 2), "CaretIconAlpha", null, c28655q, 3072, 20);
                    if (z14) {
                        f14 = 3 * 4;
                    } else {
                        f14 = 0;
                    }
                    interfaceC28670t2M30587a = AbstractC11352g.m30587a(f14, AbstractC11348f.m30574v(300, 0, c11407v, 2), "CaretSize", c28655q, 384, 8);
                    c28655q = c28655q;
                    if (z14 || Float.compare(m119731t(interfaceC28670t2M30587a), 0) <= 0) {
                        c2314t2 = c2314t;
                        modifierM3398t = c2314t2;
                    } else {
                        c2314t2 = c2314t;
                        modifierM3398t = AbstractC1099a.m3398t(c2314t, ((float) 0.5d) * 8, 0.0f, 0.0f, 0.0f, 14);
                    }
                    float f16 = 1;
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3411h(24, modifier4), 0.0f, f16 * 8, 0.0f, 0.0f, 13);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    Modifier modifier5 = modifier4;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    zM87151f = c28655q.m87151f(jM115310r);
                    objM87133R = c28655q.m87133R();
                    if (zM87151f || objM87133R == C28635l.f115821a) {
                        objM87133R = new C6493d(jM115310r, 5);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM3390l = AbstractC1099a.m3390l(c2314t2, (Function1) objM87133R);
                    c2306l = C2299e.f9108K;
                    C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(f16, 4, c2306l, c28655q, 54);
                    Modifier modifier6 = modifierM3398t;
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3390l);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M53376q);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    AbstractC22953f.m66714a(modifier6, null, false, AbstractC37817c.m121344e(-2057633857, c28655q, new Function3() { // from class: wm1.g
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC37389k.m119733v(fM36283m, strM21274h, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                        }
                    }), c28655q, 3072, 6);
                    if (c37381c.getTitleEndIcon() != null) {
                        c28655q.m87150e0(-186192156);
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c37381c.getTitleEndIcon().toWhoopIcon(), c28655q, 6), null, AbstractC34132o.m107879c(m119730s(interfaceC28670t2M30588b), AbstractC1102d.m3419p(m119731t(interfaceC28670t2M30587a), c2314t2).mo3471e(new VerticalAlignElement(c2306l))), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite50(), c28655q, 48, 0);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-185789063);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    modifier3 = modifier5;
                }
                c3 = ' ';
                long jMo743q1 = (((long) ((int) ((fMo743q0 + fMo743q1) + interfaceC39171c.mo743q0(f13)))) << c3) | (((long) ((int) (-interfaceC39171c.mo743q0(26)))) & 4294967295L);
                long j13 = 0;
                C37380b.Companion aVar2 = C37380b.INSTANCE;
                final float fM36283m2 = AbstractC12889b.m36283m((aVar2.m119680e() - c37380b.getProgressDialSize()) / (aVar2.m119680e() - aVar2.m119679d()), 0.0f, 1.0f);
                jM115310r = AbstractC36220b.m115310r((j13 << c3) | (j13 & 4294967295L), jMo743q1, fM36283m2);
                if (c37381c.getTitleEndIcon() == null) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                if (z14) {
                }
                C11407v c11407v2 = AbstractC11333b0.f36310a;
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(f15, AbstractC11348f.m30574v(300, 0, c11407v2, 2), "CaretIconAlpha", null, c28655q, 3072, 20);
                if (z14) {
                    f14 = 3 * 4;
                } else {
                    f14 = 0;
                }
                interfaceC28670t2M30587a = AbstractC11352g.m30587a(f14, AbstractC11348f.m30574v(300, 0, c11407v2, 2), "CaretSize", c28655q, 384, 8);
                c28655q = c28655q;
                if (z14) {
                    c2314t2 = c2314t;
                    modifierM3398t = c2314t2;
                } else {
                    c2314t2 = c2314t;
                    modifierM3398t = c2314t2;
                }
                float f17 = 1;
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1102d.m3411h(24, modifier4), 0.0f, f17 * 8, 0.0f, 0.0f, 13);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
                C0209i c0209i6 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                Modifier modifier7 = modifier4;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
                zM87151f = c28655q.m87151f(jM115310r);
                objM87133R = c28655q.m87133R();
                if (zM87151f) {
                    objM87133R = new C6493d(jM115310r, 5);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C6493d(jM115310r, 5);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3390l2 = AbstractC1099a.m3390l(c2314t2, (Function1) objM87133R);
                c2306l = C2299e.f9108K;
                C22994r1 c22994r1M53376q2 = AbstractC18489d0.m53376q(f17, 4, c2306l, c28655q, 54);
                Modifier modifier8 = modifierM3398t;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3390l2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M53376q2);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                AbstractC22953f.m66714a(modifier8, null, false, AbstractC37817c.m121344e(-2057633857, c28655q, new Function3() { // from class: wm1.g
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC37389k.m119733v(fM36283m2, strM21274h, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                    }
                }), c28655q, 3072, 6);
                if (c37381c.getTitleEndIcon() != null) {
                    c28655q.m87150e0(-186192156);
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c37381c.getTitleEndIcon().toWhoopIcon(), c28655q, 6), null, AbstractC34132o.m107879c(m119730s(interfaceC28670t2M30588b), AbstractC1102d.m3419p(m119731t(interfaceC28670t2M30587a), c2314t2).mo3471e(new VerticalAlignElement(c2306l))), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite50(), c28655q, 48, 0);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-185789063);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier7;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C37386h(c37381c, c37380b, modifier3, i13, i14);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            InterfaceC39171c interfaceC39171c2 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            float fMo743q2 = interfaceC39171c2.mo743q0(c37380b.getProgressDialSize()) / 2;
            float fMo743q3 = interfaceC39171c2.mo743q0(28);
            final String strM21274h2 = AbstractC8693b.m21274h(c37381c.getTitle(), c28655q, TextResource.$stable);
            length = strM21274h2.length();
            if (length >= 0) {
                z13 = false;
            } else {
                z13 = false;
            }
            if (z13) {
                f13 = 0;
            } else {
                if (length == 6) {
                    f13 = 3;
                } else {
                    c3 = ' ';
                    if (length == 7) {
                        f13 = 6;
                    } else {
                        if (length == 8) {
                            i16 = 10;
                        } else if (length == 9) {
                            f13 = 8;
                        } else {
                            i16 = 14;
                        }
                        f13 = i16;
                    }
                }
                long jMo743q2 = (((long) ((int) ((fMo743q2 + fMo743q3) + interfaceC39171c2.mo743q0(f13)))) << c3) | (((long) ((int) (-interfaceC39171c2.mo743q0(26)))) & 4294967295L);
                long j14 = 0;
                C37380b.Companion aVar3 = C37380b.INSTANCE;
                final float fM36283m3 = AbstractC12889b.m36283m((aVar3.m119680e() - c37380b.getProgressDialSize()) / (aVar3.m119680e() - aVar3.m119679d()), 0.0f, 1.0f);
                jM115310r = AbstractC36220b.m115310r((j14 << c3) | (j14 & 4294967295L), jMo743q2, fM36283m3);
                if (c37381c.getTitleEndIcon() == null) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                if (z14) {
                }
                C11407v c11407v3 = AbstractC11333b0.f36310a;
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(f15, AbstractC11348f.m30574v(300, 0, c11407v3, 2), "CaretIconAlpha", null, c28655q, 3072, 20);
                if (z14) {
                    f14 = 3 * 4;
                } else {
                    f14 = 0;
                }
                interfaceC28670t2M30587a = AbstractC11352g.m30587a(f14, AbstractC11348f.m30574v(300, 0, c11407v3, 2), "CaretSize", c28655q, 384, 8);
                c28655q = c28655q;
                if (z14) {
                    c2314t2 = c2314t;
                    modifierM3398t = c2314t2;
                } else {
                    c2314t2 = c2314t;
                    modifierM3398t = c2314t2;
                }
                float f18 = 1;
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1102d.m3411h(24, modifier4), 0.0f, f18 * 8, 0.0f, 0.0f, 13);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3398t4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i8 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d3);
                C0209i c0209i9 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m5);
                c0209i = C0217k.f732j;
                Modifier modifier9 = modifier4;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N5);
                zM87151f = c28655q.m87151f(jM115310r);
                objM87133R = c28655q.m87133R();
                if (zM87151f) {
                    objM87133R = new C6493d(jM115310r, 5);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C6493d(jM115310r, 5);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3390l3 = AbstractC1099a.m3390l(c2314t2, (Function1) objM87133R);
                c2306l = C2299e.f9108K;
                C22994r1 c22994r1M53376q3 = AbstractC18489d0.m53376q(f18, 4, c2306l, c28655q, 54);
                Modifier modifier10 = modifierM3398t;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3390l3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, c22994r1M53376q3);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N6);
                AbstractC22953f.m66714a(modifier10, null, false, AbstractC37817c.m121344e(-2057633857, c28655q, new Function3() { // from class: wm1.g
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC37389k.m119733v(fM36283m3, strM21274h2, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                    }
                }), c28655q, 3072, 6);
                if (c37381c.getTitleEndIcon() != null) {
                    c28655q.m87150e0(-186192156);
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c37381c.getTitleEndIcon().toWhoopIcon(), c28655q, 6), null, AbstractC34132o.m107879c(m119730s(interfaceC28670t2M30588b), AbstractC1102d.m3419p(m119731t(interfaceC28670t2M30587a), c2314t2).mo3471e(new VerticalAlignElement(c2306l))), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite50(), c28655q, 48, 0);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-185789063);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier9;
            }
            c3 = ' ';
            long jMo743q3 = (((long) ((int) ((fMo743q2 + fMo743q3) + interfaceC39171c2.mo743q0(f13)))) << c3) | (((long) ((int) (-interfaceC39171c2.mo743q0(26)))) & 4294967295L);
            long j15 = 0;
            C37380b.Companion aVar4 = C37380b.INSTANCE;
            final float fM36283m4 = AbstractC12889b.m36283m((aVar4.m119680e() - c37380b.getProgressDialSize()) / (aVar4.m119680e() - aVar4.m119679d()), 0.0f, 1.0f);
            jM115310r = AbstractC36220b.m115310r((j15 << c3) | (j15 & 4294967295L), jMo743q3, fM36283m4);
            if (c37381c.getTitleEndIcon() == null) {
                z14 = false;
            } else {
                z14 = false;
            }
            if (z14) {
            }
            C11407v c11407v4 = AbstractC11333b0.f36310a;
            interfaceC28670t2M30588b = AbstractC11352g.m30588b(f15, AbstractC11348f.m30574v(300, 0, c11407v4, 2), "CaretIconAlpha", null, c28655q, 3072, 20);
            if (z14) {
                f14 = 3 * 4;
            } else {
                f14 = 0;
            }
            interfaceC28670t2M30587a = AbstractC11352g.m30587a(f14, AbstractC11348f.m30574v(300, 0, c11407v4, 2), "CaretSize", c28655q, 384, 8);
            c28655q = c28655q;
            if (z14) {
                c2314t2 = c2314t;
                modifierM3398t = c2314t2;
            } else {
                c2314t2 = c2314t;
                modifierM3398t = c2314t2;
            }
            float f19 = 1;
            Modifier modifierM3398t5 = AbstractC1099a.m3398t(AbstractC1102d.m3411h(24, modifier4), 0.0f, f19 * 8, 0.0f, 0.0f, 13);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3398t5);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i11 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d4);
            C0209i c0209i12 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m7);
            c0209i = C0217k.f732j;
            Modifier modifier11 = modifier4;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i13 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
            zM87151f = c28655q.m87151f(jM115310r);
            objM87133R = c28655q.m87133R();
            if (zM87151f) {
                objM87133R = new C6493d(jM115310r, 5);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C6493d(jM115310r, 5);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3390l4 = AbstractC1099a.m3390l(c2314t2, (Function1) objM87133R);
            c2306l = C2299e.f9108K;
            C22994r1 c22994r1M53376q4 = AbstractC18489d0.m53376q(f19, 4, c2306l, c28655q, 54);
            Modifier modifier12 = modifierM3398t;
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3390l4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, c22994r1M53376q4);
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m8);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N8);
            AbstractC22953f.m66714a(modifier12, null, false, AbstractC37817c.m121344e(-2057633857, c28655q, new Function3() { // from class: wm1.g
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC37389k.m119733v(fM36283m4, strM21274h2, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
                }
            }), c28655q, 3072, 6);
            if (c37381c.getTitleEndIcon() != null) {
                c28655q.m87150e0(-186192156);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c37381c.getTitleEndIcon().toWhoopIcon(), c28655q, 6), null, AbstractC34132o.m107879c(m119730s(interfaceC28670t2M30588b), AbstractC1102d.m3419p(m119731t(interfaceC28670t2M30587a), c2314t2).mo3471e(new VerticalAlignElement(c2306l))), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite50(), c28655q, 48, 0);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-185789063);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier3 = modifier11;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37386h(c37381c, c37380b, modifier3, i13, i14);
        }
    }

    /* JADX INFO: renamed from: s */
    private static final float m119730s(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: t */
    private static final float m119731t(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C39178j m119732u(long j7, InterfaceC39171c offset) {
        AbstractC22676k.m65750j(offset, "$this$offset");
        return new C39178j(j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m119733v(float f13, String str, InterfaceC23004v BoxWithConstraints, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float fM3403d = ((C1101c) BoxWithConstraints).m3403d();
            Modifier modifierM3425v = AbstractC1102d.m3425v(C2314t.f9131w, 0.0f, AbstractC12889b.m36249O(fM3403d, 0.27f * fM3403d, f13), 1);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3425v);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC30795n.m94707h(str, null, c38072d.m121949b(c28655q, i15).getBrandWhite(), AbstractC31061c.m95626b(C39183o.m124805c(c38072d.m121952e(c28655q, i15).getH5().getStyle().f92255a.f92192b), 4294967296L, (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)), null, null, null, 0L, null, new C36775k(3), 0L, 2, false, 1, 0, null, c38072d.m121952e(c28655q, i15).getH5(), null, c28655q, 0, (C2886a.f11498d << 18) | 3120, 185842);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m119734w(C37381c c37381c, C37380b c37380b, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m119729r(c37381c, c37380b, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    private static final void m119735x(Modifier modifier, C37381c c37381c, C37380b c37380b, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C37380b c37380b2;
        Modifier modifier3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1752853486);
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
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(c37381c) : c28655q.m87157i(c37381c) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            c37380b2 = c37380b;
            i15 |= c28655q.m87153g(c37380b2) ? 256 : 128;
        } else {
            c37380b2 = c37380b;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            modifier3 = i16 != 0 ? C2314t.f9131w : modifier2;
            float fontScale = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).getFontScale();
            TextResource textResourceM119683b = c37381c.getScoreDisplay();
            int i17 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM119683b, c28655q, i17);
            String strM21274h2 = AbstractC8693b.m21274h(c37381c.getScoreDisplaySuffix(), c28655q, i17);
            long jM113248j = AbstractC35745c.m113248j(c37380b2.getScoreValueSize(), 4294967296L);
            AbstractC35745c.m113242a(jM113248j);
            long jM113248j2 = AbstractC35745c.m113248j(C39183o.m124805c(jM113248j) / fontScale, jM113248j & 1095216660480L);
            long jM113248j3 = AbstractC35745c.m113248j(c37380b2.getScoreSuffixSize(), 4294967296L);
            AbstractC35745c.m113242a(jM113248j3);
            long jM113248j4 = AbstractC35745c.m113248j(C39183o.m124805c(jM113248j3) / fontScale, jM113248j3 & 1095216660480L);
            C38072d c38072d = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            ArrayList arrayListM118964P = AbstractC37056f.m118964P(new C23465k(strM21274h, AbstractC2890e.m8451f(C23285v0.m67364b(c38072d.m121952e(c28655q, i18).getN5().getStyle(), 0L, jM113248j2, null, null, 0L, 0, 0L, null, null, 16777213), c38072d.m121949b(c28655q, i18).getBrandWhite(), c28655q, 0)));
            if (strM21274h2.length() > 0) {
                c28655q.m87150e0(-1045126782);
                arrayListM118964P.add(new C23465k(strM21274h2, AbstractC2890e.m8451f(C23285v0.m67364b(c38072d.m121952e(c28655q, i18).getN5().getStyle(), 0L, jM113248j4, null, null, 0L, 0, 0L, null, null, 16777213), c38072d.m121949b(c28655q, i18).getBrandWhite(), c28655q, 0)));
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1044928816);
                c28655q.m87173q(false);
            }
            AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(-226420910, c28655q, new C3529q(6, arrayListM118964P, modifier3)), c28655q, 56);
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37386h(modifier3, c37381c, c37380b, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m119736y(List list, Modifier modifier, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC30795n.m94704e(list, modifier, 0L, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, null, null, c28655q, 0, 0, 261628);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m119737z(Modifier modifier, C37381c c37381c, C37380b c37380b, int i13, int i14, Composer composer, int i15) {
        m119735x(modifier, c37381c, c37380b, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
