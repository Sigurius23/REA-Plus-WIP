package io.getstream.android.video.generated.models;

import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CoordinatesResponse;", "", "latitude", "", "longitude", "(FF)V", "getLatitude", "()F", "getLongitude", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CoordinatesResponse {
    private final float latitude;
    private final float longitude;

    public CoordinatesResponse(@InterfaceC30731q(name = "latitude") float f13, @InterfaceC30731q(name = "longitude") float f14) {
        this.latitude = f13;
        this.longitude = f14;
    }

    public static /* synthetic */ CoordinatesResponse copy$default(CoordinatesResponse coordinatesResponse, float f13, float f14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = coordinatesResponse.latitude;
        }
        if ((i13 & 2) != 0) {
            f14 = coordinatesResponse.longitude;
        }
        return coordinatesResponse.copy(f13, f14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getLongitude() {
        return this.longitude;
    }

    public final CoordinatesResponse copy(@InterfaceC30731q(name = "latitude") float latitude, @InterfaceC30731q(name = "longitude") float longitude) {
        return new CoordinatesResponse(latitude, longitude);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoordinatesResponse)) {
            return false;
        }
        CoordinatesResponse coordinatesResponse = (CoordinatesResponse) other;
        return Float.compare(this.latitude, coordinatesResponse.latitude) == 0 && Float.compare(this.longitude, coordinatesResponse.longitude) == 0;
    }

    public final float getLatitude() {
        return this.latitude;
    }

    public final float getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return Float.hashCode(this.longitude) + (Float.hashCode(this.latitude) * 31);
    }

    public String toString() {
        return AbstractC31061c.m95638n("CoordinatesResponse(latitude=", this.latitude, ", longitude=", this.longitude, ")");
    }
}
