package j70;

import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.iajf.domain.SignUpSource;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import ec3.InterfaceC13062m;
import f70.AbstractC14206t;
import f70.AbstractC14210v;
import f70.C14178f;
import f70.C14208u;
import f70.C14217y0;
import f70.EnumC14204s;
import f70.InterfaceC14176e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import k70.C22239a;
import l70.C23389a;
import n70.AbstractC26417d;
import n70.C26416c;
import n70.C26418e;
import od1.C27847j;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: j70.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J4\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0082@¢\u0006\u0004\b \u0010!J!\u0010%\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010\u001d2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0082@¢\u0006\u0004\b'\u0010(JF\u0010.\u001a\u00020\u001f2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001f0)2\u0006\u0010+\u001a\u00020\u001f2\b\b\u0002\u0010\u001c\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010-\u001a\u00020,H\u0086@¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00107R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00108R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00109R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010:¨\u0006;"}, m65681d2 = {"Lj70/a;", "", "Ln70/c;", "progressInteractor", "Lod1/j;", "pendingUserSessionRepository", "Ll70/a;", "activationExperimentsHelper", "Lj70/c;", "nextScreenAnalyticsTracker", "Lj70/d;", "screenSpecificForwardActionHandler", "Lk70/a;", "onCompleteFlowResolver", "Lf70/y0;", "screenAdvancementCalculator", "Lf70/u;", "appDestinationRouter", "<init>", "(Ln70/c;Lod1/j;Ll70/a;Lj70/c;Lj70/d;Lk70/a;Lf70/y0;Lf70/u;)V", "Lf70/e$b;", "result", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lf70/e$b;)Z", "updatedDomainResult", "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "currentScreen", "isSkipAction", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "specifiedCurrentDestination", "Lf70/e;", "e", "(Lf70/e$b;Lcom/whoop/activation/domain/models/ActivationFlowStepModel;ZLcom/whoop/activation/view/navigation/ActivationFlowDestination;Lq83/d;)Ljava/lang/Object;", "currentDestination", "Ln70/e;", "progressResult", "f", "(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/e;)Z", "g", "(Ln70/e;Lq83/d;)Ljava/lang/Object;", "Lec3/m;", "collector", "prevDomainResult", "Lcom/whoop/activation/iajf/domain/SignUpSource;", "signUpSource", "c", "(Lec3/m;Lf70/e;ZLcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;Lq83/d;)Ljava/lang/Object;", "a", "Ln70/c;", "b", "Lod1/j;", "Ll70/a;", "d", "Lj70/c;", "Lj70/d;", "Lk70/a;", "Lf70/y0;", "Lf70/u;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21389a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C26416c progressInteractor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C27847j pendingUserSessionRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C23389a activationExperimentsHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C21391c nextScreenAnalyticsTracker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C21392d screenSpecificForwardActionHandler;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C22239a onCompleteFlowResolver;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C14217y0 screenAdvancementCalculator;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C14208u appDestinationRouter;

    /* JADX INFO: renamed from: j70.a$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.forward.ForwardNavigationOrchestrator", m100430f = "ForwardNavigationOrchestrator.kt", m100431l = {56, 63, 74, 78}, m100432m = "advance", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f81822E;

        /* JADX INFO: renamed from: F */
        Object f81823F;

        /* JADX INFO: renamed from: G */
        Object f81824G;

        /* JADX INFO: renamed from: H */
        Object f81825H;

        /* JADX INFO: renamed from: I */
        boolean f81826I;

        /* JADX INFO: renamed from: J */
        boolean f81827J;

        /* JADX INFO: renamed from: K */
        /* synthetic */ Object f81828K;

        /* JADX INFO: renamed from: M */
        int f81830M;

        /* JADX INFO: renamed from: w */
        Object f81831w;

        /* JADX INFO: renamed from: x */
        Object f81832x;

        /* JADX INFO: renamed from: y */
        Object f81833y;

        /* JADX INFO: renamed from: z */
        Object f81834z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f81828K = obj;
            this.f81830M |= Integer.MIN_VALUE;
            return C21389a.this.m60037c(null, null, false, null, null, this);
        }
    }

    /* JADX INFO: renamed from: j70.a$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.forward.ForwardNavigationOrchestrator", m100430f = "ForwardNavigationOrchestrator.kt", m100431l = {101, 119}, m100432m = "advanceToNextScreen", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        boolean f81835E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f81836F;

        /* JADX INFO: renamed from: H */
        int f81838H;

        /* JADX INFO: renamed from: w */
        Object f81839w;

        /* JADX INFO: renamed from: x */
        Object f81840x;

        /* JADX INFO: renamed from: y */
        Object f81841y;

        /* JADX INFO: renamed from: z */
        Object f81842z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f81836F = obj;
            this.f81838H |= Integer.MIN_VALUE;
            return C21389a.this.m60033e(null, null, false, null, this);
        }
    }

    /* JADX INFO: renamed from: j70.a$c */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.forward.ForwardNavigationOrchestrator", m100430f = "ForwardNavigationOrchestrator.kt", m100431l = {145}, m100432m = "resolvePostAccountCreationDestination", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f81843w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f81844x;

        /* JADX INFO: renamed from: z */
        int f81846z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f81844x = obj;
            this.f81846z |= Integer.MIN_VALUE;
            return C21389a.this.m60035g(null, this);
        }
    }

    public C21389a(C26416c progressInteractor, C27847j pendingUserSessionRepository, C23389a activationExperimentsHelper, C21391c nextScreenAnalyticsTracker, C21392d screenSpecificForwardActionHandler, C22239a onCompleteFlowResolver, C14217y0 screenAdvancementCalculator, C14208u appDestinationRouter) {
        AbstractC22676k.m65750j(progressInteractor, "progressInteractor");
        AbstractC22676k.m65750j(pendingUserSessionRepository, "pendingUserSessionRepository");
        AbstractC22676k.m65750j(activationExperimentsHelper, "activationExperimentsHelper");
        AbstractC22676k.m65750j(nextScreenAnalyticsTracker, "nextScreenAnalyticsTracker");
        AbstractC22676k.m65750j(screenSpecificForwardActionHandler, "screenSpecificForwardActionHandler");
        AbstractC22676k.m65750j(onCompleteFlowResolver, "onCompleteFlowResolver");
        AbstractC22676k.m65750j(screenAdvancementCalculator, "screenAdvancementCalculator");
        AbstractC22676k.m65750j(appDestinationRouter, "appDestinationRouter");
        this.progressInteractor = progressInteractor;
        this.pendingUserSessionRepository = pendingUserSessionRepository;
        this.activationExperimentsHelper = activationExperimentsHelper;
        this.nextScreenAnalyticsTracker = nextScreenAnalyticsTracker;
        this.screenSpecificForwardActionHandler = screenSpecificForwardActionHandler;
        this.onCompleteFlowResolver = onCompleteFlowResolver;
        this.screenAdvancementCalculator = screenAdvancementCalculator;
        this.appDestinationRouter = appDestinationRouter;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m60032d(C21389a c21389a, InterfaceC13062m interfaceC13062m, InterfaceC14176e interfaceC14176e, boolean z4, ActivationFlowDestination activationFlowDestination, SignUpSource signUpSource, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        boolean z13 = z4;
        if ((i13 & 8) != 0) {
            activationFlowDestination = null;
        }
        ActivationFlowDestination activationFlowDestination2 = activationFlowDestination;
        if ((i13 & 16) != 0) {
            signUpSource = SignUpSource.ACTIVATION;
        }
        return c21389a.m60037c(interfaceC13062m, interfaceC14176e, z13, activationFlowDestination2, signUpSource, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d7, code lost:
    
        if (r4 == r6) goto L36;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m60033e(f70.InterfaceC14176e.b r26, com.whoop.activation.domain.models.ActivationFlowStepModel r27, boolean r28, com.whoop.activation.view.navigation.ActivationFlowDestination r29, q83.InterfaceC30057d<? super f70.InterfaceC14176e> r30) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j70.C21389a.m60033e(f70.e$b, com.whoop.activation.domain.models.ActivationFlowStepModel, boolean, com.whoop.activation.view.navigation.ActivationFlowDestination, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: f */
    private final boolean m60034f(ActivationFlowDestination currentDestination, C26418e progressResult) {
        AbstractC26417d navigationAction = progressResult.getNavigationAction();
        return currentDestination == ActivationFlowDestination.ACCOUNT_CREATION && (navigationAction instanceof AbstractC26417d.a) && ((AbstractC26417d.a) navigationAction).getDestination() == ActivationFlowDestination.ACCOUNT_ACTIVATION;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: g */
    public final Object m60035g(C26418e c26418e, InterfaceC30057d<? super C26418e> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f81846z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f81846z = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object objM40606e = cVar2.f81844x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar2.f81846z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM40606e);
            C14208u c14208u = this.appDestinationRouter;
            EnumC14204s enumC14204s = EnumC14204s.POST_SIGN_UP;
            cVar2.f81843w = c26418e;
            cVar2.f81846z = 1;
            objM40606e = C14208u.m40606e(c14208u, enumC14204s, null, cVar2, 2, null);
            if (objM40606e == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c26418e = (C26418e) cVar2.f81843w;
            AbstractC34132o.m107864I(objM40606e);
        }
        C26418e c26418e2 = c26418e;
        AbstractC14206t abstractC14206t = (AbstractC14206t) objM40606e;
        if (abstractC14206t instanceof AbstractC14206t.b) {
            return C26418e.m78162b(c26418e2, 0, 0, 0, null, new AbstractC26417d.b(((AbstractC14206t.b) abstractC14206t).getAction()), 15, null);
        }
        if (abstractC14206t instanceof AbstractC14206t.a) {
            return C26418e.m78162b(c26418e2, 0, 0, 0, null, AbstractC14210v.m40611b((AbstractC14206t.a) abstractC14206t), 15, null);
        }
        if (abstractC14206t instanceof AbstractC14206t.c) {
            return c26418e2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: h */
    private final boolean m60036h(InterfaceC14176e.b result) {
        return result.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getCurrentStepIndex() + this.screenAdvancementCalculator.m40657a(result) >= result.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getStepTotal();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0133  */
    /* JADX WARN: Code duplicated, block: B:40:0x013b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0157  */
    /* JADX WARN: Code duplicated, block: B:47:0x0170  */
    /* JADX WARN: Code duplicated, block: B:49:0x0176  */
    /* JADX WARN: Code duplicated, block: B:52:0x0199  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x01c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x01c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: c */
    public final Object m60037c(InterfaceC13062m interfaceC13062m, InterfaceC14176e interfaceC14176e, boolean z4, ActivationFlowDestination activationFlowDestination, SignUpSource signUpSource, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        a aVar;
        SignUpSource signUpSource2;
        boolean z13;
        ActivationFlowStepModel activationFlowStepModel;
        SignUpSource signUpSource3;
        ActivationFlowDestination activationFlowDestination2;
        InterfaceC14176e.b bVar;
        InterfaceC14176e.b bVar2;
        ActivationFlowStepModel activationFlowStepModel2;
        InterfaceC13062m interfaceC13062m2;
        Object objM60055k;
        boolean z14;
        InterfaceC13062m interfaceC13062m3;
        ActivationFlowStepModel activationFlowStepModel3;
        ActivationFlowDestination activationFlowDestination3;
        C14178f c14178f;
        ActivationFlowStepModel activationFlowStepModel4;
        ActivationFlowDestination activationFlowDestination4;
        InterfaceC14176e.b result;
        boolean shouldMoveForward;
        Object objM63749h;
        InterfaceC14176e.b bVar3;
        ActivationFlowStepModel activationFlowStepModel5;
        boolean z15;
        InterfaceC14176e interfaceC14176e2;
        Object objM60033e;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f81830M;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f81830M = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f81828K;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = aVar2.f81830M;
        if (i14 != 0) {
            if (i14 == 1) {
                z4 = aVar2.f81826I;
                SignUpSource signUpSource4 = (SignUpSource) aVar2.f81824G;
                activationFlowStepModel2 = (ActivationFlowStepModel) aVar2.f81823F;
                InterfaceC14176e.b bVar4 = (InterfaceC14176e.b) aVar2.f81822E;
                ActivationFlowDestination activationFlowDestination5 = (ActivationFlowDestination) aVar2.f81833y;
                InterfaceC13062m interfaceC13062m4 = (InterfaceC13062m) aVar2.f81831w;
                AbstractC34132o.m107864I(obj);
                bVar2 = bVar4;
                activationFlowDestination = activationFlowDestination5;
                signUpSource2 = signUpSource4;
                interfaceC13062m = interfaceC13062m4;
            } else {
                if (i14 == 2) {
                    z14 = aVar2.f81826I;
                    activationFlowStepModel3 = (ActivationFlowStepModel) aVar2.f81823F;
                    activationFlowDestination3 = (ActivationFlowDestination) aVar2.f81833y;
                    interfaceC13062m3 = (InterfaceC13062m) aVar2.f81831w;
                    AbstractC34132o.m107864I(obj);
                    C14178f c14178f2 = (C14178f) obj;
                    InterfaceC13062m interfaceC13062m5 = interfaceC13062m3;
                    activationFlowStepModel4 = activationFlowStepModel3;
                    interfaceC13062m2 = interfaceC13062m5;
                    z13 = z14;
                    c14178f = c14178f2;
                    activationFlowDestination4 = activationFlowDestination3;
                    result = c14178f.getResult();
                    shouldMoveForward = c14178f.getShouldMoveForward();
                    if (!shouldMoveForward) {
                        this.nextScreenAnalyticsTracker.m60041b(result);
                        return result;
                    }
                    C22239a c22239a = this.onCompleteFlowResolver;
                    boolean zM60036h = m60036h(result);
                    aVar2.f81831w = null;
                    aVar2.f81832x = null;
                    aVar2.f81833y = activationFlowDestination4;
                    aVar2.f81834z = null;
                    aVar2.f81822E = null;
                    aVar2.f81823F = activationFlowStepModel4;
                    aVar2.f81824G = null;
                    aVar2.f81825H = result;
                    aVar2.f81826I = z13;
                    aVar2.f81827J = shouldMoveForward;
                    aVar2.f81830M = 3;
                    objM63749h = c22239a.m63749h(interfaceC13062m2, result, zM60036h, aVar2);
                    if (objM63749h != obj2) {
                        boolean z16 = z13;
                        obj = objM63749h;
                        bVar3 = result;
                        activationFlowStepModel5 = activationFlowStepModel4;
                        z15 = z16;
                    }
                    return obj2;
                }
                if (i14 != 3) {
                    if (i14 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                shouldMoveForward = aVar2.f81827J;
                boolean z17 = aVar2.f81826I;
                InterfaceC14176e.b bVar5 = (InterfaceC14176e.b) aVar2.f81825H;
                ActivationFlowStepModel activationFlowStepModel6 = (ActivationFlowStepModel) aVar2.f81823F;
                activationFlowDestination4 = (ActivationFlowDestination) aVar2.f81833y;
                AbstractC34132o.m107864I(obj);
                z15 = z17;
                bVar3 = bVar5;
                activationFlowStepModel5 = activationFlowStepModel6;
            }
            interfaceC14176e2 = (InterfaceC14176e) obj;
            if (interfaceC14176e2 != null) {
                return interfaceC14176e2;
            }
            aVar2.f81831w = null;
            aVar2.f81832x = null;
            aVar2.f81833y = null;
            aVar2.f81834z = null;
            aVar2.f81822E = null;
            aVar2.f81823F = null;
            aVar2.f81824G = null;
            aVar2.f81825H = null;
            aVar2.f81826I = z15;
            aVar2.f81827J = shouldMoveForward;
            aVar2.f81830M = 4;
            objM60033e = m60033e(bVar3, activationFlowStepModel5, z15, activationFlowDestination4, aVar2);
            if (objM60033e == obj2) {
                return obj2;
            }
            return objM60033e;
        }
        AbstractC34132o.m107864I(obj);
        if (!(interfaceC14176e instanceof InterfaceC14176e.b)) {
            return interfaceC14176e;
        }
        InterfaceC14176e.b bVarM60039b = AbstractC21390b.m60039b((InterfaceC14176e.b) interfaceC14176e, signUpSource);
        List<ActivationFlowStepModel> listM40428m = bVarM60039b.m40428m();
        ActivationFlowStepModel activationFlowStepModel7 = listM40428m != null ? listM40428m.get(bVarM60039b.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getCurrentStepIndex()) : null;
        signUpSource2 = bVarM60039b.getSignUpSource();
        this.nextScreenAnalyticsTracker.m60040a(activationFlowStepModel7, bVarM60039b, z4);
        if (activationFlowDestination != ActivationFlowDestination.PAIRING || z4) {
            z13 = z4;
            activationFlowStepModel = activationFlowStepModel7;
            signUpSource3 = signUpSource2;
            activationFlowDestination2 = activationFlowDestination;
            bVar = bVarM60039b;
            interfaceC13062m2 = interfaceC13062m;
            if (z13) {
                c14178f = new C14178f(bVar, true);
                activationFlowStepModel4 = activationFlowStepModel;
                activationFlowDestination4 = activationFlowDestination2;
                result = c14178f.getResult();
                shouldMoveForward = c14178f.getShouldMoveForward();
                if (!shouldMoveForward) {
                    this.nextScreenAnalyticsTracker.m60041b(result);
                    return result;
                }
                C22239a c22239a2 = this.onCompleteFlowResolver;
                boolean zM60036h2 = m60036h(result);
                aVar2.f81831w = null;
                aVar2.f81832x = null;
                aVar2.f81833y = activationFlowDestination4;
                aVar2.f81834z = null;
                aVar2.f81822E = null;
                aVar2.f81823F = activationFlowStepModel4;
                aVar2.f81824G = null;
                aVar2.f81825H = result;
                aVar2.f81826I = z13;
                aVar2.f81827J = shouldMoveForward;
                aVar2.f81830M = 3;
                objM63749h = c22239a2.m63749h(interfaceC13062m2, result, zM60036h2, aVar2);
                if (objM63749h != obj2) {
                    boolean z18 = z13;
                    obj = objM63749h;
                    bVar3 = result;
                    activationFlowStepModel5 = activationFlowStepModel4;
                    z15 = z18;
                    interfaceC14176e2 = (InterfaceC14176e) obj;
                    if (interfaceC14176e2 != null) {
                        return interfaceC14176e2;
                    }
                    aVar2.f81831w = null;
                    aVar2.f81832x = null;
                    aVar2.f81833y = null;
                    aVar2.f81834z = null;
                    aVar2.f81822E = null;
                    aVar2.f81823F = null;
                    aVar2.f81824G = null;
                    aVar2.f81825H = null;
                    aVar2.f81826I = z15;
                    aVar2.f81827J = shouldMoveForward;
                    aVar2.f81830M = 4;
                    objM60033e = m60033e(bVar3, activationFlowStepModel5, z15, activationFlowDestination4, aVar2);
                    if (objM60033e == obj2) {
                        return objM60033e;
                    }
                }
            } else {
                C21392d c21392d = this.screenSpecificForwardActionHandler;
                aVar2.f81831w = interfaceC13062m2;
                aVar2.f81832x = null;
                aVar2.f81833y = activationFlowDestination2;
                aVar2.f81834z = null;
                aVar2.f81822E = null;
                aVar2.f81823F = activationFlowStepModel;
                aVar2.f81824G = null;
                aVar2.f81826I = z13;
                aVar2.f81830M = 2;
                objM60055k = c21392d.m60055k(interfaceC13062m2, activationFlowStepModel, bVar, signUpSource3, aVar2);
                if (objM60055k != obj2) {
                    boolean z19 = z13;
                    obj = objM60055k;
                    z14 = z19;
                    interfaceC13062m3 = interfaceC13062m2;
                    activationFlowStepModel3 = activationFlowStepModel;
                    activationFlowDestination3 = activationFlowDestination2;
                    C14178f c14178f3 = (C14178f) obj;
                    InterfaceC13062m interfaceC13062m6 = interfaceC13062m3;
                    activationFlowStepModel4 = activationFlowStepModel3;
                    interfaceC13062m2 = interfaceC13062m6;
                    z13 = z14;
                    c14178f = c14178f3;
                    activationFlowDestination4 = activationFlowDestination3;
                    result = c14178f.getResult();
                    shouldMoveForward = c14178f.getShouldMoveForward();
                    if (!shouldMoveForward) {
                        this.nextScreenAnalyticsTracker.m60041b(result);
                        return result;
                    }
                    C22239a c22239a3 = this.onCompleteFlowResolver;
                    boolean zM60036h3 = m60036h(result);
                    aVar2.f81831w = null;
                    aVar2.f81832x = null;
                    aVar2.f81833y = activationFlowDestination4;
                    aVar2.f81834z = null;
                    aVar2.f81822E = null;
                    aVar2.f81823F = activationFlowStepModel4;
                    aVar2.f81824G = null;
                    aVar2.f81825H = result;
                    aVar2.f81826I = z13;
                    aVar2.f81827J = shouldMoveForward;
                    aVar2.f81830M = 3;
                    objM63749h = c22239a3.m63749h(interfaceC13062m2, result, zM60036h3, aVar2);
                    if (objM63749h != obj2) {
                        boolean z110 = z13;
                        obj = objM63749h;
                        bVar3 = result;
                        activationFlowStepModel5 = activationFlowStepModel4;
                        z15 = z110;
                        interfaceC14176e2 = (InterfaceC14176e) obj;
                        if (interfaceC14176e2 != null) {
                            return interfaceC14176e2;
                        }
                        aVar2.f81831w = null;
                        aVar2.f81832x = null;
                        aVar2.f81833y = null;
                        aVar2.f81834z = null;
                        aVar2.f81822E = null;
                        aVar2.f81823F = null;
                        aVar2.f81824G = null;
                        aVar2.f81825H = null;
                        aVar2.f81826I = z15;
                        aVar2.f81827J = shouldMoveForward;
                        aVar2.f81830M = 4;
                        objM60033e = m60033e(bVar3, activationFlowStepModel5, z15, activationFlowDestination4, aVar2);
                        if (objM60033e == obj2) {
                            return objM60033e;
                        }
                    }
                }
            }
        } else {
            C23389a c23389a = this.activationExperimentsHelper;
            aVar2.f81831w = interfaceC13062m;
            aVar2.f81832x = null;
            aVar2.f81833y = activationFlowDestination;
            aVar2.f81834z = null;
            aVar2.f81822E = bVarM60039b;
            aVar2.f81823F = activationFlowStepModel7;
            aVar2.f81824G = signUpSource2;
            aVar2.f81826I = z4;
            aVar2.f81830M = 1;
            if (c23389a.m67687b(aVar2) != obj2) {
                ActivationFlowStepModel activationFlowStepModel8 = activationFlowStepModel7;
                bVar2 = bVarM60039b;
                activationFlowStepModel2 = activationFlowStepModel8;
            }
        }
        return obj2;
        activationFlowDestination2 = activationFlowDestination;
        bVar = bVar2;
        signUpSource3 = signUpSource2;
        z13 = z4;
        activationFlowStepModel = activationFlowStepModel2;
        interfaceC13062m2 = interfaceC13062m;
        if (z13) {
            c14178f = new C14178f(bVar, true);
            activationFlowStepModel4 = activationFlowStepModel;
            activationFlowDestination4 = activationFlowDestination2;
            result = c14178f.getResult();
            shouldMoveForward = c14178f.getShouldMoveForward();
            if (!shouldMoveForward) {
                this.nextScreenAnalyticsTracker.m60041b(result);
                return result;
            }
            C22239a c22239a4 = this.onCompleteFlowResolver;
            boolean zM60036h4 = m60036h(result);
            aVar2.f81831w = null;
            aVar2.f81832x = null;
            aVar2.f81833y = activationFlowDestination4;
            aVar2.f81834z = null;
            aVar2.f81822E = null;
            aVar2.f81823F = activationFlowStepModel4;
            aVar2.f81824G = null;
            aVar2.f81825H = result;
            aVar2.f81826I = z13;
            aVar2.f81827J = shouldMoveForward;
            aVar2.f81830M = 3;
            objM63749h = c22239a4.m63749h(interfaceC13062m2, result, zM60036h4, aVar2);
            if (objM63749h != obj2) {
                boolean z111 = z13;
                obj = objM63749h;
                bVar3 = result;
                activationFlowStepModel5 = activationFlowStepModel4;
                z15 = z111;
                interfaceC14176e2 = (InterfaceC14176e) obj;
                if (interfaceC14176e2 != null) {
                    return interfaceC14176e2;
                }
                aVar2.f81831w = null;
                aVar2.f81832x = null;
                aVar2.f81833y = null;
                aVar2.f81834z = null;
                aVar2.f81822E = null;
                aVar2.f81823F = null;
                aVar2.f81824G = null;
                aVar2.f81825H = null;
                aVar2.f81826I = z15;
                aVar2.f81827J = shouldMoveForward;
                aVar2.f81830M = 4;
                objM60033e = m60033e(bVar3, activationFlowStepModel5, z15, activationFlowDestination4, aVar2);
                if (objM60033e == obj2) {
                    return objM60033e;
                }
            }
        } else {
            C21392d c21392d2 = this.screenSpecificForwardActionHandler;
            aVar2.f81831w = interfaceC13062m2;
            aVar2.f81832x = null;
            aVar2.f81833y = activationFlowDestination2;
            aVar2.f81834z = null;
            aVar2.f81822E = null;
            aVar2.f81823F = activationFlowStepModel;
            aVar2.f81824G = null;
            aVar2.f81826I = z13;
            aVar2.f81830M = 2;
            objM60055k = c21392d2.m60055k(interfaceC13062m2, activationFlowStepModel, bVar, signUpSource3, aVar2);
            if (objM60055k != obj2) {
                boolean z112 = z13;
                obj = objM60055k;
                z14 = z112;
                interfaceC13062m3 = interfaceC13062m2;
                activationFlowStepModel3 = activationFlowStepModel;
                activationFlowDestination3 = activationFlowDestination2;
                C14178f c14178f4 = (C14178f) obj;
                InterfaceC13062m interfaceC13062m7 = interfaceC13062m3;
                activationFlowStepModel4 = activationFlowStepModel3;
                interfaceC13062m2 = interfaceC13062m7;
                z13 = z14;
                c14178f = c14178f4;
                activationFlowDestination4 = activationFlowDestination3;
                result = c14178f.getResult();
                shouldMoveForward = c14178f.getShouldMoveForward();
                if (!shouldMoveForward) {
                    this.nextScreenAnalyticsTracker.m60041b(result);
                    return result;
                }
                C22239a c22239a5 = this.onCompleteFlowResolver;
                boolean zM60036h5 = m60036h(result);
                aVar2.f81831w = null;
                aVar2.f81832x = null;
                aVar2.f81833y = activationFlowDestination4;
                aVar2.f81834z = null;
                aVar2.f81822E = null;
                aVar2.f81823F = activationFlowStepModel4;
                aVar2.f81824G = null;
                aVar2.f81825H = result;
                aVar2.f81826I = z13;
                aVar2.f81827J = shouldMoveForward;
                aVar2.f81830M = 3;
                objM63749h = c22239a5.m63749h(interfaceC13062m2, result, zM60036h5, aVar2);
                if (objM63749h != obj2) {
                    boolean z113 = z13;
                    obj = objM63749h;
                    bVar3 = result;
                    activationFlowStepModel5 = activationFlowStepModel4;
                    z15 = z113;
                    interfaceC14176e2 = (InterfaceC14176e) obj;
                    if (interfaceC14176e2 != null) {
                        return interfaceC14176e2;
                    }
                    aVar2.f81831w = null;
                    aVar2.f81832x = null;
                    aVar2.f81833y = null;
                    aVar2.f81834z = null;
                    aVar2.f81822E = null;
                    aVar2.f81823F = null;
                    aVar2.f81824G = null;
                    aVar2.f81825H = null;
                    aVar2.f81826I = z15;
                    aVar2.f81827J = shouldMoveForward;
                    aVar2.f81830M = 4;
                    objM60033e = m60033e(bVar3, activationFlowStepModel5, z15, activationFlowDestination4, aVar2);
                    if (objM60033e == obj2) {
                        return objM60033e;
                    }
                }
            }
        }
        return obj2;
    }
}
