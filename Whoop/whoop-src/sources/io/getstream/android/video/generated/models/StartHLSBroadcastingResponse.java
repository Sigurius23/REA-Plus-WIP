package io.getstream.android.video.generated.models;

import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import p031b9.AbstractC2875y;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartHLSBroadcastingResponse;", "", AttachmentExtensionsKt.EXTRA_DURATION, "", "playlistUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getDuration", "()Ljava/lang/String;", "getPlaylistUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class StartHLSBroadcastingResponse {
    private final String duration;
    private final String playlistUrl;

    public StartHLSBroadcastingResponse(@InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = "playlist_url") String playlistUrl) {
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(playlistUrl, "playlistUrl");
        this.duration = duration;
        this.playlistUrl = playlistUrl;
    }

    public static /* synthetic */ StartHLSBroadcastingResponse copy$default(StartHLSBroadcastingResponse startHLSBroadcastingResponse, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = startHLSBroadcastingResponse.duration;
        }
        if ((i13 & 2) != 0) {
            str2 = startHLSBroadcastingResponse.playlistUrl;
        }
        return startHLSBroadcastingResponse.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPlaylistUrl() {
        return this.playlistUrl;
    }

    public final StartHLSBroadcastingResponse copy(@InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = "playlist_url") String playlistUrl) {
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(playlistUrl, "playlistUrl");
        return new StartHLSBroadcastingResponse(duration, playlistUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartHLSBroadcastingResponse)) {
            return false;
        }
        StartHLSBroadcastingResponse startHLSBroadcastingResponse = (StartHLSBroadcastingResponse) other;
        return AbstractC22676k.m65745e(this.duration, startHLSBroadcastingResponse.duration) && AbstractC22676k.m65745e(this.playlistUrl, startHLSBroadcastingResponse.playlistUrl);
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getPlaylistUrl() {
        return this.playlistUrl;
    }

    public int hashCode() {
        return this.playlistUrl.hashCode() + (this.duration.hashCode() * 31);
    }

    public String toString() {
        return AbstractC2875y.m8300m("StartHLSBroadcastingResponse(duration=", this.duration, ", playlistUrl=", this.playlistUrl, ")");
    }
}
