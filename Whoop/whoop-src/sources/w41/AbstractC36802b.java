package w41;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import p591wp.C37485f;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import x41.AbstractC37954b;

/* JADX INFO: renamed from: w41.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0001\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lw41/z;", "mapState", "Lcom/google/android/gms/maps/model/LatLngBounds;", "a", "(Lw41/z;)Lcom/google/android/gms/maps/model/LatLngBounds;", "Lw41/z$b;", "b", "(Lw41/z$b;)Lcom/google/android/gms/maps/model/LatLngBounds;", "", "Lcom/google/android/gms/maps/model/LatLng;", "c", "(Lw41/z$b;)Ljava/util/List;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36802b {
    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static final LatLngBounds m117940a(AbstractC36826z mapState) {
        AbstractC22676k.m65750j(mapState, "mapState");
        if (mapState instanceof AbstractC36826z.b) {
            return m117941b((AbstractC36826z.b) mapState);
        }
        if (mapState instanceof AbstractC36826z.a) {
            return AbstractC37954b.m121548a((AbstractC36826z.a) mapState);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public static final LatLngBounds m117941b(AbstractC36826z.b mapState) {
        AbstractC22676k.m65750j(mapState, "mapState");
        if (mapState.m118061d().isEmpty()) {
            LatLng latLngM118031a = AbstractC36816p.m118031a(mapState.getStartLatLng());
            return new LatLngBounds(latLngM118031a, latLngM118031a);
        }
        C37485f c37485f = new C37485f();
        c37485f.f160326a = Double.POSITIVE_INFINITY;
        c37485f.f160327b = Double.NEGATIVE_INFINITY;
        c37485f.f160328c = Double.NaN;
        c37485f.f160329d = Double.NaN;
        Iterator<T> it = mapState.m118061d().iterator();
        while (it.hasNext()) {
            c37485f.m120171b(AbstractC36816p.m118031a((C36823w) it.next()));
        }
        return c37485f.m120170a();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public static final List<LatLng> m117942c(AbstractC36826z.b mapState) {
        AbstractC22676k.m65750j(mapState, "mapState");
        List<C36823w> listM118061d = mapState.m118061d();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM118061d, 10));
        Iterator<T> it = listM118061d.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC36816p.m118031a((C36823w) it.next()));
        }
        return arrayList;
    }
}
