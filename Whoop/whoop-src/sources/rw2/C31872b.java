package rw2;

import bc3.AbstractC3006f0;
import c93.InterfaceC4351m;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.ActionErrorCode;
import com.whoop.whoopaction.domain.models.AuthAction;
import com.whoop.whoopaction.domain.models.AuthOperation;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21461d;
import java.util.Set;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import p000.AbstractC11266d;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import qw2.AbstractC30694b;
import qw2.InterfaceC30693a;
import qw2.InterfaceC30696d;
import qw2.InterfaceC30697e;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: rw2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\"R(\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020%0$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b \u0010(¨\u0006*"}, m65681d2 = {"Lrw2/b;", "Lrw2/a;", "Lqw2/d;", "authActionBridge", "Ltr2/n;", "logger", "<init>", "(Lqw2/d;Ltr2/n;)V", "Lcom/whoop/whoopaction/domain/models/AuthAction;", "action", "Lqw2/b;", "e", "(Lcom/whoop/whoopaction/domain/models/AuthAction;Lq83/d;)Ljava/lang/Object;", "Lqw2/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "", "g", "(Ljava/lang/String;)Ljava/lang/String;", "field", "f", "(Lcom/whoop/whoopaction/domain/models/AuthAction;Ljava/lang/String;)Lqw2/e;", "i", "(Lcom/whoop/whoopaction/domain/models/AuthAction;)Lqw2/b;", "Lqw2/e$a;", "failure", "d", "(Lcom/whoop/whoopaction/domain/models/AuthAction;Lqw2/e$a;)Lqw2/b;", "Lec3/l;", "Lqw2/a;", "upstream", "b", "(Lec3/l;)Lec3/l;", "a", "Lqw2/d;", "Ltr2/n;", "", "Lj93/d;", "Lcom/whoop/whoopaction/domain/models/Action;", "c", "Ljava/util/Set;", "()Ljava/util/Set;", "actionTypes", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31872b implements InterfaceC31871a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC30696d authActionBridge;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Set<InterfaceC21461d> actionTypes;

    /* JADX INFO: renamed from: rw2.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f132202a;

        static {
            int[] iArr = new int[AuthOperation.values().length];
            try {
                iArr[AuthOperation.SIGN_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AuthOperation.COMPLETE_MFA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AuthOperation.RESEND_MFA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AuthOperation.RESET_PASSWORD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AuthOperation.SIGN_OUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f132202a = iArr;
        }
    }

    /* JADX INFO: renamed from: rw2.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.handlers.AuthActionHandler", m100430f = "AuthActionHandler.kt", m100431l = {39}, m100432m = "execute", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f132203w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f132204x;

        /* JADX INFO: renamed from: z */
        int f132206z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f132204x = obj;
            this.f132206z |= Integer.MIN_VALUE;
            return C31872b.this.m99070e(null, this);
        }
    }

    /* JADX INFO: renamed from: rw2.b$c */
    @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.handlers.AuthActionHandler$handleActions$1", m100430f = "AuthActionHandler.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lqw2/a;", "domainAction", "Lec3/l;", "Lqw2/b;", "<anonymous>", "(Lqw2/a;)Lec3/l;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f132207w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f132208x;

        /* JADX INFO: renamed from: rw2.b$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.handlers.AuthActionHandler$handleActions$1$1", m100430f = "AuthActionHandler.kt", m100431l = {32, 33, 33}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lqw2/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ C31872b f132210E;

            /* JADX INFO: renamed from: w */
            Object f132211w;

            /* JADX INFO: renamed from: x */
            int f132212x;

            /* JADX INFO: renamed from: y */
            private /* synthetic */ Object f132213y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ AuthAction f132214z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AuthAction authAction, C31872b c31872b, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f132214z = authAction;
                this.f132210E = c31872b;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f132214z, this.f132210E, interfaceC30057d);
                aVar.f132213y = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
            
                if (r0.emit(r8, r7) == r1) goto L20;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = r7.f132213y
                    ec3.m r0 = (ec3.InterfaceC13062m) r0
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r7.f132212x
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    r6 = 0
                    if (r2 == 0) goto L2c
                    if (r2 == r5) goto L28
                    if (r2 == r4) goto L20
                    if (r2 != r3) goto L18
                    p505ts.AbstractC34132o.m107864I(r8)
                    goto L5f
                L18:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L20:
                    java.lang.Object r0 = r7.f132211w
                    ec3.m r0 = (ec3.InterfaceC13062m) r0
                    p505ts.AbstractC34132o.m107864I(r8)
                    goto L52
                L28:
                    p505ts.AbstractC34132o.m107864I(r8)
                    goto L41
                L2c:
                    p505ts.AbstractC34132o.m107864I(r8)
                    qw2.b$i r8 = new qw2.b$i
                    com.whoop.whoopaction.domain.models.AuthAction r2 = r7.f132214z
                    r8.<init>(r2)
                    r7.f132213y = r0
                    r7.f132212x = r5
                    java.lang.Object r8 = r0.emit(r8, r7)
                    if (r8 != r1) goto L41
                    goto L5e
                L41:
                    rw2.b r8 = r7.f132210E
                    com.whoop.whoopaction.domain.models.AuthAction r2 = r7.f132214z
                    r7.f132213y = r6
                    r7.f132211w = r0
                    r7.f132212x = r4
                    java.lang.Object r8 = rw2.C31872b.m99068c(r8, r2, r7)
                    if (r8 != r1) goto L52
                    goto L5e
                L52:
                    r7.f132213y = r6
                    r7.f132211w = r6
                    r7.f132212x = r3
                    java.lang.Object r8 = r0.emit(r8, r7)
                    if (r8 != r1) goto L5f
                L5e:
                    return r1
                L5f:
                    l83.a0 r8 = l83.C23454a0.f92919a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: rw2.C31872b.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C31872b.this.new c(interfaceC30057d);
            cVar.f132208x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC30693a interfaceC30693a, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
            return ((c) create(interfaceC30693a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC30693a interfaceC30693a = (InterfaceC30693a) this.f132208x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f132207w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Action action = interfaceC30693a.getAction();
            AbstractC22676k.m65748h(action, "null cannot be cast to non-null type com.whoop.whoopaction.domain.models.AuthAction");
            return new C13084s1(new a((AuthAction) action, C31872b.this, null));
        }
    }

    public C31872b(InterfaceC30696d authActionBridge, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(authActionBridge, "authActionBridge");
        AbstractC22676k.m65750j(logger, "logger");
        this.authActionBridge = authActionBridge;
        this.logger = logger;
        this.actionTypes = AbstractC12350b.m34570S(AbstractC22671h0.f89337a.getOrCreateKotlinClass(AuthAction.class));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    /* JADX INFO: renamed from: d */
    private final AbstractC30694b m99069d(AuthAction action, InterfaceC30697e.a failure) {
        InterfaceC34116n interfaceC34116n = this.logger;
        AuthOperation operation = action.getOperation();
        ActionErrorCode code = failure.getCode();
        String message = failure.getMessage();
        if (message == null) {
            message = "";
        }
        interfaceC34116n.mo85226q("AuthAction " + operation + " failed: " + code + " " + message, new AbstractC30556a.a[0]);
        GenericInteraction genericInteraction = action.getOnError().get(failure.getCode());
        if (genericInteraction == null) {
            genericInteraction = new GenericInteraction((JsonElement) null, (JsonElement) null, (JsonElement) null, (JsonElement) null, (JsonElement) null, 31, (DefaultConstructorMarker) null);
        } else {
            if (genericInteraction.isEmpty()) {
                genericInteraction = null;
            }
            if (genericInteraction == null) {
                genericInteraction = new GenericInteraction((JsonElement) null, (JsonElement) null, (JsonElement) null, (JsonElement) null, (JsonElement) null, 31, (DefaultConstructorMarker) null);
            }
        }
        return new AbstractC30694b.b(genericInteraction, action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m99070e(AuthAction authAction, InterfaceC30057d<? super AbstractC30694b> interfaceC30057d) {
        b bVar;
        InterfaceC30697e aVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f132206z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f132206z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM99073h = bVar.f132204x;
        Object obj = EnumC31071a.f128113w;
        int i14 = bVar.f132206z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM99073h);
                bVar.f132203w = authAction;
                bVar.f132206z = 1;
                objM99073h = m99073h(authAction, bVar);
                if (objM99073h == obj) {
                    return obj;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                authAction = (AuthAction) bVar.f132203w;
                AbstractC34132o.m107864I(objM99073h);
            }
            aVar = (InterfaceC30697e) objM99073h;
        } catch (Exception e5) {
            AbstractC3006f0.m8721o(bVar.getContext());
            this.logger.mo85230v("AuthAction " + authAction.getOperation() + " failed", e5, new AbstractC30556a.a[0]);
            ActionErrorCode actionErrorCode = ActionErrorCode.UNKNOWN;
            String message = e5.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            aVar = new InterfaceC30697e.a(actionErrorCode, message);
        }
        if (aVar instanceof InterfaceC30697e.b) {
            return m99074i(authAction);
        }
        if (aVar instanceof InterfaceC30697e.a) {
            return m99069d(authAction, (InterfaceC30697e.a) aVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: f */
    private final InterfaceC30697e m99071f(AuthAction action, String field) {
        this.logger.mo85226q("AuthAction " + action.getOperation() + " is missing required field '" + field + "'", new AbstractC30556a.a[0]);
        return new InterfaceC30697e.a(ActionErrorCode.UNKNOWN, AbstractC11266d.m30461o("Missing required field: ", field));
    }

    /* JADX INFO: renamed from: g */
    private final String m99072g(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: h */
    private final Object m99073h(AuthAction authAction, InterfaceC30057d<? super InterfaceC30697e> interfaceC30057d) {
        int i13 = a.f132202a[authAction.getOperation().ordinal()];
        if (i13 == 1) {
            String strM99072g = m99072g(authAction.getUsername());
            if (strM99072g == null) {
                return m99071f(authAction, "username");
            }
            String strM99072g2 = m99072g(authAction.getPassword());
            return strM99072g2 == null ? m99071f(authAction, "password") : this.authActionBridge.mo84109c(strM99072g, strM99072g2, interfaceC30057d);
        }
        if (i13 == 2) {
            String strM99072g3 = m99072g(authAction.getMfaCode());
            return strM99072g3 == null ? m99071f(authAction, "mfaCode") : this.authActionBridge.mo84110d(strM99072g3, interfaceC30057d);
        }
        if (i13 == 3) {
            return this.authActionBridge.mo84111e(interfaceC30057d);
        }
        if (i13 == 4) {
            String strM99072g4 = m99072g(authAction.getUsername());
            return strM99072g4 == null ? m99071f(authAction, "username") : this.authActionBridge.mo84108b(strM99072g4, interfaceC30057d);
        }
        if (i13 == 5) {
            return this.authActionBridge.mo84107a(interfaceC30057d);
        }
        this.logger.mo85226q("Unsupported AuthOperation: " + authAction.getOperation(), new AbstractC30556a.a[0]);
        return new InterfaceC30697e.a(ActionErrorCode.UNKNOWN, "Unsupported auth operation: " + authAction.getOperation());
    }

    /* JADX INFO: renamed from: i */
    private final AbstractC30694b m99074i(AuthAction action) {
        GenericInteraction onSuccess = action.getOnSuccess();
        return (onSuccess == null || onSuccess.isEmpty()) ? new AbstractC30694b.n(action) : new AbstractC30694b.b(onSuccess, action);
    }

    @Override // rw2.InterfaceC31871a
    /* JADX INFO: renamed from: a */
    public Set<InterfaceC21461d> mo28414a() {
        return this.actionTypes;
    }

    @Override // rw2.InterfaceC31871a
    /* JADX INFO: renamed from: b */
    public InterfaceC13058l mo28415b(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36578D(new c(null), upstream);
    }

    @Override // rw2.InterfaceC31871a, od1.InterfaceC27844g
    public /* bridge */ InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return super.interact(interfaceC13058l);
    }

    public /* synthetic */ C31872b(InterfaceC30696d interfaceC30696d, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC30696d, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("AuthActionHandler") : interfaceC34116n);
    }
}
