package io.getstream.chat.android.client.api2.model.dto;

import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.core.internal.StreamHandsOff;
import java.util.Date;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@StreamHandsOff(reason = "Field names can't be changed because [CustomObjectDtoAdapter] class uses reflections to add/remove content of [extraData] map")
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003Jw\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010.\u001a\u00020\u0007HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00060"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;", "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;", "created_at", "Ljava/util/Date;", "message_id", "", "score", "", "type", "updated_at", UserState.Sources.USER, "Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;", "user_id", "emoji_code", "extraData", "", "", "<init>", "(Ljava/util/Date;Ljava/lang/String;ILjava/lang/String;Ljava/util/Date;Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getCreated_at", "()Ljava/util/Date;", "getMessage_id", "()Ljava/lang/String;", "getScore", "()I", "getType", "getUpdated_at", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/UpstreamUserDto;", "getUser_id", "getEmoji_code", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UpstreamReactionDto implements ExtraDataDto {
    private final Date created_at;
    private final String emoji_code;
    private final Map<String, Object> extraData;
    private final String message_id;
    private final int score;
    private final String type;
    private final Date updated_at;
    private final UpstreamUserDto user;
    private final String user_id;

    public UpstreamReactionDto(Date date, String message_id, int i13, String type, Date date2, UpstreamUserDto upstreamUserDto, String user_id, String str, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(message_id, "message_id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(user_id, "user_id");
        AbstractC22676k.m65750j(extraData, "extraData");
        this.created_at = date;
        this.message_id = message_id;
        this.score = i13;
        this.type = type;
        this.updated_at = date2;
        this.user = upstreamUserDto;
        this.user_id = user_id;
        this.emoji_code = str;
        this.extraData = extraData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpstreamReactionDto copy$default(UpstreamReactionDto upstreamReactionDto, Date date, String str, int i13, String str2, Date date2, UpstreamUserDto upstreamUserDto, String str3, String str4, Map map, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            date = upstreamReactionDto.created_at;
        }
        if ((i14 & 2) != 0) {
            str = upstreamReactionDto.message_id;
        }
        if ((i14 & 4) != 0) {
            i13 = upstreamReactionDto.score;
        }
        if ((i14 & 8) != 0) {
            str2 = upstreamReactionDto.type;
        }
        if ((i14 & 16) != 0) {
            date2 = upstreamReactionDto.updated_at;
        }
        if ((i14 & 32) != 0) {
            upstreamUserDto = upstreamReactionDto.user;
        }
        if ((i14 & 64) != 0) {
            str3 = upstreamReactionDto.user_id;
        }
        if ((i14 & 128) != 0) {
            str4 = upstreamReactionDto.emoji_code;
        }
        if ((i14 & 256) != 0) {
            map = upstreamReactionDto.extraData;
        }
        String str5 = str4;
        Map map2 = map;
        UpstreamUserDto upstreamUserDto2 = upstreamUserDto;
        String str6 = str3;
        Date date3 = date2;
        int i15 = i13;
        return upstreamReactionDto.copy(date, str, i15, str2, date3, upstreamUserDto2, str6, str5, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage_id() {
        return this.message_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final UpstreamUserDto getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUser_id() {
        return this.user_id;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getEmoji_code() {
        return this.emoji_code;
    }

    public final Map<String, Object> component9() {
        return this.extraData;
    }

    public final UpstreamReactionDto copy(Date created_at, String message_id, int score, String type, Date updated_at, UpstreamUserDto user, String user_id, String emoji_code, Map<String, ? extends Object> extraData) {
        AbstractC22676k.m65750j(message_id, "message_id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(user_id, "user_id");
        AbstractC22676k.m65750j(extraData, "extraData");
        return new UpstreamReactionDto(created_at, message_id, score, type, updated_at, user, user_id, emoji_code, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpstreamReactionDto)) {
            return false;
        }
        UpstreamReactionDto upstreamReactionDto = (UpstreamReactionDto) other;
        return AbstractC22676k.m65745e(this.created_at, upstreamReactionDto.created_at) && AbstractC22676k.m65745e(this.message_id, upstreamReactionDto.message_id) && this.score == upstreamReactionDto.score && AbstractC22676k.m65745e(this.type, upstreamReactionDto.type) && AbstractC22676k.m65745e(this.updated_at, upstreamReactionDto.updated_at) && AbstractC22676k.m65745e(this.user, upstreamReactionDto.user) && AbstractC22676k.m65745e(this.user_id, upstreamReactionDto.user_id) && AbstractC22676k.m65745e(this.emoji_code, upstreamReactionDto.emoji_code) && AbstractC22676k.m65745e(this.extraData, upstreamReactionDto.extraData);
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final String getEmoji_code() {
        return this.emoji_code;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final int getScore() {
        return this.score;
    }

    public final String getType() {
        return this.type;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    public final UpstreamUserDto getUser() {
        return this.user;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public int hashCode() {
        Date date = this.created_at;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.score, AbstractC11266d.m30450d((date == null ? 0 : date.hashCode()) * 31, 31, this.message_id), 31), 31, this.type);
        Date date2 = this.updated_at;
        int iHashCode = (iM30450d + (date2 == null ? 0 : date2.hashCode())) * 31;
        UpstreamUserDto upstreamUserDto = this.user;
        int iM30450d2 = AbstractC11266d.m30450d((iHashCode + (upstreamUserDto == null ? 0 : upstreamUserDto.hashCode())) * 31, 31, this.user_id);
        String str = this.emoji_code;
        return this.extraData.hashCode() + ((iM30450d2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        Date date = this.created_at;
        String str = this.message_id;
        int i13 = this.score;
        String str2 = this.type;
        Date date2 = this.updated_at;
        UpstreamUserDto upstreamUserDto = this.user;
        String str3 = this.user_id;
        String str4 = this.emoji_code;
        Map<String, Object> map = this.extraData;
        StringBuilder sb4 = new StringBuilder("UpstreamReactionDto(created_at=");
        sb4.append(date);
        sb4.append(", message_id=");
        sb4.append(str);
        sb4.append(", score=");
        AbstractC11895b.m31979B(i13, ", type=", str2, ", updated_at=", sb4);
        sb4.append(date2);
        sb4.append(", user=");
        sb4.append(upstreamUserDto);
        sb4.append(", user_id=");
        AbstractC11266d.m30444B(sb4, str3, ", emoji_code=", str4, ", extraData=");
        return AbstractC13673n.m38565l(sb4, map, ")");
    }
}
