package io.getstream.chat.android.models;

import java.util.Date;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/models/UserBlock;", "", "blockedBy", "", "userId", "blockedAt", "Ljava/util/Date;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V", "getBlockedBy", "()Ljava/lang/String;", "getUserId", "getBlockedAt", "()Ljava/util/Date;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UserBlock {
    private final Date blockedAt;
    private final String blockedBy;
    private final String userId;

    public UserBlock(String blockedBy, String userId, Date blockedAt) {
        AbstractC22676k.m65750j(blockedBy, "blockedBy");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(blockedAt, "blockedAt");
        this.blockedBy = blockedBy;
        this.userId = userId;
        this.blockedAt = blockedAt;
    }

    public static /* synthetic */ UserBlock copy$default(UserBlock userBlock, String str, String str2, Date date, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = userBlock.blockedBy;
        }
        if ((i13 & 2) != 0) {
            str2 = userBlock.userId;
        }
        if ((i13 & 4) != 0) {
            date = userBlock.blockedAt;
        }
        return userBlock.copy(str, str2, date);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBlockedBy() {
        return this.blockedBy;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getBlockedAt() {
        return this.blockedAt;
    }

    public final UserBlock copy(String blockedBy, String userId, Date blockedAt) {
        AbstractC22676k.m65750j(blockedBy, "blockedBy");
        AbstractC22676k.m65750j(userId, "userId");
        AbstractC22676k.m65750j(blockedAt, "blockedAt");
        return new UserBlock(blockedBy, userId, blockedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserBlock)) {
            return false;
        }
        UserBlock userBlock = (UserBlock) other;
        return AbstractC22676k.m65745e(this.blockedBy, userBlock.blockedBy) && AbstractC22676k.m65745e(this.userId, userBlock.userId) && AbstractC22676k.m65745e(this.blockedAt, userBlock.blockedAt);
    }

    public final Date getBlockedAt() {
        return this.blockedAt;
    }

    public final String getBlockedBy() {
        return this.blockedBy;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.blockedAt.hashCode() + AbstractC11266d.m30450d(this.blockedBy.hashCode() * 31, 31, this.userId);
    }

    public String toString() {
        String str = this.blockedBy;
        String str2 = this.userId;
        return AbstractC13673n.m38564k(AbstractC11895b.m32001t("UserBlock(blockedBy=", str, ", userId=", str2, ", blockedAt="), this.blockedAt, ")");
    }
}
