package y60;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import com.whoop.activation.dayzero.domain.network.DayZeroSplashApi;
import com.whoop.activation.dayzero.model.DayZeroSplashResponse;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.AbstractC34386b;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: y60.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ly60/c;", "Lod1/g;", "Ly60/a;", "Ly60/b;", "Lcom/whoop/activation/dayzero/domain/network/DayZeroSplashApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/activation/dayzero/domain/network/DayZeroSplashApi;Ltr2/n;)V", "e", "(Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/activation/dayzero/domain/network/DayZeroSplashApi;", "b", "Ltr2/n;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39259c implements InterfaceC27844g<AbstractC39257a, C39258b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final DayZeroSplashApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: y60.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.dayzero.domain.DayZeroSplashInteractor$interact$$inlined$flatMapLatest$1", m100430f = "DayZeroSplashInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f168782w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f168783x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f168784y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C39259c f168785z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C39259c c39259c) {
            super(3, interfaceC30057d);
            this.f168785z = c39259c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC39257a abstractC39257a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f168785z);
            aVar.f168783x = interfaceC13062m;
            aVar.f168784y = abstractC39257a;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f168782w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f168783x;
                if (!AbstractC22676k.m65745e((AbstractC39257a) this.f168784y, AbstractC39257a.a.f168776a)) {
                    throw new NoWhenBranchMatchedException();
                }
                C13084s1 c13084s1 = new C13084s1(this.f168785z.new b(null));
                this.f168783x = null;
                this.f168784y = null;
                this.f168782w = 1;
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
            return invoke((InterfaceC13062m) obj, (AbstractC39257a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: y60.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.activation.dayzero.domain.DayZeroSplashInteractor$interact$1$1", m100430f = "DayZeroSplashInteractor.kt", m100431l = {C1533u.RECORDING_METHOD_FIELD_NUMBER, 24, 24}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ly60/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f168786w;

        /* JADX INFO: renamed from: x */
        int f168787x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f168788y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C39259c.this.new b(interfaceC30057d);
            bVar.f168788y = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
        
            if (r0.emit(r14, r13) == r1) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r13.f168788y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r13.f168787x
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L2c
                if (r2 == r5) goto L28
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
                p505ts.AbstractC34132o.m107864I(r14)
                goto L60
            L18:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L20:
                java.lang.Object r0 = r13.f168786w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r14)
                goto L53
            L28:
                p505ts.AbstractC34132o.m107864I(r14)
                goto L44
            L2c:
                p505ts.AbstractC34132o.m107864I(r14)
                y60.b r7 = new y60.b
                r11 = 5
                r12 = 0
                r8 = 0
                r9 = 1
                r10 = 0
                r7.<init>(r8, r9, r10, r11, r12)
                r13.f168788y = r0
                r13.f168787x = r5
                java.lang.Object r14 = r0.emit(r7, r13)
                if (r14 != r1) goto L44
                goto L5f
            L44:
                y60.c r14 = y60.C39259c.this
                r13.f168788y = r6
                r13.f168786w = r0
                r13.f168787x = r4
                java.lang.Object r14 = y60.C39259c.m125034d(r14, r13)
                if (r14 != r1) goto L53
                goto L5f
            L53:
                r13.f168788y = r6
                r13.f168786w = r6
                r13.f168787x = r3
                java.lang.Object r14 = r0.emit(r14, r13)
                if (r14 != r1) goto L60
            L5f:
                return r1
            L60:
                l83.a0 r14 = l83.C23454a0.f92919a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: y60.C39259c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: y60.c$c */
    @InterfaceC32271e(m100429c = "com.whoop.activation.dayzero.domain.DayZeroSplashInteractor", m100430f = "DayZeroSplashInteractor.kt", m100431l = {31}, m100432m = "load", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f168790w;

        /* JADX INFO: renamed from: y */
        int f168792y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f168790w = obj;
            this.f168792y |= Integer.MIN_VALUE;
            return C39259c.this.m125035e(this);
        }
    }

    /* JADX INFO: renamed from: y60.c$d */
    @InterfaceC32271e(m100429c = "com.whoop.activation.dayzero.domain.DayZeroSplashInteractor$load$result$1", m100430f = "DayZeroSplashInteractor.kt", m100431l = {32}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f168793w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C39259c.this.new d(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f168793w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            DayZeroSplashApi dayZeroSplashApi = C39259c.this.api;
            this.f168793w = 1;
            Object dayZeroSplash = dayZeroSplashApi.getDayZeroSplash(this);
            return dayZeroSplash == enumC31071a ? enumC31071a : dayZeroSplash;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super DayZeroSplashResponse> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C39259c(DayZeroSplashApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: e */
    public final Object m125035e(InterfaceC30057d<? super C39258b> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f168792y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f168792y = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object objM108729b = cVar2.f168790w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar2.f168792y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            d dVar = new d(null);
            cVar2.f168792y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to load Day-0 splash", dVar, cVar2, 2, null);
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
        return new C39258b((DayZeroSplashResponse) AbstractC34386b.m108737b(interfaceC34385a), false, interfaceC34385a instanceof InterfaceC34385a.b);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new a(null, this));
    }

    public /* synthetic */ C39259c(DayZeroSplashApi dayZeroSplashApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(dayZeroSplashApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("DayZeroSplashInteractor") : interfaceC34116n);
    }
}
