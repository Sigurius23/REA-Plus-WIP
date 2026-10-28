package live.hms.video.sdk;

import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3069w1;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import hc3.AbstractC17182o;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import live.hms.video.connection.stats.quality.HMSNetworkQuality;
import live.hms.video.events.AnalyticsEventFactory;
import live.hms.video.events.AnalyticsEventsService;
import live.hms.video.sdk.models.HMSConfig;
import live.hms.video.sdk.models.HMSLocalPeer;
import live.hms.video.sdk.models.enums.HMSPeerUpdate;
import live.hms.video.signal.init.NetworkHealth;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JX\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J_\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0003R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Llive/hms/video/sdk/SpeedTestUseCase;", "Ljava/io/Closeable;", "<init>", "()V", "Llive/hms/video/sdk/models/HMSConfig;", "hmsConfig", "Llive/hms/video/signal/init/NetworkHealth;", "networkHealth", "Llive/hms/video/sdk/SDKStore;", "store", "Llive/hms/video/sdk/HMSPreviewListener;", "hmsPreviewListener", "Llive/hms/video/events/AnalyticsEventsService;", "analyticsEventsService", "Lkotlin/Function0;", "Ll83/a0;", "onTimeout", "onComplete", "run", "(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/signal/init/NetworkHealth;Llive/hms/video/sdk/SDKStore;Llive/hms/video/sdk/HMSPreviewListener;Llive/hms/video/events/AnalyticsEventsService;Lc93/a;Lc93/a;Lq83/d;)Ljava/lang/Object;", "Lbc3/c0;", "scope", "speedTestAndNotify", "(Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/signal/init/NetworkHealth;Llive/hms/video/sdk/SDKStore;Llive/hms/video/sdk/HMSPreviewListener;Llive/hms/video/events/AnalyticsEventsService;Lc93/a;Lc93/a;Lbc3/c0;)V", "close", "Lbc3/k1;", "speedTestJob", "Lbc3/k1;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class SpeedTestUseCase implements Closeable {
    private InterfaceC3027k1 speedTestJob;

    /* JADX INFO: renamed from: live.hms.video.sdk.SpeedTestUseCase$run$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SpeedTestUseCase", m100430f = "SpeedTestUseCase.kt", m100431l = {52, 62}, m100432m = "run")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C242571 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C242571(InterfaceC30057d<? super C242571> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpeedTestUseCase.this.run(null, null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SpeedTestUseCase$run$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SpeedTestUseCase$run$2", m100430f = "SpeedTestUseCase.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242582 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSPreviewListener $hmsPreviewListener;
        final /* synthetic */ HMSLocalPeer $localPeer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242582(HMSPreviewListener hMSPreviewListener, HMSLocalPeer hMSLocalPeer, InterfaceC30057d<? super C242582> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$hmsPreviewListener = hMSPreviewListener;
            this.$localPeer = hMSLocalPeer;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C242582(this.$hmsPreviewListener, this.$localPeer, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242582) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            HMSPreviewListener hMSPreviewListener = this.$hmsPreviewListener;
            if (hMSPreviewListener == null) {
                return null;
            }
            hMSPreviewListener.onPeerUpdate(HMSPeerUpdate.NETWORK_QUALITY_UPDATED, this.$localPeer);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sdk.SpeedTestUseCase$speedTestAndNotify$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.SpeedTestUseCase$speedTestAndNotify$1", m100430f = "SpeedTestUseCase.kt", m100431l = {26}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242591 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ AnalyticsEventsService $analyticsEventsService;
        final /* synthetic */ HMSConfig $hmsConfig;
        final /* synthetic */ HMSPreviewListener $hmsPreviewListener;
        final /* synthetic */ NetworkHealth $networkHealth;
        final /* synthetic */ InterfaceC4339a $onComplete;
        final /* synthetic */ InterfaceC4339a $onTimeout;
        final /* synthetic */ SDKStore $store;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242591(HMSConfig hMSConfig, NetworkHealth networkHealth, SDKStore sDKStore, HMSPreviewListener hMSPreviewListener, AnalyticsEventsService analyticsEventsService, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC30057d<? super C242591> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$hmsConfig = hMSConfig;
            this.$networkHealth = networkHealth;
            this.$store = sDKStore;
            this.$hmsPreviewListener = hMSPreviewListener;
            this.$analyticsEventsService = analyticsEventsService;
            this.$onTimeout = interfaceC4339a;
            this.$onComplete = interfaceC4339a2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SpeedTestUseCase.this.new C242591(this.$hmsConfig, this.$networkHealth, this.$store, this.$hmsPreviewListener, this.$analyticsEventsService, this.$onTimeout, this.$onComplete, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242591) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                SpeedTestUseCase speedTestUseCase = SpeedTestUseCase.this;
                HMSConfig hMSConfig = this.$hmsConfig;
                NetworkHealth networkHealth = this.$networkHealth;
                SDKStore sDKStore = this.$store;
                HMSPreviewListener hMSPreviewListener = this.$hmsPreviewListener;
                AnalyticsEventsService analyticsEventsService = this.$analyticsEventsService;
                InterfaceC4339a interfaceC4339a = this.$onTimeout;
                InterfaceC4339a interfaceC4339a2 = this.$onComplete;
                this.label = 1;
                if (speedTestUseCase.run(hMSConfig, networkHealth, sDKStore, hMSPreviewListener, analyticsEventsService, interfaceC4339a, interfaceC4339a2, this) == enumC31071a) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object run(HMSConfig hMSConfig, NetworkHealth networkHealth, SDKStore sDKStore, HMSPreviewListener hMSPreviewListener, AnalyticsEventsService analyticsEventsService, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C242571 c242571;
        SpeedTest speedTest;
        int speedTestScore;
        AnalyticsEventsService analyticsEventsService2;
        Double d3;
        if (interfaceC30057d instanceof C242571) {
            c242571 = (C242571) interfaceC30057d;
            int i13 = c242571.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c242571.label = i13 - Integer.MIN_VALUE;
            } else {
                c242571 = new C242571(interfaceC30057d);
            }
        } else {
            c242571 = new C242571(interfaceC30057d);
        }
        Object downloadSpeedInKilobytesPerSecond = c242571.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c242571.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 != 0) {
            if (i14 == 1) {
                speedTest = (SpeedTest) c242571.L$5;
                interfaceC4339a2 = (InterfaceC4339a) c242571.L$4;
                analyticsEventsService = (AnalyticsEventsService) c242571.L$3;
                hMSPreviewListener = (HMSPreviewListener) c242571.L$2;
                sDKStore = (SDKStore) c242571.L$1;
                networkHealth = (NetworkHealth) c242571.L$0;
                AbstractC34132o.m107864I(downloadSpeedInKilobytesPerSecond);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                speedTestScore = c242571.I$0;
                d3 = (Double) c242571.L$1;
                analyticsEventsService2 = (AnalyticsEventsService) c242571.L$0;
                AbstractC34132o.m107864I(downloadSpeedInKilobytesPerSecond);
            }
            analyticsEventsService2.queue(AnalyticsEventFactory.INSTANCE.networkQualityInPreviewResults(speedTestScore, d3)).flush();
            return c23454a0;
        }
        AbstractC34132o.m107864I(downloadSpeedInKilobytesPerSecond);
        if (networkHealth != null && hMSConfig.getCaptureNetworkQualityInPreview()) {
            interfaceC4339a.invoke();
            speedTest = new SpeedTest();
            c242571.L$0 = networkHealth;
            c242571.L$1 = sDKStore;
            c242571.L$2 = hMSPreviewListener;
            c242571.L$3 = analyticsEventsService;
            c242571.L$4 = interfaceC4339a2;
            c242571.L$5 = speedTest;
            c242571.label = 1;
            downloadSpeedInKilobytesPerSecond = speedTest.getDownloadSpeedInKilobytesPerSecond(networkHealth, c242571);
            if (downloadSpeedInKilobytesPerSecond != enumC31071a) {
            }
            return enumC31071a;
        }
        return c23454a0;
        Double d14 = (Double) downloadSpeedInKilobytesPerSecond;
        interfaceC4339a2.invoke();
        speedTestScore = speedTest.getSpeedTestScore(d14, networkHealth.getScoreMap());
        HMSLocalPeer localPeer = sDKStore.getLocalPeer();
        if (localPeer == null) {
            return c23454a0;
        }
        localPeer.setNetworkQuality$lib_release(new HMSNetworkQuality(speedTestScore));
        C22365e c22365e = AbstractC3050q0.f12077a;
        AbstractC3069w1 abstractC3069w1 = AbstractC17182o.f65999a;
        C242582 c242582 = new C242582(hMSPreviewListener, localPeer, null);
        c242571.L$0 = analyticsEventsService;
        c242571.L$1 = d14;
        c242571.L$2 = null;
        c242571.L$3 = null;
        c242571.L$4 = null;
        c242571.L$5 = null;
        c242571.I$0 = speedTestScore;
        c242571.label = 2;
        if (AbstractC3006f0.m8705K(abstractC3069w1, c242582, c242571) != enumC31071a) {
            analyticsEventsService2 = analyticsEventsService;
            d3 = d14;
            analyticsEventsService2.queue(AnalyticsEventFactory.INSTANCE.networkQualityInPreviewResults(speedTestScore, d3)).flush();
            return c23454a0;
        }
        return enumC31071a;
    }

    public static void speedTestAndNotify$default(SpeedTestUseCase speedTestUseCase, HMSConfig hMSConfig, NetworkHealth networkHealth, SDKStore sDKStore, HMSPreviewListener hMSPreviewListener, AnalyticsEventsService analyticsEventsService, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC2994c0 interfaceC2994c0, int i13, Object obj) {
        InterfaceC2994c0 interfaceC2994c0M8708b;
        if ((i13 & 128) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            interfaceC2994c0M8708b = AbstractC3006f0.m8708b(ExecutorC22364d.f87316w);
        } else {
            interfaceC2994c0M8708b = interfaceC2994c0;
        }
        speedTestUseCase.speedTestAndNotify(hMSConfig, networkHealth, sDKStore, hMSPreviewListener, analyticsEventsService, interfaceC4339a, interfaceC4339a2, interfaceC2994c0M8708b);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InterfaceC3027k1 interfaceC3027k1 = this.speedTestJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
    }

    public final void speedTestAndNotify(HMSConfig hmsConfig, NetworkHealth networkHealth, SDKStore store, HMSPreviewListener hmsPreviewListener, AnalyticsEventsService analyticsEventsService, InterfaceC4339a onTimeout, InterfaceC4339a onComplete, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(hmsConfig, "hmsConfig");
        AbstractC22676k.m65750j(store, "store");
        AbstractC22676k.m65750j(analyticsEventsService, "analyticsEventsService");
        AbstractC22676k.m65750j(onTimeout, "onTimeout");
        AbstractC22676k.m65750j(onComplete, "onComplete");
        AbstractC22676k.m65750j(scope, "scope");
        this.speedTestJob = AbstractC3006f0.m8732z(scope, null, null, new C242591(hmsConfig, networkHealth, store, hmsPreviewListener, analyticsEventsService, onTimeout, onComplete, null), 3);
    }
}
