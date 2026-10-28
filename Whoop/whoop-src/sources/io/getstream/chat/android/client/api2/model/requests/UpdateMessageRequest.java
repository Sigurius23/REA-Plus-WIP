package io.getstream.chat.android.client.api2.model.requests;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api2.model.dto.UpstreamMessageDto;
import live.hms.video.utils.HMSFieldTrials;
import p031b9.AbstractC2875y;
import p441qx.InterfaceC30737t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC30737t(generateAdapter = HMSFieldTrials.DisableVideoAutoSubscribe)
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;", "", "message", "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;", "skip_enrich_url", "", "skip_push", "<init>", "(Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;ZZ)V", "getMessage", "()Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;", "getSkip_enrich_url", "()Z", "getSkip_push", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UpdateMessageRequest {
    private final UpstreamMessageDto message;
    private final boolean skip_enrich_url;
    private final boolean skip_push;

    public UpdateMessageRequest(UpstreamMessageDto message, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(message, "message");
        this.message = message;
        this.skip_enrich_url = z4;
        this.skip_push = z13;
    }

    public static /* synthetic */ UpdateMessageRequest copy$default(UpdateMessageRequest updateMessageRequest, UpstreamMessageDto upstreamMessageDto, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            upstreamMessageDto = updateMessageRequest.message;
        }
        if ((i13 & 2) != 0) {
            z4 = updateMessageRequest.skip_enrich_url;
        }
        if ((i13 & 4) != 0) {
            z13 = updateMessageRequest.skip_push;
        }
        return updateMessageRequest.copy(upstreamMessageDto, z4, z13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UpstreamMessageDto getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSkip_enrich_url() {
        return this.skip_enrich_url;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSkip_push() {
        return this.skip_push;
    }

    public final UpdateMessageRequest copy(UpstreamMessageDto message, boolean skip_enrich_url, boolean skip_push) {
        AbstractC22676k.m65750j(message, "message");
        return new UpdateMessageRequest(message, skip_enrich_url, skip_push);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateMessageRequest)) {
            return false;
        }
        UpdateMessageRequest updateMessageRequest = (UpdateMessageRequest) other;
        return AbstractC22676k.m65745e(this.message, updateMessageRequest.message) && this.skip_enrich_url == updateMessageRequest.skip_enrich_url && this.skip_push == updateMessageRequest.skip_push;
    }

    public final UpstreamMessageDto getMessage() {
        return this.message;
    }

    public final boolean getSkip_enrich_url() {
        return this.skip_enrich_url;
    }

    public final boolean getSkip_push() {
        return this.skip_push;
    }

    public int hashCode() {
        return Boolean.hashCode(this.skip_push) + AbstractC2875y.m8289b(this.message.hashCode() * 31, 31, this.skip_enrich_url);
    }

    public String toString() {
        UpstreamMessageDto upstreamMessageDto = this.message;
        boolean z4 = this.skip_enrich_url;
        boolean z13 = this.skip_push;
        StringBuilder sb4 = new StringBuilder("UpdateMessageRequest(message=");
        sb4.append(upstreamMessageDto);
        sb4.append(", skip_enrich_url=");
        sb4.append(z4);
        sb4.append(", skip_push=");
        return AbstractC18489d0.m53372m(sb4, z13, ")");
    }

    public /* synthetic */ UpdateMessageRequest(UpstreamMessageDto upstreamMessageDto, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(upstreamMessageDto, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? false : z13);
    }
}
