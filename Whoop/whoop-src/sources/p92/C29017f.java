package p92;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.gson.Gson;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.data.repositories.RestingHeartRate;
import com.whoop.domain.model.StrainRecoveryMapping;
import com.whoop.service.network.model.Sport;
import com.whoop.service.network.model.UserState;
import e50.C12723b;
import ih0.AbstractC18489d0;
import java.util.LinkedList;
import java.util.List;
import lm2.C24517c;
import lm2.C24518d;
import lm2.InterfaceC24516b;
import or2.AbstractC28170i1;
import qr2.AbstractC30556a;
import u92.C34660d;

/* JADX INFO: renamed from: p92.f */
/* JADX INFO: loaded from: classes4.dex */
public class C29017f {

    /* JADX INFO: renamed from: a */
    private C34660d f117408a;

    /* JADX INFO: renamed from: b */
    private Gson f117409b = new Gson();

    public C29017f(Context context) {
        this.f117408a = new C34660d(context, "RealTimeRecording");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00de  */
    /* JADX INFO: renamed from: a */
    private C29016e m88175a(String str) {
        InterfaceC24516b c24518d;
        String strM109533j = this.f117408a.m109533j(m88176e(str, "activityType"));
        String strM109533j2 = this.f117408a.m109533j(m88176e(str, "sport"));
        long jM109532i = this.f117408a.m109532i(m88176e(str, "startTime"), 0L);
        double dM109529f = this.f117408a.m109529f(m88176e(str, "strainGoal"), 0.0d);
        String strM109534k = this.f117408a.m109534k(m88176e(str, "strainMapping"), "");
        boolean zM109528e = this.f117408a.m109528e(m88176e(str, "useGps"), false);
        RestingHeartRate restingHeartRate = new RestingHeartRate(this.f117408a.m109530g(m88176e(str, "restingHr"), 0.0f));
        C24517c c24517c = null;
        if (jM109532i == 0 || TextUtils.isEmpty(strM109533j)) {
            return null;
        }
        StrainRecoveryMapping strainRecoveryMapping = !strM109534k.equals("") ? (StrainRecoveryMapping) this.f117409b.fromJson(strM109534k, StrainRecoveryMapping.class) : null;
        if (strM109533j.equals("nap")) {
            c24517c = new C24517c(true);
        } else {
            if (!strM109533j.equals(UserState.States.SLEEP)) {
                if (strM109533j.equals("workout") && !TextUtils.isEmpty(strM109533j2)) {
                    try {
                        c24518d = new C24518d((Sport) AbstractC28170i1.m85280a(Base64.decode(strM109533j2, 2), Sport.CREATOR));
                    } catch (Exception e5) {
                        C12723b.m35566a().m35569d().mo85221l("RealTimeRecording", "Failed to read workout info", e5, new AbstractC30556a.a[0]);
                        m88177l(null, str);
                        c24518d = c24517c;
                    }
                }
                if (c24518d == null) {
                    C12723b.m35566a().m35569d().mo85225p("RealTimeRecording", "Failed to read activity info", new AbstractC30556a.a[0]);
                }
                return new C29016e(jM109532i, c24518d, strainRecoveryMapping, dM109529f, zM109528e, restingHeartRate);
            }
            c24517c = new C24517c(false);
        }
        c24518d = c24517c;
        if (c24518d == null) {
            C12723b.m35566a().m35569d().mo85225p("RealTimeRecording", "Failed to read activity info", new AbstractC30556a.a[0]);
        }
        return new C29016e(jM109532i, c24518d, strainRecoveryMapping, dM109529f, zM109528e, restingHeartRate);
    }

    /* JADX INFO: renamed from: e */
    private String m88176e(String str, String str2) {
        return AbstractC18489d0.m53370k(str, ":", str2);
    }

    /* JADX INFO: renamed from: l */
    private void m88177l(C29016e c29016e, String str) {
        String strEncodeToString;
        String str2;
        if (c29016e == null) {
            this.f117408a.m109537p(m88176e(str, "activityType"));
            this.f117408a.m109537p(m88176e(str, "sport"));
            this.f117408a.m109537p(m88176e(str, "startTime"));
            this.f117408a.m109537p(m88176e(str, "strainGoal"));
            this.f117408a.m109537p(m88176e(str, "strainMapping"));
            this.f117408a.m109537p(m88176e(str, "useGps"));
            this.f117408a.m109537p(m88176e(str, "restingHr"));
            this.f117408a.m109537p(SharedPreferenceConstants.IS_USING_STRAIN_COACH_IN_REAL_TIME);
            return;
        }
        long jM88170c = c29016e.m88170c();
        double dM88171d = c29016e.m88171d();
        String json = c29016e.m88172e() != null ? this.f117409b.toJson(c29016e.m88172e()) : "";
        InterfaceC24516b interfaceC24516bM88168a = c29016e.m88168a();
        if (interfaceC24516bM88168a instanceof C24517c) {
            str2 = ((C24517c) interfaceC24516bM88168a).m71418s() ? "nap" : UserState.States.SLEEP;
            strEncodeToString = null;
        } else if (interfaceC24516bM88168a instanceof C24518d) {
            try {
                strEncodeToString = Base64.encodeToString(AbstractC28170i1.m85281b(((C24518d) interfaceC24516bM88168a).m71421k()), 2);
                str2 = "workout";
            } catch (Exception e5) {
                C12723b.m35566a().m35569d().mo85215f("RealTimeRecording", "Failed to store Real Time Activity sport", e5, new AbstractC30556a.a[0]);
                m88186k(null);
                return;
            }
        } else {
            str2 = null;
            strEncodeToString = null;
        }
        this.f117408a.m109543v(m88176e(str, "activityType"), str2);
        this.f117408a.m109543v(m88176e(str, "sport"), strEncodeToString);
        this.f117408a.m109542u(m88176e(str, "startTime"), jM88170c);
        this.f117408a.m109539r(m88176e(str, "strainGoal"), dM88171d);
        this.f117408a.m109543v(m88176e(str, "strainMapping"), json);
        this.f117408a.m109538q(m88176e(str, "useGps"), c29016e.m88173f());
        this.f117408a.m109540s(m88176e(str, "restingHr"), c29016e.m88169b().getValue());
        this.f117408a.m109538q(SharedPreferenceConstants.IS_USING_STRAIN_COACH_IN_REAL_TIME, true);
    }

    /* JADX INFO: renamed from: b */
    public C29016e m88178b() {
        return m88175a("CURRENT");
    }

    /* JADX INFO: renamed from: c */
    public synchronized List<C29012a> m88179c() {
        LinkedList linkedList;
        List<String> listM109535l = this.f117408a.m109535l("storedIds");
        linkedList = new LinkedList();
        for (String str : listM109535l) {
            linkedList.add(new C29012a(m88175a(str), this.f117408a.m109532i(m88176e(str, "endTime"), -1L), Integer.parseInt(str)));
        }
        return linkedList;
    }

    /* JADX INFO: renamed from: d */
    public synchronized int m88180d() {
        return this.f117408a.m109535l("storedIds").size();
    }

    /* JADX INFO: renamed from: f */
    public synchronized int m88181f(C29016e c29016e, long j7) {
        int iM109531h;
        iM109531h = this.f117408a.m109531h("lastId", -1) + 1;
        String string = Integer.toString(iM109531h);
        this.f117408a.m109541t("lastId", iM109531h);
        m88177l(c29016e, string);
        this.f117408a.m109542u(m88176e(string, "endTime"), j7);
        List<String> listM109535l = this.f117408a.m109535l("storedIds");
        listM109535l.add(string);
        this.f117408a.m109544w("storedIds", listM109535l);
        return iM109531h;
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m88182g(int i13) {
        String string = Integer.toString(i13);
        m88177l(null, string);
        this.f117408a.m109537p(m88176e(string, "endTime"));
        List<String> listM109535l = this.f117408a.m109535l("storedIds");
        listM109535l.remove(string);
        this.f117408a.m109544w("storedIds", listM109535l);
    }

    /* JADX INFO: renamed from: h */
    public void m88183h(C29012a c29012a) {
        m88182g(c29012a.m88155b());
    }

    /* JADX INFO: renamed from: i */
    public void m88184i() {
        this.f117408a.m109537p("realTimeCalories");
    }

    /* JADX INFO: renamed from: j */
    public void m88185j(double d3) {
        this.f117408a.m109539r("realTimeCalories", d3);
    }

    /* JADX INFO: renamed from: k */
    public void m88186k(C29016e c29016e) {
        m88177l(c29016e, "CURRENT");
    }
}
