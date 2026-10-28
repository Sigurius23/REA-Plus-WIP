package com.whoop.profile.view.edit;

import c93.InterfaceC4339a;
import com.whoop.profile.presentation.edit.EditProfileViewModel;
import jf3.C21647a;
import p249jc.AbstractC21598x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22680m;
import vf3.InterfaceC35951a;
import xf3.C38266c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EditProfileScreenKt$EditProfileScreen$$inlined$viewModel$1 extends AbstractC22680m implements InterfaceC4339a {
    final /* synthetic */ InterfaceC4339a $parameters;
    final /* synthetic */ InterfaceC35951a $qualifier;
    final /* synthetic */ C38266c $scope;
    final /* synthetic */ C21647a $storeOwner;

    /* JADX INFO: renamed from: com.whoop.profile.view.edit.EditProfileScreenKt$EditProfileScreen$$inlined$viewModel$1$1 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C97601 extends AbstractC22680m implements InterfaceC4339a {
        final /* synthetic */ C21647a $storeOwner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C97601(C21647a c21647a) {
            super(0);
            this.$storeOwner = c21647a;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            return this.$storeOwner;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfileScreenKt$EditProfileScreen$$inlined$viewModel$1(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
        super(0);
        this.$scope = c38266c;
        this.$qualifier = interfaceC35951a;
        this.$parameters = interfaceC4339a;
        this.$storeOwner = c21647a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, com.whoop.profile.presentation.edit.EditProfileViewModel] */
    @Override // c93.InterfaceC4339a
    public final EditProfileViewModel invoke() {
        return AbstractC21598x.m60668X(this.$scope, this.$qualifier, new C97601(this.$storeOwner), AbstractC22671h0.f89337a.getOrCreateKotlinClass(EditProfileViewModel.class), null, this.$parameters);
    }
}
