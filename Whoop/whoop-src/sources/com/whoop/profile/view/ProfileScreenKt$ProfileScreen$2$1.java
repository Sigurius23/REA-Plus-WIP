package com.whoop.profile.view;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.profile.navigation.ProfileActionRouter;
import com.whoop.profile.presentation.ProfileEvent;
import com.whoop.profile.presentation.ProfileViewState;
import l83.C23454a0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32271e(m100429c = "com.whoop.profile.view.ProfileScreenKt$ProfileScreen$2$1", m100430f = "ProfileScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class ProfileScreenKt$ProfileScreen$2$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ ProfileActionRouter $actionRouter;
    final /* synthetic */ InterfaceC28601c1 $hasLoggedScreenView$delegate;
    final /* synthetic */ String $source;
    final /* synthetic */ InterfaceC28670t2 $viewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileScreenKt$ProfileScreen$2$1(ProfileActionRouter profileActionRouter, String str, InterfaceC28601c1 interfaceC28601c1, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super ProfileScreenKt$ProfileScreen$2$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$actionRouter = profileActionRouter;
        this.$source = str;
        this.$hasLoggedScreenView$delegate = interfaceC28601c1;
        this.$viewState$delegate = interfaceC28670t2;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new ProfileScreenKt$ProfileScreen$2$1(this.$actionRouter, this.$source, this.$hasLoggedScreenView$delegate, this.$viewState$delegate, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((ProfileScreenKt$ProfileScreen$2$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        if (!ProfileScreenKt.ProfileScreen$lambda$5(this.$hasLoggedScreenView$delegate) && ProfileScreenKt.ProfileScreen$lambda$2(this.$viewState$delegate).getMetadata().getUserData() != null) {
            ProfileScreenKt.ProfileScreen$lambda$6(this.$hasLoggedScreenView$delegate, true);
            ProfileActionRouter profileActionRouter = this.$actionRouter;
            ProfileEvent.Companion companion = ProfileEvent.INSTANCE;
            String str = this.$source;
            boolean zIsSelfProfile = ProfileScreenKt.ProfileScreen$lambda$2(this.$viewState$delegate).getMetadata().isSelfProfile();
            ProfileViewState.MembershipData membershipData = ProfileScreenKt.ProfileScreen$lambda$2(this.$viewState$delegate).getMetadata().getMembershipData();
            profileActionRouter.route(companion.screenViewedAnalyticEvent(str, zIsSelfProfile, membershipData != null ? ProfileScreenKt.toMembershipAnalyticsProperties(membershipData) : null));
        }
        return C23454a0.f92919a;
    }
}
