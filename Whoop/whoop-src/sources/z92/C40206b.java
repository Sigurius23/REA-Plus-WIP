package z92;

import aa2.C0598g;
import aa2.C0599h;
import aa2.C0600i;
import aa2.InterfaceC0596e;
import android.database.sqlite.SQLiteException;
import com.whoop.domain.model.User;
import com.whoop.service.network.model.UserState;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: z92.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001\u0012B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010'\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010&¨\u0006)"}, m65681d2 = {"Lz92/b;", "Lz92/d;", "Laa2/e;", "userDao", "Laa2/h;", "converter", "Ltr2/n;", "logger", "<init>", "(Laa2/e;Laa2/h;Ltr2/n;)V", "Lcom/whoop/domain/model/User;", "g", "(Lq83/d;)Ljava/lang/Object;", "c", UserState.Sources.USER, "Ll83/a0;", "b", "(Lcom/whoop/domain/model/User;Lq83/d;)Ljava/lang/Object;", "a", "Laa2/e;", "Laa2/h;", "Ltr2/n;", "Lmc3/a;", "d", "Lmc3/a;", "mutex", "e", "Lcom/whoop/domain/model/User;", "userEntry", "Lec3/p1;", "Lz92/e;", "f", "Lec3/p1;", "userFlow", "Lec3/l;", "Lec3/l;", "getUser", "()Lec3/l;", "()Lcom/whoop/domain/model/User;", "maybeUser", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40206b implements InterfaceC40208d {

    /* JADX INFO: renamed from: i */
    private static final C40209e f173572i = new C40209e(new User(Integer.MIN_VALUE, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.MIN_VALUE, 16382, null));

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC0596e userDao;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C0599h converter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC25435a mutex;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private User userEntry;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC13075p1 userFlow;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC13058l user;

    /* JADX INFO: renamed from: z92.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.user.cache.UserInfoCache", m100430f = "UserInfoCache.kt", m100431l = {142, 65, 66}, m100432m = "getUser", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f173580E;

        /* JADX INFO: renamed from: G */
        int f173582G;

        /* JADX INFO: renamed from: w */
        Object f173583w;

        /* JADX INFO: renamed from: x */
        Object f173584x;

        /* JADX INFO: renamed from: y */
        int f173585y;

        /* JADX INFO: renamed from: z */
        int f173586z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f173580E = obj;
            this.f173582G |= Integer.MIN_VALUE;
            return C40206b.this.mo129089c(this);
        }
    }

    /* JADX INFO: renamed from: z92.b$c */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.user.cache.UserInfoCache", m100430f = "UserInfoCache.kt", m100431l = {142, 82, 83}, m100432m = "getUserFromDb", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f173587E;

        /* JADX INFO: renamed from: G */
        int f173589G;

        /* JADX INFO: renamed from: w */
        Object f173590w;

        /* JADX INFO: renamed from: x */
        Object f173591x;

        /* JADX INFO: renamed from: y */
        int f173592y;

        /* JADX INFO: renamed from: z */
        int f173593z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f173587E = obj;
            this.f173589G |= Integer.MIN_VALUE;
            return C40206b.this.m129093g(this);
        }
    }

    /* JADX INFO: renamed from: z92.b$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.user.cache.UserInfoCache", m100430f = "UserInfoCache.kt", m100431l = {142, 122}, m100432m = "nukeUser", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f173595F;

        /* JADX INFO: renamed from: w */
        Object f173596w;

        /* JADX INFO: renamed from: x */
        int f173597x;

        /* JADX INFO: renamed from: y */
        int f173598y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f173599z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f173599z = obj;
            this.f173595F |= Integer.MIN_VALUE;
            return C40206b.this.mo129094a(this);
        }
    }

    /* JADX INFO: renamed from: z92.b$e */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f173600w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C40206b f173601x;

        /* JADX INFO: renamed from: z92.b$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f173602w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C40206b f173603x;

            /* JADX INFO: renamed from: z92.b$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.service.store.user.cache.UserInfoCache$special$$inlined$map$1$2", m100430f = "UserInfoCache.kt", m100431l = {52, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42726a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f173604E;

                /* JADX INFO: renamed from: F */
                Object f173605F;

                /* JADX INFO: renamed from: G */
                Object f173606G;

                /* JADX INFO: renamed from: H */
                Object f173607H;

                /* JADX INFO: renamed from: I */
                Object f173608I;

                /* JADX INFO: renamed from: J */
                Object f173609J;

                /* JADX INFO: renamed from: K */
                int f173610K;

                /* JADX INFO: renamed from: L */
                int f173611L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f173612w;

                /* JADX INFO: renamed from: x */
                int f173613x;

                /* JADX INFO: renamed from: y */
                Object f173614y;

                public C42726a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f173612w = obj;
                    this.f173613x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C40206b c40206b) {
                this.f173602w = interfaceC13062m;
                this.f173603x = c40206b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x00a3, code lost:
            
                if (r2.emit(r9, r0) == r1) goto L28;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, q83.InterfaceC30057d r9) throws java.lang.Throwable {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof z92.C40206b.e.a.C42726a
                    if (r0 == 0) goto L13
                    r0 = r9
                    z92.b$e$a$a r0 = (z92.C40206b.e.a.C42726a) r0
                    int r1 = r0.f173613x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f173613x = r1
                    goto L18
                L13:
                    z92.b$e$a$a r0 = new z92.b$e$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f173612w
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r0.f173613x
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L56
                    if (r2 == r4) goto L3c
                    if (r2 != r3) goto L34
                    java.lang.Object r8 = r0.f173606G
                    ec3.m r8 = (ec3.InterfaceC13062m) r8
                    java.lang.Object r8 = r0.f173604E
                    z92.b$e$a$a r8 = (z92.C40206b.e.a.C42726a) r8
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto La6
                L34:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3c:
                    int r8 = r0.f173610K
                    java.lang.Object r2 = r0.f173609J
                    z92.e r2 = (z92.C40209e) r2
                    java.lang.Object r2 = r0.f173608I
                    q83.d r2 = (q83.InterfaceC30057d) r2
                    java.lang.Object r2 = r0.f173607H
                    ec3.m r2 = (ec3.InterfaceC13062m) r2
                    java.lang.Object r4 = r0.f173606G
                    ec3.m r4 = (ec3.InterfaceC13062m) r4
                    java.lang.Object r4 = r0.f173604E
                    z92.b$e$a$a r4 = (z92.C40206b.e.a.C42726a) r4
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L82
                L56:
                    p505ts.AbstractC34132o.m107864I(r9)
                    ec3.m r2 = r7.f173602w
                    z92.e r8 = (z92.C40209e) r8
                    z92.e r9 = z92.C40206b.m129091e()
                    r6 = 0
                    if (r8 != r9) goto L84
                    z92.b r8 = r7.f173603x
                    r0.f173614y = r5
                    r0.f173604E = r5
                    r0.f173605F = r5
                    r0.f173606G = r5
                    r0.f173607H = r2
                    r0.f173608I = r5
                    r0.f173609J = r5
                    r0.f173610K = r6
                    r0.f173611L = r6
                    r0.f173613x = r4
                    java.lang.Object r9 = z92.C40206b.m129092f(r8, r0)
                    if (r9 != r1) goto L81
                    goto La5
                L81:
                    r8 = r6
                L82:
                    r6 = r8
                    goto L8d
                L84:
                    if (r8 == 0) goto L8c
                    com.whoop.domain.model.User r8 = r8.getCom.whoop.service.network.model.UserState.Sources.USER java.lang.String()
                    r9 = r8
                    goto L8d
                L8c:
                    r9 = r5
                L8d:
                    r0.f173614y = r5
                    r0.f173604E = r5
                    r0.f173605F = r5
                    r0.f173606G = r5
                    r0.f173607H = r5
                    r0.f173608I = r5
                    r0.f173609J = r5
                    r0.f173610K = r6
                    r0.f173613x = r3
                    java.lang.Object r8 = r2.emit(r9, r0)
                    if (r8 != r1) goto La6
                La5:
                    return r1
                La6:
                    l83.a0 r8 = l83.C23454a0.f92919a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: z92.C40206b.e.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public e(InterfaceC13058l interfaceC13058l, C40206b c40206b) {
            this.f173600w = interfaceC13058l;
            this.f173601x = c40206b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f173600w.collect(new a(interfaceC13062m, this.f173601x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: z92.b$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.store.user.cache.UserInfoCache", m100430f = "UserInfoCache.kt", m100431l = {142, 101, 105}, m100432m = "updateUser", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f173616E;

        /* JADX INFO: renamed from: F */
        int f173617F;

        /* JADX INFO: renamed from: G */
        int f173618G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f173619H;

        /* JADX INFO: renamed from: J */
        int f173621J;

        /* JADX INFO: renamed from: w */
        Object f173622w;

        /* JADX INFO: renamed from: x */
        Object f173623x;

        /* JADX INFO: renamed from: y */
        Object f173624y;

        /* JADX INFO: renamed from: z */
        Object f173625z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f173619H = obj;
            this.f173621J |= Integer.MIN_VALUE;
            return C40206b.this.mo129095b(null, this);
        }
    }

    public C40206b(InterfaceC0596e userDao, C0599h converter, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(userDao, "userDao");
        AbstractC22676k.m65750j(converter, "converter");
        AbstractC22676k.m65750j(logger, "logger");
        this.userDao = userDao;
        this.converter = converter;
        this.logger = logger;
        this.mutex = AbstractC25438d.m74669a();
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(f173572i);
        this.userFlow = c13045h2M36593c;
        this.user = new e(c13045h2M36593c, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x0091  */
    /* JADX WARN: Code duplicated, block: B:42:0x0095 A[Catch: all -> 0x0052, SQLiteException -> 0x0056, TRY_ENTER, TRY_LEAVE, TryCatch #6 {SQLiteException -> 0x0056, all -> 0x0052, blocks: (B:23:0x004e, B:38:0x008d, B:42:0x0095), top: B:61:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r0v17, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r0v2, types: [q83.d, z92.b$c] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v3, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, mc3.a] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [aa2.e] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, mc3.a] */
    /* JADX WARN: Type inference failed for: r5v9, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r8v0, types: [aa2.e] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: g */
    public final Object m129093g(InterfaceC30057d<? super User> interfaceC30057d) throws Throwable {
        ?? cVar;
        int i13;
        ?? r14;
        ?? r10;
        SQLiteException e5;
        ?? r15;
        int i14;
        int i15;
        C0598g c0598g;
        Object objMo1556a;
        C0598g c0598g2;
        if (interfaceC30057d instanceof c) {
            c cVar2 = (c) interfaceC30057d;
            int i16 = cVar2.f173589G;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                cVar2.f173589G = i16 - Integer.MIN_VALUE;
                cVar = cVar2;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f173587E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i17 = cVar.f173589G;
        try {
            try {
                if (i17 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ?? r16 = this.mutex;
                    cVar.f173590w = r16;
                    cVar.f173592y = 0;
                    cVar.f173589G = 1;
                    if (r16.mo68211b(cVar) != enumC31071a) {
                        i13 = 0;
                        r14 = r16;
                    }
                    return enumC31071a;
                }
                if (i17 != 1) {
                    if (i17 != 2) {
                        if (i17 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0598g2 = (C0598g) cVar.f173591x;
                        r10 = (InterfaceC25435a) cVar.f173590w;
                        try {
                            AbstractC34132o.m107864I(obj);
                            r10 = r10;
                            User userM1599a = this.converter.m1599a(c0598g2, (C0600i) obj);
                            InterfaceC13075p1 interfaceC13075p1 = this.userFlow;
                            C40209e c40209e = new C40209e(userM1599a);
                            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
                            c13045h2.getClass();
                            c13045h2.m36571k(null, c40209e);
                            this.userEntry = userM1599a;
                            r10.mo68214i(null);
                            return userM1599a;
                        } catch (SQLiteException e13) {
                            e5 = e13;
                            this.logger.mo85230v("Failed to get user dao data", e5, new AbstractC30556a.a[0]);
                            r10.mo68214i(null);
                            return null;
                        }
                    }
                    i15 = cVar.f173593z;
                    i14 = cVar.f173592y;
                    r15 = (InterfaceC25435a) cVar.f173590w;
                    try {
                        AbstractC34132o.m107864I(obj);
                        r15 = r15;
                        c0598g = (C0598g) obj;
                        if (c0598g == null) {
                            r15.mo68214i(null);
                            return null;
                        }
                        ?? r17 = this.userDao;
                        cVar.f173590w = r15;
                        cVar.f173591x = c0598g;
                        cVar.f173592y = i14;
                        cVar.f173593z = i15;
                        cVar.f173589G = 3;
                        objMo1556a = r17.mo1556a(cVar);
                        if (objMo1556a != enumC31071a) {
                            c0598g2 = c0598g;
                            obj = objMo1556a;
                            r10 = r15;
                            User userM1599a2 = this.converter.m1599a(c0598g2, (C0600i) obj);
                            InterfaceC13075p1 interfaceC13075p2 = this.userFlow;
                            C40209e c40209e2 = new C40209e(userM1599a2);
                            C13045h2 c13045h3 = (C13045h2) interfaceC13075p2;
                            c13045h3.getClass();
                            c13045h3.m36571k(null, c40209e2);
                            this.userEntry = userM1599a2;
                            r10.mo68214i(null);
                            return userM1599a2;
                        }
                        return enumC31071a;
                    } catch (SQLiteException e14) {
                        e5 = e14;
                        r10 = r15;
                        this.logger.mo85230v("Failed to get user dao data", e5, new AbstractC30556a.a[0]);
                        r10.mo68214i(null);
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        cVar = r15;
                        cVar.mo68214i(null);
                        throw th;
                    }
                }
                i13 = cVar.f173592y;
                InterfaceC25435a interfaceC25435a = (InterfaceC25435a) cVar.f173590w;
                AbstractC34132o.m107864I(obj);
                r14 = interfaceC25435a;
                ?? r18 = this.userDao;
                cVar.f173590w = r14;
                cVar.f173592y = i13;
                cVar.f173593z = 0;
                cVar.f173589G = 2;
                Object objMo1559d = r18.mo1559d(cVar);
                if (objMo1559d != enumC31071a) {
                    r15 = r14;
                    obj = objMo1559d;
                    i14 = i13;
                    i15 = 0;
                    c0598g = (C0598g) obj;
                    if (c0598g == null) {
                        r15.mo68214i(null);
                        return null;
                    }
                    ?? r19 = this.userDao;
                    cVar.f173590w = r15;
                    cVar.f173591x = c0598g;
                    cVar.f173592y = i14;
                    cVar.f173593z = i15;
                    cVar.f173589G = 3;
                    objMo1556a = r19.mo1556a(cVar);
                    if (objMo1556a != enumC31071a) {
                        c0598g2 = c0598g;
                        obj = objMo1556a;
                        r10 = r15;
                        User userM1599a3 = this.converter.m1599a(c0598g2, (C0600i) obj);
                        InterfaceC13075p1 interfaceC13075p3 = this.userFlow;
                        C40209e c40209e3 = new C40209e(userM1599a3);
                        C13045h2 c13045h4 = (C13045h2) interfaceC13075p3;
                        c13045h4.getClass();
                        c13045h4.m36571k(null, c40209e3);
                        this.userEntry = userM1599a3;
                        r10.mo68214i(null);
                        return userM1599a3;
                    }
                }
                return enumC31071a;
            } catch (SQLiteException e15) {
                r10 = r14;
                e5 = e15;
                this.logger.mo85230v("Failed to get user dao data", e5, new AbstractC30556a.a[0]);
                r10.mo68214i(null);
                return null;
            } catch (Throwable th4) {
                cVar = r14;
                th = th4;
                cVar.mo68214i(null);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r0v11, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r0v14, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [q83.d, z92.b$d] */
    /* JADX WARN: Type inference failed for: r0v3, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, mc3.a] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [aa2.e] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // z92.InterfaceC40208d
    /* JADX INFO: renamed from: a */
    public Object mo129094a(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        ?? dVar;
        int i13;
        ?? r10;
        ?? r14;
        SQLiteException e5;
        ?? r15;
        if (interfaceC30057d instanceof d) {
            d dVar2 = (d) interfaceC30057d;
            int i14 = dVar2.f173595F;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar2.f173595F = i14 - Integer.MIN_VALUE;
                dVar = dVar2;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object obj = dVar.f173599z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = dVar.f173595F;
        C23454a0 c23454a0 = C23454a0.f92919a;
        try {
            try {
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    ?? r16 = this.mutex;
                    dVar.f173596w = r16;
                    dVar.f173597x = 0;
                    dVar.f173595F = 1;
                    if (r16.mo68211b(dVar) != enumC31071a) {
                        i13 = 0;
                        r10 = r16;
                    }
                    return enumC31071a;
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r14 = (InterfaceC25435a) dVar.f173596w;
                    try {
                        AbstractC34132o.m107864I(obj);
                        r15 = r14;
                        this.userEntry = null;
                        ((C13045h2) this.userFlow).m36570j(f173572i);
                        r15.mo68214i(null);
                        return c23454a0;
                    } catch (SQLiteException e13) {
                        e5 = e13;
                        this.logger.mo85230v("Failed to nuke user dao data", e5, new AbstractC30556a.a[0]);
                        r14.mo68214i(null);
                        return c23454a0;
                    }
                }
                i13 = dVar.f173597x;
                InterfaceC25435a interfaceC25435a = (InterfaceC25435a) dVar.f173596w;
                AbstractC34132o.m107864I(obj);
                r10 = interfaceC25435a;
                ?? r17 = this.userDao;
                dVar.f173596w = r10;
                dVar.f173597x = i13;
                dVar.f173598y = 0;
                dVar.f173595F = 2;
                if (r17.mo1562h(dVar) != enumC31071a) {
                    r15 = r10;
                    this.userEntry = null;
                    ((C13045h2) this.userFlow).m36570j(f173572i);
                    r15.mo68214i(null);
                    return c23454a0;
                }
                return enumC31071a;
            } catch (SQLiteException e14) {
                r14 = r10;
                e5 = e14;
                this.logger.mo85230v("Failed to nuke user dao data", e5, new AbstractC30556a.a[0]);
                r14.mo68214i(null);
                return c23454a0;
            } catch (Throwable th3) {
                dVar = r10;
                th = th3;
                dVar.mo68214i(null);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c0 A[Catch: all -> 0x006c, SQLiteException -> 0x00e3, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00e3, blocks: (B:39:0x00ba, B:41:0x00c0, B:35:0x00a3), top: B:55:0x00a3 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e0, code lost:
    
        if (r13.mo1560e(r12, r3) == r4) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, r83.a] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v14, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [mc3.a] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    @Override // z92.InterfaceC40208d
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo129095b(com.whoop.domain.model.User r17, q83.InterfaceC30057d<? super l83.C23454a0> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z92.C40206b.mo129095b(com.whoop.domain.model.User, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a9 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0033, B:42:0x00a5, B:44:0x00a9), top: B:53:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // z92.InterfaceC40205a
    /* JADX INFO: renamed from: c */
    public Object mo129089c(InterfaceC30057d<? super User> interfaceC30057d) throws Throwable {
        b bVar;
        InterfaceC25435a interfaceC25435a;
        int i13;
        InterfaceC25435a interfaceC25435a2;
        Throwable th3;
        InterfaceC25435a interfaceC25435a3;
        C0598g c0598g;
        Object objMo1556a;
        C0598g c0598g2;
        C0600i c0600i;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i14 = bVar.f173582G;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f173582G = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f173580E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = bVar.f173582G;
        int i16 = 0;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                interfaceC25435a = this.mutex;
                bVar.f173583w = interfaceC25435a;
                bVar.f173585y = 0;
                bVar.f173582G = 1;
                if (interfaceC25435a.mo68211b(bVar) != enumC31071a) {
                    i13 = 0;
                }
                return enumC31071a;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0598g2 = (C0598g) bVar.f173584x;
                    interfaceC25435a2 = (InterfaceC25435a) bVar.f173583w;
                    try {
                        AbstractC34132o.m107864I(obj);
                        c0600i = (C0600i) obj;
                        if (c0598g2 == null) {
                            interfaceC25435a2.mo68214i(null);
                            return null;
                        }
                        User userM1599a = this.converter.m1599a(c0598g2, c0600i);
                        this.userEntry = userM1599a;
                        InterfaceC13075p1 interfaceC13075p1 = this.userFlow;
                        C40209e c40209e = new C40209e(userM1599a);
                        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
                        c13045h2.getClass();
                        c13045h2.m36571k(null, c40209e);
                        User user = this.userEntry;
                        interfaceC25435a2.mo68214i(null);
                        return user;
                    } catch (Throwable th4) {
                        th3 = th4;
                        interfaceC25435a2.mo68214i(null);
                        throw th3;
                    }
                }
                i16 = bVar.f173586z;
                i13 = bVar.f173585y;
                interfaceC25435a3 = (InterfaceC25435a) bVar.f173583w;
                try {
                    AbstractC34132o.m107864I(obj);
                    c0598g = (C0598g) obj;
                    InterfaceC0596e interfaceC0596e = this.userDao;
                    bVar.f173583w = interfaceC25435a3;
                    bVar.f173584x = c0598g;
                    bVar.f173585y = i13;
                    bVar.f173586z = i16;
                    bVar.f173582G = 3;
                    objMo1556a = interfaceC0596e.mo1556a(bVar);
                    if (objMo1556a != enumC31071a) {
                        c0598g2 = c0598g;
                        obj = objMo1556a;
                        interfaceC25435a2 = interfaceC25435a3;
                        c0600i = (C0600i) obj;
                        if (c0598g2 == null) {
                            interfaceC25435a2.mo68214i(null);
                            return null;
                        }
                        User userM1599a2 = this.converter.m1599a(c0598g2, c0600i);
                        this.userEntry = userM1599a2;
                        InterfaceC13075p1 interfaceC13075p2 = this.userFlow;
                        C40209e c40209e2 = new C40209e(userM1599a2);
                        C13045h2 c13045h3 = (C13045h2) interfaceC13075p2;
                        c13045h3.getClass();
                        c13045h3.m36571k(null, c40209e2);
                        User user2 = this.userEntry;
                        interfaceC25435a2.mo68214i(null);
                        return user2;
                    }
                    return enumC31071a;
                } catch (Throwable th5) {
                    th3 = th5;
                    interfaceC25435a2 = interfaceC25435a3;
                    interfaceC25435a2.mo68214i(null);
                    throw th3;
                }
            }
            i13 = bVar.f173585y;
            InterfaceC25435a interfaceC25435a4 = (InterfaceC25435a) bVar.f173583w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a4;
            User user3 = this.userEntry;
            if (user3 != null) {
                interfaceC25435a.mo68214i(null);
                return user3;
            }
            InterfaceC0596e interfaceC0596e2 = this.userDao;
            bVar.f173583w = interfaceC25435a;
            bVar.f173585y = i13;
            bVar.f173586z = 0;
            bVar.f173582G = 2;
            Object objMo1559d = interfaceC0596e2.mo1559d(bVar);
            if (objMo1559d != enumC31071a) {
                interfaceC25435a3 = interfaceC25435a;
                obj = objMo1559d;
                c0598g = (C0598g) obj;
                InterfaceC0596e interfaceC0596e3 = this.userDao;
                bVar.f173583w = interfaceC25435a3;
                bVar.f173584x = c0598g;
                bVar.f173585y = i13;
                bVar.f173586z = i16;
                bVar.f173582G = 3;
                objMo1556a = interfaceC0596e3.mo1556a(bVar);
                if (objMo1556a != enumC31071a) {
                    c0598g2 = c0598g;
                    obj = objMo1556a;
                    interfaceC25435a2 = interfaceC25435a3;
                    c0600i = (C0600i) obj;
                    if (c0598g2 == null) {
                        interfaceC25435a2.mo68214i(null);
                        return null;
                    }
                    User userM1599a3 = this.converter.m1599a(c0598g2, c0600i);
                    this.userEntry = userM1599a3;
                    InterfaceC13075p1 interfaceC13075p3 = this.userFlow;
                    C40209e c40209e3 = new C40209e(userM1599a3);
                    C13045h2 c13045h4 = (C13045h2) interfaceC13075p3;
                    c13045h4.getClass();
                    c13045h4.m36571k(null, c40209e3);
                    User user4 = this.userEntry;
                    interfaceC25435a2.mo68214i(null);
                    return user4;
                }
            }
            return enumC31071a;
        } catch (Throwable th6) {
            interfaceC25435a2 = interfaceC25435a;
            th3 = th6;
            interfaceC25435a2.mo68214i(null);
            throw th3;
        }
    }

    @Override // z92.InterfaceC40205a
    /* JADX INFO: renamed from: d */
    public User mo129090d() {
        C40209e c40209e = (C40209e) ((C13045h2) this.userFlow).getValue();
        if (c40209e != null) {
            if (c40209e == f173572i) {
                c40209e = null;
            }
            if (c40209e != null) {
                return c40209e.getCom.whoop.service.network.model.UserState.Sources.USER java.lang.String();
            }
        }
        return null;
    }

    @Override // z92.InterfaceC40205a
    public InterfaceC13058l getUser() {
        return this.user;
    }

    public /* synthetic */ C40206b(InterfaceC0596e interfaceC0596e, C0599h c0599h, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC0596e, c0599h, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("UserInfoCache") : interfaceC34116n);
    }
}
