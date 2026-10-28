package rv1;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.C1630u0;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.data.onboarding.C6529c;
import com.whoop.data.remote.RemoteDataSource;
import com.whoop.data.remote.domain.dto.growth.AffiliateDto;
import com.whoop.data.remote.domain.dto.growth.MembershipInfoDto;
import com.whoop.data.remote.domain.request.CommunityOfferRequestBodyV2;
import com.whoop.data.remote.domain.response.growth.AffiliateStatus;
import com.whoop.data.remote.domain.response.growth.AffiliateType;
import com.whoop.data.remote.domain.response.growth.MembershipAffiliate;
import com.whoop.data.remote.domain.response.growth.MembershipInfo;
import com.whoop.data.remote.domain.response.growth.MembershipStatus;
import com.whoop.data.remote.domain.response.growth.TrialDetails;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.membership.reactivationmodal.domain.ReactivationModalApi;
import com.whoop.membership.reactivationmodal.domain.models.ReactivationModalModel;
import com.whoop.payments.domain.PaymentsApi;
import com.whoop.payments.domain.models.PaymentsResponse;
import com.whoop.profile.domain.ProfileApiKt;
import com.whoop.service.network.MembershipV2Api;
import com.whoop.service.network.RmaServiceApi;
import com.whoop.service.network.model.TrialDetailsModel;
import com.whoop.service.network.model.WhoopOffer;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import l83.C23454a0;
import od1.C27858u;
import p459rf.C31345p;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.AbstractC34386b;
import u02.InterfaceC34385a;
import w02.AbstractC36685b;

