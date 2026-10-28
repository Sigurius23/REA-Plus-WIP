package com.whoop.profile.view.edit;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.profile.presentation.edit.EditProfileEvent;
import com.whoop.profile.presentation.edit.EditProfileViewState;
import l83.C23454a0;
import p114eb.AbstractC12939a0;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33208p0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32271e(m100429c = "com.whoop.profile.view.edit.EditProfileScreenKt$EditProfileScreen$2$1", m100430f = "EditProfileScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class EditProfileScreenKt$EditProfileScreen$2$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ AbstractC12939a0 $navController;
    final /* synthetic */ InterfaceC28670t2 $viewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfileScreenKt$EditProfileScreen$2$1(AbstractC12939a0 abstractC12939a0, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super EditProfileScreenKt$EditProfileScreen$2$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$navController = abstractC12939a0;
        this.$viewState$delegate = interfaceC28670t2;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new EditProfileScreenKt$EditProfileScreen$2$1(this.$navController, this.$viewState$delegate, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((EditProfileScreenKt$EditProfileScreen$2$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        EditProfileViewState.FullScreenModal fullScreenModal = EditProfileScreenKt.EditProfileScreen$lambda$1(this.$viewState$delegate).getFullScreenModal();
        if (fullScreenModal != null && (fullScreenModal.getState().getType() instanceof AbstractC33208p0.h) && !AbstractC22676k.m65745e(fullScreenModal.getPrimaryClickEvent(), EditProfileEvent.CloseAvatarModal.INSTANCE)) {
            this.$navController.m36410z();
        }
        return C23454a0.f92919a;
    }
}
