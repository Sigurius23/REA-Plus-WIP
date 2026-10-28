package t03;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3061u;
import c93.InterfaceC4351m;
import com.whoop.workmanager.smartalarmdiagnosticworkmanager.SmartAlarmDiagnosticUploadWorker;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import l83.C23454a0;
import m83.AbstractC25265s;
import p218ic.AbstractC18377p0;
import p218ic.C18354e;
import p218ic.C18365j0;
import p218ic.C18367k0;
import p218ic.EnumC18346a;
import p218ic.EnumC18366k;
import p218ic.EnumC18390x;
import p457rc.C31222e;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import up0.C35150a;

/* JADX INFO: renamed from: t03.a */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, m65681d2 = {"Lt03/a;", "Lbc3/c0;", "Lic/p0;", "workManager", "Lin2/d;", "dispatcherFactory", "Lup0/a;", "workManagerUtil", "<init>", "(Lic/p0;Lin2/d;Lup0/a;)V", "Lic/e;", "c", "()Lic/e;", "Lic/k0;", "d", "()Lic/k0;", "Ll83/a0;", "e", "()V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lic/p0;", "x", "Lin2/d;", "y", "Lup0/a;", "", "z", "J", "repeatIntervalMinutes", "Lbc3/u;", "E", "Lbc3/u;", "job", "Lq83/j;", "getCoroutineContext", "()Lq83/j;", "coroutineContext", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33267a implements InterfaceC2994c0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC3061u job;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final AbstractC18377p0 workManager;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC18732d dispatcherFactory;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C35150a workManagerUtil;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final long repeatIntervalMinutes;

    /* JADX INFO: renamed from: t03.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.workmanager.smartalarmdiagnosticworkmanager.SmartAlarmDiagnosticUploadScheduler$schedulePeriodicUpload$1", m100430f = "SmartAlarmDiagnosticUploadScheduler.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f138694w;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C33267a.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f138694w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C33267a.this.workManager.mo52875d("PERIODIC_SMART_ALARM_DIAGNOSTIC_UPLOAD_WORK", EnumC18366k.f71499w, C33267a.this.m105540d());
            return C23454a0.f92919a;
        }
    }

    public C33267a(AbstractC18377p0 workManager, InterfaceC18732d dispatcherFactory, C35150a workManagerUtil) {
        AbstractC22676k.m65750j(workManager, "workManager");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(workManagerUtil, "workManagerUtil");
        this.workManager = workManager;
        this.dispatcherFactory = dispatcherFactory;
        this.workManagerUtil = workManagerUtil;
        this.repeatIntervalMinutes = 30L;
        this.job = AbstractC3006f0.m8710d();
    }

    /* JADX INFO: renamed from: c */
    private final C18354e m105539c() {
        EnumC18390x enumC18390x = EnumC18390x.f71560w;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        return new C18354e(new C31222e(null), EnumC18390x.f71561x, false, false, false, false, -1L, -1L, AbstractC25265s.m74103I1(linkedHashSet));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final C18367k0 m105540d() {
        return (C18367k0) ((C18365j0) ((C18365j0) new C18365j0(SmartAlarmDiagnosticUploadWorker.class, this.repeatIntervalMinutes, TimeUnit.MINUTES).m52880f(m105539c())).m52879e(EnumC18346a.f71444x, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, TimeUnit.MILLISECONDS)).m52878b();
    }

    /* JADX INFO: renamed from: e */
    public final void m105541e() {
        AbstractC3006f0.m8732z(this, null, null, new a(null), 3);
    }

    @Override // bc3.InterfaceC2994c0
    public InterfaceC30063j getCoroutineContext() {
        return this.dispatcherFactory.mo54465b().plus(this.job);
    }
}
