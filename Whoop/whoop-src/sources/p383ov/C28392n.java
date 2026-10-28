package p383ov;

import android.graphics.PointF;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.InteractionContext;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.util.CoreGesturesHandler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import l83.C23454a0;
import p000.AbstractC11266d;
import p157fv.C14802h;
import p157fv.InterfaceC14795a;
import p382ou.C28357c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: ov.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C28392n extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f114513w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C28393o f114514x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28392n(C28393o c28393o, int i13) {
        super(1);
        this.f114513w = i13;
        this.f114514x = c28393o;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f114513w) {
            case 0:
                MapboxStyleManager it = (MapboxStyleManager) obj;
                AbstractC22676k.m65750j(it, "it");
                this.f114514x.f114517F = it;
                return C23454a0.f92919a;
            case 1:
                InteractionContext context = (InteractionContext) obj;
                AbstractC22676k.m65750j(context, "context");
                ScreenCoordinate screenCoordinate = context.getScreenCoordinate();
                AbstractC22676k.m65749i(screenCoordinate, "context.screenCoordinate");
                C28393o c28393o = this.f114514x;
                CopyOnWriteArraySet copyOnWriteArraySet = c28393o.f114524M;
                if (!copyOnWriteArraySet.isEmpty()) {
                    MapboxMap mapboxMap = c28393o.f114520I;
                    if (mapboxMap == null) {
                        AbstractC22676k.m65757q("mapCameraManagerDelegate");
                        throw null;
                    }
                    mapboxMap.coordinateForPixel(screenCoordinate);
                    Iterator it3 = copyOnWriteArraySet.iterator();
                    if (it3.hasNext()) {
                        throw AbstractC11266d.m30454h(it3);
                    }
                }
                return Boolean.TRUE;
            case 2:
                InteractionContext it4 = (InteractionContext) obj;
                AbstractC22676k.m65750j(it4, "it");
                ScreenCoordinate screenCoordinate2 = it4.getScreenCoordinate();
                AbstractC22676k.m65749i(screenCoordinate2, "it.screenCoordinate");
                C28393o c28393o2 = this.f114514x;
                CopyOnWriteArraySet copyOnWriteArraySet2 = c28393o2.f114525N;
                if (!copyOnWriteArraySet2.isEmpty()) {
                    MapboxMap mapboxMap2 = c28393o2.f114520I;
                    if (mapboxMap2 == null) {
                        AbstractC22676k.m65757q("mapCameraManagerDelegate");
                        throw null;
                    }
                    mapboxMap2.coordinateForPixel(screenCoordinate2);
                    Iterator it5 = copyOnWriteArraySet2.iterator();
                    if (it5.hasNext()) {
                        throw AbstractC11266d.m30454h(it5);
                    }
                }
                return Boolean.TRUE;
            case 3:
                AbstractC22676k.m65750j((InteractionContext) obj, "it");
                C28393o c28393o3 = this.f114514x;
                c28393o3.m86076h();
                C28383e c28383e = c28393o3.f114562z;
                if (c28383e == null) {
                    AbstractC22676k.m65757q("moveGestureListener");
                    throw null;
                }
                if (c28383e.f114495a == null) {
                    AbstractC22676k.m65757q("detector");
                    throw null;
                }
                Iterator it6 = c28393o3.f114527P.iterator();
                if (it6.hasNext()) {
                    throw AbstractC11266d.m30454h(it6);
                }
                return Boolean.TRUE;
            case 4:
                InteractionContext it7 = (InteractionContext) obj;
                AbstractC22676k.m65750j(it7, "it");
                ScreenCoordinate screenCoordinate3 = it7.getScreenCoordinate();
                AbstractC22676k.m65749i(screenCoordinate3, "it.screenCoordinate");
                C28393o c28393o4 = this.f114514x;
                C28383e c28383e2 = c28393o4.f114562z;
                if (c28383e2 == null) {
                    AbstractC22676k.m65757q("moveGestureListener");
                    throw null;
                }
                C28357c c28357c = c28383e2.f114495a;
                if (c28357c == null) {
                    AbstractC22676k.m65757q("detector");
                    throw null;
                }
                Iterator it8 = c28393o4.f114527P.iterator();
                if (it8.hasNext()) {
                    throw AbstractC11266d.m30454h(it8);
                }
                PointF pointF = c28357c.f114427n;
                double d3 = pointF.x;
                double d14 = pointF.y;
                CoreGesturesHandler coreGesturesHandler = c28393o4.f114555r0;
                if (coreGesturesHandler == null) {
                    AbstractC22676k.m65757q("coreGesturesHandler");
                    throw null;
                }
                coreGesturesHandler.notifyCoreGestureStarted();
                MapboxMap mapboxMap3 = c28393o4.f114520I;
                if (mapboxMap3 == null) {
                    AbstractC22676k.m65757q("mapCameraManagerDelegate");
                    throw null;
                }
                CameraOptions cameraOptionsCameraForDrag = mapboxMap3.cameraForDrag(new ScreenCoordinate(d3, d14), screenCoordinate3);
                InterfaceC14795a interfaceC14795a = c28393o4.f114522K;
                if (interfaceC14795a == null) {
                    AbstractC22676k.m65757q("cameraAnimationsPlugin");
                    throw null;
                }
                ((C14802h) interfaceC14795a).m42550h(cameraOptionsCameraForDrag, C28393o.f114515v0, null);
                return C23454a0.f92919a;
            default:
                AbstractC22676k.m65750j((InteractionContext) obj, "it");
                C28393o c28393o5 = this.f114514x;
                C28383e c28383e3 = c28393o5.f114562z;
                if (c28383e3 == null) {
                    AbstractC22676k.m65757q("moveGestureListener");
                    throw null;
                }
                if (c28383e3.f114495a == null) {
                    AbstractC22676k.m65757q("detector");
                    throw null;
                }
                Iterator it9 = c28393o5.f114527P.iterator();
                if (it9.hasNext()) {
                    throw AbstractC11266d.m30454h(it9);
                }
                return C23454a0.f92919a;
        }
    }
}
