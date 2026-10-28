package io.getstream.chat.android.client.api2.model.dto;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import d13.AbstractC11478a;
import io.getstream.chat.android.client.api2.model.dto.utils.internal.ExactDate;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010%\u001a\u00020\u000eHÆ\u0003J]\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/ChannelTruncatedEventDto;", "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "type", "", "created_at", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "cid", "channel_type", "channel_id", UserState.Sources.USER, "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "message", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "channel", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;)V", "getType", "()Ljava/lang/String;", "getCreated_at", "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "getCid", "getChannel_type", "getChannel_id", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getMessage", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "getChannel", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ChannelTruncatedEventDto extends ChatEventDto {
    private final DownstreamChannelDto channel;
    private final String channel_id;
    private final String channel_type;
    private final String cid;
    private final ExactDate created_at;
    private final DownstreamMessageDto message;
    private final String type;
    private final DownstreamUserDto user;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelTruncatedEventDto(String type, ExactDate created_at, String cid, String channel_type, String channel_id, DownstreamUserDto downstreamUserDto, DownstreamMessageDto downstreamMessageDto, DownstreamChannelDto channel) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channel_type, "channel_type");
        AbstractC22676k.m65750j(channel_id, "channel_id");
        AbstractC22676k.m65750j(channel, "channel");
        this.type = type;
        this.created_at = created_at;
        this.cid = cid;
        this.channel_type = channel_type;
        this.channel_id = channel_id;
        this.user = downstreamUserDto;
        this.message = downstreamMessageDto;
        this.channel = channel;
    }

    public static /* synthetic */ ChannelTruncatedEventDto copy$default(ChannelTruncatedEventDto channelTruncatedEventDto, String str, ExactDate exactDate, String str2, String str3, String str4, DownstreamUserDto downstreamUserDto, DownstreamMessageDto downstreamMessageDto, DownstreamChannelDto downstreamChannelDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = channelTruncatedEventDto.type;
        }
        if ((i13 & 2) != 0) {
            exactDate = channelTruncatedEventDto.created_at;
        }
        if ((i13 & 4) != 0) {
            str2 = channelTruncatedEventDto.cid;
        }
        if ((i13 & 8) != 0) {
            str3 = channelTruncatedEventDto.channel_type;
        }
        if ((i13 & 16) != 0) {
            str4 = channelTruncatedEventDto.channel_id;
        }
        if ((i13 & 32) != 0) {
            downstreamUserDto = channelTruncatedEventDto.user;
        }
        if ((i13 & 64) != 0) {
            downstreamMessageDto = channelTruncatedEventDto.message;
        }
        if ((i13 & 128) != 0) {
            downstreamChannelDto = channelTruncatedEventDto.channel;
        }
        DownstreamMessageDto downstreamMessageDto2 = downstreamMessageDto;
        DownstreamChannelDto downstreamChannelDto2 = downstreamChannelDto;
        String str5 = str4;
        DownstreamUserDto downstreamUserDto2 = downstreamUserDto;
        return channelTruncatedEventDto.copy(str, exactDate, str2, str3, str5, downstreamUserDto2, downstreamMessageDto2, downstreamChannelDto2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ExactDate getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getChannel_type() {
        return this.channel_type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getChannel_id() {
        return this.channel_id;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DownstreamUserDto getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DownstreamMessageDto getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final DownstreamChannelDto getChannel() {
        return this.channel;
    }

    public final ChannelTruncatedEventDto copy(String type, ExactDate created_at, String cid, String channel_type, String channel_id, DownstreamUserDto user, DownstreamMessageDto message, DownstreamChannelDto channel) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channel_type, "channel_type");
        AbstractC22676k.m65750j(channel_id, "channel_id");
        AbstractC22676k.m65750j(channel, "channel");
        return new ChannelTruncatedEventDto(type, created_at, cid, channel_type, channel_id, user, message, channel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelTruncatedEventDto)) {
            return false;
        }
        ChannelTruncatedEventDto channelTruncatedEventDto = (ChannelTruncatedEventDto) other;
        return AbstractC22676k.m65745e(this.type, channelTruncatedEventDto.type) && AbstractC22676k.m65745e(this.created_at, channelTruncatedEventDto.created_at) && AbstractC22676k.m65745e(this.cid, channelTruncatedEventDto.cid) && AbstractC22676k.m65745e(this.channel_type, channelTruncatedEventDto.channel_type) && AbstractC22676k.m65745e(this.channel_id, channelTruncatedEventDto.channel_id) && AbstractC22676k.m65745e(this.user, channelTruncatedEventDto.user) && AbstractC22676k.m65745e(this.message, channelTruncatedEventDto.message) && AbstractC22676k.m65745e(this.channel, channelTruncatedEventDto.channel);
    }

    public final DownstreamChannelDto getChannel() {
        return this.channel;
    }

    public final String getChannel_id() {
        return this.channel_id;
    }

    public final String getChannel_type() {
        return this.channel_type;
    }

    public final String getCid() {
        return this.cid;
    }

    public final ExactDate getCreated_at() {
        return this.created_at;
    }

    public final DownstreamMessageDto getMessage() {
        return this.message;
    }

    public final String getType() {
        return this.type;
    }

    public final DownstreamUserDto getUser() {
        return this.user;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC3855a.m11820d(this.created_at, this.type.hashCode() * 31, 31), 31, this.cid), 31, this.channel_type), 31, this.channel_id);
        DownstreamUserDto downstreamUserDto = this.user;
        int iHashCode = (iM30450d + (downstreamUserDto == null ? 0 : downstreamUserDto.hashCode())) * 31;
        DownstreamMessageDto downstreamMessageDto = this.message;
        return this.channel.hashCode() + ((iHashCode + (downstreamMessageDto != null ? downstreamMessageDto.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.type;
        ExactDate exactDate = this.created_at;
        String str2 = this.cid;
        String str3 = this.channel_type;
        String str4 = this.channel_id;
        DownstreamUserDto downstreamUserDto = this.user;
        DownstreamMessageDto downstreamMessageDto = this.message;
        DownstreamChannelDto downstreamChannelDto = this.channel;
        StringBuilder sbM30861m = AbstractC11478a.m30861m("ChannelTruncatedEventDto(type=", str, ", created_at=", exactDate, ", cid=");
        AbstractC11266d.m30444B(sbM30861m, str2, ", channel_type=", str3, ", channel_id=");
        sbM30861m.append(str4);
        sbM30861m.append(", user=");
        sbM30861m.append(downstreamUserDto);
        sbM30861m.append(", message=");
        sbM30861m.append(downstreamMessageDto);
        sbM30861m.append(", channel=");
        sbM30861m.append(downstreamChannelDto);
        sbM30861m.append(")");
        return sbM30861m.toString();
    }
}
