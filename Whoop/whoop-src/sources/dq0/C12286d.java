package dq0;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.domain.model.Logout;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import od1.InterfaceC27837a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: dq0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Ldq0/d;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lkotlin/Function0;", "Ldq0/b;", "streamClientProvider", "Ltr2/n;", "logger", "Lod1/a0;", "userSessionManager", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lbc3/c0;", "scope", "<init>", "(Lc93/a;Ltr2/n;Lod1/a0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;)V", "Landroidx/lifecycle/g0;", "owner", "Ll83/a0;", "onCreate", "(Landroidx/lifecycle/g0;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lc93/a;", "x", "Ltr2/n;", "y", "Lod1/a0;", "z", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "E", "Lbc3/c0;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12286d implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC4339a streamClientProvider;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC27837a0 userSessionManager;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: dq0.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.community.data.stream.StreamSessionLifecycleHandler$onCreate$1", m100430f = "StreamSessionLifecycleHandler.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lcom/whoop/domain/model/Logout;", "it", "Ll83/a0;", "<anonymous>", "(Lcom/whoop/domain/model/Logout;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f41135w;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12286d.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Logout logout, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(logout, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f41135w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (C12286d.this.featureFlagChecker.isFeatureEnabled("community-stream-disconnect-on-logout")) {
                C12286d.this.logger.mo85228t("disconnecting stream client from StreamSessionLifecycleHandler user flow", new AbstractC30556a.a[0]);
                ((InterfaceC12284b) C12286d.this.streamClientProvider.invoke()).mo34190e();
            }
            return C23454a0.f92919a;
        }
    }

    public C12286d(InterfaceC4339a streamClientProvider, InterfaceC34116n logger, InterfaceC27837a0 userSessionManager, FeatureFlagChecker featureFlagChecker, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(streamClientProvider, "streamClientProvider");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(userSessionManager, "userSessionManager");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(scope, "scope");
        this.streamClientProvider = streamClientProvider;
        this.logger = logger;
        this.userSessionManager = userSessionManager;
        this.featureFlagChecker = featureFlagChecker;
        this.scope = scope;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        AbstractC13091v.m36582H(new C13052j1(this.userSessionManager.getLogoutFlow(), new a(null), 0), this.scope);
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
}
