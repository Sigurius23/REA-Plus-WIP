package io.getstream.chat.android.client.events;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import d13.AbstractC11478a;
import io.getstream.chat.android.models.ThreadInfo;
import io.getstream.chat.android.models.User;
import java.util.Date;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u008d\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\t\u00106\u001a\u00020\u0010HÆ\u0003J\t\u00107\u001a\u00020\u0010HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010<\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010,J¤\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010BHÖ\u0003J\t\u0010C\u001a\u00020\u0010HÖ\u0001J\t\u0010D\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010\f\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0014\u0010\r\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0014\u0010\u000e\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010\u0011\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b.\u0010,¨\u0006E"}, m65681d2 = {"Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;", "Lio/getstream/chat/android/client/events/CidEvent;", "Lio/getstream/chat/android/client/events/UserEvent;", "Lio/getstream/chat/android/client/events/HasUnreadCounts;", "Lio/getstream/chat/android/client/events/HasUnreadThreadCounts;", "type", "", "createdAt", "Ljava/util/Date;", "rawCreatedAt", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "cid", "channelType", "channelId", "totalUnreadCount", "", "unreadChannels", "lastReadMessageId", "threadId", "thread", "Lio/getstream/chat/android/models/ThreadInfo;", "unreadThreads", "unreadThreadMessages", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/ThreadInfo;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getType", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getRawCreatedAt", "getUser", "()Lio/getstream/chat/android/models/User;", "getCid", "getChannelType", "getChannelId", "getTotalUnreadCount", "()I", "getUnreadChannels", "getLastReadMessageId", "getThreadId", "getThread", "()Lio/getstream/chat/android/models/ThreadInfo;", "getUnreadThreads", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUnreadThreadMessages", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/ThreadInfo;Ljava/lang/Integer;Ljava/lang/Integer;)Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;", "equals", "", "other", "", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class NotificationMarkReadEvent extends CidEvent implements UserEvent, HasUnreadCounts, HasUnreadThreadCounts {
    private final String channelId;
    private final String channelType;
    private final String cid;
    private final Date createdAt;
    private final String lastReadMessageId;
    private final String rawCreatedAt;
    private final ThreadInfo thread;
    private final String threadId;
    private final int totalUnreadCount;
    private final String type;
    private final int unreadChannels;
    private final Integer unreadThreadMessages;
    private final Integer unreadThreads;
    private final User user;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationMarkReadEvent(String type, Date createdAt, String rawCreatedAt, User user, String cid, String channelType, String channelId, int i13, int i14, String str, String str2, ThreadInfo threadInfo, Integer num, Integer num2) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        this.type = type;
        this.createdAt = createdAt;
        this.rawCreatedAt = rawCreatedAt;
        this.user = user;
        this.cid = cid;
        this.channelType = channelType;
        this.channelId = channelId;
        this.totalUnreadCount = i13;
        this.unreadChannels = i14;
        this.lastReadMessageId = str;
        this.threadId = str2;
        this.thread = threadInfo;
        this.unreadThreads = num;
        this.unreadThreadMessages = num2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getLastReadMessageId() {
        return this.lastReadMessageId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getThreadId() {
        return this.threadId;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final ThreadInfo getThread() {
        return this.thread;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getUnreadThreads() {
        return this.unreadThreads;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getUnreadThreadMessages() {
        return this.unreadThreadMessages;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRawCreatedAt() {
        return this.rawCreatedAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getChannelType() {
        return this.channelType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getTotalUnreadCount() {
        return this.totalUnreadCount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getUnreadChannels() {
        return this.unreadChannels;
    }

    public final NotificationMarkReadEvent copy(String type, Date createdAt, String rawCreatedAt, User user, String cid, String channelType, String channelId, int totalUnreadCount, int unreadChannels, String lastReadMessageId, String threadId, ThreadInfo thread, Integer unreadThreads, Integer unreadThreadMessages) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        return new NotificationMarkReadEvent(type, createdAt, rawCreatedAt, user, cid, channelType, channelId, totalUnreadCount, unreadChannels, lastReadMessageId, threadId, thread, unreadThreads, unreadThreadMessages);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationMarkReadEvent)) {
            return false;
        }
        NotificationMarkReadEvent notificationMarkReadEvent = (NotificationMarkReadEvent) other;
        return AbstractC22676k.m65745e(this.type, notificationMarkReadEvent.type) && AbstractC22676k.m65745e(this.createdAt, notificationMarkReadEvent.createdAt) && AbstractC22676k.m65745e(this.rawCreatedAt, notificationMarkReadEvent.rawCreatedAt) && AbstractC22676k.m65745e(this.user, notificationMarkReadEvent.user) && AbstractC22676k.m65745e(this.cid, notificationMarkReadEvent.cid) && AbstractC22676k.m65745e(this.channelType, notificationMarkReadEvent.channelType) && AbstractC22676k.m65745e(this.channelId, notificationMarkReadEvent.channelId) && this.totalUnreadCount == notificationMarkReadEvent.totalUnreadCount && this.unreadChannels == notificationMarkReadEvent.unreadChannels && AbstractC22676k.m65745e(this.lastReadMessageId, notificationMarkReadEvent.lastReadMessageId) && AbstractC22676k.m65745e(this.threadId, notificationMarkReadEvent.threadId) && AbstractC22676k.m65745e(this.thread, notificationMarkReadEvent.thread) && AbstractC22676k.m65745e(this.unreadThreads, notificationMarkReadEvent.unreadThreads) && AbstractC22676k.m65745e(this.unreadThreadMessages, notificationMarkReadEvent.unreadThreadMessages);
    }

    @Override // io.getstream.chat.android.client.events.CidEvent
    public final String getChannelId() {
        return this.channelId;
    }

    @Override // io.getstream.chat.android.client.events.CidEvent
    public final String getChannelType() {
        return this.channelType;
    }

    @Override // io.getstream.chat.android.client.events.CidEvent
    public final String getCid() {
        return this.cid;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final String getLastReadMessageId() {
        return this.lastReadMessageId;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getRawCreatedAt() {
        return this.rawCreatedAt;
    }

    public final ThreadInfo getThread() {
        return this.thread;
    }

    public final String getThreadId() {
        return this.threadId;
    }

    @Override // io.getstream.chat.android.client.events.HasUnreadCounts
    public final int getTotalUnreadCount() {
        return this.totalUnreadCount;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getType() {
        return this.type;
    }

    @Override // io.getstream.chat.android.client.events.HasUnreadCounts
    public final int getUnreadChannels() {
        return this.unreadChannels;
    }

    @Override // io.getstream.chat.android.client.events.HasUnreadThreadCounts
    public final Integer getUnreadThreadMessages() {
        return this.unreadThreadMessages;
    }

    @Override // io.getstream.chat.android.client.events.HasUnreadThreadCounts
    public final Integer getUnreadThreads() {
        return this.unreadThreads;
    }

    @Override // io.getstream.chat.android.client.events.UserEvent
    public final User getUser() {
        return this.user;
    }

    public final int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.unreadChannels, AbstractC11266d.m30448b(this.totalUnreadCount, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11478a.m30850b(this.user, AbstractC11266d.m30450d(AbstractC38963t7.m124373c(this.createdAt, this.type.hashCode() * 31, 31), 31, this.rawCreatedAt), 31), 31, this.cid), 31, this.channelType), 31, this.channelId), 31), 31);
        String str = this.lastReadMessageId;
        int iHashCode = (iM30448b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.threadId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ThreadInfo threadInfo = this.thread;
        int iHashCode3 = (iHashCode2 + (threadInfo == null ? 0 : threadInfo.hashCode())) * 31;
        Integer num = this.unreadThreads;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.unreadThreadMessages;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.type;
        Date date = this.createdAt;
        String str2 = this.rawCreatedAt;
        User user = this.user;
        String str3 = this.cid;
        String str4 = this.channelType;
        String str5 = this.channelId;
        int i13 = this.totalUnreadCount;
        int i14 = this.unreadChannels;
        String str6 = this.lastReadMessageId;
        String str7 = this.threadId;
        ThreadInfo threadInfo = this.thread;
        Integer num = this.unreadThreads;
        Integer num2 = this.unreadThreadMessages;
        StringBuilder sbM11830n = AbstractC3855a.m11830n("NotificationMarkReadEvent(type=", str, ", createdAt=", date, ", rawCreatedAt=");
        AbstractC11478a.m30866r(sbM11830n, str2, ", user=", user, ", cid=");
        AbstractC11266d.m30444B(sbM11830n, str3, ", channelType=", str4, ", channelId=");
        AbstractC11266d.m30470x(i13, str5, ", totalUnreadCount=", ", unreadChannels=", sbM11830n);
        AbstractC11895b.m31979B(i14, ", lastReadMessageId=", str6, ", threadId=", sbM11830n);
        sbM11830n.append(str7);
        sbM11830n.append(", thread=");
        sbM11830n.append(threadInfo);
        sbM11830n.append(", unreadThreads=");
        sbM11830n.append(num);
        sbM11830n.append(", unreadThreadMessages=");
        sbM11830n.append(num2);
        sbM11830n.append(")");
        return sbM11830n.toString();
    }

    public /* synthetic */ NotificationMarkReadEvent(String str, Date date, String str2, User user, String str3, String str4, String str5, int i13, int i14, String str6, String str7, ThreadInfo threadInfo, Integer num, Integer num2, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, date, str2, user, str3, str4, str5, (i15 & 128) != 0 ? 0 : i13, (i15 & 256) != 0 ? 0 : i14, str6, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str7, (i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : threadInfo, (i15 & 4096) != 0 ? null : num, (i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : num2);
    }
}
