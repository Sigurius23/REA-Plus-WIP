package s52;

import android.app.NotificationManager;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import c12.C3850a;
import c12.C3854e;
import c12.InterfaceC3852c;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.realtime.service.AbstractC9908c;
import ge3.AbstractC15751g;
import java.util.Iterator;
import kh3.C22488a;
import lm2.C24518d;
import lm2.InterfaceC24516b;
import m02.InterfaceC24882a;
import od1.C27843f;
import od1.C27848k;
import or2.AbstractC28171j;
import org.joda.time.DateTime;
import p177gx.C16270a;
import p233ix.C21011a;
import p479s4.AbstractC32122c;
import p92.C29012a;
import p92.C29016e;
import p92.C29017f;
import qp0.C30531a;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import xg3.InterfaceC38281h;
import y82.InterfaceC39338a;

/* JADX INFO: renamed from: s52.f */
/* JADX INFO: loaded from: classes4.dex */
public class C32225f {

    /* JADX INFO: renamed from: i */
    private static final Object f133421i = new Object();

    /* JADX INFO: renamed from: a */
    private final Context f133422a;

    /* JADX INFO: renamed from: b */
    private final C29017f f133423b;

    /* JADX INFO: renamed from: c */
    private final C27843f f133424c;

    /* JADX INFO: renamed from: d */
    private final NotificationManager f133425d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC34116n f133426e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC24882a f133427f;

    /* JADX INFO: renamed from: g */
    private final FeatureFlagChecker f133428g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC3852c f133429h;

    /* JADX INFO: renamed from: s52.f$a */
    /* JADX INFO: loaded from: classes10.dex */
    public class a implements InterfaceC38281h {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C21011a f133430w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C16270a f133431x;

        public a(C21011a c21011a, C16270a c16270a) {
            this.f133430w = c21011a;
            this.f133431x = c16270a;
        }

        @Override // xg3.InterfaceC38281h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(C27848k c27848k) {
            this.f133430w.f79523a = Integer.valueOf(AbstractC9908c.m24286g(c27848k));
            this.f133431x.m46089a();
        }

        @Override // xg3.InterfaceC38281h
        public void onCompleted() {
        }

        @Override // xg3.InterfaceC38281h
        public void onError(Throwable th3) {
            this.f133430w.f79523a = 5;
            this.f133431x.m46089a();
        }
    }

    public C32225f(Context context, C27843f c27843f, InterfaceC34116n interfaceC34116n, FeatureFlagChecker featureFlagChecker, InterfaceC3852c interfaceC3852c, InterfaceC24882a interfaceC24882a) {
        this.f133422a = context;
        this.f133423b = new C29017f(context);
        this.f133424c = c27843f;
        this.f133425d = (NotificationManager) context.getSystemService("notification");
        this.f133426e = interfaceC34116n;
        this.f133428g = featureFlagChecker;
        this.f133429h = interfaceC3852c;
        this.f133427f = interfaceC24882a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m100245c(C21011a c21011a, C16270a c16270a, C27848k c27848k) {
        c21011a.m58579b(Integer.valueOf(AbstractC9908c.m24286g(c27848k)));
        c16270a.m46089a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m100246d(C21011a c21011a, C16270a c16270a, Throwable th3) {
        c21011a.m58579b(5);
        c16270a.m46089a();
    }

    /* JADX INFO: renamed from: e */
    public static void m100247e(Context context) {
        ((InterfaceC39338a) AbstractC15751g.m44472y(InterfaceC39338a.class, null, null)).mo125438a(context);
    }

    /* JADX INFO: renamed from: f */
    private void m100248f(C29012a c29012a, int i13) {
        Context contextForLanguage = AbstractC32122c.getContextForLanguage(this.f133422a);
        String strM24282c = AbstractC9908c.m24282c(contextForLanguage, i13, c29012a.m88156c(), c29012a.m88154a());
        int iM11797b = C3850a.m11797b(c29012a.m88155b());
        this.f133426e.mo85228t("Sending user to AddActivityFragment android-app://com.whoop/editActivity/AddActivity", new AbstractC30556a.a[0]);
        NotificationCompat.Builder contentIntent = this.f133429h.mo11800a(this.f133422a).setContentTitle(AbstractC9908c.m24284e(contextForLanguage, i13)).setContentText(strM24282c).setStyle(new NotificationCompat.BigTextStyle().bigText(strM24282c)).setContentIntent(this.f133427f.mo58973c(this.f133422a, AbstractC28171j.m85282a(C30531a.m93586d(c29012a.m88156c().m88170c(), c29012a.m88154a()))));
        C3854e.SETTINGS_ALERTS.m11805a(contentIntent);
        this.f133425d.notify(iM11797b, contentIntent.build());
    }

    /* JADX INFO: renamed from: h */
    private boolean m100249h(C29012a c29012a) {
        this.f133426e.mo85220k("RealTimeActivitySync", "Attempting to sync activity from " + c29012a.m88156c().m88170c() + " to " + c29012a.m88154a(), new AbstractC30556a.a[0]);
        C29016e c29016eM88156c = c29012a.m88156c();
        if (c29016eM88156c == null) {
            this.f133423b.m88183h(c29012a);
            return true;
        }
        InterfaceC24516b interfaceC24516bM88168a = c29016eM88156c.m88168a();
        DateTime dateTime = new DateTime(c29016eM88156c.m88170c());
        DateTime dateTime2 = new DateTime(c29012a.m88154a());
        C21011a c21011a = new C21011a();
        C16270a c16270a = new C16270a();
        if (interfaceC24516bM88168a instanceof C24518d) {
            ((C24518d) interfaceC24516bM88168a).m71422s(this.f133424c, dateTime, dateTime2, c29016eM88156c.m88173f()).m122652B(C22488a.m64989a().f88182b).m122662L(new C32224e(0, c21011a, c16270a), new C32224e(1, c21011a, c16270a));
        } else {
            interfaceC24516bM88168a.mo71414f(this.f133424c, dateTime, dateTime2).m122652B(C22488a.m64989a().f88182b).m122663M(new a(c21011a, c16270a));
        }
        c16270a.m46090b();
        int iIntValue = ((Integer) c21011a.m58578a()).intValue();
        if (iIntValue == 0) {
            this.f133423b.m88182g(c29012a.m88155b());
            this.f133426e.mo85216g("Activity Sync completed", new AbstractC30556a.a[0]);
            return true;
        }
        if (iIntValue == 5) {
            this.f133426e.mo85222m("Activity Sync returned a recoverable error. Saving for later.", new AbstractC30556a.a[0]);
            return false;
        }
        this.f133426e.mo85222m("Activity Sync returned a failure. Removing and showing notification.", new AbstractC30556a.a[0]);
        this.f133423b.m88182g(c29012a.m88155b());
        m100248f(c29012a, iIntValue);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public boolean m100250g() {
        boolean zM100249h;
        synchronized (f133421i) {
            try {
                Iterator<C29012a> it = this.f133423b.m88179c().iterator();
                zM100249h = true;
                while (it.hasNext()) {
                    zM100249h &= m100249h(it.next());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return zM100249h;
    }
}
