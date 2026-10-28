package p382ou;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import c23.C3908n;
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
import p157fv.C14802h;
import p157fv.C14803i;
import p157fv.C14810p;
import p157fv.InterfaceC14795a;
import p176gv.C16215a;
import p176gv.C16223i;
import p383ov.C28385g;
import p383ov.C28391m;
import p383ov.C28393o;
import p383ov.EnumC28379a;
import p406pv.C29573b;
import p715kotlin.jvm.internal.AbstractC22676k;
import qg3.C30352d;

/* JADX INFO: renamed from: ou.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C28369o extends AbstractC28362h {

    /* JADX INFO: renamed from: H */
    public static final HashSet f114454H;

    /* JADX INFO: renamed from: A */
    public float f114455A;

    /* JADX INFO: renamed from: B */
    public float f114456B;

    /* JADX INFO: renamed from: C */
    public float f114457C;

    /* JADX INFO: renamed from: D */
    public float f114458D;

    /* JADX INFO: renamed from: E */
    public float f114459E;

    /* JADX INFO: renamed from: F */
    public boolean f114460F;

    /* JADX INFO: renamed from: G */
    public float f114461G;

    /* JADX INFO: renamed from: v */
    public final GestureDetector f114462v;

    /* JADX INFO: renamed from: w */
    public boolean f114463w;

    /* JADX INFO: renamed from: x */
    public PointF f114464x;

    /* JADX INFO: renamed from: y */
    public float f114465y;

    /* JADX INFO: renamed from: z */
    public float f114466z;

    static {
        HashSet hashSet = new HashSet();
        f114454H = hashSet;
        hashSet.add(1);
        hashSet.add(15);
    }

    public C28369o(Context context, C20245d c20245d) {
        super(context, c20245d);
        this.f114462v = new GestureDetector(context, new C3908n(this, 1));
    }

    @Override // p382ou.AbstractC28362h, p382ou.AbstractC28359e, p382ou.AbstractC28355a
    /* JADX INFO: renamed from: a */
    public final boolean mo86028a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f114463w) {
            if (actionMasked == 5 || actionMasked == 3) {
                boolean z4 = this.f114435q;
                if (!z4) {
                    this.f114463w = false;
                } else if (z4) {
                    this.f114436r = true;
                }
            } else if (!this.f114435q && actionMasked == 1) {
                this.f114463w = false;
            }
        }
        return this.f114462v.onTouchEvent(motionEvent) | super.mo86028a(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:175:0x0379  */
    /* JADX WARN: Code duplicated, block: B:177:0x0392  */
    /* JADX WARN: Code duplicated, block: B:178:0x039f  */
    /* JADX WARN: Code duplicated, block: B:180:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cc  */
    @Override // p382ou.AbstractC28359e
    /* JADX INFO: renamed from: c */
    public final boolean mo86030c() {
        float f13;
        MapboxMap mapboxMap;
        Iterator it;
        boolean z4 = this.f114435q;
        ArrayList arrayList = this.f114425l;
        boolean z13 = false;
        if (z4 && this.f114463w && arrayList.size() > 1) {
            mo86033i();
            return false;
        }
        PointF pointF = this.f114463w ? this.f114464x : this.f114427n;
        this.f114455A = 0.0f;
        this.f114456B = 0.0f;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            this.f114455A = Math.abs(this.f114403d.getX(i13) - pointF.x) + this.f114455A;
            this.f114456B = Math.abs(this.f114403d.getY(i13) - pointF.y) + this.f114456B;
        }
        float f14 = this.f114455A * 2.0f;
        this.f114455A = f14;
        float f15 = this.f114456B * 2.0f;
        this.f114456B = f15;
        if (this.f114463w) {
            this.f114466z = f15;
        } else {
            this.f114466z = (float) Math.hypot(f14, f15);
        }
        if (this.f114465y == 0.0f) {
            this.f114465y = this.f114466z;
        }
        this.f114458D = Math.abs(this.f114465y - this.f114466z);
        if (this.f114463w) {
            boolean z14 = (this.f114403d.getY() < this.f114464x.y && this.f114466z < this.f114457C) || (this.f114403d.getY() > this.f114464x.y && this.f114466z > this.f114457C);
            float fAbs = Math.abs(1.0f - (this.f114466z / this.f114457C)) * 0.5f;
            if (this.f114457C <= 0.0f) {
                f13 = 1.0f;
            } else {
                f13 = z14 ? fAbs + 1.0f : 1.0f - fAbs;
            }
        } else {
            float f16 = this.f114457C;
            if (f16 > 0.0f) {
                f13 = this.f114466z / f16;
            } else {
                f13 = 1.0f;
            }
        }
        this.f114461G = f13;
        this.f114460F = f13 < 1.0f;
        if (this.f114435q && this.f114466z > 0.0f) {
            C28385g c28385g = (C28385g) this.f114407h;
            c28385g.getClass();
            C28393o c28393o = c28385g.f114498a;
            ScreenCoordinate screenCoordinate = c28393o.f114558u0.f120665J;
            if (screenCoordinate == null) {
                if (c28393o.f114540c0) {
                    screenCoordinate = c28393o.f114531T;
                } else {
                    PointF pointF2 = this.f114427n;
                    screenCoordinate = new ScreenCoordinate(pointF2.x, pointF2.y);
                }
            }
            InterfaceC14795a interfaceC14795a = c28393o.f114522K;
            if (interfaceC14795a == null) {
                AbstractC22676k.m65757q("cameraAnimationsPlugin");
                throw null;
            }
            c28393o.f114544g0 = ((C14802h) interfaceC14795a).m42551i();
            CoreGesturesHandler coreGesturesHandler = c28393o.f114555r0;
            if (coreGesturesHandler == null) {
                AbstractC22676k.m65757q("coreGesturesHandler");
                throw null;
            }
            coreGesturesHandler.notifyCoreGestureStarted();
            boolean z15 = c28393o.f114540c0;
            C14810p c14810p = C28393o.f114515v0;
            if (z15) {
                double dAbs = Math.abs(((double) this.f114403d.getY()) - c28393o.f114531T.getY());
                z13 = ((double) this.f114403d.getY()) < c28393o.f114531T.getY();
                double d3 = (((dAbs - 0.0d) / (c28393o.f114542e0 - 0.0d)) * 4.0d) + 0.0d;
                double d14 = c28393o.f114543f0;
                double d15 = (z13 ? d14 - d3 : d14 + d3) * ((double) c28393o.f114558u0.f120671P);
                InterfaceC14795a interfaceC14795a2 = c28393o.f114522K;
                if (interfaceC14795a2 == null) {
                    AbstractC22676k.m65757q("cameraAnimationsPlugin");
                    throw null;
                }
                CameraOptions cameraOptionsBuild = new CameraOptions.Builder().zoom(Double.valueOf(d15)).anchor(screenCoordinate).build();
                AbstractC22676k.m65749i(cameraOptionsBuild, "Builder()\n          .zoo…Point)\n          .build()");
                ((C14802h) interfaceC14795a2).m42550h(cameraOptionsBuild, c14810p, null);
            } else {
                double dLog = (Math.log(this.f114461G) / Math.log(1.5707963267948966d)) * 0.6499999761581421d;
                C29573b c29573b = c28393o.f114558u0;
                double d16 = dLog * ((double) c29573b.f120671P);
                if (!c29573b.f120676z) {
                    InterfaceC14795a interfaceC14795a3 = c28393o.f114522K;
                    if (interfaceC14795a3 == null) {
                        AbstractC22676k.m65757q("cameraAnimationsPlugin");
                        throw null;
                    }
                    CameraOptions.Builder builder = new CameraOptions.Builder();
                    MapboxMap mapboxMap2 = c28393o.f114520I;
                    if (mapboxMap2 == null) {
                        AbstractC22676k.m65757q("mapCameraManagerDelegate");
                        throw null;
                    }
                    CameraOptions cameraOptionsBuild2 = builder.zoom(Double.valueOf(mapboxMap2.getCameraState().getZoom() + d16)).anchor(screenCoordinate).build();
                    AbstractC22676k.m65749i(cameraOptionsBuild2, "Builder()\n            .z…int)\n            .build()");
                    ((C14802h) interfaceC14795a3).m42550h(cameraOptionsBuild2, c14810p, null);
                } else {
                    if (c28393o.f114522K == null) {
                        AbstractC22676k.m65757q("cameraAnimationsPlugin");
                        throw null;
                    }
                    MapboxMap mapboxMap3 = c28393o.f114520I;
                    if (mapboxMap3 == null) {
                        AbstractC22676k.m65757q("mapCameraManagerDelegate");
                        throw null;
                    }
                    Object[] targets = Arrays.copyOf(new Double[]{Double.valueOf(mapboxMap3.getCameraState().getZoom() + d16)}, 1);
                    AbstractC22676k.m65750j(targets, "targets");
                    MapboxMap mapboxMap4 = c28393o.f114520I;
                    if (mapboxMap4 == null) {
                        AbstractC22676k.m65757q("mapCameraManagerDelegate");
                        throw null;
                    }
                    C16223i c16223i = new C16223i(new C14803i(Arrays.copyOf(targets, targets.length), Double.valueOf(mapboxMap4.getCameraState().getZoom()), "Maps-Gestures"), C28391m.f114508E);
                    if (c28393o.f114522K == null) {
                        AbstractC22676k.m65757q("cameraAnimationsPlugin");
                        throw null;
                    }
                    Object[] targets2 = Arrays.copyOf(new ScreenCoordinate[]{screenCoordinate}, 1);
                    AbstractC22676k.m65750j(targets2, "targets");
                    C16215a c16215a = new C16215a(new C14803i(Arrays.copyOf(targets2, targets2.length), null, "Maps-Gestures"), C28391m.f114511z);
                    InterfaceC14795a interfaceC14795a4 = c28393o.f114522K;
                    if (interfaceC14795a4 == null) {
                        AbstractC22676k.m65757q("cameraAnimationsPlugin");
                        throw null;
                    }
                    ((C14802h) interfaceC14795a4).m42552j(c16215a, c16223i);
                }
            }
            InterfaceC14795a interfaceC14795a5 = c28393o.f114522K;
            if (interfaceC14795a5 == null) {
                AbstractC22676k.m65757q("cameraAnimationsPlugin");
                throw null;
            }
            ((C14802h) interfaceC14795a5).m42553k(c28393o.f114544g0);
            Iterator it3 = c28393o.f114529R.iterator();
            if (it3.hasNext()) {
                throw AbstractC11266d.m30454h(it3);
            }
            c28393o.f114541d0 = Math.abs(this.f114466z - this.f114457C);
            z13 = true;
        } else if (mo86029b(this.f114463w ? 15 : 1) && this.f114458D >= this.f114459E) {
            C28385g c28385g2 = (C28385g) this.f114407h;
            c28385g2.getClass();
            C28393o c28393o2 = c28385g2.f114498a;
            boolean z16 = arrayList.size() == 1;
            c28393o2.f114540c0 = z16;
            if (z16) {
                if (c28393o2.f114558u0.f120664I) {
                    C30352d c30352d = c28393o2.f114516E;
                    if (c30352d == null) {
                        AbstractC22676k.m65757q("gestureState");
                        throw null;
                    }
                    c30352d.m92810B(EnumC28379a.f114491y);
                    c28393o2.f114542e0 = Resources.getSystem().getDisplayMetrics().heightPixels;
                    mapboxMap = c28393o2.f114520I;
                    if (mapboxMap == null) {
                        AbstractC22676k.m65757q("mapCameraManagerDelegate");
                        throw null;
                    }
                    c28393o2.f114543f0 = mapboxMap.getCameraState().getZoom();
                    c28393o2.m86076h();
                    it = c28393o2.f114529R.iterator();
                    if (it.hasNext()) {
                        throw AbstractC11266d.m30454h(it);
                    }
                    c28393o2.f114541d0 = Math.abs(this.f114466z - this.f114457C);
                    z13 = true;
                }
            } else if (c28393o2.f114558u0.f120674x) {
                float f17 = this.f114457C;
                if (f17 > 0.0f) {
                    float f18 = this.f114466z;
                    double eventTime = this.f114403d.getEventTime();
                    double eventTime2 = this.f114404e.getEventTime();
                    if (eventTime != eventTime2) {
                        double dAbs2 = ((double) Math.abs(f18 - f17)) / (eventTime - eventTime2);
                        if (dAbs2 >= c28393o2.f114536Y) {
                            C20245d c20245d = c28393o2.f114561y;
                            if (c20245d == null) {
                                AbstractC22676k.m65757q("gesturesManager");
                                throw null;
                            }
                            C28363i c28363i = (C28363i) c20245d.f76049e;
                            if (c28363i.f114435q) {
                                c28393o2.f114542e0 = Resources.getSystem().getDisplayMetrics().heightPixels;
                                mapboxMap = c28393o2.f114520I;
                                if (mapboxMap == null) {
                                    AbstractC22676k.m65757q("mapCameraManagerDelegate");
                                    throw null;
                                }
                                c28393o2.f114543f0 = mapboxMap.getCameraState().getZoom();
                                c28393o2.m86076h();
                                it = c28393o2.f114529R.iterator();
                                if (it.hasNext()) {
                                    throw AbstractC11266d.m30454h(it);
                                }
                                c28393o2.f114541d0 = Math.abs(this.f114466z - this.f114457C);
                                z13 = true;
                            } else if (Math.abs(c28363i.f114443x) <= 0.4d || dAbs2 >= c28393o2.f114537Z) {
                                if (!c28393o2.f114558u0.f120676z) {
                                    C30352d c30352d2 = c28393o2.f114516E;
                                    if (c30352d2 == null) {
                                        AbstractC22676k.m65757q("gestureState");
                                        throw null;
                                    }
                                    c30352d2.m92810B(EnumC28379a.f114490x);
                                }
                                c28393o2.f114542e0 = Resources.getSystem().getDisplayMetrics().heightPixels;
                                mapboxMap = c28393o2.f114520I;
                                if (mapboxMap == null) {
                                    AbstractC22676k.m65757q("mapCameraManagerDelegate");
                                    throw null;
                                }
                                c28393o2.f114543f0 = mapboxMap.getCameraState().getZoom();
                                c28393o2.m86076h();
                                it = c28393o2.f114529R.iterator();
                                if (it.hasNext()) {
                                    throw AbstractC11266d.m30454h(it);
                                }
                                c28393o2.f114541d0 = Math.abs(this.f114466z - this.f114457C);
                                z13 = true;
                            }
                        }
                    }
                }
            }
            if (z13) {
                m86037h();
            }
        }
        this.f114457C = this.f114466z;
        return z13;
    }

    @Override // p382ou.AbstractC28359e
    /* JADX INFO: renamed from: d */
    public final int mo86031d() {
        return (!this.f114435q || this.f114463w) ? 1 : 2;
    }

    @Override // p382ou.AbstractC28359e
    /* JADX INFO: renamed from: e */
    public final boolean mo86035e() {
        if (super.mo86035e()) {
            return true;
        }
        return !this.f114463w && this.f114425l.size() < 2;
    }

    @Override // p382ou.AbstractC28359e
    /* JADX INFO: renamed from: g */
    public final void mo86032g() {
        this.f114465y = 0.0f;
        this.f114458D = 0.0f;
        this.f114466z = 0.0f;
        this.f114457C = 0.0f;
        this.f114461G = 1.0f;
    }

    @Override // p382ou.AbstractC28362h
    /* JADX INFO: renamed from: i */
    public final void mo86033i() {
        ScreenCoordinate screenCoordinate;
        super.mo86033i();
        C28385g c28385g = (C28385g) this.f114407h;
        float f13 = this.f114438t;
        float f14 = this.f114439u;
        c28385g.getClass();
        C28393o c28393o = c28385g.f114498a;
        C30352d c30352d = c28393o.f114516E;
        if (c30352d == null) {
            AbstractC22676k.m65757q("gestureState");
            throw null;
        }
        c30352d.m92809A(c28393o.f114540c0 ? EnumC28379a.f114491y : EnumC28379a.f114490x);
        Iterator it = c28393o.f114529R.iterator();
        if (it.hasNext()) {
            throw AbstractC11266d.m30454h(it);
        }
        float fAbs = Math.abs(f14) + Math.abs(f13);
        if (c28393o.f114558u0.f120666K && fAbs >= c28393o.f114538a0 && c28393o.f114541d0 / fAbs >= c28393o.f114539b0) {
            boolean z4 = this.f114460F;
            double d3 = ((double) fAbs) * 2.5d * 1.0E-4d;
            double d14 = 2.5d > d3 ? d3 : 2.5d;
            if (0.0d >= d14) {
                d14 = 0.0d;
            }
            if (z4) {
                d14 = -d14;
            }
            double d15 = d14;
            MapboxMap mapboxMap = c28393o.f114520I;
            if (mapboxMap == null) {
                AbstractC22676k.m65757q("mapCameraManagerDelegate");
                throw null;
            }
            double zoom = mapboxMap.getCameraState().getZoom();
            ScreenCoordinate screenCoordinate2 = c28393o.f114558u0.f120665J;
            if (screenCoordinate2 != null) {
                screenCoordinate = screenCoordinate2;
            } else if (c28393o.f114540c0) {
                screenCoordinate2 = c28393o.f114531T;
                screenCoordinate = screenCoordinate2;
            } else {
                PointF pointF = this.f114427n;
                screenCoordinate = new ScreenCoordinate(pointF.x, pointF.y);
            }
            ValueAnimator[] valueAnimatorArrM86077i = c28393o.m86077i(zoom, d15, screenCoordinate, (long) ((Math.log((((double) 1) / Math.pow(2.718281828459045d, 2.0d)) + Math.abs(d15)) + ((double) 2)) * 150.0d));
            c28393o.f114551n0 = valueAnimatorArrM86077i;
            c28393o.m86082n(valueAnimatorArrM86077i);
        }
        this.f114463w = false;
    }

    @Override // p382ou.AbstractC28362h
    /* JADX INFO: renamed from: j */
    public final HashSet mo86034j() {
        return f114454H;
    }
}
