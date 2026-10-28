package qv1;

import c93.InterfaceC4351m;
import com.whoop.membership.comunityraf.CommunityRafApi;
import com.whoop.membership.comunityraf.CommunityRafModel;
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
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: qv1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lqv1/d;", "", "Lcom/whoop/membership/comunityraf/CommunityRafApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/membership/comunityraf/CommunityRafApi;Ltr2/n;)V", "Lqv1/c;", "c", "(Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "Lqv1/b;", "upstream", "d", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/membership/comunityraf/CommunityRafApi;", "b", "Ltr2/n;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30653d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final CommunityRafApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: qv1.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.comunityraf.CommunityRafInteractor", m100430f = "CommunityRafInteractor.kt", m100431l = {26}, m100432m = "getCommunityRafBanners", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f126086w;

        /* JADX INFO: renamed from: y */
        int f126088y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f126086w = obj;
            this.f126088y |= Integer.MIN_VALUE;
            return C30653d.this.m94219c(this);
        }
    }

    /* JADX INFO: renamed from: qv1.d$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.comunityraf.CommunityRafInteractor$getCommunityRafBanners$2", m100430f = "CommunityRafInteractor.kt", m100431l = {27}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/membership/comunityraf/CommunityRafModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f126089w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C30653d.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f126089w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            CommunityRafApi communityRafApi = C30653d.this.api;
            this.f126089w = 1;
            Object rafCommunityBanners = communityRafApi.getRafCommunityBanners(this);
            return rafCommunityBanners == enumC31071a ? enumC31071a : rafCommunityBanners;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super CommunityRafModel> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: qv1.d$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.comunityraf.CommunityRafInteractor$interact$$inlined$flatMapLatest$1", m100430f = "CommunityRafInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f126091w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f126092x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f126093y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C30653d f126094z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C30653d c30653d) {
            super(3, interfaceC30057d);
            this.f126094z = c30653d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30651b interfaceC30651b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f126094z);
            cVar.f126092x = interfaceC13062m;
            cVar.f126093y = interfaceC30651b;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f126091w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f126092x;
                C13084s1 c13084s1 = new C13084s1(new d((InterfaceC30651b) this.f126093y, this.f126094z, null));
                this.f126092x = null;
                this.f126093y = null;
                this.f126091w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (InterfaceC30651b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: qv1.d$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.comunityraf.CommunityRafInteractor$interact$1$1", m100430f = "CommunityRafInteractor.kt", m100431l = {20, 20}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lqv1/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C30653d f126095E;

        /* JADX INFO: renamed from: w */
        Object f126096w;

        /* JADX INFO: renamed from: x */
        int f126097x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f126098y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC30651b f126099z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30651b interfaceC30651b, C30653d c30653d, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f126099z = interfaceC30651b;
            this.f126095E = c30653d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(this.f126099z, this.f126095E, interfaceC30057d);
            dVar.f126098y = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f126098y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f126097x
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L25
                if (r2 == r4) goto L1d
                if (r2 != r3) goto L15
                p505ts.AbstractC34132o.m107864I(r7)
                goto L4a
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                java.lang.Object r0 = r6.f126096w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L3d
            L25:
                p505ts.AbstractC34132o.m107864I(r7)
                qv1.b r7 = r6.f126099z
                boolean r7 = r7 instanceof qv1.InterfaceC30651b.a
                if (r7 == 0) goto L4d
                qv1.d r7 = r6.f126095E
                r6.f126098y = r5
                r6.f126096w = r0
                r6.f126097x = r4
                java.lang.Object r7 = qv1.C30653d.m94218b(r7, r6)
                if (r7 != r1) goto L3d
                goto L49
            L3d:
                r6.f126098y = r5
                r6.f126096w = r5
                r6.f126097x = r3
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L4a
            L49:
                return r1
            L4a:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            L4d:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: qv1.C30653d.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C30653d(CommunityRafApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: c */
    public final Object m94219c(InterfaceC30057d<? super InterfaceC30652c> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f126088y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f126088y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f126086w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f126088y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(null);
            aVar2.f126088y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, bVar, aVar2, 6, null);
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
            return new InterfaceC30652c.b((CommunityRafModel) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return InterfaceC30652c.a.f126082a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC13058l m94220d(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new c(null, this));
    }
}
