package mv;

import com.mapbox.maps.CameraAnimationHint;
import com.mapbox.maps.MapOptions;
import com.mapbox.maps.Size;

/* JADX INFO: renamed from: mv.h */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC25969h {
    MapOptions getMapOptions();

    Size getSize();

    void setCameraAnimationHint(CameraAnimationHint cameraAnimationHint);

    void setGestureInProgress(boolean z4);

    void setUserAnimationInProgress(boolean z4);
}
