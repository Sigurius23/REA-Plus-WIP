package x41;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Iterator;
import java.util.List;
import p591wp.C37485f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import w41.AbstractC36816p;
import w41.AbstractC36826z;
import w41.C36823w;

/* JADX INFO: renamed from: x41.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lw41/z$a;", "mapState", "Lcom/google/android/gms/maps/model/LatLngBounds;", "a", "(Lw41/z$a;)Lcom/google/android/gms/maps/model/LatLngBounds;", "newBounds", "lastFittedBounds", "", "b", "(Lcom/google/android/gms/maps/model/LatLngBounds;Lcom/google/android/gms/maps/model/LatLngBounds;)Z", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37954b {
    /* JADX INFO: renamed from: a */
    public static final LatLngBounds m121548a(AbstractC36826z.a mapState) {
        LatLng latLng;
        AbstractC22676k.m65750j(mapState, "mapState");
        List<C36823w> listM118032b = AbstractC36816p.m118032b(mapState);
        if (listM118032b.isEmpty()) {
            C36823w currentLocation = mapState.getCurrentLocation();
            if (currentLocation == null || (latLng = AbstractC36816p.m118031a(currentLocation)) == null) {
                latLng = new LatLng(0.0d, 0.0d);
            }
            return new LatLngBounds(latLng, latLng);
        }
        C37485f c37485f = new C37485f();
        c37485f.f160326a = Double.POSITIVE_INFINITY;
        c37485f.f160327b = Double.NEGATIVE_INFINITY;
        c37485f.f160328c = Double.NaN;
        c37485f.f160329d = Double.NaN;
        Iterator<T> it = listM118032b.iterator();
        while (it.hasNext()) {
            c37485f.m120171b(AbstractC36816p.m118031a((C36823w) it.next()));
        }
        return c37485f.m120170a();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public static final boolean m121549b(LatLngBounds newBounds, LatLngBounds latLngBounds) {
        AbstractC22676k.m65750j(newBounds, "newBounds");
        return (latLngBounds != null && latLngBounds.m15633b(newBounds.f20616w) && latLngBounds.m15633b(newBounds.f20617x)) ? false : true;
    }
}
