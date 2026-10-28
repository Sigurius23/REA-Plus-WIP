package w41;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: w41.w */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lw41/w;", "", "", "latitude", "longitude", "<init>", "(DD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "b", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36823w {

    /* JADX INFO: renamed from: c */
    public static final int f157507c = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final double latitude;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final double longitude;

    public C36823w(double d3, double d14) {
        this.latitude = d3;
        this.longitude = d14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36823w)) {
            return false;
        }
        C36823w c36823w = (C36823w) other;
        return Double.compare(this.latitude, c36823w.latitude) == 0 && Double.compare(this.longitude, c36823w.longitude) == 0;
    }

    public int hashCode() {
        return Double.hashCode(this.longitude) + (Double.hashCode(this.latitude) * 31);
    }

    public String toString() {
        return AbstractC30007c.m91836f(this.longitude, ")", AbstractC2875y.m8306s("LatLangCoordinates(latitude=", this.latitude, ", longitude="));
    }
}
