package p439qv;

import android.view.View;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.InterfaceC1581f0;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1636w0;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxLifecycleObserver;

/* JADX INFO: renamed from: qv.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C30644a implements InterfaceC1581f0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ MapboxLifecycleObserver f126056w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C30648e f126057x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ View f126058y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ ComponentCallbacks2C30645b f126059z;

    public C30644a(MapView mapView, C30648e c30648e, MapView mapView2, ComponentCallbacks2C30645b componentCallbacks2C30645b) {
        this.f126056w = mapView;
        this.f126057x = c30648e;
        this.f126058y = mapView2;
        this.f126059z = componentCallbacks2C30645b;
    }

    @InterfaceC1636w0(EnumC1632v.ON_DESTROY)
    public final void onDestroy() {
        AbstractC1638x lifecycle;
        this.f126056w.onDestroy();
        C30648e c30648e = this.f126057x;
        c30648e.f126066x.mo4988d(this);
        InterfaceC1585g0 interfaceC1585g0 = c30648e.f126068z;
        if (interfaceC1585g0 != null && (lifecycle = interfaceC1585g0.getLifecycle()) != null) {
            lifecycle.mo4988d(c30648e.f126063E);
        }
        View view = (View) c30648e.f126065w.get();
        if (view != null) {
            view.removeOnAttachStateChangeListener(c30648e.f126064F);
        }
        this.f126058y.getContext().unregisterComponentCallbacks(this.f126059z);
    }

    @InterfaceC1636w0(EnumC1632v.ON_START)
    public final void onStart() {
        this.f126056w.onStart();
    }

    @InterfaceC1636w0(EnumC1632v.ON_STOP)
    public final void onStop() {
        this.f126056w.onStop();
    }
}
