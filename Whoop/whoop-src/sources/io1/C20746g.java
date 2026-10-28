package io1;

import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.hormonalinsights.api.GetLogSymptomsRequest;
import com.whoop.hormonalinsights.api.HormonalInsightsApi;
import com.whoop.hormonalinsights.logsymptoms.domain.models.LogSymptomsResponse;
import com.whoop.hormonalinsights.logsymptoms.domain.models.LogSymptomsSaveRequest;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import l83.C23454a0;
import l83.C23465k;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg3.C29218v0;
import pm0.AbstractC29355b;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import tr2.InterfaceC34116n;
import wm0.C37378a;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: io1.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ6\u0010!\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u00122\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u0082@¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0012H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016*\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0002¢\u0006\u0004\b%\u0010&J#\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016¢\u0006\u0004\b(\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, m65681d2 = {"Lio1/g;", "Lod1/g;", "Lio1/e;", "Lio1/f;", "Lnm0/e;", "cachedApiSource", "Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;", "api", "Lzr2/a;", "dateAndTimeProvider", "Lwm0/a;", "scopeCoordinator", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ltr2/n;", "logger", "<init>", "(Lnm0/e;Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Lzr2/a;Lwm0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V", "", "requestDate", "", "manualRefresh", "Lec3/l;", "i", "(Ljava/lang/String;Z)Lec3/l;", "Lpm0/a$c;", "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;", "cacheResult", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lpm0/a$c;)Lio1/f;", "menstruation", "cervicalMucus", "response", "k", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;Lq83/d;)Ljava/lang/Object;", "g", "()Ljava/lang/String;", "l", "(Lec3/l;)Lec3/l;", "upstream", "interact", "a", "Lnm0/e;", "b", "Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;", "c", "Lzr2/a;", "d", "Lwm0/a;", "e", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "f", "Ltr2/n;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20746g implements InterfaceC27844g<AbstractC20744e, C20745f> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final HormonalInsightsApi api;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C37378a scopeCoordinator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: io1.g$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.logsymptoms.domain.LogSymptomsInteractor$interact$$inlined$flatMapLatest$1", m100430f = "LogSymptomsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f77869w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f77870x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f77871y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C20746g f77872z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C20746g c20746g) {
            super(3, interfaceC30057d);
            this.f77872z = c20746g;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC20744e abstractC20744e, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f77872z);
            aVar.f77870x = interfaceC13062m;
            aVar.f77871y = abstractC20744e;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f77869w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f77870x;
                AbstractC20744e abstractC20744e = (AbstractC20744e) this.f77871y;
                if (abstractC20744e instanceof AbstractC20744e.b) {
                    String requestDate = ((AbstractC20744e.b) abstractC20744e).getRequestDate();
                    if (requestDate == null) {
                        requestDate = this.f77872z.m57094g();
                    }
                    c13084s1 = AbstractC13091v.m36590P(C20746g.m57097j(this.f77872z, requestDate, false, 2, null), new f(null, requestDate));
                } else {
                    c13084s1 = new C13084s1(new d(abstractC20744e, null));
                }
                this.f77870x = null;
                this.f77871y = null;
                this.f77869w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC20744e) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: io1.g$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f77873w;

        /* JADX INFO: renamed from: io1.g$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f77874w;

            /* JADX INFO: renamed from: io1.g$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.logsymptoms.domain.LogSymptomsInteractor$interact$$inlined$map$1$2", m100430f = "LogSymptomsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41772a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f77875E;

                /* JADX INFO: renamed from: F */
                Object f77876F;

                /* JADX INFO: renamed from: G */
                Object f77877G;

                /* JADX INFO: renamed from: H */
                int f77878H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f77879w;

                /* JADX INFO: renamed from: x */
                int f77880x;

                /* JADX INFO: renamed from: y */
                Object f77881y;

                public C41772a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f77879w = obj;
                    this.f77880x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f77874w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41772a c41772a;
                if (interfaceC30057d instanceof C41772a) {
                    c41772a = (C41772a) interfaceC30057d;
                    int i13 = c41772a.f77880x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41772a.f77880x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41772a = new C41772a(interfaceC30057d);
                    }
                } else {
                    c41772a = new C41772a(interfaceC30057d);
                }
                Object obj2 = c41772a.f77879w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41772a.f77880x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f77874w;
                    C20740a c20740a = (C20740a) obj;
                    C20745f c20745fM57082b = C20745f.m57082b(c20740a.getDomainState(), null, null, false, false, c20740a.getMenstruation(), c20740a.getCervicalMucus(), 15, null);
                    c41772a.f77881y = null;
                    c41772a.f77875E = null;
                    c41772a.f77876F = null;
                    c41772a.f77877G = null;
                    c41772a.f77878H = 0;
                    c41772a.f77880x = 1;
                    if (interfaceC13062m.emit(c20745fM57082b, c41772a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l) {
            this.f77873w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f77873w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io1.g$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.logsymptoms.domain.LogSymptomsInteractor$interact$1$1$1", m100430f = "LogSymptomsInteractor.kt", m100431l = {58}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lio1/c$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f77883w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f77884x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C20745f f77885y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f77886z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C20745f c20745f, String str, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f77885y = c20745f;
            this.f77886z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f77885y, this.f77886z, interfaceC30057d);
            cVar.f77884x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f77884x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f77883w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC20742c.b bVar = new AbstractC20742c.b(this.f77885y, this.f77886z);
                this.f77884x = null;
                this.f77883w = 1;
                if (interfaceC13062m.emit(bVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: io1.g$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.logsymptoms.domain.LogSymptomsInteractor$interact$1$2", m100430f = "LogSymptomsInteractor.kt", m100431l = {61}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lio1/c$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f77887w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f77888x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC20744e f77889y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC20744e abstractC20744e, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f77889y = abstractC20744e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(this.f77889y, interfaceC30057d);
            dVar.f77888x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f77888x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f77887w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC20742c.a aVar = new AbstractC20742c.a(this.f77889y);
                this.f77888x = null;
                this.f77887w = 1;
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

    /* JADX INFO: renamed from: io1.g$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.logsymptoms.domain.LogSymptomsInteractor$interact$2", m100430f = "LogSymptomsInteractor.kt", m100431l = {118}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lio1/a;", "currentState", "Lio1/c;", "internalAction", "<anonymous>", "(Lio1/a;Lio1/c;)Lio1/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        Object f77891w;

        /* JADX INFO: renamed from: x */
        int f77892x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f77893y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f77894z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C20740a c20740a, AbstractC20742c abstractC20742c, InterfaceC30057d<? super C20740a> interfaceC30057d) {
            e eVar = C20746g.this.new e(interfaceC30057d);
            eVar.f77893y = c20740a;
            eVar.f77894z = abstractC20742c;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C23465k c23465k;
            C20740a c20740a = (C20740a) this.f77893y;
            AbstractC20742c abstractC20742c = (AbstractC20742c) this.f77894z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f77892x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                LogSymptomsResponse logSymptomsResponseM57107f = null;
                if (abstractC20742c instanceof AbstractC20742c.b) {
                    AbstractC20742c.b bVar = (AbstractC20742c.b) abstractC20742c;
                    LogSymptomsResponse response = bVar.getDomainState().getResponse();
                    if (response == null || (c23465k = AbstractC20747h.m57104c(response)) == null) {
                        c23465k = new C23465k(null, null);
                    }
                    return c20740a.m57060a(bVar.getDomainState(), bVar.getRequestDate(), (String) c23465k.f92937w, (String) c23465k.f92938x);
                }
                if (!(abstractC20742c instanceof AbstractC20742c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC20744e action = ((AbstractC20742c.a) abstractC20742c).getAction();
                if (action instanceof AbstractC20744e.f) {
                    return C20740a.m57059b(c20740a, null, null, ((AbstractC20744e.f) action).getValue(), null, 11, null);
                }
                if (action instanceof AbstractC20744e.d) {
                    return C20740a.m57059b(c20740a, null, null, null, ((AbstractC20744e.d) action).getValue(), 7, null);
                }
                if (action instanceof AbstractC20744e.g) {
                    LogSymptomsResponse response2 = c20740a.getDomainState().getResponse();
                    if (response2 != null) {
                        AbstractC20744e.g gVar = (AbstractC20744e.g) action;
                        logSymptomsResponseM57107f = AbstractC20747h.m57107f(response2, gVar.getId(), Boolean.valueOf(gVar.getIsSelected()), null, null, 12, null);
                    }
                    return C20740a.m57059b(c20740a, C20745f.m57082b(c20740a.getDomainState(), null, logSymptomsResponseM57107f, false, false, null, null, 61, null), null, null, null, 14, null);
                }
                if (action instanceof AbstractC20744e.e) {
                    LogSymptomsResponse response3 = c20740a.getDomainState().getResponse();
                    if (response3 != null) {
                        AbstractC20744e.e eVar = (AbstractC20744e.e) action;
                        logSymptomsResponseM57107f = AbstractC20747h.m57107f(response3, eVar.getId(), null, eVar.getNumber(), null, 10, null);
                    }
                    return C20740a.m57059b(c20740a, C20745f.m57082b(c20740a.getDomainState(), null, logSymptomsResponseM57107f, false, false, null, null, 61, null), null, null, null, 14, null);
                }
                if (action instanceof AbstractC20744e.h) {
                    LogSymptomsResponse response4 = c20740a.getDomainState().getResponse();
                    if (response4 != null) {
                        AbstractC20744e.h hVar = (AbstractC20744e.h) action;
                        logSymptomsResponseM57107f = AbstractC20747h.m57107f(response4, hVar.getId(), null, null, hVar.getTime(), 6, null);
                    }
                    return C20740a.m57059b(c20740a, C20745f.m57082b(c20740a.getDomainState(), null, logSymptomsResponseM57107f, false, false, null, null, 61, null), null, null, null, 14, null);
                }
                if (!(action instanceof AbstractC20744e.c)) {
                    return action instanceof AbstractC20744e.a ? C20740a.m57059b(c20740a, C20745f.m57082b(c20740a.getDomainState(), InterfaceC20743d.a.f77842a, null, false, false, null, null, 62, null), null, null, null, 14, null) : c20740a;
                }
                C20746g c20746g = C20746g.this;
                String requestDate = c20740a.getRequestDate();
                if (requestDate == null) {
                    requestDate = C20746g.this.m57094g();
                }
                String menstruation = c20740a.getMenstruation();
                String cervicalMucus = c20740a.getCervicalMucus();
                LogSymptomsResponse response5 = c20740a.getDomainState().getResponse();
                this.f77893y = c20740a;
                this.f77894z = null;
                this.f77891w = null;
                this.f77892x = 1;
                obj = c20746g.m57098k(requestDate, menstruation, cervicalMucus, response5, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C20740a.m57059b(c20740a, (C20745f) obj, null, null, null, 14, null);
        }
    }

    /* JADX INFO: renamed from: io1.g$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.logsymptoms.domain.LogSymptomsInteractor$interact$lambda$0$$inlined$flatMapLatest$1", m100430f = "LogSymptomsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f77895w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f77896x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f77897y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f77898z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC30057d interfaceC30057d, String str) {
            super(3, interfaceC30057d);
            this.f77898z = str;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C20745f c20745f, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            f fVar = new f(interfaceC30057d, this.f77898z);
            fVar.f77896x = interfaceC13062m;
            fVar.f77897y = c20745f;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f77895w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f77896x;
                C13084s1 c13084s1 = new C13084s1(new c((C20745f) this.f77897y, this.f77898z, null));
                this.f77896x = null;
                this.f77897y = null;
                this.f77895w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C20745f) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: io1.g$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.logsymptoms.domain.LogSymptomsInteractor$loadLogSymptomsCache$$inlined$cacheAPI$1", m100430f = "LogSymptomsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f77899w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f77900x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f77901y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f77902z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f77902z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            g gVar = new g(interfaceC30057d, this.f77902z);
            gVar.f77900x = interfaceC13062m;
            gVar.f77901y = c26832c;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f77899w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f77900x;
                C26832c c26832c = (C26832c) this.f77901y;
                InterfaceC26834e interfaceC26834e = this.f77902z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(LogSymptomsResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(LogSymptomsResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f77900x = null;
                this.f77901y = null;
                this.f77899w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: io1.g$h */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f77903w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f77904x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C20746g f77905y;

        /* JADX INFO: renamed from: io1.g$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f77906w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ boolean f77907x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C20746g f77908y;

            /* JADX INFO: renamed from: io1.g$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.logsymptoms.domain.LogSymptomsInteractor$loadLogSymptomsCache$$inlined$map$1$2", m100430f = "LogSymptomsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41773a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f77909E;

                /* JADX INFO: renamed from: F */
                Object f77910F;

                /* JADX INFO: renamed from: G */
                Object f77911G;

                /* JADX INFO: renamed from: H */
                int f77912H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f77913w;

                /* JADX INFO: renamed from: x */
                int f77914x;

                /* JADX INFO: renamed from: y */
                Object f77915y;

                public C41773a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f77913w = obj;
                    this.f77914x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, boolean z4, C20746g c20746g) {
                this.f77906w = interfaceC13062m;
                this.f77907x = z4;
                this.f77908y = c20746g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41773a c41773a;
                C20745f c20745fM57095h;
                if (interfaceC30057d instanceof C41773a) {
                    c41773a = (C41773a) interfaceC30057d;
                    int i13 = c41773a.f77914x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41773a.f77914x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41773a = new C41773a(interfaceC30057d);
                    }
                } else {
                    c41773a = new C41773a(interfaceC30057d);
                }
                Object obj2 = c41773a.f77913w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41773a.f77914x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f77906w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        c20745fM57095h = new C20745f(InterfaceC20743d.c.f77843a, null, false, false, null, null, 62, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                        c20745fM57095h = new C20745f(null, (LogSymptomsResponse) ((InterfaceC29354a.a.b) interfaceC29354a).getData(), this.f77907x, true, null, null, 49, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        c20745fM57095h = new C20745f(null, (LogSymptomsResponse) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData(), false, false, null, null, 61, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                        c20745fM57095h = new C20745f(null, (LogSymptomsResponse) ((InterfaceC29354a.d) interfaceC29354a).getData(), false, false, null, null, 61, null);
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c20745fM57095h = this.f77908y.m57095h((InterfaceC29354a.c) interfaceC29354a);
                    }
                    c41773a.f77915y = null;
                    c41773a.f77909E = null;
                    c41773a.f77910F = null;
                    c41773a.f77911G = null;
                    c41773a.f77912H = 0;
                    c41773a.f77914x = 1;
                    if (interfaceC13062m.emit(c20745fM57095h, c41773a) == enumC31071a) {
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

        public h(InterfaceC13058l interfaceC13058l, boolean z4, C20746g c20746g) {
            this.f77903w = interfaceC13058l;
            this.f77904x = z4;
            this.f77905y = c20746g;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f77903w.collect(new a(interfaceC13062m, this.f77904x, this.f77905y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io1.g$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.logsymptoms.domain.LogSymptomsInteractor", m100430f = "LogSymptomsInteractor.kt", m100431l = {173, 182}, m100432m = "performSave", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f77917E;

        /* JADX INFO: renamed from: F */
        Object f77918F;

        /* JADX INFO: renamed from: G */
        Object f77919G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f77920H;

        /* JADX INFO: renamed from: J */
        int f77922J;

        /* JADX INFO: renamed from: w */
        Object f77923w;

        /* JADX INFO: renamed from: x */
        Object f77924x;

        /* JADX INFO: renamed from: y */
        Object f77925y;

        /* JADX INFO: renamed from: z */
        Object f77926z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f77920H = obj;
            this.f77922J |= Integer.MIN_VALUE;
            return C20746g.this.m57098k(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io1.g$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.logsymptoms.domain.LogSymptomsInteractor$performSave$apiResult$1", m100430f = "LogSymptomsInteractor.kt", m100431l = {174}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f77927w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f77929y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ LogSymptomsSaveRequest f77930z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, LogSymptomsSaveRequest logSymptomsSaveRequest, InterfaceC30057d<? super j> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f77929y = str;
            this.f77930z = logSymptomsSaveRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C20746g.this.new j(this.f77929y, this.f77930z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f77927w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HormonalInsightsApi hormonalInsightsApi = C20746g.this.api;
            String str = this.f77929y;
            LogSymptomsSaveRequest logSymptomsSaveRequest = this.f77930z;
            this.f77927w = 1;
            Object objSaveSymptoms = hormonalInsightsApi.saveSymptoms(str, logSymptomsSaveRequest, this);
            return objSaveSymptoms == enumC31071a ? enumC31071a : objSaveSymptoms;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((j) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: io1.g$k */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f77931w;

        /* JADX INFO: renamed from: io1.g$k$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f77932w;

            /* JADX INFO: renamed from: io1.g$k$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.logsymptoms.domain.LogSymptomsInteractor$saveDateForRefresh$$inlined$mapNotNull$1$2", m100430f = "LogSymptomsInteractor.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41774a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f77933E;

                /* JADX INFO: renamed from: F */
                Object f77934F;

                /* JADX INFO: renamed from: G */
                Object f77935G;

                /* JADX INFO: renamed from: H */
                Object f77936H;

                /* JADX INFO: renamed from: I */
                int f77937I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f77938w;

                /* JADX INFO: renamed from: x */
                int f77939x;

                /* JADX INFO: renamed from: y */
                Object f77940y;

                public C41774a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f77938w = obj;
                    this.f77939x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f77932w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41774a c41774a;
                if (interfaceC30057d instanceof C41774a) {
                    c41774a = (C41774a) interfaceC30057d;
                    int i13 = c41774a.f77939x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41774a.f77939x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41774a = new C41774a(interfaceC30057d);
                    }
                } else {
                    c41774a = new C41774a(interfaceC30057d);
                }
                Object obj2 = c41774a.f77938w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41774a.f77939x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f77932w;
                    AbstractC20744e action = ((C20741b) obj).getAction();
                    if (action != null) {
                        c41774a.f77940y = null;
                        c41774a.f77933E = null;
                        c41774a.f77934F = null;
                        c41774a.f77935G = null;
                        c41774a.f77936H = null;
                        c41774a.f77937I = 0;
                        c41774a.f77939x = 1;
                        if (interfaceC13062m.emit(action, c41774a) == enumC31071a) {
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

        public k(InterfaceC13058l interfaceC13058l) {
            this.f77931w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f77931w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io1.g$l */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.logsymptoms.domain.LogSymptomsInteractor$saveDateForRefresh$1", m100430f = "LogSymptomsInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lio1/b;", "accumulated", "Lio1/e;", "action", "<anonymous>", "(Lio1/b;Lio1/e;)Lio1/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f77942w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f77943x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f77944y;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C20741b c20741b, AbstractC20744e abstractC20744e, InterfaceC30057d<? super C20741b> interfaceC30057d) {
            l lVar = new l(interfaceC30057d);
            lVar.f77943x = c20741b;
            lVar.f77944y = abstractC20744e;
            return lVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C20741b c20741b = (C20741b) this.f77943x;
            AbstractC20744e abstractC20744e = (AbstractC20744e) this.f77944y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f77942w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!(abstractC20744e instanceof AbstractC20744e.b)) {
                return C20741b.m57065b(c20741b, abstractC20744e, null, 2, null);
            }
            AbstractC20744e.b bVar = (AbstractC20744e.b) abstractC20744e;
            String requestDate = bVar.getRequestDate();
            if (requestDate == null) {
                requestDate = c20741b.getStoredDate();
            }
            return new C20741b(bVar.m57072a(requestDate), requestDate);
        }
    }

    public C20746g(InterfaceC26834e cachedApiSource, HormonalInsightsApi api, InterfaceC41070a dateAndTimeProvider, C37378a scopeCoordinator, FeatureFlagChecker featureFlagChecker, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(logger, "logger");
        this.cachedApiSource = cachedApiSource;
        this.api = api;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.scopeCoordinator = scopeCoordinator;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final String m57094g() {
        String string = this.dateAndTimeProvider.mo133365d().toString("yyyy-MM-dd");
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final C20745f m57095h(InterfaceC29354a.c<LogSymptomsResponse> cacheResult) {
        return AbstractC29355b.m89462a(cacheResult) ? new C20745f(InterfaceC20743d.f.f77845a, null, false, false, null, null, 62, null) : new C20745f(InterfaceC20743d.d.f77844a, null, false, false, null, null, 62, null);
    }

    /* JADX INFO: renamed from: i */
    private final InterfaceC13058l m57096i(String requestDate, boolean manualRefresh) {
        return new h(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetLogSymptomsRequest(requestDate), 1), AbstractC12350b.m34570S("LOG_SYMPTOMS_SCOPE"), null, 2, null), new g(null, this.cachedApiSource)), manualRefresh, this);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ InterfaceC13058l m57097j(C20746g c20746g, String str, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return c20746g.m57096i(str, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d3, code lost:
    
        if (r2.m119657b(r4, r9) == r3) goto L30;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m57098k(java.lang.String r24, java.lang.String r25, java.lang.String r26, com.whoop.hormonalinsights.logsymptoms.domain.models.LogSymptomsResponse r27, q83.InterfaceC30057d<? super io1.C20745f> r28) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io1.C20746g.m57098k(java.lang.String, java.lang.String, java.lang.String, com.whoop.hormonalinsights.logsymptoms.domain.models.LogSymptomsResponse, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m57099l(InterfaceC13058l interfaceC13058l) {
        return new k(AbstractC13091v.m36612v(new C13060l1(new C20741b(null, null, 3, null), interfaceC13058l, new l(null)), 1));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new b(new C13060l1(new C20740a(null, null, null, null, 15, null), AbstractC13091v.m36590P(m57099l(upstream), new a(null, this)), new e(null)));
    }
}
