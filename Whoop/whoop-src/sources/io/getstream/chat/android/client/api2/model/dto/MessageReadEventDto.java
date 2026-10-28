package io.getstream.chat.android.client.api2.model.dto;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import d13.AbstractC11478a;
import io.getstream.chat.android.client.api2.model.dto.utils.internal.ExactDate;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u0006/"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/MessageReadEventDto;", "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "type", "", "created_at", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", UserState.Sources.USER, "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "cid", "channel_type", "channel_id", "thread", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadInfoDto;", "last_read_message_id", "team", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadInfoDto;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getCreated_at", "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getCid", "getChannel_type", "getChannel_id", "getThread", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamThreadInfoDto;", "getLast_read_message_id", "getTeam", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MessageReadEventDto extends ChatEventDto {
    private final String channel_id;
    private final String channel_type;
    private final String cid;
    private final ExactDate created_at;
    private final String last_read_message_id;
    private final String team;
    private final DownstreamThreadInfoDto thread;
    private final String type;
    private final DownstreamUserDto user;

    public /* synthetic */ MessageReadEventDto(String str, ExactDate exactDate, DownstreamUserDto downstreamUserDto, String str2, String str3, String str4, DownstreamThreadInfoDto downstreamThreadInfoDto, String str5, String str6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, exactDate, downstreamUserDto, str2, str3, str4, (i13 & 64) != 0 ? null : downstreamThreadInfoDto, str5, (i13 & 256) != 0 ? null : str6);
    }

    public static /* synthetic */ MessageReadEventDto copy$default(MessageReadEventDto messageReadEventDto, String str, ExactDate exactDate, DownstreamUserDto downstreamUserDto, String str2, String str3, String str4, DownstreamThreadInfoDto downstreamThreadInfoDto, String str5, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = messageReadEventDto.type;
        }
        if ((i13 & 2) != 0) {
            exactDate = messageReadEventDto.created_at;
        }
        if ((i13 & 4) != 0) {
            downstreamUserDto = messageReadEventDto.user;
        }
        if ((i13 & 8) != 0) {
            str2 = messageReadEventDto.cid;
        }
        if ((i13 & 16) != 0) {
            str3 = messageReadEventDto.channel_type;
        }
        if ((i13 & 32) != 0) {
            str4 = messageReadEventDto.channel_id;
        }
        if ((i13 & 64) != 0) {
            downstreamThreadInfoDto = messageReadEventDto.thread;
        }
        if ((i13 & 128) != 0) {
            str5 = messageReadEventDto.last_read_message_id;
        }
        if ((i13 & 256) != 0) {
            str6 = messageReadEventDto.team;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        DownstreamThreadInfoDto downstreamThreadInfoDto2 = downstreamThreadInfoDto;
        String str10 = str3;
        DownstreamUserDto downstreamUserDto2 = downstreamUserDto;
        return messageReadEventDto.copy(str, exactDate, downstreamUserDto2, str2, str10, str9, downstreamThreadInfoDto2, str7, str8);
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getChannel_type() {
        return this.channel_type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getChannel_id() {
        return this.channel_id;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DownstreamThreadInfoDto getThread() {
        return this.thread;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLast_read_message_id() {
        return this.last_read_message_id;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTeam() {
        return this.team;
    }

    public final MessageReadEventDto copy(String type, ExactDate created_at, DownstreamUserDto user, String cid, String channel_type, String channel_id, DownstreamThreadInfoDto thread, String last_read_message_id, String team) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channel_type, "channel_type");
        AbstractC22676k.m65750j(channel_id, "channel_id");
        return new MessageReadEventDto(type, created_at, user, cid, channel_type, channel_id, thread, last_read_message_id, team);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageReadEventDto)) {
            return false;
        }
        MessageReadEventDto messageReadEventDto = (MessageReadEventDto) other;
        return AbstractC22676k.m65745e(this.type, messageReadEventDto.type) && AbstractC22676k.m65745e(this.created_at, messageReadEventDto.created_at) && AbstractC22676k.m65745e(this.user, messageReadEventDto.user) && AbstractC22676k.m65745e(this.cid, messageReadEventDto.cid) && AbstractC22676k.m65745e(this.channel_type, messageReadEventDto.channel_type) && AbstractC22676k.m65745e(this.channel_id, messageReadEventDto.channel_id) && AbstractC22676k.m65745e(this.thread, messageReadEventDto.thread) && AbstractC22676k.m65745e(this.last_read_message_id, messageReadEventDto.last_read_message_id) && AbstractC22676k.m65745e(this.team, messageReadEventDto.team);
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

    public final String getLast_read_message_id() {
        return this.last_read_message_id;
    }

    public final String getTeam() {
        return this.team;
    }

    public final DownstreamThreadInfoDto getThread() {
        return this.thread;
    }

    public final String getType() {
        return this.type;
    }

    public final DownstreamUserDto getUser() {
        return this.user;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC3855a.m11819c(this.user, AbstractC3855a.m11820d(this.created_at, this.type.hashCode() * 31, 31), 31), 31, this.cid), 31, this.channel_type), 31, this.channel_id);
        DownstreamThreadInfoDto downstreamThreadInfoDto = this.thread;
        int iHashCode = (iM30450d + (downstreamThreadInfoDto == null ? 0 : downstreamThreadInfoDto.hashCode())) * 31;
        String str = this.last_read_message_id;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.team;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.type;
        ExactDate exactDate = this.created_at;
        DownstreamUserDto downstreamUserDto = this.user;
        String str2 = this.cid;
        String str3 = this.channel_type;
        String str4 = this.channel_id;
        DownstreamThreadInfoDto downstreamThreadInfoDto = this.thread;
        String str5 = this.last_read_message_id;
        String str6 = this.team;
        StringBuilder sbM30861m = AbstractC11478a.m30861m("MessageReadEventDto(type=", str, ", created_at=", exactDate, ", user=");
        AbstractC11478a.m30865q(sbM30861m, downstreamUserDto, ", cid=", str2, ", channel_type=");
        AbstractC11266d.m30444B(sbM30861m, str3, ", channel_id=", str4, ", thread=");
        sbM30861m.append(downstreamThreadInfoDto);
        sbM30861m.append(", last_read_message_id=");
        sbM30861m.append(str5);
        sbM30861m.append(", team=");
        return AbstractC25012a.m73376i(str6, ")", sbM30861m);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageReadEventDto(String type, ExactDate created_at, DownstreamUserDto user, String cid, String channel_type, String channel_id, DownstreamThreadInfoDto downstreamThreadInfoDto, String str, String str2) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channel_type, "channel_type");
        AbstractC22676k.m65750j(channel_id, "channel_id");
        this.type = type;
        this.created_at = created_at;
        this.user = user;
        this.cid = cid;
        this.channel_type = channel_type;
        this.channel_id = channel_id;
        this.thread = downstreamThreadInfoDto;
        this.last_read_message_id = str;
        this.team = str2;
    }
}
