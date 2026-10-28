package io.getstream.chat.android.client.api2.model.dto;

import c13.AbstractC3855a;
import d13.AbstractC11478a;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.api2.model.dto.utils.internal.ExactDate;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/ConnectedEventDto;", "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "type", "", "created_at", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "me", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", QueryParams.CONNECTION_ID, "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getCreated_at", "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "getMe", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getConnection_id", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ConnectedEventDto extends ChatEventDto {
    private final String connection_id;
    private final ExactDate created_at;
    private final DownstreamUserDto me;
    private final String type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectedEventDto(String type, ExactDate created_at, DownstreamUserDto me4, String connection_id) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(me4, "me");
        AbstractC22676k.m65750j(connection_id, "connection_id");
        this.type = type;
        this.created_at = created_at;
        this.me = me4;
        this.connection_id = connection_id;
    }

    public static /* synthetic */ ConnectedEventDto copy$default(ConnectedEventDto connectedEventDto, String str, ExactDate exactDate, DownstreamUserDto downstreamUserDto, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = connectedEventDto.type;
        }
        if ((i13 & 2) != 0) {
            exactDate = connectedEventDto.created_at;
        }
        if ((i13 & 4) != 0) {
            downstreamUserDto = connectedEventDto.me;
        }
        if ((i13 & 8) != 0) {
            str2 = connectedEventDto.connection_id;
        }
        return connectedEventDto.copy(str, exactDate, downstreamUserDto, str2);
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
    public final DownstreamUserDto getMe() {
        return this.me;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getConnection_id() {
        return this.connection_id;
    }

    public final ConnectedEventDto copy(String type, ExactDate created_at, DownstreamUserDto me4, String connection_id) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(me4, "me");
        AbstractC22676k.m65750j(connection_id, "connection_id");
        return new ConnectedEventDto(type, created_at, me4, connection_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectedEventDto)) {
            return false;
        }
        ConnectedEventDto connectedEventDto = (ConnectedEventDto) other;
        return AbstractC22676k.m65745e(this.type, connectedEventDto.type) && AbstractC22676k.m65745e(this.created_at, connectedEventDto.created_at) && AbstractC22676k.m65745e(this.me, connectedEventDto.me) && AbstractC22676k.m65745e(this.connection_id, connectedEventDto.connection_id);
    }

    public final String getConnection_id() {
        return this.connection_id;
    }

    public final ExactDate getCreated_at() {
        return this.created_at;
    }

    public final DownstreamUserDto getMe() {
        return this.me;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.connection_id.hashCode() + AbstractC3855a.m11819c(this.me, AbstractC3855a.m11820d(this.created_at, this.type.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.type;
        ExactDate exactDate = this.created_at;
        DownstreamUserDto downstreamUserDto = this.me;
        String str2 = this.connection_id;
        StringBuilder sbM30861m = AbstractC11478a.m30861m("ConnectedEventDto(type=", str, ", created_at=", exactDate, ", me=");
        sbM30861m.append(downstreamUserDto);
        sbM30861m.append(", connection_id=");
        sbM30861m.append(str2);
        sbM30861m.append(")");
        return sbM30861m.toString();
    }
}
