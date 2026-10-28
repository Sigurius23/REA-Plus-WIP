package f70;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.domain.models.EmailDialogInfo;
import com.whoop.activation.domain.models.steps.EnterEmailStepModel;
import com.whoop.activation.iajf.domain.SignUpSource;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import n70.AbstractC26417d;
import n70.C26418e;
import or2.AbstractC28190p0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: f70.h0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ6\u0010\u001f\u001a\u00020\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001f\u0010 J6\u0010#\u001a\u00020\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b#\u0010$J.\u0010%\u001a\u00020\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010,¨\u0006-"}, m65681d2 = {"Lf70/h0;", "", "Lf70/f0;", "emailCheckHelper", "Lf70/k0;", "iajfV2BffFetcher", "Lf70/i0;", "iajfSecondBatchMerger", "Ltr2/n;", "logger", "<init>", "(Lf70/f0;Lf70/k0;Lf70/i0;Ltr2/n;)V", "Lf70/e$b;", "prevDomainResult", "c", "(Lf70/e$b;)Lf70/e$b;", "Lcom/whoop/activation/domain/models/EmailDialogInfo;", "dialogInfo", "Lcom/whoop/activation/iajf/domain/SignUpSource;", "signUpSource", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lf70/e$b;Lcom/whoop/activation/domain/models/EmailDialogInfo;Lcom/whoop/activation/iajf/domain/SignUpSource;)Lf70/e$b;", "Lf70/q0;", "memberInfo", "Lf70/f;", "f", "(Lf70/q0;Lcom/whoop/activation/iajf/domain/SignUpSource;)Lf70/f;", "Lec3/m;", "Lf70/e;", "collector", "memberInfoAfterEmailCheck", "d", "(Lec3/m;Lf70/e$b;Lf70/q0;Lcom/whoop/activation/iajf/domain/SignUpSource;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;", "screenModel", "e", "(Lec3/m;Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;Lf70/e$b;Lcom/whoop/activation/iajf/domain/SignUpSource;Lq83/d;)Ljava/lang/Object;", "g", "(Lec3/m;Lf70/e$b;Lcom/whoop/activation/iajf/domain/SignUpSource;Lq83/d;)Ljava/lang/Object;", "a", "Lf70/f0;", "b", "Lf70/k0;", "Lf70/i0;", "Ltr2/n;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14183h0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C14179f0 emailCheckHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C14189k0 iajfV2BffFetcher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C14185i0 iajfSecondBatchMerger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f70.h0$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.IAJFEnterEmailHandler", m100430f = "IAJFEnterEmailHandler.kt", m100431l = {162, 170}, m100432m = "fetchSecondBatchAndMerge", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f51342E;

        /* JADX INFO: renamed from: F */
        Object f51343F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f51344G;

        /* JADX INFO: renamed from: I */
        int f51346I;

        /* JADX INFO: renamed from: w */
        Object f51347w;

        /* JADX INFO: renamed from: x */
        Object f51348x;

        /* JADX INFO: renamed from: y */
        Object f51349y;

        /* JADX INFO: renamed from: z */
        Object f51350z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51344G = obj;
            this.f51346I |= Integer.MIN_VALUE;
            return C14183h0.this.m40480d(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: f70.h0$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.IAJFEnterEmailHandler$fetchSecondBatchAndMerge$fetchResult$1", m100430f = "IAJFEnterEmailHandler.kt", m100431l = {171}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lf70/e;", "<anonymous>", "(Lbc3/c0;)Lf70/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f51351w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C14183h0.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51351w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C14189k0 c14189k0 = C14183h0.this.iajfV2BffFetcher;
            this.f51351w = 1;
            Object objM40501c = c14189k0.m40501c(this);
            return objM40501c == enumC31071a ? enumC31071a : objM40501c;
        }
    }

    /* JADX INFO: renamed from: f70.h0$c */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.IAJFEnterEmailHandler", m100430f = "IAJFEnterEmailHandler.kt", m100431l = {25, 28, 55}, m100432m = "handle", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f51353E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f51354F;

        /* JADX INFO: renamed from: H */
        int f51356H;

        /* JADX INFO: renamed from: w */
        Object f51357w;

        /* JADX INFO: renamed from: x */
        Object f51358x;

        /* JADX INFO: renamed from: y */
        Object f51359y;

        /* JADX INFO: renamed from: z */
        Object f51360z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51354F = obj;
            this.f51356H |= Integer.MIN_VALUE;
            return C14183h0.this.m40483e(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: f70.h0$d */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.IAJFEnterEmailHandler", m100430f = "IAJFEnterEmailHandler.kt", m100431l = {74, 78}, m100432m = "handleIgnoreDialog", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f51361E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f51362F;

        /* JADX INFO: renamed from: H */
        int f51364H;

        /* JADX INFO: renamed from: w */
        Object f51365w;

        /* JADX INFO: renamed from: x */
        Object f51366x;

        /* JADX INFO: renamed from: y */
        Object f51367y;

        /* JADX INFO: renamed from: z */
        Object f51368z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51362F = obj;
            this.f51364H |= Integer.MIN_VALUE;
            return C14183h0.this.m40484g(null, null, null, this);
        }
    }

    public C14183h0(C14179f0 emailCheckHelper, C14189k0 iajfV2BffFetcher, C14185i0 iajfSecondBatchMerger, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(emailCheckHelper, "emailCheckHelper");
        AbstractC22676k.m65750j(iajfV2BffFetcher, "iajfV2BffFetcher");
        AbstractC22676k.m65750j(iajfSecondBatchMerger, "iajfSecondBatchMerger");
        AbstractC22676k.m65750j(logger, "logger");
        this.emailCheckHelper = emailCheckHelper;
        this.iajfV2BffFetcher = iajfV2BffFetcher;
        this.iajfSecondBatchMerger = iajfSecondBatchMerger;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC14176e.b m40479c(InterfaceC14176e.b prevDomainResult) {
        List<ActivationFlowStepModel> listM40428m = prevDomainResult.m40428m();
        if (listM40428m != null) {
            ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(listM40428m);
            int currentStepIndex = prevDomainResult.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getCurrentStepIndex();
            if (currentStepIndex >= 0 && currentStepIndex < arrayListM74097F1.size()) {
                ActivationFlowStepModel activationFlowStepModel = (ActivationFlowStepModel) arrayListM74097F1.get(currentStepIndex);
                if (activationFlowStepModel instanceof EnterEmailStepModel) {
                    EnterEmailStepModel enterEmailStepModel = (EnterEmailStepModel) activationFlowStepModel;
                    if (enterEmailStepModel.getDialogInfo() != null) {
                        arrayListM74097F1.set(currentStepIndex, EnterEmailStepModel.copy$default(enterEmailStepModel, null, null, null, null, null, null, null, null, null, null, null, 2031, null));
                        return InterfaceC14176e.b.m40416b(prevDomainResult, arrayListM74097F1, null, null, null, null, false, null, false, null, false, false, null, null, null, null, null, null, 131070, null);
                    }
                }
            }
        }
        return prevDomainResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: d */
    public final Object m40480d(InterfaceC13062m interfaceC13062m, InterfaceC14176e.b bVar, C14201q0 c14201q0, SignUpSource signUpSource, InterfaceC30057d<? super C14178f> interfaceC30057d) {
        a aVar;
        InterfaceC14176e.b bVarM40479c;
        C14201q0 c14201q1;
        SignUpSource signUpSource2;
        C14201q0 c14201q2;
        InterfaceC14176e.b bVar2;
        SignUpSource signUpSource3;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f51346I;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f51346I = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objM85321a = aVar.f51344G;
        Object obj = EnumC31071a.f128113w;
        int i14 = aVar.f51346I;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM85321a);
            bVarM40479c = m40479c(bVar);
            if (AbstractC39414r.m125890i0(c14201q0.getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String().getValue())) {
                this.logger.mo85222m("IAJF second batch fetch skipped because email is blank.", new AbstractC30556a.a[0]);
                return new C14178f(InterfaceC14176e.b.m40416b(bVarM40479c, null, null, null, null, null, true, null, false, null, false, false, null, null, signUpSource, null, null, null, 122719, null), false);
            }
            Object objM40416b = InterfaceC14176e.b.m40416b(bVarM40479c, null, null, null, null, EnumC14168b0.LOADING, false, null, false, null, false, false, null, null, signUpSource, null, null, null, 122735, null);
            aVar.f51347w = null;
            aVar.f51348x = null;
            c14201q1 = c14201q0;
            aVar.f51349y = c14201q1;
            signUpSource2 = signUpSource;
            aVar.f51350z = signUpSource2;
            aVar.f51342E = bVarM40479c;
            aVar.f51343F = null;
            aVar.f51346I = 1;
            if (interfaceC13062m.emit(objM40416b, aVar) != obj) {
            }
            return obj;
        }
        if (i14 == 1) {
            InterfaceC14176e.b bVar3 = (InterfaceC14176e.b) aVar.f51342E;
            SignUpSource signUpSource4 = (SignUpSource) aVar.f51350z;
            C14201q0 c14201q3 = (C14201q0) aVar.f51349y;
            AbstractC34132o.m107864I(objM85321a);
            bVarM40479c = bVar3;
            c14201q1 = c14201q3;
            signUpSource2 = signUpSource4;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar2 = (InterfaceC14176e.b) aVar.f51342E;
            signUpSource3 = (SignUpSource) aVar.f51350z;
            c14201q2 = (C14201q0) aVar.f51349y;
            AbstractC34132o.m107864I(objM85321a);
        }
        return new C14178f(InterfaceC14176e.b.m40416b(this.iajfSecondBatchMerger.m40489b(bVar2, (InterfaceC14176e) objM85321a, c14201q2, signUpSource3), null, null, null, null, EnumC14168b0.CONTENT, false, null, false, null, false, false, null, null, signUpSource3, null, null, null, 122735, null), false);
        b bVar4 = new b(null);
        aVar.f51347w = null;
        aVar.f51348x = null;
        aVar.f51349y = c14201q1;
        aVar.f51350z = signUpSource2;
        aVar.f51342E = bVarM40479c;
        aVar.f51343F = null;
        aVar.f51346I = 2;
        objM85321a = AbstractC28190p0.m85321a(1000L, bVar4, aVar);
        if (objM85321a != obj) {
            c14201q2 = c14201q1;
            bVar2 = bVarM40479c;
            signUpSource3 = signUpSource2;
            return new C14178f(InterfaceC14176e.b.m40416b(this.iajfSecondBatchMerger.m40489b(bVar2, (InterfaceC14176e) objM85321a, c14201q2, signUpSource3), null, null, null, null, EnumC14168b0.CONTENT, false, null, false, null, false, false, null, null, signUpSource3, null, null, null, 122735, null), false);
        }
        return obj;
    }

    /* JADX INFO: renamed from: f */
    private final C14178f m40481f(C14201q0 memberInfo, SignUpSource signUpSource) {
        ActivationFlowDestination activationFlowDestination = ActivationFlowDestination.ENTER_YOUR_PASSWORD;
        return new C14178f(new InterfaceC14176e.b(null, new C26418e(0, 0, 0, activationFlowDestination, new AbstractC26417d.a(activationFlowDestination, null, 2, null), 6, null), null, memberInfo, null, false, null, false, null, false, false, null, null, signUpSource, null, null, null, 122869, null), false);
    }

    /* JADX INFO: renamed from: h */
    private final InterfaceC14176e.b m40482h(InterfaceC14176e.b prevDomainResult, EmailDialogInfo dialogInfo, SignUpSource signUpSource) {
        List<ActivationFlowStepModel> listM40428m = prevDomainResult.m40428m();
        List<ActivationFlowStepModel> listM74097F1 = listM40428m != null ? AbstractC25265s.m74097F1(listM40428m) : null;
        int currentStepIndex = prevDomainResult.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getCurrentStepIndex();
        if (listM74097F1 != null && currentStepIndex >= 0 && currentStepIndex < listM74097F1.size()) {
            ActivationFlowStepModel activationFlowStepModel = listM74097F1.get(currentStepIndex);
            if (activationFlowStepModel instanceof EnterEmailStepModel) {
                listM74097F1.set(currentStepIndex, EnterEmailStepModel.copy$default((EnterEmailStepModel) activationFlowStepModel, null, null, null, null, dialogInfo, null, null, null, null, null, null, 2031, null));
            }
        }
        if (listM74097F1 == null) {
            listM74097F1 = prevDomainResult.m40428m();
        }
        return InterfaceC14176e.b.m40416b(prevDomainResult, listM74097F1, C26418e.m78162b(prevDomainResult.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String(), 0, 0, 0, null, null, 15, null), null, null, null, false, null, false, null, false, false, null, null, signUpSource, null, null, null, 122748, null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:32:0x0128  */
    /* JADX WARN: Code duplicated, block: B:34:0x012e  */
    /* JADX WARN: Code duplicated, block: B:36:0x013e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0142  */
    /* JADX WARN: Code duplicated, block: B:40:0x014d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0151  */
    /* JADX WARN: Code duplicated, block: B:45:0x016c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x016d  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: e */
    public final Object m40483e(InterfaceC13062m interfaceC13062m, EnterEmailStepModel enterEmailStepModel, InterfaceC14176e.b bVar, SignUpSource signUpSource, InterfaceC30057d<? super C14178f> interfaceC30057d) {
        c cVar;
        InterfaceC14176e.b bVar2;
        EnterEmailStepModel enterEmailStepModel2;
        SignUpSource signUpSource2;
        SignUpSource signUpSource3;
        InterfaceC14176e.b bVar3;
        InterfaceC14181g0 interfaceC14181g0;
        SignUpSource signUpSource4;
        Object objM40480d;
        InterfaceC13062m interfaceC13062m2 = interfaceC13062m;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f51356H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f51356H = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object objM40445b = cVar2.f51354F;
        Object obj = EnumC31071a.f128113w;
        int i14 = cVar2.f51356H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM40445b);
            bVar2 = bVar;
            Object objM40416b = InterfaceC14176e.b.m40416b(bVar2, null, null, null, null, null, false, null, true, null, false, false, null, null, signUpSource, null, null, null, 122751, null);
            cVar2.f51357w = interfaceC13062m2;
            cVar2.f51358x = enterEmailStepModel;
            cVar2.f51359y = bVar2;
            cVar2.f51360z = signUpSource;
            cVar2.f51356H = 1;
            if (interfaceC13062m2.emit(objM40416b, cVar2) != obj) {
                enterEmailStepModel2 = enterEmailStepModel;
                signUpSource2 = signUpSource;
            }
            return obj;
        }
        if (i14 == 1) {
            SignUpSource signUpSource5 = (SignUpSource) cVar2.f51360z;
            InterfaceC14176e.b bVar4 = (InterfaceC14176e.b) cVar2.f51359y;
            enterEmailStepModel2 = (EnterEmailStepModel) cVar2.f51358x;
            InterfaceC13062m interfaceC13062m3 = (InterfaceC13062m) cVar2.f51357w;
            AbstractC34132o.m107864I(objM40445b);
            signUpSource2 = signUpSource5;
            bVar2 = bVar4;
            interfaceC13062m2 = interfaceC13062m3;
        } else {
            if (i14 != 2) {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM40445b);
                return objM40445b;
            }
            SignUpSource signUpSource6 = (SignUpSource) cVar2.f51360z;
            InterfaceC14176e.b bVar5 = (InterfaceC14176e.b) cVar2.f51359y;
            InterfaceC13062m interfaceC13062m4 = (InterfaceC13062m) cVar2.f51357w;
            AbstractC34132o.m107864I(objM40445b);
            signUpSource3 = signUpSource6;
            bVar3 = bVar5;
            interfaceC13062m2 = interfaceC13062m4;
        }
        interfaceC14181g0 = (InterfaceC14181g0) objM40445b;
        if (interfaceC14181g0 instanceof InterfaceC14181g0.a) {
            return new C14178f(InterfaceC14176e.b.m40416b(bVar3, null, null, null, null, null, true, null, false, null, false, false, null, null, signUpSource3, null, null, null, 122719, null), false);
        }
        signUpSource4 = signUpSource3;
        if (interfaceC14181g0 instanceof InterfaceC14181g0.d) {
            return new C14178f(m40482h(bVar3, ((InterfaceC14181g0.d) interfaceC14181g0).getDialogInfo(), signUpSource4), false);
        }
        if (interfaceC14181g0 instanceof InterfaceC14181g0.b) {
            return m40481f(((InterfaceC14181g0.b) interfaceC14181g0).getMemberInfo(), signUpSource4);
        }
        if (interfaceC14181g0 instanceof InterfaceC14181g0.c) {
            throw new NoWhenBranchMatchedException();
        }
        C14201q0 memberInfo = ((InterfaceC14181g0.c) interfaceC14181g0).getMemberInfo();
        cVar2.f51357w = null;
        cVar2.f51358x = null;
        cVar2.f51359y = null;
        cVar2.f51360z = null;
        cVar2.f51353E = null;
        cVar2.f51356H = 3;
        objM40480d = m40480d(interfaceC13062m2, bVar3, memberInfo, signUpSource4, cVar2);
        if (objM40480d != obj) {
            return obj;
        }
        return objM40480d;
        C14179f0 c14179f0 = this.emailCheckHelper;
        String value = bVar2.getMemberInfo().getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String().getValue();
        C14201q0 memberInfo2 = bVar2.getMemberInfo();
        cVar2.f51357w = interfaceC13062m2;
        cVar2.f51358x = null;
        cVar2.f51359y = bVar2;
        cVar2.f51360z = signUpSource2;
        cVar2.f51356H = 2;
        objM40445b = c14179f0.m40445b(value, enterEmailStepModel2, memberInfo2, signUpSource2, cVar2);
        cVar2 = cVar2;
        if (objM40445b != obj) {
            signUpSource3 = signUpSource2;
            bVar3 = bVar2;
            interfaceC14181g0 = (InterfaceC14181g0) objM40445b;
            if (interfaceC14181g0 instanceof InterfaceC14181g0.a) {
                return new C14178f(InterfaceC14176e.b.m40416b(bVar3, null, null, null, null, null, true, null, false, null, false, false, null, null, signUpSource3, null, null, null, 122719, null), false);
            }
            signUpSource4 = signUpSource3;
            if (interfaceC14181g0 instanceof InterfaceC14181g0.d) {
                return new C14178f(m40482h(bVar3, ((InterfaceC14181g0.d) interfaceC14181g0).getDialogInfo(), signUpSource4), false);
            }
            if (interfaceC14181g0 instanceof InterfaceC14181g0.b) {
                return m40481f(((InterfaceC14181g0.b) interfaceC14181g0).getMemberInfo(), signUpSource4);
            }
            if (interfaceC14181g0 instanceof InterfaceC14181g0.c) {
                throw new NoWhenBranchMatchedException();
            }
            C14201q0 memberInfo3 = ((InterfaceC14181g0.c) interfaceC14181g0).getMemberInfo();
            cVar2.f51357w = null;
            cVar2.f51358x = null;
            cVar2.f51359y = null;
            cVar2.f51360z = null;
            cVar2.f51353E = null;
            cVar2.f51356H = 3;
            objM40480d = m40480d(interfaceC13062m2, bVar3, memberInfo3, signUpSource4, cVar2);
            if (objM40480d != obj) {
                return objM40480d;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: g */
    public final Object m40484g(InterfaceC13062m interfaceC13062m, InterfaceC14176e.b bVar, SignUpSource signUpSource, InterfaceC30057d<? super C14178f> interfaceC30057d) {
        d dVar;
        InterfaceC14181g0 interfaceC14181g0M40447e;
        SignUpSource signUpSource2;
        InterfaceC14176e.b bVar2;
        InterfaceC13062m interfaceC13062m2 = interfaceC13062m;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f51364H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f51364H = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object obj = dVar2.f51362F;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = dVar2.f51364H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC14181g0M40447e = this.emailCheckHelper.m40447e(bVar);
            InterfaceC14176e.b bVarM40479c = m40479c(bVar);
            Object objM40416b = InterfaceC14176e.b.m40416b(bVarM40479c, null, null, null, null, null, false, null, true, null, false, false, null, null, signUpSource, null, null, null, 122751, null);
            dVar2.f51365w = interfaceC13062m2;
            dVar2.f51366x = null;
            signUpSource2 = signUpSource;
            dVar2.f51367y = signUpSource2;
            dVar2.f51368z = interfaceC14181g0M40447e;
            dVar2.f51361E = bVarM40479c;
            dVar2.f51364H = 1;
            if (interfaceC13062m2.emit(objM40416b, dVar2) != obj2) {
                bVar2 = bVarM40479c;
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        InterfaceC14176e.b bVar3 = (InterfaceC14176e.b) dVar2.f51361E;
        InterfaceC14181g0 interfaceC14181g0 = (InterfaceC14181g0) dVar2.f51368z;
        signUpSource2 = (SignUpSource) dVar2.f51367y;
        InterfaceC13062m interfaceC13062m3 = (InterfaceC13062m) dVar2.f51365w;
        AbstractC34132o.m107864I(obj);
        interfaceC14181g0M40447e = interfaceC14181g0;
        bVar2 = bVar3;
        interfaceC13062m2 = interfaceC13062m3;
        if (interfaceC14181g0M40447e instanceof InterfaceC14181g0.b) {
            return m40481f(((InterfaceC14181g0.b) interfaceC14181g0M40447e).getMemberInfo(), signUpSource2);
        }
        if (!(interfaceC14181g0M40447e instanceof InterfaceC14181g0.c)) {
            return new C14178f(InterfaceC14176e.b.m40416b(bVar2, null, null, null, null, null, false, null, false, null, false, false, null, null, signUpSource2, null, null, null, 122751, null), false);
        }
        C14201q0 memberInfo = ((InterfaceC14181g0.c) interfaceC14181g0M40447e).getMemberInfo();
        dVar2.f51365w = null;
        dVar2.f51366x = null;
        dVar2.f51367y = null;
        dVar2.f51368z = null;
        dVar2.f51361E = null;
        dVar2.f51364H = 2;
        Object objM40480d = m40480d(interfaceC13062m2, bVar2, memberInfo, signUpSource2, dVar2);
        return objM40480d == obj2 ? obj2 : objM40480d;
    }

    public /* synthetic */ C14183h0(C14179f0 c14179f0, C14189k0 c14189k0, C14185i0 c14185i0, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c14179f0, c14189k0, c14185i0, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("IAJFEnterEmailHandler") : interfaceC34116n);
    }
}
