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
import live.hms.video.connection.degredation.StatsBundle;
import live.hms.video.connection.stats.HMSStatsObserver;
import live.hms.video.media.tracks.HMSTrack;
import live.hms.video.sdk.featureflags.FeatureFlags;
import live.hms.video.sdk.featureflags.Features;
import live.hms.video.sdk.models.HMSLocalPeer;
import live.hms.video.sdk.models.HMSPeer;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Llive/hms/video/sdk/RtcStatsObserverUseCase;", "Ljava/io/Closeable;", "Lec3/t1;", "Llive/hms/video/connection/degredation/StatsBundle;", "statsFlow", "Llive/hms/video/sdk/SDKStore;", "store", "Lkotlin/Function0;", "", "hasJoined", "<init>", "(Lec3/t1;Llive/hms/video/sdk/SDKStore;Lc93/a;)V", "Llive/hms/video/connection/stats/HMSStatsObserver;", "observer", "Ll83/a0;", "addStatsObserver", "(Llive/hms/video/connection/stats/HMSStatsObserver;)V", "startStatsObserver", "()V", "close", "Lec3/t1;", "Llive/hms/video/sdk/SDKStore;", "getStore", "()Llive/hms/video/sdk/SDKStore;", "Lc93/a;", "statsObserver", "Llive/hms/video/connection/stats/HMSStatsObserver;", "Lbc3/c0;", "statsObserverScope", "Lbc3/c0;", "Lbc3/k1;", "statsObserverJob", "Lbc3/k1;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class RtcStatsObserverUseCase implements Closeable {
    private final InterfaceC4339a hasJoined;
    private final InterfaceC13087t1 statsFlow;
    private HMSStatsObserver statsObserver;
    private InterfaceC3027k1 statsObserverJob;
    private InterfaceC2994c0 statsObserverScope;
    private final SDKStore store;

    /* JADX INFO: renamed from: live.hms.video.sdk.RtcStatsObserverUseCase$startStatsObserver$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sdk.RtcStatsObserverUseCase$startStatsObserver$1", m100430f = "RtcStatsObserverUseCase.kt", m100431l = {37}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241971 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSStatsObserver $nullCheckedObserver;
        int label;

        /* JADX INFO: renamed from: live.hms.video.sdk.RtcStatsObserverUseCase$startStatsObserver$1$1, reason: invalid class name */
        @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
        public static final class AnonymousClass1<T> implements InterfaceC13062m {
            final /* synthetic */ BundleToStatsObserver $bundleToStats;
            final /* synthetic */ HMSStatsObserver $nullCheckedObserver;
            final /* synthetic */ RtcStatsObserverUseCase this$0;

            public AnonymousClass1(BundleToStatsObserver bundleToStatsObserver, HMSStatsObserver hMSStatsObserver, RtcStatsObserverUseCase rtcStatsObserverUseCase) {
                this.$bundleToStats = bundleToStatsObserver;
                this.$nullCheckedObserver = hMSStatsObserver;
                this.this$0 = rtcStatsObserverUseCase;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final HMSTrack emit$lambda$0(RtcStatsObserverUseCase this$0, String trackId) {
                AbstractC22676k.m65750j(this$0, "this$0");
                AbstractC22676k.m65750j(trackId, "trackId");
                return this$0.getStore().getNativeTrackById(trackId);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final HMSPeer emit$lambda$1(RtcStatsObserverUseCase this$0, String trackId) {
                AbstractC22676k.m65750j(this$0, "this$0");
                AbstractC22676k.m65750j(trackId, "trackId");
                return this$0.getStore().getPeerByTrackId(trackId);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final HMSLocalPeer emit$lambda$2(RtcStatsObserverUseCase this$0) {
                AbstractC22676k.m65750j(this$0, "this$0");
                return this$0.getStore().getLocalPeer();
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return emit((StatsBundle) obj, (InterfaceC30057d<? super C23454a0>) interfaceC30057d);
            }

            public final Object emit(StatsBundle statsBundle, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                BundleToStatsObserver bundleToStatsObserver = this.$bundleToStats;
                HMSStatsObserver hMSStatsObserver = this.$nullCheckedObserver;
                RtcStatsObserverUseCase rtcStatsObserverUseCase = this.this$0;
                bundleToStatsObserver.convertBundleToStatsObserverEvents(statsBundle, hMSStatsObserver, new C24260a(rtcStatsObserverUseCase, 0), new C24260a(rtcStatsObserverUseCase, 1), new C24261b(rtcStatsObserverUseCase, 0));
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241971(HMSStatsObserver hMSStatsObserver, InterfaceC30057d<? super C241971> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$nullCheckedObserver = hMSStatsObserver;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return RtcStatsObserverUseCase.this.new C241971(this.$nullCheckedObserver, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241971) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                BundleToStatsObserver bundleToStatsObserver = new BundleToStatsObserver();
                InterfaceC13087t1 interfaceC13087t1 = RtcStatsObserverUseCase.this.statsFlow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(bundleToStatsObserver, this.$nullCheckedObserver, RtcStatsObserverUseCase.this);
                this.label = 1;
                if (interfaceC13087t1.collect(anonymousClass1, this) == enumC31071a) {
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

    public RtcStatsObserverUseCase(InterfaceC13087t1 statsFlow, SDKStore store, InterfaceC4339a hasJoined) {
        AbstractC22676k.m65750j(statsFlow, "statsFlow");
        AbstractC22676k.m65750j(store, "store");
        AbstractC22676k.m65750j(hasJoined, "hasJoined");
        this.statsFlow = statsFlow;
        this.store = store;
        this.hasJoined = hasJoined;
        this.statsObserverScope = AbstractC3006f0.m8708b(AbstractC3006f0.m8710d());
    }

    public final void addStatsObserver(HMSStatsObserver observer) {
        AbstractC22676k.m65750j(observer, "observer");
        this.statsObserver = observer;
        if (((Boolean) this.hasJoined.invoke()).booleanValue()) {
            startStatsObserver();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InterfaceC3027k1 interfaceC3027k1 = this.statsObserverJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        AbstractC3006f0.m8714h(this.statsObserverScope, null);
        this.statsObserver = null;
        this.statsObserverScope = AbstractC3006f0.m8708b(AbstractC3006f0.m8710d());
    }

    public final SDKStore getStore() {
        return this.store;
    }

    public final void startStatsObserver() {
        HMSStatsObserver hMSStatsObserver = this.statsObserver;
        FeatureFlags featureFlags = this.store.getFeatureFlags();
        boolean z4 = false;
        boolean z13 = featureFlags != null && featureFlags.isFeatureEnabled(Features.PUBLISH_STATS.INSTANCE);
        FeatureFlags featureFlags2 = this.store.getFeatureFlags();
        if (featureFlags2 != null && featureFlags2.isFeatureEnabled(Features.SUBSCRIBER_STATS.INSTANCE)) {
            z4 = true;
        }
        if (hMSStatsObserver != null || z13 || z4) {
            InterfaceC3027k1 interfaceC3027k1 = this.statsObserverJob;
            if (interfaceC3027k1 != null) {
                interfaceC3027k1.cancel((CancellationException) null);
            }
            this.statsObserverJob = AbstractC3006f0.m8732z(this.statsObserverScope, null, null, new C241971(hMSStatsObserver, null), 3);
        }
    }
}
