package cr1;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.integrations.domain.IntegrationsApi;
import com.whoop.integrations.domain.models.IntegrationsDetailsComponentsModel;
import com.whoop.integrations.domain.models.IntegrationsDisclaimerModel;
import com.whoop.integrations.domain.models.IntegrationsDiscoveryComponentsModel;
import com.whoop.integrations.domain.models.IntegrationsPrivacyControlUpdate;
import com.whoop.integrations.domain.models.IntegrationsPrivacyControlsRequest;
import com.whoop.integrations.domain.models.p061v2.IntegrationsDetailsV2ComponentsModel;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: cr1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0082@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0010\u0010\u000fJ&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J-\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u001c\u0010\u000fJ\u0018\u0010\u001d\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u001d\u0010\u000fJ!\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\b¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, m65681d2 = {"Lcr1/c;", "", "Lcom/whoop/integrations/domain/IntegrationsApi;", "integrationsApi", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/integrations/domain/IntegrationsApi;Ltr2/n;)V", "Lec3/l;", "Lcr1/b;", "q", "(Lq83/d;)Ljava/lang/Object;", "", "integrationId", "s", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "m", "integrationIdFor3P", "l", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "p", "(Ljava/lang/String;)Lec3/l;", "t", "type", "", "isEnabled", "u", "(Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;", "n", "o", "Lcr1/a;", "upstream", "r", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/integrations/domain/IntegrationsApi;", "b", "Ltr2/n;", "integrations_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11083c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final IntegrationsApi integrationsApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: cr1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.integrations.domain.IntegrationsInteractor$disconnect3PIntegration$2", m100430f = "IntegrationsInteractor.kt", m100431l = {106, 108, 113, 114, 107}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcr1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f35065E;

        /* JADX INFO: renamed from: F */
        int f35066F;

        /* JADX INFO: renamed from: G */
        private /* synthetic */ Object f35067G;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ String f35069I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ String f35070J;

        /* JADX INFO: renamed from: w */
        Object f35071w;

        /* JADX INFO: renamed from: x */
        Object f35072x;

        /* JADX INFO: renamed from: y */
        Object f35073y;

        /* JADX INFO: renamed from: z */
        Object f35074z;

        /* JADX INFO: renamed from: cr1.c$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.integrations.domain.IntegrationsInteractor$disconnect3PIntegration$2$1", m100430f = "IntegrationsInteractor.kt", m100431l = {109}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41443a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f35075w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C11083c f35076x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f35077y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41443a(C11083c c11083c, String str, InterfaceC30057d<? super C41443a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f35076x = c11083c;
                this.f35077y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new C41443a(this.f35076x, this.f35077y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f35075w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                IntegrationsApi integrationsApi = this.f35076x.integrationsApi;
                String str = this.f35077y;
                this.f35075w = 1;
                Object objDisconnect3P = integrationsApi.disconnect3P(str, this);
                return objDisconnect3P == enumC31071a ? enumC31071a : objDisconnect3P;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                return ((C41443a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX INFO: renamed from: cr1.c$a$b */
        @InterfaceC32271e(m100429c = "com.whoop.integrations.domain.IntegrationsInteractor$disconnect3PIntegration$2$2$1", m100430f = "IntegrationsInteractor.kt", m100431l = {115}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcr1/b;", "<anonymous>", "(Lbc3/c0;)Lcr1/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f35078w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C11083c f35079x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f35080y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C11083c c11083c, String str, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f35079x = c11083c;
                this.f35080y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f35079x, this.f35080y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC11082b> interfaceC30057d) {
                return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f35078w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C11083c c11083c = this.f35079x;
                String str = this.f35080y;
                this.f35078w = 1;
                Object objM29905n = c11083c.m29905n(str, this);
                return objM29905n == enumC31071a ? enumC31071a : objM29905n;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f35069I = str;
            this.f35070J = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C11083c.this.new a(this.f35069I, this.f35070J, interfaceC30057d);
            aVar.f35067G = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x004d A[PHI: r1 r2 r3 r4
          0x004d: PHI (r1v4 ec3.m) = (r1v3 ec3.m), (r1v13 ec3.m) binds: [B:27:0x00b9, B:13:0x0037] A[DONT_GENERATE, DONT_INLINE]
          0x004d: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v10 java.lang.String) binds: [B:27:0x00b9, B:13:0x0037] A[DONT_GENERATE, DONT_INLINE]
          0x004d: PHI (r3v4 cr1.c) = (r3v3 cr1.c), (r3v6 cr1.c) binds: [B:27:0x00b9, B:13:0x0037] A[DONT_GENERATE, DONT_INLINE]
          0x004d: PHI (r4v3 int) = (r4v2 int), (r4v4 int) binds: [B:27:0x00b9, B:13:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:26:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:33:0x00de  */
        /* JADX WARN: Code duplicated, block: B:35:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:41:0x00f6  */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00d5, code lost:
        
            if (r1 == r9) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00f0, code lost:
        
            if (r1.emit(r0, r15) == r9) goto L38;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
                Method dump skipped, instruction units count: 252
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: cr1.C11083c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: cr1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.integrations.domain.IntegrationsInteractor$disconnectIntegration$2", m100430f = "IntegrationsInteractor.kt", m100431l = {86, 88, 93, 94, 87}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcr1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f35081E;

        /* JADX INFO: renamed from: F */
        int f35082F;

        /* JADX INFO: renamed from: G */
        private /* synthetic */ Object f35083G;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ String f35085I;

        /* JADX INFO: renamed from: w */
        Object f35086w;

        /* JADX INFO: renamed from: x */
        Object f35087x;

        /* JADX INFO: renamed from: y */
        Object f35088y;

        /* JADX INFO: renamed from: z */
        Object f35089z;

        /* JADX INFO: renamed from: cr1.c$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.integrations.domain.IntegrationsInteractor$disconnectIntegration$2$1", m100430f = "IntegrationsInteractor.kt", m100431l = {89}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f35090w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C11083c f35091x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f35092y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C11083c c11083c, String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f35091x = c11083c;
                this.f35092y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f35091x, this.f35092y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f35090w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                IntegrationsApi integrationsApi = this.f35091x.integrationsApi;
                String str = this.f35092y;
                this.f35090w = 1;
                Object objDisconnectIntegration = integrationsApi.disconnectIntegration(str, this);
                return objDisconnectIntegration == enumC31071a ? enumC31071a : objDisconnectIntegration;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX INFO: renamed from: cr1.c$b$b, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.integrations.domain.IntegrationsInteractor$disconnectIntegration$2$2$1", m100430f = "IntegrationsInteractor.kt", m100431l = {95}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcr1/b;", "<anonymous>", "(Lbc3/c0;)Lcr1/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41444b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f35093w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C11083c f35094x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f35095y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41444b(C11083c c11083c, String str, InterfaceC30057d<? super C41444b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f35094x = c11083c;
                this.f35095y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C41444b(this.f35094x, this.f35095y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC11082b> interfaceC30057d) {
                return ((C41444b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f35093w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C11083c c11083c = this.f35094x;
                String str = this.f35095y;
                this.f35093w = 1;
                Object objM29905n = c11083c.m29905n(str, this);
                return objM29905n == enumC31071a ? enumC31071a : objM29905n;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f35085I = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C11083c.this.new b(this.f35085I, interfaceC30057d);
            bVar.f35083G = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x004d A[PHI: r1 r2 r3 r4
          0x004d: PHI (r1v4 ec3.m) = (r1v3 ec3.m), (r1v13 ec3.m) binds: [B:27:0x00b9, B:13:0x0037] A[DONT_GENERATE, DONT_INLINE]
          0x004d: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v10 java.lang.String) binds: [B:27:0x00b9, B:13:0x0037] A[DONT_GENERATE, DONT_INLINE]
          0x004d: PHI (r3v4 cr1.c) = (r3v3 cr1.c), (r3v6 cr1.c) binds: [B:27:0x00b9, B:13:0x0037] A[DONT_GENERATE, DONT_INLINE]
          0x004d: PHI (r4v3 int) = (r4v2 int), (r4v4 int) binds: [B:27:0x00b9, B:13:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:26:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:33:0x00de  */
        /* JADX WARN: Code duplicated, block: B:35:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:41:0x00f6  */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00d5, code lost:
        
            if (r1 == r9) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00f0, code lost:
        
            if (r1.emit(r0, r15) == r9) goto L38;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
                Method dump skipped, instruction units count: 252
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: cr1.C11083c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: cr1.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.integrations.domain.IntegrationsInteractor", m100430f = "IntegrationsInteractor.kt", m100431l = {170, 172}, m100432m = "fetchIntegrationDetailsData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f35096w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f35097x;

        /* JADX INFO: renamed from: z */
        int f35099z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f35097x = obj;
            this.f35099z |= Integer.MIN_VALUE;
            return C11083c.this.m29905n(null, this);
        }
    }

    /* JADX INFO: renamed from: cr1.c$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.integrations.domain.IntegrationsInteractor$fetchIntegrationDetailsData$2", m100430f = "IntegrationsInteractor.kt", m100431l = {173}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/integrations/domain/models/IntegrationsDetailsComponentsModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f35100w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f35102y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f35102y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C11083c.this.new d(this.f35102y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f35100w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            IntegrationsApi integrationsApi = C11083c.this.integrationsApi;
            String str = this.f35102y;
            this.f35100w = 1;
            Object objFetchIntegrationDetailScreenComponents = integrationsApi.fetchIntegrationDetailScreenComponents(str, this);
            return objFetchIntegrationDetailScreenComponents == enumC31071a ? enumC31071a : objFetchIntegrationDetailScreenComponents;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super IntegrationsDetailsComponentsModel> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: cr1.c$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.integrations.domain.IntegrationsInteractor", m100430f = "IntegrationsInteractor.kt", m100431l = {182}, m100432m = "fetchIntegrationDetailsV2Data", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f35103w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f35104x;

        /* JADX INFO: renamed from: z */
        int f35106z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f35104x = obj;
            this.f35106z |= Integer.MIN_VALUE;
            return C11083c.this.m29906o(null, this);
        }
    }

    /* JADX INFO: renamed from: cr1.c$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.integrations.domain.IntegrationsInteractor$fetchIntegrationDetailsV2Data$2", m100430f = "IntegrationsInteractor.kt", m100431l = {183}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/integrations/domain/models/v2/IntegrationsDetailsV2ComponentsModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f35107w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f35109y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, InterfaceC30057d<? super f> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f35109y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C11083c.this.new f(this.f35109y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f35107w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            IntegrationsApi integrationsApi = C11083c.this.integrationsApi;
            String str = this.f35109y;
            this.f35107w = 1;
            Object objFetchIntegrationDetailScreenV2Components = integrationsApi.fetchIntegrationDetailScreenV2Components(str, this);
            return objFetchIntegrationDetailScreenV2Components == enumC31071a ? enumC31071a : objFetchIntegrationDetailScreenV2Components;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super IntegrationsDetailsV2ComponentsModel> interfaceC30057d) {
            return ((f) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: cr1.c$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.integrations.domain.IntegrationsInteractor$fetchIntegrationDisclaimerData$1", m100430f = "IntegrationsInteractor.kt", m100431l = {125, 127, 126}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcr1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f35110E;

        /* JADX INFO: renamed from: w */
        Object f35111w;

        /* JADX INFO: renamed from: x */
        int f35112x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f35113y;

        /* JADX INFO: renamed from: cr1.c$g$a */
        @InterfaceC32271e(m100429c = "com.whoop.integrations.domain.IntegrationsInteractor$fetchIntegrationDisclaimerData$1$1", m100430f = "IntegrationsInteractor.kt", m100431l = {128}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/integrations/domain/models/IntegrationsDisclaimerModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f35115w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C11083c f35116x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f35117y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C11083c c11083c, String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f35116x = c11083c;
                this.f35117y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f35116x, this.f35117y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f35115w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                IntegrationsApi integrationsApi = this.f35116x.integrationsApi;
                String str = this.f35117y;
                this.f35115w = 1;
                Object objFetchIntegrationDisclaimerScreenComponents = integrationsApi.fetchIntegrationDisclaimerScreenComponents(str, this);
                return objFetchIntegrationDisclaimerScreenComponents == enumC31071a ? enumC31071a : objFetchIntegrationDisclaimerScreenComponents;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super IntegrationsDisclaimerModel> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f35110E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = C11083c.this.new g(this.f35110E, interfaceC30057d);
            gVar.f35113y = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x006d  */
        /* JADX WARN: Code duplicated, block: B:21:0x007b  */
        /* JADX WARN: Code duplicated, block: B:23:0x007f  */
        /* JADX WARN: Code duplicated, block: B:29:0x0091  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x008b, code lost:
        
            if (r8.emit(r1, r12) == r9) goto L26;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = r12.f35113y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r12.f35112x
                r10 = 3
                r1 = 2
                r2 = 1
                r11 = 0
                if (r0 == 0) goto L30
                if (r0 == r2) goto L2c
                if (r0 == r1) goto L22
                if (r0 != r10) goto L1a
                p505ts.AbstractC34132o.m107864I(r13)
                goto L8e
            L1a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L22:
                java.lang.Object r0 = r12.f35111w
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                p505ts.AbstractC34132o.m107864I(r13)
                r0 = r13
                goto L67
            L2c:
                p505ts.AbstractC34132o.m107864I(r13)
                goto L43
            L30:
                p505ts.AbstractC34132o.m107864I(r13)
                cr1.b$h r0 = new cr1.b$h
                r0.<init>(r11, r2, r11)
                r12.f35113y = r8
                r12.f35112x = r2
                java.lang.Object r0 = r8.emit(r0, r12)
                if (r0 != r9) goto L43
                goto L8d
            L43:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                cr1.c r2 = cr1.C11083c.this
                tr2.n r2 = cr1.C11083c.m29899h(r2)
                cr1.c$g$a r4 = new cr1.c$g$a
                cr1.c r3 = cr1.C11083c.this
                java.lang.String r6 = r12.f35110E
                r4.<init>(r3, r6, r11)
                r12.f35113y = r11
                r12.f35111w = r8
                r12.f35112x = r1
                r1 = r2
                r2 = 0
                r3 = 0
                r6 = 6
                r7 = 0
                r5 = r12
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L67
                goto L8d
            L67:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L7b
                cr1.b$e r1 = new cr1.b$e
                u02.a$c r0 = (u02.InterfaceC34385a.c) r0
                java.lang.Object r0 = r0.m108735a()
                com.whoop.integrations.domain.models.IntegrationsDisclaimerModel r0 = (com.whoop.integrations.domain.models.IntegrationsDisclaimerModel) r0
                r1.<init>(r0)
                goto L81
            L7b:
                boolean r0 = r0 instanceof u02.InterfaceC34385a.b
                if (r0 == 0) goto L91
                cr1.b$a r1 = cr1.InterfaceC11082b.a.f35053a
            L81:
                r12.f35113y = r11
                r12.f35111w = r11
                r12.f35112x = r10
                java.lang.Object r0 = r8.emit(r1, r12)
                if (r0 != r9) goto L8e
            L8d:
                return r9
            L8e:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            L91:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: cr1.C11083c.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: cr1.c$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.integrations.domain.IntegrationsInteractor$fetchIntegrationsDiscoveryData$2", m100430f = "IntegrationsInteractor.kt", m100431l = {65, 67, 66}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcr1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f35118w;

        /* JADX INFO: renamed from: x */
        int f35119x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f35120y;

        /* JADX INFO: renamed from: cr1.c$h$a */
        @InterfaceC32271e(m100429c = "com.whoop.integrations.domain.IntegrationsInteractor$fetchIntegrationsDiscoveryData$2$1", m100430f = "IntegrationsInteractor.kt", m100431l = {68}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/integrations/domain/models/IntegrationsDiscoveryComponentsModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f35122w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C11083c f35123x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C11083c c11083c, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f35123x = c11083c;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f35123x, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f35122w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                IntegrationsApi integrationsApi = this.f35123x.integrationsApi;
                this.f35122w = 1;
                Object objFetchIntegrationsDiscoveryScreenComponents = integrationsApi.fetchIntegrationsDiscoveryScreenComponents(this);
                return objFetchIntegrationsDiscoveryScreenComponents == enumC31071a ? enumC31071a : objFetchIntegrationsDiscoveryScreenComponents;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super IntegrationsDiscoveryComponentsModel> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = C11083c.this.new h(interfaceC30057d);
            hVar.f35120y = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x006b  */
        /* JADX WARN: Code duplicated, block: B:21:0x0079  */
        /* JADX WARN: Code duplicated, block: B:23:0x007d  */
        /* JADX WARN: Code duplicated, block: B:29:0x008f  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
        
            if (r8.emit(r1, r12) == r9) goto L26;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = r12.f35120y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r12.f35119x
                r10 = 3
                r1 = 2
                r2 = 1
                r11 = 0
                if (r0 == 0) goto L30
                if (r0 == r2) goto L2c
                if (r0 == r1) goto L22
                if (r0 != r10) goto L1a
                p505ts.AbstractC34132o.m107864I(r13)
                goto L8c
            L1a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L22:
                java.lang.Object r0 = r12.f35118w
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                p505ts.AbstractC34132o.m107864I(r13)
                r0 = r13
                goto L65
            L2c:
                p505ts.AbstractC34132o.m107864I(r13)
                goto L43
            L30:
                p505ts.AbstractC34132o.m107864I(r13)
                cr1.b$h r0 = new cr1.b$h
                r0.<init>(r11, r2, r11)
                r12.f35120y = r8
                r12.f35119x = r2
                java.lang.Object r0 = r8.emit(r0, r12)
                if (r0 != r9) goto L43
                goto L8b
            L43:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                cr1.c r2 = cr1.C11083c.this
                tr2.n r2 = cr1.C11083c.m29899h(r2)
                cr1.c$h$a r4 = new cr1.c$h$a
                cr1.c r3 = cr1.C11083c.this
                r4.<init>(r3, r11)
                r12.f35120y = r11
                r12.f35118w = r8
                r12.f35119x = r1
                r1 = r2
                r2 = 0
                r3 = 0
                r6 = 6
                r7 = 0
                r5 = r12
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L65
                goto L8b
            L65:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L79
                cr1.b$f r1 = new cr1.b$f
                u02.a$c r0 = (u02.InterfaceC34385a.c) r0
                java.lang.Object r0 = r0.m108735a()
                com.whoop.integrations.domain.models.IntegrationsDiscoveryComponentsModel r0 = (com.whoop.integrations.domain.models.IntegrationsDiscoveryComponentsModel) r0
                r1.<init>(r0)
                goto L7f
            L79:
                boolean r0 = r0 instanceof u02.InterfaceC34385a.b
                if (r0 == 0) goto L8f
                cr1.b$a r1 = cr1.InterfaceC11082b.a.f35053a
            L7f:
                r12.f35120y = r11
                r12.f35118w = r11
                r12.f35119x = r10
                java.lang.Object r0 = r8.emit(r1, r12)
                if (r0 != r9) goto L8c
            L8b:
                return r9
            L8c:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            L8f:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: cr1.C11083c.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: cr1.c$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.integrations.domain.IntegrationsInteractor$interact$$inlined$flatMapLatest$1", m100430f = "IntegrationsInteractor.kt", m100431l = {192, 195, 199, 203, 189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        Object f35124E;

        /* JADX INFO: renamed from: F */
        Object f35125F;

        /* JADX INFO: renamed from: G */
        Object f35126G;

        /* JADX INFO: renamed from: H */
        int f35127H;

        /* JADX INFO: renamed from: w */
        int f35128w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f35129x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f35130y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C11083c f35131z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC30057d interfaceC30057d, C11083c c11083c) {
            super(3, interfaceC30057d);
            this.f35131z = c11083c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC11081a interfaceC11081a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            i iVar = new i(interfaceC30057d, this.f35131z);
            iVar.f35129x = interfaceC13062m;
            iVar.f35130y = interfaceC11081a;
            return iVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x0128, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r1, (ec3.InterfaceC13058l) r11, r10) == r0) goto L47;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 308
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: cr1.C11083c.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (InterfaceC11081a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: cr1.c$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.integrations.domain.IntegrationsInteractor$loadIntegrationDetails$2", m100430f = "IntegrationsInteractor.kt", m100431l = {79, 81, 82, 82}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcr1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f35132E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C11083c f35133F;

        /* JADX INFO: renamed from: w */
        Object f35134w;

        /* JADX INFO: renamed from: x */
        int f35135x;

        /* JADX INFO: renamed from: y */
        int f35136y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f35137z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, C11083c c11083c, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f35132E = str;
            this.f35133F = c11083c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            j jVar = new j(this.f35132E, this.f35133F, interfaceC30057d);
            jVar.f35137z = obj;
            return jVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
        
            if (r0.emit(r2, r8) == r1) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
        
            if (r0.emit(r9, r8) == r1) goto L28;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f35137z
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r8.f35136y
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r2 == 0) goto L34
                if (r2 == r6) goto L30
                if (r2 == r5) goto L28
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
                goto L2c
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                java.lang.Object r0 = r8.f35134w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r9)
                goto L77
            L28:
                java.lang.Object r0 = r8.f35134w
                ir1.b r0 = (ir1.EnumC20861b) r0
            L2c:
                p505ts.AbstractC34132o.m107864I(r9)
                goto L84
            L30:
                p505ts.AbstractC34132o.m107864I(r9)
                goto L47
            L34:
                p505ts.AbstractC34132o.m107864I(r9)
                cr1.b$h r9 = new cr1.b$h
                r9.<init>(r7, r6, r7)
                r8.f35137z = r0
                r8.f35136y = r6
                java.lang.Object r9 = r0.emit(r9, r8)
                if (r9 != r1) goto L47
                goto L83
            L47:
                ir1.b$a r9 = ir1.EnumC20861b.INSTANCE
                java.lang.String r2 = r8.f35132E
                ir1.b r9 = r9.m57620a(r2)
                if (r9 == 0) goto L66
                cr1.b$c r2 = new cr1.b$c
                r2.<init>(r9)
                r8.f35137z = r0
                r8.f35134w = r7
                r9 = 0
                r8.f35135x = r9
                r8.f35136y = r5
                java.lang.Object r9 = r0.emit(r2, r8)
                if (r9 != r1) goto L84
                goto L83
            L66:
                cr1.c r9 = r8.f35133F
                java.lang.String r2 = r8.f35132E
                r8.f35137z = r7
                r8.f35134w = r0
                r8.f35136y = r4
                java.lang.Object r9 = cr1.C11083c.m29894c(r9, r2, r8)
                if (r9 != r1) goto L77
                goto L83
            L77:
                r8.f35137z = r7
                r8.f35134w = r7
                r8.f35136y = r3
                java.lang.Object r9 = r0.emit(r9, r8)
                if (r9 != r1) goto L84
            L83:
                return r1
            L84:
                l83.a0 r9 = l83.C23454a0.f92919a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: cr1.C11083c.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: cr1.c$k */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.integrations.domain.IntegrationsInteractor$triggerSyncAndRefresh$1", m100430f = "IntegrationsInteractor.kt", m100431l = {139, 141, 143, 143}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcr1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C11083c f35138E;

        /* JADX INFO: renamed from: w */
        Object f35139w;

        /* JADX INFO: renamed from: x */
        int f35140x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f35141y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f35142z;

        /* JADX INFO: renamed from: cr1.c$k$a */
        @InterfaceC32271e(m100429c = "com.whoop.integrations.domain.IntegrationsInteractor$triggerSyncAndRefresh$1$1", m100430f = "IntegrationsInteractor.kt", m100431l = {141}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f35143w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C11083c f35144x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C11083c c11083c, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f35144x = c11083c;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f35144x, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f35143w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                IntegrationsApi integrationsApi = this.f35144x.integrationsApi;
                this.f35143w = 1;
                Object objTriggerHealthexSync = integrationsApi.triggerHealthexSync(this);
                return objTriggerHealthexSync == enumC31071a ? enumC31071a : objTriggerHealthexSync;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, C11083c c11083c, InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f35142z = str;
            this.f35138E = c11083c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            k kVar = new k(this.f35142z, this.f35138E, interfaceC30057d);
            kVar.f35141y = obj;
            return kVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0074  */
        /* JADX WARN: Code duplicated, block: B:25:0x0085 A[PHI: r0 r8
          0x0085: PHI (r0v10 java.lang.Object) = (r0v9 java.lang.Object), (r0v14 java.lang.Object) binds: [B:23:0x0082, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]
          0x0085: PHI (r8v2 ec3.m) = (r8v1 ec3.m), (r8v4 ec3.m) binds: [B:23:0x0082, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
        
            if (r8.emit(r0, r13) == r9) goto L27;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r13.f35141y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r13.f35140x
                r10 = 4
                r11 = 3
                r1 = 2
                r2 = 1
                r12 = 0
                if (r0 == 0) goto L37
                if (r0 == r2) goto L33
                if (r0 == r1) goto L2f
                if (r0 == r11) goto L25
                if (r0 != r10) goto L1d
                p505ts.AbstractC34132o.m107864I(r14)
                goto L92
            L1d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L25:
                java.lang.Object r0 = r13.f35139w
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                p505ts.AbstractC34132o.m107864I(r14)
                r0 = r14
                goto L85
            L2f:
                p505ts.AbstractC34132o.m107864I(r14)
                goto L74
            L33:
                p505ts.AbstractC34132o.m107864I(r14)
                goto L4a
            L37:
                p505ts.AbstractC34132o.m107864I(r14)
                cr1.b$h r0 = new cr1.b$h
                r0.<init>(r12, r2, r12)
                r13.f35141y = r8
                r13.f35140x = r2
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto L4a
                goto L91
            L4a:
                java.lang.String r0 = r13.f35142z
                java.lang.String r2 = "healthex"
                boolean r0 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r0, r2)
                if (r0 == 0) goto L74
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                cr1.c r2 = r13.f35138E
                tr2.n r2 = cr1.C11083c.m29899h(r2)
                cr1.c$k$a r4 = new cr1.c$k$a
                cr1.c r3 = r13.f35138E
                r4.<init>(r3, r12)
                r13.f35141y = r8
                r13.f35140x = r1
                r1 = r2
                r2 = 0
                r3 = 0
                r6 = 6
                r7 = 0
                r5 = r13
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L74
                goto L91
            L74:
                cr1.c r0 = r13.f35138E
                java.lang.String r1 = r13.f35142z
                r13.f35141y = r12
                r13.f35139w = r8
                r13.f35140x = r11
                java.lang.Object r0 = cr1.C11083c.m29894c(r0, r1, r13)
                if (r0 != r9) goto L85
                goto L91
            L85:
                r13.f35141y = r12
                r13.f35139w = r12
                r13.f35140x = r10
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto L92
            L91:
                return r9
            L92:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: cr1.C11083c.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: cr1.c$l */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.integrations.domain.IntegrationsInteractor$updatePrivacyControl$1", m100430f = "IntegrationsInteractor.kt", m100431l = {151, 153, 162, 152}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcr1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        private /* synthetic */ Object f35145E;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ String f35147G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ String f35148H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ boolean f35149I;

        /* JADX INFO: renamed from: w */
        Object f35150w;

        /* JADX INFO: renamed from: x */
        Object f35151x;

        /* JADX INFO: renamed from: y */
        int f35152y;

        /* JADX INFO: renamed from: z */
        int f35153z;

        /* JADX INFO: renamed from: cr1.c$l$a */
        @InterfaceC32271e(m100429c = "com.whoop.integrations.domain.IntegrationsInteractor$updatePrivacyControl$1$1", m100430f = "IntegrationsInteractor.kt", m100431l = {154}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ boolean f35154E;

            /* JADX INFO: renamed from: w */
            int f35155w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C11083c f35156x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f35157y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f35158z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C11083c c11083c, String str, String str2, boolean z4, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f35156x = c11083c;
                this.f35157y = str;
                this.f35158z = str2;
                this.f35154E = z4;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f35156x, this.f35157y, this.f35158z, this.f35154E, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f35155w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                IntegrationsApi integrationsApi = this.f35156x.integrationsApi;
                String str = this.f35157y;
                IntegrationsPrivacyControlsRequest integrationsPrivacyControlsRequest = new IntegrationsPrivacyControlsRequest(AbstractC37056f.m118958J(new IntegrationsPrivacyControlUpdate(this.f35158z, this.f35154E)));
                this.f35155w = 1;
                Object objUpdatePrivacyControls = integrationsApi.updatePrivacyControls(str, integrationsPrivacyControlsRequest, this);
                return objUpdatePrivacyControls == enumC31071a ? enumC31071a : objUpdatePrivacyControls;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, String str2, boolean z4, InterfaceC30057d<? super l> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f35147G = str;
            this.f35148H = str2;
            this.f35149I = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            l lVar = C11083c.this.new l(this.f35147G, this.f35148H, this.f35149I, interfaceC30057d);
            lVar.f35145E = obj;
            return lVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((l) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0091  */
        /* JADX WARN: Code duplicated, block: B:26:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:28:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:34:0x00be  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00a0, code lost:
        
            if (r0 == r9) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00b8, code lost:
        
            if (r8.emit(r0, r19) == r9) goto L31;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r5 = r19
                java.lang.Object r0 = r5.f35145E
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r5.f35153z
                r10 = 4
                r11 = 3
                r1 = 2
                r2 = 1
                r12 = 0
                if (r0 == 0) goto L46
                if (r0 == r2) goto L42
                if (r0 == r1) goto L37
                if (r0 == r11) goto L27
                if (r0 != r10) goto L1f
                p505ts.AbstractC34132o.m107864I(r20)
                goto Lbb
            L1f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L27:
                java.lang.Object r0 = r5.f35151x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                java.lang.Object r1 = r5.f35150w
                u02.a r1 = (u02.InterfaceC34385a) r1
                p505ts.AbstractC34132o.m107864I(r20)
                r8 = r0
                r0 = r20
                goto La3
            L37:
                java.lang.Object r0 = r5.f35150w
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                p505ts.AbstractC34132o.m107864I(r20)
                r0 = r20
                goto L87
            L42:
                p505ts.AbstractC34132o.m107864I(r20)
                goto L59
            L46:
                p505ts.AbstractC34132o.m107864I(r20)
                cr1.b$h r0 = new cr1.b$h
                r0.<init>(r12, r2, r12)
                r5.f35145E = r8
                r5.f35153z = r2
                java.lang.Object r0 = r8.emit(r0, r5)
                if (r0 != r9) goto L59
                goto Lba
            L59:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                cr1.c r2 = cr1.C11083c.this
                tr2.n r2 = cr1.C11083c.m29899h(r2)
                cr1.c$l$a r4 = new cr1.c$l$a
                cr1.c r14 = cr1.C11083c.this
                java.lang.String r15 = r5.f35147G
                java.lang.String r3 = r5.f35148H
                boolean r6 = r5.f35149I
                r18 = 0
                r16 = r3
                r13 = r4
                r17 = r6
                r13.<init>(r14, r15, r16, r17, r18)
                r5.f35145E = r12
                r5.f35150w = r8
                r5.f35153z = r1
                r1 = r2
                r2 = 0
                r3 = 0
                r6 = 6
                r7 = 0
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L87
                goto Lba
            L87:
                cr1.c r1 = cr1.C11083c.this
                java.lang.String r2 = r5.f35147G
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r3 = r0 instanceof u02.InterfaceC34385a.c
                if (r3 == 0) goto La6
                r5.f35145E = r12
                r5.f35150w = r12
                r5.f35151x = r8
                r0 = 0
                r5.f35152y = r0
                r5.f35153z = r11
                java.lang.Object r0 = cr1.C11083c.m29894c(r1, r2, r5)
                if (r0 != r9) goto La3
                goto Lba
            La3:
                cr1.b r0 = (cr1.InterfaceC11082b) r0
                goto Lac
            La6:
                boolean r0 = r0 instanceof u02.InterfaceC34385a.b
                if (r0 == 0) goto Lbe
                cr1.b$j r0 = cr1.InterfaceC11082b.j.f35061a
            Lac:
                r5.f35145E = r12
                r5.f35150w = r12
                r5.f35151x = r12
                r5.f35153z = r10
                java.lang.Object r0 = r8.emit(r0, r5)
                if (r0 != r9) goto Lbb
            Lba:
                return r9
            Lbb:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            Lbe:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: cr1.C11083c.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C11083c(IntegrationsApi integrationsApi, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(integrationsApi, "integrationsApi");
        AbstractC22676k.m65750j(logger, "logger");
        this.integrationsApi = integrationsApi;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final Object m29903l(String str, String str2, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        return new C13084s1(new a(str2, str, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final Object m29904m(String str, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        return new C13084s1(new b(str, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        if (r11 == r0) goto L26;
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m29905n(java.lang.String r10, q83.InterfaceC30057d<? super cr1.InterfaceC11082b> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof cr1.C11083c.c
            if (r0 == 0) goto L14
            r0 = r11
            cr1.c$c r0 = (cr1.C11083c.c) r0
            int r1 = r0.f35099z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f35099z = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            cr1.c$c r0 = new cr1.c$c
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f35097x
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f35099z
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L40
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r10 = r6.f35096w
            java.lang.String r10 = (java.lang.String) r10
            p505ts.AbstractC34132o.m107864I(r11)
            goto L72
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            java.lang.Object r10 = r6.f35096w
            java.lang.String r10 = (java.lang.String) r10
            p505ts.AbstractC34132o.m107864I(r11)
            return r11
        L40:
            p505ts.AbstractC34132o.m107864I(r11)
            ir1.a$a r11 = ir1.EnumC20860a.INSTANCE
            boolean r11 = r11.m57619a(r10)
            r1 = 0
            if (r11 == 0) goto L58
            r6.f35096w = r1
            r6.f35099z = r3
            java.lang.Object r10 = r9.m29906o(r10, r6)
            if (r10 != r0) goto L57
            goto L71
        L57:
            return r10
        L58:
            r11 = r1
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            r3 = r2
            tr2.n r2 = r9.logger
            cr1.c$d r5 = new cr1.c$d
            r5.<init>(r10, r11)
            r6.f35096w = r11
            r6.f35099z = r3
            r3 = 0
            r4 = 0
            r7 = 6
            r8 = 0
            java.lang.Object r11 = u02.InterfaceC34385a.Companion.m108729b(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r11 != r0) goto L72
        L71:
            return r0
        L72:
            u02.a r11 = (u02.InterfaceC34385a) r11
            boolean r10 = r11 instanceof u02.InterfaceC34385a.c
            if (r10 == 0) goto L86
            cr1.b$b r10 = new cr1.b$b
            u02.a$c r11 = (u02.InterfaceC34385a.c) r11
            java.lang.Object r11 = r11.m108735a()
            com.whoop.integrations.domain.models.IntegrationsDetailsComponentsModel r11 = (com.whoop.integrations.domain.models.IntegrationsDetailsComponentsModel) r11
            r10.<init>(r11)
            return r10
        L86:
            boolean r10 = r11 instanceof u02.InterfaceC34385a.b
            if (r10 == 0) goto L8d
            cr1.b$a r10 = cr1.InterfaceC11082b.a.f35053a
            return r10
        L8d:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: cr1.C11083c.m29905n(java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: o */
    public final Object m29906o(String str, InterfaceC30057d<? super InterfaceC11082b> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f35106z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f35106z = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        e eVar2 = eVar;
        Object objM108729b = eVar2.f35104x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar2.f35106z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            f fVar = new f(str, null);
            eVar2.f35103w = null;
            eVar2.f35106z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, fVar, eVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new InterfaceC11082b.d((IntegrationsDetailsV2ComponentsModel) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return InterfaceC11082b.a.f35053a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final InterfaceC13058l m29907p(String integrationId) {
        return new C13084s1(new g(integrationId, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final Object m29908q(InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        return new C13084s1(new h(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final Object m29909s(String str, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        return new C13084s1(new j(str, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final InterfaceC13058l m29910t(String integrationId) {
        return new C13084s1(new k(integrationId, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final InterfaceC13058l m29911u(String integrationId, String type, boolean isEnabled) {
        return new C13084s1(new l(integrationId, type, isEnabled, null));
    }

    /* JADX INFO: renamed from: r */
    public final InterfaceC13058l m29912r(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new i(null, this));
    }

    public /* synthetic */ C11083c(IntegrationsApi integrationsApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(integrationsApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("IntegrationsInteractor") : interfaceC34116n);
    }
}
