package io.getstream.chat.android.client.api2.model.dto;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.api2.model.dto.utils.internal.ExactDate;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/AIIndicatorStopEventDto;", "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "type", "", "cid", UserState.Sources.USER, "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "created_at", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;)V", "getType", "()Ljava/lang/String;", "getCid", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getCreated_at", "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class AIIndicatorStopEventDto extends ChatEventDto {
    private final String cid;
    private final ExactDate created_at;
    private final String type;
    private final DownstreamUserDto user;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIIndicatorStopEventDto(String type, String cid, DownstreamUserDto user, ExactDate created_at) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(created_at, "created_at");
        this.type = type;
        this.cid = cid;
        this.user = user;
        this.created_at = created_at;
    }

    public static /* synthetic */ AIIndicatorStopEventDto copy$default(AIIndicatorStopEventDto aIIndicatorStopEventDto, String str, String str2, DownstreamUserDto downstreamUserDto, ExactDate exactDate, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = aIIndicatorStopEventDto.type;
        }
        if ((i13 & 2) != 0) {
            str2 = aIIndicatorStopEventDto.cid;
        }
        if ((i13 & 4) != 0) {
            downstreamUserDto = aIIndicatorStopEventDto.user;
        }
        if ((i13 & 8) != 0) {
            exactDate = aIIndicatorStopEventDto.created_at;
        }
        return aIIndicatorStopEventDto.copy(str, str2, downstreamUserDto, exactDate);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DownstreamUserDto getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ExactDate getCreated_at() {
        return this.created_at;
    }

    public final AIIndicatorStopEventDto copy(String type, String cid, DownstreamUserDto user, ExactDate created_at) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(created_at, "created_at");
        return new AIIndicatorStopEventDto(type, cid, user, created_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AIIndicatorStopEventDto)) {
            return false;
        }
        AIIndicatorStopEventDto aIIndicatorStopEventDto = (AIIndicatorStopEventDto) other;
        return AbstractC22676k.m65745e(this.type, aIIndicatorStopEventDto.type) && AbstractC22676k.m65745e(this.cid, aIIndicatorStopEventDto.cid) && AbstractC22676k.m65745e(this.user, aIIndicatorStopEventDto.user) && AbstractC22676k.m65745e(this.created_at, aIIndicatorStopEventDto.created_at);
    }

    public final String getCid() {
        return this.cid;
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
        return this.created_at.hashCode() + AbstractC3855a.m11819c(this.user, AbstractC11266d.m30450d(this.type.hashCode() * 31, 31, this.cid), 31);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.cid;
        DownstreamUserDto downstreamUserDto = this.user;
        ExactDate exactDate = this.created_at;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AIIndicatorStopEventDto(type=", str, ", cid=", str2, ", user=");
        sbM32001t.append(downstreamUserDto);
        sbM32001t.append(", created_at=");
        sbM32001t.append(exactDate);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
