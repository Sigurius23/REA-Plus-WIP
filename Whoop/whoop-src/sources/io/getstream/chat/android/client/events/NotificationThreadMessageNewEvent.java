package io.getstream.chat.android.client.events;

import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Message;
import java.util.Date;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BY\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u000bHÆ\u0003J\t\u0010*\u001a\u00020\rHÆ\u0003J\t\u0010+\u001a\u00020\u000fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0012HÆ\u0003J\t\u0010.\u001a\u00020\u0012HÆ\u0003Jo\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020\u0012HÖ\u0001J\t\u00105\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0014\u0010\b\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\t\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010\u0013\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#¨\u00066"}, m65681d2 = {"Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;", "Lio/getstream/chat/android/client/events/CidEvent;", "Lio/getstream/chat/android/client/events/HasMessage;", "Lio/getstream/chat/android/client/events/HasChannel;", "Lio/getstream/chat/android/client/events/HasUnreadThreadCounts;", "type", "", "cid", "channelId", "channelType", "message", "Lio/getstream/chat/android/models/Message;", "channel", "Lio/getstream/chat/android/models/Channel;", "createdAt", "Ljava/util/Date;", "rawCreatedAt", "unreadThreads", "", "unreadThreadMessages", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Channel;Ljava/util/Date;Ljava/lang/String;II)V", "getType", "()Ljava/lang/String;", "getCid", "getChannelId", "getChannelType", "getMessage", "()Lio/getstream/chat/android/models/Message;", "getChannel", "()Lio/getstream/chat/android/models/Channel;", "getCreatedAt", "()Ljava/util/Date;", "getRawCreatedAt", "getUnreadThreads", "()Ljava/lang/Integer;", "getUnreadThreadMessages", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class NotificationThreadMessageNewEvent extends CidEvent implements HasMessage, HasChannel, HasUnreadThreadCounts {
    private final Channel channel;
    private final String channelId;
    private final String channelType;
    private final String cid;
    private final Date createdAt;
    private final Message message;
    private final String rawCreatedAt;
    private final String type;
    private final int unreadThreadMessages;
    private final int unreadThreads;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationThreadMessageNewEvent(String type, String cid, String channelId, String channelType, Message message, Channel channel, Date createdAt, String str, int i13, int i14) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(channel, "channel");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        this.type = type;
        this.cid = cid;
        this.channelId = channelId;
        this.channelType = channelType;
        this.message = message;
        this.channel = channel;
        this.createdAt = createdAt;
        this.rawCreatedAt = str;
        this.unreadThreads = i13;
        this.unreadThreadMessages = i14;
    }

    public static /* synthetic */ NotificationThreadMessageNewEvent copy$default(NotificationThreadMessageNewEvent notificationThreadMessageNewEvent, String str, String str2, String str3, String str4, Message message, Channel channel, Date date, String str5, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = notificationThreadMessageNewEvent.type;
        }
        if ((i15 & 2) != 0) {
            str2 = notificationThreadMessageNewEvent.cid;
        }
        if ((i15 & 4) != 0) {
            str3 = notificationThreadMessageNewEvent.channelId;
        }
        if ((i15 & 8) != 0) {
            str4 = notificationThreadMessageNewEvent.channelType;
        }
        if ((i15 & 16) != 0) {
            message = notificationThreadMessageNewEvent.message;
        }
        if ((i15 & 32) != 0) {
            channel = notificationThreadMessageNewEvent.channel;
        }
        if ((i15 & 64) != 0) {
            date = notificationThreadMessageNewEvent.createdAt;
        }
        if ((i15 & 128) != 0) {
            str5 = notificationThreadMessageNewEvent.rawCreatedAt;
        }
        if ((i15 & 256) != 0) {
            i13 = notificationThreadMessageNewEvent.unreadThreads;
        }
        if ((i15 & 512) != 0) {
            i14 = notificationThreadMessageNewEvent.unreadThreadMessages;
        }
        int i16 = i13;
        int i17 = i14;
        Date date2 = date;
        String str6 = str5;
        Message message2 = message;
        Channel channel2 = channel;
        return notificationThreadMessageNewEvent.copy(str, str2, str3, str4, message2, channel2, date2, str6, i16, i17);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getUnreadThreadMessages() {
        return this.unreadThreadMessages;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getChannelType() {
        return this.channelType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Message getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Channel getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRawCreatedAt() {
        return this.rawCreatedAt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getUnreadThreads() {
        return this.unreadThreads;
    }

    public final NotificationThreadMessageNewEvent copy(String type, String cid, String channelId, String channelType, Message message, Channel channel, Date createdAt, String rawCreatedAt, int unreadThreads, int unreadThreadMessages) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(channel, "channel");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        return new NotificationThreadMessageNewEvent(type, cid, channelId, channelType, message, channel, createdAt, rawCreatedAt, unreadThreads, unreadThreadMessages);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationThreadMessageNewEvent)) {
            return false;
        }
        NotificationThreadMessageNewEvent notificationThreadMessageNewEvent = (NotificationThreadMessageNewEvent) other;
        return AbstractC22676k.m65745e(this.type, notificationThreadMessageNewEvent.type) && AbstractC22676k.m65745e(this.cid, notificationThreadMessageNewEvent.cid) && AbstractC22676k.m65745e(this.channelId, notificationThreadMessageNewEvent.channelId) && AbstractC22676k.m65745e(this.channelType, notificationThreadMessageNewEvent.channelType) && AbstractC22676k.m65745e(this.message, notificationThreadMessageNewEvent.message) && AbstractC22676k.m65745e(this.channel, notificationThreadMessageNewEvent.channel) && AbstractC22676k.m65745e(this.createdAt, notificationThreadMessageNewEvent.createdAt) && AbstractC22676k.m65745e(this.rawCreatedAt, notificationThreadMessageNewEvent.rawCreatedAt) && this.unreadThreads == notificationThreadMessageNewEvent.unreadThreads && this.unreadThreadMessages == notificationThreadMessageNewEvent.unreadThreadMessages;
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

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getType() {
        return this.type;
    }

    @Override // io.getstream.chat.android.client.events.HasUnreadThreadCounts
    public final Integer getUnreadThreadMessages() {
        return Integer.valueOf(this.unreadThreadMessages);
    }

    @Override // io.getstream.chat.android.client.events.HasUnreadThreadCounts
    public final Integer getUnreadThreads() {
        return Integer.valueOf(this.unreadThreads);
    }

    public final int hashCode() {
        int iM124373c = AbstractC38963t7.m124373c(this.createdAt, (this.channel.hashCode() + ((this.message.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.type.hashCode() * 31, 31, this.cid), 31, this.channelId), 31, this.channelType)) * 31)) * 31, 31);
        String str = this.rawCreatedAt;
        return Integer.hashCode(this.unreadThreadMessages) + AbstractC11266d.m30448b(this.unreadThreads, (iM124373c + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        String str = this.type;
        String str2 = this.cid;
        String str3 = this.channelId;
        String str4 = this.channelType;
        Message message = this.message;
        Channel channel = this.channel;
        Date date = this.createdAt;
        String str5 = this.rawCreatedAt;
        int i13 = this.unreadThreads;
        int i14 = this.unreadThreadMessages;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("NotificationThreadMessageNewEvent(type=", str, ", cid=", str2, ", channelId=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", channelType=", str4, ", message=");
        sbM32001t.append(message);
        sbM32001t.append(", channel=");
        sbM32001t.append(channel);
        sbM32001t.append(", createdAt=");
        sbM32001t.append(date);
        sbM32001t.append(", rawCreatedAt=");
        sbM32001t.append(str5);
        sbM32001t.append(", unreadThreads=");
        return AbstractC26725a.m79505i(sbM32001t, i13, ", unreadThreadMessages=", i14, ")");
    }
}
