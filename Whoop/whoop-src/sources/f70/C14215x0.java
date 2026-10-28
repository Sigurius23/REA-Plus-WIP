package f70;

import com.whoop.activation.domain.AuthedUsernameValidationApi;
import com.whoop.activation.domain.UsersServiceValidationApi;
import com.whoop.activation.domain.models.AuthedUsernameCheckRequestBody;
import com.whoop.activation.domain.models.AuthedUsernameCheckResponseBody;
import com.whoop.data.remote.domain.request.onboarding.CheckEmailRequestBody;
import com.whoop.data.remote.domain.request.onboarding.CheckUsernameRequestBody;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.domain.model.WhoopStrapInfo;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Locale;
import l83.C23454a0;
import od1.C27847j;
import p505ts.AbstractC34132o;
import p70.InterfaceC28954b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import t83.InterfaceC33616a;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: f70.x0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001:\u0001\"B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J.\u0010\u0017\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0080@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0080@¢\u0006\u0004\b!\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010+¨\u0006,"}, m65681d2 = {"Lf70/x0;", "", "Lcom/whoop/activation/domain/UsersServiceValidationApi;", "usersServiceValidationApi", "Lcom/whoop/activation/domain/AuthedUsernameValidationApi;", "authedUsernameValidationApi", "Lp70/b;", "whoopStrapInfoProvider", "Lod1/j;", "pendingUserSessionRepository", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/activation/domain/UsersServiceValidationApi;Lcom/whoop/activation/domain/AuthedUsernameValidationApi;Lp70/b;Lod1/j;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V", "", "username", "Lf70/x0$a;", "e", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "strapSerial", "strapSignature", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "g", "()Z", "Lf70/e$b;", "prevDomainResult", "Lf70/f;", "i", "(Lf70/e$b;Lq83/d;)Ljava/lang/Object;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "a", "Lcom/whoop/activation/domain/UsersServiceValidationApi;", "b", "Lcom/whoop/activation/domain/AuthedUsernameValidationApi;", "c", "Lp70/b;", "d", "Lod1/j;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Ltr2/n;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14215x0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final UsersServiceValidationApi usersServiceValidationApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AuthedUsernameValidationApi authedUsernameValidationApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC28954b whoopStrapInfoProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C27847j pendingUserSessionRepository;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f70.x0$a */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m65681d2 = {"Lf70/x0$a;", "", "<init>", "(Ljava/lang/String;I)V", "USERNAME_TAKEN", "EMAIL_TAKEN", "API_ERROR", "SUCCESS", "USERNAME_ERROR", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum a {
        USERNAME_TAKEN,
        EMAIL_TAKEN,
        API_ERROR,
        SUCCESS,
        USERNAME_ERROR;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: f70.x0$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.RemoteValidationHelper", m100430f = "RemoteValidationHelper.kt", m100431l = {51}, m100432m = "checkUsernameAuthenticated", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f51858w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f51859x;

        /* JADX INFO: renamed from: z */
        int f51861z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51859x = obj;
            this.f51861z |= Integer.MIN_VALUE;
            return C14215x0.this.m40649e(null, this);
        }
    }

    /* JADX INFO: renamed from: f70.x0$c */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.RemoteValidationHelper$checkUsernameAuthenticated$response$1", m100430f = "RemoteValidationHelper.kt", m100431l = {52}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/activation/domain/models/AuthedUsernameCheckResponseBody;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f51862w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f51864y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f51864y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14215x0.this.new c(this.f51864y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51862w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AuthedUsernameValidationApi authedUsernameValidationApi = C14215x0.this.authedUsernameValidationApi;
            AuthedUsernameCheckRequestBody authedUsernameCheckRequestBody = new AuthedUsernameCheckRequestBody(this.f51864y);
            this.f51862w = 1;
            Object objCheckUsername = authedUsernameValidationApi.checkUsername(authedUsernameCheckRequestBody, this);
            return objCheckUsername == enumC31071a ? enumC31071a : objCheckUsername;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<AuthedUsernameCheckResponseBody>> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: f70.x0$d */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.RemoteValidationHelper", m100430f = "RemoteValidationHelper.kt", m100431l = {77}, m100432m = "checkUsernameWithStrap", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f51866F;

        /* JADX INFO: renamed from: w */
        Object f51867w;

        /* JADX INFO: renamed from: x */
        Object f51868x;

        /* JADX INFO: renamed from: y */
        Object f51869y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f51870z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51870z = obj;
            this.f51866F |= Integer.MIN_VALUE;
            return C14215x0.this.m40650f(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: f70.x0$e */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.RemoteValidationHelper$checkUsernameWithStrap$response$1", m100430f = "RemoteValidationHelper.kt", m100431l = {78}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f51871E;

        /* JADX INFO: renamed from: w */
        int f51872w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f51874y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f51875z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, String str3, InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f51874y = str;
            this.f51875z = str2;
            this.f51871E = str3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14215x0.this.new e(this.f51874y, this.f51875z, this.f51871E, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51872w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            UsersServiceValidationApi usersServiceValidationApi = C14215x0.this.usersServiceValidationApi;
            CheckUsernameRequestBody checkUsernameRequestBody = new CheckUsernameRequestBody(this.f51874y, this.f51875z, this.f51871E);
            this.f51872w = 1;
            Object objCheckIfUsernameIsTaken = usersServiceValidationApi.checkIfUsernameIsTaken(checkUsernameRequestBody, this);
            return objCheckIfUsernameIsTaken == enumC31071a ? enumC31071a : objCheckIfUsernameIsTaken;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<Boolean>> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: f70.x0$f */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.RemoteValidationHelper", m100430f = "RemoteValidationHelper.kt", m100431l = {107}, m100432m = "validateEmail$activation_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f51876E;

        /* JADX INFO: renamed from: w */
        Object f51877w;

        /* JADX INFO: renamed from: x */
        Object f51878x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f51879y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51879y = obj;
            this.f51876E |= Integer.MIN_VALUE;
            return C14215x0.this.m40652h(null, this);
        }
    }

    /* JADX INFO: renamed from: f70.x0$g */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.RemoteValidationHelper$validateEmail$remoteValidationResult$1", m100430f = "RemoteValidationHelper.kt", m100431l = {108}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f51881w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC14176e.b f51883y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ WhoopStrapInfo f51884z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC14176e.b bVar, WhoopStrapInfo whoopStrapInfo, InterfaceC30057d<? super g> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f51883y = bVar;
            this.f51884z = whoopStrapInfo;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14215x0.this.new g(this.f51883y, this.f51884z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51881w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            UsersServiceValidationApi usersServiceValidationApi = C14215x0.this.usersServiceValidationApi;
            CheckEmailRequestBody checkEmailRequestBody = new CheckEmailRequestBody(this.f51884z.getSerialNumber(), this.f51884z.getStrapSignature(), this.f51883y.getMemberInfo().getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String().getValue());
            this.f51881w = 1;
            Object objCheckIfEmailIsTaken = usersServiceValidationApi.checkIfEmailIsTaken(checkEmailRequestBody, this);
            return objCheckIfEmailIsTaken == enumC31071a ? enumC31071a : objCheckIfEmailIsTaken;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<Boolean>> interfaceC30057d) {
            return ((g) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: f70.x0$h */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.RemoteValidationHelper", m100430f = "RemoteValidationHelper.kt", m100431l = {25, 30}, m100432m = "validateUsername$activation_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f51885E;

        /* JADX INFO: renamed from: w */
        Object f51886w;

        /* JADX INFO: renamed from: x */
        Object f51887x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f51888y;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51888y = obj;
            this.f51885E |= Integer.MIN_VALUE;
            return C14215x0.this.m40653i(null, this);
        }
    }

    public C14215x0(UsersServiceValidationApi usersServiceValidationApi, AuthedUsernameValidationApi authedUsernameValidationApi, InterfaceC28954b whoopStrapInfoProvider, C27847j pendingUserSessionRepository, FeatureFlagChecker featureFlagChecker, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(usersServiceValidationApi, "usersServiceValidationApi");
        AbstractC22676k.m65750j(authedUsernameValidationApi, "authedUsernameValidationApi");
        AbstractC22676k.m65750j(whoopStrapInfoProvider, "whoopStrapInfoProvider");
        AbstractC22676k.m65750j(pendingUserSessionRepository, "pendingUserSessionRepository");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(logger, "logger");
        this.usersServiceValidationApi = usersServiceValidationApi;
        this.authedUsernameValidationApi = authedUsernameValidationApi;
        this.whoopStrapInfoProvider = whoopStrapInfoProvider;
        this.pendingUserSessionRepository = pendingUserSessionRepository;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: e */
    public final Object m40649e(String str, InterfaceC30057d<? super a> interfaceC30057d) {
        b bVar;
        String status;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f51861z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f51861z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object objM108729b = bVar2.f51859x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar2.f51861z;
        String lowerCase = null;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            c cVar = new c(str, null);
            bVar2.f51858w = null;
            bVar2.f51861z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, cVar, bVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            if (interfaceC34385a instanceof InterfaceC34385a.b.a) {
                return ((InterfaceC34385a.b.a) interfaceC34385a).getErrorCode() == 400 ? a.USERNAME_ERROR : a.API_ERROR;
            }
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                return a.API_ERROR;
            }
            throw new NoWhenBranchMatchedException();
        }
        AuthedUsernameCheckResponseBody authedUsernameCheckResponseBody = (AuthedUsernameCheckResponseBody) ((C29218v0) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).f118270b;
        if (authedUsernameCheckResponseBody != null && (status = authedUsernameCheckResponseBody.getStatus()) != null) {
            lowerCase = status.toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        }
        if (AbstractC22676k.m65745e(lowerCase, "success")) {
            return a.SUCCESS;
        }
        return AbstractC22676k.m65745e(lowerCase, "error") ? a.USERNAME_TAKEN : a.API_ERROR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: f */
    public final Object m40650f(String str, String str2, String str3, InterfaceC30057d<? super a> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f51866F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f51866F = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object objM108729b = dVar2.f51870z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar2.f51866F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            e eVar = new e(str2, str3, str, null);
            dVar2.f51867w = null;
            dVar2.f51868x = null;
            dVar2.f51869y = null;
            dVar2.f51866F = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, eVar, dVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.b.a) {
            return ((InterfaceC34385a.b.a) interfaceC34385a).getErrorCode() == 400 ? a.USERNAME_ERROR : a.API_ERROR;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return a.API_ERROR;
        }
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        Boolean bool = (Boolean) ((C29218v0) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).f118270b;
        if (bool != null) {
            a aVar = bool.booleanValue() ? a.USERNAME_TAKEN : a.SUCCESS;
            if (aVar != null) {
                return aVar;
            }
        }
        return a.API_ERROR;
    }

    /* JADX INFO: renamed from: g */
    private final boolean m40651g() {
        return this.pendingUserSessionRepository.getAccessToken() != null && this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.ACCOUNT_CREATION_SKIP_STRAP_INFO_CHECK);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0094  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: h */
    public final Object m40652h(InterfaceC14176e.b bVar, InterfaceC30057d<? super C14178f> interfaceC30057d) {
        f fVar;
        a aVar;
        InterfaceC14176e.b bVar2 = bVar;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f51876E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f51876E = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        f fVar2 = fVar;
        Object objM108729b = fVar2.f51879y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = fVar2.f51876E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            WhoopStrapInfo whoopStrapInfoMo87912a = this.whoopStrapInfoProvider.mo87912a();
            if (whoopStrapInfoMo87912a == null) {
                return new C14178f(bVar2, false);
            }
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            g gVar = new g(bVar2, whoopStrapInfoMo87912a, null);
            fVar2.f51877w = bVar2;
            fVar2.f51878x = null;
            fVar2.f51876E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, gVar, fVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar2 = (InterfaceC14176e.b) fVar2.f51877w;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC14176e.b bVar3 = bVar2;
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            aVar = a.API_ERROR;
        } else {
            if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            Boolean bool = (Boolean) ((C29218v0) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).f118270b;
            if (bool == null) {
                aVar = a.API_ERROR;
            } else {
                aVar = bool.booleanValue() ? a.EMAIL_TAKEN : a.SUCCESS;
                if (aVar == null) {
                    aVar = a.API_ERROR;
                }
            }
        }
        return new C14178f(InterfaceC14176e.b.m40416b(bVar3, null, null, null, C14201q0.m40542b(bVar3.getMemberInfo(), null, null, null, null, null, null, null, null, false, false, aVar == a.EMAIL_TAKEN, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, 0, false, false, false, 1073740799, null), null, aVar == a.API_ERROR, null, false, null, false, false, null, null, null, null, null, null, 131031, null), aVar == a.SUCCESS);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r2 == r4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        if (r2 == r4) goto L29;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m40653i(f70.InterfaceC14176e.b r50, q83.InterfaceC30057d<? super f70.C14178f> r51) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f70.C14215x0.m40653i(f70.e$b, q83.d):java.lang.Object");
    }

    public /* synthetic */ C14215x0(UsersServiceValidationApi usersServiceValidationApi, AuthedUsernameValidationApi authedUsernameValidationApi, InterfaceC28954b interfaceC28954b, C27847j c27847j, FeatureFlagChecker featureFlagChecker, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(usersServiceValidationApi, authedUsernameValidationApi, interfaceC28954b, c27847j, featureFlagChecker, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("RemoteValidationHelper") : interfaceC34116n);
    }
}
