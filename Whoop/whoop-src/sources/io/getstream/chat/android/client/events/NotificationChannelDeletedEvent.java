package io.getstream.chat.android.client.events;

import c13.AbstractC3855a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.models.Channel;
import java.util.Date;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BS\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003J\t\u0010(\u001a\u00020\u000fHÆ\u0003Jc\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\u000fHÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\t\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0010\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001e¨\u00060"}, m65681d2 = {"Lio/getstream/chat/android/client/events/NotificationChannelDeletedEvent;", "Lio/getstream/chat/android/client/events/CidEvent;", "Lio/getstream/chat/android/client/events/HasChannel;", "Lio/getstream/chat/android/client/events/HasUnreadCounts;", "type", "", "createdAt", "Ljava/util/Date;", "rawCreatedAt", "cid", "channelType", "channelId", "channel", "Lio/getstream/chat/android/models/Channel;", "totalUnreadCount", "", "unreadChannels", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Channel;II)V", "getType", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getRawCreatedAt", "getCid", "getChannelType", "getChannelId", "getChannel", "()Lio/getstream/chat/android/models/Channel;", "getTotalUnreadCount", "()I", "getUnreadChannels", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class NotificationChannelDeletedEvent extends CidEvent implements HasChannel, HasUnreadCounts {
    private final Channel channel;
    private final String channelId;
    private final String channelType;
    private final String cid;
    private final Date createdAt;
    private final String rawCreatedAt;
    private final int totalUnreadCount;
    private final String type;
    private final int unreadChannels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationChannelDeletedEvent(String type, Date createdAt, String rawCreatedAt, String cid, String channelType, String channelId, Channel channel, int i13, int i14) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(channel, "channel");
        this.type = type;
        this.createdAt = createdAt;
        this.rawCreatedAt = rawCreatedAt;
        this.cid = cid;
        this.channelType = channelType;
        this.channelId = channelId;
        this.channel = channel;
        this.totalUnreadCount = i13;
        this.unreadChannels = i14;
    }

    public static /* synthetic */ NotificationChannelDeletedEvent copy$default(NotificationChannelDeletedEvent notificationChannelDeletedEvent, String str, Date date, String str2, String str3, String str4, String str5, Channel channel, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = notificationChannelDeletedEvent.type;
        }
        if ((i15 & 2) != 0) {
            date = notificationChannelDeletedEvent.createdAt;
        }
        if ((i15 & 4) != 0) {
            str2 = notificationChannelDeletedEvent.rawCreatedAt;
        }
        if ((i15 & 8) != 0) {
            str3 = notificationChannelDeletedEvent.cid;
        }
        if ((i15 & 16) != 0) {
            str4 = notificationChannelDeletedEvent.channelType;
        }
        if ((i15 & 32) != 0) {
            str5 = notificationChannelDeletedEvent.channelId;
        }
        if ((i15 & 64) != 0) {
            channel = notificationChannelDeletedEvent.channel;
        }
        if ((i15 & 128) != 0) {
            i13 = notificationChannelDeletedEvent.totalUnreadCount;
        }
        if ((i15 & 256) != 0) {
            i14 = notificationChannelDeletedEvent.unreadChannels;
        }
        int i16 = i13;
        int i17 = i14;
        String str6 = str5;
        Channel channel2 = channel;
        String str7 = str4;
        String str8 = str2;
        return notificationChannelDeletedEvent.copy(str, date, str8, str3, str7, str6, channel2, i16, i17);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
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
    public final int getTotalUnreadCount() {
        return this.totalUnreadCount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getUnreadChannels() {
        return this.unreadChannels;
    }

    public final NotificationChannelDeletedEvent copy(String type, Date createdAt, String rawCreatedAt, String cid, String channelType, String channelId, Channel channel, int totalUnreadCount, int unreadChannels) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(channel, "channel");
        return new NotificationChannelDeletedEvent(type, createdAt, rawCreatedAt, cid, channelType, channelId, channel, totalUnreadCount, unreadChannels);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationChannelDeletedEvent)) {
            return false;
        }
        NotificationChannelDeletedEvent notificationChannelDeletedEvent = (NotificationChannelDeletedEvent) other;
        return AbstractC22676k.m65745e(this.type, notificationChannelDeletedEvent.type) && AbstractC22676k.m65745e(this.createdAt, notificationChannelDeletedEvent.createdAt) && AbstractC22676k.m65745e(this.rawCreatedAt, notificationChannelDeletedEvent.rawCreatedAt) && AbstractC22676k.m65745e(this.cid, notificationChannelDeletedEvent.cid) && AbstractC22676k.m65745e(this.channelType, notificationChannelDeletedEvent.channelType) && AbstractC22676k.m65745e(this.channelId, notificationChannelDeletedEvent.channelId) && AbstractC22676k.m65745e(this.channel, notificationChannelDeletedEvent.channel) && this.totalUnreadCount == notificationChannelDeletedEvent.totalUnreadCount && this.unreadChannels == notificationChannelDeletedEvent.unreadChannels;
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
        return Integer.hashCode(this.unreadChannels) + AbstractC11266d.m30448b(this.totalUnreadCount, (this.channel.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC38963t7.m124373c(this.createdAt, this.type.hashCode() * 31, 31), 31, this.rawCreatedAt), 31, this.cid), 31, this.channelType), 31, this.channelId)) * 31, 31);
    }

    public final String toString() {
        String str = this.type;
        Date date = this.createdAt;
        String str2 = this.rawCreatedAt;
        String str3 = this.cid;
        String str4 = this.channelType;
        String str5 = this.channelId;
        Channel channel = this.channel;
        int i13 = this.totalUnreadCount;
        int i14 = this.unreadChannels;
        StringBuilder sbM11830n = AbstractC3855a.m11830n("NotificationChannelDeletedEvent(type=", str, ", createdAt=", date, ", rawCreatedAt=");
        AbstractC11266d.m30444B(sbM11830n, str2, ", cid=", str3, ", channelType=");
        AbstractC11266d.m30444B(sbM11830n, str4, ", channelId=", str5, ", channel=");
        sbM11830n.append(channel);
        sbM11830n.append(", totalUnreadCount=");
        sbM11830n.append(i13);
        sbM11830n.append(", unreadChannels=");
        return AbstractC18489d0.m53371l(sbM11830n, i14, ")");
    }

    public /* synthetic */ NotificationChannelDeletedEvent(String str, Date date, String str2, String str3, String str4, String str5, Channel channel, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, date, str2, str3, str4, str5, channel, (i15 & 128) != 0 ? 0 : i13, (i15 & 256) != 0 ? 0 : i14);
    }
}
