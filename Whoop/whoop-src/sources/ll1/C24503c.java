package ll1;

import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.PushNotificationFeatureFlagsKt;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import od1.InterfaceC27844g;
import or2.C28150c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;
import y92.C39352a;

/* JADX INFO: renamed from: ll1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B=\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0014\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010&¨\u0006'"}, m65681d2 = {"Lll1/c;", "Lod1/g;", "Lll1/a;", "", "Ltr2/n;", "logger", "Lor2/c;", "appDiagnostics", "", "", "requiredPermissions", "Ly92/a;", "authManager", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "", "androidOSLevel", "<init>", "(Ltr2/n;Lor2/c;Ljava/util/List;Ly92/a;Lcom/whoop/data/repositories/FeatureFlagChecker;I)V", "permissionsToCheck", "f", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "g", "(Lq83/d;)Ljava/lang/Object;", "a", "Ltr2/n;", "b", "Lor2/c;", "c", "Ljava/util/List;", "d", "Ly92/a;", "e", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "I", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24503c implements InterfaceC27844g<AbstractC24501a, Boolean> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28150c appDiagnostics;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<String> requiredPermissions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C39352a authManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int androidOSLevel;

    /* JADX INFO: renamed from: ll1.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.bluetooth.RequiredPermissionsInteractor$interact$1", m100430f = "RequiredPermissionsInteractor.kt", m100431l = {32, 34, 36, 37}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "", "Lll1/a;", "action", "Ll83/a0;", "<anonymous>", "(Lec3/m;Lll1/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f95585E;

        /* JADX INFO: renamed from: w */
        int f95587w;

        /* JADX INFO: renamed from: x */
        boolean f95588x;

        /* JADX INFO: renamed from: y */
        int f95589y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f95590z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC24501a abstractC24501a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = C24503c.this.new a(interfaceC30057d);
            aVar.f95590z = interfaceC13062m;
            aVar.f95585E = abstractC24501a;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        
            if (r0.emit(r10, r9) == r2) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
        
            if (r0.emit(r3, r9) == r2) goto L32;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f95590z
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                java.lang.Object r1 = r9.f95585E
                ll1.a r1 = (ll1.AbstractC24501a) r1
                r83.a r2 = r83.EnumC31071a.f128113w
                int r3 = r9.f95589y
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                r8 = 0
                if (r3 == 0) goto L32
                if (r3 == r7) goto L2e
                if (r3 == r6) goto L2a
                if (r3 == r5) goto L24
                if (r3 != r4) goto L1c
                goto L2a
            L1c:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L24:
                int r1 = r9.f95587w
                p505ts.AbstractC34132o.m107864I(r10)
                goto L79
            L2a:
                p505ts.AbstractC34132o.m107864I(r10)
                goto L94
            L2e:
                p505ts.AbstractC34132o.m107864I(r10)
                goto L4c
            L32:
                p505ts.AbstractC34132o.m107864I(r10)
                boolean r10 = r1 instanceof ll1.AbstractC24501a.a
                if (r10 == 0) goto L97
                ll1.c r10 = ll1.C24503c.this
                y92.a r10 = ll1.C24503c.m71340c(r10)
                r9.f95590z = r0
                r9.f95585E = r8
                r9.f95589y = r7
                java.lang.Object r10 = r10.m125478a(r9)
                if (r10 != r2) goto L4c
                goto L93
            L4c:
                if (r10 != 0) goto L4f
                goto L50
            L4f:
                r7 = 0
            L50:
                if (r7 == 0) goto L63
                java.lang.Boolean r10 = java.lang.Boolean.FALSE
                r9.f95590z = r8
                r9.f95585E = r8
                r9.f95587w = r7
                r9.f95589y = r6
                java.lang.Object r10 = r0.emit(r10, r9)
                if (r10 != r2) goto L94
                goto L93
            L63:
                ll1.c r10 = ll1.C24503c.this
                java.util.List r1 = ll1.C24503c.m71341d(r10)
                r9.f95590z = r0
                r9.f95585E = r8
                r9.f95587w = r7
                r9.f95589y = r5
                java.lang.Object r10 = ll1.C24503c.m71342e(r10, r1, r9)
                if (r10 != r2) goto L78
                goto L93
            L78:
                r1 = r7
            L79:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r10)
                r9.f95590z = r8
                r9.f95585E = r8
                r9.f95587w = r1
                r9.f95588x = r10
                r9.f95589y = r4
                java.lang.Object r10 = r0.emit(r3, r9)
                if (r10 != r2) goto L94
            L93:
                return r2
            L94:
                l83.a0 r10 = l83.C23454a0.f92919a
                return r10
            L97:
                kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
                r10.<init>()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: ll1.C24503c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ll1.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.bluetooth.RequiredPermissionsInteractor$interact$2", m100430f = "RequiredPermissionsInteractor.kt", m100431l = {43}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f95591w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f95592x;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f95592x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f95592x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f95591w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Boolean bool = Boolean.FALSE;
                this.f95592x = null;
                this.f95591w = 1;
                if (interfaceC13062m.emit(bool, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ll1.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.connectivity.bluetooth.RequiredPermissionsInteractor", m100430f = "RequiredPermissionsInteractor.kt", m100431l = {55}, m100432m = "shouldRequestForPermissions", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f95593w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f95594x;

        /* JADX INFO: renamed from: z */
        int f95596z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f95594x = obj;
            this.f95596z |= Integer.MIN_VALUE;
            return C24503c.this.m71343f(null, this);
        }
    }

    public C24503c(InterfaceC34116n logger, C28150c appDiagnostics, List<String> requiredPermissions, C39352a authManager, FeatureFlagChecker featureFlagChecker, int i13) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(appDiagnostics, "appDiagnostics");
        AbstractC22676k.m65750j(requiredPermissions, "requiredPermissions");
        AbstractC22676k.m65750j(authManager, "authManager");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.logger = logger;
        this.appDiagnostics = appDiagnostics;
        this.requiredPermissions = requiredPermissions;
        this.authManager = authManager;
        this.featureFlagChecker = featureFlagChecker;
        this.androidOSLevel = i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m71343f(List<String> list, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f95596z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f95596z = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM125478a = cVar.f95594x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f95596z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM125478a);
            C39352a c39352a = this.authManager;
            cVar.f95593w = list;
            cVar.f95596z = 1;
            objM125478a = c39352a.m125478a(cVar);
            if (objM125478a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) cVar.f95593w;
            AbstractC34132o.m107864I(objM125478a);
        }
        if (objM125478a == null) {
            return Boolean.FALSE;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!this.appDiagnostics.m85179b((String) it.next())) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: g */
    public final Object m71344g(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return (this.androidOSLevel < 33 || !this.featureFlagChecker.isFeatureEnabled(PushNotificationFeatureFlagsKt.PUSH_NOTIFICATIONS_PERMISSION_REQUEST_FIX)) ? Boolean.FALSE : m71343f(AbstractC37056f.m118958J("android.permission.POST_NOTIFICATIONS"), interfaceC30057d);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13015a0(new b(null), AbstractC13091v.m36590P(upstream, new a(null)));
    }
}
