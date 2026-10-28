package io.getstream.chat.android.client.api2.model.requests;

import io.getstream.chat.android.client.api2.model.dto.UpstreamMessageDto;
import java.util.Map;
import live.hms.video.utils.HMSFieldTrials;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/UpdateChannelRequest;", "", "data", "", "", "message", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;", "<init>", "(Ljava/util/Map;Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;)V", "getData", "()Ljava/util/Map;", "getMessage", "()Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UpdateChannelRequest {
    private final Map<String, Object> data;
    private final UpstreamMessageDto message;

    public UpdateChannelRequest(Map<String, ? extends Object> data, UpstreamMessageDto upstreamMessageDto) {
        AbstractC22676k.m65750j(data, "data");
        this.data = data;
        this.message = upstreamMessageDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateChannelRequest copy$default(UpdateChannelRequest updateChannelRequest, Map map, UpstreamMessageDto upstreamMessageDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            map = updateChannelRequest.data;
        }
        if ((i13 & 2) != 0) {
            upstreamMessageDto = updateChannelRequest.message;
        }
        return updateChannelRequest.copy(map, upstreamMessageDto);
    }

    public final Map<String, Object> component1() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UpstreamMessageDto getMessage() {
        return this.message;
    }

    public final UpdateChannelRequest copy(Map<String, ? extends Object> data, UpstreamMessageDto message) {
        AbstractC22676k.m65750j(data, "data");
        return new UpdateChannelRequest(data, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateChannelRequest)) {
            return false;
        }
        UpdateChannelRequest updateChannelRequest = (UpdateChannelRequest) other;
        return AbstractC22676k.m65745e(this.data, updateChannelRequest.data) && AbstractC22676k.m65745e(this.message, updateChannelRequest.message);
    }

    public final Map<String, Object> getData() {
        return this.data;
    }

    public final UpstreamMessageDto getMessage() {
        return this.message;
    }

    public int hashCode() {
        int iHashCode = this.data.hashCode() * 31;
        UpstreamMessageDto upstreamMessageDto = this.message;
        return iHashCode + (upstreamMessageDto == null ? 0 : upstreamMessageDto.hashCode());
    }

    public String toString() {
        return "UpdateChannelRequest(data=" + this.data + ", message=" + this.message + ")";
    }
}
