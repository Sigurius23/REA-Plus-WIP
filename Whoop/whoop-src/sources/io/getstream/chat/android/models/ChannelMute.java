package io.getstream.chat.android.models;

import com.whoop.service.network.model.UserState;
import hc3.AbstractC17176i;
import java.util.Date;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006!"}, m65681d2 = {"Lio/getstream/chat/android/models/ChannelMute;", "", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "channel", "Lio/getstream/chat/android/models/Channel;", "createdAt", "Ljava/util/Date;", "updatedAt", "expires", "<init>", "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Channel;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V", "getUser", "()Lio/getstream/chat/android/models/User;", "getChannel", "()Lio/getstream/chat/android/models/Channel;", "getCreatedAt", "()Ljava/util/Date;", "getUpdatedAt", "getExpires", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ChannelMute {
    private final Channel channel;
    private final Date createdAt;
    private final Date expires;
    private final Date updatedAt;
    private final User user;

    public ChannelMute(User user, Channel channel, Date createdAt, Date updatedAt, Date date) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        this.user = user;
        this.channel = channel;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.expires = date;
    }

    public static /* synthetic */ ChannelMute copy$default(ChannelMute channelMute, User user, Channel channel, Date date, Date date2, Date date3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            user = channelMute.user;
        }
        if ((i13 & 2) != 0) {
            channel = channelMute.channel;
        }
        if ((i13 & 4) != 0) {
            date = channelMute.createdAt;
        }
        if ((i13 & 8) != 0) {
            date2 = channelMute.updatedAt;
        }
        if ((i13 & 16) != 0) {
            date3 = channelMute.expires;
        }
        Date date4 = date3;
        Date date5 = date;
        return channelMute.copy(user, channel, date5, date2, date4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Channel getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getExpires() {
        return this.expires;
    }

    public final ChannelMute copy(User user, Channel channel, Date createdAt, Date updatedAt, Date expires) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        return new ChannelMute(user, channel, createdAt, updatedAt, expires);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelMute)) {
            return false;
        }
        ChannelMute channelMute = (ChannelMute) other;
        return AbstractC22676k.m65745e(this.user, channelMute.user) && AbstractC22676k.m65745e(this.channel, channelMute.channel) && AbstractC22676k.m65745e(this.createdAt, channelMute.createdAt) && AbstractC22676k.m65745e(this.updatedAt, channelMute.updatedAt) && AbstractC22676k.m65745e(this.expires, channelMute.expires);
    }

    public final Channel getChannel() {
        return this.channel;
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final Date getExpires() {
        return this.expires;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        User user = this.user;
        int iHashCode = (user == null ? 0 : user.hashCode()) * 31;
        Channel channel = this.channel;
        int iM124373c = AbstractC38963t7.m124373c(this.updatedAt, AbstractC38963t7.m124373c(this.createdAt, (iHashCode + (channel == null ? 0 : channel.hashCode())) * 31, 31), 31);
        Date date = this.expires;
        return iM124373c + (date != null ? date.hashCode() : 0);
    }

    public String toString() {
        User user = this.user;
        Channel channel = this.channel;
        Date date = this.createdAt;
        Date date2 = this.updatedAt;
        Date date3 = this.expires;
        StringBuilder sb4 = new StringBuilder("ChannelMute(user=");
        sb4.append(user);
        sb4.append(", channel=");
        sb4.append(channel);
        sb4.append(", createdAt=");
        AbstractC17176i.m48512n(sb4, date, ", updatedAt=", date2, ", expires=");
        return AbstractC13673n.m38564k(sb4, date3, ")");
    }
}
