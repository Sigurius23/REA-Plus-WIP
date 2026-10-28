package od1;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import com.whoop.domain.model.Session;
import com.whoop.domain.model.User;
import com.whoop.service.network.UsersPreferenceApi;
import com.whoop.service.network.model.ProfileDto;
import com.whoop.service.network.model.UserPreferences;
import com.whoop.service.network.model.UserProfileStatistics;
import i92.C18267l;
import i92.C18270o;
import io.sentry.okhttp.C20450b;
import l83.C23465k;
import or2.C28169i0;
import pg3.C29218v0;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import u92.C34660d;
import u92.C34662f;
import xg3.C38280g;
import ze1.C40588d;

/* JADX INFO: renamed from: od1.x */
/* JADX INFO: loaded from: classes4.dex */
public class C27861x implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: F */
    private final C27862y f112258F;

    /* JADX INFO: renamed from: w */
    private final C18267l f112259w;

    /* JADX INFO: renamed from: x */
    private final C27858u f112260x;

    /* JADX INFO: renamed from: z */
    private final C34660d f112262z;

    /* JADX INFO: renamed from: y */
    private final C40588d<UserProfileStatistics> f112261y = C40588d.m131622Y();

    /* JADX INFO: renamed from: E */
    private final InterfaceC34116n f112257E = InterfaceC34116n.m107846d("UserMgr");

    public C27861x(C27858u c27858u, Context context, UsersPreferenceApi usersPreferenceApi, C18270o c18270o, C27862y c27862y) {
        this.f112259w = new C18267l(usersPreferenceApi, c18270o);
        this.f112260x = c27858u;
        this.f112258F = c27862y;
        this.f112262z = new C34662f(context, "UserPrefs", c27858u);
        m84083t(m84078g());
        c27858u.m84061n().m122661K(new C27860w(this, 0));
        c27858u.m84059j().m122678n(new C20450b(29)).m122661K(new C27860w(this, 1));
        if (c27858u.m84057h() != null) {
            m84076d();
        }
    }

    /* JADX INFO: renamed from: d */
    private void m84076d() {
        if (System.currentTimeMillis() - m84079n() > 43200000) {
            m84089B();
        }
    }

    /* JADX INFO: renamed from: f */
    private UserProfileStatistics m84077f() {
        return this.f112261y.m131623Z();
    }

    /* JADX INFO: renamed from: g */
    private UserProfileStatistics m84078g() {
        String strM109533j = this.f112262z.m109533j("userProfileStatistics");
        if (TextUtils.isEmpty(strM109533j)) {
            return null;
        }
        return (UserProfileStatistics) C28169i0.m85275e(strM109533j, UserProfileStatistics.class);
    }

    /* JADX INFO: renamed from: n */
    private long m84079n() {
        return m84093l().m109532i("userProfileStatisticsUpdated", 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m84080p(C27858u.a aVar) {
        if (aVar.m84071f()) {
            m84090C();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Boolean m84081q(C27858u.a aVar) {
        return Boolean.valueOf(aVar.m84069d() || aVar.getIsInitialSwitch());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ void m84082r(C27858u.a aVar) {
        m84088A();
    }

    /* JADX INFO: renamed from: t */
    private void m84083t(UserProfileStatistics userProfileStatistics) {
        if (userProfileStatistics != null) {
            m84087z(userProfileStatistics.getRecoveryCount());
        }
        this.f112261y.onNext(userProfileStatistics);
    }

    /* JADX INFO: renamed from: u */
    private void m84084u(UserProfileStatistics userProfileStatistics) {
        m84083t(userProfileStatistics);
        m84086y(userProfileStatistics);
        m84085v(System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: v */
    private void m84085v(long j7) {
        m84093l().m109542u("userProfileStatisticsUpdated", j7);
    }

    /* JADX INFO: renamed from: y */
    private void m84086y(UserProfileStatistics userProfileStatistics) {
        m84093l().m109543v("userProfileStatistics", userProfileStatistics != null ? C28169i0.m85278i(userProfileStatistics) : null);
    }

    /* JADX INFO: renamed from: z */
    private void m84087z(int i13) {
        this.f112261y.onNext(new UserProfileStatistics(i13));
    }

    /* JADX INFO: renamed from: A */
    public void m84088A() {
        Session sessionM84057h = this.f112260x.m84057h();
        if ((sessionM84057h != null ? sessionM84057h.getUser() : null) != null) {
            this.f112258F.m84101d().m122661K(new C27860w(this, 2));
        } else {
            m84084u(null);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m84089B() {
        m84088A();
    }

    /* JADX INFO: renamed from: C */
    public C38280g<C29218v0<ProfileDto>> m84090C() {
        if (this.f112260x.m84057h() != null) {
            return this.f112259w.m52625c();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public int m84091e() {
        UserProfileStatistics userProfileStatisticsM84077f = m84077f();
        if (userProfileStatisticsM84077f != null) {
            return userProfileStatisticsM84077f.getRecoveryCount();
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public C38280g<C29218v0<UserPreferences>> m84092j() {
        return this.f112259w.m52623a();
    }

    /* JADX INFO: renamed from: l */
    public C34660d m84093l() {
        return this.f112262z;
    }

    /* JADX INFO: renamed from: o */
    public void m84094o(C23465k c23465k) {
        if (c23465k == null) {
            this.f112257E.mo85222m("Failed to update user v2", new AbstractC30556a.a[0]);
        } else {
            this.f112260x.m84065t((User) c23465k.f92937w);
            m84084u(new UserProfileStatistics(((Integer) c23465k.f92938x).intValue()));
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(InterfaceC1585g0 interfaceC1585g0) {
        if (this.f112260x.m84058i()) {
            m84090C();
        }
        interfaceC1585g0.getLifecycle().mo4988d(this);
    }

    /* JADX INFO: renamed from: w */
    public C38280g<C29218v0<UserPreferences>> m84095w(boolean z4) {
        return this.f112259w.m52624b(z4);
    }
}
