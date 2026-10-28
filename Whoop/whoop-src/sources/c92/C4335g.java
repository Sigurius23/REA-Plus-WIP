package c92;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bh3.InterfaceC3255b;
import ca2.InterfaceC4366f;
import com.whoop.data.repositories.ConnectionRequestInterval;
import com.whoop.data.repositories.ConnectivityFeatureFlagsKt;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.service.rearchitect.BleWhoopStrapService;
import com.whoop.service.sync.WhoopSyncService;
import ge3.AbstractC15751g;
import java.util.concurrent.TimeUnit;
import jk0.C21748b;
import jk0.InterfaceC21750d;
import js0.AbstractC21909c;
import kh3.C22488a;
import mh3.AbstractC25568e;
import od1.C27858u;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p088dc.AbstractC11895b;
import q92.C30069a;
import q92.C30071c;
import q92.C30076h;
import qr2.AbstractC30556a;
import rr2.InterfaceC31766c;
import sk.AbstractC32570a;
import st0.AbstractC32962f;
import st0.C32963g;
import st0.C32965i;
import st0.C32967k;
import st0.C32970n;
import st0.InterfaceC32957a;
import td1.C33706d;
import td1.EnumC33707e;
import td1.InterfaceC33704b;
import tr2.InterfaceC34116n;
import u92.C34660d;
import u92.C34662f;
import vf3.C35953c;
import xg3.InterfaceC38293t;
import y82.AbstractC39342e;
import y82.EnumC39339b;
import z82.C40191e;

