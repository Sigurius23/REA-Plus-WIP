package live.hms.video.sdk.models.role;

import com.google.gson.annotations.SerializedName;
import live.hms.video.media.codec.HMSVideoCodec;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, m65681d2 = {"Llive/hms/video/sdk/models/role/VideoParams;", "", "bitRate", "", "codec", "Llive/hms/video/media/codec/HMSVideoCodec;", "frameRate", "width", "height", "<init>", "(ILlive/hms/video/media/codec/HMSVideoCodec;III)V", "getBitRate", "()I", "getCodec", "()Llive/hms/video/media/codec/HMSVideoCodec;", "getFrameRate", "getWidth", "getHeight", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class VideoParams {

    @SerializedName("bitRate")
    private final int bitRate;

    @SerializedName("codec")
    private final HMSVideoCodec codec;

    @SerializedName("frameRate")
    private final int frameRate;

    @SerializedName("height")
    private final int height;

    @SerializedName("width")
    private final int width;

    public VideoParams(int i13, HMSVideoCodec codec, int i14, int i15, int i16) {
        AbstractC22676k.m65750j(codec, "codec");
        this.bitRate = i13;
        this.codec = codec;
        this.frameRate = i14;
        this.width = i15;
        this.height = i16;
    }

    public static /* synthetic */ VideoParams copy$default(VideoParams videoParams, int i13, HMSVideoCodec hMSVideoCodec, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i13 = videoParams.bitRate;
        }
        if ((i17 & 2) != 0) {
            hMSVideoCodec = videoParams.codec;
        }
        if ((i17 & 4) != 0) {
            i14 = videoParams.frameRate;
        }
        if ((i17 & 8) != 0) {
            i15 = videoParams.width;
        }
        if ((i17 & 16) != 0) {
            i16 = videoParams.height;
        }
        int i18 = i16;
        int i19 = i14;
        return videoParams.copy(i13, hMSVideoCodec, i19, i15, i18);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBitRate() {
        return this.bitRate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HMSVideoCodec getCodec() {
        return this.codec;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFrameRate() {
        return this.frameRate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    public final VideoParams copy(int bitRate, HMSVideoCodec codec, int frameRate, int width, int height) {
        AbstractC22676k.m65750j(codec, "codec");
        return new VideoParams(bitRate, codec, frameRate, width, height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoParams)) {
            return false;
        }
        VideoParams videoParams = (VideoParams) other;
        return this.bitRate == videoParams.bitRate && this.codec == videoParams.codec && this.frameRate == videoParams.frameRate && this.width == videoParams.width && this.height == videoParams.height;
    }

    public final int getBitRate() {
        return this.bitRate;
    }

    public final HMSVideoCodec getCodec() {
        return this.codec;
    }

    public final int getFrameRate() {
        return this.frameRate;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.height) + AbstractC11266d.m30448b(this.width, AbstractC11266d.m30448b(this.frameRate, (this.codec.hashCode() + (Integer.hashCode(this.bitRate) * 31)) * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("VideoParams(bitRate=");
        sb4.append(this.bitRate);
        sb4.append(", codec=");
        sb4.append(this.codec);
        sb4.append(", frameRate=");
        sb4.append(this.frameRate);
        sb4.append(", width=");
        sb4.append(this.width);
        sb4.append(", height=");
        return AbstractC11895b.m31999r(sb4, this.height, ')');
    }
}
