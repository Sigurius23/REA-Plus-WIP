package wk2;

import android.location.Location;
import fv1.C14814b;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: wk2.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lfv1/b;", "Landroid/location/Location;", "b", "(Lfv1/b;)Landroid/location/Location;", "track-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37347h {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final Location m119594b(C14814b c14814b) {
        Location location = new Location("track-session");
        location.setLatitude(c14814b.getLatitude());
        location.setLongitude(c14814b.getLongitude());
        location.setAltitude(c14814b.getAltitude());
        location.setAccuracy((float) c14814b.getHorizontalAccuracy());
        location.setTime(c14814b.getTimestamp());
        return location;
    }
}
