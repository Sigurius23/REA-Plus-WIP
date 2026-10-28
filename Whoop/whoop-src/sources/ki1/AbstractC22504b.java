package ki1;

import android.location.Location;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yh1.C39540a;
import yh1.C39541b;

/* JADX INFO: renamed from: ki1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Landroid/location/Location;", "", "trigger", "Lyh1/a;", "a", "(Landroid/location/Location;Ljava/lang/String;)Lyh1/a;", "gps-tracking_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22504b {
    /* JADX INFO: renamed from: a */
    public static final C39540a m65007a(Location location, String str) {
        AbstractC22676k.m65750j(location, "<this>");
        return new C39540a(location.getTime(), location.getLatitude(), location.getLongitude(), location.getAltitude(), location.getAccuracy(), location.getVerticalAccuracyMeters(), location.hasSpeed() ? C39541b.Companion.m126317b(C39541b.INSTANCE, location.getSpeed(), null, location.hasSpeedAccuracy() ? location.getSpeedAccuracyMetersPerSecond() : 0.0d, 2, null) : null, str);
    }
}
