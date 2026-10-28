package or2;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagRepository;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Set;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: or2.r */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lor2/r;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "Lrr2/c;", "crashReporter", "Lbc3/c0;", "applicationScope", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagRepository;Lrr2/c;Lbc3/c0;)V", "Landroidx/lifecycle/g0;", "owner", "Ll83/a0;", "onCreate", "(Landroidx/lifecycle/g0;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcom/whoop/data/repositories/FeatureFlagRepository;", "x", "Lrr2/c;", "y", "Lbc3/c0;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28195r implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final FeatureFlagRepository featureFlagRepository;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 applicationScope;

    /* JADX INFO: renamed from: or2.r$a */
    @InterfaceC32271e(m100429c = "com.whoop.util.CrashReporterFeatureFlagInstaller$onCreate$1", m100430f = "CrashReporterFeatureFlagInstaller.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"", "", "it", "Ll83/a0;", "<anonymous>", "(Ljava/util/Set;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f113937w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f113938x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C28195r.this.new a(interfaceC30057d);
            aVar.f113938x = obj;
            return aVar;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Set set = (Set) this.f113938x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f113937w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C28195r.this.crashReporter.mo98627j("experiments", AbstractC25247g0.m73989X(new C23465k("experiments", set.toArray(new String[0]))));
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(Set<String> set, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(set, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C28195r(FeatureFlagRepository featureFlagRepository, InterfaceC31766c crashReporter, InterfaceC2994c0 applicationScope) {
        AbstractC22676k.m65750j(featureFlagRepository, "featureFlagRepository");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(applicationScope, "applicationScope");
        this.featureFlagRepository = featureFlagRepository;
        this.crashReporter = crashReporter;
        this.applicationScope = applicationScope;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        AbstractC13091v.m36582H(new C13052j1(this.featureFlagRepository.getFeatureFlagsFlow(), new a(null), 0), this.applicationScope);
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
