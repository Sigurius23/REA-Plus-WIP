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

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\u000eHÆ\u0003JY\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/ReactionNewEventDto;", "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "type", "", "created_at", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", UserState.Sources.USER, "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "cid", "channel_type", "channel_id", "message", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "reaction", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;)V", "getType", "()Ljava/lang/String;", "getCreated_at", "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getCid", "getChannel_type", "getChannel_id", "getMessage", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "getReaction", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamReactionDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ReactionNewEventDto extends ChatEventDto {
    private final String channel_id;
    private final String channel_type;
    private final String cid;
    private final ExactDate created_at;
    private final DownstreamMessageDto message;
    private final DownstreamReactionDto reaction;
    private final String type;
    private final DownstreamUserDto user;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactionNewEventDto(String type, ExactDate created_at, DownstreamUserDto user, String cid, String channel_type, String channel_id, DownstreamMessageDto message, DownstreamReactionDto reaction) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channel_type, "channel_type");
        AbstractC22676k.m65750j(channel_id, "channel_id");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(reaction, "reaction");
        this.type = type;
        this.created_at = created_at;
        this.user = user;
        this.cid = cid;
        this.channel_type = channel_type;
        this.channel_id = channel_id;
        this.message = message;
        this.reaction = reaction;
    }

    public static /* synthetic */ ReactionNewEventDto copy$default(ReactionNewEventDto reactionNewEventDto, String str, ExactDate exactDate, DownstreamUserDto downstreamUserDto, String str2, String str3, String str4, DownstreamMessageDto downstreamMessageDto, DownstreamReactionDto downstreamReactionDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = reactionNewEventDto.type;
        }
        if ((i13 & 2) != 0) {
            exactDate = reactionNewEventDto.created_at;
        }
        if ((i13 & 4) != 0) {
            downstreamUserDto = reactionNewEventDto.user;
        }
        if ((i13 & 8) != 0) {
            str2 = reactionNewEventDto.cid;
        }
        if ((i13 & 16) != 0) {
            str3 = reactionNewEventDto.channel_type;
        }
        if ((i13 & 32) != 0) {
            str4 = reactionNewEventDto.channel_id;
        }
        if ((i13 & 64) != 0) {
            downstreamMessageDto = reactionNewEventDto.message;
        }
        if ((i13 & 128) != 0) {
            downstreamReactionDto = reactionNewEventDto.reaction;
        }
        DownstreamMessageDto downstreamMessageDto2 = downstreamMessageDto;
        DownstreamReactionDto downstreamReactionDto2 = downstreamReactionDto;
        String str5 = str3;
        String str6 = str4;
        return reactionNewEventDto.copy(str, exactDate, downstreamUserDto, str2, str5, str6, downstreamMessageDto2, downstreamReactionDto2);
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
    public final DownstreamMessageDto getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final DownstreamReactionDto getReaction() {
        return this.reaction;
    }

    public final ReactionNewEventDto copy(String type, ExactDate created_at, DownstreamUserDto user, String cid, String channel_type, String channel_id, DownstreamMessageDto message, DownstreamReactionDto reaction) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(channel_type, "channel_type");
        AbstractC22676k.m65750j(channel_id, "channel_id");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(reaction, "reaction");
        return new ReactionNewEventDto(type, created_at, user, cid, channel_type, channel_id, message, reaction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReactionNewEventDto)) {
            return false;
        }
        ReactionNewEventDto reactionNewEventDto = (ReactionNewEventDto) other;
        return AbstractC22676k.m65745e(this.type, reactionNewEventDto.type) && AbstractC22676k.m65745e(this.created_at, reactionNewEventDto.created_at) && AbstractC22676k.m65745e(this.user, reactionNewEventDto.user) && AbstractC22676k.m65745e(this.cid, reactionNewEventDto.cid) && AbstractC22676k.m65745e(this.channel_type, reactionNewEventDto.channel_type) && AbstractC22676k.m65745e(this.channel_id, reactionNewEventDto.channel_id) && AbstractC22676k.m65745e(this.message, reactionNewEventDto.message) && AbstractC22676k.m65745e(this.reaction, reactionNewEventDto.reaction);
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

    public final DownstreamMessageDto getMessage() {
        return this.message;
    }

    public final DownstreamReactionDto getReaction() {
        return this.reaction;
    }

    public final String getType() {
        return this.type;
    }

    public final DownstreamUserDto getUser() {
        return this.user;
    }

    public int hashCode() {
        return this.reaction.hashCode() + ((this.message.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC3855a.m11819c(this.user, AbstractC3855a.m11820d(this.created_at, this.type.hashCode() * 31, 31), 31), 31, this.cid), 31, this.channel_type), 31, this.channel_id)) * 31);
    }

    public String toString() {
        String str = this.type;
        ExactDate exactDate = this.created_at;
        DownstreamUserDto downstreamUserDto = this.user;
        String str2 = this.cid;
        String str3 = this.channel_type;
        String str4 = this.channel_id;
        DownstreamMessageDto downstreamMessageDto = this.message;
        DownstreamReactionDto downstreamReactionDto = this.reaction;
        StringBuilder sbM30861m = AbstractC11478a.m30861m("ReactionNewEventDto(type=", str, ", created_at=", exactDate, ", user=");
        AbstractC11478a.m30865q(sbM30861m, downstreamUserDto, ", cid=", str2, ", channel_type=");
        AbstractC11266d.m30444B(sbM30861m, str3, ", channel_id=", str4, ", message=");
        sbM30861m.append(downstreamMessageDto);
        sbM30861m.append(", reaction=");
        sbM30861m.append(downstreamReactionDto);
        sbM30861m.append(")");
        return sbM30861m.toString();
    }
}
