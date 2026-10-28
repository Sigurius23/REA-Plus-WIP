package jh2;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ch2.AbstractC4668a;
import dh2.AbstractC12049b;
import dh2.C12051d;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import fh2.C14491a;
import fh2.C14492b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
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

/* JADX INFO: renamed from: jh2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011*\b\u0012\u0004\u0012\u00020\u000e0\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011*\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011*\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00120$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00180\u00118\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00150\u00118\u0006¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+¨\u00060"}, m65681d2 = {"Ljh2/a;", "Landroidx/lifecycle/w1;", "Ldh2/d;", "interactor", "Lfh2/b;", "viewStateReducer", "Lfh2/a;", "navigationReducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Ldh2/d;Lfh2/b;Lfh2/a;Lbc3/c0;)V", "Lch2/a;", "viewEvent", "Ldh2/b;", "r", "(Lch2/a;)Ldh2/b;", "Lec3/l;", "Ldh2/c;", "n", "(Lec3/l;Ldh2/d;)Lec3/l;", "Lcom/whoop/stealthmode/view/a;", "o", "(Lec3/l;Lfh2/a;)Lec3/l;", "Lhh2/g;", "p", "(Lec3/l;Lfh2/b;)Lec3/l;", "Lbc3/k1;", "q", "(Lch2/a;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Lec3/o1;", "x", "Lec3/o1;", "eventFlow", "Lec3/t1;", "y", "Lec3/t1;", "domainState", "z", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "E", "l", "navigationEvent", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21699a extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l navigationEvent;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13087t1 domainState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: jh2.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stealthmode.viewmodel.StealthModeViewModel$domainState$1", m100430f = "StealthModeViewModel.kt", m100431l = {33}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lch2/a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f83307w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f83308x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f83308x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f83308x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f83307w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC4668a.a aVar = AbstractC4668a.a.f19112a;
                this.f83308x = null;
                this.f83307w = 1;
                if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: jh2.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stealthmode.viewmodel.StealthModeViewModel$sendViewEvent$1", m100430f = "StealthModeViewModel.kt", m100431l = {48}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f83309w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC4668a f83311y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC4668a abstractC4668a, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f83311y = abstractC4668a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21699a.this.new b(this.f83311y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f83309w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C21699a.this.eventFlow;
                AbstractC4668a abstractC4668a = this.f83311y;
                this.f83309w = 1;
                if (interfaceC13072o1.emit(abstractC4668a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: jh2.a$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f83312w;

        /* JADX INFO: renamed from: jh2.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f83313w;

            /* JADX INFO: renamed from: jh2.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.stealthmode.viewmodel.StealthModeViewModel$special$$inlined$filter$1$2", m100430f = "StealthModeViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41844a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f83314E;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f83315w;

                /* JADX INFO: renamed from: x */
                int f83316x;

                /* JADX INFO: renamed from: y */
                Object f83317y;

                public C41844a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f83315w = obj;
                    this.f83316x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f83313w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41844a c41844a;
                if (interfaceC30057d instanceof C41844a) {
                    c41844a = (C41844a) interfaceC30057d;
                    int i13 = c41844a.f83316x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41844a.f83316x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41844a = new C41844a(interfaceC30057d);
                    }
                } else {
                    c41844a = new C41844a(interfaceC30057d);
                }
                Object obj2 = c41844a.f83315w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41844a.f83316x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public c(InterfaceC13058l interfaceC13058l) {
            this.f83312w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f83312w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jh2.a$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f83319w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C21699a f83320x;

        /* JADX INFO: renamed from: jh2.a$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f83321w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C21699a f83322x;

            /* JADX INFO: renamed from: jh2.a$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.stealthmode.viewmodel.StealthModeViewModel$special$$inlined$map$1$2", m100430f = "StealthModeViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41845a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f83323E;

                /* JADX INFO: renamed from: F */
                Object f83324F;

                /* JADX INFO: renamed from: G */
                Object f83325G;

                /* JADX INFO: renamed from: H */
                int f83326H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f83327w;

                /* JADX INFO: renamed from: x */
                int f83328x;

                /* JADX INFO: renamed from: y */
                Object f83329y;

                public C41845a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f83327w = obj;
                    this.f83328x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C21699a c21699a) {
                this.f83321w = interfaceC13062m;
                this.f83322x = c21699a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41845a c41845a;
                if (interfaceC30057d instanceof C41845a) {
                    c41845a = (C41845a) interfaceC30057d;
                    int i13 = c41845a.f83328x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41845a.f83328x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41845a = new C41845a(interfaceC30057d);
                    }
                } else {
                    c41845a = new C41845a(interfaceC30057d);
                }
                Object obj2 = c41845a.f83327w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41845a.f83328x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f83321w;
                    AbstractC12049b abstractC12049bM61123r = this.f83322x.m61123r((AbstractC4668a) obj);
                    c41845a.f83329y = null;
                    c41845a.f83323E = null;
                    c41845a.f83324F = null;
                    c41845a.f83325G = null;
                    c41845a.f83326H = 0;
                    c41845a.f83328x = 1;
                    if (interfaceC13062m.emit(abstractC12049bM61123r, c41845a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C21699a c21699a) {
            this.f83319w = interfaceC13058l;
            this.f83320x = c21699a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f83319w.collect(new a(interfaceC13062m, this.f83320x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21699a(C12051d interactor, C14492b viewStateReducer, C14491a navigationReducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(navigationReducer, "navigationReducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(m61120n(new d(new C13015a0(new a(null), c13096w1M36592b), this), interactor), coroutineScope, C13105z1.f45288a, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = m61122p(c13078q1M36586L, viewStateReducer);
        this.navigationEvent = m61121o(new c(c13078q1M36586L), navigationReducer);
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC13058l m61120n(InterfaceC13058l interfaceC13058l, C12051d c12051d) {
        return c12051d.m33221n(interfaceC13058l);
    }

    /* JADX INFO: renamed from: o */
    private final InterfaceC13058l m61121o(InterfaceC13058l interfaceC13058l, C14491a c14491a) {
        return c14491a.m41398a(interfaceC13058l);
    }

    /* JADX INFO: renamed from: p */
    private final InterfaceC13058l m61122p(InterfaceC13058l interfaceC13058l, C14492b c14492b) {
        return c14492b.m41403c(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final AbstractC12049b m61123r(AbstractC4668a viewEvent) {
        if (viewEvent instanceof AbstractC4668a.a) {
            return AbstractC12049b.a.f39890a;
        }
        if (viewEvent instanceof AbstractC4668a.d) {
            return new AbstractC12049b.d(((AbstractC4668a.d) viewEvent).getIsStealthModeOn());
        }
        if (viewEvent instanceof AbstractC4668a.b) {
            return new AbstractC12049b.c(((AbstractC4668a.b) viewEvent).getIsStealthModeOn());
        }
        if (!(viewEvent instanceof AbstractC4668a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC4668a.c cVar = (AbstractC4668a.c) viewEvent;
        return new AbstractC12049b.e(cVar.getMetricType(), cVar.getIsMetricHidden());
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final InterfaceC13058l getNavigationEvent() {
        return this.navigationEvent;
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC3027k1 m61125q(AbstractC4668a viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(viewEvent, null), 3);
    }

    public /* synthetic */ C21699a(C12051d c12051d, C14492b c14492b, C14491a c14491a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12051d, c14492b, c14491a, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
