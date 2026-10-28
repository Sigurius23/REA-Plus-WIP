package f70;

import com.whoop.activation.domain.ActivationApi;
import com.whoop.activation.domain.ActivationAuthenticatedApi;
import com.whoop.activation.domain.models.ActivationFlowSignupBody;
import com.whoop.activation.domain.models.FinishAccountCreationBody;
import com.whoop.data.datastore.EmailDataStoreHelper;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.domain.model.AuthMaterial;
import com.whoop.domain.model.WhoopStrapInfo;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import l83.C23454a0;
import od1.C27847j;
import p505ts.AbstractC34132o;
import p70.InterfaceC28954b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s70.AbstractC32238a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: f70.z0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010$R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010&¨\u0006'"}, m65681d2 = {"Lf70/z0;", "", "Lcom/whoop/activation/domain/ActivationApi;", "activationApi", "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;", "activationAuthenticatedApi", "Lod1/j;", "pendingUserSessionRepository", "Lp70/b;", "whoopStrapInfoProvider", "Lcom/whoop/data/datastore/EmailDataStoreHelper;", "emailDataStoreHelper", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/activation/domain/ActivationApi;Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lod1/j;Lp70/b;Lcom/whoop/data/datastore/EmailDataStoreHelper;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V", "Lcom/whoop/domain/model/AuthMaterial;", "pendingAuthMaterial", "Lf70/e$b;", "prevDomainResult", "Lf70/f;", "e", "(Lcom/whoop/domain/model/AuthMaterial;Lf70/e$b;Lq83/d;)Ljava/lang/Object;", "g", "(Lf70/e$b;Lq83/d;)Ljava/lang/Object;", "f", "a", "Lcom/whoop/activation/domain/ActivationApi;", "b", "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;", "c", "Lod1/j;", "d", "Lp70/b;", "Lcom/whoop/data/datastore/EmailDataStoreHelper;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Ltr2/n;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14219z0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ActivationApi activationApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ActivationAuthenticatedApi activationAuthenticatedApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C27847j pendingUserSessionRepository;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC28954b whoopStrapInfoProvider;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EmailDataStoreHelper emailDataStoreHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f70.z0$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.SignUpHelper", m100430f = "SignUpHelper.kt", m100431l = {62}, m100432m = "finishAccountCreationCase", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f51919E;

        /* JADX INFO: renamed from: G */
        int f51921G;

        /* JADX INFO: renamed from: w */
        Object f51922w;

        /* JADX INFO: renamed from: x */
        Object f51923x;

        /* JADX INFO: renamed from: y */
        Object f51924y;

        /* JADX INFO: renamed from: z */
        Object f51925z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51919E = obj;
            this.f51921G |= Integer.MIN_VALUE;
            return C14219z0.this.m40665e(null, null, this);
        }
    }

    /* JADX INFO: renamed from: f70.z0$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.SignUpHelper$finishAccountCreationCase$response$1", m100430f = "SignUpHelper.kt", m100431l = {63}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f51926w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ FinishAccountCreationBody f51928y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ WhoopStrapInfo f51929z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FinishAccountCreationBody finishAccountCreationBody, WhoopStrapInfo whoopStrapInfo, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f51928y = finishAccountCreationBody;
            this.f51929z = whoopStrapInfo;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14219z0.this.new b(this.f51928y, this.f51929z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String strapSignature;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51926w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ActivationAuthenticatedApi activationAuthenticatedApi = C14219z0.this.activationAuthenticatedApi;
            FinishAccountCreationBody finishAccountCreationBody = this.f51928y;
            WhoopStrapInfo whoopStrapInfo = this.f51929z;
            if (whoopStrapInfo == null || (strapSignature = whoopStrapInfo.getStrapSignature()) == null) {
                strapSignature = "";
            }
            this.f51926w = 1;
            Object objFinishAccountCreation = activationAuthenticatedApi.finishAccountCreation(finishAccountCreationBody, strapSignature, this);
            return objFinishAccountCreation == enumC31071a ? enumC31071a : objFinishAccountCreation;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: f70.z0$c */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.SignUpHelper", m100430f = "SignUpHelper.kt", m100431l = {40, 42}, m100432m = "signUpAndAdvance", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f51931F;

        /* JADX INFO: renamed from: w */
        Object f51932w;

        /* JADX INFO: renamed from: x */
        Object f51933x;

        /* JADX INFO: renamed from: y */
        int f51934y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f51935z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51935z = obj;
            this.f51931F |= Integer.MIN_VALUE;
            return C14219z0.this.m40667f(null, this);
        }
    }

    /* JADX INFO: renamed from: f70.z0$d */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.SignUpHelper", m100430f = "SignUpHelper.kt", m100431l = {AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB, 110}, m100432m = "signUpCase", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f51936E;

        /* JADX INFO: renamed from: G */
        int f51938G;

        /* JADX INFO: renamed from: w */
        Object f51939w;

        /* JADX INFO: renamed from: x */
        Object f51940x;

        /* JADX INFO: renamed from: y */
        Object f51941y;

        /* JADX INFO: renamed from: z */
        int f51942z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51936E = obj;
            this.f51938G |= Integer.MIN_VALUE;
            return C14219z0.this.m40666g(null, this);
        }
    }

    /* JADX INFO: renamed from: f70.z0$e */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.SignUpHelper$signUpCase$response$1", m100430f = "SignUpHelper.kt", m100431l = {111}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/domain/model/AuthMaterial;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f51943w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ActivationFlowSignupBody f51945y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ WhoopStrapInfo f51946z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ActivationFlowSignupBody activationFlowSignupBody, WhoopStrapInfo whoopStrapInfo, InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f51945y = activationFlowSignupBody;
            this.f51946z = whoopStrapInfo;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14219z0.this.new e(this.f51945y, this.f51946z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String strapSignature;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51943w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ActivationApi activationApi = C14219z0.this.activationApi;
            ActivationFlowSignupBody activationFlowSignupBody = this.f51945y;
            WhoopStrapInfo whoopStrapInfo = this.f51946z;
            if (whoopStrapInfo == null || (strapSignature = whoopStrapInfo.getStrapSignature()) == null) {
                strapSignature = "";
            }
            this.f51943w = 1;
            Object objSignUp = activationApi.signUp(activationFlowSignupBody, strapSignature, this);
            return objSignUp == enumC31071a ? enumC31071a : objSignUp;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super AuthMaterial> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C14219z0(ActivationApi activationApi, ActivationAuthenticatedApi activationAuthenticatedApi, C27847j pendingUserSessionRepository, InterfaceC28954b whoopStrapInfoProvider, EmailDataStoreHelper emailDataStoreHelper, FeatureFlagChecker featureFlagChecker, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(activationApi, "activationApi");
        AbstractC22676k.m65750j(activationAuthenticatedApi, "activationAuthenticatedApi");
        AbstractC22676k.m65750j(pendingUserSessionRepository, "pendingUserSessionRepository");
        AbstractC22676k.m65750j(whoopStrapInfoProvider, "whoopStrapInfoProvider");
        AbstractC22676k.m65750j(emailDataStoreHelper, "emailDataStoreHelper");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(logger, "logger");
        this.activationApi = activationApi;
        this.activationAuthenticatedApi = activationAuthenticatedApi;
        this.pendingUserSessionRepository = pendingUserSessionRepository;
        this.whoopStrapInfoProvider = whoopStrapInfoProvider;
        this.emailDataStoreHelper = emailDataStoreHelper;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: e */
    public final Object m40665e(AuthMaterial authMaterial, InterfaceC14176e.b bVar, InterfaceC30057d<? super C14178f> interfaceC30057d) {
        a aVar;
        AuthMaterial authMaterial2;
        InterfaceC14176e.b bVar2 = bVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f51921G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f51921G = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f51919E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f51921G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            WhoopStrapInfo whoopStrapInfoMo87912a = this.whoopStrapInfoProvider.mo87912a();
            if (whoopStrapInfoMo87912a == null && !this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.ACCOUNT_CREATION_SKIP_STRAP_INFO_CHECK)) {
                return new C14178f(bVar2, false);
            }
            FinishAccountCreationBody finishAccountCreationBody = new FinishAccountCreationBody(bVar2.getMemberInfo().getFirstName().getValue(), bVar2.getMemberInfo().getLastName().getValue(), bVar2.getMemberInfo().getUserName(), bVar2.getMemberInfo().getCountry(), bVar2.getMemberInfo().getState());
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar3 = new b(finishAccountCreationBody, whoopStrapInfoMo87912a, null);
            aVar2.f51922w = authMaterial;
            aVar2.f51923x = bVar2;
            aVar2.f51924y = null;
            aVar2.f51925z = null;
            aVar2.f51921G = 1;
            Object objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to finish account creation", bVar3, aVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
            authMaterial2 = authMaterial;
            obj = objM108729b;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar2 = (InterfaceC14176e.b) aVar2.f51923x;
            AuthMaterial authMaterial3 = (AuthMaterial) aVar2.f51922w;
            AbstractC34132o.m107864I(obj);
            authMaterial2 = authMaterial3;
        }
        InterfaceC14176e.b bVar4 = bVar2;
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) obj;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            this.logger.mo85228t("Successfully finished account creation", new AbstractC30556a.a[0]);
            return new C14178f(InterfaceC14176e.b.m40416b(bVar4, null, null, null, null, null, false, null, false, authMaterial2, false, false, null, null, null, null, null, null, 130815, null), true);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC32238a.m100306a((InterfaceC34385a.b) interfaceC34385a) ? new C14178f(AbstractC32238a.m100307b(), false) : new C14178f(InterfaceC14176e.b.m40416b(bVar4, null, null, null, null, null, true, null, false, null, false, false, null, null, null, null, null, null, 131039, null), false);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (r4 == r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fd, code lost:
    
        if (r2 == r3) goto L34;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m40666g(f70.InterfaceC14176e.b r36, q83.InterfaceC30057d<? super f70.C14178f> r37) {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f70.C14219z0.m40666g(f70.e$b, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m40667f(f70.InterfaceC14176e.b r8, q83.InterfaceC30057d<? super f70.C14178f> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof f70.C14219z0.c
            if (r0 == 0) goto L13
            r0 = r9
            f70.z0$c r0 = (f70.C14219z0.c) r0
            int r1 = r0.f51931F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51931F = r1
            goto L18
        L13:
            f70.z0$c r0 = new f70.z0$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f51935z
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f51931F
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L48
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r8 = r0.f51933x
            f70.z0 r8 = (f70.C14219z0) r8
            java.lang.Object r8 = r0.f51932w
            f70.e$b r8 = (f70.InterfaceC14176e.b) r8
            p505ts.AbstractC34132o.m107864I(r9)
            goto L77
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            java.lang.Object r8 = r0.f51933x
            com.whoop.domain.model.AuthMaterial r8 = (com.whoop.domain.model.AuthMaterial) r8
            java.lang.Object r8 = r0.f51932w
            f70.e$b r8 = (f70.InterfaceC14176e.b) r8
            p505ts.AbstractC34132o.m107864I(r9)
            goto L62
        L48:
            p505ts.AbstractC34132o.m107864I(r9)
            od1.j r9 = r7.pendingUserSessionRepository
            com.whoop.domain.model.AuthMaterial r9 = r9.getPendingAuthMaterial()
            if (r9 == 0) goto L68
            r0.f51932w = r8
            r0.f51933x = r6
            r0.f51934y = r3
            r0.f51931F = r5
            java.lang.Object r9 = r7.m40665e(r9, r8, r0)
            if (r9 != r1) goto L62
            goto L76
        L62:
            f70.f r9 = (f70.C14178f) r9
            if (r9 != 0) goto L67
            goto L68
        L67:
            return r9
        L68:
            r0.f51932w = r6
            r0.f51933x = r6
            r0.f51934y = r3
            r0.f51931F = r4
            java.lang.Object r9 = r7.m40666g(r8, r0)
            if (r9 != r1) goto L77
        L76:
            return r1
        L77:
            f70.f r9 = (f70.C14178f) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f70.C14219z0.m40667f(f70.e$b, q83.d):java.lang.Object");
    }
}
