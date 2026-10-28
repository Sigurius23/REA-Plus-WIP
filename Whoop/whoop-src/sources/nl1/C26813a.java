package nl1;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ch.C4588i;
import ci2.AbstractC4732a;
import ci2.InterfaceC4733b;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13052j1;
import ec3.C13060l1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import gt0.AbstractC16185g;
import gt0.InterfaceC16183e;
import gt0.InterfaceC16186h;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import l83.C23465k;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ws0.C37605a;

/* JADX INFO: renamed from: nl1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, m65681d2 = {"Lnl1/a;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Ltr2/n;", "logger", "Lgt0/e;", "firmwareUpdateApi", "Lci2/b;", "whoopStrapProvider", "Lbc3/c0;", "scope", "<init>", "(Ltr2/n;Lgt0/e;Lci2/b;Lbc3/c0;)V", "Ll83/a0;", "d", "()V", "Landroidx/lifecycle/g0;", "owner", "onCreate", "(Landroidx/lifecycle/g0;)V", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ltr2/n;", "x", "Lgt0/e;", "y", "Lci2/b;", "z", "Lbc3/c0;", "Lec3/p1;", "Lgt0/h;", "E", "Lec3/p1;", "otaFwUpdateStatusFlow", "Lec3/f2;", "F", "Lec3/f2;", "c", "()Lec3/f2;", "strapFwUpdateMonitorFlow", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26813a implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13075p1 otaFwUpdateStatusFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13037f2 strapFwUpdateMonitorFlow;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC16183e firmwareUpdateApi;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: nl1.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.firmware.NewFirmwareUpdateMonitor$observeFwUpdateStatus$$inlined$flatMapLatest$1", m100430f = "NewFirmwareUpdateMonitor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f106880w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f106881x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f106882y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C26813a f106883z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C26813a c26813a) {
            super(3, interfaceC30057d);
            this.f106883z = c26813a;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f106883z);
            aVar.f106881x = interfaceC13062m;
            aVar.f106882y = interfaceC21750d;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f106880w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f106881x;
                InterfaceC21750d interfaceC21750d = (InterfaceC21750d) this.f106882y;
                C13060l1 c13060l1 = new C13060l1(this.f106883z.firmwareUpdateApi.mo45721b(new AbstractC16185g.d(AbstractC4732a.m14816b(interfaceC21750d))), interfaceC21750d.mo24756z(), new b(null), 1);
                this.f106881x = null;
                this.f106882y = null;
                this.f106880w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13060l1, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (InterfaceC21750d) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: nl1.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.firmware.NewFirmwareUpdateMonitor$observeFwUpdateStatus$1$1", m100430f = "NewFirmwareUpdateMonitor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lgt0/h;", "fwUpdateStatus", "Lws0/a;", "batteryLevel", "Ll83/k;", "<anonymous>", "(Lgt0/h;Lws0/a;)Ll83/k;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f106884w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f106885x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f106886y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16186h interfaceC16186h, C37605a c37605a, InterfaceC30057d<? super C23465k> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f106885x = interfaceC16186h;
            bVar.f106886y = c37605a;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC16186h interfaceC16186h = (InterfaceC16186h) this.f106885x;
            C37605a c37605a = (C37605a) this.f106886y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f106884w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new C23465k(interfaceC16186h, c37605a);
        }
    }

    /* JADX INFO: renamed from: nl1.a$c */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.firmware.NewFirmwareUpdateMonitor$observeFwUpdateStatus$2", m100430f = "NewFirmwareUpdateMonitor.kt", m100431l = {53, 55}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Ll83/k;", "Lgt0/h;", "Lws0/a;", "<destruct>", "Ll83/a0;", "<anonymous>", "(Ll83/k;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f106888w;

        /* JADX INFO: renamed from: x */
        Object f106889x;

        /* JADX INFO: renamed from: y */
        int f106890y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f106891z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C26813a.this.new c(interfaceC30057d);
            cVar.f106891z = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0066 A[RETURN] */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C23465k c23465k = (C23465k) this.f106891z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f106890y;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC16186h interfaceC16186h = (InterfaceC16186h) c23465k.f92937w;
                if (((C37605a) c23465k.f92938x).getIsLowForFirmwareUpdate()) {
                    InterfaceC13075p1 interfaceC13075p1 = C26813a.this.otaFwUpdateStatusFlow;
                    InterfaceC16186h.h hVar = InterfaceC16186h.h.f61490b;
                    this.f106891z = null;
                    this.f106888w = null;
                    this.f106889x = null;
                    this.f106890y = 1;
                    ((C13045h2) interfaceC13075p1).emit(hVar, this);
                    if (c23454a0 == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    InterfaceC13075p1 interfaceC13075p2 = C26813a.this.otaFwUpdateStatusFlow;
                    this.f106891z = null;
                    this.f106888w = null;
                    this.f106889x = null;
                    this.f106890y = 2;
                    ((C13045h2) interfaceC13075p2).emit(interfaceC16186h, this);
                    if (c23454a0 == enumC31071a) {
                        return enumC31071a;
                    }
                }
            } else {
                if (i13 != 1 && i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return c23454a0;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C23465k c23465k, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(c23465k, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C26813a(InterfaceC34116n logger, InterfaceC16183e firmwareUpdateApi, InterfaceC4733b whoopStrapProvider, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(firmwareUpdateApi, "firmwareUpdateApi");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(scope, "scope");
        this.logger = logger;
        this.firmwareUpdateApi = firmwareUpdateApi;
        this.whoopStrapProvider = whoopStrapProvider;
        this.scope = scope;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(InterfaceC16186h.h.f61490b);
        this.otaFwUpdateStatusFlow = c13045h2M36593c;
        this.strapFwUpdateMonitorFlow = AbstractC13091v.m36598h(c13045h2M36593c);
    }

    /* JADX INFO: renamed from: d */
    private final void m79989d() {
        AbstractC13091v.m36582H(new C13052j1(AbstractC13091v.m36590P(new C4588i(this.whoopStrapProvider.mo14817a(), 2), new a(null, this)), new c(null), 0), this.scope);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC13037f2 getStrapFwUpdateMonitorFlow() {
        return this.strapFwUpdateMonitorFlow;
    }

    /* JADX INFO: renamed from: e */
    public final void m79991e() {
        ((C13045h2) this.otaFwUpdateStatusFlow).m36570j(InterfaceC16186h.h.f61490b);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        m79989d();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onDestroy(InterfaceC1585g0 interfaceC1585g0) {
        super.onDestroy(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(InterfaceC1585g0 interfaceC1585g0) {
        super.onPause(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onResume(InterfaceC1585g0 interfaceC1585g0) {
        super.onResume(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStart(InterfaceC1585g0 interfaceC1585g0) {
        super.onStart(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
        super.onStop(interfaceC1585g0);
    }
}
