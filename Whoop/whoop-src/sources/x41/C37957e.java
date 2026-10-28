package x41;

import com.google.android.gms.maps.model.LatLngBounds;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: x41.e */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C37957e implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f162478w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f162479x;

    public /* synthetic */ C37957e(Function1 function1, int i13) {
        this.f162478w = i13;
        this.f162479x = function1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f162478w) {
            case 0:
                return AbstractC37959g.m121566g(this.f162479x, (LatLngBounds) obj);
            case 1:
                return AbstractC37960h.m121578f(this.f162479x, (LatLngBounds) obj);
            default:
                return AbstractC37960h.m121579g(this.f162479x, (LatLngBounds) obj);
        }
    }
}
