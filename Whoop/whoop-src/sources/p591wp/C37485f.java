package p591wp;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import p529uo.AbstractC35135w;

/* JADX INFO: renamed from: wp.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C37485f {

    /* JADX INFO: renamed from: a */
    public double f160326a;

    /* JADX INFO: renamed from: b */
    public double f160327b;

    /* JADX INFO: renamed from: c */
    public double f160328c;

    /* JADX INFO: renamed from: d */
    public double f160329d;

    /* JADX INFO: renamed from: a */
    public final LatLngBounds m120170a() {
        AbstractC35135w.m111096h("no included points", !Double.isNaN(this.f160328c));
        return new LatLngBounds(new LatLng(this.f160326a, this.f160328c), new LatLng(this.f160327b, this.f160329d));
    }

    /* JADX INFO: renamed from: b */
    public final void m120171b(LatLng latLng) {
        AbstractC35135w.m111095g(latLng, "point must not be null");
        double d3 = this.f160326a;
        double d14 = latLng.f20614w;
        this.f160326a = Math.min(d3, d14);
        this.f160327b = Math.max(this.f160327b, d14);
        double d15 = latLng.f20615x;
        if (Double.isNaN(this.f160328c)) {
            this.f160328c = d15;
            this.f160329d = d15;
            return;
        }
        double d16 = this.f160328c;
        double d17 = this.f160329d;
        if (d16 <= d17) {
            if (d16 <= d15 && d15 <= d17) {
                return;
            }
        } else if (d16 <= d15 || d15 <= d17) {
            return;
        }
        if (((d16 - d15) + 360.0d) % 360.0d < ((d15 - d17) + 360.0d) % 360.0d) {
            this.f160328c = d15;
        } else {
            this.f160329d = d15;
        }
    }
}
