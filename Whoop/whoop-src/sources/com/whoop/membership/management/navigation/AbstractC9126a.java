package com.whoop.membership.management.navigation;

import ad3.AbstractC0757c;
import ad3.C0755b;
import am2.C1040r;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.InterfaceC1577e0;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.profileinstaller.ProfileVerifier;
import bb2.C2931g;
import bc3.InterfaceC2994c0;
import bm0.C3403f;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import com.whoop.membership.management.navigation.AbstractC9126a;
import com.whoop.payments.domain.models.Card;
import e93.AbstractC12889b;
import fc0.C14359c;
import g90.C15598d;
import g90.C15599e;
import hg3.AbstractC17269i;
import j93.InterfaceC21461d;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jx1.AbstractC22009c0;
import jx1.AbstractC22022l;
import jx1.C22011d0;
import jx1.C22013e0;
import l83.C23454a0;
import l83.C23465k;
import lx1.C24795f;
import lx1.InterfaceC24790a;
import lx1.InterfaceC24791b;
import lx1.InterfaceC24792c;
import lx1.InterfaceC24793d;
import m83.AbstractC25247g0;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import nx1.AbstractC27220b;
import nx1.AbstractC27221c;
import nx1.AbstractC27223e;
import nx1.AbstractC27226h;
import p040c0.InterfaceC3764o;
import p114eb.C12982q;
import p114eb.C12987s0;
import p114eb.C12991u0;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: com.whoop.membership.management.navigation.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001am\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\bH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u001a2\u0006\u0010\u0019\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001f²\u0006\f\u0010\u001e\u001a\u00020\u001d8\nX\u008a\u0084\u0002"}, m65681d2 = {"Ljx1/d0;", "viewModel", "Leb/u0;", "navController", "Landroidx/lifecycle/g0;", "viewLifecycleOwner", "Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination;", "startDestination", "Lkotlin/Function1;", "Lcom/whoop/membership/management/navigation/b;", "Ll83/a0;", "onNavigationEvent", "Llx1/e;", "onViewEvent", "Lax1/a;", "onAnalyticEvent", "k", "(Ljx1/d0;Leb/u0;Landroidx/lifecycle/g0;Lcom/whoop/membership/management/navigation/MembershipManagementNavHostDestination;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "input", "", "separator", "", "y", "(Ljava/lang/String;C)Ljava/util/List;", "payload", "", "x", "(Ljava/lang/String;)Ljava/util/Map;", "Ljx1/e0;", "viewState", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC9126a {

    /* JADX INFO: renamed from: com.whoop.membership.management.navigation.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.membership.management.navigation.MembershipManagementNavHostKt$MembershipManagementNavHost$1$1$1$2$1", m100430f = "MembershipManagementNavHost.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f27281w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f27282x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f27283y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f27282x = function1;
            this.f27283y = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f27282x, this.f27283y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f27281w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC9126a.m22804l(this.f27283y).getMembershipManagementScreenViewState() instanceof AbstractC22009c0.e) {
                this.f27282x.invoke(InterfaceC24793d.b.f97041a);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.management.navigation.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.membership.management.navigation.MembershipManagementNavHostKt$MembershipManagementNavHost$1$1$2$1$1", m100430f = "MembershipManagementNavHost.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f27284w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f27285x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Map<String, String> f27286y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, Map<String, String> map, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f27285x = function1;
            this.f27286y = map;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f27285x, this.f27286y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f27284w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f27285x.invoke(new InterfaceC24792c.c(this.f27286y));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.management.navigation.a$c */
    @InterfaceC32271e(m100429c = "com.whoop.membership.management.navigation.MembershipManagementNavHostKt$MembershipManagementNavHost$1$1$3$2$1", m100430f = "MembershipManagementNavHost.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f27287w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f27288x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f27289y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function1 function1, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f27288x = function1;
            this.f27289y = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f27288x, this.f27289y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f27287w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC9126a.m22804l(this.f27289y).getManageMembershipScreenViewState() instanceof AbstractC22022l.d) {
                this.f27288x.invoke(InterfaceC24791b.a.f97026a);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.management.navigation.a$d */
    @InterfaceC32271e(m100429c = "com.whoop.membership.management.navigation.MembershipManagementNavHostKt$MembershipManagementNavHost$1$1$4$1$1", m100430f = "MembershipManagementNavHost.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Card f27290E;

        /* JADX INFO: renamed from: w */
        int f27291w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f27292x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f27293y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Map<String, String> f27294z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function1 function1, String str, Map<String, String> map, Card card, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f27292x = function1;
            this.f27293y = str;
            this.f27294z = map;
            this.f27290E = card;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f27292x, this.f27293y, this.f27294z, this.f27290E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f27291w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Function1 function1 = this.f27292x;
            String str = this.f27293y;
            AbstractC22676k.m65747g(str);
            function1.invoke(new InterfaceC24790a.a(str, this.f27294z, this.f27290E));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.management.navigation.a$e */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"com/whoop/membership/management/navigation/a$e", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC1585g0 f27295a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC1577e0 f27296b;

        public e(InterfaceC1585g0 interfaceC1585g0, InterfaceC1577e0 interfaceC1577e0) {
            this.f27295a = interfaceC1585g0;
            this.f27296b = interfaceC1577e0;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f27295a.getLifecycle().mo4988d(this.f27296b);
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.management.navigation.a$f */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"com/whoop/membership/management/navigation/a$f", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC1585g0 f27297a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC1577e0 f27298b;

        public f(InterfaceC1585g0 interfaceC1585g0, InterfaceC1577e0 interfaceC1577e0) {
            this.f27297a = interfaceC1585g0;
            this.f27298b = interfaceC1577e0;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f27297a.getLifecycle().mo4988d(this.f27298b);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m22803k(C22011d0 viewModel, C12991u0 navController, InterfaceC1585g0 viewLifecycleOwner, MembershipManagementNavHostDestination membershipManagementNavHostDestination, Function1 onNavigationEvent, Function1 onViewEvent, Function1 onAnalyticEvent, Composer composer, int i13, int i14) {
        int i15;
        MembershipManagementNavHostDestination membershipManagementNavHostDestination2;
        MembershipManagementNavHostDestination membershipManagementNavHostDestination3;
        int i16;
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(viewLifecycleOwner, "viewLifecycleOwner");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onAnalyticEvent, "onAnalyticEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1428609335);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewModel) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(navController) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(viewLifecycleOwner) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                membershipManagementNavHostDestination2 = membershipManagementNavHostDestination;
                if (c28655q.m87157i(membershipManagementNavHostDestination2)) {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i16;
            } else {
                membershipManagementNavHostDestination2 = membershipManagementNavHostDestination;
            }
            i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i16;
        } else {
            membershipManagementNavHostDestination2 = membershipManagementNavHostDestination;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(onNavigationEvent) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 131072 : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i15 |= c28655q.m87157i(onAnalyticEvent) ? 1048576 : 524288;
        }
        if (c28655q.m87135U(i15 & 1, (599187 & i15) != 599186)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0 && !c28655q.m87118C()) {
                c28655q.m87138X();
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                }
            } else if ((i14 & 8) != 0) {
                membershipManagementNavHostDestination2 = MembershipManagementNavHostDestination.C9124c.f27277a;
                i15 &= -7169;
            }
            int i17 = i15;
            MembershipManagementNavHostDestination membershipManagementNavHostDestination4 = membershipManagementNavHostDestination2;
            c28655q.m87175r();
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(viewModel.getViewState(), new C22013e0(null, null, null, null, 15, null), null, c28655q, 0, 2);
            String baseRoute$membership_release = membershipManagementNavHostDestination4.getBaseRoute();
            boolean zM87157i = ((i17 & 458752) == 131072) | c28655q.m87157i(viewLifecycleOwner) | c28655q.m87153g(interfaceC28601c1M87260n) | ((i17 & 57344) == 16384) | ((i17 & 3670016) == 1048576);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                C1040r c1040r = new C1040r((Object) viewLifecycleOwner, (Object) onViewEvent, (Object) interfaceC28601c1M87260n, (Object) onNavigationEvent, (Object) onAnalyticEvent, 15);
                c28655q.m87172p0(c1040r);
                objM87133R = c1040r;
            }
            AbstractC17269i.m48886d(navController, baseRoute$membership_release, null, null, null, null, null, null, null, (Function1) objM87133R, c28655q, (i17 >> 3) & 14, 1020);
            membershipManagementNavHostDestination3 = membershipManagementNavHostDestination4;
        } else {
            c28655q.m87138X();
            membershipManagementNavHostDestination3 = membershipManagementNavHostDestination2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2931g((Object) viewModel, (Object) navController, (Object) viewLifecycleOwner, (Object) membershipManagementNavHostDestination3, onNavigationEvent, onViewEvent, onAnalyticEvent, i13, i14, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C22013e0 m22804l(InterfaceC28670t2 interfaceC28670t2) {
        return (C22013e0) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m22805m(final InterfaceC1585g0 interfaceC1585g0, final Function1 function1, final InterfaceC28670t2 interfaceC28670t2, final Function1 function2, final Function1 function3, C12987s0 NavHost) {
        AbstractC22676k.m65750j(NavHost, "$this$NavHost");
        final int i13 = 0;
        AbstractC12889b.m36290t(NavHost, MembershipManagementNavHostDestination.C9124c.f27277a.getBaseRoute(), null, null, null, null, null, new C37816b(new InterfaceC4352n() { // from class: ix1.a
            @Override // c93.InterfaceC4352n
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                switch (i13) {
                    case 0:
                        int iIntValue = ((Integer) obj4).intValue();
                        return AbstractC9126a.m22806n(interfaceC1585g0, function1, interfaceC28670t2, function2, function3, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue);
                    default:
                        int iIntValue2 = ((Integer) obj4).intValue();
                        return AbstractC9126a.m22810r(interfaceC1585g0, function1, interfaceC28670t2, function2, function3, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue2);
                }
            }
        }, true, -473652820), 254);
        MembershipManagementNavHostDestination.C9123b c9123b = MembershipManagementNavHostDestination.C9123b.f27275a;
        AbstractC12889b.m36290t(NavHost, c9123b.getRoute(), c9123b.getArgs(), null, null, null, null, new C37816b(new C3403f(function1, (Object) function2, function3, interfaceC28670t2, 3), true, -509139997), 252);
        final int i14 = 1;
        AbstractC12889b.m36290t(NavHost, MembershipManagementNavHostDestination.C9125d.f27279a.getBaseRoute(), null, null, null, null, null, new C37816b(new InterfaceC4352n() { // from class: ix1.a
            @Override // c93.InterfaceC4352n
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                switch (i14) {
                    case 0:
                        int iIntValue = ((Integer) obj4).intValue();
                        return AbstractC9126a.m22806n(interfaceC1585g0, function1, interfaceC28670t2, function2, function3, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue);
                    default:
                        int iIntValue2 = ((Integer) obj4).intValue();
                        return AbstractC9126a.m22810r(interfaceC1585g0, function1, interfaceC28670t2, function2, function3, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue2);
                }
            }
        }, true, 1582389540), 254);
        MembershipManagementNavHostDestination.C9122a c9122a = MembershipManagementNavHostDestination.C9122a.f27273a;
        AbstractC12889b.m36290t(NavHost, c9122a.getRoute(), c9122a.getArgs(), null, null, null, null, new C37816b(new C14359c(function1, function2, interfaceC28670t2, 3), true, -621048219), 252);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m22806n(InterfaceC1585g0 interfaceC1585g0, Function1 function1, InterfaceC28670t2 interfaceC28670t2, Function1 function2, Function1 function3, InterfaceC3764o composable, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(interfaceC1585g0);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = new C15599e(interfaceC1585g0, function1, 1);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC28683x.m87251e(interfaceC1585g0, (Function1) objM87133R, c28655q);
        AbstractC22009c0 abstractC22009c0M62916d = m22804l(interfaceC28670t2).getMembershipManagementScreenViewState();
        boolean zM87153g2 = c28655q.m87153g(interfaceC28670t2) | c28655q.m87153g(function1);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g2 || objM87133R2 == c28676v0) {
            objM87133R2 = new a(function1, interfaceC28670t2, null);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, abstractC22009c0M62916d);
        AbstractC27226h.m82035z(m22804l(interfaceC28670t2).getMembershipManagementScreenViewState(), function1, function2, function3, c28655q, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final InterfaceC28620h0 m22807o(InterfaceC1585g0 interfaceC1585g0, Function1 function1, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        C15598d c15598d = new C15598d(function1, 2);
        interfaceC1585g0.getLifecycle().mo4986a(c15598d);
        return new e(interfaceC1585g0, c15598d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m22808p(Function1 function1, InterfaceC1585g0 interfaceC1585g0, EnumC1632v event) {
        AbstractC22676k.m65750j(interfaceC1585g0, "<unused var>");
        AbstractC22676k.m65750j(event, "event");
        if (event == EnumC1632v.ON_DESTROY) {
            function1.invoke(C24795f.f97043a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m22809q(Function1 function1, Function1 function2, Function1 function3, InterfaceC28670t2 interfaceC28670t2, InterfaceC3764o composable, C12982q backStackEntry, Composer composer, int i13) {
        Object objValueOf;
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(backStackEntry, "backStackEntry");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(String.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class))) {
            Bundle bundleM36479a = backStackEntry.m36479a();
            if (bundleM36479a == null || (objValueOf = bundleM36479a.getString("payload")) == null) {
                objValueOf = "";
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
            Bundle bundleM36479a2 = backStackEntry.m36479a();
            if (bundleM36479a2 != null) {
                objValueOf = Integer.valueOf(bundleM36479a2.getInt("payload"));
            } else {
                objValueOf = null;
            }
        } else {
            if (!AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
                throw new IllegalArgumentException("Unsupported type");
            }
            Bundle bundleM36479a3 = backStackEntry.m36479a();
            if (bundleM36479a3 != null) {
                objValueOf = Boolean.valueOf(bundleM36479a3.getBoolean("payload"));
            } else {
                objValueOf = null;
            }
        }
        if (objValueOf == null) {
            throw new IllegalArgumentException("Argument payload is missing or is of wrong type");
        }
        Map<String, String> mapM22816x = m22816x((String) objValueOf);
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(mapM22816x);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new b(function1, mapM22816x, null);
            c28655q.m87172p0(objM87133R);
        }
        C23454a0 c23454a0 = C23454a0.f92919a;
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a0);
        AbstractC27223e.m81990j(m22804l(interfaceC28670t2).getMembershipAdjustmentCheckoutScreenViewState(), function1, function2, function3, c28655q, 0);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m22810r(InterfaceC1585g0 interfaceC1585g0, Function1 function1, InterfaceC28670t2 interfaceC28670t2, Function1 function2, Function1 function3, InterfaceC3764o composable, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(interfaceC1585g0);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = new C15599e(interfaceC1585g0, function1, 2);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC28683x.m87251e(interfaceC1585g0, (Function1) objM87133R, c28655q);
        AbstractC22022l abstractC22022lM62914b = m22804l(interfaceC28670t2).getManageMembershipScreenViewState();
        boolean zM87153g2 = c28655q.m87153g(interfaceC28670t2) | c28655q.m87153g(function1);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g2 || objM87133R2 == c28676v0) {
            objM87133R2 = new c(function1, interfaceC28670t2, null);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, abstractC22022lM62914b);
        AbstractC27221c.m81973l(m22804l(interfaceC28670t2).getManageMembershipScreenViewState(), function1, function2, function3, c28655q, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final InterfaceC28620h0 m22811s(InterfaceC1585g0 interfaceC1585g0, Function1 function1, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        C15598d c15598d = new C15598d(function1, 1);
        interfaceC1585g0.getLifecycle().mo4986a(c15598d);
        return new f(interfaceC1585g0, c15598d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final void m22812t(Function1 function1, InterfaceC1585g0 interfaceC1585g0, EnumC1632v event) {
        AbstractC22676k.m65750j(interfaceC1585g0, "<unused var>");
        AbstractC22676k.m65750j(event, "event");
        if (event == EnumC1632v.ON_DESTROY) {
            function1.invoke(C24795f.f97043a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:52:0x0106  */
    /* JADX WARN: Code duplicated, block: B:76:0x017a  */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m22813u(Function1 function1, Function1 function2, InterfaceC28670t2 interfaceC28670t2, InterfaceC3764o composable, C12982q backStackEntry, Composer composer, int i13) throws UnsupportedEncodingException {
        Object objValueOf;
        Object objValueOf2;
        Object objValueOf3;
        Card card;
        Object string;
        AbstractC22676k.m65750j(composable, "$this$composable");
        AbstractC22676k.m65750j(backStackEntry, "backStackEntry");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(String.class);
        boolean zM65745e = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class));
        Class cls = Boolean.TYPE;
        Class cls2 = Integer.TYPE;
        Object objValueOf4 = "";
        if (zM65745e) {
            Bundle bundleM36479a = backStackEntry.m36479a();
            if (bundleM36479a == null || (objValueOf = bundleM36479a.getString("path")) == null) {
                objValueOf = "";
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
            Bundle bundleM36479a2 = backStackEntry.m36479a();
            if (bundleM36479a2 != null) {
                objValueOf = Integer.valueOf(bundleM36479a2.getInt("path"));
            } else {
                objValueOf = null;
            }
        } else {
            if (!AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls))) {
                throw new IllegalArgumentException("Unsupported type");
            }
            Bundle bundleM36479a3 = backStackEntry.m36479a();
            if (bundleM36479a3 != null) {
                objValueOf = Boolean.valueOf(bundleM36479a3.getBoolean("path"));
            } else {
                objValueOf = null;
            }
        }
        if (objValueOf == null) {
            throw new IllegalArgumentException("Argument path is missing or is of wrong type");
        }
        String strDecode = URLDecoder.decode((String) objValueOf, "UTF-8");
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(String.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(String.class))) {
            Bundle bundleM36479a4 = backStackEntry.m36479a();
            if (bundleM36479a4 == null || (objValueOf2 = bundleM36479a4.getString("payload")) == null) {
                objValueOf2 = "";
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls2))) {
            Bundle bundleM36479a5 = backStackEntry.m36479a();
            if (bundleM36479a5 != null) {
                objValueOf2 = Integer.valueOf(bundleM36479a5.getInt("payload"));
            } else {
                objValueOf2 = null;
            }
        } else {
            if (!AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls))) {
                throw new IllegalArgumentException("Unsupported type");
            }
            Bundle bundleM36479a6 = backStackEntry.m36479a();
            if (bundleM36479a6 != null) {
                objValueOf2 = Boolean.valueOf(bundleM36479a6.getBoolean("payload"));
            } else {
                objValueOf2 = null;
            }
        }
        if (objValueOf2 == null) {
            throw new IllegalArgumentException("Argument payload is missing or is of wrong type");
        }
        Map<String, String> mapM22816x = m22816x((String) objValueOf2);
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(String.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i0.getOrCreateKotlinClass(String.class))) {
            Bundle bundleM36479a7 = backStackEntry.m36479a();
            if (bundleM36479a7 == null || (objValueOf3 = bundleM36479a7.getString("card")) == null) {
                objValueOf3 = "";
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i0.getOrCreateKotlinClass(cls2))) {
            Bundle bundleM36479a8 = backStackEntry.m36479a();
            if (bundleM36479a8 != null) {
                objValueOf3 = Integer.valueOf(bundleM36479a8.getInt("card"));
            } else {
                objValueOf3 = null;
            }
        } else {
            if (!AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i0.getOrCreateKotlinClass(cls))) {
                throw new IllegalArgumentException("Unsupported type");
            }
            Bundle bundleM36479a9 = backStackEntry.m36479a();
            if (bundleM36479a9 != null) {
                objValueOf3 = Boolean.valueOf(bundleM36479a9.getBoolean("card"));
            } else {
                objValueOf3 = null;
            }
        }
        if (objValueOf3 == null) {
            throw new IllegalArgumentException("Argument card is missing or is of wrong type");
        }
        String str = (String) objValueOf3;
        if (str.length() == 0) {
            card = null;
        } else {
            C0755b c0755b = AbstractC0757c.f2762d;
            c0755b.getClass();
            card = (Card) c0755b.m1831b(Card.INSTANCE.serializer(), str);
        }
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(Boolean.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i0.getOrCreateKotlinClass(String.class))) {
            Bundle bundleM36479a10 = backStackEntry.m36479a();
            if (bundleM36479a10 != null && (string = bundleM36479a10.getString("is_independent_checkout")) != null) {
                objValueOf4 = string;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i0.getOrCreateKotlinClass(cls2))) {
            Bundle bundleM36479a11 = backStackEntry.m36479a();
            if (bundleM36479a11 != null) {
                objValueOf4 = Integer.valueOf(bundleM36479a11.getInt("is_independent_checkout"));
            } else {
                objValueOf4 = null;
            }
        } else {
            if (!AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i0.getOrCreateKotlinClass(cls))) {
                throw new IllegalArgumentException("Unsupported type");
            }
            Bundle bundleM36479a12 = backStackEntry.m36479a();
            if (bundleM36479a12 != null) {
                objValueOf4 = Boolean.valueOf(bundleM36479a12.getBoolean("is_independent_checkout"));
            } else {
                objValueOf4 = null;
            }
        }
        if (objValueOf4 == null) {
            throw new IllegalArgumentException("Argument is_independent_checkout is missing or is of wrong type");
        }
        boolean zBooleanValue = ((Boolean) objValueOf4).booleanValue();
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87153g(strDecode) | c28655q.m87157i(mapM22816x) | c28655q.m87157i(card);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            d dVar = new d(function1, strDecode, mapM22816x, card, null);
            c28655q.m87172p0(dVar);
            objM87133R = dVar;
        }
        C23454a0 c23454a0 = C23454a0.f92919a;
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a0);
        AbstractC27220b.m81956f(m22804l(interfaceC28670t2).getCheckoutScreenViewState(), zBooleanValue, function1, function2, c28655q, 0, 0);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m22814v(C22011d0 c22011d0, C12991u0 c12991u0, InterfaceC1585g0 interfaceC1585g0, MembershipManagementNavHostDestination membershipManagementNavHostDestination, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m22803k(c22011d0, c12991u0, interfaceC1585g0, membershipManagementNavHostDestination, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    public static final Map<String, String> m22816x(String payload) {
        C23465k c23465k;
        AbstractC22676k.m65750j(payload, "payload");
        try {
            payload = URLDecoder.decode(payload, "UTF-8");
        } catch (Exception unused) {
        }
        AbstractC22676k.m65747g(payload);
        String string = AbstractC39414r.m125869O0(payload).toString();
        if (string.length() < 2 || AbstractC39414r.m125882a0(string) != '{' || AbstractC39414r.m125891j0(string) != '}') {
            return C25272z.f99163w;
        }
        List<String> listM22817y = m22817y(AbstractC39414r.m125879X(1, AbstractC39414r.m125878W(1, string)), DateTimeRange.lowerUpperDelimiter);
        ArrayList arrayList = new ArrayList();
        for (String str : listM22817y) {
            int iM125888g0 = AbstractC39414r.m125888g0(str, ":", 0, false, 6);
            if (iM125888g0 < 0) {
                c23465k = null;
            } else {
                String strSubstring = str.substring(0, iM125888g0);
                AbstractC22676k.m65749i(strSubstring, "substring(...)");
                String string2 = AbstractC39414r.m125869O0(strSubstring).toString();
                String strSubstring2 = str.substring(iM125888g0 + 1);
                AbstractC22676k.m65749i(strSubstring2, "substring(...)");
                c23465k = new C23465k(string2, AbstractC39414r.m125869O0(strSubstring2).toString());
            }
            if (c23465k != null) {
                arrayList.add(c23465k);
            }
        }
        return AbstractC25247g0.m74000i0(arrayList);
    }

    /* JADX INFO: renamed from: y */
    private static final List<String> m22817y(String str, char c3) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb4 = new StringBuilder();
        int length = str.length();
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt = str.charAt(i14);
            if (cCharAt == '{') {
                i13++;
                sb4.append(cCharAt);
            } else if (cCharAt == '}') {
                i13--;
                sb4.append(cCharAt);
            } else if (cCharAt != c3) {
                sb4.append(cCharAt);
            } else if (i13 == 0) {
                String string = sb4.toString();
                AbstractC22676k.m65749i(string, "toString(...)");
                arrayList.add(string);
                sb4.setLength(0);
            } else {
                sb4.append(cCharAt);
            }
        }
        if (sb4.length() > 0) {
            String string2 = sb4.toString();
            AbstractC22676k.m65749i(string2, "toString(...)");
            arrayList.add(string2);
        }
        return arrayList;
    }
}