/* JADX INFO: renamed from: c92.g */
/* JADX INFO: loaded from: classes4.dex */
public class C4335g implements BleWhoopStrapService.InterfaceC10005c, InterfaceC32957a, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: b0 */
    private static final DateTimeFormatter f17597b0 = DateTimeFormat.forPattern("H:mm");

    /* JADX INFO: renamed from: E */
    private final InterfaceC4366f f17598E;

    /* JADX INFO: renamed from: F */
    private final C27858u f17599F;

    /* JADX INFO: renamed from: G */
    private InterfaceC38293t f17600G = AbstractC25568e.f100262a;

    /* JADX INFO: renamed from: H */
    private final d f17601H;

    /* JADX INFO: renamed from: I */
    private final C4329a f17602I;

    /* JADX INFO: renamed from: J */
    private final AlarmManager f17603J;

    /* JADX INFO: renamed from: K */
    private final PendingIntent f17604K;

    /* JADX INFO: renamed from: L */
    private e f17605L;

    /* JADX INFO: renamed from: M */
    private Handler f17606M;

    /* JADX INFO: renamed from: N */
    private final InterfaceC34116n f17607N;

    /* JADX INFO: renamed from: O */
    private BleWhoopStrapService.BinderC10003a f17608O;

    /* JADX INFO: renamed from: P */
    private boolean f17609P;

    /* JADX INFO: renamed from: Q */
    private C30071c f17610Q;

    /* JADX INFO: renamed from: R */
    private final long f17611R;

    /* JADX INFO: renamed from: S */
    private final InterfaceC31766c f17612S;

    /* JADX INFO: renamed from: T */
    private final BluetoothAdapter f17613T;

    /* JADX INFO: renamed from: U */
    private final C40191e f17614U;

    /* JADX INFO: renamed from: V */
    private final FeatureFlagRepository f17615V;

    /* JADX INFO: renamed from: W */
    private final AbstractC21909c f17616W;

    /* JADX INFO: renamed from: X */
    private final C21748b f17617X;

    /* JADX INFO: renamed from: Y */
    private final Runnable f17618Y;

    /* JADX INFO: renamed from: Z */
    private final Runnable f17619Z;

    /* JADX INFO: renamed from: a0 */
    private final ServiceConnection f17620a0;

    /* JADX INFO: renamed from: w */
    private final Context f17621w;

    /* JADX INFO: renamed from: x */
    private final WhoopSyncService.C10018b f17622x;

    /* JADX INFO: renamed from: y */
    private final InterfaceC33704b f17623y;

    /* JADX INFO: renamed from: z */
    private InterfaceC21750d f17624z;

    /* JADX INFO: renamed from: c92.g$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C4335g.this.f17623y.mo106484A().isReady()) {
                return;
            }
            C4335g.this.f17607N.mo85226q("Connect timeout expired and no strap is ready, aborting foreground", new AbstractC30556a.a[0]);
            C4335g.this.m13696n0();
        }
    }

    /* JADX INFO: renamed from: c92.g$b */
    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C4335g.this.f17608O = (BleWhoopStrapService.BinderC10003a) iBinder;
            C4335g.this.f17608O.m24623c(C4335g.this);
            C4335g.this.f17609P = true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C4335g.this.f17607N.mo85216g("nordic ble device lost", new AbstractC30556a.a[0]);
            C4335g.this.f17624z = null;
            C4335g.this.f17608O = null;
            C4335g.this.f17609P = false;
        }
    }

    /* JADX INFO: renamed from: c92.g$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        private final BluetoothDevice f17627a;

        public c(BluetoothDevice bluetoothDevice) {
            this.f17627a = bluetoothDevice;
        }
    }

    /* JADX INFO: renamed from: c92.g$d */
    public static class d extends C34660d {
        public d(Context context) {
            super(context, "BluetoothSyncDevicesPrefs");
        }

        /* JADX INFO: renamed from: y */
        private String m13720y(BluetoothDevice bluetoothDevice) {
            if (bluetoothDevice == null) {
                return null;
            }
            return bluetoothDevice.getAddress();
        }

        /* JADX INFO: renamed from: A */
        public void m13721A(BluetoothDevice bluetoothDevice) {
            m109538q(m13720y(bluetoothDevice), false);
        }

        /* JADX INFO: renamed from: z */
        public void m13722z(BluetoothDevice bluetoothDevice) {
            m109538q(m13720y(bluetoothDevice), true);
        }
    }

    /* JADX INFO: renamed from: c92.g$e */
    public static class e extends C34662f {

        /* JADX INFO: renamed from: d */
        private Long f17628d;

        /* JADX INFO: renamed from: e */
        private Long f17629e;

        public e(Context context, C27858u c27858u) {
            super(context, "BluetoothSyncManager", c27858u);
        }

        /* JADX INFO: renamed from: A */
        public long m13723A() {
            if (this.f17628d == null) {
                this.f17628d = Long.valueOf(m109532i("HighWatermark", 0L));
            }
            return this.f17628d.longValue();
        }

        /* JADX INFO: renamed from: B */
        public long m13724B() {
            if (this.f17629e == null) {
                this.f17629e = Long.valueOf(m109532i("LastFullSyncTimestamp", 0L));
            }
            return this.f17629e.longValue();
        }

        /* JADX INFO: renamed from: C */
        public boolean m13725C() {
            return m109528e("IsExtremelyLagged", false);
        }

        /* JADX INFO: renamed from: D */
        public boolean m13726D() {
            return m109528e("IsLagged", false);
        }

        /* JADX INFO: renamed from: E */
        public boolean m13727E() {
            return m109528e("IsVeryLagged", false);
        }

        /* JADX INFO: renamed from: F */
        public void m13728F(boolean z4) {
            m109538q("IsExtremelyLagged", z4);
        }

        /* JADX INFO: renamed from: G */
        public void m13729G(boolean z4) {
            m109538q("IsLagged", z4);
        }

        /* JADX INFO: renamed from: H */
        public void m13730H(boolean z4) {
            m109538q("IsVeryLagged", z4);
        }

        /* JADX INFO: renamed from: I */
        public void m13731I(long j7) {
            this.f17629e = Long.valueOf(j7);
            m109542u("LastFullSyncTimestamp", j7);
        }
    }

    public C4335g(Context context, BluetoothAdapter bluetoothAdapter, C33706d c33706d, InterfaceC4366f interfaceC4366f, C27858u c27858u, FeatureFlagRepository featureFlagRepository, AbstractC21909c abstractC21909c, C21748b c21748b) {
        C4329a c4329a = (C4329a) AbstractC15751g.m44472y(C4329a.class, null, null);
        this.f17602I = c4329a;
        this.f17609P = false;
        this.f17611R = ((Long) AbstractC15751g.m44472y(Long.class, new C35953c("bluetoothSyncManagerDelay"), null)).longValue();
        this.f17612S = (InterfaceC31766c) AbstractC15751g.m44472y(InterfaceC31766c.class, null, null);
        this.f17614U = (C40191e) AbstractC15751g.m44472y(C40191e.class, null, null);
        this.f17618Y = new a();
        this.f17619Z = new RunnableC4332d(this, 0);
        b bVar = new b();
        this.f17620a0 = bVar;
        Context applicationContext = context.getApplicationContext();
        InterfaceC34116n interfaceC34116nM107847r = InterfaceC34116n.m107847r("BluetoothSyncManager", featureFlagRepository.isFeatureEnabled(ConnectivityFeatureFlagsKt.VERBOSE_SYNCING_LOGGING));
        this.f17607N = interfaceC34116nM107847r;
        this.f17621w = applicationContext;
        this.f17622x = WhoopSyncService.m24782b(applicationContext);
        this.f17623y = c33706d;
        this.f17598E = interfaceC4366f;
        this.f17599F = c27858u;
        this.f17601H = new d(applicationContext);
        this.f17613T = bluetoothAdapter;
        this.f17603J = (AlarmManager) applicationContext.getSystemService(NotificationCompat.CATEGORY_ALARM);
        this.f17615V = featureFlagRepository;
        this.f17616W = abstractC21909c;
        this.f17617X = c21748b;
        this.f17604K = PendingIntent.getBroadcast(applicationContext, 576, AbstractC4336h.m13732a(applicationContext), 67108864);
        BleWhoopStrapService.INSTANCE.m24627a(applicationContext, bVar, ((C30076h) AbstractC15751g.m44472y(C30076h.class, null, null)).m92195a());
        interfaceC4366f.mo13758f(new RunnableC4331c(this, 1));
        final int i13 = 0;
        AbstractC32570a.m101620a(applicationContext).m122652B(C22488a.m64989a().f88181a).m122661K(new InterfaceC3255b(this) { // from class: c92.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C4335g f17594x;

            {
                this.f17594x = this;
            }

            @Override // bh3.InterfaceC3255b
            /* JADX INFO: renamed from: b */
            public final void mo9472b(Object obj) {
                switch (i13) {
                    case 0:
                        this.f17594x.m13672R((Integer) obj);
                        break;
                    default:
                        this.f17594x.m13673S((C27858u.a) obj);
                        break;
                }
            }
        });
        final int i14 = 1;
        c27858u.m84061n().m122652B(C22488a.m64989a().f88181a).m122661K(new InterfaceC3255b(this) { // from class: c92.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C4335g f17594x;

            {
                this.f17594x = this;
            }

            @Override // bh3.InterfaceC3255b
            /* JADX INFO: renamed from: b */
            public final void mo9472b(Object obj) {
                switch (i14) {
                    case 0:
                        this.f17594x.m13672R((Integer) obj);
                        break;
                    default:
                        this.f17594x.m13673S((C27858u.a) obj);
                        break;
                }
            }
        });
        if (bluetoothAdapter != null) {
            if (interfaceC34116nM107847r.mo85231w()) {
                interfaceC34116nM107847r.mo85219j("Initial Bluetooth State: " + c4329a.m13650c(bluetoothAdapter.getState()), new AbstractC30556a.a[0]);
            }
        } else if (interfaceC34116nM107847r.mo85231w()) {
            interfaceC34116nM107847r.mo85219j("Initial Bluetooth State: No Adapter", new AbstractC30556a.a[0]);
        }
        m13679b0();
    }

    /* JADX INFO: renamed from: A */
    private void m13657A() {
        if (m13663H() != null || this.f17623y.mo106484A() == EnumC33707e.READY) {
            return;
        }
        if (this.f17607N.mo85231w()) {
            this.f17607N.mo85219j("Scheduling BLE tickle", new AbstractC30556a.a[0]);
        }
        AbstractC39342e.m125459i(EnumC39339b.BLE_RECONNECT_TICKLE, this.f17621w, 600, m13662G(), m13661F(), this.f17612S);
    }

    /* JADX INFO: renamed from: B */
    private boolean m13658B() {
        if (!m13671Q()) {
            return false;
        }
        this.f17607N.mo85219j("doLenientSync()", new AbstractC30556a.a[0]);
        m13701r0();
        if (m13663H() != null) {
            this.f17607N.mo85219j("Starting lenient sync", new AbstractC30556a.a[0]);
            this.f17622x.m24792d();
            return true;
        }
        if (this.f17607N.mo85231w()) {
            this.f17607N.mo85219j("Starting lenient sync but no device connected", new AbstractC30556a.a[0]);
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    private void m13659D() {
        if (m13671Q()) {
            if (!m13670P()) {
                this.f17607N.mo85226q("Not starting strict sync: Bluetooth isn't on", new AbstractC30556a.a[0]);
                return;
            }
            this.f17607N.mo85219j("Starting strict sync", new AbstractC30556a.a[0]);
            m13701r0();
            if (this.f17622x.m24793e()) {
                m13691k0();
            } else {
                this.f17607N.mo85222m("Failed to start strict sync service", new AbstractC30556a.a[0]);
            }
        }
    }

    /* JADX INFO: renamed from: E */
    private Handler m13660E() {
        if (this.f17606M == null) {
            HandlerThread handlerThread = new HandlerThread("Bluetooth Sync Manager Background Thread");
            handlerThread.start();
            this.f17606M = new Handler(handlerThread.getLooper());
        }
        return this.f17606M;
    }

    /* JADX INFO: renamed from: F */
    private long m13661F() {
        return m13662G() + 5000;
    }

    /* JADX INFO: renamed from: G */
    private long m13662G() {
        return ((Long) this.f17616W.getConfigurationValueFromJava(ConnectionRequestInterval.INSTANCE)).longValue();
    }

    /* JADX INFO: renamed from: H */
    private c m13663H() {
        InterfaceC21750d interfaceC21750d = this.f17624z;
        if (interfaceC21750d == null || interfaceC21750d.getConnectionState() != C32970n.f137298a) {
            return null;
        }
        return new c(this.f17624z.getBluetoothDevice());
    }

    /* JADX INFO: renamed from: I */
    private long m13664I() {
        return Math.max(m13667M().m13723A(), m13667M().m13724B());
    }

    /* JADX INFO: renamed from: K */
    private long m13665K() {
        return TimeUnit.MINUTES.toMillis(12L);
    }

    /* JADX INFO: renamed from: L */
    private long m13666L() {
        return TimeUnit.MINUTES.toMillis(6L);
    }

    /* JADX INFO: renamed from: M */
    private e m13667M() {
        if (this.f17605L == null) {
            this.f17605L = new e(this.f17621w, this.f17599F);
        }
        return this.f17605L;
    }

    /* JADX INFO: renamed from: N */
    private long m13668N() {
        return TimeUnit.HOURS.toMillis(1L);
    }

    /* JADX INFO: renamed from: O */
    private long m13669O() {
        return System.currentTimeMillis() - m13664I();
    }

    /* JADX INFO: renamed from: P */
    private boolean m13670P() {
        BluetoothAdapter bluetoothAdapter = this.f17613T;
        return bluetoothAdapter != null && bluetoothAdapter.getState() == 12;
    }

    /* JADX INFO: renamed from: Q */
    private boolean m13671Q() {
        return this.f17613T != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m13672R(Integer num) {
        if (this.f17607N.mo85231w()) {
            this.f17607N.mo85219j("Bluetooth state: " + this.f17602I.m13650c(num.intValue()), new AbstractC30556a.a[0]);
        }
        if (10 != num.intValue()) {
            if (12 == num.intValue()) {
                this.f17607N.mo85228t("tickling from bluetooth adapter state on", new AbstractC30556a.a[0]);
                m13719q0(false);
                return;
            }
            return;
        }
        m13693l0();
        WhoopSyncService.C10018b c10018b = this.f17622x;
        if (c10018b != null) {
            c10018b.m24794f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m13673S(C27858u.a aVar) {
        m13704t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m13674U(EnumC33707e enumC33707e) {
        if (!enumC33707e.isReady()) {
            m13696n0();
            return;
        }
        m13707w();
        if (this.f17607N.mo85231w()) {
            this.f17607N.mo85219j("Strap ready, scheduling", new AbstractC30556a.a[0]);
        }
        m13704t0();
        this.f17607N.mo85219j("strapStateSubscription calling trySync()", new AbstractC30556a.a[0]);
        m13701r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m13675V() {
        this.f17607N.mo85216g("posted quick nordic ble settling tickle", new AbstractC30556a.a[0]);
        m13719q0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m13676W(AbstractC32962f abstractC32962f) {
        if (abstractC32962f == C32970n.f137298a) {
            this.f17607N.mo85216g("Nordic BLE strap ready", new AbstractC30556a.a[0]);
            m13706v();
            m13704t0();
        } else if (abstractC32962f == C32963g.f137291a || (abstractC32962f instanceof C32965i)) {
            this.f17607N.mo85216g("nordic ble reconnected tickle", new AbstractC30556a.a[0]);
            m13719q0(false);
            m13660E().postDelayed(new RunnableC4332d(this, 1), this.f17611R);
        } else if (abstractC32962f == C32967k.f137296a) {
            this.f17607N.mo85216g("Got notified of the Faulty State!", new AbstractC30556a.a[0]);
            m13687h0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m13677X() {
        m13719q0(false);
    }

    /* JADX INFO: renamed from: b0 */
    private void m13679b0() {
        if (this.f17624z != null) {
            this.f17607N.mo85216g("got nordic source from service connection", new AbstractC30556a.a[0]);
            this.f17624z.mo104073M(new C30071c());
        } else {
            this.f17607N.mo85216g("did not get nordic source", new AbstractC30556a.a[0]);
        }
        this.f17600G.mo14750b();
        this.f17600G = this.f17623y.mo106496i().m122652B(C22488a.m64989a().f88182b).m122661K(new C4334f(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public void m13683e0() {
        m13667M().m13731I(System.currentTimeMillis());
        if (m13667M().m13725C()) {
            this.f17614U.m129054r();
        } else if (m13667M().m13727E()) {
            this.f17614U.m129056s();
        }
        m13667M().m13729G(false);
        m13667M().m13730H(false);
        m13667M().m13728F(false);
        m13696n0();
        m13704t0();
    }

    /* JADX INFO: renamed from: f0 */
    private void m13685f0() {
        if (this.f17624z != null) {
            C30071c c30071c = this.f17610Q;
            if (c30071c != null) {
                c30071c.dispose();
            }
            C30071c c30071c2 = new C30071c();
            this.f17610Q = c30071c2;
            this.f17624z.mo104073M(c30071c2);
            this.f17610Q.m92172c().m122661K(new C4334f(this, 1));
        }
    }

    /* JADX INFO: renamed from: h0 */
    private void m13687h0() {
        this.f17607N.mo85228t("Cancelling all scheduled Tickle reconnection jobs", new AbstractC30556a.a[0]);
        m13706v();
        this.f17607N.mo85228t("Removing Connection State observer in BSM", new AbstractC30556a.a[0]);
        this.f17624z.mo104077f0(this.f17610Q);
        if (this.f17609P) {
            this.f17607N.mo85228t("Setting strap ble device in the whoopStrapServiceBinder", new AbstractC30556a.a[0]);
            this.f17608O.m24626h(this.f17624z.getBluetoothDevice());
        }
    }

    /* JADX INFO: renamed from: i0 */
    private void m13688i0(long j7, long j13) {
        AbstractC39342e.m125457g(EnumC39339b.LENIENT_STRAP_SYNC, this.f17621w, 575, j7, j13, this.f17612S);
    }

    /* JADX INFO: renamed from: j0 */
    private void m13690j0(long j7) {
        long j13 = 30000 + j7;
        InterfaceC34116n interfaceC34116n = this.f17607N;
        StringBuilder sb4 = new StringBuilder("Scheduling strict sync for ");
        DateTimeFormatter dateTimeFormatter = f17597b0;
        sb4.append(dateTimeFormatter.print(j7));
        sb4.append(" / ");
        sb4.append(dateTimeFormatter.print(j13));
        interfaceC34116n.mo85219j(sb4.toString(), new AbstractC30556a.a[0]);
        this.f17603J.setAndAllowWhileIdle(0, j13, this.f17604K);
        long jCurrentTimeMillis = j7 - System.currentTimeMillis();
        if (jCurrentTimeMillis > 0) {
            m13660E().postDelayed(this.f17619Z, jCurrentTimeMillis);
        }
    }

    /* JADX INFO: renamed from: k0 */
    private void m13691k0() {
        m13660E().postDelayed(this.f17618Y, 20000L);
    }

    /* JADX INFO: renamed from: l0 */
    private void m13693l0() {
        if (this.f17607N.mo85231w()) {
            this.f17607N.mo85219j("stopAllSyncs()", new AbstractC30556a.a[0]);
        }
        m13696n0();
        m13694m0();
        m13708y();
        m13709z();
    }

    /* JADX INFO: renamed from: m0 */
    private void m13694m0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public void m13696n0() {
        this.f17607N.mo85219j("stopStrictSync()", new AbstractC30556a.a[0]);
        if (this.f17622x.m24795g()) {
            return;
        }
        this.f17607N.mo85222m("Failed to stop strict sync", new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: p0 */
    private void m13699p0() {
        if (this.f17607N.mo85231w()) {
            this.f17607N.mo85219j("tickling a lenientSync", new AbstractC30556a.a[0]);
        }
        m13658B();
        m13704t0();
    }

    /* JADX INFO: renamed from: r0 */
    private void m13701r0() {
        if (m13669O() <= 15000) {
            this.f17607N.mo85219j("Tried to sync, but not beyond sync threshold", new AbstractC30556a.a[0]);
            return;
        }
        this.f17607N.mo85219j("Trying to sync", new AbstractC30556a.a[0]);
        if (!this.f17623y.mo106484A().isReady()) {
            this.f17607N.mo85219j("Tried to sync but Gen3 nordic status: " + this.f17623y.mo106484A(), new AbstractC30556a.a[0]);
            return;
        }
        this.f17607N.mo85216g("Syncing history data from Gen 3 on new connectivity flow", new AbstractC30556a.a[0]);
        InterfaceC21750d interfaceC21750d = this.f17624z;
        if (interfaceC21750d != null) {
            this.f17598E.mo13754a(interfaceC21750d, false, "");
        } else {
            this.f17607N.mo85222m("Sensor HPS: sync skipped, no strap available", new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: s0 */
    private void m13702s0(long j7) {
        if (j7 > 43200000 && !m13667M().m13725C()) {
            if (this.f17607N.mo85231w()) {
                this.f17607N.mo85228t("extremely lagged", new AbstractC30556a.a[0]);
            }
            m13667M().m13728F(true);
            m13667M().m13730H(true);
            m13667M().m13729G(true);
            return;
        }
        if (j7 > 14400000 && !m13667M().m13727E()) {
            if (this.f17607N.mo85231w()) {
                this.f17607N.mo85228t("very lagged", new AbstractC30556a.a[0]);
            }
            m13667M().m13730H(true);
            m13667M().m13729G(true);
            return;
        }
        if (j7 <= 7200000 || m13667M().m13726D()) {
            return;
        }
        if (this.f17607N.mo85231w()) {
            this.f17607N.mo85228t("lagged", new AbstractC30556a.a[0]);
        }
        m13667M().m13729G(true);
    }

    /* JADX INFO: renamed from: t0 */
    private void m13704t0() {
        if (m13671Q()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jM13664I = m13664I();
            long jM13724B = m13667M().m13724B();
            long j7 = jCurrentTimeMillis - jM13724B;
            boolean zM84054e = this.f17599F.m84054e();
            if (this.f17607N.mo85231w()) {
                this.f17607N.mo85219j(AbstractC11895b.m31994m(j7, "updateSyncScheduling() "), new AbstractC30556a.a[0]);
            }
            if (jM13724B != 0) {
                m13702s0(j7);
            }
            if (m13663H() == null || !zM84054e || !m13670P()) {
                if (this.f17607N.mo85231w()) {
                    this.f17607N.mo85219j("updateSyncScheduling() is stopping all syncs", new AbstractC30556a.a[0]);
                }
                m13693l0();
                return;
            }
            m13708y();
            m13709z();
            long jM13668N = m13668N() + jM13664I;
            long jM13665K = m13665K() * 2;
            if (jM13668N < jCurrentTimeMillis && j7 > jM13665K) {
                if (this.f17607N.mo85231w()) {
                    this.f17607N.mo85219j("Strict time passed", new AbstractC30556a.a[0]);
                }
                m13717o0();
                m13690j0(jCurrentTimeMillis + m13668N());
                m13688i0(m13666L(), m13665K());
                return;
            }
            m13690j0(jM13668N);
            long jM13666L = m13666L() + jM13664I;
            long jM13665K2 = jM13664I + m13665K();
            if (jM13666L < jCurrentTimeMillis) {
                if (this.f17607N.mo85231w()) {
                    this.f17607N.mo85219j("Lenient start time passed", new AbstractC30556a.a[0]);
                }
                m13711Y();
                m13688i0(m13666L(), m13665K());
                return;
            }
            if (this.f17607N.mo85231w()) {
                this.f17607N.mo85219j("Scheduling for future", new AbstractC30556a.a[0]);
            }
            m13688i0(jM13666L - jCurrentTimeMillis, jM13665K2 - jCurrentTimeMillis);
            this.f17607N.mo85219j("updateSyncScheduling()", new AbstractC30556a.a[0]);
            m13701r0();
        }
    }

    /* JADX INFO: renamed from: v */
    private void m13706v() {
        if (this.f17607N.mo85231w()) {
            this.f17607N.mo85219j("Cancelling scheduled BLE tickles", new AbstractC30556a.a[0]);
        }
        AbstractC39342e.m125453c(this.f17621w, 600);
    }

    /* JADX INFO: renamed from: w */
    private void m13707w() {
        m13660E().removeCallbacks(this.f17618Y);
    }

    /* JADX INFO: renamed from: y */
    private void m13708y() {
        if (this.f17607N.mo85231w()) {
            this.f17607N.mo85219j("Canceling lenient sync", new AbstractC30556a.a[0]);
        }
        AbstractC39342e.m125453c(this.f17621w, 575);
    }

    /* JADX INFO: renamed from: z */
    private void m13709z() {
        if (this.f17607N.mo85231w()) {
            this.f17607N.mo85219j("Canceling strict sync", new AbstractC30556a.a[0]);
        }
        this.f17603J.cancel(this.f17604K);
        m13660E().removeCallbacks(this.f17619Z);
    }

    @Override // com.whoop.service.rearchitect.BleWhoopStrapService.InterfaceC10005c
    /* JADX INFO: renamed from: C */
    public void mo13710C(InterfaceC21750d interfaceC21750d) {
        this.f17607N.mo85216g("received nordic ble strap", new AbstractC30556a.a[0]);
        this.f17624z = interfaceC21750d;
        m13679b0();
        m13685f0();
    }

    /* JADX INFO: renamed from: Y */
    public boolean m13711Y() {
        return m13658B();
    }

    /* JADX INFO: renamed from: Z */
    public boolean m13712Z() {
        if (this.f17607N.mo85231w()) {
            this.f17607N.mo85219j("Lenient Sync From Scheduler", new AbstractC30556a.a[0]);
        }
        return m13711Y();
    }

    @Override // st0.InterfaceC32957a
    /* JADX INFO: renamed from: a */
    public void mo13713a(long j7) {
        if (j7 != 0) {
            m13660E().postDelayed(new RunnableC4331c(this, 0), j7);
        } else {
            this.f17607N.mo85222m("tickling with isForced set to true", new AbstractC30556a.a[0]);
            m13719q0(true);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m13714c0(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            if (this.f17607N.mo85231w()) {
                this.f17607N.mo85219j("non-whoop device, ignoring", new AbstractC30556a.a[0]);
                return;
            }
            return;
        }
        boolean z4 = bluetoothDevice.getType() == 2;
        if (this.f17607N.mo85231w()) {
            this.f17607N.mo85219j("Connected: " + this.f17602I.m13648a(bluetoothDevice) + " (isBle=" + z4 + ")", new AbstractC30556a.a[0]);
        }
        if (!z4) {
            this.f17601H.m13722z(bluetoothDevice);
        }
        if (z4) {
            this.f17607N.mo85228t("tickling from on device connected", new AbstractC30556a.a[0]);
            m13719q0(false);
        }
        m13704t0();
    }

    /* JADX INFO: renamed from: d0 */
    public void m13715d0(BluetoothDevice bluetoothDevice) {
        if (this.f17607N.mo85231w()) {
            this.f17607N.mo85219j("Disconnected: " + this.f17602I.m13648a(bluetoothDevice), new AbstractC30556a.a[0]);
        }
        if (bluetoothDevice != null) {
            this.f17601H.m13721A(bluetoothDevice);
            m13704t0();
        } else if (this.f17607N.mo85231w()) {
            this.f17607N.mo85219j("non-whoop device, ignoring", new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m13716g0() {
        if (this.f17607N.mo85231w()) {
            this.f17607N.mo85219j("Reboot", new AbstractC30556a.a[0]);
        }
        this.f17601H.m109525a();
        m13704t0();
    }

    /* JADX INFO: renamed from: o0 */
    public void m13717o0() {
        if (this.f17607N.mo85231w()) {
            this.f17607N.mo85219j("strictSync()", new AbstractC30556a.a[0]);
        }
        m13694m0();
        if (m13663H() != null) {
            m13709z();
            m13659D();
        } else if (this.f17607N.mo85231w()) {
            this.f17607N.mo85219j("Starting strict sync but no device connected", new AbstractC30556a.a[0]);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 interfaceC1585g0) {
        onStart(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(InterfaceC1585g0 interfaceC1585g0) {
        m13699p0();
        WhoopSyncService.C10018b c10018b = this.f17622x;
        if (c10018b != null) {
            c10018b.m24792d();
        }
        if (this.f17607N.mo85231w()) {
            this.f17607N.mo85219j("App Foreground - BLE", new AbstractC30556a.a[0]);
        }
        if (this.f17624z != null) {
            this.f17607N.mo85216g("App Foreground - Nordic BLE", new AbstractC30556a.a[0]);
            this.f17624z.mo104074O();
        }
    }

    @Override // com.whoop.service.rearchitect.BleWhoopStrapService.InterfaceC10005c
    /* JADX INFO: renamed from: q */
    public void mo13718q() {
        this.f17607N.mo85216g("Lost whoop strap reference", new AbstractC30556a.a[0]);
        this.f17624z = null;
    }

    /* JADX INFO: renamed from: q0 */
    public void m13719q0(boolean z4) {
        if (!this.f17617X.m61366c(z4)) {
            this.f17607N.mo85222m("Dropping connection request tickle due to throttle", new AbstractC30556a.a[0]);
            m13657A();
            return;
        }
        if (this.f17607N.mo85231w()) {
            this.f17607N.mo85219j("BLE Tickle", new AbstractC30556a.a[0]);
        }
        if (!z4 && AbstractC39342e.m125455e(600)) {
            this.f17607N.mo85226q("Throttle connection requests feature flag is on and there is already a pending tickle job scheduled, so returning.", new AbstractC30556a.a[0]);
            return;
        }
        InterfaceC21750d interfaceC21750d = this.f17624z;
        if (interfaceC21750d == null || interfaceC21750d.getConnectionState() == C32970n.f137298a) {
            return;
        }
        this.f17607N.mo85228t("Tickle nordic ble reconnect", new AbstractC30556a.a[0]);
        AbstractC32962f abstractC32962fM92165k = C30069a.f122700w.m92165k();
        if (abstractC32962fM92165k != C32967k.f137296a) {
            this.f17624z.mo104074O();
            m13657A();
            return;
        }
        this.f17607N.mo85222m("Received a tickle nordic reconnect when current state is " + abstractC32962fM92165k + ". Dropping the connection request!", new AbstractC30556a.a[0]);
    }
}
