package f53;

import a20.C0162b;
import a43.C0384f;
import androidx.lifecycle.AbstractC1638x;
import androidx.room.AbstractC1772c1;
import androidx.room.C1778e;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import c53.C4255a;
import c93.InterfaceC4351m;
import d13.AbstractC11478a;
import d33.C11585c;
import dc3.EnumC11916a;
import e53.C12745d;
import e53.InterfaceC12744c;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13096w1;
import g53.C15509n;
import g53.EnumC15497b;
import io.getstream.android.video.generated.models.ConnectedEvent;
import io.getstream.android.video.generated.models.VideoEvent;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.video.android.model.User;
import io.sentry.internal.debugmeta.C20378c;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import l83.C23470p;
import p003a1.C0109h;
import p027b3.C2471z0;
import p078d1.C11457j;
import p408q.C29662f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import qg3.C30352d;
import r83.EnumC31071a;
import rb3.AbstractC31199g;
import s40.AbstractC32145e0;
import s83.AbstractC32275i;
import u33.C34509b;
import ud3.C34826l0;
import x43.AbstractC37979k;
import x43.C37970b;
import x43.C37972d;
import x43.C37981m;
import x43.InterfaceC37977i;
import z33.C40053b;

/* JADX INFO: renamed from: f53.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C14123k extends AbstractC37979k implements InterfaceC37977i {

    /* JADX INFO: renamed from: a */
    public final C11585c f50763a;

    /* JADX INFO: renamed from: b */
    public final C4255a f50764b;

    /* JADX INFO: renamed from: c */
    public final C12745d f50765c;

    /* JADX INFO: renamed from: d */
    public final C30352d f50766d;

    /* JADX INFO: renamed from: e */
    public final C23470p f50767e;

    /* JADX INFO: renamed from: f */
    public final C13096w1 f50768f;

    /* JADX INFO: renamed from: g */
    public final C13096w1 f50769g;

    /* JADX INFO: renamed from: h */
    public final C13045h2 f50770h;

    /* JADX INFO: renamed from: i */
    public final C14122j f50771i;

    /* JADX INFO: renamed from: j */
    public final C13045h2 f50772j;

    public C14123k(String apiKey, String url, C11585c c11585c, String token, C34826l0 c34826l0, C40053b networkStateProvider, C4255a c4255a, AbstractC1638x lifecycle, InterfaceC12744c tokenProvider, C12745d tokenRepository) {
        AbstractC22676k.m65750j(apiKey, "apiKey");
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(token, "token");
        AbstractC22676k.m65750j(networkStateProvider, "networkStateProvider");
        AbstractC22676k.m65750j(lifecycle, "lifecycle");
        AbstractC22676k.m65750j(tokenProvider, "tokenProvider");
        AbstractC22676k.m65750j(tokenRepository, "tokenRepository");
        this.f50763a = c11585c;
        this.f50764b = c4255a;
        this.f50765c = tokenRepository;
        C11457j c11457j = new C11457j(1);
        C30352d c30352d = new C30352d(tokenRepository);
        this.f50766d = c30352d;
        this.f50767e = AbstractC1772c1.m5382S(this, "Video:Socket");
        EnumC11916a enumC11916a = EnumC11916a.f38983x;
        this.f50768f = AbstractC13091v.m36591a(1, 100, enumC11916a);
        this.f50769g = AbstractC13091v.m36591a(1, 100, enumC11916a);
        this.f50770h = AbstractC13091v.m36593c(null);
        C14122j c14122j = new C14122j(apiKey, url, c30352d, new C29662f(c11457j, c34826l0), c4255a, new C0384f(c4255a, lifecycle), networkStateProvider);
        synchronized (c14122j.f50757k) {
            c14122j.f50757k.add(this);
        }
        this.f50771i = c14122j;
        this.f50772j = c14122j.f50758l.m56594w().f168690e;
        c30352d.f124536y = new C20378c(tokenProvider, tokenRepository);
    }

    @Override // x43.InterfaceC37977i
    /* JADX INFO: renamed from: b */
    public final void mo40217b(C2471z0 c2471z0, InterfaceC4351m interfaceC4351m) {
        AbstractC3006f0.m8732z(this.f50764b, null, null, new C0109h(this, c2471z0, interfaceC4351m, (InterfaceC30057d) null), 3);
    }

    @Override // x43.AbstractC37979k
    /* JADX INFO: renamed from: c */
    public final void mo40218c(VideoEvent videoEvent) {
        ConnectedEvent event = (ConnectedEvent) videoEvent;
        AbstractC22676k.m65750j(event, "event");
        InterfaceC37977i.m121617a(this, new C1778e(this, null, 5));
        C2345k c2345kM40225j = m40225j();
        InterfaceC2339e interfaceC2339e = c2345kM40225j.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM40225j.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM40225j.f9274b.log(enumC2341g, str, "[onConnected] Socket connected with event: " + event, null);
        }
    }

    @Override // x43.AbstractC37979k
    /* JADX INFO: renamed from: d */
    public final void mo40219d() {
        this.f50770h.m36570j(null);
        C2345k c2345kM40225j = m40225j();
        InterfaceC2339e interfaceC2339e = c2345kM40225j.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM40225j.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM40225j.f9274b.log(enumC2341g, str, "[onConnecting] Socket is connecting", null);
        }
    }

    @Override // x43.AbstractC37979k
    /* JADX INFO: renamed from: e */
    public final void mo40220e() {
        C2345k c2345kM40225j = m40225j();
        InterfaceC2339e interfaceC2339e = c2345kM40225j.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM40225j.f9273a;
        InterfaceC30057d interfaceC30057d = null;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM40225j.f9274b.log(enumC2341g, str, "[onCreated] Socket is created", null);
        }
        AbstractC3006f0.m8732z(this.f50764b, null, null, new C0162b(this, interfaceC30057d, 21), 3);
    }

    @Override // x43.AbstractC37979k
    /* JADX INFO: renamed from: f */
    public final void mo40221f(AbstractC32145e0 abstractC32145e0) {
        this.f50770h.m36570j(null);
        C2345k c2345kM40225j = m40225j();
        InterfaceC2339e interfaceC2339e = c2345kM40225j.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM40225j.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = c2345kM40225j.f9274b;
            C34509b c34509b = abstractC32145e0 instanceof C34509b ? (C34509b) abstractC32145e0 : null;
            interfaceC2344j.log(enumC2341g, str, "[onDisconnected] Socket disconnected. Cause: " + (c34509b != null ? c34509b.f145072w : null), null);
        }
    }

    @Override // x43.AbstractC37979k
    /* JADX INFO: renamed from: g */
    public final void mo40222g(C37981m error) {
        AbstractC22676k.m65750j(error, "error");
        C2345k c2345kM40225j = m40225j();
        InterfaceC2339e interfaceC2339e = c2345kM40225j.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = c2345kM40225j.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM40225j.f9274b.log(enumC2341g, str, "[onError] Socket error: " + error, null);
        }
        if (this.f50768f.mo36564a(error)) {
            return;
        }
        C2345k c2345kM40225j2 = m40225j();
        InterfaceC2339e interfaceC2339e2 = c2345kM40225j2.f9275c;
        String str2 = c2345kM40225j2.f9273a;
        if (interfaceC2339e2.isLoggable(enumC2341g, str2)) {
            c2345kM40225j2.f9274b.log(enumC2341g, str2, "[onError] Failed to emit error: " + error, null);
        }
    }

    @Override // x43.AbstractC37979k
    /* JADX INFO: renamed from: h */
    public final void mo40223h(Object obj) {
        VideoEvent event = (VideoEvent) obj;
        AbstractC22676k.m65750j(event, "event");
        C2345k c2345kM40225j = m40225j();
        InterfaceC2339e interfaceC2339e = c2345kM40225j.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM40225j.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM40225j.f9274b.log(enumC2341g, str, "[onEvent] Received event: " + event, null);
        }
        if (this.f50769g.mo36564a(event)) {
            return;
        }
        C2345k c2345kM40225j2 = m40225j();
        InterfaceC2339e interfaceC2339e2 = c2345kM40225j2.f9275c;
        String str2 = c2345kM40225j2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.ERROR;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            c2345kM40225j2.f9274b.log(enumC2341g2, str2, "[onEvent] Failed to emit event: " + event, null);
        }
    }

    /* JADX INFO: renamed from: i */
    public final Object m40224i(User user, AbstractC32275i abstractC32275i) {
        AbstractC31199g c37972d;
        User.Companion.getClass();
        AbstractC22676k.m65750j(user, "<this>");
        boolean zM65745e = AbstractC22676k.m65745e(user.getId(), ChatClient.ANONYMOUS_USER_ID);
        C14122j c14122j = this.f50771i;
        String str = c14122j.f50747a;
        String str2 = c14122j.f50748b;
        C2345k c2345kM40215f = c14122j.m40215f();
        InterfaceC2339e interfaceC2339e = c2345kM40215f.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str3 = c2345kM40215f.f9273a;
        InterfaceC30057d interfaceC30057d = null;
        if (interfaceC2339e.isLoggable(enumC2341g, str3)) {
            c2345kM40215f.f9274b.log(enumC2341g, str3, AbstractC11478a.m30857i("[connectUser] user.id: ", user.getId(), ", isAnonymous: ", zM65745e), null);
        }
        C2996c2 c2996c2 = c14122j.f50759m;
        if (c2996c2 != null) {
            c2996c2.cancel((CancellationException) null);
        }
        c14122j.f50759m = AbstractC3006f0.m8732z(c14122j.f50751e, null, null, new C0109h(c14122j, new C22669g0(), interfaceC30057d, 23), 3);
        C20378c c20378c = c14122j.f50758l;
        if (zM65745e) {
            c37972d = new C37970b(str2, str, user);
        } else {
            if (zM65745e) {
                throw new NoWhenBranchMatchedException();
            }
            c37972d = new C37972d(str2, str, user);
        }
        c20378c.getClass();
        C20378c.f76419E = C20378c.f76420z;
        C20378c.f76420z = 0;
        C2345k c2345kM56591t = c20378c.m56591t();
        InterfaceC2339e interfaceC2339e2 = c2345kM56591t.f9275c;
        String str4 = c2345kM56591t.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str4)) {
            c2345kM56591t.f9274b.log(enumC2341g2, str4, AbstractC11478a.m30857i("[onConnect] user.id: '", c37972d.mo96151b().getId(), "', isReconnection: ", c37972d.f128524a), null);
        }
        Object objM124995a = c20378c.m56594w().m124995a(new C15509n(c37972d, EnumC15497b.f58164w), abstractC32275i);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (objM124995a != enumC31071a) {
            objM124995a = c23454a0;
        }
        if (objM124995a != enumC31071a) {
            objM124995a = c23454a0;
        }
        return objM124995a == enumC31071a ? objM124995a : c23454a0;
    }

    /* JADX INFO: renamed from: j */
    public final C2345k m40225j() {
        return (C2345k) this.f50767e.getValue();
    }
}
