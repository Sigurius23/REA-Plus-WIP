package yo1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import gz0.EnumC16313m0;
import hy0.AbstractC17808z1;
import hy0.C17731c2;
import hy0.EnumC17727b2;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import rz0.AbstractC31926e;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import w71.C36891k;
import wb3.AbstractC37056f;
import x30.C37888f1;
import x81.C38072d;
import xn1.AbstractC38480c;
import yn1.AbstractC39672a;

/* JADX INFO: renamed from: yo1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aK\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lyo1/d;", "viewState", "Lkotlin/Function1;", "Lyn1/a;", "Ll83/a0;", "onAnalyticEvent", "Lcom/whoop/design/models/modal/DecodedGenericInteraction;", "onClick", "d", "(Landroidx/compose/ui/Modifier;Lyo1/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lhy0/b2;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lhy0/b2;)Ljava/lang/String;", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39690c {

    /* JADX INFO: renamed from: yo1.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.naturalcycles.presentation.NaturalCyclesFertilityCardKt$NaturalCyclesFertilityCard$1$1", m100430f = "NaturalCyclesFertilityCard.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f170843w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f170844x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C39691d f170845y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, C39691d c39691d, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f170844x = function1;
            this.f170845y = c39691d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f170844x, this.f170845y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f170843w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f170844x.invoke(new AbstractC39672a.f0("mci_overview"));
            C17731c2 c17731c2M127026h = this.f170845y.getTrend();
            if (c17731c2M127026h != null) {
                this.f170844x.invoke(new AbstractC39672a.g0(AbstractC39690c.m127019h(c17731c2M127026h.getTrendTypeState())));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yo1.c$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f170846a;

        static {
            int[] iArr = new int[EnumC17727b2.values().length];
            try {
                iArr[EnumC17727b2.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17727b2.POSITIVE_GREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC17727b2.POSITIVE_BLUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC17727b2.NEGATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC17727b2.NEGATIVE_YELLOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC17727b2.NEUTRAL_CONCERN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC17727b2.NEUTRAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC17727b2.DASHED_NEUTRAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f170846a = iArr;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m127015d(Modifier modifier, C39691d viewState, Function1 onAnalyticEvent, Function1 onClick, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onAnalyticEvent, "onAnalyticEvent");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1237698010);
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
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onAnalyticEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(onClick) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        boolean z4 = false;
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            Modifier modifier3 = i16 != 0 ? C2314t.f9131w : modifier2;
            boolean z13 = (i15 & 896) == 256;
            if ((i15 & 112) == 32 || ((i15 & 64) != 0 && c28655q.m87157i(viewState))) {
                z4 = true;
            }
            boolean z14 = z13 | z4;
            Object objM87133R = c28655q.m87133R();
            if (z14 || objM87133R == C28635l.f115821a) {
                objM87133R = new a(onAnalyticEvent, viewState, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
            int i17 = (i15 & 14) | 12582912;
            Modifier modifier4 = modifier3;
            AbstractC31926e.m99375j(modifier4, null, 0L, null, null, null, 0.0f, AbstractC37817c.m121344e(1629565290, c28655q, new C37888f1(8, onClick, viewState)), c28655q, i17, 126);
            modifier2 = modifier4;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36891k(modifier2, (InterfaceC25312u) viewState, onAnalyticEvent, (Object) onClick, i13, i14, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m127016e(Function1 function1, C39691d c39691d, Composer composer, int i13) {
        C0209i c0209i;
        C2314t c2314t;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c39691d);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C39689b(0, function1, c39691d);
                c28655q.m87172p0(objM87133R);
            }
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3362g = AbstractC1092a.m3362g(c2314t2, false, null, null, (InterfaceC4339a) objM87133R, 15);
            float f13 = 2;
            float f14 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13 * f14, modifierM3362g);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
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
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
            C22961h c22961h = AbstractC22977m.f90656g;
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            String strM127020a = c39691d.getCardTitle();
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            C2886a sh4 = c38072d.m121952e(c28655q, i14).getSh4();
            long brandWhite = c38072d.m121949b(c28655q, i14).getBrandWhite();
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            int i15 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM127020a, layoutWeightElement, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, sh4, null, c28655q, 0, i15, 196600);
            float f15 = 4;
            float f16 = 3 * f15;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(EnumC16313m0.CARET_FORWARD.toWhoopIcon(), c28655q, 6), AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164869p), AbstractC1102d.m3419p(f16, c2314t2), c38072d.m121949b(c28655q, i14).getWhite70(), c28655q, 384, 0);
            c28655q.m87173q(true);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13 * f15, c2314t2));
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 48);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                c0209i = c0209i4;
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                c0209i = c0209i4;
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(new AbstractC22403o.c(c39691d.getIconUrl(), 0, 0, 0, 14, null), null, null, c28655q, AbstractC22403o.c.f87642f, 3), AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164868o), AbstractC1102d.m3419p(5 * f15, c2314t2), null, null, 0.0f, null, c28655q, 384, 120);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3398t = AbstractC1099a.m3398t(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), ((float) 1.5d) * f14, 0.0f, 0.0f, 0.0f, 14);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N4);
            AbstractC30795n.m94707h(c39691d.getTitle(), null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB1(), null, c28655q, 0, i15, 196602);
            C28655q c28655q2 = c28655q;
            String strM127024f = c39691d.getSubtitle();
            if (strM127024f == null) {
                c28655q2.m87150e0(1527949819);
                z4 = false;
                c28655q2.m87173q(false);
                c2314t = c2314t2;
            } else {
                c28655q2.m87150e0(1527949820);
                c2314t = c2314t2;
                AbstractC11266d.m30469w((float) 0.15d, f15, c2314t, c28655q2);
                AbstractC30795n.m94707h(strM127024f, null, c38072d.m121949b(c28655q2, i14).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i14).getB3(), null, c28655q2, 0, i15, 196602);
                c28655q2 = c28655q2;
                z4 = false;
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            C17731c2 c17731c2M127026h = c39691d.getTrend();
            if (c17731c2M127026h == null) {
                c28655q2.m87150e0(-158561959);
                c28655q2.m87173q(z4);
            } else {
                c28655q2.m87150e0(-158561958);
                AbstractC17808z1.m51175c(c17731c2M127026h, c28655q2, C17731c2.f68917p);
                c28655q2.m87173q(z4);
            }
            AbstractC18489d0.m53356B(c28655q2, true, c2314t, f16, c28655q2);
            C28655q c28655q3 = c28655q2;
            AbstractC30795n.m94707h(c39691d.getDescription(), null, c38072d.m121949b(c28655q2, i14).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i14).getB3(), null, c28655q3, 0, i15, 196602);
            c28655q3.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m127017f(Function1 function1, C39691d c39691d) {
        function1.invoke(c39691d.getInteraction());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m127018g(Modifier modifier, C39691d c39691d, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m127015d(modifier, c39691d, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static final String m127019h(EnumC17727b2 enumC17727b2) {
        AbstractC22676k.m65750j(enumC17727b2, "<this>");
        switch (b.f170846a[enumC17727b2.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return "sent";
            case 4:
            case 5:
            case 6:
                return "not_sent";
            case 7:
            case 8:
                return "processing";
            default:
                return "unknown";
        }
    }
}
