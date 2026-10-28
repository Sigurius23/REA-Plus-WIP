package n60;

import com.whoop.achievements.celebration.api.AchievementCelebrationApi;
import com.whoop.achievements.celebration.api.StreakCelebrationApi;
import com.whoop.achievements.celebration.models.AchievementCelebrationResponse;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.AbstractC34386b;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: n60.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0010\u0010\u000eJ!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Ln60/c;", "", "Lcom/whoop/achievements/celebration/api/AchievementCelebrationApi;", "api", "Lcom/whoop/achievements/celebration/api/StreakCelebrationApi;", "streakCelebrationApi", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/achievements/celebration/api/AchievementCelebrationApi;Lcom/whoop/achievements/celebration/api/StreakCelebrationApi;Ltr2/n;)V", "", "achievementType", "Ln60/b;", "e", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "celebrationType", "f", "Lec3/l;", "Ln60/a;", "upstream", "g", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/achievements/celebration/api/AchievementCelebrationApi;", "b", "Lcom/whoop/achievements/celebration/api/StreakCelebrationApi;", "c", "Ltr2/n;", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26405c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AchievementCelebrationApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final StreakCelebrationApi streakCelebrationApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: n60.c$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.achievements.celebration.domain.AchievementCelebrationInteractor", m100430f = "AchievementCelebrationInteractor.kt", m100431l = {31}, m100432m = "fetchCelebration", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f104864w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f104865x;

        /* JADX INFO: renamed from: z */
        int f104867z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f104865x = obj;
            this.f104867z |= Integer.MIN_VALUE;
            return C26405c.this.m78115e(null, this);
        }
    }

    /* JADX INFO: renamed from: n60.c$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.achievements.celebration.domain.AchievementCelebrationInteractor$fetchCelebration$result$1", m100430f = "AchievementCelebrationInteractor.kt", m100431l = {35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/achievements/celebration/models/AchievementCelebrationResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f104868w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f104870y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f104870y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C26405c.this.new b(this.f104870y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f104868w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AchievementCelebrationApi achievementCelebrationApi = C26405c.this.api;
            String str = this.f104870y;
            this.f104868w = 1;
            Object celebrationOverlay = achievementCelebrationApi.getCelebrationOverlay(str, this);
            return celebrationOverlay == enumC31071a ? enumC31071a : celebrationOverlay;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super AchievementCelebrationResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: n60.c$c */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.achievements.celebration.domain.AchievementCelebrationInteractor", m100430f = "AchievementCelebrationInteractor.kt", m100431l = {41}, m100432m = "fetchStreakCelebration", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f104871w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f104872x;

        /* JADX INFO: renamed from: z */
        int f104874z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f104872x = obj;
            this.f104874z |= Integer.MIN_VALUE;
            return C26405c.this.m78116f(null, this);
        }
    }

    /* JADX INFO: renamed from: n60.c$d */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.achievements.celebration.domain.AchievementCelebrationInteractor$fetchStreakCelebration$result$1", m100430f = "AchievementCelebrationInteractor.kt", m100431l = {45}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/achievements/celebration/models/AchievementCelebrationResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f104875w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f104877y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f104877y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C26405c.this.new d(this.f104877y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f104875w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            StreakCelebrationApi streakCelebrationApi = C26405c.this.streakCelebrationApi;
            String str = this.f104877y;
            this.f104875w = 1;
            Object streakCelebrationOverlay = streakCelebrationApi.getStreakCelebrationOverlay(str, this);
            return streakCelebrationOverlay == enumC31071a ? enumC31071a : streakCelebrationOverlay;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super AchievementCelebrationResponse> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: n60.c$e */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.achievements.celebration.domain.AchievementCelebrationInteractor$interact$1", m100430f = "AchievementCelebrationInteractor.kt", m100431l = {21, 24}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln60/b;", "<unused var>", "Ln60/a;", "action", "<anonymous>", "(Ln60/b;Ln60/a;)Ln60/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f104878w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f104879x;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC26404b abstractC26404b, AbstractC26403a abstractC26403a, InterfaceC30057d<? super AbstractC26404b> interfaceC30057d) {
            e eVar = C26405c.this.new e(interfaceC30057d);
            eVar.f104879x = abstractC26403a;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        
            if (r6 == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
        
            if (r6 == r1) goto L21;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f104879x
                n60.a r0 = (n60.AbstractC26403a) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r5.f104878w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r6)
                goto L55
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L3b
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                boolean r6 = r0 instanceof n60.AbstractC26403a.a
                r2 = 0
                if (r6 == 0) goto L3e
                n60.c r6 = n60.C26405c.this
                n60.a$a r0 = (n60.AbstractC26403a.a) r0
                java.lang.String r0 = r0.getAchievementType()
                r5.f104879x = r2
                r5.f104878w = r4
                java.lang.Object r6 = n60.C26405c.m78111a(r6, r0, r5)
                if (r6 != r1) goto L3b
                goto L54
            L3b:
                n60.b r6 = (n60.AbstractC26404b) r6
                return r6
            L3e:
                boolean r6 = r0 instanceof n60.AbstractC26403a.b
                if (r6 == 0) goto L58
                n60.c r6 = n60.C26405c.this
                n60.a$b r0 = (n60.AbstractC26403a.b) r0
                java.lang.String r0 = r0.getCelebrationType()
                r5.f104879x = r2
                r5.f104878w = r3
                java.lang.Object r6 = n60.C26405c.m78112b(r6, r0, r5)
                if (r6 != r1) goto L55
            L54:
                return r1
            L55:
                n60.b r6 = (n60.AbstractC26404b) r6
                return r6
            L58:
                kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: n60.C26405c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C26405c(AchievementCelebrationApi api, StreakCelebrationApi streakCelebrationApi, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(streakCelebrationApi, "streakCelebrationApi");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.streakCelebrationApi = streakCelebrationApi;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: e */
    public final Object m78115e(String str, InterfaceC30057d<? super AbstractC26404b> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f104867z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f104867z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f104865x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f104867z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(str, null);
            aVar2.f104864w = null;
            aVar2.f104867z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch achievement celebration", bVar, aVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        AchievementCelebrationResponse achievementCelebrationResponse = (AchievementCelebrationResponse) AbstractC34386b.m108737b((InterfaceC34385a) objM108729b);
        return achievementCelebrationResponse != null ? new AbstractC26404b.c(achievementCelebrationResponse.getCelebrationOverlay()) : AbstractC26404b.a.f104857a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: f */
    public final Object m78116f(String str, InterfaceC30057d<? super AbstractC26404b> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f104874z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f104874z = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object objM108729b = cVar2.f104872x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar2.f104874z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            d dVar = new d(str, null);
            cVar2.f104871w = null;
            cVar2.f104874z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch streak celebration", dVar, cVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        AchievementCelebrationResponse achievementCelebrationResponse = (AchievementCelebrationResponse) AbstractC34386b.m108737b((InterfaceC34385a) objM108729b);
        return achievementCelebrationResponse != null ? new AbstractC26404b.c(achievementCelebrationResponse.getCelebrationOverlay()) : AbstractC26404b.a.f104857a;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC13058l m78117g(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(AbstractC26404b.b.f104858a, upstream, new e(null));
    }

    public /* synthetic */ C26405c(AchievementCelebrationApi achievementCelebrationApi, StreakCelebrationApi streakCelebrationApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(achievementCelebrationApi, streakCelebrationApi, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("AchievementCelebrationInteractor") : interfaceC34116n);
    }
}
