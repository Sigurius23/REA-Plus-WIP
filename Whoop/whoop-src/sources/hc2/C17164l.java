package hc2;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.data.remote.domain.dto.growth.PauseEligibility;
import com.whoop.data.remote.domain.dto.growth.SubscriptionPause;
import com.whoop.service.network.MembershipV2Api;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: hc2.l */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bH\u0082@¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0082@¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u000e\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lhc2/l;", "", "Lcom/whoop/service/network/MembershipV2Api;", "membershipV2Api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/service/network/MembershipV2Api;Ltr2/n;)V", "Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPause;", "e", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/remote/domain/dto/growth/PauseEligibility;", "f", "Lhc2/b;", "d", "a", "Lcom/whoop/service/network/MembershipV2Api;", "b", "Ltr2/n;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17164l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final MembershipV2Api membershipV2Api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: hc2.l$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.myaccount.PauseInfoHelper", m100430f = "PauseInfoHelper.kt", m100431l = {C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER, 29}, m100432m = "getPauseInfo", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        int f65940w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f65941x;

        /* JADX INFO: renamed from: z */
        int f65943z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f65941x = obj;
            this.f65943z |= Integer.MIN_VALUE;
            return C17164l.this.m48474d(this);
        }
    }

    /* JADX INFO: renamed from: hc2.l$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.myaccount.PauseInfoHelper", m100430f = "PauseInfoHelper.kt", m100431l = {50}, m100432m = "getSubscriptionPause", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f65944w;

        /* JADX INFO: renamed from: y */
        int f65946y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f65944w = obj;
            this.f65946y |= Integer.MIN_VALUE;
            return C17164l.this.m48472e(this);
        }
    }

    /* JADX INFO: renamed from: hc2.l$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.myaccount.PauseInfoHelper$getSubscriptionPause$2", m100430f = "PauseInfoHelper.kt", m100431l = {51}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/data/remote/domain/dto/growth/SubscriptionPause;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f65947w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C17164l.this.new c(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f65947w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            MembershipV2Api membershipV2Api = C17164l.this.membershipV2Api;
            this.f65947w = 1;
            Object subscriptionPause = membershipV2Api.getSubscriptionPause(this);
            return subscriptionPause == enumC31071a ? enumC31071a : subscriptionPause;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super SubscriptionPause> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: hc2.l$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.myaccount.PauseInfoHelper", m100430f = "PauseInfoHelper.kt", m100431l = {62}, m100432m = "getSubscriptionPauseEligibility", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f65949w;

        /* JADX INFO: renamed from: y */
        int f65951y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f65949w = obj;
            this.f65951y |= Integer.MIN_VALUE;
            return C17164l.this.m48473f(this);
        }
    }

    /* JADX INFO: renamed from: hc2.l$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.myaccount.PauseInfoHelper$getSubscriptionPauseEligibility$2", m100430f = "PauseInfoHelper.kt", m100431l = {63}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/data/remote/domain/dto/growth/PauseEligibility;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f65952w;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C17164l.this.new e(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f65952w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            MembershipV2Api membershipV2Api = C17164l.this.membershipV2Api;
            this.f65952w = 1;
            Object subscriptionPauseEligibility = membershipV2Api.getSubscriptionPauseEligibility(this);
            return subscriptionPauseEligibility == enumC31071a ? enumC31071a : subscriptionPauseEligibility;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super PauseEligibility> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C17164l(MembershipV2Api membershipV2Api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(membershipV2Api, "membershipV2Api");
        AbstractC22676k.m65750j(logger, "logger");
        this.membershipV2Api = membershipV2Api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: e */
    public final Object m48472e(InterfaceC30057d<? super SubscriptionPause> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f65946y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f65946y = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object objM108729b = bVar2.f65944w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar2.f65946y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            c cVar = new c(null);
            bVar2.f65946y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch subscription pause info", cVar, bVar2, 2, null);
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
            return (SubscriptionPause) ((InterfaceC34385a.c) interfaceC34385a).m108735a();
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: f */
    public final Object m48473f(InterfaceC30057d<? super PauseEligibility> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f65951y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f65951y = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object objM108729b = dVar2.f65949w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar2.f65951y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            e eVar = new e(null);
            dVar2.f65951y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch subscription pause eligibility info", eVar, dVar2, 2, null);
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
            return (PauseEligibility) ((InterfaceC34385a.c) interfaceC34385a).m108735a();
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [hc2.l] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [int] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m48474d(q83.InterfaceC30057d<? super hc2.C17154b> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof hc2.C17164l.a
            if (r0 == 0) goto L13
            r0 = r7
            hc2.l$a r0 = (hc2.C17164l.a) r0
            int r1 = r0.f65943z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f65943z = r1
            goto L18
        L13:
            hc2.l$a r0 = new hc2.l$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f65941x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f65943z
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            p505ts.AbstractC34132o.m107864I(r7)
            goto L60
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            p505ts.AbstractC34132o.m107864I(r7)
            goto L43
        L37:
            p505ts.AbstractC34132o.m107864I(r7)
            r0.f65943z = r4
            java.lang.Object r7 = r6.m48472e(r0)
            if (r7 != r1) goto L43
            goto L5f
        L43:
            com.whoop.data.remote.domain.dto.growth.SubscriptionPause r7 = (com.whoop.data.remote.domain.dto.growth.SubscriptionPause) r7
            if (r7 == 0) goto L4c
            boolean r7 = r7.isActive()
            goto L4d
        L4c:
            r7 = r5
        L4d:
            if (r7 == 0) goto L55
            hc2.b r7 = new hc2.b
            r7.<init>(r5, r5, r4)
            return r7
        L55:
            r0.f65940w = r7
            r0.f65943z = r3
            java.lang.Object r7 = r6.m48473f(r0)
            if (r7 != r1) goto L60
        L5f:
            return r1
        L60:
            com.whoop.data.remote.domain.dto.growth.PauseEligibility r7 = (com.whoop.data.remote.domain.dto.growth.PauseEligibility) r7
            if (r7 == 0) goto L69
            boolean r7 = r7.getEligibleToPause()
            goto L6a
        L69:
            r7 = r5
        L6a:
            if (r7 == 0) goto L72
            hc2.b r7 = new hc2.b
            r7.<init>(r5, r4, r5)
            return r7
        L72:
            hc2.b r7 = new hc2.b
            r7.<init>(r5, r5, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: hc2.C17164l.m48474d(q83.d):java.lang.Object");
    }

    public /* synthetic */ C17164l(MembershipV2Api membershipV2Api, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(membershipV2Api, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("PauseInfoHelper") : interfaceC34116n);
    }
}
