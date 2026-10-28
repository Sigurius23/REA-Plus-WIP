package iv2;

import c93.InterfaceC4351m;
import com.whoop.weightlifting.data.WeightliftingApi;
import com.whoop.weightlifting.data.dto.WorkoutDetailsModel;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fu2.C14794i;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: iv2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Liv2/d;", "Lod1/g;", "Liv2/b;", "Liv2/c;", "Lfu2/i;", "strengthTrainerInteractor", "Lcom/whoop/weightlifting/data/WeightliftingApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lfu2/i;Lcom/whoop/weightlifting/data/WeightliftingApi;Ltr2/n;)V", "", "workoutTemplateId", "Lec3/l;", "g", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lfu2/i;", "b", "Lcom/whoop/weightlifting/data/WeightliftingApi;", "c", "Ltr2/n;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20955d implements InterfaceC27844g<AbstractC20953b, C20954c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C14794i strengthTrainerInteractor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final WeightliftingApi api;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: iv2.d$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.details.domain.WorkoutDetailsInteractor$fetchBffData$2", m100430f = "WorkoutDetailsInteractor.kt", m100431l = {31, 32, 38, 40, 41}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Liv2/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f79156E;

        /* JADX INFO: renamed from: w */
        Object f79157w;

        /* JADX INFO: renamed from: x */
        int f79158x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f79159y;

        /* JADX INFO: renamed from: iv2.d$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.details.domain.WorkoutDetailsInteractor$fetchBffData$2$response$1", m100430f = "WorkoutDetailsInteractor.kt", m100431l = {33}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41800a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f79161w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C20955d f79162x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f79163y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41800a(C20955d c20955d, String str, InterfaceC30057d<? super C41800a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f79162x = c20955d;
                this.f79163y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new C41800a(this.f79162x, this.f79163y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f79161w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                WeightliftingApi weightliftingApi = this.f79162x.api;
                String str = this.f79163y;
                this.f79161w = 1;
                Object workoutDetails = weightliftingApi.getWorkoutDetails(str, this);
                return workoutDetails == enumC31071a ? enumC31071a : workoutDetails;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super WorkoutDetailsModel> interfaceC30057d) {
                return ((C41800a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f79156E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C20955d.this.new a(this.f79156E, interfaceC30057d);
            aVar.f79159y = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x007b  */
        /* JADX WARN: Code duplicated, block: B:26:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:31:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:33:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:38:0x00e4  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
        
            if (r8.emit(r1, r15) == r9) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00c6, code lost:
        
            if (r8.emit(r0, r15) == r9) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00de, code lost:
        
            if (r8.emit(r0, r15) == r9) goto L35;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
                Method dump skipped, instruction units count: 234
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: iv2.C20955d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: iv2.d$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.details.domain.WorkoutDetailsInteractor$interact$$inlined$flatMapLatest$1", m100430f = "WorkoutDetailsInteractor.kt", m100431l = {191, 189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        Object f79164E;

        /* JADX INFO: renamed from: F */
        Object f79165F;

        /* JADX INFO: renamed from: G */
        Object f79166G;

        /* JADX INFO: renamed from: H */
        int f79167H;

        /* JADX INFO: renamed from: w */
        int f79168w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f79169x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f79170y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C20955d f79171z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, C20955d c20955d) {
            super(3, interfaceC30057d);
            this.f79171z = c20955d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC20953b abstractC20953b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f79171z);
            bVar.f79169x = interfaceC13062m;
            bVar.f79170y = abstractC20953b;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r1, (ec3.InterfaceC13058l) r8, r7) == r0) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r7.f79168w
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L31
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r7.f79169x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r8)
                goto L74
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                java.lang.Object r1 = r7.f79166G
                iv2.b r1 = (iv2.AbstractC20953b) r1
                java.lang.Object r1 = r7.f79165F
                q83.d r1 = (q83.InterfaceC30057d) r1
                java.lang.Object r1 = r7.f79164E
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r3 = r7.f79169x
                ec3.m r3 = (ec3.InterfaceC13062m) r3
                p505ts.AbstractC34132o.m107864I(r8)
                goto L5f
            L31:
                p505ts.AbstractC34132o.m107864I(r8)
                java.lang.Object r8 = r7.f79169x
                r1 = r8
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r8 = r7.f79170y
                iv2.b r8 = (iv2.AbstractC20953b) r8
                boolean r5 = r8 instanceof iv2.AbstractC20953b.a
                if (r5 == 0) goto L77
                iv2.d r5 = r7.f79171z
                iv2.b$a r8 = (iv2.AbstractC20953b.a) r8
                java.lang.String r8 = r8.getWorkoutTemplateId()
                r7.f79169x = r4
                r7.f79170y = r4
                r7.f79164E = r1
                r7.f79165F = r4
                r7.f79166G = r4
                r6 = 0
                r7.f79167H = r6
                r7.f79168w = r3
                java.lang.Object r8 = iv2.C20955d.m58216c(r5, r8, r7)
                if (r8 != r0) goto L5f
                goto L73
            L5f:
                ec3.l r8 = (ec3.InterfaceC13058l) r8
                r7.f79169x = r4
                r7.f79170y = r4
                r7.f79164E = r4
                r7.f79165F = r4
                r7.f79166G = r4
                r7.f79168w = r2
                java.lang.Object r8 = ec3.AbstractC13091v.m36613w(r1, r8, r7)
                if (r8 != r0) goto L74
            L73:
                return r0
            L74:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            L77:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: iv2.C20955d.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC20953b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    public C20955d(C14794i strengthTrainerInteractor, WeightliftingApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(strengthTrainerInteractor, "strengthTrainerInteractor");
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.strengthTrainerInteractor = strengthTrainerInteractor;
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final Object m58220g(String str, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        return new C13084s1(new a(str, null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new b(null, this));
    }
}
