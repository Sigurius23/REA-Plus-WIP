package od1;

import com.whoop.data.repositories.C6656c;
import com.whoop.domain.model.Session;
import com.whoop.domain.model.User;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.InterfaceC23457c;
import lh3.AbstractC24088k;
import lh3.C24079b;
import lh3.C24087j;
import nm1.C26842g;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import xg3.C38280g;
import y00.AbstractC38963t7;
import z92.C40209e;

/* JADX INFO: renamed from: od1.u */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\u0007J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R.\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0013\u0010&\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010*\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010,\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0011\u00100\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, m65681d2 = {"Lod1/u;", "", "<init>", "()V", "Lxg3/g;", "Lod1/u$a;", "j", "()Lxg3/g;", "k", "n", "Lcom/whoop/domain/model/Session;", "session", "Ll83/a0;", "q", "(Lcom/whoop/domain/model/Session;)V", "Lcom/whoop/domain/model/User;", UserState.Sources.USER, "t", "(Lcom/whoop/domain/model/User;)V", "lastActiveSession", "r", "Ltr2/n;", "a", "Ltr2/n;", "logger", "value", "b", "Lcom/whoop/domain/model/Session;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/domain/model/Session;", "s", "c", "Llh3/k;", "d", "Llh3/k;", "contextSwitchSubject", "f", "()Lcom/whoop/domain/model/User;", "currentUser", "", "e", "()Z", "canSyncData", "i", "isLoggedIn", "", "g", "()I", "currentUserIdOrZero", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final class C27858u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger = InterfaceC34116n.INSTANCE.m107848a("UserContext");

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Session session;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Session lastActiveSession;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC24088k contextSwitchSubject;

    /* JADX INFO: renamed from: od1.u$a */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0017\u0010\u000bR\u0011\u0010\u001d\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000bR\u0011\u0010\u001e\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000bR\u0011\u0010\u001f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000bR\u0011\u0010!\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b \u0010\u000b¨\u0006\""}, m65681d2 = {"Lod1/u$a;", "", "Lcom/whoop/domain/model/Session;", "oldSession", "newSession", "lastActiveSession", "", "isInitialSwitch", "<init>", "(Lcom/whoop/domain/model/Session;Lcom/whoop/domain/model/Session;Lcom/whoop/domain/model/Session;Z)V", "g", "()Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/domain/model/Session;", "b", "()Lcom/whoop/domain/model/Session;", "c", "d", "Z", "f", "isUserLogin", "isNewUser", "isLastActiveUser", "e", "isUserChange", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Session oldSession;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Session newSession;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Session lastActiveSession;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean isInitialSwitch;

        public a(Session session, Session session2, Session session3, boolean z4) {
            this.oldSession = session;
            this.newSession = session2;
            this.lastActiveSession = session3;
            this.isInitialSwitch = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Session getNewSession() {
            return this.newSession;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsInitialSwitch() {
            return this.isInitialSwitch;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m84068c() {
            Session session;
            return (this.newSession == null || (session = this.lastActiveSession) == null || session.getUser().getId() != this.newSession.getUser().getId()) ? false : true;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m84069d() {
            if (this.newSession == null) {
                return false;
            }
            Session session = this.oldSession;
            return session == null || session.getUser().getId() != this.newSession.getUser().getId();
        }

        /* JADX INFO: renamed from: e */
        public final boolean m84070e() {
            return !m84068c() && m84069d();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.oldSession, aVar.oldSession) && AbstractC22676k.m65745e(this.newSession, aVar.newSession) && AbstractC22676k.m65745e(this.lastActiveSession, aVar.lastActiveSession) && this.isInitialSwitch == aVar.isInitialSwitch;
        }

        /* JADX INFO: renamed from: f */
        public final boolean m84071f() {
            return (this.isInitialSwitch || this.newSession == null || this.oldSession != null) ? false : true;
        }

        /* JADX INFO: renamed from: g */
        public final boolean m84072g() {
            Session session = this.newSession;
            if (session == null) {
                return false;
            }
            C40209e c40209e = new C40209e(session.getUser());
            Session session2 = this.lastActiveSession;
            if (session2 != null) {
                return !c40209e.equals(new C40209e(session2.getUser()));
            }
            return false;
        }

        public int hashCode() {
            Session session = this.oldSession;
            int iHashCode = (session == null ? 0 : session.hashCode()) * 31;
            Session session2 = this.newSession;
            int iHashCode2 = (iHashCode + (session2 == null ? 0 : session2.hashCode())) * 31;
            Session session3 = this.lastActiveSession;
            return Boolean.hashCode(this.isInitialSwitch) + ((iHashCode2 + (session3 != null ? session3.hashCode() : 0)) * 31);
        }

        public String toString() {
            Session session = this.oldSession;
            Session session2 = this.newSession;
            Session session3 = this.lastActiveSession;
            boolean z4 = this.isInitialSwitch;
            boolean zM84071f = m84071f();
            boolean zM84069d = m84069d();
            boolean zM84068c = m84068c();
            boolean zM84072g = m84072g();
            StringBuilder sb4 = new StringBuilder("oldSession= ");
            sb4.append(session);
            sb4.append(" newSession= ");
            sb4.append(session2);
            sb4.append(" lastActiveSession= ");
            sb4.append(session3);
            sb4.append(" isInitialSwitch=");
            sb4.append(z4);
            sb4.append(" isUserLogin= ");
            AbstractC38963t7.m124392v(sb4, zM84071f, " isNewUser= ", zM84069d, " isLastActiveUser=");
            sb4.append(zM84068c);
            sb4.append(" userInfoUpdated=");
            sb4.append(zM84072g);
            return sb4.toString();
        }
    }

    public C27858u() {
        C24087j c24087jM71002X = C24079b.m70996Y(null, false).m71002X();
        AbstractC22676k.m65749i(c24087jM71002X, "toSerialized(...)");
        this.contextSwitchSubject = c24087jM71002X;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final Boolean m84050l(a obj) {
        AbstractC22676k.m65750j(obj, "obj");
        return Boolean.valueOf(obj.m84070e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final Boolean m84051m(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final Boolean m84052o(a contextSwitch) {
        AbstractC22676k.m65750j(contextSwitch, "contextSwitch");
        return Boolean.valueOf(contextSwitch.m84070e() || contextSwitch.m84072g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final Boolean m84053p(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m84054e() {
        User userM84055f = m84055f();
        if (userM84055f != null) {
            return userM84055f.canUploadData();
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized User m84055f() {
        Session sessionM84057h;
        sessionM84057h = m84057h();
        return sessionM84057h != null ? sessionM84057h.getUser() : null;
    }

    /* JADX INFO: renamed from: g */
    public final int m84056g() {
        User userM84055f = m84055f();
        if (userM84055f != null) {
            return userM84055f.getId();
        }
        return 0;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized Session m84057h() {
        return this.session;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m84058i() {
        return m84057h() != null;
    }

    /* JADX INFO: renamed from: j */
    public final C38280g<a> m84059j() {
        return this.contextSwitchSubject;
    }

    /* JADX INFO: renamed from: k */
    public final C38280g<a> m84060k() {
        C38280g<a> c38280gM122678n = this.contextSwitchSubject.m122678n(new C6656c(new C26842g(9), 20));
        AbstractC22676k.m65749i(c38280gM122678n, "filter(...)");
        return c38280gM122678n;
    }

    /* JADX INFO: renamed from: n */
    public final C38280g<a> m84061n() {
        C38280g<a> c38280gM122678n = this.contextSwitchSubject.m122678n(new C6656c(new C26842g(8), 19));
        AbstractC22676k.m65749i(c38280gM122678n, "filter(...)");
        return c38280gM122678n;
    }

    /* JADX INFO: renamed from: q */
    public final void m84062q(Session session) {
        Session session2;
        synchronized (this) {
            m84064s(session);
            session2 = this.lastActiveSession;
        }
        this.contextSwitchSubject.onNext(new a(null, session, session2, true));
        this.logger.mo85219j("Set initial session to: " + session, new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: r */
    public final void m84063r(Session lastActiveSession) {
        synchronized (this) {
            this.lastActiveSession = lastActiveSession;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m84064s(Session session) {
        Session sessionM84057h;
        Session session2;
        synchronized (this) {
            try {
                sessionM84057h = m84057h();
                this.session = session;
                if (sessionM84057h != null) {
                    this.lastActiveSession = sessionM84057h;
                }
                session2 = this.lastActiveSession;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.contextSwitchSubject.onNext(new a(sessionM84057h, session, session2, false));
        this.logger.mo85219j(".setSession switched from " + sessionM84057h + " to " + session, new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: t */
    public final void m84065t(User user) {
        Session sessionM84057h = m84057h();
        if (sessionM84057h != null) {
            User user2 = sessionM84057h.getUser();
            if (user == null || user2.getId() != user.getId()) {
                return;
            }
            m84064s(new Session(sessionM84057h.getAuthToken(), user));
        }
    }
}
