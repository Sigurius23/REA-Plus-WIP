package il1;

import c93.InterfaceC4351m;
import com.whoop.home.domain.HomeApi;
import com.whoop.home.domain.models.DismissTileRequest;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p007a6.C0456u;
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
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import wm0.C37378a;

/* JADX INFO: renamed from: il1.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lil1/i;", "Lod1/g;", "Lil1/g;", "Lil1/h;", "Lcom/whoop/home/domain/HomeApi;", "homeApi", "Lwm0/a;", "scopeCoordinator", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/home/domain/HomeApi;Lwm0/a;Ltr2/n;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/home/domain/HomeApi;", "b", "Lwm0/a;", "c", "Ltr2/n;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18632i implements InterfaceC27844g<AbstractC18630g, InterfaceC18631h> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final HomeApi homeApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C37378a scopeCoordinator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: il1.i$a */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.DismissConfigInteractor$interact$$inlined$flatMapLatest$1", m100430f = "DismissConfigInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f72874w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f72875x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f72876y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C18632i f72877z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C18632i c18632i) {
            super(3, interfaceC30057d);
            this.f72877z = c18632i;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC18630g abstractC18630g, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f72877z);
            aVar.f72875x = interfaceC13062m;
            aVar.f72876y = abstractC18630g;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c0456u;
            InterfaceC13058l c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f72874w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f72875x;
                AbstractC18630g abstractC18630g = (AbstractC18630g) this.f72876y;
                if (abstractC18630g instanceof AbstractC18630g.a) {
                    c13084s1 = new C13084s1(this.f72877z.new b(abstractC18630g, null));
                } else {
                    if (abstractC18630g instanceof AbstractC18630g.b) {
                        c0456u = new C13084s1(this.f72877z.new c(null));
                    } else {
                        if (!AbstractC22676k.m65745e(abstractC18630g, AbstractC18630g.c.f72866a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c0456u = new C0456u(InterfaceC18631h.a.f72867a, 1);
                    }
                    c13084s1 = c0456u;
                }
                this.f72875x = null;
                this.f72876y = null;
                this.f72874w = 1;
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
            return invoke((InterfaceC13062m) obj, (AbstractC18630g) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: il1.i$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.DismissConfigInteractor$interact$1$1", m100430f = "DismissConfigInteractor.kt", m100431l = {26, 27, 30, 31}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lil1/h;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f72878w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f72879x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC18630g f72881z;

        /* JADX INFO: renamed from: il1.i$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.home.domain.DismissConfigInteractor$interact$1$1$1", m100430f = "DismissConfigInteractor.kt", m100431l = {28}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f72882w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C18632i f72883x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ AbstractC18630g f72884y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C18632i c18632i, AbstractC18630g abstractC18630g, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f72883x = c18632i;
                this.f72884y = abstractC18630g;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f72883x, this.f72884y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f72882w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                HomeApi homeApi = this.f72883x.homeApi;
                DismissTileRequest dismissTileRequest = new DismissTileRequest(((AbstractC18630g.a) this.f72884y).getCycleId());
                this.f72882w = 1;
                Object objDismissTile = homeApi.dismissTile(dismissTileRequest, this);
                return objDismissTile == enumC31071a ? enumC31071a : objDismissTile;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC18630g abstractC18630g, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f72881z = abstractC18630g;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C18632i.this.new b(this.f72881z, interfaceC30057d);
            bVar.f72879x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0075  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
        
            if (r8.emit(r0, r14) == r9) goto L25;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = r14.f72879x
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r14.f72878w
                r10 = 4
                r11 = 3
                r1 = 2
                r12 = 1
                r13 = 0
                if (r0 == 0) goto L31
                if (r0 == r12) goto L2d
                if (r0 == r1) goto L29
                if (r0 == r11) goto L25
                if (r0 != r10) goto L1d
                p505ts.AbstractC34132o.m107864I(r15)
                goto L8d
            L1d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L25:
                p505ts.AbstractC34132o.m107864I(r15)
                goto L75
            L29:
                p505ts.AbstractC34132o.m107864I(r15)
                goto L64
            L2d:
                p505ts.AbstractC34132o.m107864I(r15)
                goto L41
            L31:
                p505ts.AbstractC34132o.m107864I(r15)
                il1.h$b r0 = il1.InterfaceC18631h.b.f72868a
                r14.f72879x = r8
                r14.f72878w = r12
                java.lang.Object r0 = r8.emit(r0, r14)
                if (r0 != r9) goto L41
                goto L8c
            L41:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                il1.i r2 = il1.C18632i.this
                tr2.n r2 = il1.C18632i.m53921d(r2)
                il1.i$b$a r4 = new il1.i$b$a
                il1.i r3 = il1.C18632i.this
                il1.g r6 = r14.f72881z
                r4.<init>(r3, r6, r13)
                r14.f72879x = r8
                r14.f72878w = r1
                r1 = r2
                r2 = 0
                java.lang.String r3 = "failed to update home Api"
                r6 = 2
                r7 = 0
                r5 = r14
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L64
                goto L8c
            L64:
                il1.i r0 = il1.C18632i.this
                wm0.a r0 = il1.C18632i.m53922e(r0)
                r14.f72879x = r8
                r14.f72878w = r11
                java.lang.Object r0 = wm0.C37378a.m119655c(r0, r13, r14, r12, r13)
                if (r0 != r9) goto L75
                goto L8c
            L75:
                il1.h$d r0 = new il1.h$d
                il1.g r1 = r14.f72881z
                il1.g$a r1 = (il1.AbstractC18630g.a) r1
                long r1 = r1.getCycleId()
                r0.<init>(r1)
                r14.f72879x = r13
                r14.f72878w = r10
                java.lang.Object r0 = r8.emit(r0, r14)
                if (r0 != r9) goto L8d
            L8c:
                return r9
            L8d:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: il1.C18632i.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: il1.i$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.DismissConfigInteractor$interact$1$2", m100430f = "DismissConfigInteractor.kt", m100431l = {36, 37, 40}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lil1/h;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f72885w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f72886x;

        /* JADX INFO: renamed from: il1.i$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.home.domain.DismissConfigInteractor$interact$1$2$1", m100430f = "DismissConfigInteractor.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f72888w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C18632i f72889x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C18632i c18632i, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f72889x = c18632i;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f72889x, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f72888w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                HomeApi homeApi = this.f72889x.homeApi;
                this.f72888w = 1;
                Object objDismissBehaviorImpactTile = homeApi.dismissBehaviorImpactTile(this);
                return objDismissBehaviorImpactTile == enumC31071a ? enumC31071a : objDismissBehaviorImpactTile;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C18632i.this.new c(interfaceC30057d);
            cVar.f72886x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
        
            if (wm0.C37378a.m119655c(r0, null, r12, 1, null) == r8) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = r12.f72886x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r8 = r83.EnumC31071a.f128113w
                int r1 = r12.f72885w
                r9 = 3
                r2 = 2
                r10 = 1
                r11 = 0
                if (r1 == 0) goto L28
                if (r1 == r10) goto L24
                if (r1 == r2) goto L20
                if (r1 != r9) goto L18
                p505ts.AbstractC34132o.m107864I(r13)
                goto L69
            L18:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L20:
                p505ts.AbstractC34132o.m107864I(r13)
                goto L58
            L24:
                p505ts.AbstractC34132o.m107864I(r13)
                goto L38
            L28:
                p505ts.AbstractC34132o.m107864I(r13)
                il1.h$c r1 = il1.InterfaceC18631h.c.f72869a
                r12.f72886x = r11
                r12.f72885w = r10
                java.lang.Object r0 = r0.emit(r1, r12)
                if (r0 != r8) goto L38
                goto L68
            L38:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                il1.i r1 = il1.C18632i.this
                tr2.n r1 = il1.C18632i.m53921d(r1)
                il1.i$c$a r4 = new il1.i$c$a
                il1.i r3 = il1.C18632i.this
                r4.<init>(r3, r11)
                r12.f72886x = r11
                r12.f72885w = r2
                r2 = 0
                java.lang.String r3 = "failed to update behavior impact Api"
                r6 = 2
                r7 = 0
                r5 = r12
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r8) goto L58
                goto L68
            L58:
                il1.i r0 = il1.C18632i.this
                wm0.a r0 = il1.C18632i.m53922e(r0)
                r12.f72886x = r11
                r12.f72885w = r9
                java.lang.Object r0 = wm0.C37378a.m119655c(r0, r11, r12, r10, r11)
                if (r0 != r8) goto L69
            L68:
                return r8
            L69:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: il1.C18632i.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C18632i(HomeApi homeApi, C37378a scopeCoordinator, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(homeApi, "homeApi");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        AbstractC22676k.m65750j(logger, "logger");
        this.homeApi = homeApi;
        this.scopeCoordinator = scopeCoordinator;
        this.logger = logger;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new a(null, this));
    }

    public /* synthetic */ C18632i(HomeApi homeApi, C37378a c37378a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(homeApi, c37378a, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("DismissConfigInteractor") : interfaceC34116n);
    }
}
