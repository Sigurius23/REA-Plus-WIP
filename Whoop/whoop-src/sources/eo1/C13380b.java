package eo1;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.hormonalinsights.fertility.api.DisableFertilitySurveyRequest;
import com.whoop.hormonalinsights.fertility.api.FertilitySettingsApi;
import com.whoop.hormonalinsights.fertility.api.FertilitySettingsRequest;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qp1.AbstractC30532a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: eo1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Leo1/b;", "Lod1/g;", "Leo1/a;", "Lqp1/a;", "Lcom/whoop/hormonalinsights/fertility/api/FertilitySettingsApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/hormonalinsights/fertility/api/FertilitySettingsApi;Ltr2/n;)V", "", "enabled", "Lec3/l;", "g", "(Z)Lec3/l;", "", "reason", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;)Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/hormonalinsights/fertility/api/FertilitySettingsApi;", "b", "Ltr2/n;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13380b implements InterfaceC27844g<AbstractC13379a, AbstractC30532a> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FertilitySettingsApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: eo1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.fertility.domain.FertilitySettingsInteractor$interact$$inlined$flatMapLatest$1", m100430f = "FertilitySettingsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f46806w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f46807x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f46808y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C13380b f46809z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C13380b c13380b) {
            super(3, interfaceC30057d);
            this.f46809z = c13380b;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC13379a abstractC13379a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f46809z);
            aVar.f46807x = interfaceC13062m;
            aVar.f46808y = abstractC13379a;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM37741h;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46806w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f46807x;
                AbstractC13379a abstractC13379a = (AbstractC13379a) this.f46808y;
                if (abstractC13379a instanceof AbstractC13379a.a) {
                    interfaceC13058lM37741h = this.f46809z.m37740g(((AbstractC13379a.a) abstractC13379a).getEnabled());
                } else {
                    if (!(abstractC13379a instanceof AbstractC13379a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC13058lM37741h = this.f46809z.m37741h(((AbstractC13379a.b) abstractC13379a).getReason());
                }
                this.f46807x = null;
                this.f46808y = null;
                this.f46806w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM37741h, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC13379a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: eo1.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.fertility.domain.FertilitySettingsInteractor$setFertilityInsightsFlow$1", m100430f = "FertilitySettingsInteractor.kt", m100431l = {33, 34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lqp1/a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46810w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f46811x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f46813z;

        /* JADX INFO: renamed from: eo1.b$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.fertility.domain.FertilitySettingsInteractor$setFertilityInsightsFlow$1$1", m100430f = "FertilitySettingsInteractor.kt", m100431l = {35, 43}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ boolean f46814E;

            /* JADX INFO: renamed from: w */
            Object f46815w;

            /* JADX INFO: renamed from: x */
            int f46816x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C13380b f46817y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ InterfaceC13062m f46818z;

            /* JADX INFO: renamed from: eo1.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.fertility.domain.FertilitySettingsInteractor$setFertilityInsightsFlow$1$1$response$1", m100430f = "FertilitySettingsInteractor.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class C41557a extends AbstractC32275i implements Function1 {

                /* JADX INFO: renamed from: w */
                int f46819w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ C13380b f46820x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ boolean f46821y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C41557a(C13380b c13380b, boolean z4, InterfaceC30057d<? super C41557a> interfaceC30057d) {
                    super(1, interfaceC30057d);
                    this.f46820x = c13380b;
                    this.f46821y = z4;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                    return new C41557a(this.f46820x, this.f46821y, interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f46819w;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                        return obj;
                    }
                    AbstractC34132o.m107864I(obj);
                    FertilitySettingsApi fertilitySettingsApi = this.f46820x.api;
                    boolean z4 = this.f46821y;
                    FertilitySettingsRequest fertilitySettingsRequest = new FertilitySettingsRequest(z4, z4 ? null : "USER_DISABLED");
                    this.f46819w = 1;
                    Object objUpdateFertilitySettings = fertilitySettingsApi.updateFertilitySettings(fertilitySettingsRequest, this);
                    return objUpdateFertilitySettings == enumC31071a ? enumC31071a : objUpdateFertilitySettings;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                    return ((C41557a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C13380b c13380b, InterfaceC13062m interfaceC13062m, boolean z4, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f46817y = c13380b;
                this.f46818z = interfaceC13062m;
                this.f46814E = z4;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f46817y, this.f46818z, this.f46814E, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
            
                if (r1.emit(r13, r12) == r0) goto L21;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r12.f46816x
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L23
                    if (r1 == r4) goto L1e
                    if (r1 != r3) goto L16
                    java.lang.Object r0 = r12.f46815w
                    u02.a r0 = (u02.InterfaceC34385a) r0
                    p505ts.AbstractC34132o.m107864I(r13)
                    r9 = r12
                    goto L62
                L16:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L1e:
                    p505ts.AbstractC34132o.m107864I(r13)
                    r9 = r12
                    goto L46
                L23:
                    p505ts.AbstractC34132o.m107864I(r13)
                    r13 = r4
                    u02.a$a r4 = u02.InterfaceC34385a.INSTANCE
                    eo1.b r1 = r12.f46817y
                    tr2.n r5 = eo1.C13380b.m37737d(r1)
                    eo1.b$b$a$a r8 = new eo1.b$b$a$a
                    eo1.b r1 = r12.f46817y
                    boolean r6 = r12.f46814E
                    r8.<init>(r1, r6, r2)
                    r12.f46816x = r13
                    r6 = 0
                    r7 = 0
                    r10 = 6
                    r11 = 0
                    r9 = r12
                    java.lang.Object r13 = u02.InterfaceC34385a.Companion.m108729b(r4, r5, r6, r7, r8, r9, r10, r11)
                    if (r13 != r0) goto L46
                    goto L61
                L46:
                    u02.a r13 = (u02.InterfaceC34385a) r13
                    ec3.m r1 = r9.f46818z
                    boolean r4 = r13 instanceof u02.InterfaceC34385a.c
                    if (r4 == 0) goto L51
                    qp1.a$c r13 = qp1.AbstractC30532a.c.f125542a
                    goto L57
                L51:
                    boolean r13 = r13 instanceof u02.InterfaceC34385a.b
                    if (r13 == 0) goto L65
                    qp1.a$b r13 = qp1.AbstractC30532a.b.f125541a
                L57:
                    r9.f46815w = r2
                    r9.f46816x = r3
                    java.lang.Object r13 = r1.emit(r13, r12)
                    if (r13 != r0) goto L62
                L61:
                    return r0
                L62:
                    l83.a0 r13 = l83.C23454a0.f92919a
                    return r13
                L65:
                    kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
                    r13.<init>()
                    throw r13
                */
                throw new UnsupportedOperationException("Method not decompiled: eo1.C13380b.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z4, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f46813z = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C13380b.this.new b(this.f46813z, interfaceC30057d);
            bVar.f46811x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (or2.AbstractC28190p0.m85321a(1000, r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f46811x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f46810w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r7)
                goto L47
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L30
            L20:
                p505ts.AbstractC34132o.m107864I(r7)
                qp1.a$d r7 = qp1.AbstractC30532a.d.f125543a
                r6.f46811x = r0
                r6.f46810w = r4
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L30
                goto L46
            L30:
                eo1.b$b$a r7 = new eo1.b$b$a
                eo1.b r2 = eo1.C13380b.this
                boolean r4 = r6.f46813z
                r5 = 0
                r7.<init>(r2, r0, r4, r5)
                r6.f46811x = r5
                r6.f46810w = r3
                r2 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r7 = or2.AbstractC28190p0.m85321a(r2, r7, r6)
                if (r7 != r1) goto L47
            L46:
                return r1
            L47:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: eo1.C13380b.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: eo1.b$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.fertility.domain.FertilitySettingsInteractor$submitDisableSurveyFlow$1", m100430f = "FertilitySettingsInteractor.kt", m100431l = {53, 54}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lqp1/a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46822w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f46823x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f46824y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C13380b f46825z;

        /* JADX INFO: renamed from: eo1.b$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.fertility.domain.FertilitySettingsInteractor$submitDisableSurveyFlow$1$response$1", m100430f = "FertilitySettingsInteractor.kt", m100431l = {55}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f46826w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13380b f46827x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f46828y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C13380b c13380b, String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f46827x = c13380b;
                this.f46828y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f46827x, this.f46828y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f46826w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                FertilitySettingsApi fertilitySettingsApi = this.f46827x.api;
                DisableFertilitySurveyRequest disableFertilitySurveyRequest = new DisableFertilitySurveyRequest(this.f46828y);
                this.f46826w = 1;
                Object objSubmitDisableFertilitySurvey = fertilitySettingsApi.submitDisableFertilitySurvey(disableFertilitySurveyRequest, this);
                return objSubmitDisableFertilitySurvey == enumC31071a ? enumC31071a : objSubmitDisableFertilitySurvey;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, C13380b c13380b, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f46824y = str;
            this.f46825z = c13380b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f46824y, this.f46825z, interfaceC30057d);
            cVar.f46823x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
        
            if (r15 == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = r14.f46823x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r14.f46822w
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                p505ts.AbstractC34132o.m107864I(r15)
                r11 = r14
                goto L5f
            L16:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L1e:
                p505ts.AbstractC34132o.m107864I(r15)
                goto L3e
            L22:
                p505ts.AbstractC34132o.m107864I(r15)
                qp1.a$e r15 = new qp1.a$e
                java.lang.String r2 = r14.f46824y
                java.lang.String r6 = "PREGNANT"
                boolean r2 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r2, r6)
                r15.<init>(r2)
                r14.f46823x = r5
                r14.f46822w = r4
                java.lang.Object r15 = r0.emit(r15, r14)
                if (r15 != r1) goto L3e
                r11 = r14
                goto L5e
            L3e:
                u02.a$a r6 = u02.InterfaceC34385a.INSTANCE
                eo1.b r15 = r14.f46825z
                tr2.n r7 = eo1.C13380b.m37737d(r15)
                eo1.b$c$a r10 = new eo1.b$c$a
                eo1.b r15 = r14.f46825z
                java.lang.String r0 = r14.f46824y
                r10.<init>(r15, r0, r5)
                r14.f46823x = r5
                r14.f46822w = r3
                r8 = 0
                r9 = 0
                r12 = 6
                r13 = 0
                r11 = r14
                java.lang.Object r15 = u02.InterfaceC34385a.Companion.m108729b(r6, r7, r8, r9, r10, r11, r12, r13)
                if (r15 != r1) goto L5f
            L5e:
                return r1
            L5f:
                u02.a r15 = (u02.InterfaceC34385a) r15
                boolean r15 = r15 instanceof u02.InterfaceC34385a.b
                if (r15 == 0) goto L73
                eo1.b r15 = r11.f46825z
                tr2.n r15 = eo1.C13380b.m37737d(r15)
                r0 = 0
                qr2.a$a[] r0 = new qr2.AbstractC30556a.a[r0]
                java.lang.String r1 = "Failed to submit disable fertility survey"
                r15.mo85222m(r1, r0)
            L73:
                l83.a0 r15 = l83.C23454a0.f92919a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: eo1.C13380b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C13380b(FertilitySettingsApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final InterfaceC13058l m37740g(boolean enabled) {
        return new C13084s1(new b(enabled, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final InterfaceC13058l m37741h(String reason) {
        return new C13084s1(new c(reason, this, null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new a(null, this));
    }

    public /* synthetic */ C13380b(FertilitySettingsApi fertilitySettingsApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(fertilitySettingsApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("FertilitySettingsInteractor") : interfaceC34116n);
    }
}
