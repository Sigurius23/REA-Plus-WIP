package dx0;

import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1627t0;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.room.C1780e1;
import androidx.room.C1807l1;
import androidx.room.C1810m1;
import androidx.room.C1813n1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.connectivityCore.dataSyncService.models.DeviceTriggerSource;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.domain.model.Login;
import dt0.C12359b;
import dt0.C12360c;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import ec3.C13096w1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import fx0.C14844b;
import fx0.InterfaceC14843a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import java.time.Clock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.UUID;
import jx0.C22003f;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import mx0.C25992b;
import od1.InterfaceC27837a0;
import p000.AbstractC11266d;
import p007a6.C0428i;
import p007a6.C0467z0;
import p218ic.C18373n0;
import p218ic.EnumC18371m0;
import p249jc.C21596v;
import p380os.C28301a;
import p420qc.C30197g;
import p420qc.C30207q;
import p457rc.C31220c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sc.InterfaceC32351a;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: dx0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00142\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00142\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u000209088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00140=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006A"}, m65681d2 = {"Ldx0/b;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lbc3/c0;", "coroutineScope", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ltr2/n;", "logger", "Ljava/time/Clock;", "clock", "Lmx0/b;", "dataSyncScheduler", "Ljx0/f;", "dataSyncWorkDatabaseManager", "Lod1/a0;", "userSessionManager", "Lfx0/b;", "dataSyncServiceMetrics", "<init>", "(Lbc3/c0;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;Ljava/time/Clock;Lmx0/b;Ljx0/f;Lod1/a0;Lfx0/b;)V", "Ll83/a0;", "o", "(Lq83/d;)Ljava/lang/Object;", "Lic/n0;", "workInfo", "n", "(Lic/n0;Lq83/d;)Ljava/lang/Object;", "l", "", "q", "(Lic/n0;)Z", "Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;", "triggerSource", "p", "(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;)V", "Landroidx/lifecycle/g0;", "owner", "onCreate", "(Landroidx/lifecycle/g0;)V", "onResume", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "x", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "y", "Ltr2/n;", "z", "Ljava/time/Clock;", "E", "Lmx0/b;", "F", "Ljx0/f;", "G", "Lod1/a0;", "H", "Lfx0/b;", "Lec3/o1;", "Ldt0/b;", "I", "Lec3/o1;", "dataSyncEventFlow", "Lec3/l;", "J", "Lec3/l;", "dataSyncDomainState", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12423b implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C25992b dataSyncScheduler;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C22003f dataSyncWorkDatabaseManager;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC27837a0 userSessionManager;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final C14844b dataSyncServiceMetrics;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC13072o1 dataSyncEventFlow;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC13058l dataSyncDomainState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: dx0.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.DataSyncServiceManager", m100430f = "DataSyncServiceManager.kt", m100431l = {192, 197, 198}, m100432m = "handleIntervalType", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f42260E;

        /* JADX INFO: renamed from: G */
        int f42262G;

        /* JADX INFO: renamed from: w */
        Object f42263w;

        /* JADX INFO: renamed from: x */
        Object f42264x;

        /* JADX INFO: renamed from: y */
        Object f42265y;

        /* JADX INFO: renamed from: z */
        int f42266z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f42260E = obj;
            this.f42262G |= Integer.MIN_VALUE;
            return C12423b.this.m34979l(null, this);
        }
    }

    /* JADX INFO: renamed from: dx0.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.DataSyncServiceManager", m100430f = "DataSyncServiceManager.kt", m100431l = {150, 154, 165, 174, 186}, m100432m = "handleProcessNowType", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f42267E;

        /* JADX INFO: renamed from: G */
        int f42269G;

        /* JADX INFO: renamed from: w */
        Object f42270w;

        /* JADX INFO: renamed from: x */
        Object f42271x;

        /* JADX INFO: renamed from: y */
        Object f42272y;

        /* JADX INFO: renamed from: z */
        int f42273z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f42267E = obj;
            this.f42269G |= Integer.MIN_VALUE;
            return C12423b.this.m34980n(null, this);
        }
    }

    /* JADX INFO: renamed from: dx0.b$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c<T> implements InterfaceC13062m {

        /* JADX INFO: renamed from: dx0.b$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.DataSyncServiceManager$observeWorkManagerStatusUpdates$2", m100430f = "DataSyncServiceManager.kt", m100431l = {137, 139}, m100432m = "emit", m100433v = 2)
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32269c {

            /* JADX INFO: renamed from: E */
            Object f42275E;

            /* JADX INFO: renamed from: F */
            Object f42276F;

            /* JADX INFO: renamed from: G */
            int f42277G;

            /* JADX INFO: renamed from: H */
            int f42278H;

            /* JADX INFO: renamed from: I */
            /* synthetic */ Object f42279I;

            /* JADX INFO: renamed from: J */
            final /* synthetic */ c<T> f42280J;

            /* JADX INFO: renamed from: K */
            int f42281K;

            /* JADX INFO: renamed from: w */
            Object f42282w;

            /* JADX INFO: renamed from: x */
            Object f42283x;

            /* JADX INFO: renamed from: y */
            Object f42284y;

            /* JADX INFO: renamed from: z */
            Object f42285z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(c<? super T> cVar, InterfaceC30057d<? super a> interfaceC30057d) {
                super(interfaceC30057d);
                this.f42280J = cVar;
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                this.f42279I = obj;
                this.f42281K |= Integer.MIN_VALUE;
                return this.f42280J.emit(null, this);
            }
        }

        public c() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b0 -> B:20:0x0059). Please report as a decompilation issue!!! */
        @Override // ec3.InterfaceC13062m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<C18373n0> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar;
            Iterator<T> it;
            C12423b c12423b;
            int i13;
            if (interfaceC30057d instanceof a) {
                aVar = (a) interfaceC30057d;
                int i14 = aVar.f42281K;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    aVar.f42281K = i14 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, interfaceC30057d);
                }
            } else {
                aVar = new a(this, interfaceC30057d);
            }
            Object obj = aVar.f42279I;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i15 = aVar.f42281K;
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                C12423b c12423b2 = C12423b.this;
                it = list.iterator();
                c12423b = c12423b2;
                i13 = 0;
            } else {
                if (i15 != 1 && i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = aVar.f42277G;
                it = (Iterator) aVar.f42285z;
                c12423b = (C12423b) aVar.f42284y;
                try {
                    AbstractC34132o.m107864I(obj);
                } catch (Exception e5) {
                    c12423b.logger.mo85230v("Error reading and/or writing to DataSyncWork DB", e5, new AbstractC30556a.a[0]);
                }
            }
            while (it.hasNext()) {
                C18373n0 c18373n0 = (C18373n0) it.next();
                if (c12423b.m34983q(c18373n0) && c18373n0.f71521b.m52871a()) {
                    aVar.f42282w = null;
                    aVar.f42283x = null;
                    aVar.f42284y = c12423b;
                    aVar.f42285z = it;
                    aVar.f42275E = null;
                    aVar.f42276F = null;
                    aVar.f42277G = i13;
                    aVar.f42278H = 0;
                    aVar.f42281K = 1;
                    if (c12423b.m34980n(c18373n0, aVar) == enumC31071a) {
                        return enumC31071a;
                    }
                } else if (c18373n0.f71522c.contains("DATA_SYNC_INTERVAL_TAG")) {
                    aVar.f42282w = null;
                    aVar.f42283x = null;
                    aVar.f42284y = c12423b;
                    aVar.f42285z = it;
                    aVar.f42275E = null;
                    aVar.f42276F = null;
                    aVar.f42277G = i13;
                    aVar.f42278H = 0;
                    aVar.f42281K = 2;
                    if (c12423b.m34979l(c18373n0, aVar) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    continue;
                }
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dx0.b$d */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.DataSyncServiceManager$onCreate$1", m100430f = "DataSyncServiceManager.kt", m100431l = {93}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f42286w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12423b.this.new d(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f42286w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C12423b c12423b = C12423b.this;
                this.f42286w = 1;
                if (c12423b.m34981o(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: dx0.b$e */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.DataSyncServiceManager$onCreate$2", m100430f = "DataSyncServiceManager.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lcom/whoop/domain/model/Login;", "it", "Ll83/a0;", "<anonymous>", "(Lcom/whoop/domain/model/Login;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f42288w;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12423b.this.new e(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Login login, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(login, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f42288w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C12423b.this.logger.mo85228t("Detected user login, kicking off interval sync job", new AbstractC30556a.a[0]);
            C12423b.this.m34982p(DeviceTriggerSource.APP);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dx0.b$f */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.DataSyncServiceManager$sendSyncEvent$1", m100430f = "DataSyncServiceManager.kt", m100431l = {86}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f42290w;

        /* JADX INFO: renamed from: x */
        int f42291x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ DeviceTriggerSource f42292y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C12423b f42293z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(DeviceTriggerSource deviceTriggerSource, C12423b c12423b, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f42292y = deviceTriggerSource;
            this.f42293z = c12423b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f42292y, this.f42293z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f42291x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C12359b c12359b = new C12359b(new C12360c(this.f42292y, this.f42293z.clock.millis(), 0L, 0L, 0, 0L, 60, null));
                InterfaceC13072o1 interfaceC13072o1 = this.f42293z.dataSyncEventFlow;
                this.f42290w = null;
                this.f42291x = 1;
                if (interfaceC13072o1.emit(c12359b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: dx0.b$g */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f42294w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12423b f42295x;

        /* JADX INFO: renamed from: dx0.b$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f42296w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C12423b f42297x;

            /* JADX INFO: renamed from: dx0.b$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.DataSyncServiceManager$special$$inlined$map$1$2", m100430f = "DataSyncServiceManager.kt", m100431l = {51, 53, 55, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41503a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f42298E;

                /* JADX INFO: renamed from: F */
                Object f42299F;

                /* JADX INFO: renamed from: G */
                Object f42300G;

                /* JADX INFO: renamed from: H */
                Object f42301H;

                /* JADX INFO: renamed from: I */
                Object f42302I;

                /* JADX INFO: renamed from: J */
                Object f42303J;

                /* JADX INFO: renamed from: K */
                int f42304K;

                /* JADX INFO: renamed from: L */
                int f42305L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f42306w;

                /* JADX INFO: renamed from: x */
                int f42307x;

                /* JADX INFO: renamed from: y */
                Object f42308y;

                public C41503a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f42306w = obj;
                    this.f42307x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C12423b c12423b) {
                this.f42296w = interfaceC13062m;
                this.f42297x = c12423b;
            }

            /* JADX WARN: Code duplicated, block: B:37:0x0199 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:38:0x019a A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41503a c41503a;
                InterfaceC13062m interfaceC13062m;
                C12359b c12359b;
                int i13;
                int i14;
                C12359b c12359b2;
                InterfaceC13062m interfaceC13062m2;
                InterfaceC13062m interfaceC13062m3;
                if (interfaceC30057d instanceof C41503a) {
                    c41503a = (C41503a) interfaceC30057d;
                    int i15 = c41503a.f42307x;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        c41503a.f42307x = i15 - Integer.MIN_VALUE;
                    } else {
                        c41503a = new C41503a(interfaceC30057d);
                    }
                } else {
                    c41503a = new C41503a(interfaceC30057d);
                }
                Object obj2 = c41503a.f42306w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i16 = c41503a.f42307x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i16 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m4 = this.f42296w;
                    C12359b c12359b3 = (C12359b) obj;
                    C25992b c25992b = this.f42297x.dataSyncScheduler;
                    DeviceTriggerSource triggerSource = c12359b3.getDataSyncEventMetaData().getTriggerSource();
                    c41503a.f42308y = null;
                    c41503a.f42298E = null;
                    c41503a.f42299F = null;
                    c41503a.f42300G = null;
                    c41503a.f42301H = interfaceC13062m4;
                    c41503a.f42302I = null;
                    c41503a.f42303J = c12359b3;
                    c41503a.f42304K = 0;
                    c41503a.f42305L = 0;
                    c41503a.f42307x = 1;
                    Object objM77140d = c25992b.m77140d(triggerSource, c41503a);
                    if (objM77140d != enumC31071a) {
                        interfaceC13062m = interfaceC13062m4;
                        c12359b = c12359b3;
                        obj2 = objM77140d;
                        i13 = 0;
                        i14 = 0;
                    }
                    return enumC31071a;
                }
                if (i16 == 1) {
                    int i17 = c41503a.f42305L;
                    int i18 = c41503a.f42304K;
                    c12359b = (C12359b) c41503a.f42303J;
                    interfaceC13062m = (InterfaceC13062m) c41503a.f42301H;
                    AbstractC34132o.m107864I(obj2);
                    i14 = i17;
                    i13 = i18;
                } else if (i16 == 2) {
                    i13 = c41503a.f42304K;
                    interfaceC13062m3 = (InterfaceC13062m) c41503a.f42301H;
                    AbstractC34132o.m107864I(obj2);
                    c41503a.f42308y = null;
                    c41503a.f42298E = null;
                    c41503a.f42299F = null;
                    c41503a.f42300G = null;
                    c41503a.f42301H = null;
                    c41503a.f42302I = null;
                    c41503a.f42303J = null;
                    c41503a.f42304K = i13;
                    c41503a.f42307x = 4;
                    if (interfaceC13062m3.emit(c23454a0, c41503a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else if (i16 == 3) {
                    i13 = c41503a.f42304K;
                    c12359b2 = (C12359b) c41503a.f42303J;
                    interfaceC13062m2 = (InterfaceC13062m) c41503a.f42301H;
                    AbstractC34132o.m107864I(obj2);
                    this.f42297x.logger.mo85228t(AbstractC11266d.m30461o("Job already scheduled for ", c12359b2.getDataSyncEventMetaData().getTriggerSource().name()), new AbstractC30556a.a[0]);
                    interfaceC13062m3 = interfaceC13062m2;
                    c41503a.f42308y = null;
                    c41503a.f42298E = null;
                    c41503a.f42299F = null;
                    c41503a.f42300G = null;
                    c41503a.f42301H = null;
                    c41503a.f42302I = null;
                    c41503a.f42303J = null;
                    c41503a.f42304K = i13;
                    c41503a.f42307x = 4;
                    if (interfaceC13062m3.emit(c23454a0, c41503a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i16 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return c23454a0;
                if (((Boolean) obj2).booleanValue()) {
                    C14844b c14844b = this.f42297x.dataSyncServiceMetrics;
                    InterfaceC14843a.d dVar = new InterfaceC14843a.d(c12359b.getDataSyncEventMetaData().getTriggerSource().name(), c12359b.getDataSyncEventMetaData().getTriggerTimestamp(), 0L, 4, null);
                    c41503a.f42308y = null;
                    c41503a.f42298E = null;
                    c41503a.f42299F = null;
                    c41503a.f42300G = null;
                    c41503a.f42301H = interfaceC13062m;
                    c41503a.f42302I = null;
                    c41503a.f42303J = c12359b;
                    c41503a.f42304K = i13;
                    c41503a.f42305L = i14;
                    c41503a.f42307x = 3;
                    if (c14844b.m42719a(dVar, c41503a) != enumC31071a) {
                        c12359b2 = c12359b;
                        interfaceC13062m2 = interfaceC13062m;
                        this.f42297x.logger.mo85228t(AbstractC11266d.m30461o("Job already scheduled for ", c12359b2.getDataSyncEventMetaData().getTriggerSource().name()), new AbstractC30556a.a[0]);
                        interfaceC13062m3 = interfaceC13062m2;
                        c41503a.f42308y = null;
                        c41503a.f42298E = null;
                        c41503a.f42299F = null;
                        c41503a.f42300G = null;
                        c41503a.f42301H = null;
                        c41503a.f42302I = null;
                        c41503a.f42303J = null;
                        c41503a.f42304K = i13;
                        c41503a.f42307x = 4;
                        if (interfaceC13062m3.emit(c23454a0, c41503a) == enumC31071a) {
                            return c23454a0;
                        }
                    }
                } else {
                    this.f42297x.logger.mo85228t(AbstractC11266d.m30461o("Scheduling data sync job from ", c12359b.getDataSyncEventMetaData().getTriggerSource().name()), new AbstractC30556a.a[0]);
                    C25992b c25992b2 = this.f42297x.dataSyncScheduler;
                    c41503a.f42308y = null;
                    c41503a.f42298E = null;
                    c41503a.f42299F = null;
                    c41503a.f42300G = null;
                    c41503a.f42301H = interfaceC13062m;
                    c41503a.f42302I = null;
                    c41503a.f42303J = null;
                    c41503a.f42304K = i13;
                    c41503a.f42305L = i14;
                    c41503a.f42307x = 2;
                    if (c25992b2.m77141e(c12359b, c41503a) != enumC31071a) {
                        interfaceC13062m3 = interfaceC13062m;
                        c41503a.f42308y = null;
                        c41503a.f42298E = null;
                        c41503a.f42299F = null;
                        c41503a.f42300G = null;
                        c41503a.f42301H = null;
                        c41503a.f42302I = null;
                        c41503a.f42303J = null;
                        c41503a.f42304K = i13;
                        c41503a.f42307x = 4;
                        if (interfaceC13062m3.emit(c23454a0, c41503a) == enumC31071a) {
                            return c23454a0;
                        }
                    }
                }
                return enumC31071a;
            }
        }

        public g(InterfaceC13058l interfaceC13058l, C12423b c12423b) {
            this.f42294w = interfaceC13058l;
            this.f42295x = c12423b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f42294w.collect(new a(interfaceC13062m, this.f42295x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C12423b(InterfaceC2994c0 coroutineScope, FeatureFlagChecker featureFlagChecker, InterfaceC34116n logger, Clock clock, C25992b dataSyncScheduler, C22003f dataSyncWorkDatabaseManager, InterfaceC27837a0 userSessionManager, C14844b dataSyncServiceMetrics) {
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(dataSyncScheduler, "dataSyncScheduler");
        AbstractC22676k.m65750j(dataSyncWorkDatabaseManager, "dataSyncWorkDatabaseManager");
        AbstractC22676k.m65750j(userSessionManager, "userSessionManager");
        AbstractC22676k.m65750j(dataSyncServiceMetrics, "dataSyncServiceMetrics");
        this.coroutineScope = coroutineScope;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = logger;
        this.clock = clock;
        this.dataSyncScheduler = dataSyncScheduler;
        this.dataSyncWorkDatabaseManager = dataSyncWorkDatabaseManager;
        this.userSessionManager = userSessionManager;
        this.dataSyncServiceMetrics = dataSyncServiceMetrics;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.dataSyncEventFlow = c13096w1M36592b;
        this.dataSyncDomainState = new g(c13096w1M36592b, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ca, code lost:
    
        if (r2.m42719a(r10, r3) == r4) goto L31;
     */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m34979l(p218ic.C18373n0 r19, q83.InterfaceC30057d<? super l83.C23454a0> r20) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dx0.C12423b.m34979l(ic.n0, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    /* JADX WARN: Code duplicated, block: B:29:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
    
        if (r1.m42719a(r13, r3) == r4) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c7, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f4, code lost:
    
        if (r1.m42719a(r13, r3) == r4) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011e, code lost:
    
        if (r1.m42719a(r13, r3) == r4) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0144, code lost:
    
        if (r2.m62879a(r5, r3) == r4) goto L45;
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m34980n(p218ic.C18373n0 r22, q83.InterfaceC30057d<? super l83.C23454a0> r23) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dx0.C12423b.m34980n(ic.n0, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final Object m34981o(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        String str;
        List listM118959K = AbstractC37056f.m118959K("DATA_SYNC_PROCESS_NOW_TAG", "DATA_SYNC_INTERVAL_TAG", "DATA_SYNC_UPLOAD_TAG");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        AbstractC25265s.m74141p0(arrayList3, listM118959K);
        if (arrayList.isEmpty() && arrayList2.isEmpty() && arrayList3.isEmpty() && arrayList4.isEmpty()) {
            throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
        }
        C21596v c21596v = (C21596v) this.dataSyncScheduler.getWorkManager();
        C30197g c30197gMo5517d = c21596v.f82807c.mo5517d();
        ArrayList arrayList5 = new ArrayList();
        StringBuilder sb4 = new StringBuilder("SELECT * FROM workspec");
        String str2 = " AND";
        if (arrayList4.isEmpty()) {
            str = " WHERE";
        } else {
            ArrayList arrayList6 = new ArrayList(AbstractC25267u.m74163i0(arrayList4, 10));
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                arrayList6.add(Integer.valueOf(AbstractC21478l0.m60424b0((EnumC18371m0) it.next())));
            }
            sb4.append(" WHERE state IN (");
            AbstractC37056f.m118987j(arrayList6.size(), sb4);
            sb4.append(")");
            arrayList5.addAll(arrayList6);
            str = " AND";
        }
        if (!arrayList.isEmpty()) {
            ArrayList arrayList7 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList7.add(((UUID) it3.next()).toString());
            }
            sb4.append(str.concat(" id IN ("));
            AbstractC37056f.m118987j(arrayList.size(), sb4);
            sb4.append(")");
            arrayList5.addAll(arrayList7);
            str = " AND";
        }
        if (arrayList3.isEmpty()) {
            str2 = str;
        } else {
            sb4.append(str.concat(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN ("));
            AbstractC37056f.m118987j(arrayList3.size(), sb4);
            sb4.append("))");
            arrayList5.addAll(arrayList3);
        }
        if (!arrayList2.isEmpty()) {
            sb4.append(str2.concat(" id IN (SELECT work_spec_id FROM workname WHERE name IN ("));
            AbstractC37056f.m118987j(arrayList2.size(), sb4);
            sb4.append("))");
            arrayList5.addAll(arrayList2);
        }
        sb4.append(";");
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        Object[] array = arrayList5.toArray(new Object[0]);
        c30197gMo5517d.getClass();
        TreeMap treeMap = C1813n1.f7126I;
        C1813n1 c1813n1M92118h = AbstractC30060g.m92118h(array != null ? array.length : 0, string);
        AbstractC29125c.m88535l(new C1810m1(c1813n1M92118h), array);
        String strMo5446h = c1813n1M92118h.mo5446h();
        C1780e1 c1780e1M5455b = c30197gMo5517d.f123597a.getInvalidationTracker().m5455b(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, new C0467z0(strMo5446h, new C1807l1(strMo5446h, new C0428i(c1813n1M92118h, 4)), c30197gMo5517d, 5));
        C28301a c28301a = C30207q.f123632A;
        InterfaceC32351a interfaceC32351a = c21596v.f82808d;
        Object obj = new Object();
        C1627t0 c1627t0 = new C1627t0();
        c1627t0.m5035b(c1780e1M5455b, new C31220c(interfaceC32351a, obj, c28301a, c1627t0));
        Object objCollect = AbstractC1613o1.m5011a(c1627t0).collect(new c(), interfaceC30057d);
        return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        AbstractC13091v.m36582H(this.dataSyncDomainState, this.coroutineScope);
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new d(null), 3);
        AbstractC13091v.m36582H(new C13052j1(this.userSessionManager.getLoginFlow(), new e(null), 0), this.coroutineScope);
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
    public void onResume(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        m34982p(DeviceTriggerSource.APP);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStart(InterfaceC1585g0 interfaceC1585g0) {
        super.onStart(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
        super.onStop(interfaceC1585g0);
    }

    /* JADX INFO: renamed from: p */
    public final void m34982p(DeviceTriggerSource triggerSource) {
        AbstractC22676k.m65750j(triggerSource, "triggerSource");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new f(triggerSource, this, null), 3);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m34983q(C18373n0 workInfo) {
        AbstractC22676k.m65750j(workInfo, "workInfo");
        HashSet hashSet = workInfo.f71522c;
        return hashSet.contains("DATA_SYNC_PROCESS_NOW_TAG") || hashSet.contains("DATA_SYNC_UPLOAD_TAG");
    }
}
