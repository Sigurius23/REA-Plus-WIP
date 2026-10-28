package io.getstream.chat.android.models;

import com.whoop.service.network.model.UserState;
import hc3.AbstractC17176i;
import java.util.Date;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003Jw\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010+\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001b¨\u00060"}, m65681d2 = {"Lio/getstream/chat/android/models/Flag;", "", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "targetUser", "targetMessageId", "", "reviewedBy", "createdByAutomod", "", "createdAt", "Ljava/util/Date;", "updatedAt", "reviewedAt", "approvedAt", "rejectedAt", "<init>", "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V", "getUser", "()Lio/getstream/chat/android/models/User;", "getTargetUser", "getTargetMessageId", "()Ljava/lang/String;", "getReviewedBy", "getCreatedByAutomod", "()Z", "getCreatedAt", "()Ljava/util/Date;", "getUpdatedAt", "getReviewedAt", "getApprovedAt", "getRejectedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class Flag {
    private final Date approvedAt;
    private final Date createdAt;
    private final boolean createdByAutomod;
    private final Date rejectedAt;
    private final Date reviewedAt;
    private final String reviewedBy;
    private final String targetMessageId;
    private final User targetUser;
    private final Date updatedAt;
    private final User user;

    public Flag(User user, User user2, String targetMessageId, String reviewedBy, boolean z4, Date date, Date updatedAt, Date date2, Date date3, Date date4) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(targetMessageId, "targetMessageId");
        AbstractC22676k.m65750j(reviewedBy, "reviewedBy");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        this.user = user;
        this.targetUser = user2;
        this.targetMessageId = targetMessageId;
        this.reviewedBy = reviewedBy;
        this.createdByAutomod = z4;
        this.createdAt = date;
        this.updatedAt = updatedAt;
        this.reviewedAt = date2;
        this.approvedAt = date3;
        this.rejectedAt = date4;
    }

    public static /* synthetic */ Flag copy$default(Flag flag, User user, User user2, String str, String str2, boolean z4, Date date, Date date2, Date date3, Date date4, Date date5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            user = flag.user;
        }
        if ((i13 & 2) != 0) {
            user2 = flag.targetUser;
        }
        if ((i13 & 4) != 0) {
            str = flag.targetMessageId;
        }
        if ((i13 & 8) != 0) {
            str2 = flag.reviewedBy;
        }
        if ((i13 & 16) != 0) {
            z4 = flag.createdByAutomod;
        }
        if ((i13 & 32) != 0) {
            date = flag.createdAt;
        }
        if ((i13 & 64) != 0) {
            date2 = flag.updatedAt;
        }
        if ((i13 & 128) != 0) {
            date3 = flag.reviewedAt;
        }
        if ((i13 & 256) != 0) {
            date4 = flag.approvedAt;
        }
        if ((i13 & 512) != 0) {
            date5 = flag.rejectedAt;
        }
        Date date6 = date4;
        Date date7 = date5;
        Date date8 = date2;
        Date date9 = date3;
        boolean z13 = z4;
        Date date10 = date;
        return flag.copy(user, user2, str, str2, z13, date10, date8, date9, date6, date7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Date getRejectedAt() {
        return this.rejectedAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final User getTargetUser() {
        return this.targetUser;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTargetMessageId() {
        return this.targetMessageId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReviewedBy() {
        return this.reviewedBy;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getCreatedByAutomod() {
        return this.createdByAutomod;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Date getReviewedAt() {
        return this.reviewedAt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Date getApprovedAt() {
        return this.approvedAt;
    }

    public final Flag copy(User user, User targetUser, String targetMessageId, String reviewedBy, boolean createdByAutomod, Date createdAt, Date updatedAt, Date reviewedAt, Date approvedAt, Date rejectedAt) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(targetMessageId, "targetMessageId");
        AbstractC22676k.m65750j(reviewedBy, "reviewedBy");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        return new Flag(user, targetUser, targetMessageId, reviewedBy, createdByAutomod, createdAt, updatedAt, reviewedAt, approvedAt, rejectedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Flag)) {
            return false;
        }
        Flag flag = (Flag) other;
        return AbstractC22676k.m65745e(this.user, flag.user) && AbstractC22676k.m65745e(this.targetUser, flag.targetUser) && AbstractC22676k.m65745e(this.targetMessageId, flag.targetMessageId) && AbstractC22676k.m65745e(this.reviewedBy, flag.reviewedBy) && this.createdByAutomod == flag.createdByAutomod && AbstractC22676k.m65745e(this.createdAt, flag.createdAt) && AbstractC22676k.m65745e(this.updatedAt, flag.updatedAt) && AbstractC22676k.m65745e(this.reviewedAt, flag.reviewedAt) && AbstractC22676k.m65745e(this.approvedAt, flag.approvedAt) && AbstractC22676k.m65745e(this.rejectedAt, flag.rejectedAt);
    }

    public final Date getApprovedAt() {
        return this.approvedAt;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final boolean getCreatedByAutomod() {
        return this.createdByAutomod;
    }

    public final Date getRejectedAt() {
        return this.rejectedAt;
    }

    public final Date getReviewedAt() {
        return this.reviewedAt;
    }

    public final String getReviewedBy() {
        return this.reviewedBy;
    }

    public final String getTargetMessageId() {
        return this.targetMessageId;
    }

    public final User getTargetUser() {
        return this.targetUser;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = this.user.hashCode() * 31;
        User user = this.targetUser;
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (user == null ? 0 : user.hashCode())) * 31, 31, this.targetMessageId), 31, this.reviewedBy), 31, this.createdByAutomod);
        Date date = this.createdAt;
        int iM124373c = AbstractC38963t7.m124373c(this.updatedAt, (iM8289b + (date == null ? 0 : date.hashCode())) * 31, 31);
        Date date2 = this.reviewedAt;
        int iHashCode2 = (iM124373c + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.approvedAt;
        int iHashCode3 = (iHashCode2 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.rejectedAt;
        return iHashCode3 + (date4 != null ? date4.hashCode() : 0);
    }

    public String toString() {
        User user = this.user;
        User user2 = this.targetUser;
        String str = this.targetMessageId;
        String str2 = this.reviewedBy;
        boolean z4 = this.createdByAutomod;
        Date date = this.createdAt;
        Date date2 = this.updatedAt;
        Date date3 = this.reviewedAt;
        Date date4 = this.approvedAt;
        Date date5 = this.rejectedAt;
        StringBuilder sb4 = new StringBuilder("Flag(user=");
        sb4.append(user);
        sb4.append(", targetUser=");
        sb4.append(user2);
        sb4.append(", targetMessageId=");
        AbstractC11266d.m30444B(sb4, str, ", reviewedBy=", str2, ", createdByAutomod=");
        sb4.append(z4);
        sb4.append(", createdAt=");
        sb4.append(date);
        sb4.append(", updatedAt=");
        AbstractC17176i.m48512n(sb4, date2, ", reviewedAt=", date3, ", approvedAt=");
        sb4.append(date4);
        sb4.append(", rejectedAt=");
        sb4.append(date5);
        sb4.append(")");
        return sb4.toString();
    }
}
