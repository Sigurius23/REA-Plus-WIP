package wk2;

import android.location.Location;
import fv1.C14814b;
import m83.AbstractC25265s;
import or2.C28187o0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p92.C29019h;
import w41.C36823w;

/* JADX INFO: renamed from: wk2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lwk2/g;", "", "Lor2/o0;", "kalmanFilter", "<init>", "(Lor2/o0;)V", "Lwk2/f;", "previous", "Lfv1/b;", "location", "a", "(Lwk2/f;Lfv1/b;)Lwk2/f;", "Ll83/a0;", "b", "()V", "Lor2/o0;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37346g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C28187o0 kalmanFilter;

    public C37346g(C28187o0 kalmanFilter) {
        AbstractC22676k.m65750j(kalmanFilter, "kalmanFilter");
        this.kalmanFilter = kalmanFilter;
    }

    /* JADX INFO: renamed from: a */
    public final C37345f m119591a(C37345f previous, C14814b location) {
        AbstractC22676k.m65750j(previous, "previous");
        AbstractC22676k.m65750j(location, "location");
        Location location2 = this.kalmanFilter.m85309a(new C29019h.a(AbstractC37347h.m119594b(location), location.getTimestamp())).getLocation();
        C36823w c36823w = new C36823w(location2.getLatitude(), location2.getLongitude());
        Location lastAcceptedLocation = previous.getLastAcceptedLocation();
        if (lastAcceptedLocation == null) {
            return C37345f.m119585b(previous, AbstractC25265s.m74128f1(c36823w, previous.m119588d()), c36823w, 0.0d, new Location(location2), 4, null);
        }
        float fDistanceTo = lastAcceptedLocation.distanceTo(location2);
        return fDistanceTo > 1.0f ? previous.m119586a(AbstractC25265s.m74128f1(c36823w, previous.m119588d()), c36823w, previous.getDistanceMeters() + ((double) fDistanceTo), new Location(location2)) : C37345f.m119585b(previous, null, c36823w, 0.0d, null, 13, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m119592b() {
        this.kalmanFilter.m85310b();
    }

    public /* synthetic */ C37346g(C28187o0 c28187o0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C28187o0() : c28187o0);
    }
}
