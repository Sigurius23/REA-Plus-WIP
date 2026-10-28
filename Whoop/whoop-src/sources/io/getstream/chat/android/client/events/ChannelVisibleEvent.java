package io.getstream.chat.android.client.events;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import d13.AbstractC11478a;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.User;
import java.util.Date;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BG\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\t\u0010%\u001a\u00020\u000fHÆ\u0003JY\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\t\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, m65681d2 = {"Lio/getstream/chat/android/client/events/ChannelVisibleEvent;", "Lio/getstream/chat/android/client/events/CidEvent;", "Lio/getstream/chat/android/client/events/UserEvent;", "Lio/getstream/chat/android/client/events/HasChannel;", "type", "", "createdAt", "Ljava/util/Date;", "rawCreatedAt", "cid", "channelType", "channelId", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "channel", "Lio/getstream/chat/android/models/Channel;", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Channel;)V", "getType", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getRawCreatedAt", "getCid", "getChannelType", "getChannelId", "getUser", "()Lio/getstream/chat/android/models/User;", "getChannel", "()Lio/getstream/chat/android/models/Channel;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ChannelVisibleEvent extends CidEvent implements UserEvent, HasChannel {
    private final Channel channel;
    private final String channelId;
    private final String channelType;
    private final String cid;
    private final Date createdAt;
    private final String rawCreatedAt;
    private final String type;
    private final User user;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelVisibleEvent(String type, Date createdAt, String rawCreatedAt, String cid, String channelType, String channelId, User user, Channel channel) {
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
    }

    public static /* synthetic */ ChannelVisibleEvent copy$default(ChannelVisibleEvent channelVisibleEvent, String str, Date date, String str2, String str3, String str4, String str5, User user, Channel channel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = channelVisibleEvent.type;
        }
        if ((i13 & 2) != 0) {
            date = channelVisibleEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            str2 = channelVisibleEvent.rawCreatedAt;
        }
        if ((i13 & 8) != 0) {
            str3 = channelVisibleEvent.cid;
        }
        if ((i13 & 16) != 0) {
            str4 = channelVisibleEvent.channelType;
        }
        if ((i13 & 32) != 0) {
            str5 = channelVisibleEvent.channelId;
        }
        if ((i13 & 64) != 0) {
            user = channelVisibleEvent.user;
        }
        if ((i13 & 128) != 0) {
            channel = channelVisibleEvent.channel;
        }
        User user2 = user;
        Channel channel2 = channel;
        String str6 = str4;
        String str7 = str5;
        return channelVisibleEvent.copy(str, date, str2, str3, str6, str7, user2, channel2);
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

    public final ChannelVisibleEvent copy(String type, Date createdAt, String rawCreatedAt, String cid, String channelType, String channelId, User user, Channel channel) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(channel, "channel");
        return new ChannelVisibleEvent(type, createdAt, rawCreatedAt, cid, channelType, channelId, user, channel);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelVisibleEvent)) {
            return false;
        }
        ChannelVisibleEvent channelVisibleEvent = (ChannelVisibleEvent) other;
        return AbstractC22676k.m65745e(this.type, channelVisibleEvent.type) && AbstractC22676k.m65745e(this.createdAt, channelVisibleEvent.createdAt) && AbstractC22676k.m65745e(this.rawCreatedAt, channelVisibleEvent.rawCreatedAt) && AbstractC22676k.m65745e(this.cid, channelVisibleEvent.cid) && AbstractC22676k.m65745e(this.channelType, channelVisibleEvent.channelType) && AbstractC22676k.m65745e(this.channelId, channelVisibleEvent.channelId) && AbstractC22676k.m65745e(this.user, channelVisibleEvent.user) && AbstractC22676k.m65745e(this.channel, channelVisibleEvent.channel);
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

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getType() {
        return this.type;
    }

    @Override // io.getstream.chat.android.client.events.UserEvent
    public final User getUser() {
        return this.user;
    }

    public final int hashCode() {
        return this.channel.hashCode() + AbstractC11478a.m30850b(this.user, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC38963t7.m124373c(this.createdAt, this.type.hashCode() * 31, 31), 31, this.rawCreatedAt), 31, this.cid), 31, this.channelType), 31, this.channelId), 31);
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
        StringBuilder sbM11830n = AbstractC3855a.m11830n("ChannelVisibleEvent(type=", str, ", createdAt=", date, ", rawCreatedAt=");
        AbstractC11266d.m30444B(sbM11830n, str2, ", cid=", str3, ", channelType=");
        AbstractC11266d.m30444B(sbM11830n, str4, ", channelId=", str5, ", user=");
        sbM11830n.append(user);
        sbM11830n.append(", channel=");
        sbM11830n.append(channel);
        sbM11830n.append(")");
        return sbM11830n.toString();
    }
}
