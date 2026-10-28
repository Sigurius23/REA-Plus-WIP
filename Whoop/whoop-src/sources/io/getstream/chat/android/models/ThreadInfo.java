package io.getstream.chat.android.models;

import ih0.AbstractC18489d0;
import java.util.Date;
import java.util.List;
import java.util.Map;
import m83.C25271y;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B©\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0007HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0003J\u0015\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001b0\u001aHÆ\u0003JÅ\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001b0\u001aHÆ\u0001J\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010J\u001a\u00020\u0003HÖ\u0001J\t\u0010K\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001b0\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006L"}, m65681d2 = {"Lio/getstream/chat/android/models/ThreadInfo;", "Lio/getstream/chat/android/models/CustomObject;", "activeParticipantCount", "", "cid", "", "createdAt", "Ljava/util/Date;", "createdBy", "Lio/getstream/chat/android/models/User;", "createdByUserId", "deletedAt", "lastMessageAt", "parentMessage", "Lio/getstream/chat/android/models/Message;", "parentMessageId", "participantCount", "replyCount", "title", "updatedAt", "channel", "Lio/getstream/chat/android/models/Channel;", "threadParticipants", "", "Lio/getstream/chat/android/models/ThreadParticipant;", "extraData", "", "", "<init>", "(ILjava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/Message;Ljava/lang/String;IILjava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/models/Channel;Ljava/util/List;Ljava/util/Map;)V", "getActiveParticipantCount", "()I", "getCid", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getCreatedBy", "()Lio/getstream/chat/android/models/User;", "getCreatedByUserId", "getDeletedAt", "getLastMessageAt", "getParentMessage", "()Lio/getstream/chat/android/models/Message;", "getParentMessageId", "getParticipantCount", "getReplyCount", "getTitle", "getUpdatedAt", "getChannel", "()Lio/getstream/chat/android/models/Channel;", "getThreadParticipants", "()Ljava/util/List;", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ThreadInfo implements CustomObject {
    private final int activeParticipantCount;
    private final Channel channel;
    private final String cid;
    private final Date createdAt;
    private final User createdBy;
    private final String createdByUserId;
    private final Date deletedAt;
    private final Map<String, Object> extraData;
    private final Date lastMessageAt;
    private final Message parentMessage;
    private final String parentMessageId;
    private final int participantCount;
    private final int replyCount;
    private final List<ThreadParticipant> threadParticipants;
    private final String title;
    private final Date updatedAt;

    public ThreadInfo(int i13, String cid, Date createdAt, User user, String createdByUserId, Date date, Date date2, Message message, String parentMessageId, int i14, int i15, String title, Date updatedAt, Channel channel, List<ThreadParticipant> threadParticipants, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(createdByUserId, "createdByUserId");
        AbstractC22676k.m65750j(parentMessageId, "parentMessageId");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(threadParticipants, "threadParticipants");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.activeParticipantCount = i13;
        this.cid = cid;
        this.createdAt = createdAt;
        this.createdBy = user;
        this.createdByUserId = createdByUserId;
        this.deletedAt = date;
        this.lastMessageAt = date2;
        this.parentMessage = message;
        this.parentMessageId = parentMessageId;
        this.participantCount = i14;
        this.replyCount = i15;
        this.title = title;
        this.updatedAt = updatedAt;
        this.channel = channel;
        this.threadParticipants = threadParticipants;
        this.extraData = extraData;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getActiveParticipantCount() {
        return this.activeParticipantCount;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getParticipantCount() {
        return this.participantCount;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getReplyCount() {
        return this.replyCount;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Channel getChannel() {
        return this.channel;
    }

    public final List<ThreadParticipant> component15() {
        return this.threadParticipants;
    }

    public final Map<String, Object> component16() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final User getCreatedBy() {
        return this.createdBy;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCreatedByUserId() {
        return this.createdByUserId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Date getDeletedAt() {
        return this.deletedAt;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Date getLastMessageAt() {
        return this.lastMessageAt;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Message getParentMessage() {
        return this.parentMessage;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getParentMessageId() {
        return this.parentMessageId;
    }

    public final ThreadInfo copy(int activeParticipantCount, String cid, Date createdAt, User createdBy, String createdByUserId, Date deletedAt, Date lastMessageAt, Message parentMessage, String parentMessageId, int participantCount, int replyCount, String title, Date updatedAt, Channel channel, List<ThreadParticipant> threadParticipants, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(createdByUserId, "createdByUserId");
        AbstractC22676k.m65750j(parentMessageId, "parentMessageId");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(threadParticipants, "threadParticipants");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new ThreadInfo(activeParticipantCount, cid, createdAt, createdBy, createdByUserId, deletedAt, lastMessageAt, parentMessage, parentMessageId, participantCount, replyCount, title, updatedAt, channel, threadParticipants, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThreadInfo)) {
            return false;
        }
        ThreadInfo threadInfo = (ThreadInfo) other;
        return this.activeParticipantCount == threadInfo.activeParticipantCount && AbstractC22676k.m65745e(this.cid, threadInfo.cid) && AbstractC22676k.m65745e(this.createdAt, threadInfo.createdAt) && AbstractC22676k.m65745e(this.createdBy, threadInfo.createdBy) && AbstractC22676k.m65745e(this.createdByUserId, threadInfo.createdByUserId) && AbstractC22676k.m65745e(this.deletedAt, threadInfo.deletedAt) && AbstractC22676k.m65745e(this.lastMessageAt, threadInfo.lastMessageAt) && AbstractC22676k.m65745e(this.parentMessage, threadInfo.parentMessage) && AbstractC22676k.m65745e(this.parentMessageId, threadInfo.parentMessageId) && this.participantCount == threadInfo.participantCount && this.replyCount == threadInfo.replyCount && AbstractC22676k.m65745e(this.title, threadInfo.title) && AbstractC22676k.m65745e(this.updatedAt, threadInfo.updatedAt) && AbstractC22676k.m65745e(this.channel, threadInfo.channel) && AbstractC22676k.m65745e(this.threadParticipants, threadInfo.threadParticipants) && AbstractC22676k.m65745e(this.extraData, threadInfo.extraData);
    }

    public final int getActiveParticipantCount() {
        return this.activeParticipantCount;
    }

    public final Channel getChannel() {
        return this.channel;
    }

    public final String getCid() {
        return this.cid;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final User getCreatedBy() {
        return this.createdBy;
    }

    public final String getCreatedByUserId() {
        return this.createdByUserId;
    }

    public final Date getDeletedAt() {
        return this.deletedAt;
    }

    @Override // io.getstream.chat.android.models.CustomObject
    public Map<String, Object> getExtraData() {
        return this.extraData;
    }

    @Override // io.getstream.chat.android.models.CustomObject
    public <T> T getExtraValue(String str, T t14) {
        return (T) super.getExtraValue(str, t14);
    }

    public final Date getLastMessageAt() {
        return this.lastMessageAt;
    }

    public final Message getParentMessage() {
        return this.parentMessage;
    }

    public final String getParentMessageId() {
        return this.parentMessageId;
    }

    public final int getParticipantCount() {
        return this.participantCount;
    }

    public final int getReplyCount() {
        return this.replyCount;
    }

    public final List<ThreadParticipant> getThreadParticipants() {
        return this.threadParticipants;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iM124373c = AbstractC38963t7.m124373c(this.createdAt, AbstractC11266d.m30450d(Integer.hashCode(this.activeParticipantCount) * 31, 31, this.cid), 31);
        User user = this.createdBy;
        int iM30450d = AbstractC11266d.m30450d((iM124373c + (user == null ? 0 : user.hashCode())) * 31, 31, this.createdByUserId);
        Date date = this.deletedAt;
        int iHashCode = (iM30450d + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.lastMessageAt;
        int iHashCode2 = (iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31;
        Message message = this.parentMessage;
        int iM124373c2 = AbstractC38963t7.m124373c(this.updatedAt, AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.replyCount, AbstractC11266d.m30448b(this.participantCount, AbstractC11266d.m30450d((iHashCode2 + (message == null ? 0 : message.hashCode())) * 31, 31, this.parentMessageId), 31), 31), 31, this.title), 31);
        Channel channel = this.channel;
        return this.extraData.hashCode() + AbstractC11895b.m31983b((iM124373c2 + (channel != null ? channel.hashCode() : 0)) * 31, 31, this.threadParticipants);
    }

    public String toString() {
        int i13 = this.activeParticipantCount;
        String str = this.cid;
        Date date = this.createdAt;
        User user = this.createdBy;
        String str2 = this.createdByUserId;
        Date date2 = this.deletedAt;
        Date date3 = this.lastMessageAt;
        Message message = this.parentMessage;
        String str3 = this.parentMessageId;
        int i14 = this.participantCount;
        int i15 = this.replyCount;
        String str4 = this.title;
        Date date4 = this.updatedAt;
        Channel channel = this.channel;
        List<ThreadParticipant> list = this.threadParticipants;
        Map<String, Object> map = this.extraData;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "ThreadInfo(activeParticipantCount=", ", cid=", str, ", createdAt=");
        sbM53373n.append(date);
        sbM53373n.append(", createdBy=");
        sbM53373n.append(user);
        sbM53373n.append(", createdByUserId=");
        AbstractC13673n.m38579z(sbM53373n, str2, ", deletedAt=", date2, ", lastMessageAt=");
        sbM53373n.append(date3);
        sbM53373n.append(", parentMessage=");
        sbM53373n.append(message);
        sbM53373n.append(", parentMessageId=");
        AbstractC11266d.m30470x(i14, str3, ", participantCount=", ", replyCount=", sbM53373n);
        AbstractC11895b.m31979B(i15, ", title=", str4, ", updatedAt=", sbM53373n);
        sbM53373n.append(date4);
        sbM53373n.append(", channel=");
        sbM53373n.append(channel);
        sbM53373n.append(", threadParticipants=");
        sbM53373n.append(list);
        sbM53373n.append(", extraData=");
        sbM53373n.append(map);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }

    public /* synthetic */ ThreadInfo(int i13, String str, Date date, User user, String str2, Date date2, Date date3, Message message, String str3, int i14, int i15, String str4, Date date4, Channel channel, List list, Map map, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, str, date, user, str2, date2, date3, message, str3, i14, i15, str4, date4, (i16 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : channel, (i16 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? C25271y.f99162w : list, (i16 & 32768) != 0 ? C25272z.f99163w : map);
    }
}
