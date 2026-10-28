package pj1;

import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: pj1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lpj1/a;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lpj1/b;", "healthConnectRepository", "Lbc3/c0;", "scope", "<init>", "(Lpj1/b;Lbc3/c0;)V", "Ll83/a0;", "c", "()V", "b", "Landroidx/lifecycle/g0;", "owner", "onStart", "(Landroidx/lifecycle/g0;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lpj1/b;", "x", "Lbc3/c0;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29297a implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C29298b healthConnectRepository;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: pj1.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.healthconnect.repository.HealthConnectChecker$mutateRecords$1", m100430f = "HealthConnectChecker.kt", m100431l = {34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f118556w;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C29297a.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f118556w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C29298b c29298b = C29297a.this.healthConnectRepository;
                this.f118556w = 1;
                if (c29298b.m88923d(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: pj1.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.healthconnect.repository.HealthConnectChecker$readRecords$1", m100430f = "HealthConnectChecker.kt", m100431l = {21, C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER, C1533u.RECORDING_METHOD_FIELD_NUMBER, 24, 25, 26, 27}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f118558w;

        /* JADX INFO: renamed from: x */
        int f118559x;

        /* JADX INFO: renamed from: y */
        int f118560y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C29297a.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x007d A[PHI: r1 r2
          0x007d: PHI (r1v4 int) = (r1v2 int), (r1v5 int) binds: [B:18:0x007a, B:11:0x0042] A[DONT_GENERATE, DONT_INLINE]
          0x007d: PHI (r2v6 pj1.b) = (r2v3 pj1.b), (r2v8 pj1.b) binds: [B:18:0x007a, B:11:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:23:0x008b A[PHI: r1 r2
          0x008b: PHI (r1v6 int) = (r1v4 int), (r1v7 int) binds: [B:21:0x0088, B:10:0x0038] A[DONT_GENERATE, DONT_INLINE]
          0x008b: PHI (r2v9 pj1.b) = (r2v6 pj1.b), (r2v11 pj1.b) binds: [B:21:0x0088, B:10:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:26:0x0099 A[PHI: r1 r2
          0x0099: PHI (r1v8 int) = (r1v6 int), (r1v9 int) binds: [B:24:0x0096, B:9:0x002e] A[DONT_GENERATE, DONT_INLINE]
          0x0099: PHI (r2v12 pj1.b) = (r2v9 pj1.b), (r2v14 pj1.b) binds: [B:24:0x0096, B:9:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:29:0x00a7 A[PHI: r1 r2
          0x00a7: PHI (r1v10 int) = (r1v8 int), (r1v11 int) binds: [B:27:0x00a4, B:8:0x0023] A[DONT_GENERATE, DONT_INLINE]
          0x00a7: PHI (r2v15 pj1.b) = (r2v12 pj1.b), (r2v17 pj1.b) binds: [B:27:0x00a4, B:8:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:32:0x00b5 A[PHI: r1 r2
          0x00b5: PHI (r1v12 int) = (r1v10 int), (r1v13 int) binds: [B:30:0x00b2, B:7:0x0018] A[DONT_GENERATE, DONT_INLINE]
          0x00b5: PHI (r2v18 pj1.b) = (r2v15 pj1.b), (r2v20 pj1.b) binds: [B:30:0x00b2, B:7:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00c1, code lost:
        
            if (r2.m88928j(r3) == r0) goto L34;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                Method dump skipped, instruction units count: 220
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pj1.C29297a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C29297a(C29298b healthConnectRepository, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(healthConnectRepository, "healthConnectRepository");
        AbstractC22676k.m65750j(scope, "scope");
        this.healthConnectRepository = healthConnectRepository;
        this.scope = scope;
    }

    /* JADX INFO: renamed from: b */
    private final void m88916b() {
        AbstractC3006f0.m8732z(this.scope, null, null, new a(null), 3);
    }

    /* JADX INFO: renamed from: c */
    private final void m88917c() {
        AbstractC3006f0.m8732z(this.scope, null, null, new b(null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onCreate(InterfaceC1585g0 interfaceC1585g0) {
        super.onCreate(interfaceC1585g0);
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
        m88917c();
        m88916b();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
        super.onStop(interfaceC1585g0);
    }
}
