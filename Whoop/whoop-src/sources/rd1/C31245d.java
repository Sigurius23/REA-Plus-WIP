package rd1;

import bh3.InterfaceC3255b;
import com.whoop.data.onboarding.C6529c;
import com.whoop.data.repositories.C6656c;
import dk0.C12111k;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import jk0.InterfaceC21750d;
import l73.AbstractC23412c;
import lh3.C24079b;
import n73.C26442a;
import n73.InterfaceC26443b;
import od1.AbstractC27857t;
import p319m4.AbstractC25012a;
import q92.AbstractC30072d;
import qr2.AbstractC30556a;
import r73.AbstractC31056a;
import sj0.C32562a;
import t73.C33589b;
import td1.C33706d;
import td1.EnumC33707e;
import tr2.InterfaceC34116n;
import wj0.EnumC37318b;
import xg3.C38280g;
import xg3.InterfaceC38293t;
import ze1.C40588d;
import zj0.C40708a1;
import zj0.C40710b0;
import zj0.C40713c0;
import zj0.C40735j1;
import zj0.InterfaceC40762w;

/* JADX INFO: renamed from: rd1.d */
/* JADX INFO: loaded from: classes4.dex */
public class C31245d extends AbstractC27857t {

    /* JADX INFO: renamed from: k */
    private C33706d f128674k;

    /* JADX INFO: renamed from: l */
    private final InterfaceC34116n f128675l;

    /* JADX INFO: renamed from: m */
    private AtomicBoolean f128676m;

    /* JADX INFO: renamed from: n */
    private AtomicBoolean f128677n;

    /* JADX INFO: renamed from: o */
    private AtomicBoolean f128678o;

    /* JADX INFO: renamed from: p */
    private C40588d<C32562a> f128679p;

    /* JADX INFO: renamed from: q */
    private C24079b f128680q;

    /* JADX INFO: renamed from: r */
    private final C26442a f128681r;

    /* JADX INFO: renamed from: s */
    private final HashSet<Integer> f128682s;

    /* JADX INFO: renamed from: t */
    private InterfaceC38293t f128683t;

    /* JADX INFO: renamed from: u */
    private InterfaceC31246e f128684u;

    /* JADX INFO: renamed from: rd1.d$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f128685a;

        static {
            int[] iArr = new int[EnumC33707e.values().length];
            f128685a = iArr;
            try {
                iArr[EnumC33707e.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f128685a[EnumC33707e.CONNECTION_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f128685a[EnumC33707e.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: rd1.d$b */
    public class b extends AbstractC27857t.h {

        /* JADX INFO: renamed from: rd1.d$b$a */
        public class a implements AbstractC27857t.a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C31245d f128687a;

            public a(C31245d c31245d) {
                this.f128687a = c31245d;
            }

            @Override // od1.AbstractC27857t.a
            /* JADX INFO: renamed from: a */
            public AbstractC27857t.e mo84034a(Object obj) {
                this.f128687a.f128675l.mo85216g("DisabledState EnterAction", new AbstractC30556a.a[0]);
                this.f128687a.f128680q.onNext(EnumC31243b.DISABLED);
                this.f128687a.m96226V(false);
                if (this.f128687a.f128683t != null) {
                    this.f128687a.f128683t.mo14750b();
                }
                if (!this.f128687a.f128676m.get()) {
                    return null;
                }
                this.f128687a.m96229a0();
                return null;
            }
        }

        public /* synthetic */ b(int i13, C31245d c31245d) {
            this();
        }

