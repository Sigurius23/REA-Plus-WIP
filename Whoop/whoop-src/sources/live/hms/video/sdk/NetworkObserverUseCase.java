package live.hms.video.sdk;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13087t1;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import l83.InterfaceC23462h;
import lh1.C24069a;
import live.hms.video.connection.degredation.StatsBundle;
import live.hms.video.connection.stats.quality.HMSNetworkObserver;
import live.hms.video.connection.stats.quality.HMSNetworkQuality;
import live.hms.video.connection.stats.quality.NetworkQualityCalculator;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, m65681d2 = {"Llive/hms/video/sdk/NetworkObserverUseCase;", "Ljava/io/Closeable;", "Lec3/t1;", "Llive/hms/video/connection/degredation/StatsBundle;", "statsFlow", "Llive/hms/video/sdk/SDKStore;", "store", "Lkotlin/Function0;", "", "hasJoined", "<init>", "(Lec3/t1;Llive/hms/video/sdk/SDKStore;Lc93/a;)V", "Llive/hms/video/connection/stats/quality/HMSNetworkObserver;", "observer", "Ll83/a0;", "addNetworkObserver", "(Llive/hms/video/connection/stats/quality/HMSNetworkObserver;)V", "startNetworkObserver", "()V", "close", "Lec3/t1;", "getStatsFlow", "()Lec3/t1;", "Llive/hms/video/sdk/SDKStore;", "getStore", "()Llive/hms/video/sdk/SDKStore;", "Lc93/a;", "networkObserver", "Llive/hms/video/connection/stats/quality/HMSNetworkObserver;", "Lbc3/c0;", "networkObserverScope", "Lbc3/c0;", "Lbc3/k1;", "qualityObserverJob", "Lbc3/k1;", "Llive/hms/video/connection/stats/quality/NetworkQualityCalculator;", "networkQualityCalculator$delegate", "Ll83/h;", "getNetworkQualityCalculator", "()Llive/hms/video/connection/stats/quality/NetworkQualityCalculator;", "networkQualityCalculator", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class NetworkObserverUseCase implements Closeable {
    private final InterfaceC4339a hasJoined;
    private HMSNetworkObserver networkObserver;
    private InterfaceC2994c0 networkObserverScope;

    /* JADX INFO: renamed from: networkQualityCalculator$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h networkQualityCalculator;
    private InterfaceC3027k1 qualityObserverJob;
    private final InterfaceC13087t1 statsFlow;
    private final SDKStore store;

    /* JADX INFO: renamed from: live.hms.video.sdk.NetworkObserverUseCase$startNetworkObserver$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.NetworkObserverUseCase$startNetworkObserver$1", m100430f = "NetworkObserverUseCase.kt", m100431l = {37}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241951 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSNetworkObserver $nullCheckedObserver;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241951(HMSNetworkObserver hMSNetworkObserver, InterfaceC30057d<? super C241951> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$nullCheckedObserver = hMSNetworkObserver;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return NetworkObserverUseCase.this.new C241951(this.$nullCheckedObserver, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241951) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13087t1 statsFlow = NetworkObserverUseCase.this.getStatsFlow();
                final NetworkObserverUseCase networkObserverUseCase = NetworkObserverUseCase.this;
                final HMSNetworkObserver hMSNetworkObserver = this.$nullCheckedObserver;
                InterfaceC13062m interfaceC13062m = new InterfaceC13062m() { // from class: live.hms.video.sdk.NetworkObserverUseCase.startNetworkObserver.1.1
                    @Override // ec3.InterfaceC13062m
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC30057d interfaceC30057d) {
                        return emit((StatsBundle) obj2, (InterfaceC30057d<? super C23454a0>) interfaceC30057d);
                    }

                    public final Object emit(StatsBundle statsBundle, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                        hMSNetworkObserver.onNetworkQuality(new HMSNetworkQuality(networkObserverUseCase.getNetworkQualityCalculator().calculateNetworkQuality(statsBundle.getTotalPackets(), statsBundle.getPacketLoss())), networkObserverUseCase.getStore().getLocalPeer());
                        return C23454a0.f92919a;
                    }
                };
                this.label = 1;
                if (statsFlow.collect(interfaceC13062m, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public NetworkObserverUseCase(InterfaceC13087t1 statsFlow, SDKStore store, InterfaceC4339a hasJoined) {
        AbstractC22676k.m65750j(statsFlow, "statsFlow");
        AbstractC22676k.m65750j(store, "store");
        AbstractC22676k.m65750j(hasJoined, "hasJoined");
        this.statsFlow = statsFlow;
        this.store = store;
        this.hasJoined = hasJoined;
        this.networkObserverScope = AbstractC3006f0.m8708b(AbstractC3006f0.m8710d());
        this.networkQualityCalculator = AbstractC30060g.m92088H(new C24069a(7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkQualityCalculator networkQualityCalculator_delegate$lambda$0() {
        return new NetworkQualityCalculator();
    }

    public final void addNetworkObserver(HMSNetworkObserver observer) {
        AbstractC22676k.m65750j(observer, "observer");
        this.networkObserver = observer;
        if (((Boolean) this.hasJoined.invoke()).booleanValue()) {
            startNetworkObserver();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InterfaceC3027k1 interfaceC3027k1 = this.qualityObserverJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        AbstractC3006f0.m8714h(this.networkObserverScope, null);
        this.networkObserver = null;
        this.networkObserverScope = AbstractC3006f0.m8708b(AbstractC3006f0.m8710d());
    }

    public final NetworkQualityCalculator getNetworkQualityCalculator() {
        return (NetworkQualityCalculator) this.networkQualityCalculator.getValue();
    }

    public final InterfaceC13087t1 getStatsFlow() {
        return this.statsFlow;
    }

    public final SDKStore getStore() {
        return this.store;
    }

    public final void startNetworkObserver() {
        HMSNetworkObserver hMSNetworkObserver = this.networkObserver;
        if (hMSNetworkObserver != null) {
            InterfaceC3027k1 interfaceC3027k1 = this.qualityObserverJob;
            if (interfaceC3027k1 != null) {
                interfaceC3027k1.cancel((CancellationException) null);
            }
            this.qualityObserverJob = AbstractC3006f0.m8732z(this.networkObserverScope, null, null, new C241951(hMSNetworkObserver, null), 3);
        }
    }
}
