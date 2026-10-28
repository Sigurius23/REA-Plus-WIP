package live.hms.video.media.settings;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, m65681d2 = {"Llive/hms/video/media/settings/HMSVideoResolution;", "", "width", "", "height", "<init>", "(II)V", "getWidth", "()I", "setWidth", "(I)V", "getHeight", "setHeight", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSVideoResolution {
    private int height;
    private int width;

    public HMSVideoResolution(int i13, int i14) {
        this.width = i13;
        this.height = i14;
    }

    public static /* synthetic */ HMSVideoResolution copy$default(HMSVideoResolution hMSVideoResolution, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = hMSVideoResolution.width;
        }
        if ((i15 & 2) != 0) {
            i14 = hMSVideoResolution.height;
        }
        return hMSVideoResolution.copy(i13, i14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    public final HMSVideoResolution copy(int width, int height) {
        return new HMSVideoResolution(width, height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSVideoResolution)) {
            return false;
        }
        HMSVideoResolution hMSVideoResolution = (HMSVideoResolution) other;
        return this.width == hMSVideoResolution.width && this.height == hMSVideoResolution.height;
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

    public final void setHeight(int i13) {
        this.height = i13;
    }

    public final void setWidth(int i13) {
        this.width = i13;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HMSVideoResolution(width=");
        sb4.append(this.width);
        sb4.append(", height=");
        return AbstractC11895b.m31999r(sb4, this.height, ')');
    }
}
