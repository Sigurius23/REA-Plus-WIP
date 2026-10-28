package f70;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import java.util.ArrayList;
import java.util.Iterator;
import l83.C23454a0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: f70.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lf70/g;", "", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "Lbc3/c0;", "scope", "Lq83/j;", "coroutineContext", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagRepository;Lbc3/c0;Lq83/j;Ltr2/n;)V", "Ll83/a0;", "c", "()V", "a", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "b", "Lbc3/c0;", "Lq83/j;", "d", "Ltr2/n;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14180g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagRepository featureFlagRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC30063j coroutineContext;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f70.g$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.ActivationFeatureFlagFetcher$fetchOnboardingFeatureFlagStatus$1", m100430f = "ActivationFeatureFlagFetcher.kt", m100431l = {41}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f51271w;

        /* JADX INFO: renamed from: x */
        int f51272x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f51273y;

        /* JADX INFO: renamed from: f70.g$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.ActivationFeatureFlagFetcher$fetchOnboardingFeatureFlagStatus$1$2$deferred$1", m100430f = "ActivationFeatureFlagFetcher.kt", m100431l = {37}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41581a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f51275w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C14180g f51276x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ OnboardingFeatureFlag f51277y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41581a(C14180g c14180g, OnboardingFeatureFlag onboardingFeatureFlag, InterfaceC30057d<? super C41581a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f51276x = c14180g;
                this.f51277y = onboardingFeatureFlag;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C41581a(this.f51276x, this.f51277y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
                return ((C41581a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f51275w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                this.f51276x.logger.mo85228t(AbstractC11266d.m30461o("fetching activation feature flag: ", this.f51277y.getFlagName()), new AbstractC30556a.a[0]);
                FeatureFlagRepository featureFlagRepository = this.f51276x.featureFlagRepository;
                OnboardingFeatureFlag onboardingFeatureFlag = this.f51277y;
                this.f51275w = 1;
                Object objIsOnboardingFeatureFlagTurnedOn = featureFlagRepository.isOnboardingFeatureFlagTurnedOn(onboardingFeatureFlag, this);
                return objIsOnboardingFeatureFlagTurnedOn == enumC31071a ? enumC31071a : objIsOnboardingFeatureFlagTurnedOn;
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C14180g.this.new a(interfaceC30057d);
            aVar.f51273y = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f51273y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51272x;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ArrayList arrayList = new ArrayList();
                    OnboardingFeatureFlag[] onboardingFeatureFlagArrValues = OnboardingFeatureFlag.values();
                    ArrayList arrayList2 = new ArrayList();
                    for (OnboardingFeatureFlag onboardingFeatureFlag : onboardingFeatureFlagArrValues) {
                        if (onboardingFeatureFlag.getOnboardingOnly()) {
                            arrayList2.add(onboardingFeatureFlag);
                        }
                    }
                    C14180g c14180g = C14180g.this;
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(AbstractC3006f0.m8711e(interfaceC2994c0, null, new C41581a(c14180g, (OnboardingFeatureFlag) it.next(), null), 3));
                    }
                    this.f51273y = interfaceC2994c0;
                    this.f51271w = null;
                    this.f51272x = 1;
                    if (AbstractC3006f0.m8712f(arrayList, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
            } catch (Exception e5) {
                AbstractC3006f0.m8721o(interfaceC2994c0.getCoroutineContext());
                C14180g.this.logger.mo85222m(AbstractC2875y.m8297j(e5, "Unable to fetch feature flag info: "), new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    public C14180g(FeatureFlagRepository featureFlagRepository, InterfaceC2994c0 scope, InterfaceC30063j coroutineContext, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(featureFlagRepository, "featureFlagRepository");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(coroutineContext, "coroutineContext");
        AbstractC22676k.m65750j(logger, "logger");
        this.featureFlagRepository = featureFlagRepository;
        this.scope = scope;
        this.coroutineContext = coroutineContext;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: c */
    public final void m40450c() {
        AbstractC3006f0.m8732z(this.scope, this.coroutineContext, null, new a(null), 2);
    }

    public /* synthetic */ C14180g(FeatureFlagRepository featureFlagRepository, InterfaceC2994c0 interfaceC2994c0, InterfaceC30063j interfaceC30063j, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(featureFlagRepository, interfaceC2994c0, (i13 & 4) != 0 ? C30064k.f122676w : interfaceC30063j, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ActivationFeatureFlagFetcher") : interfaceC34116n);
    }
}
