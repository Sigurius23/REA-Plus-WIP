package io.getstream.chat.android.client.api2.model.dto;

import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import d13.AbstractC11478a;
import io.getstream.chat.android.client.api2.model.dto.utils.internal.ExactDate;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010#J\u0010\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010 Jz\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u00020\u000e2\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020\u0010HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010!\u001a\u0004\b%\u0010 ¨\u00067"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/MessageDeletedEventDto;", "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "type", "", "created_at", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", UserState.Sources.USER, "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "cid", "channel_type", "channel_id", "message", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "hard_delete", "", "channel_message_count", "", "deleted_for_me", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getType", "()Ljava/lang/String;", "getCreated_at", "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getCid", "getChannel_type", "getChannel_id", "getMessage", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "getHard_delete", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getChannel_message_count", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDeleted_for_me", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;)Lio/getstream/chat/android/client/api2/model/dto/MessageDeletedEventDto;", "equals", "other", "", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MessageDeletedEventDto extends ChatEventDto {
    private final String channel_id;
    private final Integer channel_message_count;
    private final String channel_type;
    private final String cid;
    private final ExactDate created_at;
    private final Boolean deleted_for_me;
    private final Boolean hard_delete;
    private final DownstreamMessageDto message;
    private final String type;
    private final DownstreamUserDto user;

    public /* synthetic */ MessageDeletedEventDto(String str, ExactDate exactDate, DownstreamUserDto downstreamUserDto, String str2, String str3, String str4, DownstreamMessageDto downstreamMessageDto, Boolean bool, Integer num, Boolean bool2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, exactDate, downstreamUserDto, str2, str3, str4, downstreamMessageDto, bool, (i13 & 256) != 0 ? null : num, (i13 & 512) != 0 ? null : bool2);
    }

    public static /* synthetic */ MessageDeletedEventDto copy$default(MessageDeletedEventDto messageDeletedEventDto, String str, ExactDate exactDate, DownstreamUserDto downstreamUserDto, String str2, String str3, String str4, DownstreamMessageDto downstreamMessageDto, Boolean bool, Integer num, Boolean bool2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = messageDeletedEventDto.type;
        }
        if ((i13 & 2) != 0) {
            exactDate = messageDeletedEventDto.created_at;
        }
        if ((i13 & 4) != 0) {
            downstreamUserDto = messageDeletedEventDto.user;
        }
        if ((i13 & 8) != 0) {
            str2 = messageDeletedEventDto.cid;
        }
        if ((i13 & 16) != 0) {
            str3 = messageDeletedEventDto.channel_type;
        }
        if ((i13 & 32) != 0) {
            str4 = messageDeletedEventDto.channel_id;
        }
        if ((i13 & 64) != 0) {
            downstreamMessageDto = messageDeletedEventDto.message;
        }
        if ((i13 & 128) != 0) {
            bool = messageDeletedEventDto.hard_delete;
        }
        if ((i13 & 256) != 0) {
            num = messageDeletedEventDto.channel_message_count;
        }
        if ((i13 & 512) != 0) {
            bool2 = messageDeletedEventDto.deleted_for_me;
        }
        Integer num2 = num;
        Boolean bool3 = bool2;
        DownstreamMessageDto downstreamMessageDto2 = downstreamMessageDto;
        Boolean bool4 = bool;
        String str5 = str3;
        String str6 = str4;
        return messageDeletedEventDto.copy(str, exactDate, downstreamUserDto, str2, str5, str6, downstreamMessageDto2, bool4, num2, bool3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getDeleted_for_me() {
        return this.deleted_for_me;
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
    public final DownstreamMessageDto getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getHard_delete() {
        return this.hard_delete;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getChannel_message_count() {
        return this.channel_message_count;
    }

    public final MessageDeletedEventDto copy(String type, ExactDate created_at, DownstreamUserDto user, String cid, String channel_type, String channel_id, DownstreamMessageDto message, Boolean hard_delete, Integer channel_message_count, Boolean deleted_for_me) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channel_type, "channel_type");
        AbstractC22676k.m65750j(channel_id, "channel_id");
        AbstractC22676k.m65750j(message, "message");
        return new MessageDeletedEventDto(type, created_at, user, cid, channel_type, channel_id, message, hard_delete, channel_message_count, deleted_for_me);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageDeletedEventDto)) {
            return false;
        }
        MessageDeletedEventDto messageDeletedEventDto = (MessageDeletedEventDto) other;
        return AbstractC22676k.m65745e(this.type, messageDeletedEventDto.type) && AbstractC22676k.m65745e(this.created_at, messageDeletedEventDto.created_at) && AbstractC22676k.m65745e(this.user, messageDeletedEventDto.user) && AbstractC22676k.m65745e(this.cid, messageDeletedEventDto.cid) && AbstractC22676k.m65745e(this.channel_type, messageDeletedEventDto.channel_type) && AbstractC22676k.m65745e(this.channel_id, messageDeletedEventDto.channel_id) && AbstractC22676k.m65745e(this.message, messageDeletedEventDto.message) && AbstractC22676k.m65745e(this.hard_delete, messageDeletedEventDto.hard_delete) && AbstractC22676k.m65745e(this.channel_message_count, messageDeletedEventDto.channel_message_count) && AbstractC22676k.m65745e(this.deleted_for_me, messageDeletedEventDto.deleted_for_me);
    }

    public final String getChannel_id() {
        return this.channel_id;
    }

    public final Integer getChannel_message_count() {
        return this.channel_message_count;
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

    public final Boolean getDeleted_for_me() {
        return this.deleted_for_me;
    }

    public final Boolean getHard_delete() {
        return this.hard_delete;
    }

    public final DownstreamMessageDto getMessage() {
        return this.message;
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
        int iHashCode = (this.message.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM11820d + (downstreamUserDto == null ? 0 : downstreamUserDto.hashCode())) * 31, 31, this.cid), 31, this.channel_type), 31, this.channel_id)) * 31;
        Boolean bool = this.hard_delete;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.channel_message_count;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.deleted_for_me;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        String str = this.type;
        ExactDate exactDate = this.created_at;
        DownstreamUserDto downstreamUserDto = this.user;
        String str2 = this.cid;
        String str3 = this.channel_type;
        String str4 = this.channel_id;
        DownstreamMessageDto downstreamMessageDto = this.message;
        Boolean bool = this.hard_delete;
        Integer num = this.channel_message_count;
        Boolean bool2 = this.deleted_for_me;
        StringBuilder sbM30861m = AbstractC11478a.m30861m("MessageDeletedEventDto(type=", str, ", created_at=", exactDate, ", user=");
        AbstractC11478a.m30865q(sbM30861m, downstreamUserDto, ", cid=", str2, ", channel_type=");
        AbstractC11266d.m30444B(sbM30861m, str3, ", channel_id=", str4, ", message=");
        sbM30861m.append(downstreamMessageDto);
        sbM30861m.append(", hard_delete=");
        sbM30861m.append(bool);
        sbM30861m.append(", channel_message_count=");
        sbM30861m.append(num);
        sbM30861m.append(", deleted_for_me=");
        sbM30861m.append(bool2);
        sbM30861m.append(")");
        return sbM30861m.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageDeletedEventDto(String type, ExactDate created_at, DownstreamUserDto downstreamUserDto, String cid, String channel_type, String channel_id, DownstreamMessageDto message, Boolean bool, Integer num, Boolean bool2) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channel_type, "channel_type");
        AbstractC22676k.m65750j(channel_id, "channel_id");
        AbstractC22676k.m65750j(message, "message");
        this.type = type;
        this.created_at = created_at;
        this.user = downstreamUserDto;
        this.cid = cid;
        this.channel_type = channel_type;
        this.channel_id = channel_id;
        this.message = message;
        this.hard_delete = bool;
        this.channel_message_count = num;
        this.deleted_for_me = bool2;
    }
}
