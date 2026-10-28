package io.getstream.chat.android.client.api2.model.dto;

import c13.AbstractC3855a;
import io.getstream.chat.android.client.api.QueryParams;
import java.util.Date;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/UpstreamConnectedEventDto;", "", "type", "", "created_at", "Ljava/util/Date;", "me", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;", QueryParams.CONNECTION_ID, "<init>", "(Ljava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getCreated_at", "()Ljava/util/Date;", "getMe", "()Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;", "getConnection_id", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UpstreamConnectedEventDto {
    private final String connection_id;
    private final Date created_at;
    private final UpstreamUserDto me;
    private final String type;

    public UpstreamConnectedEventDto(String type, Date created_at, UpstreamUserDto me4, String connection_id) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(me4, "me");
        AbstractC22676k.m65750j(connection_id, "connection_id");
        this.type = type;
        this.created_at = created_at;
        this.me = me4;
        this.connection_id = connection_id;
    }

    public static /* synthetic */ UpstreamConnectedEventDto copy$default(UpstreamConnectedEventDto upstreamConnectedEventDto, String str, Date date, UpstreamUserDto upstreamUserDto, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = upstreamConnectedEventDto.type;
        }
        if ((i13 & 2) != 0) {
            date = upstreamConnectedEventDto.created_at;
        }
        if ((i13 & 4) != 0) {
            upstreamUserDto = upstreamConnectedEventDto.me;
        }
        if ((i13 & 8) != 0) {
            str2 = upstreamConnectedEventDto.connection_id;
        }
        return upstreamConnectedEventDto.copy(str, date, upstreamUserDto, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UpstreamUserDto getMe() {
        return this.me;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getConnection_id() {
        return this.connection_id;
    }

    public final UpstreamConnectedEventDto copy(String type, Date created_at, UpstreamUserDto me4, String connection_id) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(me4, "me");
        AbstractC22676k.m65750j(connection_id, "connection_id");
        return new UpstreamConnectedEventDto(type, created_at, me4, connection_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpstreamConnectedEventDto)) {
            return false;
        }
        UpstreamConnectedEventDto upstreamConnectedEventDto = (UpstreamConnectedEventDto) other;
        return AbstractC22676k.m65745e(this.type, upstreamConnectedEventDto.type) && AbstractC22676k.m65745e(this.created_at, upstreamConnectedEventDto.created_at) && AbstractC22676k.m65745e(this.me, upstreamConnectedEventDto.me) && AbstractC22676k.m65745e(this.connection_id, upstreamConnectedEventDto.connection_id);
    }

    public final String getConnection_id() {
        return this.connection_id;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final UpstreamUserDto getMe() {
        return this.me;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.connection_id.hashCode() + ((this.me.hashCode() + AbstractC38963t7.m124373c(this.created_at, this.type.hashCode() * 31, 31)) * 31);
    }

    public String toString() {
        String str = this.type;
        Date date = this.created_at;
        UpstreamUserDto upstreamUserDto = this.me;
        String str2 = this.connection_id;
        StringBuilder sbM11830n = AbstractC3855a.m11830n("UpstreamConnectedEventDto(type=", str, ", created_at=", date, ", me=");
        sbM11830n.append(upstreamUserDto);
        sbM11830n.append(", connection_id=");
        sbM11830n.append(str2);
        sbM11830n.append(")");
        return sbM11830n.toString();
    }
}
