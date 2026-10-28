package io.getstream.chat.android.client.api2.model.dto;

import com.whoop.service.network.model.UserState;
import hc3.AbstractC17176i;
import java.util.Date;
import live.hms.video.utils.HMSFieldTrials;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006!"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelMuteDto;", "", UserState.Sources.USER, "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "channel", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "created_at", "Ljava/util/Date;", "updated_at", "expires", "<init>", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getChannel", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "getCreated_at", "()Ljava/util/Date;", "getUpdated_at", "getExpires", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DownstreamChannelMuteDto {
    private final DownstreamChannelDto channel;
    private final Date created_at;
    private final Date expires;
    private final Date updated_at;
    private final DownstreamUserDto user;

    public DownstreamChannelMuteDto(DownstreamUserDto downstreamUserDto, DownstreamChannelDto downstreamChannelDto, Date created_at, Date updated_at, Date date) {
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(updated_at, "updated_at");
        this.user = downstreamUserDto;
        this.channel = downstreamChannelDto;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.expires = date;
    }

    public static /* synthetic */ DownstreamChannelMuteDto copy$default(DownstreamChannelMuteDto downstreamChannelMuteDto, DownstreamUserDto downstreamUserDto, DownstreamChannelDto downstreamChannelDto, Date date, Date date2, Date date3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            downstreamUserDto = downstreamChannelMuteDto.user;
        }
        if ((i13 & 2) != 0) {
            downstreamChannelDto = downstreamChannelMuteDto.channel;
        }
        if ((i13 & 4) != 0) {
            date = downstreamChannelMuteDto.created_at;
        }
        if ((i13 & 8) != 0) {
            date2 = downstreamChannelMuteDto.updated_at;
        }
        if ((i13 & 16) != 0) {
            date3 = downstreamChannelMuteDto.expires;
        }
        Date date4 = date3;
        Date date5 = date;
        return downstreamChannelMuteDto.copy(downstreamUserDto, downstreamChannelDto, date5, date2, date4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DownstreamUserDto getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DownstreamChannelDto getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getExpires() {
        return this.expires;
    }

    public final DownstreamChannelMuteDto copy(DownstreamUserDto user, DownstreamChannelDto channel, Date created_at, Date updated_at, Date expires) {
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(updated_at, "updated_at");
        return new DownstreamChannelMuteDto(user, channel, created_at, updated_at, expires);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownstreamChannelMuteDto)) {
            return false;
        }
        DownstreamChannelMuteDto downstreamChannelMuteDto = (DownstreamChannelMuteDto) other;
        return AbstractC22676k.m65745e(this.user, downstreamChannelMuteDto.user) && AbstractC22676k.m65745e(this.channel, downstreamChannelMuteDto.channel) && AbstractC22676k.m65745e(this.created_at, downstreamChannelMuteDto.created_at) && AbstractC22676k.m65745e(this.updated_at, downstreamChannelMuteDto.updated_at) && AbstractC22676k.m65745e(this.expires, downstreamChannelMuteDto.expires);
    }

    public final DownstreamChannelDto getChannel() {
        return this.channel;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final Date getExpires() {
        return this.expires;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    public final DownstreamUserDto getUser() {
        return this.user;
    }

    public int hashCode() {
        DownstreamUserDto downstreamUserDto = this.user;
        int iHashCode = (downstreamUserDto == null ? 0 : downstreamUserDto.hashCode()) * 31;
        DownstreamChannelDto downstreamChannelDto = this.channel;
        int iM124373c = AbstractC38963t7.m124373c(this.updated_at, AbstractC38963t7.m124373c(this.created_at, (iHashCode + (downstreamChannelDto == null ? 0 : downstreamChannelDto.hashCode())) * 31, 31), 31);
        Date date = this.expires;
        return iM124373c + (date != null ? date.hashCode() : 0);
    }

    public String toString() {
        DownstreamUserDto downstreamUserDto = this.user;
        DownstreamChannelDto downstreamChannelDto = this.channel;
        Date date = this.created_at;
        Date date2 = this.updated_at;
        Date date3 = this.expires;
        StringBuilder sb4 = new StringBuilder("DownstreamChannelMuteDto(user=");
        sb4.append(downstreamUserDto);
        sb4.append(", channel=");
        sb4.append(downstreamChannelDto);
        sb4.append(", created_at=");
        AbstractC17176i.m48512n(sb4, date, ", updated_at=", date2, ", expires=");
        return AbstractC13673n.m38564k(sb4, date3, ")");
    }
}
