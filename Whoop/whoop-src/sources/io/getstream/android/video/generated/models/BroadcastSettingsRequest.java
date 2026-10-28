package io.getstream.android.video.generated.models;

import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;", "", "enabled", "", "hls", "Lio/getstream/android/video/generated/models/HLSSettingsRequest;", "rtmp", "Lio/getstream/android/video/generated/models/RTMPSettingsRequest;", "(Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/HLSSettingsRequest;Lio/getstream/android/video/generated/models/RTMPSettingsRequest;)V", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHls", "()Lio/getstream/android/video/generated/models/HLSSettingsRequest;", "getRtmp", "()Lio/getstream/android/video/generated/models/RTMPSettingsRequest;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/HLSSettingsRequest;Lio/getstream/android/video/generated/models/RTMPSettingsRequest;)Lio/getstream/android/video/generated/models/BroadcastSettingsRequest;", "equals", "other", "hashCode", "", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class BroadcastSettingsRequest {
    private final Boolean enabled;
    private final HLSSettingsRequest hls;
    private final RTMPSettingsRequest rtmp;

    public BroadcastSettingsRequest() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ BroadcastSettingsRequest copy$default(BroadcastSettingsRequest broadcastSettingsRequest, Boolean bool, HLSSettingsRequest hLSSettingsRequest, RTMPSettingsRequest rTMPSettingsRequest, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bool = broadcastSettingsRequest.enabled;
        }
        if ((i13 & 2) != 0) {
            hLSSettingsRequest = broadcastSettingsRequest.hls;
        }
        if ((i13 & 4) != 0) {
            rTMPSettingsRequest = broadcastSettingsRequest.rtmp;
        }
        return broadcastSettingsRequest.copy(bool, hLSSettingsRequest, rTMPSettingsRequest);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HLSSettingsRequest getHls() {
        return this.hls;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RTMPSettingsRequest getRtmp() {
        return this.rtmp;
    }

    public final BroadcastSettingsRequest copy(@InterfaceC30731q(name = "enabled") Boolean enabled, @InterfaceC30731q(name = "hls") HLSSettingsRequest hls, @InterfaceC30731q(name = "rtmp") RTMPSettingsRequest rtmp) {
        return new BroadcastSettingsRequest(enabled, hls, rtmp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BroadcastSettingsRequest)) {
            return false;
        }
        BroadcastSettingsRequest broadcastSettingsRequest = (BroadcastSettingsRequest) other;
        return AbstractC22676k.m65745e(this.enabled, broadcastSettingsRequest.enabled) && AbstractC22676k.m65745e(this.hls, broadcastSettingsRequest.hls) && AbstractC22676k.m65745e(this.rtmp, broadcastSettingsRequest.rtmp);
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final HLSSettingsRequest getHls() {
        return this.hls;
    }

    public final RTMPSettingsRequest getRtmp() {
        return this.rtmp;
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        HLSSettingsRequest hLSSettingsRequest = this.hls;
        int iHashCode2 = (iHashCode + (hLSSettingsRequest == null ? 0 : hLSSettingsRequest.hashCode())) * 31;
        RTMPSettingsRequest rTMPSettingsRequest = this.rtmp;
        return iHashCode2 + (rTMPSettingsRequest != null ? rTMPSettingsRequest.hashCode() : 0);
    }

    public String toString() {
        return "BroadcastSettingsRequest(enabled=" + this.enabled + ", hls=" + this.hls + ", rtmp=" + this.rtmp + ")";
    }

    public BroadcastSettingsRequest(@InterfaceC30731q(name = "enabled") Boolean bool, @InterfaceC30731q(name = "hls") HLSSettingsRequest hLSSettingsRequest, @InterfaceC30731q(name = "rtmp") RTMPSettingsRequest rTMPSettingsRequest) {
        this.enabled = bool;
        this.hls = hLSSettingsRequest;
        this.rtmp = rTMPSettingsRequest;
    }

    public /* synthetic */ BroadcastSettingsRequest(Boolean bool, HLSSettingsRequest hLSSettingsRequest, RTMPSettingsRequest rTMPSettingsRequest, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : bool, (i13 & 2) != 0 ? null : hLSSettingsRequest, (i13 & 4) != 0 ? null : rTMPSettingsRequest);
    }
}
