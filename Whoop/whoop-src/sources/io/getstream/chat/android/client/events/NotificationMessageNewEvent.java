package io.getstream.chat.android.client.events;

import c13.AbstractC3855a;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Message;
import java.util.Date;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B[\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003J\t\u0010,\u001a\u00020\u0010HÆ\u0003J\t\u0010-\u001a\u00020\u0012HÆ\u0003J\t\u0010.\u001a\u00020\u0012HÆ\u0003Jm\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020\u0012HÖ\u0001J\t\u00105\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0014\u0010\n\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0014\u0010\f\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010\u0013\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#¨\u00066"}, m65681d2 = {"Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;", "Lio/getstream/chat/android/client/events/CidEvent;", "Lio/getstream/chat/android/client/events/HasChannel;", "Lio/getstream/chat/android/client/events/HasMessage;", "Lio/getstream/chat/android/client/events/HasUnreadCounts;", "type", "", "createdAt", "Ljava/util/Date;", "rawCreatedAt", "cid", "channelType", "channelId", "channel", "Lio/getstream/chat/android/models/Channel;", "message", "Lio/getstream/chat/android/models/Message;", "totalUnreadCount", "", "unreadChannels", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;II)V", "getType", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getRawCreatedAt", "getCid", "getChannelType", "getChannelId", "getChannel", "()Lio/getstream/chat/android/models/Channel;", "getMessage", "()Lio/getstream/chat/android/models/Message;", "getTotalUnreadCount", "()I", "getUnreadChannels", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class NotificationMessageNewEvent extends CidEvent implements HasChannel, HasMessage, HasUnreadCounts {
    private final Channel channel;
    private final String channelId;
    private final String channelType;
    private final String cid;
    private final Date createdAt;
    private final Message message;
    private final String rawCreatedAt;
    private final int totalUnreadCount;
    private final String type;
    private final int unreadChannels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationMessageNewEvent(String type, Date createdAt, String rawCreatedAt, String cid, String channelType, String channelId, Channel channel, Message message, int i13, int i14) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(channel, "channel");
        AbstractC22676k.m65750j(message, "message");
        this.type = type;
        this.createdAt = createdAt;
        this.rawCreatedAt = rawCreatedAt;
        this.cid = cid;
        this.channelType = channelType;
        this.channelId = channelId;
        this.channel = channel;
        this.message = message;
        this.totalUnreadCount = i13;
        this.unreadChannels = i14;
    }

    public static /* synthetic */ NotificationMessageNewEvent copy$default(NotificationMessageNewEvent notificationMessageNewEvent, String str, Date date, String str2, String str3, String str4, String str5, Channel channel, Message message, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = notificationMessageNewEvent.type;
        }
        if ((i15 & 2) != 0) {
            date = notificationMessageNewEvent.createdAt;
        }
        if ((i15 & 4) != 0) {
            str2 = notificationMessageNewEvent.rawCreatedAt;
        }
        if ((i15 & 8) != 0) {
            str3 = notificationMessageNewEvent.cid;
        }
        if ((i15 & 16) != 0) {
            str4 = notificationMessageNewEvent.channelType;
        }
        if ((i15 & 32) != 0) {
            str5 = notificationMessageNewEvent.channelId;
        }
        if ((i15 & 64) != 0) {
            channel = notificationMessageNewEvent.channel;
        }
        if ((i15 & 128) != 0) {
            message = notificationMessageNewEvent.message;
        }
        if ((i15 & 256) != 0) {
            i13 = notificationMessageNewEvent.totalUnreadCount;
        }
        if ((i15 & 512) != 0) {
            i14 = notificationMessageNewEvent.unreadChannels;
        }
        int i16 = i13;
        int i17 = i14;
        Channel channel2 = channel;
        Message message2 = message;
        String str6 = str4;
        String str7 = str5;
        return notificationMessageNewEvent.copy(str, date, str2, str3, str6, str7, channel2, message2, i16, i17);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getUnreadChannels() {
        return this.unreadChannels;
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
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getChannelType() {
        return this.channelType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Channel getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Message getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getTotalUnreadCount() {
        return this.totalUnreadCount;
    }

    public final NotificationMessageNewEvent copy(String type, Date createdAt, String rawCreatedAt, String cid, String channelType, String channelId, Channel channel, Message message, int totalUnreadCount, int unreadChannels) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(channel, "channel");
        AbstractC22676k.m65750j(message, "message");
        return new NotificationMessageNewEvent(type, createdAt, rawCreatedAt, cid, channelType, channelId, channel, message, totalUnreadCount, unreadChannels);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationMessageNewEvent)) {
            return false;
        }
        NotificationMessageNewEvent notificationMessageNewEvent = (NotificationMessageNewEvent) other;
        return AbstractC22676k.m65745e(this.type, notificationMessageNewEvent.type) && AbstractC22676k.m65745e(this.createdAt, notificationMessageNewEvent.createdAt) && AbstractC22676k.m65745e(this.rawCreatedAt, notificationMessageNewEvent.rawCreatedAt) && AbstractC22676k.m65745e(this.cid, notificationMessageNewEvent.cid) && AbstractC22676k.m65745e(this.channelType, notificationMessageNewEvent.channelType) && AbstractC22676k.m65745e(this.channelId, notificationMessageNewEvent.channelId) && AbstractC22676k.m65745e(this.channel, notificationMessageNewEvent.channel) && AbstractC22676k.m65745e(this.message, notificationMessageNewEvent.message) && this.totalUnreadCount == notificationMessageNewEvent.totalUnreadCount && this.unreadChannels == notificationMessageNewEvent.unreadChannels;
    }

    @Override // io.getstream.chat.android.client.events.HasChannel
    public final Channel getChannel() {
        return this.channel;
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

    @Override // io.getstream.chat.android.client.events.HasMessage
    public final Message getMessage() {
        return this.message;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getRawCreatedAt() {
        return this.rawCreatedAt;
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

    public final int hashCode() {
        return Integer.hashCode(this.unreadChannels) + AbstractC11266d.m30448b(this.totalUnreadCount, (this.message.hashCode() + ((this.channel.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC38963t7.m124373c(this.createdAt, this.type.hashCode() * 31, 31), 31, this.rawCreatedAt), 31, this.cid), 31, this.channelType), 31, this.channelId)) * 31)) * 31, 31);
    }

    public final String toString() {
        String str = this.type;
        Date date = this.createdAt;
        String str2 = this.rawCreatedAt;
        String str3 = this.cid;
        String str4 = this.channelType;
        String str5 = this.channelId;
        Channel channel = this.channel;
        Message message = this.message;
        int i13 = this.totalUnreadCount;
        int i14 = this.unreadChannels;
        StringBuilder sbM11830n = AbstractC3855a.m11830n("NotificationMessageNewEvent(type=", str, ", createdAt=", date, ", rawCreatedAt=");
        AbstractC11266d.m30444B(sbM11830n, str2, ", cid=", str3, ", channelType=");
        AbstractC11266d.m30444B(sbM11830n, str4, ", channelId=", str5, ", channel=");
        sbM11830n.append(channel);
        sbM11830n.append(", message=");
        sbM11830n.append(message);
        sbM11830n.append(", totalUnreadCount=");
        return AbstractC26725a.m79505i(sbM11830n, i13, ", unreadChannels=", i14, ")");
    }

    public /* synthetic */ NotificationMessageNewEvent(String str, Date date, String str2, String str3, String str4, String str5, Channel channel, Message message, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, date, str2, str3, str4, str5, channel, message, (i15 & 256) != 0 ? 0 : i13, (i15 & 512) != 0 ? 0 : i14);
    }
}
