package x42;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import gt0.AbstractC16185g;
import gt0.InterfaceC16183e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p218ic.AbstractC18377p0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import y42.AbstractC39224f;
import y42.C39228j;
import y42.InterfaceC39219a;

/* JADX INFO: renamed from: x42.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m65681d2 = {"Lx42/c;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Ly42/j;", "puffinManager", "Lgt0/e;", "firmwareUpdateApi", "Lbc3/c0;", "scope", "Lic/p0;", "workManager", "Ltr2/n;", "logger", "<init>", "(Ly42/j;Lgt0/e;Lbc3/c0;Lic/p0;Ltr2/n;)V", "Ly42/a;", "puffin", "Ll83/a0;", "c", "(Ly42/a;)V", "b", "()V", "Landroidx/lifecycle/g0;", "owner", "onCreate", "(Landroidx/lifecycle/g0;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ly42/j;", "x", "Lgt0/e;", "y", "Lbc3/c0;", "z", "Lic/p0;", "E", "Ltr2/n;", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37966c implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C39228j puffinManager;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC16183e firmwareUpdateApi;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final AbstractC18377p0 workManager;

    /* JADX INFO: renamed from: x42.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.PuffinFwUpdateMonitor$onCreate$1", m100430f = "PuffinFwUpdateMonitor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ly42/a;", "puffin", "Ll83/a0;", "<anonymous>", "(Ly42/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f162590w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f162591x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C37966c.this.new a(interfaceC30057d);
            aVar.f162591x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC39219a interfaceC39219a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC39219a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC39219a interfaceC39219a = (InterfaceC39219a) this.f162591x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f162590w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C37966c.this.m121606c(interfaceC39219a);
            return C23454a0.f92919a;
        }
    }

    public C37966c(C39228j puffinManager, InterfaceC16183e firmwareUpdateApi, InterfaceC2994c0 scope, AbstractC18377p0 workManager, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(puffinManager, "puffinManager");
        AbstractC22676k.m65750j(firmwareUpdateApi, "firmwareUpdateApi");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(workManager, "workManager");
        AbstractC22676k.m65750j(logger, "logger");
        this.puffinManager = puffinManager;
        this.firmwareUpdateApi = firmwareUpdateApi;
        this.scope = scope;
        this.workManager = workManager;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: b */
    private final void m121605b() {
        this.logger.mo85216g("Cancelling Puffin periodic firmware update check worker", new AbstractC30556a.a[0]);
        this.workManager.mo52873b("PuffinPeriodicFwUpdateCheckWorker");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final void m121606c(InterfaceC39219a puffin) {
        this.logger.mo85216g("Triggering firmware update for " + puffin.mo124935O(), new AbstractC30556a.a[0]);
        this.firmwareUpdateApi.mo45721b(new AbstractC16185g.e(AbstractC39224f.m124963a(puffin)));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        m121605b();
        AbstractC13091v.m36582H(new C13052j1(this.puffinManager.m124994e(), new a(null), 0), this.scope);
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
