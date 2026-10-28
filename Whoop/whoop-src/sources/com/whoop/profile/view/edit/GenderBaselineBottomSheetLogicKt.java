package com.whoop.profile.view.edit;

import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.profile.domain.models.Gender;
import com.whoop.profile.domain.models.PhysiologicalBaseline;
import com.whoop.profile.presentation.edit.EditProfileEvent;
import com.whoop.profile.view.edit.form.EditProfileFormState;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u001aO\u0010\n\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aS\u0010\u0010\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u000f\u0010\u0017\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001d\u0010\u001a\u001a\u00020\u0014*\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001d\u0010\u001d\u001a\u00020\u0014*\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010\u001f\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Lcom/whoop/profile/domain/models/Gender;", "selectedGender", "Lkotlin/Function2;", "Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;", "", "Ll83/a0;", "onFieldUpdate", "Lkotlin/Function0;", "onTransitionToBaseline", "onClose", "handleGenderSelectionConfirm", "(Lcom/whoop/profile/domain/models/Gender;Lc93/m;Lc93/a;Lc93/a;)V", "Lcom/whoop/profile/domain/models/PhysiologicalBaseline;", "selectedBaseline", "", "isTransitionedFromGender", "handlePhysiologicalBaselineSelectionConfirm", "(Lcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;ZLc93/m;Lc93/a;)V", "Lcom/whoop/profile/view/edit/form/EditProfileFormState;", "formState", "Lcom/whoop/profile/view/edit/GenderBaselineSheetState;", "initializeGenderBaselineState", "(Lcom/whoop/profile/view/edit/form/EditProfileFormState;)Lcom/whoop/profile/view/edit/GenderBaselineSheetState;", "resetGenderBaselineState", "()Lcom/whoop/profile/view/edit/GenderBaselineSheetState;", "gender", "updateSelectedGender", "(Lcom/whoop/profile/view/edit/GenderBaselineSheetState;Lcom/whoop/profile/domain/models/Gender;)Lcom/whoop/profile/view/edit/GenderBaselineSheetState;", "baseline", "updateSelectedBaseline", "(Lcom/whoop/profile/view/edit/GenderBaselineSheetState;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;)Lcom/whoop/profile/view/edit/GenderBaselineSheetState;", "markAsTransitionedFromGender", "(Lcom/whoop/profile/view/edit/GenderBaselineSheetState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;)Lcom/whoop/profile/view/edit/GenderBaselineSheetState;", "profile_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class GenderBaselineBottomSheetLogicKt {
    public static final void handleGenderSelectionConfirm(Gender gender, InterfaceC4351m onFieldUpdate, InterfaceC4339a onTransitionToBaseline, InterfaceC4339a onClose) {
        AbstractC22676k.m65750j(onFieldUpdate, "onFieldUpdate");
        AbstractC22676k.m65750j(onTransitionToBaseline, "onTransitionToBaseline");
        AbstractC22676k.m65750j(onClose, "onClose");
        if (gender != null && gender.requiresPhysiologicalBaseline()) {
            onTransitionToBaseline.invoke();
            return;
        }
        if (gender != null) {
            onFieldUpdate.invoke(EditProfileEvent.FieldType.GENDER, gender.name());
            onFieldUpdate.invoke(EditProfileEvent.FieldType.PHYSIOLOGICAL_BASELINE, "");
        }
        onClose.invoke();
    }

    public static final void handlePhysiologicalBaselineSelectionConfirm(Gender gender, PhysiologicalBaseline physiologicalBaseline, boolean z4, InterfaceC4351m onFieldUpdate, InterfaceC4339a onClose) {
        AbstractC22676k.m65750j(onFieldUpdate, "onFieldUpdate");
        AbstractC22676k.m65750j(onClose, "onClose");
        if (z4) {
            if (gender != null && physiologicalBaseline != null) {
                onFieldUpdate.invoke(EditProfileEvent.FieldType.GENDER, gender.name());
                onFieldUpdate.invoke(EditProfileEvent.FieldType.PHYSIOLOGICAL_BASELINE, physiologicalBaseline.name());
            }
        } else if (physiologicalBaseline != null) {
            onFieldUpdate.invoke(EditProfileEvent.FieldType.PHYSIOLOGICAL_BASELINE, physiologicalBaseline.name());
        }
        onClose.invoke();
    }

    public static final GenderBaselineSheetState initializeGenderBaselineState(EditProfileFormState formState) {
        AbstractC22676k.m65750j(formState, "formState");
        return new GenderBaselineSheetState(Gender.valueOf(formState.getGender().getValue()), formState.getPhysiologicalBaseline().getValue().length() > 0 ? PhysiologicalBaseline.valueOf(formState.getPhysiologicalBaseline().getValue()) : null, false);
    }

    public static final GenderBaselineSheetState markAsTransitionedFromGender(GenderBaselineSheetState genderBaselineSheetState, EditProfileFormState formState) {
        AbstractC22676k.m65750j(genderBaselineSheetState, "<this>");
        AbstractC22676k.m65750j(formState, "formState");
        return GenderBaselineSheetState.copy$default(genderBaselineSheetState, null, formState.getPhysiologicalBaseline().getValue().length() > 0 ? PhysiologicalBaseline.valueOf(formState.getPhysiologicalBaseline().getValue()) : null, true, 1, null);
    }

    public static final GenderBaselineSheetState resetGenderBaselineState() {
        return new GenderBaselineSheetState(null, null, false, 7, null);
    }

    public static final GenderBaselineSheetState updateSelectedBaseline(GenderBaselineSheetState genderBaselineSheetState, PhysiologicalBaseline physiologicalBaseline) {
        AbstractC22676k.m65750j(genderBaselineSheetState, "<this>");
        return GenderBaselineSheetState.copy$default(genderBaselineSheetState, null, physiologicalBaseline, false, 5, null);
    }

    public static final GenderBaselineSheetState updateSelectedGender(GenderBaselineSheetState genderBaselineSheetState, Gender gender) {
        AbstractC22676k.m65750j(genderBaselineSheetState, "<this>");
        return GenderBaselineSheetState.copy$default(genderBaselineSheetState, gender, null, false, 6, null);
    }
}
