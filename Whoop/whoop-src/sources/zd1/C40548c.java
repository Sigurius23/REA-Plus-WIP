package zd1;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13060l1;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import n82.InterfaceC26456b;
import od1.AbstractC27845h;
import od1.C27850m;
import od1.C27851n;
import od1.InterfaceC27849l;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sp0.EnumC32861a;
import xd1.C38203b;
import xd1.C38204c;
import xd1.InterfaceC38202a;
import yd1.AbstractC39457a;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: zd1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u000e0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010-R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u000207068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020;0/8\u0006¢\u0006\f\n\u0004\b<\u00102\u001a\u0004\b=\u0010>R\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020@0/8\u0006¢\u0006\f\n\u0004\bA\u00102\u001a\u0004\bB\u0010>¨\u0006D"}, m65681d2 = {"Lzd1/c;", "Landroidx/lifecycle/w1;", "Lxd1/c;", "interactor", "Lod1/n;", "selectActivityTypeInteractor", "Lzd1/a;", "reducer", "Lbc3/c0;", "scope", "Lzr2/a;", "timeProvider", "<init>", "(Lxd1/c;Lod1/n;Lzd1/a;Lbc3/c0;Lzr2/a;)V", "Lzd1/b;", "viewEvent", "Lxd1/a;", "t", "(Lzd1/b;)Lxd1/a;", "Ln82/b;", "Lod1/l;", "r", "(Ln82/b;)Lod1/l;", "Lsp0/a;", "activityType", "Lzd1/b$k;", "loadEditedActivity", "Ll83/a0;", "q", "(Lsp0/a;Lzd1/b$k;)V", "Lbc3/k1;", "u", "(Ln82/b;)Lbc3/k1;", "v", "(Lzd1/b;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lxd1/c;", "x", "Lzd1/a;", "y", "Lbc3/c0;", "z", "Lzr2/a;", "Lec3/o1;", "E", "Lec3/o1;", "selectActivityTypeEventFlow", "Lec3/l;", "Lod1/m;", "F", "Lec3/l;", "selectActivityTypeDomainState", "G", "eventFlow", "Lec3/t1;", "Lxd1/b;", "H", "Lec3/t1;", "domainState", "Lzd1/d;", "I", "getViewState", "()Lec3/l;", "viewState", "Lyd1/a;", "J", "p", "navigationEvents", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40548c extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 selectActivityTypeEventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l selectActivityTypeDomainState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13087t1 domainState;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC13058l navigationEvents;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C38204c interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C40546a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC41070a timeProvider;

    /* JADX INFO: renamed from: zd1.c$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a extends C22672i implements Function3 {
        public a(Object obj) {
            super(3, 0, C38204c.class, obj, "interact", "interact(Lcom/whoop/edit/domain/EditActivityDomainState;Lcom/whoop/edit/domain/EditActivityDomainAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C38203b c38203b, InterfaceC38202a interfaceC38202a, InterfaceC30057d<? super C38203b> interfaceC30057d) {
            return ((C38204c) this.receiver).m122408q(c38203b, interfaceC38202a, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: zd1.c$b */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.edit.presentation.EditActivityViewModel$initialize$1", m100430f = "EditActivityViewModel.kt", m100431l = {121, 122}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f174496w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ EnumC32861a f174498y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC40547b.k f174499z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumC32861a enumC32861a, InterfaceC40547b.k kVar, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f174498y = enumC32861a;
            this.f174499z = kVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C40548c.this.new b(this.f174498y, this.f174499z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r5.f174496w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r6)
                goto L46
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L35
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                zd1.c r6 = zd1.C40548c.this
                ec3.o1 r6 = zd1.C40548c.m131442g(r6)
                zd1.b$o r1 = new zd1.b$o
                sp0.a r4 = r5.f174498y
                r1.<init>(r4)
                r5.f174496w = r3
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L35
                goto L45
            L35:
                zd1.c r6 = zd1.C40548c.this
                ec3.o1 r6 = zd1.C40548c.m131442g(r6)
                zd1.b$k r1 = r5.f174499z
                r5.f174496w = r2
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L46
            L45:
                return r0
            L46:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: zd1.C40548c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zd1.c$c */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.edit.presentation.EditActivityViewModel$sendSelectActivityViewEvent$1", m100430f = "EditActivityViewModel.kt", m100431l = {127}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f174500w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC26456b f174502y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC26456b interfaceC26456b, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f174502y = interfaceC26456b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C40548c.this.new c(this.f174502y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f174500w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C40548c.this.selectActivityTypeEventFlow;
                InterfaceC26456b interfaceC26456b = this.f174502y;
                this.f174500w = 1;
                if (interfaceC13072o1.emit(interfaceC26456b, this) == enumC31071a) {
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
    }

    /* JADX INFO: renamed from: zd1.c$d */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.edit.presentation.EditActivityViewModel$sendViewEvent$1", m100430f = "EditActivityViewModel.kt", m100431l = {131}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f174503w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC40547b f174505y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC40547b interfaceC40547b, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f174505y = interfaceC40547b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C40548c.this.new d(this.f174505y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f174503w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C40548c.this.eventFlow;
                InterfaceC40547b interfaceC40547b = this.f174505y;
                this.f174503w = 1;
                if (interfaceC13072o1.emit(interfaceC40547b, this) == enumC31071a) {
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
    }

    /* JADX INFO: renamed from: zd1.c$e */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f174506w;

        /* JADX INFO: renamed from: zd1.c$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f174507w;

            /* JADX INFO: renamed from: zd1.c$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.edit.presentation.EditActivityViewModel$special$$inlined$filter$1$2", m100430f = "EditActivityViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42741a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f174509F;

                /* JADX INFO: renamed from: G */
                Object f174510G;

                /* JADX INFO: renamed from: H */
                int f174511H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f174512w;

                /* JADX INFO: renamed from: x */
                int f174513x;

                /* JADX INFO: renamed from: y */
                Object f174514y;

                /* JADX INFO: renamed from: z */
                Object f174515z;

                public C42741a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f174512w = obj;
                    this.f174513x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f174507w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42741a c42741a;
                if (interfaceC30057d instanceof C42741a) {
                    c42741a = (C42741a) interfaceC30057d;
                    int i13 = c42741a.f174513x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42741a.f174513x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42741a = new C42741a(interfaceC30057d);
                    }
                } else {
                    c42741a = new C42741a(interfaceC30057d);
                }
                Object obj2 = c42741a.f174512w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42741a.f174513x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f174507w;
                    C38203b c38203b = (C38203b) obj;
                    if ((c38203b.getScreenState() instanceof InterfaceC40553h.o) && !AbstractC22676k.m65745e(c38203b.getScreenState(), InterfaceC40553h.a.f174615a)) {
                        c42741a.f174514y = null;
                        c42741a.f174515z = null;
                        c42741a.f174509F = null;
                        c42741a.f174510G = null;
                        c42741a.f174511H = 0;
                        c42741a.f174513x = 1;
                        if (interfaceC13062m.emit(obj, c42741a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public e(InterfaceC13058l interfaceC13058l) {
            this.f174506w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f174506w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zd1.c$f */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f174516w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C40548c f174517x;

        /* JADX INFO: renamed from: zd1.c$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f174518w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C40548c f174519x;

            /* JADX INFO: renamed from: zd1.c$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.edit.presentation.EditActivityViewModel$special$$inlined$map$1$2", m100430f = "EditActivityViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42742a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f174520E;

                /* JADX INFO: renamed from: F */
                Object f174521F;

                /* JADX INFO: renamed from: G */
                Object f174522G;

                /* JADX INFO: renamed from: H */
                int f174523H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f174524w;

                /* JADX INFO: renamed from: x */
                int f174525x;

                /* JADX INFO: renamed from: y */
                Object f174526y;

                public C42742a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f174524w = obj;
                    this.f174525x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C40548c c40548c) {
                this.f174518w = interfaceC13062m;
                this.f174519x = c40548c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42742a c42742a;
                if (interfaceC30057d instanceof C42742a) {
                    c42742a = (C42742a) interfaceC30057d;
                    int i13 = c42742a.f174525x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42742a.f174525x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42742a = new C42742a(interfaceC30057d);
                    }
                } else {
                    c42742a = new C42742a(interfaceC30057d);
                }
                Object obj2 = c42742a.f174524w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42742a.f174525x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f174518w;
                    InterfaceC27849l interfaceC27849lM131447r = this.f174519x.m131447r((InterfaceC26456b) obj);
                    c42742a.f174526y = null;
                    c42742a.f174520E = null;
                    c42742a.f174521F = null;
                    c42742a.f174522G = null;
                    c42742a.f174523H = 0;
                    c42742a.f174525x = 1;
                    if (interfaceC13062m.emit(interfaceC27849lM131447r, c42742a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public f(InterfaceC13058l interfaceC13058l, C40548c c40548c) {
            this.f174516w = interfaceC13058l;
            this.f174517x = c40548c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f174516w.collect(new a(interfaceC13062m, this.f174517x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zd1.c$g */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f174528w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C40548c f174529x;

        /* JADX INFO: renamed from: zd1.c$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f174530w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C40548c f174531x;

            /* JADX INFO: renamed from: zd1.c$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.edit.presentation.EditActivityViewModel$special$$inlined$map$2$2", m100430f = "EditActivityViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42743a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f174532E;

                /* JADX INFO: renamed from: F */
                Object f174533F;

                /* JADX INFO: renamed from: G */
                Object f174534G;

                /* JADX INFO: renamed from: H */
                int f174535H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f174536w;

                /* JADX INFO: renamed from: x */
                int f174537x;

                /* JADX INFO: renamed from: y */
                Object f174538y;

                public C42743a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f174536w = obj;
                    this.f174537x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C40548c c40548c) {
                this.f174530w = interfaceC13062m;
                this.f174531x = c40548c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42743a c42743a;
                if (interfaceC30057d instanceof C42743a) {
                    c42743a = (C42743a) interfaceC30057d;
                    int i13 = c42743a.f174537x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42743a.f174537x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42743a = new C42743a(interfaceC30057d);
                    }
                } else {
                    c42743a = new C42743a(interfaceC30057d);
                }
                Object obj2 = c42743a.f174536w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42743a.f174537x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f174530w;
                    InterfaceC38202a interfaceC38202aM131448t = this.f174531x.m131448t((InterfaceC40547b) obj);
                    c42743a.f174538y = null;
                    c42743a.f174532E = null;
                    c42743a.f174533F = null;
                    c42743a.f174534G = null;
                    c42743a.f174535H = 0;
                    c42743a.f174537x = 1;
                    if (interfaceC13062m.emit(interfaceC38202aM131448t, c42743a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public g(InterfaceC13058l interfaceC13058l, C40548c c40548c) {
            this.f174528w = interfaceC13058l;
            this.f174529x = c40548c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f174528w.collect(new a(interfaceC13062m, this.f174529x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zd1.c$h */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f174540w;

        /* JADX INFO: renamed from: zd1.c$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f174541w;

            /* JADX INFO: renamed from: zd1.c$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.edit.presentation.EditActivityViewModel$special$$inlined$map$3$2", m100430f = "EditActivityViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42744a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f174542E;

                /* JADX INFO: renamed from: F */
                Object f174543F;

                /* JADX INFO: renamed from: G */
                Object f174544G;

                /* JADX INFO: renamed from: H */
                int f174545H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f174546w;

                /* JADX INFO: renamed from: x */
                int f174547x;

                /* JADX INFO: renamed from: y */
                Object f174548y;

                public C42744a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f174546w = obj;
                    this.f174547x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f174541w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42744a c42744a;
                Object cVar;
                if (interfaceC30057d instanceof C42744a) {
                    c42744a = (C42744a) interfaceC30057d;
                    int i13 = c42744a.f174547x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42744a.f174547x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42744a = new C42744a(interfaceC30057d);
                    }
                } else {
                    c42744a = new C42744a(interfaceC30057d);
                }
                Object obj2 = c42744a.f174546w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42744a.f174547x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f174541w;
                    InterfaceC40553h screenState = ((C38203b) obj).getScreenState();
                    AbstractC22676k.m65748h(screenState, "null cannot be cast to non-null type com.whoop.edit.presentation.ScreenState.ScreenDataState");
                    InterfaceC40553h.o oVar = (InterfaceC40553h.o) screenState;
                    if (oVar.equals(InterfaceC40553h.b.f174616a)) {
                        cVar = AbstractC39457a.a.f169779a;
                    } else {
                        cVar = oVar instanceof InterfaceC40553h.h ? new AbstractC39457a.c(((InterfaceC40553h.h) oVar).getActivityId()) : AbstractC39457a.d.f169782a;
                    }
                    c42744a.f174548y = null;
                    c42744a.f174542E = null;
                    c42744a.f174543F = null;
                    c42744a.f174544G = null;
                    c42744a.f174545H = 0;
                    c42744a.f174547x = 1;
                    if (interfaceC13062m.emit(cVar, c42744a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public h(InterfaceC13058l interfaceC13058l) {
            this.f174540w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f174540w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zd1.c$i */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.edit.presentation.EditActivityViewModel$viewState$1", m100430f = "EditActivityViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lxd1/b;", "screenState", "Lod1/m;", "searchState", "Lzd1/d;", "<anonymous>", "(Lxd1/b;Lod1/m;)Lzd1/d;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f174550w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f174551x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f174552y;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C38203b c38203b, C27850m c27850m, InterfaceC30057d<? super InterfaceC40549d> interfaceC30057d) {
            i iVar = C40548c.this.new i(interfaceC30057d);
            iVar.f174551x = c38203b;
            iVar.f174552y = c27850m;
            return iVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C38203b c38203b = (C38203b) this.f174551x;
            C27850m c27850m = (C27850m) this.f174552y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f174550w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C40548c.this.reducer.m131423n(c38203b, c27850m);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40548c(C38204c interactor, C27851n selectActivityTypeInteractor, C40546a reducer, InterfaceC2994c0 scope, InterfaceC41070a timeProvider) {
        super(scope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(selectActivityTypeInteractor, "selectActivityTypeInteractor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(timeProvider, "timeProvider");
        this.interactor = interactor;
        this.reducer = reducer;
        this.scope = scope;
        this.timeProvider = timeProvider;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.selectActivityTypeEventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM83945a = AbstractC27845h.m83945a(new f(c13096w1M36592b, this), selectActivityTypeInteractor);
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lM83945a, scope, c13021b2, 1);
        this.selectActivityTypeDomainState = c13078q1M36586L;
        C13096w1 c13096w1M36592b2 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b2;
        C13078q1 c13078q1M36586L2 = AbstractC13091v.m36586L(new C13060l1(new C38203b(null, null, null, null, null, timeProvider.mo133362a(), timeProvider.mo133362a(), null, null, null, null, null, null, null, null, null, null, false, 262047, null), new g(c13096w1M36592b2, this), new a(interactor)), scope, c13021b2, 1);
        this.domainState = c13078q1M36586L2;
        this.viewState = new C13060l1(c13078q1M36586L2, c13078q1M36586L, new i(null), 1);
        this.navigationEvents = new h(new e(c13078q1M36586L2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final InterfaceC27849l m131447r(InterfaceC26456b viewEvent) {
        if (viewEvent instanceof InterfaceC26456b.a) {
            return new InterfaceC27849l.a(((InterfaceC26456b.a) viewEvent).getInitialScreenType(), false, 2, null);
        }
        if (!(viewEvent instanceof InterfaceC26456b.b)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC26456b.b bVar = (InterfaceC26456b.b) viewEvent;
        return new InterfaceC27849l.b(bVar.getCom.mapbox.common.MapboxServices.SEARCH java.lang.String(), bVar.getScreenType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final InterfaceC38202a m131448t(InterfaceC40547b viewEvent) {
        if (viewEvent instanceof InterfaceC40547b.o) {
            return new InterfaceC38202a.n(((InterfaceC40547b.o) viewEvent).getActivityType());
        }
        if (viewEvent instanceof InterfaceC40547b.k) {
            InterfaceC40547b.k kVar = (InterfaceC40547b.k) viewEvent;
            m131451u(new InterfaceC26456b.a(EnumC32861a.INSTANCE.m103132c(kVar.getActivityType())));
            return new InterfaceC38202a.k(kVar.getStartDate(), kVar.getEndDate(), kVar.getInternalName(), kVar.getActivityType(), kVar.getActivityId(), kVar.getAnalyticFlow(), kVar.getIsDeletable());
        }
        if (viewEvent instanceof InterfaceC40547b.m) {
            m131451u(new InterfaceC26456b.a(((InterfaceC40547b.m) viewEvent).getPageType()));
            return InterfaceC38202a.j.f163608a;
        }
        if (viewEvent instanceof InterfaceC40547b.s) {
            return new InterfaceC38202a.s(((InterfaceC40547b.s) viewEvent).getStrapLocation());
        }
        if (viewEvent instanceof InterfaceC40547b.r) {
            return new InterfaceC38202a.r(((InterfaceC40547b.r) viewEvent).getStartDateTime());
        }
        if (viewEvent instanceof InterfaceC40547b.h) {
            return new InterfaceC38202a.q(((InterfaceC40547b.h) viewEvent).getEndDateTime());
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC40547b.p.f174481a)) {
            return InterfaceC38202a.o.f163619a;
        }
        if (viewEvent instanceof InterfaceC40547b.a) {
            return new InterfaceC38202a.a(((InterfaceC40547b.a) viewEvent).getInternalName());
        }
        if (viewEvent instanceof InterfaceC40547b.j) {
            return new InterfaceC38202a.i(((InterfaceC40547b.j) viewEvent).getErrorCloseEvent());
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC40547b.l.f174477a)) {
            return InterfaceC38202a.l.f163616a;
        }
        if (viewEvent instanceof InterfaceC40547b.b) {
            return new InterfaceC38202a.h(((InterfaceC40547b.b) viewEvent).getIsCancel());
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC40547b.i.f174468a)) {
            return InterfaceC38202a.g.f163605a;
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC40547b.c.f174462a)) {
            return InterfaceC38202a.b.f163600a;
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC40547b.q.f174482a)) {
            return InterfaceC38202a.p.f163620a;
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC40547b.f.f174465a)) {
            return InterfaceC38202a.e.f163603a;
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC40547b.d.f174463a)) {
            return InterfaceC38202a.c.f163601a;
        }
        if (viewEvent instanceof InterfaceC40547b.n) {
            return new InterfaceC38202a.m(((InterfaceC40547b.n) viewEvent).getSelectedSection());
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC40547b.g.f174466a)) {
            return InterfaceC38202a.f.f163604a;
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC40547b.e.f174464a)) {
            return InterfaceC38202a.d.f163602a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final InterfaceC13058l getNavigationEvents() {
        return this.navigationEvents;
    }

    /* JADX INFO: renamed from: q */
    public final void m131450q(EnumC32861a activityType, InterfaceC40547b.k loadEditedActivity) {
        AbstractC22676k.m65750j(activityType, "activityType");
        AbstractC22676k.m65750j(loadEditedActivity, "loadEditedActivity");
        AbstractC3006f0.m8732z(this.scope, null, null, new b(activityType, loadEditedActivity, null), 3);
    }

    /* JADX INFO: renamed from: u */
    public final InterfaceC3027k1 m131451u(InterfaceC26456b viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(this.scope, null, null, new c(viewEvent, null), 3);
    }

    /* JADX INFO: renamed from: v */
    public final InterfaceC3027k1 m131452v(InterfaceC40547b viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(this.scope, null, null, new d(viewEvent, null), 3);
    }

    public /* synthetic */ C40548c(C38204c c38204c, C27851n c27851n, C40546a c40546a, InterfaceC2994c0 interfaceC2994c0, InterfaceC41070a interfaceC41070a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c38204c, c27851n, c40546a, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0, interfaceC41070a);
    }
}
