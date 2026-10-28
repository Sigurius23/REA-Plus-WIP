package kj2;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ca2.C4361a;
import ca2.C4362b;
import com.whoop.data.interactor.ExportedMetricsInteractor;
import com.whoop.data.interactor.MetricHeartDataSyncState;
import com.whoop.data.interactor.MetricsHeartDataBundle;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.data.remote.domain.dto.PushNotificationMetricType;
import com.whoop.data.repositories.NotificationRepository;
import com.whoop.design.models.items.graph.StressGraphingCardModel;
import com.whoop.design.models.items.graph.stress.StressState;
import com.whoop.educationModels.FeatureEducationDto;
import com.whoop.stress.domain.StressMonitorApi;
import com.whoop.stress.domain.model.LoadingData;
import com.whoop.stress.domain.model.StressMonitorDto;
import com.whoop.stress.domain.model.StressMonitorMeterDto;
import com.whoop.stress.domain.model.StressMonitorVow;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fj2.C14543a;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import l83.C23454a0;
import nj2.AbstractC26765l;
import nj2.C26756c;
import nj2.C26779z;
import oh2.C27941d;
import or2.C28149b1;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import u92.C34660d;
import ud3.AbstractC34846v0;
import yh2.C39543b;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: kj2.k */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001aH\u0002¢\u0006\u0004\b \u0010!J'\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001a2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b&\u0010'J#\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b(\u0010\u001fJ\u0017\u0010*\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\u001dH\u0002¢\u0006\u0004\b*\u0010+J$\u0010.\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020,2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\"H\u0082@¢\u0006\u0004\b.\u0010/J'\u00106\u001a\u0002052\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020,H\u0002¢\u0006\u0004\b6\u00107J\u0018\u0010:\u001a\u00020\u001d2\u0006\u00109\u001a\u000208H\u0082@¢\u0006\u0004\b:\u0010;J\u0010\u0010=\u001a\u00020<H\u0082@¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b?\u0010>J\u001e\u0010A\u001a\b\u0012\u0004\u0012\u00020%0\u001a2\u0006\u0010@\u001a\u00020\"H\u0082@¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006Y"}, m65681d2 = {"Lkj2/k;", "", "Lcom/whoop/stress/domain/StressMonitorApi;", "api", "Lin2/d;", "dispatcher", "Lu92/d;", "sharedPreferences", "Lcom/whoop/data/interactor/ExportedMetricsInteractor;", "exportedMetricsInteractor", "Lfj2/a;", "analyticsManager", "Ltr2/n;", "logger", "Lcom/whoop/data/repositories/NotificationRepository;", "notificationRepository", "Lca2/b;", "strapSyncHelper", "Lor2/b1;", "readableDateFormatterReducer", "Lzr2/a;", "dateAndTimeProvider", "Liy1/c;", "metricsInteractor", "<init>", "(Lcom/whoop/stress/domain/StressMonitorApi;Lin2/d;Lu92/d;Lcom/whoop/data/interactor/ExportedMetricsInteractor;Lfj2/a;Ltr2/n;Lcom/whoop/data/repositories/NotificationRepository;Lca2/b;Lor2/b1;Lzr2/a;Liy1/c;)V", "Lec3/l;", "Lkj2/j;", "upstream", "Lnj2/l;", "u", "(Lec3/l;)Lec3/l;", "v", "()Lec3/l;", "", "source", "specificDate", "Lkj2/c$b;", "z", "(Ljava/lang/String;Ljava/lang/String;)Lec3/l;", "s", "domainState", "B", "(Lnj2/l;)Lnj2/l;", "", "forceSyncStrap", "x", "(ZLjava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/stress/domain/model/StressMonitorDto;", "stressMonitorDto", "Lcom/whoop/educationModels/FeatureEducationDto;", "onboardingEducationDto", "showIsLoading", "Lnj2/l$e;", "C", "(Lcom/whoop/stress/domain/model/StressMonitorDto;Lcom/whoop/educationModels/FeatureEducationDto;Z)Lnj2/l$e;", "Lcom/whoop/data/interactor/MetricsHeartDataBundle;", "bundle", "D", "(Lcom/whoop/data/interactor/MetricsHeartDataBundle;Lq83/d;)Ljava/lang/Object;", "Lkj2/c$c;", "t", "(Lq83/d;)Ljava/lang/Object;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "sourceId", "A", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/stress/domain/StressMonitorApi;", "b", "Lin2/d;", "c", "Lu92/d;", "d", "Lcom/whoop/data/interactor/ExportedMetricsInteractor;", "e", "Lfj2/a;", "f", "Ltr2/n;", "g", "Lcom/whoop/data/repositories/NotificationRepository;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lca2/b;", "i", "Lor2/b1;", "j", "Lzr2/a;", "k", "Liy1/c;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22527k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final StressMonitorApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC18732d dispatcher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C34660d sharedPreferences;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ExportedMetricsInteractor exportedMetricsInteractor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C14543a analyticsManager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final NotificationRepository notificationRepository;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C4362b strapSyncHelper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C28149b1 readableDateFormatterReducer;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC21030c metricsInteractor;

    /* JADX INFO: renamed from: kj2.k$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressMonitorInteractor$actionToDomainState$$inlined$flatMapLatest$1", m100430f = "StressMonitorInteractor.kt", m100431l = {192, 193, 194, 189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        Object f88378E;

        /* JADX INFO: renamed from: F */
        Object f88379F;

        /* JADX INFO: renamed from: G */
        Object f88380G;

        /* JADX INFO: renamed from: H */
        int f88381H;

        /* JADX INFO: renamed from: w */
        int f88382w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f88383x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f88384y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C22527k f88385z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C22527k c22527k) {
            super(3, interfaceC30057d);
            this.f88385z = c22527k;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC22526j abstractC22526j, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f88385z);
            aVar.f88383x = interfaceC13062m;
            aVar.f88384y = abstractC22526j;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x009d, code lost:
        
            if (r10 == r0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00c6, code lost:
        
            if (r10 == r0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00f6, code lost:
        
            if (r10 == r0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0141, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r1, r10, r9) == r0) goto L43;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 333
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kj2.C22527k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC22526j) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: kj2.k$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressMonitorInteractor$actionToDomainState$1$1", m100430f = "StressMonitorInteractor.kt", m100431l = {162}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lkj2/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f88386w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f88387x;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f88387x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f88387x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f88386w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC22519c.a aVar = AbstractC22519c.a.f88279a;
                this.f88387x = null;
                this.f88386w = 1;
                if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: kj2.k$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressMonitorInteractor$actionToDomainState$2", m100430f = "StressMonitorInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lnj2/l;", "previousDomainState", "Lkj2/c;", "currentAction", "<anonymous>", "(Lnj2/l;Lkj2/c;)Lnj2/l;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f88388w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f88389x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f88390y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC26765l abstractC26765l, AbstractC22519c abstractC22519c, InterfaceC30057d<? super AbstractC26765l> interfaceC30057d) {
            c cVar = C22527k.this.new c(interfaceC30057d);
            cVar.f88389x = abstractC26765l;
            cVar.f88390y = abstractC22519c;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC26765l abstractC26765l = (AbstractC26765l) this.f88389x;
            AbstractC22519c abstractC22519c = (AbstractC22519c) this.f88390y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f88388w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC22519c instanceof AbstractC22519c.b) {
                return ((AbstractC22519c.b) abstractC22519c).getDomainState();
            }
            if (abstractC22519c instanceof AbstractC22519c.c) {
                return C22527k.this.m65067B(abstractC26765l);
            }
            if (AbstractC22676k.m65745e(abstractC22519c, AbstractC22519c.a.f88279a)) {
                return abstractC26765l instanceof AbstractC26765l.e ? AbstractC26765l.e.m79692b((AbstractC26765l.e) abstractC26765l, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, true, null, null, null, null, 130023423, null) : abstractC26765l;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: kj2.k$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressMonitorInteractor", m100430f = "StressMonitorInteractor.kt", m100431l = {285}, m100432m = "dismissEducation", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f88392w;

        /* JADX INFO: renamed from: y */
        int f88394y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f88392w = obj;
            this.f88394y |= Integer.MIN_VALUE;
            return C22527k.this.m65089t(this);
        }
    }

    /* JADX INFO: renamed from: kj2.k$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressMonitorInteractor$dismissEducation$2", m100430f = "StressMonitorInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f88395w;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C22527k.this.new e(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f88395w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C22527k.this.sharedPreferences.m109538q(SharedPreferenceConstants.KEY_SHOW_STRESS_MONITOR_EDUCATION, false);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: kj2.k$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressMonitorInteractor$metricSyncFlowToDomainState$1", m100430f = "StressMonitorInteractor.kt", m100431l = {77, 87, 94, 94, 97, 104, 104}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lnj2/l;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        long f88397E;

        /* JADX INFO: renamed from: F */
        int f88398F;

        /* JADX INFO: renamed from: G */
        private /* synthetic */ Object f88399G;

        /* JADX INFO: renamed from: w */
        Object f88401w;

        /* JADX INFO: renamed from: x */
        Object f88402x;

        /* JADX INFO: renamed from: y */
        int f88403y;

        /* JADX INFO: renamed from: z */
        int f88404z;

        /* JADX INFO: renamed from: kj2.k$f$a */
        @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressMonitorInteractor$metricSyncFlowToDomainState$1$elapsedTime$1$1", m100430f = "StressMonitorInteractor.kt", m100431l = {80}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/data/interactor/MetricHeartDataSyncState;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/data/interactor/MetricHeartDataSyncState;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f88405w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22527k f88406x;

            /* JADX INFO: renamed from: kj2.k$f$a$a, reason: collision with other inner class name */
            @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41905a implements InterfaceC13058l {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13058l f88407w;

                /* JADX INFO: renamed from: kj2.k$f$a$a$a, reason: collision with other inner class name */
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C41906a<T> implements InterfaceC13062m {

                    /* JADX INFO: renamed from: w */
                    final /* synthetic */ InterfaceC13062m f88408w;

                    /* JADX INFO: renamed from: kj2.k$f$a$a$a$a, reason: collision with other inner class name */
                    @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressMonitorInteractor$metricSyncFlowToDomainState$1$elapsedTime$1$1$invokeSuspend$$inlined$filter$1$2", m100430f = "StressMonitorInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                    public static final class C41907a extends AbstractC32269c {

                        /* JADX INFO: renamed from: F */
                        Object f88410F;

                        /* JADX INFO: renamed from: G */
                        Object f88411G;

                        /* JADX INFO: renamed from: H */
                        int f88412H;

                        /* JADX INFO: renamed from: w */
                        /* synthetic */ Object f88413w;

                        /* JADX INFO: renamed from: x */
                        int f88414x;

                        /* JADX INFO: renamed from: y */
                        Object f88415y;

                        /* JADX INFO: renamed from: z */
                        Object f88416z;

                        public C41907a(InterfaceC30057d interfaceC30057d) {
                            super(interfaceC30057d);
                        }

                        @Override // s83.AbstractC32267a
                        public final Object invokeSuspend(Object obj) {
                            this.f88413w = obj;
                            this.f88414x |= Integer.MIN_VALUE;
                            return C41906a.this.emit(null, this);
                        }
                    }

                    public C41906a(InterfaceC13062m interfaceC13062m) {
                        this.f88408w = interfaceC13062m;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // ec3.InterfaceC13062m
                    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                        C41907a c41907a;
                        if (interfaceC30057d instanceof C41907a) {
                            c41907a = (C41907a) interfaceC30057d;
                            int i13 = c41907a.f88414x;
                            if ((i13 & Integer.MIN_VALUE) != 0) {
                                c41907a.f88414x = i13 - Integer.MIN_VALUE;
                            } else {
                                c41907a = new C41907a(interfaceC30057d);
                            }
                        } else {
                            c41907a = new C41907a(interfaceC30057d);
                        }
                        Object obj2 = c41907a.f88413w;
                        EnumC31071a enumC31071a = EnumC31071a.f128113w;
                        int i14 = c41907a.f88414x;
                        if (i14 == 0) {
                            AbstractC34132o.m107864I(obj2);
                            InterfaceC13062m interfaceC13062m = this.f88408w;
                            MetricHeartDataSyncState metricHeartDataSyncState = (MetricHeartDataSyncState) obj;
                            if ((metricHeartDataSyncState instanceof MetricHeartDataSyncState.ForcedSyncSuccess) || (metricHeartDataSyncState instanceof MetricHeartDataSyncState.EmptyHeartData)) {
                                c41907a.f88415y = null;
                                c41907a.f88416z = null;
                                c41907a.f88410F = null;
                                c41907a.f88411G = null;
                                c41907a.f88412H = 0;
                                c41907a.f88414x = 1;
                                if (interfaceC13062m.emit(obj, c41907a) == enumC31071a) {
                                    return enumC31071a;
                                }
                            }
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC34132o.m107864I(obj2);
                        }
                        return C23454a0.f92919a;
                    }
                }

                public C41905a(InterfaceC13058l interfaceC13058l) {
                    this.f88407w = interfaceC13058l;
                }

                @Override // ec3.InterfaceC13058l
                public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                    Object objCollect = this.f88407w.collect(new C41906a(interfaceC13062m), interfaceC30057d);
                    return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C22527k c22527k, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f88406x = c22527k;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f88406x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super MetricHeartDataSyncState> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f88405w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C41905a c41905a = new C41905a(this.f88406x.exportedMetricsInteractor.getExportedHeartDataFlow());
                this.f88405w = 1;
                Object objM36577C = AbstractC13091v.m36577C(c41905a, this);
                return objM36577C == enumC31071a ? enumC31071a : objM36577C;
            }
        }

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = C22527k.this.new f(interfaceC30057d);
            fVar.f88399G = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:21:0x0103  */
        /* JADX WARN: Code duplicated, block: B:25:0x0127 A[PHI: r0 r2 r6
          0x0127: PHI (r0v22 long) = (r0v20 long), (r0v25 long) binds: [B:23:0x0123, B:9:0x0040] A[DONT_GENERATE, DONT_INLINE]
          0x0127: PHI (r2v17 java.lang.Object) = (r2v14 java.lang.Object), (r2v21 java.lang.Object) binds: [B:23:0x0123, B:9:0x0040] A[DONT_GENERATE, DONT_INLINE]
          0x0127: PHI (r6v2 ec3.m) = (r6v1 ec3.m), (r6v4 ec3.m) binds: [B:23:0x0123, B:9:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:28:0x0139  */
        /* JADX WARN: Code duplicated, block: B:31:0x0175 A[PHI: r11
          0x0175: PHI (r11v3 long) = (r11v2 long), (r11v4 long) binds: [B:29:0x0172, B:7:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:34:0x018d A[PHI: r0 r6 r11
          0x018d: PHI (r0v32 java.lang.Object) = (r0v29 java.lang.Object), (r0v35 java.lang.Object) binds: [B:32:0x018a, B:6:0x0018] A[DONT_GENERATE, DONT_INLINE]
          0x018d: PHI (r6v5 ec3.m) = (r6v1 ec3.m), (r6v7 ec3.m) binds: [B:32:0x018a, B:6:0x0018] A[DONT_GENERATE, DONT_INLINE]
          0x018d: PHI (r11v5 long) = (r11v3 long), (r11v6 long) binds: [B:32:0x018a, B:6:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0136, code lost:
        
            if (r6.emit(r2, r21) == r7) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x019c, code lost:
        
            if (r6.emit(r0, r21) == r7) goto L36;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 438
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kj2.C22527k.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kj2.k$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressMonitorInteractor$refreshCoachingLanding$2", m100430f = "StressMonitorInteractor.kt", m100431l = {292}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lnj2/l;", "<anonymous>", "(Lbc3/c0;)Lnj2/l;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f88417w;

        /* JADX INFO: renamed from: kj2.k$g$a */
        @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressMonitorInteractor$refreshCoachingLanding$2$result$1", m100430f = "StressMonitorInteractor.kt", m100431l = {293}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/design/models/items/graph/StressGraphingCardModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f88419w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22527k f88420x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C22527k c22527k, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f88420x = c22527k;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f88420x, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f88419w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                StressMonitorApi stressMonitorApi = this.f88420x.api;
                this.f88419w = 1;
                Object coachingLandingStressGraph = stressMonitorApi.getCoachingLandingStressGraph(this);
                return coachingLandingStressGraph == enumC31071a ? enumC31071a : coachingLandingStressGraph;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super StressGraphingCardModel> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C22527k.this.new g(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26765l> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f88417w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = C22527k.this.logger;
                a aVar = new a(C22527k.this, null);
                this.f88417w = 1;
                obj = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "refreshCoachingLanding", aVar, this, 2, null);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            InterfaceC34385a interfaceC34385a = (InterfaceC34385a) obj;
            return interfaceC34385a instanceof InterfaceC34385a.c ? new AbstractC26765l.a((StressGraphingCardModel) ((InterfaceC34385a.c) interfaceC34385a).m108735a()) : AbstractC26765l.c.f106540a;
        }
    }

    /* JADX INFO: renamed from: kj2.k$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressMonitorInteractor$refreshState$2", m100430f = "StressMonitorInteractor.kt", m100431l = {182}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lnj2/l;", "<anonymous>", "(Lbc3/c0;)Lnj2/l;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f88421w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f88423y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f88424z;

        /* JADX INFO: renamed from: kj2.k$h$a */
        @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressMonitorInteractor$refreshState$2$result$1", m100430f = "StressMonitorInteractor.kt", m100431l = {188, 189, 192, 196}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lnj2/l$e;", "<anonymous>", "()Lnj2/l$e;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: E */
            int f88425E;

            /* JADX INFO: renamed from: F */
            int f88426F;

            /* JADX INFO: renamed from: G */
            int f88427G;

            /* JADX INFO: renamed from: H */
            int f88428H;

            /* JADX INFO: renamed from: I */
            final /* synthetic */ C22527k f88429I;

            /* JADX INFO: renamed from: J */
            final /* synthetic */ String f88430J;

            /* JADX INFO: renamed from: K */
            final /* synthetic */ boolean f88431K;

            /* JADX INFO: renamed from: w */
            Object f88432w;

            /* JADX INFO: renamed from: x */
            Object f88433x;

            /* JADX INFO: renamed from: y */
            Object f88434y;

            /* JADX INFO: renamed from: z */
            Object f88435z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C22527k c22527k, String str, boolean z4, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f88429I = c22527k;
                this.f88430J = str;
                this.f88431K = z4;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f88429I, this.f88430J, this.f88431K, interfaceC30057d);
            }

            /* JADX WARN: Code duplicated, block: B:39:0x00f6  */
            /* JADX WARN: Code duplicated, block: B:41:0x00f9  */
            /* JADX WARN: Code duplicated, block: B:44:0x011d  */
            /* JADX WARN: Code duplicated, block: B:48:0x0127  */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
            
                if (r13 == r0) goto L43;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
            
                if (r13 == r0) goto L43;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    Method dump skipped, instruction units count: 301
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: kj2.C22527k.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super AbstractC26765l.e> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z4, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f88423y = str;
            this.f88424z = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C22527k.this.new h(this.f88423y, this.f88424z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26765l> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f88421w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = C22527k.this.logger;
                a aVar = new a(C22527k.this, this.f88423y, this.f88424z, null);
                this.f88421w = 1;
                obj = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "refreshStateMonitor", aVar, this, 2, null);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            InterfaceC34385a interfaceC34385a = (InterfaceC34385a) obj;
            if (interfaceC34385a instanceof InterfaceC34385a.c) {
                return (AbstractC26765l) ((InterfaceC34385a.c) interfaceC34385a).m108735a();
            }
            return interfaceC34385a instanceof InterfaceC34385a.b.C42432b ? AbstractC26765l.b.f106539a : AbstractC26765l.c.f106540a;
        }
    }

    /* JADX INFO: renamed from: kj2.k$i */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressMonitorInteractor$refreshStateFlow$1", m100430f = "StressMonitorInteractor.kt", m100431l = {116, 118, 129}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lkj2/c$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f88436E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C22527k f88437F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ String f88438G;

        /* JADX INFO: renamed from: w */
        Object f88439w;

        /* JADX INFO: renamed from: x */
        int f88440x;

        /* JADX INFO: renamed from: y */
        int f88441y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f88442z;

        /* JADX INFO: renamed from: kj2.k$i$a */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f88443w;

            /* JADX INFO: renamed from: kj2.k$i$a$a, reason: collision with other inner class name */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41908a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f88444w;

                /* JADX INFO: renamed from: kj2.k$i$a$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressMonitorInteractor$refreshStateFlow$1$invokeSuspend$$inlined$map$1$2", m100430f = "StressMonitorInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C41909a extends AbstractC32269c {

                    /* JADX INFO: renamed from: E */
                    Object f88445E;

                    /* JADX INFO: renamed from: F */
                    Object f88446F;

                    /* JADX INFO: renamed from: G */
                    Object f88447G;

                    /* JADX INFO: renamed from: H */
                    int f88448H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f88449w;

                    /* JADX INFO: renamed from: x */
                    int f88450x;

                    /* JADX INFO: renamed from: y */
                    Object f88451y;

                    public C41909a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f88449w = obj;
                        this.f88450x |= Integer.MIN_VALUE;
                        return C41908a.this.emit(null, this);
                    }
                }

                public C41908a(InterfaceC13062m interfaceC13062m) {
                    this.f88444w = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C41909a c41909a;
                    if (interfaceC30057d instanceof C41909a) {
                        c41909a = (C41909a) interfaceC30057d;
                        int i13 = c41909a.f88450x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c41909a.f88450x = i13 - Integer.MIN_VALUE;
                        } else {
                            c41909a = new C41909a(interfaceC30057d);
                        }
                    } else {
                        c41909a = new C41909a(interfaceC30057d);
                    }
                    Object obj2 = c41909a.f88449w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c41909a.f88450x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f88444w;
                        AbstractC22519c.b bVar = new AbstractC22519c.b((AbstractC26765l) obj);
                        c41909a.f88451y = null;
                        c41909a.f88445E = null;
                        c41909a.f88446F = null;
                        c41909a.f88447G = null;
                        c41909a.f88448H = 0;
                        c41909a.f88450x = 1;
                        if (interfaceC13062m.emit(bVar, c41909a) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj2);
                    }
                    return C23454a0.f92919a;
                }
            }

            public a(InterfaceC13058l interfaceC13058l) {
                this.f88443w = interfaceC13058l;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f88443w.collect(new C41908a(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, C22527k c22527k, String str2, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f88436E = str;
            this.f88437F = c22527k;
            this.f88438G = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            i iVar = new i(this.f88436E, this.f88437F, this.f88438G, interfaceC30057d);
            iVar.f88442z = obj;
            return iVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0085  */
        /* JADX WARN: Code duplicated, block: B:28:0x00ac  */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00d2, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r0, r4, r9) == r1) goto L30;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v2 */
        /* JADX WARN: Type inference failed for: r10v21 */
        /* JADX WARN: Type inference failed for: r10v3, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v8, types: [int] */
        /* JADX WARN: Type inference failed for: r2v9, types: [int] */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 216
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kj2.C22527k.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kj2.k$j */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressMonitorInteractor$refreshStateFlow$2", m100430f = "StressMonitorInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lkj2/c$b;", "stateAction", "Lca2/a;", "syncState", "<anonymous>", "(Lkj2/c$b;Lca2/a;)Lkj2/c$b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f88453w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f88454x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f88455y;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC22519c.b bVar, C4361a c4361a, InterfaceC30057d<? super AbstractC22519c.b> interfaceC30057d) {
            j jVar = C22527k.this.new j(interfaceC30057d);
            jVar.f88454x = bVar;
            jVar.f88455y = c4361a;
            return jVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC22519c.b bVar = (AbstractC22519c.b) this.f88454x;
            C4361a c4361a = (C4361a) this.f88455y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f88453w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC26765l domainState = bVar.getDomainState();
            if (!(domainState instanceof AbstractC26765l.e)) {
                return bVar;
            }
            AbstractC26765l.e eVar = (AbstractC26765l.e) domainState;
            return eVar.getIsShowConnectivityWindowEnabled() ? new AbstractC22519c.b(AbstractC26765l.e.m79692b(eVar, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, c4361a.getState(), false, C22527k.this.readableDateFormatterReducer.m85177a(c4361a.getLastSyncTimeStamp()), null, null, false, null, null, null, null, 133562367, null)) : bVar;
        }
    }

    /* JADX INFO: renamed from: kj2.k$k */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressMonitorInteractor$sendSourceIdToNotificationService$2", m100430f = "StressMonitorInteractor.kt", m100431l = {302}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lec3/l;", "Lkj2/c$b;", "<anonymous>", "(Lbc3/c0;)Lec3/l;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f88457w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f88459y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f88459y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C22527k.this.new k(this.f88459y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
            return ((k) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f88457w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                NotificationRepository notificationRepository = C22527k.this.notificationRepository;
                PushNotificationMetricType pushNotificationMetricType = PushNotificationMetricType.Opened;
                String str = this.f88459y;
                this.f88457w = 1;
                if (notificationRepository.sendPushNotificationMetric(pushNotificationMetricType, str, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return new C0456u(new AbstractC22519c.b(AbstractC26765l.d.f106541a), 1);
        }
    }

    /* JADX INFO: renamed from: kj2.k$l */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressMonitorInteractor", m100430f = "StressMonitorInteractor.kt", m100431l = {256, 280}, m100432m = "uploadMetrics", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f88460E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f88461F;

        /* JADX INFO: renamed from: H */
        int f88463H;

        /* JADX INFO: renamed from: w */
        Object f88464w;

        /* JADX INFO: renamed from: x */
        Object f88465x;

        /* JADX INFO: renamed from: y */
        Object f88466y;

        /* JADX INFO: renamed from: z */
        Object f88467z;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f88461F = obj;
            this.f88463H |= Integer.MIN_VALUE;
            return C22527k.this.m65069D(null, this);
        }
    }

    /* JADX INFO: renamed from: kj2.k$m */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.interactor.StressMonitorInteractor$uploadMetrics$result$1", m100430f = "StressMonitorInteractor.kt", m100431l = {257, 269}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lnj2/l$e;", "<anonymous>", "()Lnj2/l$e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class m extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ AbstractC34846v0 f88468E;

        /* JADX INFO: renamed from: w */
        Object f88469w;

        /* JADX INFO: renamed from: x */
        int f88470x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C27941d f88472z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(C27941d c27941d, AbstractC34846v0 abstractC34846v0, InterfaceC30057d<? super m> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f88472z = c27941d;
            this.f88468E = abstractC34846v0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C22527k.this.new m(this.f88472z, this.f88468E, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objUpdateStressMonitor;
            Object stressEducation;
            StressMonitorDto stressMonitorDto;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f88470x;
            if (i13 != 0) {
                if (i13 == 1) {
                    AbstractC34132o.m107864I(obj);
                    objUpdateStressMonitor = obj;
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    stressMonitorDto = (StressMonitorDto) this.f88469w;
                    AbstractC34132o.m107864I(obj);
                    stressEducation = obj;
                }
                return C22527k.this.m65068C(stressMonitorDto, (FeatureEducationDto) stressEducation, false);
            }
            AbstractC34132o.m107864I(obj);
            StressMonitorApi stressMonitorApi = C22527k.this.api;
            String strM65099b = AbstractC22528l.m65099b();
            AbstractC22676k.m65749i(strM65099b, "<get-TIME_STAMP_ON_SYNC>(...)");
            String strM84347h = this.f88472z.m84347h();
            AbstractC22676k.m65749i(strM84347h, "getStrapId(...)");
            String strM84332d = this.f88472z.m84345f().m84332d();
            String strMo84319a = this.f88472z.m84344e().mo84319a();
            String strM84360f = this.f88472z.m84346g().m84360f();
            AbstractC22676k.m65749i(strM84360f, "toSemanticVersionString(...)");
            byte bM84343d = this.f88472z.m84343d();
            byte bM84342c = this.f88472z.m84342c();
            String strValueOf = String.valueOf(this.f88468E.contentLength());
            AbstractC34846v0 abstractC34846v0 = this.f88468E;
            this.f88470x = 1;
            objUpdateStressMonitor = stressMonitorApi.updateStressMonitor(strM65099b, strM84347h, strM84332d, strMo84319a, strM84360f, bM84343d, bM84342c, strValueOf, abstractC34846v0, this);
            if (objUpdateStressMonitor != enumC31071a) {
            }
            return enumC31071a;
            StressMonitorDto stressMonitorDto2 = (StressMonitorDto) objUpdateStressMonitor;
            StressMonitorApi stressMonitorApi2 = C22527k.this.api;
            this.f88469w = stressMonitorDto2;
            this.f88470x = 2;
            stressEducation = stressMonitorApi2.getStressEducation(this);
            if (stressEducation != enumC31071a) {
                stressMonitorDto = stressMonitorDto2;
                return C22527k.this.m65068C(stressMonitorDto, (FeatureEducationDto) stressEducation, false);
            }
            return enumC31071a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super AbstractC26765l.e> interfaceC30057d) {
            return ((m) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C22527k(StressMonitorApi api, InterfaceC18732d dispatcher, C34660d sharedPreferences, ExportedMetricsInteractor exportedMetricsInteractor, C14543a analyticsManager, InterfaceC34116n logger, NotificationRepository notificationRepository, C4362b strapSyncHelper, C28149b1 readableDateFormatterReducer, InterfaceC41070a dateAndTimeProvider, InterfaceC21030c metricsInteractor) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(dispatcher, "dispatcher");
        AbstractC22676k.m65750j(sharedPreferences, "sharedPreferences");
        AbstractC22676k.m65750j(exportedMetricsInteractor, "exportedMetricsInteractor");
        AbstractC22676k.m65750j(analyticsManager, "analyticsManager");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(notificationRepository, "notificationRepository");
        AbstractC22676k.m65750j(strapSyncHelper, "strapSyncHelper");
        AbstractC22676k.m65750j(readableDateFormatterReducer, "readableDateFormatterReducer");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(metricsInteractor, "metricsInteractor");
        this.api = api;
        this.dispatcher = dispatcher;
        this.sharedPreferences = sharedPreferences;
        this.exportedMetricsInteractor = exportedMetricsInteractor;
        this.analyticsManager = analyticsManager;
        this.logger = logger;
        this.notificationRepository = notificationRepository;
        this.strapSyncHelper = strapSyncHelper;
        this.readableDateFormatterReducer = readableDateFormatterReducer;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.metricsInteractor = metricsInteractor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public final Object m65066A(String str, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcher.getIO(), new k(str, null), interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public final AbstractC26765l m65067B(AbstractC26765l domainState) {
        return domainState instanceof AbstractC26765l.e ? AbstractC26765l.e.m79692b((AbstractC26765l.e) domainState, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, 134217711, null) : domainState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final AbstractC26765l.e m65068C(StressMonitorDto stressMonitorDto, FeatureEducationDto onboardingEducationDto, boolean showIsLoading) {
        String title = stressMonitorDto.getTitle();
        StressState stressState = stressMonitorDto.getStressState();
        String lastUpdated = stressMonitorDto.getLastUpdated();
        StressMonitorMeterDto meter = stressMonitorDto.getMeter();
        Float fillPercent = meter.getFillPercent();
        float fFloatValue = fillPercent != null ? fillPercent.floatValue() : 0.0f;
        String stressScore = meter.getStressScore();
        String stressText = meter.getStressText();
        String meterMin = meter.getMeterMin();
        String meterMax = meter.getMeterMax();
        LoadingData loadingData = stressMonitorDto.getLoadingData();
        String titleDisplay = loadingData != null ? loadingData.getTitleDisplay() : null;
        LoadingData loadingData2 = stressMonitorDto.getLoadingData();
        C26756c c26756c = new C26756c(fFloatValue, stressScore, stressText, meterMin, meterMax, showIsLoading, titleDisplay, loadingData2 != null ? loadingData2.getSubtitleDisplay() : null);
        boolean zM109528e = this.sharedPreferences.m109528e(SharedPreferenceConstants.KEY_SHOW_STRESS_MONITOR_EDUCATION, true);
        StressMonitorVow vow = stressMonitorDto.getVow();
        return new AbstractC26765l.e(title, stressState, c26756c, lastUpdated, zM109528e, vow != null ? new C26779z(vow.getHeader(), vow.getText()) : null, stressMonitorDto.getWhoopCoachVow(), stressMonitorDto.getStressGraph(), stressMonitorDto.getOnboardingCarouselModel(), stressMonitorDto.getSessionsCarouselModel(), stressMonitorDto.getEducationCarouselModel(), onboardingEducationDto, stressMonitorDto.getShowOnboardingEducation() && this.sharedPreferences.m109528e(SharedPreferenceConstants.KEY_SHOW_STRESS_MONITOR_ONBOARDING, true), stressMonitorDto.getCalibrationText(), stressMonitorDto.getPendingActivityDialogue(), stressMonitorDto.getOnboardingDismissDialogue(), stressMonitorDto.getPreviousStressGraphState(), null, stressMonitorDto.getShowConnectivityWindow(), null, stressMonitorDto.getTrend(), stressMonitorDto.getDateSelector(), false, stressMonitorDto.getExtended24HourGraphState(), stressMonitorDto.getTrendList(), stressMonitorDto.getProgressStepper(), stressMonitorDto.getMetadata(), 4849664, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: D */
    public final Object m65069D(MetricsHeartDataBundle metricsHeartDataBundle, InterfaceC30057d<? super AbstractC26765l> interfaceC30057d) {
        l lVar;
        l lVar2;
        if (interfaceC30057d instanceof l) {
            lVar = (l) interfaceC30057d;
            int i13 = lVar.f88463H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lVar.f88463H = i13 - Integer.MIN_VALUE;
            } else {
                lVar = new l(interfaceC30057d);
            }
        } else {
            lVar = new l(interfaceC30057d);
        }
        l lVar3 = lVar;
        Object objM108729b = lVar3.f88461F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = lVar3.f88463H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            C39543b exportedHeartData = metricsHeartDataBundle.getExportedHeartData();
            AbstractC34846v0 fileAsRequestBody = metricsHeartDataBundle.getFileAsRequestBody();
            this.logger.mo85216g(AbstractC31061c.m95636l(fileAsRequestBody.contentLength(), "Upload body size: ", " bytes (stress monitor API)"), new AbstractC30556a.a[0]);
            C27941d historyHeartDataVersion = exportedHeartData.getHistoryHeartDataVersion();
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            m mVar = new m(historyHeartDataVersion, fileAsRequestBody, null);
            lVar3.f88464w = null;
            lVar3.f88465x = null;
            lVar3.f88466y = null;
            lVar3.f88467z = null;
            lVar3.f88463H = 1;
            lVar2 = lVar3;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "uploadMetrics", mVar, lVar2, 2, null);
            if (objM108729b != enumC31071a) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
            return objM108729b;
        }
        AbstractC34132o.m107864I(objM108729b);
        lVar2 = lVar3;
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            InterfaceC34385a.c cVar = (InterfaceC34385a.c) interfaceC34385a;
            this.analyticsManager.m41550s(((AbstractC26765l.e) cVar.m108735a()).getMeterContent().getStressScore());
            return (AbstractC26765l) cVar.m108735a();
        }
        this.analyticsManager.m41549r();
        lVar2.f88464w = null;
        lVar2.f88465x = null;
        lVar2.f88466y = null;
        lVar2.f88467z = null;
        lVar2.f88460E = null;
        lVar2.f88463H = 2;
        Object objM65093y = m65093y(this, false, null, lVar2, 2, null);
        return objM65093y == enumC31071a ? enumC31071a : objM65093y;
    }

    /* JADX INFO: renamed from: s */
    private final InterfaceC13058l m65088s(InterfaceC13058l upstream) {
        return new C13060l1(AbstractC26765l.d.f106541a, AbstractC13091v.m36590P(upstream, new a(null, this)), new c(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: t */
    public final Object m65089t(InterfaceC30057d<? super AbstractC22519c.c> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f88394y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f88394y = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object obj = dVar.f88392w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f88394y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC30063j io3 = this.dispatcher.getIO();
            e eVar = new e(null);
            dVar.f88394y = 1;
            if (AbstractC3006f0.m8705K(io3, eVar, dVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return AbstractC22519c.c.f88281a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public final InterfaceC13058l m65090v() {
        return new C13084s1(new f(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final Object m65091w(InterfaceC30057d<? super AbstractC26765l> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcher.getIO(), new g(null), interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public final Object m65092x(boolean z4, String str, InterfaceC30057d<? super AbstractC26765l> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcher.getIO(), new h(str, z4, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ Object m65093y(C22527k c22527k, boolean z4, String str, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = null;
        }
        return c22527k.m65092x(z4, str, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public final InterfaceC13058l m65094z(String source, String specificDate) {
        return AbstractC13091v.m36580F(new C13060l1(new C13084s1(new i(specificDate, this, source, null)), this.strapSyncHelper.getDataCatchingUpDomainResultFlow(), new j(null), 1), this.dispatcher.getIO());
    }

    /* JADX INFO: renamed from: u */
    public final InterfaceC13058l m65095u(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return m65088s(upstream);
    }
}
