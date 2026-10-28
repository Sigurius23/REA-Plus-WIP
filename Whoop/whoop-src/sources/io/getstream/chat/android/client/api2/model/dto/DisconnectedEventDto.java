package io.getstream.chat.android.client.api2.model.dto;

import io.getstream.chat.android.client.api2.model.dto.utils.internal.ExactDate;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/DisconnectedEventDto;", "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "type", "", "created_at", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;)V", "getType", "()Ljava/lang/String;", "getCreated_at", "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class DisconnectedEventDto extends ChatEventDto {
    private final ExactDate created_at;
    private final String type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisconnectedEventDto(String type, ExactDate created_at) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        this.type = type;
        this.created_at = created_at;
    }

    public static /* synthetic */ DisconnectedEventDto copy$default(DisconnectedEventDto disconnectedEventDto, String str, ExactDate exactDate, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = disconnectedEventDto.type;
        }
        if ((i13 & 2) != 0) {
            exactDate = disconnectedEventDto.created_at;
        }
        return disconnectedEventDto.copy(str, exactDate);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ExactDate getCreated_at() {
        return this.created_at;
    }

    public final DisconnectedEventDto copy(String type, ExactDate created_at) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        return new DisconnectedEventDto(type, created_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisconnectedEventDto)) {
            return false;
        }
        DisconnectedEventDto disconnectedEventDto = (DisconnectedEventDto) other;
        return AbstractC22676k.m65745e(this.type, disconnectedEventDto.type) && AbstractC22676k.m65745e(this.created_at, disconnectedEventDto.created_at);
    }

    public final ExactDate getCreated_at() {
        return this.created_at;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.created_at.hashCode() + (this.type.hashCode() * 31);
    }

    public String toString() {
        return "DisconnectedEventDto(type=" + this.type + ", created_at=" + this.created_at + ")";
    }
}
