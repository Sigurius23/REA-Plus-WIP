package io.getstream.android.video.generated.models;

import d13.AbstractC11478a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u000fJB\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\nHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m65681d2 = {"Lio/getstream/android/video/generated/models/SFULocationResponse;", "", "datacenter", "", "id", "coordinates", "Lio/getstream/android/video/generated/models/CoordinatesResponse;", "location", "Lio/getstream/android/video/generated/models/LocationResponse;", "count", "", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CoordinatesResponse;Lio/getstream/android/video/generated/models/LocationResponse;Ljava/lang/Integer;)V", "getCoordinates", "()Lio/getstream/android/video/generated/models/CoordinatesResponse;", "getCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDatacenter", "()Ljava/lang/String;", "getId", "getLocation", "()Lio/getstream/android/video/generated/models/LocationResponse;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CoordinatesResponse;Lio/getstream/android/video/generated/models/LocationResponse;Ljava/lang/Integer;)Lio/getstream/android/video/generated/models/SFULocationResponse;", "equals", "", "other", "hashCode", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class SFULocationResponse {
    private final CoordinatesResponse coordinates;
    private final Integer count;
    private final String datacenter;
    private final String id;
    private final LocationResponse location;

    public SFULocationResponse(@InterfaceC30731q(name = "datacenter") String datacenter, @InterfaceC30731q(name = "id") String id4, @InterfaceC30731q(name = "coordinates") CoordinatesResponse coordinates, @InterfaceC30731q(name = "location") LocationResponse location, @InterfaceC30731q(name = "count") Integer num) {
        AbstractC22676k.m65750j(datacenter, "datacenter");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(coordinates, "coordinates");
        AbstractC22676k.m65750j(location, "location");
        this.datacenter = datacenter;
        this.id = id4;
        this.coordinates = coordinates;
        this.location = location;
        this.count = num;
    }

    public static /* synthetic */ SFULocationResponse copy$default(SFULocationResponse sFULocationResponse, String str, String str2, CoordinatesResponse coordinatesResponse, LocationResponse locationResponse, Integer num, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sFULocationResponse.datacenter;
        }
        if ((i13 & 2) != 0) {
            str2 = sFULocationResponse.id;
        }
        if ((i13 & 4) != 0) {
            coordinatesResponse = sFULocationResponse.coordinates;
        }
        if ((i13 & 8) != 0) {
            locationResponse = sFULocationResponse.location;
        }
        if ((i13 & 16) != 0) {
            num = sFULocationResponse.count;
        }
        Integer num2 = num;
        CoordinatesResponse coordinatesResponse2 = coordinatesResponse;
        return sFULocationResponse.copy(str, str2, coordinatesResponse2, locationResponse, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDatacenter() {
        return this.datacenter;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CoordinatesResponse getCoordinates() {
        return this.coordinates;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LocationResponse getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    public final SFULocationResponse copy(@InterfaceC30731q(name = "datacenter") String datacenter, @InterfaceC30731q(name = "id") String id4, @InterfaceC30731q(name = "coordinates") CoordinatesResponse coordinates, @InterfaceC30731q(name = "location") LocationResponse location, @InterfaceC30731q(name = "count") Integer count) {
        AbstractC22676k.m65750j(datacenter, "datacenter");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(coordinates, "coordinates");
        AbstractC22676k.m65750j(location, "location");
        return new SFULocationResponse(datacenter, id4, coordinates, location, count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SFULocationResponse)) {
            return false;
        }
        SFULocationResponse sFULocationResponse = (SFULocationResponse) other;
        return AbstractC22676k.m65745e(this.datacenter, sFULocationResponse.datacenter) && AbstractC22676k.m65745e(this.id, sFULocationResponse.id) && AbstractC22676k.m65745e(this.coordinates, sFULocationResponse.coordinates) && AbstractC22676k.m65745e(this.location, sFULocationResponse.location) && AbstractC22676k.m65745e(this.count, sFULocationResponse.count);
    }

    public final CoordinatesResponse getCoordinates() {
        return this.coordinates;
    }

    public final Integer getCount() {
        return this.count;
    }

    public final String getDatacenter() {
        return this.datacenter;
    }

    public final String getId() {
        return this.id;
    }

    public final LocationResponse getLocation() {
        return this.location;
    }

    public int hashCode() {
        int iHashCode = (this.location.hashCode() + ((this.coordinates.hashCode() + AbstractC11266d.m30450d(this.datacenter.hashCode() * 31, 31, this.id)) * 31)) * 31;
        Integer num = this.count;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        String str = this.datacenter;
        String str2 = this.id;
        CoordinatesResponse coordinatesResponse = this.coordinates;
        LocationResponse locationResponse = this.location;
        Integer num = this.count;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SFULocationResponse(datacenter=", str, ", id=", str2, ", coordinates=");
        sbM32001t.append(coordinatesResponse);
        sbM32001t.append(", location=");
        sbM32001t.append(locationResponse);
        sbM32001t.append(", count=");
        return AbstractC11478a.m30859k(sbM32001t, num, ")");
    }

    public /* synthetic */ SFULocationResponse(String str, String str2, CoordinatesResponse coordinatesResponse, LocationResponse locationResponse, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, coordinatesResponse, locationResponse, (i13 & 16) != 0 ? null : num);
    }
}
