package kt1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.labrador.domain.LabradorApi;
import com.whoop.labrador.feature.eligibility.domain.model.LabradorEligibilityRequest;
import com.whoop.labrador.feature.eligibility.domain.model.LabradorEligibilityResponse;
import com.whoop.labrador.feature.eligibility.domain.model.LabradorSetupToggle;
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

/* JADX INFO: renamed from: kt1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lkt1/c;", "", "Lcom/whoop/labrador/domain/LabradorApi;", "api", "Ltr2/n;", "logger", "Lkt1/d;", "labradorEligibilityRepository", "<init>", "(Lcom/whoop/labrador/domain/LabradorApi;Ltr2/n;Lkt1/d;)V", "Lkt1/b;", "domainState", "d", "(Lkt1/b;Lq83/d;)Ljava/lang/Object;", "", "setupRequirement", "", "selected", "f", "(Lkt1/b;Ljava/lang/String;Z)Lkt1/b;", "Lec3/l;", "Lkt1/a;", "upstream", "e", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/labrador/domain/LabradorApi;", "b", "Ltr2/n;", "c", "Lkt1/d;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22827c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LabradorApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C22828d labradorEligibilityRepository;

    /* JADX INFO: renamed from: kt1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.eligibility.domain.LabradorEligibilityInteractor", m100430f = "LabradorEligibilityInteractor.kt", m100431l = {C1533u.RECORDING_METHOD_FIELD_NUMBER}, m100432m = "fetchLabradorEligibilityScreen", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f89955w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f89956x;

        /* JADX INFO: renamed from: z */
        int f89958z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f89956x = obj;
            this.f89958z |= Integer.MIN_VALUE;
            return C22827c.this.m66197d(null, this);
        }
    }

    /* JADX INFO: renamed from: kt1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.eligibility.domain.LabradorEligibilityInteractor$fetchLabradorEligibilityScreen$2", m100430f = "LabradorEligibilityInteractor.kt", m100431l = {24}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f89959w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C22827c.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f89959w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            LabradorApi labradorApi = C22827c.this.api;
            this.f89959w = 1;
            Object labradorEligibilitySetupScreen = labradorApi.getLabradorEligibilitySetupScreen(this);
            return labradorEligibilitySetupScreen == enumC31071a ? enumC31071a : labradorEligibilitySetupScreen;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super LabradorEligibilityResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: kt1.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.eligibility.domain.LabradorEligibilityInteractor$interact$1", m100430f = "LabradorEligibilityInteractor.kt", m100431l = {C1533u.AVG_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lkt1/b;", "prevDomainState", "Lkt1/a;", "domainAction", "<anonymous>", "(Lkt1/b;Lkt1/a;)Lkt1/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f89961w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f89962x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f89963y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C22826b c22826b, InterfaceC22825a interfaceC22825a, InterfaceC30057d<? super C22826b> interfaceC30057d) {
            c cVar = C22827c.this.new c(interfaceC30057d);
            cVar.f89962x = c22826b;
            cVar.f89963y = interfaceC22825a;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C22826b c22826b = (C22826b) this.f89962x;
            InterfaceC22825a interfaceC22825a = (InterfaceC22825a) this.f89963y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f89961w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!AbstractC22676k.m65745e(interfaceC22825a, InterfaceC22825a.a.f89947a)) {
                    if (!(interfaceC22825a instanceof InterfaceC22825a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC22825a.b bVar = (InterfaceC22825a.b) interfaceC22825a;
                    return C22827c.this.m66198f(c22826b, bVar.getSetupRequirement(), bVar.getSelected());
                }
                C22827c c22827c = C22827c.this;
                this.f89962x = null;
                this.f89963y = null;
                this.f89961w = 1;
                obj = c22827c.m66197d(c22826b, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return (C22826b) obj;
        }
    }

    public C22827c(LabradorApi api, InterfaceC34116n logger, C22828d labradorEligibilityRepository) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(labradorEligibilityRepository, "labradorEligibilityRepository");
        this.api = api;
        this.logger = logger;
        this.labradorEligibilityRepository = labradorEligibilityRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: d */
    public final Object m66197d(C22826b c22826b, InterfaceC30057d<? super C22826b> interfaceC30057d) {
        a aVar;
        C22826b c22826b2;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f89958z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f89958z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f89956x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f89958z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(null);
            aVar2.f89955w = c22826b;
            aVar2.f89958z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch ecg eligibility screen", bVar, aVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
            c22826b2 = c22826b;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22826b2 = (C22826b) aVar2.f89955w;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return C22826b.m66190b(c22826b2, InterfaceC22829e.a.f89966a, null, 2, null);
        }
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC34385a.c cVar = (InterfaceC34385a.c) interfaceC34385a;
        return c22826b2.m66191a(InterfaceC22829e.b.f89967a, LabradorEligibilityResponse.copy$default((LabradorEligibilityResponse) cVar.m108735a(), null, null, null, null, null, null, null, LabradorSetupToggle.copy$default(((LabradorEligibilityResponse) cVar.m108735a()).getAcknowledgeAllToggle(), null, null, false, 3, null), null, null, 895, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final C22826b m66198f(C22826b domainState, String setupRequirement, boolean selected) {
        LabradorEligibilityResponse labradorEligibilityResponse;
        LabradorSetupToggle acknowledgeAllToggle;
        InterfaceC22829e currentScreenType = domainState.getCurrentScreenType();
        InterfaceC22829e.b bVar = InterfaceC22829e.b.f89967a;
        if (AbstractC22676k.m65745e(currentScreenType, bVar) && (labradorEligibilityResponse = domainState.getLabradorEligibilityResponse()) != null && (acknowledgeAllToggle = labradorEligibilityResponse.getAcknowledgeAllToggle()) != null) {
            if (AbstractC22676k.m65745e(acknowledgeAllToggle.getSetupRequirement(), setupRequirement)) {
                acknowledgeAllToggle = LabradorSetupToggle.copy$default(acknowledgeAllToggle, null, null, selected, 3, null);
            }
            LabradorSetupToggle labradorSetupToggle = acknowledgeAllToggle;
            if (labradorSetupToggle != null) {
                this.labradorEligibilityRepository.m66202b(labradorSetupToggle.getSelected() ? new LabradorEligibilityRequest(true, true, false) : null);
                return domainState.m66191a(bVar, LabradorEligibilityResponse.copy$default(domainState.getLabradorEligibilityResponse(), null, null, null, null, null, null, null, labradorSetupToggle, null, null, 895, null));
            }
        }
        return domainState;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC13058l m66199e(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C22826b(InterfaceC22829e.c.f89968a, null, 2, null), upstream, new c(null));
    }
}
