package de2;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.shepherd.domain.ShepherdApi;
import com.whoop.shepherd.feature.terms.domain.models.ShepherdTermsOfUseRequest;
import com.whoop.shepherd.feature.terms.domain.models.ShepherdTermsOfUseResponse;
import com.whoop.shepherd.feature.terms.domain.models.ShepherdTermsToggleItem;
import com.whoop.shepherd.feature.terms.domain.models.TermsOfUseCriteriaItem;
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
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: de2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Lde2/d;", "", "Lcom/whoop/shepherd/domain/ShepherdApi;", "api", "Ltr2/n;", "logger", "Lde2/e;", "termsOfUseRepository", "<init>", "(Lcom/whoop/shepherd/domain/ShepherdApi;Ltr2/n;Lde2/e;)V", "Lde2/c;", "domainState", "d", "(Lde2/c;Lq83/d;)Ljava/lang/Object;", "", "id", "", "selected", "g", "(Lde2/c;Ljava/lang/String;Z)Lde2/c;", "Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseRequest;", "e", "()Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseRequest;", "Lec3/l;", "Lde2/b;", "upstream", "f", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/shepherd/domain/ShepherdApi;", "b", "Ltr2/n;", "c", "Lde2/e;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11988d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ShepherdApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C11989e termsOfUseRepository;

    /* JADX INFO: renamed from: de2.d$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.terms.domain.ShepherdTermsOfUseInteractor", m100430f = "ShepherdTermsOfUseInteractor.kt", m100431l = {28}, m100432m = "fetchTermsOfUseScreen", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f39461w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f39462x;

        /* JADX INFO: renamed from: z */
        int f39464z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f39462x = obj;
            this.f39464z |= Integer.MIN_VALUE;
            return C11988d.this.m33030d(null, this);
        }
    }

    /* JADX INFO: renamed from: de2.d$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.terms.domain.ShepherdTermsOfUseInteractor$fetchTermsOfUseScreen$2", m100430f = "ShepherdTermsOfUseInteractor.kt", m100431l = {29}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f39465w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C11988d.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f39465w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ShepherdApi shepherdApi = C11988d.this.api;
            this.f39465w = 1;
            Object termsOfUseScreen = shepherdApi.getTermsOfUseScreen(this);
            return termsOfUseScreen == enumC31071a ? enumC31071a : termsOfUseScreen;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ShepherdTermsOfUseResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: de2.d$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.shepherd.feature.terms.domain.ShepherdTermsOfUseInteractor$interact$1", m100430f = "ShepherdTermsOfUseInteractor.kt", m100431l = {C1533u.RECORDING_METHOD_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lde2/c;", "prevDomainState", "Lde2/b;", "domainAction", "<anonymous>", "(Lde2/c;Lde2/b;)Lde2/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f39467w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f39468x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f39469y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C11987c c11987c, InterfaceC11986b interfaceC11986b, InterfaceC30057d<? super C11987c> interfaceC30057d) {
            c cVar = C11988d.this.new c(interfaceC30057d);
            cVar.f39468x = c11987c;
            cVar.f39469y = interfaceC11986b;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C11987c c11987c = (C11987c) this.f39468x;
            InterfaceC11986b interfaceC11986b = (InterfaceC11986b) this.f39469y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f39467w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!AbstractC22676k.m65745e(interfaceC11986b, InterfaceC11986b.a.f39453a)) {
                    if (!(interfaceC11986b instanceof InterfaceC11986b.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC11986b.b bVar = (InterfaceC11986b.b) interfaceC11986b;
                    return C11988d.this.m33032g(c11987c, bVar.getId(), bVar.getSelected());
                }
                C11988d c11988d = C11988d.this;
                this.f39468x = null;
                this.f39469y = null;
                this.f39467w = 1;
                obj = c11988d.m33030d(c11987c, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return (C11987c) obj;
        }
    }

    public C11988d(ShepherdApi api, InterfaceC34116n logger, C11989e termsOfUseRepository) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(termsOfUseRepository, "termsOfUseRepository");
        this.api = api;
        this.logger = logger;
        this.termsOfUseRepository = termsOfUseRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: d */
    public final Object m33030d(C11987c c11987c, InterfaceC30057d<? super C11987c> interfaceC30057d) {
        a aVar;
        C11987c c11987c2;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f39464z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f39464z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f39462x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f39464z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(null);
            aVar2.f39461w = c11987c;
            aVar2.f39464z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch terms of use screen", bVar, aVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
            c11987c2 = c11987c;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c11987c2 = (C11987c) aVar2.f39461w;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return C11987c.m33023b(c11987c2, InterfaceC11990f.a.f39472a, null, 2, null);
        }
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC34385a.c cVar = (InterfaceC34385a.c) interfaceC34385a;
        return c11987c2.m33024a(InterfaceC11990f.b.f39473a, ShepherdTermsOfUseResponse.copy$default((ShepherdTermsOfUseResponse) cVar.m108735a(), null, null, null, null, null, null, null, ShepherdTermsToggleItem.copy$default(((ShepherdTermsOfUseResponse) cVar.m108735a()).getAcknowledgeAllToggle(), null, null, false, 3, null), null, null, 895, null));
    }

    /* JADX INFO: renamed from: e */
    private final ShepherdTermsOfUseRequest m33031e() {
        return new ShepherdTermsOfUseRequest(AbstractC37056f.m118959K(new TermsOfUseCriteriaItem("AGE", true), new TermsOfUseCriteriaItem("LOCATION", true), new TermsOfUseCriteriaItem("PREVIOUS_AFIB", false)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final C11987c m33032g(C11987c domainState, String id4, boolean selected) {
        ShepherdTermsOfUseResponse termsOfUseResponse;
        ShepherdTermsToggleItem acknowledgeAllToggle;
        InterfaceC11990f currentScreenType = domainState.getCurrentScreenType();
        InterfaceC11990f.b bVar = InterfaceC11990f.b.f39473a;
        if (AbstractC22676k.m65745e(currentScreenType, bVar) && (termsOfUseResponse = domainState.getTermsOfUseResponse()) != null && (acknowledgeAllToggle = termsOfUseResponse.getAcknowledgeAllToggle()) != null) {
            if (AbstractC22676k.m65745e(acknowledgeAllToggle.getId(), id4)) {
                acknowledgeAllToggle = ShepherdTermsToggleItem.copy$default(acknowledgeAllToggle, null, null, selected, 3, null);
            }
            ShepherdTermsToggleItem shepherdTermsToggleItem = acknowledgeAllToggle;
            if (shepherdTermsToggleItem != null) {
                this.termsOfUseRepository.m33036b(shepherdTermsToggleItem.getSelected() ? m33031e() : null);
                return domainState.m33024a(bVar, ShepherdTermsOfUseResponse.copy$default(domainState.getTermsOfUseResponse(), null, null, null, null, null, null, null, shepherdTermsToggleItem, null, null, 895, null));
            }
        }
        return domainState;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC13058l m33033f(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C11987c(InterfaceC11990f.c.f39474a, null, 2, null), upstream, new c(null));
    }
}
