package p383ov;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Point;
import com.mapbox.maps.C5499a;
import com.mapbox.maps.ClickInteraction;
import com.mapbox.maps.DragInteraction;
import com.mapbox.maps.LongClickInteraction;
import com.mapbox.maps.MapController;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.Style;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.StylePropertyValueKind;
import com.mapbox.maps.plugin.InvalidPluginConfigurationException;
import com.mapbox.maps.threading.AnimationThreadController;
import com.mapbox.maps.util.CoreGesturesHandler;
import com.whoop.android.R;
import io.sentry.android.replay.video.C20245d;
import j43.C21317a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import lr.RunnableC24693e;
import m83.AbstractC25265s;
import mv.InterfaceC25964c;
import p000.AbstractC11266d;
import p114eb.C12986s;
import p127ev.C13668i;
import p127ev.InterfaceC13672m;
import p157fv.C14802h;
import p157fv.C14803i;
import p157fv.C14810p;
import p157fv.InterfaceC14795a;
import p176gv.C16215a;
import p176gv.C16223i;
import p186h8.C16999a;
import p382ou.AbstractC28355a;
import p382ou.AbstractC28359e;
import p382ou.C28357c;
import p382ou.C28360f;
import p382ou.C28363i;
import p382ou.C28364j;
import p382ou.C28365k;
import p382ou.C28368n;
import p382ou.C28369o;
import p406pv.C29572a;
import p406pv.C29573b;
import p715kotlin.jvm.internal.AbstractC22676k;
import qg3.C30352d;

