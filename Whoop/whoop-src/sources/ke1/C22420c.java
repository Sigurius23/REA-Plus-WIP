package ke1;

import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.data.onboarding.FeatureEducationType;
import com.whoop.education.domain.EducationApi;
import com.whoop.educationModels.CompleteFeatureEducationBody;
import com.whoop.educationModels.FeatureEducationDto;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import u92.C34660d;
import y92.C39352a;

/* JADX INFO: renamed from: ke1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0015\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Lke1/c;", "", "Lcom/whoop/education/domain/EducationApi;", "api", "Ltr2/n;", "logger", "Ly92/a;", "authManager", "Lu92/d;", "prefsStore", "<init>", "(Lcom/whoop/education/domain/EducationApi;Ltr2/n;Ly92/a;Lu92/d;)V", "", "featureEducationPath", "Lke1/b;", "e", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/onboarding/FeatureEducationType;", "", "storyId", "Ll83/a0;", "g", "(Lcom/whoop/data/onboarding/FeatureEducationType;ILq83/d;)Ljava/lang/Object;", "Lec3/l;", "Lke1/a;", "upstream", "f", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/education/domain/EducationApi;", "b", "Ltr2/n;", "c", "Ly92/a;", "d", "Lu92/d;", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22420c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EducationApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C39352a authManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C34660d prefsStore;

    /* JADX INFO: renamed from: ke1.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.education.domain.EducationInteractor", m100430f = "EducationInteractor.kt", m100431l = {32, 42}, m100432m = "fetchData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f87722F;

        /* JADX INFO: renamed from: w */
        Object f87723w;

        /* JADX INFO: renamed from: x */
        Object f87724x;

        /* JADX INFO: renamed from: y */
        int f87725y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f87726z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f87726z = obj;
            this.f87722F |= Integer.MIN_VALUE;
            return C22420c.this.m64560e(null, this);
        }
    }

    /* JADX INFO: renamed from: ke1.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.education.domain.EducationInteractor$fetchData$2", m100430f = "EducationInteractor.kt", m100431l = {33, 34, 37}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/educationModels/FeatureEducationDto;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f87727w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f87729y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f87729y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C22420c.this.new b(this.f87729y, interfaceC30057d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        
            if (r6 == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
        
            if (r6 == r0) goto L23;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r5.f87727w
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                p505ts.AbstractC34132o.m107864I(r6)
                goto L5c
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L48
            L1f:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L35
            L23:
                p505ts.AbstractC34132o.m107864I(r6)
                ke1.c r6 = ke1.C22420c.this
                y92.a r6 = ke1.C22420c.m64558c(r6)
                r5.f87727w = r4
                java.lang.Object r6 = r6.m125478a(r5)
                if (r6 != r0) goto L35
                goto L5b
            L35:
                if (r6 == 0) goto L4b
                ke1.c r6 = ke1.C22420c.this
                com.whoop.education.domain.EducationApi r6 = ke1.C22420c.m64557b(r6)
                java.lang.String r1 = r5.f87729y
                r5.f87727w = r3
                java.lang.Object r6 = r6.getEducation(r1, r5)
                if (r6 != r0) goto L48
                goto L5b
            L48:
                com.whoop.educationModels.FeatureEducationDto r6 = (com.whoop.educationModels.FeatureEducationDto) r6
                return r6
            L4b:
                ke1.c r6 = ke1.C22420c.this
                com.whoop.education.domain.EducationApi r6 = ke1.C22420c.m64557b(r6)
                java.lang.String r1 = r5.f87729y
                r5.f87727w = r2
                java.lang.Object r6 = r6.getEducationUnauthed(r1, r5)
                if (r6 != r0) goto L5c
            L5b:
                return r0
            L5c:
                com.whoop.educationModels.FeatureEducationDto r6 = (com.whoop.educationModels.FeatureEducationDto) r6
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ke1.C22420c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super FeatureEducationDto> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ke1.c$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.education.domain.EducationInteractor$interact$1", m100430f = "EducationInteractor.kt", m100431l = {25}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lke1/b;", "<unused var>", "Lke1/a;", "domainAction", "<anonymous>", "(Lke1/b;Lke1/a;)Lke1/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f87730w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f87731x;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC22419b abstractC22419b, AbstractC22418a abstractC22418a, InterfaceC30057d<? super AbstractC22419b> interfaceC30057d) {
            c cVar = C22420c.this.new c(interfaceC30057d);
            cVar.f87731x = abstractC22418a;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC22418a abstractC22418a = (AbstractC22418a) this.f87731x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f87730w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!(abstractC22418a instanceof AbstractC22418a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                C22420c c22420c = C22420c.this;
                String featureEducationPath = ((AbstractC22418a.a) abstractC22418a).getFeatureEducationPath();
                this.f87731x = null;
                this.f87730w = 1;
                obj = c22420c.m64560e(featureEducationPath, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return (AbstractC22419b) obj;
        }
    }

    /* JADX INFO: renamed from: ke1.c$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.education.domain.EducationInteractor$markFeatureEducationAsComplete$2", m100430f = "EducationInteractor.kt", m100431l = {54}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f87733w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f87735y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i13, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f87735y = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C22420c.this.new d(this.f87735y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f87733w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C22420c.this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_CHARGE_COMPLETED, true);
            EducationApi educationApi = C22420c.this.api;
            CompleteFeatureEducationBody completeFeatureEducationBody = new CompleteFeatureEducationBody(this.f87735y, true);
            this.f87733w = 1;
            Object objCompleteFeatureEducation = educationApi.completeFeatureEducation(completeFeatureEducationBody, this);
            return objCompleteFeatureEducation == enumC31071a ? enumC31071a : objCompleteFeatureEducation;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: ke1.c$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.education.domain.EducationInteractor$markFeatureEducationAsComplete$3", m100430f = "EducationInteractor.kt", m100431l = {57}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f87736w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f87738y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i13, InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f87738y = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C22420c.this.new e(this.f87738y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f87736w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            EducationApi educationApi = C22420c.this.api;
            CompleteFeatureEducationBody completeFeatureEducationBody = new CompleteFeatureEducationBody(this.f87738y, true);
            this.f87736w = 1;
            Object objCompleteFeatureEducation = educationApi.completeFeatureEducation(completeFeatureEducationBody, this);
            return objCompleteFeatureEducation == enumC31071a ? enumC31071a : objCompleteFeatureEducation;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C22420c(EducationApi api, InterfaceC34116n logger, C39352a authManager, C34660d prefsStore) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(authManager, "authManager");
        AbstractC22676k.m65750j(prefsStore, "prefsStore");
        this.api = api;
        this.logger = logger;
        this.authManager = authManager;
        this.prefsStore = prefsStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
    
        if (m64561g(r1, r13, r6) == r0) goto L24;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m64560e(java.lang.String r12, q83.InterfaceC30057d<? super ke1.AbstractC22419b> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof ke1.C22420c.a
            if (r0 == 0) goto L14
            r0 = r13
            ke1.c$a r0 = (ke1.C22420c.a) r0
            int r1 = r0.f87722F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f87722F = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ke1.c$a r0 = new ke1.c$a
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.f87726z
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f87722F
            r9 = 2
            r2 = 1
            r10 = 0
            if (r1 == 0) goto L45
            if (r1 == r2) goto L3d
            if (r1 != r9) goto L35
            java.lang.Object r12 = r6.f87724x
            u02.a r12 = (u02.InterfaceC34385a) r12
            java.lang.Object r0 = r6.f87723w
            java.lang.String r0 = (java.lang.String) r0
            p505ts.AbstractC34132o.m107864I(r13)
            goto L8f
        L35:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3d:
            java.lang.Object r12 = r6.f87723w
            java.lang.String r12 = (java.lang.String) r12
            p505ts.AbstractC34132o.m107864I(r13)
            goto L61
        L45:
            p505ts.AbstractC34132o.m107864I(r13)
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            r13 = r2
            tr2.n r2 = r11.logger
            ke1.c$b r5 = new ke1.c$b
            r5.<init>(r12, r10)
            r6.f87723w = r10
            r6.f87722F = r13
            r3 = 0
            r4 = 0
            r7 = 6
            r8 = 0
            java.lang.Object r13 = u02.InterfaceC34385a.Companion.m108729b(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r13 != r0) goto L61
            goto L8e
        L61:
            r12 = r13
            u02.a r12 = (u02.InterfaceC34385a) r12
            boolean r13 = r12 instanceof u02.InterfaceC34385a.c
            if (r13 == 0) goto L9d
            r13 = r12
            u02.a$c r13 = (u02.InterfaceC34385a.c) r13
            java.lang.Object r1 = r13.m108735a()
            com.whoop.educationModels.FeatureEducationDto r1 = (com.whoop.educationModels.FeatureEducationDto) r1
            com.whoop.data.onboarding.FeatureEducationType r1 = r1.getType()
            java.lang.Object r13 = r13.m108735a()
            com.whoop.educationModels.FeatureEducationDto r13 = (com.whoop.educationModels.FeatureEducationDto) r13
            int r13 = r13.getStoryId()
            r6.f87723w = r10
            r6.f87724x = r12
            r2 = 0
            r6.f87725y = r2
            r6.f87722F = r9
            java.lang.Object r13 = r11.m64561g(r1, r13, r6)
            if (r13 != r0) goto L8f
        L8e:
            return r0
        L8f:
            ke1.b$c r13 = new ke1.b$c
            u02.a$c r12 = (u02.InterfaceC34385a.c) r12
            java.lang.Object r12 = r12.m108735a()
            com.whoop.educationModels.FeatureEducationDto r12 = (com.whoop.educationModels.FeatureEducationDto) r12
            r13.<init>(r12)
            return r13
        L9d:
            boolean r13 = r12 instanceof u02.InterfaceC34385a.b
            if (r13 == 0) goto Lad
            ke1.b$a r13 = new ke1.b$a
            u02.a$b r12 = (u02.InterfaceC34385a.b) r12
            java.lang.String r12 = r12.getErrorMessage()
            r13.<init>(r12)
            return r13
        Lad:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ke1.C22420c.m64560e(java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: g */
    private final Object m64561g(FeatureEducationType featureEducationType, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM108729b;
        if (featureEducationType == FeatureEducationType.CHARGE_EDUCATION) {
            Object objM108729b2 = InterfaceC34385a.Companion.m108729b(InterfaceC34385a.INSTANCE, this.logger, null, "failed to mark education path " + featureEducationType + " with storyId " + i13 + " as complete", new d(i13, null), interfaceC30057d, 2, null);
            if (objM108729b2 == EnumC31071a.f128113w) {
                return objM108729b2;
            }
        } else if (featureEducationType == FeatureEducationType.KOALA_ROLLOUT_EDUCATION && (objM108729b = InterfaceC34385a.Companion.m108729b(InterfaceC34385a.INSTANCE, this.logger, null, null, new e(i13, null), interfaceC30057d, 6, null)) == EnumC31071a.f128113w) {
            return objM108729b;
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC13058l m64562f(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(AbstractC22419b.b.f87714a, upstream, new c(null));
    }
}
