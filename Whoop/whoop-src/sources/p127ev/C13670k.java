package p127ev;

import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import l83.C23465k;
import p108e4.AbstractC12682p;
import p439qv.C30646c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ev.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C13670k {

    /* JADX INFO: renamed from: a */
    public final C13668i f48463a;

    /* JADX INFO: renamed from: c */
    public C23465k f48465c;

    /* JADX INFO: renamed from: i */
    public C30646c f48471i;

    /* JADX INFO: renamed from: b */
    public int f48464b = 2;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f48466d = new LinkedHashMap();

    /* JADX INFO: renamed from: e */
    public final CopyOnWriteArraySet f48467e = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: f */
    public final CopyOnWriteArraySet f48468f = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: g */
    public final CopyOnWriteArraySet f48469g = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: h */
    public final CopyOnWriteArraySet f48470h = new CopyOnWriteArraySet();

    public C13670k(C13668i c13668i) {
        this.f48463a = c13668i;
    }

    /* JADX INFO: renamed from: a */
    public final void m38546a(CameraState cameraState) {
        for (InterfaceC13666g interfaceC13666g : this.f48467e) {
            Point center = cameraState.getCenter();
            AbstractC22676k.m65749i(center, "cameraState.center");
            double zoom = cameraState.getZoom();
            double pitch = cameraState.getPitch();
            double bearing = cameraState.getBearing();
            EdgeInsets padding = cameraState.getPadding();
            AbstractC22676k.m65749i(padding, "cameraState.padding");
            interfaceC13666g.mo38528d(center, padding, zoom, pitch, bearing);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m38547b(int i13) {
        if (i13 != this.f48464b) {
            this.f48464b = i13;
            int iM35485e = AbstractC12682p.m35485e(i13);
            LinkedHashMap linkedHashMap = this.f48466d;
            if (iM35485e == 0) {
                for (InterfaceC13669j interfaceC13669j : linkedHashMap.values()) {
                    if (interfaceC13669j instanceof InterfaceC13661b) {
                        ((InterfaceC13661b) interfaceC13669j).onStart();
                    }
                }
                return;
            }
            if (iM35485e != 1) {
                return;
            }
            for (InterfaceC13669j interfaceC13669j2 : linkedHashMap.values()) {
                if (interfaceC13669j2 instanceof InterfaceC13661b) {
                    ((InterfaceC13661b) interfaceC13669j2).onStop();
                }
            }
        }
    }
}
