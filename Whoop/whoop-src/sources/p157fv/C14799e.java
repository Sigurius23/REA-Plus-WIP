package p157fv;

import android.animation.Animator;
import b30.C2606q3;
import c93.InterfaceC4339a;
import com.mapbox.geojson.Point;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxCameraAnimationException;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.threading.AnimationThreadController;
import com.mapbox.maps.util.MathUtils;
import j93.InterfaceC21493z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import l83.C23454a0;
import lr.RunnableC24693e;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p176gv.AbstractC16218d;
import p176gv.C16219e;
import p176gv.C16220f;
import p694zv.C41160a;
import p694zv.C41161b;
import p694zv.C41162c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import wb3.AbstractC37056f;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: fv.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C14799e extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f54923w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2606q3 f54924x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Animator f54925y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14799e(C2606q3 c2606q3, Animator animator, int i13) {
        super(0);
        this.f54923w = i13;
        this.f54924x = c2606q3;
        this.f54925y = animator;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0276  */
    /* JADX WARN: Code duplicated, block: B:143:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:146:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:159:0x0331  */
    /* JADX WARN: Code duplicated, block: B:161:0x033b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0345  */
    /* JADX WARN: Code duplicated, block: B:181:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x026e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x02f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x02e1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0124  */
    /* JADX WARN: Code duplicated, block: B:65:0x012a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0131  */
    /* JADX WARN: Code duplicated, block: B:70:0x0159 A[LOOP:10: B:68:0x0153->B:70:0x0159, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0177  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b2  */
    @Override // c93.InterfaceC4339a
    public final Object invoke() throws Throwable {
        Throwable th3;
        int length;
        Object[] objArr;
        int i13;
        Object[] array;
        Object obj;
        C16220f c16220f;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        MapboxMap mapboxMap;
        String str;
        int i14 = this.f54923w;
        int i15 = 1;
        Animator animator = this.f54925y;
        C2606q3 c2606q3 = this.f54924x;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i14) {
            case 0:
                C2606q3.m7516a(c2606q3, animator, 1);
                return c23454a0;
            case 1:
                C2606q3.m7516a(c2606q3, animator, 2);
                return c23454a0;
            default:
                C23454a0 c23454a1 = null;
                AbstractC16218d abstractC16218d = animator instanceof AbstractC16218d ? (AbstractC16218d) animator : null;
                if (abstractC16218d != null) {
                    C14802h c14802h = (C14802h) c2606q3.f10158b;
                    if (!abstractC16218d.f61607J) {
                        InterfaceC21493z[] interfaceC21493zArr = C14802h.f54931W;
                        CopyOnWriteArraySet<C41160a> copyOnWriteArraySet = c14802h.f54937J;
                        Object[] objArr2 = abstractC16218d.f61613z;
                        if (objArr2.length == 0) {
                            MapboxLogger.logE("Mbgl-CameraManager", "Skipped animation " + abstractC16218d.mo45908k().name() + " with no targets!");
                        } else {
                            Object center = abstractC16218d.f61612y;
                            if (center == null) {
                                int iOrdinal = abstractC16218d.mo45908k().ordinal();
                                if (iOrdinal == 0) {
                                    MapboxMap mapboxMap2 = c14802h.f54946S;
                                    if (mapboxMap2 == null) {
                                        AbstractC22676k.m65757q("mapCameraManagerDelegate");
                                        throw null;
                                    }
                                    center = mapboxMap2.getCameraState().getCenter();
                                    AbstractC22676k.m65749i(center, "mapCameraManagerDelegate.cameraState.center");
                                } else if (iOrdinal == 1) {
                                    MapboxMap mapboxMap3 = c14802h.f54946S;
                                    if (mapboxMap3 == null) {
                                        AbstractC22676k.m65757q("mapCameraManagerDelegate");
                                        throw null;
                                    }
                                    center = Double.valueOf(mapboxMap3.getCameraState().getZoom());
                                } else if (iOrdinal == 2) {
                                    MapboxMap mapboxMap4 = c14802h.f54946S;
                                    if (mapboxMap4 == null) {
                                        AbstractC22676k.m65757q("mapCameraManagerDelegate");
                                        throw null;
                                    }
                                    center = Double.valueOf(mapboxMap4.getCameraState().getBearing());
                                } else if (iOrdinal == 3) {
                                    MapboxMap mapboxMap5 = c14802h.f54946S;
                                    if (mapboxMap5 == null) {
                                        AbstractC22676k.m65757q("mapCameraManagerDelegate");
                                        throw null;
                                    }
                                    center = Double.valueOf(mapboxMap5.getCameraState().getPitch());
                                } else if (iOrdinal == 4) {
                                    center = new ScreenCoordinate(0.0d, 0.0d);
                                } else {
                                    if (iOrdinal != 5) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    MapboxMap mapboxMap6 = c14802h.f54946S;
                                    if (mapboxMap6 == null) {
                                        AbstractC22676k.m65757q("mapCameraManagerDelegate");
                                        throw null;
                                    }
                                    center = mapboxMap6.getCameraState().getPadding();
                                    AbstractC22676k.m65749i(center, "mapCameraManagerDelegate.cameraState.padding");
                                }
                            }
                            if (abstractC16218d instanceof C16219e) {
                                C16219e c16219e = (C16219e) abstractC16218d;
                                Object[] objArr3 = c16219e.f61613z;
                                if (c16219e.f61614M) {
                                    MathUtils mathUtils = MathUtils.INSTANCE;
                                    int length2 = objArr3.length + 1;
                                    th3 = null;
                                    double[] dArr = new double[length2];
                                    int i16 = 0;
                                    while (i16 < length2) {
                                        dArr[i16] = i16 == 0 ? ((Double) center).doubleValue() : ((Double[]) objArr3)[i16 - 1].doubleValue();
                                        i16++;
                                    }
                                    array = AbstractC25260n.m74061c1(mathUtils.prepareOptimalBearingPath(dArr));
                                } else {
                                    th3 = null;
                                    if (abstractC16218d instanceof C16220f) {
                                        c16220f = (C16220f) abstractC16218d;
                                        if (c16220f.f61616M) {
                                            ArrayList arrayListM74130h1 = AbstractC25265s.m74130h1(AbstractC37056f.m118958J((Point) center), c16220f.f61613z);
                                            arrayList = new ArrayList();
                                            arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayListM74130h1, 10));
                                            it = arrayListM74130h1.iterator();
                                            while (it.hasNext()) {
                                                arrayList2.add(AbstractC37926s0.m121461M((Point) it.next()));
                                            }
                                            for (Point point : AbstractC25265s.m74138n1(arrayList2)) {
                                                if (arrayList.isEmpty()) {
                                                    arrayList.add(point);
                                                } else {
                                                    arrayList.add(AbstractC37926s0.m121458J(point, (Point) AbstractC25265s.m74112P0(arrayList)));
                                                }
                                            }
                                            array = AbstractC25265s.m74138n1(arrayList).toArray(new Point[0]);
                                            AbstractC22676k.m65748h(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                        } else {
                                            length = objArr2.length + 1;
                                            objArr = new Object[length];
                                            for (i13 = 0; i13 < length; i13++) {
                                                if (i13 == 0) {
                                                    obj = center;
                                                } else {
                                                    obj = objArr2[i13 - 1];
                                                }
                                                objArr[i13] = obj;
                                            }
                                            array = objArr;
                                        }
                                    } else {
                                        length = objArr2.length + 1;
                                        objArr = new Object[length];
                                        while (i13 < length) {
                                            if (i13 == 0) {
                                                obj = center;
                                            } else {
                                                obj = objArr2[i13 - 1];
                                            }
                                            objArr[i13] = obj;
                                        }
                                        array = objArr;
                                    }
                                }
                            } else {
                                th3 = null;
                                if (abstractC16218d instanceof C16220f) {
                                    c16220f = (C16220f) abstractC16218d;
                                    if (c16220f.f61616M) {
                                        ArrayList arrayListM74130h2 = AbstractC25265s.m74130h1(AbstractC37056f.m118958J((Point) center), c16220f.f61613z);
                                        arrayList = new ArrayList();
                                        arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayListM74130h2, 10));
                                        it = arrayListM74130h2.iterator();
                                        while (it.hasNext()) {
                                            arrayList2.add(AbstractC37926s0.m121461M((Point) it.next()));
                                        }
                                        while (r7.hasNext()) {
                                            if (arrayList.isEmpty()) {
                                                arrayList.add(point);
                                            } else {
                                                arrayList.add(AbstractC37926s0.m121458J(point, (Point) AbstractC25265s.m74112P0(arrayList)));
                                            }
                                        }
                                        array = AbstractC25265s.m74138n1(arrayList).toArray(new Point[0]);
                                        AbstractC22676k.m65748h(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                    } else {
                                        length = objArr2.length + 1;
                                        objArr = new Object[length];
                                        while (i13 < length) {
                                            if (i13 == 0) {
                                                obj = center;
                                            } else {
                                                obj = objArr2[i13 - 1];
                                            }
                                            objArr[i13] = obj;
                                        }
                                        array = objArr;
                                    }
                                } else {
                                    length = objArr2.length + 1;
                                    objArr = new Object[length];
                                    while (i13 < length) {
                                        if (i13 == 0) {
                                            obj = center;
                                        } else {
                                            obj = objArr2[i13 - 1];
                                        }
                                        objArr[i13] = obj;
                                    }
                                    array = objArr;
                                }
                            }
                            int iOrdinal2 = abstractC16218d.mo45908k().ordinal();
                            if (iOrdinal2 == 0) {
                                int length3 = array.length;
                                int i17 = 0;
                                while (true) {
                                    if (i17 < length3) {
                                        if (Objects.equals((Point) c14802h.f54938K.getValue(c14802h, C14802h.f54931W[0]), array[i17])) {
                                            i17++;
                                        }
                                    }
                                }
                                abstractC16218d.setObjectValues(Arrays.copyOf(array, array.length));
                                for (C41160a c41160a : copyOnWriteArraySet) {
                                    EnumC14804j type = abstractC16218d.mo45908k();
                                    str = abstractC16218d.f61611x;
                                    C41161b c41161b = c41160a.f177569a;
                                    AbstractC22676k.m65750j(type, "type");
                                    if (AbstractC22676k.m65745e(str, "VIEWPORT_CAMERA_OWNER")) {
                                    }
                                }
                                mapboxMap = c14802h.f54947T;
                                if (mapboxMap == null) {
                                    AbstractC22676k.m65757q("mapTransformDelegate");
                                    throw th3;
                                }
                                mapboxMap.setUserAnimationInProgress(true);
                                for (AbstractC16218d abstractC16218d2 : new HashSet(c14802h.f54950w)) {
                                    if (abstractC16218d2.mo45908k() != abstractC16218d.mo45908k()) {
                                    }
                                }
                                if (AnimationThreadController.INSTANCE.getUsingBackgroundThread()) {
                                    abstractC16218d.m45918j(new C14796b(0, c14802h, abstractC16218d));
                                } else {
                                    abstractC16218d.m45918j(new C14796b(0, c14802h, abstractC16218d));
                                }
                                c23454a1 = c23454a0;
                            } else if (iOrdinal2 == 1) {
                                int length4 = array.length;
                                int i18 = 0;
                                while (true) {
                                    if (i18 < length4) {
                                        if (Objects.equals((Double) c14802h.f54939L.getValue(c14802h, C14802h.f54931W[1]), array[i18])) {
                                            i18++;
                                        }
                                    }
                                }
                                abstractC16218d.setObjectValues(Arrays.copyOf(array, array.length));
                                while (r2.hasNext()) {
                                    EnumC14804j type2 = abstractC16218d.mo45908k();
                                    str = abstractC16218d.f61611x;
                                    C41161b c41161b2 = c41160a.f177569a;
                                    AbstractC22676k.m65750j(type2, "type");
                                    if (AbstractC22676k.m65745e(str, "VIEWPORT_CAMERA_OWNER")) {
                                    }
                                }
                                mapboxMap = c14802h.f54947T;
                                if (mapboxMap == null) {
                                    AbstractC22676k.m65757q("mapTransformDelegate");
                                    throw th3;
                                }
                                mapboxMap.setUserAnimationInProgress(true);
                                while (r2.hasNext()) {
                                    if (abstractC16218d2.mo45908k() != abstractC16218d.mo45908k()) {
                                    }
                                }
                                if (AnimationThreadController.INSTANCE.getUsingBackgroundThread()) {
                                    abstractC16218d.m45918j(new C14796b(0, c14802h, abstractC16218d));
                                } else {
                                    abstractC16218d.m45918j(new C14796b(0, c14802h, abstractC16218d));
                                }
                                c23454a1 = c23454a0;
                            } else if (iOrdinal2 == 2) {
                                int length5 = array.length;
                                int i19 = 0;
                                while (true) {
                                    if (i19 < length5) {
                                        if (Objects.equals((Double) c14802h.f54942O.getValue(c14802h, C14802h.f54931W[4]), array[i19])) {
                                            i19++;
                                        }
                                    }
                                }
                                abstractC16218d.setObjectValues(Arrays.copyOf(array, array.length));
                                while (r2.hasNext()) {
                                    EnumC14804j type3 = abstractC16218d.mo45908k();
                                    str = abstractC16218d.f61611x;
                                    C41161b c41161b3 = c41160a.f177569a;
                                    AbstractC22676k.m65750j(type3, "type");
                                    if (AbstractC22676k.m65745e(str, "VIEWPORT_CAMERA_OWNER")) {
                                    }
                                }
                                mapboxMap = c14802h.f54947T;
                                if (mapboxMap == null) {
                                    AbstractC22676k.m65757q("mapTransformDelegate");
                                    throw th3;
                                }
                                mapboxMap.setUserAnimationInProgress(true);
                                while (r2.hasNext()) {
                                    if (abstractC16218d2.mo45908k() != abstractC16218d.mo45908k()) {
                                    }
                                }
                                if (AnimationThreadController.INSTANCE.getUsingBackgroundThread()) {
                                    abstractC16218d.m45918j(new C14796b(0, c14802h, abstractC16218d));
                                } else {
                                    abstractC16218d.m45918j(new C14796b(0, c14802h, abstractC16218d));
                                }
                                c23454a1 = c23454a0;
                            } else if (iOrdinal2 != 3) {
                                if (iOrdinal2 != 4) {
                                    if (iOrdinal2 != 5) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    int length6 = array.length;
                                    int i24 = 0;
                                    while (true) {
                                        if (i24 < length6) {
                                            if (Objects.equals((EdgeInsets) c14802h.f54940M.getValue(c14802h, C14802h.f54931W[2]), array[i24])) {
                                                i24++;
                                            }
                                        }
                                    }
                                }
                                abstractC16218d.setObjectValues(Arrays.copyOf(array, array.length));
                                while (r2.hasNext()) {
                                    EnumC14804j type4 = abstractC16218d.mo45908k();
                                    str = abstractC16218d.f61611x;
                                    C41161b c41161b4 = c41160a.f177569a;
                                    AbstractC22676k.m65750j(type4, "type");
                                    if (AbstractC22676k.m65745e(str, "VIEWPORT_CAMERA_OWNER") && AbstractC22676k.m65745e(str, "Maps-Gestures")) {
                                        c41161b4.f177571F.getClass();
                                        C41162c c41162c = c41161b4.f177570E;
                                        C41162c c41162c2 = C41162c.f177576a;
                                        if (c41162c2.equals(c41162c)) {
                                            continue;
                                        } else {
                                            C41162c c41162c3 = c41161b4.f177570E;
                                            c41161b4.f177570E = c41162c2;
                                            Iterator it3 = c41161b4.f177573x.iterator();
                                            while (it3.hasNext()) {
                                                if (it3.next() != null) {
                                                    throw new ClassCastException();
                                                }
                                                c41161b4.f177572w.post(new RunnableC24693e(c41162c3, 28));
                                            }
                                        }
                                    }
                                }
                                mapboxMap = c14802h.f54947T;
                                if (mapboxMap == null) {
                                    AbstractC22676k.m65757q("mapTransformDelegate");
                                    throw th3;
                                }
                                mapboxMap.setUserAnimationInProgress(true);
                                while (r2.hasNext()) {
                                    if (abstractC16218d2.mo45908k() != abstractC16218d.mo45908k() && abstractC16218d2.isRunning() && !abstractC16218d2.equals(abstractC16218d)) {
                                        for (C41160a c41160a2 : copyOnWriteArraySet) {
                                            EnumC14804j type5 = abstractC16218d.mo45908k();
                                            c41160a2.getClass();
                                            AbstractC22676k.m65750j(type5, "type");
                                        }
                                        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C14797c(abstractC16218d2, i15));
                                    }
                                }
                                if (AnimationThreadController.INSTANCE.getUsingBackgroundThread() || abstractC16218d.getDuration() != 0) {
                                    abstractC16218d.m45918j(new C14796b(0, c14802h, abstractC16218d));
                                }
                                c23454a1 = c23454a0;
                            } else {
                                int length7 = array.length;
                                int i25 = 0;
                                while (true) {
                                    if (i25 < length7) {
                                        if (Objects.equals((Double) c14802h.f54943P.getValue(c14802h, C14802h.f54931W[5]), array[i25])) {
                                            i25++;
                                        }
                                    }
                                }
                                abstractC16218d.setObjectValues(Arrays.copyOf(array, array.length));
                                while (r2.hasNext()) {
                                    EnumC14804j type6 = abstractC16218d.mo45908k();
                                    str = abstractC16218d.f61611x;
                                    C41161b c41161b5 = c41160a.f177569a;
                                    AbstractC22676k.m65750j(type6, "type");
                                    if (AbstractC22676k.m65745e(str, "VIEWPORT_CAMERA_OWNER")) {
                                    }
                                }
                                mapboxMap = c14802h.f54947T;
                                if (mapboxMap == null) {
                                    AbstractC22676k.m65757q("mapTransformDelegate");
                                    throw th3;
                                }
                                mapboxMap.setUserAnimationInProgress(true);
                                while (r2.hasNext()) {
                                    if (abstractC16218d2.mo45908k() != abstractC16218d.mo45908k()) {
                                    }
                                }
                                if (AnimationThreadController.INSTANCE.getUsingBackgroundThread()) {
                                    abstractC16218d.m45918j(new C14796b(0, c14802h, abstractC16218d));
                                } else {
                                    abstractC16218d.m45918j(new C14796b(0, c14802h, abstractC16218d));
                                }
                                c23454a1 = c23454a0;
                            }
                        }
                        abstractC16218d.f61609L = true;
                    }
                    return c23454a0;
                }
                if (c23454a1 == null) {
                    throw new MapboxCameraAnimationException("Could not start animation as it must be an instance of CameraAnimator and not null!");
                }
                return c23454a0;
        }
    }
}
