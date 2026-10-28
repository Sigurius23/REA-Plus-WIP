package com.whoop.data.remote.domain.response.growth;

import androidx.core.app.NotificationCompat;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/data/remote/domain/response/growth/MembershipAffiliate;", "", "type", "Lcom/whoop/data/remote/domain/response/growth/AffiliateType;", NotificationCompat.CATEGORY_STATUS, "Lcom/whoop/data/remote/domain/response/growth/AffiliateStatus;", "<init>", "(Lcom/whoop/data/remote/domain/response/growth/AffiliateType;Lcom/whoop/data/remote/domain/response/growth/AffiliateStatus;)V", "getType", "()Lcom/whoop/data/remote/domain/response/growth/AffiliateType;", "getStatus", "()Lcom/whoop/data/remote/domain/response/growth/AffiliateStatus;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class MembershipAffiliate {
    private final AffiliateStatus status;
    private final AffiliateType type;

    public MembershipAffiliate(AffiliateType type, AffiliateStatus affiliateStatus) {
        AbstractC22676k.m65750j(type, "type");
        this.type = type;
        this.status = affiliateStatus;
    }

    public static /* synthetic */ MembershipAffiliate copy$default(MembershipAffiliate membershipAffiliate, AffiliateType affiliateType, AffiliateStatus affiliateStatus, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            affiliateType = membershipAffiliate.type;
        }
        if ((i13 & 2) != 0) {
            affiliateStatus = membershipAffiliate.status;
        }
        return membershipAffiliate.copy(affiliateType, affiliateStatus);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AffiliateType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AffiliateStatus getStatus() {
        return this.status;
    }

    public final MembershipAffiliate copy(AffiliateType type, AffiliateStatus status) {
        AbstractC22676k.m65750j(type, "type");
        return new MembershipAffiliate(type, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MembershipAffiliate)) {
            return false;
        }
        MembershipAffiliate membershipAffiliate = (MembershipAffiliate) other;
        return this.type == membershipAffiliate.type && this.status == membershipAffiliate.status;
    }

    public final AffiliateStatus getStatus() {
        return this.status;
    }

    public final AffiliateType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        AffiliateStatus affiliateStatus = this.status;
        return iHashCode + (affiliateStatus == null ? 0 : affiliateStatus.hashCode());
    }

    public String toString() {
        return "MembershipAffiliate(type=" + this.type + ", status=" + this.status + ")";
    }
}
