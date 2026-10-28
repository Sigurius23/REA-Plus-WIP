package zh1;

import android.location.Location;
import fv1.C14814b;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: zh1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Landroid/location/Location;", "Lfv1/b;", "b", "(Landroid/location/Location;)Lfv1/b;", "gps-tracking_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40643e {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C14814b m131886b(Location location) {
        return new C14814b(location.getLatitude(), location.getLongitude(), location.getAltitude(), location.getAccuracy(), location.getVerticalAccuracyMeters(), location.getTime());
    }
}
