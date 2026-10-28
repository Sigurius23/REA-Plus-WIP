package com.whoop.profile.view.edit.form;

import com.whoop.design.util.TextResource;
import com.whoop.domain.model.UnitSystem;
import com.whoop.profile.presentation.edit.EditProfileViewState;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JG\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0014\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\"\u001a\u00020#HÖ\u0081\u0004J\n\u0010$\u001a\u00020\nHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006%"}, m65681d2 = {"Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;", "", "unitSystem", "Lcom/whoop/domain/model/UnitSystem;", "height", "Lcom/whoop/design/util/TextResource;", "weight", "profileData", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;", "currentHeightValue", "", "currentWeightValue", "<init>", "(Lcom/whoop/domain/model/UnitSystem;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Ljava/lang/String;Ljava/lang/String;)V", "getUnitSystem", "()Lcom/whoop/domain/model/UnitSystem;", "getHeight", "()Lcom/whoop/design/util/TextResource;", "getWeight", "getProfileData", "()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;", "getCurrentHeightValue", "()Ljava/lang/String;", "getCurrentWeightValue", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class HeightWeightGroupedField {
    public static final int $stable = 8;
    private final String currentHeightValue;
    private final String currentWeightValue;
    private final TextResource height;
    private final EditProfileViewState.EditProfileData profileData;
    private final UnitSystem unitSystem;
    private final TextResource weight;

    public HeightWeightGroupedField(UnitSystem unitSystem, TextResource height, TextResource weight, EditProfileViewState.EditProfileData editProfileData, String currentHeightValue, String currentWeightValue) {
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        AbstractC22676k.m65750j(height, "height");
        AbstractC22676k.m65750j(weight, "weight");
        AbstractC22676k.m65750j(currentHeightValue, "currentHeightValue");
        AbstractC22676k.m65750j(currentWeightValue, "currentWeightValue");
        this.unitSystem = unitSystem;
        this.height = height;
        this.weight = weight;
        this.profileData = editProfileData;
        this.currentHeightValue = currentHeightValue;
        this.currentWeightValue = currentWeightValue;
    }

    public static /* synthetic */ HeightWeightGroupedField copy$default(HeightWeightGroupedField heightWeightGroupedField, UnitSystem unitSystem, TextResource textResource, TextResource textResource2, EditProfileViewState.EditProfileData editProfileData, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            unitSystem = heightWeightGroupedField.unitSystem;
        }
        if ((i13 & 2) != 0) {
            textResource = heightWeightGroupedField.height;
        }
        if ((i13 & 4) != 0) {
            textResource2 = heightWeightGroupedField.weight;
        }
        if ((i13 & 8) != 0) {
            editProfileData = heightWeightGroupedField.profileData;
        }
        if ((i13 & 16) != 0) {
            str = heightWeightGroupedField.currentHeightValue;
        }
        if ((i13 & 32) != 0) {
            str2 = heightWeightGroupedField.currentWeightValue;
        }
        String str3 = str;
        String str4 = str2;
        return heightWeightGroupedField.copy(unitSystem, textResource, textResource2, editProfileData, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UnitSystem getUnitSystem() {
        return this.unitSystem;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EditProfileViewState.EditProfileData getProfileData() {
        return this.profileData;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrentHeightValue() {
        return this.currentHeightValue;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCurrentWeightValue() {
        return this.currentWeightValue;
    }

    public final HeightWeightGroupedField copy(UnitSystem unitSystem, TextResource height, TextResource weight, EditProfileViewState.EditProfileData profileData, String currentHeightValue, String currentWeightValue) {
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        AbstractC22676k.m65750j(height, "height");
        AbstractC22676k.m65750j(weight, "weight");
        AbstractC22676k.m65750j(currentHeightValue, "currentHeightValue");
        AbstractC22676k.m65750j(currentWeightValue, "currentWeightValue");
        return new HeightWeightGroupedField(unitSystem, height, weight, profileData, currentHeightValue, currentWeightValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeightWeightGroupedField)) {
            return false;
        }
        HeightWeightGroupedField heightWeightGroupedField = (HeightWeightGroupedField) other;
        return this.unitSystem == heightWeightGroupedField.unitSystem && AbstractC22676k.m65745e(this.height, heightWeightGroupedField.height) && AbstractC22676k.m65745e(this.weight, heightWeightGroupedField.weight) && AbstractC22676k.m65745e(this.profileData, heightWeightGroupedField.profileData) && AbstractC22676k.m65745e(this.currentHeightValue, heightWeightGroupedField.currentHeightValue) && AbstractC22676k.m65745e(this.currentWeightValue, heightWeightGroupedField.currentWeightValue);
    }

    public final String getCurrentHeightValue() {
        return this.currentHeightValue;
    }

    public final String getCurrentWeightValue() {
        return this.currentWeightValue;
    }

    public final TextResource getHeight() {
        return this.height;
    }

    public final EditProfileViewState.EditProfileData getProfileData() {
        return this.profileData;
    }

    public final UnitSystem getUnitSystem() {
        return this.unitSystem;
    }

    public final TextResource getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.unitSystem.hashCode() * 31, this.height, 31), this.weight, 31);
        EditProfileViewState.EditProfileData editProfileData = this.profileData;
        return this.currentWeightValue.hashCode() + AbstractC11266d.m30450d((iM95625a + (editProfileData == null ? 0 : editProfileData.hashCode())) * 31, 31, this.currentHeightValue);
    }

    public String toString() {
        UnitSystem unitSystem = this.unitSystem;
        TextResource textResource = this.height;
        TextResource textResource2 = this.weight;
        EditProfileViewState.EditProfileData editProfileData = this.profileData;
        String str = this.currentHeightValue;
        String str2 = this.currentWeightValue;
        StringBuilder sb4 = new StringBuilder("HeightWeightGroupedField(unitSystem=");
        sb4.append(unitSystem);
        sb4.append(", height=");
        sb4.append(textResource);
        sb4.append(", weight=");
        sb4.append(textResource2);
        sb4.append(", profileData=");
        sb4.append(editProfileData);
        sb4.append(", currentHeightValue=");
        return AbstractC11266d.m30464r(sb4, str, ", currentWeightValue=", str2, ")");
    }
}
