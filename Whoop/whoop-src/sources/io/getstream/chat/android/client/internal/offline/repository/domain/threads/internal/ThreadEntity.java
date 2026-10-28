package io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal;

import hc3.AbstractC17176i;
import io.getstream.chat.android.client.internal.offline.repository.domain.channel.userread.internal.ChannelUserReadEntity;
import java.util.Date;
import java.util.List;
import java.util.Map;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\n\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u00102\u001a\u00020\rHÆ\u0003J\t\u00103\u001a\u00020\rHÆ\u0003J\t\u00104\u001a\u00020\rHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00130\nHÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\u0015\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0016HÆ\u0003Jµ\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0016HÆ\u0001J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\u0007HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\n¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006@"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;", "", "parentMessageId", "", "cid", "createdByUserId", "activeParticipantCount", "", "participantCount", "threadParticipants", "", "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadParticipantEntity;", "lastMessageAt", "Ljava/util/Date;", "createdAt", "updatedAt", "deletedAt", "title", "read", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;", "latestReplyIds", "extraData", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "getParentMessageId", "()Ljava/lang/String;", "getCid", "getCreatedByUserId", "getActiveParticipantCount", "()I", "getParticipantCount", "getThreadParticipants", "()Ljava/util/List;", "getLastMessageAt", "()Ljava/util/Date;", "getCreatedAt", "getUpdatedAt", "getDeletedAt", "getTitle", "getRead", "getLatestReplyIds", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ThreadEntity {
    private final int activeParticipantCount;
    private final String cid;
    private final Date createdAt;
    private final String createdByUserId;
    private final Date deletedAt;
    private final Map<String, Object> extraData;
    private final Date lastMessageAt;
    private final List<String> latestReplyIds;
    private final String parentMessageId;
    private final int participantCount;
    private final List<ChannelUserReadEntity> read;
    private final List<ThreadParticipantEntity> threadParticipants;
    private final String title;
    private final Date updatedAt;

    public ThreadEntity(String parentMessageId, String cid, String createdByUserId, int i13, int i14, List<ThreadParticipantEntity> threadParticipants, Date lastMessageAt, Date createdAt, Date updatedAt, Date date, String title, List<ChannelUserReadEntity> read, List<String> latestReplyIds, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(parentMessageId, "parentMessageId");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(createdByUserId, "createdByUserId");
        AbstractC22676k.m65750j(threadParticipants, "threadParticipants");
        AbstractC22676k.m65750j(lastMessageAt, "lastMessageAt");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(read, "read");
        AbstractC22676k.m65750j(latestReplyIds, "latestReplyIds");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.parentMessageId = parentMessageId;
        this.cid = cid;
        this.createdByUserId = createdByUserId;
        this.activeParticipantCount = i13;
        this.participantCount = i14;
        this.threadParticipants = threadParticipants;
        this.lastMessageAt = lastMessageAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = date;
        this.title = title;
        this.read = read;
        this.latestReplyIds = latestReplyIds;
        this.extraData = extraData;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getParentMessageId() {
        return this.parentMessageId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Date getDeletedAt() {
        return this.deletedAt;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<ChannelUserReadEntity> component12() {
        return this.read;
    }

    public final List<String> component13() {
        return this.latestReplyIds;
    }

    public final Map<String, Object> component14() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCreatedByUserId() {
        return this.createdByUserId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getActiveParticipantCount() {
        return this.activeParticipantCount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getParticipantCount() {
        return this.participantCount;
    }

    public final List<ThreadParticipantEntity> component6() {
        return this.threadParticipants;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Date getLastMessageAt() {
        return this.lastMessageAt;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final ThreadEntity copy(String parentMessageId, String cid, String createdByUserId, int activeParticipantCount, int participantCount, List<ThreadParticipantEntity> threadParticipants, Date lastMessageAt, Date createdAt, Date updatedAt, Date deletedAt, String title, List<ChannelUserReadEntity> read, List<String> latestReplyIds, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(parentMessageId, "parentMessageId");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(createdByUserId, "createdByUserId");
        AbstractC22676k.m65750j(threadParticipants, "threadParticipants");
        AbstractC22676k.m65750j(lastMessageAt, "lastMessageAt");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(read, "read");
        AbstractC22676k.m65750j(latestReplyIds, "latestReplyIds");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new ThreadEntity(parentMessageId, cid, createdByUserId, activeParticipantCount, participantCount, threadParticipants, lastMessageAt, createdAt, updatedAt, deletedAt, title, read, latestReplyIds, extraData);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThreadEntity)) {
            return false;
        }
        ThreadEntity threadEntity = (ThreadEntity) other;
        return AbstractC22676k.m65745e(this.parentMessageId, threadEntity.parentMessageId) && AbstractC22676k.m65745e(this.cid, threadEntity.cid) && AbstractC22676k.m65745e(this.createdByUserId, threadEntity.createdByUserId) && this.activeParticipantCount == threadEntity.activeParticipantCount && this.participantCount == threadEntity.participantCount && AbstractC22676k.m65745e(this.threadParticipants, threadEntity.threadParticipants) && AbstractC22676k.m65745e(this.lastMessageAt, threadEntity.lastMessageAt) && AbstractC22676k.m65745e(this.createdAt, threadEntity.createdAt) && AbstractC22676k.m65745e(this.updatedAt, threadEntity.updatedAt) && AbstractC22676k.m65745e(this.deletedAt, threadEntity.deletedAt) && AbstractC22676k.m65745e(this.title, threadEntity.title) && AbstractC22676k.m65745e(this.read, threadEntity.read) && AbstractC22676k.m65745e(this.latestReplyIds, threadEntity.latestReplyIds) && AbstractC22676k.m65745e(this.extraData, threadEntity.extraData);
    }

    public final int getActiveParticipantCount() {
        return this.activeParticipantCount;
    }

    public final String getCid() {
        return this.cid;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final String getCreatedByUserId() {
        return this.createdByUserId;
    }

    public final Date getDeletedAt() {
        return this.deletedAt;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final Date getLastMessageAt() {
        return this.lastMessageAt;
    }

    public final List<String> getLatestReplyIds() {
        return this.latestReplyIds;
    }

    public final String getParentMessageId() {
        return this.parentMessageId;
    }

    public final int getParticipantCount() {
        return this.participantCount;
    }

    public final List<ChannelUserReadEntity> getRead() {
        return this.read;
    }

    public final List<ThreadParticipantEntity> getThreadParticipants() {
        return this.threadParticipants;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final int hashCode() {
        int iM124373c = AbstractC38963t7.m124373c(this.updatedAt, AbstractC38963t7.m124373c(this.createdAt, AbstractC38963t7.m124373c(this.lastMessageAt, AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.participantCount, AbstractC11266d.m30448b(this.activeParticipantCount, AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.parentMessageId.hashCode() * 31, 31, this.cid), 31, this.createdByUserId), 31), 31), 31, this.threadParticipants), 31), 31), 31);
        Date date = this.deletedAt;
        return this.extraData.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11266d.m30450d((iM124373c + (date == null ? 0 : date.hashCode())) * 31, 31, this.title), 31, this.read), 31, this.latestReplyIds);
    }

    public final String toString() {
        String str = this.parentMessageId;
        String str2 = this.cid;
        String str3 = this.createdByUserId;
        int i13 = this.activeParticipantCount;
        int i14 = this.participantCount;
        List<ThreadParticipantEntity> list = this.threadParticipants;
        Date date = this.lastMessageAt;
        Date date2 = this.createdAt;
        Date date3 = this.updatedAt;
        Date date4 = this.deletedAt;
        String str4 = this.title;
        List<ChannelUserReadEntity> list2 = this.read;
        List<String> list3 = this.latestReplyIds;
        Map<String, Object> map = this.extraData;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ThreadEntity(parentMessageId=", str, ", cid=", str2, ", createdByUserId=");
        AbstractC11266d.m30470x(i13, str3, ", activeParticipantCount=", ", participantCount=", sbM32001t);
        sbM32001t.append(i14);
        sbM32001t.append(", threadParticipants=");
        sbM32001t.append(list);
        sbM32001t.append(", lastMessageAt=");
        AbstractC17176i.m48512n(sbM32001t, date, ", createdAt=", date2, ", updatedAt=");
        AbstractC17176i.m48512n(sbM32001t, date3, ", deletedAt=", date4, ", title=");
        AbstractC36095b.m114694v(str4, ", read=", ", latestReplyIds=", sbM32001t, list2);
        sbM32001t.append(list3);
        sbM32001t.append(", extraData=");
        sbM32001t.append(map);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
