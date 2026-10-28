package p470rv;

import com.mapbox.common.Cancelable;
import com.mapbox.common.location.LocationObserver;
import dc3.InterfaceC11936u;
import java.util.List;
import m83.AbstractC25265s;
import p550vd.AbstractC35903f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rv.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C31829i implements LocationObserver {

    /* JADX INFO: renamed from: a */
    public boolean f131863a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Cancelable f131864b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC11936u f131865c;

    public C31829i(Cancelable cancelable, InterfaceC11936u interfaceC11936u) {
        this.f131864b = cancelable;
        this.f131865c = interfaceC11936u;
        this.f131863a = cancelable != null;
    }

    @Override // com.mapbox.common.location.LocationObserver
    public final void onLocationUpdateReceived(List locations) {
        AbstractC22676k.m65750j(locations, "locations");
        if (this.f131863a) {
            Cancelable cancelable = this.f131864b;
            if (cancelable != null) {
                cancelable.cancel();
            }
            this.f131863a = false;
        }
        AbstractC35903f.m114004X(this.f131865c, AbstractC25265s.m74112P0(locations));
    }
}
