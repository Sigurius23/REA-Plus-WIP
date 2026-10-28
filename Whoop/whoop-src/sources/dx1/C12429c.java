package dx1;

import ax1.C2120b;
import c93.InterfaceC4351m;
import com.whoop.membership.management.domain.api.MembershipManagementApi;
import com.whoop.membership.management.domain.models.ManageMembershipScreenResponse;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: dx1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\fH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Ldx1/c;", "Lod1/g;", "Ldx1/a;", "Ldx1/b;", "Lcom/whoop/membership/management/domain/api/MembershipManagementApi;", "membershipManagementApi", "Lax1/b;", "analyticsHelper", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/membership/management/domain/api/MembershipManagementApi;Lax1/b;Ltr2/n;)V", "Lec3/m;", "e", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/membership/management/domain/api/MembershipManagementApi;", "b", "Lax1/b;", "c", "Ltr2/n;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12429c implements InterfaceC27844g<InterfaceC12427a, InterfaceC12428b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final MembershipManagementApi membershipManagementApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C2120b analyticsHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: dx1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.management.domain.interactors.manage.ManageMembershipInteractor", m100430f = "ManageMembershipInteractor.kt", m100431l = {41, 42}, m100432m = "fetchManageMembershipScreen", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f42338w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f42339x;

        /* JADX INFO: renamed from: z */
        int f42341z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f42339x = obj;
            this.f42341z |= Integer.MIN_VALUE;
            return C12429c.this.m34994e(null, this);
        }
    }

    /* JADX INFO: renamed from: dx1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.management.domain.interactors.manage.ManageMembershipInteractor$fetchManageMembershipScreen$response$1", m100430f = "ManageMembershipInteractor.kt", m100431l = {43}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/membership/management/domain/models/ManageMembershipScreenResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f42342w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C12429c.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f42342w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            MembershipManagementApi membershipManagementApi = C12429c.this.membershipManagementApi;
            this.f42342w = 1;
            Object objFetchManageMembershipScreen = membershipManagementApi.fetchManageMembershipScreen(this);
            return objFetchManageMembershipScreen == enumC31071a ? enumC31071a : objFetchManageMembershipScreen;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ManageMembershipScreenResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: dx1.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.management.domain.interactors.manage.ManageMembershipInteractor$interact$1", m100430f = "ManageMembershipInteractor.kt", m100431l = {29, 31}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ldx1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C12429c f42344E;

        /* JADX INFO: renamed from: w */
        Object f42345w;

        /* JADX INFO: renamed from: x */
        int f42346x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f42347y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC13058l f42348z;

        /* JADX INFO: renamed from: dx1.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C22669g0 f42349w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C12429c f42350x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC13062m f42351y;

            /* JADX INFO: renamed from: dx1.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.membership.management.domain.interactors.manage.ManageMembershipInteractor$interact$1$1", m100430f = "ManageMembershipInteractor.kt", m100431l = {33, 36}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41505a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                int f42352E;

                /* JADX INFO: renamed from: w */
                Object f42353w;

                /* JADX INFO: renamed from: x */
                Object f42354x;

                /* JADX INFO: renamed from: y */
                /* synthetic */ Object f42355y;

                /* JADX INFO: renamed from: z */
                final /* synthetic */ a<T> f42356z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C41505a(a<? super T> aVar, InterfaceC30057d<? super C41505a> interfaceC30057d) {
                    super(interfaceC30057d);
                    this.f42356z = aVar;
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f42355y = obj;
                    this.f42352E |= Integer.MIN_VALUE;
                    return this.f42356z.emit(null, this);
                }
            }

            public a(C22669g0 c22669g0, C12429c c12429c, InterfaceC13062m interfaceC13062m) {
                this.f42349w = c22669g0;
                this.f42350x = c12429c;
                this.f42351y = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
            
                if (r8.emit(r9, r0) == r1) goto L28;
             */
            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(dx1.InterfaceC12427a r8, q83.InterfaceC30057d<? super l83.C23454a0> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof dx1.C12429c.c.a.C41505a
                    if (r0 == 0) goto L13
                    r0 = r9
                    dx1.c$c$a$a r0 = (dx1.C12429c.c.a.C41505a) r0
                    int r1 = r0.f42352E
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f42352E = r1
                    goto L18
                L13:
                    dx1.c$c$a$a r0 = new dx1.c$c$a$a
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f42355y
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r0.f42352E
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L43
                    if (r2 == r4) goto L37
                    if (r2 != r3) goto L2f
                    java.lang.Object r8 = r0.f42353w
                    dx1.a r8 = (dx1.InterfaceC12427a) r8
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L81
                L2f:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L37:
                    java.lang.Object r8 = r0.f42354x
                    kotlin.jvm.internal.g0 r8 = (p715kotlin.jvm.internal.C22669g0) r8
                    java.lang.Object r2 = r0.f42353w
                    dx1.a r2 = (dx1.InterfaceC12427a) r2
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L60
                L43:
                    p505ts.AbstractC34132o.m107864I(r9)
                    kotlin.jvm.internal.g0 r9 = r7.f42349w
                    boolean r2 = r8 instanceof dx1.InterfaceC12427a.a
                    if (r2 == 0) goto L66
                    dx1.c r8 = r7.f42350x
                    ec3.m r2 = r7.f42351y
                    r0.f42353w = r5
                    r0.f42354x = r9
                    r0.f42352E = r4
                    java.lang.Object r8 = dx1.C12429c.m34992c(r8, r2, r0)
                    if (r8 != r1) goto L5d
                    goto L80
                L5d:
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L60:
                    dx1.b r9 = (dx1.InterfaceC12428b) r9
                    r6 = r9
                    r9 = r8
                    r8 = r6
                    goto L6c
                L66:
                    boolean r8 = r8 instanceof dx1.InterfaceC12427a.b
                    if (r8 == 0) goto L84
                    dx1.b$d r8 = dx1.InterfaceC12428b.d.f42334a
                L6c:
                    r9.f89336w = r8
                    ec3.m r8 = r7.f42351y
                    kotlin.jvm.internal.g0 r9 = r7.f42349w
                    java.lang.Object r9 = r9.f89336w
                    r0.f42353w = r5
                    r0.f42354x = r5
                    r0.f42352E = r3
                    java.lang.Object r8 = r8.emit(r9, r0)
                    if (r8 != r1) goto L81
                L80:
                    return r1
                L81:
                    l83.a0 r8 = l83.C23454a0.f92919a
                    return r8
                L84:
                    kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                    r8.<init>()
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: dx1.C12429c.c.a.emit(dx1.a, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC13058l interfaceC13058l, C12429c c12429c, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f42348z = interfaceC13058l;
            this.f42344E = c12429c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f42348z, this.f42344E, interfaceC30057d);
            cVar.f42347y = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        
            if (r7.collect(r4, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f42347y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f42346x
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L28
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
                java.lang.Object r0 = r6.f42345w
                kotlin.jvm.internal.g0 r0 = (p715kotlin.jvm.internal.C22669g0) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L54
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L20:
                java.lang.Object r2 = r6.f42345w
                kotlin.jvm.internal.g0 r2 = (p715kotlin.jvm.internal.C22669g0) r2
                p505ts.AbstractC34132o.m107864I(r7)
                goto L3d
            L28:
                kotlin.jvm.internal.g0 r2 = p088dc.AbstractC11895b.m32004w(r7)
                dx1.b$d r7 = dx1.InterfaceC12428b.d.f42334a
                r2.f89336w = r7
                r6.f42347y = r0
                r6.f42345w = r2
                r6.f42346x = r4
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L3d
                goto L53
            L3d:
                ec3.l r7 = r6.f42348z
                dx1.c$c$a r4 = new dx1.c$c$a
                dx1.c r5 = r6.f42344E
                r4.<init>(r2, r5, r0)
                r0 = 0
                r6.f42347y = r0
                r6.f42345w = r0
                r6.f42346x = r3
                java.lang.Object r7 = r7.collect(r4, r6)
                if (r7 != r1) goto L54
            L53:
                return r1
            L54:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: dx1.C12429c.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C12429c(MembershipManagementApi membershipManagementApi, C2120b analyticsHelper, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(membershipManagementApi, "membershipManagementApi");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(logger, "logger");
        this.membershipManagementApi = membershipManagementApi;
        this.analyticsHelper = analyticsHelper;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:59:0x0107 A[LOOP:1: B:57:0x0101->B:59:0x0107, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x011e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0128  */
    /* JADX WARN: Code duplicated, block: B:74:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0142  */
    /* JADX WARN: Code duplicated, block: B:77:0x0145  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r1 == r2) goto L22;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m34994e(ec3.InterfaceC13062m r24, q83.InterfaceC30057d<? super dx1.InterfaceC12428b> r25) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dx1.C12429c.m34994e(ec3.m, q83.d):java.lang.Object");
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13084s1(new c(upstream, this, null));
    }

    public /* synthetic */ C12429c(MembershipManagementApi membershipManagementApi, C2120b c2120b, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(membershipManagementApi, c2120b, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ManageMembershipInteractor") : interfaceC34116n);
    }
}
