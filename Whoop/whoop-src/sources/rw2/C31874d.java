package rw2;

import ad3.AbstractC0757c;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.GenericPollingResult;
import com.whoop.whoopaction.domain.models.PollingAction;
import com.whoop.whoopaction.domain.models.RequestExtensionsKt;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import f63.AbstractC14155c;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import j93.InterfaceC21461d;
import java.util.Set;
import kotlinx.serialization.SerializationException;
import l83.C23454a0;
import p000.AbstractC11266d;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import qw2.InterfaceC30693a;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.C34387c;
import u82.AbstractC34650k;
import yb3.AbstractC39397a;
import z02.InterfaceC39944a;

/* JADX INFO: renamed from: rw2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0010\u0010\u000eJ\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR(\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020!0 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001a\u0010$¨\u0006&"}, m65681d2 = {"Lrw2/d;", "Lrw2/a;", "Lu02/c;", "apiClient", "Lad3/c;", "json", "Ltr2/n;", "logger", "<init>", "(Lu02/c;Lad3/c;Ltr2/n;)V", "Lcom/whoop/whoopaction/domain/models/PollingAction;", "action", "Lqw2/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/whoopaction/domain/models/PollingAction;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/navigation/models/GenericInteraction;", "i", "Lf63/c;", "response", "g", "(Lf63/c;Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "Lqw2/a;", "upstream", "b", "(Lec3/l;)Lec3/l;", "a", "Lu02/c;", "Lad3/c;", "c", "Ltr2/n;", "", "Lj93/d;", "Lcom/whoop/whoopaction/domain/models/Action;", "d", "Ljava/util/Set;", "()Ljava/util/Set;", "actionTypes", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31874d implements InterfaceC31871a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34387c apiClient;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Set<InterfaceC21461d> actionTypes;

    /* JADX INFO: renamed from: rw2.d$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.handlers.PollingActionHandler", m100430f = "PollingActionHandler.kt", m100431l = {93}, m100432m = "decodePollingInteraction", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f132235w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f132236x;

        /* JADX INFO: renamed from: z */
        int f132238z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f132236x = obj;
            this.f132238z |= Integer.MIN_VALUE;
            return C31874d.this.m99090g(null, this);
        }
    }

    /* JADX INFO: renamed from: rw2.d$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.handlers.PollingActionHandler", m100430f = "PollingActionHandler.kt", m100431l = {61, 63}, m100432m = "executePollingAction", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f132239w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f132240x;

        /* JADX INFO: renamed from: z */
        int f132242z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f132240x = obj;
            this.f132242z |= Integer.MIN_VALUE;
            return C31874d.this.m99091h(null, this);
        }
    }

    /* JADX INFO: renamed from: rw2.d$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.handlers.PollingActionHandler$executePollingAction$interaction$1", m100430f = "PollingActionHandler.kt", m100431l = {61}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/navigation/models/GenericInteraction;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/navigation/models/GenericInteraction;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f132243w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ PollingAction f132245y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PollingAction pollingAction, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f132245y = pollingAction;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31874d.this.new c(this.f132245y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super GenericInteraction> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f132243w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C31874d c31874d = C31874d.this;
            PollingAction pollingAction = this.f132245y;
            this.f132243w = 1;
            Object objM99092i = c31874d.m99092i(pollingAction, this);
            return objM99092i == enumC31071a ? enumC31071a : objM99092i;
        }
    }

    /* JADX INFO: renamed from: rw2.d$d */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.handlers.PollingActionHandler$handleActions$1", m100430f = "PollingActionHandler.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lqw2/a;", "domainAction", "Lec3/l;", "Lqw2/b;", "<anonymous>", "(Lqw2/a;)Lec3/l;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f132246w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f132247x;

        /* JADX INFO: renamed from: rw2.d$d$a */
        @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.handlers.PollingActionHandler$handleActions$1$1", m100430f = "PollingActionHandler.kt", m100431l = {54, 55, 55}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lqw2/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ C31874d f132249E;

            /* JADX INFO: renamed from: w */
            Object f132250w;

            /* JADX INFO: renamed from: x */
            int f132251x;

            /* JADX INFO: renamed from: y */
            private /* synthetic */ Object f132252y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ PollingAction f132253z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PollingAction pollingAction, C31874d c31874d, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f132253z = pollingAction;
                this.f132249E = c31874d;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f132253z, this.f132249E, interfaceC30057d);
                aVar.f132252y = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
            
                if (r0.emit(r9, r8) == r1) goto L20;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = r8.f132252y
                    ec3.m r0 = (ec3.InterfaceC13062m) r0
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r8.f132251x
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    r6 = 0
                    if (r2 == 0) goto L2c
                    if (r2 == r5) goto L28
                    if (r2 == r4) goto L20
                    if (r2 != r3) goto L18
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L63
                L18:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L20:
                    java.lang.Object r0 = r8.f132250w
                    ec3.m r0 = (ec3.InterfaceC13062m) r0
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L56
                L28:
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L45
                L2c:
                    p505ts.AbstractC34132o.m107864I(r9)
                    qw2.b$c r9 = new qw2.b$c
                    com.whoop.whoopaction.domain.models.PollingAction r2 = r8.f132253z
                    com.whoop.whoopaction.domain.models.LoadingTreatment r7 = r2.getPollingTreatment()
                    r9.<init>(r2, r7)
                    r8.f132252y = r0
                    r8.f132251x = r5
                    java.lang.Object r9 = r0.emit(r9, r8)
                    if (r9 != r1) goto L45
                    goto L62
                L45:
                    rw2.d r9 = r8.f132249E
                    com.whoop.whoopaction.domain.models.PollingAction r2 = r8.f132253z
                    r8.f132252y = r6
                    r8.f132250w = r0
                    r8.f132251x = r4
                    java.lang.Object r9 = rw2.C31874d.m99087d(r9, r2, r8)
                    if (r9 != r1) goto L56
                    goto L62
                L56:
                    r8.f132252y = r6
                    r8.f132250w = r6
                    r8.f132251x = r3
                    java.lang.Object r9 = r0.emit(r9, r8)
                    if (r9 != r1) goto L63
                L62:
                    return r1
                L63:
                    l83.a0 r9 = l83.C23454a0.f92919a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: rw2.C31874d.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C31874d.this.new d(interfaceC30057d);
            dVar.f132247x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC30693a interfaceC30693a, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
            return ((d) create(interfaceC30693a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC30693a interfaceC30693a = (InterfaceC30693a) this.f132247x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f132246w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Action action = interfaceC30693a.getAction();
            AbstractC22676k.m65748h(action, "null cannot be cast to non-null type com.whoop.whoopaction.domain.models.PollingAction");
            return new C13084s1(new a((PollingAction) action, C31874d.this, null));
        }
    }

    /* JADX INFO: renamed from: rw2.d$e */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.handlers.PollingActionHandler", m100430f = "PollingActionHandler.kt", m100431l = {77, 86}, m100432m = "pollUntilInteraction", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f132254E;

        /* JADX INFO: renamed from: w */
        Object f132255w;

        /* JADX INFO: renamed from: x */
        Object f132256x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f132257y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f132257y = obj;
            this.f132254E |= Integer.MIN_VALUE;
            return C31874d.this.m99092i(null, this);
        }
    }

    /* JADX INFO: renamed from: rw2.d$f */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whoopaction.domain.handlers.PollingActionHandler$pollUntilInteraction$apiCall$1", m100430f = "PollingActionHandler.kt", m100431l = {79, 80}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/navigation/models/GenericInteraction;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C31874d f132259E;

        /* JADX INFO: renamed from: w */
        Object f132260w;

        /* JADX INFO: renamed from: x */
        Object f132261x;

        /* JADX INFO: renamed from: y */
        int f132262y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ PollingAction f132263z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(PollingAction pollingAction, C31874d c31874d, InterfaceC30057d<? super f> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f132263z = pollingAction;
            this.f132259E = c31874d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f132263z, this.f132259E, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f132262y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC39944a actionApiRequest$default = RequestExtensionsKt.toActionApiRequest$default(this.f132263z.getRequest(), null, 1, null);
                C34387c c34387c = this.f132259E.apiClient;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(String.class);
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(String.class), interfaceC21456a0M65689b, AbstractC21478l0.m60396B(interfaceC21456a0M65689b));
                this.f132260w = null;
                this.f132262y = 1;
                obj = c34387c.m108748d(actionApiRequest$default, c32236aM44445Y, this);
                if (obj != enumC31071a) {
                }
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C31874d c31874d = this.f132259E;
            this.f132260w = null;
            this.f132261x = null;
            this.f132262y = 2;
            Object objM99090g = c31874d.m99090g((AbstractC14155c) obj, this);
            return objM99090g == enumC31071a ? enumC31071a : objM99090g;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super GenericInteraction> interfaceC30057d) {
            return ((f) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C31874d(C34387c apiClient, AbstractC0757c json, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(apiClient, "apiClient");
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(logger, "logger");
        this.apiClient = apiClient;
        this.json = json;
        this.logger = logger;
        this.actionTypes = AbstractC12350b.m34570S(AbstractC22671h0.f89337a.getOrCreateKotlinClass(PollingAction.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m99090g(AbstractC14155c abstractC14155c, InterfaceC30057d<? super GenericInteraction> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f132238z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f132238z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objM60440k = aVar.f132236x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f132238z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM60440k);
                aVar.f132235w = null;
                aVar.f132238z = 1;
                objM60440k = AbstractC21478l0.m60440k(abstractC14155c, AbstractC39397a.f169546a, aVar);
                if (objM60440k == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM60440k);
            }
            String str = (String) objM60440k;
            if (str.length() != 0) {
                try {
                    GenericInteraction interaction = ((GenericPollingResult) this.json.m1831b(GenericPollingResult.INSTANCE.serializer(), str)).getInteraction();
                    if (interaction != null && !interaction.isEmpty()) {
                        return interaction;
                    }
                } catch (SerializationException e5) {
                    this.logger.mo85228t(AbstractC11266d.m30461o("Polling response body is not a GenericPollingResult: ", e5.getMessage()), new AbstractC30556a.a[0]);
                    return null;
                }
            }
            return null;
        } catch (Exception e13) {
            AbstractC3006f0.m8721o(aVar.getContext());
            this.logger.mo85228t(AbstractC11266d.m30461o("Failed to read polling response body: ", e13.getMessage()), new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m99091h(com.whoop.whoopaction.domain.models.PollingAction r7, q83.InterfaceC30057d<? super qw2.AbstractC30694b> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof rw2.C31874d.b
            if (r0 == 0) goto L13
            r0 = r8
            rw2.d$b r0 = (rw2.C31874d.b) r0
            int r1 = r0.f132242z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f132242z = r1
            goto L18
        L13:
            rw2.d$b r0 = new rw2.d$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f132240x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f132242z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r7 = r0.f132239w
            com.whoop.whoopaction.domain.models.PollingAction r7 = (com.whoop.whoopaction.domain.models.PollingAction) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L6f
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            java.lang.Object r7 = r0.f132239w
            com.whoop.whoopaction.domain.models.PollingAction r7 = (com.whoop.whoopaction.domain.models.PollingAction) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L60
        L3e:
            p505ts.AbstractC34132o.m107864I(r8)
            java.lang.Long r8 = r7.getTimeoutMillis()
            if (r8 == 0) goto L64
            java.lang.Long r8 = r7.getTimeoutMillis()
            long r2 = r8.longValue()
            rw2.d$c r8 = new rw2.d$c
            r5 = 0
            r8.<init>(r7, r5)
            r0.f132239w = r7
            r0.f132242z = r4
            java.lang.Object r8 = bc3.AbstractC3028k2.m8750d(r2, r8, r0)
            if (r8 != r1) goto L60
            goto L6e
        L60:
            com.whoop.navigation.models.GenericInteraction r8 = (com.whoop.navigation.models.GenericInteraction) r8
        L62:
            r2 = r7
            goto L72
        L64:
            r0.f132239w = r7
            r0.f132242z = r3
            java.lang.Object r8 = r6.m99092i(r7, r0)
            if (r8 != r1) goto L6f
        L6e:
            return r1
        L6f:
            com.whoop.navigation.models.GenericInteraction r8 = (com.whoop.navigation.models.GenericInteraction) r8
            goto L62
        L72:
            if (r8 == 0) goto L7a
            qw2.b$b r7 = new qw2.b$b
            r7.<init>(r8, r2)
            return r7
        L7a:
            com.whoop.navigation.models.GenericInteraction r7 = r2.getOnTimeout()
            if (r7 == 0) goto L8a
            qw2.b$b r7 = new qw2.b$b
            com.whoop.navigation.models.GenericInteraction r8 = r2.getOnTimeout()
            r7.<init>(r8, r2)
            return r7
        L8a:
            qw2.b$a r0 = new qw2.b$a
            java.lang.Long r7 = r2.getTimeoutMillis()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "PollingAction timed out after "
            r8.<init>(r1)
            r8.append(r7)
            java.lang.String r7 = "ms"
            r8.append(r7)
            java.lang.String r1 = r8.toString()
            r4 = 4
            r5 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rw2.C31874d.m99091h(com.whoop.whoopaction.domain.models.PollingAction, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x0074  */
    /* JADX WARN: Code duplicated, block: B:26:0x007d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ae, code lost:
    
        if (bc3.AbstractC3034m0.m8782b(r8, r2) == r3) goto L34;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ae -> B:13:0x0036). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m99092i(com.whoop.whoopaction.domain.models.PollingAction r17, q83.InterfaceC30057d<? super com.whoop.navigation.models.GenericInteraction> r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof rw2.C31874d.e
            if (r2 == 0) goto L17
            r2 = r1
            rw2.d$e r2 = (rw2.C31874d.e) r2
            int r3 = r2.f132254E
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f132254E = r3
            goto L1c
        L17:
            rw2.d$e r2 = new rw2.d$e
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f132257y
            r83.a r3 = r83.EnumC31071a.f128113w
            int r4 = r2.f132254E
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L49
            if (r4 == r6) goto L41
            if (r4 != r5) goto L39
            java.lang.Object r4 = r2.f132256x
            u02.a r4 = (u02.InterfaceC34385a) r4
            java.lang.Object r4 = r2.f132255w
            com.whoop.whoopaction.domain.models.PollingAction r4 = (com.whoop.whoopaction.domain.models.PollingAction) r4
            p505ts.AbstractC34132o.m107864I(r1)
        L36:
            r13 = r2
            r1 = r4
            goto L4f
        L39:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L41:
            java.lang.Object r4 = r2.f132255w
            com.whoop.whoopaction.domain.models.PollingAction r4 = (com.whoop.whoopaction.domain.models.PollingAction) r4
            p505ts.AbstractC34132o.m107864I(r1)
            goto L77
        L49:
            p505ts.AbstractC34132o.m107864I(r1)
            r1 = r17
            r13 = r2
        L4f:
            q83.j r2 = r13.getContext()
            boolean r2 = bc3.AbstractC3006f0.m8730x(r2)
            if (r2 == 0) goto Lb7
            u02.a$a r8 = u02.InterfaceC34385a.INSTANCE
            tr2.n r9 = r0.logger
            rw2.d$f r12 = new rw2.d$f
            r12.<init>(r1, r0, r7)
            r13.f132255w = r1
            r13.f132256x = r7
            r13.f132254E = r6
            r10 = 0
            java.lang.String r11 = "PollingAction failed"
            r14 = 2
            r15 = 0
            java.lang.Object r2 = u02.InterfaceC34385a.Companion.m108729b(r8, r9, r10, r11, r12, r13, r14, r15)
            if (r2 != r3) goto L74
            goto Lb0
        L74:
            r4 = r1
            r1 = r2
            r2 = r13
        L77:
            u02.a r1 = (u02.InterfaceC34385a) r1
            boolean r8 = r1 instanceof u02.InterfaceC34385a.c
            if (r8 == 0) goto L88
            u02.a$c r1 = (u02.InterfaceC34385a.c) r1
            java.lang.Object r1 = r1.m108735a()
            com.whoop.navigation.models.GenericInteraction r1 = (com.whoop.navigation.models.GenericInteraction) r1
            if (r1 == 0) goto La0
            return r1
        L88:
            boolean r8 = r1 instanceof u02.InterfaceC34385a.b
            if (r8 == 0) goto Lb1
            tr2.n r8 = r0.logger
            u02.a$b r1 = (u02.InterfaceC34385a.b) r1
            java.lang.String r1 = r1.getErrorMessage()
            java.lang.String r9 = "Polling iteration failed; will retry: "
            java.lang.String r1 = p000.AbstractC11266d.m30461o(r9, r1)
            r9 = 0
            qr2.a$a[] r9 = new qr2.AbstractC30556a.a[r9]
            r8.mo85228t(r1, r9)
        La0:
            long r8 = r4.getFrequencyMillis()
            r2.f132255w = r4
            r2.f132256x = r7
            r2.f132254E = r5
            java.lang.Object r1 = bc3.AbstractC3034m0.m8782b(r8, r2)
            if (r1 != r3) goto L36
        Lb0:
            return r3
        Lb1:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        Lb7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rw2.C31874d.m99092i(com.whoop.whoopaction.domain.models.PollingAction, q83.d):java.lang.Object");
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
        return AbstractC13091v.m36578D(new d(null), upstream);
    }

    @Override // rw2.InterfaceC31871a, od1.InterfaceC27844g
    public /* bridge */ InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return super.interact(interfaceC13058l);
    }

    public /* synthetic */ C31874d(C34387c c34387c, AbstractC0757c abstractC0757c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c34387c, (i13 & 2) != 0 ? AbstractC34650k.m109496c() : abstractC0757c, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("PollingActionHandler") : interfaceC34116n);
    }
}
