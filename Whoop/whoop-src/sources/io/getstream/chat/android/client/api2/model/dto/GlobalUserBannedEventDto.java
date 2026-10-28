package io.getstream.chat.android.client.api2.model.dto;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.api2.model.dto.utils.internal.ExactDate;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/GlobalUserBannedEventDto;", "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "type", "", UserState.Sources.USER, "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "created_at", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;)V", "getType", "()Ljava/lang/String;", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getCreated_at", "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class GlobalUserBannedEventDto extends ChatEventDto {
    private final ExactDate created_at;
    private final String type;
    private final DownstreamUserDto user;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalUserBannedEventDto(String type, DownstreamUserDto user, ExactDate created_at) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(created_at, "created_at");
        this.type = type;
        this.user = user;
        this.created_at = created_at;
    }

    public static /* synthetic */ GlobalUserBannedEventDto copy$default(GlobalUserBannedEventDto globalUserBannedEventDto, String str, DownstreamUserDto downstreamUserDto, ExactDate exactDate, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = globalUserBannedEventDto.type;
        }
        if ((i13 & 2) != 0) {
            downstreamUserDto = globalUserBannedEventDto.user;
        }
        if ((i13 & 4) != 0) {
            exactDate = globalUserBannedEventDto.created_at;
        }
        return globalUserBannedEventDto.copy(str, downstreamUserDto, exactDate);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DownstreamUserDto getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ExactDate getCreated_at() {
        return this.created_at;
    }

    public final GlobalUserBannedEventDto copy(String type, DownstreamUserDto user, ExactDate created_at) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(created_at, "created_at");
        return new GlobalUserBannedEventDto(type, user, created_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlobalUserBannedEventDto)) {
            return false;
        }
        GlobalUserBannedEventDto globalUserBannedEventDto = (GlobalUserBannedEventDto) other;
        return AbstractC22676k.m65745e(this.type, globalUserBannedEventDto.type) && AbstractC22676k.m65745e(this.user, globalUserBannedEventDto.user) && AbstractC22676k.m65745e(this.created_at, globalUserBannedEventDto.created_at);
    }

    public final ExactDate getCreated_at() {
        return this.created_at;
    }

    public final String getType() {
        return this.type;
    }

    public final DownstreamUserDto getUser() {
        return this.user;
    }

    public int hashCode() {
        return this.created_at.hashCode() + AbstractC3855a.m11819c(this.user, this.type.hashCode() * 31, 31);
    }

    public String toString() {
        return "GlobalUserBannedEventDto(type=" + this.type + ", user=" + this.user + ", created_at=" + this.created_at + ")";
    }
}
