package p087db;

import android.view.AttachedSurfaceControl;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.window.SurfaceSyncGroup;
import androidx.fragment.app.RunnableC1319m;
import p027b3.RunnableC2411n;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: db.h0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11852h0 {

    /* JADX INFO: renamed from: a */
    public SurfaceSyncGroup f38677a;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m31810a(C11852h0 c11852h0, SurfaceView surfaceView, RunnableC1319m runnableC1319m) {
        c11852h0.getClass();
        AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
        if (rootSurfaceControl == null) {
            return;
        }
        SurfaceSyncGroup surfaceSyncGroup = new SurfaceSyncGroup("exo-sync-b-334901521");
        c11852h0.f38677a = surfaceSyncGroup;
        AbstractC35849g.m113807i(surfaceSyncGroup.add(rootSurfaceControl, new RunnableC2411n(1)));
        runnableC1319m.run();
        rootSurfaceControl.applyTransactionOnDraw(new SurfaceControl.Transaction());
    }

    /* JADX INFO: renamed from: b */
    public final void m31811b() {
        SurfaceSyncGroup surfaceSyncGroup = this.f38677a;
        if (surfaceSyncGroup != null) {
            surfaceSyncGroup.markSyncReady();
            this.f38677a = null;
        }
    }
}
