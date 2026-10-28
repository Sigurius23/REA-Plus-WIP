package com.whoop.profile.view.edit;

import com.whoop.profile.domain.models.Gender;
import com.whoop.profile.domain.models.PhysiologicalBaseline;
import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, m65681d2 = {"Lcom/whoop/profile/view/edit/GenderBaselineSheetState;", "", "selectedGender", "Lcom/whoop/profile/domain/models/Gender;", "selectedPhysiologicalBaseline", "Lcom/whoop/profile/domain/models/PhysiologicalBaseline;", "isTransitionedFromGender", "", "<init>", "(Lcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;Z)V", "getSelectedGender", "()Lcom/whoop/profile/domain/models/Gender;", "getSelectedPhysiologicalBaseline", "()Lcom/whoop/profile/domain/models/PhysiologicalBaseline;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class GenderBaselineSheetState {
    public static final int $stable = 0;
    private final boolean isTransitionedFromGender;
    private final Gender selectedGender;
    private final PhysiologicalBaseline selectedPhysiologicalBaseline;

    public GenderBaselineSheetState() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ GenderBaselineSheetState copy$default(GenderBaselineSheetState genderBaselineSheetState, Gender gender, PhysiologicalBaseline physiologicalBaseline, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            gender = genderBaselineSheetState.selectedGender;
        }
        if ((i13 & 2) != 0) {
            physiologicalBaseline = genderBaselineSheetState.selectedPhysiologicalBaseline;
        }
        if ((i13 & 4) != 0) {
            z4 = genderBaselineSheetState.isTransitionedFromGender;
        }
        return genderBaselineSheetState.copy(gender, physiologicalBaseline, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Gender getSelectedGender() {
        return this.selectedGender;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PhysiologicalBaseline getSelectedPhysiologicalBaseline() {
        return this.selectedPhysiologicalBaseline;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsTransitionedFromGender() {
        return this.isTransitionedFromGender;
    }

    public final GenderBaselineSheetState copy(Gender selectedGender, PhysiologicalBaseline selectedPhysiologicalBaseline, boolean isTransitionedFromGender) {
        return new GenderBaselineSheetState(selectedGender, selectedPhysiologicalBaseline, isTransitionedFromGender);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenderBaselineSheetState)) {
            return false;
        }
        GenderBaselineSheetState genderBaselineSheetState = (GenderBaselineSheetState) other;
        return this.selectedGender == genderBaselineSheetState.selectedGender && this.selectedPhysiologicalBaseline == genderBaselineSheetState.selectedPhysiologicalBaseline && this.isTransitionedFromGender == genderBaselineSheetState.isTransitionedFromGender;
    }

    public final Gender getSelectedGender() {
        return this.selectedGender;
    }

    public final PhysiologicalBaseline getSelectedPhysiologicalBaseline() {
        return this.selectedPhysiologicalBaseline;
    }

    public int hashCode() {
        Gender gender = this.selectedGender;
        int iHashCode = (gender == null ? 0 : gender.hashCode()) * 31;
        PhysiologicalBaseline physiologicalBaseline = this.selectedPhysiologicalBaseline;
        return Boolean.hashCode(this.isTransitionedFromGender) + ((iHashCode + (physiologicalBaseline != null ? physiologicalBaseline.hashCode() : 0)) * 31);
    }

    public final boolean isTransitionedFromGender() {
        return this.isTransitionedFromGender;
    }

    public String toString() {
        Gender gender = this.selectedGender;
        PhysiologicalBaseline physiologicalBaseline = this.selectedPhysiologicalBaseline;
        boolean z4 = this.isTransitionedFromGender;
        StringBuilder sb4 = new StringBuilder("GenderBaselineSheetState(selectedGender=");
        sb4.append(gender);
        sb4.append(", selectedPhysiologicalBaseline=");
        sb4.append(physiologicalBaseline);
        sb4.append(", isTransitionedFromGender=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public GenderBaselineSheetState(Gender gender, PhysiologicalBaseline physiologicalBaseline, boolean z4) {
        this.selectedGender = gender;
        this.selectedPhysiologicalBaseline = physiologicalBaseline;
        this.isTransitionedFromGender = z4;
    }

    public /* synthetic */ GenderBaselineSheetState(Gender gender, PhysiologicalBaseline physiologicalBaseline, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : gender, (i13 & 2) != 0 ? null : physiologicalBaseline, (i13 & 4) != 0 ? false : z4);
    }
}
