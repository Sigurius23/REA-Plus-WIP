package mv;

import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraBounds;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapCenterAltitudeMode;
import com.mapbox.maps.ScreenCoordinate;
import java.util.List;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: mv.a */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC25962a {
    void cameraForCoordinates(List list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d3, ScreenCoordinate screenCoordinate, Function1 function1);

    CameraOptions cameraForDrag(ScreenCoordinate screenCoordinate, ScreenCoordinate screenCoordinate2);

    Point coordinateForPixel(ScreenCoordinate screenCoordinate);

    CameraBounds getBounds();

    CameraState getCameraState();

    MapCenterAltitudeMode getCenterAltitudeMode();

    ScreenCoordinate pixelForCoordinate(Point point);

    void setCamera(CameraOptions cameraOptions);

    void setCenterAltitudeMode(MapCenterAltitudeMode mapCenterAltitudeMode);
}
