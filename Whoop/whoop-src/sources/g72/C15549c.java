package g72;

import c93.InterfaceC4351m;
import com.whoop.sage.domain.SageApi;
import com.whoop.sage.onboarding.domain.models.ManualBloodPressureReadingInput;
import com.whoop.sage.onboarding.domain.models.SageOnboardingResponse;
import com.whoop.sage.onboarding.domain.models.SageOnboardingSaveRequestResponse;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import j72.EnumC21402g;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g72.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\"B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, m65681d2 = {"Lg72/c;", "Lod1/g;", "Lg72/a;", "Lg72/b;", "Lcom/whoop/sage/domain/SageApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/sage/domain/SageApi;Ltr2/n;)V", "", "skipToManualEntry", "j", "(ZLq83/d;)Ljava/lang/Object;", "Lg72/a$b;", "action", "previousState", "l", "(Lg72/a$b;Lg72/b;)Lg72/b;", "k", "(Lg72/b;)Lg72/b;", "Lg72/b$e;", "saveState", "Lec3/l;", "m", "(Lg72/b$e;)Lec3/l;", "Lg72/f;", "previousData", "content", "i", "(Lg72/f;Lg72/f;)Lg72/f;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/sage/domain/SageApi;", "b", "Ltr2/n;", "c", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15549c implements InterfaceC27844g<AbstractC15547a, AbstractC15548b> {

    /* JADX INFO: renamed from: d */
    public static final int f58331d = 8;

    /* JADX INFO: renamed from: e */
    private static final EnumC21402g f58332e = EnumC21402g.SAGE_SUBMIT;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final SageApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: g72.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sage.onboarding.domain.SageOnboardingInteractor", m100430f = "SageOnboardingInteractor.kt", m100431l = {60, 62}, m100432m = "fetchData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        boolean f58335w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f58336x;

        /* JADX INFO: renamed from: z */
        int f58338z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f58336x = obj;
            this.f58338z |= Integer.MIN_VALUE;
            return C15549c.this.m43775j(false, this);
        }
    }

    /* JADX INFO: renamed from: g72.c$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sage.onboarding.domain.SageOnboardingInteractor$fetchData$response$1", m100430f = "SageOnboardingInteractor.kt", m100431l = {60}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f58339w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C15549c.this.new c(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f58339w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            SageApi sageApi = C15549c.this.api;
            this.f58339w = 1;
            Object sageManualInput = sageApi.getSageManualInput(this);
            return sageManualInput == enumC31071a ? enumC31071a : sageManualInput;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super SageOnboardingResponse> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: g72.c$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sage.onboarding.domain.SageOnboardingInteractor$fetchData$response$2", m100430f = "SageOnboardingInteractor.kt", m100431l = {62}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f58341w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C15549c.this.new d(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f58341w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            SageApi sageApi = C15549c.this.api;
            this.f58341w = 1;
            Object sageOnboarding = sageApi.getSageOnboarding(this);
            return sageOnboarding == enumC31071a ? enumC31071a : sageOnboarding;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super SageOnboardingResponse> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: g72.c$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sage.onboarding.domain.SageOnboardingInteractor$interact$$inlined$flatMapLatest$1", m100430f = "SageOnboardingInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f58343w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f58344x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f58345y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C15549c f58346z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC30057d interfaceC30057d, C15549c c15549c) {
            super(3, interfaceC30057d);
            this.f58346z = c15549c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC15548b abstractC15548b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d, this.f58346z);
            eVar.f58344x = interfaceC13062m;
            eVar.f58345y = abstractC15548b;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f58343w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f58344x;
                AbstractC15548b abstractC15548b = (AbstractC15548b) this.f58345y;
                InterfaceC13058l interfaceC13058lM43778m = abstractC15548b instanceof AbstractC15548b.e ? this.f58346z.m43778m((AbstractC15548b.e) abstractC15548b) : new C0456u(abstractC15548b, 1);
                this.f58344x = null;
                this.f58345y = null;
                this.f58343w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM43778m, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC15548b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: g72.c$f */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f58347w;

        /* JADX INFO: renamed from: g72.c$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f58348w;

            /* JADX INFO: renamed from: g72.c$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.sage.onboarding.domain.SageOnboardingInteractor$interact$$inlined$map$1$2", m100430f = "SageOnboardingInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41625a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f58349E;

                /* JADX INFO: renamed from: F */
                Object f58350F;

                /* JADX INFO: renamed from: G */
                Object f58351G;

                /* JADX INFO: renamed from: H */
                int f58352H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f58353w;

                /* JADX INFO: renamed from: x */
                int f58354x;

                /* JADX INFO: renamed from: y */
                Object f58355y;

                public C41625a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f58353w = obj;
                    this.f58354x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f58348w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41625a c41625a;
                if (interfaceC30057d instanceof C41625a) {
                    c41625a = (C41625a) interfaceC30057d;
                    int i13 = c41625a.f58354x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41625a.f58354x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41625a = new C41625a(interfaceC30057d);
                    }
                } else {
                    c41625a = new C41625a(interfaceC30057d);
                }
                Object obj2 = c41625a.f58353w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41625a.f58354x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f58348w;
                    AbstractC15548b accumulatedState = ((C15550d) obj).getAccumulatedState();
                    c41625a.f58355y = null;
                    c41625a.f58349E = null;
                    c41625a.f58350F = null;
                    c41625a.f58351G = null;
                    c41625a.f58352H = 0;
                    c41625a.f58354x = 1;
                    if (interfaceC13062m.emit(accumulatedState, c41625a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l) {
            this.f58347w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f58347w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: g72.c$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sage.onboarding.domain.SageOnboardingInteractor$interact$1", m100430f = "SageOnboardingInteractor.kt", m100431l = {34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lg72/d;", "accumulation", "Lg72/a;", "domainAction", "<anonymous>", "(Lg72/d;Lg72/a;)Lg72/d;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f58357w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f58358x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f58359y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C15550d c15550d, AbstractC15547a abstractC15547a, InterfaceC30057d<? super C15550d> interfaceC30057d) {
            g gVar = C15549c.this.new g(interfaceC30057d);
            gVar.f58358x = c15550d;
            gVar.f58359y = abstractC15547a;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x007d  */
        /* JADX WARN: Code duplicated, block: B:30:0x0087  */
        /* JADX WARN: Code duplicated, block: B:31:0x008b  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC15548b accumulatedState;
            AbstractC15548b.g lastSuccessState;
            C15550d c15550d = (C15550d) this.f58358x;
            AbstractC15547a abstractC15547a = (AbstractC15547a) this.f58359y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f58357w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (abstractC15547a instanceof AbstractC15547a.c) {
                    C15549c c15549c = C15549c.this;
                    boolean skipToManualEntry = ((AbstractC15547a.c) abstractC15547a).getSkipToManualEntry();
                    this.f58358x = c15550d;
                    this.f58359y = null;
                    this.f58357w = 1;
                    obj = c15549c.m43775j(skipToManualEntry, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else if (abstractC15547a instanceof AbstractC15547a.b) {
                    accumulatedState = C15549c.this.m43777l((AbstractC15547a.b) abstractC15547a, c15550d.getAccumulatedState());
                } else if (abstractC15547a instanceof AbstractC15547a.a) {
                    accumulatedState = C15549c.this.m43776k(c15550d.getAccumulatedState());
                } else {
                    if (!(abstractC15547a instanceof AbstractC15547a.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC15548b.g lastSuccessState2 = c15550d.getLastSuccessState();
                    if (lastSuccessState2 != null) {
                        AbstractC15547a.d dVar = (AbstractC15547a.d) abstractC15547a;
                        accumulatedState = AbstractC15548b.g.m43762b(lastSuccessState2, null, dVar.getProgressResult(), dVar.getSaveRequest(), false, 9, null);
                        if (accumulatedState == null) {
                            accumulatedState = c15550d.getAccumulatedState();
                        }
                    } else {
                        accumulatedState = c15550d.getAccumulatedState();
                    }
                }
                if (accumulatedState instanceof AbstractC15548b.g) {
                    lastSuccessState = (AbstractC15548b.g) accumulatedState;
                } else {
                    lastSuccessState = c15550d.getLastSuccessState();
                }
                return new C15550d(accumulatedState, lastSuccessState);
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            accumulatedState = (AbstractC15548b) obj;
            if (accumulatedState instanceof AbstractC15548b.g) {
                lastSuccessState = (AbstractC15548b.g) accumulatedState;
            } else {
                lastSuccessState = c15550d.getLastSuccessState();
            }
            return new C15550d(accumulatedState, lastSuccessState);
        }
    }

    /* JADX INFO: renamed from: g72.c$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sage.onboarding.domain.SageOnboardingInteractor$performSave$1", m100430f = "SageOnboardingInteractor.kt", m100431l = {128, 136, 147, 172, 180, 186}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lg72/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        private /* synthetic */ Object f58361E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ AbstractC15548b.e f58362F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ C15549c f58363G;

        /* JADX INFO: renamed from: w */
        Object f58364w;

        /* JADX INFO: renamed from: x */
        Object f58365x;

        /* JADX INFO: renamed from: y */
        int f58366y;

        /* JADX INFO: renamed from: z */
        int f58367z;

        /* JADX INFO: renamed from: g72.c$h$a */
        @InterfaceC32271e(m100429c = "com.whoop.sage.onboarding.domain.SageOnboardingInteractor$performSave$1$response$1", m100430f = "SageOnboardingInteractor.kt", m100431l = {151, 159}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingSaveRequestResponse;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ C15549c f58368E;

            /* JADX INFO: renamed from: w */
            Object f58369w;

            /* JADX INFO: renamed from: x */
            int f58370x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ boolean f58371y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ AbstractC15548b.e f58372z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z4, AbstractC15548b.e eVar, C15549c c15549c, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f58371y = z4;
                this.f58372z = eVar;
                this.f58368E = c15549c;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f58371y, this.f58372z, this.f58368E, interfaceC30057d);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
            
                if (r7 == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
            
                if (r7 == r0) goto L19;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r6.f58370x
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r3) goto L18
                    if (r1 != r2) goto L10
                    p505ts.AbstractC34132o.m107864I(r7)
                    goto L7d
                L10:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L18:
                    java.lang.Object r0 = r6.f58369w
                    java.util.List r0 = (java.util.List) r0
                    p505ts.AbstractC34132o.m107864I(r7)
                    goto L5c
                L20:
                    p505ts.AbstractC34132o.m107864I(r7)
                    boolean r7 = r6.f58371y
                    r1 = 0
                    if (r7 == 0) goto L5f
                    g72.b$e r7 = r6.f58372z
                    g72.f r7 = r7.getSaveRequest()
                    java.util.Map r7 = r7.m43785b()
                    java.util.Collection r7 = r7.values()
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.ArrayList r7 = m83.AbstractC25267u.m74164j0(r7)
                    g72.c r2 = r6.f58368E
                    com.whoop.sage.domain.SageApi r2 = g72.C15549c.m43769d(r2)
                    com.whoop.sage.onboarding.domain.models.SageOnboardingRequest r4 = new com.whoop.sage.onboarding.domain.models.SageOnboardingRequest
                    g72.b$e r5 = r6.f58372z
                    g72.f r5 = r5.getSaveRequest()
                    java.util.List r5 = r5.m43786c()
                    r4.<init>(r7, r5, r1)
                    r6.f58369w = r1
                    r6.f58370x = r3
                    java.lang.Object r7 = r2.saveSageOnboarding(r4, r6)
                    if (r7 != r0) goto L5c
                    goto L7c
                L5c:
                    pg3.v0 r7 = (pg3.C29218v0) r7
                    return r7
                L5f:
                    g72.c r7 = r6.f58368E
                    com.whoop.sage.domain.SageApi r7 = g72.C15549c.m43769d(r7)
                    com.whoop.sage.onboarding.domain.models.SageManualMeasurementRequest r3 = new com.whoop.sage.onboarding.domain.models.SageManualMeasurementRequest
                    g72.b$e r4 = r6.f58372z
                    g72.f r4 = r4.getSaveRequest()
                    java.util.List r4 = r4.m43786c()
                    r3.<init>(r4, r1)
                    r6.f58370x = r2
                    java.lang.Object r7 = r7.saveSageManualMeasurement(r3, r6)
                    if (r7 != r0) goto L7d
                L7c:
                    return r0
                L7d:
                    pg3.v0 r7 = (pg3.C29218v0) r7
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: g72.C15549c.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<SageOnboardingSaveRequestResponse>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AbstractC15548b.e eVar, C15549c c15549c, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f58362F = eVar;
            this.f58363G = c15549c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = new h(this.f58362F, this.f58363G, interfaceC30057d);
            hVar.f58361E = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00ca A[PHI: r2 r11 r15
          0x00ca: PHI (r2v7 int) = (r2v11 int), (r2v12 int) binds: [B:25:0x00c6, B:9:0x0024] A[DONT_GENERATE, DONT_INLINE]
          0x00ca: PHI (r11v3 g72.c$h) = (r11v1 g72.c$h), (r11v4 g72.c$h) binds: [B:25:0x00c6, B:9:0x0024] A[DONT_GENERATE, DONT_INLINE]
          0x00ca: PHI (r15v21 java.lang.Object) = (r15v14 java.lang.Object), (r15v0 java.lang.Object) binds: [B:25:0x00c6, B:9:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:29:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:31:0x00de  */
        /* JADX WARN: Code duplicated, block: B:41:0x0125  */
        /* JADX WARN: Code duplicated, block: B:43:0x0129  */
        /* JADX WARN: Code duplicated, block: B:45:0x0149 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:46:0x014a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:47:0x014b  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            h hVar;
            int i13;
            InterfaceC34385a interfaceC34385a;
            AbstractC15548b.c cVar;
            SageOnboardingSaveRequestResponse sageOnboardingSaveRequestResponse;
            AbstractC15548b.d dVar;
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f58361E;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.f58367z;
            C23454a0 c23454a0 = C23454a0.f92919a;
            switch (i14) {
                case 0:
                    AbstractC34132o.m107864I(obj);
                    AbstractC15548b.e eVar = new AbstractC15548b.e(this.f58362F.getProgressResult(), this.f58362F.getSaveRequest());
                    this.f58361E = interfaceC13062m;
                    this.f58367z = 1;
                    if (interfaceC13062m.emit(eVar, this) != enumC31071a) {
                        if (this.f58362F.getSaveRequest().m43785b().isEmpty() || !this.f58362F.getSaveRequest().m43786c().isEmpty()) {
                            ?? r10 = !this.f58362F.getSaveRequest().m43785b().isEmpty();
                            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                            InterfaceC34116n interfaceC34116n = this.f58363G.logger;
                            a aVar = new a(r10, this.f58362F, this.f58363G, null);
                            this.f58361E = interfaceC13062m;
                            this.f58366y = r10;
                            this.f58367z = 3;
                            hVar = this;
                            obj = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, aVar, hVar, 6, null);
                            i13 = r10;
                            if (obj != enumC31071a) {
                                interfaceC34385a = (InterfaceC34385a) obj;
                                if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
                                    sageOnboardingSaveRequestResponse = (SageOnboardingSaveRequestResponse) ((C29218v0) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).f118270b;
                                    if (sageOnboardingSaveRequestResponse == null && sageOnboardingSaveRequestResponse.getDoReadingsHaveHighVariance() && sageOnboardingSaveRequestResponse.getVarianceDialog() != null) {
                                        AbstractC15548b.f fVar = new AbstractC15548b.f(hVar.f58362F.getProgressResult(), hVar.f58362F.getSaveRequest(), sageOnboardingSaveRequestResponse.getVarianceDialog());
                                        hVar.f58361E = null;
                                        hVar.f58364w = null;
                                        hVar.f58365x = null;
                                        hVar.f58366y = i13;
                                        hVar.f58367z = 4;
                                        if (interfaceC13062m.emit(fVar, this) != enumC31071a) {
                                            return c23454a0;
                                        }
                                    } else {
                                        dVar = AbstractC15548b.d.f58320a;
                                        hVar.f58361E = null;
                                        hVar.f58364w = null;
                                        hVar.f58365x = null;
                                        hVar.f58366y = i13;
                                        hVar.f58367z = 5;
                                        if (interfaceC13062m.emit(dVar, this) == enumC31071a) {
                                            return c23454a0;
                                        }
                                    }
                                } else {
                                    if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar = new AbstractC15548b.c(hVar.f58362F.getProgressResult(), hVar.f58362F.getSaveRequest());
                                    hVar.f58361E = null;
                                    hVar.f58364w = null;
                                    hVar.f58366y = i13;
                                    hVar.f58367z = 6;
                                    if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
                                        return c23454a0;
                                    }
                                }
                            }
                        } else {
                            AbstractC15548b.c cVar2 = new AbstractC15548b.c(this.f58362F.getProgressResult(), this.f58362F.getSaveRequest());
                            this.f58361E = null;
                            this.f58367z = 2;
                            if (interfaceC13062m.emit(cVar2, this) != enumC31071a) {
                                return c23454a0;
                            }
                        }
                    }
                    return enumC31071a;
                case 1:
                    AbstractC34132o.m107864I(obj);
                    if (this.f58362F.getSaveRequest().m43785b().isEmpty()) {
                        break;
                    }
                    ?? r14 = !this.f58362F.getSaveRequest().m43785b().isEmpty();
                    InterfaceC34385a.Companion companion2 = InterfaceC34385a.INSTANCE;
                    InterfaceC34116n interfaceC34116n2 = this.f58363G.logger;
                    a aVar2 = new a(r14, this.f58362F, this.f58363G, null);
                    this.f58361E = interfaceC13062m;
                    this.f58366y = r14;
                    this.f58367z = 3;
                    hVar = this;
                    obj = InterfaceC34385a.Companion.m108729b(companion2, interfaceC34116n2, null, null, aVar2, hVar, 6, null);
                    i13 = r14;
                    if (obj != enumC31071a) {
                        interfaceC34385a = (InterfaceC34385a) obj;
                        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
                            sageOnboardingSaveRequestResponse = (SageOnboardingSaveRequestResponse) ((C29218v0) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).f118270b;
                            if (sageOnboardingSaveRequestResponse == null) {
                            }
                            dVar = AbstractC15548b.d.f58320a;
                            hVar.f58361E = null;
                            hVar.f58364w = null;
                            hVar.f58365x = null;
                            hVar.f58366y = i13;
                            hVar.f58367z = 5;
                            if (interfaceC13062m.emit(dVar, this) == enumC31071a) {
                                return c23454a0;
                            }
                        } else {
                            if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar = new AbstractC15548b.c(hVar.f58362F.getProgressResult(), hVar.f58362F.getSaveRequest());
                            hVar.f58361E = null;
                            hVar.f58364w = null;
                            hVar.f58366y = i13;
                            hVar.f58367z = 6;
                            if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
                                return c23454a0;
                            }
                        }
                    }
                    return enumC31071a;
                case 2:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                case 3:
                    int i15 = this.f58366y;
                    AbstractC34132o.m107864I(obj);
                    hVar = this;
                    i13 = i15;
                    interfaceC34385a = (InterfaceC34385a) obj;
                    if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
                        if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cVar = new AbstractC15548b.c(hVar.f58362F.getProgressResult(), hVar.f58362F.getSaveRequest());
                        hVar.f58361E = null;
                        hVar.f58364w = null;
                        hVar.f58366y = i13;
                        hVar.f58367z = 6;
                        if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
                            return enumC31071a;
                        }
                        return c23454a0;
                    }
                    sageOnboardingSaveRequestResponse = (SageOnboardingSaveRequestResponse) ((C29218v0) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).f118270b;
                    if (sageOnboardingSaveRequestResponse == null) {
                        break;
                    }
                    dVar = AbstractC15548b.d.f58320a;
                    hVar.f58361E = null;
                    hVar.f58364w = null;
                    hVar.f58365x = null;
                    hVar.f58366y = i13;
                    hVar.f58367z = 5;
                    if (interfaceC13062m.emit(dVar, this) == enumC31071a) {
                        return enumC31071a;
                    }
                    return c23454a0;
                case 4:
                case 5:
                case 6:
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public C15549c(SageApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: i */
    private final C15552f m43774i(C15552f previousData, C15552f content) {
        List<ManualBloodPressureReadingInput> listM43786c = content.m43786c();
        if (listM43786c.isEmpty()) {
            listM43786c = previousData.m43786c();
        }
        return previousData.m43784a(AbstractC25247g0.m73995d0(previousData.m43785b(), content.m43785b()), listM43786c, AbstractC25265s.m74159y0(AbstractC25265s.m74129g1(previousData.m43787d(), content.m43787d())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r11 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (r11 == r0) goto L25;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m43775j(boolean r10, q83.InterfaceC30057d<? super g72.AbstractC15548b> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof g72.C15549c.b
            if (r0 == 0) goto L14
            r0 = r11
            g72.c$b r0 = (g72.C15549c.b) r0
            int r1 = r0.f58338z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f58338z = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            g72.c$b r0 = new g72.c$b
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f58336x
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f58338z
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            p505ts.AbstractC34132o.m107864I(r11)
            goto L72
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            p505ts.AbstractC34132o.m107864I(r11)
            goto L56
        L38:
            p505ts.AbstractC34132o.m107864I(r11)
            r11 = 0
            if (r10 == 0) goto L59
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            tr2.n r2 = r9.logger
            g72.c$c r5 = new g72.c$c
            r5.<init>(r11)
            r6.f58335w = r10
            r6.f58338z = r3
            r3 = 0
            r4 = 0
            r7 = 6
            r8 = 0
            java.lang.Object r11 = u02.InterfaceC34385a.Companion.m108729b(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r11 != r0) goto L56
            goto L71
        L56:
            u02.a r11 = (u02.InterfaceC34385a) r11
            goto L74
        L59:
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            r3 = r2
            tr2.n r2 = r9.logger
            g72.c$d r5 = new g72.c$d
            r5.<init>(r11)
            r6.f58335w = r10
            r6.f58338z = r3
            r3 = 0
            r4 = 0
            r7 = 6
            r8 = 0
            java.lang.Object r11 = u02.InterfaceC34385a.Companion.m108729b(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r11 != r0) goto L72
        L71:
            return r0
        L72:
            u02.a r11 = (u02.InterfaceC34385a) r11
        L74:
            boolean r10 = r11 instanceof u02.InterfaceC34385a.c
            if (r10 == 0) goto La5
            g72.b$g r0 = new g72.b$g
            u02.a$c r11 = (u02.InterfaceC34385a.c) r11
            java.lang.Object r10 = r11.m108735a()
            r1 = r10
            com.whoop.sage.onboarding.domain.models.SageOnboardingResponse r1 = (com.whoop.sage.onboarding.domain.models.SageOnboardingResponse) r1
            g72.e r2 = new g72.e
            java.lang.Object r10 = r11.m108735a()
            com.whoop.sage.onboarding.domain.models.SageOnboardingResponse r10 = (com.whoop.sage.onboarding.domain.models.SageOnboardingResponse) r10
            j72.g r10 = r10.getInitialScreen()
            m83.y r11 = m83.C25271y.f99162w
            r2.<init>(r10, r11)
            g72.f r3 = new g72.f
            r7 = 7
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            r5 = 8
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        La5:
            boolean r10 = r11 instanceof u02.InterfaceC34385a.b
            if (r10 == 0) goto Lac
            g72.b$a r10 = g72.AbstractC15548b.a.f58316a
            return r10
        Lac:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g72.C15549c.m43775j(boolean, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final AbstractC15548b m43776k(AbstractC15548b previousState) {
        AbstractC22676k.m65748h(previousState, "null cannot be cast to non-null type com.whoop.sage.onboarding.domain.SageOnboardingDomainResult.Success");
        AbstractC15548b.g gVar = (AbstractC15548b.g) previousState;
        if (gVar.getProgressResult().m43783b().isEmpty()) {
            return AbstractC15548b.g.m43762b(gVar, null, null, null, true, 7, null);
        }
        EnumC21402g enumC21402g = (EnumC21402g) AbstractC25265s.m74112P0(gVar.getProgressResult().m43783b());
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(gVar.getProgressResult().m43783b());
        arrayListM74097F1.remove(AbstractC37056f.m118951C(arrayListM74097F1));
        return AbstractC15548b.g.m43762b(gVar, null, new C15551e(enumC21402g, arrayListM74097F1), null, false, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final AbstractC15548b m43777l(AbstractC15547a.b action, AbstractC15548b previousState) {
        C15551e progressResult;
        C15552f saveRequest;
        boolean z4 = previousState instanceof AbstractC15548b.g;
        AbstractC15548b.g gVar = z4 ? (AbstractC15548b.g) previousState : null;
        if (gVar == null || (progressResult = gVar.getProgressResult()) == null) {
            AbstractC22676k.m65748h(previousState, "null cannot be cast to non-null type com.whoop.sage.onboarding.domain.SageOnboardingDomainResult.Saving");
            progressResult = ((AbstractC15548b.e) previousState).getProgressResult();
        }
        AbstractC15548b.g gVar2 = z4 ? (AbstractC15548b.g) previousState : null;
        if (gVar2 == null || (saveRequest = gVar2.getSaveRequest()) == null) {
            AbstractC22676k.m65748h(previousState, "null cannot be cast to non-null type com.whoop.sage.onboarding.domain.SageOnboardingDomainResult.Saving");
            saveRequest = ((AbstractC15548b.e) previousState).getSaveRequest();
        }
        EnumC21402g currentScreen = progressResult.getCurrentScreen();
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(progressResult.m43783b());
        arrayListM74097F1.add(currentScreen);
        C15552f c15552fM43774i = m43774i(saveRequest, action.getContent());
        if (action.getNextScreen() == null || action.getNextScreen() == f58332e) {
            return new AbstractC15548b.e(progressResult, c15552fM43774i);
        }
        AbstractC22676k.m65748h(previousState, "null cannot be cast to non-null type com.whoop.sage.onboarding.domain.SageOnboardingDomainResult.Success");
        return AbstractC15548b.g.m43762b((AbstractC15548b.g) previousState, null, new C15551e(action.getNextScreen(), arrayListM74097F1), c15552fM43774i, false, 9, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final InterfaceC13058l m43778m(AbstractC15548b.e saveState) {
        return new C13084s1(new h(saveState, this, null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(new f(new C13060l1(new C15550d(AbstractC15548b.b.f58317a, null, 2, null), upstream, new g(null))), new e(null, this));
    }

    public /* synthetic */ C15549c(SageApi sageApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(sageApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("SageOnboardingInteractor") : interfaceC34116n);
    }
}
