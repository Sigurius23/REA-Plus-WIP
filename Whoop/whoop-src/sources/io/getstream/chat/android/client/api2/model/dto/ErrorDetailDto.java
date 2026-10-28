package io.getstream.chat.android.client.api2.model.dto;

import java.util.List;
import live.hms.video.utils.HMSFieldTrials;
import m83.C25271y;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/dto/ErrorDetailDto;", "", "code", "", "messages", "", "", "<init>", "(ILjava/util/List;)V", "getCode", "()I", "getMessages", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ErrorDetailDto {
    private final int code;
    private final List<String> messages;

    /* JADX WARN: Multi-variable type inference failed */
    public ErrorDetailDto() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ErrorDetailDto copy$default(ErrorDetailDto errorDetailDto, int i13, List list, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = errorDetailDto.code;
        }
        if ((i14 & 2) != 0) {
            list = errorDetailDto.messages;
        }
        return errorDetailDto.copy(i13, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    public final List<String> component2() {
        return this.messages;
    }

    public final ErrorDetailDto copy(int code, List<String> messages) {
        AbstractC22676k.m65750j(messages, "messages");
        return new ErrorDetailDto(code, messages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorDetailDto)) {
            return false;
        }
        ErrorDetailDto errorDetailDto = (ErrorDetailDto) other;
        return this.code == errorDetailDto.code && AbstractC22676k.m65745e(this.messages, errorDetailDto.messages);
    }

    public final int getCode() {
        return this.code;
    }

    public final List<String> getMessages() {
        return this.messages;
    }

    public int hashCode() {
        return this.messages.hashCode() + (Integer.hashCode(this.code) * 31);
    }

    public String toString() {
        return "ErrorDetailDto(code=" + this.code + ", messages=" + this.messages + ")";
    }

    public ErrorDetailDto(int i13, List<String> messages) {
        AbstractC22676k.m65750j(messages, "messages");
        this.code = i13;
        this.messages = messages;
    }

    public /* synthetic */ ErrorDetailDto(int i13, List list, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? -1 : i13, (i14 & 2) != 0 ? C25271y.f99162w : list);
    }
}