/* JADX INFO: renamed from: rv1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fH\u0086@¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\"H\u0086@¢\u0006\u0004\b#\u0010\u001cJ\u0019\u0010&\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0004\b&\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010(H\u0086@¢\u0006\u0004\b)\u0010\u001cJ$\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010-\u001a\u00020,H\u0086@¢\u0006\u0004\b/\u00100J\u0011\u00101\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0004\b1\u00102J \u00106\u001a\u00020\u00182\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u000203H\u0082@¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b8\u0010\u001cJ\u0019\u0010;\u001a\u00020\u00182\b\u0010:\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\b;\u0010<J\u0011\u0010=\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b?\u0010\u001cJ\u0019\u0010B\u001a\u00020\u00182\b\u0010A\u001a\u0004\u0018\u00010@H\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0018H\u0002¢\u0006\u0004\bD\u0010\u001eJ\u0011\u0010E\u001a\u0004\u0018\u00010@H\u0002¢\u0006\u0004\bE\u0010FJ\u0019\u0010G\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\bG\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010HR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010KR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010LR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020$0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u001c\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010]R\u001c\u0010a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010]R\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020$0b8F¢\u0006\u0006\u001a\u0004\bO\u0010cR\u0019\u0010e\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001090b8F¢\u0006\u0006\u001a\u0004\bQ\u0010cR\u0019\u0010f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@0b8F¢\u0006\u0006\u001a\u0004\bM\u0010cR\u0014\u0010h\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010gR\u0014\u0010j\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u0010gR\u0014\u0010k\u001a\u0002038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010g¨\u0006l"}, m65681d2 = {"Lrv1/a;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lod1/u;", "userContext", "Lcom/whoop/data/remote/RemoteDataSource;", "remoteDataSource", "Lcom/whoop/service/network/MembershipV2Api;", "membershipV2Api", "Lcom/whoop/service/network/RmaServiceApi;", "rmaServiceApi", "Lcom/whoop/membership/reactivationmodal/domain/ReactivationModalApi;", "reactivationModalApi", "Lcom/whoop/payments/domain/PaymentsApi;", "paymentsApi", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "preferenceHelper", "Lbc3/c0;", "applicationCoroutineScope", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lod1/u;Lcom/whoop/data/remote/RemoteDataSource;Lcom/whoop/service/network/MembershipV2Api;Lcom/whoop/service/network/RmaServiceApi;Lcom/whoop/membership/reactivationmodal/domain/ReactivationModalApi;Lcom/whoop/payments/domain/PaymentsApi;Lcom/whoop/data/local/prefs/PreferenceHelper;Lbc3/c0;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Landroidx/lifecycle/g0;", "owner", "Ll83/a0;", "onCreate", "(Landroidx/lifecycle/g0;)V", "u", "(Lq83/d;)Ljava/lang/Object;", "M", "()V", "", "Lcom/whoop/payments/domain/models/PaymentsResponse;", "y", "Lcom/whoop/data/remote/domain/response/growth/TrialDetails;", "A", "Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;", "info", "R", "(Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;)V", "Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;", "z", "", ProfileApiKt.COMMUNITY_ID_PARAM, "", "source", "Lcom/whoop/service/network/model/WhoopOffer;", "B", "(ILjava/lang/String;Lq83/d;)Ljava/lang/Object;", "O", "()Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;", "", "commitStatus", "commitAffiliate", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(ZZLq83/d;)Ljava/lang/Object;", "v", "Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;", NotificationCompat.CATEGORY_STATUS, "S", "(Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;)V", "P", "()Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;", "t", "Lcom/whoop/data/remote/domain/response/growth/MembershipAffiliate;", "affiliate", "Q", "(Lcom/whoop/data/remote/domain/response/growth/MembershipAffiliate;)V", "r", "N", "()Lcom/whoop/data/remote/domain/response/growth/MembershipAffiliate;", "q", "Lod1/u;", "x", "Lcom/whoop/data/remote/RemoteDataSource;", "Lcom/whoop/service/network/MembershipV2Api;", "Lcom/whoop/service/network/RmaServiceApi;", "E", "Lcom/whoop/membership/reactivationmodal/domain/ReactivationModalApi;", "F", "Lcom/whoop/payments/domain/PaymentsApi;", "G", "Lcom/whoop/data/local/prefs/PreferenceHelper;", "H", "Lbc3/c0;", "I", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Ltr2/n;", "J", "Ltr2/n;", "logger", "Landroidx/lifecycle/u0;", "K", "Landroidx/lifecycle/u0;", "_membershipInfoLiveData", "L", "_membershipStatusLiveData", "_affiliateLiveData", "Landroidx/lifecycle/p0;", "()Landroidx/lifecycle/p0;", "membershipInfoLiveData", "membershipStatusLiveData", "affiliateLiveData", "()Z", "statusFromMsv2", "D", "affiliateFromMsv2", "skipMsv1", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31842a implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final ReactivationModalApi reactivationModalApi;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final PaymentsApi paymentsApi;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final PreferenceHelper preferenceHelper;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC2994c0 applicationCoroutineScope;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final C1630u0 _membershipInfoLiveData;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final C1630u0 _membershipStatusLiveData;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final C1630u0 _affiliateLiveData;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C27858u userContext;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final RemoteDataSource remoteDataSource;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final MembershipV2Api membershipV2Api;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final RmaServiceApi rmaServiceApi;

    /* JADX INFO: renamed from: rv1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.data.repositories.MembershipRepository", m100430f = "MembershipRepository.kt", m100431l = {188}, m100432m = "fetchAffiliate", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        int f131934w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f131935x;

        /* JADX INFO: renamed from: z */
        int f131937z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f131935x = obj;
            this.f131937z |= Integer.MIN_VALUE;
            return C31842a.this.m98939t(this);
        }
    }

    /* JADX INFO: renamed from: rv1.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.data.repositories.MembershipRepository$fetchAffiliate$response$1", m100430f = "MembershipRepository.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/data/remote/domain/dto/growth/AffiliateDto;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f131938w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C31842a.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f131938w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                MembershipV2Api membershipV2Api = C31842a.this.membershipV2Api;
                this.f131938w = 1;
                obj = membershipV2Api.getAffiliate(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            if (((C29218v0) obj).f118269a.f146792z == 404) {
                return null;
            }
            return obj;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<AffiliateDto>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: rv1.a$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.data.repositories.MembershipRepository$fetchMembershipInfo$2", m100430f = "MembershipRepository.kt", m100431l = {127}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f131940w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f131941x;

        /* JADX INFO: renamed from: rv1.a$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.membership.data.repositories.MembershipRepository$fetchMembershipInfo$2$1", m100430f = "MembershipRepository.kt", m100431l = {124}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f131943w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C31842a f131944x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C31842a c31842a, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f131944x = c31842a;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f131944x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f131943w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C31842a c31842a = this.f131944x;
                    this.f131943w = 1;
                    if (c31842a.m98940v(this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: rv1.a$c$b */
        @InterfaceC32271e(m100429c = "com.whoop.membership.data.repositories.MembershipRepository$fetchMembershipInfo$2$2", m100430f = "MembershipRepository.kt", m100431l = {125}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f131945w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C31842a f131946x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C31842a c31842a, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f131946x = c31842a;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f131946x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f131945w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C31842a c31842a = this.f131946x;
                    this.f131945w = 1;
                    if (c31842a.m98939t(this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            }
        }

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C31842a.this.new c(interfaceC30057d);
            cVar.f131941x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f131941x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f131940w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (C31842a.this.m98918I()) {
                    AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new a(C31842a.this, null), 3);
                }
                if (C31842a.this.m98916D()) {
                    AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new b(C31842a.this, null), 3);
                }
                if (!C31842a.this.m98917H()) {
                    C31842a c31842a = C31842a.this;
                    boolean z4 = !c31842a.m98918I();
                    boolean z13 = !C31842a.this.m98916D();
                    this.f131941x = null;
                    this.f131940w = 1;
                    if (c31842a.m98941w(z4, z13, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rv1.a$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.data.repositories.MembershipRepository", m100430f = "MembershipRepository.kt", m100431l = {155}, m100432m = "fetchMembershipStatus", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        int f131947w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f131948x;

        /* JADX INFO: renamed from: z */
        int f131950z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f131948x = obj;
            this.f131950z |= Integer.MIN_VALUE;
            return C31842a.this.m98940v(this);
        }
    }

    /* JADX INFO: renamed from: rv1.a$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.data.repositories.MembershipRepository$fetchMembershipStatus$response$1", m100430f = "MembershipRepository.kt", m100431l = {156}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f131951w;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C31842a.this.new e(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f131951w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            MembershipV2Api membershipV2Api = C31842a.this.membershipV2Api;
            this.f131951w = 1;
            Object membershipStatus = membershipV2Api.getMembershipStatus(this);
            return membershipStatus == enumC31071a ? enumC31071a : membershipStatus;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<String>> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: rv1.a$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.data.repositories.MembershipRepository", m100430f = "MembershipRepository.kt", m100431l = {136}, m100432m = "fetchMsv1MembershipInfo", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f131954F;

        /* JADX INFO: renamed from: w */
        boolean f131955w;

        /* JADX INFO: renamed from: x */
        boolean f131956x;

        /* JADX INFO: renamed from: y */
        int f131957y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f131958z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f131958z = obj;
            this.f131954F |= Integer.MIN_VALUE;
            return C31842a.this.m98941w(false, false, this);
        }
    }

    /* JADX INFO: renamed from: rv1.a$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.data.repositories.MembershipRepository", m100430f = "MembershipRepository.kt", m100431l = {228}, m100432m = "fetchPaymentsInfo", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f131959w;

        /* JADX INFO: renamed from: y */
        int f131961y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f131959w = obj;
            this.f131961y |= Integer.MIN_VALUE;
            return C31842a.this.m98951y(this);
        }
    }

    /* JADX INFO: renamed from: rv1.a$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.data.repositories.MembershipRepository$fetchPaymentsInfo$2", m100430f = "MembershipRepository.kt", m100431l = {229}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "", "Lcom/whoop/payments/domain/models/PaymentsResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f131962w;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C31842a.this.new h(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f131962w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            PaymentsApi paymentsApi = C31842a.this.paymentsApi;
            this.f131962w = 1;
            Object payments = paymentsApi.getPayments(this);
            return payments == enumC31071a ? enumC31071a : payments;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super List<PaymentsResponse>> interfaceC30057d) {
            return ((h) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: rv1.a$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.data.repositories.MembershipRepository", m100430f = "MembershipRepository.kt", m100431l = {248}, m100432m = "fetchReactivationModalContent", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f131964w;

        /* JADX INFO: renamed from: y */
        int f131966y;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f131964w = obj;
            this.f131966y |= Integer.MIN_VALUE;
            return C31842a.this.m98952z(this);
        }
    }

    /* JADX INFO: renamed from: rv1.a$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.data.repositories.MembershipRepository$fetchReactivationModalContent$2", m100430f = "MembershipRepository.kt", m100431l = {249}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/membership/reactivationmodal/domain/models/ReactivationModalModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f131967w;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C31842a.this.new j(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f131967w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ReactivationModalApi reactivationModalApi = C31842a.this.reactivationModalApi;
            this.f131967w = 1;
            Object reactivationModalContent = reactivationModalApi.getReactivationModalContent(this);
            return reactivationModalContent == enumC31071a ? enumC31071a : reactivationModalContent;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ReactivationModalModel> interfaceC30057d) {
            return ((j) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: rv1.a$k */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.data.repositories.MembershipRepository", m100430f = "MembershipRepository.kt", m100431l = {232}, m100432m = "fetchTrialDetails", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f131969w;

        /* JADX INFO: renamed from: y */
        int f131971y;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f131969w = obj;
            this.f131971y |= Integer.MIN_VALUE;
            return C31842a.this.m98942A(this);
        }
    }

    /* JADX INFO: renamed from: rv1.a$l */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.data.repositories.MembershipRepository$fetchTrialDetails$2", m100430f = "MembershipRepository.kt", m100431l = {233}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/service/network/model/TrialDetailsModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f131972w;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C31842a.this.new l(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f131972w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            RmaServiceApi rmaServiceApi = C31842a.this.rmaServiceApi;
            this.f131972w = 1;
            Object trialDetails = rmaServiceApi.getTrialDetails(this);
            return trialDetails == enumC31071a ? enumC31071a : trialDetails;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super TrialDetailsModel> interfaceC30057d) {
            return ((l) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: rv1.a$m */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.data.repositories.MembershipRepository", m100430f = "MembershipRepository.kt", m100431l = {257}, m100432m = "fetchWhoopCommunityOfferV2", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f131974E;

        /* JADX INFO: renamed from: w */
        int f131975w;

        /* JADX INFO: renamed from: x */
        Object f131976x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f131977y;

        public m(InterfaceC30057d<? super m> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f131977y = obj;
            this.f131974E |= Integer.MIN_VALUE;
            return C31842a.this.m98943B(0, null, this);
        }
    }

    /* JADX INFO: renamed from: rv1.a$n */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.data.repositories.MembershipRepository$fetchWhoopCommunityOfferV2$2", m100430f = "MembershipRepository.kt", m100431l = {257}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/service/network/model/WhoopOffer;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f131979w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f131981y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f131982z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(int i13, String str, InterfaceC30057d<? super n> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f131981y = i13;
            this.f131982z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C31842a.this.new n(this.f131981y, this.f131982z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f131979w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            MembershipV2Api membershipV2Api = C31842a.this.membershipV2Api;
            CommunityOfferRequestBodyV2 communityOfferRequestBodyV2 = new CommunityOfferRequestBodyV2(new Integer(this.f131981y), this.f131982z);
            this.f131979w = 1;
            Object objFetchWhoopCommunityReferralV2 = membershipV2Api.fetchWhoopCommunityReferralV2(communityOfferRequestBodyV2, this);
            return objFetchWhoopCommunityReferralV2 == enumC31071a ? enumC31071a : objFetchWhoopCommunityReferralV2;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super WhoopOffer> interfaceC30057d) {
            return ((n) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: rv1.a$o */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.data.repositories.MembershipRepository$onCreate$1$1", m100430f = "MembershipRepository.kt", m100431l = {98}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class o extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f131983w;

        public o(InterfaceC30057d<? super o> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31842a.this.new o(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((o) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f131983w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C31842a c31842a = C31842a.this;
                this.f131983w = 1;
                if (c31842a.m98950u(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rv1.a$p */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.data.repositories.MembershipRepository$onCreate$4", m100430f = "MembershipRepository.kt", m100431l = {110}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class p extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f131985w;

        public p(InterfaceC30057d<? super p> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31842a.this.new p(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((p) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f131985w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C31842a c31842a = C31842a.this;
                this.f131985w = 1;
                if (c31842a.m98950u(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rv1.a$q */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.data.repositories.MembershipRepository$onCreate$5", m100430f = "MembershipRepository.kt", m100431l = {114}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class q extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f131987w;

        public q(InterfaceC30057d<? super q> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31842a.this.new q(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((q) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f131987w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C31842a c31842a = C31842a.this;
                this.f131987w = 1;
                if (c31842a.m98940v(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rv1.a$r */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.data.repositories.MembershipRepository$onCreate$6", m100430f = "MembershipRepository.kt", m100431l = {117}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class r extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f131989w;

        public r(InterfaceC30057d<? super r> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31842a.this.new r(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((r) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f131989w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C31842a c31842a = C31842a.this;
                this.f131989w = 1;
                if (c31842a.m98939t(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rv1.a$s */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.data.repositories.MembershipRepository$refreshMembershipInfo$1", m100430f = "MembershipRepository.kt", m100431l = {225}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class s extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f131991w;

        public s(InterfaceC30057d<? super s> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31842a.this.new s(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((s) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f131991w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C31842a c31842a = C31842a.this;
                this.f131991w = 1;
                if (c31842a.m98950u(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    public C31842a(C27858u userContext, RemoteDataSource remoteDataSource, MembershipV2Api membershipV2Api, RmaServiceApi rmaServiceApi, ReactivationModalApi reactivationModalApi, PaymentsApi paymentsApi, PreferenceHelper preferenceHelper, InterfaceC2994c0 applicationCoroutineScope, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(remoteDataSource, "remoteDataSource");
        AbstractC22676k.m65750j(membershipV2Api, "membershipV2Api");
        AbstractC22676k.m65750j(rmaServiceApi, "rmaServiceApi");
        AbstractC22676k.m65750j(reactivationModalApi, "reactivationModalApi");
        AbstractC22676k.m65750j(paymentsApi, "paymentsApi");
        AbstractC22676k.m65750j(preferenceHelper, "preferenceHelper");
        AbstractC22676k.m65750j(applicationCoroutineScope, "applicationCoroutineScope");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.userContext = userContext;
        this.remoteDataSource = remoteDataSource;
        this.membershipV2Api = membershipV2Api;
        this.rmaServiceApi = rmaServiceApi;
        this.reactivationModalApi = reactivationModalApi;
        this.paymentsApi = paymentsApi;
        this.preferenceHelper = preferenceHelper;
        this.applicationCoroutineScope = applicationCoroutineScope;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("MembershipRepository");
        this._membershipInfoLiveData = new C1630u0();
        this._membershipStatusLiveData = new C1630u0();
        this._affiliateLiveData = new C1630u0();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ Object m98915C(C31842a c31842a, int i13, String str, InterfaceC30057d interfaceC30057d, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            str = "app";
        }
        return c31842a.m98943B(i13, str, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final boolean m98916D() {
        return this.featureFlagChecker.isFeatureEnabled("membership-affiliate-from-msv2-android");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public final boolean m98917H() {
        return m98918I() && m98916D() && this.featureFlagChecker.isFeatureEnabled("card-expiration-status-from-msv2-android");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public final boolean m98918I() {
        return this.featureFlagChecker.isFeatureEnabled("membership-status-from-msv2-android");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m98919K(C31842a c31842a, C27858u.a aVar) {
        c31842a.logger.mo85228t("Clearing data", new AbstractC30556a.a[0]);
        c31842a.m98949R(null);
        c31842a.m98924S(null);
        c31842a.m98938r();
        AbstractC3006f0.m8732z(c31842a.applicationCoroutineScope, null, null, c31842a.new o(null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final void m98920L(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: N */
    private final MembershipAffiliate m98921N() {
        String nullableStringFromMainPrefs = this.preferenceHelper.getNullableStringFromMainPrefs(SharedPreferenceConstants.KEY_AFFILIATE_TYPE);
        if (nullableStringFromMainPrefs == null) {
            return null;
        }
        return new MembershipAffiliate(AffiliateType.INSTANCE.fromStringOrDefault(nullableStringFromMainPrefs), AffiliateStatus.INSTANCE.fromStringOrDefault(this.preferenceHelper.getNullableStringFromMainPrefs(SharedPreferenceConstants.KEY_AFFILIATE_STATUS)));
    }

    /* JADX INFO: renamed from: P */
    private final MembershipStatus m98922P() {
        if (this.preferenceHelper.mainPrefsContains(SharedPreferenceConstants.KEY_MEMBERSHIP_STATUS)) {
            return MembershipStatus.INSTANCE.fromStringOrDefault(this.preferenceHelper.getNullableStringFromMainPrefs(SharedPreferenceConstants.KEY_MEMBERSHIP_STATUS));
        }
        return null;
    }

    /* JADX INFO: renamed from: Q */
    private final void m98923Q(MembershipAffiliate affiliate) {
        AffiliateStatus status;
        AffiliateType type;
        this.logger.mo85216g("Affiliate set to: " + affiliate, new AbstractC30556a.a[0]);
        String value = null;
        this.preferenceHelper.putStringValueIntoMainPrefs(SharedPreferenceConstants.KEY_AFFILIATE_TYPE, (affiliate == null || (type = affiliate.getType()) == null) ? null : type.getValue());
        PreferenceHelper preferenceHelper = this.preferenceHelper;
        if (affiliate != null && (status = affiliate.getStatus()) != null) {
            value = status.getValue();
        }
        preferenceHelper.putStringValueIntoMainPrefs(SharedPreferenceConstants.KEY_AFFILIATE_STATUS, value);
        this.preferenceHelper.putBooleanValueIntoMainPrefs(SharedPreferenceConstants.KEY_AFFILIATE_CACHED, true);
        this._affiliateLiveData.postValue(affiliate);
    }

    /* JADX INFO: renamed from: S */
    private final void m98924S(MembershipStatus status) {
        this.logger.mo85216g("Membership status set to: " + status, new AbstractC30556a.a[0]);
        if (status == null) {
            this.preferenceHelper.removeFromMainPrefs(SharedPreferenceConstants.KEY_MEMBERSHIP_STATUS);
        } else {
            this.preferenceHelper.putStringValueIntoMainPrefs(SharedPreferenceConstants.KEY_MEMBERSHIP_STATUS, status.getValue());
        }
        this._membershipStatusLiveData.postValue(status);
    }

    /* JADX INFO: renamed from: q */
    private final void m98937q(MembershipInfo info) {
        if (info == null) {
            this.preferenceHelper.removeFromMainPrefs(SharedPreferenceConstants.KEY_CHECKOUT_ORIGIN, SharedPreferenceConstants.KEY_NEXT_BILL_DATE, "SubscriptionExpiration", "UpgradeStatus", "UpgradeOrderStatusUrl", "UpcycleStatus", "SubscriptionType", "AnnualSavings");
        } else {
            this.preferenceHelper.putStringValueIntoMainPrefs(SharedPreferenceConstants.KEY_CHECKOUT_ORIGIN, info.getCheckoutOrigin().getSerializedValue());
            this.preferenceHelper.putStringValueIntoMainPrefs(SharedPreferenceConstants.KEY_NEXT_BILL_DATE, info.getNextBillDateTimestamp());
        }
    }

    /* JADX INFO: renamed from: r */
    private final void m98938r() {
        this.preferenceHelper.removeFromMainPrefs(SharedPreferenceConstants.KEY_AFFILIATE_TYPE, SharedPreferenceConstants.KEY_AFFILIATE_STATUS, SharedPreferenceConstants.KEY_AFFILIATE_CACHED);
        this._affiliateLiveData.postValue(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: t */
    public final Object m98939t(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        a aVar;
        int i13;
        AffiliateDto affiliateDto;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i14 = aVar.f131937z;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f131937z = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f131935x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = aVar2.f131937z;
        MembershipAffiliate membershipAffiliate = null;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            this.logger.mo85228t("Fetching affiliate", new AbstractC30556a.a[0]);
            int iM84056g = this.userContext.m84056g();
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(null);
            aVar2.f131934w = iM84056g;
            aVar2.f131937z = 1;
            Object objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch affiliate", bVar, aVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
            i13 = iM84056g;
            obj = objM108729b;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = aVar2.f131934w;
            AbstractC34132o.m107864I(obj);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) obj;
        boolean z4 = interfaceC34385a instanceof InterfaceC34385a.c;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!z4) {
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                return c23454a0;
            }
            throw new NoWhenBranchMatchedException();
        }
        C29218v0 c29218v0 = (C29218v0) ((InterfaceC34385a.c) interfaceC34385a).m108735a();
        if (c29218v0 != null && ((affiliateDto = (AffiliateDto) c29218v0.f118270b) == null || (membershipAffiliate = affiliateDto.toMembershipAffiliate()) == null)) {
            return c23454a0;
        }
        if (this.userContext.m84056g() != i13) {
            this.logger.mo85226q("Active user changed during affiliate fetch; discarding response", new AbstractC30556a.a[0]);
            return c23454a0;
        }
        m98923Q(membershipAffiliate);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: v */
    public final Object m98940v(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        d dVar;
        int i13;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i14 = dVar.f131950z;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f131950z = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object obj = dVar2.f131948x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = dVar2.f131950z;
        MembershipStatus membershipStatusFromStringOrDefault = null;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            this.logger.mo85228t("Fetching membership status", new AbstractC30556a.a[0]);
            int iM84056g = this.userContext.m84056g();
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            e eVar = new e(null);
            dVar2.f131947w = iM84056g;
            dVar2.f131950z = 1;
            Object objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch membership status", eVar, dVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
            i13 = iM84056g;
            obj = objM108729b;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = dVar2.f131947w;
            AbstractC34132o.m107864I(obj);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) obj;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            String str = (String) ((C29218v0) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).f118270b;
            if (str != null) {
                membershipStatusFromStringOrDefault = MembershipStatus.INSTANCE.fromStringOrDefault(str);
            }
        } else if (interfaceC34385a instanceof InterfaceC34385a.b.a) {
            if (((InterfaceC34385a.b.a) interfaceC34385a).getErrorCode() == 404) {
                membershipStatusFromStringOrDefault = MembershipStatus.INVALID;
            }
        } else if (!(interfaceC34385a instanceof InterfaceC34385a.b.C42432b)) {
            throw new NoWhenBranchMatchedException();
        }
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (membershipStatusFromStringOrDefault == null) {
            return c23454a0;
        }
        if (this.userContext.m84056g() != i13) {
            this.logger.mo85226q("Active user changed during membership status fetch; discarding response", new AbstractC30556a.a[0]);
            return c23454a0;
        }
        m98924S(membershipStatusFromStringOrDefault);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: w */
    public final Object m98941w(boolean z4, boolean z13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        f fVar;
        boolean z14;
        int i13;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i14 = fVar.f131954F;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f131954F = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        Object obj = fVar.f131958z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = fVar.f131954F;
        C23454a0 c23454a0 = C23454a0.f92919a;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                this.logger.mo85228t("Fetching membership info", new AbstractC30556a.a[0]);
                int iM84056g = this.userContext.m84056g();
                RemoteDataSource remoteDataSource = this.remoteDataSource;
                fVar.f131955w = z4;
                fVar.f131956x = z13;
                fVar.f131957y = iM84056g;
                fVar.f131954F = 1;
                Object membershipInfo = remoteDataSource.getMembershipInfo(fVar);
                if (membershipInfo == enumC31071a) {
                    return enumC31071a;
                }
                z14 = z4;
                i13 = iM84056g;
                obj = membershipInfo;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = fVar.f131957y;
                z13 = fVar.f131956x;
                z14 = fVar.f131955w;
                AbstractC34132o.m107864I(obj);
            }
            MembershipInfoDto membershipInfoDto = (MembershipInfoDto) obj;
            MembershipInfo membershipInfo2 = membershipInfoDto.toMembershipInfo();
            if (this.userContext.m84056g() != i13) {
                this.logger.mo85226q("Active user changed during membership fetch; discarding response", new AbstractC30556a.a[0]);
                return c23454a0;
            }
            m98949R(membershipInfo2);
            if (z14) {
                m98924S(membershipInfo2.getMembershipStatus());
            }
            if (z13) {
                m98923Q(membershipInfoDto.toMembershipAffiliate());
            }
            return c23454a0;
        } catch (Exception e5) {
            AbstractC36685b.m117760b(e5, "Error fetching membership info for user", this.logger, null, 8, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: A */
    public final Object m98942A(InterfaceC30057d<? super TrialDetails> interfaceC30057d) {
        k kVar;
        if (interfaceC30057d instanceof k) {
            kVar = (k) interfaceC30057d;
            int i13 = kVar.f131971y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                kVar.f131971y = i13 - Integer.MIN_VALUE;
            } else {
                kVar = new k(interfaceC30057d);
            }
        } else {
            kVar = new k(interfaceC30057d);
        }
        k kVar2 = kVar;
        Object objM108729b = kVar2.f131969w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = kVar2.f131971y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            l lVar = new l(null);
            kVar2.f131971y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, lVar, kVar2, 6, null);
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
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return null;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return ((TrialDetailsModel) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).toTrialDetails();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: B */
    public final Object m98943B(int i13, String str, InterfaceC30057d<? super WhoopOffer> interfaceC30057d) {
        m mVar;
        if (interfaceC30057d instanceof m) {
            mVar = (m) interfaceC30057d;
            int i14 = mVar.f131974E;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f131974E = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(interfaceC30057d);
            }
        } else {
            mVar = new m(interfaceC30057d);
        }
        m mVar2 = mVar;
        Object objM108729b = mVar2.f131977y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = mVar2.f131974E;
        if (i15 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            n nVar = new n(i13, str, null);
            mVar2.f131976x = null;
            mVar2.f131975w = i13;
            mVar2.f131974E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, nVar, mVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        return AbstractC34386b.m108737b((InterfaceC34385a) objM108729b);
    }

    /* JADX INFO: renamed from: E */
    public final AbstractC1615p0 m98944E() {
        return this._affiliateLiveData;
    }

    /* JADX INFO: renamed from: F */
    public final AbstractC1615p0 m98945F() {
        return this._membershipInfoLiveData;
    }

    /* JADX INFO: renamed from: G */
    public final AbstractC1615p0 m98946G() {
        return this._membershipStatusLiveData;
    }

    /* JADX INFO: renamed from: M */
    public final void m98947M() {
        AbstractC3006f0.m8732z(this.applicationCoroutineScope, null, null, new s(null), 3);
    }

    /* JADX INFO: renamed from: O */
    public final MembershipInfo m98948O() {
        if (this.preferenceHelper.mainPrefsContains(SharedPreferenceConstants.KEY_CHECKOUT_ORIGIN)) {
            return new MembershipInfoDto(this.preferenceHelper.getNullableStringFromMainPrefs(SharedPreferenceConstants.KEY_MEMBERSHIP_STATUS), PreferenceHelper.getStringValueFromMainPrefs$default(this.preferenceHelper, SharedPreferenceConstants.KEY_CHECKOUT_ORIGIN, null, 2, null), null, this.preferenceHelper.getNullableStringFromMainPrefs(SharedPreferenceConstants.KEY_NEXT_BILL_DATE)).toMembershipInfo();
        }
        return null;
    }

    /* JADX INFO: renamed from: R */
    public final void m98949R(MembershipInfo info) {
        this.logger.mo85216g("Membership info set to: " + info, new AbstractC30556a.a[0]);
        m98937q(info);
        if (info != null) {
            this._membershipInfoLiveData.postValue(info);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        this.userContext.m84060k().m122661K(new C6529c(new C31345p(this, 2), 18));
        MembershipStatus membershipStatusM98922P = m98922P();
        if (membershipStatusM98922P != null) {
            this._membershipStatusLiveData.postValue(membershipStatusM98922P);
        }
        MembershipInfo membershipInfoM98948O = m98948O();
        if (membershipInfoM98948O != null) {
            this._membershipInfoLiveData.postValue(membershipInfoM98948O);
        }
        boolean zMainPrefsContains = this.preferenceHelper.mainPrefsContains(SharedPreferenceConstants.KEY_AFFILIATE_CACHED);
        if (zMainPrefsContains) {
            this._affiliateLiveData.postValue(m98921N());
        }
        if ((membershipInfoM98948O == null && !m98917H()) || membershipStatusM98922P == null || !zMainPrefsContains) {
            AbstractC3006f0.m8732z(this.applicationCoroutineScope, null, null, new p(null), 3);
            return;
        }
        if (m98918I()) {
            AbstractC3006f0.m8732z(this.applicationCoroutineScope, null, null, new q(null), 3);
        }
        if (m98916D()) {
            AbstractC3006f0.m8732z(this.applicationCoroutineScope, null, null, new r(null), 3);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onDestroy(InterfaceC1585g0 interfaceC1585g0) {
        super.onDestroy(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(InterfaceC1585g0 interfaceC1585g0) {
        super.onPause(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onResume(InterfaceC1585g0 interfaceC1585g0) {
        super.onResume(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStart(InterfaceC1585g0 interfaceC1585g0) {
        super.onStart(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
        super.onStop(interfaceC1585g0);
    }

    /* JADX INFO: renamed from: u */
    public final Object m98950u(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM8719m = AbstractC3006f0.m8719m(new c(null), interfaceC30057d);
        return objM8719m == EnumC31071a.f128113w ? objM8719m : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: y */
    public final Object m98951y(InterfaceC30057d<? super List<PaymentsResponse>> interfaceC30057d) {
        g gVar;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f131961y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f131961y = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        g gVar2 = gVar;
        Object objM108729b = gVar2.f131959w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = gVar2.f131961y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            h hVar = new h(null);
            gVar2.f131961y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, hVar, gVar2, 6, null);
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

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: z */
    public final Object m98952z(InterfaceC30057d<? super ReactivationModalModel> interfaceC30057d) {
        i iVar;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f131966y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f131966y = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        i iVar2 = iVar;
        Object objM108729b = iVar2.f131964w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = iVar2.f131966y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            j jVar = new j(null);
            iVar2.f131966y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch Reactivation Modal", jVar, iVar2, 2, null);
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
            return (ReactivationModalModel) ((InterfaceC34385a.c) interfaceC34385a).m108735a();
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
