package p470rv;

import ar.C1916d;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MapboxLocationComponentException;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.util.MathUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import m83.AbstractC25260n;
import p127ev.AbstractC13664e;
import p127ev.C13662c;
import p127ev.C13663d;
import p127ev.C13668i;
import p408q.C29662f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import q30.C29938w0;
import sv.C33026b;
import sv.C33029e;
import sv.C33030f;
import sv.C33031g;
import tv.C34200c;

/* JADX INFO: renamed from: rv.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C31838r {

    /* JADX INFO: renamed from: a */
    public C34200c f131900a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f131901b;

    /* JADX INFO: renamed from: c */
    public final C13668i f131902c;

    /* JADX INFO: renamed from: d */
    public final C29938w0 f131903d;

    /* JADX INFO: renamed from: e */
    public final C29662f f131904e;

    /* JADX INFO: renamed from: f */
    public boolean f131905f;

    /* JADX INFO: renamed from: g */
    public Point f131906g;

    /* JADX INFO: renamed from: h */
    public final C31837q f131907h;

    /* JADX INFO: renamed from: i */
    public double f131908i;

    /* JADX INFO: renamed from: j */
    public final C31837q f131909j;

    /* JADX INFO: renamed from: k */
    public final C1916d f131910k;

    /* JADX INFO: renamed from: l */
    public double f131911l;

    /* JADX INFO: renamed from: m */
    public final C31837q f131912m;

    /* JADX INFO: renamed from: n */
    public InterfaceC31836p f131913n;

    public C31838r(C34200c c34200c, WeakReference weakContext, C13668i delegateProvider, C29938w0 c29938w0, C29662f c29662f) {
        AbstractC22676k.m65750j(weakContext, "weakContext");
        AbstractC22676k.m65750j(delegateProvider, "delegateProvider");
        this.f131900a = c34200c;
        this.f131901b = weakContext;
        this.f131902c = delegateProvider;
        this.f131903d = c29938w0;
        this.f131904e = c29662f;
        this.f131905f = true;
        this.f131907h = new C31837q(this, 2);
        this.f131908i = ((MapboxMap) delegateProvider.f48455b).getCameraState().getBearing();
        this.f131909j = new C31837q(this, 1);
        this.f131910k = new C1916d(this, 14);
        this.f131912m = new C31837q(this, 0);
        this.f131913n = m98910b(this.f131900a);
    }

    /* JADX INFO: renamed from: d */
    public static void m98908d(C31838r c31838r, double[] bearings, int i13) {
        boolean z4 = (i13 & 4) == 0;
        C33029e c33029e = (C33029e) c31838r.f131904e.f121230x;
        AbstractC22676k.m65750j(bearings, "bearings");
        if (c31838r.f131900a.f143468J) {
            c33029e.f137572G = true;
            c31838r.m98909a(bearings, null, z4);
        } else if (c33029e.f137572G) {
            c31838r.m98909a(new double[]{0.0d}, new C31837q(c31838r, 3), z4);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m98909a(double[] bearings, Function1 function1, boolean z4) {
        AbstractC22676k.m65750j(bearings, "bearings");
        if (!z4) {
            if (bearings.length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (Math.abs(bearings[bearings.length - 1] - this.f131908i) < 1.0d) {
                return;
            }
        }
        Object[] objArr = new Object[2];
        double[] dArr = {this.f131908i, 0.0d};
        objArr[0 + 1] = bearings;
        int length = 0;
        int i13 = 0;
        while (true) {
            Object obj = objArr[i13];
            length += obj != null ? ((double[]) obj).length : 1;
            if (i13 == 1) {
                break;
            } else {
                i13++;
            }
        }
        double[] dArr2 = new double[length];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            Object obj2 = objArr[i14];
            if (obj2 != null) {
                if (i15 < i14) {
                    int i17 = i14 - i15;
                    System.arraycopy(dArr, i15, dArr2, i16, i17);
                    i16 += i17;
                }
                int length2 = ((double[]) obj2).length;
                System.arraycopy(obj2, 0, dArr2, i16, length2);
                i16 += length2;
                i15 = i14 + 1;
            }
            if (i14 == 1) {
                break;
            } else {
                i14++;
            }
        }
        if (i15 < 2) {
            System.arraycopy(dArr, i15, dArr2, i16, 2 - i15);
        }
        double[] targets = Arrays.copyOf(dArr2, dArr2.length);
        AbstractC22676k.m65750j(targets, "targets");
        C33029e c33029e = (C33029e) this.f131904e.f121230x;
        Double[] dArrM74061c1 = AbstractC25260n.m74061c1(MathUtils.INSTANCE.prepareOptimalBearingPath(targets));
        c33029e.m104296a(Arrays.copyOf(dArrM74061c1, dArrM74061c1.length), function1);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC31836p m98910b(C34200c c34200c) {
        AbstractC13664e abstractC13664e = c34200c.f143471M;
        if (abstractC13664e instanceof C13662c) {
            WeakReference weakContext = this.f131901b;
            AbstractC22676k.m65750j(weakContext, "weakContext");
            return new C29662f((C13662c) abstractC13664e, weakContext);
        }
        if (abstractC13664e instanceof C13663d) {
            return new C31839s((C13663d) abstractC13664e);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    public final void m98911c(MapboxMap style) {
        String str;
        C29662f c29662f = this.f131904e;
        C33031g c33031g = (C33031g) c29662f.f121228E;
        C33029e c33029e = (C33029e) c29662f.f121230x;
        C33030f c33030f = (C33030f) c29662f.f121231y;
        C33026b c33026b = (C33026b) c29662f.f121232z;
        AbstractC22676k.m65750j(style, "style");
        if (this.f131913n.mo91113f()) {
            return;
        }
        C31837q onBearingUpdated = this.f131909j;
        AbstractC22676k.m65750j(onBearingUpdated, "onBearingUpdated");
        C31837q onAccuracyRadiusUpdated = this.f131912m;
        AbstractC22676k.m65750j(onAccuracyRadiusUpdated, "onAccuracyRadiusUpdated");
        c33030f.getClass();
        Function1 function1 = c33030f.f137567w;
        C31837q c31837q = this.f131907h;
        if (!AbstractC22676k.m65745e(function1, c31837q)) {
            c33030f.f137567w = c31837q;
        }
        c33029e.getClass();
        if (!AbstractC22676k.m65745e(c33029e.f137567w, onBearingUpdated)) {
            c33029e.f137567w = onBearingUpdated;
        }
        c33026b.getClass();
        if (!AbstractC22676k.m65745e(c33026b.f137567w, onAccuracyRadiusUpdated)) {
            c33026b.f137567w = onAccuracyRadiusUpdated;
        }
        InterfaceC31836p renderer = this.f131913n;
        AbstractC22676k.m65750j(renderer, "renderer");
        c33029e.getClass();
        c33029e.f137569y = renderer;
        c33030f.getClass();
        c33030f.f137569y = renderer;
        c33031g.getClass();
        c33031g.f137569y = renderer;
        c33026b.getClass();
        c33026b.f137569y = renderer;
        C34200c c34200c = this.f131900a;
        boolean z4 = c34200c.f143473x;
        c33031g.f137570z = z4;
        c33031g.f137576G = c34200c.f143475z;
        c33031g.f137577H = c34200c.f143474y;
        if (z4) {
            c33031g.m104298d();
        } else {
            c33031g.m104297b();
        }
        c33026b.f137570z = c34200c.f143463E;
        c33026b.f137562G = c34200c.f143464F;
        c33026b.f137563H = c34200c.f143465G;
        Point point = this.f131906g;
        if (point != null) {
            m98912e(new Point[]{point});
        }
        m98908d(this, new double[]{this.f131908i}, 2);
        this.f131913n.mo91078C(this.f131903d);
        this.f131913n.mo91105Y(style);
        AbstractC13664e abstractC13664e = this.f131900a.f143471M;
        if (abstractC13664e instanceof C13662c) {
            str = ((C13662c) abstractC13664e).f48422z;
        } else {
            if (!(abstractC13664e instanceof C13663d)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((C13663d) abstractC13664e).f48423E;
        }
        if (str != null) {
            InterfaceC31836p interfaceC31836p = this.f131913n;
            Expected<String, Value> expectedFromJson = Value.fromJson(str);
            AbstractC22676k.m65749i(expectedFromJson, "fromJson(it)");
            String error = expectedFromJson.getError();
            if (error != null) {
                throw new MapboxLocationComponentException(error);
            }
            Value value = expectedFromJson.getValue();
            if (value == null) {
                throw new MapboxLocationComponentException("Error in parsing expression.");
            }
            interfaceC31836p.mo91089K(value);
        }
        if (this.f131906g == null || !this.f131900a.f143472w) {
            this.f131905f = true;
            this.f131913n.mo91114f0();
        } else {
            this.f131905f = false;
            this.f131913n.mo91109c();
        }
        if (this.f131900a.f143463E) {
            m98913f(new double[]{this.f131911l});
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0037  */
    /* JADX INFO: renamed from: e */
    public final void m98912e(Point[] points) {
        Point[] pointArr;
        AbstractC22676k.m65750j(points, "points");
        if (this.f131900a.f143472w && this.f131905f) {
            this.f131905f = false;
            this.f131913n.mo91109c();
        }
        Point point = this.f131906g;
        if (point != null) {
            C22677k0 c22677k0 = new C22677k0(2);
            c22677k0.m65760a(point);
            c22677k0.m65764e(points);
            ArrayList arrayList = c22677k0.f89339a;
            pointArr = (Point[]) arrayList.toArray(new Point[arrayList.size()]);
            if (pointArr == null) {
                C22677k0 c22677k1 = new C22677k0(2);
                c22677k1.m65764e(points);
                c22677k1.m65764e(points);
                ArrayList arrayList2 = c22677k1.f89339a;
                pointArr = (Point[]) arrayList2.toArray(new Point[arrayList2.size()]);
            }
        } else {
            C22677k0 c22677k2 = new C22677k0(2);
            c22677k2.m65764e(points);
            c22677k2.m65764e(points);
            ArrayList arrayList3 = c22677k2.f89339a;
            pointArr = (Point[]) arrayList3.toArray(new Point[arrayList3.size()]);
        }
        Point[] targets = (Point[]) Arrays.copyOf(pointArr, pointArr.length);
        AbstractC22676k.m65750j(targets, "targets");
        ((C33030f) this.f131904e.f121231y).m104296a(Arrays.copyOf(targets, targets.length), null);
    }

    /* JADX INFO: renamed from: f */
    public final void m98913f(double[] radius) {
        AbstractC22676k.m65750j(radius, "radius");
        Object[] objArr = new Object[2];
        double[] dArr = {this.f131911l, 0.0d};
        objArr[0 + 1] = radius;
        int length = 0;
        int i13 = 0;
        while (true) {
            Object obj = objArr[i13];
            length += obj != null ? ((double[]) obj).length : 1;
            if (i13 == 1) {
                break;
            } else {
                i13++;
            }
        }
        double[] dArr2 = new double[length];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            Object obj2 = objArr[i14];
            if (obj2 != null) {
                if (i15 < i14) {
                    int i17 = i14 - i15;
                    System.arraycopy(dArr, i15, dArr2, i16, i17);
                    i16 += i17;
                }
                int length2 = ((double[]) obj2).length;
                System.arraycopy(obj2, 0, dArr2, i16, length2);
                i16 += length2;
                i15 = i14 + 1;
            }
            if (i14 == 1) {
                break;
            } else {
                i14++;
            }
        }
        if (i15 < 2) {
            System.arraycopy(dArr, i15, dArr2, i16, 2 - i15);
        }
        double[] targets = Arrays.copyOf(dArr2, dArr2.length);
        AbstractC22676k.m65750j(targets, "targets");
        C29662f c29662f = this.f131904e;
        C33026b c33026b = (C33026b) c29662f.f121232z;
        Double[] dArrM74061c1 = AbstractC25260n.m74061c1(targets);
        c33026b.m104296a(Arrays.copyOf(dArrM74061c1, dArrM74061c1.length), null);
        if (radius.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        double d3 = radius[radius.length - 1];
        if (((int) this.f131900a.f143475z) == -1) {
            C13668i c13668i = this.f131902c;
            MapboxMap mapboxMap = (MapboxMap) c13668i.f48456c;
            MapboxMap mapboxMap2 = (MapboxMap) c13668i.f48455b;
            double metersPerPixelAtLatitude = d3 / mapboxMap.getMetersPerPixelAtLatitude(mapboxMap2.getCameraState().getCenter().latitude(), mapboxMap2.getCameraState().getZoom());
            C34200c c34200c = this.f131900a;
            C33031g c33031g = (C33031g) c29662f.f121228E;
            boolean z4 = c34200c.f143473x;
            c33031g.f137570z = z4;
            if (!z4) {
                c33031g.m104297b();
            } else {
                c33031g.f137576G = metersPerPixelAtLatitude;
                c33031g.m104298d();
            }
        }
    }
}
