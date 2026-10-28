package he0;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.advancedlabs.domain.AdvancedLabsApi;
import com.whoop.advancedlabs.domain.models.SchedulingStepScreenModel;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: he0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\"\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lhe0/c;", "Lod1/g;", "Lhe0/a;", "Lhe0/b;", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Ltr2/n;)V", "", "stepType", "testType", "e", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "b", "Ltr2/n;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17211c implements InterfaceC27844g<AbstractC17209a, AbstractC17210b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AdvancedLabsApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: he0.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.schedulingstep.domain.SchedulingStepInteractor", m100430f = "SchedulingStepInteractor.kt", m100431l = {C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER}, m100432m = "fetchStepData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f66110E;

        /* JADX INFO: renamed from: w */
        Object f66111w;

        /* JADX INFO: renamed from: x */
        Object f66112x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f66113y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f66113y = obj;
            this.f66110E |= Integer.MIN_VALUE;
            return C17211c.this.m48611e(null, null, this);
        }
    }

    /* JADX INFO: renamed from: he0.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.schedulingstep.domain.SchedulingStepInteractor$fetchStepData$response$1", m100430f = "SchedulingStepInteractor.kt", m100431l = {C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/advancedlabs/domain/models/SchedulingStepScreenModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f66115w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f66117y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f66118z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f66117y = str;
            this.f66118z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C17211c.this.new b(this.f66117y, this.f66118z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f66115w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AdvancedLabsApi advancedLabsApi = C17211c.this.api;
            String str = this.f66117y;
            String str2 = this.f66118z;
            this.f66115w = 1;
            Object schedulingStep = advancedLabsApi.getSchedulingStep(str, str2, this);
            return schedulingStep == enumC31071a ? enumC31071a : schedulingStep;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super SchedulingStepScreenModel> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: he0.c$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f66119w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C17211c f66120x;

        /* JADX INFO: renamed from: he0.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f66121w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C17211c f66122x;

            /* JADX INFO: renamed from: he0.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.schedulingstep.domain.SchedulingStepInteractor$interact$$inlined$map$1$2", m100430f = "SchedulingStepInteractor.kt", m100431l = {52, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41694a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f66123E;

                /* JADX INFO: renamed from: F */
                Object f66124F;

                /* JADX INFO: renamed from: G */
                Object f66125G;

                /* JADX INFO: renamed from: H */
                Object f66126H;

                /* JADX INFO: renamed from: I */
                Object f66127I;

                /* JADX INFO: renamed from: J */
                Object f66128J;

                /* JADX INFO: renamed from: K */
                int f66129K;

                /* JADX INFO: renamed from: L */
                int f66130L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f66131w;

                /* JADX INFO: renamed from: x */
                int f66132x;

                /* JADX INFO: renamed from: y */
                Object f66133y;

                public C41694a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f66131w = obj;
                    this.f66132x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C17211c c17211c) {
                this.f66121w = interfaceC13062m;
                this.f66122x = c17211c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x009f, code lost:
            
                if (r2.emit(r10, r0) == r1) goto L24;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r9, q83.InterfaceC30057d r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof he0.C17211c.c.a.C41694a
                    if (r0 == 0) goto L13
                    r0 = r10
                    he0.c$c$a$a r0 = (he0.C17211c.c.a.C41694a) r0
                    int r1 = r0.f66132x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f66132x = r1
                    goto L18
                L13:
                    he0.c$c$a$a r0 = new he0.c$c$a$a
                    r0.<init>(r10)
                L18:
                    java.lang.Object r10 = r0.f66131w
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r0.f66132x
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L55
                    if (r2 == r4) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r9 = r0.f66125G
                    ec3.m r9 = (ec3.InterfaceC13062m) r9
                    java.lang.Object r9 = r0.f66123E
                    he0.c$c$a$a r9 = (he0.C17211c.c.a.C41694a) r9
                    p505ts.AbstractC34132o.m107864I(r10)
                    goto La2
                L33:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L3b:
                    int r9 = r0.f66129K
                    java.lang.Object r2 = r0.f66128J
                    he0.a r2 = (he0.AbstractC17209a) r2
                    java.lang.Object r2 = r0.f66127I
                    q83.d r2 = (q83.InterfaceC30057d) r2
                    java.lang.Object r2 = r0.f66126H
                    ec3.m r2 = (ec3.InterfaceC13062m) r2
                    java.lang.Object r4 = r0.f66125G
                    ec3.m r4 = (ec3.InterfaceC13062m) r4
                    java.lang.Object r4 = r0.f66123E
                    he0.c$c$a$a r4 = (he0.C17211c.c.a.C41694a) r4
                    p505ts.AbstractC34132o.m107864I(r10)
                    goto L89
                L55:
                    p505ts.AbstractC34132o.m107864I(r10)
                    ec3.m r2 = r8.f66121w
                    he0.a r9 = (he0.AbstractC17209a) r9
                    boolean r10 = r9 instanceof he0.AbstractC17209a.a
                    if (r10 == 0) goto La5
                    he0.c r10 = r8.f66122x
                    he0.a$a r9 = (he0.AbstractC17209a.a) r9
                    java.lang.String r6 = r9.getStepType()
                    java.lang.String r9 = r9.getTestType()
                    r0.f66133y = r5
                    r0.f66123E = r5
                    r0.f66124F = r5
                    r0.f66125G = r5
                    r0.f66126H = r2
                    r0.f66127I = r5
                    r0.f66128J = r5
                    r7 = 0
                    r0.f66129K = r7
                    r0.f66130L = r7
                    r0.f66132x = r4
                    java.lang.Object r10 = he0.C17211c.m48609c(r10, r6, r9, r0)
                    if (r10 != r1) goto L88
                    goto La1
                L88:
                    r9 = r7
                L89:
                    r0.f66133y = r5
                    r0.f66123E = r5
                    r0.f66124F = r5
                    r0.f66125G = r5
                    r0.f66126H = r5
                    r0.f66127I = r5
                    r0.f66128J = r5
                    r0.f66129K = r9
                    r0.f66132x = r3
                    java.lang.Object r9 = r2.emit(r10, r0)
                    if (r9 != r1) goto La2
                La1:
                    return r1
                La2:
                    l83.a0 r9 = l83.C23454a0.f92919a
                    return r9
                La5:
                    kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
                    r9.<init>()
                    throw r9
                */
                throw new UnsupportedOperationException("Method not decompiled: he0.C17211c.c.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public c(InterfaceC13058l interfaceC13058l, C17211c c17211c) {
            this.f66119w = interfaceC13058l;
            this.f66120x = c17211c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f66119w.collect(new a(interfaceC13062m, this.f66120x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C17211c(AdvancedLabsApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: e */
    public final Object m48611e(String str, String str2, InterfaceC30057d<? super AbstractC17210b> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f66110E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f66110E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f66113y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f66110E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(str, str2, null);
            aVar2.f66111w = str;
            aVar2.f66112x = null;
            aVar2.f66110E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, bVar, aVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) aVar2.f66111w;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new AbstractC17210b.b((SchedulingStepScreenModel) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        }
        if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        this.logger.mo85228t(AbstractC11266d.m30461o("Failed to fetch scheduling step data for stepType=", str), new AbstractC30556a.a[0]);
        return AbstractC17210b.a.f66106a;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new c(upstream, this);
    }

    public /* synthetic */ C17211c(AdvancedLabsApi advancedLabsApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(advancedLabsApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("SchedulingStepInteractor") : interfaceC34116n);
    }
}
