package io.getstream.android.video.generated.models;

import java.util.Map;
import m83.C25272z;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0003\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0003\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/android/video/generated/models/IngressSettingsResponse;", "", "enabled", "", "audioEncodingOptions", "Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;", "videoEncodingOptions", "", "", "Lio/getstream/android/video/generated/models/IngressVideoEncodingResponse;", "(ZLio/getstream/android/video/generated/models/IngressAudioEncodingResponse;Ljava/util/Map;)V", "getAudioEncodingOptions", "()Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;", "getEnabled", "()Z", "getVideoEncodingOptions", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class IngressSettingsResponse {
    private final IngressAudioEncodingResponse audioEncodingOptions;
    private final boolean enabled;
    private final Map<String, IngressVideoEncodingResponse> videoEncodingOptions;

    public IngressSettingsResponse(@InterfaceC30731q(name = "enabled") boolean z4, @InterfaceC30731q(name = "audio_encoding_options") IngressAudioEncodingResponse ingressAudioEncodingResponse, @InterfaceC30731q(name = "video_encoding_options") Map<String, IngressVideoEncodingResponse> map) {
        this.enabled = z4;
        this.audioEncodingOptions = ingressAudioEncodingResponse;
        this.videoEncodingOptions = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IngressSettingsResponse copy$default(IngressSettingsResponse ingressSettingsResponse, boolean z4, IngressAudioEncodingResponse ingressAudioEncodingResponse, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = ingressSettingsResponse.enabled;
        }
        if ((i13 & 2) != 0) {
            ingressAudioEncodingResponse = ingressSettingsResponse.audioEncodingOptions;
        }
        if ((i13 & 4) != 0) {
            map = ingressSettingsResponse.videoEncodingOptions;
        }
        return ingressSettingsResponse.copy(z4, ingressAudioEncodingResponse, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final IngressAudioEncodingResponse getAudioEncodingOptions() {
        return this.audioEncodingOptions;
    }

    public final Map<String, IngressVideoEncodingResponse> component3() {
        return this.videoEncodingOptions;
    }

    public final IngressSettingsResponse copy(@InterfaceC30731q(name = "enabled") boolean enabled, @InterfaceC30731q(name = "audio_encoding_options") IngressAudioEncodingResponse audioEncodingOptions, @InterfaceC30731q(name = "video_encoding_options") Map<String, IngressVideoEncodingResponse> videoEncodingOptions) {
        return new IngressSettingsResponse(enabled, audioEncodingOptions, videoEncodingOptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IngressSettingsResponse)) {
            return false;
        }
        IngressSettingsResponse ingressSettingsResponse = (IngressSettingsResponse) other;
        return this.enabled == ingressSettingsResponse.enabled && AbstractC22676k.m65745e(this.audioEncodingOptions, ingressSettingsResponse.audioEncodingOptions) && AbstractC22676k.m65745e(this.videoEncodingOptions, ingressSettingsResponse.videoEncodingOptions);
    }

    public final IngressAudioEncodingResponse getAudioEncodingOptions() {
        return this.audioEncodingOptions;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Map<String, IngressVideoEncodingResponse> getVideoEncodingOptions() {
        return this.videoEncodingOptions;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.enabled) * 31;
        IngressAudioEncodingResponse ingressAudioEncodingResponse = this.audioEncodingOptions;
        int iHashCode2 = (iHashCode + (ingressAudioEncodingResponse == null ? 0 : ingressAudioEncodingResponse.hashCode())) * 31;
        Map<String, IngressVideoEncodingResponse> map = this.videoEncodingOptions;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        boolean z4 = this.enabled;
        IngressAudioEncodingResponse ingressAudioEncodingResponse = this.audioEncodingOptions;
        Map<String, IngressVideoEncodingResponse> map = this.videoEncodingOptions;
        StringBuilder sb4 = new StringBuilder("IngressSettingsResponse(enabled=");
        sb4.append(z4);
        sb4.append(", audioEncodingOptions=");
        sb4.append(ingressAudioEncodingResponse);
        sb4.append(", videoEncodingOptions=");
        return AbstractC13673n.m38565l(sb4, map, ")");
    }

    public /* synthetic */ IngressSettingsResponse(boolean z4, IngressAudioEncodingResponse ingressAudioEncodingResponse, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, (i13 & 2) != 0 ? null : ingressAudioEncodingResponse, (i13 & 4) != 0 ? C25272z.f99163w : map);
    }
}
