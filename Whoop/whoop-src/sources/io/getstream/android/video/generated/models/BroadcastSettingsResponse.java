package io.getstream.android.video.generated.models;

import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/android/video/generated/models/BroadcastSettingsResponse;", "", "enabled", "", "hls", "Lio/getstream/android/video/generated/models/HLSSettingsResponse;", "rtmp", "Lio/getstream/android/video/generated/models/RTMPSettingsResponse;", "(ZLio/getstream/android/video/generated/models/HLSSettingsResponse;Lio/getstream/android/video/generated/models/RTMPSettingsResponse;)V", "getEnabled", "()Z", "getHls", "()Lio/getstream/android/video/generated/models/HLSSettingsResponse;", "getRtmp", "()Lio/getstream/android/video/generated/models/RTMPSettingsResponse;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class BroadcastSettingsResponse {
    private final boolean enabled;
    private final HLSSettingsResponse hls;
    private final RTMPSettingsResponse rtmp;

    public BroadcastSettingsResponse(@InterfaceC30731q(name = "enabled") boolean z4, @InterfaceC30731q(name = "hls") HLSSettingsResponse hls, @InterfaceC30731q(name = "rtmp") RTMPSettingsResponse rtmp) {
        AbstractC22676k.m65750j(hls, "hls");
        AbstractC22676k.m65750j(rtmp, "rtmp");
        this.enabled = z4;
        this.hls = hls;
        this.rtmp = rtmp;
    }

    public static /* synthetic */ BroadcastSettingsResponse copy$default(BroadcastSettingsResponse broadcastSettingsResponse, boolean z4, HLSSettingsResponse hLSSettingsResponse, RTMPSettingsResponse rTMPSettingsResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = broadcastSettingsResponse.enabled;
        }
        if ((i13 & 2) != 0) {
            hLSSettingsResponse = broadcastSettingsResponse.hls;
        }
        if ((i13 & 4) != 0) {
            rTMPSettingsResponse = broadcastSettingsResponse.rtmp;
        }
        return broadcastSettingsResponse.copy(z4, hLSSettingsResponse, rTMPSettingsResponse);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HLSSettingsResponse getHls() {
        return this.hls;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RTMPSettingsResponse getRtmp() {
        return this.rtmp;
    }

    public final BroadcastSettingsResponse copy(@InterfaceC30731q(name = "enabled") boolean enabled, @InterfaceC30731q(name = "hls") HLSSettingsResponse hls, @InterfaceC30731q(name = "rtmp") RTMPSettingsResponse rtmp) {
        AbstractC22676k.m65750j(hls, "hls");
        AbstractC22676k.m65750j(rtmp, "rtmp");
        return new BroadcastSettingsResponse(enabled, hls, rtmp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BroadcastSettingsResponse)) {
            return false;
        }
        BroadcastSettingsResponse broadcastSettingsResponse = (BroadcastSettingsResponse) other;
        return this.enabled == broadcastSettingsResponse.enabled && AbstractC22676k.m65745e(this.hls, broadcastSettingsResponse.hls) && AbstractC22676k.m65745e(this.rtmp, broadcastSettingsResponse.rtmp);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final HLSSettingsResponse getHls() {
        return this.hls;
    }

    public final RTMPSettingsResponse getRtmp() {
        return this.rtmp;
    }

    public int hashCode() {
        return this.rtmp.hashCode() + ((this.hls.hashCode() + (Boolean.hashCode(this.enabled) * 31)) * 31);
    }

    public String toString() {
        return "BroadcastSettingsResponse(enabled=" + this.enabled + ", hls=" + this.hls + ", rtmp=" + this.rtmp + ")";
    }
}
