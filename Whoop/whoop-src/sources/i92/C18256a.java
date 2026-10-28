package i92;

import com.whoop.data.remote.domain.request.UserStateRequestBody;
import com.whoop.domain.model.RouteSummary;
import com.whoop.service.network.ActivitiesApi;
import com.whoop.service.network.GpsServiceApi;
import com.whoop.service.network.model.Sport;
import com.whoop.service.network.model.UserState;
import com.whoop.service.network.model.cycles.PostSleepDtoV2;
import com.whoop.service.network.model.cycles.SleepActivity;
import com.whoop.service.network.model.cycles.SleepActivityResponseV2;
import com.whoop.service.network.model.cycles.Workout;
import ga0.C15619c;
import io.getstream.chat.android.client.parser2.adapters.internal.StreamDateFormatter;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p031b9.AbstractC2875y;
import p213i7.C18194g;
import p92.C29019h;
import pg3.C29218v0;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import ud3.C34850x0;
import xg3.C38280g;

/* JADX INFO: renamed from: i92.a */
/* JADX INFO: loaded from: classes4.dex */
public class C18256a {

    /* JADX INFO: renamed from: a */
    private final ActivitiesApi f71053a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC34116n f71054b;

    /* JADX INFO: renamed from: c */
    private final C15619c f71055c;

    /* JADX INFO: renamed from: d */
    private final GpsServiceApi f71056d;

    public C18256a(ActivitiesApi activitiesApi, GpsServiceApi gpsServiceApi, InterfaceC34116n interfaceC34116n, C15619c c15619c) {
        this.f71053a = activitiesApi;
        this.f71056d = gpsServiceApi;
        this.f71054b = interfaceC34116n;
        this.f71055c = c15619c;
    }

    /* JADX INFO: renamed from: b */
    private static PostSleepDtoV2 m52586b(boolean z4, DateTime dateTime, DateTime dateTime2) {
        DateTimeZone dateTimeZone = DateTimeZone.UTC;
        return new PostSleepDtoV2(AbstractC2875y.m8300m("[", dateTime.withZone(dateTimeZone).toString(StreamDateFormatter.DATE_FORMAT), ", ", dateTime2.withZone(dateTimeZone).toString(StreamDateFormatter.DATE_FORMAT), ")"), dateTime.getZone().getID(), "USER", m52587c(Boolean.valueOf(z4)), null);
    }

    /* JADX INFO: renamed from: c */
    public static String m52587c(Boolean bool) {
        return bool.booleanValue() ? "nap" : UserState.States.SLEEP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static C29218v0 m52588d(C29218v0 c29218v0) {
        Object obj;
        C34850x0 c34850x0 = c29218v0.f118269a;
        return (!c34850x0.f146788Q || (obj = c29218v0.f118270b) == null) ? C29218v0.m88723a(c34850x0.f146792z, c29218v0.f118271c) : C29218v0.m88725c(((SleepActivityResponseV2) obj).toSleepActivity());
    }

    /* JADX INFO: renamed from: e */
    public C38280g<C29218v0<SleepActivity>> m52589e(boolean z4, DateTime dateTime, DateTime dateTime2) {
        return AbstractC18274s.m52649n(this.f71053a.postSleepV2(m52586b(z4, dateTime, dateTime2)).m122682x(new C18194g(5)), "PostSleepV2");
    }

    /* JADX INFO: renamed from: f */
    public C38280g<C29218v0<Workout>> m52590f(Sport sport, DateTime dateTime, DateTime dateTime2, Boolean bool) {
        return AbstractC18274s.m52649n(this.f71055c.m43944h(sport.getId(), dateTime, dateTime2, bool.booleanValue()), "new Post Workout");
    }

    /* JADX INFO: renamed from: g */
    public C38280g<C29218v0<Boolean>> m52591g(DateTime dateTime, DateTime dateTime2, List<C29019h.a> list) {
        RouteSummary routeSummary = new RouteSummary(dateTime, dateTime2, list);
        this.f71054b.mo85228t("CycleWs summary:" + routeSummary, new AbstractC30556a.a[0]);
        return AbstractC18274s.m52649n(this.f71056d.postGpsData(routeSummary.toRouteSummaryDto()), "Post Workout");
    }

    /* JADX INFO: renamed from: h */
    public C38280g<C29218v0<UserState>> m52592h(String str, com.whoop.data.remote.domain.request.UserState userState) {
        return AbstractC18274s.m52649n(this.f71053a.setUserStateWithRxJava(new UserStateRequestBody(userState)), "Set User State");
    }
}
