package n70;

import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.domain.models.steps.EnterYourPasswordStepModel;
import com.whoop.activation.domain.models.steps.FamilyPlanBlockStepModel;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import e93.AbstractC12889b;
import ge3.AbstractC15751g;
import hf1.InterfaceC17235b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import lf1.C23997g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import t83.InterfaceC33616a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: n70.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001:\u00012B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ2\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010 J+\u0010#\u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\u0004\u0018\u00010!2\b\u0010%\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b&\u0010'J\"\u0010(\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0082@¢\u0006\u0004\b(\u0010)J\u001a\u0010*\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0082@¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b,\u0010-J\u0018\u00100\u001a\u00020\n2\u0006\u0010/\u001a\u00020.H\u0086@¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, m65681d2 = {"Ln70/c;", "", "Ltr2/n;", "logger", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lhf1/b;", "experimentsChecker", "<init>", "(Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;Lhf1/b;)V", "Ln70/e;", "previousState", "", "changeValue", "Ln70/f;", "screenSpecificNavigationAction", "", "authenticated", "d", "(Ln70/e;ILn70/f;ZLq83/d;)Ljava/lang/Object;", "Ln70/c$a;", "progressType", "currentState", "specificNavigationAction", "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "currentScreen", "Ln70/d;", "g", "(Ln70/c$a;Ln70/e;Ln70/f;ZLcom/whoop/activation/domain/models/ActivationFlowStepModel;Lq83/d;)Ljava/lang/Object;", "newStepIndex", "stepTotal", "j", "(II)Ln70/c$a;", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "currentDestinations", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/domain/models/ActivationFlowStepModel;Z)Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "currentDestination", "i", "(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;)Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "f", "(Ln70/e;Lcom/whoop/activation/domain/models/ActivationFlowStepModel;Lq83/d;)Ljava/lang/Object;", "e", "(Lcom/whoop/activation/domain/models/ActivationFlowStepModel;Lq83/d;)Ljava/lang/Object;", "l", "(Lq83/d;)Ljava/lang/Object;", "Ln70/a;", "action", "k", "(Ln70/a;Lq83/d;)Ljava/lang/Object;", "a", "Ltr2/n;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "c", "Lhf1/b;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26416c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC17235b experimentsChecker;

    /* JADX INFO: renamed from: n70.c$a */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m65681d2 = {"Ln70/c$a;", "", "<init>", "(Ljava/lang/String;I)V", "EXIT_TO_PREVIOUS_FLOW", "EXIT_TO_NEXT_FLOW", "CONTINUE_CURRENT_FLOW", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum a {
        EXIT_TO_PREVIOUS_FLOW,
        EXIT_TO_NEXT_FLOW,
        CONTINUE_CURRENT_FLOW;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: n70.c$b */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f104908a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f104909b;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.CONTINUE_CURRENT_FLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EXIT_TO_NEXT_FLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.EXIT_TO_PREVIOUS_FLOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f104908a = iArr;
            int[] iArr2 = new int[ActivationFlowDestination.values().length];
            try {
                iArr2[ActivationFlowDestination.DEVICE_EDUCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ActivationFlowDestination.PAIRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ActivationFlowDestination.ACCOUNT_CREATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ActivationFlowDestination.ACCOUNT_ACTIVATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ActivationFlowDestination.POST_PAIRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            f104909b = iArr2;
        }
    }

    /* JADX INFO: renamed from: n70.c$c */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.progress.ActivationProgressInteractor", m100430f = "ActivationProgressInteractor.kt", m100431l = {41}, m100432m = "changeScreen", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f104910E;

        /* JADX INFO: renamed from: F */
        int f104911F;

        /* JADX INFO: renamed from: G */
        boolean f104912G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f104913H;

        /* JADX INFO: renamed from: J */
        int f104915J;

        /* JADX INFO: renamed from: w */
        Object f104916w;

        /* JADX INFO: renamed from: x */
        Object f104917x;

        /* JADX INFO: renamed from: y */
        Object f104918y;

        /* JADX INFO: renamed from: z */
        int f104919z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f104913H = obj;
            this.f104915J |= Integer.MIN_VALUE;
            return C26416c.this.m78150d(null, 0, null, false, this);
        }
    }

    /* JADX INFO: renamed from: n70.c$d */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.progress.ActivationProgressInteractor", m100430f = "ActivationProgressInteractor.kt", m100431l = {213}, m100432m = "getAccountCreationPreviousDestination", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f104920w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f104921x;

        /* JADX INFO: renamed from: z */
        int f104923z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f104921x = obj;
            this.f104923z |= Integer.MIN_VALUE;
            return C26416c.this.m78151e(null, this);
        }
    }

    /* JADX INFO: renamed from: n70.c$e */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.progress.ActivationProgressInteractor", m100430f = "ActivationProgressInteractor.kt", m100431l = {25, 26}, m100432m = "interact", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f104924w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f104925x;

        /* JADX INFO: renamed from: z */
        int f104927z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f104925x = obj;
            this.f104927z |= Integer.MIN_VALUE;
            return C26416c.this.m78158k(null, this);
        }
    }

    /* JADX INFO: renamed from: n70.c$f */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.progress.ActivationProgressInteractor", m100430f = "ActivationProgressInteractor.kt", m100431l = {231}, m100432m = "shouldRouteForFamilyPlan", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f104928E;

        /* JADX INFO: renamed from: w */
        boolean f104929w;

        /* JADX INFO: renamed from: x */
        Object f104930x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f104931y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f104931y = obj;
            this.f104928E |= Integer.MIN_VALUE;
            return C26416c.this.m78157l(this);
        }
    }

    public C26416c(InterfaceC34116n logger, FeatureFlagChecker featureFlagChecker, InterfaceC17235b experimentsChecker) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(experimentsChecker, "experimentsChecker");
        this.logger = logger;
        this.featureFlagChecker = featureFlagChecker;
        this.experimentsChecker = experimentsChecker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: d */
    public final Object m78150d(C26418e c26418e, int i13, C26419f c26419f, boolean z4, InterfaceC30057d<? super C26418e> interfaceC30057d) {
        c cVar;
        C26418e c26418e2;
        C26419f c26419f2;
        boolean z13;
        int i14;
        a aVar;
        int i15;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i16 = cVar.f104915J;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                cVar.f104915J = i16 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object obj = cVar2.f104913H;
        Object obj2 = EnumC31071a.f128113w;
        int i17 = cVar2.f104915J;
        if (i17 == 0) {
            AbstractC34132o.m107864I(obj);
            int stepTotal = c26418e.getStepTotal();
            int i18 = stepTotal < 0 ? 0 : stepTotal;
            int currentStepIndex = c26418e.getCurrentStepIndex() + i13;
            a aVarM78156j = m78156j(currentStepIndex, i18);
            ActivationFlowStepModel currentScreen = c26419f != null ? c26419f.getCurrentScreen() : null;
            cVar2.f104916w = c26418e;
            cVar2.f104917x = c26419f;
            cVar2.f104918y = aVarM78156j;
            cVar2.f104919z = i13;
            cVar2.f104912G = z4;
            cVar2.f104910E = i18;
            cVar2.f104911F = currentStepIndex;
            cVar2.f104915J = 1;
            Object objM78153g = m78153g(aVarM78156j, c26418e, c26419f, z4, currentScreen, cVar2);
            if (objM78153g == obj2) {
                return obj2;
            }
            c26418e2 = c26418e;
            c26419f2 = c26419f;
            z13 = z4;
            obj = objM78153g;
            i14 = i18;
            aVar = aVarM78156j;
            i15 = currentStepIndex;
        } else {
            if (i17 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i15 = cVar2.f104911F;
            int i19 = cVar2.f104910E;
            z13 = cVar2.f104912G;
            aVar = (a) cVar2.f104918y;
            c26419f2 = (C26419f) cVar2.f104917x;
            c26418e2 = (C26418e) cVar2.f104916w;
            AbstractC34132o.m107864I(obj);
            i14 = i19;
        }
        AbstractC26417d abstractC26417d = (AbstractC26417d) obj;
        int i24 = b.f104908a[aVar.ordinal()];
        if (i24 == 1) {
            return i14 == 0 ? c26418e2 : new C26418e(AbstractC12889b.m36284n(i15, 0, i14 - 1), i14, 0, c26418e2.getCurrentDestination(), abstractC26417d, 4, null);
        }
        if (i24 == 2) {
            return new C26418e(0, 0, c26418e2.getStepTotal(), m78154h(c26418e2.getCurrentDestination(), c26419f2 != null ? c26419f2.getCurrentScreen() : null, z13), abstractC26417d);
        }
        if (i24 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int previousFlowStepTotal = c26418e2.getPreviousFlowStepTotal() - 1;
        return new C26418e(previousFlowStepTotal < 0 ? 0 : previousFlowStepTotal, c26418e2.getPreviousFlowStepTotal(), 0, m78155i(c26418e2.getCurrentDestination()), abstractC26417d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m78151e(ActivationFlowStepModel activationFlowStepModel, InterfaceC30057d<? super AbstractC26417d> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f104923z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f104923z = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objM78157l = dVar.f104921x;
        Object obj = EnumC31071a.f128113w;
        int i14 = dVar.f104923z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM78157l);
            if (!(activationFlowStepModel instanceof FamilyPlanBlockStepModel)) {
                return AbstractC26417d.c.f104937a;
            }
            dVar.f104920w = null;
            dVar.f104923z = 1;
            objM78157l = m78157l(dVar);
            if (objM78157l == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM78157l);
        }
        return ((Boolean) objM78157l).booleanValue() ? new AbstractC26417d.a(ActivationFlowDestination.START_SCREEN, null, 2, null) : AbstractC26417d.c.f104937a;
    }

    /* JADX INFO: renamed from: f */
    private final Object m78152f(C26418e c26418e, ActivationFlowStepModel activationFlowStepModel, InterfaceC30057d<? super AbstractC26417d> interfaceC30057d) {
        ActivationFlowDestination currentDestination = c26418e.getCurrentDestination();
        int i13 = currentDestination == null ? -1 : b.f104909b[currentDestination.ordinal()];
        if (i13 != 1) {
            return i13 != 3 ? AbstractC26417d.c.f104937a : m78151e(activationFlowStepModel, interfaceC30057d);
        }
        return this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.EMAIL_FIRST_BACK_NAV_FIX) ? new AbstractC26417d.a(ActivationFlowDestination.START_SCREEN, null, 2, null) : AbstractC26417d.c.f104937a;
    }

    /* JADX INFO: renamed from: g */
    private final Object m78153g(a aVar, C26418e c26418e, C26419f c26419f, boolean z4, ActivationFlowStepModel activationFlowStepModel, InterfaceC30057d<? super AbstractC26417d> interfaceC30057d) {
        int i13 = b.f104908a[aVar.ordinal()];
        if (i13 == 1) {
            return null;
        }
        if (i13 == 2) {
            return new AbstractC26417d.a(m78154h(c26418e.getCurrentDestination(), c26419f != null ? c26419f.getCurrentScreen() : null, z4), null, 2, null);
        }
        if (i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Object objM78152f = m78152f(c26418e, activationFlowStepModel, interfaceC30057d);
        return objM78152f == EnumC31071a.f128113w ? objM78152f : (AbstractC26417d) objM78152f;
    }

    /* JADX INFO: renamed from: h */
    private final ActivationFlowDestination m78154h(ActivationFlowDestination currentDestinations, ActivationFlowStepModel currentScreen, boolean authenticated) {
        if (currentDestinations == null) {
            this.logger.mo85222m("getNextDestination called with a null currentDestination; falling back to START_SCREEN", new AbstractC30556a.a[0]);
            return ActivationFlowDestination.START_SCREEN;
        }
        int i13 = b.f104909b[currentDestinations.ordinal()];
        if (i13 == 1) {
            return ActivationFlowDestination.PAIRING;
        }
        if (i13 == 2) {
            return ActivationFlowDestination.ACCOUNT_CREATION;
        }
        if (i13 == 3) {
            return currentScreen instanceof EnterYourPasswordStepModel ? ActivationFlowDestination.ACCOUNT_CREATION : ActivationFlowDestination.ACCOUNT_ACTIVATION;
        }
        if (i13 != 4) {
            return i13 != 5 ? ActivationFlowDestination.DEVICE_EDUCATION : ActivationFlowDestination.ACCOUNT_CREATION;
        }
        return ActivationFlowDestination.HOME;
    }

    /* JADX INFO: renamed from: i */
    private final ActivationFlowDestination m78155i(ActivationFlowDestination currentDestination) {
        if (currentDestination == null) {
            this.logger.mo85222m("getPreviousDestination called with a null currentDestination; falling back to null (PopBackStack)", new AbstractC30556a.a[0]);
            return null;
        }
        int i13 = b.f104909b[currentDestination.ordinal()];
        if (i13 == 1) {
            return ActivationFlowDestination.ENTER_YOUR_EMAIL;
        }
        if (i13 != 2 && i13 == 3) {
            return ActivationFlowDestination.DEVICE_EDUCATION;
        }
        return ActivationFlowDestination.DEVICE_EDUCATION;
    }

    /* JADX INFO: renamed from: j */
    private final a m78156j(int newStepIndex, int stepTotal) {
        if (newStepIndex < 0) {
            return a.EXIT_TO_PREVIOUS_FLOW;
        }
        return newStepIndex >= stepTotal ? a.EXIT_TO_NEXT_FLOW : a.CONTINUE_CURRENT_FLOW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: l */
    public final Object m78157l(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        f fVar;
        boolean z4;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f104928E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f104928E = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        f fVar2 = fVar;
        Object obj = fVar2.f104931y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = fVar2.f104928E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            boolean zIsFeatureEnabled = this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.FAMILY_PLAN_STARTER_ANDROID);
            C23997g c23997g = new C23997g(null, null, null, null, 15, null);
            InterfaceC17235b interfaceC17235b = this.experimentsChecker;
            fVar2.f104930x = null;
            fVar2.f104929w = zIsFeatureEnabled;
            fVar2.f104928E = 1;
            Object objM48741d = InterfaceC17235b.m48741d(interfaceC17235b, c23997g, 0L, false, false, fVar2, 6, null);
            if (objM48741d == enumC31071a) {
                return enumC31071a;
            }
            z4 = zIsFeatureEnabled;
            obj = objM48741d;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z4 = fVar2.f104929w;
            AbstractC34132o.m107864I(obj);
        }
        return Boolean.valueOf(z4 && AbstractC22676k.m65745e(obj, "test"));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
    
        if (r10 == r0) goto L27;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m78158k(n70.C26414a r9, q83.InterfaceC30057d<? super n70.C26418e> r10) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n70.C26416c.m78158k(n70.a, q83.d):java.lang.Object");
    }

    public /* synthetic */ C26416c(InterfaceC34116n interfaceC34116n, FeatureFlagChecker featureFlagChecker, InterfaceC17235b interfaceC17235b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ActivationProgressInteractor") : interfaceC34116n, featureFlagChecker, interfaceC17235b);
    }
}
