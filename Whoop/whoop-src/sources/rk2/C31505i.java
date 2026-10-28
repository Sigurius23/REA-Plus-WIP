package rk2;

import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.domain.model.Logout;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import od1.InterfaceC27837a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import x90.InterfaceC38100f;

/* JADX INFO: renamed from: rk2.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0015\u0010\u0012J:\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u00182\"\u0010\u001a\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00180\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0016H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, m65681d2 = {"Lrk2/i;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lrk2/f;", "pendingActivitySaveStore", "Lrk2/h;", "saveActivityScheduler", "Lx90/f;", "activitySessionHandler", "Lod1/a0;", "userSessionManager", "Ltr2/n;", "logger", "Lbc3/c0;", "scope", "<init>", "(Lrk2/f;Lrk2/h;Lx90/f;Lod1/a0;Ltr2/n;Lbc3/c0;)V", "Ll83/a0;", "o", "(Lq83/d;)Ljava/lang/Object;", "j", "n", "l", "Lkotlin/Function1;", "Lq83/d;", "Ll83/n;", "", "clear", "p", "(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;", "Landroidx/lifecycle/g0;", "owner", "onCreate", "(Landroidx/lifecycle/g0;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lrk2/f;", "x", "Lrk2/h;", "y", "Lx90/f;", "z", "Lod1/a0;", "E", "Ltr2/n;", "F", "Lbc3/c0;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31505i implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC31502f pendingActivitySaveStore;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C31504h saveActivityScheduler;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC38100f activitySessionHandler;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC27837a0 userSessionManager;

    /* JADX INFO: renamed from: rk2.i$a */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.pendingsave.TrackActivityLogoutLifecycleHandler", m100430f = "TrackActivityLogoutLifecycleHandler.kt", m100431l = {34}, m100432m = "cancelPeriodicRetryWork", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f129983w;

        /* JADX INFO: renamed from: y */
        int f129985y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f129983w = obj;
            this.f129985y |= Integer.MIN_VALUE;
            return C31505i.this.m97082j(this);
        }
    }

    /* JADX INFO: renamed from: rk2.i$b */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.pendingsave.TrackActivityLogoutLifecycleHandler", m100430f = "TrackActivityLogoutLifecycleHandler.kt", m100431l = {58}, m100432m = "clearActiveSession", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f129986w;

        /* JADX INFO: renamed from: y */
        int f129988y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f129986w = obj;
            this.f129988y |= Integer.MIN_VALUE;
            return C31505i.this.m97083l(this);
        }
    }

    /* JADX INFO: renamed from: rk2.i$c */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.pendingsave.TrackActivityLogoutLifecycleHandler$clearActiveSession$result$1", m100430f = "TrackActivityLogoutLifecycleHandler.kt", m100431l = {58}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Ll83/n;", "Ll83/a0;", "<anonymous>", "()Ll83/n;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f129989w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C31505i.this.new c(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objMo122075d;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f129989w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC38100f interfaceC38100f = C31505i.this.activitySessionHandler;
                this.f129989w = 1;
                objMo122075d = interfaceC38100f.mo122075d(this);
                if (objMo122075d == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objMo122075d = ((C23468n) obj).f92940w;
            }
            return new C23468n(objMo122075d);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23468n> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: rk2.i$d */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.pendingsave.TrackActivityLogoutLifecycleHandler", m100430f = "TrackActivityLogoutLifecycleHandler.kt", m100431l = {46}, m100432m = "clearPendingSaves", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f129991w;

        /* JADX INFO: renamed from: y */
        int f129993y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f129991w = obj;
            this.f129993y |= Integer.MIN_VALUE;
            return C31505i.this.m97084n(this);
        }
    }

    /* JADX INFO: renamed from: rk2.i$e */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.pendingsave.TrackActivityLogoutLifecycleHandler$clearPendingSaves$result$1", m100430f = "TrackActivityLogoutLifecycleHandler.kt", m100431l = {46}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Ll83/n;", "Ll83/a0;", "<anonymous>", "()Ll83/n;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f129994w;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C31505i.this.new e(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objMo97070c;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f129994w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC31502f interfaceC31502f = C31505i.this.pendingActivitySaveStore;
                this.f129994w = 1;
                objMo97070c = interfaceC31502f.mo97070c(this);
                if (objMo97070c == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objMo97070c = ((C23468n) obj).f92940w;
            }
            return new C23468n(objMo97070c);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23468n> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: rk2.i$f */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.pendingsave.TrackActivityLogoutLifecycleHandler", m100430f = "TrackActivityLogoutLifecycleHandler.kt", m100431l = {28, 29, 30}, m100432m = "clearTrackActivityStateOnLogout", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f129996w;

        /* JADX INFO: renamed from: y */
        int f129998y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f129996w = obj;
            this.f129998y |= Integer.MIN_VALUE;
            return C31505i.this.m97085o(this);
        }
    }

    /* JADX INFO: renamed from: rk2.i$g */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.pendingsave.TrackActivityLogoutLifecycleHandler", m100430f = "TrackActivityLogoutLifecycleHandler.kt", m100431l = {70, 72}, m100432m = "clearWithRetry-gIAlu-s", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f129999E;

        /* JADX INFO: renamed from: w */
        Object f130000w;

        /* JADX INFO: renamed from: x */
        Object f130001x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f130002y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f130002y = obj;
            this.f129999E |= Integer.MIN_VALUE;
            Object objM97086p = C31505i.this.m97086p(null, this);
            return objM97086p == EnumC31071a.f128113w ? objM97086p : new C23468n(objM97086p);
        }
    }

    /* JADX INFO: renamed from: rk2.i$h */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.pendingsave.TrackActivityLogoutLifecycleHandler$onCreate$1", m100430f = "TrackActivityLogoutLifecycleHandler.kt", m100431l = {C1533u.RECORDING_METHOD_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lcom/whoop/domain/model/Logout;", "it", "Ll83/a0;", "<anonymous>", "(Lcom/whoop/domain/model/Logout;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f130004w;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31505i.this.new h(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Logout logout, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(logout, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f130004w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C31505i c31505i = C31505i.this;
                this.f130004w = 1;
                if (c31505i.m97085o(this) == enumC31071a) {
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

    public C31505i(InterfaceC31502f pendingActivitySaveStore, C31504h saveActivityScheduler, InterfaceC38100f activitySessionHandler, InterfaceC27837a0 userSessionManager, InterfaceC34116n logger, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(pendingActivitySaveStore, "pendingActivitySaveStore");
        AbstractC22676k.m65750j(saveActivityScheduler, "saveActivityScheduler");
        AbstractC22676k.m65750j(activitySessionHandler, "activitySessionHandler");
        AbstractC22676k.m65750j(userSessionManager, "userSessionManager");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(scope, "scope");
        this.pendingActivitySaveStore = pendingActivitySaveStore;
        this.saveActivityScheduler = saveActivityScheduler;
        this.activitySessionHandler = activitySessionHandler;
        this.userSessionManager = userSessionManager;
        this.logger = logger;
        this.scope = scope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m97082j(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        a aVar;
        Object objM97073a;
        Throwable thM68037a;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f129985y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f129985y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f129983w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f129985y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C31504h c31504h = this.saveActivityScheduler;
            aVar.f129985y = 1;
            objM97073a = c31504h.m97073a(aVar);
            if (objM97073a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            objM97073a = ((C23468n) obj).f92940w;
        }
        if ((objM97073a instanceof C23467m) && (thM68037a = C23468n.m68037a(objM97073a)) != null) {
            this.logger.mo85230v("Failed to cancel periodic save activity retry on logout - retry work may continue for previous account", thM68037a, new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m97083l(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        Object objM97086p;
        Throwable thM68037a;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f129988y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f129988y = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f129986w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = bVar.f129988y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Function1 cVar = new c(null);
            bVar.f129988y = 1;
            objM97086p = m97086p(cVar, bVar);
            if (objM97086p == obj2) {
                return obj2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            objM97086p = ((C23468n) obj).f92940w;
        }
        if ((objM97086p instanceof C23467m) && (thM68037a = C23468n.m68037a(objM97086p)) != null) {
            this.logger.mo85230v("Failed to clear activity session on logout - stale session may leak to next account", thM68037a, new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m97084n(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        d dVar;
        Object objM97086p;
        Throwable thM68037a;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f129993y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f129993y = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object obj = dVar.f129991w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = dVar.f129993y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Function1 eVar = new e(null);
            dVar.f129993y = 1;
            objM97086p = m97086p(eVar, dVar);
            if (objM97086p == obj2) {
                return obj2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            objM97086p = ((C23468n) obj).f92940w;
        }
        if ((objM97086p instanceof C23467m) && (thM68037a = C23468n.m68037a(objM97086p)) != null) {
            this.logger.mo85230v("Failed to clear pending activity saves on logout - stale saves may leak to next account", thM68037a, new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (m97083l(r0) == r1) goto L26;
     */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m97085o(q83.InterfaceC30057d<? super l83.C23454a0> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof rk2.C31505i.f
            if (r0 == 0) goto L13
            r0 = r7
            rk2.i$f r0 = (rk2.C31505i.f) r0
            int r1 = r0.f129998y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129998y = r1
            goto L18
        L13:
            rk2.i$f r0 = new rk2.i$f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f129996w
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f129998y
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            p505ts.AbstractC34132o.m107864I(r7)
            goto L5b
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            p505ts.AbstractC34132o.m107864I(r7)
            goto L52
        L39:
            p505ts.AbstractC34132o.m107864I(r7)
            goto L49
        L3d:
            p505ts.AbstractC34132o.m107864I(r7)
            r0.f129998y = r5
            java.lang.Object r7 = r6.m97082j(r0)
            if (r7 != r1) goto L49
            goto L5a
        L49:
            r0.f129998y = r4
            java.lang.Object r7 = r6.m97084n(r0)
            if (r7 != r1) goto L52
            goto L5a
        L52:
            r0.f129998y = r3
            java.lang.Object r7 = r6.m97083l(r0)
            if (r7 != r1) goto L5b
        L5a:
            return r1
        L5b:
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rk2.C31505i.m97085o(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m97086p(p715kotlin.jvm.functions.Function1 r6, q83.InterfaceC30057d<? super l83.C23468n> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof rk2.C31505i.g
            if (r0 == 0) goto L13
            r0 = r7
            rk2.i$g r0 = (rk2.C31505i.g) r0
            int r1 = r0.f129999E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129999E = r1
            goto L18
        L13:
            rk2.i$g r0 = new rk2.i$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f130002y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f129999E
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.f130000w
            kotlin.jvm.functions.Function1 r6 = (p715kotlin.jvm.functions.Function1) r6
            p505ts.AbstractC34132o.m107864I(r7)
            goto L63
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.f130000w
            kotlin.jvm.functions.Function1 r6 = (p715kotlin.jvm.functions.Function1) r6
            p505ts.AbstractC34132o.m107864I(r7)
            goto L4c
        L3e:
            p505ts.AbstractC34132o.m107864I(r7)
            r0.f130000w = r6
            r0.f129999E = r4
            java.lang.Object r7 = r6.invoke(r0)
            if (r7 != r1) goto L4c
            goto L62
        L4c:
            l83.n r7 = (l83.C23468n) r7
            java.lang.Object r7 = r7.f92940w
            boolean r2 = r7 instanceof l83.C23467m
            if (r2 != 0) goto L55
            return r7
        L55:
            r7 = 0
            r0.f130000w = r7
            r0.f130001x = r7
            r0.f129999E = r3
            java.lang.Object r7 = r6.invoke(r0)
            if (r7 != r1) goto L63
        L62:
            return r1
        L63:
            l83.n r7 = (l83.C23468n) r7
            java.lang.Object r6 = r7.f92940w
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rk2.C31505i.m97086p(kotlin.jvm.functions.Function1, q83.d):java.lang.Object");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        AbstractC13091v.m36582H(new C13052j1(this.userSessionManager.getLogoutFlow(), new h(null), 0), this.scope);
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
