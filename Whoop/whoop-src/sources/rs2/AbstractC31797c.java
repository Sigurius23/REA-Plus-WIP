package rs2;

import android.app.Application;
import android.content.Context;
import androidx.compose.animation.AbstractC1089a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.InterfaceC1583f2;
import aq1.C1909c;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.navigation.C9598e;
import com.whoop.profile.view.C9812h;
import dp0.AbstractC12252h;
import dp0.InterfaceC12251g;
import eg2.C13175h;
import gb1.AbstractC15673b0;
import gy0.AbstractC16276e;
import i91.AbstractC18249c;
import java.util.List;
import jp1.C21859k;
import l83.C23454a0;
import ld1.AbstractC23864c;
import ld1.AbstractC23865d;
import ld1.C23863b;
import ls2.C24717b;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27256h;
import o01.AbstractC27348d;
import o72.C27640a;
import os0.C28308d;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p040c0.C3756l0;
import p040c0.InterfaceC3764o;
import p040c0.InterfaceC3770q;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p31.C28801l;
import p319m4.AbstractC25012a;
import p323m8.AbstractC25218a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p634y1.AbstractC39038k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import ps2.AbstractC29505a;
import ps2.AbstractC29507c;
import ps2.C29506b;
import q11.C29793c;
import q83.InterfaceC30057d;
import qk2.C30453i;
import r83.EnumC31071a;
import r90.C31095b;
import re1.C31314a;
import ri2.C31469a;
import rm2.C31604d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st2.C32995a;
import us2.C35220a;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: rs2.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001aE\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001aO\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u000eH\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a1\u0010\u001a\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001d\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010 ¨\u0006!²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lus2/a;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "n", "(Lus2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lps2/c;", "tileViewState", "Lp31/l;", "headerSection", "Lm91/u;", "errorTile", "Lkotlin/Function2;", "", "t", "(Lps2/c;Lp31/l;Lm91/u;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "", "carouselItems", "Lbc3/c0;", "scope", "Ldp0/g;", "globalCoachManager", "D", "(Lp31/l;Ljava/util/List;Lbc3/c0;Ldp0/g;Lc93/m;Landroidx/compose/runtime/Composer;I)V", "y", "(Lm91/u;Lp31/l;Lbc3/c0;Ldp0/g;Landroidx/compose/runtime/Composer;I)V", "B", "(Lp31/l;Landroidx/compose/runtime/Composer;I)V", "Lbc3/k1;", "G", "(Lbc3/c0;Ldp0/g;)Lbc3/k1;", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31797c {

    /* JADX INFO: renamed from: rs2.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.challengelanding.aiplans.view.AiPlansWrapperKt$AiPlansWrapper$2$1", m100430f = "AiPlansWrapper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f131697w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f131698x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C29506b f131699y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C35220a f131700z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC28601c1 interfaceC28601c1, C29506b c29506b, C35220a c35220a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f131698x = interfaceC28601c1;
            this.f131699y = c29506b;
            this.f131700z = c35220a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f131698x, this.f131699y, this.f131700z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f131697w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!((Boolean) this.f131698x.getValue()).booleanValue()) {
                this.f131699y.mo1216g(new AbstractC29505a.a(this.f131700z.getPath()));
                this.f131698x.setValue(Boolean.TRUE);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rs2.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.challengelanding.aiplans.view.AiPlansWrapperKt$showCoachEverywhereBottomSheet$1", m100430f = "AiPlansWrapper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f131701w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC12251g f131702x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC12251g interfaceC12251g, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f131702x = interfaceC12251g;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f131702x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f131701w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC12251g.m34132f(this.f131702x, 0L, null, null, 7, null);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m98759A(InterfaceC25312u interfaceC25312u, C28801l c28801l, InterfaceC2994c0 interfaceC2994c0, InterfaceC12251g interfaceC12251g, int i13, Composer composer, int i14) {
        m98790y(interfaceC25312u, c28801l, interfaceC2994c0, interfaceC12251g, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    public static final void m98760B(C28801l headerSection, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(headerSection, "headerSection");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1290025927);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(headerSection) : c28655q.m87157i(headerSection) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float f13 = 8;
            float f14 = 2 * f13;
            C2314t c2314t = C2314t.f9131w;
            float f15 = 3;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2), 0.0f, 0.0f, 0.0f, f15 * f13, 7);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
            AbstractC25303l.m74291r(headerSection, null, null, null, c28655q, (i14 & 14) | C28801l.f116582c, 14);
            float f16 = 4;
            float f17 = f15 * f16;
            Modifier modifierM52566d = AbstractC18249c.m52566d(AbstractC1102d.m3411h(70 * f16, AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f17, 0.0f, 0.0f, 13)), AbstractC18249c.m52570h(AbstractC15673b0.m43972A()), AbstractC33253j.m105489e(f17), Float.valueOf(0.1f));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM52566d);
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
            Modifier modifierM3394p = AbstractC1099a.m3394p(f14, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            AbstractC27348d.m82519c(null, c28655q, 0, 1);
            AbstractC35684p.m113047h(AbstractC1102d.m3419p(6 * f16, AbstractC1099a.m3398t(c2314t, 1 * f13, 0.0f, 0.0f, 0.0f, 14)), InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62212f)), false, 0.0f, Integer.MAX_VALUE, null, null, null, null, c28655q, 24582, 492);
            AbstractC25012a.m73392y(c28655q, true, true, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28308d(headerSection, i13, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m98761C(C28801l c28801l, int i13, Composer composer, int i14) {
        m98760B(c28801l, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    private static final void m98762D(C28801l c28801l, List<? extends InterfaceC25312u> list, InterfaceC2994c0 interfaceC2994c0, InterfaceC12251g interfaceC12251g, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1590295190);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c28801l) : c28655q.m87157i(c28801l) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(list) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC2994c0) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(interfaceC12251g) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(interfaceC4351m) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(interfaceC12251g) | ((57344 & i14) == 16384);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C21859k(interfaceC2994c0, interfaceC12251g, interfaceC4351m, 20);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC31795a.m98741l(c28801l, list, (InterfaceC4351m) objM87133R, c28655q, (i14 & 112) | C28801l.f116582c | (i14 & 14));
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1909c(c28801l, list, interfaceC2994c0, interfaceC12251g, interfaceC4351m, i13, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m98763E(InterfaceC2994c0 interfaceC2994c0, InterfaceC12251g interfaceC12251g, InterfaceC4351m interfaceC4351m, Object event, int i13) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof C27256h) {
            m98765G(interfaceC2994c0, interfaceC12251g);
        } else {
            interfaceC4351m.invoke(event, Integer.valueOf(i13));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m98764F(C28801l c28801l, List list, InterfaceC2994c0 interfaceC2994c0, InterfaceC12251g interfaceC12251g, InterfaceC4351m interfaceC4351m, int i13, Composer composer, int i14) {
        m98762D(c28801l, list, interfaceC2994c0, interfaceC12251g, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    public static final InterfaceC3027k1 m98765G(InterfaceC2994c0 scope, InterfaceC12251g globalCoachManager) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(globalCoachManager, "globalCoachManager");
        return AbstractC3006f0.m8732z(scope, null, null, new b(globalCoachManager, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX WARN: Code duplicated, block: B:38:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:50:0x0109  */
    /* JADX WARN: Code duplicated, block: B:52:0x0118  */
    /* JADX WARN: Code duplicated, block: B:55:0x0128  */
    /* JADX WARN: Code duplicated, block: B:57:0x0141  */
    /* JADX WARN: Code duplicated, block: B:58:0x0145  */
    /* JADX WARN: Code duplicated, block: B:62:0x0158  */
    /* JADX WARN: Code duplicated, block: B:66:0x0194  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:80:0x0202  */
    /* JADX WARN: Code duplicated, block: B:83:0x020b  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    public static final void m98779n(C35220a viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function3;
        AbstractC29507c.b bVar;
        InterfaceC1583f2 interfaceC1583f2M30452f;
        Context applicationContext;
        Application application;
        boolean zM87153g;
        Object objM87133R;
        AbstractC23864c abstractC23864c;
        C29506b c29506b;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c1;
        boolean zM87153g2;
        Object objM87133R3;
        boolean z13;
        Object objM87133R4;
        InterfaceC1583f2 interfaceC1583f2M73844a;
        Application application2;
        boolean zM87153g3;
        Object objM87133R5;
        Object obj;
        Object obj2;
        boolean zM87153g4;
        Object objM87133R6;
        Object objM87133R7;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1404489897);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C31604d(16);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function3 = (Function1) objM87133R7;
                } else {
                    function3 = function2;
                }
                bVar = AbstractC29507c.b.f120032a;
                c28655q.m87150e0(1371609227);
                if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g || objM87133R == c28676v0) {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, bVar, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29506b.class), null, null);
                        c28655q.m87172p0(objM87133R);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R;
                } else {
                    c28655q.m87150e0(-707976188);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a == null) {
                        c28655q.m87150e0(-707931115);
                        c28655q.m87173q(false);
                        abstractC23864c = null;
                        obj2 = null;
                        obj = null;
                    } else {
                        c28655q.m87150e0(-707931114);
                        Context applicationContext2 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        AbstractC22676k.m65748h(applicationContext2, "null cannot be cast to non-null type android.app.Application");
                        application2 = (Application) applicationContext2;
                        zM87153g3 = c28655q.m87153g(null) | c28655q.m87153g(null);
                        objM87133R5 = c28655q.m87133R();
                        if (!zM87153g3 || objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29506b.class), null, new C23863b(bVar), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            obj2 = null;
                            obj = null;
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R5;
                        c28655q.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q.m87150e0(-707430526);
                        zM87153g4 = c28655q.m87153g(obj2) | c28655q.m87153g(obj);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87153g4 || objM87133R6 == c28676v0) {
                            objM87133R6 = new C23863b(bVar);
                            c28655q.m87172p0(objM87133R6);
                        }
                        abstractC23864c = (C23863b) objM87133R6;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-438479417);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
                AbstractC22676k.m65748h(abstractC23864c, "null cannot be cast to non-null type com.whoop.weeklyplan.challengelanding.aiplans.presentation.AiPlansViewModel");
                c29506b = (C29506b) abstractC23864c;
                InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(c29506b.getViewState(), bVar, null, c28655q, 48, 2);
                Object[] objArr = {viewState.getPath()};
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C31469a(22);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R2, c28655q, 48);
                String strM111589c = viewState.getPath();
                zM87153g2 = c28655q.m87153g(interfaceC28601c1) | c28655q.m87157i(c29506b) | c28655q.m87157i(viewState);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g2 || objM87133R3 == c28676v0) {
                    objM87133R3 = new a(interfaceC28601c1, c29506b, viewState, null);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, strM111589c);
                AbstractC29507c abstractC29507cM98781p = m98781p(interfaceC28601c1M87260n);
                C28801l c28801lM111588b = viewState.getHeaderSection();
                InterfaceC25312u interfaceC25312uM111587a = viewState.getErrorState();
                z13 = (i15 & 112) == 32;
                objM87133R4 = c28655q.m87133R();
                if (z13 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C9812h(function3, 8);
                    c28655q.m87172p0(objM87133R4);
                }
                m98785t(abstractC29507cM98781p, c28801lM111588b, interfaceC25312uM111587a, (InterfaceC4351m) objM87133R4, c28655q, C28801l.f116582c << 3, 0);
                c28655q = c28655q;
                function2 = function3;
            } else {
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30453i(viewState, i13, function2, i14, 8);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C31604d(16);
                    c28655q.m87172p0(objM87133R7);
                }
                function3 = (Function1) objM87133R7;
            } else {
                function3 = function2;
            }
            bVar = AbstractC29507c.b.f120032a;
            c28655q.m87150e0(1371609227);
            if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                c28655q.m87150e0(-707976188);
                interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                if (interfaceC1583f2M73844a == null) {
                    c28655q.m87150e0(-707931115);
                    c28655q.m87173q(false);
                    abstractC23864c = null;
                    obj2 = null;
                    obj = null;
                } else {
                    c28655q.m87150e0(-707931114);
                    Context applicationContext3 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    AbstractC22676k.m65748h(applicationContext3, "null cannot be cast to non-null type android.app.Application");
                    application2 = (Application) applicationContext3;
                    zM87153g3 = c28655q.m87153g(null) | c28655q.m87153g(null);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R5 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29506b.class), null, new C23863b(bVar), null);
                        obj = null;
                        obj2 = null;
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29506b.class), null, new C23863b(bVar), null);
                        obj = null;
                        obj2 = null;
                        c28655q.m87172p0(objM87133R5);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R5;
                    c28655q.m87173q(false);
                }
                if (abstractC23864c == null) {
                    c28655q.m87150e0(-707430526);
                    zM87153g4 = c28655q.m87153g(obj2) | c28655q.m87153g(obj);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87153g4) {
                        objM87133R6 = new C23863b(bVar);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C23863b(bVar);
                        c28655q.m87172p0(objM87133R6);
                    }
                    abstractC23864c = (C23863b) objM87133R6;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-438479417);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            } else {
                interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                } else {
                    application = null;
                }
                zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
                objM87133R = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, bVar, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29506b.class), null, null);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, bVar, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29506b.class), null, null);
                    c28655q.m87172p0(objM87133R);
                }
                abstractC23864c = (AbstractC23864c) objM87133R;
            }
            c28655q.m87173q(false);
            AbstractC22676k.m65748h(abstractC23864c, "null cannot be cast to non-null type com.whoop.weeklyplan.challengelanding.aiplans.presentation.AiPlansViewModel");
            c29506b = (C29506b) abstractC23864c;
            InterfaceC28601c1 interfaceC28601c1M87260n2 = AbstractC28683x.m87260n(c29506b.getViewState(), bVar, null, c28655q, 48, 2);
            Object[] objArr2 = {viewState.getPath()};
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C31469a(22);
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr2, (InterfaceC4339a) objM87133R2, c28655q, 48);
            String strM111589c2 = viewState.getPath();
            zM87153g2 = c28655q.m87153g(interfaceC28601c1) | c28655q.m87157i(c29506b) | c28655q.m87157i(viewState);
            objM87133R3 = c28655q.m87133R();
            if (zM87153g2) {
                objM87133R3 = new a(interfaceC28601c1, c29506b, viewState, null);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new a(interfaceC28601c1, c29506b, viewState, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, strM111589c2);
            AbstractC29507c abstractC29507cM98781p2 = m98781p(interfaceC28601c1M87260n2);
            C28801l c28801lM111588b2 = viewState.getHeaderSection();
            InterfaceC25312u interfaceC25312uM111587a2 = viewState.getErrorState();
            if ((i15 & 112) == 32) {
            }
            objM87133R4 = c28655q.m87133R();
            if (z13) {
                objM87133R4 = new C9812h(function3, 8);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C9812h(function3, 8);
                c28655q.m87172p0(objM87133R4);
            }
            m98785t(abstractC29507cM98781p2, c28801lM111588b2, interfaceC25312uM111587a2, (InterfaceC4351m) objM87133R4, c28655q, C28801l.f116582c << 3, 0);
            c28655q = c28655q;
            function2 = function3;
        } else {
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30453i(viewState, i13, function2, i14, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m98780o(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final AbstractC29507c m98781p(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC29507c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final InterfaceC28601c1 m98782q() {
        return AbstractC28683x.m87272z(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m98783r(Function1 function1, Object event, int i13) {
        AbstractC22676k.m65750j(event, "event");
        C9598e c9598eM104221a = C32995a.f137390a.m104221a(event, C24717b.INSTANCE.m72378a(i13), "ai_suggested_plan");
        if (c9598eM104221a != null) {
            event = c9598eM104221a;
        }
        function1.invoke(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m98784s(C35220a c35220a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m98779n(c35220a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:62:0x010f  */
    /* JADX WARN: Code duplicated, block: B:65:0x011d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0151  */
    /* JADX WARN: Code duplicated, block: B:70:0x015c  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: t */
    public static final void m98785t(AbstractC29507c tileViewState, C28801l headerSection, InterfaceC25312u interfaceC25312u, InterfaceC4351m interfaceC4351m, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4351m interfaceC4351m2;
        int i16;
        boolean z4;
        C28655q c28655q;
        InterfaceC4351m interfaceC4351m3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(tileViewState, "tileViewState");
        AbstractC22676k.m65750j(headerSection, "headerSection");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(313743908);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(tileViewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(headerSection) : c28655q2.m87157i(headerSection) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(interfaceC25312u) ? 256 : 128;
        }
        int i17 = i14 & 8;
        if (i17 == 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4351m2 = interfaceC4351m;
                i15 |= c28655q2.m87157i(interfaceC4351m2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i15;
            if ((i16 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C31314a(9);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4351m2 = (InterfaceC4351m) objM87133R3;
                }
                InterfaceC12251g interfaceC12251g = (InterfaceC12251g) c28655q2.m87161k(AbstractC12252h.m34153c());
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R);
                }
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 2 * 8, 0.0f, 0.0f, 13);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C31604d(17);
                    c28655q2.m87172p0(objM87133R2);
                }
                c28655q = c28655q2;
                AbstractC1089a.m3344b(tileViewState, null, (Function1) objM87133R2, null, null, null, AbstractC37817c.m121344e(770542395, c28655q2, new C13175h(headerSection, interfaceC2994c0, interfaceC12251g, interfaceC4351m2, interfaceC25312u, 1)), c28655q, (i16 & 14) | 1573248, 58);
                c28655q.m87173q(true);
                interfaceC4351m3 = interfaceC4351m2;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4351m3 = interfaceC4351m2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C27640a(tileViewState, headerSection, interfaceC25312u, interfaceC4351m3, i13, i14, 23);
            }
        }
        i15 |= 3072;
        interfaceC4351m2 = interfaceC4351m;
        i16 = i15;
        if ((i16 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i16 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C31314a(9);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC4351m2 = (InterfaceC4351m) objM87133R3;
            }
            InterfaceC12251g interfaceC12251g2 = (InterfaceC12251g) c28655q2.m87161k(AbstractC12252h.m34153c());
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q2);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC2994c0 interfaceC2994c1 = (InterfaceC2994c0) objM87133R;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 2 * 8, 0.0f, 0.0f, 13);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3398t2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C31604d(17);
                c28655q2.m87172p0(objM87133R2);
            }
            c28655q = c28655q2;
            AbstractC1089a.m3344b(tileViewState, null, (Function1) objM87133R2, null, null, null, AbstractC37817c.m121344e(770542395, c28655q2, new C13175h(headerSection, interfaceC2994c1, interfaceC12251g2, interfaceC4351m2, interfaceC25312u, 1)), c28655q, (i16 & 14) | 1573248, 58);
            c28655q.m87173q(true);
            interfaceC4351m3 = interfaceC4351m2;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC4351m3 = interfaceC4351m2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27640a(tileViewState, headerSection, interfaceC25312u, interfaceC4351m3, i13, i14, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m98786u(Object obj, int i13) {
        AbstractC22676k.m65750j(obj, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C3756l0 m98787v(InterfaceC3770q AnimatedContent) {
        AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
        return AbstractC1089a.m3345c(AbstractC3788w0.m11577e(null, 3), AbstractC3788w0.m11578f(null, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x003d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0041  */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m98788w(C28801l c28801l, InterfaceC2994c0 interfaceC2994c0, InterfaceC12251g interfaceC12251g, InterfaceC4351m interfaceC4351m, InterfaceC25312u interfaceC25312u, InterfaceC3764o AnimatedContent, AbstractC29507c state, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
        AbstractC22676k.m65750j(state, "state");
        if (state instanceof AbstractC29507c.c) {
            AbstractC29507c.c cVar = (AbstractC29507c.c) state;
            if (!cVar.m90156a().isEmpty()) {
                C28655q c28655q = (C28655q) composer;
                c28655q.m87150e0(1756870574);
                m98762D(c28801l, cVar.m90156a(), interfaceC2994c0, interfaceC12251g, interfaceC4351m, c28655q, C28801l.f116582c);
                c28655q.m87173q(false);
            } else if (state instanceof AbstractC29507c.b) {
                C28655q c28655q2 = (C28655q) composer;
                c28655q2.m87150e0(1756874897);
                m98760B(c28801l, c28655q2, C28801l.f116582c);
                c28655q2.m87173q(false);
            } else {
                C28655q c28655q3 = (C28655q) composer;
                c28655q3.m87150e0(1756876437);
                m98790y(interfaceC25312u, c28801l, interfaceC2994c0, interfaceC12251g, c28655q3, C28801l.f116582c << 3);
                c28655q3.m87173q(false);
            }
        } else if (state instanceof AbstractC29507c.b) {
            C28655q c28655q4 = (C28655q) composer;
            c28655q4.m87150e0(1756874897);
            m98760B(c28801l, c28655q4, C28801l.f116582c);
            c28655q4.m87173q(false);
        } else {
            C28655q c28655q5 = (C28655q) composer;
            c28655q5.m87150e0(1756876437);
            m98790y(interfaceC25312u, c28801l, interfaceC2994c0, interfaceC12251g, c28655q5, C28801l.f116582c << 3);
            c28655q5.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m98789x(AbstractC29507c abstractC29507c, C28801l c28801l, InterfaceC25312u interfaceC25312u, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m98785t(abstractC29507c, c28801l, interfaceC25312u, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    private static final void m98790y(InterfaceC25312u interfaceC25312u, C28801l c28801l, InterfaceC2994c0 interfaceC2994c0, InterfaceC12251g interfaceC12251g, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-2013595464);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(interfaceC25312u) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q2.m87153g(c28801l) : c28655q2.m87157i(c28801l) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(interfaceC2994c0) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(interfaceC12251g) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (!c28655q2.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            c28655q = c28655q2;
            c28655q.m87138X();
        } else if (interfaceC25312u == null) {
            c28655q2.m87150e0(785947223);
            c28655q2.m87173q(false);
            c28655q = c28655q2;
        } else {
            c28655q2.m87150e0(785947224);
            float f13 = 2 * 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            AbstractC25303l.m74291r(c28801l, null, null, null, c28655q2, C28801l.f116582c | ((i14 >> 3) & 14), 14);
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 3 * 4, 0.0f, f13, 5);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            boolean zM87157i = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(interfaceC12251g);
            Object objM87133R = c28655q2.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C29793c(21, interfaceC2994c0, interfaceC12251g);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R, c28655q2, 0, 6);
            c28655q = c28655q2;
            AbstractC25012a.m73392y(c28655q, true, true, false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31095b(interfaceC25312u, c28801l, interfaceC2994c0, interfaceC12251g, i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m98791z(InterfaceC2994c0 interfaceC2994c0, InterfaceC12251g interfaceC12251g, Object it) {
        AbstractC22676k.m65750j(it, "it");
        m98765G(interfaceC2994c0, interfaceC12251g);
        return C23454a0.f92919a;
    }
}
