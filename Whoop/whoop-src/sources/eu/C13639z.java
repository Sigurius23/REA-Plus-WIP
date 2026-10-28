package eu;

import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Objects;
import p591wp.C37486g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: eu.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C13639z {

    /* JADX INFO: renamed from: a */
    public final boolean f48330a;

    /* JADX INFO: renamed from: b */
    public final LatLngBounds f48331b;

    /* JADX INFO: renamed from: c */
    public final C37486g f48332c;

    /* JADX INFO: renamed from: d */
    public final EnumC13605c0 f48333d;

    public C13639z(boolean z4, LatLngBounds latLngBounds, C37486g c37486g, int i13) {
        z4 = (i13 & 4) != 0 ? false : z4;
        latLngBounds = (i13 & 16) != 0 ? null : latLngBounds;
        c37486g = (i13 & 32) != 0 ? null : c37486g;
        this.f48330a = z4;
        this.f48331b = latLngBounds;
        this.f48332c = c37486g;
        this.f48333d = EnumC13605c0.NORMAL;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13639z)) {
            return false;
        }
        C13639z c13639z = (C13639z) obj;
        return this.f48330a == c13639z.f48330a && AbstractC22676k.m65745e(this.f48331b, c13639z.f48331b) && AbstractC22676k.m65745e(this.f48332c, c13639z.f48332c) && this.f48333d == c13639z.f48333d;
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Objects.hash(bool, bool, Boolean.valueOf(this.f48330a), bool, this.f48331b, this.f48332c, this.f48333d, Float.valueOf(21.0f), Float.valueOf(3.0f));
    }

    public final String toString() {
        return "MapProperties(isBuildingEnabled=false, isIndoorEnabled=false, isMyLocationEnabled=" + this.f48330a + ", isTrafficEnabled=false, latLngBoundsForCameraTarget=" + this.f48331b + ", mapStyleOptions=" + this.f48332c + ", mapType=" + this.f48333d + ", maxZoomPreference=21.0, minZoomPreference=3.0)";
    }
}
