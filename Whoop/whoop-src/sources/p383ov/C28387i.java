package p383ov;

import android.view.MotionEvent;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.PlatformEventInfo;
import com.mapbox.maps.PlatformEventType;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.util.CoreGesturesHandler;
import java.util.Iterator;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p088dc.AbstractC11894a;
import p157fv.C14802h;
import p157fv.C14810p;
import p157fv.InterfaceC14795a;
import p186h8.C16999a;
import p382ou.InterfaceGestureDetectorOnGestureListenerC28367m;
import p406pv.C29573b;
import p715kotlin.jvm.internal.AbstractC22676k;
import qg3.C30352d;

/* JADX INFO: renamed from: ov.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C28387i implements InterfaceGestureDetectorOnGestureListenerC28367m {

    /* JADX INFO: renamed from: w */
    public final float f114500w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C28393o f114501x;

    public C28387i(C28393o c28393o, float f13) {
        this.f114501x = c28393o;
        this.f114500w = f13;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        C28393o c28393o = this.f114501x;
        if (actionMasked == 0) {
            c28393o.f114531T = AbstractC11894a.m31963l(motionEvent);
            C30352d c30352d = c28393o.f114516E;
            if (c30352d == null) {
                AbstractC22676k.m65757q("gestureState");
                throw null;
            }
            c30352d.m92810B(EnumC28379a.f114489w);
            c28393o.f114557t0 = true;
        }
        if (motionEvent.getActionMasked() != 1) {
            return false;
        }
        double dAbs = Math.abs(((double) motionEvent.getX()) - c28393o.f114531T.getX());
        double dAbs2 = Math.abs(((double) motionEvent.getY()) - c28393o.f114531T.getY());
        double d3 = this.f114500w;
        if (dAbs > d3 || dAbs2 > d3) {
            return false;
        }
        C29573b c29573b = c28393o.f114558u0;
        if (!c29573b.f120662G) {
            return false;
        }
        ScreenCoordinate screenCoordinate = c29573b.f120665J;
        if (screenCoordinate != null) {
            c28393o.f114531T = screenCoordinate;
        }
        c28393o.m86080l(true, c28393o.f114531T);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f13, float f14) {
        double dExp;
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        C28393o c28393o = this.f114501x;
        if (!c28393o.f114558u0.f120675y || c28393o.m86081m(AbstractC11894a.m31963l(motionEvent2))) {
            return false;
        }
        Iterator it = c28393o.f114526O.iterator();
        if (it.hasNext()) {
            throw AbstractC11266d.m30454h(it);
        }
        if (!c28393o.f114558u0.f120668M) {
            return false;
        }
        float f15 = c28393o.f114560x;
        double dHypot = Math.hypot(f13 / f15, f14 / f15);
        if (dHypot < 1000.0d) {
            return false;
        }
        MapboxMap mapboxMap = c28393o.f114520I;
        if (mapboxMap == null) {
            AbstractC22676k.m65757q("mapCameraManagerDelegate");
            throw null;
        }
        double pitch = mapboxMap.getCameraState().getPitch();
        if (pitch < 60.0d) {
            dExp = pitch / 10.0d;
        } else if (60.0d > pitch || pitch > 85.0d) {
            dExp = 0.0d;
        } else {
            double dLog = Math.log(6.0d);
            dExp = Math.exp((((pitch - 60.0d) * (Math.log(300.0d) - dLog)) / 25.0d) + dLog);
        }
        double d3 = (dExp / ((double) f15)) + 10.0d;
        C29573b c29573b = c28393o.f114558u0;
        AbstractC22676k.m65750j(c29573b, "<this>");
        double d14 = c29573b.f120661F == 2 ? 0.0d : ((double) f13) / d3;
        C29573b c29573b2 = c28393o.f114558u0;
        AbstractC22676k.m65750j(c29573b2, "<this>");
        double d15 = c29573b2.f120661F != 1 ? ((double) f14) / d3 : 0.0d;
        InterfaceC14795a interfaceC14795a = c28393o.f114522K;
        if (interfaceC14795a == null) {
            AbstractC22676k.m65757q("cameraAnimationsPlugin");
            throw null;
        }
        ((C14802h) interfaceC14795a).m42548b(AbstractC25265s.m74093D1(c28393o.f114523L));
        long j7 = (long) (dHypot / d3);
        ScreenCoordinate screenCoordinate = new ScreenCoordinate(c28393o.f114532U.getX(), c28393o.f114532U.getY() * 2.0d);
        InterfaceC14795a interfaceC14795a2 = c28393o.f114522K;
        if (interfaceC14795a2 == null) {
            AbstractC22676k.m65757q("cameraAnimationsPlugin");
            throw null;
        }
        MapboxMap mapboxMap2 = c28393o.f114520I;
        if (mapboxMap2 == null) {
            AbstractC22676k.m65757q("mapCameraManagerDelegate");
            throw null;
        }
        CameraOptions cameraOptionsCameraForDrag = mapboxMap2.cameraForDrag(screenCoordinate, new ScreenCoordinate(screenCoordinate.getX() + d14, screenCoordinate.getY() + d15));
        Long lValueOf = Long.valueOf(j7);
        C16999a interpolator = c28393o.f114554q0;
        AbstractC22676k.m65750j(interpolator, "interpolator");
        C14810p c14810p = new C14810p("Maps-Gestures", lValueOf, interpolator);
        CoreGesturesHandler coreGesturesHandler = c28393o.f114555r0;
        if (coreGesturesHandler != null) {
            ((C14802h) interfaceC14795a2).m42550h(cameraOptionsCameraForDrag, c14810p, coreGesturesHandler.getCoreGestureAnimatorHandler());
            return true;
        }
        AbstractC22676k.m65757q("coreGesturesHandler");
        throw null;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return;
        }
        this.f114501x.m86079k().dispatch(new PlatformEventInfo(PlatformEventType.LONG_CLICK, AbstractC11894a.m31963l(motionEvent)));
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f13, float f14) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        this.f114501x.m86079k().dispatch(new PlatformEventInfo(PlatformEventType.CLICK, AbstractC11894a.m31963l(motionEvent)));
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C28393o c28393o = this.f114501x;
        InterfaceC14795a interfaceC14795a = c28393o.f114522K;
        if (interfaceC14795a == null) {
            AbstractC22676k.m65757q("cameraAnimationsPlugin");
            throw null;
        }
        ((C14802h) interfaceC14795a).m42548b(AbstractC25265s.m74093D1(c28393o.f114523L));
        return true;
    }
}
