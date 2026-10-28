package w41;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: w41.p */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lw41/w;", "Lcom/google/android/gms/maps/model/LatLng;", "a", "(Lw41/w;)Lcom/google/android/gms/maps/model/LatLng;", "Lw41/z$a;", "", "b", "(Lw41/z$a;)Ljava/util/List;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36816p {
    /* JADX INFO: renamed from: a */
    public static final LatLng m118031a(C36823w c36823w) {
        AbstractC22676k.m65750j(c36823w, "<this>");
        return new LatLng(c36823w.getLatitude(), c36823w.getLongitude());
    }

    /* JADX INFO: renamed from: b */
    public static final List<C36823w> m118032b(AbstractC36826z.a aVar) {
        C36823w c36823w;
        AbstractC22676k.m65750j(aVar, "<this>");
        List<C36823w> listM118056e = aVar.m118056e();
        C36823w currentLocation = aVar.getCurrentLocation();
        return (currentLocation == null || (c36823w = (C36823w) AbstractC25265s.m74114R0(listM118056e)) == null || c36823w.equals(currentLocation)) ? listM118056e : AbstractC25265s.m74128f1(currentLocation, listM118056e);
    }
}
