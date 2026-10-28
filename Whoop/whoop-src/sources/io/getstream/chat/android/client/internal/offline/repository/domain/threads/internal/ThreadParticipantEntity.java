package io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal;

import java.util.Date;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadParticipantEntity;", "", "userId", "", "lastThreadMessageAt", "Ljava/util/Date;", "<init>", "(Ljava/lang/String;Ljava/util/Date;)V", "getUserId", "()Ljava/lang/String;", "getLastThreadMessageAt", "()Ljava/util/Date;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ThreadParticipantEntity {
    private final Date lastThreadMessageAt;
    private final String userId;

    public ThreadParticipantEntity(String userId, Date date) {
        AbstractC22676k.m65750j(userId, "userId");
        this.userId = userId;
        this.lastThreadMessageAt = date;
    }

    public static /* synthetic */ ThreadParticipantEntity copy$default(ThreadParticipantEntity threadParticipantEntity, String str, Date date, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = threadParticipantEntity.userId;
        }
        if ((i13 & 2) != 0) {
            date = threadParticipantEntity.lastThreadMessageAt;
        }
        return threadParticipantEntity.copy(str, date);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getLastThreadMessageAt() {
        return this.lastThreadMessageAt;
    }

    public final ThreadParticipantEntity copy(String userId, Date lastThreadMessageAt) {
        AbstractC22676k.m65750j(userId, "userId");
        return new ThreadParticipantEntity(userId, lastThreadMessageAt);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThreadParticipantEntity)) {
            return false;
        }
        ThreadParticipantEntity threadParticipantEntity = (ThreadParticipantEntity) other;
        return AbstractC22676k.m65745e(this.userId, threadParticipantEntity.userId) && AbstractC22676k.m65745e(this.lastThreadMessageAt, threadParticipantEntity.lastThreadMessageAt);
    }

    public final Date getLastThreadMessageAt() {
        return this.lastThreadMessageAt;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        int iHashCode = this.userId.hashCode() * 31;
        Date date = this.lastThreadMessageAt;
        return iHashCode + (date == null ? 0 : date.hashCode());
    }

    public final String toString() {
        return "ThreadParticipantEntity(userId=" + this.userId + ", lastThreadMessageAt=" + this.lastThreadMessageAt + ")";
    }
}
