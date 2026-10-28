package com.whoop.data.remote.domain.response.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.data.remote.domain.dto.onboarding.OnboardingPairedTextOverride;
import com.whoop.data.remote.domain.dto.onboarding.OnboardingTeamInfo;
import ih0.AbstractC18489d0;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\fHÂ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b!\u0010\"JZ\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b(\u0010\u0011J\u001a\u0010+\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b\u0005\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00106R\u0017\u00107\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b7\u00106\u001a\u0004\b8\u0010\u0011¨\u00069"}, m65681d2 = {"Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;", "Landroid/os/Parcelable;", "", "requireCreditCard", "requireTeamCode", "isUsedStrap", "Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;", "strapMembershipStatus", "Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;", "teamInfo", "Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;", "pairedTextOverride", "", "numTrialMonths", "<init>", "(ZZZLcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;I)V", "component7", "()I", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", "component2", "component3", "component4", "()Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;", "component5", "()Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;", "component6", "()Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;", "copy", "(ZZZLcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;I)Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getRequireCreditCard", "getRequireTeamCode", "Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;", "getStrapMembershipStatus", "Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;", "getTeamInfo", "Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;", "getPairedTextOverride", "I", "numScooterTrialMonths", "getNumScooterTrialMonths", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class OnboardingInfo implements Parcelable {
    public static final Parcelable.Creator<OnboardingInfo> CREATOR = new Creator();
    private final boolean isUsedStrap;
    private final int numScooterTrialMonths;
    private final int numTrialMonths;
    private final OnboardingPairedTextOverride pairedTextOverride;
    private final boolean requireCreditCard;
    private final boolean requireTeamCode;
    private final StrapMembershipStatus strapMembershipStatus;
    private final OnboardingTeamInfo teamInfo;

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<OnboardingInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OnboardingInfo createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            boolean z4 = false;
            boolean z13 = true;
            if (parcel.readInt() != 0) {
                z4 = true;
            }
            if (parcel.readInt() == 0) {
                z13 = z4;
            }
            return new OnboardingInfo(z4, z13, parcel.readInt() != 0, StrapMembershipStatus.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : OnboardingTeamInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? OnboardingPairedTextOverride.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OnboardingInfo[] newArray(int i13) {
            return new OnboardingInfo[i13];
        }
    }

    public OnboardingInfo(boolean z4, boolean z13, boolean z14, StrapMembershipStatus strapMembershipStatus, OnboardingTeamInfo onboardingTeamInfo, OnboardingPairedTextOverride onboardingPairedTextOverride, int i13) {
        AbstractC22676k.m65750j(strapMembershipStatus, "strapMembershipStatus");
        this.requireCreditCard = z4;
        this.requireTeamCode = z13;
        this.isUsedStrap = z14;
        this.strapMembershipStatus = strapMembershipStatus;
        this.teamInfo = onboardingTeamInfo;
        this.pairedTextOverride = onboardingPairedTextOverride;
        this.numTrialMonths = i13;
        this.numScooterTrialMonths = (!z14 || strapMembershipStatus == StrapMembershipStatus.ELITE || strapMembershipStatus == StrapMembershipStatus.ELITE_GIFT) ? 0 : i13;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    private final int getNumTrialMonths() {
        return this.numTrialMonths;
    }

    public static /* synthetic */ OnboardingInfo copy$default(OnboardingInfo onboardingInfo, boolean z4, boolean z13, boolean z14, StrapMembershipStatus strapMembershipStatus, OnboardingTeamInfo onboardingTeamInfo, OnboardingPairedTextOverride onboardingPairedTextOverride, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z4 = onboardingInfo.requireCreditCard;
        }
        if ((i14 & 2) != 0) {
            z13 = onboardingInfo.requireTeamCode;
        }
        if ((i14 & 4) != 0) {
            z14 = onboardingInfo.isUsedStrap;
        }
        if ((i14 & 8) != 0) {
            strapMembershipStatus = onboardingInfo.strapMembershipStatus;
        }
        if ((i14 & 16) != 0) {
            onboardingTeamInfo = onboardingInfo.teamInfo;
        }
        if ((i14 & 32) != 0) {
            onboardingPairedTextOverride = onboardingInfo.pairedTextOverride;
        }
        if ((i14 & 64) != 0) {
            i13 = onboardingInfo.numTrialMonths;
        }
        OnboardingPairedTextOverride onboardingPairedTextOverride2 = onboardingPairedTextOverride;
        int i15 = i13;
        OnboardingTeamInfo onboardingTeamInfo2 = onboardingTeamInfo;
        boolean z15 = z14;
        return onboardingInfo.copy(z4, z13, z15, strapMembershipStatus, onboardingTeamInfo2, onboardingPairedTextOverride2, i15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getRequireCreditCard() {
        return this.requireCreditCard;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getRequireTeamCode() {
        return this.requireTeamCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsUsedStrap() {
        return this.isUsedStrap;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final StrapMembershipStatus getStrapMembershipStatus() {
        return this.strapMembershipStatus;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OnboardingTeamInfo getTeamInfo() {
        return this.teamInfo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final OnboardingPairedTextOverride getPairedTextOverride() {
        return this.pairedTextOverride;
    }

    public final OnboardingInfo copy(boolean requireCreditCard, boolean requireTeamCode, boolean isUsedStrap, StrapMembershipStatus strapMembershipStatus, OnboardingTeamInfo teamInfo, OnboardingPairedTextOverride pairedTextOverride, int numTrialMonths) {
        AbstractC22676k.m65750j(strapMembershipStatus, "strapMembershipStatus");
        return new OnboardingInfo(requireCreditCard, requireTeamCode, isUsedStrap, strapMembershipStatus, teamInfo, pairedTextOverride, numTrialMonths);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingInfo)) {
            return false;
        }
        OnboardingInfo onboardingInfo = (OnboardingInfo) other;
        return this.requireCreditCard == onboardingInfo.requireCreditCard && this.requireTeamCode == onboardingInfo.requireTeamCode && this.isUsedStrap == onboardingInfo.isUsedStrap && this.strapMembershipStatus == onboardingInfo.strapMembershipStatus && AbstractC22676k.m65745e(this.teamInfo, onboardingInfo.teamInfo) && AbstractC22676k.m65745e(this.pairedTextOverride, onboardingInfo.pairedTextOverride) && this.numTrialMonths == onboardingInfo.numTrialMonths;
    }

    public final int getNumScooterTrialMonths() {
        return this.numScooterTrialMonths;
    }

    public final OnboardingPairedTextOverride getPairedTextOverride() {
        return this.pairedTextOverride;
    }

    public final boolean getRequireCreditCard() {
        return this.requireCreditCard;
    }

    public final boolean getRequireTeamCode() {
        return this.requireTeamCode;
    }

    public final StrapMembershipStatus getStrapMembershipStatus() {
        return this.strapMembershipStatus;
    }

    public final OnboardingTeamInfo getTeamInfo() {
        return this.teamInfo;
    }

    public int hashCode() {
        int iHashCode = (this.strapMembershipStatus.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.requireCreditCard) * 31, 31, this.requireTeamCode), 31, this.isUsedStrap)) * 31;
        OnboardingTeamInfo onboardingTeamInfo = this.teamInfo;
        int iHashCode2 = (iHashCode + (onboardingTeamInfo == null ? 0 : onboardingTeamInfo.hashCode())) * 31;
        OnboardingPairedTextOverride onboardingPairedTextOverride = this.pairedTextOverride;
        return Integer.hashCode(this.numTrialMonths) + ((iHashCode2 + (onboardingPairedTextOverride != null ? onboardingPairedTextOverride.hashCode() : 0)) * 31);
    }

    public final boolean isUsedStrap() {
        return this.isUsedStrap;
    }

    public String toString() {
        boolean z4 = this.requireCreditCard;
        boolean z13 = this.requireTeamCode;
        boolean z14 = this.isUsedStrap;
        StrapMembershipStatus strapMembershipStatus = this.strapMembershipStatus;
        OnboardingTeamInfo onboardingTeamInfo = this.teamInfo;
        OnboardingPairedTextOverride onboardingPairedTextOverride = this.pairedTextOverride;
        int i13 = this.numTrialMonths;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("OnboardingInfo(requireCreditCard=", ", requireTeamCode=", ", isUsedStrap=", z4, z13);
        sbM32002u.append(z14);
        sbM32002u.append(", strapMembershipStatus=");
        sbM32002u.append(strapMembershipStatus);
        sbM32002u.append(", teamInfo=");
        sbM32002u.append(onboardingTeamInfo);
        sbM32002u.append(", pairedTextOverride=");
        sbM32002u.append(onboardingPairedTextOverride);
        sbM32002u.append(", numTrialMonths=");
        return AbstractC18489d0.m53371l(sbM32002u, i13, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.requireCreditCard ? 1 : 0);
        dest.writeInt(this.requireTeamCode ? 1 : 0);
        dest.writeInt(this.isUsedStrap ? 1 : 0);
        dest.writeString(this.strapMembershipStatus.name());
        OnboardingTeamInfo onboardingTeamInfo = this.teamInfo;
        if (onboardingTeamInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            onboardingTeamInfo.writeToParcel(dest, flags);
        }
        OnboardingPairedTextOverride onboardingPairedTextOverride = this.pairedTextOverride;
        if (onboardingPairedTextOverride == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            onboardingPairedTextOverride.writeToParcel(dest, flags);
        }
        dest.writeInt(this.numTrialMonths);
    }
}
