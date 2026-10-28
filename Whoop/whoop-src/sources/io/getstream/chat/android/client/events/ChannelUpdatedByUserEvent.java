package io.getstream.chat.android.client.events;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import d13.AbstractC11478a;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import java.util.Date;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\t\u0010)\u001a\u00020\u000fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0011HÆ\u0003Je\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\t\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00063"}, m65681d2 = {"Lio/getstream/chat/android/client/events/ChannelUpdatedByUserEvent;", "Lio/getstream/chat/android/client/events/CidEvent;", "Lio/getstream/chat/android/client/events/UserEvent;", "Lio/getstream/chat/android/client/events/HasChannel;", "type", "", "createdAt", "Ljava/util/Date;", "rawCreatedAt", "cid", "channelType", "channelId", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "channel", "Lio/getstream/chat/android/models/Channel;", "message", "Lio/getstream/chat/android/models/Message;", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)V", "getType", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getRawCreatedAt", "getCid", "getChannelType", "getChannelId", "getUser", "()Lio/getstream/chat/android/models/User;", "getChannel", "()Lio/getstream/chat/android/models/Channel;", "getMessage", "()Lio/getstream/chat/android/models/Message;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ChannelUpdatedByUserEvent extends CidEvent implements UserEvent, HasChannel {
    private final Channel channel;
    private final String channelId;
    private final String channelType;
    private final String cid;
    private final Date createdAt;
    private final Message message;
    private final String rawCreatedAt;
    private final String type;
    private final User user;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelUpdatedByUserEvent(String type, Date createdAt, String rawCreatedAt, String cid, String channelType, String channelId, User user, Channel channel, Message message) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(channel, "channel");
        this.type = type;
        this.createdAt = createdAt;
        this.rawCreatedAt = rawCreatedAt;
        this.cid = cid;
        this.channelType = channelType;
        this.channelId = channelId;
        this.user = user;
        this.channel = channel;
        this.message = message;
    }

    public static /* synthetic */ ChannelUpdatedByUserEvent copy$default(ChannelUpdatedByUserEvent channelUpdatedByUserEvent, String str, Date date, String str2, String str3, String str4, String str5, User user, Channel channel, Message message, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = channelUpdatedByUserEvent.type;
        }
        if ((i13 & 2) != 0) {
            date = channelUpdatedByUserEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            str2 = channelUpdatedByUserEvent.rawCreatedAt;
        }
        if ((i13 & 8) != 0) {
            str3 = channelUpdatedByUserEvent.cid;
        }
        if ((i13 & 16) != 0) {
            str4 = channelUpdatedByUserEvent.channelType;
        }
        if ((i13 & 32) != 0) {
            str5 = channelUpdatedByUserEvent.channelId;
        }
        if ((i13 & 64) != 0) {
            user = channelUpdatedByUserEvent.user;
        }
        if ((i13 & 128) != 0) {
            channel = channelUpdatedByUserEvent.channel;
        }
        if ((i13 & 256) != 0) {
            message = channelUpdatedByUserEvent.message;
        }
        Channel channel2 = channel;
        Message message2 = message;
        String str6 = str5;
        User user2 = user;
        String str7 = str4;
        String str8 = str2;
        return channelUpdatedByUserEvent.copy(str, date, str8, str3, str7, str6, user2, channel2, message2);
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
    public final User getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Channel getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Message getMessage() {
        return this.message;
    }

    public final ChannelUpdatedByUserEvent copy(String type, Date createdAt, String rawCreatedAt, String cid, String channelType, String channelId, User user, Channel channel, Message message) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(channel, "channel");
        return new ChannelUpdatedByUserEvent(type, createdAt, rawCreatedAt, cid, channelType, channelId, user, channel, message);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelUpdatedByUserEvent)) {
            return false;
        }
        ChannelUpdatedByUserEvent channelUpdatedByUserEvent = (ChannelUpdatedByUserEvent) other;
        return AbstractC22676k.m65745e(this.type, channelUpdatedByUserEvent.type) && AbstractC22676k.m65745e(this.createdAt, channelUpdatedByUserEvent.createdAt) && AbstractC22676k.m65745e(this.rawCreatedAt, channelUpdatedByUserEvent.rawCreatedAt) && AbstractC22676k.m65745e(this.cid, channelUpdatedByUserEvent.cid) && AbstractC22676k.m65745e(this.channelType, channelUpdatedByUserEvent.channelType) && AbstractC22676k.m65745e(this.channelId, channelUpdatedByUserEvent.channelId) && AbstractC22676k.m65745e(this.user, channelUpdatedByUserEvent.user) && AbstractC22676k.m65745e(this.channel, channelUpdatedByUserEvent.channel) && AbstractC22676k.m65745e(this.message, channelUpdatedByUserEvent.message);
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

    @Override // io.getstream.chat.android.client.events.UserEvent
    public final User getUser() {
        return this.user;
    }

    public final int hashCode() {
        int iHashCode = (this.channel.hashCode() + AbstractC11478a.m30850b(this.user, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC38963t7.m124373c(this.createdAt, this.type.hashCode() * 31, 31), 31, this.rawCreatedAt), 31, this.cid), 31, this.channelType), 31, this.channelId), 31)) * 31;
        Message message = this.message;
        return iHashCode + (message == null ? 0 : message.hashCode());
    }

    public final String toString() {
        String str = this.type;
        Date date = this.createdAt;
        String str2 = this.rawCreatedAt;
        String str3 = this.cid;
        String str4 = this.channelType;
        String str5 = this.channelId;
        User user = this.user;
        Channel channel = this.channel;
        Message message = this.message;
        StringBuilder sbM11830n = AbstractC3855a.m11830n("ChannelUpdatedByUserEvent(type=", str, ", createdAt=", date, ", rawCreatedAt=");
        AbstractC11266d.m30444B(sbM11830n, str2, ", cid=", str3, ", channelType=");
        AbstractC11266d.m30444B(sbM11830n, str4, ", channelId=", str5, ", user=");
        sbM11830n.append(user);
        sbM11830n.append(", channel=");
        sbM11830n.append(channel);
        sbM11830n.append(", message=");
        sbM11830n.append(message);
        sbM11830n.append(")");
        return sbM11830n.toString();
    }
}
