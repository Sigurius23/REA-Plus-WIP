package com.whoop.profile.view;

import c93.InterfaceC4339a;
import com.whoop.profile.presentation.ProfileViewModel;
import jf3.C21647a;
import p249jc.AbstractC21598x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22680m;
import vf3.InterfaceC35951a;
import xf3.C38266c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ProfileScreenKt$ProfileScreen$$inlined$viewModel$1 extends AbstractC22680m implements InterfaceC4339a {
    final /* synthetic */ InterfaceC4339a $parameters;
    final /* synthetic */ InterfaceC35951a $qualifier;
    final /* synthetic */ C38266c $scope;
    final /* synthetic */ C21647a $storeOwner;

    /* JADX INFO: renamed from: com.whoop.profile.view.ProfileScreenKt$ProfileScreen$$inlined$viewModel$1$1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C97461 extends AbstractC22680m implements InterfaceC4339a {
        final /* synthetic */ C21647a $storeOwner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C97461(C21647a c21647a) {
            super(0);
            this.$storeOwner = c21647a;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            return this.$storeOwner;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileScreenKt$ProfileScreen$$inlined$viewModel$1(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
        super(0);
        this.$scope = c38266c;
        this.$qualifier = interfaceC35951a;
        this.$parameters = interfaceC4339a;
        this.$storeOwner = c21647a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, com.whoop.profile.presentation.ProfileViewModel] */
    @Override // c93.InterfaceC4339a
    public final ProfileViewModel invoke() {
        return AbstractC21598x.m60668X(this.$scope, this.$qualifier, new C97461(this.$storeOwner), AbstractC22671h0.f89337a.getOrCreateKotlinClass(ProfileViewModel.class), null, this.$parameters);
    }
}
