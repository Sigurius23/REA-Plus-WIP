package lj0;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.ConnectivityFeatureFlagsKt;
import com.whoop.data.repositories.FeatureFlagChecker;
import fi0.InterfaceC14515a;
import fi0.InterfaceC14517c;
import iy1.InterfaceC21030c;
import java.util.LinkedHashMap;
import java.util.List;
import jy1.C22047a;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.C25271y;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.AbstractC32975s;
import st0.EnumC32978v;
import st0.InterfaceC32974r;
import us0.InterfaceC35208d;
import us0.InterfaceC35209e;
import wb3.AbstractC37056f;
import y82.EnumC39339b;

/* JADX INFO: renamed from: lj0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m65681d2 = {"Llj0/b;", "Lus0/e;", "Liy1/c;", "metricsInteractor", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lbc3/c0;", "coroutineScope", "Lfi0/c;", "amplitudeAnalytics", "Lfi0/a;", "baseAnalytics", "Lst0/r;", "strapLockStateTracker", "<init>", "(Liy1/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;Lfi0/c;Lfi0/a;Lst0/r;)V", "Lus0/d;", "connectionMetric", "Ll83/a0;", "d", "(Lus0/d;)V", "c", "a", "Liy1/c;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lbc3/c0;", "Lfi0/c;", "e", "Lfi0/a;", "f", "Lst0/r;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24463b implements InterfaceC35209e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21030c metricsInteractor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC14517c amplitudeAnalytics;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC32974r strapLockStateTracker;

    /* JADX INFO: renamed from: lj0.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f95350a;

        static {
            int[] iArr = new int[InterfaceC35208d.b.values().length];
            try {
                iArr[InterfaceC35208d.b.FAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC35208d.b.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f95350a = iArr;
        }
    }

    /* JADX INFO: renamed from: lj0.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.ble.analytics.ConnectionAnalyticsHelper$sendToDataDog$1", m100430f = "ConnectionAnalyticsHelper.kt", m100431l = {115}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C24463b f95351E;

        /* JADX INFO: renamed from: w */
        Object f95352w;

        /* JADX INFO: renamed from: x */
        int f95353x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC35208d f95354y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ List<String> f95355z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC35208d interfaceC35208d, List<String> list, C24463b c24463b, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f95354y = interfaceC35208d;
            this.f95355z = list;
            this.f95351E = c24463b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f95354y, this.f95355z, this.f95351E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C22047a c22047a;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f95353x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC35208d interfaceC35208d = this.f95354y;
                if (interfaceC35208d instanceof InterfaceC35208d.a) {
                    c22047a = new C22047a(0, "connectivity.app.ble.connection_attempt", null, AbstractC25265s.m74129g1(AbstractC31061c.m95644t("whoop_device:", ((InterfaceC35208d.a) interfaceC35208d).getDeviceType().getCodeName()), this.f95355z), null, 21, null);
                } else if (interfaceC35208d instanceof InterfaceC35208d.d) {
                    String strM30461o = AbstractC11266d.m30461o("status:", ((InterfaceC35208d.d) interfaceC35208d).getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String().getValue());
                    String strM30461o2 = AbstractC11266d.m30461o("whoop_device:", ((InterfaceC35208d.d) this.f95354y).getDeviceType().getCodeName());
                    String error = ((InterfaceC35208d.d) this.f95354y).getError();
                    if (error == null) {
                        error = "";
                    }
                    c22047a = new C22047a(0, "connectivity.app.ble.connection_status", null, AbstractC25265s.m74129g1(AbstractC37056f.m118959K(strM30461o, strM30461o2, "error_msg:".concat(error)), this.f95355z), null, 21, null);
                } else {
                    if (!(interfaceC35208d instanceof InterfaceC35208d.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c22047a = new C22047a(0, "connectivity.app.ble.disconnected", null, AbstractC25265s.m74129g1(AbstractC31061c.m95644t("whoop_device:", ((InterfaceC35208d.e) interfaceC35208d).getDeviceType().getCodeName()), this.f95355z), null, 21, null);
                }
                InterfaceC21030c interfaceC21030c = this.f95351E.metricsInteractor;
                this.f95352w = null;
                this.f95353x = 1;
                if (interfaceC21030c.mo58700a(c22047a, this) == enumC31071a) {
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

    public C24463b(InterfaceC21030c metricsInteractor, FeatureFlagChecker featureFlagChecker, InterfaceC2994c0 coroutineScope, InterfaceC14517c amplitudeAnalytics, InterfaceC14515a baseAnalytics, InterfaceC32974r strapLockStateTracker) {
        AbstractC22676k.m65750j(metricsInteractor, "metricsInteractor");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(amplitudeAnalytics, "amplitudeAnalytics");
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        AbstractC22676k.m65750j(strapLockStateTracker, "strapLockStateTracker");
        this.metricsInteractor = metricsInteractor;
        this.featureFlagChecker = featureFlagChecker;
        this.coroutineScope = coroutineScope;
        this.amplitudeAnalytics = amplitudeAnalytics;
        this.baseAnalytics = baseAnalytics;
        this.strapLockStateTracker = strapLockStateTracker;
    }

    /* JADX INFO: renamed from: c */
    private final void m71176c(InterfaceC35208d connectionMetric) {
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(connectionMetric, connectionMetric.getDeviceType().isMaverickOrGoose() ? AbstractC31061c.m95644t("strap_lock_state:", AbstractC32975s.m104081a(this.strapLockStateTracker)) : C25271y.f99162w, this, null), 3);
    }

    /* JADX INFO: renamed from: d */
    private final void m71177d(InterfaceC35208d connectionMetric) {
        if (connectionMetric.getDeviceType() != EnumC32978v.PUFFIN) {
            return;
        }
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("Whoop Device", connectionMetric.getDeviceType().getCodeName()));
        if (connectionMetric instanceof InterfaceC35208d.a) {
            InterfaceC35208d.c source = ((InterfaceC35208d.a) connectionMetric).getSource();
            if (source != null) {
                linkedHashMapM73993b0.put("source", source.getValue());
            }
            InterfaceC14515a.m41418i(this.baseAnalytics, null, null, null, "Pairing - Connection Attempt", "Attempt", linkedHashMapM73993b0, 7, null);
            return;
        }
        if (!(connectionMetric instanceof InterfaceC35208d.d)) {
            if (!(connectionMetric instanceof InterfaceC35208d.e)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC14515a.m41418i(this.baseAnalytics, null, null, null, "Pairing - Connection Attempt", "Disconnected", linkedHashMapM73993b0, 7, null);
        } else {
            InterfaceC35208d.d dVar = (InterfaceC35208d.d) connectionMetric;
            InterfaceC14515a.m41418i(this.baseAnalytics, null, null, dVar.getError(), "Pairing - Connection Attempt", dVar.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String().getValue(), linkedHashMapM73993b0, 3, null);
        }
    }

    @Override // us0.InterfaceC35209e
    /* JADX INFO: renamed from: a */
    public void mo71178a(InterfaceC35208d connectionMetric) {
        AbstractC22676k.m65750j(connectionMetric, "connectionMetric");
        m71176c(connectionMetric);
        m71177d(connectionMetric);
        if (this.featureFlagChecker.isFeatureEnabled(ConnectivityFeatureFlagsKt.TRACK_CONNECTS_DISCONNECTS)) {
            if (connectionMetric instanceof InterfaceC35208d.a) {
                InterfaceC14515a.m41418i(this.amplitudeAnalytics, "Connectivity", null, null, "BLE Connectivity", "Attempt", null, 38, null);
                return;
            }
            if (!(connectionMetric instanceof InterfaceC35208d.d)) {
                if (!(connectionMetric instanceof InterfaceC35208d.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC14515a.m41418i(this.amplitudeAnalytics, "Connectivity", null, null, "BLE Connectivity", "Disconnected", null, 38, null);
                return;
            }
            int i13 = a.f95350a[((InterfaceC35208d.d) connectionMetric).getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String().ordinal()];
            if (i13 == 1) {
                InterfaceC14515a.m41418i(this.amplitudeAnalytics, "Connectivity", null, null, "BLE Connectivity", "Fail", null, 38, null);
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC14515a.m41418i(this.amplitudeAnalytics, "Connectivity", null, null, "BLE Connectivity", EnumC39339b.RESULT_SUCCESS, null, 38, null);
            }
        }
    }
}
