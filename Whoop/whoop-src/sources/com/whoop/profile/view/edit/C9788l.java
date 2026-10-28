package com.whoop.profile.view.edit;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.payments.domain.models.Card;
import com.whoop.profile.presentation.edit.EditProfileEvent;
import com.whoop.profile.presentation.edit.EditProfileViewState;
import f01.AbstractC13907w;
import ic2.AbstractC18401f;
import lw1.AbstractC24769e;
import p11.AbstractC28704e;
import v41.AbstractC35660d;

/* JADX INFO: renamed from: com.whoop.profile.view.edit.l */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C9788l implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f28540w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4351m f28541x;

    public /* synthetic */ C9788l(int i13, InterfaceC4351m interfaceC4351m) {
        this.f28540w = i13;
        this.f28541x = interfaceC4351m;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28540w) {
            case 0:
                return EditProfileContentKt.EditProfileContent$lambda$3$0(this.f28541x, (EditProfileEvent.FieldType) obj, (String) obj2);
            case 1:
                return EditProfileContentKt.EditProfileContent$lambda$4$1$1$0(this.f28541x, (EditProfileEvent.FieldType) obj, (String) obj2);
            case 2:
                return EditProfileFieldsContentKt.EditProfileFieldsContent$lambda$6$0$3$0$0(this.f28541x, (EditProfileViewState.BottomSheetType) obj, (String) obj2);
            case 3:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC13907w.m39601j(this.f28541x, (Composer) obj, iIntValue);
            case 4:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                return AbstractC18401f.m52937t(this.f28541x, (String) obj, zBooleanValue);
            case 5:
                return AbstractC24769e.m72551q(this.f28541x, ((Boolean) obj).booleanValue(), (Card) obj2);
            case 6:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC28704e.m87324u(this.f28541x, (Composer) obj, iIntValue2);
            case 7:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC35660d.m112875q(this.f28541x, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC35660d.m112877s(this.f28541x, (Composer) obj, iIntValue4);
        }
    }
}
