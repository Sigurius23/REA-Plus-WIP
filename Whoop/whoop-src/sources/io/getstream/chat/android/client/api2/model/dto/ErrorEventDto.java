package io.getstream.chat.android.client.api2.model.dto;

import c13.AbstractC3855a;
import d13.AbstractC11478a;
import io.getstream.chat.android.client.api2.model.dto.utils.internal.ExactDate;
import live.hms.video.utils.HMSFieldTrials;
import n23.AbstractC26202e;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f¨\u0006!"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/ErrorEventDto;", "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "", "type", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "created_at", "Ln23/e;", "error", "<init>", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Ln23/e;)V", "component1", "()Ljava/lang/String;", "component2", "()Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "component3", "()Ln23/e;", "copy", "(Ljava/lang/String;Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;Ln23/e;)Lio/getstream/chat/android/client/api2/model/dto/ErrorEventDto;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "Lio/getstream/chat/android/client/api2/model/dto/utils/internal/ExactDate;", "getCreated_at", "Ln23/e;", "getError", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ErrorEventDto extends ChatEventDto {
    private final ExactDate created_at;
    private final AbstractC26202e error;
    private final String type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorEventDto(String type, ExactDate created_at, AbstractC26202e error) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(error, "error");
        this.type = type;
        this.created_at = created_at;
        this.error = error;
    }

    public static /* synthetic */ ErrorEventDto copy$default(ErrorEventDto errorEventDto, String str, ExactDate exactDate, AbstractC26202e abstractC26202e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = errorEventDto.type;
        }
        if ((i13 & 2) != 0) {
            exactDate = errorEventDto.created_at;
        }
        if ((i13 & 4) != 0) {
            abstractC26202e = errorEventDto.error;
        }
        return errorEventDto.copy(str, exactDate, abstractC26202e);
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
    public final AbstractC26202e getError() {
        return this.error;
    }

    public final ErrorEventDto copy(String type, ExactDate created_at, AbstractC26202e error) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(created_at, "created_at");
        AbstractC22676k.m65750j(error, "error");
        return new ErrorEventDto(type, created_at, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorEventDto)) {
            return false;
        }
        ErrorEventDto errorEventDto = (ErrorEventDto) other;
        return AbstractC22676k.m65745e(this.type, errorEventDto.type) && AbstractC22676k.m65745e(this.created_at, errorEventDto.created_at) && AbstractC22676k.m65745e(this.error, errorEventDto.error);
    }

    public final ExactDate getCreated_at() {
        return this.created_at;
    }

    public final AbstractC26202e getError() {
        return this.error;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.error.hashCode() + AbstractC3855a.m11820d(this.created_at, this.type.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.type;
        ExactDate exactDate = this.created_at;
        AbstractC26202e abstractC26202e = this.error;
        StringBuilder sbM30861m = AbstractC11478a.m30861m("ErrorEventDto(type=", str, ", created_at=", exactDate, ", error=");
        sbM30861m.append(abstractC26202e);
        sbM30861m.append(")");
        return sbM30861m.toString();
    }
}
