package ih1;

import a80.C0545i;
import a80.C0546j;
import a80.C0547k;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import gb1.AbstractC15674c;
import gh1.C15854d;
import gh1.InterfaceC15852b;
import gz0.EnumC16313m0;
import hy0.C17794v;
import if0.C18451b;
import ig0.C18464d;
import ih0.AbstractC18489d0;
import ih0.C18510t;
import iz0.AbstractC21048g;
import iz0.C21053l;
import iz0.C21054m;
import java.util.WeakHashMap;
import l83.C23454a0;
import ny0.AbstractC27249e;
import ny0.C27256h;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p132f0.C13821r1;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C23010x;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p634y1.AbstractC39038k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.InterfaceC25312u;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ih1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015²\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lgh1/d$d;", "viewState", "Lkotlin/Function1;", "Lgh1/b;", "Ll83/a0;", "onEvent", "Lf0/r1;", "scrollState", "o", "(Lgh1/d$d;Lkotlin/jvm/functions/Function1;Lf0/r1;Landroidx/compose/runtime/Composer;II)V", "Lgh1/d$e;", "sticky", "k", "(Lgh1/d$e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lm91/u;", "item", "", "v", "(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "hasViewEventSent", "gifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18524h {

    /* JADX INFO: renamed from: ih1.h$a */
    @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifted.view.GiftedScreenContentKt$GiftedScreenContent$1$1", m100430f = "GiftedScreenContent.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f72164w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f72165x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C15854d.d f72166y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f72167z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, C15854d.d dVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f72165x = function1;
            this.f72166y = dVar;
            this.f72167z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f72165x, this.f72166y, this.f72167z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f72164w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!AbstractC18524h.m53676q(this.f72167z)) {
                AbstractC18524h.m53677r(this.f72167z, true);
                this.f72165x.invoke(new InterfaceC15852b.c(this.f72166y.m44764b()));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: k */
    private static final void m53670k(C15854d.e eVar, Function1 function1, Composer composer, int i13) {
        C28655q c28655q;
        boolean z4;
        C2314t c2314t;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1296724784);
        int i14 = (i13 & 6) == 0 ? i13 | (c28655q2.m87157i(eVar) ? 4 : 2) : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t2 = C2314t.f9131w;
            float f13 = 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), ((float) 2.5d) * f13, 0.0f, 2);
            WeakHashMap weakHashMap = C22944c2.f90553v;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3398t(modifierM3396r, 0.0f, 0.0f, 0.0f, AbstractC22953f.m66717e(C22949e.m66712e(c28655q2).f90558e, c28655q2).mo43109a(), 7), 0.0f, 1 * f13, 0.0f, 3 * f13, 5);
            C23010x c23010xM73381n = AbstractC25012a.m73381n(2, f13, C2299e.f9111N, c28655q2, 54);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM73381n);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            String strM44771b = eVar.getText();
            if (strM44771b == null) {
                c28655q2.m87150e0(-881387036);
                c28655q2.m87173q(false);
                c28655q = c28655q2;
                z4 = false;
                c2314t = c2314t2;
            } else {
                c28655q2.m87150e0(-881387035);
                String strM21275i = AbstractC8693b.m21275i(strM44771b, c28655q2, 0);
                C21053l c21053l = C21053l.f79834a;
                C38072d c38072d = C38072d.f163053a;
                int i16 = C38072d.f163054b;
                z4 = false;
                c2314t = c2314t2;
                C21054m c21054mM58880a = c21053l.m58880a(C23285v0.m67364b(AbstractC18489d0.m53377r(c38072d, c28655q2, i16), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d.m121949b(c28655q2, i16).getWhite70(), 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q2, 0, C21053l.f79835b << 15, 32764);
                c28655q = c28655q2;
                AbstractC21048g.m58807M(strM21275i, null, true, c21054mM58880a, null, 0, 0, 0, false, c28655q, (C21054m.f79836p << 9) | 384, 498);
                c28655q.m87173q(false);
            }
            c28655q.m87150e0(941411827);
            for (InterfaceC25312u interfaceC25312u : eVar.m44770a()) {
                boolean z13 = interfaceC25312u instanceof C27256h;
                C28676v0 c28676v0 = C28635l.f115821a;
                if (z13) {
                    c28655q.m87150e0(-1456871784);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    C27256h c27256h = (C27256h) interfaceC25312u;
                    boolean zM87157i = c28655q.m87157i(interfaceC25312u) | ((i15 & 112) == 32 ? true : z4);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == c28676v0) {
                        objM87133R = new C0545i(function1, c27256h, 4);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC27249e.m82121d(modifierM3409f, c27256h, null, (InterfaceC4339a) objM87133R, c28655q, 6, 4);
                    c28655q.m87173q(z4);
                } else {
                    c28655q.m87150e0(-1456545881);
                    boolean zM87157i2 = c28655q.m87157i(interfaceC25312u) | ((i15 & 112) == 32 ? true : z4);
                    Object objM87133R2 = c28655q.m87133R();
                    if (zM87157i2 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C0546j(function1, interfaceC25312u, 14);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R2, c28655q, 0, 6);
                    c28655q.m87173q(z4);
                }
            }
            c28655q.m87173q(z4);
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18464d(eVar, function1, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m53671l(Function1 function1, InterfaceC25312u interfaceC25312u) {
        function1.invoke(new InterfaceC15852b.f(interfaceC25312u, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m53672m(Function1 function1, InterfaceC25312u interfaceC25312u, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC15852b.f(it, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m53673n(C15854d.e eVar, Function1 function1, int i13, Composer composer, int i14) {
        m53670k(eVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public static final void m53674o(C15854d.d viewState, Function1 onEvent, C13821r1 c13821r1, Composer composer, int i13, int i14) {
        C13821r1 c13821r1M92099U;
        C28676v0 c28676v0;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1335515666);
        int i15 = (i13 & 6) == 0 ? (c28655q.m87157i(viewState) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                c13821r1M92099U = c13821r1;
                int i16 = c28655q.m87153g(c13821r1M92099U) ? 256 : 128;
                i15 |= i16;
            } else {
                c13821r1M92099U = c13821r1;
            }
            i15 |= i16;
        } else {
            c13821r1M92099U = c13821r1;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0 && !c28655q.m87118C()) {
                c28655q.m87138X();
                if ((i14 & 4) != 0) {
                    i15 &= -897;
                }
            } else if ((i14 & 4) != 0) {
                c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                i15 &= -897;
            }
            c28655q.m87175r();
            Object[] objArr = new Object[0];
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (objM87133R == c28676v1) {
                objM87133R = new C18518b(1);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R, c28655q, 48);
            int i17 = i15 & 112;
            boolean zM87153g = c28655q.m87153g(interfaceC28601c1) | (i17 == 32) | c28655q.m87157i(viewState);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v1) {
                objM87133R2 = new a(onEvent, viewState, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, viewState);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t).mo3471e(viewState.getBackgroundStyle().getBackgroundModifier()));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66724m);
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
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            AbstractC6721d.a aVar = new AbstractC6721d.a(viewState.getDisplayRefreshingAnimation() ? AbstractC8693b.m21278l("") : viewState.getToolbarTitle(), null, Integer.valueOf(EnumC16313m0.CROSS.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(1 * f13, c2314t);
            boolean z4 = i17 == 32;
            Object objM87133R3 = c28655q.m87133R();
            if (z4 || objM87133R3 == c28676v1) {
                objM87133R3 = new C18451b(onEvent, 3);
                c28655q.m87172p0(objM87133R3);
            }
            C28676v0 c28676v2 = c28676v1;
            AbstractC6719b.m20143d(modifierM3394p, aVar, null, (InterfaceC4339a) objM87133R3, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            AbstractC1090b.m3351f(viewState.getDisplayRefreshingAnimation(), null, AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3), "Loading Animation", C18519c.f72156a.m53639c(), c28655q, 224640, 2);
            c28655q.m87173q(true);
            Modifier modifierM44089m = AbstractC15674c.m44089m(c2314t, 0.0f, 1, null);
            float f14 = 2 * f13;
            Modifier modifierM3396r = AbstractC1099a.m3396r(modifierM44089m, f14, 0.0f, 2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(modifierM3396r.mo3471e(new LayoutWeightElement(1.0f, true)), c13821r1M92099U, 14);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(viewState.getAlignment(), C2299e.f9111N, c28655q, 48);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
            c28655q.m87150e0(833397971);
            for (C15854d.a aVar2 : viewState.m44767e()) {
                c28655q.m87150e0(833399708);
                for (InterfaceC25312u interfaceC25312u : aVar2.m44757a()) {
                    boolean zM87157i = c28655q.m87157i(interfaceC25312u) | (i17 == 32);
                    Object objM87133R4 = c28655q.m87133R();
                    if (zM87157i) {
                        c28676v0 = c28676v2;
                    } else {
                        c28676v0 = c28676v2;
                        if (objM87133R4 == c28676v0) {
                        }
                        m53681v(interfaceC25312u, (Function1) objM87133R4, c28655q, 0, 0);
                        float f15 = 4;
                        AbstractC11266d.m30469w(f15, f15, c2314t, c28655q);
                        c28676v2 = c28676v0;
                    }
                    objM87133R4 = new C0546j(onEvent, interfaceC25312u, 13);
                    c28655q.m87172p0(objM87133R4);
                    m53681v(interfaceC25312u, (Function1) objM87133R4, c28655q, 0, 0);
                    float f16 = 4;
                    AbstractC11266d.m30469w(f16, f16, c2314t, c28655q);
                    c28676v2 = c28676v0;
                }
                c28655q.m87173q(false);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(aVar2.getSectionType().getSpacing(), c2314t));
            }
            AbstractC18489d0.m53356B(c28655q, false, c2314t, f14, c28655q);
            c28655q.m87173q(true);
            C15854d.e eVarM44768f = viewState.getSticky();
            if (eVarM44768f == null) {
                c28655q.m87150e0(-1057048290);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1057048289);
                m53670k(eVarM44768f, onEvent, c28655q, i17);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17794v(i13, i14, 15, (Object) viewState, (Object) c13821r1M92099U, onEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final InterfaceC28601c1 m53675p() {
        return AbstractC28683x.m87272z(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final boolean m53676q(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final void m53677r(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m53678s(Function1 function1) {
        function1.invoke(InterfaceC15852b.d.f59874a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m53679t(Function1 function1, InterfaceC25312u interfaceC25312u, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC15852b.f(it, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m53680u(C15854d.d dVar, Function1 function1, C13821r1 c13821r1, int i13, int i14, Composer composer, int i15) {
        m53674o(dVar, function1, c13821r1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    public static final void m53681v(InterfaceC25312u item, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        Function1 function3;
        AbstractC22676k.m65750j(item, "item");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1971486894);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(item) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C18510t(9);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C18510t(10);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC25303l.m74291r(item, p720m91.Function1.m74306g((Function1) objM87133R2), null, function3, c28655q, (i15 & 14) | (C25307p.f99300b << 3) | ((i15 << 6) & 7168), 4);
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0547k(item, function2, i13, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m53682w(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m53683x(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m53684y(InterfaceC25312u interfaceC25312u, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m53681v(interfaceC25312u, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
