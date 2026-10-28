package yw1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import bm0.C3413p;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import iz0.AbstractC21048g;
import iz0.C21053l;
import iz0.C21054m;
import j11.AbstractC21211n;
import j11.EnumC21213p;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C23010x;
import p294l3.C23285v0;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import te0.AbstractC33745d;
import uw1.C35311d;
import w20.C36727q;
import wb3.AbstractC37056f;
import ww1.C37668n;
import ww1.InterfaceC37657c;
import x81.C38072d;

/* JADX INFO: renamed from: yw1.o */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Luw1/d;", "viewState", "Lkotlin/Function1;", "Lww1/c;", "Ll83/a0;", "onEvent", "i", "(Luw1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "description", "Lkd1/o;", "image", "g", "(Ljava/lang/String;Lkd1/o;Landroidx/compose/runtime/Composer;I)V", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39828o {

    /* JADX INFO: renamed from: yw1.o$a */
    @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.view.screens.FamilyPlanInvitePopUpDialogKt$FamilyPlanInvitePopUpDialog$1$1$1$1", m100430f = "FamilyPlanInvitePopUpDialog.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171644w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f171645x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f171645x = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f171645x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f171644w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f171645x.invoke(C37668n.f161417a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: g */
    private static final void m127762g(String str, AbstractC22403o abstractC22403o, Composer composer, int i13) {
        int i14;
        AbstractC22403o abstractC22403o2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-7449117);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(abstractC22403o) : c28655q.m87157i(abstractC22403o) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C22961h c22961h = AbstractC22977m.f90654e;
            C2305k c2305k = C2299e.f9111N;
            C2314t c2314t = C2314t.f9131w;
            float f13 = 2;
            float f14 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13 * f14, AbstractC1102d.m3409f(1.0f, c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22961h, c2305k, c28655q, 54);
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
            float f15 = 100;
            if (abstractC22403o == null) {
                c28655q.m87150e0(-94677716);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-94677715);
                Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3419p(f15, c2314t), AbstractC33253j.m105489e(f15 / f13));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM118994r);
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
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, AbstractC22403o.f87638a | ((i15 >> 3) & 14), 3), null, AbstractC1102d.m3407d(1.0f, c2314t), null, C39102j.f168199a, 0.0f, null, c28655q, 25008, 104);
                c28655q = c28655q;
                c28655q.m87173q(true);
                float f16 = 4;
                AbstractC25012a.m73388u(f16, f16, c2314t, c28655q, false);
            }
            C21053l c21053l = C21053l.f79834a;
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            C28655q c28655q2 = c28655q;
            abstractC22403o2 = abstractC22403o;
            AbstractC21048g.m58807M(str, null, true, c21053l.m58880a(C23285v0.m67364b(AbstractC33745d.m106661t(c38072d, c28655q, i16), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d.m121949b(c28655q, i16).getWhite70(), 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 1 * f14, c28655q2, 0, (C21053l.f79835b << 15) | 24576, 16380), null, 0, 0, 0, false, c28655q2, (i15 & 14) | 384 | (C21054m.f79836p << 9), 498);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            abstractC22403o2 = abstractC22403o;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3413p(str, abstractC22403o2, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m127763h(String str, AbstractC22403o abstractC22403o, int i13, Composer composer, int i14) {
        m127762g(str, abstractC22403o, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    public static final void m127764i(C35311d viewState, Function1 onEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(992678412);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C35311d.a aVarM112128b = viewState.getPopUpDialog();
            AbstractC29125c.m88520b(Boolean.valueOf(aVarM112128b != null), null, null, "", AbstractC37817c.m121344e(260298699, c28655q, new C39818e((Object) aVarM112128b, onEvent, (Object) viewState, 2)), c28655q, 27648, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39825l(viewState, onEvent, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m127765j(C35311d.a aVar, final Function1 function1, final C35311d c35311d, boolean z4, Composer composer, int i13) {
        int i14;
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87155h(z4) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i14 & 1, (i14 & 19) != 18);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        if (!z4 || aVar == null) {
            c28655q.m87150e0(2143707479);
            c28655q.m87173q(false);
            return c23454a0;
        }
        c28655q.m87150e0(2142671521);
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = new a(function1, null);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a0);
        TextResource textResourceM112138i = aVar.getTitle();
        TextResource textResourceM112135f = aVar.getPrimaryActionText();
        InterfaceC39332e interfaceC39332eM112134e = aVar.getPrimaryActionColor();
        if (interfaceC39332eM112134e == null) {
            interfaceC39332eM112134e = EnumC39333f.BRAND_WHITE;
        }
        InterfaceC39332e interfaceC39332e = interfaceC39332eM112134e;
        TextResource textResourceM112136g = aVar.getSecondaryActionText();
        boolean zM112137h = aVar.getShowCloseIcon();
        EnumC21213p enumC21213pM112139j = aVar.getTopDialogStyle();
        boolean zM112140k = aVar.getUseSolidButtons();
        boolean zM87157i = c28655q.m87157i(c35311d) | c28655q.m87153g(function1);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i || objM87133R2 == c28676v0) {
            final int i15 = 0;
            objM87133R2 = new InterfaceC4339a() { // from class: yw1.n
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i15) {
                        case 0:
                            return AbstractC39828o.m127766k(c35311d, function1);
                        default:
                            return AbstractC39828o.m127767l(c35311d, function1);
                    }
                }
            };
            c28655q.m87172p0(objM87133R2);
        }
        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
        boolean zM87157i2 = c28655q.m87157i(c35311d) | c28655q.m87153g(function1);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i2 || objM87133R3 == c28676v0) {
            final int i16 = 1;
            objM87133R3 = new InterfaceC4339a() { // from class: yw1.n
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i16) {
                        case 0:
                            return AbstractC39828o.m127766k(c35311d, function1);
                        default:
                            return AbstractC39828o.m127767l(c35311d, function1);
                    }
                }
            };
            c28655q.m87172p0(objM87133R3);
        }
        C37816b c37816bM121344e = AbstractC37817c.m121344e(950787401, c28655q, new C36727q(aVar, 20));
        int i17 = TextResource.$stable;
        AbstractC21211n.m59497o(null, textResourceM112138i, null, textResourceM112135f, zM112140k, interfaceC39332e, null, null, null, textResourceM112136g, null, false, zM112137h, enumC21213pM112139j, null, false, 0, null, null, null, false, null, interfaceC4339a, null, (InterfaceC4339a) objM87133R3, null, null, c37816bM121344e, c28655q, (i17 << 3) | 384 | (i17 << 9) | (i17 << 27), 0, 12582912, 113233345);
        c28655q.m87173q(false);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m127766k(C35311d c35311d, Function1 function1) {
        InterfaceC37657c interfaceC37657cM112132c = c35311d.getPopUpDialog().getDismissEvent();
        if (interfaceC37657cM112132c != null) {
            function1.invoke(interfaceC37657cM112132c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m127767l(C35311d c35311d, Function1 function1) {
        InterfaceC37657c interfaceC37657cM112130a = c35311d.getPopUpDialog().getApproveEvent();
        if (interfaceC37657cM112130a != null) {
            function1.invoke(interfaceC37657cM112130a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m127768m(C35311d.a aVar, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            m127762g(aVar.getDescription(), aVar.getImage(), c28655q, AbstractC22403o.f87638a << 3);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m127769n(C35311d c35311d, Function1 function1, int i13, Composer composer, int i14) {
        m127764i(c35311d, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
