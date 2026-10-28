package ci1;

import bi1.C3284a;
import fv1.C14814b;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: ci1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lbi1/a;", "Lfv1/b;", "b", "(Lbi1/a;)Lfv1/b;", "gps-tracking_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4731b {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C14814b m14814b(C3284a c3284a) {
        return new C14814b(c3284a.getLatitude(), c3284a.getLongitude(), c3284a.getAltitude(), c3284a.getHorizontalAccuracyMeters(), c3284a.getVerticalAccuracyMeters(), c3284a.getTimestamp());
    }
}
