package v70;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.navigation.C9598e;
import f70.AbstractC14206t;
import f70.C14208u;
import f70.EnumC14204s;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: v70.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lv70/g;", "", "Lf70/u;", "appDestinationRouter", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lf70/u;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lcom/whoop/navigation/e;", "fallbackAction", "Lv70/a;", "a", "(Lcom/whoop/navigation/e;Lq83/d;)Ljava/lang/Object;", "Lf70/u;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35759g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C14208u appDestinationRouter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: v70.g$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.feature.orderconfirmation.domain.ResolveTrialOrderedNavigationUseCase", m100430f = "ResolveTrialOrderedNavigationUseCase.kt", m100431l = {29}, m100432m = "invoke", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f152100w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f152101x;

        /* JADX INFO: renamed from: z */
        int f152103z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f152101x = obj;
            this.f152103z |= Integer.MIN_VALUE;
            return C35759g.this.m113299a(null, this);
        }
    }

    public C35759g(C14208u appDestinationRouter, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(appDestinationRouter, "appDestinationRouter");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.appDestinationRouter = appDestinationRouter;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    public final Object m113299a(C9598e c9598e, InterfaceC30057d<? super InterfaceC35753a> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f152103z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f152103z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM40606e = aVar2.f152101x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f152103z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM40606e);
            if (!this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.APP_DESTINATION_TRIAL_ORDERED_ANDROID)) {
                return new InterfaceC35753a.c(c9598e);
            }
            C14208u c14208u = this.appDestinationRouter;
            EnumC14204s enumC14204s = EnumC14204s.TRIAL_ORDERED;
            aVar2.f152100w = null;
            aVar2.f152103z = 1;
            objM40606e = C14208u.m40606e(c14208u, enumC14204s, null, aVar2, 2, null);
            if (objM40606e == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM40606e);
        }
        AbstractC14206t abstractC14206t = (AbstractC14206t) objM40606e;
        if (abstractC14206t instanceof AbstractC14206t.b) {
            return new InterfaceC35753a.c(((AbstractC14206t.b) abstractC14206t).getAction());
        }
        if (abstractC14206t instanceof AbstractC14206t.a) {
            AbstractC14206t.a aVar3 = (AbstractC14206t.a) abstractC14206t;
            return new InterfaceC35753a.a(aVar3.getDestination(), aVar3.getSource());
        }
        if (abstractC14206t instanceof AbstractC14206t.c) {
            return InterfaceC35753a.b.f152047a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
