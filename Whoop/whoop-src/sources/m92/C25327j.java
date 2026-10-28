package m92;

import bc3.AbstractC3006f0;
import bc3.C3033m;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3025k;
import bl2.C3374c;
import c93.InterfaceC4351m;
import ch3.C4674b1;
import ch3.C4716w0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.whoop.data.onboarding.C6529c;
import com.whoop.data.repositories.C6656c;
import ge3.AbstractC15751g;
import hn.C17508p;
import i92.AbstractC18274s;
import i92.C18265j;
import java.io.IOException;
import java.util.concurrent.Executors;
import l83.C23454a0;
import lc0.C23821c;
import lq0.C24656d;
import od1.C27858u;
import p020ap.ThreadFactoryC1879b;
import p031b9.AbstractC2875y;
import p073cq.C11040i;
import p073cq.C11052u;
import p073cq.InterfaceC11035d;
import p505ts.AbstractC34132o;
import p692zt.RunnableC41108l;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u92.C34660d;
import xg3.C38289p;
import xg3.InterfaceC38290q;

/* JADX INFO: renamed from: m92.j */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 22\u00020\u0001:\u0001\u001fB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0012J\r\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u0014J\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001b8F¢\u0006\u0006\u001a\u0004\b0\u0010\u001e¨\u00063"}, m65681d2 = {"Lm92/j;", "", "Lod1/u;", "userContext", "Lu92/d;", "prefs", "Li92/j;", "pushWs", "Lrr2/c;", "crashReporter", "Lbc3/c0;", "coroutineScope", "<init>", "(Lod1/u;Lu92/d;Li92/j;Lrr2/c;Lbc3/c0;)V", "", "token", "Ll83/a0;", "J", "(Ljava/lang/String;)V", "z", "()V", "E", "A", "(Lq83/d;)Ljava/lang/Object;", "v", "F", "D", "Lxg3/p;", "", "s", "()Lxg3/p;", "a", "Lod1/u;", "b", "Lu92/d;", "c", "Li92/j;", "d", "Lrr2/c;", "e", "Lbc3/c0;", "Ltr2/n;", "f", "Ltr2/n;", "logger", "C", "()Ljava/lang/String;", "lastFirebaseToken", "B", "currentFirebaseToken", "g", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25327j {

    /* JADX INFO: renamed from: h */
    public static final int f99325h = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C27858u userContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C34660d prefs;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C18265j pushWs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: m92.j$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b<TResult> implements InterfaceC11035d {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC3025k f99332w;

        public b(InterfaceC3025k interfaceC3025k) {
            this.f99332w = interfaceC3025k;
        }

        @Override // p073cq.InterfaceC11035d
        /* JADX INFO: renamed from: q */
        public final void mo944q(Task<Void> task) {
            AbstractC22676k.m65750j(task, "task");
            if (task.isSuccessful()) {
                this.f99332w.resumeWith(C23454a0.f92919a);
                return;
            }
            Throwable exception = task.getException();
            if (exception == null) {
                exception = new IOException("Failed to reset Firebase token");
            }
            this.f99332w.resumeWith(AbstractC34132o.m107888l(exception));
        }
    }

    /* JADX INFO: renamed from: m92.j$c */
    @InterfaceC32271e(m100429c = "com.whoop.service.push.PushManager$resetFirebaseToken$1", m100430f = "PushManager.kt", m100431l = {104}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f99333w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25327j.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f99333w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C25327j c25327j = C25327j.this;
                    this.f99333w = 1;
                    if (c25327j.m74372A(this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
            } catch (Exception e5) {
                C25327j.this.crashReporter.mo98626g(e5, "Failed to reset Firebase token");
            }
            return C23454a0.f92919a;
        }
    }

    public C25327j(C27858u userContext, C34660d prefs, C18265j pushWs, InterfaceC31766c crashReporter, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(prefs, "prefs");
        AbstractC22676k.m65750j(pushWs, "pushWs");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.userContext = userContext;
        this.prefs = prefs;
        this.pushWs = pushWs;
        this.crashReporter = crashReporter;
        this.coroutineScope = coroutineScope;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("PushManager");
        userContext.m84059j().m122661K(new C6529c(new C25326i(this, 1), 13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final Object m74372A(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C11052u c11052uM15640d;
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        FirebaseMessaging firebaseMessagingM16384c = FirebaseMessaging.m16384c();
        if (firebaseMessagingM16384c.m16388f() == null) {
            c11052uM15640d = Tasks.m15640d(null);
        } else {
            C11040i c11040i = new C11040i();
            Executors.newSingleThreadExecutor(new ThreadFactoryC1879b("Firebase-Messaging-Network-Io")).execute(new RunnableC41108l(firebaseMessagingM16384c, c11040i, 1));
            c11052uM15640d = c11040i.f34644a;
        }
        c11052uM15640d.addOnCompleteListener(new b(c3033m));
        Object objM8773r = c3033m.m8773r();
        return objM8773r == EnumC31071a.f128113w ? objM8773r : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    private final String m74373C() {
        return this.prefs.m109533j("lastFirebaseToken");
    }

    /* JADX INFO: renamed from: E */
    private final void m74374E() {
        m74404z();
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new c(null), 3);
    }

    /* JADX INFO: renamed from: F */
    private final void m74375F(String token) {
        this.pushWs.m52617a(token).m122662L(new C3374c(new C24656d(8, this, token), 5), new C3374c(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m74376G(C25327j c25327j, String str, C29218v0 c29218v0) {
        int i13;
        if (AbstractC18274s.m52642g(c29218v0)) {
            AbstractC22676k.m65747g(c29218v0);
            if (c29218v0.f118269a.f146792z == 201) {
                c25327j.logger.mo85219j("Updated push token", new AbstractC30556a.a[0]);
                c25327j.m74379J(str);
            } else {
                if (c29218v0 != null) {
                    i13 = c29218v0.f118269a.f146792z;
                } else {
                    i13 = -1;
                }
                c25327j.logger.mo85226q(AbstractC2875y.m8295h(i13, "Failed to update push token: "), new AbstractC30556a.a[0]);
            }
        } else {
            if (c29218v0 != null) {
                i13 = c29218v0.f118269a.f146792z;
            } else {
                i13 = -1;
            }
            c25327j.logger.mo85226q(AbstractC2875y.m8295h(i13, "Failed to update push token: "), new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final void m74377H(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final void m74378I(C25327j c25327j, Throwable th3) {
        InterfaceC34116n interfaceC34116n = c25327j.logger;
        AbstractC22676k.m65747g(th3);
        interfaceC34116n.mo85213c("Failed to update push token", th3, new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: J */
    private final void m74379J(String token) {
        this.prefs.m109543v("lastFirebaseToken", token);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final void m74392m(InterfaceC38290q emitter) {
        AbstractC22676k.m65750j(emitter, "emitter");
        FirebaseMessaging firebaseMessagingM16384c = FirebaseMessaging.m16384c();
        firebaseMessagingM16384c.getClass();
        C11040i c11040i = new C11040i();
        firebaseMessagingM16384c.f21620f.execute(new RunnableC41108l(firebaseMessagingM16384c, c11040i, 0));
        c11040i.f34644a.addOnCompleteListener(new C6656c(emitter, 18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m74393n(InterfaceC38290q interfaceC38290q, Task it) {
        AbstractC22676k.m65750j(it, "it");
        if (!it.isSuccessful() || it.getResult() == null) {
            ((C4716w0) interfaceC38290q).m14774c(new IOException(it.getException()));
        } else {
            Object result = it.getResult();
            AbstractC22676k.m65747g(result);
            ((C4716w0) interfaceC38290q).m14775d(result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m74394o(C25327j c25327j, C27858u.a contextSwitch) {
        AbstractC22676k.m65750j(contextSwitch, "contextSwitch");
        if (contextSwitch.getNewSession() != null) {
            c25327j.m74400v();
        } else if (!contextSwitch.getIsInitialSwitch()) {
            c25327j.m74374E();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m74395p(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final Boolean m74398t(C25327j c25327j, String token) {
        AbstractC22676k.m65750j(token, "token");
        return Boolean.valueOf(token.equals(c25327j.m74373C()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final Boolean m74399u(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v */
    private final void m74400v() {
        m74405B().m122686d(new C6529c(new C25326i(this, 0), 11), new C6529c(this, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m74401w(C25327j c25327j, String token) {
        AbstractC22676k.m65750j(token, "token");
        if (!token.equals(c25327j.m74373C())) {
            c25327j.m74375F(token);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final void m74402x(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final void m74403y(C25327j c25327j, Throwable th3) {
        InterfaceC34116n interfaceC34116n = c25327j.logger;
        AbstractC22676k.m65747g(th3);
        interfaceC34116n.mo85230v("Failed to get firebase token", th3, new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: z */
    private final void m74404z() {
        this.prefs.m109537p("lastFirebaseToken");
    }

    /* JADX INFO: renamed from: B */
    public final C38289p m74405B() {
        return C38289p.m122684b(new C25325h());
    }

    /* JADX INFO: renamed from: D */
    public final void m74406D() {
        if (this.userContext.m84057h() != null) {
            m74400v();
        }
    }

    /* JADX INFO: renamed from: s */
    public final C38289p m74407s() {
        C38289p c38289pM74405B = m74405B();
        C17508p c17508p = new C17508p(new C23821c(this, 14), 28);
        c38289pM74405B.getClass();
        return new C38289p(new C4674b1(c38289pM74405B, c17508p, 0));
    }
}
