package we1;

import android.database.sqlite.SQLiteException;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.ActiveSessionChecker;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.entitlements.Entitlement;
import com.whoop.entitlements.EntitlementsEmptyException;
import com.whoop.entitlements.EntitlementsResponse;
import com.whoop.entitlements.MemberEntitlementsApi;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import java.time.Clock;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jy1.C22047a;
import l83.C23454a0;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import yb3.AbstractC39421y;
import ze1.C40587c;

/* JADX INFO: renamed from: we1.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 U2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001RBg\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b#\u0010\"J\u0018\u0010&\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020$H\u0082@¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b,\u0010+J\u0017\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\u00020/2\u0006\u0010%\u001a\u00020$H\u0086@¢\u0006\u0004\b2\u0010'J\u0010\u00103\u001a\u00020\u001eH\u0086@¢\u0006\u0004\b3\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR \u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0J0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u001c\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010MR\u0016\u0010T\u001a\u0004\u0018\u00010Q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006V"}, m65681d2 = {"Lwe1/g;", "Lwe1/a;", "Lwe1/m;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lwe1/b;", "entitlementDao", "Lwe1/j;", "membershipTypeDao", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lcom/whoop/data/repositories/ActiveSessionChecker;", "activeSessionChecker", "Ltr2/n;", "logger", "Lcom/whoop/entitlements/MemberEntitlementsApi;", "memberEntitlementsApi", "Ljava/time/Clock;", "clock", "Lze1/c;", "lifecycleScopeProvider", "Liy1/c;", "metricWriter", "Lrr2/c;", "crashReporter", "Lwe1/i;", "membershipTypeChangeListener", "<init>", "(Lwe1/b;Lwe1/j;Lcom/whoop/data/repositories/FeatureFlagChecker;Lcom/whoop/data/repositories/ActiveSessionChecker;Ltr2/n;Lcom/whoop/entitlements/MemberEntitlementsApi;Ljava/time/Clock;Lze1/c;Liy1/c;Lrr2/c;Lwe1/i;)V", "Lcom/whoop/entitlements/EntitlementsResponse;", "response", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lcom/whoop/entitlements/EntitlementsResponse;Lq83/d;)Ljava/lang/Object;", "v", "(Lq83/d;)Ljava/lang/Object;", "r", "", "source", "t", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Landroidx/lifecycle/g0;", "owner", "onCreate", "(Landroidx/lifecycle/g0;)V", "onStart", "Lcom/whoop/entitlements/Entitlement;", "entitlement", "", "b", "(Lcom/whoop/entitlements/Entitlement;)Z", "u", "q", "Lwe1/b;", "x", "Lwe1/j;", "y", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "z", "Lcom/whoop/data/repositories/ActiveSessionChecker;", "E", "Ltr2/n;", "F", "Lcom/whoop/entitlements/MemberEntitlementsApi;", "G", "Ljava/time/Clock;", "H", "Lze1/c;", "I", "Liy1/c;", "J", "Lrr2/c;", "K", "Lwe1/i;", "Lec3/p1;", "", "Lwe1/e;", "L", "Lec3/p1;", "memoryCache", "M", "membershipTypeCache", "Lwe1/n;", "a", "()Lwe1/n;", "userCategory", "N", "entitlements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37223g implements InterfaceC37217a, InterfaceC37229m, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final MemberEntitlementsApi memberEntitlementsApi;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final C40587c lifecycleScopeProvider;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC37225i membershipTypeChangeListener;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC13075p1 memoryCache;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final InterfaceC13075p1 membershipTypeCache;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC37218b entitlementDao;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC37226j membershipTypeDao;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final ActiveSessionChecker activeSessionChecker;

    /* JADX INFO: renamed from: we1.g$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.entitlements.EntitlementsRepository", m100430f = "EntitlementsRepository.kt", m100431l = {185, 193}, m100432m = "clear", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f159168w;

        /* JADX INFO: renamed from: y */
        int f159170y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f159168w = obj;
            this.f159170y |= Integer.MIN_VALUE;
            return C37223g.this.m119306q(this);
        }
    }

    /* JADX INFO: renamed from: we1.g$c */
    @InterfaceC32271e(m100429c = "com.whoop.entitlements.EntitlementsRepository$onCreate$1", m100430f = "EntitlementsRepository.kt", m100431l = {46}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f159171w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C37223g.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f159171w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C37223g c37223g = C37223g.this;
                this.f159171w = 1;
                if (c37223g.m119303v(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: we1.g$d */
    @InterfaceC32271e(m100429c = "com.whoop.entitlements.EntitlementsRepository$onStart$1", m100430f = "EntitlementsRepository.kt", m100431l = {53}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f159173w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C37223g.this.new d(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f159173w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C37223g c37223g = C37223g.this;
                this.f159173w = 1;
                obj = c37223g.m119307u("self_app_start", this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C37223g.this.logger.mo85228t(AbstractC11266d.m30462p("App launch update result: ", ((Boolean) obj).booleanValue()), new AbstractC30556a.a[0]);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: we1.g$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.entitlements.EntitlementsRepository", m100430f = "EntitlementsRepository.kt", m100431l = {69, 73}, m100432m = "update", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f159175w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f159176x;

        /* JADX INFO: renamed from: z */
        int f159178z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f159176x = obj;
            this.f159178z |= Integer.MIN_VALUE;
            return C37223g.this.m119307u(null, this);
        }
    }

    /* JADX INFO: renamed from: we1.g$f */
    @InterfaceC32271e(m100429c = "com.whoop.entitlements.EntitlementsRepository$update$2", m100430f = "EntitlementsRepository.kt", m100431l = {92, 93, 95, 112, 115}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        Object f159179E;

        /* JADX INFO: renamed from: F */
        Object f159180F;

        /* JADX INFO: renamed from: G */
        Object f159181G;

        /* JADX INFO: renamed from: H */
        int f159182H;

        /* JADX INFO: renamed from: I */
        private /* synthetic */ Object f159183I;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ String f159185K;

        /* JADX INFO: renamed from: w */
        Object f159186w;

        /* JADX INFO: renamed from: x */
        Object f159187x;

        /* JADX INFO: renamed from: y */
        Object f159188y;

        /* JADX INFO: renamed from: z */
        Object f159189z;

        /* JADX INFO: renamed from: we1.g$f$a */
        @InterfaceC32271e(m100429c = "com.whoop.entitlements.EntitlementsRepository$update$2$entitlements$1", m100430f = "EntitlementsRepository.kt", m100431l = {HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE, 81}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/entitlements/EntitlementsResponse;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/entitlements/EntitlementsResponse;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f159190w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C37223g f159191x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f159192y;

            /* JADX INFO: renamed from: we1.g$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.entitlements.EntitlementsRepository$update$2$entitlements$1$1", m100430f = "EntitlementsRepository.kt", m100431l = {77, 79}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/entitlements/EntitlementsResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42587a extends AbstractC32275i implements Function1 {

                /* JADX INFO: renamed from: w */
                int f159193w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ String f159194x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ C37223g f159195y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C42587a(String str, C37223g c37223g, InterfaceC30057d<? super C42587a> interfaceC30057d) {
                    super(1, interfaceC30057d);
                    this.f159194x = str;
                    this.f159195y = c37223g;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                    return new C42587a(this.f159194x, this.f159195y, interfaceC30057d);
                }

                /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
                
                    if (r5 == r0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
                
                    if (r5 == r0) goto L19;
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
                        int r1 = r4.f159193w
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L1c
                        if (r1 == r3) goto L18
                        if (r1 != r2) goto L10
                        p505ts.AbstractC34132o.m107864I(r5)
                        goto L4a
                    L10:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r0)
                        throw r5
                    L18:
                        p505ts.AbstractC34132o.m107864I(r5)
                        goto L38
                    L1c:
                        p505ts.AbstractC34132o.m107864I(r5)
                        java.lang.String r5 = r4.f159194x
                        java.lang.String r1 = "user_account_creation"
                        boolean r5 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r5, r1)
                        if (r5 == 0) goto L3b
                        we1.g r5 = r4.f159195y
                        com.whoop.entitlements.MemberEntitlementsApi r5 = we1.C37223g.m119296j(r5)
                        r4.f159193w = r3
                        java.lang.Object r5 = r5.putOnboardingEntitlements(r4)
                        if (r5 != r0) goto L38
                        goto L49
                    L38:
                        com.whoop.entitlements.EntitlementsResponse r5 = (com.whoop.entitlements.EntitlementsResponse) r5
                        return r5
                    L3b:
                        we1.g r5 = r4.f159195y
                        com.whoop.entitlements.MemberEntitlementsApi r5 = we1.C37223g.m119296j(r5)
                        r4.f159193w = r2
                        java.lang.Object r5 = r5.getEntitlements(r4)
                        if (r5 != r0) goto L4a
                    L49:
                        return r0
                    L4a:
                        com.whoop.entitlements.EntitlementsResponse r5 = (com.whoop.entitlements.EntitlementsResponse) r5
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: we1.C37223g.f.a.C42587a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(InterfaceC30057d<? super EntitlementsResponse> interfaceC30057d) {
                    return ((C42587a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }
            }

            /* JADX INFO: renamed from: we1.g$f$a$b */
            @InterfaceC32271e(m100429c = "com.whoop.entitlements.EntitlementsRepository$update$2$entitlements$1$2", m100430f = "EntitlementsRepository.kt", m100431l = {82}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lu02/a$b;", "Lcom/whoop/entitlements/EntitlementsResponse;", "Ll83/a0;", "<anonymous>", "(Lu02/a$b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class b extends AbstractC32275i implements InterfaceC4351m {

                /* JADX INFO: renamed from: w */
                int f159196w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ C37223g f159197x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ String f159198y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(C37223g c37223g, String str, InterfaceC30057d<? super b> interfaceC30057d) {
                    super(2, interfaceC30057d);
                    this.f159197x = c37223g;
                    this.f159198y = str;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                    return new b(this.f159197x, this.f159198y, interfaceC30057d);
                }

                @Override // c93.InterfaceC4351m
                /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC34385a.b<EntitlementsResponse> bVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    return ((b) create(bVar, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f159196w;
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        C37223g c37223g = this.f159197x;
                        String str = this.f159198y;
                        this.f159196w = 1;
                        if (c37223g.m119302t(str, this) == enumC31071a) {
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
            public a(C37223g c37223g, String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f159191x = c37223g;
                this.f159192y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f159191x, this.f159192y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super EntitlementsResponse> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
            
                if (r11 == r0) goto L15;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Exception {
                /*
                    r10 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r10.f159190w
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L1f
                    if (r1 == r4) goto L1a
                    if (r1 != r3) goto L12
                    p505ts.AbstractC34132o.m107864I(r11)
                    r9 = r10
                    goto L55
                L12:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L1a:
                    p505ts.AbstractC34132o.m107864I(r11)
                    r9 = r10
                    goto L41
                L1f:
                    p505ts.AbstractC34132o.m107864I(r11)
                    r11 = r4
                    u02.a$a r4 = u02.InterfaceC34385a.INSTANCE
                    we1.g r1 = r10.f159191x
                    tr2.n r5 = we1.C37223g.m119295g(r1)
                    we1.g$f$a$a r8 = new we1.g$f$a$a
                    java.lang.String r1 = r10.f159192y
                    we1.g r6 = r10.f159191x
                    r8.<init>(r1, r6, r2)
                    r10.f159190w = r11
                    r6 = 0
                    java.lang.String r7 = "failed to fetch entitlements, falling back to cached copy"
                    r9 = r10
                    java.lang.Object r11 = r4.m108730a(r5, r6, r7, r8, r9)
                    if (r11 != r0) goto L41
                    goto L54
                L41:
                    u02.a r11 = (u02.InterfaceC34385a) r11
                    we1.g$f$a$b r1 = new we1.g$f$a$b
                    we1.g r4 = r9.f159191x
                    java.lang.String r5 = r9.f159192y
                    r1.<init>(r4, r5, r2)
                    r9.f159190w = r3
                    java.lang.Object r11 = u02.AbstractC34386b.m108741f(r11, r1, r10)
                    if (r11 != r0) goto L55
                L54:
                    return r0
                L55:
                    u02.a r11 = (u02.InterfaceC34385a) r11
                    java.lang.Object r11 = u02.AbstractC34386b.m108737b(r11)
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: we1.C37223g.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: renamed from: we1.g$f$b */
        @InterfaceC32271e(m100429c = "com.whoop.entitlements.EntitlementsRepository$update$2$existingEntriesAsync$1", m100430f = "EntitlementsRepository.kt", m100431l = {87}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lbc3/c0;", "", "", "Lwe1/e;", "<anonymous>", "(Lbc3/c0;)Ljava/util/Map;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f159199w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C37223g f159200x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C37223g c37223g, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f159200x = c37223g;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f159200x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Map<String, C37221e>> interfaceC30057d) {
                return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                Iterable iterable;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f159199w;
                try {
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        InterfaceC37218b interfaceC37218b = this.f159200x.entitlementDao;
                        this.f159199w = 1;
                        obj = interfaceC37218b.getEntitlements(this);
                        if (obj == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    iterable = (List) obj;
                } catch (SQLiteException unused) {
                    iterable = C25271y.f99162w;
                }
                Iterable iterable2 = iterable;
                int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(iterable2, 10));
                if (iM73988W < 16) {
                    iM73988W = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
                for (Object obj2 : iterable2) {
                    linkedHashMap.put(((C37221e) obj2).getName(), obj2);
                }
                return linkedHashMap;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f159185K = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = C37223g.this.new f(this.f159185K, interfaceC30057d);
            fVar.f159183I = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:36:0x0105 A[PHI: r0 r3
          0x0105: PHI (r0v14 java.util.Set<java.util.Map$Entry<java.lang.String, com.whoop.entitlements.EntitlementResponse>>) = 
          (r0v11 java.util.Set<java.util.Map$Entry<java.lang.String, com.whoop.entitlements.EntitlementResponse>>)
          (r0v32 java.util.Set<java.util.Map$Entry<java.lang.String, com.whoop.entitlements.EntitlementResponse>>)
         binds: [B:34:0x0101, B:17:0x0066] A[DONT_GENERATE, DONT_INLINE]
          0x0105: PHI (r3v12 java.lang.Object) = (r3v11 java.lang.Object), (r3v29 java.lang.Object) binds: [B:34:0x0101, B:17:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:38:0x010d  */
        /* JADX WARN: Code duplicated, block: B:45:0x013c  */
        /* JADX WARN: Code duplicated, block: B:47:0x0150  */
        /* JADX WARN: Code duplicated, block: B:48:0x0155  */
        /* JADX WARN: Code duplicated, block: B:51:0x0168  */
        /* JADX WARN: Code duplicated, block: B:54:0x017d  */
        /* JADX WARN: Code duplicated, block: B:58:0x0193  */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x01ba, code lost:
        
            if (r3.mo119275b(r0, r19) == r2) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x01f3, code lost:
        
            if (r0.m119302t(r3, r19) == r2) goto L67;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [r83.a] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v6, types: [ec3.h2] */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 505
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: we1.C37223g.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: we1.g$g */
    @InterfaceC32271e(m100429c = "com.whoop.entitlements.EntitlementsRepository", m100430f = "EntitlementsRepository.kt", m100431l = {148, 151, 157}, m100432m = "updateCache", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f159201w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f159202x;

        /* JADX INFO: renamed from: z */
        int f159204z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f159202x = obj;
            this.f159204z |= Integer.MIN_VALUE;
            return C37223g.this.m119303v(this);
        }
    }

    /* JADX INFO: renamed from: we1.g$h */
    @InterfaceC32271e(m100429c = "com.whoop.entitlements.EntitlementsRepository", m100430f = "EntitlementsRepository.kt", m100431l = {133}, m100432m = "updateMembershipType", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f159205E;

        /* JADX INFO: renamed from: w */
        Object f159206w;

        /* JADX INFO: renamed from: x */
        Object f159207x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f159208y;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f159208y = obj;
            this.f159205E |= Integer.MIN_VALUE;
            return C37223g.this.m119304w(null, this);
        }
    }

    public C37223g(InterfaceC37218b entitlementDao, InterfaceC37226j membershipTypeDao, FeatureFlagChecker featureFlagChecker, ActiveSessionChecker activeSessionChecker, InterfaceC34116n logger, MemberEntitlementsApi memberEntitlementsApi, Clock clock, C40587c lifecycleScopeProvider, InterfaceC21030c metricWriter, InterfaceC31766c crashReporter, InterfaceC37225i membershipTypeChangeListener) {
        AbstractC22676k.m65750j(entitlementDao, "entitlementDao");
        AbstractC22676k.m65750j(membershipTypeDao, "membershipTypeDao");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(activeSessionChecker, "activeSessionChecker");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(memberEntitlementsApi, "memberEntitlementsApi");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(lifecycleScopeProvider, "lifecycleScopeProvider");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(membershipTypeChangeListener, "membershipTypeChangeListener");
        this.entitlementDao = entitlementDao;
        this.membershipTypeDao = membershipTypeDao;
        this.featureFlagChecker = featureFlagChecker;
        this.activeSessionChecker = activeSessionChecker;
        this.logger = logger;
        this.memberEntitlementsApi = memberEntitlementsApi;
        this.clock = clock;
        this.lifecycleScopeProvider = lifecycleScopeProvider;
        this.metricWriter = metricWriter;
        this.crashReporter = crashReporter;
        this.membershipTypeChangeListener = membershipTypeChangeListener;
        this.memoryCache = AbstractC13091v.m36593c(C25271y.f99162w);
        this.membershipTypeCache = AbstractC13091v.m36593c(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m119292d() {
    }

    /* JADX INFO: renamed from: r */
    private final Object m119301r(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo58700a = this.metricWriter.mo58700a(new C22047a(0, "failed_to_read_entitlements_on_disk", null, C25271y.f99162w, null, 21, null), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final Object m119302t(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo58700a = this.metricWriter.mo58700a(new C22047a(0, "failed_to_refresh_entitlements", null, AbstractC31061c.m95644t("context:", str), null, 21, null), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x007f A[Catch: SQLiteException -> 0x0035, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x0035, blocks: (B:14:0x0031, B:36:0x007b, B:38:0x007f, B:33:0x006e), top: B:47:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: v */
    public final Object m119303v(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        g gVar;
        C37228l c37228l;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f159204z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f159204z = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        Object entitlements = gVar.f159202x;
        Object obj = EnumC31071a.f128113w;
        int i14 = gVar.f159204z;
        C23454a0 c23454a0 = C23454a0.f92919a;
        String membershipType = null;
        try {
            try {
                if (i14 == 0) {
                    AbstractC34132o.m107864I(entitlements);
                    InterfaceC37218b interfaceC37218b = this.entitlementDao;
                    gVar.f159204z = 1;
                    entitlements = interfaceC37218b.getEntitlements(gVar);
                    if (entitlements == obj) {
                    }
                    return obj;
                }
                if (i14 == 1) {
                    AbstractC34132o.m107864I(entitlements);
                } else {
                    if (i14 == 2) {
                        AbstractC34132o.m107864I(entitlements);
                        return c23454a0;
                    }
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(entitlements);
                }
                c37228l = (C37228l) entitlements;
                if (c37228l != null) {
                    membershipType = c37228l.getMembershipType();
                }
                ((C13045h2) this.membershipTypeCache).m36570j(membershipType);
                this.membershipTypeChangeListener.mo119290a();
                return c23454a0;
                ((C13045h2) this.memoryCache).m36570j((List) entitlements);
                if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.ADVANCED_LABS_STANDALONE)) {
                    InterfaceC37226j interfaceC37226j = this.membershipTypeDao;
                    gVar.f159201w = null;
                    gVar.f159204z = 3;
                    entitlements = interfaceC37226j.mo119309a(gVar);
                    if (entitlements == obj) {
                        return obj;
                    }
                    c37228l = (C37228l) entitlements;
                    if (c37228l != null) {
                        membershipType = c37228l.getMembershipType();
                    }
                    ((C13045h2) this.membershipTypeCache).m36570j(membershipType);
                    this.membershipTypeChangeListener.mo119290a();
                    return c23454a0;
                }
            } catch (SQLiteException e5) {
                this.logger.mo85230v("Failed to read membership_type into memory cache", e5, new AbstractC30556a.a[0]);
            }
        } catch (SQLiteException e13) {
            this.logger.mo85230v("Failed to read entitlements into memory cache", e13, new AbstractC30556a.a[0]);
            gVar.f159201w = null;
            gVar.f159204z = 2;
            if (m119301r(gVar) != obj) {
                return c23454a0;
            }
        }
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: w */
    public final Object m119304w(EntitlementsResponse entitlementsResponse, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        h hVar;
        String str;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i13 = hVar.f159205E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f159205E = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        Object obj = hVar.f159208y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = hVar.f159205E;
        C23454a0 c23454a0 = C23454a0.f92919a;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.ADVANCED_LABS_STANDALONE) && entitlementsResponse != null) {
                    String membershipType = entitlementsResponse.getContext().getMembershipType();
                    if (membershipType == null) {
                        this.logger.mo85226q("Entitlements response received with unexpected null membership_type", new AbstractC30556a.a[0]);
                        return c23454a0;
                    }
                    if (!AbstractC22676k.m65745e(((C13045h2) this.membershipTypeCache).getValue(), membershipType)) {
                        InterfaceC37226j interfaceC37226j = this.membershipTypeDao;
                        C37228l c37228l = new C37228l(0, membershipType, this.clock.millis(), 1, null);
                        hVar.f159206w = null;
                        hVar.f159207x = membershipType;
                        hVar.f159205E = 1;
                        if (interfaceC37226j.mo119310b(c37228l, hVar) == enumC31071a) {
                            return enumC31071a;
                        }
                        str = membershipType;
                    }
                }
                return c23454a0;
            }
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) hVar.f159207x;
            AbstractC34132o.m107864I(obj);
            ((C13045h2) this.membershipTypeCache).m36570j(str);
            this.membershipTypeChangeListener.mo119290a();
            return c23454a0;
        } catch (SQLiteException e5) {
            this.logger.mo85230v("Failed to persist membership_type", e5, new AbstractC30556a.a[0]);
            return c23454a0;
        }
    }

    @Override // we1.InterfaceC37229m
    /* JADX INFO: renamed from: a */
    public AbstractC37230n mo119305a() {
        String str = (String) ((C13045h2) this.membershipTypeCache).getValue();
        if (str != null) {
            return AbstractC37231o.m119323a(str);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0052 A[RETURN] */
    @Override // we1.InterfaceC37217a
    /* JADX INFO: renamed from: b */
    public boolean mo119272b(Entitlement entitlement) {
        AbstractC22676k.m65750j(entitlement, "entitlement");
        List listM74093D1 = AbstractC25265s.m74093D1((Iterable) ((C13045h2) this.memoryCache).getValue());
        if (listM74093D1.isEmpty()) {
            this.crashReporter.mo98631p(new EntitlementsEmptyException());
            return false;
        }
        for (Object obj : listM74093D1) {
            C37221e c37221e = (C37221e) obj;
            if (c37221e.getEnabled() && AbstractC39421y.m125921F(c37221e.getName(), entitlement.getValue(), true)) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        AbstractC3006f0.m8732z(this.lifecycleScopeProvider.m131621a(owner), null, null, new c(null), 3);
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
    public void onStart(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        if (((List) ((C13045h2) this.memoryCache).getValue()).isEmpty()) {
            AbstractC3006f0.m8732z(this.lifecycleScopeProvider.m131621a(owner), null, null, new d(null), 3);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
        super.onStop(interfaceC1585g0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        if (r10.deleteAll(r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0077, code lost:
    
        if (r10.deleteAll(r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        return r1;
     */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m119306q(q83.InterfaceC30057d<? super l83.C23454a0> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof we1.C37223g.b
            if (r0 == 0) goto L13
            r0 = r10
            we1.g$b r0 = (we1.C37223g.b) r0
            int r1 = r0.f159170y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f159170y = r1
            goto L18
        L13:
            we1.g$b r0 = new we1.g$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f159168w
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f159170y
            r3 = 0
            r4 = 2
            r5 = 1
            m83.y r6 = m83.C25271y.f99162w
            r7 = 0
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            p505ts.AbstractC34132o.m107864I(r10)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L30
            goto L7a
        L2e:
            r10 = move-exception
            goto L8c
        L30:
            r10 = move-exception
            goto L82
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3a:
            p505ts.AbstractC34132o.m107864I(r10)     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            goto L50
        L3e:
            r10 = move-exception
            goto L97
        L40:
            r10 = move-exception
            goto L5b
        L42:
            p505ts.AbstractC34132o.m107864I(r10)
            we1.b r10 = r9.entitlementDao     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            r0.f159170y = r5     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            java.lang.Object r10 = r10.deleteAll(r0)     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40
            if (r10 != r1) goto L50
            goto L79
        L50:
            ec3.p1 r10 = r9.memoryCache
            ec3.h2 r10 = (ec3.C13045h2) r10
            r10.getClass()
            r10.m36571k(r7, r6)
            goto L65
        L5b:
            tr2.n r2 = r9.logger     // Catch: java.lang.Throwable -> L3e
            java.lang.String r5 = "failed to delete entitlements from dao"
            qr2.a$a[] r8 = new qr2.AbstractC30556a.a[r3]     // Catch: java.lang.Throwable -> L3e
            r2.mo85230v(r5, r10, r8)     // Catch: java.lang.Throwable -> L3e
            goto L50
        L65:
            com.whoop.data.repositories.FeatureFlagChecker r10 = r9.featureFlagChecker
            java.lang.String r2 = "advanced-labs-standalone"
            boolean r10 = r10.isFeatureEnabled(r2)
            if (r10 == 0) goto L94
            we1.j r10 = r9.membershipTypeDao     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L30
            r0.f159170y = r4     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L30
            java.lang.Object r10 = r10.deleteAll(r0)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L30
            if (r10 != r1) goto L7a
        L79:
            return r1
        L7a:
            ec3.p1 r10 = r9.membershipTypeCache
            ec3.h2 r10 = (ec3.C13045h2) r10
            r10.m36570j(r7)
            goto L94
        L82:
            tr2.n r0 = r9.logger     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "failed to delete membership_type from dao"
            qr2.a$a[] r2 = new qr2.AbstractC30556a.a[r3]     // Catch: java.lang.Throwable -> L2e
            r0.mo85230v(r1, r10, r2)     // Catch: java.lang.Throwable -> L2e
            goto L7a
        L8c:
            ec3.p1 r0 = r9.membershipTypeCache
            ec3.h2 r0 = (ec3.C13045h2) r0
            r0.m36570j(r7)
            throw r10
        L94:
            l83.a0 r10 = l83.C23454a0.f92919a
            return r10
        L97:
            ec3.p1 r0 = r9.memoryCache
            ec3.h2 r0 = (ec3.C13045h2) r0
            r0.getClass()
            r0.m36571k(r7, r6)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: we1.C37223g.m119306q(q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: u */
    public final Object m119307u(String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f159178z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f159178z = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object objHasSession = eVar.f159176x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar.f159178z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objHasSession);
            ActiveSessionChecker activeSessionChecker = this.activeSessionChecker;
            eVar.f159175w = str;
            eVar.f159178z = 1;
            objHasSession = activeSessionChecker.hasSession(eVar);
            if (objHasSession != enumC31071a) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objHasSession);
            return objHasSession;
        }
        str = (String) eVar.f159175w;
        AbstractC34132o.m107864I(objHasSession);
        if (!((Boolean) objHasSession).booleanValue()) {
            this.logger.mo85228t(AbstractC11895b.m31996o("Skipping update (", str, ") — no active or pending session"), new AbstractC30556a.a[0]);
            return Boolean.TRUE;
        }
        f fVar = new f(str, null);
        eVar.f159175w = null;
        eVar.f159178z = 2;
        Object objM8719m = AbstractC3006f0.m8719m(fVar, eVar);
        return objM8719m == enumC31071a ? enumC31071a : objM8719m;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C37223g(InterfaceC37218b interfaceC37218b, InterfaceC37226j interfaceC37226j, FeatureFlagChecker featureFlagChecker, ActiveSessionChecker activeSessionChecker, InterfaceC34116n interfaceC34116n, MemberEntitlementsApi memberEntitlementsApi, Clock clock, C40587c c40587c, InterfaceC21030c interfaceC21030c, InterfaceC31766c interfaceC31766c, InterfaceC37225i interfaceC37225i, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        Clock clock2;
        InterfaceC34116n interfaceC34116nM107848a = (i13 & 16) != 0 ? InterfaceC34116n.INSTANCE.m107848a("EntitlementsRepository") : interfaceC34116n;
        if ((i13 & 64) != 0) {
            Clock clockSystemDefaultZone = Clock.systemDefaultZone();
            AbstractC22676k.m65749i(clockSystemDefaultZone, "systemDefaultZone(...)");
            clock2 = clockSystemDefaultZone;
        } else {
            clock2 = clock;
        }
        this(interfaceC37218b, interfaceC37226j, featureFlagChecker, activeSessionChecker, interfaceC34116nM107848a, memberEntitlementsApi, clock2, (i13 & 128) != 0 ? new C40587c() : c40587c, interfaceC21030c, interfaceC31766c, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? new InterfaceC37225i() { // from class: we1.f
            @Override // we1.InterfaceC37225i
            /* JADX INFO: renamed from: a */
            public final void mo119290a() {
                C37223g.m119292d();
            }
        } : interfaceC37225i);
    }
}
