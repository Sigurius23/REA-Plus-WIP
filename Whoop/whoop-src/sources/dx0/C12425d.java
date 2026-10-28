package dx0;

import ad3.AbstractC0757c;
import ad3.C0755b;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.connectivityCore.dataSyncService.models.ProcessNowSource;
import dt0.AbstractC12358a;
import dt0.InterfaceC12361d;
import dt0.InterfaceC12362e;
import java.time.Clock;
import java.util.LinkedHashMap;
import java.util.Map;
import js0.AbstractC21909c;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import l83.C23454a0;
import m83.AbstractC25247g0;
import p007a6.InterfaceC0422g;
import p138f6.C14129a;
import p138f6.C14132d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: dx0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Ldx0/d;", "Ldt0/e;", "Ltr2/n;", "logger", "Ldt0/d;", "dataSyncService", "Lbc3/c0;", "scope", "Ljs0/c;", "configurationRepository", "La6/g;", "Lf6/f;", "dataStore", "Ljava/time/Clock;", "clock", "<init>", "(Ltr2/n;Ldt0/d;Lbc3/c0;Ljs0/c;La6/g;Ljava/time/Clock;)V", "Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;", "source", "Ll83/a0;", "a", "(Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;)V", "Ltr2/n;", "b", "Ldt0/d;", "c", "Lbc3/c0;", "d", "Ljs0/c;", "e", "La6/g;", "f", "Ljava/time/Clock;", "data-sync-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12425d implements InterfaceC12362e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC12361d dataSyncService;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC0422g dataStore;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: dx0.d$a */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.ProcessNowApiImpl$triggerSync$1", m100430f = "ProcessNowApiImpl.kt", m100431l = {37, 52}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ ProcessNowSource f42317E;

        /* JADX INFO: renamed from: w */
        long f42318w;

        /* JADX INFO: renamed from: x */
        long f42319x;

        /* JADX INFO: renamed from: y */
        int f42320y;

        /* JADX INFO: renamed from: dx0.d$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.dataSyncService.ProcessNowApiImpl$triggerSync$1$1", m100430f = "ProcessNowApiImpl.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "preferences", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41504a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f42322w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f42323x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ long f42324y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ ProcessNowSource f42325z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41504a(long j7, ProcessNowSource processNowSource, InterfaceC30057d<? super C41504a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f42324y = j7;
                this.f42325z = processNowSource;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                C41504a c41504a = new C41504a(this.f42324y, this.f42325z, interfaceC30057d);
                c41504a.f42323x = obj;
                return c41504a;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C41504a) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                LinkedHashMap linkedHashMap;
                C14129a c14129a = (C14129a) this.f42323x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f42322w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                String str = (String) c14129a.mo40227b(AbstractC12358a.m34615b());
                if (str == null) {
                    str = "{}";
                }
                try {
                    C0755b c0755b = AbstractC0757c.f2762d;
                    c0755b.getClass();
                    StringSerializer stringSerializer = StringSerializer.INSTANCE;
                    linkedHashMap = AbstractC25247g0.m74003l0((Map) c0755b.m1831b(new LinkedHashMapSerializer(stringSerializer, stringSerializer), str));
                } catch (Exception unused) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(String.valueOf(this.f42324y), this.f42325z.name());
                C14132d c14132dM34615b = AbstractC12358a.m34615b();
                C0755b c0755b2 = AbstractC0757c.f2762d;
                c0755b2.getClass();
                StringSerializer stringSerializer2 = StringSerializer.INSTANCE;
                c14129a.m40230g(c14132dM34615b, c0755b2.m1833d(new LinkedHashMapSerializer(stringSerializer2, stringSerializer2), linkedHashMap));
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: dx0.d$a$b */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class b {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f42326a;

            static {
                int[] iArr = new int[ProcessNowSource.values().length];
                try {
                    iArr[ProcessNowSource.SLEEP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f42326a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ProcessNowSource processNowSource, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f42317E = processNowSource;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12425d.this.new a(this.f42317E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:47:0x0130, code lost:
        
            if (bc3.AbstractC3034m0.m8782b(r8, r12) == r0) goto L48;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 376
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: dx0.C12425d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C12425d(InterfaceC34116n logger, InterfaceC12361d dataSyncService, InterfaceC2994c0 scope, AbstractC21909c configurationRepository, InterfaceC0422g dataStore, Clock clock) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(dataSyncService, "dataSyncService");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(dataStore, "dataStore");
        AbstractC22676k.m65750j(clock, "clock");
        this.logger = logger;
        this.dataSyncService = dataSyncService;
        this.scope = scope;
        this.configurationRepository = configurationRepository;
        this.dataStore = dataStore;
        this.clock = clock;
    }

    @Override // dt0.InterfaceC12362e
    /* JADX INFO: renamed from: a */
    public void mo34626a(ProcessNowSource source) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC3006f0.m8732z(this.scope, null, null, new a(source, null), 3);
    }
}
