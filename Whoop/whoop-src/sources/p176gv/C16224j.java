package p176gv;

import android.animation.TypeEvaluator;
import com.mapbox.geojson.Point;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.ScreenCoordinate;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gv.j */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C16224j implements TypeEvaluator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61621a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f13, Object obj, Object obj2) {
        switch (this.f61621a) {
            case 0:
                Point point = (Point) obj;
                Point point2 = (Point) obj2;
                if (f13 == 1.0f) {
                    return point2;
                }
                if (f13 == 0.0f) {
                    return point;
                }
                double dLongitude = point2.longitude() - point.longitude();
                double dLatitude = point2.latitude() - point.latitude();
                if (dLongitude == 0.0d && dLatitude == 0.0d) {
                    return point;
                }
                double d3 = f13;
                return Point.fromLngLat((dLongitude * d3) + point.longitude(), (d3 * dLatitude) + point.latitude());
            case 1:
                Double startValue = (Double) obj;
                Double d14 = (Double) obj2;
                if (f13 == 1.0f) {
                    return d14;
                }
                if (f13 == 0.0f) {
                    return startValue;
                }
                double dDoubleValue = d14.doubleValue();
                AbstractC22676k.m65749i(startValue, "startValue");
                double dDoubleValue2 = dDoubleValue - startValue.doubleValue();
                if (dDoubleValue2 == 0.0d) {
                    return startValue;
                }
                return Double.valueOf((((double) f13) * dDoubleValue2) + startValue.doubleValue());
            case 2:
                EdgeInsets edgeInsets = (EdgeInsets) obj;
                EdgeInsets edgeInsets2 = (EdgeInsets) obj2;
                EdgeInsets edgeInsets3 = AbstractC16225k.f61624c;
                if (edgeInsets2 == null) {
                    MapboxLogger.logW("Mbgl-CameraManager", "End edge insets are null (fraction: " + f13 + ')');
                    edgeInsets2 = edgeInsets3;
                }
                if (f13 == 1.0f) {
                    return edgeInsets2;
                }
                if (edgeInsets == null) {
                    MapboxLogger.logW("Mbgl-CameraManager", "Start edge insets are null (fraction: " + f13 + ')');
                    edgeInsets = edgeInsets3;
                }
                if (f13 != 0.0f) {
                    double top = edgeInsets2.getTop() - edgeInsets.getTop();
                    double left = edgeInsets2.getLeft() - edgeInsets.getLeft();
                    double bottom = edgeInsets2.getBottom() - edgeInsets.getBottom();
                    double right = edgeInsets2.getRight() - edgeInsets.getRight();
                    if (top != 0.0d || left != 0.0d || bottom != 0.0d || right != 0.0d) {
                        double d15 = f13;
                        return new EdgeInsets(edgeInsets.getTop() + (top * d15), (left * d15) + edgeInsets.getLeft(), (bottom * d15) + edgeInsets.getBottom(), (d15 * right) + edgeInsets.getRight());
                    }
                }
                return edgeInsets;
            case 3:
                ScreenCoordinate screenCoordinate = (ScreenCoordinate) obj;
                ScreenCoordinate screenCoordinate2 = (ScreenCoordinate) obj2;
                if (f13 != 1.0f) {
                    if (f13 == 0.0f) {
                        return screenCoordinate;
                    }
                    double x3 = screenCoordinate2.getX() - screenCoordinate.getX();
                    double y13 = screenCoordinate2.getY() - screenCoordinate.getY();
                    if (x3 == 0.0d && y13 == 0.0d) {
                        return screenCoordinate;
                    }
                    double d16 = f13;
                    screenCoordinate2 = new ScreenCoordinate((x3 * d16) + screenCoordinate.getX(), (d16 * y13) + screenCoordinate.getY());
                }
                return screenCoordinate2;
            case 4:
                Point point3 = (Point) obj;
                Point point4 = (Point) obj2;
                double d17 = f13;
                double dLongitude2 = ((point4.longitude() - point3.longitude()) * d17) + point3.longitude();
                double dLatitude2 = ((point4.latitude() - point3.latitude()) * d17) + point3.latitude();
                if (!point3.hasAltitude() || !point4.hasAltitude()) {
                    return Point.fromLngLat(dLongitude2, dLatitude2);
                }
                return Point.fromLngLat(dLongitude2, dLatitude2, ((point4.altitude() - point3.altitude()) * d17) + point3.altitude());
            default:
                Double d18 = (Double) obj;
                return Double.valueOf(((((Double) obj2).doubleValue() - d18.doubleValue()) * ((double) f13)) + d18.doubleValue());
        }
    }
}
