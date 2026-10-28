package lf0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ck1.C4789l;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.InAppBrowserScreenModel;
import e81.AbstractC12823d0;
import e81.AbstractC12829g0;
import e81.C12818b;
import e81.C12827f0;
import e81.C12831h0;
import e81.C12835j0;
import e81.EnumC12833i0;
import e93.AbstractC12889b;
import gb1.AbstractC15673b0;
import gy0.AbstractC16272a;
import gz0.EnumC16313m0;
import j21.C21245d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l72.C23401h;
import l83.C23454a0;
import m83.AbstractC25267u;
import ny0.AbstractC27282u;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p077d0.AbstractC11348f;
import p077d0.C11344e;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p238j0.C21084j;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: lf0.s1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0011\u0010\u000f\u001a'\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\"\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f²\u0006\u0012\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Llf0/t1;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Landroidx/compose/ui/Modifier;Llf0/t1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Le81/f0;", "pieChart", "", "Le81/h0;", "n", "(Le81/f0;Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "j", "m", "Li2/x;", "from", "to", "", "f", "i", "(JJF)J", "a", "Llf0/t1;", "getFakePromotionalBiomarkerPieChartState", "()Llf0/t1;", "fakePromotionalBiomarkerPieChartState", "smoothSlices", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23968s1 {

    /* JADX INFO: renamed from: a */
    private static final C23972t1 f94652a = new C23972t1("promotional_biomarker_pie_chart_1", new C12827f0("empty_pie_chart", false, C12818b.f43896a.m35894b(60), 2, null), AbstractC8693b.m21278l("ADVANCED LABS"), AbstractC8693b.m21278l("VIEW BIOMARKERS"), EnumC16313m0.CARET_FORWARD, new C9598e(AppScreen.C9457y2.f28061w, new InAppBrowserScreenModel("https://app.whoop.com/fake/inapp"), null, 4, null));

    /* JADX INFO: renamed from: lf0.s1$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.view.components.PromotionalBiomarkerPieChartKt$rememberAnimatedSlices$1$1", m100430f = "PromotionalBiomarkerPieChart.kt", m100431l = {192, 193}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f94653w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C11344e f94654x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ List<C12831h0> f94655y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C11344e c11344e, List<C12831h0> list, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f94654x = c11344e;
            this.f94655y = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f94654x, this.f94655y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
        
            if (p077d0.C11344e.m30547d(r5, r6, r7, null, r11, 12) == r0) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r11.f94653w
                r2 = 0
                r3 = 1
                r4 = 2
                if (r1 == 0) goto L1d
                if (r1 == r3) goto L19
                if (r1 != r4) goto L11
                p505ts.AbstractC34132o.m107864I(r12)
                goto L5f
            L11:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L19:
                p505ts.AbstractC34132o.m107864I(r12)
                goto L30
            L1d:
                p505ts.AbstractC34132o.m107864I(r12)
                d0.e r12 = r11.f94654x
                java.lang.Float r1 = new java.lang.Float
                r1.<init>(r2)
                r11.f94653w = r3
                java.lang.Object r12 = r12.m30551g(r1, r11)
                if (r12 != r0) goto L30
                goto L5e
            L30:
                d0.e r5 = r11.f94654x
                java.util.List<e81.h0> r12 = r11.f94655y
                int r12 = r12.size()
                float r12 = (float) r12
                java.lang.Float r6 = new java.lang.Float
                r6.<init>(r12)
                d0.v r12 = new d0.v
                r1 = 1058306785(0x3f147ae1, float:0.58)
                r3 = 1065353216(0x3f800000, float:1.0)
                r7 = 1054280253(0x3ed70a3d, float:0.42)
                r12.<init>(r7, r2, r1, r3)
                r1 = 2000(0x7d0, float:2.803E-42)
                r2 = 0
                d0.e2 r7 = p077d0.AbstractC11348f.m30574v(r1, r2, r12, r4)
                r11.f94653w = r4
                r8 = 0
                r10 = 12
                r9 = r11
                java.lang.Object r12 = p077d0.C11344e.m30547d(r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L5f
            L5e:
                return r0
            L5f:
                l83.a0 r12 = l83.C23454a0.f92919a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: lf0.AbstractC23968s1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m70633e(Modifier modifier, C23972t1 state, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        boolean z4;
        List<C12831h0> listM70642n;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1104746528);
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
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(state) : c28655q.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            List<C12835j0> listM35964e = state.getPieChart().m35964e();
            if (!(listM35964e instanceof Collection) || !listM35964e.isEmpty()) {
                Iterator<T> it = listM35964e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z4 = false;
                        break;
                    } else {
                        if (((C12835j0) it.next()).getStyle() != EnumC12833i0.NONE) {
                            z4 = true;
                            break;
                        }
                    }
                }
            } else {
                z4 = false;
                break;
            }
            if (z4 || !state.getPieChart().getShowAnimation()) {
                c28655q.m87150e0(-830308114);
                listM70642n = m70642n(state.getPieChart(), c28655q, C12827f0.f43975d);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-830250516);
                listM70642n = m70638j(state.getPieChart(), c28655q, C12827f0.f43975d);
                c28655q.m87173q(false);
            }
            List<C12831h0> list = listM70642n;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
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
            AbstractC12823d0.m35939h(AbstractC1102d.m3419p(60 * 4, c2314t), list, 0.0f, 0.0f, 0.0f, 0.0f, null, null, AbstractC37817c.m121344e(1730838229, c28655q, new C21245d(13, state, onViewEvent)), c28655q, 100663302, 252);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23401h(i13, i14, 18, (Object) modifier2, (Object) state, onViewEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m70634f(C23972t1 c23972t1, Function1 function1, Composer composer, int i13) {
        Modifier modifierM3360e;
        boolean z4;
        boolean z13;
        Float fValueOf = Float.valueOf(1.0f);
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            c28655q.m87150e0(1183197296);
            C9598e c9598eM70711c = c23972t1.getDestination();
            C2314t c2314t = C2314t.f9131w;
            if (c9598eM70711c != null) {
                C21084j c21084j = new C21084j();
                boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c9598eM70711c);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C4789l(function1, c9598eM70711c, 8);
                    c28655q.m87172p0(objM87133R);
                }
                modifierM3360e = AbstractC1092a.m3360e(c2314t, c21084j, null, false, null, (InterfaceC4339a) objM87133R, 28);
            } else {
                modifierM3360e = c2314t;
            }
            c28655q.m87173q(false);
            float f13 = 8;
            float f14 = 1 * f13;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f14, modifierM3360e);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            float f15 = 4;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(new AbstractC22403o.a(AbstractC16272a.f61988Q4), null, null, c28655q, AbstractC22403o.a.f87639c, 3), null, AbstractC1099a.m3398t(AbstractC1102d.m3421r(c2314t, 24 * f15, ((float) 5.5d) * f15), 0.0f, 0.0f, 0.0f, f14, 7), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
            float f16 = 3;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f16 * f13, 7);
            TextResource textResourceM70715g = c23972t1.getTitle();
            int i14 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM70715g, c28655q, i14);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i15).getBrandWhite();
            C2886a c2886aM8437r = c38072d.m121952e(c28655q, i15).getH4();
            C36775k c36775k = new C36775k(3);
            int i16 = (C2886a.f11498d << 18) | 12582912;
            AbstractC30795n.m94707h(strM21274h, modifierM3398t, jM125430y, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8437r, fValueOf, c28655q, 48, i16, 65016);
            C28655q c28655q2 = c28655q;
            if (c23972t1.getSubtitle() == null || c23972t1.getDestination() == null || c23972t1.getSubtitleIcon() == null) {
                c28655q2.m87150e0(-1627398909);
                TextResource textResourceM70712d = c23972t1.getSubtitle();
                if (textResourceM70712d == null) {
                    c28655q2.m87150e0(-1627398910);
                    c28655q2.m87173q(false);
                    z4 = true;
                    z13 = false;
                } else {
                    c28655q2.m87150e0(-1627398909);
                    z4 = true;
                    z13 = false;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM70712d, c28655q2, i14), AbstractC27282u.m82299o(c2314t, AbstractC15673b0.m43989I0()), c38072d.m121949b(c28655q2, i15).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getBtS(), fValueOf, c28655q2, 0, i16, 65016);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z13);
            } else {
                c28655q2.m87150e0(-1628671738);
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(((float) 1.5d) * f13, AbstractC11895b.m31987f(f16, f15, c2314t, c38072d.m121949b(c28655q2, i15).getWhite10()));
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9108K, c28655q2, 54);
                int iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3394p2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c23972t1.getSubtitle(), c28655q2, i14), c2314t, c38072d.m121949b(c28655q2, i15).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getBtS(), fValueOf, c28655q2, 48, i16, 65016);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c23972t1.getSubtitleIcon().toWhoopIcon(), c28655q2, 6), null, AbstractC1102d.m3419p(((float) 3.5d) * f15, c2314t), c38072d.m121949b(c28655q2, i15).getWhite50(), c28655q2, 432, 0);
                c28655q2 = c28655q2;
                c28655q2.m87173q(true);
                c28655q2.m87173q(false);
                z4 = true;
            }
            c28655q2.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m70635g(Function1 function1, C9598e c9598e) {
        function1.invoke(c9598e);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m70636h(Modifier modifier, C23972t1 c23972t1, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m70633e(modifier, c23972t1, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    public static final long m70637i(long j7, long j13, float f13) {
        float fM36283m = AbstractC12889b.m36283m(f13, 0.0f, 1.0f);
        return AbstractC17918w0.m51518f(((C17919x.m51547i(j13) - C17919x.m51547i(j7)) * fM36283m) + C17919x.m51547i(j7), ((C17919x.m51546h(j13) - C17919x.m51546h(j7)) * fM36283m) + C17919x.m51546h(j7), ((C17919x.m51544f(j13) - C17919x.m51544f(j7)) * fM36283m) + C17919x.m51544f(j7), ((C17919x.m51543e(j13) - C17919x.m51543e(j7)) * fM36283m) + C17919x.m51543e(j7), 16);
    }

    /* JADX INFO: renamed from: j */
    public static final List<C12831h0> m70638j(C12827f0 pieChart, Composer composer, int i13) {
        AbstractC22676k.m65750j(pieChart, "pieChart");
        long jM35965a = AbstractC12829g0.m35965a(EnumC12833i0.NONE, composer, 6);
        List<C12831h0> listM70641m = m70641m(pieChart, composer, (i13 & 14) | C12827f0.f43975d);
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = AbstractC11348f.m30553a(0.0f);
            c28655q.m87172p0(objM87133R);
        }
        C11344e c11344e = (C11344e) objM87133R;
        boolean zM87157i = c28655q.m87157i(c11344e) | c28655q.m87157i(listM70641m);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i || objM87133R2 == c28676v0) {
            objM87133R2 = new a(c11344e, listM70641m, null);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
        Object objM87133R3 = c28655q.m87133R();
        if (objM87133R3 == c28676v0) {
            objM87133R3 = AbstractC28683x.m87264r(new C23964r1(c11344e, listM70641m, jM35965a));
            c28655q.m87172p0(objM87133R3);
        }
        return m70640l((InterfaceC28670t2) objM87133R3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final List m70639k(C11344e c11344e, List list, long j7) {
        float fFloatValue = ((Number) c11344e.m30549e()).floatValue();
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        int i13 = 0;
        for (Object obj : list2) {
            int i14 = i13 + 1;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            float f13 = i13;
            arrayList.add(new C12831h0(m70637i(((C12831h0) obj).getColor(), j7, AbstractC12889b.m36283m((fFloatValue - f13) / ((f13 + 1.0f) - f13), 0.0f, 1.0f)), defaultConstructorMarker));
            i13 = i14;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    private static final List<C12831h0> m70640l(InterfaceC28670t2 interfaceC28670t2) {
        return (List) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: m */
    public static final List<C12831h0> m70641m(C12827f0 pieChart, Composer composer, int i13) {
        long j7;
        long j13;
        AbstractC22676k.m65750j(pieChart, "pieChart");
        int size = pieChart.m35964e().size();
        long jM35965a = AbstractC12829g0.m35965a(EnumC12833i0.OPTIMAL, composer, 6);
        long jM35965a2 = AbstractC12829g0.m35965a(EnumC12833i0.SUFFICIENT, composer, 6);
        long jM35965a3 = AbstractC12829g0.m35965a(EnumC12833i0.OUT_OF_RANGE, composer, 6);
        long jM35965a4 = AbstractC12829g0.m35965a(EnumC12833i0.NONE, composer, 6);
        C28655q c28655q = (C28655q) composer;
        boolean zM87149e = c28655q.m87149e(size);
        Object objM87133R = c28655q.m87133R();
        if (zM87149e || objM87133R == C28635l.f115821a) {
            int iMin = Math.min(50, size);
            int i14 = size - iMin;
            int iMin2 = Math.min(10, i14);
            int iMin3 = Math.min(5, i14 - iMin2);
            ArrayList arrayList = new ArrayList(size);
            int i15 = 0;
            while (i15 < size) {
                if (i15 < iMin) {
                    j7 = jM35965a4;
                    j13 = jM35965a;
                } else {
                    int i16 = iMin + iMin2;
                    if (i15 < i16) {
                        j7 = jM35965a4;
                        j13 = jM35965a2;
                    } else if (i15 < i16 + iMin3) {
                        j7 = jM35965a4;
                        j13 = jM35965a3;
                    } else {
                        j7 = jM35965a4;
                        j13 = j7;
                    }
                }
                arrayList.add(new C12831h0(j13, null));
                i15++;
                size = size;
                jM35965a4 = j7;
                jM35965a = jM35965a;
            }
            c28655q.m87172p0(arrayList);
            objM87133R = arrayList;
        }
        return (List) objM87133R;
    }

    /* JADX INFO: renamed from: n */
    public static final List<C12831h0> m70642n(C12827f0 pieChart, Composer composer, int i13) {
        AbstractC22676k.m65750j(pieChart, "pieChart");
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(pieChart.m35964e());
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = pieChart.m35964e();
            c28655q.m87172p0(objM87133R);
        }
        c28655q.m87150e0(-259155753);
        List list = (List) objM87133R;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C12831h0(AbstractC12829g0.m35965a(((C12835j0) it.next()).getStyle(), c28655q, 0), null));
        }
        c28655q.m87173q(false);
        return arrayList;
    }
}
