package b03;

import a03.C0100c;
import a03.InterfaceC0098a;
import a03.InterfaceC0101d;
import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c03.C3814b;
import c03.C3815c;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import l83.C23454a0;
import ld1.AbstractC23864c;
import od1.AbstractC27845h;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: b03.f */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m65681d2 = {"Lb03/f;", "Lld1/c;", "Lc03/c;", "Lb03/e;", "La03/c;", "interactor", "Lc03/b;", "reducer", "Lbc3/c0;", "closeableCoroutineScope", "<init>", "(La03/c;Lc03/b;Lbc3/c0;)V", NotificationCompat.CATEGORY_EVENT, "La03/a;", "o", "(Lb03/e;)La03/a;", "Ll83/a0;", "n", "(Lb03/e;)V", "x", "Lbc3/c0;", "Lec3/o1;", "y", "Lec3/o1;", "eventFlow", "Lec3/l;", "La03/d;", "z", "Lec3/l;", "domainState", "E", "getViewState", "()Lec3/l;", "viewState", "whoop-status_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C2209f extends AbstractC23864c<C3815c, InterfaceC2208e> {

    /* JADX INFO: renamed from: F */
    public static final int f8791F = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 closeableCoroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: b03.f$a */
    @InterfaceC32271e(m100429c = "com.whoop.whoopstatus.presentation.WhoopStatusViewModel$sendViewEvent$1", m100430f = "WhoopStatusViewModel.kt", m100431l = {42}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f8796w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC2208e f8798y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2208e interfaceC2208e, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f8798y = interfaceC2208e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C2209f.this.new a(this.f8798y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f8796w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C2209f.this.eventFlow;
                InterfaceC2208e interfaceC2208e = this.f8798y;
                this.f8796w = 1;
                if (interfaceC13072o1.emit(interfaceC2208e, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: b03.f$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f8799w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C2209f f8800x;

        /* JADX INFO: renamed from: b03.f$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f8801w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C2209f f8802x;

            /* JADX INFO: renamed from: b03.f$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.whoopstatus.presentation.WhoopStatusViewModel$special$$inlined$map$1$2", m100430f = "WhoopStatusViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41295a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f8803E;

                /* JADX INFO: renamed from: F */
                Object f8804F;

                /* JADX INFO: renamed from: G */
                Object f8805G;

                /* JADX INFO: renamed from: H */
                int f8806H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f8807w;

                /* JADX INFO: renamed from: x */
                int f8808x;

                /* JADX INFO: renamed from: y */
                Object f8809y;

                public C41295a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f8807w = obj;
                    this.f8808x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C2209f c2209f) {
                this.f8801w = interfaceC13062m;
                this.f8802x = c2209f;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41295a c41295a;
                if (interfaceC30057d instanceof C41295a) {
                    c41295a = (C41295a) interfaceC30057d;
                    int i13 = c41295a.f8808x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41295a.f8808x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41295a = new C41295a(interfaceC30057d);
                    }
                } else {
                    c41295a = new C41295a(interfaceC30057d);
                }
                Object obj2 = c41295a.f8807w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41295a.f8808x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f8801w;
                    InterfaceC0098a interfaceC0098aM7047o = this.f8802x.m7047o((InterfaceC2208e) obj);
                    c41295a.f8809y = null;
                    c41295a.f8803E = null;
                    c41295a.f8804F = null;
                    c41295a.f8805G = null;
                    c41295a.f8806H = 0;
                    c41295a.f8808x = 1;
                    if (interfaceC13062m.emit(interfaceC0098aM7047o, c41295a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C2209f c2209f) {
            this.f8799w = interfaceC13058l;
            this.f8800x = c2209f;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f8799w.collect(new a(interfaceC13062m, this.f8800x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b03.f$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f8811w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C3814b f8812x;

        /* JADX INFO: renamed from: b03.f$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f8813w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C3814b f8814x;

            /* JADX INFO: renamed from: b03.f$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.whoopstatus.presentation.WhoopStatusViewModel$special$$inlined$map$2$2", m100430f = "WhoopStatusViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41296a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f8815E;

                /* JADX INFO: renamed from: F */
                Object f8816F;

                /* JADX INFO: renamed from: G */
                Object f8817G;

                /* JADX INFO: renamed from: H */
                int f8818H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f8819w;

                /* JADX INFO: renamed from: x */
                int f8820x;

                /* JADX INFO: renamed from: y */
                Object f8821y;

                public C41296a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f8819w = obj;
                    this.f8820x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C3814b c3814b) {
                this.f8813w = interfaceC13062m;
                this.f8814x = c3814b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41296a c41296a;
                if (interfaceC30057d instanceof C41296a) {
                    c41296a = (C41296a) interfaceC30057d;
                    int i13 = c41296a.f8820x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41296a.f8820x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41296a = new C41296a(interfaceC30057d);
                    }
                } else {
                    c41296a = new C41296a(interfaceC30057d);
                }
                Object obj2 = c41296a.f8819w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41296a.f8820x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f8813w;
                    C3815c c3815cM11683b = this.f8814x.m11683b((InterfaceC0101d) obj);
                    c41296a.f8821y = null;
                    c41296a.f8815E = null;
                    c41296a.f8816F = null;
                    c41296a.f8817G = null;
                    c41296a.f8818H = 0;
                    c41296a.f8820x = 1;
                    if (interfaceC13062m.emit(c3815cM11683b, c41296a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C3814b c3814b) {
            this.f8811w = interfaceC13058l;
            this.f8812x = c3814b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f8811w.collect(new a(interfaceC13062m, this.f8812x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2209f(C0100c interactor, C3814b reducer, InterfaceC2994c0 closeableCoroutineScope) {
        super(closeableCoroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(closeableCoroutineScope, "closeableCoroutineScope");
        this.closeableCoroutineScope = closeableCoroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM83945a = AbstractC27845h.m83945a(new b(c13096w1M36592b, this), interactor);
        this.domainState = interfaceC13058lM83945a;
        this.viewState = AbstractC13091v.m36586L(new c(interfaceC13058lM83945a, reducer), closeableCoroutineScope, C13105z1.f45288a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final InterfaceC0098a m7047o(InterfaceC2208e event) {
        if (event instanceof InterfaceC2208e.b) {
            return new InterfaceC0098a.b(((InterfaceC2208e.b) event).getSource());
        }
        if (event instanceof InterfaceC2208e.a) {
            return new InterfaceC0098a.a(((InterfaceC2208e.a) event).getSource());
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ld1.AbstractC23864c
    public InterfaceC13058l getViewState() {
        return this.viewState;
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1216g(InterfaceC2208e event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.closeableCoroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C2209f(C0100c c0100c, C3814b c3814b, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0100c, c3814b, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
