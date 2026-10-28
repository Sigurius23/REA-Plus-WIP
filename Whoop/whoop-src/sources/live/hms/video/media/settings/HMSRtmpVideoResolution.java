package live.hms.video.media.settings;

import com.google.gson.annotations.SerializedName;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m65681d2 = {"Llive/hms/video/media/settings/HMSRtmpVideoResolution;", "", "width", "", "height", "<init>", "(II)V", "getWidth", "()I", "getHeight", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSRtmpVideoResolution {

    @SerializedName("height")
    private final int height;

    @SerializedName("width")
    private final int width;

    public HMSRtmpVideoResolution(int i13, int i14) {
        this.width = i13;
        this.height = i14;
    }

    public static /* synthetic */ HMSRtmpVideoResolution copy$default(HMSRtmpVideoResolution hMSRtmpVideoResolution, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = hMSRtmpVideoResolution.width;
        }
        if ((i15 & 2) != 0) {
            i14 = hMSRtmpVideoResolution.height;
        }
        return hMSRtmpVideoResolution.copy(i13, i14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    public final HMSRtmpVideoResolution copy(int width, int height) {
        return new HMSRtmpVideoResolution(width, height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSRtmpVideoResolution)) {
            return false;
        }
        HMSRtmpVideoResolution hMSRtmpVideoResolution = (HMSRtmpVideoResolution) other;
        return this.width == hMSRtmpVideoResolution.width && this.height == hMSRtmpVideoResolution.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.height) + (Integer.hashCode(this.width) * 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HMSRtmpVideoResolution(width=");
        sb4.append(this.width);
        sb4.append(", height=");
        return AbstractC11895b.m31999r(sb4, this.height, ')');
    }
}
