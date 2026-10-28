package p382ou;

import android.view.MotionEvent;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.util.CoreGesturesHandler;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p000.AbstractC11266d;
import p157fv.C14802h;
import p157fv.InterfaceC14795a;
import p383ov.C28386h;
import p383ov.C28393o;
import p383ov.EnumC28379a;
import p715kotlin.jvm.internal.AbstractC22676k;
import qg3.C30352d;

/* JADX INFO: renamed from: ou.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C28364j extends AbstractC28362h {

    /* JADX INFO: renamed from: y */
    public static final HashSet f114444y;

    /* JADX INFO: renamed from: v */
    public float f114445v;

    /* JADX INFO: renamed from: w */
    public float f114446w;

    /* JADX INFO: renamed from: x */
    public float f114447x;

    static {
        HashSet hashSet = new HashSet();
        f114444y = hashSet;
        hashSet.add(3);
    }

    @Override // p382ou.AbstractC28359e, p382ou.AbstractC28355a
    /* JADX INFO: renamed from: b */
    public final boolean mo86029b(int i13) {
        return Math.abs(this.f114447x) >= this.f114446w && super.mo86029b(3);
    }

    @Override // p382ou.AbstractC28359e
    /* JADX INFO: renamed from: c */
    public final boolean mo86030c() {
        MotionEvent motionEvent = this.f114404e;
        ArrayList arrayList = this.f114425l;
        float y13 = motionEvent.getY(motionEvent.findPointerIndex(((Integer) arrayList.get(0)).intValue()));
        MotionEvent motionEvent2 = this.f114404e;
        float y14 = (motionEvent2.getY(motionEvent2.findPointerIndex(((Integer) arrayList.get(1)).intValue())) + y13) / 2.0f;
        MotionEvent motionEvent3 = this.f114403d;
        float y15 = motionEvent3.getY(motionEvent3.findPointerIndex(((Integer) arrayList.get(0)).intValue()));
        MotionEvent motionEvent4 = this.f114403d;
        float y16 = ((motionEvent4.getY(motionEvent4.findPointerIndex(((Integer) arrayList.get(1)).intValue())) + y15) / 2.0f) - y14;
        this.f114447x += y16;
        if (!this.f114435q || y16 == 0.0f) {
            if (mo86029b(3)) {
                C28386h c28386h = (C28386h) this.f114407h;
                c28386h.getClass();
                C28393o c28393o = c28386h.f114499a;
                if (c28393o.f114558u0.f120660E) {
                    c28393o.m86076h();
                    C30352d c30352d = c28393o.f114516E;
                    if (c30352d == null) {
                        AbstractC22676k.m65757q("gestureState");
                        throw null;
                    }
                    c30352d.m92810B(EnumC28379a.f114492z);
                    Iterator it = c28393o.f114530S.iterator();
                    if (it.hasNext()) {
                        throw AbstractC11266d.m30454h(it);
                    }
                    m86037h();
                    return true;
                }
            }
            return false;
        }
        C28386h c28386h2 = (C28386h) this.f114407h;
        c28386h2.getClass();
        C28393o c28393o2 = c28386h2.f114499a;
        MapboxMap mapboxMap = c28393o2.f114520I;
        if (mapboxMap == null) {
            AbstractC22676k.m65757q("mapCameraManagerDelegate");
            throw null;
        }
        double pitch = mapboxMap.getCameraState().getPitch() - ((double) (y16 * 0.1f));
        if (85.0d <= pitch) {
            pitch = 85.0d;
        }
        if (0.0d >= pitch) {
            pitch = 0.0d;
        }
        if (c28393o2.f114535X || c28393o2.f114534W) {
            MapboxMap mapboxMap2 = c28393o2.f114520I;
            if (mapboxMap2 == null) {
                AbstractC22676k.m65757q("mapCameraManagerDelegate");
                throw null;
            }
            Point center = mapboxMap2.getCameraState().getCenter();
            AbstractC22676k.m65749i(center, "mapCameraManagerDelegate.cameraState.center");
            c28393o2.f114533V = mapboxMap2.pixelForCoordinate(center);
            c28393o2.f114535X = false;
            c28393o2.f114534W = false;
        }
        CoreGesturesHandler coreGesturesHandler = c28393o2.f114555r0;
        if (coreGesturesHandler == null) {
            AbstractC22676k.m65757q("coreGesturesHandler");
            throw null;
        }
        coreGesturesHandler.notifyCoreGestureStarted();
        InterfaceC14795a interfaceC14795a = c28393o2.f114522K;
        if (interfaceC14795a == null) {
            AbstractC22676k.m65757q("cameraAnimationsPlugin");
            throw null;
        }
        CameraOptions cameraOptionsBuild = new CameraOptions.Builder().anchor(c28393o2.f114533V).pitch(Double.valueOf(pitch)).build();
        AbstractC22676k.m65749i(cameraOptionsBuild, "Builder().anchor(cameraC…ate).pitch(pitch).build()");
        ((C14802h) interfaceC14795a).m42550h(cameraOptionsBuild, C28393o.f114515v0, null);
        Iterator it3 = c28393o2.f114530S.iterator();
        if (it3.hasNext()) {
            throw AbstractC11266d.m30454h(it3);
        }
        return true;
    }

    @Override // p382ou.AbstractC28359e
    /* JADX INFO: renamed from: e */
    public final boolean mo86035e() {
        if (!super.mo86035e()) {
            ArrayList arrayList = this.f114425l;
            C28358d c28358d = (C28358d) this.f114426m.get(new C28361g((Integer) arrayList.get(0), (Integer) arrayList.get(1)));
            double degrees = Math.toDegrees(Math.abs(Math.atan2(c28358d.f114420d, c28358d.f114419c)));
            double d3 = this.f114445v;
            if (degrees <= d3 || 180.0d - degrees <= d3) {
                return false;
            }
        }
        return true;
    }

    @Override // p382ou.AbstractC28359e
    /* JADX INFO: renamed from: g */
    public final void mo86032g() {
        this.f114447x = 0.0f;
    }

    @Override // p382ou.AbstractC28362h
    /* JADX INFO: renamed from: i */
    public final void mo86033i() {
        super.mo86033i();
        C28386h c28386h = (C28386h) this.f114407h;
        c28386h.getClass();
        C28393o c28393o = c28386h.f114499a;
        C30352d c30352d = c28393o.f114516E;
        if (c30352d == null) {
            AbstractC22676k.m65757q("gestureState");
            throw null;
        }
        c30352d.m92809A(EnumC28379a.f114492z);
        Iterator it = c28393o.f114530S.iterator();
        if (it.hasNext()) {
            throw AbstractC11266d.m30454h(it);
        }
    }

    @Override // p382ou.AbstractC28362h
    /* JADX INFO: renamed from: j */
    public final HashSet mo86034j() {
        return f114444y;
    }
}
