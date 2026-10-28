package t23;

import a13.C0146d;
import a13.C0151i;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import androidx.lifecycle.C1593i0;
import androidx.lifecycle.ProcessLifecycleOwner;
import b23.C2335a;
import b23.C2343i;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b43.C2721b;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bi.C3278p;
import c53.AbstractC4257c;
import c53.C4255a;
import c93.InterfaceC4339a;
import ch.C4594o;
import com.whoop.service.network.model.UserState;
import d33.C11585c;
import e10.C12554k0;
import e43.C12709a;
import e43.C12714f;
import e43.C12715g;
import e53.C12745d;
import e53.InterfaceC12744c;
import ec3.C13045h2;
import g73.C15556d;
import h43.C16852a;
import h43.C16853b;
import io.getstream.android.video.generated.apis.ProductvideoApi;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api2.model.requests.CreatePollRequest;
import io.getstream.video.android.model.User;
import io.getstream.video.android.model.UserType;
import java.util.concurrent.atomic.AtomicReference;
import k53.C22214b;
import k53.C22215c;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import m83.C25271y;
import mu.AbstractC25947a;
import mu.C25948b;
import n43.C26285a;
import og3.AbstractC27931j;
import p000.AbstractC11266d;
import p002a0.C0006a1;
import p007a6.InterfaceC0422g;
import p078d1.C11457j;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p43.C28843b;
import p465rm.C31559p;
import p499t9.C33647p;
import p530up.AbstractC35148d;
import p671z5.C40083a;
import p671z5.C40084b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import s40.C32139c0;
import y33.C39198a;
import y33.C39200c;
import yb3.AbstractC39414r;
import yz1.C39913g;

