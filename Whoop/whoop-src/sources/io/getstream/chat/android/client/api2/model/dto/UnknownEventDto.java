package io.getstream.chat.android.client.api2.model.dto;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import d13.AbstractC11478a;
import io.getstream.chat.android.client.api2.model.dto.utils.internal.ExactDate;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/UnknownEventDto;", "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "type", "", "created_at", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", UserState.Sources.USER, "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "rawData", "", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/util/Map;)V", "getType", "()Ljava/lang/String;", "getCreated_at", "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getRawData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UnknownEventDto extends ChatEventDto {
    private final ExactDate created_at;
    private final Map<?, ?> rawData;
    private final String type;
    private final DownstreamUserDto user;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnknownEventDto(String type, ExactDate created_at, DownstreamUserDto downstreamUserDto, Map<?, ?> rawData) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(rawData, "rawData");
        this.type = type;
        this.created_at = created_at;
        this.user = downstreamUserDto;
        this.rawData = rawData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnknownEventDto copy$default(UnknownEventDto unknownEventDto, String str, ExactDate exactDate, DownstreamUserDto downstreamUserDto, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = unknownEventDto.type;
        }
        if ((i13 & 2) != 0) {
            exactDate = unknownEventDto.created_at;
        }
        if ((i13 & 4) != 0) {
            downstreamUserDto = unknownEventDto.user;
        }
        if ((i13 & 8) != 0) {
            map = unknownEventDto.rawData;
        }
        return unknownEventDto.copy(str, exactDate, downstreamUserDto, map);
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
    public final DownstreamUserDto getUser() {
        return this.user;
    }

    public final Map<?, ?> component4() {
        return this.rawData;
    }

    public final UnknownEventDto copy(String type, ExactDate created_at, DownstreamUserDto user, Map<?, ?> rawData) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(rawData, "rawData");
        return new UnknownEventDto(type, created_at, user, rawData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnknownEventDto)) {
            return false;
        }
        UnknownEventDto unknownEventDto = (UnknownEventDto) other;
        return AbstractC22676k.m65745e(this.type, unknownEventDto.type) && AbstractC22676k.m65745e(this.created_at, unknownEventDto.created_at) && AbstractC22676k.m65745e(this.user, unknownEventDto.user) && AbstractC22676k.m65745e(this.rawData, unknownEventDto.rawData);
    }

    public final ExactDate getCreated_at() {
        return this.created_at;
    }

    public final Map<?, ?> getRawData() {
        return this.rawData;
    }

    public final String getType() {
        return this.type;
    }

    public final DownstreamUserDto getUser() {
        return this.user;
    }

    public int hashCode() {
        int iM11820d = AbstractC3855a.m11820d(this.created_at, this.type.hashCode() * 31, 31);
        DownstreamUserDto downstreamUserDto = this.user;
        return this.rawData.hashCode() + ((iM11820d + (downstreamUserDto == null ? 0 : downstreamUserDto.hashCode())) * 31);
    }

    public String toString() {
        String str = this.type;
        ExactDate exactDate = this.created_at;
        DownstreamUserDto downstreamUserDto = this.user;
        Map<?, ?> map = this.rawData;
        StringBuilder sbM30861m = AbstractC11478a.m30861m("UnknownEventDto(type=", str, ", created_at=", exactDate, ", user=");
        sbM30861m.append(downstreamUserDto);
        sbM30861m.append(", rawData=");
        sbM30861m.append(map);
        sbM30861m.append(")");
        return sbM30861m.toString();
    }
}
