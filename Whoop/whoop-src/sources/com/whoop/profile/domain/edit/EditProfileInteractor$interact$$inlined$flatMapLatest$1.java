package com.whoop.profile.domain.edit;

import bm.C3383g;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32271e(m100429c = "com.whoop.profile.domain.edit.EditProfileInteractor$interact$$inlined$flatMapLatest$1", m100430f = "EditProfileInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
public final class EditProfileInteractor$interact$$inlined$flatMapLatest$1 extends AbstractC32275i implements Function3 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ EditProfileInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfileInteractor$interact$$inlined$flatMapLatest$1(InterfaceC30057d interfaceC30057d, EditProfileInteractor editProfileInteractor) {
        super(3, interfaceC30057d);
        this.this$0 = editProfileInteractor;
    }

    public final Object invoke(InterfaceC13062m interfaceC13062m, EditProfileDomainAction editProfileDomainAction, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        EditProfileInteractor$interact$$inlined$flatMapLatest$1 editProfileInteractor$interact$$inlined$flatMapLatest$1 = new EditProfileInteractor$interact$$inlined$flatMapLatest$1(interfaceC30057d, this.this$0);
        editProfileInteractor$interact$$inlined$flatMapLatest$1.L$0 = interfaceC13062m;
        editProfileInteractor$interact$$inlined$flatMapLatest$1.L$1 = editProfileDomainAction;
        return editProfileInteractor$interact$$inlined$flatMapLatest$1.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        InterfaceC13058l c3383g;
        InterfaceC13058l interfaceC13058lDeleteCurrentUserAvatarFlow;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.L$0;
            EditProfileDomainAction editProfileDomainAction = (EditProfileDomainAction) this.L$1;
            if (editProfileDomainAction instanceof EditProfileDomainAction.Refresh) {
                interfaceC13058lDeleteCurrentUserAvatarFlow = EditProfileInteractor.handleRefresh$default(this.this$0, false, 1, null);
            } else if (editProfileDomainAction instanceof EditProfileDomainAction.SaveProfile) {
                interfaceC13058lDeleteCurrentUserAvatarFlow = new C0456u(new EditProfileInteractor.StateUpdate.SaveRequested(((EditProfileDomainAction.SaveProfile) editProfileDomainAction).getFormState()), 1);
            } else if (editProfileDomainAction instanceof EditProfileDomainAction.ValidateEmailField) {
                interfaceC13058lDeleteCurrentUserAvatarFlow = this.this$0.validateEmailField(((EditProfileDomainAction.ValidateEmailField) editProfileDomainAction).getEmail());
            } else if (editProfileDomainAction instanceof EditProfileDomainAction.ValidateUsernameField) {
                interfaceC13058lDeleteCurrentUserAvatarFlow = this.this$0.validateUsernameField(((EditProfileDomainAction.ValidateUsernameField) editProfileDomainAction).getUsername());
            } else {
                if (editProfileDomainAction instanceof EditProfileDomainAction.ClearUsernameValidation) {
                    c3383g = new C0456u(EditProfileInteractor.StateUpdate.ClearUsernameValidation.INSTANCE, 1);
                } else if (editProfileDomainAction instanceof EditProfileDomainAction.RefreshAfterAvatarUpload) {
                    interfaceC13058lDeleteCurrentUserAvatarFlow = this.this$0.handleRefresh(true);
                } else if (editProfileDomainAction instanceof EditProfileDomainAction.UploadAvatar) {
                    interfaceC13058lDeleteCurrentUserAvatarFlow = this.this$0.uploadAvatar(((EditProfileDomainAction.UploadAvatar) editProfileDomainAction).getImageData());
                } else if (AbstractC22676k.m65745e(editProfileDomainAction, EditProfileDomainAction.RetryAvatarUpload.INSTANCE)) {
                    c3383g = new C0456u(new EditProfileInteractor.StateUpdate.AvatarUploadError("No upload data available for retry", new byte[0]), 1);
                } else if (AbstractC22676k.m65745e(editProfileDomainAction, EditProfileDomainAction.DeleteAvatar.INSTANCE)) {
                    interfaceC13058lDeleteCurrentUserAvatarFlow = this.this$0.deleteCurrentUserAvatarFlow();
                } else {
                    if (!AbstractC22676k.m65745e(editProfileDomainAction, EditProfileDomainAction.NoOp.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c3383g = new C3383g(new EditProfileInteractor.StateUpdate[0], 3);
                }
                interfaceC13058lDeleteCurrentUserAvatarFlow = c3383g;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lDeleteCurrentUserAvatarFlow, this) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return C23454a0.f92919a;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC13062m) obj, (EditProfileDomainAction) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
    }
}
