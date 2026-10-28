package io.getstream.chat.android.client.api2.model.response;

import io.getstream.chat.android.client.api2.model.dto.DownstreamMessageDto;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/response/MessageResponse;", "", "message", "Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "pending_message_metadata", "", "", "<init>", "(Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;Ljava/util/Map;)V", "getMessage", "()Lio/getstream/chat/android/client/api2/model/dto/DownstreamMessageDto;", "getPending_message_metadata", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class MessageResponse {
    private final DownstreamMessageDto message;
    private final Map<String, String> pending_message_metadata;

    public MessageResponse(DownstreamMessageDto message, Map<String, String> map) {
        AbstractC22676k.m65750j(message, "message");
        this.message = message;
        this.pending_message_metadata = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageResponse copy$default(MessageResponse messageResponse, DownstreamMessageDto downstreamMessageDto, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            downstreamMessageDto = messageResponse.message;
        }
        if ((i13 & 2) != 0) {
            map = messageResponse.pending_message_metadata;
        }
        return messageResponse.copy(downstreamMessageDto, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DownstreamMessageDto getMessage() {
        return this.message;
    }

    public final Map<String, String> component2() {
        return this.pending_message_metadata;
    }

    public final MessageResponse copy(DownstreamMessageDto message, Map<String, String> pending_message_metadata) {
        AbstractC22676k.m65750j(message, "message");
        return new MessageResponse(message, pending_message_metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageResponse)) {
            return false;
        }
        MessageResponse messageResponse = (MessageResponse) other;
        return AbstractC22676k.m65745e(this.message, messageResponse.message) && AbstractC22676k.m65745e(this.pending_message_metadata, messageResponse.pending_message_metadata);
    }

    public final DownstreamMessageDto getMessage() {
        return this.message;
    }

    public final Map<String, String> getPending_message_metadata() {
        return this.pending_message_metadata;
    }

    public int hashCode() {
        int iHashCode = this.message.hashCode() * 31;
        Map<String, String> map = this.pending_message_metadata;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        return "MessageResponse(message=" + this.message + ", pending_message_metadata=" + this.pending_message_metadata + ")";
    }

    public /* synthetic */ MessageResponse(DownstreamMessageDto downstreamMessageDto, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(downstreamMessageDto, (i13 & 2) != 0 ? null : map);
    }
}
