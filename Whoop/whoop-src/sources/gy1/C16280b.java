package gy1;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.metrics.common.ScreenState;
import fy1.C14870f;
import fy1.InterfaceC14871g;
import fy1.InterfaceC14876l;
import java.util.Locale;
import l83.C23454a0;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: gy1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0012J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010!¨\u0006#"}, m65681d2 = {"Lgy1/b;", "Lfy1/l;", "Lgy1/c;", "screenStateMetricsHelper", "Lbc3/c0;", "coroutineScope", "Lfy1/g;", "nanoClock", "Ltr2/n;", "logger", "<init>", "(Lgy1/c;Lbc3/c0;Lfy1/g;Ltr2/n;)V", "", "screenTag", "Lcom/whoop/metrics/common/ScreenState;", "state", "Ll83/a0;", "d", "(Ljava/lang/String;Lcom/whoop/metrics/common/ScreenState;)V", "", "durationNanos", "transitionType", "e", "(Ljava/lang/String;JLjava/lang/String;)V", "a", "b", "(Ljava/lang/String;J)V", "Lgy1/c;", "Lbc3/c0;", "c", "Lfy1/g;", "Ltr2/n;", "Lfy1/f;", "Lfy1/f;", "latencyTrackingState", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16280b implements InterfaceC14876l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C16281c screenStateMetricsHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC14871g nanoClock;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private C14870f latencyTrackingState;

    /* JADX INFO: renamed from: gy1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f62418a;

        static {
            int[] iArr = new int[ScreenState.values().length];
            try {
                iArr[ScreenState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScreenState.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScreenState.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScreenState.CACHE_HIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f62418a = iArr;
        }
    }

    /* JADX INFO: renamed from: gy1.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.metrics.common.screenstate.RealScreenStateTracker$sendBaseScreenStateMetric$1", m100430f = "RealScreenStateTracker.kt", m100431l = {83}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f62419w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f62421y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ ScreenState f62422z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, ScreenState screenState, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f62421y = str;
            this.f62422z = screenState;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C16280b.this.new b(this.f62421y, this.f62422z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f62419w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C16281c c16281c = C16280b.this.screenStateMetricsHelper;
                String str = this.f62421y;
                ScreenState screenState = this.f62422z;
                this.f62419w = 1;
                if (c16281c.m46100d(str, screenState, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: gy1.b$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.metrics.common.screenstate.RealScreenStateTracker$sendLatencyMetric$1", m100430f = "RealScreenStateTracker.kt", m100431l = {89}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f62423E;

        /* JADX INFO: renamed from: w */
        int f62424w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f62426y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ long f62427z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, long j7, String str2, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f62426y = str;
            this.f62427z = j7;
            this.f62423E = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C16280b.this.new c(this.f62426y, this.f62427z, this.f62423E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f62424w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C16281c c16281c = C16280b.this.screenStateMetricsHelper;
                String str = this.f62426y;
                long j7 = this.f62427z;
                String str2 = this.f62423E;
                Locale locale = Locale.US;
                String strM95641q = AbstractC31061c.m95641q(locale, "US", str2, locale, "toLowerCase(...)");
                this.f62424w = 1;
                if (c16281c.m46099c(str, j7, strM95641q, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: gy1.b$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.metrics.common.screenstate.RealScreenStateTracker$trackFirstVisible$1", m100430f = "RealScreenStateTracker.kt", m100431l = {77}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f62428w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f62430y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ long f62431z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, long j7, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f62430y = str;
            this.f62431z = j7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C16280b.this.new d(this.f62430y, this.f62431z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f62428w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C16281c c16281c = C16280b.this.screenStateMetricsHelper;
                String str = this.f62430y;
                long j7 = this.f62431z;
                this.f62428w = 1;
                if (c16281c.m46098b(str, j7, this) == enumC31071a) {
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

    public C16280b(C16281c screenStateMetricsHelper, InterfaceC2994c0 coroutineScope, InterfaceC14871g nanoClock, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(screenStateMetricsHelper, "screenStateMetricsHelper");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(nanoClock, "nanoClock");
        AbstractC22676k.m65750j(logger, "logger");
        this.screenStateMetricsHelper = screenStateMetricsHelper;
        this.coroutineScope = coroutineScope;
        this.nanoClock = nanoClock;
        this.logger = logger;
        this.latencyTrackingState = C14870f.INSTANCE.m42898a();
    }

    /* JADX INFO: renamed from: d */
    private final void m46095d(String screenTag, ScreenState state) {
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(screenTag, state, null), 3);
    }

    /* JADX INFO: renamed from: e */
    private final void m46096e(String screenTag, long durationNanos, String transitionType) {
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new c(screenTag, durationNanos, transitionType, null), 3);
    }

    @Override // fy1.InterfaceC14876l
    /* JADX INFO: renamed from: a */
    public void mo42900a(String screenTag, ScreenState state) {
        AbstractC22676k.m65750j(screenTag, "screenTag");
        AbstractC22676k.m65750j(state, "state");
        m46095d(screenTag, state);
        C14870f c14870f = this.latencyTrackingState;
        int i13 = a.f62418a[state.ordinal()];
        if (i13 == 1) {
            this.latencyTrackingState = new C14870f(screenTag, Long.valueOf(this.nanoClock.mo42899a()));
            return;
        }
        if (i13 == 2) {
            Long startTimeNano = c14870f.getStartTimeNano();
            if (!screenTag.equals(c14870f.getLoadingTag()) || startTimeNano == null) {
                this.logger.mo85228t(AbstractC11895b.m31996o("ScreenStateTracker: Ignoring SUCCESS state for ", screenTag, ", previous state was not LOADING."), new AbstractC30556a.a[0]);
                return;
            } else {
                m46096e(screenTag, this.nanoClock.mo42899a() - startTimeNano.longValue(), "SUCCESS");
                this.latencyTrackingState = C14870f.INSTANCE.m42898a();
                return;
            }
        }
        if (i13 != 3) {
            if (i13 == 4) {
                this.logger.mo85228t(AbstractC11895b.m31996o("ScreenStateTracker: CACHE_HIT for ", screenTag, ", keeping latency tracking."), new AbstractC30556a.a[0]);
                return;
            } else {
                if (screenTag.equals(c14870f.getLoadingTag())) {
                    this.latencyTrackingState = C14870f.INSTANCE.m42898a();
                    return;
                }
                return;
            }
        }
        Long startTimeNano2 = c14870f.getStartTimeNano();
        if (!screenTag.equals(c14870f.getLoadingTag()) || startTimeNano2 == null) {
            this.logger.mo85228t(AbstractC11895b.m31996o("ScreenStateTracker: Ignoring ERROR state for ", screenTag, ", previous state was not LOADING."), new AbstractC30556a.a[0]);
        } else {
            m46096e(screenTag, this.nanoClock.mo42899a() - startTimeNano2.longValue(), "ERROR");
            this.latencyTrackingState = C14870f.INSTANCE.m42898a();
        }
    }

    @Override // fy1.InterfaceC14876l
    /* JADX INFO: renamed from: b */
    public void mo42901b(String screenTag, long durationNanos) {
        AbstractC22676k.m65750j(screenTag, "screenTag");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new d(screenTag, durationNanos, null), 3);
    }
}
