package io.getstream.chat.android.client.internal.offline.repository.domain.user.internal;

import hc3.AbstractC17176i;
import java.util.Date;
import live.hms.video.utils.HMSFieldTrials;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteEntity;", "", "userId", "", "targetId", "createdAt", "Ljava/util/Date;", "updatedAt", "expires", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V", "getUserId", "()Ljava/lang/String;", "getTargetId", "getCreatedAt", "()Ljava/util/Date;", "getUpdatedAt", "getExpires", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UserMuteEntity {
    private final Date createdAt;
    private final Date expires;
    private final String targetId;
    private final Date updatedAt;
    private final String userId;

    public UserMuteEntity(String str, String str2, Date createdAt, Date updatedAt, Date date) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        this.userId = str;
        this.targetId = str2;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.expires = date;
    }

    public static /* synthetic */ UserMuteEntity copy$default(UserMuteEntity userMuteEntity, String str, String str2, Date date, Date date2, Date date3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = userMuteEntity.userId;
        }
        if ((i13 & 2) != 0) {
            str2 = userMuteEntity.targetId;
        }
        if ((i13 & 4) != 0) {
            date = userMuteEntity.createdAt;
        }
        if ((i13 & 8) != 0) {
            date2 = userMuteEntity.updatedAt;
        }
        if ((i13 & 16) != 0) {
            date3 = userMuteEntity.expires;
        }
        Date date4 = date3;
        Date date5 = date;
        return userMuteEntity.copy(str, str2, date5, date2, date4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTargetId() {
        return this.targetId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getExpires() {
        return this.expires;
    }

    public final UserMuteEntity copy(String userId, String targetId, Date createdAt, Date updatedAt, Date expires) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        return new UserMuteEntity(userId, targetId, createdAt, updatedAt, expires);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserMuteEntity)) {
            return false;
        }
        UserMuteEntity userMuteEntity = (UserMuteEntity) other;
        return AbstractC22676k.m65745e(this.userId, userMuteEntity.userId) && AbstractC22676k.m65745e(this.targetId, userMuteEntity.targetId) && AbstractC22676k.m65745e(this.createdAt, userMuteEntity.createdAt) && AbstractC22676k.m65745e(this.updatedAt, userMuteEntity.updatedAt) && AbstractC22676k.m65745e(this.expires, userMuteEntity.expires);
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final Date getExpires() {
        return this.expires;
    }

    public final String getTargetId() {
        return this.targetId;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        String str = this.userId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.targetId;
        int iM124373c = AbstractC38963t7.m124373c(this.updatedAt, AbstractC38963t7.m124373c(this.createdAt, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        Date date = this.expires;
        return iM124373c + (date != null ? date.hashCode() : 0);
    }

    public final String toString() {
        String str = this.userId;
        String str2 = this.targetId;
        Date date = this.createdAt;
        Date date2 = this.updatedAt;
        Date date3 = this.expires;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("UserMuteEntity(userId=", str, ", targetId=", str2, ", createdAt=");
        AbstractC17176i.m48512n(sbM32001t, date, ", updatedAt=", date2, ", expires=");
        return AbstractC13673n.m38564k(sbM32001t, date3, ")");
    }
}
