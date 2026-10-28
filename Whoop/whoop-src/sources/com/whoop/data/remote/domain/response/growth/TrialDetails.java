package com.whoop.data.remote.domain.response.growth;

import org.joda.time.LocalDateTime;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/data/remote/domain/response/growth/TrialDetails;", "", "trialCancellationEligible", "", "trialEndDate", "Lorg/joda/time/LocalDateTime;", "<init>", "(ZLorg/joda/time/LocalDateTime;)V", "getTrialCancellationEligible", "()Z", "getTrialEndDate", "()Lorg/joda/time/LocalDateTime;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class TrialDetails {
    private final boolean trialCancellationEligible;
    private final LocalDateTime trialEndDate;

    public TrialDetails(boolean z4, LocalDateTime localDateTime) {
        this.trialCancellationEligible = z4;
        this.trialEndDate = localDateTime;
    }

    public static /* synthetic */ TrialDetails copy$default(TrialDetails trialDetails, boolean z4, LocalDateTime localDateTime, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = trialDetails.trialCancellationEligible;
        }
        if ((i13 & 2) != 0) {
            localDateTime = trialDetails.trialEndDate;
        }
        return trialDetails.copy(z4, localDateTime);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getTrialCancellationEligible() {
        return this.trialCancellationEligible;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LocalDateTime getTrialEndDate() {
        return this.trialEndDate;
    }

    public final TrialDetails copy(boolean trialCancellationEligible, LocalDateTime trialEndDate) {
        return new TrialDetails(trialCancellationEligible, trialEndDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrialDetails)) {
            return false;
        }
        TrialDetails trialDetails = (TrialDetails) other;
        return this.trialCancellationEligible == trialDetails.trialCancellationEligible && AbstractC22676k.m65745e(this.trialEndDate, trialDetails.trialEndDate);
    }

    public final boolean getTrialCancellationEligible() {
        return this.trialCancellationEligible;
    }

    public final LocalDateTime getTrialEndDate() {
        return this.trialEndDate;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.trialCancellationEligible) * 31;
        LocalDateTime localDateTime = this.trialEndDate;
        return iHashCode + (localDateTime == null ? 0 : localDateTime.hashCode());
    }

    public String toString() {
        return "TrialDetails(trialCancellationEligible=" + this.trialCancellationEligible + ", trialEndDate=" + this.trialEndDate + ")";
    }
}
