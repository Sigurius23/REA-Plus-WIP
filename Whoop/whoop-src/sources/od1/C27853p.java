package od1;

import com.whoop.data.onboarding.C6529c;
import com.whoop.domain.model.Session;
import com.whoop.service.store.SessionStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import n92.InterfaceC26483e;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import u92.C34660d;
import y92.C39353b;

/* JADX INFO: renamed from: od1.p */
/* JADX INFO: loaded from: classes4.dex */
public class C27853p {

    /* JADX INFO: renamed from: a */
    private final SessionStore f112207a;

    /* JADX INFO: renamed from: b */
    private final C27858u f112208b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC34116n f112209c;

    /* JADX INFO: renamed from: d */
    private final Map<Integer, Session> f112210d;

    /* JADX INFO: renamed from: e */
    private Session f112211e;

    /* JADX INFO: renamed from: f */
    private final C34660d f112212f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC26483e f112213g;

    /* JADX INFO: renamed from: h */
    private final C27847j f112214h;

    /* JADX INFO: renamed from: i */
    private final C39353b f112215i;

    public C27853p(SessionStore sessionStore, C27858u c27858u, C34660d c34660d, InterfaceC26483e interfaceC26483e, C27847j c27847j, C39353b c39353b) {
        InterfaceC34116n interfaceC34116nM107846d = InterfaceC34116n.m107846d("SessionMgr");
        this.f112209c = interfaceC34116nM107846d;
        HashMap map = new HashMap();
        this.f112210d = map;
        this.f112207a = sessionStore;
        this.f112208b = c27858u;
        this.f112212f = c34660d;
        this.f112213g = interfaceC26483e;
        this.f112214h = c27847j;
        this.f112215i = c39353b;
        m83997f();
        Session session = this.f112211e;
        if (session == null || map.get(Integer.valueOf(session.getUser().getId())) == null) {
            c27858u.m84063r(null);
            c27858u.m84062q(null);
        } else {
            interfaceC34116nM107846d.mo85219j("Starting session for " + this.f112211e, new AbstractC30556a.a[0]);
            c27858u.m84063r(this.f112211e);
            c27858u.m84062q(this.f112211e);
            c39353b.m125487d(this.f112211e);
        }
        c27858u.m84059j().m122680p(new C6529c(this, 14));
    }

    /* JADX INFO: renamed from: c */
    private void m83995c() {
        StringBuilder sb4 = new StringBuilder();
        Iterator<Session> it = this.f112210d.values().iterator();
        while (it.hasNext()) {
            sb4.append(it.next());
            sb4.append(", ");
        }
        this.f112209c.mo85212b(".dumpSessions", "List of sessions: " + sb4.toString(), new AbstractC30556a.a[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m83996e(C27858u.a aVar) {
        Session newSession = aVar.getNewSession();
        if (newSession != null) {
            this.f112210d.put(Integer.valueOf(newSession.getUser().getId()), newSession);
            this.f112211e = newSession;
        }
        m83998h();
    }

    /* JADX INFO: renamed from: f */
    private synchronized void m83997f() {
        try {
            for (Session session : this.f112207a.m24778b()) {
                this.f112210d.put(Integer.valueOf(session.getUser().getId()), session);
            }
            m83995c();
            this.f112211e = this.f112207a.m24777a();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: h */
    private synchronized void m83998h() {
        this.f112207a.m24780d(this.f112210d.values());
        Session session = this.f112211e;
        if (session != null) {
            this.f112207a.m24779c(session);
        }
    }

    /* JADX INFO: renamed from: i */
    private synchronized void m83999i(Session session) {
        if (!this.f112210d.containsKey(Integer.valueOf(session.getUser().getId()))) {
            throw new IllegalArgumentException("specified Session is not a currently logged in Session");
        }
        this.f112208b.m84064s(session);
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m84000b(Session session) {
        this.f112209c.mo85212b(".addSession", "Adding session for " + session, new AbstractC30556a.a[0]);
        this.f112210d.put(Integer.valueOf(session.getUser().getId()), session);
        this.f112213g.mo78530d(session.getUser().getEmailAddress());
        m83995c();
        m83999i(session);
    }

    /* JADX INFO: renamed from: d */
    public C27858u m84001d() {
        return this.f112208b;
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m84002g(Session session) {
        try {
            this.f112209c.mo85212b(".logout", "Removing session for " + session, new AbstractC30556a.a[0]);
            this.f112210d.remove(Integer.valueOf(session.getUser().getId()));
            m83995c();
            this.f112212f.m109545x();
            Session sessionM84057h = this.f112208b.m84057h();
            if (sessionM84057h == null || !sessionM84057h.getUser().equals(session.getUser())) {
                m83998h();
            } else {
                this.f112208b.m84064s(!this.f112210d.isEmpty() ? (Session) this.f112210d.values().toArray()[0] : null);
                this.f112213g.mo78527a();
                this.f112214h.m83955d();
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
