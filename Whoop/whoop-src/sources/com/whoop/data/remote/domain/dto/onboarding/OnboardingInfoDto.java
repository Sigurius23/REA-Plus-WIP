package com.whoop.data.remote.domain.dto.onboarding;

import com.google.gson.annotations.SerializedName;
import com.whoop.data.remote.domain.response.onboarding.OnboardingInfo;
import com.whoop.data.remote.domain.response.onboarding.StrapMembershipStatus;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB_\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b*\u0010+Jb\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b.\u0010%J\u0010\u0010/\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b/\u0010+J\u001a\u00101\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010!R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b\u0005\u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010%R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00108\u0012\u0004\b:\u0010;\u001a\u0004\b9\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010)R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010+¨\u0006B"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;", "", "", "requireCreditCard", "requireTeamCode", "isUsedStrap", "", "strapMembershipStatus", "Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;", "teamInfo", "Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;", "pairedTextOverride", "", "numTrialMonths", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;", "toOnboardingInfoResponse", "()Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "component4", "()Ljava/lang/String;", "component5", "()Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;", "component6", "()Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;", "component7", "()I", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;I)Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getRequireCreditCard", "getRequireTeamCode", "Ljava/lang/String;", "getStrapMembershipStatus", "Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;", "getTeamInfo", "getTeamInfo$annotations", "()V", "Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;", "getPairedTextOverride", "I", "getNumTrialMonths", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class OnboardingInfoDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("is_used_strap")
    private final Boolean isUsedStrap;

    @SerializedName("num_trial_months")
    private final int numTrialMonths;

    @SerializedName("paired_text_override")
    private final OnboardingPairedTextOverrideDto pairedTextOverride;

    @SerializedName("require_credit_card")
    private final Boolean requireCreditCard;

    @SerializedName("require_team_code")
    private final Boolean requireTeamCode;

    @SerializedName("strap_membership_status")
    private final String strapMembershipStatus;

    @SerializedName("team")
    private final OnboardingTeamInfoDto teamInfo;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return OnboardingInfoDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ OnboardingInfoDto(int i13, Boolean bool, Boolean bool2, Boolean bool3, String str, OnboardingTeamInfoDto onboardingTeamInfoDto, OnboardingPairedTextOverrideDto onboardingPairedTextOverrideDto, int i14, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, OnboardingInfoDto$$serializer.INSTANCE.getDescriptor());
        }
        this.requireCreditCard = bool;
        this.requireTeamCode = bool2;
        this.isUsedStrap = bool3;
        this.strapMembershipStatus = str;
        this.teamInfo = onboardingTeamInfoDto;
        this.pairedTextOverride = onboardingPairedTextOverrideDto;
        if ((i13 & 64) == 0) {
            this.numTrialMonths = 0;
        } else {
            this.numTrialMonths = i14;
        }
    }

    public static /* synthetic */ OnboardingInfoDto copy$default(OnboardingInfoDto onboardingInfoDto, Boolean bool, Boolean bool2, Boolean bool3, String str, OnboardingTeamInfoDto onboardingTeamInfoDto, OnboardingPairedTextOverrideDto onboardingPairedTextOverrideDto, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            bool = onboardingInfoDto.requireCreditCard;
        }
        if ((i14 & 2) != 0) {
            bool2 = onboardingInfoDto.requireTeamCode;
        }
        if ((i14 & 4) != 0) {
            bool3 = onboardingInfoDto.isUsedStrap;
        }
        if ((i14 & 8) != 0) {
            str = onboardingInfoDto.strapMembershipStatus;
        }
        if ((i14 & 16) != 0) {
            onboardingTeamInfoDto = onboardingInfoDto.teamInfo;
        }
        if ((i14 & 32) != 0) {
            onboardingPairedTextOverrideDto = onboardingInfoDto.pairedTextOverride;
        }
        if ((i14 & 64) != 0) {
            i13 = onboardingInfoDto.numTrialMonths;
        }
        OnboardingPairedTextOverrideDto onboardingPairedTextOverrideDto2 = onboardingPairedTextOverrideDto;
        int i15 = i13;
        OnboardingTeamInfoDto onboardingTeamInfoDto2 = onboardingTeamInfoDto;
        Boolean bool4 = bool3;
        return onboardingInfoDto.copy(bool, bool2, bool4, str, onboardingTeamInfoDto2, onboardingPairedTextOverrideDto2, i15);
    }

    @InterfaceC37143h("team")
    public static /* synthetic */ void getTeamInfo$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_release(OnboardingInfoDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, booleanSerializer, self.requireCreditCard);
        output.encodeNullableSerializableElement(serialDesc, 1, booleanSerializer, self.requireTeamCode);
        output.encodeNullableSerializableElement(serialDesc, 2, booleanSerializer, self.isUsedStrap);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.strapMembershipStatus);
        output.encodeNullableSerializableElement(serialDesc, 4, OnboardingTeamInfoDto$$serializer.INSTANCE, self.teamInfo);
        output.encodeNullableSerializableElement(serialDesc, 5, OnboardingPairedTextOverrideDto$$serializer.INSTANCE, self.pairedTextOverride);
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.numTrialMonths == 0) {
            return;
        }
        output.encodeIntElement(serialDesc, 6, self.numTrialMonths);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getRequireCreditCard() {
        return this.requireCreditCard;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getRequireTeamCode() {
        return this.requireTeamCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsUsedStrap() {
        return this.isUsedStrap;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStrapMembershipStatus() {
        return this.strapMembershipStatus;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OnboardingTeamInfoDto getTeamInfo() {
        return this.teamInfo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final OnboardingPairedTextOverrideDto getPairedTextOverride() {
        return this.pairedTextOverride;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getNumTrialMonths() {
        return this.numTrialMonths;
    }

    public final OnboardingInfoDto copy(Boolean requireCreditCard, Boolean requireTeamCode, Boolean isUsedStrap, String strapMembershipStatus, OnboardingTeamInfoDto teamInfo, OnboardingPairedTextOverrideDto pairedTextOverride, int numTrialMonths) {
        return new OnboardingInfoDto(requireCreditCard, requireTeamCode, isUsedStrap, strapMembershipStatus, teamInfo, pairedTextOverride, numTrialMonths);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingInfoDto)) {
            return false;
        }
        OnboardingInfoDto onboardingInfoDto = (OnboardingInfoDto) other;
        return AbstractC22676k.m65745e(this.requireCreditCard, onboardingInfoDto.requireCreditCard) && AbstractC22676k.m65745e(this.requireTeamCode, onboardingInfoDto.requireTeamCode) && AbstractC22676k.m65745e(this.isUsedStrap, onboardingInfoDto.isUsedStrap) && AbstractC22676k.m65745e(this.strapMembershipStatus, onboardingInfoDto.strapMembershipStatus) && AbstractC22676k.m65745e(this.teamInfo, onboardingInfoDto.teamInfo) && AbstractC22676k.m65745e(this.pairedTextOverride, onboardingInfoDto.pairedTextOverride) && this.numTrialMonths == onboardingInfoDto.numTrialMonths;
    }

    public final int getNumTrialMonths() {
        return this.numTrialMonths;
    }

    public final OnboardingPairedTextOverrideDto getPairedTextOverride() {
        return this.pairedTextOverride;
    }

    public final Boolean getRequireCreditCard() {
        return this.requireCreditCard;
    }

    public final Boolean getRequireTeamCode() {
        return this.requireTeamCode;
    }

    public final String getStrapMembershipStatus() {
        return this.strapMembershipStatus;
    }

    public final OnboardingTeamInfoDto getTeamInfo() {
        return this.teamInfo;
    }

    public int hashCode() {
        Boolean bool = this.requireCreditCard;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.requireTeamCode;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isUsedStrap;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.strapMembershipStatus;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        OnboardingTeamInfoDto onboardingTeamInfoDto = this.teamInfo;
        int iHashCode5 = (iHashCode4 + (onboardingTeamInfoDto == null ? 0 : onboardingTeamInfoDto.hashCode())) * 31;
        OnboardingPairedTextOverrideDto onboardingPairedTextOverrideDto = this.pairedTextOverride;
        return Integer.hashCode(this.numTrialMonths) + ((iHashCode5 + (onboardingPairedTextOverrideDto != null ? onboardingPairedTextOverrideDto.hashCode() : 0)) * 31);
    }

    public final Boolean isUsedStrap() {
        return this.isUsedStrap;
    }

    public final OnboardingInfo toOnboardingInfoResponse() {
        Boolean bool = this.requireCreditCard;
        AbstractC22676k.m65747g(bool);
        boolean zBooleanValue = bool.booleanValue();
        Boolean bool2 = this.requireTeamCode;
        AbstractC22676k.m65747g(bool2);
        boolean zBooleanValue2 = bool2.booleanValue();
        Boolean bool3 = this.isUsedStrap;
        AbstractC22676k.m65747g(bool3);
        boolean zBooleanValue3 = bool3.booleanValue();
        StrapMembershipStatus strapMembershipStatusFromStringOrDefault = StrapMembershipStatus.INSTANCE.fromStringOrDefault(this.strapMembershipStatus);
        OnboardingTeamInfoDto onboardingTeamInfoDto = this.teamInfo;
        OnboardingTeamInfo onboardingTeamInfo = onboardingTeamInfoDto != null ? onboardingTeamInfoDto.toOnboardingTeamInfo() : null;
        OnboardingPairedTextOverrideDto onboardingPairedTextOverrideDto = this.pairedTextOverride;
        return new OnboardingInfo(zBooleanValue, zBooleanValue2, zBooleanValue3, strapMembershipStatusFromStringOrDefault, onboardingTeamInfo, onboardingPairedTextOverrideDto != null ? onboardingPairedTextOverrideDto.toOnboardingPairedTextOverride() : null, this.numTrialMonths);
    }

    public String toString() {
        Boolean bool = this.requireCreditCard;
        Boolean bool2 = this.requireTeamCode;
        Boolean bool3 = this.isUsedStrap;
        String str = this.strapMembershipStatus;
        OnboardingTeamInfoDto onboardingTeamInfoDto = this.teamInfo;
        OnboardingPairedTextOverrideDto onboardingPairedTextOverrideDto = this.pairedTextOverride;
        int i13 = this.numTrialMonths;
        StringBuilder sb4 = new StringBuilder("OnboardingInfoDto(requireCreditCard=");
        sb4.append(bool);
        sb4.append(", requireTeamCode=");
        sb4.append(bool2);
        sb4.append(", isUsedStrap=");
        AbstractC13673n.m38576w(bool3, ", strapMembershipStatus=", str, ", teamInfo=", sb4);
        sb4.append(onboardingTeamInfoDto);
        sb4.append(", pairedTextOverride=");
        sb4.append(onboardingPairedTextOverrideDto);
        sb4.append(", numTrialMonths=");
        return AbstractC18489d0.m53371l(sb4, i13, ")");
    }

    public OnboardingInfoDto(Boolean bool, Boolean bool2, Boolean bool3, String str, OnboardingTeamInfoDto onboardingTeamInfoDto, OnboardingPairedTextOverrideDto onboardingPairedTextOverrideDto, int i13) {
        this.requireCreditCard = bool;
        this.requireTeamCode = bool2;
        this.isUsedStrap = bool3;
        this.strapMembershipStatus = str;
        this.teamInfo = onboardingTeamInfoDto;
        this.pairedTextOverride = onboardingPairedTextOverrideDto;
        this.numTrialMonths = i13;
    }

    public /* synthetic */ OnboardingInfoDto(Boolean bool, Boolean bool2, Boolean bool3, String str, OnboardingTeamInfoDto onboardingTeamInfoDto, OnboardingPairedTextOverrideDto onboardingPairedTextOverrideDto, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, bool2, bool3, str, onboardingTeamInfoDto, onboardingPairedTextOverrideDto, (i14 & 64) != 0 ? 0 : i13);
    }
}
