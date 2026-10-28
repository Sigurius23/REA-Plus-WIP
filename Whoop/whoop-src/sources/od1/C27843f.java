package od1;

import androidx.lifecycle.DefaultLifecycleObserver;
import bh3.InterfaceC3260g;
import com.whoop.service.network.model.Sport;
import com.whoop.service.network.model.UserState;
import com.whoop.service.network.model.cycles.Activity;
import com.whoop.service.network.model.cycles.SleepActivity;
import com.whoop.service.network.model.cycles.Workout;
import i92.C18256a;
import java.util.List;
import live.hms.video.factories.C24148c;
import lm2.C24515a;
import lm2.C24517c;
import lm2.C24518d;
import org.joda.time.DateTime;
import p92.C29019h;
import pg3.C29218v0;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import xg3.C38280g;
import ze1.C40588d;

/* JADX INFO: renamed from: od1.f */
/* JADX INFO: loaded from: classes4.dex */
public class C27843f implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: w */
    private final C18256a f112153w;

    /* JADX INFO: renamed from: y */
    private final InterfaceC34116n f112155y = InterfaceC34116n.m107846d("CycleMgr");

    /* JADX INFO: renamed from: x */
    private final C24515a f112154x = new C24515a();

    public C27843f(C18256a c18256a) {
        this.f112153w = c18256a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ C27848k m83937d(Activity activity, boolean z4, C29218v0 c29218v0) {
        C27848k c27848k = new C27848k(activity, c29218v0);
        if (c27848k.m83961c()) {
            this.f112154x.m71412e(new C24517c(z4));
        }
        return c27848k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ C27848k m83938e(Activity activity, Sport sport, C29218v0 c29218v0) {
        C27848k c27848k = new C27848k(activity, c29218v0);
        if (c27848k.m83961c()) {
            this.f112154x.m71412e(new C24518d(sport));
        }
        return c27848k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ C27848k m83939f(Activity activity, Sport sport, C29218v0 c29218v0) {
        C27848k c27848k = new C27848k(activity, c29218v0);
        if (c27848k.m83961c()) {
            this.f112154x.m71412e(new C24518d(sport));
        }
        return c27848k;
    }

    /* JADX INFO: renamed from: g */
    public C38280g<Boolean> m83940g(DateTime dateTime, DateTime dateTime2, List<C29019h.a> list) {
        C40588d c40588dM131622Y = C40588d.m131622Y();
        this.f112153w.m52591g(dateTime, dateTime2, list).m122682x(new C24148c(22)).m122663M(c40588dM131622Y);
        return c40588dM131622Y;
    }

    /* JADX INFO: renamed from: j */
    public C38280g<C27848k> m83941j(final boolean z4, DateTime dateTime, DateTime dateTime2) {
        final SleepActivity sleepActivity = new SleepActivity(z4);
        C40588d c40588dM131622Y = C40588d.m131622Y();
        this.f112153w.m52589e(z4, dateTime, dateTime2).m122682x(new InterfaceC3260g() { // from class: od1.e
            @Override // bh3.InterfaceC3260g
            /* JADX INFO: renamed from: b */
            public final Object mo1678b(Object obj) {
                return this.f112150w.m83937d(sleepActivity, z4, (C29218v0) obj);
            }
        }).m122663M(c40588dM131622Y);
        return c40588dM131622Y;
    }

    /* JADX INFO: renamed from: l */
    public C38280g<C27848k> m83942l(Sport sport, DateTime dateTime, DateTime dateTime2) {
        this.f112155y.mo85220k("StrainCoach postingWorkout sport " + sport, " start " + dateTime + " end " + dateTime2, new AbstractC30556a.a[0]);
        Workout workout = new Workout();
        C40588d c40588dM131622Y = C40588d.m131622Y();
        this.f112153w.m52590f(sport, dateTime, dateTime2, Boolean.FALSE).m122682x(new C27841d(this, workout, sport, 1)).m122663M(c40588dM131622Y);
        return c40588dM131622Y;
    }

    /* JADX INFO: renamed from: n */
    public C38280g<C27848k> m83943n(Sport sport, DateTime dateTime, DateTime dateTime2, boolean z4) {
        Workout workout = new Workout();
        C40588d c40588dM131622Y = C40588d.m131622Y();
        this.f112153w.m52590f(sport, dateTime, dateTime2, Boolean.valueOf(z4)).m122682x(new C27841d(this, workout, sport, 0)).m122663M(c40588dM131622Y);
        return c40588dM131622Y;
    }

    /* JADX INFO: renamed from: o */
    public C38280g<C29218v0<UserState>> m83944o(String str, com.whoop.data.remote.domain.request.UserState userState) {
        return this.f112153w.m52592h(str, userState);
    }
}
