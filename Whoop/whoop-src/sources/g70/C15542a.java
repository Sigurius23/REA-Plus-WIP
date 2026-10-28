package g70;

import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.domain.models.steps.FamilyPlanBlockStepModel;
import com.whoop.activation.domain.models.steps.StateSelectionStepModel;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import f70.C14203r0;
import f70.C14217y0;
import f70.InterfaceC14173d;
import f70.InterfaceC14176e;
import h80.C17003c;
import h80.InterfaceC17002b;
import java.util.List;
import java.util.Locale;
import n70.C26414a;
import n70.C26416c;
import n70.C26418e;
import n70.C26419f;
import n70.InterfaceC26415b;
import od1.C27847j;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: g70.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lg70/a;", "", "Lh80/c;", "analyticsHelper", "Ln70/c;", "progressInteractor", "Lf70/y0;", "screenAdvancementCalculator", "Lod1/j;", "pendingUserSessionRepository", "Lf70/r0;", "memberInfoHandler", "<init>", "(Lh80/c;Ln70/c;Lf70/y0;Lod1/j;Lf70/r0;)V", "Lf70/e$b;", "prevDomainResult", "b", "(Lf70/e$b;)Lf70/e$b;", "Lf70/e;", "Lf70/d$c0;", "action", "a", "(Lf70/e;Lf70/d$c0;Lq83/d;)Ljava/lang/Object;", "Lh80/c;", "Ln70/c;", "c", "Lf70/y0;", "d", "Lod1/j;", "e", "Lf70/r0;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15542a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C17003c analyticsHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C26416c progressInteractor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C14217y0 screenAdvancementCalculator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C27847j pendingUserSessionRepository;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C14203r0 memberInfoHandler;

    /* JADX INFO: renamed from: g70.a$a */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f58282a;

        static {
            int[] iArr = new int[ActivationFlowDestination.values().length];
            try {
                iArr[ActivationFlowDestination.ACCOUNT_ACTIVATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActivationFlowDestination.ACCOUNT_CREATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActivationFlowDestination.POST_PAIRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ActivationFlowDestination.PAIRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ActivationFlowDestination.DEVICE_EDUCATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f58282a = iArr;
        }
    }

    /* JADX INFO: renamed from: g70.a$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.back.PreviousNavigationOrchestrator", m100430f = "PreviousNavigationOrchestrator.kt", m100431l = {58}, m100432m = "onPrevious", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f58283E;

        /* JADX INFO: renamed from: G */
        int f58285G;

        /* JADX INFO: renamed from: w */
        Object f58286w;

        /* JADX INFO: renamed from: x */
        Object f58287x;

        /* JADX INFO: renamed from: y */
        Object f58288y;

        /* JADX INFO: renamed from: z */
        Object f58289z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f58283E = obj;
            this.f58285G |= Integer.MIN_VALUE;
            return C15542a.this.m43738a(null, null, this);
        }
    }

    public C15542a(C17003c analyticsHelper, C26416c progressInteractor, C14217y0 screenAdvancementCalculator, C27847j pendingUserSessionRepository, C14203r0 memberInfoHandler) {
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(progressInteractor, "progressInteractor");
        AbstractC22676k.m65750j(screenAdvancementCalculator, "screenAdvancementCalculator");
        AbstractC22676k.m65750j(pendingUserSessionRepository, "pendingUserSessionRepository");
        AbstractC22676k.m65750j(memberInfoHandler, "memberInfoHandler");
        this.analyticsHelper = analyticsHelper;
        this.progressInteractor = progressInteractor;
        this.screenAdvancementCalculator = screenAdvancementCalculator;
        this.pendingUserSessionRepository = pendingUserSessionRepository;
        this.memberInfoHandler = memberInfoHandler;
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC14176e.b m43737b(InterfaceC14176e.b prevDomainResult) {
        List<ActivationFlowStepModel> listM40428m = prevDomainResult.m40428m();
        return (listM40428m != null ? listM40428m.get(prevDomainResult.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getCurrentStepIndex()) : null) instanceof StateSelectionStepModel ? this.memberInfoHandler.m40597c(prevDomainResult) : prevDomainResult;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: a */
    public final Object m43738a(InterfaceC14176e interfaceC14176e, InterfaceC14173d.c0 c0Var, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        b bVar;
        InterfaceC14176e.b bVar2;
        String lowerCase;
        ActivationFlowStepModel activationFlowStepModel;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f58285G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f58285G = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f58283E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f58285G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (!(interfaceC14176e instanceof InterfaceC14176e.b)) {
                return interfaceC14176e;
            }
            InterfaceC14176e.b bVar3 = (InterfaceC14176e.b) interfaceC14176e;
            List<ActivationFlowStepModel> listM40428m = bVar3.m40428m();
            if (!((listM40428m != null ? listM40428m.get(bVar3.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getCurrentStepIndex()) : null) instanceof FamilyPlanBlockStepModel)) {
                C17003c c17003c = this.analyticsHelper;
                List<ActivationFlowStepModel> listM40428m2 = bVar3.m40428m();
                String analyticsName = (listM40428m2 == null || (activationFlowStepModel = listM40428m2.get(bVar3.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getCurrentStepIndex())) == null) ? null : activationFlowStepModel.getAnalyticsName();
                if (analyticsName == null) {
                    analyticsName = "";
                }
                int i15 = a.f58282a[c0Var.getCurrentDestination().ordinal()];
                if (i15 == 1 || i15 == 2 || i15 == 3) {
                    lowerCase = "account_creation";
                } else if (i15 == 4) {
                    lowerCase = "pairing";
                } else if (i15 != 5) {
                    lowerCase = c0Var.getCurrentDestination().name().toLowerCase(Locale.ROOT);
                    AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                } else {
                    lowerCase = "device_education";
                }
                c17003c.m47941p(new InterfaceC17002b.i(analyticsName, null, "icon", "back", lowerCase, null, 34, null));
            }
            InterfaceC14176e.b bVarM43737b = m43737b(bVar3);
            List<ActivationFlowStepModel> listM40428m3 = bVar3.m40428m();
            ActivationFlowStepModel activationFlowStepModel2 = listM40428m3 != null ? listM40428m3.get(bVar3.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getCurrentStepIndex()) : null;
            C26416c c26416c = this.progressInteractor;
            C26414a c26414a = new C26414a(new InterfaceC26415b.a(this.screenAdvancementCalculator.m40658b(bVar3), activationFlowStepModel2 != null ? new C26419f(activationFlowStepModel2, false) : null), C26418e.m78162b(bVar3.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String(), 0, 0, 0, c0Var.getCurrentDestination(), null, 23, null), this.pendingUserSessionRepository.getAccessToken() != null);
            bVar.f58286w = null;
            bVar.f58287x = null;
            bVar.f58288y = bVarM43737b;
            bVar.f58289z = null;
            bVar.f58285G = 1;
            Object objM78158k = c26416c.m78158k(c26414a, bVar);
            if (objM78158k == enumC31071a) {
                return enumC31071a;
            }
            bVar2 = bVarM43737b;
            obj = objM78158k;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC14176e.b bVar4 = (InterfaceC14176e.b) bVar.f58288y;
            AbstractC34132o.m107864I(obj);
            bVar2 = bVar4;
        }
        return InterfaceC14176e.b.m40416b(bVar2, null, (C26418e) obj, null, null, null, false, null, false, null, false, false, null, null, null, null, null, null, 130525, null);
    }
}
