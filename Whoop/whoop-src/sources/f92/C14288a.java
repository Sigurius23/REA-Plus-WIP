package f92;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import ci2.InterfaceC4733b;
import ci2.InterfaceC4734c;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.service.rearchitect.BleWhoopStrapService;
import dc3.EnumC11916a;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13045h2;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13075p1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.concurrent.CancellationException;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import q92.C30069a;
import q92.C30076h;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.AbstractC32962f;
import st0.AbstractC32977u;
import st0.C32963g;
import st0.C32965i;
import st0.C32967k;
import st0.C32969m;
import st0.C32970n;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: f92.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R \u0010*\u001a\u000e\u0012\n\u0012\b\u0018\u00010&R\u00020'0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0014018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\"\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0014078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\"\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0014018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u00103\u001a\u0004\b>\u00105R\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010I\u001a\u00020D8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H¨\u0006J"}, m65681d2 = {"Lf92/a;", "Lci2/b;", "Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;", "Ltr2/n;", "logger", "Landroid/content/Context;", "context", "Lq92/h;", "whoopStrapSharedPrefs", "", "isTest", "Lbc3/c0;", "coroutineScope", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lec3/l;", "Lst0/f;", "connectionStateFlow", "<init>", "(Ltr2/n;Landroid/content/Context;Lq92/h;ZLbc3/c0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lec3/l;)V", "Ljk0/d;", "whoopStrap", "Ll83/a0;", "n", "(Ljk0/d;)V", "m", "C", "q", "()V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ltr2/n;", "x", "Lbc3/c0;", "y", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "z", "Ljk0/d;", "Lec3/p1;", "Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;", "Lcom/whoop/service/rearchitect/BleWhoopStrapService;", "E", "Lec3/p1;", "serviceBinderFlow", "F", "_currentWhoopStrapFlow", "Lec3/o1;", "G", "Lec3/o1;", "_newWhoopStrapFlow", "Lec3/f2;", "H", "Lec3/f2;", "c", "()Lec3/f2;", "currentWhoopStrapFlow", "Lec3/t1;", "I", "Lec3/t1;", "b", "()Lec3/t1;", "newWhoopStrapFlow", "J", "a", "commandCapableStrapFlow", "Lbc3/k1;", "K", "Lbc3/k1;", "detectStrapConnectionStatusJob", "Landroid/content/ServiceConnection;", "L", "Landroid/content/ServiceConnection;", "getServiceConnection$core_release", "()Landroid/content/ServiceConnection;", "serviceConnection", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14288a implements InterfaceC4733b, BleWhoopStrapService.InterfaceC10005c {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13075p1 serviceBinderFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13075p1 _currentWhoopStrapFlow;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13072o1 _newWhoopStrapFlow;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13037f2 currentWhoopStrapFlow;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC13087t1 newWhoopStrapFlow;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC13037f2 commandCapableStrapFlow;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private InterfaceC3027k1 detectStrapConnectionStatusJob;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final ServiceConnection serviceConnection;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private InterfaceC21750d whoopStrap;

    /* JADX INFO: renamed from: f92.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.service.firmware.memfault.WhoopStrapProviderImpl$commandCapableStrapFlow$1", m100430f = "WhoopStrapProviderImpl.kt", m100431l = {79}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ljk0/d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f52169w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f52170x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f52170x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f52170x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f52169w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f52170x = null;
                this.f52169w = 1;
                if (interfaceC13062m.emit(null, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: f92.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.service.firmware.memfault.WhoopStrapProviderImpl$commandCapableStrapFlow$2", m100430f = "WhoopStrapProviderImpl.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0018\u00010\u0002R\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, m65681d2 = {"Lst0/f;", "state", "Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;", "Lcom/whoop/service/rearchitect/BleWhoopStrapService;", "binder", "Ljk0/d;", "dataPlaneStrap", "<anonymous>", "(Lst0/f;Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;Ljk0/d;)Ljk0/d;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        int f52172w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f52173x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f52174y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f52175z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(4, interfaceC30057d);
        }

        @Override // c93.InterfaceC4352n
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC32962f abstractC32962f, BleWhoopStrapService.BinderC10003a binderC10003a, InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super InterfaceC21750d> interfaceC30057d) {
            b bVar = C14288a.this.new b(interfaceC30057d);
            bVar.f52173x = abstractC32962f;
            bVar.f52174y = binderC10003a;
            bVar.f52175z = interfaceC21750d;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC32962f abstractC32962f = (AbstractC32962f) this.f52173x;
            BleWhoopStrapService.BinderC10003a binderC10003a = (BleWhoopStrapService.BinderC10003a) this.f52174y;
            InterfaceC21750d interfaceC21750d = (InterfaceC21750d) this.f52175z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f52172w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC32977u.m104087a(C14288a.this.featureFlagChecker)) {
                interfaceC21750d = null;
                if (!AbstractC22676k.m65745e(abstractC32962f, C32970n.f137298a) && !AbstractC22676k.m65745e(abstractC32962f, C32969m.f137297a)) {
                    return null;
                }
                if (binderC10003a != null) {
                    return binderC10003a.m24624f();
                }
            }
            return interfaceC21750d;
        }
    }

    /* JADX INFO: renamed from: f92.a$c */
    @Metadata(m65680d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"f92/a$c", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "componentName", "Landroid/os/IBinder;", "binder", "Ll83/a0;", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements ServiceConnection {
        public c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder binder) {
            AbstractC22676k.m65750j(componentName, "componentName");
            AbstractC22676k.m65750j(binder, "binder");
            BleWhoopStrapService.BinderC10003a binderC10003a = binder instanceof BleWhoopStrapService.BinderC10003a ? (BleWhoopStrapService.BinderC10003a) binder : null;
            if (binderC10003a != null) {
                C13045h2 c13045h2 = (C13045h2) C14288a.this.serviceBinderFlow;
                c13045h2.getClass();
                c13045h2.m36571k(null, binderC10003a);
                binderC10003a.m24623c(C14288a.this);
                return;
            }
            C14288a.this.logger.mo85222m("Failed to cast binder: " + binder + " to BleWhoopStrapServiceBinder", new AbstractC30556a.a[0]);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            AbstractC22676k.m65750j(componentName, "componentName");
            C14288a.this.logger.mo85216g("DefaultUpdateStrategy service disconnected", new AbstractC30556a.a[0]);
            C14288a.this.whoopStrap = null;
            ((C13045h2) C14288a.this.serviceBinderFlow).m36570j(null);
            ((C13045h2) C14288a.this._currentWhoopStrapFlow).m36570j(null);
            C14288a.this.m40828n(null);
            C14288a.m40818d(C14288a.this);
            InterfaceC3027k1 interfaceC3027k1 = C14288a.this.detectStrapConnectionStatusJob;
            if (interfaceC3027k1 != null) {
                interfaceC3027k1.cancel((CancellationException) null);
            }
        }
    }

    /* JADX INFO: renamed from: f92.a$d */
    @InterfaceC32271e(m100429c = "com.whoop.service.firmware.memfault.WhoopStrapProviderImpl$startMonitoringWhoopStrapDisconnects$1", m100430f = "WhoopStrapProviderImpl.kt", m100431l = {174}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f52177w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC21750d f52178x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C14288a f52179y;

        /* JADX INFO: renamed from: f92.a$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C14288a f52180w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC21750d f52181x;

            public a(C14288a c14288a, InterfaceC21750d interfaceC21750d) {
                this.f52180w = c14288a;
                this.f52181x = interfaceC21750d;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC32962f abstractC32962f, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (AbstractC22676k.m65745e(abstractC32962f, C32970n.f137298a)) {
                    this.f52180w.m40828n(this.f52181x);
                } else if (AbstractC22676k.m65745e(abstractC32962f, C32969m.f137297a) || (abstractC32962f instanceof C32965i) || AbstractC22676k.m65745e(abstractC32962f, C32967k.f137296a) || AbstractC22676k.m65745e(abstractC32962f, C32963g.f137291a)) {
                    this.f52180w.m40828n(null);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC21750d interfaceC21750d, C14288a c14288a, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f52178x = interfaceC21750d;
            this.f52179y = c14288a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f52178x, this.f52179y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f52177w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l connectionStateFlow = this.f52178x.getConnectionStateFlow();
                a aVar = new a(this.f52179y, this.f52178x);
                this.f52177w = 1;
                if (connectionStateFlow.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: f92.a$e */
    @InterfaceC32271e(m100429c = "com.whoop.service.firmware.memfault.WhoopStrapProviderImpl$updateWhoopStrapValue$1", m100430f = "WhoopStrapProviderImpl.kt", m100431l = {161}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f52182w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC21750d f52184y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f52184y = interfaceC21750d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C14288a.this.new e(this.f52184y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f52182w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C14288a.this._newWhoopStrapFlow;
                InterfaceC21750d interfaceC21750d = this.f52184y;
                this.f52182w = 1;
                if (interfaceC13072o1.emit(interfaceC21750d, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    public C14288a(InterfaceC34116n logger, Context context, C30076h whoopStrapSharedPrefs, boolean z4, InterfaceC2994c0 coroutineScope, FeatureFlagChecker featureFlagChecker, InterfaceC13058l connectionStateFlow) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(whoopStrapSharedPrefs, "whoopStrapSharedPrefs");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(connectionStateFlow, "connectionStateFlow");
        this.logger = logger;
        this.coroutineScope = coroutineScope;
        this.featureFlagChecker = featureFlagChecker;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(null);
        this.serviceBinderFlow = c13045h2M36593c;
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(null);
        this._currentWhoopStrapFlow = c13045h2M36593c2;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(1, 0, EnumC11916a.f38983x, 2);
        this._newWhoopStrapFlow = c13096w1M36592b;
        this.currentWhoopStrapFlow = AbstractC13091v.m36598h(c13045h2M36593c2);
        this.newWhoopStrapFlow = AbstractC13091v.m36597g(c13096w1M36592b);
        this.commandCapableStrapFlow = AbstractC13091v.m36587M(AbstractC13091v.m36606p(connectionStateFlow, c13045h2M36593c, new C13015a0(new a(null), c13096w1M36592b), new b(null)), coroutineScope, C13105z1.f45288a, null);
        c cVar = new c();
        this.serviceConnection = cVar;
        if (z4) {
            return;
        }
        BleWhoopStrapService.INSTANCE.m24627a(context, cVar, whoopStrapSharedPrefs.m92195a());
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ InterfaceC4734c m40818d(C14288a c14288a) {
        c14288a.getClass();
        return null;
    }

    /* JADX INFO: renamed from: m */
    private final void m40827m(InterfaceC21750d whoopStrap) {
        this.detectStrapConnectionStatusJob = AbstractC3006f0.m8732z(this.coroutineScope, null, null, new d(whoopStrap, this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final void m40828n(InterfaceC21750d whoopStrap) {
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new e(whoopStrap, null), 3);
    }

    @Override // com.whoop.service.rearchitect.BleWhoopStrapService.InterfaceC10005c
    /* JADX INFO: renamed from: C */
    public void mo13710C(InterfaceC21750d whoopStrap) {
        AbstractC22676k.m65750j(whoopStrap, "whoopStrap");
        this.whoopStrap = whoopStrap;
        C13045h2 c13045h2 = (C13045h2) this._currentWhoopStrapFlow;
        c13045h2.getClass();
        c13045h2.m36571k(null, whoopStrap);
        if (whoopStrap.get_strapInfo() != null) {
            m40828n(whoopStrap);
        }
        InterfaceC3027k1 interfaceC3027k1 = this.detectStrapConnectionStatusJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        m40827m(whoopStrap);
    }

    @Override // ci2.InterfaceC4733b
    /* JADX INFO: renamed from: a, reason: from getter */
    public InterfaceC13037f2 getCommandCapableStrapFlow() {
        return this.commandCapableStrapFlow;
    }

    @Override // ci2.InterfaceC4733b
    /* JADX INFO: renamed from: b, reason: from getter */
    public InterfaceC13087t1 getNewWhoopStrapFlow() {
        return this.newWhoopStrapFlow;
    }

    @Override // ci2.InterfaceC4733b
    /* JADX INFO: renamed from: c, reason: from getter */
    public InterfaceC13037f2 getCurrentWhoopStrapFlow() {
        return this.currentWhoopStrapFlow;
    }

    @Override // com.whoop.service.rearchitect.BleWhoopStrapService.InterfaceC10005c
    /* JADX INFO: renamed from: q */
    public void mo13718q() {
        this.logger.mo85228t("Lost Whoop Strap", new AbstractC30556a.a[0]);
        this.whoopStrap = null;
        ((C13045h2) this._currentWhoopStrapFlow).m36570j(null);
        m40828n(null);
        InterfaceC3027k1 interfaceC3027k1 = this.detectStrapConnectionStatusJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
    }

    public /* synthetic */ C14288a(InterfaceC34116n interfaceC34116n, Context context, C30076h c30076h, boolean z4, InterfaceC2994c0 interfaceC2994c0, FeatureFlagChecker featureFlagChecker, InterfaceC13058l interfaceC13058l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC34116n, context, c30076h, z4, interfaceC2994c0, featureFlagChecker, (i13 & 64) != 0 ? C30069a.f122700w.m92162e() : interfaceC13058l);
    }
}