/* JADX INFO: renamed from: ov.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C28393o implements InterfaceC28381c, InterfaceC13672m {

    /* JADX INFO: renamed from: v0 */
    public static final C14810p f114515v0 = new C14810p("Maps-Gestures", 0L, null);

    /* JADX INFO: renamed from: E */
    public C30352d f114516E;

    /* JADX INFO: renamed from: F */
    public MapboxStyleManager f114517F;

    /* JADX INFO: renamed from: H */
    public MapboxMap f114519H;

    /* JADX INFO: renamed from: I */
    public MapboxMap f114520I;

    /* JADX INFO: renamed from: J */
    public MapboxMap f114521J;

    /* JADX INFO: renamed from: K */
    public InterfaceC14795a f114522K;

    /* JADX INFO: renamed from: T */
    public ScreenCoordinate f114531T;

    /* JADX INFO: renamed from: U */
    public ScreenCoordinate f114532U;

    /* JADX INFO: renamed from: V */
    public ScreenCoordinate f114533V;

    /* JADX INFO: renamed from: W */
    public boolean f114534W;

    /* JADX INFO: renamed from: X */
    public boolean f114535X;

    /* JADX INFO: renamed from: Y */
    public float f114536Y;

    /* JADX INFO: renamed from: Z */
    public float f114537Z;

    /* JADX INFO: renamed from: a0 */
    public float f114538a0;

    /* JADX INFO: renamed from: b0 */
    public double f114539b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f114540c0;

    /* JADX INFO: renamed from: d0 */
    public float f114541d0;

    /* JADX INFO: renamed from: e0 */
    public double f114542e0;

    /* JADX INFO: renamed from: f0 */
    public double f114543f0;

    /* JADX INFO: renamed from: g0 */
    public ScreenCoordinate f114544g0;

    /* JADX INFO: renamed from: h0 */
    public float f114545h0;

    /* JADX INFO: renamed from: i0 */
    public float f114546i0;

    /* JADX INFO: renamed from: j0 */
    public float f114547j0;

    /* JADX INFO: renamed from: k0 */
    public double f114548k0;

    /* JADX INFO: renamed from: l0 */
    public float f114549l0;

    /* JADX INFO: renamed from: m0 */
    public ScreenCoordinate f114550m0;

    /* JADX INFO: renamed from: n0 */
    public ValueAnimator[] f114551n0;

    /* JADX INFO: renamed from: o0 */
    public ValueAnimator[] f114552o0;

    /* JADX INFO: renamed from: p0 */
    public final ArrayList f114553p0;

    /* JADX INFO: renamed from: q0 */
    public final C16999a f114554q0;

    /* JADX INFO: renamed from: r0 */
    public CoreGesturesHandler f114555r0;

    /* JADX INFO: renamed from: s0 */
    public final Handler f114556s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f114557t0;

    /* JADX INFO: renamed from: u0 */
    public C29573b f114558u0;

    /* JADX INFO: renamed from: w */
    public final Context f114559w;

    /* JADX INFO: renamed from: x */
    public float f114560x;

    /* JADX INFO: renamed from: y */
    public C20245d f114561y;

    /* JADX INFO: renamed from: z */
    public C28383e f114562z;

    /* JADX INFO: renamed from: G */
    public final LinkedHashSet f114518G = new LinkedHashSet();

    /* JADX INFO: renamed from: L */
    public final CopyOnWriteArraySet f114523L = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: M */
    public final CopyOnWriteArraySet f114524M = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: N */
    public final CopyOnWriteArraySet f114525N = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: O */
    public final CopyOnWriteArraySet f114526O = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: P */
    public final CopyOnWriteArraySet f114527P = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: Q */
    public final CopyOnWriteArraySet f114528Q = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: R */
    public final CopyOnWriteArraySet f114529R = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: S */
    public final CopyOnWriteArraySet f114530S = new CopyOnWriteArraySet();

    public C28393o(Context context, float f13) {
        this.f114560x = 1.0f;
        ScreenCoordinate screenCoordinate = new ScreenCoordinate(0.0d, 0.0d);
        this.f114531T = screenCoordinate;
        this.f114532U = screenCoordinate;
        this.f114533V = screenCoordinate;
        this.f114534W = true;
        this.f114553p0 = new ArrayList();
        this.f114554q0 = new C16999a(2);
        this.f114559w = context;
        this.f114560x = f13;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC28394p.f114563a, 0, 0);
        AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…ble.mapbox_MapView, 0, 0)");
        try {
            C21317a c21317a = new C21317a(typedArrayObtainStyledAttributes, 5);
            C29572a c29572a = new C29572a();
            c21317a.invoke(c29572a);
            C29573b c29573bM90660a = c29572a.m90660a();
            typedArrayObtainStyledAttributes.recycle();
            this.f114558u0 = c29573bM90660a;
            this.f114556s0 = new Handler(Looper.getMainLooper());
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes.recycle();
            throw th3;
        }
    }

    @Override // p127ev.InterfaceC13669j
    /* JADX INFO: renamed from: a */
    public final void mo38544a() {
        this.f114517F = null;
        LinkedHashSet linkedHashSet = this.f114518G;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((Cancelable) it.next()).cancel();
        }
        linkedHashSet.clear();
        this.f114523L.clear();
        this.f114556s0.removeCallbacksAndMessages(null);
    }

    @Override // p127ev.InterfaceC13672m
    /* JADX INFO: renamed from: b */
    public final void mo38548b(Style style) {
        this.f114517F = style;
    }

    @Override // p127ev.InterfaceC13660a
    /* JADX INFO: renamed from: e */
    public final void mo38527e(Context context, AttributeSet attributeSet, float f13) {
        AbstractC22676k.m65750j(context, "context");
        ArrayList arrayList = new ArrayList();
        C20245d c20245d = new C20245d();
        ArrayList arrayList2 = new ArrayList();
        c20245d.f76045a = arrayList2;
        ArrayList<AbstractC28355a> arrayList3 = new ArrayList();
        c20245d.f76046b = arrayList3;
        arrayList2.addAll(arrayList);
        C28363i c28363i = new C28363i(context, c20245d);
        c20245d.f76049e = c28363i;
        C28369o c28369o = new C28369o(context, c20245d);
        c20245d.f76048d = c28369o;
        C28364j c28364j = new C28364j(context, c20245d);
        c20245d.f76050f = c28364j;
        C28365k c28365k = new C28365k(context, c20245d);
        C28360f c28360f = new C28360f(context, c20245d);
        c20245d.f76051g = c28360f;
        C28357c c28357c = new C28357c(context, c20245d);
        c20245d.f76052h = c28357c;
        C28368n c28368n = new C28368n(context, c20245d);
        c20245d.f76047c = c28368n;
        arrayList3.add(c28363i);
        arrayList3.add(c28369o);
        arrayList3.add(c28364j);
        arrayList3.add(c28365k);
        arrayList3.add(c28360f);
        arrayList3.add(c28357c);
        arrayList3.add(c28368n);
        for (AbstractC28355a abstractC28355a : arrayList3) {
            if (abstractC28355a instanceof AbstractC28359e) {
                AbstractC28359e abstractC28359e = (AbstractC28359e) abstractC28355a;
                abstractC28359e.f114423j = abstractC28359e.f114400a.getResources().getDimension(R.dimen.mapbox_internalMinSpan24);
            }
            if (abstractC28355a instanceof C28369o) {
                C28369o c28369o2 = (C28369o) abstractC28355a;
                c28369o2.f114459E = c28369o2.f114400a.getResources().getDimension(R.dimen.mapbox_defaultScaleSpanSinceStartThreshold);
            }
            if (abstractC28355a instanceof C28364j) {
                C28364j c28364j2 = (C28364j) abstractC28355a;
                c28364j2.f114446w = c28364j2.f114400a.getResources().getDimension(R.dimen.mapbox_defaultShovePixelThreshold);
                c28364j2.f114445v = 20.0f;
            }
            if (abstractC28355a instanceof C28365k) {
                C28365k c28365k2 = (C28365k) abstractC28355a;
                c28365k2.f114450w = c28365k2.f114400a.getResources().getDimension(R.dimen.mapbox_defaultShovePixelThreshold);
                c28365k2.f114449v = 20.0f;
            }
            if (abstractC28355a instanceof C28360f) {
                C28360f c28360f2 = (C28360f) abstractC28355a;
                c28360f2.f114430q = c28360f2.f114400a.getResources().getDimension(R.dimen.mapbox_defaultMultiTapMovementThreshold);
                c28360f2.f114429p = 150L;
            }
            if (abstractC28355a instanceof C28363i) {
                ((C28363i) abstractC28355a).f114441v = 15.3f;
            }
        }
        this.f114561y = c20245d;
        this.f114516E = new C30352d(c20245d);
        this.f114560x = f13;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC28394p.f114563a, 0, 0);
        AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…ble.mapbox_MapView, 0, 0)");
        try {
            C21317a c21317a = new C21317a(typedArrayObtainStyledAttributes, 5);
            C29572a c29572a = new C29572a();
            c21317a.invoke(c29572a);
            C29573b c29573bM90660a = c29572a.m90660a();
            typedArrayObtainStyledAttributes.recycle();
            this.f114558u0 = c29573bM90660a;
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes.recycle();
            throw th3;
        }
    }

    @Override // p127ev.InterfaceC13669j
    /* JADX INFO: renamed from: f */
    public final void mo38545f(C13668i c13668i) throws InvalidPluginConfigurationException {
        ((MapboxMap) c13668i.f48454a).getStyle(new C5499a(new C28392n(this, 0), 2));
        this.f114519H = (MapboxMap) c13668i.f48457d;
        this.f114520I = (MapboxMap) c13668i.f48455b;
        MapboxMap mapboxMap = (MapboxMap) c13668i.f48460g;
        AbstractC22676k.m65750j(mapboxMap, "<set-?>");
        this.f114521J = mapboxMap;
        InterfaceC14795a interfaceC14795a = (InterfaceC14795a) ((MapController) c13668i.f48462i).getPlugin("MAPBOX_CAMERA_PLUGIN_ID");
        if (interfaceC14795a == null) {
            throw new InvalidPluginConfigurationException("Can't look up an instance of plugin, is it available on the clazz path and loaded through the map?");
        }
        this.f114522K = interfaceC14795a;
        ((C14802h) interfaceC14795a).f54933F.add(new C28382d(this));
        MapboxMap mapboxMap2 = this.f114519H;
        if (mapboxMap2 == null) {
            AbstractC22676k.m65757q("mapTransformDelegate");
            throw null;
        }
        MapboxMap mapboxMap3 = this.f114520I;
        if (mapboxMap3 != null) {
            this.f114555r0 = new CoreGesturesHandler(mapboxMap2, mapboxMap3);
        } else {
            AbstractC22676k.m65757q("mapCameraManagerDelegate");
            throw null;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m86076h() {
        C29573b c29573b = this.f114558u0;
        if (c29573b.f120675y) {
            C20245d c20245d = this.f114561y;
            if (c20245d == null) {
                AbstractC22676k.m65757q("gesturesManager");
                throw null;
            }
            if (((C28357c) c20245d.f76052h).f114435q) {
                return;
            }
        }
        if (c29573b.f120674x || c29573b.f120663H || c29573b.f120662G) {
            C20245d c20245d2 = this.f114561y;
            if (c20245d2 == null) {
                AbstractC22676k.m65757q("gesturesManager");
                throw null;
            }
            if (((C28369o) c20245d2.f76048d).f114435q) {
                return;
            }
        }
        if (c29573b.f120673w) {
            C20245d c20245d3 = this.f114561y;
            if (c20245d3 == null) {
                AbstractC22676k.m65757q("gesturesManager");
                throw null;
            }
            if (((C28363i) c20245d3.f76049e).f114435q) {
                return;
            }
        }
        if (c29573b.f120660E) {
            C20245d c20245d4 = this.f114561y;
            if (c20245d4 == null) {
                AbstractC22676k.m65757q("gesturesManager");
                throw null;
            }
            if (((C28364j) c20245d4.f76050f).f114435q) {
                return;
            }
        }
        InterfaceC14795a interfaceC14795a = this.f114522K;
        if (interfaceC14795a == null) {
            AbstractC22676k.m65757q("cameraAnimationsPlugin");
            throw null;
        }
        ((C14802h) interfaceC14795a).m42548b(AbstractC25265s.m74093D1(this.f114523L));
    }

    /* JADX INFO: renamed from: i */
    public final ValueAnimator[] m86077i(double d3, double d14, ScreenCoordinate screenCoordinate, long j7) {
        if (this.f114522K == null) {
            AbstractC22676k.m65757q("cameraAnimationsPlugin");
            throw null;
        }
        int i13 = 1;
        Object[] targets = Arrays.copyOf(new Double[]{Double.valueOf(d14 + d3)}, 1);
        AbstractC22676k.m65750j(targets, "targets");
        C14803i c14803i = new C14803i(Arrays.copyOf(targets, targets.length), Double.valueOf(d3), "Maps-Gestures");
        C16999a c16999a = this.f114554q0;
        C16223i c16223i = new C16223i(c14803i, new C28390l(c16999a, j7, 3));
        c16223i.addListener(new C28389k(this, 2));
        CoreGesturesHandler coreGesturesHandler = this.f114555r0;
        if (coreGesturesHandler == null) {
            AbstractC22676k.m65757q("coreGesturesHandler");
            throw null;
        }
        c16223i.addListener(coreGesturesHandler.getCoreGestureAnimatorHandler());
        if (this.f114522K == null) {
            AbstractC22676k.m65757q("cameraAnimationsPlugin");
            throw null;
        }
        Object[] targets2 = Arrays.copyOf(new ScreenCoordinate[]{screenCoordinate}, 1);
        AbstractC22676k.m65750j(targets2, "targets");
        C16215a c16215a = new C16215a(new C14803i(Arrays.copyOf(targets2, targets2.length), screenCoordinate, "Maps-Gestures"), new C28390l(c16999a, j7, 2));
        c16215a.addListener(new C28389k(this, i13));
        return new ValueAnimator[]{c16223i, c16215a};
    }

    @Override // p127ev.InterfaceC13669j
    public final void initialize() {
        C20245d c20245d = this.f114561y;
        if (c20245d == null) {
            AbstractC22676k.m65757q("gesturesManager");
            throw null;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        hashSet.add(1);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(3);
        hashSet2.add(2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(1);
        hashSet3.add(6);
        List listAsList = Arrays.asList(hashSet, hashSet2, hashSet3);
        ArrayList arrayList = (ArrayList) c20245d.f76045a;
        arrayList.clear();
        arrayList.addAll(listAsList);
        ((C28363i) c20245d.f76049e).f114441v = 3.0f;
        ((C28364j) c20245d.f76050f).f114445v = 45.0f;
        this.f114561y = c20245d;
        Context context = this.f114559w;
        C28387i c28387i = new C28387i(this, context.getResources().getDimension(R.dimen.mapbox_defaultScaleSpanSinceStartThreshold));
        this.f114562z = new C28383e(this);
        this.f114536Y = context.getResources().getDimension(R.dimen.mapbox_minimum_scale_speed);
        this.f114537Z = context.getResources().getDimension(R.dimen.mapbox_minimum_angled_scale_speed);
        this.f114538a0 = context.getResources().getDimension(R.dimen.mapbox_minimum_scale_velocity);
        this.f114539b0 = ((double) context.getResources().getDimension(R.dimen.mapbox_density_constant)) * 0.004d;
        C28385g c28385g = new C28385g(this);
        this.f114545h0 = context.getResources().getDimension(R.dimen.mapbox_minimum_scale_span_when_rotating);
        this.f114546i0 = context.getResources().getDimension(R.dimen.mapbox_angular_velocity_multiplier);
        this.f114547j0 = context.getResources().getDimension(R.dimen.mapbox_minimum_angular_velocity);
        this.f114548k0 = ((double) context.getResources().getDimension(R.dimen.mapbox_density_constant)) * 2.2000000000000003E-4d;
        this.f114549l0 = context.getResources().getDimension(R.dimen.mapbox_defaultScaleSpanSinceStartThreshold);
        C28384f c28384f = new C28384f(this);
        C28386h c28386h = new C28386h(this);
        C28388j c28388j = new C28388j(this);
        C20245d c20245d2 = this.f114561y;
        if (c20245d2 == null) {
            AbstractC22676k.m65757q("gesturesManager");
            throw null;
        }
        ((C28368n) c20245d2.f76047c).f114407h = c28387i;
        C28383e c28383e = this.f114562z;
        if (c28383e == null) {
            AbstractC22676k.m65757q("moveGestureListener");
            throw null;
        }
        ((C28357c) c20245d2.f76052h).f114407h = c28383e;
        if (c20245d2 == null) {
            AbstractC22676k.m65757q("gesturesManager");
            throw null;
        }
        ((C28369o) c20245d2.f76048d).f114407h = c28385g;
        ((C28363i) c20245d2.f76049e).f114407h = c28384f;
        ((C28364j) c20245d2.f76050f).f114407h = c28386h;
        ((C28360f) c20245d2.f76051g).f114407h = c28388j;
        Cancelable cancelableAddInteraction = m86079k().addInteraction(ClickInteraction.INSTANCE.map(new C28392n(this, 1)));
        LinkedHashSet linkedHashSet = this.f114518G;
        linkedHashSet.add(cancelableAddInteraction);
        linkedHashSet.add(m86079k().addInteraction(LongClickInteraction.INSTANCE.map(new C28392n(this, 2))));
        linkedHashSet.add(m86079k().addInteraction(DragInteraction.INSTANCE.invoke(new C28392n(this, 3), new C28392n(this, 4), new C28392n(this, 5))));
    }

    /* JADX INFO: renamed from: j */
    public final void m86078j() {
        if (this.f114557t0) {
            C30352d c30352d = this.f114516E;
            if (c30352d == null) {
                AbstractC22676k.m65757q("gestureState");
                throw null;
            }
            c30352d.m92809A(EnumC28379a.f114489w);
            this.f114557t0 = false;
        }
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC25964c m86079k() {
        MapboxMap mapboxMap = this.f114521J;
        if (mapboxMap != null) {
            return mapboxMap;
        }
        AbstractC22676k.m65757q("mapInteractionDelegate");
        throw null;
    }

    /* JADX INFO: renamed from: l */
    public final void m86080l(boolean z4, ScreenCoordinate zoomFocalPoint) {
        AbstractC22676k.m65750j(zoomFocalPoint, "zoomFocalPoint");
        m86083o(this.f114551n0);
        C20245d c20245d = this.f114561y;
        if (c20245d == null) {
            AbstractC22676k.m65757q("gesturesManager");
            throw null;
        }
        AbstractC22676k.m65749i((C28369o) c20245d.f76048d, "gesturesManager.standardScaleGestureDetector");
        Iterator it = this.f114529R.iterator();
        if (it.hasNext()) {
            throw AbstractC11266d.m30454h(it);
        }
        MapboxMap mapboxMap = this.f114520I;
        if (mapboxMap == null) {
            AbstractC22676k.m65757q("mapCameraManagerDelegate");
            throw null;
        }
        ValueAnimator[] valueAnimatorArrM86077i = m86077i(mapboxMap.getCameraState().getZoom(), z4 ? 1 : -1, zoomFocalPoint, 300L);
        this.f114551n0 = valueAnimatorArrM86077i;
        m86082n(valueAnimatorArrM86077i);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m86081m(ScreenCoordinate screenCoordinate) {
        String upperCase;
        MapboxStyleManager mapboxStyleManager = this.f114517F;
        StylePropertyValue styleProjectionProperty = mapboxStyleManager != null ? mapboxStyleManager.getStyleProjectionProperty("name") : null;
        if (styleProjectionProperty == null) {
            return false;
        }
        if (styleProjectionProperty.getKind() == StylePropertyValueKind.UNDEFINED) {
            upperCase = "MERCATOR";
        } else {
            Object contents = styleProjectionProperty.getValue().getContents();
            AbstractC22676k.m65748h(contents, "null cannot be cast to non-null type kotlin.String");
            upperCase = ((String) contents).toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        }
        if (!upperCase.equals("MERCATOR")) {
            return false;
        }
        MapboxMap mapboxMap = this.f114519H;
        if (mapboxMap == null) {
            AbstractC22676k.m65757q("mapTransformDelegate");
            throw null;
        }
        double height = 0.04d * ((double) mapboxMap.getSize().getHeight());
        double dMin = Math.min(10.0d, height / ((double) 2));
        double x3 = screenCoordinate.getX();
        double d3 = 0.0d;
        if (Double.isNaN(x3)) {
            MapboxLogger.logE("Gestures", "isPointAboveHorizon: screen coordinate x is NaN.");
            x3 = 0.0d;
        }
        double y13 = screenCoordinate.getY();
        if (Double.isNaN(y13)) {
            MapboxLogger.logE("Gestures", "isPointAboveHorizon: screen coordinate y is NaN.");
        } else {
            d3 = y13;
        }
        ScreenCoordinate screenCoordinate2 = new ScreenCoordinate(x3, d3 - height);
        MapboxMap mapboxMap2 = this.f114520I;
        if (mapboxMap2 == null) {
            AbstractC22676k.m65757q("mapCameraManagerDelegate");
            throw null;
        }
        Point pointCoordinateForPixel = mapboxMap2.coordinateForPixel(screenCoordinate2);
        MapboxMap mapboxMap3 = this.f114520I;
        if (mapboxMap3 != null) {
            return mapboxMap3.pixelForCoordinate(pointCoordinateForPixel).getY() >= screenCoordinate2.getY() + dMin;
        }
        AbstractC22676k.m65757q("mapCameraManagerDelegate");
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public final void m86082n(ValueAnimator[] valueAnimatorArr) {
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            this.f114553p0.add(valueAnimator);
        }
        Handler handler = this.f114556s0;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new RunnableC24693e(this, 6), 150L);
    }

    /* JADX INFO: renamed from: o */
    public final void m86083o(ValueAnimator[] valueAnimatorArr) {
        if (valueAnimatorArr != null) {
            InterfaceC14795a interfaceC14795a = this.f114522K;
            if (interfaceC14795a == null) {
                AbstractC22676k.m65757q("cameraAnimationsPlugin");
                throw null;
            }
            ValueAnimator[] cameraAnimators = (ValueAnimator[]) Arrays.copyOf(valueAnimatorArr, valueAnimatorArr.length);
            AbstractC22676k.m65750j(cameraAnimators, "cameraAnimators");
            AnimationThreadController.INSTANCE.postOnMainThread(new C12986s(cameraAnimators, (C14802h) interfaceC14795a, true, 1));
        }
    }

    @Override // p127ev.InterfaceC13671l
    public final void onSizeChanged(int i13, int i14) {
        this.f114532U = new ScreenCoordinate(i13 / 2, i14 / 2);
        this.f114534W = true;
    }

    public C28393o(Context context, AttributeSet attributeSet, float f13) {
        this.f114560x = 1.0f;
        ScreenCoordinate screenCoordinate = new ScreenCoordinate(0.0d, 0.0d);
        this.f114531T = screenCoordinate;
        this.f114532U = screenCoordinate;
        this.f114533V = screenCoordinate;
        this.f114534W = true;
        this.f114553p0 = new ArrayList();
        this.f114554q0 = new C16999a(2);
        this.f114559w = context;
        this.f114560x = f13;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC28394p.f114563a, 0, 0);
        AbstractC22676k.m65749i(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…ble.mapbox_MapView, 0, 0)");
        try {
            C21317a c21317a = new C21317a(typedArrayObtainStyledAttributes, 5);
            C29572a c29572a = new C29572a();
            c21317a.invoke(c29572a);
            C29573b c29573bM90660a = c29572a.m90660a();
            typedArrayObtainStyledAttributes.recycle();
            this.f114558u0 = c29573bM90660a;
            this.f114556s0 = new Handler(Looper.getMainLooper());
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes.recycle();
            throw th3;
        }
    }
}
