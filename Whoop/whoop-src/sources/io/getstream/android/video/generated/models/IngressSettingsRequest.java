package io.getstream.android.video.generated.models;

import java.util.Map;
import m83.C25272z;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0003\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J>\u0010\u0015\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0003\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/android/video/generated/models/IngressSettingsRequest;", "", "enabled", "", "audioEncodingOptions", "Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;", "videoEncodingOptions", "", "", "Lio/getstream/android/video/generated/models/IngressVideoEncodingOptionsRequest;", "(Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;Ljava/util/Map;)V", "getAudioEncodingOptions", "()Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getVideoEncodingOptions", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/IngressAudioEncodingOptionsRequest;Ljava/util/Map;)Lio/getstream/android/video/generated/models/IngressSettingsRequest;", "equals", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class IngressSettingsRequest {
    private final IngressAudioEncodingOptionsRequest audioEncodingOptions;
    private final Boolean enabled;
    private final Map<String, IngressVideoEncodingOptionsRequest> videoEncodingOptions;

    public IngressSettingsRequest() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IngressSettingsRequest copy$default(IngressSettingsRequest ingressSettingsRequest, Boolean bool, IngressAudioEncodingOptionsRequest ingressAudioEncodingOptionsRequest, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bool = ingressSettingsRequest.enabled;
        }
        if ((i13 & 2) != 0) {
            ingressAudioEncodingOptionsRequest = ingressSettingsRequest.audioEncodingOptions;
        }
        if ((i13 & 4) != 0) {
            map = ingressSettingsRequest.videoEncodingOptions;
        }
        return ingressSettingsRequest.copy(bool, ingressAudioEncodingOptionsRequest, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final IngressAudioEncodingOptionsRequest getAudioEncodingOptions() {
        return this.audioEncodingOptions;
    }

    public final Map<String, IngressVideoEncodingOptionsRequest> component3() {
        return this.videoEncodingOptions;
    }

    public final IngressSettingsRequest copy(@InterfaceC30731q(name = "enabled") Boolean enabled, @InterfaceC30731q(name = "audio_encoding_options") IngressAudioEncodingOptionsRequest audioEncodingOptions, @InterfaceC30731q(name = "video_encoding_options") Map<String, IngressVideoEncodingOptionsRequest> videoEncodingOptions) {
        return new IngressSettingsRequest(enabled, audioEncodingOptions, videoEncodingOptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IngressSettingsRequest)) {
            return false;
        }
        IngressSettingsRequest ingressSettingsRequest = (IngressSettingsRequest) other;
        return AbstractC22676k.m65745e(this.enabled, ingressSettingsRequest.enabled) && AbstractC22676k.m65745e(this.audioEncodingOptions, ingressSettingsRequest.audioEncodingOptions) && AbstractC22676k.m65745e(this.videoEncodingOptions, ingressSettingsRequest.videoEncodingOptions);
    }

    public final IngressAudioEncodingOptionsRequest getAudioEncodingOptions() {
        return this.audioEncodingOptions;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final Map<String, IngressVideoEncodingOptionsRequest> getVideoEncodingOptions() {
        return this.videoEncodingOptions;
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        IngressAudioEncodingOptionsRequest ingressAudioEncodingOptionsRequest = this.audioEncodingOptions;
        int iHashCode2 = (iHashCode + (ingressAudioEncodingOptionsRequest == null ? 0 : ingressAudioEncodingOptionsRequest.hashCode())) * 31;
        Map<String, IngressVideoEncodingOptionsRequest> map = this.videoEncodingOptions;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.enabled;
        IngressAudioEncodingOptionsRequest ingressAudioEncodingOptionsRequest = this.audioEncodingOptions;
        Map<String, IngressVideoEncodingOptionsRequest> map = this.videoEncodingOptions;
        StringBuilder sb4 = new StringBuilder("IngressSettingsRequest(enabled=");
        sb4.append(bool);
        sb4.append(", audioEncodingOptions=");
        sb4.append(ingressAudioEncodingOptionsRequest);
        sb4.append(", videoEncodingOptions=");
        return AbstractC13673n.m38565l(sb4, map, ")");
    }

    public IngressSettingsRequest(@InterfaceC30731q(name = "enabled") Boolean bool, @InterfaceC30731q(name = "audio_encoding_options") IngressAudioEncodingOptionsRequest ingressAudioEncodingOptionsRequest, @InterfaceC30731q(name = "video_encoding_options") Map<String, IngressVideoEncodingOptionsRequest> map) {
        this.enabled = bool;
        this.audioEncodingOptions = ingressAudioEncodingOptionsRequest;
        this.videoEncodingOptions = map;
    }

    public /* synthetic */ IngressSettingsRequest(Boolean bool, IngressAudioEncodingOptionsRequest ingressAudioEncodingOptionsRequest, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : bool, (i13 & 2) != 0 ? null : ingressAudioEncodingOptionsRequest, (i13 & 4) != 0 ? C25272z.f99163w : map);
    }
}
