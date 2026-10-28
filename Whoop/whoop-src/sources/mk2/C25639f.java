package mk2;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import w41.C36823w;

/* JADX INFO: renamed from: mk2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lmk2/f;", "", "", "Lw41/w;", "gpsRoute", "currentLocation", "", "distanceMeters", "<init>", "(Ljava/util/List;Lw41/w;Ljava/lang/Double;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lw41/w;", "()Lw41/w;", "Ljava/lang/Double;", "()Ljava/lang/Double;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25639f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C36823w> gpsRoute;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C36823w currentLocation;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Double distanceMeters;

    public C25639f(List<C36823w> gpsRoute, C36823w c36823w, Double d3) {
        AbstractC22676k.m65750j(gpsRoute, "gpsRoute");
        this.gpsRoute = gpsRoute;
        this.currentLocation = c36823w;
        this.distanceMeters = d3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C36823w getCurrentLocation() {
        return this.currentLocation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getDistanceMeters() {
        return this.distanceMeters;
    }

    /* JADX INFO: renamed from: c */
    public final List<C36823w> m75439c() {
        return this.gpsRoute;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25639f)) {
            return false;
        }
        C25639f c25639f = (C25639f) other;
        return AbstractC22676k.m65745e(this.gpsRoute, c25639f.gpsRoute) && AbstractC22676k.m65745e(this.currentLocation, c25639f.currentLocation) && AbstractC22676k.m65745e(this.distanceMeters, c25639f.distanceMeters);
    }

    public int hashCode() {
        int iHashCode = this.gpsRoute.hashCode() * 31;
        C36823w c36823w = this.currentLocation;
        int iHashCode2 = (iHashCode + (c36823w == null ? 0 : c36823w.hashCode())) * 31;
        Double d3 = this.distanceMeters;
        return iHashCode2 + (d3 != null ? d3.hashCode() : 0);
    }

    public String toString() {
        return "MapState(gpsRoute=" + this.gpsRoute + ", currentLocation=" + this.currentLocation + ", distanceMeters=" + this.distanceMeters + ")";
    }
}
