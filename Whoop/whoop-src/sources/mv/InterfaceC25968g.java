package mv;

import com.mapbox.geojson.Point;
import com.mapbox.maps.MercatorCoordinate;

/* JADX INFO: renamed from: mv.g */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC25968g {
    double getMetersPerPixelAtLatitude(double d3, double d14);

    MercatorCoordinate project(Point point, double d3);

    Point unproject(MercatorCoordinate mercatorCoordinate, double d3);
}
