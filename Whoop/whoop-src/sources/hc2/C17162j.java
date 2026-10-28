package hc2;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1627t0;
import androidx.lifecycle.C1630u0;
import androidx.lifecycle.InterfaceC1633v0;
import ax1.AbstractC2119a;
import ax1.C2120b;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import com.whoop.data.remote.domain.response.growth.MembershipAffiliate;
import com.whoop.data.remote.domain.response.growth.MembershipInfo;
import com.whoop.data.remote.domain.response.growth.MembershipStatus;
import com.whoop.data.remote.domain.response.growth.TrialDetails;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.domain.model.User;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import fi0.InterfaceC14515a;
import gc2.EnumC15710a;
import hj0.AbstractC17356o;
import ja2.C21498a;
import ka2.C22308a;
import l83.C23454a0;
import l83.InterfaceC23459e;
import lg0.InterfaceC24033f;
import oa2.C27756d;
import oa2.C27757e;
import oa2.InterfaceC27755c;
import od1.AbstractC27845h;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p705ea2.C12901d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.jvm.internal.InterfaceC22666f;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rv1.C31842a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import u22.C34495j;
import u22.InterfaceC34493h;
import y71.C39282o;
import z92.InterfaceC40205a;

/* JADX INFO: renamed from: hc2.j */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020#2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020 ¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020 ¢\u0006\u0004\b,\u0010+J\r\u0010-\u001a\u00020#¢\u0006\u0004\b-\u0010%J\r\u0010.\u001a\u00020#¢\u0006\u0004\b.\u0010%J\r\u0010/\u001a\u00020#¢\u0006\u0004\b/\u0010%J\r\u00100\u001a\u00020#¢\u0006\u0004\b0\u0010%J\r\u00101\u001a\u00020#¢\u0006\u0004\b1\u0010%J\r\u00102\u001a\u00020#¢\u0006\u0004\b2\u0010%J\u0019\u00105\u001a\u00020#2\n\b\u0002\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020#H\u0002¢\u0006\u0004\b7\u0010%J\u000f\u00109\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020 H\u0002¢\u0006\u0004\b;\u0010+J\u000f\u0010<\u001a\u00020#H\u0002¢\u0006\u0004\b<\u0010%J\u000f\u0010=\u001a\u00020#H\u0002¢\u0006\u0004\b=\u0010%J\u0017\u0010@\u001a\u00020#2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020#H\u0002¢\u0006\u0004\bB\u0010%J\u0019\u0010E\u001a\u00020#2\b\u0010D\u001a\u0004\u0018\u00010CH\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020#2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020 H\u0002¢\u0006\u0004\bK\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u001a\u0010g\u001a\u0002038\u0016X\u0096D¢\u0006\f\n\u0004\b9\u0010d\u001a\u0004\be\u0010fR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020i0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010jR\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020&0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u001a\u0010t\u001a\b\u0012\u0004\u0012\u00020q0p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0017\u0010x\u001a\b\u0012\u0004\u0012\u00020q0u8F¢\u0006\u0006\u001a\u0004\bv\u0010w¨\u0006y"}, m65681d2 = {"Lhc2/j;", "Lhj0/o;", "Lrv1/a;", "membershipRepository", "Loa2/e;", "myAccountHeaderViewStateReducer", "Lka2/a;", "combiner", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "Lfi0/a;", "baseAnalytics", "Lax1/b;", "membershipManagementAnalyticsHelper", "Lhc2/l;", "pauseInfoHelper", "Llg0/f;", "advancedLabsManagementRepository", "Lu22/h;", "paymentMethodMenuItemRepository", "Lhc2/a;", "membershipButtonAnalytics", "Lz92/a;", "userInfoAccessor", "Lea2/d0;", "tileVisibilityChecker", "Lbc3/c0;", "coroutineScope", "<init>", "(Lrv1/a;Loa2/e;Lka2/a;Lcom/whoop/data/repositories/FeatureFlagRepository;Lfi0/a;Lax1/b;Lhc2/l;Llg0/f;Lu22/h;Lhc2/a;Lz92/a;Lea2/d0;Lbc3/c0;)V", "Lgc2/a;", "tile", "", "g0", "(Lgc2/a;)Z", "Ll83/a0;", "i0", "()V", "Loa2/c;", "viewEvent", "p0", "(Loa2/c;)V", "e0", "()Z", "f0", "n0", "m0", "k0", "j0", "l0", "o0", "", "source", "h0", "(Ljava/lang/String;)V", "R", "Lbc3/k1;", "Q", "()Lbc3/k1;", "c0", "Z", "X", "Ly71/o;", "menuItem", "q0", "(Ly71/o;)V", "Y", "Lu22/j;", "result", "s0", "(Lu22/j;)V", "Lhc2/b;", "pauseInfo", "r0", "(Lhc2/b;)V", "d0", "E", "Lrv1/a;", "F", "Loa2/e;", "G", "Lka2/a;", "H", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "I", "Lfi0/a;", "J", "Lax1/b;", "K", "Lhc2/l;", "L", "Llg0/f;", "M", "Lu22/h;", "N", "Lhc2/a;", "O", "Lz92/a;", "P", "Lea2/d0;", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "Landroidx/lifecycle/u0;", "Lcom/whoop/data/remote/domain/response/growth/TrialDetails;", "Landroidx/lifecycle/u0;", "trialDetailsLiveData", "Lec3/o1;", "S", "Lec3/o1;", "myAccountHeaderEventFlow", "Landroidx/lifecycle/t0;", "Lhc2/k;", "T", "Landroidx/lifecycle/t0;", "_viewStateLiveData", "Landroidx/lifecycle/p0;", "b0", "()Landroidx/lifecycle/p0;", "viewStateLiveData", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17162j extends AbstractC17356o {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C31842a membershipRepository;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C27757e myAccountHeaderViewStateReducer;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C22308a combiner;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final FeatureFlagRepository featureFlagRepository;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final C2120b membershipManagementAnalyticsHelper;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final C17164l pauseInfoHelper;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC24033f advancedLabsManagementRepository;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final InterfaceC34493h paymentMethodMenuItemRepository;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final C17153a membershipButtonAnalytics;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final C12901d0 tileVisibilityChecker;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final C1630u0 trialDetailsLiveData;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final InterfaceC13072o1 myAccountHeaderEventFlow;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final C1627t0 _viewStateLiveData;

    /* JADX INFO: renamed from: hc2.j$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.myaccount.MyAccountViewModel$collectMyAccountHeaderViewState$1", m100430f = "MyAccountViewModel.kt", m100431l = {154}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f65890w;

        /* JADX INFO: renamed from: hc2.j$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.settings.myaccount.MyAccountViewModel$collectMyAccountHeaderViewState$1$1", m100430f = "MyAccountViewModel.kt", m100431l = {151}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Loa2/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41689a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f65892w;

            /* JADX INFO: renamed from: x */
            private /* synthetic */ Object f65893x;

            public C41689a(InterfaceC30057d<? super C41689a> interfaceC30057d) {
                super(2, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                C41689a c41689a = new C41689a(interfaceC30057d);
                c41689a.f65893x = obj;
                return c41689a;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C41689a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f65893x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f65892w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC27755c.a aVar = InterfaceC27755c.a.f111933a;
                    this.f65893x = null;
                    this.f65892w = 1;
                    if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
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

        /* JADX INFO: renamed from: hc2.j$a$b */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C17162j f65894w;

            public b(C17162j c17162j) {
                this.f65894w = c17162j;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(C27756d c27756d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                C17163k c17163k;
                C17163k c17163k2 = (C17163k) this.f65894w._viewStateLiveData.getValue();
                if (c17163k2 == null || (c17163k = C17163k.m48457b(c17163k2, null, null, null, false, null, c27756d, null, false, null, null, null, null, 4063, null)) == null) {
                    c17163k = new C17163k(null, null, null, false, null, c27756d, null, false, null, null, null, null, 4062, null);
                }
                this.f65894w._viewStateLiveData.setValue(c17163k);
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: hc2.j$a$c */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class c implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f65895w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C17162j f65896x;

            /* JADX INFO: renamed from: hc2.j$a$c$a, reason: collision with other inner class name */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41690a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f65897w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ C17162j f65898x;

                /* JADX INFO: renamed from: hc2.j$a$c$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.settings.myaccount.MyAccountViewModel$collectMyAccountHeaderViewState$1$invokeSuspend$$inlined$map$1$2", m100430f = "MyAccountViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C41691a extends AbstractC32269c {

                    /* JADX INFO: renamed from: E */
                    Object f65899E;

                    /* JADX INFO: renamed from: F */
                    Object f65900F;

                    /* JADX INFO: renamed from: G */
                    Object f65901G;

                    /* JADX INFO: renamed from: H */
                    int f65902H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f65903w;

                    /* JADX INFO: renamed from: x */
                    int f65904x;

                    /* JADX INFO: renamed from: y */
                    Object f65905y;

                    public C41691a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f65903w = obj;
                        this.f65904x |= Integer.MIN_VALUE;
                        return C41690a.this.emit(null, this);
                    }
                }

                public C41690a(InterfaceC13062m interfaceC13062m, C17162j c17162j) {
                    this.f65897w = interfaceC13062m;
                    this.f65898x = c17162j;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C41691a c41691a;
                    if (interfaceC30057d instanceof C41691a) {
                        c41691a = (C41691a) interfaceC30057d;
                        int i13 = c41691a.f65904x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c41691a.f65904x = i13 - Integer.MIN_VALUE;
                        } else {
                            c41691a = new C41691a(interfaceC30057d);
                        }
                    } else {
                        c41691a = new C41691a(interfaceC30057d);
                    }
                    Object obj2 = c41691a.f65903w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c41691a.f65904x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f65897w;
                        C27756d c27756dM83856a = this.f65898x.myAccountHeaderViewStateReducer.m83856a((C21498a) obj);
                        c41691a.f65905y = null;
                        c41691a.f65899E = null;
                        c41691a.f65900F = null;
                        c41691a.f65901G = null;
                        c41691a.f65902H = 0;
                        c41691a.f65904x = 1;
                        if (interfaceC13062m.emit(c27756dM83856a, c41691a) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj2);
                    }
                    return C23454a0.f92919a;
                }
            }

            public c(InterfaceC13058l interfaceC13058l, C17162j c17162j) {
                this.f65895w = interfaceC13058l;
                this.f65896x = c17162j;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f65895w.collect(new C41690a(interfaceC13062m, this.f65896x), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C17162j.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f65890w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                c cVar = new c(AbstractC27845h.m83945a(new C13015a0(new C41689a(null), C17162j.this.myAccountHeaderEventFlow), C17162j.this.combiner), C17162j.this);
                b bVar = new b(C17162j.this);
                this.f65890w = 1;
                if (cVar.collect(bVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: hc2.j$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.myaccount.MyAccountViewModel$fetchInitialData$1", m100430f = "MyAccountViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f65907w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f65908x;

        /* JADX INFO: renamed from: hc2.j$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.settings.myaccount.MyAccountViewModel$fetchInitialData$1$1", m100430f = "MyAccountViewModel.kt", m100431l = {72}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f65910w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C17162j f65911x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C17162j c17162j, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f65911x = c17162j;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f65911x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f65910w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C31842a c31842a = this.f65911x.membershipRepository;
                    this.f65910w = 1;
                    obj = c31842a.m98942A(this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                TrialDetails trialDetails = (TrialDetails) obj;
                if (trialDetails != null) {
                    this.f65911x.trialDetailsLiveData.setValue(trialDetails);
                }
                return C23454a0.f92919a;
            }
        }

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C17162j.this.new b(interfaceC30057d);
            bVar.f65908x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f65908x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f65907w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new a(C17162j.this, null), 3);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: hc2.j$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.myaccount.MyAccountViewModel$fetchInitialData$6", m100430f = "MyAccountViewModel.kt", m100431l = {120}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f65912w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C17162j.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objMo129089c;
            String emailAddress;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f65912w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC40205a interfaceC40205a = C17162j.this.userInfoAccessor;
                this.f65912w = 1;
                objMo129089c = interfaceC40205a.mo129089c(this);
                if (objMo129089c == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objMo129089c = obj;
            }
            User user = (User) objMo129089c;
            if (user == null || (emailAddress = user.getEmailAddress()) == null) {
                emailAddress = "";
            }
            String str = emailAddress;
            C17163k c17163k = (C17163k) C17162j.this._viewStateLiveData.getValue();
            C17162j.this._viewStateLiveData.setValue(C17163k.m48457b(c17163k == null ? new C17163k(null, null, null, false, null, null, null, false, null, null, null, null, 4094, null) : c17163k, null, null, null, false, null, null, null, false, null, null, null, str, 2047, null));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: hc2.j$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.myaccount.MyAccountViewModel$getAdvancedLabsManagementMenuItem$1", m100430f = "MyAccountViewModel.kt", m100431l = {269}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f65914w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C17162j.this.new d(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f65914w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC24033f interfaceC24033f = C17162j.this.advancedLabsManagementRepository;
                this.f65914w = 1;
                obj = interfaceC24033f.mo70892a(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C39282o c39282o = (C39282o) obj;
            if (c39282o != null) {
                C17162j.this.m48437q0(c39282o);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: hc2.j$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.myaccount.MyAccountViewModel$getPaymentMethodMenuItem$1", m100430f = "MyAccountViewModel.kt", m100431l = {287}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f65916w;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C17162j.this.new e(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f65916w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC34493h interfaceC34493h = C17162j.this.paymentMethodMenuItemRepository;
                this.f65916w = 1;
                obj = interfaceC34493h.mo109028a(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C17162j.this.m48439s0((C34495j) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: hc2.j$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.myaccount.MyAccountViewModel$getSubscriptionPauseEligibility$1", m100430f = "MyAccountViewModel.kt", m100431l = {259}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f65918w;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C17162j.this.new f(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f65918w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C17162j.this.m48438r0(new C17154b(true, false, false, 6, null));
                C17164l c17164l = C17162j.this.pauseInfoHelper;
                this.f65918w = 1;
                obj = c17164l.m48474d(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C17162j.this.m48438r0((C17154b) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: hc2.j$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.myaccount.MyAccountViewModel$refreshData$1", m100430f = "MyAccountViewModel.kt", m100431l = {134, 136}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f65920w;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C17162j.this.new g(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        
            if (r5 == r0) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.f65920w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r5)
                goto L4b
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L3c
            L1c:
                p505ts.AbstractC34132o.m107864I(r5)
                hc2.j r5 = hc2.C17162j.this
                com.whoop.data.repositories.FeatureFlagRepository r5 = hc2.C17162j.m48414D(r5)
                java.lang.String r1 = "refetch-membership-info-after-membership-action"
                boolean r5 = r5.isFeatureEnabled(r1)
                if (r5 == 0) goto L3c
                hc2.j r5 = hc2.C17162j.this
                rv1.a r5 = hc2.C17162j.m48415E(r5)
                r4.f65920w = r3
                java.lang.Object r5 = r5.m98950u(r4)
                if (r5 != r0) goto L3c
                goto L4a
            L3c:
                hc2.j r5 = hc2.C17162j.this
                rv1.a r5 = hc2.C17162j.m48415E(r5)
                r4.f65920w = r2
                java.lang.Object r5 = r5.m98942A(r4)
                if (r5 != r0) goto L4b
            L4a:
                return r0
            L4b:
                com.whoop.data.remote.domain.response.growth.TrialDetails r5 = (com.whoop.data.remote.domain.response.growth.TrialDetails) r5
                if (r5 == 0) goto L58
                hc2.j r0 = hc2.C17162j.this
                androidx.lifecycle.u0 r0 = hc2.C17162j.m48420K(r0)
                r0.setValue(r5)
            L58:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: hc2.C17162j.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: hc2.j$h */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f65922w;

        public h(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f65922w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f65922w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f65922w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: hc2.j$i */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.myaccount.MyAccountViewModel$sendViewEvent$1", m100430f = "MyAccountViewModel.kt", m100431l = {165}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f65923w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC27755c f65925y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC27755c interfaceC27755c, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f65925y = interfaceC27755c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C17162j.this.new i(this.f65925y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f65923w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C17162j.this.myAccountHeaderEventFlow;
                InterfaceC27755c interfaceC27755c = this.f65925y;
                this.f65923w = 1;
                if (interfaceC13072o1.emit(interfaceC27755c, this) == enumC31071a) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17162j(C31842a membershipRepository, C27757e myAccountHeaderViewStateReducer, C22308a combiner, FeatureFlagRepository featureFlagRepository, InterfaceC14515a baseAnalytics, C2120b membershipManagementAnalyticsHelper, C17164l pauseInfoHelper, InterfaceC24033f advancedLabsManagementRepository, InterfaceC34493h paymentMethodMenuItemRepository, C17153a membershipButtonAnalytics, InterfaceC40205a userInfoAccessor, C12901d0 tileVisibilityChecker, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(membershipRepository, "membershipRepository");
        AbstractC22676k.m65750j(myAccountHeaderViewStateReducer, "myAccountHeaderViewStateReducer");
        AbstractC22676k.m65750j(combiner, "combiner");
        AbstractC22676k.m65750j(featureFlagRepository, "featureFlagRepository");
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        AbstractC22676k.m65750j(membershipManagementAnalyticsHelper, "membershipManagementAnalyticsHelper");
        AbstractC22676k.m65750j(pauseInfoHelper, "pauseInfoHelper");
        AbstractC22676k.m65750j(advancedLabsManagementRepository, "advancedLabsManagementRepository");
        AbstractC22676k.m65750j(paymentMethodMenuItemRepository, "paymentMethodMenuItemRepository");
        AbstractC22676k.m65750j(membershipButtonAnalytics, "membershipButtonAnalytics");
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        AbstractC22676k.m65750j(tileVisibilityChecker, "tileVisibilityChecker");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.membershipRepository = membershipRepository;
        this.myAccountHeaderViewStateReducer = myAccountHeaderViewStateReducer;
        this.combiner = combiner;
        this.featureFlagRepository = featureFlagRepository;
        this.baseAnalytics = baseAnalytics;
        this.membershipManagementAnalyticsHelper = membershipManagementAnalyticsHelper;
        this.pauseInfoHelper = pauseInfoHelper;
        this.advancedLabsManagementRepository = advancedLabsManagementRepository;
        this.paymentMethodMenuItemRepository = paymentMethodMenuItemRepository;
        this.membershipButtonAnalytics = membershipButtonAnalytics;
        this.userInfoAccessor = userInfoAccessor;
        this.tileVisibilityChecker = tileVisibilityChecker;
        this.logTag = "MyAccountViewModel";
        this.trialDetailsLiveData = new C1630u0();
        this.myAccountHeaderEventFlow = AbstractC13091v.m36592b(0, 0, null, 7);
        this._viewStateLiveData = new C1627t0();
        m48427R();
    }

    /* JADX INFO: renamed from: Q */
    private final InterfaceC3027k1 m48426Q() {
        return AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new a(null), 3);
    }

    /* JADX INFO: renamed from: R */
    private final void m48427R() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new b(null), 3);
        final int i13 = 0;
        this._viewStateLiveData.m5035b(this.trialDetailsLiveData, new h(new Function1(this) { // from class: hc2.i

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C17162j f65873x;

            {
                this.f65873x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return C17162j.m48428S(this.f65873x, (TrialDetails) obj);
                    case 1:
                        return C17162j.m48429U(this.f65873x, (MembershipInfo) obj);
                    case 2:
                        return C17162j.m48430V(this.f65873x, (MembershipStatus) obj);
                    default:
                        return C17162j.m48431W(this.f65873x, (MembershipAffiliate) obj);
                }
            }
        }));
        final int i14 = 1;
        this._viewStateLiveData.m5035b(this.membershipRepository.m98945F(), new h(new Function1(this) { // from class: hc2.i

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C17162j f65873x;

            {
                this.f65873x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return C17162j.m48428S(this.f65873x, (TrialDetails) obj);
                    case 1:
                        return C17162j.m48429U(this.f65873x, (MembershipInfo) obj);
                    case 2:
                        return C17162j.m48430V(this.f65873x, (MembershipStatus) obj);
                    default:
                        return C17162j.m48431W(this.f65873x, (MembershipAffiliate) obj);
                }
            }
        }));
        final int i15 = 2;
        this._viewStateLiveData.m5035b(this.membershipRepository.m98946G(), new h(new Function1(this) { // from class: hc2.i

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C17162j f65873x;

            {
                this.f65873x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        return C17162j.m48428S(this.f65873x, (TrialDetails) obj);
                    case 1:
                        return C17162j.m48429U(this.f65873x, (MembershipInfo) obj);
                    case 2:
                        return C17162j.m48430V(this.f65873x, (MembershipStatus) obj);
                    default:
                        return C17162j.m48431W(this.f65873x, (MembershipAffiliate) obj);
                }
            }
        }));
        final int i16 = 3;
        this._viewStateLiveData.m5035b(this.membershipRepository.m98944E(), new h(new Function1(this) { // from class: hc2.i

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C17162j f65873x;

            {
                this.f65873x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        return C17162j.m48428S(this.f65873x, (TrialDetails) obj);
                    case 1:
                        return C17162j.m48429U(this.f65873x, (MembershipInfo) obj);
                    case 2:
                        return C17162j.m48430V(this.f65873x, (MembershipStatus) obj);
                    default:
                        return C17162j.m48431W(this.f65873x, (MembershipAffiliate) obj);
                }
            }
        }));
        if (this.featureFlagRepository.isFeatureEnabled(FeatureFlagRepositoryKt.MY_ACCOUNT_TRIALS_HEADER)) {
            m48426Q();
        }
        m48434Z();
        m48432X();
        m48433Y();
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new c(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m48428S(C17162j c17162j, TrialDetails trialDetails) {
        C17163k c17163k = (C17163k) c17162j._viewStateLiveData.getValue();
        C17163k c17163kM48457b = c17163k != null ? C17163k.m48457b(c17163k, null, null, null, false, trialDetails, null, null, false, null, null, null, null, 4079, null) : null;
        if (c17163kM48457b != null) {
            c17162j._viewStateLiveData.setValue(c17163kM48457b);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m48429U(C17162j c17162j, MembershipInfo membershipInfo) {
        C17163k c17163k = (C17163k) c17162j._viewStateLiveData.getValue();
        C17163k c17163k2 = c17163k == null ? new C17163k(null, null, null, false, null, null, null, false, null, null, null, null, 4094, null) : c17163k;
        TrialDetails trialDetails = (TrialDetails) c17162j.trialDetailsLiveData.getValue();
        C17163k c17163k3 = (C17163k) c17162j.m48443b0().getValue();
        c17162j._viewStateLiveData.setValue(C17163k.m48457b(c17163k2, membershipInfo, null, null, false, trialDetails, c17163k3 != null ? c17163k3.getMyAccountHeaderViewState() : null, null, false, null, null, null, null, 4046, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m48430V(C17162j c17162j, MembershipStatus membershipStatus) {
        MembershipStatus membershipStatus2;
        boolean z4 = false;
        if (c17162j.m48435c0() || c17162j.m48436d0()) {
            membershipStatus2 = membershipStatus;
        } else {
            membershipStatus2 = membershipStatus;
            if (membershipStatus2 != MembershipStatus.ELITE && c17162j.featureFlagRepository.isFeatureEnabled(FeatureFlagRepositoryKt.CANCEL_MEMBERSHIP_BUTTON)) {
                z4 = true;
            }
        }
        boolean z13 = z4;
        C17163k c17163k = (C17163k) c17162j._viewStateLiveData.getValue();
        c17162j._viewStateLiveData.setValue(C17163k.m48457b(c17163k == null ? new C17163k(null, null, null, false, null, null, null, false, null, null, null, null, 4094, null) : c17163k, null, membershipStatus2, null, false, null, null, null, z13, null, null, null, null, 3965, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m48431W(C17162j c17162j, MembershipAffiliate membershipAffiliate) {
        C17163k c17163k = (C17163k) c17162j._viewStateLiveData.getValue();
        c17162j._viewStateLiveData.setValue(C17163k.m48457b(c17163k == null ? new C17163k(null, null, null, false, null, null, null, false, null, null, null, null, 4094, null) : c17163k, null, null, membershipAffiliate != null ? membershipAffiliate.getType() : null, false, null, null, null, false, null, null, null, null, 4091, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: X */
    private final void m48432X() {
        if (this.featureFlagRepository.isFeatureEnabled(FeatureFlagRepositoryKt.ADVANCED_LABS_MANAGEMENT_MENU_ITEM)) {
            AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new d(null), 3);
        }
    }

    /* JADX INFO: renamed from: Y */
    private final void m48433Y() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new e(null), 3);
    }

    /* JADX INFO: renamed from: Z */
    private final void m48434Z() {
        if (this.featureFlagRepository.isFeatureEnabled(FeatureFlagRepositoryKt.MEMBERSHIP_PAUSE_BUTTON)) {
            AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new f(null), 3);
        }
    }

    /* JADX INFO: renamed from: c0 */
    private final boolean m48435c0() {
        C17163k c17163k = (C17163k) m48443b0().getValue();
        C27756d myAccountHeaderViewState = c17163k != null ? c17163k.getMyAccountHeaderViewState() : null;
        TrialDetails trialDetails = (TrialDetails) this.trialDetailsLiveData.getValue();
        Boolean boolValueOf = trialDetails != null ? Boolean.valueOf(trialDetails.getTrialCancellationEligible()) : null;
        return myAccountHeaderViewState == null || boolValueOf == null || myAccountHeaderViewState.getMyAccountHeader() != null || boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: d0 */
    private final boolean m48436d0() {
        C17154b membershipPauseInfo;
        C17163k c17163k = (C17163k) m48443b0().getValue();
        return (c17163k == null || (membershipPauseInfo = c17163k.getMembershipPauseInfo()) == null || !membershipPauseInfo.getIsLoading()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public final void m48437q0(C39282o menuItem) {
        C17163k c17163k;
        C17163k c17163k2 = (C17163k) m48443b0().getValue();
        if (c17163k2 == null || (c17163k = C17163k.m48457b(c17163k2, null, null, null, false, null, null, null, false, menuItem, null, null, null, 3839, null)) == null) {
            c17163k = new C17163k(null, null, null, false, null, null, null, false, menuItem, null, null, null, 3838, null);
        }
        this._viewStateLiveData.setValue(c17163k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public final void m48438r0(C17154b pauseInfo) {
        C17163k c17163k;
        C17163k c17163k2 = (C17163k) m48443b0().getValue();
        if (c17163k2 == null || (c17163k = C17163k.m48457b(c17163k2, null, null, null, false, null, null, pauseInfo, false, null, null, null, null, 4031, null)) == null) {
            c17163k = new C17163k(null, null, null, false, null, null, pauseInfo, false, null, null, null, null, 4030, null);
        }
        this._viewStateLiveData.setValue(c17163k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX INFO: renamed from: s0 */
    public final void m48439s0(C34495j result) {
        C39282o menuItemState;
        C17163k c17163k;
        C17163k c17163k2 = (C17163k) m48443b0().getValue();
        if (c17163k2 == null) {
            if (result != null) {
                menuItemState = result.getMenuItemState();
            } else {
                menuItemState = null;
            }
            c17163k = new C17163k(null, null, null, false, null, null, null, false, null, menuItemState, result != null ? result.m109033a() : null, null, 2558, null);
        } else {
            c17163k = C17163k.m48457b(c17163k2, null, null, null, false, null, null, null, false, null, result != null ? result.getMenuItemState() : null, result != null ? result.m109033a() : null, null, 2559, null);
            if (c17163k == null) {
                if (result != null) {
                    menuItemState = result.getMenuItemState();
                } else {
                    menuItemState = null;
                }
                c17163k = new C17163k(null, null, null, false, null, null, null, false, null, menuItemState, result != null ? result.m109033a() : null, null, 2558, null);
            }
        }
        this._viewStateLiveData.setValue(c17163k);
    }

    /* JADX INFO: renamed from: b0 */
    public final AbstractC1615p0 m48443b0() {
        return this._viewStateLiveData;
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m48444e0() {
        C17154b membershipPauseInfo;
        if (!m48435c0() && !m48436d0()) {
            C17163k c17163k = (C17163k) m48443b0().getValue();
            boolean z4 = (c17163k == null || (membershipPauseInfo = c17163k.getMembershipPauseInfo()) == null || !membershipPauseInfo.getShowPauseButton()) ? false : true;
            boolean zIsFeatureEnabled = this.featureFlagRepository.isFeatureEnabled(FeatureFlagRepositoryKt.MEMBERSHIP_PAUSE_BUTTON);
            if (z4 && zIsFeatureEnabled) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m48445f0() {
        C17154b membershipPauseInfo;
        if (!m48435c0() && !m48436d0()) {
            C17163k c17163k = (C17163k) m48443b0().getValue();
            boolean z4 = (c17163k == null || (membershipPauseInfo = c17163k.getMembershipPauseInfo()) == null || !membershipPauseInfo.getShowUnpauseButton()) ? false : true;
            boolean zIsFeatureEnabled = this.featureFlagRepository.isFeatureEnabled(FeatureFlagRepositoryKt.MEMBERSHIP_PAUSE_BUTTON);
            if (z4 && zIsFeatureEnabled) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m48446g0(EnumC15710a tile) {
        AbstractC22676k.m65750j(tile, "tile");
        return this.tileVisibilityChecker.m36305a(tile);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m48447h0(String source) {
        C17153a c17153a = this.membershipButtonAnalytics;
        boolean zM48435c0 = m48435c0();
        boolean zM48436d0 = m48436d0();
        C17163k c17163k = (C17163k) this._viewStateLiveData.getValue();
        c17153a.m48407b(zM48435c0, zM48436d0, c17163k != null && c17163k.getShowCancelMembershipButton(), m48444e0(), m48445f0(), source);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m48448i0() {
        if (this.featureFlagRepository.isFeatureEnabled(FeatureFlagRepositoryKt.MY_ACCOUNT_REFRESH_FIX)) {
            AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new g(null), 3);
            if (this.featureFlagRepository.isFeatureEnabled(FeatureFlagRepositoryKt.MY_ACCOUNT_TRIALS_HEADER)) {
                m48426Q();
            }
            m48434Z();
            m48433Y();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m48449j0() {
        InterfaceC14515a.m41418i(this.baseAnalytics, "Cancel Membership", "Open", null, "Settings - My Account", null, null, 52, null);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m48450k0() {
        this.membershipManagementAnalyticsHelper.m6690a(new AbstractC2119a.f(null, null, null, 7, null));
    }

    /* JADX INFO: renamed from: l0 */
    public final void m48451l0() {
        InterfaceC14515a.m41418i(this.baseAnalytics, "Pause Membership", "Open", null, "Settings - My Account", null, null, 52, null);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m48452m0() {
        this.membershipManagementAnalyticsHelper.m6690a(new AbstractC2119a.g(null, null, null, 7, null));
    }

    /* JADX INFO: renamed from: n0 */
    public final void m48453n0() {
        this.membershipManagementAnalyticsHelper.m6690a(new AbstractC2119a.h(null, null, null, 7, null));
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m48454o0() {
        InterfaceC14515a.m41418i(this.baseAnalytics, "Unpause Membership", "Open", null, "Settings - My Account", null, null, 52, null);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m48455p0(InterfaceC27755c viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new i(viewEvent, null), 3);
    }

    public /* synthetic */ C17162j(C31842a c31842a, C27757e c27757e, C22308a c22308a, FeatureFlagRepository featureFlagRepository, InterfaceC14515a interfaceC14515a, C2120b c2120b, C17164l c17164l, InterfaceC24033f interfaceC24033f, InterfaceC34493h interfaceC34493h, C17153a c17153a, InterfaceC40205a interfaceC40205a, C12901d0 c12901d0, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c31842a, c27757e, c22308a, featureFlagRepository, interfaceC14515a, c2120b, c17164l, interfaceC24033f, interfaceC34493h, c17153a, interfaceC40205a, c12901d0, (i13 & 4096) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
