package com.whoop.profile.view.edit;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.profile.presentation.edit.EditProfileEvent;
import l83.C23454a0;
import l83.InterfaceC23462h;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32271e(m100429c = "com.whoop.profile.view.edit.EditProfileScreenKt$EditProfileScreen$1$1", m100430f = "EditProfileScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class EditProfileScreenKt$EditProfileScreen$1$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ InterfaceC23462h $viewModel$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfileScreenKt$EditProfileScreen$1$1(InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super EditProfileScreenKt$EditProfileScreen$1$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$viewModel$delegate = interfaceC23462h;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new EditProfileScreenKt$EditProfileScreen$1$1(this.$viewModel$delegate, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((EditProfileScreenKt$EditProfileScreen$1$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        EditProfileScreenKt.EditProfileScreen$lambda$0(this.$viewModel$delegate).sendViewEvent(EditProfileEvent.Refresh.INSTANCE);
        return C23454a0.f92919a;
    }
}
