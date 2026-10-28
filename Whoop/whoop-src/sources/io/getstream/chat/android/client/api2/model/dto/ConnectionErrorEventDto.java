package io.getstream.chat.android.client.api2.model.dto;

import c13.AbstractC3855a;
import d13.AbstractC11478a;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.api2.model.dto.utils.internal.ExactDate;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/ConnectionErrorEventDto;", "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "type", "", "created_at", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", QueryParams.CONNECTION_ID, "error", "Lio/getstream/chat/android/client/api2/model/dto/ErrorDto;", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/ErrorDto;)V", "getType", "()Ljava/lang/String;", "getCreated_at", "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "getConnection_id", "getError", "()Lio/getstream/chat/android/client/api2/model/dto/ErrorDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ConnectionErrorEventDto extends ChatEventDto {
    private final String connection_id;
    private final ExactDate created_at;
    private final ErrorDto error;
    private final String type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionErrorEventDto(String type, ExactDate created_at, String connection_id, ErrorDto error) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(connection_id, "connection_id");
        AbstractC22676k.m65750j(error, "error");
        this.type = type;
        this.created_at = created_at;
        this.connection_id = connection_id;
        this.error = error;
    }

    public static /* synthetic */ ConnectionErrorEventDto copy$default(ConnectionErrorEventDto connectionErrorEventDto, String str, ExactDate exactDate, String str2, ErrorDto errorDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = connectionErrorEventDto.type;
        }
        if ((i13 & 2) != 0) {
            exactDate = connectionErrorEventDto.created_at;
        }
        if ((i13 & 4) != 0) {
            str2 = connectionErrorEventDto.connection_id;
        }
        if ((i13 & 8) != 0) {
            errorDto = connectionErrorEventDto.error;
        }
        return connectionErrorEventDto.copy(str, exactDate, str2, errorDto);
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
    public final String getConnection_id() {
        return this.connection_id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ErrorDto getError() {
        return this.error;
    }

    public final ConnectionErrorEventDto copy(String type, ExactDate created_at, String connection_id, ErrorDto error) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(connection_id, "connection_id");
        AbstractC22676k.m65750j(error, "error");
        return new ConnectionErrorEventDto(type, created_at, connection_id, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectionErrorEventDto)) {
            return false;
        }
        ConnectionErrorEventDto connectionErrorEventDto = (ConnectionErrorEventDto) other;
        return AbstractC22676k.m65745e(this.type, connectionErrorEventDto.type) && AbstractC22676k.m65745e(this.created_at, connectionErrorEventDto.created_at) && AbstractC22676k.m65745e(this.connection_id, connectionErrorEventDto.connection_id) && AbstractC22676k.m65745e(this.error, connectionErrorEventDto.error);
    }

    public final String getConnection_id() {
        return this.connection_id;
    }

    public final ExactDate getCreated_at() {
        return this.created_at;
    }

    public final ErrorDto getError() {
        return this.error;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.error.hashCode() + AbstractC11266d.m30450d(AbstractC3855a.m11820d(this.created_at, this.type.hashCode() * 31, 31), 31, this.connection_id);
    }

    public String toString() {
        String str = this.type;
        ExactDate exactDate = this.created_at;
        String str2 = this.connection_id;
        ErrorDto errorDto = this.error;
        StringBuilder sbM30861m = AbstractC11478a.m30861m("ConnectionErrorEventDto(type=", str, ", created_at=", exactDate, ", connection_id=");
        sbM30861m.append(str2);
        sbM30861m.append(", error=");
        sbM30861m.append(errorDto);
        sbM30861m.append(")");
        return sbM30861m.toString();
    }
}
