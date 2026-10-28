package p157fv;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Point;
import com.mapbox.maps.C5526f;
import com.mapbox.maps.CameraAnimationHint;
import com.mapbox.maps.CameraAnimationHintStage;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.threading.AnimationThreadController;
import com.mapbox.maps.util.CameraOptionsUtils;
import j93.InterfaceC21493z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import l83.C23454a0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p005a3.C0271z0;
import p021av.C2088b;
import p088dc.AbstractC11895b;
import p114eb.C12986s;
import p127ev.C13667h;
import p127ev.C13668i;
import p127ev.InterfaceC13666g;
import p176gv.AbstractC16218d;
import p176gv.AbstractC16225k;
import p176gv.C16215a;
import p176gv.C16219e;
import p176gv.C16220f;
import p176gv.C16221g;
import p176gv.C16222h;
import p176gv.C16223i;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22686q;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: fv.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C14802h implements InterfaceC14795a, InterfaceC13666g {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ InterfaceC21493z[] f54931W;

    /* JADX INFO: renamed from: R */
    public C13668i f54945R;

    /* JADX INFO: renamed from: S */
    public MapboxMap f54946S;

    /* JADX INFO: renamed from: T */
    public MapboxMap f54947T;

    /* JADX INFO: renamed from: U */
    public C14808n f54948U;

    /* JADX INFO: renamed from: y */
    public C14809o f54952y;

    /* JADX INFO: renamed from: w */
    public final HashSet f54950w = new HashSet();

    /* JADX INFO: renamed from: x */
    public final LinkedHashSet f54951x = new LinkedHashSet();

    /* JADX INFO: renamed from: z */
    public final CopyOnWriteArraySet f54953z = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: E */
    public final CopyOnWriteArraySet f54932E = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: F */
    public final CopyOnWriteArraySet f54933F = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: G */
    public final CopyOnWriteArraySet f54934G = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: H */
    public final CopyOnWriteArraySet f54935H = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: I */
    public final CopyOnWriteArraySet f54936I = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: J */
    public final CopyOnWriteArraySet f54937J = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: K */
    public final C14800f f54938K = new C14800f(this, 0);

    /* JADX INFO: renamed from: L */
    public final C14800f f54939L = new C14800f(this, 1);

    /* JADX INFO: renamed from: M */
    public final C14800f f54940M = new C14800f(this, 2);

    /* JADX INFO: renamed from: N */
    public final C14800f f54941N = new C14800f(this, 3);

    /* JADX INFO: renamed from: O */
    public final C14800f f54942O = new C14800f(this, 4);

    /* JADX INFO: renamed from: P */
    public final C14800f f54943P = new C14800f(this, 5);

    /* JADX INFO: renamed from: Q */
    public CameraOptions.Builder f54944Q = new CameraOptions.Builder();

    /* JADX INFO: renamed from: V */
    public final List f54949V = AbstractC37056f.m118959K(Float.valueOf(0.25f), Float.valueOf(0.5f), Float.valueOf(0.75f), Float.valueOf(1.0f));

    static {
        C22686q c22686q = new C22686q(C14802h.class, "center", "getCenter()Lcom/mapbox/geojson/Point;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f54931W = new InterfaceC21493z[]{c22673i0.mutableProperty1(c22686q), AbstractC11895b.m31990i(C14802h.class, "zoom", "getZoom()Ljava/lang/Double;", 0, c22673i0), AbstractC11895b.m31990i(C14802h.class, "padding", "getPadding()Lcom/mapbox/maps/EdgeInsets;", 0, c22673i0), AbstractC11895b.m31990i(C14802h.class, "anchor", "getAnchor()Lcom/mapbox/maps/ScreenCoordinate;", 0, c22673i0), AbstractC11895b.m31990i(C14802h.class, "bearing", "getBearing()Ljava/lang/Double;", 0, c22673i0), AbstractC11895b.m31990i(C14802h.class, "pitch", "getPitch()Ljava/lang/Double;", 0, c22673i0)};
    }

    /* JADX INFO: renamed from: m */
    public static void m42547m(AbstractC16218d abstractC16218d, Object obj, CameraOptions.Builder builder) {
        if (abstractC16218d instanceof C16220f) {
            builder.center(obj instanceof Point ? (Point) obj : null);
            return;
        }
        if (abstractC16218d instanceof C16223i) {
            builder.zoom(obj instanceof Double ? (Double) obj : null);
            return;
        }
        if (abstractC16218d instanceof C16215a) {
            builder.anchor(obj instanceof ScreenCoordinate ? (ScreenCoordinate) obj : null);
            return;
        }
        if (abstractC16218d instanceof C16221g) {
            builder.padding(obj instanceof EdgeInsets ? (EdgeInsets) obj : null);
        } else if (abstractC16218d instanceof C16219e) {
            builder.bearing(obj instanceof Double ? (Double) obj : null);
        } else if (abstractC16218d instanceof C16222h) {
            builder.pitch(obj instanceof Double ? (Double) obj : null);
        }
    }

    @Override // p127ev.InterfaceC13669j
    /* JADX INFO: renamed from: a */
    public final void mo38544a() {
        HashSet hashSet = this.f54950w;
        Object[] array = hashSet.toArray(new AbstractC16218d[0]);
        AbstractC22676k.m65748h(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        AbstractC16218d[] abstractC16218dArr = (AbstractC16218d[]) array;
        ValueAnimator[] cameraAnimators = (ValueAnimator[]) Arrays.copyOf(abstractC16218dArr, abstractC16218dArr.length);
        AbstractC22676k.m65750j(cameraAnimators, "cameraAnimators");
        AnimationThreadController animationThreadController = AnimationThreadController.INSTANCE;
        animationThreadController.postOnMainThread(new C12986s(cameraAnimators, this, true, 1));
        C14809o c14809o = this.f54952y;
        if (c14809o != null) {
            animationThreadController.postOnAnimatorThread(new C14798d(c14809o, 0));
        }
        this.f54953z.clear();
        this.f54932E.clear();
        this.f54935H.clear();
        this.f54936I.clear();
        this.f54934G.clear();
        this.f54933F.clear();
        this.f54937J.clear();
        hashSet.clear();
    }

    /* JADX INFO: renamed from: b */
    public final void m42548b(List list) {
        C14809o c14809o;
        for (AbstractC16218d abstractC16218d : new HashSet(this.f54950w)) {
            if (!AbstractC25265s.m74155w0(list, abstractC16218d.f61611x)) {
                AnimationThreadController.INSTANCE.postOnAnimatorThread(new C14797c(abstractC16218d, 0));
            }
        }
        List list2 = list;
        C14809o c14809o2 = this.f54952y;
        if (AbstractC25265s.m74155w0(list2, c14809o2 != null ? c14809o2.f54991a : null) || (c14809o = this.f54952y) == null) {
            return;
        }
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C14798d(c14809o, 0));
    }

    @Override // p127ev.InterfaceC13666g
    /* JADX INFO: renamed from: d */
    public final void mo38528d(Point point, EdgeInsets edgeInsets, double d3, double d14, double d15) {
        Double dValueOf = Double.valueOf(d15);
        InterfaceC21493z[] interfaceC21493zArr = f54931W;
        this.f54942O.setValue(this, interfaceC21493zArr[4], dValueOf);
        this.f54938K.setValue(this, interfaceC21493zArr[0], point);
        this.f54940M.setValue(this, interfaceC21493zArr[2], edgeInsets);
        Double dValueOf2 = Double.valueOf(d14);
        this.f54943P.setValue(this, interfaceC21493zArr[5], dValueOf2);
        Double dValueOf3 = Double.valueOf(d3);
        this.f54939L.setValue(this, interfaceC21493zArr[1], dValueOf3);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x0086  */
    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1 A[Catch: Exception -> 0x00c5, TryCatch #0 {Exception -> 0x00c5, blocks: (B:35:0x00bd, B:37:0x00c1, B:40:0x00c7, B:41:0x00cd), top: B:45:0x00bd }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c7 A[Catch: Exception -> 0x00c5, TryCatch #0 {Exception -> 0x00c5, blocks: (B:35:0x00bd, B:37:0x00c1, B:40:0x00c7, B:41:0x00cd), top: B:45:0x00bd }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public final void m42549e() {
        MapboxMap mapboxMap;
        CameraOptions cameraOptionsBuild = this.f54944Q.anchor(m42551i()).build();
        AbstractC22676k.m65749i(cameraOptionsBuild, "cameraOptionsBuilder.anchor(anchor).build()");
        if (!CameraOptionsUtils.isEmpty(cameraOptionsBuild)) {
            if (cameraOptionsBuild.getAnchor() != null) {
                try {
                    mapboxMap = this.f54946S;
                    if (mapboxMap == null) {
                        AbstractC22676k.m65757q("mapCameraManagerDelegate");
                        throw null;
                    }
                    mapboxMap.setCamera(cameraOptionsBuild);
                } catch (Exception e5) {
                    MapboxLogger.logE("Mbgl-CameraManager", "Exception while setting camera options : " + e5.getMessage() + " CameraOptions = " + cameraOptionsBuild);
                }
            } else {
                Double pitch = cameraOptionsBuild.getPitch();
                InterfaceC21493z[] interfaceC21493zArr = f54931W;
                if (pitch != null) {
                    if (pitch.doubleValue() < 60.0d) {
                        double dDoubleValue = pitch.doubleValue();
                        Double d3 = (Double) this.f54943P.getValue(this, interfaceC21493zArr[5]);
                        if (d3 != null && dDoubleValue == d3.doubleValue()) {
                            if (cameraOptionsBuild.getZoom() != null) {
                                if (AbstractC22676k.m65742b(cameraOptionsBuild.getZoom(), (Double) this.f54939L.getValue(this, interfaceC21493zArr[1]))) {
                                    if (cameraOptionsBuild.getBearing() != null) {
                                        if (!AbstractC22676k.m65742b(cameraOptionsBuild.getBearing(), (Double) this.f54942O.getValue(this, interfaceC21493zArr[4]))) {
                                            if (cameraOptionsBuild.getCenter() != null) {
                                                if (!AbstractC22676k.m65745e(cameraOptionsBuild.getCenter(), (Point) this.f54938K.getValue(this, interfaceC21493zArr[0]))) {
                                                    if (cameraOptionsBuild.getPadding() != null) {
                                                        if (!AbstractC22676k.m65745e(cameraOptionsBuild.getPadding(), (EdgeInsets) this.f54940M.getValue(this, interfaceC21493zArr[2]))) {
                                                        }
                                                    }
                                                }
                                            } else if (cameraOptionsBuild.getPadding() != null) {
                                                if (!AbstractC22676k.m65745e(cameraOptionsBuild.getPadding(), (EdgeInsets) this.f54940M.getValue(this, interfaceC21493zArr[2]))) {
                                                }
                                            }
                                        }
                                    } else if (cameraOptionsBuild.getCenter() != null) {
                                        if (!AbstractC22676k.m65745e(cameraOptionsBuild.getCenter(), (Point) this.f54938K.getValue(this, interfaceC21493zArr[0]))) {
                                            if (cameraOptionsBuild.getPadding() != null) {
                                                if (!AbstractC22676k.m65745e(cameraOptionsBuild.getPadding(), (EdgeInsets) this.f54940M.getValue(this, interfaceC21493zArr[2]))) {
                                                }
                                            }
                                        }
                                    } else if (cameraOptionsBuild.getPadding() != null) {
                                        if (!AbstractC22676k.m65745e(cameraOptionsBuild.getPadding(), (EdgeInsets) this.f54940M.getValue(this, interfaceC21493zArr[2]))) {
                                        }
                                    }
                                }
                            } else if (cameraOptionsBuild.getBearing() != null) {
                                if (!AbstractC22676k.m65742b(cameraOptionsBuild.getBearing(), (Double) this.f54942O.getValue(this, interfaceC21493zArr[4]))) {
                                    if (cameraOptionsBuild.getCenter() != null) {
                                        if (!AbstractC22676k.m65745e(cameraOptionsBuild.getCenter(), (Point) this.f54938K.getValue(this, interfaceC21493zArr[0]))) {
                                            if (cameraOptionsBuild.getPadding() != null) {
                                                if (!AbstractC22676k.m65745e(cameraOptionsBuild.getPadding(), (EdgeInsets) this.f54940M.getValue(this, interfaceC21493zArr[2]))) {
                                                }
                                            }
                                        }
                                    } else if (cameraOptionsBuild.getPadding() != null) {
                                        if (!AbstractC22676k.m65745e(cameraOptionsBuild.getPadding(), (EdgeInsets) this.f54940M.getValue(this, interfaceC21493zArr[2]))) {
                                        }
                                    }
                                }
                            } else if (cameraOptionsBuild.getCenter() != null) {
                                if (!AbstractC22676k.m65745e(cameraOptionsBuild.getCenter(), (Point) this.f54938K.getValue(this, interfaceC21493zArr[0]))) {
                                    if (cameraOptionsBuild.getPadding() != null) {
                                        if (!AbstractC22676k.m65745e(cameraOptionsBuild.getPadding(), (EdgeInsets) this.f54940M.getValue(this, interfaceC21493zArr[2]))) {
                                        }
                                    }
                                }
                            } else if (cameraOptionsBuild.getPadding() != null) {
                                if (!AbstractC22676k.m65745e(cameraOptionsBuild.getPadding(), (EdgeInsets) this.f54940M.getValue(this, interfaceC21493zArr[2]))) {
                                }
                            }
                        }
                    }
                    mapboxMap = this.f54946S;
                    if (mapboxMap == null) {
                        AbstractC22676k.m65757q("mapCameraManagerDelegate");
                        throw null;
                    }
                    mapboxMap.setCamera(cameraOptionsBuild);
                } else if (cameraOptionsBuild.getZoom() != null) {
                    if (AbstractC22676k.m65742b(cameraOptionsBuild.getZoom(), (Double) this.f54939L.getValue(this, interfaceC21493zArr[1]))) {
                        mapboxMap = this.f54946S;
                        if (mapboxMap == null) {
                            AbstractC22676k.m65757q("mapCameraManagerDelegate");
                            throw null;
                        }
                        mapboxMap.setCamera(cameraOptionsBuild);
                    } else if (cameraOptionsBuild.getBearing() != null) {
                        if (!AbstractC22676k.m65742b(cameraOptionsBuild.getBearing(), (Double) this.f54942O.getValue(this, interfaceC21493zArr[4]))) {
                            mapboxMap = this.f54946S;
                            if (mapboxMap == null) {
                                AbstractC22676k.m65757q("mapCameraManagerDelegate");
                                throw null;
                            }
                            mapboxMap.setCamera(cameraOptionsBuild);
                        } else if (cameraOptionsBuild.getCenter() != null) {
                            if (!AbstractC22676k.m65745e(cameraOptionsBuild.getCenter(), (Point) this.f54938K.getValue(this, interfaceC21493zArr[0]))) {
                                mapboxMap = this.f54946S;
                                if (mapboxMap == null) {
                                    AbstractC22676k.m65757q("mapCameraManagerDelegate");
                                    throw null;
                                }
                                mapboxMap.setCamera(cameraOptionsBuild);
                            } else if (cameraOptionsBuild.getPadding() != null) {
                                if (!AbstractC22676k.m65745e(cameraOptionsBuild.getPadding(), (EdgeInsets) this.f54940M.getValue(this, interfaceC21493zArr[2]))) {
                                    mapboxMap = this.f54946S;
                                    if (mapboxMap == null) {
                                        AbstractC22676k.m65757q("mapCameraManagerDelegate");
                                        throw null;
                                    }
                                    mapboxMap.setCamera(cameraOptionsBuild);
                                }
                            }
                        } else if (cameraOptionsBuild.getPadding() != null) {
                            if (!AbstractC22676k.m65745e(cameraOptionsBuild.getPadding(), (EdgeInsets) this.f54940M.getValue(this, interfaceC21493zArr[2]))) {
                                mapboxMap = this.f54946S;
                                if (mapboxMap == null) {
                                    AbstractC22676k.m65757q("mapCameraManagerDelegate");
                                    throw null;
                                }
                                mapboxMap.setCamera(cameraOptionsBuild);
                            }
                        }
                    } else if (cameraOptionsBuild.getCenter() != null) {
                        if (!AbstractC22676k.m65745e(cameraOptionsBuild.getCenter(), (Point) this.f54938K.getValue(this, interfaceC21493zArr[0]))) {
                            mapboxMap = this.f54946S;
                            if (mapboxMap == null) {
                                AbstractC22676k.m65757q("mapCameraManagerDelegate");
                                throw null;
                            }
                            mapboxMap.setCamera(cameraOptionsBuild);
                        } else if (cameraOptionsBuild.getPadding() != null) {
                            if (!AbstractC22676k.m65745e(cameraOptionsBuild.getPadding(), (EdgeInsets) this.f54940M.getValue(this, interfaceC21493zArr[2]))) {
                                mapboxMap = this.f54946S;
                                if (mapboxMap == null) {
                                    AbstractC22676k.m65757q("mapCameraManagerDelegate");
                                    throw null;
                                }
                                mapboxMap.setCamera(cameraOptionsBuild);
                            }
                        }
                    } else if (cameraOptionsBuild.getPadding() != null) {
                        if (!AbstractC22676k.m65745e(cameraOptionsBuild.getPadding(), (EdgeInsets) this.f54940M.getValue(this, interfaceC21493zArr[2]))) {
                            mapboxMap = this.f54946S;
                            if (mapboxMap == null) {
                                AbstractC22676k.m65757q("mapCameraManagerDelegate");
                                throw null;
                            }
                            mapboxMap.setCamera(cameraOptionsBuild);
                        }
                    }
                } else if (cameraOptionsBuild.getBearing() != null) {
                    if (!AbstractC22676k.m65742b(cameraOptionsBuild.getBearing(), (Double) this.f54942O.getValue(this, interfaceC21493zArr[4]))) {
                        mapboxMap = this.f54946S;
                        if (mapboxMap == null) {
                            AbstractC22676k.m65757q("mapCameraManagerDelegate");
                            throw null;
                        }
                        mapboxMap.setCamera(cameraOptionsBuild);
                    } else if (cameraOptionsBuild.getCenter() != null) {
                        if (!AbstractC22676k.m65745e(cameraOptionsBuild.getCenter(), (Point) this.f54938K.getValue(this, interfaceC21493zArr[0]))) {
                            mapboxMap = this.f54946S;
                            if (mapboxMap == null) {
                                AbstractC22676k.m65757q("mapCameraManagerDelegate");
                                throw null;
                            }
                            mapboxMap.setCamera(cameraOptionsBuild);
                        } else if (cameraOptionsBuild.getPadding() != null) {
                            if (!AbstractC22676k.m65745e(cameraOptionsBuild.getPadding(), (EdgeInsets) this.f54940M.getValue(this, interfaceC21493zArr[2]))) {
                                mapboxMap = this.f54946S;
                                if (mapboxMap == null) {
                                    AbstractC22676k.m65757q("mapCameraManagerDelegate");
                                    throw null;
                                }
                                mapboxMap.setCamera(cameraOptionsBuild);
                            }
                        }
                    } else if (cameraOptionsBuild.getPadding() != null) {
                        if (!AbstractC22676k.m65745e(cameraOptionsBuild.getPadding(), (EdgeInsets) this.f54940M.getValue(this, interfaceC21493zArr[2]))) {
                            mapboxMap = this.f54946S;
                            if (mapboxMap == null) {
                                AbstractC22676k.m65757q("mapCameraManagerDelegate");
                                throw null;
                            }
                            mapboxMap.setCamera(cameraOptionsBuild);
                        }
                    }
                } else if (cameraOptionsBuild.getCenter() != null) {
                    if (!AbstractC22676k.m65745e(cameraOptionsBuild.getCenter(), (Point) this.f54938K.getValue(this, interfaceC21493zArr[0]))) {
                        mapboxMap = this.f54946S;
                        if (mapboxMap == null) {
                            AbstractC22676k.m65757q("mapCameraManagerDelegate");
                            throw null;
                        }
                        mapboxMap.setCamera(cameraOptionsBuild);
                    } else if (cameraOptionsBuild.getPadding() != null) {
                        if (!AbstractC22676k.m65745e(cameraOptionsBuild.getPadding(), (EdgeInsets) this.f54940M.getValue(this, interfaceC21493zArr[2]))) {
                            mapboxMap = this.f54946S;
                            if (mapboxMap == null) {
                                AbstractC22676k.m65757q("mapCameraManagerDelegate");
                                throw null;
                            }
                            mapboxMap.setCamera(cameraOptionsBuild);
                        }
                    }
                } else if (cameraOptionsBuild.getPadding() != null) {
                    if (!AbstractC22676k.m65745e(cameraOptionsBuild.getPadding(), (EdgeInsets) this.f54940M.getValue(this, interfaceC21493zArr[2]))) {
                        mapboxMap = this.f54946S;
                        if (mapboxMap == null) {
                            AbstractC22676k.m65757q("mapCameraManagerDelegate");
                            throw null;
                        }
                        mapboxMap.setCamera(cameraOptionsBuild);
                    }
                }
            }
        }
        this.f54944Q = new CameraOptions.Builder();
    }

    @Override // p127ev.InterfaceC13669j
    /* JADX INFO: renamed from: f */
    public final void mo38545f(C13668i c13668i) {
        this.f54945R = c13668i;
        this.f54946S = (MapboxMap) c13668i.f48455b;
        this.f54947T = (MapboxMap) c13668i.f48457d;
        C13668i c13668i2 = this.f54945R;
        if (c13668i2 != null) {
            this.f54948U = new C14808n(c13668i2);
        } else {
            AbstractC22676k.m65757q("mapDelegateProvider");
            throw null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final Cancelable m42550h(CameraOptions cameraOptions, C14810p c14810p, AnimatorListenerAdapter animatorListenerAdapter) {
        AbstractC22676k.m65750j(cameraOptions, "cameraOptions");
        if (CameraOptionsUtils.isEmpty(cameraOptions)) {
            MapboxLogger.logW("Mbgl-CameraManager", "No-op easeTo camera high-level animation as CameraOptions.isEmpty == true.");
            return new C5526f(3);
        }
        C14808n c14808n = this.f54948U;
        if (c14808n == null) {
            AbstractC22676k.m65757q("cameraAnimationsFactory");
            throw null;
        }
        HashMap map = C14808n.f54987e;
        ArrayList<ValueAnimator> arrayList = new ArrayList();
        CameraState cameraState = c14808n.f54990c.getCameraState();
        Point center = cameraOptions.getCenter();
        if (center != null) {
            Object[] targets = Arrays.copyOf(new Point[]{center}, 1);
            AbstractC22676k.m65750j(targets, "targets");
            Point center2 = cameraState.getCenter();
            AbstractC22676k.m65749i(center2, "currentCameraState.center");
            arrayList.add(new C16220f(AbstractC16225k.f61622a, new C14803i(Arrays.copyOf(targets, targets.length), center2, null), (Function1) map.get(EnumC14804j.f54960w)));
        }
        ScreenCoordinate anchor = cameraOptions.getAnchor();
        if (anchor != null) {
            Object[] targets2 = Arrays.copyOf(new ScreenCoordinate[]{anchor}, 1);
            AbstractC22676k.m65750j(targets2, "targets");
            arrayList.add(new C16215a(new C14803i(Arrays.copyOf(targets2, targets2.length), anchor, null), (Function1) map.get(EnumC14804j.f54957E)));
        }
        Double bearing = cameraOptions.getBearing();
        if (bearing != null) {
            Object[] targets3 = Arrays.copyOf(new Double[]{bearing}, 1);
            AbstractC22676k.m65750j(targets3, "targets");
            arrayList.add(new C16219e(new C14803i(Arrays.copyOf(targets3, targets3.length), Double.valueOf(cameraState.getBearing()), null), (Function1) map.get(EnumC14804j.f54962y)));
        }
        EdgeInsets padding = cameraOptions.getPadding();
        if (padding != null) {
            Object[] targets4 = Arrays.copyOf(new EdgeInsets[]{padding}, 1);
            AbstractC22676k.m65750j(targets4, "targets");
            EdgeInsets padding2 = cameraState.getPadding();
            AbstractC22676k.m65749i(padding2, "currentCameraState.padding");
            arrayList.add(new C16221g(new C14803i(Arrays.copyOf(targets4, targets4.length), padding2, null), (Function1) map.get(EnumC14804j.f54958F)));
        }
        Double pitch = cameraOptions.getPitch();
        if (pitch != null) {
            Object[] targets5 = Arrays.copyOf(new Double[]{pitch}, 1);
            AbstractC22676k.m65750j(targets5, "targets");
            arrayList.add(new C16222h(new C14803i(Arrays.copyOf(targets5, targets5.length), Double.valueOf(cameraState.getPitch()), null), (Function1) map.get(EnumC14804j.f54963z)));
        }
        Double zoom = cameraOptions.getZoom();
        if (zoom != null) {
            Object[] targets6 = Arrays.copyOf(new Double[]{zoom}, 1);
            AbstractC22676k.m65750j(targets6, "targets");
            arrayList.add(new C16223i(new C14803i(Arrays.copyOf(targets6, targets6.length), Double.valueOf(cameraState.getZoom()), null), (Function1) map.get(EnumC14804j.f54961x)));
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        for (ValueAnimator valueAnimator : arrayList) {
            AbstractC22676k.m65748h(valueAnimator, "null cannot be cast to non-null type com.mapbox.maps.plugin.animation.animator.CameraAnimator<*>");
            arrayList2.add((AbstractC16218d) valueAnimator);
        }
        Object[] array = arrayList2.toArray(new AbstractC16218d[0]);
        AbstractC22676k.m65748h(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return m42554l((AbstractC16218d[]) array, c14810p, animatorListenerAdapter);
    }

    /* JADX INFO: renamed from: i */
    public final ScreenCoordinate m42551i() {
        return (ScreenCoordinate) this.f54941N.getValue(this, f54931W[3]);
    }

    @Override // p127ev.InterfaceC13669j
    public final void initialize() {
    }

    /* JADX INFO: renamed from: j */
    public final void m42552j(ValueAnimator... valueAnimatorArr) {
        if (valueAnimatorArr.length == 0) {
            MapboxLogger.logW("Mbgl-CameraManager", "No-op playAnimatorsTogether() as no animators are passed");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            if (valueAnimator instanceof AbstractC16218d) {
                AbstractC16218d abstractC16218d = (AbstractC16218d) valueAnimator;
                abstractC16218d.f61608K = true;
                if (abstractC16218d.f61611x == null) {
                    abstractC16218d.f61611x = "Maps-CameraInternal";
                }
                arrayList.add(valueAnimator);
            } else {
                MapboxLogger.logE("Mbgl-CameraManager", "All animators must be CameraAnimator's to be played together!");
            }
        }
        Object[] array = arrayList.toArray(new AbstractC16218d[0]);
        AbstractC22676k.m65748h(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        AbstractC16218d[] abstractC16218dArr = (AbstractC16218d[]) array;
        ValueAnimator[] cameraAnimators = (ValueAnimator[]) Arrays.copyOf(abstractC16218dArr, abstractC16218dArr.length);
        AbstractC22676k.m65750j(cameraAnimators, "cameraAnimators");
        AnimationThreadController animationThreadController = AnimationThreadController.INSTANCE;
        animationThreadController.postOnMainThread(new C0271z0(7, cameraAnimators, this));
        AnimatorSet animatorSet = new AnimatorSet();
        Object[] array2 = arrayList.toArray(new AbstractC16218d[0]);
        AbstractC22676k.m65748h(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        AbstractC16218d[] abstractC16218dArr2 = (AbstractC16218d[]) array2;
        animatorSet.playTogether((Animator[]) Arrays.copyOf(abstractC16218dArr2, abstractC16218dArr2.length));
        animationThreadController.postOnAnimatorThread(new C2088b(animatorSet, 15));
    }

    /* JADX INFO: renamed from: k */
    public final void m42553k(ScreenCoordinate screenCoordinate) {
        this.f54941N.setValue(this, f54931W[3], screenCoordinate);
    }

    /* JADX INFO: renamed from: l */
    public final Cancelable m42554l(AbstractC16218d[] abstractC16218dArr, C14810p c14810p, Animator.AnimatorListener animatorListener) {
        ArrayList arrayList;
        long j7;
        String str = c14810p.f54993a;
        if (abstractC16218dArr.length == 0) {
            MapboxLogger.logW("Mbgl-CameraManager", "No-op camera high-level animation as CameraOptions are empty.");
            return new C5526f(3);
        }
        for (AbstractC16218d abstractC16218d : abstractC16218dArr) {
            abstractC16218d.f61608K = true;
            abstractC16218d.f61611x = str;
        }
        C14809o c14809o = this.f54952y;
        if (c14809o != null) {
            AnimationThreadController.INSTANCE.postOnAnimatorThread(new C14798d(c14809o, 0));
        }
        ValueAnimator[] cameraAnimators = (ValueAnimator[]) Arrays.copyOf(abstractC16218dArr, abstractC16218dArr.length);
        AbstractC22676k.m65750j(cameraAnimators, "cameraAnimators");
        AnimationThreadController animationThreadController = AnimationThreadController.INSTANCE;
        animationThreadController.postOnMainThread(new C0271z0(7, cameraAnimators, this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(c14810p.f54994b.longValue());
        TimeInterpolator timeInterpolator = c14810p.f54995c;
        if (timeInterpolator != null) {
            animatorSet.setInterpolator(timeInterpolator);
        }
        if (animatorListener != null) {
            animationThreadController.postOnAnimatorThread(new C13667h(animatorSet, animatorListener, this, 2));
        }
        animatorSet.playTogether((Animator[]) Arrays.copyOf(abstractC16218dArr, abstractC16218dArr.length));
        long j13 = 0;
        if (animatorSet.getDuration() != 0) {
            ArrayList<Animator> childAnimations = animatorSet.getChildAnimations();
            AbstractC22676k.m65749i(childAnimations, "animatorSet.childAnimations");
            int i13 = 10;
            ArrayList<AbstractC16218d> arrayList2 = new ArrayList(AbstractC25267u.m74163i0(childAnimations, 10));
            for (Animator animator : childAnimations) {
                AbstractC22676k.m65748h(animator, "null cannot be cast to non-null type com.mapbox.maps.plugin.animation.animator.CameraAnimator<*>");
                arrayList2.add((AbstractC16218d) animator);
            }
            if (!arrayList2.isEmpty() && arrayList2.size() == animatorSet.getChildAnimations().size()) {
                CameraOptions.Builder builder = new CameraOptions.Builder();
                long duration = ((AbstractC16218d) arrayList2.get(0)).getDuration();
                List list = this.f54949V;
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    long j14 = j13;
                    float fFloatValue = ((Number) it.next()).floatValue();
                    builder.center(null).padding(null).anchor(null).zoom(null).bearing(null).pitch(null);
                    ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, i13));
                    for (AbstractC16218d abstractC16218d2 : arrayList2) {
                        if (abstractC16218d2.getStartDelay() != j14) {
                            MapboxLogger.logW("Mbgl-CameraManager", "Unable to calculate animated value ahead of time for " + abstractC16218d2.mo45908k().name() + ": startDelay != 0 is not supported");
                        } else if (abstractC16218d2.getDuration() != duration) {
                            MapboxLogger.logW("Mbgl-CameraManager", "Unable to calculate animated value ahead of time for " + abstractC16218d2.mo45908k().name() + ": different duration is not supported");
                        } else {
                            try {
                                Object[] objArr = abstractC16218d2.f61613z;
                                arrayList = arrayList2;
                                try {
                                    Object obj = abstractC16218d2.f61612y;
                                    if (obj != null) {
                                        j7 = duration;
                                        try {
                                            if (objArr.length <= 1) {
                                                m42547m(abstractC16218d2, abstractC16218d2.f61610w.evaluate(abstractC16218d2.getInterpolator().getInterpolation(fFloatValue), obj, AbstractC25260n.m74029E0(objArr)), builder);
                                                arrayList4.add(C23454a0.f92919a);
                                                arrayList2 = arrayList;
                                                duration = j7;
                                            }
                                        } catch (UnsupportedOperationException e5) {
                                            e = e5;
                                            MapboxLogger.logW("Mbgl-CameraManager", "Unable to calculate animated value ahead of time for " + abstractC16218d2.mo45908k().name() + ": " + e.getMessage());
                                        }
                                    } else {
                                        j7 = duration;
                                    }
                                    throw new UnsupportedOperationException("getAnimatedValueAt() is only supported for single target animations with a start value.");
                                } catch (UnsupportedOperationException e13) {
                                    e = e13;
                                    j7 = duration;
                                    MapboxLogger.logW("Mbgl-CameraManager", "Unable to calculate animated value ahead of time for " + abstractC16218d2.mo45908k().name() + ": " + e.getMessage());
                                    arrayList4.add(C23454a0.f92919a);
                                    arrayList2 = arrayList;
                                    duration = j7;
                                }
                            } catch (UnsupportedOperationException e14) {
                                e = e14;
                                arrayList = arrayList2;
                            }
                        }
                    }
                    arrayList3.add(new CameraAnimationHintStage.Builder().camera(builder.build()).progress((long) (animatorSet.getDuration() * fFloatValue)).build());
                    j13 = j14;
                    arrayList2 = arrayList2;
                    i13 = 10;
                }
                CameraAnimationHint cameraAnimationHint = new CameraAnimationHint.Builder().stages(arrayList3).build();
                MapboxMap mapboxMap = this.f54947T;
                if (mapboxMap == null) {
                    AbstractC22676k.m65757q("mapTransformDelegate");
                    throw null;
                }
                AbstractC22676k.m65749i(cameraAnimationHint, "cameraAnimationHint");
                mapboxMap.setCameraAnimationHint(cameraAnimationHint);
            }
        }
        C14809o c14809o2 = new C14809o(str, animatorSet);
        this.f54952y = c14809o2;
        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C14798d(c14809o2, 1));
        return c14809o2;
    }
}
