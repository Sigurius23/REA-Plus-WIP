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
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0019J\\\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019¨\u0006*"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/UserMessagesDeletedEventDto;", "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "type", "", "created_at", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", UserState.Sources.USER, "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "cid", "channel_type", "channel_id", "hard_delete", "", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getType", "()Ljava/lang/String;", "getCreated_at", "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getCid", "getChannel_type", "getChannel_id", "getHard_delete", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lio/getstream/chat/android/client/api2/model/dto/UserMessagesDeletedEventDto;", "equals", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UserMessagesDeletedEventDto extends ChatEventDto {
    private final String channel_id;
    private final String channel_type;
    private final String cid;
    private final ExactDate created_at;
    private final Boolean hard_delete;
    private final String type;
    private final DownstreamUserDto user;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserMessagesDeletedEventDto(String type, ExactDate created_at, DownstreamUserDto user, String str, String str2, String str3, Boolean bool) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(user, "user");
        this.type = type;
        this.created_at = created_at;
        this.user = user;
        this.cid = str;
        this.channel_type = str2;
        this.channel_id = str3;
        this.hard_delete = bool;
    }

    public static /* synthetic */ UserMessagesDeletedEventDto copy$default(UserMessagesDeletedEventDto userMessagesDeletedEventDto, String str, ExactDate exactDate, DownstreamUserDto downstreamUserDto, String str2, String str3, String str4, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = userMessagesDeletedEventDto.type;
        }
        if ((i13 & 2) != 0) {
            exactDate = userMessagesDeletedEventDto.created_at;
        }
        if ((i13 & 4) != 0) {
            downstreamUserDto = userMessagesDeletedEventDto.user;
        }
        if ((i13 & 8) != 0) {
            str2 = userMessagesDeletedEventDto.cid;
        }
        if ((i13 & 16) != 0) {
            str3 = userMessagesDeletedEventDto.channel_type;
        }
        if ((i13 & 32) != 0) {
            str4 = userMessagesDeletedEventDto.channel_id;
        }
        if ((i13 & 64) != 0) {
            bool = userMessagesDeletedEventDto.hard_delete;
        }
        String str5 = str4;
        Boolean bool2 = bool;
        String str6 = str3;
        DownstreamUserDto downstreamUserDto2 = downstreamUserDto;
        return userMessagesDeletedEventDto.copy(str, exactDate, downstreamUserDto2, str2, str6, str5, bool2);
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
    public final Boolean getHard_delete() {
        return this.hard_delete;
    }

    public final UserMessagesDeletedEventDto copy(String type, ExactDate created_at, DownstreamUserDto user, String cid, String channel_type, String channel_id, Boolean hard_delete) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(user, "user");
        return new UserMessagesDeletedEventDto(type, created_at, user, cid, channel_type, channel_id, hard_delete);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserMessagesDeletedEventDto)) {
            return false;
        }
        UserMessagesDeletedEventDto userMessagesDeletedEventDto = (UserMessagesDeletedEventDto) other;
        return AbstractC22676k.m65745e(this.type, userMessagesDeletedEventDto.type) && AbstractC22676k.m65745e(this.created_at, userMessagesDeletedEventDto.created_at) && AbstractC22676k.m65745e(this.user, userMessagesDeletedEventDto.user) && AbstractC22676k.m65745e(this.cid, userMessagesDeletedEventDto.cid) && AbstractC22676k.m65745e(this.channel_type, userMessagesDeletedEventDto.channel_type) && AbstractC22676k.m65745e(this.channel_id, userMessagesDeletedEventDto.channel_id) && AbstractC22676k.m65745e(this.hard_delete, userMessagesDeletedEventDto.hard_delete);
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

    public final Boolean getHard_delete() {
        return this.hard_delete;
    }

    public final String getType() {
        return this.type;
    }

    public final DownstreamUserDto getUser() {
        return this.user;
    }

    public int hashCode() {
        int iM11819c = AbstractC3855a.m11819c(this.user, AbstractC3855a.m11820d(this.created_at, this.type.hashCode() * 31, 31), 31);
        String str = this.cid;
        int iHashCode = (iM11819c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.channel_type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.channel_id;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.hard_delete;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.type;
        ExactDate exactDate = this.created_at;
        DownstreamUserDto downstreamUserDto = this.user;
        String str2 = this.cid;
        String str3 = this.channel_type;
        String str4 = this.channel_id;
        Boolean bool = this.hard_delete;
        StringBuilder sbM30861m = AbstractC11478a.m30861m("UserMessagesDeletedEventDto(type=", str, ", created_at=", exactDate, ", user=");
        AbstractC11478a.m30865q(sbM30861m, downstreamUserDto, ", cid=", str2, ", channel_type=");
        AbstractC11266d.m30444B(sbM30861m, str3, ", channel_id=", str4, ", hard_delete=");
        return AbstractC11478a.m30858j(sbM30861m, bool, ")");
    }
}
