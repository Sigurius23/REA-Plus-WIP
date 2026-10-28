package com.whoop.data.remote.domain.response.growth;

import com.whoop.p069ui.AbstractC10538f;
import org.joda.time.LocalDateTime;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0007HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m65681d2 = {"Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;", "", "membershipStatus", "Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;", "checkoutOrigin", "Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;", "nextBillDateTimestamp", "", "<init>", "(Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;Ljava/lang/String;)V", "getMembershipStatus", "()Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;", "getCheckoutOrigin", "()Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;", "getNextBillDateTimestamp", "()Ljava/lang/String;", "nextBillDateTime", "Lorg/joda/time/LocalDateTime;", "getNextBillDateTime", "()Lorg/joda/time/LocalDateTime;", "isPayingMember", "", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class MembershipInfo {
    private final CheckoutOrigin checkoutOrigin;
    private final MembershipStatus membershipStatus;
    private final String nextBillDateTimestamp;

    public MembershipInfo(MembershipStatus membershipStatus, CheckoutOrigin checkoutOrigin, String str) {
        AbstractC22676k.m65750j(membershipStatus, "membershipStatus");
        AbstractC22676k.m65750j(checkoutOrigin, "checkoutOrigin");
        this.membershipStatus = membershipStatus;
        this.checkoutOrigin = checkoutOrigin;
        this.nextBillDateTimestamp = str;
    }

    public static /* synthetic */ MembershipInfo copy$default(MembershipInfo membershipInfo, MembershipStatus membershipStatus, CheckoutOrigin checkoutOrigin, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            membershipStatus = membershipInfo.membershipStatus;
        }
        if ((i13 & 2) != 0) {
            checkoutOrigin = membershipInfo.checkoutOrigin;
        }
        if ((i13 & 4) != 0) {
            str = membershipInfo.nextBillDateTimestamp;
        }
        return membershipInfo.copy(membershipStatus, checkoutOrigin, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MembershipStatus getMembershipStatus() {
        return this.membershipStatus;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CheckoutOrigin getCheckoutOrigin() {
        return this.checkoutOrigin;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNextBillDateTimestamp() {
        return this.nextBillDateTimestamp;
    }

    public final MembershipInfo copy(MembershipStatus membershipStatus, CheckoutOrigin checkoutOrigin, String nextBillDateTimestamp) {
        AbstractC22676k.m65750j(membershipStatus, "membershipStatus");
        AbstractC22676k.m65750j(checkoutOrigin, "checkoutOrigin");
        return new MembershipInfo(membershipStatus, checkoutOrigin, nextBillDateTimestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MembershipInfo)) {
            return false;
        }
        MembershipInfo membershipInfo = (MembershipInfo) other;
        return this.membershipStatus == membershipInfo.membershipStatus && this.checkoutOrigin == membershipInfo.checkoutOrigin && AbstractC22676k.m65745e(this.nextBillDateTimestamp, membershipInfo.nextBillDateTimestamp);
    }

    public final CheckoutOrigin getCheckoutOrigin() {
        return this.checkoutOrigin;
    }

    public final MembershipStatus getMembershipStatus() {
        return this.membershipStatus;
    }

    public final LocalDateTime getNextBillDateTime() {
        try {
            String str = this.nextBillDateTimestamp;
            if (str != null && !AbstractC39414r.m125890i0(str)) {
                return AbstractC10538f.m27189n(this.nextBillDateTimestamp);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public final String getNextBillDateTimestamp() {
        return this.nextBillDateTimestamp;
    }

    public int hashCode() {
        int iHashCode = (this.checkoutOrigin.hashCode() + (this.membershipStatus.hashCode() * 31)) * 31;
        String str = this.nextBillDateTimestamp;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean isPayingMember() {
        return this.membershipStatus.isPayingMember();
    }

    public String toString() {
        MembershipStatus membershipStatus = this.membershipStatus;
        CheckoutOrigin checkoutOrigin = this.checkoutOrigin;
        String str = this.nextBillDateTimestamp;
        StringBuilder sb4 = new StringBuilder("MembershipInfo(membershipStatus=");
        sb4.append(membershipStatus);
        sb4.append(", checkoutOrigin=");
        sb4.append(checkoutOrigin);
        sb4.append(", nextBillDateTimestamp=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }
}
