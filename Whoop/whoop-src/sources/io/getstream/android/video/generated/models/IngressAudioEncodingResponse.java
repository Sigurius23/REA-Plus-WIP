package io.getstream.android.video.generated.models;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m65681d2 = {"Lio/getstream/android/video/generated/models/IngressAudioEncodingResponse;", "", "bitrate", "", "channels", "enableDtx", "", "(IIZ)V", "getBitrate", "()I", "getChannels", "getEnableDtx", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class IngressAudioEncodingResponse {
    private final int bitrate;
    private final int channels;
    private final boolean enableDtx;

    public IngressAudioEncodingResponse(@InterfaceC30731q(name = "bitrate") int i13, @InterfaceC30731q(name = "channels") int i14, @InterfaceC30731q(name = "enable_dtx") boolean z4) {
        this.bitrate = i13;
        this.channels = i14;
        this.enableDtx = z4;
    }

    public static /* synthetic */ IngressAudioEncodingResponse copy$default(IngressAudioEncodingResponse ingressAudioEncodingResponse, int i13, int i14, boolean z4, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = ingressAudioEncodingResponse.bitrate;
        }
        if ((i15 & 2) != 0) {
            i14 = ingressAudioEncodingResponse.channels;
        }
        if ((i15 & 4) != 0) {
            z4 = ingressAudioEncodingResponse.enableDtx;
        }
        return ingressAudioEncodingResponse.copy(i13, i14, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBitrate() {
        return this.bitrate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getChannels() {
        return this.channels;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnableDtx() {
        return this.enableDtx;
    }

    public final IngressAudioEncodingResponse copy(@InterfaceC30731q(name = "bitrate") int bitrate, @InterfaceC30731q(name = "channels") int channels, @InterfaceC30731q(name = "enable_dtx") boolean enableDtx) {
        return new IngressAudioEncodingResponse(bitrate, channels, enableDtx);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IngressAudioEncodingResponse)) {
            return false;
        }
        IngressAudioEncodingResponse ingressAudioEncodingResponse = (IngressAudioEncodingResponse) other;
        return this.bitrate == ingressAudioEncodingResponse.bitrate && this.channels == ingressAudioEncodingResponse.channels && this.enableDtx == ingressAudioEncodingResponse.enableDtx;
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final int getChannels() {
        return this.channels;
    }

    public final boolean getEnableDtx() {
        return this.enableDtx;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enableDtx) + AbstractC11266d.m30448b(this.channels, Integer.hashCode(this.bitrate) * 31, 31);
    }

    public String toString() {
        int i13 = this.bitrate;
        int i14 = this.channels;
        return AbstractC18489d0.m53372m(AbstractC11266d.m30465s(i13, i14, "IngressAudioEncodingResponse(bitrate=", ", channels=", ", enableDtx="), this.enableDtx, ")");
    }
}
