package pd1;

import com.whoop.domain.bootstrap.BootstrapApi;
import com.whoop.domain.bootstrap.dto.UserAccountBootstrapDto;
import com.whoop.domain.bootstrap.dto.UserBioDataBootstrapDto;
import com.whoop.domain.bootstrap.dto.UserBootstrapDto;
import com.whoop.domain.bootstrap.dto.UserInfoBootstrapDto;
import com.whoop.domain.bootstrap.dto.UserMembershipBootstrapDto;
import com.whoop.domain.bootstrap.dto.UserProfileBootstrapDto;
import com.whoop.domain.model.AuthMaterial;
import com.whoop.domain.model.FitnessLevel;
import com.whoop.domain.model.Gender;
import com.whoop.domain.model.Session;
import com.whoop.domain.model.UnitSystem;
import com.whoop.domain.model.User;
import com.whoop.domain.model.UserProfile;
import com.whoop.service.network.model.LoginResult;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import l83.C23465k;
import no.nordicsemi.android.dfu.DfuBaseService;
import or2.AbstractC28184n0;
import org.joda.time.LocalDate;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.AbstractC34386b;
import u02.InterfaceC34385a;
import y92.C39352a;
import z92.InterfaceC40208d;

/* JADX INFO: renamed from: pd1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0015\u0010\u0012J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b \u0010\u0012J\u0018\u0010!\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b!\u0010\u0012J\u0019\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)H\u0086@¢\u0006\u0004\b*\u0010+J\u001e\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0086@¢\u0006\u0004\b,\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, m65681d2 = {"Lpd1/a;", "", "Lcom/whoop/domain/bootstrap/BootstrapApi;", "bootstrapApi", "Lrr2/c;", "crashReporter", "Ly92/a;", "authManager", "Lz92/d;", "userInfoUpdater", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/domain/bootstrap/BootstrapApi;Lrr2/c;Ly92/a;Lz92/d;Ltr2/n;)V", "", "authToken", "Lcom/whoop/domain/model/User;", "g", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Ll83/k;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/domain/model/AuthMaterial;", "authMaterial", "Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;", "bootstrappedData", "Lcom/whoop/service/network/model/LoginResult;", "l", "(Lcom/whoop/domain/model/AuthMaterial;Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;)Lcom/whoop/service/network/model/LoginResult;", "f", "(Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;)Lcom/whoop/domain/model/User;", "accessToken", "i", "o", "Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;", "membershipStatus", "", "k", "(Lcom/whoop/domain/bootstrap/dto/UserMembershipBootstrapDto;)Z", "j", "(Lcom/whoop/domain/model/AuthMaterial;Lq83/d;)Ljava/lang/Object;", "Ll83/a0;", "m", "(Lq83/d;)Ljava/lang/Object;", "n", "a", "Lcom/whoop/domain/bootstrap/BootstrapApi;", "b", "Lrr2/c;", "c", "Ly92/a;", "d", "Lz92/d;", "e", "Ltr2/n;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29104a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final BootstrapApi bootstrapApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C39352a authManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC40208d userInfoUpdater;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: pd1.a$a */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.bootstrap.BootstrapUserSignIn", m100430f = "BootstrapUserSignIn.kt", m100431l = {81}, m100432m = "fetchUserFromBootstrap", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f117735w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f117736x;

        /* JADX INFO: renamed from: z */
        int f117738z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f117736x = obj;
            this.f117738z |= Integer.MIN_VALUE;
            return C29104a.this.m88429g(null, this);
        }
    }

    /* JADX INFO: renamed from: pd1.a$b */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.bootstrap.BootstrapUserSignIn", m100430f = "BootstrapUserSignIn.kt", m100431l = {86}, m100432m = "fetchUserFromBootstrapV2", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f117739w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f117740x;

        /* JADX INFO: renamed from: z */
        int f117742z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f117740x = obj;
            this.f117742z |= Integer.MIN_VALUE;
            return C29104a.this.m88430h(null, this);
        }
    }

    /* JADX INFO: renamed from: pd1.a$c */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.bootstrap.BootstrapUserSignIn", m100430f = "BootstrapUserSignIn.kt", m100431l = {203}, m100432m = "getBootstrappedData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f117743w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f117744x;

        /* JADX INFO: renamed from: z */
        int f117746z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f117744x = obj;
            this.f117746z |= Integer.MIN_VALUE;
            return C29104a.this.m88431i(null, this);
        }
    }

    /* JADX INFO: renamed from: pd1.a$d */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.bootstrap.BootstrapUserSignIn$getBootstrappedData$2", m100430f = "BootstrapUserSignIn.kt", m100431l = {204}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f117747w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f117749y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f117749y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C29104a.this.new d(this.f117749y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f117747w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            BootstrapApi bootstrapApi = C29104a.this.bootstrapApi;
            String str = this.f117749y;
            this.f117747w = 1;
            Object bootstrapForUserFetch = bootstrapApi.getBootstrapForUserFetch(str, this);
            return bootstrapForUserFetch == enumC31071a ? enumC31071a : bootstrapForUserFetch;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super UserBootstrapDto> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: pd1.a$e */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.bootstrap.BootstrapUserSignIn", m100430f = "BootstrapUserSignIn.kt", m100431l = {32}, m100432m = "getLoginResult", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f117750w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f117751x;

        /* JADX INFO: renamed from: z */
        int f117753z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f117751x = obj;
            this.f117753z |= Integer.MIN_VALUE;
            return C29104a.this.m88435j(null, this);
        }
    }

    /* JADX INFO: renamed from: pd1.a$f */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.bootstrap.BootstrapUserSignIn", m100430f = "BootstrapUserSignIn.kt", m100431l = {41, 47, 49}, m100432m = "refreshUserCache", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f117754E;

        /* JADX INFO: renamed from: w */
        Object f117755w;

        /* JADX INFO: renamed from: x */
        Object f117756x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f117757y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f117757y = obj;
            this.f117754E |= Integer.MIN_VALUE;
            return C29104a.this.m88436m(this);
        }
    }

    /* JADX INFO: renamed from: pd1.a$g */
    @InterfaceC32271e(m100429c = "com.whoop.domain.bootstrap.BootstrapUserSignIn", m100430f = "BootstrapUserSignIn.kt", m100431l = {63, 69, 71}, m100432m = "refreshUserCacheV2", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f117759E;

        /* JADX INFO: renamed from: w */
        Object f117760w;

        /* JADX INFO: renamed from: x */
        Object f117761x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f117762y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f117762y = obj;
            this.f117759E |= Integer.MIN_VALUE;
            return C29104a.this.m88437n(this);
        }
    }

    /* JADX INFO: renamed from: pd1.a$h */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.bootstrap.BootstrapUserSignIn", m100430f = "BootstrapUserSignIn.kt", m100431l = {213}, m100432m = "requireBootstrappedData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f117764w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f117765x;

        /* JADX INFO: renamed from: z */
        int f117767z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f117765x = obj;
            this.f117767z |= Integer.MIN_VALUE;
            return C29104a.this.m88434o(null, this);
        }
    }

    /* JADX INFO: renamed from: pd1.a$i */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.bootstrap.BootstrapUserSignIn$requireBootstrappedData$response$1", m100430f = "BootstrapUserSignIn.kt", m100431l = {214}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/domain/bootstrap/dto/UserBootstrapDto;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f117768w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f117770y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, InterfaceC30057d<? super i> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f117770y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C29104a.this.new i(this.f117770y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f117768w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            BootstrapApi bootstrapApi = C29104a.this.bootstrapApi;
            String str = this.f117770y;
            this.f117768w = 1;
            Object bootstrapSignIn = bootstrapApi.getBootstrapSignIn(str, this);
            return bootstrapSignIn == enumC31071a ? enumC31071a : bootstrapSignIn;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super UserBootstrapDto> interfaceC30057d) {
            return ((i) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C29104a(BootstrapApi bootstrapApi, InterfaceC31766c crashReporter, C39352a authManager, InterfaceC40208d userInfoUpdater, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(bootstrapApi, "bootstrapApi");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(authManager, "authManager");
        AbstractC22676k.m65750j(userInfoUpdater, "userInfoUpdater");
        AbstractC22676k.m65750j(logger, "logger");
        this.bootstrapApi = bootstrapApi;
        this.crashReporter = crashReporter;
        this.authManager = authManager;
        this.userInfoUpdater = userInfoUpdater;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: f */
    private final User m88428f(UserBootstrapDto bootstrappedData) {
        UserAccountBootstrapDto accountBootstrapDto = bootstrappedData.getAccountBootstrapDto();
        UserInfoBootstrapDto userInfoBootstrapDto = bootstrappedData.getUserInfoBootstrapDto();
        UserProfileBootstrapDto userProfileBootstrapDto = bootstrappedData.getUserProfileBootstrapDto();
        UserBioDataBootstrapDto userBioDataBootstrapDto = bootstrappedData.getUserBioDataBootstrapDto();
        if (accountBootstrapDto == null || userInfoBootstrapDto == null) {
            this.logger.mo85226q("Cannot extract user - missing account or userInfo data", new AbstractC30556a.a[0]);
            return null;
        }
        Integer userId = accountBootstrapDto.getUserId();
        if (userId == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Cannot extract user - missing user_id");
            InterfaceC34116n interfaceC34116n = this.logger;
            String message = illegalStateException.getMessage();
            interfaceC34116n.mo85226q(message != null ? message : "", new AbstractC30556a.a[0]);
            this.crashReporter.mo98631p(illegalStateException);
            return null;
        }
        int iIntValue = userId.intValue();
        String createdAt = accountBootstrapDto.getCreatedAt();
        String firstName = userInfoBootstrapDto.getFirstName();
        String lastName = userInfoBootstrapDto.getLastName();
        String strM53370k = AbstractC18489d0.m53370k(userInfoBootstrapDto.getFirstName(), " ", userInfoBootstrapDto.getLastName());
        String email = accountBootstrapDto.getEmail();
        String username = accountBootstrapDto.getUsername();
        String avatarUrl = userInfoBootstrapDto.getAvatarUrl();
        User user = new User(iIntValue, createdAt, firstName, lastName, strM53370k, email, null, username, avatarUrl == null ? "" : avatarUrl, userInfoBootstrapDto.getCity(), userInfoBootstrapDto.getAdminDivision(), userInfoBootstrapDto.getCountry(), null, Boolean.valueOf(accountBootstrapDto.getConcealed()), 0, 20544, null);
        if (userProfileBootstrapDto == null) {
            return user;
        }
        Gender.Companion companion = Gender.INSTANCE;
        String gender = userProfileBootstrapDto.getGender();
        if (gender.length() == 0) {
            gender = Gender.FEMALE.getValue();
        }
        Gender genderFromName = companion.fromName(gender);
        float height = userProfileBootstrapDto.getHeight();
        float weight = userProfileBootstrapDto.getWeight();
        LocalDate localDateM85303a = AbstractC28184n0.m85303a(userProfileBootstrapDto.getBirthday(), AbstractC28184n0.m85306d(userProfileBootstrapDto.getTimezoneOffset()));
        AbstractC22676k.m65749i(localDateM85303a, "IsoDateTimeStringToLocalDate(...)");
        String timezoneOffset = userProfileBootstrapDto.getTimezoneOffset();
        UnitSystem unitSystemFromName = UnitSystem.fromName(userProfileBootstrapDto.getUnitSystem());
        AbstractC22676k.m65749i(unitSystemFromName, "fromName(...)");
        FitnessLevel fitnessLevelFromNameKey = FitnessLevel.fromNameKey(userProfileBootstrapDto.getFitnessLevel());
        AbstractC22676k.m65749i(fitnessLevelFromNameKey, "fromNameKey(...)");
        return user.copy((32511 & 1) != 0 ? user.id : 0, (32511 & 2) != 0 ? user.createdAt : null, (32511 & 4) != 0 ? user.firstName : null, (32511 & 8) != 0 ? user.lastName : null, (32511 & 16) != 0 ? user.fullName : null, (32511 & 32) != 0 ? user.emailAddress : null, (32511 & 64) != 0 ? user.password : null, (32511 & 128) != 0 ? user.username : null, (32511 & 256) != 0 ? user.avatarUrl : null, (32511 & 512) != 0 ? user.city : null, (32511 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? user.adminDivision : null, (32511 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? user.country : null, (32511 & 4096) != 0 ? user.profile : new UserProfile(genderFromName, height, weight, localDateM85303a, timezoneOffset, unitSystemFromName, fitnessLevelFromNameKey, userBioDataBootstrapDto != null ? userBioDataBootstrapDto.getMaxHeartRate() : 0, userBioDataBootstrapDto != null ? userBioDataBootstrapDto.getMinHeartRate() : 0, userProfileBootstrapDto.getPhysiologicalBaseline(), accountBootstrapDto.getCanUploadData()), (32511 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? user.concealed : null, (32511 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? user.age : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m88429g(String str, InterfaceC30057d<? super User> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f117738z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f117738z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objM88431i = aVar.f117736x;
        Object obj = EnumC31071a.f128113w;
        int i14 = aVar.f117738z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM88431i);
            aVar.f117735w = null;
            aVar.f117738z = 1;
            objM88431i = m88431i("Bearer " + str, aVar);
            if (objM88431i == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM88431i);
        }
        UserBootstrapDto userBootstrapDto = (UserBootstrapDto) objM88431i;
        if (userBootstrapDto == null) {
            return null;
        }
        return m88428f(userBootstrapDto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m88430h(String str, InterfaceC30057d<? super C23465k> interfaceC30057d) {
        b bVar;
        User userM88428f;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f117742z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f117742z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM88431i = bVar.f117740x;
        Object obj = EnumC31071a.f128113w;
        int i14 = bVar.f117742z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM88431i);
            bVar.f117739w = null;
            bVar.f117742z = 1;
            objM88431i = m88431i("Bearer " + str, bVar);
            if (objM88431i == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM88431i);
        }
        UserBootstrapDto userBootstrapDto = (UserBootstrapDto) objM88431i;
        if (userBootstrapDto == null || (userM88428f = m88428f(userBootstrapDto)) == null) {
            return null;
        }
        UserBioDataBootstrapDto userBioDataBootstrapDto = userBootstrapDto.getUserBioDataBootstrapDto();
        return new C23465k(userM88428f, new Integer(userBioDataBootstrapDto != null ? userBioDataBootstrapDto.getRecoveryCount() : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: i */
    public final Object m88431i(String str, InterfaceC30057d<? super UserBootstrapDto> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f117746z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f117746z = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object objM108729b = cVar2.f117744x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar2.f117746z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            d dVar = new d(str, null);
            cVar2.f117743w = null;
            cVar2.f117746z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, dVar, cVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        return AbstractC34386b.m108737b((InterfaceC34385a) objM108729b);
    }

    /* JADX INFO: renamed from: k */
    private final boolean m88432k(UserMembershipBootstrapDto membershipStatus) {
        if (membershipStatus != null) {
            return !membershipStatus.getInEffect();
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    private final LoginResult m88433l(AuthMaterial authMaterial, UserBootstrapDto bootstrappedData) {
        UserProfileBootstrapDto userProfileBootstrapDto = bootstrappedData.getUserProfileBootstrapDto();
        UserBioDataBootstrapDto userBioDataBootstrapDto = bootstrappedData.getUserBioDataBootstrapDto();
        UserAccountBootstrapDto accountBootstrapDto = bootstrappedData.getAccountBootstrapDto();
        UserInfoBootstrapDto userInfoBootstrapDto = bootstrappedData.getUserInfoBootstrapDto();
        if (accountBootstrapDto == null || userInfoBootstrapDto == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Error fetching user account. Account was null: " + (accountBootstrapDto == null) + ", Info was null: " + (userInfoBootstrapDto == null));
            this.crashReporter.mo98631p(illegalStateException);
            throw illegalStateException;
        }
        User userM88428f = m88428f(bootstrappedData);
        if (userM88428f == null) {
            throw new IllegalStateException("Failed to extract user from bootstrap data");
        }
        boolean zM88432k = m88432k(bootstrappedData.getMembershipBootstrapDto());
        if (userProfileBootstrapDto == null || zM88432k) {
            return new LoginResult(new Session(authMaterial.toAuthToken(), userM88428f), true);
        }
        Gender.Companion companion = Gender.INSTANCE;
        String gender = userProfileBootstrapDto.getGender();
        if (gender.length() == 0) {
            gender = Gender.FEMALE.getValue();
        }
        Gender genderFromName = companion.fromName(gender);
        float height = userProfileBootstrapDto.getHeight();
        float weight = userProfileBootstrapDto.getWeight();
        LocalDate localDateM85303a = AbstractC28184n0.m85303a(userProfileBootstrapDto.getBirthday(), AbstractC28184n0.m85306d(userProfileBootstrapDto.getTimezoneOffset()));
        AbstractC22676k.m65749i(localDateM85303a, "IsoDateTimeStringToLocalDate(...)");
        String timezoneOffset = userProfileBootstrapDto.getTimezoneOffset();
        UnitSystem unitSystemFromName = UnitSystem.fromName(userProfileBootstrapDto.getUnitSystem());
        AbstractC22676k.m65749i(unitSystemFromName, "fromName(...)");
        FitnessLevel fitnessLevelFromNameKey = FitnessLevel.fromNameKey(userProfileBootstrapDto.getFitnessLevel());
        AbstractC22676k.m65749i(fitnessLevelFromNameKey, "fromNameKey(...)");
        return new LoginResult(new Session(authMaterial.toAuthToken(), userM88428f.copy((32511 & 1) != 0 ? userM88428f.id : 0, (32511 & 2) != 0 ? userM88428f.createdAt : null, (32511 & 4) != 0 ? userM88428f.firstName : null, (32511 & 8) != 0 ? userM88428f.lastName : null, (32511 & 16) != 0 ? userM88428f.fullName : null, (32511 & 32) != 0 ? userM88428f.emailAddress : null, (32511 & 64) != 0 ? userM88428f.password : null, (32511 & 128) != 0 ? userM88428f.username : null, (32511 & 256) != 0 ? userM88428f.avatarUrl : null, (32511 & 512) != 0 ? userM88428f.city : null, (32511 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? userM88428f.adminDivision : null, (32511 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? userM88428f.country : null, (32511 & 4096) != 0 ? userM88428f.profile : new UserProfile(genderFromName, height, weight, localDateM85303a, timezoneOffset, unitSystemFromName, fitnessLevelFromNameKey, userBioDataBootstrapDto != null ? userBioDataBootstrapDto.getMaxHeartRate() : 0, userBioDataBootstrapDto != null ? userBioDataBootstrapDto.getMinHeartRate() : 0, userProfileBootstrapDto.getPhysiologicalBaseline(), accountBootstrapDto.getCanUploadData()), (32511 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? userM88428f.concealed : null, (32511 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? userM88428f.age : 0)), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: o */
    public final Object m88434o(String str, InterfaceC30057d<? super UserBootstrapDto> interfaceC30057d) throws Exception {
        h hVar;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i13 = hVar.f117767z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f117767z = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        h hVar2 = hVar;
        Object objM108729b = hVar2.f117765x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = hVar2.f117767z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            i iVar = new i(str, null);
            hVar2.f117764w = null;
            hVar2.f117767z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, iVar, hVar2, 6, null);
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
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return (UserBootstrapDto) ((InterfaceC34385a.c) interfaceC34385a).m108735a();
        }
        if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC34385a.b bVar = (InterfaceC34385a.b) interfaceC34385a;
        this.crashReporter.mo98631p(bVar.getException());
        throw bVar.getException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m88435j(AuthMaterial authMaterial, InterfaceC30057d<? super LoginResult> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f117753z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f117753z = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object objM88434o = eVar.f117751x;
        Object obj = EnumC31071a.f128113w;
        int i14 = eVar.f117753z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM88434o);
            String strM30461o = AbstractC11266d.m30461o("Bearer ", authMaterial.getAccessToken());
            eVar.f117750w = authMaterial;
            eVar.f117753z = 1;
            objM88434o = m88434o(strM30461o, eVar);
            if (objM88434o == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            authMaterial = (AuthMaterial) eVar.f117750w;
            AbstractC34132o.m107864I(objM88434o);
        }
        return m88433l(authMaterial, (UserBootstrapDto) objM88434o);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r2.mo129095b(r10, r0) == r1) goto L32;
     */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m88436m(q83.InterfaceC30057d<? super l83.C23454a0> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof pd1.C29104a.f
            if (r0 == 0) goto L13
            r0 = r10
            pd1.a$f r0 = (pd1.C29104a.f) r0
            int r1 = r0.f117754E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f117754E = r1
            goto L18
        L13:
            pd1.a$f r0 = new pd1.a$f
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f117757y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f117754E
            l83.a0 r3 = l83.C23454a0.f92919a
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            r8 = 0
            if (r2 == 0) goto L4d
            if (r2 == r6) goto L49
            if (r2 == r5) goto L41
            if (r2 != r4) goto L39
            java.lang.Object r1 = r0.f117756x
            com.whoop.domain.model.User r1 = (com.whoop.domain.model.User) r1
            java.lang.Object r0 = r0.f117755w
            com.whoop.domain.model.AuthMaterial r0 = (com.whoop.domain.model.AuthMaterial) r0
            p505ts.AbstractC34132o.m107864I(r10)
            goto L8b
        L39:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L41:
            java.lang.Object r2 = r0.f117755w
            com.whoop.domain.model.AuthMaterial r2 = (com.whoop.domain.model.AuthMaterial) r2
            p505ts.AbstractC34132o.m107864I(r10)
            goto L78
        L49:
            p505ts.AbstractC34132o.m107864I(r10)
            goto L5b
        L4d:
            p505ts.AbstractC34132o.m107864I(r10)
            y92.a r10 = r9.authManager
            r0.f117754E = r6
            java.lang.Object r10 = r10.m125478a(r0)
            if (r10 != r1) goto L5b
            goto L8a
        L5b:
            com.whoop.domain.model.AuthMaterial r10 = (com.whoop.domain.model.AuthMaterial) r10
            if (r10 != 0) goto L69
            tr2.n r10 = r9.logger
            java.lang.String r0 = "No auth material available, skipping user refresh"
            qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r8]
            r10.mo85228t(r0, r1)
            return r3
        L69:
            java.lang.String r10 = r10.getAccessToken()
            r0.f117755w = r7
            r0.f117754E = r5
            java.lang.Object r10 = r9.m88429g(r10, r0)
            if (r10 != r1) goto L78
            goto L8a
        L78:
            com.whoop.domain.model.User r10 = (com.whoop.domain.model.User) r10
            if (r10 == 0) goto L95
            z92.d r2 = r9.userInfoUpdater
            r0.f117755w = r7
            r0.f117756x = r7
            r0.f117754E = r4
            java.lang.Object r10 = r2.mo129095b(r10, r0)
            if (r10 != r1) goto L8b
        L8a:
            return r1
        L8b:
            tr2.n r10 = r9.logger
            java.lang.String r0 = "User cache updated successfully"
            qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r8]
            r10.mo85228t(r0, r1)
            goto L9e
        L95:
            tr2.n r10 = r9.logger
            java.lang.String r0 = "Failed to extract user from bootstrap data"
            qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r8]
            r10.mo85226q(r0, r1)
        L9e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pd1.C29104a.m88436m(q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m88437n(InterfaceC30057d<? super C23465k> interfaceC30057d) {
        g gVar;
        C23465k c23465k;
        InterfaceC40208d interfaceC40208d;
        User user;
        C23465k c23465k2;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f117759E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f117759E = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        Object objM125478a = gVar.f117762y;
        Object obj = EnumC31071a.f128113w;
        int i14 = gVar.f117759E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM125478a);
            C39352a c39352a = this.authManager;
            gVar.f117759E = 1;
            objM125478a = c39352a.m125478a(gVar);
            if (objM125478a != obj) {
            }
            return obj;
        }
        if (i14 == 1) {
            AbstractC34132o.m107864I(objM125478a);
        } else {
            if (i14 == 2) {
                AbstractC34132o.m107864I(objM125478a);
                c23465k = (C23465k) objM125478a;
                if (c23465k != null) {
                    this.logger.mo85226q("Failed to extract user from bootstrap data", new AbstractC30556a.a[0]);
                    return null;
                }
                interfaceC40208d = this.userInfoUpdater;
                user = (User) c23465k.f92937w;
                gVar.f117760w = null;
                gVar.f117761x = c23465k;
                gVar.f117759E = 3;
                if (interfaceC40208d.mo129095b(user, gVar) != obj) {
                    c23465k2 = c23465k;
                }
                return obj;
            }
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c23465k2 = (C23465k) gVar.f117761x;
            AbstractC34132o.m107864I(objM125478a);
        }
        this.logger.mo85228t("User cache updated successfully", new AbstractC30556a.a[0]);
        return c23465k2;
        AuthMaterial authMaterial = (AuthMaterial) objM125478a;
        if (authMaterial == null) {
            this.logger.mo85228t("No auth material available, skipping user refresh", new AbstractC30556a.a[0]);
            return null;
        }
        String accessToken = authMaterial.getAccessToken();
        gVar.f117760w = null;
        gVar.f117759E = 2;
        objM125478a = m88430h(accessToken, gVar);
        if (objM125478a != obj) {
            c23465k = (C23465k) objM125478a;
            if (c23465k != null) {
                this.logger.mo85226q("Failed to extract user from bootstrap data", new AbstractC30556a.a[0]);
                return null;
            }
            interfaceC40208d = this.userInfoUpdater;
            user = (User) c23465k.f92937w;
            gVar.f117760w = null;
            gVar.f117761x = c23465k;
            gVar.f117759E = 3;
            if (interfaceC40208d.mo129095b(user, gVar) != obj) {
                c23465k2 = c23465k;
                this.logger.mo85228t("User cache updated successfully", new AbstractC30556a.a[0]);
                return c23465k2;
            }
        }
        return obj;
    }

    public /* synthetic */ C29104a(BootstrapApi bootstrapApi, InterfaceC31766c interfaceC31766c, C39352a c39352a, InterfaceC40208d interfaceC40208d, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(bootstrapApi, interfaceC31766c, c39352a, interfaceC40208d, (i13 & 16) != 0 ? InterfaceC34116n.INSTANCE.m107848a("BootstrapUserSignIn") : interfaceC34116n);
    }
}
