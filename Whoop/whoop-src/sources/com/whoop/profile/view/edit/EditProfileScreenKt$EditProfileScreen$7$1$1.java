package com.whoop.profile.view.edit;

import com.whoop.profile.presentation.edit.EditProfileEvent;
import com.whoop.profile.presentation.edit.EditProfileViewModel;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* synthetic */ class EditProfileScreenKt$EditProfileScreen$7$1$1 extends C22672i implements Function1 {
    public EditProfileScreenKt$EditProfileScreen$7$1$1(Object obj) {
        super(1, 0, EditProfileViewModel.class, obj, "sendViewEvent", "sendViewEvent(Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;)V");
    }

    @Override // p715kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((EditProfileEvent.ViewEvent) obj);
        return C23454a0.f92919a;
    }

    public final void invoke(EditProfileEvent.ViewEvent p13) {
        AbstractC22676k.m65750j(p13, "p0");
        ((EditProfileViewModel) this.receiver).sendViewEvent(p13);
    }
}
