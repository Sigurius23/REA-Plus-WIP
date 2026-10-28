package com.whoop.membership.familyPlan.navigation;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.membership.familyPlan.navigation.AbstractC9113a;
import e93.AbstractC12889b;
import hg3.AbstractC17269i;
import j81.C21421e;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p040c0.InterfaceC3764o;
import p114eb.C12982q;
import p114eb.C12987s0;
import p114eb.C12991u0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import s90.C32290f;
import uw1.C35313f;
import uw1.C35314g;
import ww1.InterfaceC37658d;
import ww1.InterfaceC37661g;
import yw1.AbstractC39822i;
import yw1.AbstractC39826m;

/* JADX INFO: renamed from: com.whoop.membership.familyPlan.navigation.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002"}, m65681d2 = {"Luw1/f;", "viewModel", "Leb/u0;", "navController", "Landroidx/lifecycle/g0;", "viewLifecycleOwner", "Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination;", "startDestination", "Lkotlin/Function1;", "Lww1/c;", "Ll83/a0;", "onEvent", "e", "(Luw1/f;Leb/u0;Landroidx/lifecycle/g0;Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Luw1/g;", "viewState", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC9113a {

    /* JADX INFO: renamed from: com.whoop.membership.familyPlan.navigation.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.navigation.FamilyPlanNavHostKt$FamilyPlanNavHost$1$1$1$1$1", m100430f = "FamilyPlanNavHost.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f27237w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f27238x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f27238x = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f27238x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f27237w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f27238x.invoke(InterfaceC37658d.b.f161393a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.familyPlan.navigation.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.membership.familyPlan.navigation.FamilyPlanNavHostKt$FamilyPlanNavHost$1$1$2$1$1", m100430f = "FamilyPlanNavHost.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f27239w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f27240x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f27241y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, boolean z4, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f27240x = function1;
            this.f27241y = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f27240x, this.f27241y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f27239w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f27240x.invoke(new InterfaceC37661g.c(this.f27241y));
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static final void m22740e(C35313f viewModel, C12991u0 navController, InterfaceC1585g0 viewLifecycleOwner, FamilyPlanNavHostDestination familyPlanNavHostDestination, Function1 onEvent, Composer composer, int i13, int i14) {
        int i15;
        FamilyPlanNavHostDestination familyPlanNavHostDestination2;
        FamilyPlanNavHostDestination familyPlanNavHostDestination3;
        int i16;
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(viewLifecycleOwner, "viewLifecycleOwner");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1760350715);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewModel) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(navController) ? 32 : 16;
        }
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                familyPlanNavHostDestination2 = familyPlanNavHostDestination;
                if (c28655q.m87157i(familyPlanNavHostDestination2)) {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i16;
            } else {
                familyPlanNavHostDestination2 = familyPlanNavHostDestination;
            }
            i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i16;
        } else {
            familyPlanNavHostDestination2 = familyPlanNavHostDestination;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(onEvent) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 9235) != 9234)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0 && !c28655q.m87118C()) {
                c28655q.m87138X();
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                }
            } else if ((i14 & 8) != 0) {
                familyPlanNavHostDestination2 = FamilyPlanNavHostDestination.C9111a.f27233a;
                i15 &= -7169;
            }
            FamilyPlanNavHostDestination familyPlanNavHostDestination4 = familyPlanNavHostDestination2;
            c28655q.m87175r();
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(viewModel.getViewState(), new C35314g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), null, c28655q, 0, 2);
            int i17 = i15;
            String baseRoute$membership_release = familyPlanNavHostDestination4.getBaseRoute();
            boolean zM87157i = c28655q.m87157i(viewModel) | ((57344 & i17) == 16384) | c28655q.m87153g(interfaceC28601c1M87260n);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C32290f((Object) viewModel, onEvent, (Object) interfaceC28601c1M87260n, 12);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC17269i.m48886d(navController, baseRoute$membership_release, null, null, null, null, null, null, null, (Function1) objM87133R, c28655q, (i17 >> 3) & 14, 1020);
            c28655q = c28655q;
            familyPlanNavHostDestination3 = familyPlanNavHostDestination4;
        } else {
            c28655q.m87138X();
            familyPlanNavHostDestination3 = familyPlanNavHostDestination2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21421e(viewModel, navController, viewLifecycleOwner, familyPlanNavHostDestination3, onEvent, i13, i14, 24);
        }
    }

    /* JADX INFO: renamed from: f */
    private static final C35314g m22741f(InterfaceC28670t2 interfaceC28670t2) {
        return (C35314g) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m22742g(final C35313f c35313f, final Function1 function1, final InterfaceC28670t2 interfaceC28670t2, C12987s0 NavHost) {
        AbstractC22676k.m65750j(NavHost, "$this$NavHost");
        final int i13 = 0;
        AbstractC12889b.m36290t(NavHost, FamilyPlanNavHostDestination.C9111a.f27233a.getBaseRoute(), null, null, null, null, null, new C37816b(new InterfaceC4352n() { // from class: tw1.b
            @Override // c93.InterfaceC4352n
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                switch (i13) {
                    case 0:
                        int iIntValue = ((Integer) obj4).intValue();
                        return AbstractC9113a.m22743h(c35313f, function1, interfaceC28670t2, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue);
                    default:
                        int iIntValue2 = ((Integer) obj4).intValue();
                        return AbstractC9113a.m22744i(c35313f, function1, interfaceC28670t2, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue2);
                }
            }
        }, true, 418191208), 254);
        FamilyPlanNavHostDestination.C9112b c9112b = FamilyPlanNavHostDestination.C9112b.f27235a;
        final int i14 = 1;
        AbstractC12889b.m36290t(NavHost, c9112b.getRoute(), c9112b.getArgs(), null, null, null, null, new C37816b(new InterfaceC4352n() { // from class: tw1.b
            @Override // c93.InterfaceC4352n
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                switch (i14) {
                    case 0:
                        int iIntValue = ((Integer) obj4).intValue();
                        return AbstractC9113a.m22743h(c35313f, function1, interfaceC28670t2, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue);
                    default:
                        int iIntValue2 = ((Integer) obj4).intValue();
                        return AbstractC9113a.m22744i(c35313f, function1, interfaceC28670t2, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue2);
                }
            }
        }, true, -1642668513), 252);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m22743h(C35313f c35313f, Function1 function1, InterfaceC28670t2 interfaceC28670t2, InterfaceC3764o composable, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new a(function1, null);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c35313f);
        AbstractC39822i.m127682G(m22741f(interfaceC28670t2).getFamilyPlanScreenViewState(), function1, c28655q, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m22744i(C35313f c35313f, Function1 function1, InterfaceC28670t2 interfaceC28670t2, InterfaceC3764o composable, C12982q backStackEntry, Composer composer, int i13) {
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(backStackEntry, "backStackEntry");
        Bundle bundleM36479a = backStackEntry.m36479a();
        boolean z4 = bundleM36479a != null ? bundleM36479a.getBoolean("isNewMember") : false;
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87155h(z4);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new b(function1, z4, null);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c35313f);
        AbstractC39826m.m127747m(m22741f(interfaceC28670t2).getFamilyPlanInviteScreenViewState(), function1, c28655q, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m22745j(C35313f c35313f, C12991u0 c12991u0, InterfaceC1585g0 interfaceC1585g0, FamilyPlanNavHostDestination familyPlanNavHostDestination, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m22740e(c35313f, c12991u0, interfaceC1585g0, familyPlanNavHostDestination, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
