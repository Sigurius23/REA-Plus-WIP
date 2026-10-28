package mw0;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jw0.AbstractC21985c;
import jw0.C21986d;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: mw0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020)0\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, m65681d2 = {"Lmw0/c;", "Landroidx/lifecycle/w1;", "Ljw0/d;", "interactor", "Lmw0/e;", "viewStateReducer", "<init>", "(Ljw0/d;Lmw0/e;)V", "Lmw0/b;", "viewEvent", "Lec3/l;", "Ljw0/c;", "r", "(Lmw0/b;Lq83/d;)Ljava/lang/Object;", "Lbc3/k1;", "p", "(Lmw0/b;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljw0/d;", "x", "Lmw0/e;", "", "y", "I", "n", "()I", "setSleepId", "(I)V", "sleepId", "", "z", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "q", "(Ljava/lang/String;)V", "sleepIdV2", "Lec3/o1;", "E", "Lec3/o1;", "eventFlow", "Lmw0/d;", "F", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25975c extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C21986d interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C25977e viewStateReducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private int sleepId;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private String sleepIdV2;

    /* JADX INFO: renamed from: mw0.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.sleep.presentation.SleepDetailsDialogViewModel$sendViewEvent$1", m100430f = "SleepDetailsDialogViewModel.kt", m100431l = {35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f102549w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC25974b f102551y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC25974b abstractC25974b, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f102551y = abstractC25974b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25975c.this.new a(this.f102551y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f102549w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C25975c.this.eventFlow;
                AbstractC25974b abstractC25974b = this.f102551y;
                this.f102549w = 1;
                if (interfaceC13072o1.emit(abstractC25974b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: mw0.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.sleep.presentation.SleepDetailsDialogViewModel$special$$inlined$transform$1", m100430f = "SleepDetailsDialogViewModel.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"R", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f102552w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f102553x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13058l f102554y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C25975c f102555z;

        /* JADX INFO: renamed from: mw0.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f102556w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C25975c f102557x;

            /* JADX INFO: renamed from: mw0.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.core.details.sleep.presentation.SleepDetailsDialogViewModel$special$$inlined$transform$1$1", m100430f = "SleepDetailsDialogViewModel.kt", m100431l = {39, 39}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42027a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f102558E;

                /* JADX INFO: renamed from: F */
                Object f102559F;

                /* JADX INFO: renamed from: G */
                Object f102560G;

                /* JADX INFO: renamed from: H */
                int f102561H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f102562w;

                /* JADX INFO: renamed from: x */
                int f102563x;

                /* JADX INFO: renamed from: z */
                Object f102565z;

                public C42027a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f102562w = obj;
                    this.f102563x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C25975c c25975c) {
                this.f102557x = c25975c;
                this.f102556w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
            
                if (((ec3.InterfaceC13058l) r9).collect(r4, r0) == r1) goto L22;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r8, q83.InterfaceC30057d<? super l83.C23454a0> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof mw0.C25975c.b.a.C42027a
                    if (r0 == 0) goto L13
                    r0 = r9
                    mw0.c$b$a$a r0 = (mw0.C25975c.b.a.C42027a) r0
                    int r1 = r0.f102563x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f102563x = r1
                    goto L18
                L13:
                    mw0.c$b$a$a r0 = new mw0.c$b$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f102562w
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r0.f102563x
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L51
                    if (r2 == r4) goto L3f
                    if (r2 != r3) goto L37
                    java.lang.Object r8 = r0.f102560G
                    ec3.m r8 = (ec3.InterfaceC13062m) r8
                    java.lang.Object r8 = r0.f102559F
                    mw0.b r8 = (mw0.AbstractC25974b) r8
                    java.lang.Object r8 = r0.f102558E
                    q83.d r8 = (q83.InterfaceC30057d) r8
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L8b
                L37:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3f:
                    int r8 = r0.f102561H
                    java.lang.Object r2 = r0.f102560G
                    ec3.m r2 = (ec3.InterfaceC13062m) r2
                    java.lang.Object r4 = r0.f102559F
                    mw0.b r4 = (mw0.AbstractC25974b) r4
                    java.lang.Object r4 = r0.f102558E
                    q83.d r4 = (q83.InterfaceC30057d) r4
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L6f
                L51:
                    p505ts.AbstractC34132o.m107864I(r9)
                    ec3.m r2 = r7.f102556w
                    mw0.b r8 = (mw0.AbstractC25974b) r8
                    mw0.c r9 = r7.f102557x
                    r0.f102565z = r5
                    r0.f102558E = r5
                    r0.f102559F = r5
                    r0.f102560G = r2
                    r6 = 0
                    r0.f102561H = r6
                    r0.f102563x = r4
                    java.lang.Object r9 = mw0.C25975c.m76995l(r9, r8, r0)
                    if (r9 != r1) goto L6e
                    goto L8a
                L6e:
                    r8 = r6
                L6f:
                    ec3.l r9 = (ec3.InterfaceC13058l) r9
                    mw0.c$c r4 = new mw0.c$c
                    mw0.c r6 = r7.f102557x
                    r4.<init>(r2, r6)
                    r0.f102565z = r5
                    r0.f102558E = r5
                    r0.f102559F = r5
                    r0.f102560G = r5
                    r0.f102561H = r8
                    r0.f102563x = r3
                    java.lang.Object r8 = r9.collect(r4, r0)
                    if (r8 != r1) goto L8b
                L8a:
                    return r1
                L8b:
                    l83.a0 r8 = l83.C23454a0.f92919a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: mw0.C25975c.b.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d, C25975c c25975c) {
            super(2, interfaceC30057d);
            this.f102554y = interfaceC13058l;
            this.f102555z = c25975c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f102554y, interfaceC30057d, this.f102555z);
            bVar.f102553x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f102552w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f102553x;
                InterfaceC13058l interfaceC13058l = this.f102554y;
                a aVar = new a(interfaceC13062m, this.f102555z);
                this.f102553x = null;
                this.f102552w = 1;
                if (interfaceC13058l.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: mw0.c$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c<T> implements InterfaceC13062m {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13062m f102566w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C25975c f102567x;

        public c(InterfaceC13062m interfaceC13062m, C25975c c25975c) {
            this.f102566w = interfaceC13062m;
            this.f102567x = c25975c;
        }

        @Override // ec3.InterfaceC13062m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object emit(AbstractC21985c abstractC21985c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            Object objEmit = this.f102566w.emit(this.f102567x.viewStateReducer.m77013a(abstractC21985c), interfaceC30057d);
            return objEmit == EnumC31071a.f128113w ? objEmit : C23454a0.f92919a;
        }
    }

    public C25975c(C21986d interactor, C25977e viewStateReducer) {
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        this.interactor = interactor;
        this.viewStateReducer = viewStateReducer;
        this.sleepId = -1;
        this.sleepIdV2 = "";
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new C13084s1(new b(c13096w1M36592b, null, this)), AbstractC1640x1.m5043b(this), C13105z1.f45288a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final Object m76996r(AbstractC25974b abstractC25974b, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        return this.interactor.m62782g(abstractC25974b, interfaceC30057d);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getSleepId() {
        return this.sleepId;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getSleepIdV2() {
        return this.sleepIdV2;
    }

    /* JADX INFO: renamed from: p */
    public final InterfaceC3027k1 m76999p(AbstractC25974b viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new a(viewEvent, null), 3);
    }

    /* JADX INFO: renamed from: q */
    public final void m77000q(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.sleepIdV2 = str;
    }
}
