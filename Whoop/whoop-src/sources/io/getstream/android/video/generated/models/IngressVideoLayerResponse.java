package io.getstream.android.video.generated.models;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, m65681d2 = {"Lio/getstream/android/video/generated/models/IngressVideoLayerResponse;", "", "bitrate", "", "codec", "", "frameRateLimit", "maxDimension", "minDimension", "(ILjava/lang/String;III)V", "getBitrate", "()I", "getCodec", "()Ljava/lang/String;", "getFrameRateLimit", "getMaxDimension", "getMinDimension", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class IngressVideoLayerResponse {
    private final int bitrate;
    private final String codec;
    private final int frameRateLimit;
    private final int maxDimension;
    private final int minDimension;

    public IngressVideoLayerResponse(@InterfaceC30731q(name = "bitrate") int i13, @InterfaceC30731q(name = "codec") String codec, @InterfaceC30731q(name = "frame_rate_limit") int i14, @InterfaceC30731q(name = "max_dimension") int i15, @InterfaceC30731q(name = "min_dimension") int i16) {
        AbstractC22676k.m65750j(codec, "codec");
        this.bitrate = i13;
        this.codec = codec;
        this.frameRateLimit = i14;
        this.maxDimension = i15;
        this.minDimension = i16;
    }

    public static /* synthetic */ IngressVideoLayerResponse copy$default(IngressVideoLayerResponse ingressVideoLayerResponse, int i13, String str, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i13 = ingressVideoLayerResponse.bitrate;
        }
        if ((i17 & 2) != 0) {
            str = ingressVideoLayerResponse.codec;
        }
        if ((i17 & 4) != 0) {
            i14 = ingressVideoLayerResponse.frameRateLimit;
        }
        if ((i17 & 8) != 0) {
            i15 = ingressVideoLayerResponse.maxDimension;
        }
        if ((i17 & 16) != 0) {
            i16 = ingressVideoLayerResponse.minDimension;
        }
        int i18 = i16;
        int i19 = i14;
        return ingressVideoLayerResponse.copy(i13, str, i19, i15, i18);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBitrate() {
        return this.bitrate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCodec() {
        return this.codec;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFrameRateLimit() {
        return this.frameRateLimit;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMaxDimension() {
        return this.maxDimension;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMinDimension() {
        return this.minDimension;
    }

    public final IngressVideoLayerResponse copy(@InterfaceC30731q(name = "bitrate") int bitrate, @InterfaceC30731q(name = "codec") String codec, @InterfaceC30731q(name = "frame_rate_limit") int frameRateLimit, @InterfaceC30731q(name = "max_dimension") int maxDimension, @InterfaceC30731q(name = "min_dimension") int minDimension) {
        AbstractC22676k.m65750j(codec, "codec");
        return new IngressVideoLayerResponse(bitrate, codec, frameRateLimit, maxDimension, minDimension);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IngressVideoLayerResponse)) {
            return false;
        }
        IngressVideoLayerResponse ingressVideoLayerResponse = (IngressVideoLayerResponse) other;
        return this.bitrate == ingressVideoLayerResponse.bitrate && AbstractC22676k.m65745e(this.codec, ingressVideoLayerResponse.codec) && this.frameRateLimit == ingressVideoLayerResponse.frameRateLimit && this.maxDimension == ingressVideoLayerResponse.maxDimension && this.minDimension == ingressVideoLayerResponse.minDimension;
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final String getCodec() {
        return this.codec;
    }

    public final int getFrameRateLimit() {
        return this.frameRateLimit;
    }

    public final int getMaxDimension() {
        return this.maxDimension;
    }

    public final int getMinDimension() {
        return this.minDimension;
    }

    public int hashCode() {
        return Integer.hashCode(this.minDimension) + AbstractC11266d.m30448b(this.maxDimension, AbstractC11266d.m30448b(this.frameRateLimit, AbstractC11266d.m30450d(Integer.hashCode(this.bitrate) * 31, 31, this.codec), 31), 31);
    }

    public String toString() {
        int i13 = this.bitrate;
        String str = this.codec;
        int i14 = this.frameRateLimit;
        int i15 = this.maxDimension;
        int i16 = this.minDimension;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "IngressVideoLayerResponse(bitrate=", ", codec=", str, ", frameRateLimit=");
        AbstractC30802r.m94773v(sbM53373n, i14, ", maxDimension=", i15, ", minDimension=");
        return AbstractC18489d0.m53371l(sbM53373n, i16, ")");
    }
}
