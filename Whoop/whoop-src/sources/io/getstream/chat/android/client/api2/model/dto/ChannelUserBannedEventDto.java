package io.getstream.chat.android.client.api2.model.dto;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import d13.AbstractC11478a;
import io.getstream.chat.android.client.api2.model.dto.utils.internal.ExactDate;
import java.util.Date;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001dJb\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001d¨\u0006/"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/ChannelUserBannedEventDto;", "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "type", "", "created_at", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "cid", "channel_type", "channel_id", UserState.Sources.USER, "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "expiration", "Ljava/util/Date;", "shadow", "", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/util/Date;Ljava/lang/Boolean;)V", "getType", "()Ljava/lang/String;", "getCreated_at", "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "getCid", "getChannel_type", "getChannel_id", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getExpiration", "()Ljava/util/Date;", "getShadow", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/util/Date;Ljava/lang/Boolean;)Lio/getstream/chat/android/client/api2/model/dto/ChannelUserBannedEventDto;", "equals", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ChannelUserBannedEventDto extends ChatEventDto {
    private final String channel_id;
    private final String channel_type;
    private final String cid;
    private final ExactDate created_at;
    private final Date expiration;
    private final Boolean shadow;
    private final String type;
    private final DownstreamUserDto user;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelUserBannedEventDto(String type, ExactDate created_at, String cid, String channel_type, String channel_id, DownstreamUserDto user, Date date, Boolean bool) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channel_type, "channel_type");
        AbstractC22676k.m65750j(channel_id, "channel_id");
        AbstractC22676k.m65750j(user, "user");
        this.type = type;
        this.created_at = created_at;
        this.cid = cid;
        this.channel_type = channel_type;
        this.channel_id = channel_id;
        this.user = user;
        this.expiration = date;
        this.shadow = bool;
    }

    public static /* synthetic */ ChannelUserBannedEventDto copy$default(ChannelUserBannedEventDto channelUserBannedEventDto, String str, ExactDate exactDate, String str2, String str3, String str4, DownstreamUserDto downstreamUserDto, Date date, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = channelUserBannedEventDto.type;
        }
        if ((i13 & 2) != 0) {
            exactDate = channelUserBannedEventDto.created_at;
        }
        if ((i13 & 4) != 0) {
            str2 = channelUserBannedEventDto.cid;
        }
        if ((i13 & 8) != 0) {
            str3 = channelUserBannedEventDto.channel_type;
        }
        if ((i13 & 16) != 0) {
            str4 = channelUserBannedEventDto.channel_id;
        }
        if ((i13 & 32) != 0) {
            downstreamUserDto = channelUserBannedEventDto.user;
        }
        if ((i13 & 64) != 0) {
            date = channelUserBannedEventDto.expiration;
        }
        if ((i13 & 128) != 0) {
            bool = channelUserBannedEventDto.shadow;
        }
        Date date2 = date;
        Boolean bool2 = bool;
        String str5 = str4;
        DownstreamUserDto downstreamUserDto2 = downstreamUserDto;
        return channelUserBannedEventDto.copy(str, exactDate, str2, str3, str5, downstreamUserDto2, date2, bool2);
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
    public final Date getExpiration() {
        return this.expiration;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getShadow() {
        return this.shadow;
    }

    public final ChannelUserBannedEventDto copy(String type, ExactDate created_at, String cid, String channel_type, String channel_id, DownstreamUserDto user, Date expiration, Boolean shadow) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channel_type, "channel_type");
        AbstractC22676k.m65750j(channel_id, "channel_id");
        AbstractC22676k.m65750j(user, "user");
        return new ChannelUserBannedEventDto(type, created_at, cid, channel_type, channel_id, user, expiration, shadow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelUserBannedEventDto)) {
            return false;
        }
        ChannelUserBannedEventDto channelUserBannedEventDto = (ChannelUserBannedEventDto) other;
        return AbstractC22676k.m65745e(this.type, channelUserBannedEventDto.type) && AbstractC22676k.m65745e(this.created_at, channelUserBannedEventDto.created_at) && AbstractC22676k.m65745e(this.cid, channelUserBannedEventDto.cid) && AbstractC22676k.m65745e(this.channel_type, channelUserBannedEventDto.channel_type) && AbstractC22676k.m65745e(this.channel_id, channelUserBannedEventDto.channel_id) && AbstractC22676k.m65745e(this.user, channelUserBannedEventDto.user) && AbstractC22676k.m65745e(this.expiration, channelUserBannedEventDto.expiration) && AbstractC22676k.m65745e(this.shadow, channelUserBannedEventDto.shadow);
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

    public final Date getExpiration() {
        return this.expiration;
    }

    public final Boolean getShadow() {
        return this.shadow;
    }

    public final String getType() {
        return this.type;
    }

    public final DownstreamUserDto getUser() {
        return this.user;
    }

    public int hashCode() {
        int iM11819c = AbstractC3855a.m11819c(this.user, AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC3855a.m11820d(this.created_at, this.type.hashCode() * 31, 31), 31, this.cid), 31, this.channel_type), 31, this.channel_id), 31);
        Date date = this.expiration;
        int iHashCode = (iM11819c + (date == null ? 0 : date.hashCode())) * 31;
        Boolean bool = this.shadow;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.type;
        ExactDate exactDate = this.created_at;
        String str2 = this.cid;
        String str3 = this.channel_type;
        String str4 = this.channel_id;
        DownstreamUserDto downstreamUserDto = this.user;
        Date date = this.expiration;
        Boolean bool = this.shadow;
        StringBuilder sbM30861m = AbstractC11478a.m30861m("ChannelUserBannedEventDto(type=", str, ", created_at=", exactDate, ", cid=");
        AbstractC11266d.m30444B(sbM30861m, str2, ", channel_type=", str3, ", channel_id=");
        sbM30861m.append(str4);
        sbM30861m.append(", user=");
        sbM30861m.append(downstreamUserDto);
        sbM30861m.append(", expiration=");
        sbM30861m.append(date);
        sbM30861m.append(", shadow=");
        sbM30861m.append(bool);
        sbM30861m.append(")");
        return sbM30861m.toString();
    }
}
