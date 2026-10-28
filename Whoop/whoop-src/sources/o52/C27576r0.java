package o52;

import com.mapbox.common.location.Location;
import com.mapbox.common.location.LocationObserver;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.MapboxMap;
import java.lang.ref.WeakReference;
import java.util.List;
import m83.AbstractC25265s;
import p026b2.C2320z;
import p031b9.AbstractC2875y;
import p157fv.C14810p;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: o52.r0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lo52/r0;", "Lcom/mapbox/common/location/LocationObserver;", "Lo52/d;", "activity", "<init>", "(Lo52/d;)V", "", "Lcom/mapbox/common/location/Location;", "locations", "Ll83/a0;", "onLocationUpdateReceived", "(Ljava/util/List;)V", "Ljava/lang/ref/WeakReference;", "a", "Ljava/lang/ref/WeakReference;", "activityWeakReference", "Ltr2/n;", "b", "Ltr2/n;", "getLogger", "()Ltr2/n;", "logger", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27576r0 implements LocationObserver {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private WeakReference<InterfaceC27547d> activityWeakReference;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C27576r0(InterfaceC27547d activity) {
        AbstractC22676k.m65750j(activity, "activity");
        this.activityWeakReference = new WeakReference<>(activity);
        this.logger = InterfaceC34116n.INSTANCE.m107848a("StartActivityLocationCallback");
    }

    @Override // com.mapbox.common.location.LocationObserver
    public void onLocationUpdateReceived(List<Location> locations) {
        AbstractC22676k.m65750j(locations, "locations");
        InterfaceC27547d interfaceC27547d = this.activityWeakReference.get();
        Location location = (Location) AbstractC25265s.m74114R0(locations);
        if (location != null) {
            InterfaceC34116n interfaceC34116n = this.logger;
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            StringBuilder sbM8306s = AbstractC2875y.m8306s("Location was fetched - Latitude: ", latitude, " , Longitude: ");
            sbM8306s.append(longitude);
            interfaceC34116n.mo85216g(sbM8306s.toString(), new AbstractC30556a.a[0]);
            if (interfaceC27547d != null) {
                try {
                    MapboxMap mapboxMap = interfaceC27547d.getMapboxMap();
                    if (mapboxMap != null) {
                        CameraOptions cameraOptionsBuild = new CameraOptions.Builder().zoom(Double.valueOf(14.0d)).center(Point.fromLngLat(location.getLongitude(), location.getLatitude())).build();
                        AbstractC22676k.m65749i(cameraOptionsBuild, "build(...)");
                        mapboxMap.cameraAnimationsPlugin(new C2320z(12, cameraOptionsBuild, new C14810p(null, 1000L, null)));
                    }
                } catch (Exception unused) {
                }
            }
            if (interfaceC27547d != null) {
                interfaceC27547d.mo23998c();
            }
        }
    }
}
