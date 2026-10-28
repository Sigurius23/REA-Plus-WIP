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
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006$"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/AIIndicatorUpdatedEventDto;", "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "type", "", "ai_state", "cid", UserState.Sources.USER, "Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "created_at", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "message_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getAi_state", "getCid", "getUser", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamUserDto;", "getCreated_at", "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "getMessage_id", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class AIIndicatorUpdatedEventDto extends ChatEventDto {
    private final String ai_state;
    private final String cid;
    private final ExactDate created_at;
    private final String message_id;
    private final String type;
    private final DownstreamUserDto user;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIIndicatorUpdatedEventDto(String type, String ai_state, String cid, DownstreamUserDto user, ExactDate created_at, String message_id) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(ai_state, "ai_state");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(message_id, "message_id");
        this.type = type;
        this.ai_state = ai_state;
        this.cid = cid;
        this.user = user;
        this.created_at = created_at;
        this.message_id = message_id;
    }

    public static /* synthetic */ AIIndicatorUpdatedEventDto copy$default(AIIndicatorUpdatedEventDto aIIndicatorUpdatedEventDto, String str, String str2, String str3, DownstreamUserDto downstreamUserDto, ExactDate exactDate, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = aIIndicatorUpdatedEventDto.type;
        }
        if ((i13 & 2) != 0) {
            str2 = aIIndicatorUpdatedEventDto.ai_state;
        }
        if ((i13 & 4) != 0) {
            str3 = aIIndicatorUpdatedEventDto.cid;
        }
        if ((i13 & 8) != 0) {
            downstreamUserDto = aIIndicatorUpdatedEventDto.user;
        }
        if ((i13 & 16) != 0) {
            exactDate = aIIndicatorUpdatedEventDto.created_at;
        }
        if ((i13 & 32) != 0) {
            str4 = aIIndicatorUpdatedEventDto.message_id;
        }
        ExactDate exactDate2 = exactDate;
        String str5 = str4;
        return aIIndicatorUpdatedEventDto.copy(str, str2, str3, downstreamUserDto, exactDate2, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAi_state() {
        return this.ai_state;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DownstreamUserDto getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ExactDate getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMessage_id() {
        return this.message_id;
    }

    public final AIIndicatorUpdatedEventDto copy(String type, String ai_state, String cid, DownstreamUserDto user, ExactDate created_at, String message_id) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(ai_state, "ai_state");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(message_id, "message_id");
        return new AIIndicatorUpdatedEventDto(type, ai_state, cid, user, created_at, message_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AIIndicatorUpdatedEventDto)) {
            return false;
        }
        AIIndicatorUpdatedEventDto aIIndicatorUpdatedEventDto = (AIIndicatorUpdatedEventDto) other;
        return AbstractC22676k.m65745e(this.type, aIIndicatorUpdatedEventDto.type) && AbstractC22676k.m65745e(this.ai_state, aIIndicatorUpdatedEventDto.ai_state) && AbstractC22676k.m65745e(this.cid, aIIndicatorUpdatedEventDto.cid) && AbstractC22676k.m65745e(this.user, aIIndicatorUpdatedEventDto.user) && AbstractC22676k.m65745e(this.created_at, aIIndicatorUpdatedEventDto.created_at) && AbstractC22676k.m65745e(this.message_id, aIIndicatorUpdatedEventDto.message_id);
    }

    public final String getAi_state() {
        return this.ai_state;
    }

    public final String getCid() {
        return this.cid;
    }

    public final ExactDate getCreated_at() {
        return this.created_at;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final String getType() {
        return this.type;
    }

    public final DownstreamUserDto getUser() {
        return this.user;
    }

    public int hashCode() {
        return this.message_id.hashCode() + AbstractC3855a.m11820d(this.created_at, AbstractC3855a.m11819c(this.user, AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.type.hashCode() * 31, 31, this.ai_state), 31, this.cid), 31), 31);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.ai_state;
        String str3 = this.cid;
        DownstreamUserDto downstreamUserDto = this.user;
        ExactDate exactDate = this.created_at;
        String str4 = this.message_id;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AIIndicatorUpdatedEventDto(type=", str, ", ai_state=", str2, ", cid=");
        sbM32001t.append(str3);
        sbM32001t.append(", user=");
        sbM32001t.append(downstreamUserDto);
        sbM32001t.append(", created_at=");
        sbM32001t.append(exactDate);
        sbM32001t.append(", message_id=");
        sbM32001t.append(str4);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
