package com.whoop.profile.view.edit.form;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.presentation.edit.EditProfileViewState;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006\""}, m65681d2 = {"Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;", "", "type", "Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;", "labelRes", "", "value", "Lcom/whoop/design/util/TextResource;", "isVisible", "", "isError", "errorMessage", "<init>", "(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;ILcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;)V", "getType", "()Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;", "getLabelRes", "()I", "getValue", "()Lcom/whoop/design/util/TextResource;", "()Z", "getErrorMessage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ClickableFieldConfig {
    public static final int $stable = TextResource.$stable;
    private final TextResource errorMessage;
    private final boolean isError;
    private final boolean isVisible;
    private final int labelRes;
    private final EditProfileViewState.BottomSheetType type;
    private final TextResource value;

    public ClickableFieldConfig(EditProfileViewState.BottomSheetType type, int i13, TextResource value, boolean z4, boolean z13, TextResource errorMessage) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        this.type = type;
        this.labelRes = i13;
        this.value = value;
        this.isVisible = z4;
        this.isError = z13;
        this.errorMessage = errorMessage;
    }

    public static /* synthetic */ ClickableFieldConfig copy$default(ClickableFieldConfig clickableFieldConfig, EditProfileViewState.BottomSheetType bottomSheetType, int i13, TextResource textResource, boolean z4, boolean z13, TextResource textResource2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            bottomSheetType = clickableFieldConfig.type;
        }
        if ((i14 & 2) != 0) {
            i13 = clickableFieldConfig.labelRes;
        }
        if ((i14 & 4) != 0) {
            textResource = clickableFieldConfig.value;
        }
        if ((i14 & 8) != 0) {
            z4 = clickableFieldConfig.isVisible;
        }
        if ((i14 & 16) != 0) {
            z13 = clickableFieldConfig.isError;
        }
        if ((i14 & 32) != 0) {
            textResource2 = clickableFieldConfig.errorMessage;
        }
        boolean z14 = z13;
        TextResource textResource3 = textResource2;
        return clickableFieldConfig.copy(bottomSheetType, i13, textResource, z4, z14, textResource3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EditProfileViewState.BottomSheetType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLabelRes() {
        return this.labelRes;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TextResource getErrorMessage() {
        return this.errorMessage;
    }

    public final ClickableFieldConfig copy(EditProfileViewState.BottomSheetType type, int labelRes, TextResource value, boolean isVisible, boolean isError, TextResource errorMessage) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(errorMessage, "errorMessage");
        return new ClickableFieldConfig(type, labelRes, value, isVisible, isError, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClickableFieldConfig)) {
            return false;
        }
        ClickableFieldConfig clickableFieldConfig = (ClickableFieldConfig) other;
        return this.type == clickableFieldConfig.type && this.labelRes == clickableFieldConfig.labelRes && AbstractC22676k.m65745e(this.value, clickableFieldConfig.value) && this.isVisible == clickableFieldConfig.isVisible && this.isError == clickableFieldConfig.isError && AbstractC22676k.m65745e(this.errorMessage, clickableFieldConfig.errorMessage);
    }

    public final TextResource getErrorMessage() {
        return this.errorMessage;
    }

    public final int getLabelRes() {
        return this.labelRes;
    }

    public final EditProfileViewState.BottomSheetType getType() {
        return this.type;
    }

    public final TextResource getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.errorMessage.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC31061c.m95625a(AbstractC11266d.m30448b(this.labelRes, this.type.hashCode() * 31, 31), this.value, 31), 31, this.isVisible), 31, this.isError);
    }

    public final boolean isError() {
        return this.isError;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public String toString() {
        EditProfileViewState.BottomSheetType bottomSheetType = this.type;
        int i13 = this.labelRes;
        TextResource textResource = this.value;
        boolean z4 = this.isVisible;
        boolean z13 = this.isError;
        TextResource textResource2 = this.errorMessage;
        StringBuilder sb4 = new StringBuilder("ClickableFieldConfig(type=");
        sb4.append(bottomSheetType);
        sb4.append(", labelRes=");
        sb4.append(i13);
        sb4.append(", value=");
        AbstractC33745d.m106664w(textResource, ", isVisible=", ", isError=", sb4, z4);
        sb4.append(z13);
        sb4.append(", errorMessage=");
        sb4.append(textResource2);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ ClickableFieldConfig(EditProfileViewState.BottomSheetType bottomSheetType, int i13, TextResource textResource, boolean z4, boolean z13, TextResource textResource2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(bottomSheetType, i13, textResource, (i14 & 8) != 0 ? true : z4, (i14 & 16) != 0 ? false : z13, (i14 & 32) != 0 ? AbstractC8693b.m21267a() : textResource2);
    }
}
