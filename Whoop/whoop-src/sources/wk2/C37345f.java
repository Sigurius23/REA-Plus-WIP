package wk2;

import android.location.Location;
import hc3.AbstractC17176i;
import java.util.List;
import m83.C25271y;
import mk2.C25639f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import w41.C36823w;

/* JADX INFO: renamed from: wk2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJB\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, m65681d2 = {"Lwk2/f;", "", "", "Lw41/w;", "gpsRoute", "currentLocation", "", "distanceMeters", "Landroid/location/Location;", "lastAcceptedLocation", "<init>", "(Ljava/util/List;Lw41/w;DLandroid/location/Location;)V", "Lmk2/f;", "f", "()Lmk2/f;", "a", "(Ljava/util/List;Lw41/w;DLandroid/location/Location;)Lwk2/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Lw41/w;", "getCurrentLocation", "()Lw41/w;", "c", "D", "()D", "Landroid/location/Location;", "e", "()Landroid/location/Location;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37345f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C36823w> gpsRoute;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C36823w currentLocation;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final double distanceMeters;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Location lastAcceptedLocation;

    public C37345f(List<C36823w> gpsRoute, C36823w c36823w, double d3, Location location) {
        AbstractC22676k.m65750j(gpsRoute, "gpsRoute");
        this.gpsRoute = gpsRoute;
        this.currentLocation = c36823w;
        this.distanceMeters = d3;
        this.lastAcceptedLocation = location;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C37345f m119585b(C37345f c37345f, List list, C36823w c36823w, double d3, Location location, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = c37345f.gpsRoute;
        }
        if ((i13 & 2) != 0) {
            c36823w = c37345f.currentLocation;
        }
        if ((i13 & 4) != 0) {
            d3 = c37345f.distanceMeters;
        }
        if ((i13 & 8) != 0) {
            location = c37345f.lastAcceptedLocation;
        }
        Location location2 = location;
        return c37345f.m119586a(list, c36823w, d3, location2);
    }

    /* JADX INFO: renamed from: a */
    public final C37345f m119586a(List<C36823w> gpsRoute, C36823w currentLocation, double distanceMeters, Location lastAcceptedLocation) {
        AbstractC22676k.m65750j(gpsRoute, "gpsRoute");
        return new C37345f(gpsRoute, currentLocation, distanceMeters, lastAcceptedLocation);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getDistanceMeters() {
        return this.distanceMeters;
    }

    /* JADX INFO: renamed from: d */
    public final List<C36823w> m119588d() {
        return this.gpsRoute;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Location getLastAcceptedLocation() {
        return this.lastAcceptedLocation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37345f)) {
            return false;
        }
        C37345f c37345f = (C37345f) other;
        return AbstractC22676k.m65745e(this.gpsRoute, c37345f.gpsRoute) && AbstractC22676k.m65745e(this.currentLocation, c37345f.currentLocation) && Double.compare(this.distanceMeters, c37345f.distanceMeters) == 0 && AbstractC22676k.m65745e(this.lastAcceptedLocation, c37345f.lastAcceptedLocation);
    }

    /* JADX INFO: renamed from: f */
    public final C25639f m119590f() {
        return new C25639f(this.gpsRoute, this.currentLocation, Double.valueOf(this.distanceMeters));
    }

    public int hashCode() {
        int iHashCode = this.gpsRoute.hashCode() * 31;
        C36823w c36823w = this.currentLocation;
        int iM48499a = AbstractC17176i.m48499a((iHashCode + (c36823w == null ? 0 : c36823w.hashCode())) * 31, 31, this.distanceMeters);
        Location location = this.lastAcceptedLocation;
        return iM48499a + (location != null ? location.hashCode() : 0);
    }

    public String toString() {
        return "GpsRouteAccumulation(gpsRoute=" + this.gpsRoute + ", currentLocation=" + this.currentLocation + ", distanceMeters=" + this.distanceMeters + ", lastAcceptedLocation=" + this.lastAcceptedLocation + ")";
    }

    public /* synthetic */ C37345f(List list, C36823w c36823w, double d3, Location location, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, (i13 & 2) != 0 ? null : c36823w, (i13 & 4) != 0 ? 0.0d : d3, (i13 & 8) != 0 ? null : location);
    }
}
