package com.whoop.membership.view.upcycle;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2476a1;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c41.C4025f5;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.C9813i;
import cy1.C11186b;
import f62.AbstractC14151a;
import f62.AbstractC14152b;
import gb1.AbstractC15673b0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.io.IOException;
import java.util.Iterator;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import ox1.AbstractC28453a;
import p000.AbstractC11266d;
import p000.C3718c;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15166v0;
import p163g1.C15077m1;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22997s1;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import pf.AbstractC29125c;
import px1.InterfaceC29597a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qx1.C30754a;
import qx1.C30755b;
import qx1.C30756c;
import qx1.InterfaceC30758e;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vu1.AbstractC36517h;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: com.whoop.membership.view.upcycle.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a?\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a?\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u000f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lqx1/e;", "viewState", "Lkotlin/Function1;", "Lpx1/a;", "Ll83/a0;", "onViewEvent", "Lcom/whoop/membership/view/upcycle/a$b;", "onAnalyticsEvent", "Lox1/a;", "onNavigationEvent", "o", "(Lqx1/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lqx1/e$c;", "l", "(Lqx1/e$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lqx1/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lqx1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC9145b {

    /* JADX INFO: renamed from: com.whoop.membership.view.upcycle.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.membership.view.upcycle.UpcycleLandingScreenKt$UpcycleLandingComponent$1$1", m100430f = "UpcycleLandingScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f27363w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f27364x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f27364x = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f27364x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f27363w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f27364x.invoke(C9144a.b.C41401b.f27362a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: h */
    private static final void m22875h(C30756c c30756c, Function1 function1, Function1 function2, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1506493484);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87157i(c30756c) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function2) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            float f13 = 4;
            float f14 = 3 * f13;
            float f15 = 2;
            float f16 = 8;
            float f17 = f15 * f16;
            Modifier modifierM3397s = AbstractC1099a.m3397s(AbstractC1092a.m3358c(modifierM3409f, c38072d.m121949b(c28655q, i15).getNeutral15(), AbstractC33253j.m105489e(f14)), f17, f17, f17, ((float) 2.5d) * f16);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3397s);
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
            int i16 = i14;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c30756c.getTitle(), c28655q, TextResource.$stable), null, c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
            c28655q.m87150e0(1305616013);
            for (C30755b c30755b : c30756c.m94487a()) {
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f17), C2299e.f9108K, c28655q, 54);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                C0209i c0209i2 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                Modifier modifierM3419p = AbstractC1102d.m3419p(5 * f13, c2314t);
                C27430e c27430eM107874S = AbstractC34132o.m107874S(c30755b.getIcon().toWhoopIcon(), c28655q, 6);
                C38072d c38072d2 = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                C28655q c28655q2 = c28655q;
                AbstractC15005f3.m43108b(c27430eM107874S, "", modifierM3419p, c38072d2.m121949b(c28655q, i17).getRecovery(), c28655q2, 432, 0);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c30755b.getText(), c28655q2, TextResource.$stable), null, c38072d2.m121949b(c28655q2, i17).getRecovery(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i17).getB2(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13 * f13, c2314t));
            }
            c28655q.m87173q(false);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15 * f13, c2314t));
            C30754a c30754aM94488b = c30756c.getRafCta();
            if (c30754aM94488b == null) {
                c28655q.m87150e0(1820236420);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1820236421);
                C22976l1 c22976l1 = AbstractC15166v0.f56891a;
                C38072d c38072d3 = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(c38072d3.m121949b(c28655q, i18).getWhite10(), c38072d3.m121949b(c28655q, i18).getBrandWhite(), 0L, 0L, c28655q, 0, 12);
                C33252i c33252iM105489e = AbstractC33253j.m105489e(f13 * f13);
                float f18 = 0;
                C22976l1 c22976l2 = new C22976l1(f18, f17, f18, f17);
                boolean zM87157i = ((i16 & 896) == 256) | ((i16 & 112) == 32) | c28655q.m87157i(c30754aM94488b);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C3718c(function1, c30754aM94488b, function2, 29);
                    c28655q.m87172p0(objM87133R);
                }
                C28655q c28655q3 = c28655q;
                AbstractC12350b.m34578a((InterfaceC4339a) objM87133R, null, false, null, c33252iM105489e, null, c15077m1M43196a, c22976l2, AbstractC37817c.m121344e(277731330, c28655q, new C2476a1(c30754aM94488b, 7)), c28655q3, 905994240, 78);
                c28655q = c28655q3;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11186b(c30756c, function1, function2, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m22876i(Function1 function1, C30754a c30754a, Function1 function2) {
        function1.invoke(new C9144a.b.a(c30754a));
        function2.invoke(new AbstractC28453a.b(c30754a.getDestination()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m22877j(C30754a c30754a, InterfaceC22997s1 Button, Composer composer, int i13) {
        AbstractC22676k.m65750j(Button, "$this$Button");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
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
            float f13 = 4;
            Modifier modifierM3419p = AbstractC1102d.m3419p(5 * f13, c2314t);
            C38072d c38072d = C38072d.f163053a;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getGrowth().getSend(), c28655q, 6), "", modifierM3419p, 0L, c28655q, 432, 8);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(2 * f13, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(AbstractC8693b.m21278l(c30754a.getTitle()), c28655q, TextResource.$stable), null, 0L, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, C38072d.f163054b).getH5(), null, c28655q, 0, C2886a.f11498d << 18, 196094);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m22878k(C30756c c30756c, Function1 function1, Function1 function2, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m22875h(c30756c, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public static final void m22879l(InterfaceC30758e.c viewState, Function1 onAnalyticsEvent, Function1 onNavigationEvent, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        Function1 function1;
        Function1 function2;
        C0209i c0209i;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1775782675);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onAnalyticsEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new a(onAnalyticsEvent, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3409f(1.0f, c2314t));
            AbstractC22403o.a aVar = new AbstractC22403o.a(AbstractC14151a.f50976c);
            int i15 = AbstractC22403o.a.f87639c;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(aVar, null, null, c28655q, i15, 3), null, modifierM44028b0, null, C39102j.f168205g, 0.0f, null, c28655q, 24624, 104);
            Modifier modifierM66723l = AbstractC22953f.m66723l(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90656g, C2299e.f9111N, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66723l);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
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
            float f13 = 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 9 * f13, 7);
            C38072d c38072d = C38072d.f163053a;
            AbstractC6721d.a aVar2 = new AbstractC6721d.a(null, null, AbstractC38963t7.m124375e(c38072d), AbstractC8693b.m21273g(AbstractC36517h.f156122e, c28655q, 0), null, null, null, null, false, null, null, null, null, null, null, null, 65523, null);
            boolean z13 = (i14 & 896) == 256;
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C9813i(onNavigationEvent, 7);
                c28655q.m87172p0(objM87133R2);
            }
            C0209i c0209i6 = c0209i;
            int i16 = i14;
            AbstractC6719b.m20143d(modifierM3398t, aVar2, null, (InterfaceC4339a) objM87133R2, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            float f14 = 2 * f13;
            Modifier modifierM3397s = AbstractC1099a.m3397s(c2314t, f14, f14, f14, 6 * f13);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3397s);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            float f15 = 4;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(new AbstractC22403o.a(c38072d.m121951d().getLogo().getWhoopRoundArrows()), null, null, c28655q, i15, 3), null, AbstractC1102d.m3419p(15 * f15, c2314t), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
            float f16 = f15 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t));
            TextResource textResourceM94496d = viewState.getTitle();
            int i17 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM94496d, c28655q, i17);
            int i18 = C38072d.f163054b;
            C2886a c2886aM8417O = c38072d.m121952e(c28655q, i18).getT2();
            long jM125430y = c38072d.m121949b(c28655q, i18).getBrandWhite();
            int i19 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q, 0, i19, 196602);
            c28655q = c28655q;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * f13, c2314t));
            TextResource textResourceM94495c = viewState.getSubtitle();
            if (textResourceM94495c == null) {
                c28655q.m87150e0(1259268085);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1259268086);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM94495c, c28655q, i17), null, c38072d.m121949b(c28655q, i18).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getB1(), null, c28655q, 0, i19, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t));
            c28655q.m87150e0(1010463956);
            Iterator<T> it = viewState.m94494b().iterator();
            while (it.hasNext()) {
                m22875h((C30756c) it.next(), onAnalyticsEvent, onNavigationEvent, c28655q, i16 & MessageListItemViewType.GIPHY);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16, c2314t));
            }
            function1 = onAnalyticsEvent;
            function2 = onNavigationEvent;
            AbstractC2875y.m8286B(c28655q, false, true, true, true);
        } else {
            function1 = onAnalyticsEvent;
            function2 = onNavigationEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11186b(viewState, function1, function2, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m22880m(Function1 function1) {
        function1.invoke(AbstractC28453a.a.f114722a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m22881n(InterfaceC30758e.c cVar, Function1 function1, Function1 function2, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m22879l(cVar, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static final void m22882o(InterfaceC30758e viewState, Function1 onViewEvent, Function1 onAnalyticsEvent, Function1 onNavigationEvent, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1817987916);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onAnalyticsEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(onNavigationEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            boolean zEquals = viewState.equals(InterfaceC30758e.a.f126628a);
            C2314t c2314t = C2314t.f9131w;
            if (zEquals) {
                c28655q2.m87150e0(140763621);
                AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC14152b.f50979a, null, i15, 0 == true ? 1 : 0), false, null, 6, null);
                TextResource textResourceM21267a = AbstractC8693b.m21267a();
                TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC14152b.f50985g, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
                Modifier modifierM66723l = AbstractC22953f.m66723l(c2314t);
                boolean z4 = (i14 & 112) == 32;
                Object objM87133R = c28655q2.m87133R();
                if (z4 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C9813i(onViewEvent, 6);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC33199m0.m105214F(bVar, textResourceM21267a, null, c8688b, (InterfaceC4339a) objM87133R, false, false, null, null, modifierM66723l, false, false, c28655q2, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 3556);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            } else {
                c28655q = c28655q2;
                if (viewState.equals(InterfaceC30758e.b.f126629a)) {
                    c28655q.m87150e0(141329092);
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, AbstractC22953f.m66723l(c2314t), false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 3580);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    if (!(viewState instanceof InterfaceC30758e.c)) {
                        throw AbstractC11895b.m32003v(-965292344, c28655q, false);
                    }
                    c28655q.m87150e0(-965264109);
                    int i16 = i14 & 14;
                    int i17 = i14 >> 3;
                    m22879l((InterfaceC30758e.c) viewState, onAnalyticsEvent, onNavigationEvent, c28655q, (i17 & 896) | i16 | (i17 & 112));
                    c28655q.m87173q(false);
                }
            }
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4025f5(viewState, onViewEvent, onAnalyticsEvent, onNavigationEvent, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m22883p(Function1 function1) {
        function1.invoke(InterfaceC29597a.a.f120845a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m22884q(InterfaceC30758e interfaceC30758e, Function1 function1, Function1 function2, Function1 function3, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m22882o(interfaceC30758e, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
