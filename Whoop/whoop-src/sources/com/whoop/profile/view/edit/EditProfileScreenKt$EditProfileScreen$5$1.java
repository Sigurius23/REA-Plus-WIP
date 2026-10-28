package com.whoop.profile.view.edit;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.form.EditProfileFormState;
import com.whoop.profile.view.edit.form.EditProfileFormUtils;
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
@InterfaceC32271e(m100429c = "com.whoop.profile.view.edit.EditProfileScreenKt$EditProfileScreen$5$1", m100430f = "EditProfileScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class EditProfileScreenKt$EditProfileScreen$5$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ InterfaceC28601c1 $formState$delegate;
    final /* synthetic */ InterfaceC28670t2 $viewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfileScreenKt$EditProfileScreen$5$1(InterfaceC28670t2 interfaceC28670t2, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super EditProfileScreenKt$EditProfileScreen$5$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$viewState$delegate = interfaceC28670t2;
        this.$formState$delegate = interfaceC28601c1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new EditProfileScreenKt$EditProfileScreen$5$1(this.$viewState$delegate, this.$formState$delegate, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((EditProfileScreenKt$EditProfileScreen$5$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EditProfileFormState editProfileFormStateEditProfileScreen$lambda$3;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        TextResource validationError = EditProfileScreenKt.EditProfileScreen$lambda$1(this.$viewState$delegate).getUsernameValidationState().getValidationError();
        String lastValidatedUsername = EditProfileScreenKt.EditProfileScreen$lambda$1(this.$viewState$delegate).getUsernameValidationState().getLastValidatedUsername();
        Boolean boolIsValid = EditProfileScreenKt.EditProfileScreen$lambda$1(this.$viewState$delegate).getUsernameValidationState().isValid();
        if (lastValidatedUsername != null && EditProfileScreenKt.EditProfileScreen$lambda$1(this.$viewState$delegate).getShowUsernameField() && (editProfileFormStateEditProfileScreen$lambda$3 = EditProfileScreenKt.EditProfileScreen$lambda$3(this.$formState$delegate)) != null) {
            this.$formState$delegate.setValue(EditProfileFormUtils.INSTANCE.applyUsernameValidationResult(editProfileFormStateEditProfileScreen$lambda$3, lastValidatedUsername, boolIsValid, validationError, EditProfileScreenKt.EditProfileScreen$lambda$1(this.$viewState$delegate).getProfileData()));
        }
        return C23454a0.f92919a;
    }
}
