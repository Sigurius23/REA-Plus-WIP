package f70;

import com.whoop.activation.domain.ActivationApi;
import com.whoop.activation.domain.ActivationAuthenticatedApi;
import com.whoop.activation.domain.models.InAppJoinFlowSignUpRequest;
import com.whoop.domain.model.AuthMaterial;
import com.whoop.navigation.C9598e;
import l83.C23454a0;
import n70.AbstractC26417d;
import n70.C26418e;
import od1.C27847j;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s70.AbstractC32238a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: f70.j0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u001bB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#¨\u0006$"}, m65681d2 = {"Lf70/j0;", "", "Lcom/whoop/activation/domain/ActivationApi;", "activationApi", "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;", "activationAuthenticatedApi", "Lod1/j;", "pendingUserSessionRepository", "Lf70/u;", "appDestinationRouter", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/activation/domain/ActivationApi;Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lod1/j;Lf70/u;Ltr2/n;)V", "Ln70/d;", "e", "(Lq83/d;)Ljava/lang/Object;", "", "flow", "Lcom/whoop/navigation/e;", "f", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lf70/e$b;", "prevDomainResult", "Lf70/f;", "g", "(Lf70/e$b;Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/activation/domain/ActivationApi;", "b", "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;", "c", "Lod1/j;", "d", "Lf70/u;", "Ltr2/n;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14187j0 {

    /* JADX INFO: renamed from: g */
    public static final int f51378g = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ActivationApi activationApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ActivationAuthenticatedApi activationAuthenticatedApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C27847j pendingUserSessionRepository;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C14208u appDestinationRouter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f70.j0$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.IAJFSignUpHelper", m100430f = "IAJFSignUpHelper.kt", m100431l = {86, 89}, m100432m = "fetchDestination", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f51384E;

        /* JADX INFO: renamed from: w */
        Object f51385w;

        /* JADX INFO: renamed from: x */
        Object f51386x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f51387y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51387y = obj;
            this.f51384E |= Integer.MIN_VALUE;
            return C14187j0.this.m40494e(this);
        }
    }

    /* JADX INFO: renamed from: f70.j0$c */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.IAJFSignUpHelper", m100430f = "IAJFSignUpHelper.kt", m100431l = {97}, m100432m = "fetchPostSignInDestination", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f51389w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f51390x;

        /* JADX INFO: renamed from: z */
        int f51392z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51390x = obj;
            this.f51392z |= Integer.MIN_VALUE;
            return C14187j0.this.m40495f(null, this);
        }
    }

    /* JADX INFO: renamed from: f70.j0$d */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.IAJFSignUpHelper$fetchPostSignInDestination$response$1", m100430f = "IAJFSignUpHelper.kt", m100431l = {98}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lcom/whoop/navigation/e;", "<anonymous>", "()Lcom/whoop/navigation/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f51393w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f51395y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f51395y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14187j0.this.new d(this.f51395y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51393w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ActivationAuthenticatedApi activationAuthenticatedApi = C14187j0.this.activationAuthenticatedApi;
            String str = this.f51395y;
            this.f51393w = 1;
            Object objM17051a = ActivationAuthenticatedApi.m17051a(activationAuthenticatedApi, null, str, this, 1, null);
            return objM17051a == enumC31071a ? enumC31071a : objM17051a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C9598e> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: f70.j0$e */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.IAJFSignUpHelper", m100430f = "IAJFSignUpHelper.kt", m100431l = {47, 55}, m100432m = "signUp", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f51396E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f51397F;

        /* JADX INFO: renamed from: H */
        int f51399H;

        /* JADX INFO: renamed from: w */
        Object f51400w;

        /* JADX INFO: renamed from: x */
        Object f51401x;

        /* JADX INFO: renamed from: y */
        Object f51402y;

        /* JADX INFO: renamed from: z */
        Object f51403z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51397F = obj;
            this.f51399H |= Integer.MIN_VALUE;
            return C14187j0.this.m40496g(null, this);
        }
    }

    /* JADX INFO: renamed from: f70.j0$f */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.IAJFSignUpHelper$signUp$response$1", m100430f = "IAJFSignUpHelper.kt", m100431l = {48}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/domain/model/AuthMaterial;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f51404w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InAppJoinFlowSignUpRequest f51406y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InAppJoinFlowSignUpRequest inAppJoinFlowSignUpRequest, InterfaceC30057d<? super f> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f51406y = inAppJoinFlowSignUpRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14187j0.this.new f(this.f51406y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51404w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ActivationApi activationApi = C14187j0.this.activationApi;
            InAppJoinFlowSignUpRequest inAppJoinFlowSignUpRequest = this.f51406y;
            this.f51404w = 1;
            Object objJoinSignUp = activationApi.joinSignUp(inAppJoinFlowSignUpRequest, this);
            return objJoinSignUp == enumC31071a ? enumC31071a : objJoinSignUp;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super AuthMaterial> interfaceC30057d) {
            return ((f) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C14187j0(ActivationApi activationApi, ActivationAuthenticatedApi activationAuthenticatedApi, C27847j pendingUserSessionRepository, C14208u appDestinationRouter, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(activationApi, "activationApi");
        AbstractC22676k.m65750j(activationAuthenticatedApi, "activationAuthenticatedApi");
        AbstractC22676k.m65750j(pendingUserSessionRepository, "pendingUserSessionRepository");
        AbstractC22676k.m65750j(appDestinationRouter, "appDestinationRouter");
        AbstractC22676k.m65750j(logger, "logger");
        this.activationApi = activationApi;
        this.activationAuthenticatedApi = activationAuthenticatedApi;
        this.pendingUserSessionRepository = pendingUserSessionRepository;
        this.appDestinationRouter = appDestinationRouter;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m40494e(q83.InterfaceC30057d<? super n70.AbstractC26417d> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof f70.C14187j0.b
            if (r0 == 0) goto L13
            r0 = r8
            f70.j0$b r0 = (f70.C14187j0.b) r0
            int r1 = r0.f51384E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51384E = r1
            goto L18
        L13:
            f70.j0$b r0 = new f70.j0$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f51387y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f51384E
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r1 = r0.f51386x
            f70.t r1 = (f70.AbstractC14206t) r1
            java.lang.Object r0 = r0.f51385w
            java.lang.String r0 = (java.lang.String) r0
            p505ts.AbstractC34132o.m107864I(r8)
            goto L86
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            java.lang.Object r2 = r0.f51385w
            java.lang.String r2 = (java.lang.String) r2
            p505ts.AbstractC34132o.m107864I(r8)
            goto L58
        L43:
            p505ts.AbstractC34132o.m107864I(r8)
            f70.u r8 = r7.appDestinationRouter
            f70.s r2 = f70.EnumC14204s.POST_SIGN_IN
            java.lang.String r6 = "iajf-prepaids"
            r0.f51385w = r6
            r0.f51384E = r4
            java.lang.Object r8 = r8.m40609d(r2, r6, r0)
            if (r8 != r1) goto L57
            goto L85
        L57:
            r2 = r6
        L58:
            f70.t r8 = (f70.AbstractC14206t) r8
            boolean r4 = r8 instanceof f70.AbstractC14206t.b
            if (r4 == 0) goto L6a
            n70.d$b r0 = new n70.d$b
            f70.t$b r8 = (f70.AbstractC14206t.b) r8
            com.whoop.navigation.e r8 = r8.getAction()
            r0.<init>(r8)
            return r0
        L6a:
            boolean r4 = r8 instanceof f70.AbstractC14206t.a
            if (r4 == 0) goto L75
            f70.t$a r8 = (f70.AbstractC14206t.a) r8
            n70.d$a r8 = f70.AbstractC14210v.m40611b(r8)
            return r8
        L75:
            boolean r8 = r8 instanceof f70.AbstractC14206t.c
            if (r8 == 0) goto L91
            r0.f51385w = r5
            r0.f51386x = r5
            r0.f51384E = r3
            java.lang.Object r8 = r7.m40495f(r2, r0)
            if (r8 != r1) goto L86
        L85:
            return r1
        L86:
            com.whoop.navigation.e r8 = (com.whoop.navigation.C9598e) r8
            if (r8 == 0) goto L90
            n70.d$b r0 = new n70.d$b
            r0.<init>(r8)
            return r0
        L90:
            return r5
        L91:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f70.C14187j0.m40494e(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: f */
    public final Object m40495f(String str, InterfaceC30057d<? super C9598e> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f51392z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f51392z = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object objM108729b = cVar2.f51390x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar2.f51392z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            d dVar = new d(str, null);
            cVar2.f51389w = null;
            cVar2.f51392z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch post-signin destination", dVar, cVar2, 2, null);
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
            return (C9598e) ((InterfaceC34385a.c) interfaceC34385a).m108735a();
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x01be  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: g */
    public final Object m40496g(InterfaceC14176e.b bVar, InterfaceC30057d<? super C14178f> interfaceC30057d) {
        e eVar;
        int i13;
        InterfaceC14176e.b bVar2;
        Object objM108729b;
        InterfaceC14176e.b bVar3;
        InterfaceC34385a interfaceC34385a;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i14 = eVar.f51399H;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f51399H = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        e eVar2 = eVar;
        Object obj = eVar2.f51397F;
        Object obj2 = EnumC31071a.f128113w;
        int i15 = eVar2.f51399H;
        if (i15 != 0) {
            if (i15 == 1) {
                int i16 = eVar2.f51396E;
                InterfaceC14176e.b bVar4 = (InterfaceC14176e.b) eVar2.f51400w;
                AbstractC34132o.m107864I(obj);
                i13 = i16;
                objM108729b = obj;
                bVar2 = bVar4;
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC34385a = (InterfaceC34385a) eVar2.f51403z;
                InterfaceC14176e.b bVar5 = (InterfaceC14176e.b) eVar2.f51400w;
                AbstractC34132o.m107864I(obj);
                bVar3 = bVar5;
            }
            AbstractC26417d abstractC26417d = (AbstractC26417d) obj;
            return new C14178f(InterfaceC14176e.b.m40416b(bVar3, null, C26418e.m78162b(bVar3.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String(), 0, 0, 0, null, abstractC26417d, 15, null), null, null, null, false, null, false, (AuthMaterial) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), false, false, null, null, null, null, null, null, 130813, null), abstractC26417d == null);
        }
        AbstractC34132o.m107864I(obj);
        C14201q0 memberInfo = bVar.getMemberInfo();
        i13 = (AbstractC39414r.m125890i0(memberInfo.getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String().getValue()) || AbstractC39414r.m125890i0(memberInfo.getPassword().getValue()) || AbstractC39414r.m125890i0(memberInfo.getFirstName().getValue()) || AbstractC39414r.m125890i0(memberInfo.getLastName().getValue()) || AbstractC39414r.m125890i0(memberInfo.getCountry())) ? 1 : 0;
        if (i13 != 0) {
            this.logger.mo85222m("IAJF sign up skipped due to missing required fields", new AbstractC30556a.a[0]);
            return new C14178f(InterfaceC14176e.b.m40416b(bVar, null, null, null, null, null, true, null, false, null, false, false, null, null, null, null, null, null, 131039, null), false);
        }
        InAppJoinFlowSignUpRequest inAppJoinFlowSignUpRequest = new InAppJoinFlowSignUpRequest(memberInfo.getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String().getValue(), memberInfo.getPassword().getValue(), memberInfo.getFirstName().getValue(), memberInfo.getLastName().getValue(), memberInfo.getCountry(), memberInfo.getState());
        InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
        InterfaceC34116n interfaceC34116n = this.logger;
        f fVar = new f(inAppJoinFlowSignUpRequest, null);
        bVar2 = bVar;
        eVar2.f51400w = bVar2;
        eVar2.f51401x = null;
        eVar2.f51402y = null;
        eVar2.f51396E = i13;
        eVar2.f51399H = 1;
        objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to sign up IAJF user", fVar, eVar2, 2, null);
        if (objM108729b != obj2) {
        }
        return obj2;
        InterfaceC34385a interfaceC34385a2 = (InterfaceC34385a) objM108729b;
        if (!(interfaceC34385a2 instanceof InterfaceC34385a.c)) {
            if (interfaceC34385a2 instanceof InterfaceC34385a.b) {
                return AbstractC32238a.m100306a((InterfaceC34385a.b) interfaceC34385a2) ? new C14178f(AbstractC32238a.m100307b(), false) : new C14178f(InterfaceC14176e.b.m40416b(bVar2, null, null, null, null, null, true, null, false, null, false, false, null, null, null, null, null, null, 131039, null), false);
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC34385a.c cVar = (InterfaceC34385a.c) interfaceC34385a2;
        this.pendingUserSessionRepository.m83956e(((AuthMaterial) cVar.m108735a()).getAccessToken());
        this.pendingUserSessionRepository.m83957f((AuthMaterial) cVar.m108735a());
        eVar2.f51400w = bVar2;
        eVar2.f51401x = null;
        eVar2.f51402y = null;
        eVar2.f51403z = interfaceC34385a2;
        eVar2.f51396E = i13;
        eVar2.f51399H = 2;
        Object objM40494e = m40494e(eVar2);
        if (objM40494e != obj2) {
            bVar3 = bVar2;
            interfaceC34385a = interfaceC34385a2;
            obj = objM40494e;
            AbstractC26417d abstractC26417d2 = (AbstractC26417d) obj;
            return new C14178f(InterfaceC14176e.b.m40416b(bVar3, null, C26418e.m78162b(bVar3.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String(), 0, 0, 0, null, abstractC26417d2, 15, null), null, null, null, false, null, false, (AuthMaterial) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), false, false, null, null, null, null, null, null, 130813, null), abstractC26417d2 == null);
        }
        return obj2;
    }

    public /* synthetic */ C14187j0(ActivationApi activationApi, ActivationAuthenticatedApi activationAuthenticatedApi, C27847j c27847j, C14208u c14208u, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(activationApi, activationAuthenticatedApi, c27847j, c14208u, (i13 & 16) != 0 ? InterfaceC34116n.INSTANCE.m107848a("IAJFSignUpHelper") : interfaceC34116n);
    }
}
