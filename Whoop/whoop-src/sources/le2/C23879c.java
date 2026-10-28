package le2;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.shepherd.domain.ShepherdApi;
import com.whoop.shepherd.feature.welcome.domain.models.ShepherdWelcomeScreenResponse;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: le2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lle2/c;", "", "Lcom/whoop/shepherd/domain/ShepherdApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/shepherd/domain/ShepherdApi;Ltr2/n;)V", "Lle2/b;", "c", "(Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "Lle2/a;", "upstream", "d", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/shepherd/domain/ShepherdApi;", "b", "Ltr2/n;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23879c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ShepherdApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: le2.c$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.welcome.domain.ShepherdWelcomeInteractor", m100430f = "ShepherdWelcomeInteractor.kt", m100431l = {C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER}, m100432m = "fetchWelcomeScreenData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f94421w;

        /* JADX INFO: renamed from: y */
        int f94423y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f94421w = obj;
            this.f94423y |= Integer.MIN_VALUE;
            return C23879c.this.m70155c(this);
        }
    }

    /* JADX INFO: renamed from: le2.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.welcome.domain.ShepherdWelcomeInteractor$fetchWelcomeScreenData$2", m100430f = "ShepherdWelcomeInteractor.kt", m100431l = {20}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeScreenResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f94424w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C23879c.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f94424w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ShepherdApi shepherdApi = C23879c.this.api;
            this.f94424w = 1;
            Object welcomeScreen = shepherdApi.getWelcomeScreen(this);
            return welcomeScreen == enumC31071a ? enumC31071a : welcomeScreen;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ShepherdWelcomeScreenResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: le2.c$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.welcome.domain.ShepherdWelcomeInteractor$interact$1", m100430f = "ShepherdWelcomeInteractor.kt", m100431l = {15}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lle2/b;", "<unused var>", "Lle2/a;", "domainAction", "<anonymous>", "(Lle2/b;Lle2/a;)Lle2/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f94426w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f94427x;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC23878b interfaceC23878b, InterfaceC23877a interfaceC23877a, InterfaceC30057d<? super InterfaceC23878b> interfaceC30057d) {
            c cVar = C23879c.this.new c(interfaceC30057d);
            cVar.f94427x = interfaceC23877a;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC23877a interfaceC23877a = (InterfaceC23877a) this.f94427x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f94426w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!(interfaceC23877a instanceof InterfaceC23877a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                C23879c c23879c = C23879c.this;
                this.f94427x = null;
                this.f94426w = 1;
                obj = c23879c.m70155c(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return (InterfaceC23878b) obj;
        }
    }

    public C23879c(ShepherdApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: c */
    public final Object m70155c(InterfaceC30057d<? super InterfaceC23878b> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f94423y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f94423y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f94421w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f94423y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(null);
            aVar2.f94423y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch welcome screen", bVar, aVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return InterfaceC23878b.a.f94416a;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new InterfaceC23878b.c((ShepherdWelcomeScreenResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC13058l m70156d(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(InterfaceC23878b.b.f94417a, upstream, new c(null));
    }
}
