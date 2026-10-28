package od1;

import bh3.InterfaceC3255b;
import ch3.C4674b1;
import ch3.C4697n;
import ch3.C4707s;
import com.whoop.data.onboarding.C6529c;
import com.whoop.data.repositories.SportsRepository;
import com.whoop.domain.model.Login;
import com.whoop.service.network.model.Sport;
import com.whoop.service.network.model.SportList;
import io.sentry.CallableC20367i0;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import jh3.C21705f;
import kh3.C22488a;
import lh3.C24079b;
import live.hms.video.factories.C24148c;
import mm.C25680d;
import p031b9.AbstractC2875y;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import u92.C34661e;
import xg3.C38280g;
import xg3.C38289p;
import zg3.C40634a;

/* JADX INFO: renamed from: od1.s */
/* JADX INFO: loaded from: classes4.dex */
public class C27856s {

    /* JADX INFO: renamed from: a */
    private final InterfaceC34116n f112220a = InterfaceC34116n.m107846d("SportMgr");

    /* JADX INFO: renamed from: b */
    private C24079b f112221b;

    /* JADX INFO: renamed from: c */
    private final C24079b f112222c;

    /* JADX INFO: renamed from: d */
    private final C34661e f112223d;

    /* JADX INFO: renamed from: e */
    private final SportsRepository f112224e;

    public C27856s(C34661e c34661e, SportsRepository sportsRepository, InterfaceC27837a0 interfaceC27837a0) {
        this.f112223d = c34661e;
        C24079b c24079bM70996Y = C24079b.m70996Y(null, false);
        this.f112222c = c24079bM70996Y;
        C38280g c38280gM122655E = c24079bM70996Y.m122655E();
        this.f112224e = sportsRepository;
        Objects.requireNonNull(c34661e);
        c38280gM122655E.m122661K(new C6529c(c34661e, 15));
        interfaceC27837a0.mo83915e().m122652B(C40634a.m131874a()).m122662L(new C27855r(this, 2), new C27855r(this, 3));
        m84017o();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m84008g(int i13) {
        return i13 == 71;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m84009h(Sport sport) {
        return sport != null && m84008g(sport.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ C38280g m84010i(List list) {
        if (!list.isEmpty()) {
            return C38280g.m122648u(list);
        }
        this.f112220a.mo85216g("Local store is empty — triggering updateSports()", new AbstractC30556a.a[0]);
        m84017o();
        return this.f112222c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m84011j(Login login) {
        m84017o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m84012k(Throwable th3) {
        this.f112220a.mo85230v("SportMgr getAllSports error", th3, new AbstractC30556a.a[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m84013l(List list) {
        if (list.isEmpty()) {
            this.f112220a.mo85216g("Sports list is empty", new AbstractC30556a.a[0]);
            return;
        }
        this.f112223d.m109547d(list);
        this.f112222c.onNext(list);
        this.f112220a.mo85216g("SportMgr getAllSportV2 sportList success " + m84015n(list), new AbstractC30556a.a[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m84014m(Throwable th3) {
        this.f112220a.mo85222m(AbstractC2875y.m8301n("SportMgr getAllSportsV2 sportList error ", th3), new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: n */
    private static String m84015n(Collection<Sport> collection) {
        StringBuilder sb4 = new StringBuilder("list of ");
        sb4.append(collection.size());
        sb4.append(" sports: {");
        for (Sport sport : collection) {
            sb4.append(sport.getId());
            sb4.append(" ");
            sb4.append(sport.getName());
            sb4.append(", ");
        }
        sb4.append(" }");
        return sb4.toString();
    }

    /* JADX INFO: renamed from: f */
    public C24079b m84016f() {
        if (this.f112221b == null) {
            this.f112221b = C24079b.m70996Y(null, false);
            C34661e c34661e = this.f112223d;
            Objects.requireNonNull(c34661e);
            int i13 = 1;
            final int i14 = 0;
            C4674b1 c4674b1 = new C4674b1(new C38289p(new C4674b1(new C38289p(new C4707s(new CallableC20367i0(c34661e, i13), i13)), C22488a.m64989a().f88182b, 1)), new C25680d(this, 13), i14);
            C21705f.f83334f.m61161f().getClass();
            C38280g c38280gM122682x = C38280g.m122650y(C38280g.m122636V(new C4697n(c4674b1, 1))).m122682x(new C24148c(23));
            final C24079b c24079b = this.f112221b;
            Objects.requireNonNull(c24079b);
            InterfaceC3255b interfaceC3255b = new InterfaceC3255b() { // from class: od1.q
                @Override // bh3.InterfaceC3255b
                /* JADX INFO: renamed from: b */
                public final void mo9472b(Object obj) {
                    switch (i14) {
                        case 0:
                            c24079b.onNext((SportList) obj);
                            break;
                        default:
                            c24079b.onError((Throwable) obj);
                            break;
                    }
                }
            };
            final C24079b c24079b2 = this.f112221b;
            Objects.requireNonNull(c24079b2);
            final int i15 = 1;
            c38280gM122682x.m122662L(interfaceC3255b, new InterfaceC3255b() { // from class: od1.q
                @Override // bh3.InterfaceC3255b
                /* JADX INFO: renamed from: b */
                public final void mo9472b(Object obj) {
                    switch (i15) {
                        case 0:
                            c24079b2.onNext((SportList) obj);
                            break;
                        default:
                            c24079b2.onError((Throwable) obj);
                            break;
                    }
                }
            });
        }
        return this.f112221b;
    }

    /* JADX INFO: renamed from: o */
    public void m84017o() {
        this.f112224e.getSports().m122655E().m122662L(new C27855r(this, 0), new C27855r(this, 1));
    }
}
