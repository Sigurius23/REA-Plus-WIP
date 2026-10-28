package live.hms.video.sdk.models;

import com.google.gson.annotations.SerializedName;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSHlsRecordingConfig;", "", "singleFilePerLayer", "", "videoOnDemand", "<init>", "(ZZ)V", "getSingleFilePerLayer", "()Z", "getVideoOnDemand", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSHlsRecordingConfig {

    @SerializedName("single_file_per_layer")
    private final boolean singleFilePerLayer;

    @SerializedName("hls_vod")
    private final boolean videoOnDemand;

    public HMSHlsRecordingConfig(boolean z4, boolean z13) {
        this.singleFilePerLayer = z4;
        this.videoOnDemand = z13;
    }

    public static /* synthetic */ HMSHlsRecordingConfig copy$default(HMSHlsRecordingConfig hMSHlsRecordingConfig, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = hMSHlsRecordingConfig.singleFilePerLayer;
        }
        if ((i13 & 2) != 0) {
            z13 = hMSHlsRecordingConfig.videoOnDemand;
        }
        return hMSHlsRecordingConfig.copy(z4, z13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSingleFilePerLayer() {
        return this.singleFilePerLayer;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getVideoOnDemand() {
        return this.videoOnDemand;
    }

    public final HMSHlsRecordingConfig copy(boolean singleFilePerLayer, boolean videoOnDemand) {
        return new HMSHlsRecordingConfig(singleFilePerLayer, videoOnDemand);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSHlsRecordingConfig)) {
            return false;
        }
        HMSHlsRecordingConfig hMSHlsRecordingConfig = (HMSHlsRecordingConfig) other;
        return this.singleFilePerLayer == hMSHlsRecordingConfig.singleFilePerLayer && this.videoOnDemand == hMSHlsRecordingConfig.videoOnDemand;
    }

    public final boolean getSingleFilePerLayer() {
        return this.singleFilePerLayer;
    }

    public final boolean getVideoOnDemand() {
        return this.videoOnDemand;
    }

    public int hashCode() {
        return Boolean.hashCode(this.videoOnDemand) + (Boolean.hashCode(this.singleFilePerLayer) * 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HMSHlsRecordingConfig(singleFilePerLayer=");
        sb4.append(this.singleFilePerLayer);
        sb4.append(", videoOnDemand=");
        return AbstractC2875y.m8305r(sb4, this.videoOnDemand, ')');
    }
}
