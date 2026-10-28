package io.getstream.android.video.generated.models;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/android/video/generated/models/IngressSourceResponse;", "", "fps", "", "height", "width", "(III)V", "getFps", "()I", "getHeight", "getWidth", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class IngressSourceResponse {
    private final int fps;
    private final int height;
    private final int width;

    public IngressSourceResponse(@InterfaceC30731q(name = "fps") int i13, @InterfaceC30731q(name = "height") int i14, @InterfaceC30731q(name = "width") int i15) {
        this.fps = i13;
        this.height = i14;
        this.width = i15;
    }

    public static /* synthetic */ IngressSourceResponse copy$default(IngressSourceResponse ingressSourceResponse, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i13 = ingressSourceResponse.fps;
        }
        if ((i16 & 2) != 0) {
            i14 = ingressSourceResponse.height;
        }
        if ((i16 & 4) != 0) {
            i15 = ingressSourceResponse.width;
        }
        return ingressSourceResponse.copy(i13, i14, i15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getFps() {
        return this.fps;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    public final IngressSourceResponse copy(@InterfaceC30731q(name = "fps") int fps, @InterfaceC30731q(name = "height") int height, @InterfaceC30731q(name = "width") int width) {
        return new IngressSourceResponse(fps, height, width);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IngressSourceResponse)) {
            return false;
        }
        IngressSourceResponse ingressSourceResponse = (IngressSourceResponse) other;
        return this.fps == ingressSourceResponse.fps && this.height == ingressSourceResponse.height && this.width == ingressSourceResponse.width;
    }

    public final int getFps() {
        return this.fps;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Integer.hashCode(this.width) + AbstractC11266d.m30448b(this.height, Integer.hashCode(this.fps) * 31, 31);
    }

    public String toString() {
        int i13 = this.fps;
        int i14 = this.height;
        return AbstractC18489d0.m53371l(AbstractC11266d.m30465s(i13, i14, "IngressSourceResponse(fps=", ", height=", ", width="), this.width, ")");
    }
}
