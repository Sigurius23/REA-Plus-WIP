package com.whoop.data.remote.domain.dto.growth;

import com.google.gson.annotations.SerializedName;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPlanDto;", "", "footer", "", "<init>", "(Ljava/lang/String;)V", "getFooter", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class SubscriptionPlanDto {

    @SerializedName("footer")
    private final String footer;

    public SubscriptionPlanDto(String str) {
        this.footer = str;
    }

    public static /* synthetic */ SubscriptionPlanDto copy$default(SubscriptionPlanDto subscriptionPlanDto, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = subscriptionPlanDto.footer;
        }
        return subscriptionPlanDto.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFooter() {
        return this.footer;
    }

    public final SubscriptionPlanDto copy(String footer) {
        return new SubscriptionPlanDto(footer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SubscriptionPlanDto) && AbstractC22676k.m65745e(this.footer, ((SubscriptionPlanDto) other).footer);
    }

    public final String getFooter() {
        return this.footer;
    }

    public int hashCode() {
        String str = this.footer;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return AbstractC11895b.m31996o("SubscriptionPlanDto(footer=", this.footer, ")");
    }
}
