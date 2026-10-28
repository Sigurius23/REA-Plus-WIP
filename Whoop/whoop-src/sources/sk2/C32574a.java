package sk2;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.domain.model.Login;
import com.whoop.trackactivity.prefetch.TrackActivityPrefetchWorker;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import l83.C23454a0;
import m83.AbstractC25265s;
import od1.InterfaceC27837a0;
import p218ic.AbstractC18377p0;
import p218ic.C18347a0;
import p218ic.C18354e;
import p218ic.C18365j0;
import p218ic.C18367k0;
import p218ic.C18392z;
import p218ic.EnumC18346a;
import p218ic.EnumC18366k;
import p218ic.EnumC18368l;
import p218ic.EnumC18390x;
import p457rc.C31222e;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: sk2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\u0010B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, m65681d2 = {"Lsk2/a;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lic/p0;", "workManager", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lod1/a0;", "userSessionManager", "Lbc3/c0;", "applicationScope", "<init>", "(Lic/p0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lod1/a0;Lbc3/c0;)V", "Lic/e;", "b", "()Lic/e;", "Lic/k0;", "a", "()Lic/k0;", "Landroidx/lifecycle/g0;", "owner", "Ll83/a0;", "onCreate", "(Landroidx/lifecycle/g0;)V", "d", "()V", "c", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lic/p0;", "x", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "y", "Lod1/a0;", "z", "Lbc3/c0;", "E", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32574a implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: F */
    public static final int f134957F = 8;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final AbstractC18377p0 workManager;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC27837a0 userSessionManager;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2994c0 applicationScope;

    /* JADX INFO: renamed from: sk2.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.prefetch.TrackActivityPrefetchScheduler$onCreate$1", m100430f = "TrackActivityPrefetchScheduler.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lcom/whoop/domain/model/Login;", "it", "Ll83/a0;", "<anonymous>", "(Lcom/whoop/domain/model/Login;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f134962w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C32574a.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Login login, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(login, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f134962w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C32574a.this.m101634c();
            return C23454a0.f92919a;
        }
    }

    public C32574a(AbstractC18377p0 workManager, FeatureFlagChecker featureFlagChecker, InterfaceC27837a0 userSessionManager, InterfaceC2994c0 applicationScope) {
        AbstractC22676k.m65750j(workManager, "workManager");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(userSessionManager, "userSessionManager");
        AbstractC22676k.m65750j(applicationScope, "applicationScope");
        this.workManager = workManager;
        this.featureFlagChecker = featureFlagChecker;
        this.userSessionManager = userSessionManager;
        this.applicationScope = applicationScope;
    }

    /* JADX INFO: renamed from: a */
    private final C18367k0 m101632a() {
        return (C18367k0) ((C18365j0) ((C18365j0) new C18365j0(TrackActivityPrefetchWorker.class, 24L, TimeUnit.HOURS).m52880f(m101633b())).m52879e(EnumC18346a.f71444x, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, TimeUnit.MILLISECONDS)).m52878b();
    }

    /* JADX INFO: renamed from: b */
    private final C18354e m101633b() {
        EnumC18390x enumC18390x = EnumC18390x.f71560w;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        return new C18354e(new C31222e(null), EnumC18390x.f71561x, false, false, false, false, -1L, -1L, AbstractC25265s.m74103I1(linkedHashSet));
    }

    /* JADX INFO: renamed from: c */
    public final void m101634c() {
        if (this.featureFlagChecker.isFeatureEnabled("start-activity-prefetch")) {
            this.workManager.m52876e("ONE_TIME_TRACK_ACTIVITY_PREFETCH_WORK", EnumC18368l.f71504x, (C18347a0) ((C18392z) new C18392z(TrackActivityPrefetchWorker.class).m52880f(m101633b())).m52878b());
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m101635d() {
        if (this.featureFlagChecker.isFeatureEnabled("start-activity-prefetch")) {
            this.workManager.mo52875d("PERIODIC_TRACK_ACTIVITY_PREFETCH_WORK", EnumC18366k.f71499w, m101632a());
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        AbstractC13091v.m36582H(new C13052j1(this.userSessionManager.getLoginFlow(), new b(null), 0), this.applicationScope);
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
