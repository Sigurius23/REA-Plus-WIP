package io.getstream.chat.android.client.api2.model.response;

import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.api2.model.dto.DownstreamChannelDto;
import io.getstream.chat.android.client.api2.model.dto.DownstreamUserDto;
import java.util.Date;
import live.hms.video.utils.HMSFieldTrials;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/BannedUserResponse;", "", UserState.Sources.USER, "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "banned_by", "channel", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "created_at", "Ljava/util/Date;", "expires", "shadow", "", "reason", "", "<init>", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;Ljava/util/Date;Ljava/util/Date;ZLjava/lang/String;)V", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getBanned_by", "getChannel", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamChannelDto;", "getCreated_at", "()Ljava/util/Date;", "getExpires", "getShadow", "()Z", "getReason", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class BannedUserResponse {
    private final DownstreamUserDto banned_by;
    private final DownstreamChannelDto channel;
    private final Date created_at;
    private final Date expires;
    private final String reason;
    private final boolean shadow;
    private final DownstreamUserDto user;

    public BannedUserResponse(DownstreamUserDto user, DownstreamUserDto downstreamUserDto, DownstreamChannelDto downstreamChannelDto, Date date, Date date2, boolean z4, String str) {
        AbstractC22676k.m65750j(user, "user");
        this.user = user;
        this.banned_by = downstreamUserDto;
        this.channel = downstreamChannelDto;
        this.created_at = date;
        this.expires = date2;
        this.shadow = z4;
        this.reason = str;
    }

    public static /* synthetic */ BannedUserResponse copy$default(BannedUserResponse bannedUserResponse, DownstreamUserDto downstreamUserDto, DownstreamUserDto downstreamUserDto2, DownstreamChannelDto downstreamChannelDto, Date date, Date date2, boolean z4, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            downstreamUserDto = bannedUserResponse.user;
        }
        if ((i13 & 2) != 0) {
            downstreamUserDto2 = bannedUserResponse.banned_by;
        }
        if ((i13 & 4) != 0) {
            downstreamChannelDto = bannedUserResponse.channel;
        }
        if ((i13 & 8) != 0) {
            date = bannedUserResponse.created_at;
        }
        if ((i13 & 16) != 0) {
            date2 = bannedUserResponse.expires;
        }
        if ((i13 & 32) != 0) {
            z4 = bannedUserResponse.shadow;
        }
        if ((i13 & 64) != 0) {
            str = bannedUserResponse.reason;
        }
        boolean z13 = z4;
        String str2 = str;
        Date date3 = date2;
        DownstreamChannelDto downstreamChannelDto2 = downstreamChannelDto;
        return bannedUserResponse.copy(downstreamUserDto, downstreamUserDto2, downstreamChannelDto2, date, date3, z13, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DownstreamUserDto getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DownstreamUserDto getBanned_by() {
        return this.banned_by;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DownstreamChannelDto getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getExpires() {
        return this.expires;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getShadow() {
        return this.shadow;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final BannedUserResponse copy(DownstreamUserDto user, DownstreamUserDto banned_by, DownstreamChannelDto channel, Date created_at, Date expires, boolean shadow, String reason) {
        AbstractC22676k.m65750j(user, "user");
        return new BannedUserResponse(user, banned_by, channel, created_at, expires, shadow, reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannedUserResponse)) {
            return false;
        }
        BannedUserResponse bannedUserResponse = (BannedUserResponse) other;
        return AbstractC22676k.m65745e(this.user, bannedUserResponse.user) && AbstractC22676k.m65745e(this.banned_by, bannedUserResponse.banned_by) && AbstractC22676k.m65745e(this.channel, bannedUserResponse.channel) && AbstractC22676k.m65745e(this.created_at, bannedUserResponse.created_at) && AbstractC22676k.m65745e(this.expires, bannedUserResponse.expires) && this.shadow == bannedUserResponse.shadow && AbstractC22676k.m65745e(this.reason, bannedUserResponse.reason);
    }

    public final DownstreamUserDto getBanned_by() {
        return this.banned_by;
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

    public final String getReason() {
        return this.reason;
    }

    public final boolean getShadow() {
        return this.shadow;
    }

    public final DownstreamUserDto getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = this.user.hashCode() * 31;
        DownstreamUserDto downstreamUserDto = this.banned_by;
        int iHashCode2 = (iHashCode + (downstreamUserDto == null ? 0 : downstreamUserDto.hashCode())) * 31;
        DownstreamChannelDto downstreamChannelDto = this.channel;
        int iHashCode3 = (iHashCode2 + (downstreamChannelDto == null ? 0 : downstreamChannelDto.hashCode())) * 31;
        Date date = this.created_at;
        int iHashCode4 = (iHashCode3 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.expires;
        int iM8289b = AbstractC2875y.m8289b((iHashCode4 + (date2 == null ? 0 : date2.hashCode())) * 31, 31, this.shadow);
        String str = this.reason;
        return iM8289b + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        DownstreamUserDto downstreamUserDto = this.user;
        DownstreamUserDto downstreamUserDto2 = this.banned_by;
        DownstreamChannelDto downstreamChannelDto = this.channel;
        Date date = this.created_at;
        Date date2 = this.expires;
        boolean z4 = this.shadow;
        String str = this.reason;
        StringBuilder sb4 = new StringBuilder("BannedUserResponse(user=");
        sb4.append(downstreamUserDto);
        sb4.append(", banned_by=");
        sb4.append(downstreamUserDto2);
        sb4.append(", channel=");
        sb4.append(downstreamChannelDto);
        sb4.append(", created_at=");
        sb4.append(date);
        sb4.append(", expires=");
        sb4.append(date2);
        sb4.append(", shadow=");
        sb4.append(z4);
        sb4.append(", reason=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }

    public /* synthetic */ BannedUserResponse(DownstreamUserDto downstreamUserDto, DownstreamUserDto downstreamUserDto2, DownstreamChannelDto downstreamChannelDto, Date date, Date date2, boolean z4, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(downstreamUserDto, downstreamUserDto2, downstreamChannelDto, date, date2, (i13 & 32) != 0 ? false : z4, str);
    }
}
