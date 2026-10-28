package live.hms.video.sdk.models.role;

import com.google.gson.annotations.SerializedName;
import live.hms.video.media.codec.HMSAudioCodec;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Llive/hms/video/sdk/models/role/AudioParams;", "", "bitRate", "", "codec", "Llive/hms/video/media/codec/HMSAudioCodec;", "<init>", "(ILlive/hms/video/media/codec/HMSAudioCodec;)V", "getBitRate", "()I", "getCodec", "()Llive/hms/video/media/codec/HMSAudioCodec;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class AudioParams {

    @SerializedName("bitRate")
    private final int bitRate;

    @SerializedName("codec")
    private final HMSAudioCodec codec;

    public AudioParams(int i13, HMSAudioCodec codec) {
        AbstractC22676k.m65750j(codec, "codec");
        this.bitRate = i13;
        this.codec = codec;
    }

    public static /* synthetic */ AudioParams copy$default(AudioParams audioParams, int i13, HMSAudioCodec hMSAudioCodec, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = audioParams.bitRate;
        }
        if ((i14 & 2) != 0) {
            hMSAudioCodec = audioParams.codec;
        }
        return audioParams.copy(i13, hMSAudioCodec);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBitRate() {
        return this.bitRate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HMSAudioCodec getCodec() {
        return this.codec;
    }

    public final AudioParams copy(int bitRate, HMSAudioCodec codec) {
        AbstractC22676k.m65750j(codec, "codec");
        return new AudioParams(bitRate, codec);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioParams)) {
            return false;
        }
        AudioParams audioParams = (AudioParams) other;
        return this.bitRate == audioParams.bitRate && this.codec == audioParams.codec;
    }

    public final int getBitRate() {
        return this.bitRate;
    }

    public final HMSAudioCodec getCodec() {
        return this.codec;
    }

    public int hashCode() {
        return this.codec.hashCode() + (Integer.hashCode(this.bitRate) * 31);
    }

    public String toString() {
        return "AudioParams(bitRate=" + this.bitRate + ", codec=" + this.codec + ')';
    }
}
