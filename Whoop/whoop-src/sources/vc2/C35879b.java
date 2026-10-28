package vc2;

import c93.InterfaceC4351m;
import com.whoop.settings.accountheader.api.NativeAccountHeaderApi;
import com.whoop.settings.accountheader.model.SwitchBillingPlanModalModel;
import com.whoop.settings.accountheader.model.SwitchBillingPlanRequest;
import com.whoop.settings.accountheader.model.SwitchBillingPlanResponseModel;
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
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: vc2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lvc2/b;", "Lod1/g;", "Lvc2/a;", "Lvc2/c;", "Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;Ltr2/n;)V", "", "plan", "Lec3/l;", "g", "(Ljava/lang/String;)Lec3/l;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;", "b", "Ltr2/n;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35879b implements InterfaceC27844g<AbstractC35878a, AbstractC35880c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final NativeAccountHeaderApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: vc2.b$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.switchPlan.domain.SwitchBillingPlanModalInteractor$fetchSwitchBillingPlanModalInfo$1", m100430f = "SwitchBillingPlanModalInteractor.kt", m100431l = {27, 28, 31}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lvc2/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f152773E;

        /* JADX INFO: renamed from: w */
        Object f152774w;

        /* JADX INFO: renamed from: x */
        int f152775x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f152776y;

        /* JADX INFO: renamed from: vc2.b$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.settings.switchPlan.domain.SwitchBillingPlanModalInteractor$fetchSwitchBillingPlanModalInfo$1$response$1", m100430f = "SwitchBillingPlanModalInteractor.kt", m100431l = {29}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/settings/accountheader/model/SwitchBillingPlanModalModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42530a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f152778w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35879b f152779x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f152780y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42530a(C35879b c35879b, String str, InterfaceC30057d<? super C42530a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f152779x = c35879b;
                this.f152780y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new C42530a(this.f152779x, this.f152780y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f152778w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                NativeAccountHeaderApi nativeAccountHeaderApi = this.f152779x.api;
                String str = this.f152780y;
                this.f152778w = 1;
                Object objFetchSwitchBillingPlanModal = nativeAccountHeaderApi.fetchSwitchBillingPlanModal(str, this);
                return objFetchSwitchBillingPlanModal == enumC31071a ? enumC31071a : objFetchSwitchBillingPlanModal;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super SwitchBillingPlanModalModel> interfaceC30057d) {
                return ((C42530a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f152773E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C35879b.this.new a(this.f152773E, interfaceC30057d);
            aVar.f152776y = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0067  */
        /* JADX WARN: Code duplicated, block: B:21:0x0071  */
        /* JADX WARN: Code duplicated, block: B:23:0x0075  */
        /* JADX WARN: Code duplicated, block: B:29:0x0095  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
        
            if (r8.emit(r0, r12) == r9) goto L26;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = r12.f152776y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r12.f152775x
                r10 = 3
                r1 = 2
                r2 = 1
                r11 = 0
                if (r0 == 0) goto L2f
                if (r0 == r2) goto L2b
                if (r0 == r1) goto L26
                if (r0 != r10) goto L1e
                java.lang.Object r0 = r12.f152774w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r13)
                goto L92
            L1e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L26:
                p505ts.AbstractC34132o.m107864I(r13)
                r0 = r13
                goto L61
            L2b:
                p505ts.AbstractC34132o.m107864I(r13)
                goto L3f
            L2f:
                p505ts.AbstractC34132o.m107864I(r13)
                vc2.c$c r0 = vc2.AbstractC35880c.c.f152797a
                r12.f152776y = r8
                r12.f152775x = r2
                java.lang.Object r0 = r8.emit(r0, r12)
                if (r0 != r9) goto L3f
                goto L91
            L3f:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                vc2.b r2 = vc2.C35879b.this
                tr2.n r2 = vc2.C35879b.m113926e(r2)
                vc2.b$a$a r4 = new vc2.b$a$a
                vc2.b r3 = vc2.C35879b.this
                java.lang.String r6 = r12.f152773E
                r4.<init>(r3, r6, r11)
                r12.f152776y = r8
                r12.f152775x = r1
                r1 = r2
                r2 = 0
                r3 = 0
                r6 = 6
                r7 = 0
                r5 = r12
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L61
                goto L91
            L61:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.b
                if (r1 == 0) goto L71
                vc2.c$a r0 = new vc2.c$a
                xc2.a r1 = xc2.EnumC38190a.FETCH_BILLING_MODAL_ERROR
                java.lang.String r2 = r12.f152773E
                r0.<init>(r1, r2)
                goto L85
            L71:
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L95
                vc2.c$b r1 = new vc2.c$b
                u02.a$c r0 = (u02.InterfaceC34385a.c) r0
                java.lang.Object r0 = r0.m108735a()
                com.whoop.settings.accountheader.model.SwitchBillingPlanModalModel r0 = (com.whoop.settings.accountheader.model.SwitchBillingPlanModalModel) r0
                java.lang.String r2 = r12.f152773E
                r1.<init>(r0, r2)
                r0 = r1
            L85:
                r12.f152776y = r11
                r12.f152774w = r11
                r12.f152775x = r10
                java.lang.Object r0 = r8.emit(r0, r12)
                if (r0 != r9) goto L92
            L91:
                return r9
            L92:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            L95:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: vc2.C35879b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: vc2.b$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.switchPlan.domain.SwitchBillingPlanModalInteractor$interact$$inlined$flatMapLatest$1", m100430f = "SwitchBillingPlanModalInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f152781w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f152782x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f152783y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C35879b f152784z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, C35879b c35879b) {
            super(3, interfaceC30057d);
            this.f152784z = c35879b;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC35878a abstractC35878a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f152784z);
            bVar.f152782x = interfaceC13062m;
            bVar.f152783y = abstractC35878a;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM113929h;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f152781w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f152782x;
                AbstractC35878a abstractC35878a = (AbstractC35878a) this.f152783y;
                if (abstractC35878a instanceof AbstractC35878a.a) {
                    interfaceC13058lM113929h = this.f152784z.m113928g(((AbstractC35878a.a) abstractC35878a).getPlan());
                } else {
                    if (!(abstractC35878a instanceof AbstractC35878a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC13058lM113929h = this.f152784z.m113929h(((AbstractC35878a.b) abstractC35878a).getPlan());
                }
                this.f152782x = null;
                this.f152783y = null;
                this.f152781w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM113929h, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC35878a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: vc2.b$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.switchPlan.domain.SwitchBillingPlanModalInteractor$switchBillingPlan$1", m100430f = "SwitchBillingPlanModalInteractor.kt", m100431l = {40, 41, 44}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lvc2/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f152785E;

        /* JADX INFO: renamed from: w */
        Object f152786w;

        /* JADX INFO: renamed from: x */
        int f152787x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f152788y;

        /* JADX INFO: renamed from: vc2.b$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.settings.switchPlan.domain.SwitchBillingPlanModalInteractor$switchBillingPlan$1$response$1", m100430f = "SwitchBillingPlanModalInteractor.kt", m100431l = {42}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/settings/accountheader/model/SwitchBillingPlanResponseModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f152790w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35879b f152791x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f152792y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C35879b c35879b, String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f152791x = c35879b;
                this.f152792y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f152791x, this.f152792y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f152790w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                NativeAccountHeaderApi nativeAccountHeaderApi = this.f152791x.api;
                SwitchBillingPlanRequest switchBillingPlanRequest = new SwitchBillingPlanRequest(this.f152792y, "app");
                this.f152790w = 1;
                Object objSwitchBillingPlan = nativeAccountHeaderApi.switchBillingPlan(switchBillingPlanRequest, this);
                return objSwitchBillingPlan == enumC31071a ? enumC31071a : objSwitchBillingPlan;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super SwitchBillingPlanResponseModel> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f152785E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C35879b.this.new c(this.f152785E, interfaceC30057d);
            cVar.f152788y = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0067  */
        /* JADX WARN: Code duplicated, block: B:21:0x0071  */
        /* JADX WARN: Code duplicated, block: B:23:0x0075  */
        /* JADX WARN: Code duplicated, block: B:29:0x0093  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x008d, code lost:
        
            if (r8.emit(r0, r12) == r9) goto L26;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = r12.f152788y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r12.f152787x
                r10 = 3
                r1 = 2
                r2 = 1
                r11 = 0
                if (r0 == 0) goto L2f
                if (r0 == r2) goto L2b
                if (r0 == r1) goto L26
                if (r0 != r10) goto L1e
                java.lang.Object r0 = r12.f152786w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r13)
                goto L90
            L1e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L26:
                p505ts.AbstractC34132o.m107864I(r13)
                r0 = r13
                goto L61
            L2b:
                p505ts.AbstractC34132o.m107864I(r13)
                goto L3f
            L2f:
                p505ts.AbstractC34132o.m107864I(r13)
                vc2.c$c r0 = vc2.AbstractC35880c.c.f152797a
                r12.f152788y = r8
                r12.f152787x = r2
                java.lang.Object r0 = r8.emit(r0, r12)
                if (r0 != r9) goto L3f
                goto L8f
            L3f:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                vc2.b r2 = vc2.C35879b.this
                tr2.n r2 = vc2.C35879b.m113926e(r2)
                vc2.b$c$a r4 = new vc2.b$c$a
                vc2.b r3 = vc2.C35879b.this
                java.lang.String r6 = r12.f152785E
                r4.<init>(r3, r6, r11)
                r12.f152788y = r8
                r12.f152787x = r1
                r1 = r2
                r2 = 0
                r3 = 0
                r6 = 6
                r7 = 0
                r5 = r12
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L61
                goto L8f
            L61:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.b
                if (r1 == 0) goto L71
                vc2.c$a r0 = new vc2.c$a
                xc2.a r1 = xc2.EnumC38190a.SWITCH_BILLING_ERROR
                java.lang.String r2 = r12.f152785E
                r0.<init>(r1, r2)
                goto L83
            L71:
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L93
                vc2.c$d r1 = new vc2.c$d
                u02.a$c r0 = (u02.InterfaceC34385a.c) r0
                java.lang.Object r0 = r0.m108735a()
                com.whoop.settings.accountheader.model.SwitchBillingPlanResponseModel r0 = (com.whoop.settings.accountheader.model.SwitchBillingPlanResponseModel) r0
                r1.<init>(r0)
                r0 = r1
            L83:
                r12.f152788y = r11
                r12.f152786w = r11
                r12.f152787x = r10
                java.lang.Object r0 = r8.emit(r0, r12)
                if (r0 != r9) goto L90
            L8f:
                return r9
            L90:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            L93:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: vc2.C35879b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C35879b(NativeAccountHeaderApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final InterfaceC13058l m113928g(String plan) {
        return new C13084s1(new a(plan, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final InterfaceC13058l m113929h(String plan) {
        return new C13084s1(new c(plan, null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new b(null, this));
    }

    public /* synthetic */ C35879b(NativeAccountHeaderApi nativeAccountHeaderApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeAccountHeaderApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("SwitchBillingPlanModalInteractor") : interfaceC34116n);
    }
}