        private b() {
            super(k.DISABLED, 0, new a(C31245d.this), null);
        }
    }

    /* JADX INFO: renamed from: rd1.d$c */
    public class c extends AbstractC27857t.h {

        /* JADX INFO: renamed from: rd1.d$c$a */
        public class a implements AbstractC27857t.a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C31245d f128689a;

            public a(C31245d c31245d) {
                this.f128689a = c31245d;
            }

            @Override // od1.AbstractC27857t.a
            /* JADX INFO: renamed from: a */
            public AbstractC27857t.e mo84034a(Object obj) {
                this.f128689a.f128675l.mo85216g("DisablingState EnterAction", new AbstractC30556a.a[0]);
                this.f128689a.f128680q.onNext(EnumC31243b.DISABLED);
                this.f128689a.f128684u.mo96250e();
                this.f128689a.f128679p.onNext(null);
                return null;
            }
        }

        public /* synthetic */ c(int i13, C31245d c31245d) {
            this();
        }

        private c() {
            super(k.DISABLING, 5, new a(C31245d.this), null);
        }
    }

    /* JADX INFO: renamed from: rd1.d$d */
    public class d extends AbstractC27857t.h {

        /* JADX INFO: renamed from: rd1.d$d$a */
        public class a implements AbstractC27857t.a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C31245d f128691a;

            public a(C31245d c31245d) {
                this.f128691a = c31245d;
            }

            @Override // od1.AbstractC27857t.a
            /* JADX INFO: renamed from: a */
            public AbstractC27857t.e mo84034a(Object obj) {
                if (!(obj instanceof Boolean)) {
                    return null;
                }
                if (!((Boolean) obj).booleanValue()) {
                    this.f128691a.f128680q.onNext(EnumC31243b.ENABLED);
                    return null;
                }
                if (this.f128691a.m96240M() == EnumC31243b.ENABLED) {
                    return null;
                }
                this.f128691a.f128680q.onNext(EnumC31243b.ENABLING);
                return null;
            }
        }

        public /* synthetic */ d(int i13, C31245d c31245d) {
            this();
        }

        private d() {
            super(k.ENABLED, 5, new a(C31245d.this), null);
        }
    }

    /* JADX INFO: renamed from: rd1.d$e */
    public class e extends AbstractC27857t.h {

        /* JADX INFO: renamed from: rd1.d$e$a */
        public class a implements AbstractC27857t.a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C31245d f128693a;

            public a(C31245d c31245d) {
                this.f128693a = c31245d;
            }

            @Override // od1.AbstractC27857t.a
            /* JADX INFO: renamed from: a */
            public AbstractC27857t.e mo84034a(Object obj) {
                this.f128693a.f128675l.mo85216g("EnablingState EnterAction", new AbstractC30556a.a[0]);
                this.f128693a.f128680q.onNext(EnumC31243b.ENABLING);
                this.f128693a.f128679p.onNext(null);
                if (!this.f128693a.f128684u.mo96253h()) {
                    this.f128693a.f128675l.mo85228t("Strategy indicated no priming - starting real time stream normally", new AbstractC30556a.a[0]);
                    this.f128693a.f128684u.mo96251f();
                    return null;
                }
                this.f128693a.f128675l.mo85228t("Priming real time stream", new AbstractC30556a.a[0]);
                this.f128693a.m96226V(true);
                this.f128693a.f128684u.mo96249d();
                return null;
            }
        }

        public /* synthetic */ e(int i13, C31245d c31245d) {
            this();
        }

        private e() {
            super(k.ENABLING, 5, new a(C31245d.this), null);
        }
    }

    /* JADX INFO: renamed from: rd1.d$f */
    public class f implements InterfaceC31246e {

        /* JADX INFO: renamed from: a */
        private InterfaceC21750d f128694a;

        /* JADX INFO: renamed from: b */
        private InterfaceC26443b f128695b;

        /* JADX INFO: renamed from: c */
        private boolean f128696c;

        /* JADX INFO: renamed from: d */
        private AbstractC30072d f128697d = new a();

        /* JADX INFO: renamed from: rd1.d$f$a */
        public class a extends AbstractC30072d {
            public a() {
            }

            @Override // lk0.AbstractC24489a
            /* JADX INFO: renamed from: m */
            public void mo71266m(InterfaceC40762w interfaceC40762w) {
                C31245d.this.f128675l.mo85216g("onHistoryAbortResponse", new AbstractC30556a.a[0]);
            }

            @Override // lk0.AbstractC24489a
            /* JADX INFO: renamed from: n */
            public void mo71267n(C40710b0 c40710b0) {
                C31245d.this.f128675l.mo85216g("onLoadFirmwareDataResponse", new AbstractC30556a.a[0]);
            }

            @Override // lk0.AbstractC24489a
            /* JADX INFO: renamed from: o */
            public void mo71268o(C40713c0 c40713c0) {
                C31245d.this.f128675l.mo85216g("onProcessFirmwareImageResponse", new AbstractC30556a.a[0]);
            }

            @Override // lk0.AbstractC24489a
            /* JADX INFO: renamed from: q */
            public void mo71270q(C40708a1 c40708a1) {
                C31245d.this.f128675l.mo85216g("onStartFirmwareLoadResponse", new AbstractC30556a.a[0]);
            }

            @Override // lk0.AbstractC24489a
            /* JADX INFO: renamed from: s */
            public void mo71272s(C40735j1 c40735j1) {
                C31245d.this.f128675l.mo85216g("onToggleRealTimeHrResponse ", new AbstractC30556a.a[0]);
                if (c40735j1.m132197V() == EnumC37318b.FAILURE) {
                    C31245d.this.f128675l.mo85226q(AbstractC25012a.m73376i(f.this.f128696c ? "enable" : "disable", " real time stream", new StringBuilder("Failed to ")), new AbstractC30556a.a[0]);
                } else if (f.this.f128696c) {
                    C31245d.this.m96225U();
                } else {
                    C31245d.this.m96224T();
                }
            }
        }

        public f(InterfaceC21750d interfaceC21750d) {
            this.f128694a = interfaceC21750d;
        }

        @Override // rd1.InterfaceC31246e
        /* JADX INFO: renamed from: a */
        public void mo96246a() {
            C31245d.this.f128675l.mo85228t("Removing whoop strap command callback", new AbstractC30556a.a[0]);
            this.f128694a.mo24694I0(this.f128697d);
            InterfaceC26443b interfaceC26443b = this.f128695b;
            if (interfaceC26443b != null) {
                interfaceC26443b.dispose();
                this.f128695b = null;
            }
        }

        @Override // rd1.InterfaceC31246e
        /* JADX INFO: renamed from: b */
        public void mo96247b() {
            C31245d.this.f128675l.mo85228t("Adding whoop strap command callback", new AbstractC30556a.a[0]);
            this.f128694a.mo24684A0(this.f128697d);
            AbstractC23412c abstractC23412cMo24751w = this.f128694a.mo24751w(C12111k.class);
            C6656c c6656c = new C6656c(C31245d.this, 24);
            abstractC23412cMo24751w.getClass();
            C33589b c33589b = new C33589b(c6656c, AbstractC31056a.f128065d);
            abstractC23412cMo24751w.m67905c(c33589b);
            this.f128695b = c33589b;
        }

        @Override // rd1.InterfaceC31246e
        /* JADX INFO: renamed from: c */
        public void mo96248c() {
            C31245d.this.f128675l.mo85226q("Tried to call onPrimingFinished() on a BLE strap", new AbstractC30556a.a[0]);
        }

        @Override // rd1.InterfaceC31246e
        /* JADX INFO: renamed from: d */
        public void mo96249d() {
            C31245d.this.f128675l.mo85226q("Tried to call startPrime() on a BLE strap", new AbstractC30556a.a[0]);
        }

        @Override // rd1.InterfaceC31246e
        /* JADX INFO: renamed from: e */
        public void mo96250e() {
            C31245d.this.f128675l.mo85216g("NordicBleRealTimeStreamStrategy disableRealTimeStream", new AbstractC30556a.a[0]);
            this.f128696c = false;
            this.f128697d.m92179w(this.f128694a.mo24701O0(false, 0L));
        }

        @Override // rd1.InterfaceC31246e
        /* JADX INFO: renamed from: f */
        public void mo96251f() {
            C31245d.this.f128675l.mo85216g("NordicBleRealTimeStreamStrategy enableRealTimeStream", new AbstractC30556a.a[0]);
            this.f128696c = true;
            this.f128697d.m92179w(this.f128694a.mo24701O0(true, 0L));
        }

        @Override // rd1.InterfaceC31246e
        /* JADX INFO: renamed from: g */
        public void mo96252g(boolean z4) {
        }

        @Override // rd1.InterfaceC31246e
        /* JADX INFO: renamed from: h */
        public boolean mo96253h() {
            return false;
        }

        @Override // rd1.InterfaceC31246e
        /* JADX INFO: renamed from: i */
        public void mo96254i(Object obj) {
            C31245d.this.m96222R(((C12111k) obj).m33470R());
        }

        @Override // rd1.InterfaceC31246e
        /* JADX INFO: renamed from: j */
        public void mo96255j(Object obj) {
            C31245d.this.f128675l.mo85226q("Tried to call onPrimingDatReceived() on a BLE strap", new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: rd1.d$g */
    public class g extends AbstractC27857t.h {

        /* JADX INFO: renamed from: rd1.d$g$a */
        public class a implements AbstractC27857t.a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C31245d f128701a;

            public a(C31245d c31245d) {
                this.f128701a = c31245d;
            }

            @Override // od1.AbstractC27857t.a
            /* JADX INFO: renamed from: a */
            public AbstractC27857t.e mo84034a(Object obj) {
                this.f128701a.f128675l.mo85216g("PrimingFinishingState EnterAction", new AbstractC30556a.a[0]);
                this.f128701a.f128675l.mo85228t("Received priming data, processing...", new AbstractC30556a.a[0]);
                this.f128701a.f128684u.mo96248c();
                this.f128701a.m96226V(false);
                return new AbstractC27857t.e(this.f128701a.m84030l(k.ENABLED), Boolean.TRUE);
            }
        }

        public /* synthetic */ g(int i13, C31245d c31245d) {
            this();
        }

        private g() {
            super(k.PRIMING_FINISHING, 0, new a(C31245d.this), null);
        }
    }

    /* JADX INFO: renamed from: rd1.d$h */
    public class h extends AbstractC27857t.h {

        /* JADX INFO: renamed from: rd1.d$h$a */
        public class a implements AbstractC27857t.a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C31245d f128703a;

            public a(C31245d c31245d) {
                this.f128703a = c31245d;
            }

            @Override // od1.AbstractC27857t.a
            /* JADX INFO: renamed from: a */
            public AbstractC27857t.e mo84034a(Object obj) {
                this.f128703a.f128675l.mo85216g("PrimingReceivedState EnterAction", new AbstractC30556a.a[0]);
                this.f128703a.f128684u.mo96255j(obj);
                return new AbstractC27857t.e(this.f128703a.m84030l(k.PRIMING), null);
            }
        }

        public /* synthetic */ h(int i13, C31245d c31245d) {
            this();
        }

        private h() {
            super(k.PRIMING_RECEIVED, 0, new a(C31245d.this), null);
        }
    }

    /* JADX INFO: renamed from: rd1.d$i */
    public class i extends AbstractC27857t.h {
        public /* synthetic */ i(int i13, C31245d c31245d) {
            this();
        }

        private i() {
            super(k.PRIMING, 5, null, null);
        }
    }

    /* JADX INFO: renamed from: rd1.d$j */
    public enum j implements AbstractC27857t.c {
        DISCONNECTED,
        ENABLE,
        ENABLED_PRIMING,
        PRIMING_COMPLETE,
        ENABLED,
        REAL_TIME_DATA_RECEIVED,
        DISABLE,
        DISABLED
    }

    /* JADX INFO: renamed from: rd1.d$k */
    public enum k implements AbstractC27857t.i {
        ENABLING,
        PRIMING,
        PRIMING_RECEIVED,
        PRIMING_FINISHING,
        ENABLED,
        RECEIVED,
        DISABLING,
        DISABLED
    }

    /* JADX INFO: renamed from: rd1.d$l */
    public class l extends AbstractC27857t.h {

        /* JADX INFO: renamed from: rd1.d$l$a */
        public class a implements AbstractC27857t.a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C31245d f128706a;

            public a(C31245d c31245d) {
                this.f128706a = c31245d;
            }

            @Override // od1.AbstractC27857t.a
            /* JADX INFO: renamed from: a */
            public AbstractC27857t.e mo84034a(Object obj) {
                this.f128706a.f128684u.mo96254i(obj);
                return new AbstractC27857t.e(this.f128706a.m84030l(k.ENABLED), null);
            }
        }

        public /* synthetic */ l(int i13, C31245d c31245d) {
            this();
        }

        private l() {
            super(k.RECEIVED, 0, new a(C31245d.this), null);
        }
    }

    /* JADX INFO: renamed from: rd1.d$m */
    public class m extends AbstractC27857t.h {

        /* JADX INFO: renamed from: rd1.d$m$a */
        public class a implements AbstractC27857t.a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C31245d f128708a;

            public a(C31245d c31245d) {
                this.f128708a = c31245d;
            }

            @Override // od1.AbstractC27857t.a
            /* JADX INFO: renamed from: a */
            public AbstractC27857t.e mo84034a(Object obj) {
                k kVar;
                this.f128708a.f128675l.mo85216g("TimeoutState EnterAction", new AbstractC30556a.a[0]);
                if (this.f128708a.f128677n.get()) {
                    kVar = k.DISABLING;
                } else if (!this.f128708a.f128676m.get()) {
                    this.f128708a.f128675l.mo85226q("Real time stream timed out.  Trying to disable.", AbstractC30556a.a.REAL_TIME);
                    kVar = k.DISABLING;
                } else if (this.f128708a.f128674k.mo106484A().isReady()) {
                    this.f128708a.f128675l.mo85226q("Real time stream timed out.  Attempting to re-enable.", AbstractC30556a.a.REAL_TIME);
                    kVar = k.ENABLING;
                } else {
                    this.f128708a.f128675l.mo85226q("Real time stream timed out.  Attempting to re-enable when strap reconnects.", AbstractC30556a.a.REAL_TIME);
                    kVar = k.DISABLED;
                }
                return new AbstractC27857t.e(this.f128708a.m84030l(kVar), null);
            }
        }

        public /* synthetic */ m(int i13, C31245d c31245d) {
            this();
        }

        private m() {
            super(AbstractC27857t.g.TIMEOUT, 0, new a(C31245d.this), null);
        }
    }

    public C31245d(final C33706d c33706d) {
        super("RealTimeStream");
        this.f128675l = InterfaceC34116n.m107846d("RealTimeStreamStateMachine");
        this.f128676m = new AtomicBoolean();
        this.f128677n = new AtomicBoolean();
        this.f128678o = new AtomicBoolean();
        this.f128679p = C40588d.m131622Y();
        this.f128681r = new C26442a();
        this.f128682s = new HashSet<>();
        this.f128674k = c33706d;
        this.f128680q = C24079b.m70996Y(null, false);
        m96219L();
        m96218K();
        m84025d();
        c33706d.mo106496i().m122661K(new InterfaceC3255b() { // from class: rd1.c
            @Override // bh3.InterfaceC3255b
            /* JADX INFO: renamed from: b */
            public final void mo9472b(Object obj) {
                this.f128672w.m96220N(c33706d, (EnumC33707e) obj);
            }
        });
        m96229a0();
    }

    /* JADX INFO: renamed from: K */
    private void m96218K() {
        j jVar = j.ENABLE;
        k kVar = k.DISABLED;
        k kVar2 = k.ENABLING;
        k kVar3 = k.DISABLING;
        m84023b(new AbstractC27857t.b(jVar, kVar, kVar2, kVar3, kVar2));
        j jVar2 = j.ENABLED_PRIMING;
        k kVar4 = k.PRIMING;
        m84023b(new AbstractC27857t.b(jVar2, kVar2, kVar4));
        m84023b(new AbstractC27857t.b(j.PRIMING_COMPLETE, kVar4, k.PRIMING_FINISHING));
        j jVar3 = j.ENABLED;
        k kVar5 = k.ENABLED;
        m84023b(new AbstractC27857t.b(jVar3, kVar2, kVar5));
        m84023b(new AbstractC27857t.b(j.REAL_TIME_DATA_RECEIVED, kVar2, kVar5, kVar5, k.RECEIVED, kVar4, k.PRIMING_RECEIVED, kVar, kVar3));
        m84023b(new AbstractC27857t.b(j.DISABLE, kVar5, kVar3, kVar2, kVar3, kVar4, kVar3));
        m84023b(new AbstractC27857t.b(j.DISABLED, kVar3, kVar));
        m84023b(new AbstractC27857t.b(j.DISCONNECTED, AbstractC27857t.g.WILDCARD, kVar));
    }

    /* JADX INFO: renamed from: L */
    private void m96219L() {
        int i13 = 0;
        m84024c(new b(i13, this));
        m84024c(new e(i13, this));
        m84024c(new i(i13, this));
        m84024c(new h(i13, this));
        m84024c(new g(i13, this));
        m84024c(new d(i13, this));
        m84024c(new l(i13, this));
        m84024c(new m(i13, this));
        m84024c(new c(i13, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m96220N(C33706d c33706d, EnumC33707e enumC33707e) {
        if (enumC33707e == EnumC33707e.READY) {
            InterfaceC31246e interfaceC31246e = this.f128684u;
            if (interfaceC31246e != null) {
                interfaceC31246e.mo96246a();
            }
            if (c33706d.m106534S() != null) {
                this.f128684u = new f(c33706d.m106534S());
            }
            if (this.f128684u != null) {
                this.f128675l.mo85228t("Initializing RealTime Stream strategy", new AbstractC30556a.a[0]);
                this.f128684u.mo96247b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m96221O(EnumC33707e enumC33707e) {
        int i13 = a.f128685a[this.f128674k.mo106484A().ordinal()];
        if (i13 == 1) {
            this.f128678o.set(true);
            if (this.f128676m.get()) {
                m84029j(j.ENABLE, null);
                return;
            }
            return;
        }
        if (i13 == 2 || i13 == 3) {
            this.f128678o.set(false);
            if (m84026g() instanceof b) {
                return;
            }
            m84029j(j.DISCONNECTED, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public void m96222R(C32562a c32562a) {
        if (m96240M() == EnumC31243b.ENABLING) {
            this.f128680q.onNext(EnumC31243b.ENABLED);
        }
        this.f128679p.onNext(c32562a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public void m96223S(Object obj) {
        AbstractC27857t.i iVarM84045d;
        if (!this.f128676m.get() || m84029j(j.REAL_TIME_DATA_RECEIVED, obj) || (iVarM84045d = m84026g().m84045d()) == null || iVarM84045d == k.DISABLED) {
            return;
        }
        k kVar = k.ENABLING;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public void m96224T() {
        this.f128675l.mo85228t("Real time stream disabled", new AbstractC30556a.a[0]);
        m96226V(false);
        m84029j(j.DISABLED, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public void m96225U() {
        this.f128675l.mo85228t("Real time stream enabled", new AbstractC30556a.a[0]);
        m84029j(j.ENABLED, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public synchronized void m96226V(boolean z4) {
        if (this.f128677n.getAndSet(z4) != z4) {
            this.f128684u.mo96252g(z4);
        }
    }

    /* JADX INFO: renamed from: W */
    private void m96227W() {
        if (!this.f128676m.compareAndSet(false, true)) {
            this.f128675l.mo85216g("Tried to start real time stream, but already started", new AbstractC30556a.a[0]);
        } else {
            this.f128675l.mo85216g("Starting real time stream", new AbstractC30556a.a[0]);
            m96229a0();
        }
    }

    /* JADX INFO: renamed from: Y */
    private void m96228Y() {
        if (!this.f128676m.compareAndSet(true, false)) {
            this.f128675l.mo85216g("Tried to stop real time stream, but already stopped", new AbstractC30556a.a[0]);
        } else if (!this.f128678o.get()) {
            this.f128675l.mo85216g("Stopping real time stream, but strap isn't connected", new AbstractC30556a.a[0]);
        } else {
            this.f128675l.mo85216g("Stopping real time stream", new AbstractC30556a.a[0]);
            m84029j(j.DISABLE, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public void m96229a0() {
        InterfaceC38293t interfaceC38293t = this.f128683t;
        if (interfaceC38293t != null) {
            interfaceC38293t.mo14750b();
        }
        this.f128683t = this.f128674k.mo106496i().m122661K(new C6529c(this, 17));
    }

    /* JADX INFO: renamed from: M */
    public EnumC31243b m96240M() {
        return (EnumC31243b) this.f128680q.m70997Z();
    }

    /* JADX INFO: renamed from: P */
    public C38280g<C32562a> m96241P() {
        return this.f128679p;
    }

    /* JADX INFO: renamed from: Q */
    public C38280g<EnumC31243b> m96242Q() {
        return this.f128680q;
    }

    /* JADX INFO: renamed from: X */
    public void m96243X(int i13) {
        synchronized (this.f128682s) {
            try {
                this.f128675l.mo85228t("start(" + i13 + ")", new AbstractC30556a.a[0]);
                boolean zIsEmpty = this.f128682s.isEmpty();
                this.f128682s.add(Integer.valueOf(i13));
                if (zIsEmpty) {
                    m96227W();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m96244Z(int i13) {
        this.f128681r.m78296d();
        synchronized (this.f128682s) {
            try {
                this.f128675l.mo85228t("stop(" + i13 + ")", new AbstractC30556a.a[0]);
                boolean zIsEmpty = this.f128682s.isEmpty();
                this.f128682s.remove(Integer.valueOf(i13));
                if (!zIsEmpty && this.f128682s.isEmpty()) {
                    m96228Y();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
