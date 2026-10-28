package com.whoop.data.remote.domain.dto.growth;

import com.google.gson.annotations.SerializedName;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/growth/SubscriptionInfoDto;", "", "requirePostalCode", "", "header", "", "monthlyPlan", "Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPlanDto;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPlanDto;)V", "getRequirePostalCode", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHeader", "()Ljava/lang/String;", "getMonthlyPlan", "()Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPlanDto;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPlanDto;)Lcom/whoop/data/remote/domain/dto/growth/SubscriptionInfoDto;", "equals", "other", "hashCode", "", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class SubscriptionInfoDto {

    @SerializedName("header")
    private final String header;

    @SerializedName("monthly_plan_footer")
    private final SubscriptionPlanDto monthlyPlan;

    @SerializedName("zip_code_required")
    private final Boolean requirePostalCode;

    public SubscriptionInfoDto(Boolean bool, String str, SubscriptionPlanDto subscriptionPlanDto) {
        this.requirePostalCode = bool;
        this.header = str;
        this.monthlyPlan = subscriptionPlanDto;
    }

    public static /* synthetic */ SubscriptionInfoDto copy$default(SubscriptionInfoDto subscriptionInfoDto, Boolean bool, String str, SubscriptionPlanDto subscriptionPlanDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bool = subscriptionInfoDto.requirePostalCode;
        }
        if ((i13 & 2) != 0) {
            str = subscriptionInfoDto.header;
        }
        if ((i13 & 4) != 0) {
            subscriptionPlanDto = subscriptionInfoDto.monthlyPlan;
        }
        return subscriptionInfoDto.copy(bool, str, subscriptionPlanDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getRequirePostalCode() {
        return this.requirePostalCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SubscriptionPlanDto getMonthlyPlan() {
        return this.monthlyPlan;
    }

    public final SubscriptionInfoDto copy(Boolean requirePostalCode, String header, SubscriptionPlanDto monthlyPlan) {
        return new SubscriptionInfoDto(requirePostalCode, header, monthlyPlan);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionInfoDto)) {
            return false;
        }
        SubscriptionInfoDto subscriptionInfoDto = (SubscriptionInfoDto) other;
        return AbstractC22676k.m65745e(this.requirePostalCode, subscriptionInfoDto.requirePostalCode) && AbstractC22676k.m65745e(this.header, subscriptionInfoDto.header) && AbstractC22676k.m65745e(this.monthlyPlan, subscriptionInfoDto.monthlyPlan);
    }

    public final String getHeader() {
        return this.header;
    }

    public final SubscriptionPlanDto getMonthlyPlan() {
        return this.monthlyPlan;
    }

    public final Boolean getRequirePostalCode() {
        return this.requirePostalCode;
    }

    public int hashCode() {
        Boolean bool = this.requirePostalCode;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.header;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SubscriptionPlanDto subscriptionPlanDto = this.monthlyPlan;
        return iHashCode2 + (subscriptionPlanDto != null ? subscriptionPlanDto.hashCode() : 0);
    }

    public String toString() {
        return "SubscriptionInfoDto(requirePostalCode=" + this.requirePostalCode + ", header=" + this.header + ", monthlyPlan=" + this.monthlyPlan + ")";
    }
}