/* JADX INFO: renamed from: t23.k3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33413k3 {

    /* JADX INFO: renamed from: a */
    public final String f139498a;

    /* JADX INFO: renamed from: b */
    public User f139499b;

    /* JADX INFO: renamed from: c */
    public final String f139500c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC12744c f139501d;

    /* JADX INFO: renamed from: e */
    public final C2721b f139502e;

    /* JADX INFO: renamed from: f */
    public final C12715g f139503f;

    /* JADX INFO: renamed from: g */
    public final long f139504g;

    /* JADX INFO: renamed from: h */
    public final boolean f139505h;

    /* JADX INFO: renamed from: i */
    public final String f139506i;

    /* JADX INFO: renamed from: j */
    public final C22215c f139507j;

    /* JADX INFO: renamed from: k */
    public final C22214b f139508k;

    /* JADX INFO: renamed from: l */
    public final C33647p f139509l;

    /* JADX INFO: renamed from: m */
    public final long f139510m;

    /* JADX INFO: renamed from: n */
    public final boolean f139511n;

    /* JADX INFO: renamed from: o */
    public final boolean f139512o;

    /* JADX INFO: renamed from: p */
    public final boolean f139513p;

    /* JADX INFO: renamed from: q */
    public final Context f139514q;

    /* JADX INFO: renamed from: r */
    public final C4255a f139515r;

    public C33413k3(Context context, String apiKey, User user, String token, C2721b c2721b) {
        C12554k0 c12554k0 = new C12554k0(AbstractC33418l3.f139539a);
        C12715g c12715g = new C12715g(C25271y.f99162w, C12709a.f43493y, C16852a.f64762w, true, C12709a.f43494z, false, true, AbstractC12350b.m34602w("livestream"), C12714f.f43502w);
        AbstractC22676k.m65750j(context, "context");
        C22215c c22215c = new C22215c(new C11457j(context, 18));
        C22214b c22214b = new C22214b();
        C33647p c33647p = new C33647p(4);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(apiKey, "apiKey");
        AbstractC22676k.m65750j(token, "token");
        this.f139498a = apiKey;
        this.f139499b = user;
        this.f139500c = token;
        this.f139501d = c12554k0;
        this.f139502e = c2721b;
        this.f139503f = c12715g;
        this.f139504g = ChatClient.RESOLVE_DEPENDENCY_TIMEOUT;
        this.f139505h = true;
        this.f139506i = "video.stream-io-api.com";
        this.f139507j = c22215c;
        this.f139508k = c22214b;
        this.f139509l = c33647p;
        this.f139510m = 30L;
        this.f139511n = true;
        this.f139512o = true;
        this.f139513p = true;
        Context applicationContext = context.getApplicationContext();
        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
        this.f139514q = applicationContext;
        this.f139515r = AbstractC35148d.m111177h(AbstractC4257c.m13288a(), null, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10, types: [bc3.d0, q83.d, q83.j] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX INFO: renamed from: a */
    public final void m105856a() {
        C0146d c0146d;
        C16853b c16853b;
        ?? r14;
        C1593i0 c1593i0 = ProcessLifecycleOwner.f6173I.f6175F;
        InterfaceC33408j3.f139483t.getClass();
        if (C33403i3.f139477b != null && this.f139505h) {
            throw new RuntimeException("Creating 2 instance of the video client will cause bugs with call.state. Before creating a new client, please remove the old one. You can remove the old client using StreamVideo.removeClient()");
        }
        if (AbstractC39414r.m125890i0(this.f139498a)) {
            throw new IllegalArgumentException("The API key cannot be blank");
        }
        UserType type = this.f139499b.getType();
        UserType.Authenticated authenticated = UserType.Authenticated.INSTANCE;
        if (AbstractC22676k.m65745e(type, authenticated) && AbstractC39414r.m125890i0(this.f139500c)) {
            throw new IllegalArgumentException("The token cannot be blank for authenticated users");
        }
        if (AbstractC22676k.m65745e(this.f139499b.getType(), authenticated) && AbstractC39414r.m125890i0(this.f139499b.getId())) {
            throw new IllegalArgumentException("The user ID cannot be empty for authenticated users");
        }
        String role = this.f139499b.getRole();
        if (role == null || AbstractC39414r.m125890i0(role)) {
            this.f139499b = User.copy$default(this.f139499b, null, UserState.Sources.USER, null, null, null, null, null, null, null, null, 1021, null);
        }
        if (!C2343i.f9270b) {
            C2343i.m7229c(new C2335a());
            C2343i.f9272d = new C31559p(this, 12);
        }
        Context context = this.f139514q;
        if (!AbstractC25947a.f102489a.getAndSet(true)) {
            C25948b c25948b = new C25948b(context);
            if (AbstractC27931j.f112647a.get()) {
                throw new IllegalStateException("Already initialized");
            }
            AtomicReference atomicReference = AbstractC27931j.f112648b;
            while (!atomicReference.compareAndSet(null, c25948b)) {
                if (atomicReference.get() != null) {
                    throw new IllegalStateException("Initializer was already set, possibly with a default during initialization");
                }
            }
        }
        C12745d c12745d = AbstractC33418l3.f139539a;
        String token = this.f139500c;
        c12745d.getClass();
        AbstractC22676k.m65750j(token, "token");
        c12745d.f43626a = token;
        String strM30461o = AbstractC11266d.m30461o("https:///", this.f139506i);
        String strM31996o = AbstractC11895b.m31996o("wss://", this.f139506i, "/video/connect");
        C11585c c11585c = new C11585c(this.f139499b);
        C39200c c39200c = new C39200c(this.f139514q, this.f139501d, c11585c, c12745d, this.f139515r, strM30461o, strM31996o, this.f139504g, this.f139502e, this.f139498a, c1593i0);
        Context context2 = this.f139514q;
        AbstractC22676k.m65750j(context2, "context");
        C28843b c28843b = new C28843b();
        C39913g c39913g = new C39913g(10);
        C22365e c22365e = AbstractC3050q0.f12077a;
        new C4594o(((InterfaceC0422g) new C40083a(new C40084b(), c39913g, AbstractC3006f0.m8708b(ExecutorC22364d.f87316w.plus(AbstractC3006f0.m8710d()))).getValue(context2, C28843b.f116762a[0])).getData(), 5);
        C15556d c15556d = C16853b.f64763E;
        Context context3 = this.f139514q;
        C4255a scope = this.f139515r;
        C12715g notificationConfig = this.f139503f;
        ProductvideoApi productvideoApiM124884a = c39200c.m124884a();
        AbstractC22676k.m65750j(context3, "context");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(notificationConfig, "notificationConfig");
        synchronized (c15556d) {
            try {
                C16853b c16853b2 = C16853b.f64765G;
                if (c16853b2 != null) {
                    c16853b2.f64766w = scope;
                    c16853b2.f64768y = productvideoApiM124884a;
                } else {
                    Context applicationContext = context3.getApplicationContext();
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    C12715g c12715gM43806m = C15556d.m43806m(notificationConfig, application, notificationConfig.f43508f);
                    C0006a1 c0006a1 = new C0006a1(c12715gM43806m, 23);
                    if (application != null) {
                        InterfaceC4339a requestPermissionOnAppLaunch = notificationConfig.f43504b;
                        AbstractC22676k.m65750j(requestPermissionOnAppLaunch, "requestPermissionOnAppLaunch");
                        C0151i c0151iM56534q = C0151i.f468E.m56534q(application);
                        c0146d = new C0146d(c0151iM56534q, requestPermissionOnAppLaunch, c0006a1);
                        Log.d("Push:Notifications-PM", "[initialize] no args");
                        c0151iM56534q.f470w.add(c0146d);
                    } else {
                        c0146d = null;
                    }
                    C16853b.f64765G = new C16853b(scope, c12715gM43806m, productvideoApiM124884a, c28843b, c0146d);
                }
                c16853b = C16853b.f64765G;
                if (c16853b == null) {
                    AbstractC22676k.m65757q("internalStreamNotificationManager");
                    throw null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        C33366b4 c33366b4 = new C33366b4(this.f139514q, this.f139515r, this.f139499b, this.f139498a, this.f139500c, c1593i0, c39200c, c12745d, this.f139501d, c16853b, c11585c, this.f139503f.f43509g, new C3278p(1), this.f139507j, this.f139508k, this.f139509l, this.f139502e, this.f139510m, this.f139511n, this.f139512o);
        UserType type2 = this.f139499b.getType();
        UserType.Guest guest = UserType.Guest.INSTANCE;
        if (AbstractC22676k.m65745e(type2, guest)) {
            C39198a c39198a = c39200c.f168477e;
            c39198a.getClass();
            c39198a.f168470y = CreatePollRequest.VOTING_VISIBILITY_ANONYMOUS;
            User user = this.f139499b;
            AbstractC22676k.m65750j(user, "user");
            c33366b4.f139232E.m124885b("");
            c33366b4.f139250W = AbstractC3006f0.m8711e(c33366b4.f139260x, null, new C33488z3(c33366b4, user, null), 3);
        } else if (AbstractC22676k.m65745e(this.f139499b.getType(), UserType.Anonymous.INSTANCE)) {
            C39198a c39198a2 = c39200c.f168477e;
            c39198a2.getClass();
            c39198a2.f168470y = CreatePollRequest.VOTING_VISIBILITY_ANONYMOUS;
        }
        if (AbstractC22676k.m65745e(this.f139499b.getType(), UserType.Authenticated.INSTANCE) || AbstractC22676k.m65745e(this.f139499b.getType(), guest)) {
            r14 = 0;
            AbstractC3006f0.m8732z(this.f139515r, null, null, new C26285a((Object) this, (Object) c33366b4, (InterfaceC30057d) (0 == true ? 1 : 0), 24), 3);
        } else {
            r14 = 0;
        }
        AbstractC3006f0.m8732z(this.f139515r, r14, r14, new C32139c0(c33366b4, r14, 9), 3);
        C33403i3 c33403i3 = InterfaceC33408j3.f139483t;
        c33403i3.getClass();
        synchronized (c33403i3) {
            try {
                C33403i3 c33403i4 = C33403i3.f139476a;
                if ((C33403i3.f139477b != null) != false) {
                    C2343i c2343i = C2343i.f9269a;
                    InterfaceC2339e interfaceC2339e = C2343i.f9272d;
                    EnumC2341g enumC2341g = EnumC2341g.ERROR;
                    if (interfaceC2339e.isLoggable(enumC2341g, "StreamVideo")) {
                        C2343i.f9271c.log(enumC2341g, "StreamVideo", "The " + C33403i3.f139477b + " is already installed but you've tried to install a new exception handler: " + c33366b4, null);
                    }
                }
                C33403i3.f139477b = c33366b4;
                C13045h2 c13045h2 = C33403i3.f139478c;
                AbstractC22676k.m65748h(c13045h2, "null cannot be cast to non-null type kotlinx.coroutines.flow.MutableStateFlow<io.getstream.video.android.core.StreamVideo?>");
                c13045h2.m36570j(C33403i3.f139477b);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
