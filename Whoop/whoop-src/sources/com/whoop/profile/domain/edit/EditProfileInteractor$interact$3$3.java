package com.whoop.profile.domain.edit;

import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32271e(m100429c = "com.whoop.profile.domain.edit.EditProfileInteractor$interact$3$3", m100430f = "EditProfileInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;", "currentState", "update", "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EditProfileInteractor$interact$3$3 extends AbstractC32275i implements Function3 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public EditProfileInteractor$interact$3$3(InterfaceC30057d<? super EditProfileInteractor$interact$3$3> interfaceC30057d) {
        super(3, interfaceC30057d);
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(EditProfileInteractor.InternalState internalState, EditProfileInteractor.StateUpdate stateUpdate, InterfaceC30057d<? super EditProfileInteractor.InternalState> interfaceC30057d) {
        EditProfileInteractor$interact$3$3 editProfileInteractor$interact$3$3 = new EditProfileInteractor$interact$3$3(interfaceC30057d);
        editProfileInteractor$interact$3$3.L$0 = internalState;
        editProfileInteractor$interact$3$3.L$1 = stateUpdate;
        return editProfileInteractor$interact$3$3.invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EditProfileInteractor.InternalState internalState = (EditProfileInteractor.InternalState) this.L$0;
        EditProfileInteractor.StateUpdate stateUpdate = (EditProfileInteractor.StateUpdate) this.L$1;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        if (stateUpdate instanceof EditProfileInteractor.StateUpdate.Loading) {
            return EditProfileInteractor.InternalState.copy$default(internalState, null, true, false, false, null, null, null, null, false, false, null, null, false, false, null, null, false, null, null, 524285, null);
        }
        if (!(stateUpdate instanceof EditProfileInteractor.StateUpdate.DataLoaded)) {
            return stateUpdate instanceof EditProfileInteractor.StateUpdate.ErrorOccurred ? EditProfileInteractor.InternalState.copy$default(internalState, null, false, false, false, ((EditProfileInteractor.StateUpdate.ErrorOccurred) stateUpdate).getError(), null, null, null, false, false, null, null, false, false, null, null, false, null, null, 524269, null) : internalState;
        }
        EditProfileInteractor.StateUpdate.DataLoaded dataLoaded = (EditProfileInteractor.StateUpdate.DataLoaded) stateUpdate;
        return dataLoaded.getPreserveFormState() ? EditProfileInteractor.InternalState.copy$default(internalState, dataLoaded.getResponse(), false, false, false, null, null, null, null, false, false, null, null, false, false, null, null, false, null, null, 523772, null) : EditProfileInteractor.InternalState.copy$default(internalState, dataLoaded.getResponse(), false, false, false, null, null, null, null, false, false, null, null, false, false, null, null, false, null, null, 524284, null);
    }
}
