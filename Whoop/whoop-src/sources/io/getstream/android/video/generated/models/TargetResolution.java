package io.getstream.android.video.generated.models;

import d13.AbstractC11478a;
import p000.AbstractC11266d;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TargetResolution;", "", "height", "", "width", "bitrate", "(IILjava/lang/Integer;)V", "getBitrate", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeight", "()I", "getWidth", "component1", "component2", "component3", "copy", "(IILjava/lang/Integer;)Lio/getstream/android/video/generated/models/TargetResolution;", "equals", "", "other", "hashCode", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class TargetResolution {
    private final Integer bitrate;
    private final int height;
    private final int width;

    public TargetResolution(@InterfaceC30731q(name = "height") int i13, @InterfaceC30731q(name = "width") int i14, @InterfaceC30731q(name = "bitrate") Integer num) {
        this.height = i13;
        this.width = i14;
        this.bitrate = num;
    }

    public static /* synthetic */ TargetResolution copy$default(TargetResolution targetResolution, int i13, int i14, Integer num, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = targetResolution.height;
        }
        if ((i15 & 2) != 0) {
            i14 = targetResolution.width;
        }
        if ((i15 & 4) != 0) {
            num = targetResolution.bitrate;
        }
        return targetResolution.copy(i13, i14, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getBitrate() {
        return this.bitrate;
    }

    public final TargetResolution copy(@InterfaceC30731q(name = "height") int height, @InterfaceC30731q(name = "width") int width, @InterfaceC30731q(name = "bitrate") Integer bitrate) {
        return new TargetResolution(height, width, bitrate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TargetResolution)) {
            return false;
        }
        TargetResolution targetResolution = (TargetResolution) other;
        return this.height == targetResolution.height && this.width == targetResolution.width && AbstractC22676k.m65745e(this.bitrate, targetResolution.bitrate);
    }

    public final Integer getBitrate() {
        return this.bitrate;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.width, Integer.hashCode(this.height) * 31, 31);
        Integer num = this.bitrate;
        return iM30448b + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        int i13 = this.height;
        int i14 = this.width;
        return AbstractC11478a.m30859k(AbstractC11266d.m30465s(i13, i14, "TargetResolution(height=", ", width=", ", bitrate="), this.bitrate, ")");
    }

    public /* synthetic */ TargetResolution(int i13, int i14, Integer num, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, i14, (i15 & 4) != 0 ? null : num);
    }
}
