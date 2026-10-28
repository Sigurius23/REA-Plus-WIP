package io.getstream.chat.android.client.events;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import d13.AbstractC11478a;
import io.getstream.chat.android.models.User;
import java.util.Date;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b3\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0097\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00101\u001a\u00020\u0006HÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\t\u00104\u001a\u00020\u000bHÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\t\u00108\u001a\u00020\u0010HÆ\u0003J\t\u00109\u001a\u00020\u0010HÆ\u0003J\t\u0010:\u001a\u00020\u0010HÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\t\u0010<\u001a\u00020\bHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010?\u001a\u00020\u0010HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010.J´\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u00020\u0010HÖ\u0001J\t\u0010H\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\f\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0014\u0010\r\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0014\u0010\u000e\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010\u0011\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\u0012\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0011\u0010\u0014\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0014\u0010\u0017\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\n\n\u0002\u00100\u001a\u0004\b/\u0010.¨\u0006I"}, m65681d2 = {"Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;", "Lio/getstream/chat/android/client/events/CidEvent;", "Lio/getstream/chat/android/client/events/UserEvent;", "Lio/getstream/chat/android/client/events/HasUnreadCounts;", "Lio/getstream/chat/android/client/events/HasUnreadThreadCounts;", "type", "", "createdAt", "Ljava/util/Date;", "rawCreatedAt", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "cid", "channelType", "channelId", "totalUnreadCount", "", "unreadChannels", "unreadMessages", "firstUnreadMessageId", "lastReadMessageAt", "lastReadMessageId", "threadId", "unreadThreads", "unreadThreadMessages", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)V", "getType", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getRawCreatedAt", "getUser", "()Lio/getstream/chat/android/models/User;", "getCid", "getChannelType", "getChannelId", "getTotalUnreadCount", "()I", "getUnreadChannels", "getUnreadMessages", "getFirstUnreadMessageId", "getLastReadMessageAt", "getLastReadMessageId", "getThreadId", "getUnreadThreads", "()Ljava/lang/Integer;", "getUnreadThreadMessages", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;", "equals", "", "other", "", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class NotificationMarkUnreadEvent extends CidEvent implements UserEvent, HasUnreadCounts, HasUnreadThreadCounts {
    private final String channelId;
    private final String channelType;
    private final String cid;
    private final Date createdAt;
    private final String firstUnreadMessageId;
    private final Date lastReadMessageAt;
    private final String lastReadMessageId;
    private final String rawCreatedAt;
    private final String threadId;
    private final int totalUnreadCount;
    private final String type;
    private final int unreadChannels;
    private final int unreadMessages;
    private final Integer unreadThreadMessages;
    private final int unreadThreads;
    private final User user;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationMarkUnreadEvent(String type, Date createdAt, String rawCreatedAt, User user, String cid, String channelType, String channelId, int i13, int i14, int i15, String firstUnreadMessageId, Date lastReadMessageAt, String str, String str2, int i16, Integer num) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(firstUnreadMessageId, "firstUnreadMessageId");
        AbstractC22676k.m65750j(lastReadMessageAt, "lastReadMessageAt");
        this.type = type;
        this.createdAt = createdAt;
        this.rawCreatedAt = rawCreatedAt;
        this.user = user;
        this.cid = cid;
        this.channelType = channelType;
        this.channelId = channelId;
        this.totalUnreadCount = i13;
        this.unreadChannels = i14;
        this.unreadMessages = i15;
        this.firstUnreadMessageId = firstUnreadMessageId;
        this.lastReadMessageAt = lastReadMessageAt;
        this.lastReadMessageId = str;
        this.threadId = str2;
        this.unreadThreads = i16;
        this.unreadThreadMessages = num;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getUnreadMessages() {
        return this.unreadMessages;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getFirstUnreadMessageId() {
        return this.firstUnreadMessageId;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Date getLastReadMessageAt() {
        return this.lastReadMessageAt;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getLastReadMessageId() {
        return this.lastReadMessageId;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getThreadId() {
        return this.threadId;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getUnreadThreads() {
        return this.unreadThreads;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
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

    public final NotificationMarkUnreadEvent copy(String type, Date createdAt, String rawCreatedAt, User user, String cid, String channelType, String channelId, int totalUnreadCount, int unreadChannels, int unreadMessages, String firstUnreadMessageId, Date lastReadMessageAt, String lastReadMessageId, String threadId, int unreadThreads, Integer unreadThreadMessages) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(firstUnreadMessageId, "firstUnreadMessageId");
        AbstractC22676k.m65750j(lastReadMessageAt, "lastReadMessageAt");
        return new NotificationMarkUnreadEvent(type, createdAt, rawCreatedAt, user, cid, channelType, channelId, totalUnreadCount, unreadChannels, unreadMessages, firstUnreadMessageId, lastReadMessageAt, lastReadMessageId, threadId, unreadThreads, unreadThreadMessages);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationMarkUnreadEvent)) {
            return false;
        }
        NotificationMarkUnreadEvent notificationMarkUnreadEvent = (NotificationMarkUnreadEvent) other;
        return AbstractC22676k.m65745e(this.type, notificationMarkUnreadEvent.type) && AbstractC22676k.m65745e(this.createdAt, notificationMarkUnreadEvent.createdAt) && AbstractC22676k.m65745e(this.rawCreatedAt, notificationMarkUnreadEvent.rawCreatedAt) && AbstractC22676k.m65745e(this.user, notificationMarkUnreadEvent.user) && AbstractC22676k.m65745e(this.cid, notificationMarkUnreadEvent.cid) && AbstractC22676k.m65745e(this.channelType, notificationMarkUnreadEvent.channelType) && AbstractC22676k.m65745e(this.channelId, notificationMarkUnreadEvent.channelId) && this.totalUnreadCount == notificationMarkUnreadEvent.totalUnreadCount && this.unreadChannels == notificationMarkUnreadEvent.unreadChannels && this.unreadMessages == notificationMarkUnreadEvent.unreadMessages && AbstractC22676k.m65745e(this.firstUnreadMessageId, notificationMarkUnreadEvent.firstUnreadMessageId) && AbstractC22676k.m65745e(this.lastReadMessageAt, notificationMarkUnreadEvent.lastReadMessageAt) && AbstractC22676k.m65745e(this.lastReadMessageId, notificationMarkUnreadEvent.lastReadMessageId) && AbstractC22676k.m65745e(this.threadId, notificationMarkUnreadEvent.threadId) && this.unreadThreads == notificationMarkUnreadEvent.unreadThreads && AbstractC22676k.m65745e(this.unreadThreadMessages, notificationMarkUnreadEvent.unreadThreadMessages);
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

    public final String getFirstUnreadMessageId() {
        return this.firstUnreadMessageId;
    }

    public final Date getLastReadMessageAt() {
        return this.lastReadMessageAt;
    }

    public final String getLastReadMessageId() {
        return this.lastReadMessageId;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getRawCreatedAt() {
        return this.rawCreatedAt;
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

    public final int getUnreadMessages() {
        return this.unreadMessages;
    }

    @Override // io.getstream.chat.android.client.events.HasUnreadThreadCounts
    public final Integer getUnreadThreadMessages() {
        return this.unreadThreadMessages;
    }

    @Override // io.getstream.chat.android.client.events.HasUnreadThreadCounts
    public final Integer getUnreadThreads() {
        return Integer.valueOf(this.unreadThreads);
    }

    @Override // io.getstream.chat.android.client.events.UserEvent
    public final User getUser() {
        return this.user;
    }

    public final int hashCode() {
        int iM124373c = AbstractC38963t7.m124373c(this.lastReadMessageAt, AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.unreadMessages, AbstractC11266d.m30448b(this.unreadChannels, AbstractC11266d.m30448b(this.totalUnreadCount, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11478a.m30850b(this.user, AbstractC11266d.m30450d(AbstractC38963t7.m124373c(this.createdAt, this.type.hashCode() * 31, 31), 31, this.rawCreatedAt), 31), 31, this.cid), 31, this.channelType), 31, this.channelId), 31), 31), 31), 31, this.firstUnreadMessageId), 31);
        String str = this.lastReadMessageId;
        int iHashCode = (iM124373c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.threadId;
        int iM30448b = AbstractC11266d.m30448b(this.unreadThreads, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Integer num = this.unreadThreadMessages;
        return iM30448b + (num != null ? num.hashCode() : 0);
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
        int i15 = this.unreadMessages;
        String str6 = this.firstUnreadMessageId;
        Date date2 = this.lastReadMessageAt;
        String str7 = this.lastReadMessageId;
        String str8 = this.threadId;
        int i16 = this.unreadThreads;
        Integer num = this.unreadThreadMessages;
        StringBuilder sbM11830n = AbstractC3855a.m11830n("NotificationMarkUnreadEvent(type=", str, ", createdAt=", date, ", rawCreatedAt=");
        AbstractC11478a.m30866r(sbM11830n, str2, ", user=", user, ", cid=");
        AbstractC11266d.m30444B(sbM11830n, str3, ", channelType=", str4, ", channelId=");
        AbstractC11266d.m30470x(i13, str5, ", totalUnreadCount=", ", unreadChannels=", sbM11830n);
        AbstractC30802r.m94773v(sbM11830n, i14, ", unreadMessages=", i15, ", firstUnreadMessageId=");
        AbstractC13673n.m38579z(sbM11830n, str6, ", lastReadMessageAt=", date2, ", lastReadMessageId=");
        AbstractC11266d.m30444B(sbM11830n, str7, ", threadId=", str8, ", unreadThreads=");
        sbM11830n.append(i16);
        sbM11830n.append(", unreadThreadMessages=");
        sbM11830n.append(num);
        sbM11830n.append(")");
        return sbM11830n.toString();
    }

    public /* synthetic */ NotificationMarkUnreadEvent(String str, Date date, String str2, User user, String str3, String str4, String str5, int i13, int i14, int i15, String str6, Date date2, String str7, String str8, int i16, Integer num, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, date, str2, user, str3, str4, str5, (i17 & 128) != 0 ? 0 : i13, (i17 & 256) != 0 ? 0 : i14, i15, str6, date2, str7, (i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : str8, (i17 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? 0 : i16, (i17 & 32768) != 0 ? null : num);
    }
}
