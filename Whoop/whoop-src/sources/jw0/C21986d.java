package jw0;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import lw0.C24764a;
import mw0.AbstractC25974b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wm0.C37378a;

/* JADX INFO: renamed from: jw0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Ljw0/d;", "", "Lin2/d;", "dispatcher", "Llw0/a;", "sleepRepository", "Lwm0/a;", "scopeCoordinator", "<init>", "(Lin2/d;Llw0/a;Lwm0/a;)V", "", "sleepIdV2", "Lec3/l;", "Ljw0/c;", "f", "(Ljava/lang/String;)Lec3/l;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lmw0/b;", "viewEvent", "g", "(Lmw0/b;Lq83/d;)Ljava/lang/Object;", "a", "Lin2/d;", "b", "Llw0/a;", "c", "Lwm0/a;", "", "d", "J", "successScreenVisibilityLength", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21986d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC18732d dispatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C24764a sleepRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C37378a scopeCoordinator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long successScreenVisibilityLength;

    /* JADX INFO: renamed from: jw0.d$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.sleep.domain.SleepDetailsDialogInteractor$deleteSleep$1", m100430f = "SleepDetailsDialogInteractor.kt", m100431l = {30, 31, 32, 33, 34, 35, 37}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ljw0/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f85143w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f85144x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f85146z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f85146z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C21986d.this.new a(this.f85146z, interfaceC30057d);
            aVar.f85144x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0054 A[PHI: r8
          0x0054: PHI (r8v6 java.lang.Object) = (r8v5 java.lang.Object), (r8v0 java.lang.Object) binds: [B:16:0x0051, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:20:0x005c  */
        /* JADX WARN: Code duplicated, block: B:23:0x006e  */
        /* JADX WARN: Code duplicated, block: B:26:0x007c  */
        /* JADX WARN: Code duplicated, block: B:29:0x008e  */
        /* JADX WARN: Code duplicated, block: B:32:0x009c  */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00b8, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L34;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 210
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: jw0.C21986d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: jw0.d$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.sleep.domain.SleepDetailsDialogInteractor$interact$2", m100430f = "SleepDetailsDialogInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lec3/l;", "Ljw0/c;", "<anonymous>", "(Lbc3/c0;)Lec3/l;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f85147w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC25974b f85148x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C21986d f85149y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC25974b abstractC25974b, C21986d c21986d, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f85148x = abstractC25974b;
            this.f85149y = c21986d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f85148x, this.f85149y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f85147w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC25974b abstractC25974b = this.f85148x;
            if (abstractC25974b instanceof AbstractC25974b.a) {
                return this.f85149y.m62780f(((AbstractC25974b.a) abstractC25974b).getSleepIdV2());
            }
            if (abstractC25974b instanceof AbstractC25974b.b) {
                return this.f85149y.m62781h(((AbstractC25974b.b) abstractC25974b).getSleepIdV2());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: jw0.d$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.sleep.domain.SleepDetailsDialogInteractor$napToSleep$1", m100430f = "SleepDetailsDialogInteractor.kt", m100431l = {47, 48, 49, 56, 57, 58}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ljw0/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        private /* synthetic */ Object f85150E;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ String f85152G;

        /* JADX INFO: renamed from: w */
        Object f85153w;

        /* JADX INFO: renamed from: x */
        Object f85154x;

        /* JADX INFO: renamed from: y */
        int f85155y;

        /* JADX INFO: renamed from: z */
        int f85156z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f85152G = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C21986d.this.new c(this.f85152G, interfaceC30057d);
            cVar.f85150E = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x006d A[PHI: r8
          0x006d: PHI (r8v6 java.lang.Object) = (r8v5 java.lang.Object), (r8v0 java.lang.Object) binds: [B:17:0x006a, B:11:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:21:0x0072  */
        /* JADX WARN: Code duplicated, block: B:24:0x008f  */
        /* JADX WARN: Code duplicated, block: B:27:0x00a5 A[PHI: r0 r2 r4
          0x00a5: PHI (r0v4 ec3.m) = (r0v1 ec3.m), (r0v7 ec3.m) binds: [B:25:0x00a2, B:8:0x0024] A[DONT_GENERATE, DONT_INLINE]
          0x00a5: PHI (r2v4 int) = (r2v3 int), (r2v8 int) binds: [B:25:0x00a2, B:8:0x0024] A[DONT_GENERATE, DONT_INLINE]
          0x00a5: PHI (r4v3 jw0.d) = (r4v1 jw0.d), (r4v6 jw0.d) binds: [B:25:0x00a2, B:8:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
        
            if (r0.emit(r4, r7) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00cd, code lost:
        
            if (r2.emit(r8, r7) == r1) goto L33;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 230
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: jw0.C21986d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C21986d(InterfaceC18732d dispatcher, C24764a sleepRepository, C37378a scopeCoordinator) {
        AbstractC22676k.m65750j(dispatcher, "dispatcher");
        AbstractC22676k.m65750j(sleepRepository, "sleepRepository");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        this.dispatcher = dispatcher;
        this.sleepRepository = sleepRepository;
        this.scopeCoordinator = scopeCoordinator;
        this.successScreenVisibilityLength = 2000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final InterfaceC13058l m62780f(String sleepIdV2) {
        return new C13084s1(new a(sleepIdV2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final InterfaceC13058l m62781h(String sleepIdV2) {
        return new C13084s1(new c(sleepIdV2, null));
    }

    /* JADX INFO: renamed from: g */
    public final Object m62782g(AbstractC25974b abstractC25974b, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.dispatcher.mo54465b(), new b(abstractC25974b, this, null), interfaceC30057d);
    }
}
