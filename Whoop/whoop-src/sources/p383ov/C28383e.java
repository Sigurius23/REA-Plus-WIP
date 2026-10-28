package p383ov;

import android.graphics.PointF;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.PlatformEventInfo;
import com.mapbox.maps.PlatformEventType;
import com.mapbox.maps.ScreenCoordinate;
import io.sentry.android.replay.video.C20245d;
import java.util.ArrayList;
import p382ou.C28357c;
import p382ou.C28364j;
import p406pv.C29573b;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ov.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C28383e {

    /* JADX INFO: renamed from: a */
    public C28357c f114495a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28393o f114496b;

    public C28383e(C28393o c28393o) {
        this.f114496b = c28393o;
    }

    /* JADX INFO: renamed from: a */
    public final void m86075a(C28357c c28357c, float f13, float f14) {
        ArrayList arrayList = c28357c.f114425l;
        if (!(f13 == 0.0f && f14 == 0.0f) && arrayList.size() <= 2) {
            C28393o c28393o = this.f114496b;
            if (c28393o.f114558u0.f120672Q || arrayList.size() <= 1) {
                C20245d c20245d = c28393o.f114561y;
                if (c20245d == null) {
                    AbstractC22676k.m65757q("gesturesManager");
                    throw null;
                }
                if (((C28364j) c20245d.f76050f).f114435q) {
                    return;
                }
                PointF pointF = c28357c.f114427n;
                double d3 = pointF.x;
                double d14 = pointF.y;
                if (Double.isInfinite(d3) || Double.isNaN(d3) || Double.isInfinite(d14) || Double.isNaN(d14)) {
                    MapboxLogger.logE("Gestures", "Invalid focal point=" + c28357c.f114427n + " to perform map panning!");
                    return;
                }
                if (Float.isInfinite(f13) || Float.isNaN(f13) || Float.isInfinite(f14) || Float.isNaN(f14)) {
                    MapboxLogger.logE("Gestures", AbstractC31061c.m95638n("Invalid distanceX=", f13, " or distanceY=", f14, " to perform map panning!"));
                    return;
                }
                if (c28393o.m86081m(new ScreenCoordinate(d3, d14))) {
                    return;
                }
                C29573b c29573b = c28393o.f114558u0;
                AbstractC22676k.m65750j(c29573b, "<this>");
                double d15 = c29573b.f120661F == 2 ? 0.0d : f13;
                C29573b c29573b2 = c28393o.f114558u0;
                AbstractC22676k.m65750j(c29573b2, "<this>");
                c28393o.m86079k().dispatch(new PlatformEventInfo(PlatformEventType.DRAG, new ScreenCoordinate(d3 - d15, d14 - (c29573b2.f120661F != 1 ? f14 : 0.0d))));
            }
        }
    }
}
