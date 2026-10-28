package yd2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.AbstractC1095d;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ck1.C4789l;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import e93.AbstractC12889b;
import ih0.AbstractC18489d0;
import io.sentry.config.AbstractC20301a;
import j11.AbstractC21211n;
import kd1.C22411w;
import kd2.AbstractC22415a;
import l83.C23454a0;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p132f0.InterfaceC13832v0;
import p208i2.C17903p;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.AbstractC39083d;
import p635y2.InterfaceC39127r0;
import p699b70.C2777c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p745y81.EnumC39333f;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v41.C35658c;
import v90.C35813e;
import vv2.C36537c;
import vv2.C36538d;
import wb3.AbstractC37056f;
import wr0.C37550r;
import x81.C38072d;
import xd2.C38205a;
import xd2.C38206b;
import xd2.C38211g;
import xd2.InterfaceC38212h;
import xd2.InterfaceC38214j;

/* JADX INFO: renamed from: yd2.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u000e2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00112\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u000e2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0016\u0010\u0010\u001a+\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00172\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lxd2/j;", "viewState", "Lkotlin/Function1;", "Lxd2/h$l;", "Ll83/a0;", "onNavEvent", "Lxd2/h$p;", "onViewEvent", "N", "(Lxd2/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lxd2/h;", "onEvent", "M", "(Lxd2/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lxd2/j$b;", "S", "(Lxd2/j$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lxd2/a;", "J", "(Lxd2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "C", "(Landroidx/compose/runtime/Composer;I)V", "x", "Lxd2/j$a;", "E", "(Lxd2/j$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "shepherd_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39469k {

    /* JADX INFO: renamed from: yd2.k$a */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.notificationhistory.view.ShepherdNotificationHistoryScreenKt$FullScreenModalScreen$1$4$1", m100430f = "ShepherdNotificationHistoryScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f169826w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC38214j.a f169827x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f169828y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC38214j.a aVar, Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f169827x = aVar;
            this.f169828y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f169827x, this.f169828y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f169826w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC38212h interfaceC38212hM122452g = this.f169827x.getFollowUpEvent();
            if (interfaceC38212hM122452g != null) {
                this.f169828y.invoke(interfaceC38212hM122452g);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m126063A(Function1 function1, InterfaceC38212h.p pVar) {
        function1.invoke(pVar);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m126064B(InterfaceC38214j.b bVar, Function1 function1, int i13, Composer composer, int i14) {
        m126113x(bVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    private static final void m126065C(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1701209325);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC12889b.m36263b(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 2 * 8, 0.0f, 2), C22411w.f87680a.m64535a().m64090c(), EnumC39333f.ACCENT_NEGATIVE_TREND_15.mo134584toComposableColorWaAFU9c(c28655q, 6), null, 0, C39460b.f169787a.m126012b(), c28655q, 1769478, 24);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35658c(i13, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m126066D(int i13, Composer composer, int i14) {
        m126065C(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    private static final void m126067E(final InterfaceC38214j.a aVar, final Function1 function1, Composer composer, int i13) {
        int i14;
        Function1 function2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(589655086);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(aVar) : c28655q.m87157i(aVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            boolean z4 = aVar.getType() instanceof AbstractC33208p0.h;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4) {
                c28655q.m87150e0(-2128616583);
                TextResource textResourceMo105309c = aVar.getType().getTitle();
                boolean zM87157i = c28655q.m87157i(aVar) | ((i14 & 112) == 32);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    final int i15 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: yd2.j
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i15) {
                                case 0:
                                    return AbstractC39469k.m126068F(aVar, function1);
                                case 1:
                                    return AbstractC39469k.m126069G(aVar, function1);
                                default:
                                    return AbstractC39469k.m126070H(aVar, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC33199m0.m105214F(new AbstractC33208p0.h(textResourceMo105309c, 0L, (InterfaceC4339a) objM87133R, 2, null), aVar.getSupportText(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                c28655q.m87173q(false);
                function2 = function1;
            } else {
                c28655q.m87150e0(-2128266190);
                int i16 = i14;
                AbstractC33208p0 abstractC33208p0M122458m = aVar.getType();
                TextResource textResourceM122457l = aVar.getSupportText();
                TextResource textResourceM122454i = aVar.getPrimaryButtonText();
                int i17 = i16 & 112;
                boolean zM87157i2 = c28655q.m87157i(aVar) | (i17 == 32);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i2 || objM87133R2 == c28676v0) {
                    final int i18 = 1;
                    objM87133R2 = new InterfaceC4339a() { // from class: yd2.j
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i18) {
                                case 0:
                                    return AbstractC39469k.m126068F(aVar, function1);
                                case 1:
                                    return AbstractC39469k.m126069G(aVar, function1);
                                default:
                                    return AbstractC39469k.m126070H(aVar, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                TextResource textResourceM122456k = aVar.getSecondaryButtonText();
                boolean zM87157i3 = c28655q.m87157i(aVar) | (i17 == 32);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87157i3 || objM87133R3 == c28676v0) {
                    final int i19 = 2;
                    objM87133R3 = new InterfaceC4339a() { // from class: yd2.j
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    return AbstractC39469k.m126068F(aVar, function1);
                                case 1:
                                    return AbstractC39469k.m126069G(aVar, function1);
                                default:
                                    return AbstractC39469k.m126070H(aVar, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                int i24 = 196608 | AbstractC33208p0.f138461d;
                int i25 = TextResource.$stable;
                AbstractC33199m0.m105214F(abstractC33208p0M122458m, textResourceM122457l, null, textResourceM122454i, interfaceC4339a, true, false, textResourceM122456k, interfaceC4339a2, null, false, false, c28655q, i24 | (i25 << 3) | (i25 << 9) | (i25 << 21), 0, 3652);
                InterfaceC38212h interfaceC38212hM122452g = aVar.getFollowUpEvent();
                boolean zM87157i4 = c28655q.m87157i(aVar) | (i17 == 32);
                Object objM87133R4 = c28655q.m87133R();
                if (zM87157i4 || objM87133R4 == c28676v0) {
                    function2 = function1;
                    objM87133R4 = new a(aVar, function2, null);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    function2 = function1;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, interfaceC38212hM122452g);
                c28655q.m87173q(false);
            }
        } else {
            function2 = function1;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35813e(aVar, function2, i13, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m126068F(InterfaceC38214j.a aVar, Function1 function1) {
        InterfaceC38212h interfaceC38212hM122452g = aVar.getFollowUpEvent();
        if (interfaceC38212hM122452g != null) {
            function1.invoke(interfaceC38212hM122452g);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m126069G(InterfaceC38214j.a aVar, Function1 function1) {
        InterfaceC38212h interfaceC38212hM122453h = aVar.getPrimaryButtonClickEvent();
        if (interfaceC38212hM122453h != null) {
            function1.invoke(interfaceC38212hM122453h);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m126070H(InterfaceC38214j.a aVar, Function1 function1) {
        InterfaceC38212h interfaceC38212hM122455j = aVar.getSecondaryButtonClickEvent();
        if (interfaceC38212hM122455j != null) {
            function1.invoke(interfaceC38212hM122455j);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m126071I(InterfaceC38214j.a aVar, Function1 function1, int i13, Composer composer, int i14) {
        m126067E(aVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: J */
    private static final void m126072J(C38205a c38205a, Function1 function1, Composer composer, int i13) {
        int i14;
        Modifier modifierM3360e;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1324899216);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c38205a) : c28655q.m87157i(c38205a) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 2 * 8, 0.0f, 2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, c28655q, 54);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C9598e c9598eM122409a = c38205a.getDestination();
            String strM21274h = AbstractC8693b.m21274h(c38205a.getTitle(), c28655q, TextResource.$stable);
            WithAlignmentLineElement withAlignmentLineElement = new WithAlignmentLineElement(AbstractC39083d.f168140a);
            if (2.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierMo3471e = withAlignmentLineElement.mo3471e(new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true));
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, modifierMo3471e, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getT3(), null, c28655q, 0, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(c38205a.getIcon(), c28655q, 0);
            float f13 = 24;
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3415l(f13, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1, 7)), AbstractC33253j.m105489e(f13));
            if (c9598eM122409a != null) {
                c28655q.m87150e0(-510257870);
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
                InterfaceC13832v0 interfaceC13832v0 = (InterfaceC13832v0) c28655q.m87161k(AbstractC1095d.f4515a);
                boolean zM87157i = ((i15 & 112) == 32) | c28655q.m87157i(c9598eM122409a);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new C4789l(function1, c9598eM122409a, 15);
                    c28655q.m87172p0(objM87133R2);
                }
                modifierM3360e = AbstractC1092a.m3360e(c2314t, interfaceC21083i, interfaceC13832v0, false, null, (InterfaceC4339a) objM87133R2, 28);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-510000322);
                c28655q.m87173q(false);
                modifierM3360e = c2314t;
            }
            AbstractC29125c.m88522c(abstractC26165aM88500I, null, modifierM118994r.mo3471e(modifierM3360e), null, null, 0.0f, new C17903p(c38072d.m121949b(c28655q, i16).getBrandWhite(), 5), c28655q, 48, 56);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35813e(c38205a, function1, i13, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m126073K(Function1 function1, C9598e c9598e) {
        function1.invoke(new InterfaceC38212h.i(c9598e));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m126074L(C38205a c38205a, Function1 function1, int i13, Composer composer, int i14) {
        m126072J(c38205a, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M */
    public static final void m126075M(InterfaceC38214j viewState, Function1 onEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(688514278);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (viewState instanceof InterfaceC38214j.a) {
            c28655q.m87150e0(237265381);
            m126067E((InterfaceC38214j.a) viewState, onEvent, c28655q, i14 & 126);
            c28655q.m87173q(false);
        } else {
            if (!(viewState instanceof InterfaceC38214j.b)) {
                throw AbstractC11895b.m32003v(237262851, c28655q, false);
            }
            c28655q.m87150e0(237269293);
            m126081S((InterfaceC38214j.b) viewState, onEvent, c28655q, i14 & 126);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35813e(viewState, onEvent, i13, 27);
        }
    }

    /* JADX INFO: renamed from: N */
    public static final void m126076N(InterfaceC38214j viewState, Function1 onNavEvent, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-412610951);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onNavEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            int i15 = i14 & 112;
            boolean z4 = i15 == 32;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C39465g(onNavEvent, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
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
            boolean z13 = (i15 == 32) | ((i14 & 896) == 256);
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C2777c(onNavEvent, 21, onViewEvent);
                c28655q.m87172p0(objM87133R2);
            }
            m126075M(viewState, (Function1) objM87133R2, c28655q, i14 & 14);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36537c(viewState, onNavEvent, onViewEvent, i13, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m126077O(Function1 function1) {
        function1.invoke(InterfaceC38212h.d.f163731a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m126078P(Function1 function1, Function1 function2, InterfaceC38212h event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC38212h.l) {
            function1.invoke(event);
        } else {
            if (!(event instanceof InterfaceC38212h.p)) {
                throw new NoWhenBranchMatchedException();
            }
            function2.invoke(event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m126079Q(InterfaceC38214j interfaceC38214j, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m126076N(interfaceC38214j, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m126080R(InterfaceC38214j interfaceC38214j, Function1 function1, int i13, Composer composer, int i14) {
        m126075M(interfaceC38214j, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0330  */
    /* JADX WARN: Code duplicated, block: B:103:0x033d  */
    /* JADX WARN: Code duplicated, block: B:104:0x033f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0346 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x0348  */
    /* JADX WARN: Code duplicated, block: B:111:0x0355  */
    /* JADX WARN: Code duplicated, block: B:112:0x0357  */
    /* JADX WARN: Code duplicated, block: B:115:0x035e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x0360  */
    /* JADX WARN: Code duplicated, block: B:119:0x036e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0375 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x0377  */
    /* JADX WARN: Code duplicated, block: B:72:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:75:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:76:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:84:0x0308  */
    /* JADX WARN: Code duplicated, block: B:85:0x030a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0311  */
    /* JADX WARN: Code duplicated, block: B:91:0x0316  */
    /* JADX WARN: Code duplicated, block: B:95:0x0325  */
    /* JADX WARN: Code duplicated, block: B:96:0x0327  */
    /* JADX WARN: Code duplicated, block: B:99:0x032e A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: S */
    private static final void m126081S(InterfaceC38214j.b bVar, Function1 function1, Composer composer, int i13) {
        int i14;
        final Function1 function2;
        C28655q c28655q;
        int i15;
        C0213j c0213j;
        C0209i c0209i;
        C28676v0 c28676v0;
        C28676v0 c28676v1;
        int iHashCode;
        boolean z4;
        Object objM87133R;
        C28676v0 c28676v2;
        boolean z13;
        Object objM87133R2;
        boolean z14;
        Object objM87133R3;
        boolean z15;
        Object objM87133R4;
        boolean z16;
        Object objM87133R5;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1316085962);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87157i(bVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            int i16 = i14 & 112;
            m126113x(bVar, function1, c28655q2, i14 & 126);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM94757f = AbstractC30802r.m94757f(c2314t, 1.0f);
            C22961h c22961h = AbstractC22977m.f90656g;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22961h, c2305k, c28655q2, 6);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM94757f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j2);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
            Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "ArrhythmiaSettingsToolbar");
            AbstractC6721d.a aVar = new AbstractC6721d.a(bVar.getPageTitle(), null, Integer.valueOf(bVar.getIcon()), AbstractC30060g.m92103Y(c28655q2, AbstractC22415a.f87687d), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            boolean z17 = i16 == 32;
            Object objM87133R6 = c28655q2.m87133R();
            C28676v0 c28676v3 = C28635l.f115821a;
            if (z17 || objM87133R6 == c28676v3) {
                objM87133R6 = new C39465g(function1, 3);
                c28655q2.m87172p0(objM87133R6);
            }
            AbstractC6719b.m20143d(modifierM3599a, aVar, null, (InterfaceC4339a) objM87133R6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            float f13 = 8;
            float f14 = 1 * f13;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f14, c2314t));
            C38205a c38205aM122466d = bVar.getPageHeader();
            int i17 = TextResource.$stable;
            m126072J(c38205aM122466d, function1, c28655q2, C9598e.f28134d | i17 | i16);
            String strM21274h = AbstractC8693b.m21274h(bVar.getBody(), c28655q2, i17);
            float f15 = 2 * f13;
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f15, 0.0f, 2);
            C38072d c38072d = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, modifierM3396r, c38072d.m121949b(c28655q2, i18).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i18).getB1(), null, c28655q2, 48, C2886a.f11498d << 18, 196600);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(3 * f13, c2314t));
            if (bVar.getDetectionOn()) {
                i15 = 0;
                c28655q2.m87150e0(1256176962);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(1256136600);
                i15 = 0;
                m126065C(c28655q2, 0);
                c28655q2.m87173q(false);
            }
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f14, c2314t));
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, f15, 0.0f, 2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, i15);
            int iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3396r2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c0213j = c0213j2;
                c28655q2.m87163l(c0213j);
            } else {
                c0213j = c0213j2;
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                c0209i = c0209i4;
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
            } else {
                c0209i = c0209i4;
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N2);
            InterfaceC25312u interfaceC25312uM122468f = bVar.getSettingsCta();
            boolean z18 = i16 == 32;
            Object objM87133R7 = c28655q2.m87133R();
            if (z18) {
                c28676v0 = c28676v3;
            } else {
                c28676v0 = c28676v3;
                if (objM87133R7 != c28676v0) {
                    function2 = function1;
                }
                c28676v1 = c28676v0;
                AbstractC25303l.m74291r(interfaceC25312uM122468f, null, null, (Function1) objM87133R7, c28655q2, 0, 6);
                c28655q2.m87173q(true);
                AbstractC18489d0.m53380u(4, f13, c2314t, c28655q2);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, new LayoutWeightElement(1.0f, true)), f15, 0.0f, 2);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3396r3);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N3);
                C38211g c38211gM122470h = bVar.getShepherdHistoryViewState();
                boolean zM122471i = bVar.getIsLoadingMoreHistory();
                if (i16 == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objM87133R = c28655q2.m87133R();
                if (z4) {
                    c28676v2 = c28676v1;
                } else {
                    c28676v2 = c28676v1;
                    if (objM87133R == c28676v2) {
                    }
                    Function1 function3 = (Function1) objM87133R;
                    if (i16 == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z13 || objM87133R2 == c28676v2) {
                        final int i19 = 1;
                        objM87133R2 = new Function1() { // from class: yd2.h
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i19) {
                                    case 0:
                                        return AbstractC39469k.m126084V(function2, (String) obj);
                                    case 1:
                                        return AbstractC39469k.m126085W(function2, obj);
                                    case 2:
                                        return AbstractC39469k.m126086X(function2, (String) obj);
                                    case 3:
                                        return AbstractC39469k.m126087Y(function2, (String) obj);
                                    default:
                                        return AbstractC39469k.m126083U(function2, obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R2);
                    }
                    Function1 function4 = (Function1) objM87133R2;
                    if (i16 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R3 = c28655q2.m87133R();
                    if (z14 || objM87133R3 == c28676v2) {
                        final int i24 = 2;
                        objM87133R3 = new Function1() { // from class: yd2.h
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i24) {
                                    case 0:
                                        return AbstractC39469k.m126084V(function2, (String) obj);
                                    case 1:
                                        return AbstractC39469k.m126085W(function2, obj);
                                    case 2:
                                        return AbstractC39469k.m126086X(function2, (String) obj);
                                    case 3:
                                        return AbstractC39469k.m126087Y(function2, (String) obj);
                                    default:
                                        return AbstractC39469k.m126083U(function2, obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R3);
                    }
                    Function1 function5 = (Function1) objM87133R3;
                    if (i16 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R4 = c28655q2.m87133R();
                    if (z15 || objM87133R4 == c28676v2) {
                        final int i25 = 3;
                        objM87133R4 = new Function1() { // from class: yd2.h
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i25) {
                                    case 0:
                                        return AbstractC39469k.m126084V(function2, (String) obj);
                                    case 1:
                                        return AbstractC39469k.m126085W(function2, obj);
                                    case 2:
                                        return AbstractC39469k.m126086X(function2, (String) obj);
                                    case 3:
                                        return AbstractC39469k.m126087Y(function2, (String) obj);
                                    default:
                                        return AbstractC39469k.m126083U(function2, obj);
                                }
                            }
                        };
                        c28655q2.m87172p0(objM87133R4);
                    }
                    Function1 function6 = (Function1) objM87133R4;
                    z16 = i16 == 32;
                    objM87133R5 = c28655q2.m87133R();
                    if (z16 || objM87133R5 == c28676v2) {
                        objM87133R5 = new C39465g(function2, 1);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    AbstractC39462d.m126033u(c38211gM122470h, zM122471i, function3, function4, function5, function6, (InterfaceC4339a) objM87133R5, c28655q2, 0);
                    c28655q = c28655q2;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                }
                final int i26 = 0;
                objM87133R = new Function1() { // from class: yd2.h
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i26) {
                            case 0:
                                return AbstractC39469k.m126084V(function2, (String) obj);
                            case 1:
                                return AbstractC39469k.m126085W(function2, obj);
                            case 2:
                                return AbstractC39469k.m126086X(function2, (String) obj);
                            case 3:
                                return AbstractC39469k.m126087Y(function2, (String) obj);
                            default:
                                return AbstractC39469k.m126083U(function2, obj);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R);
                Function1 function7 = (Function1) objM87133R;
                if (i16 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q2.m87133R();
                if (z13) {
                    final int i110 = 1;
                    objM87133R2 = new Function1() { // from class: yd2.h
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i110) {
                                case 0:
                                    return AbstractC39469k.m126084V(function2, (String) obj);
                                case 1:
                                    return AbstractC39469k.m126085W(function2, obj);
                                case 2:
                                    return AbstractC39469k.m126086X(function2, (String) obj);
                                case 3:
                                    return AbstractC39469k.m126087Y(function2, (String) obj);
                                default:
                                    return AbstractC39469k.m126083U(function2, obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    final int i111 = 1;
                    objM87133R2 = new Function1() { // from class: yd2.h
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i111) {
                                case 0:
                                    return AbstractC39469k.m126084V(function2, (String) obj);
                                case 1:
                                    return AbstractC39469k.m126085W(function2, obj);
                                case 2:
                                    return AbstractC39469k.m126086X(function2, (String) obj);
                                case 3:
                                    return AbstractC39469k.m126087Y(function2, (String) obj);
                                default:
                                    return AbstractC39469k.m126083U(function2, obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R2);
                }
                Function1 function8 = (Function1) objM87133R2;
                if (i16 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R3 = c28655q2.m87133R();
                if (z14) {
                    final int i27 = 2;
                    objM87133R3 = new Function1() { // from class: yd2.h
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i27) {
                                case 0:
                                    return AbstractC39469k.m126084V(function2, (String) obj);
                                case 1:
                                    return AbstractC39469k.m126085W(function2, obj);
                                case 2:
                                    return AbstractC39469k.m126086X(function2, (String) obj);
                                case 3:
                                    return AbstractC39469k.m126087Y(function2, (String) obj);
                                default:
                                    return AbstractC39469k.m126083U(function2, obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    final int i28 = 2;
                    objM87133R3 = new Function1() { // from class: yd2.h
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i28) {
                                case 0:
                                    return AbstractC39469k.m126084V(function2, (String) obj);
                                case 1:
                                    return AbstractC39469k.m126085W(function2, obj);
                                case 2:
                                    return AbstractC39469k.m126086X(function2, (String) obj);
                                case 3:
                                    return AbstractC39469k.m126087Y(function2, (String) obj);
                                default:
                                    return AbstractC39469k.m126083U(function2, obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R3);
                }
                Function1 function9 = (Function1) objM87133R3;
                if (i16 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R4 = c28655q2.m87133R();
                if (z15) {
                    final int i29 = 3;
                    objM87133R4 = new Function1() { // from class: yd2.h
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i29) {
                                case 0:
                                    return AbstractC39469k.m126084V(function2, (String) obj);
                                case 1:
                                    return AbstractC39469k.m126085W(function2, obj);
                                case 2:
                                    return AbstractC39469k.m126086X(function2, (String) obj);
                                case 3:
                                    return AbstractC39469k.m126087Y(function2, (String) obj);
                                default:
                                    return AbstractC39469k.m126083U(function2, obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    final int i210 = 3;
                    objM87133R4 = new Function1() { // from class: yd2.h
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i210) {
                                case 0:
                                    return AbstractC39469k.m126084V(function2, (String) obj);
                                case 1:
                                    return AbstractC39469k.m126085W(function2, obj);
                                case 2:
                                    return AbstractC39469k.m126086X(function2, (String) obj);
                                case 3:
                                    return AbstractC39469k.m126087Y(function2, (String) obj);
                                default:
                                    return AbstractC39469k.m126083U(function2, obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R4);
                }
                Function1 function10 = (Function1) objM87133R4;
                if (i16 == 32) {
                }
                objM87133R5 = c28655q2.m87133R();
                if (z16) {
                    objM87133R5 = new C39465g(function2, 1);
                    c28655q2.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C39465g(function2, 1);
                    c28655q2.m87172p0(objM87133R5);
                }
                AbstractC39462d.m126033u(c38211gM122470h, zM122471i, function7, function8, function9, function10, (InterfaceC4339a) objM87133R5, c28655q2, 0);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
            }
            final int i34 = 4;
            function2 = function1;
            objM87133R7 = new Function1() { // from class: yd2.h
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i34) {
                        case 0:
                            return AbstractC39469k.m126084V(function2, (String) obj);
                        case 1:
                            return AbstractC39469k.m126085W(function2, obj);
                        case 2:
                            return AbstractC39469k.m126086X(function2, (String) obj);
                        case 3:
                            return AbstractC39469k.m126087Y(function2, (String) obj);
                        default:
                            return AbstractC39469k.m126083U(function2, obj);
                    }
                }
            };
            c28655q2.m87172p0(objM87133R7);
            c28676v1 = c28676v0;
            AbstractC25303l.m74291r(interfaceC25312uM122468f, null, null, (Function1) objM87133R7, c28655q2, 0, 6);
            c28655q2.m87173q(true);
            AbstractC18489d0.m53380u(4, f13, c2314t, c28655q2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, new LayoutWeightElement(1.0f, true)), f15, 0.0f, 2);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 0);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3396r4);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N4);
            C38211g c38211gM122470h2 = bVar.getShepherdHistoryViewState();
            boolean zM122471i2 = bVar.getIsLoadingMoreHistory();
            if (i16 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            objM87133R = c28655q2.m87133R();
            if (z4) {
                c28676v2 = c28676v1;
                if (objM87133R == c28676v2) {
                }
                Function1 function11 = (Function1) objM87133R;
                if (i16 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q2.m87133R();
                if (z13) {
                    final int i112 = 1;
                    objM87133R2 = new Function1() { // from class: yd2.h
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i112) {
                                case 0:
                                    return AbstractC39469k.m126084V(function2, (String) obj);
                                case 1:
                                    return AbstractC39469k.m126085W(function2, obj);
                                case 2:
                                    return AbstractC39469k.m126086X(function2, (String) obj);
                                case 3:
                                    return AbstractC39469k.m126087Y(function2, (String) obj);
                                default:
                                    return AbstractC39469k.m126083U(function2, obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    final int i113 = 1;
                    objM87133R2 = new Function1() { // from class: yd2.h
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i113) {
                                case 0:
                                    return AbstractC39469k.m126084V(function2, (String) obj);
                                case 1:
                                    return AbstractC39469k.m126085W(function2, obj);
                                case 2:
                                    return AbstractC39469k.m126086X(function2, (String) obj);
                                case 3:
                                    return AbstractC39469k.m126087Y(function2, (String) obj);
                                default:
                                    return AbstractC39469k.m126083U(function2, obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R2);
                }
                Function1 function12 = (Function1) objM87133R2;
                if (i16 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R3 = c28655q2.m87133R();
                if (z14) {
                    final int i211 = 2;
                    objM87133R3 = new Function1() { // from class: yd2.h
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i211) {
                                case 0:
                                    return AbstractC39469k.m126084V(function2, (String) obj);
                                case 1:
                                    return AbstractC39469k.m126085W(function2, obj);
                                case 2:
                                    return AbstractC39469k.m126086X(function2, (String) obj);
                                case 3:
                                    return AbstractC39469k.m126087Y(function2, (String) obj);
                                default:
                                    return AbstractC39469k.m126083U(function2, obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    final int i212 = 2;
                    objM87133R3 = new Function1() { // from class: yd2.h
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i212) {
                                case 0:
                                    return AbstractC39469k.m126084V(function2, (String) obj);
                                case 1:
                                    return AbstractC39469k.m126085W(function2, obj);
                                case 2:
                                    return AbstractC39469k.m126086X(function2, (String) obj);
                                case 3:
                                    return AbstractC39469k.m126087Y(function2, (String) obj);
                                default:
                                    return AbstractC39469k.m126083U(function2, obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R3);
                }
                Function1 function13 = (Function1) objM87133R3;
                if (i16 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R4 = c28655q2.m87133R();
                if (z15) {
                    final int i213 = 3;
                    objM87133R4 = new Function1() { // from class: yd2.h
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i213) {
                                case 0:
                                    return AbstractC39469k.m126084V(function2, (String) obj);
                                case 1:
                                    return AbstractC39469k.m126085W(function2, obj);
                                case 2:
                                    return AbstractC39469k.m126086X(function2, (String) obj);
                                case 3:
                                    return AbstractC39469k.m126087Y(function2, (String) obj);
                                default:
                                    return AbstractC39469k.m126083U(function2, obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    final int i214 = 3;
                    objM87133R4 = new Function1() { // from class: yd2.h
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i214) {
                                case 0:
                                    return AbstractC39469k.m126084V(function2, (String) obj);
                                case 1:
                                    return AbstractC39469k.m126085W(function2, obj);
                                case 2:
                                    return AbstractC39469k.m126086X(function2, (String) obj);
                                case 3:
                                    return AbstractC39469k.m126087Y(function2, (String) obj);
                                default:
                                    return AbstractC39469k.m126083U(function2, obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R4);
                }
                Function1 function14 = (Function1) objM87133R4;
                if (i16 == 32) {
                }
                objM87133R5 = c28655q2.m87133R();
                if (z16) {
                    objM87133R5 = new C39465g(function2, 1);
                    c28655q2.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C39465g(function2, 1);
                    c28655q2.m87172p0(objM87133R5);
                }
                AbstractC39462d.m126033u(c38211gM122470h2, zM122471i2, function11, function12, function13, function14, (InterfaceC4339a) objM87133R5, c28655q2, 0);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
            } else {
                c28676v2 = c28676v1;
            }
            final int i215 = 0;
            objM87133R = new Function1() { // from class: yd2.h
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i215) {
                        case 0:
                            return AbstractC39469k.m126084V(function2, (String) obj);
                        case 1:
                            return AbstractC39469k.m126085W(function2, obj);
                        case 2:
                            return AbstractC39469k.m126086X(function2, (String) obj);
                        case 3:
                            return AbstractC39469k.m126087Y(function2, (String) obj);
                        default:
                            return AbstractC39469k.m126083U(function2, obj);
                    }
                }
            };
            c28655q2.m87172p0(objM87133R);
            Function1 function15 = (Function1) objM87133R;
            if (i16 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R2 = c28655q2.m87133R();
            if (z13) {
                final int i114 = 1;
                objM87133R2 = new Function1() { // from class: yd2.h
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i114) {
                            case 0:
                                return AbstractC39469k.m126084V(function2, (String) obj);
                            case 1:
                                return AbstractC39469k.m126085W(function2, obj);
                            case 2:
                                return AbstractC39469k.m126086X(function2, (String) obj);
                            case 3:
                                return AbstractC39469k.m126087Y(function2, (String) obj);
                            default:
                                return AbstractC39469k.m126083U(function2, obj);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R2);
            } else {
                final int i115 = 1;
                objM87133R2 = new Function1() { // from class: yd2.h
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i115) {
                            case 0:
                                return AbstractC39469k.m126084V(function2, (String) obj);
                            case 1:
                                return AbstractC39469k.m126085W(function2, obj);
                            case 2:
                                return AbstractC39469k.m126086X(function2, (String) obj);
                            case 3:
                                return AbstractC39469k.m126087Y(function2, (String) obj);
                            default:
                                return AbstractC39469k.m126083U(function2, obj);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R2);
            }
            Function1 function16 = (Function1) objM87133R2;
            if (i16 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R3 = c28655q2.m87133R();
            if (z14) {
                final int i216 = 2;
                objM87133R3 = new Function1() { // from class: yd2.h
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i216) {
                            case 0:
                                return AbstractC39469k.m126084V(function2, (String) obj);
                            case 1:
                                return AbstractC39469k.m126085W(function2, obj);
                            case 2:
                                return AbstractC39469k.m126086X(function2, (String) obj);
                            case 3:
                                return AbstractC39469k.m126087Y(function2, (String) obj);
                            default:
                                return AbstractC39469k.m126083U(function2, obj);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R3);
            } else {
                final int i217 = 2;
                objM87133R3 = new Function1() { // from class: yd2.h
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i217) {
                            case 0:
                                return AbstractC39469k.m126084V(function2, (String) obj);
                            case 1:
                                return AbstractC39469k.m126085W(function2, obj);
                            case 2:
                                return AbstractC39469k.m126086X(function2, (String) obj);
                            case 3:
                                return AbstractC39469k.m126087Y(function2, (String) obj);
                            default:
                                return AbstractC39469k.m126083U(function2, obj);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R3);
            }
            Function1 function17 = (Function1) objM87133R3;
            if (i16 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            objM87133R4 = c28655q2.m87133R();
            if (z15) {
                final int i218 = 3;
                objM87133R4 = new Function1() { // from class: yd2.h
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i218) {
                            case 0:
                                return AbstractC39469k.m126084V(function2, (String) obj);
                            case 1:
                                return AbstractC39469k.m126085W(function2, obj);
                            case 2:
                                return AbstractC39469k.m126086X(function2, (String) obj);
                            case 3:
                                return AbstractC39469k.m126087Y(function2, (String) obj);
                            default:
                                return AbstractC39469k.m126083U(function2, obj);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R4);
            } else {
                final int i219 = 3;
                objM87133R4 = new Function1() { // from class: yd2.h
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i219) {
                            case 0:
                                return AbstractC39469k.m126084V(function2, (String) obj);
                            case 1:
                                return AbstractC39469k.m126085W(function2, obj);
                            case 2:
                                return AbstractC39469k.m126086X(function2, (String) obj);
                            case 3:
                                return AbstractC39469k.m126087Y(function2, (String) obj);
                            default:
                                return AbstractC39469k.m126083U(function2, obj);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R4);
            }
            Function1 function18 = (Function1) objM87133R4;
            if (i16 == 32) {
            }
            objM87133R5 = c28655q2.m87133R();
            if (z16) {
                objM87133R5 = new C39465g(function2, 1);
                c28655q2.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new C39465g(function2, 1);
                c28655q2.m87172p0(objM87133R5);
            }
            AbstractC39462d.m126033u(c38211gM122470h2, zM122471i2, function15, function16, function17, function18, (InterfaceC4339a) objM87133R5, c28655q2, 0);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            function2 = function1;
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39467i(bVar, function2, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m126082T(Function1 function1) {
        function1.invoke(InterfaceC38212h.d.f163731a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m126083U(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(InterfaceC38212h.k.f163739a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m126084V(Function1 function1, String nextToken) {
        AbstractC22676k.m65750j(nextToken, "nextToken");
        function1.invoke(new InterfaceC38212h.g(nextToken));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m126085W(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(InterfaceC38212h.e.f163732a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m126086X(Function1 function1, String date) {
        AbstractC22676k.m65750j(date, "date");
        function1.invoke(new InterfaceC38212h.j(date));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m126087Y(Function1 function1, String date) {
        AbstractC22676k.m65750j(date, "date");
        function1.invoke(new InterfaceC38212h.f(date));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m126088Z(Function1 function1) {
        function1.invoke(InterfaceC38212h.h.f163735a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m126090a0(InterfaceC38214j.b bVar, Function1 function1, int i13, Composer composer, int i14) {
        m126081S(bVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    private static final void m126113x(InterfaceC38214j.b bVar, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-172166275);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(bVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC29125c.m88520b(Boolean.valueOf(bVar.getShepherdClearHistoryDialogViewState() != null), null, null, "dialog", AbstractC37817c.m121344e(1023252126, c28655q, new C36538d(10, bVar, function1)), c28655q, 27648, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39467i(bVar, function1, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m126114y(InterfaceC38214j.b bVar, Function1 function1, boolean z4, Composer composer, int i13) {
        int i14;
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87155h(z4) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (!z4 || bVar.getShepherdClearHistoryDialogViewState() == null) {
            c28655q.m87150e0(-1972874652);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1973659789);
            C38206b c38206bM122469g = bVar.getShepherdClearHistoryDialogViewState();
            Object oVar = c38206bM122469g.getHistoryDate() != null ? new InterfaceC38212h.o(c38206bM122469g.getHistoryDate()) : InterfaceC38212h.n.f163741a;
            TextResource textResourceM122413b = c38206bM122469g.getPageTitle();
            TextResource textResourceM122416e = c38206bM122469g.getWarningMessage();
            TextResource textResourceM122414c = c38206bM122469g.getPrimaryButtonText();
            TextResource textResourceM122415d = c38206bM122469g.getSecondaryButtonText();
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C39465g(function1, 2);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87153g2 = c28655q.m87153g(function1) | c28655q.m87157i(oVar);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C37550r(function1, oVar, 22);
                c28655q.m87172p0(objM87133R2);
            }
            int i15 = TextResource.$stable;
            AbstractC21211n.m59497o(null, textResourceM122413b, textResourceM122416e, textResourceM122414c, false, null, null, null, null, textResourceM122415d, null, false, false, null, null, false, 0, null, null, null, false, null, interfaceC4339a, null, (InterfaceC4339a) objM87133R2, null, null, null, c28655q, (i15 << 3) | (i15 << 6) | (i15 << 9) | (i15 << 27), 384, 0, 247459313);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m126115z(Function1 function1) {
        function1.invoke(InterfaceC38212h.c.f163730a);
        return C23454a0.f92919a;
    }
}
