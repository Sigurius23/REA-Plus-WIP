package p382ou;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.util.CoreGesturesHandler;
import io.sentry.android.replay.video.C20245d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p157fv.C14802h;
import p157fv.C14803i;
import p157fv.InterfaceC14795a;
import p176gv.C16215a;
import p176gv.C16219e;
import p186h8.C16999a;
import p383ov.C28384f;
import p383ov.C28389k;
import p383ov.C28390l;
import p383ov.C28391m;
import p383ov.C28393o;
import p558vp.AbstractC36259c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ou.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C28363i extends AbstractC28362h {

    /* JADX INFO: renamed from: y */
    public static final HashSet f114440y;

    /* JADX INFO: renamed from: v */
    public float f114441v;

    /* JADX INFO: renamed from: w */
    public float f114442w;

    /* JADX INFO: renamed from: x */
    public float f114443x;

    static {
        HashSet hashSet = new HashSet();
        f114440y = hashSet;
        hashSet.add(2);
    }

    @Override // p382ou.AbstractC28359e, p382ou.AbstractC28355a
    /* JADX INFO: renamed from: b */
    public final boolean mo86029b(int i13) {
        return Math.abs(this.f114442w) >= this.f114441v && super.mo86029b(2);
    }

    @Override // p382ou.AbstractC28359e
    /* JADX INFO: renamed from: c */
    public final boolean mo86030c() {
        ArrayList arrayList = this.f114425l;
        C28358d c28358d = (C28358d) this.f114426m.get(new C28361g((Integer) arrayList.get(0), (Integer) arrayList.get(1)));
        float degrees = (float) Math.toDegrees(Math.atan2(c28358d.f114418b, c28358d.f114417a) - Math.atan2(c28358d.f114420d, c28358d.f114419c));
        this.f114443x = degrees;
        this.f114442w += degrees;
        if (!this.f114435q || degrees == 0.0f) {
            if (mo86029b(2)) {
                C28384f c28384f = (C28384f) this.f114407h;
                c28384f.getClass();
                C28393o c28393o = c28384f.f114497a;
                if (c28393o.f114558u0.f120673w) {
                    float fAbs = Math.abs(this.f114443x);
                    double eventTime = this.f114403d.getEventTime();
                    double eventTime2 = this.f114404e.getEventTime();
                    if (eventTime != eventTime2) {
                        double d3 = ((double) fAbs) / (eventTime - eventTime2);
                        float fAbs2 = Math.abs(this.f114442w);
                        if (d3 >= 0.04d && ((d3 <= 0.07d || fAbs2 >= 5.0f) && ((d3 <= 0.15d || fAbs2 >= 7.0f) && (d3 <= 0.5d || fAbs2 >= 15.0f)))) {
                            C20245d c20245d = c28393o.f114561y;
                            if (c20245d == null) {
                                AbstractC22676k.m65757q("gesturesManager");
                                throw null;
                            }
                            C28369o c28369o = (C28369o) c20245d.f76048d;
                            boolean z4 = c28369o.f114435q;
                            if (!z4 || fAbs2 >= 16.0f) {
                                if (c28393o.f114558u0.f120670O) {
                                    c28369o.f114459E = c28393o.f114545h0;
                                    if (z4) {
                                        c28369o.f114436r = true;
                                    }
                                }
                                c28393o.m86076h();
                                Iterator it = c28393o.f114528Q.iterator();
                                if (it.hasNext()) {
                                    throw AbstractC11266d.m30454h(it);
                                }
                                m86037h();
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        C28384f c28384f2 = (C28384f) this.f114407h;
        c28384f2.getClass();
        C28393o c28393o2 = c28384f2.f114497a;
        MapboxMap mapboxMap = c28393o2.f114520I;
        if (mapboxMap == null) {
            AbstractC22676k.m65757q("mapCameraManagerDelegate");
            throw null;
        }
        double bearing = mapboxMap.getCameraState().getBearing();
        InterfaceC14795a interfaceC14795a = c28393o2.f114522K;
        if (interfaceC14795a == null) {
            AbstractC22676k.m65757q("cameraAnimationsPlugin");
            throw null;
        }
        c28393o2.f114550m0 = ((C14802h) interfaceC14795a).m42551i();
        double d14 = bearing + ((double) degrees);
        ScreenCoordinate screenCoordinate = c28393o2.f114558u0.f120665J;
        if (screenCoordinate == null) {
            PointF pointF = this.f114427n;
            screenCoordinate = new ScreenCoordinate(pointF.x, pointF.y);
        }
        CoreGesturesHandler coreGesturesHandler = c28393o2.f114555r0;
        if (coreGesturesHandler == null) {
            AbstractC22676k.m65757q("coreGesturesHandler");
            throw null;
        }
        coreGesturesHandler.notifyCoreGestureStarted();
        if (c28393o2.f114558u0.f120676z) {
            InterfaceC14795a interfaceC14795a2 = c28393o2.f114522K;
            if (interfaceC14795a2 == null) {
                AbstractC22676k.m65757q("cameraAnimationsPlugin");
                throw null;
            }
            Object[] targets = Arrays.copyOf(new Double[]{Double.valueOf(d14)}, 1);
            AbstractC22676k.m65750j(targets, "targets");
            C16219e c16219eM115666A = AbstractC36259c.m115666A(interfaceC14795a2, new C14803i(Arrays.copyOf(targets, targets.length), null, "Maps-Gestures"), C28391m.f114510y);
            if (c28393o2.f114522K == null) {
                AbstractC22676k.m65757q("cameraAnimationsPlugin");
                throw null;
            }
            Object[] targets2 = Arrays.copyOf(new ScreenCoordinate[]{screenCoordinate}, 1);
            AbstractC22676k.m65750j(targets2, "targets");
            C16215a c16215a = new C16215a(new C14803i(Arrays.copyOf(targets2, targets2.length), null, "Maps-Gestures"), C28391m.f114509x);
            InterfaceC14795a interfaceC14795a3 = c28393o2.f114522K;
            if (interfaceC14795a3 == null) {
                AbstractC22676k.m65757q("cameraAnimationsPlugin");
                throw null;
            }
            ((C14802h) interfaceC14795a3).m42552j(c16215a, c16219eM115666A);
        } else {
            InterfaceC14795a interfaceC14795a4 = c28393o2.f114522K;
            if (interfaceC14795a4 == null) {
                AbstractC22676k.m65757q("cameraAnimationsPlugin");
                throw null;
            }
            CameraOptions cameraOptionsBuild = new CameraOptions.Builder().anchor(screenCoordinate).bearing(Double.valueOf(d14)).build();
            AbstractC22676k.m65749i(cameraOptionsBuild, "Builder()\n          .anc…aring)\n          .build()");
            ((C14802h) interfaceC14795a4).m42550h(cameraOptionsBuild, C28393o.f114515v0, null);
        }
        InterfaceC14795a interfaceC14795a5 = c28393o2.f114522K;
        if (interfaceC14795a5 == null) {
            AbstractC22676k.m65757q("cameraAnimationsPlugin");
            throw null;
        }
        ((C14802h) interfaceC14795a5).m42553k(c28393o2.f114550m0);
        Iterator it3 = c28393o2.f114528Q.iterator();
        if (it3.hasNext()) {
            throw AbstractC11266d.m30454h(it3);
        }
        return true;
    }

    @Override // p382ou.AbstractC28359e
    /* JADX INFO: renamed from: g */
    public final void mo86032g() {
        this.f114442w = 0.0f;
    }

    @Override // p382ou.AbstractC28362h
    /* JADX INFO: renamed from: i */
    public final void mo86033i() {
        super.mo86033i();
        if (this.f114443x == 0.0f) {
            this.f114438t = 0.0f;
            this.f114439u = 0.0f;
        }
        float f13 = this.f114438t;
        float f14 = this.f114439u;
        PointF pointF = this.f114427n;
        float f15 = pointF.x;
        float fAbs = Math.abs((float) (((double) ((pointF.y * f13) + (f14 * f15))) / (Math.pow(this.f114427n.y, 2.0d) + Math.pow(f15, 2.0d))));
        if (this.f114443x < 0.0f) {
            fAbs = -fAbs;
        }
        C28384f c28384f = (C28384f) this.f114407h;
        float f16 = this.f114438t;
        float f17 = this.f114439u;
        c28384f.getClass();
        C28393o c28393o = c28384f.f114497a;
        if (c28393o.f114558u0.f120670O) {
            C20245d c20245d = c28393o.f114561y;
            if (c20245d == null) {
                AbstractC22676k.m65757q("gesturesManager");
                throw null;
            }
            ((C28369o) c20245d.f76048d).f114459E = c28393o.f114549l0;
        }
        Iterator it = c28393o.f114528Q.iterator();
        if (it.hasNext()) {
            throw AbstractC11266d.m30454h(it);
        }
        float f18 = fAbs * c28393o.f114546i0;
        if (30.0f <= f18) {
            f18 = 30.0f;
        }
        if (-30.0f >= f18) {
            f18 = -30.0f;
        }
        double dAbs = Math.abs(this.f114443x) / (Math.abs(f17) + Math.abs(f16));
        if (!c28393o.f114558u0.f120667L || Math.abs(f18) < c28393o.f114547j0) {
            return;
        }
        C20245d c20245d2 = c28393o.f114561y;
        if (c20245d2 == null) {
            AbstractC22676k.m65757q("gesturesManager");
            throw null;
        }
        if (!((C28369o) c20245d2.f76048d).f114435q || dAbs >= c28393o.f114548k0) {
            long jLog = (long) ((Math.log((((double) 1) / Math.pow(2.718281828459045d, 2.0d)) + ((double) Math.abs(f18))) + ((double) 2)) * 150.0d);
            ScreenCoordinate screenCoordinate = c28393o.f114558u0.f120665J;
            if (screenCoordinate == null) {
                PointF pointF2 = this.f114427n;
                screenCoordinate = new ScreenCoordinate(pointF2.x, pointF2.y);
            }
            C16999a c16999a = c28393o.f114554q0;
            long j7 = (jLog / ((long) 16)) + 1;
            if (1 <= j7) {
                long j13 = 1;
                float fM8288a = f18;
                while (true) {
                    fM8288a = AbstractC2875y.m8288a(1, c16999a.getInterpolation(j13 / j7), f18, fM8288a);
                    if (j13 == j7) {
                        break;
                    } else {
                        j13++;
                    }
                }
                f18 = fM8288a;
            }
            MapboxMap mapboxMap = c28393o.f114520I;
            if (mapboxMap == null) {
                AbstractC22676k.m65757q("mapCameraManagerDelegate");
                throw null;
            }
            double bearing = mapboxMap.getCameraState().getBearing();
            double d3 = ((double) f18) + bearing;
            InterfaceC14795a interfaceC14795a = c28393o.f114522K;
            if (interfaceC14795a == null) {
                AbstractC22676k.m65757q("cameraAnimationsPlugin");
                throw null;
            }
            Object[] targets = Arrays.copyOf(new Double[]{Double.valueOf(d3)}, 1);
            AbstractC22676k.m65750j(targets, "targets");
            C16219e c16219eM115666A = AbstractC36259c.m115666A(interfaceC14795a, new C14803i(Arrays.copyOf(targets, targets.length), Double.valueOf(bearing), "Maps-Gestures"), new C28390l(c16999a, jLog, 1));
            CoreGesturesHandler coreGesturesHandler = c28393o.f114555r0;
            if (coreGesturesHandler == null) {
                AbstractC22676k.m65757q("coreGesturesHandler");
                throw null;
            }
            c16219eM115666A.addListener(coreGesturesHandler.getCoreGestureAnimatorHandler());
            ScreenCoordinate screenCoordinate2 = new ScreenCoordinate(screenCoordinate.getX(), screenCoordinate.getY());
            if (c28393o.f114522K == null) {
                AbstractC22676k.m65757q("cameraAnimationsPlugin");
                throw null;
            }
            Object[] targets2 = Arrays.copyOf(new ScreenCoordinate[]{screenCoordinate2}, 1);
            AbstractC22676k.m65750j(targets2, "targets");
            C16215a c16215a = new C16215a(new C14803i(Arrays.copyOf(targets2, targets2.length), screenCoordinate2, "Maps-Gestures"), new C28390l(c16999a, jLog, 0));
            c16215a.addListener(new C28389k(c28393o, 0));
            ValueAnimator[] valueAnimatorArr = {c16219eM115666A, c16215a};
            c28393o.f114552o0 = valueAnimatorArr;
            c28393o.m86082n(valueAnimatorArr);
        }
    }

    @Override // p382ou.AbstractC28362h
    /* JADX INFO: renamed from: j */
    public final HashSet mo86034j() {
        return f114440y;
    }
}
