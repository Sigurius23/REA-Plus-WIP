package dg2;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bg2.AbstractC3230c;
import bg2.AbstractC3233f;
import bg2.AbstractC3235h;
import bg2.AbstractC3236i;
import bg2.C3231d;
import bg2.C3234g;
import bg2.InterfaceC3232e;
import c93.InterfaceC4351m;
import dc3.C11923h;
import dc3.InterfaceC11927l;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13052j1;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: dg2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001a8\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\"R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020%0)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, m65681d2 = {"Ldg2/a;", "Landroidx/lifecycle/w1;", "Lbg2/g;", "interactor", "Ldg2/c;", "reducer", "Lbc3/c0;", "coroutineScope", "stateInScope", "<init>", "(Lbg2/g;Ldg2/c;Lbc3/c0;Lbc3/c0;)V", "Lbg2/h;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "p", "(Lbg2/h;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbg2/g;", "x", "Ldg2/c;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "viewEvents", "Lec3/t1;", "Lbg2/d;", "E", "Lec3/t1;", "domainStates", "Ldg2/b;", "F", "o", "()Lec3/t1;", "viewState", "Ldc3/l;", "Lbg2/e;", "G", "Ldc3/l;", "_effects", "Lec3/l;", "H", "Lec3/l;", "n", "()Lec3/l;", "effects", "sms_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12009a extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13087t1 domainStates;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13087t1 viewState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC11927l _effects;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13058l effects;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C3234g interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C12011c reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 viewEvents;

    /* JADX INFO: renamed from: dg2.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sms.setup.presentation.SmsSetupViewModel$2", m100430f = "SmsSetupViewModel.kt", m100431l = {47}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbg2/e;", "it", "Ll83/a0;", "<anonymous>", "(Lbg2/e;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f39688w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f39689x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C12009a.this.new a(interfaceC30057d);
            aVar.f39689x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC3232e interfaceC3232e, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC3232e, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC3232e interfaceC3232e = (InterfaceC3232e) this.f39689x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f39688w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC11927l interfaceC11927l = C12009a.this._effects;
                this.f39689x = null;
                this.f39688w = 1;
                if (interfaceC11927l.mo32219t(interfaceC3232e, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: dg2.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sms.setup.presentation.SmsSetupViewModel$onViewEvent$1", m100430f = "SmsSetupViewModel.kt", m100431l = {53}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f39691w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC3235h f39693y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC3235h abstractC3235h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f39693y = abstractC3235h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12009a.this.new b(this.f39693y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f39691w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C12009a.this.viewEvents;
                AbstractC3235h abstractC3235h = this.f39693y;
                this.f39691w = 1;
                if (interfaceC13072o1.emit(abstractC3235h, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: dg2.a$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f39694w;

        /* JADX INFO: renamed from: dg2.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f39695w;

            /* JADX INFO: renamed from: dg2.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.sms.setup.presentation.SmsSetupViewModel$special$$inlined$map$1$2", m100430f = "SmsSetupViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41470a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f39696E;

                /* JADX INFO: renamed from: F */
                Object f39697F;

                /* JADX INFO: renamed from: G */
                Object f39698G;

                /* JADX INFO: renamed from: H */
                int f39699H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f39700w;

                /* JADX INFO: renamed from: x */
                int f39701x;

                /* JADX INFO: renamed from: y */
                Object f39702y;

                public C41470a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f39700w = obj;
                    this.f39701x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f39695w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41470a c41470a;
                if (interfaceC30057d instanceof C41470a) {
                    c41470a = (C41470a) interfaceC30057d;
                    int i13 = c41470a.f39701x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41470a.f39701x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41470a = new C41470a(interfaceC30057d);
                    }
                } else {
                    c41470a = new C41470a(interfaceC30057d);
                }
                Object obj2 = c41470a.f39700w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41470a.f39701x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f39695w;
                    AbstractC3230c abstractC3230cM9377a = AbstractC3236i.m9377a((AbstractC3235h) obj);
                    c41470a.f39702y = null;
                    c41470a.f39696E = null;
                    c41470a.f39697F = null;
                    c41470a.f39698G = null;
                    c41470a.f39699H = 0;
                    c41470a.f39701x = 1;
                    if (interfaceC13062m.emit(abstractC3230cM9377a, c41470a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l) {
            this.f39694w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f39694w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dg2.a$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f39704w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12009a f39705x;

        /* JADX INFO: renamed from: dg2.a$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f39706w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C12009a f39707x;

            /* JADX INFO: renamed from: dg2.a$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.sms.setup.presentation.SmsSetupViewModel$special$$inlined$map$2$2", m100430f = "SmsSetupViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41471a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f39708E;

                /* JADX INFO: renamed from: F */
                Object f39709F;

                /* JADX INFO: renamed from: G */
                Object f39710G;

                /* JADX INFO: renamed from: H */
                int f39711H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f39712w;

                /* JADX INFO: renamed from: x */
                int f39713x;

                /* JADX INFO: renamed from: y */
                Object f39714y;

                public C41471a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f39712w = obj;
                    this.f39713x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C12009a c12009a) {
                this.f39706w = interfaceC13062m;
                this.f39707x = c12009a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41471a c41471a;
                if (interfaceC30057d instanceof C41471a) {
                    c41471a = (C41471a) interfaceC30057d;
                    int i13 = c41471a.f39713x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41471a.f39713x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41471a = new C41471a(interfaceC30057d);
                    }
                } else {
                    c41471a = new C41471a(interfaceC30057d);
                }
                Object obj2 = c41471a.f39712w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41471a.f39713x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f39706w;
                    C12010b c12010bM33145c = this.f39707x.reducer.m33145c((C3231d) obj);
                    c41471a.f39714y = null;
                    c41471a.f39708E = null;
                    c41471a.f39709F = null;
                    c41471a.f39710G = null;
                    c41471a.f39711H = 0;
                    c41471a.f39713x = 1;
                    if (interfaceC13062m.emit(c12010bM33145c, c41471a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C12009a c12009a) {
            this.f39704w = interfaceC13058l;
            this.f39705x = c12009a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f39704w.collect(new a(interfaceC13062m, this.f39705x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dg2.a$e */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f39716w;

        /* JADX INFO: renamed from: dg2.a$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f39717w;

            /* JADX INFO: renamed from: dg2.a$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.sms.setup.presentation.SmsSetupViewModel$special$$inlined$mapNotNull$1$2", m100430f = "SmsSetupViewModel.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41472a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f39718E;

                /* JADX INFO: renamed from: F */
                Object f39719F;

                /* JADX INFO: renamed from: G */
                Object f39720G;

                /* JADX INFO: renamed from: H */
                Object f39721H;

                /* JADX INFO: renamed from: I */
                int f39722I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f39723w;

                /* JADX INFO: renamed from: x */
                int f39724x;

                /* JADX INFO: renamed from: y */
                Object f39725y;

                public C41472a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f39723w = obj;
                    this.f39724x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f39717w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41472a c41472a;
                if (interfaceC30057d instanceof C41472a) {
                    c41472a = (C41472a) interfaceC30057d;
                    int i13 = c41472a.f39724x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41472a.f39724x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41472a = new C41472a(interfaceC30057d);
                    }
                } else {
                    c41472a = new C41472a(interfaceC30057d);
                }
                Object obj2 = c41472a.f39723w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41472a.f39724x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f39717w;
                    InterfaceC3232e interfaceC3232eM9355a = AbstractC3233f.m9355a((C3231d) obj);
                    if (interfaceC3232eM9355a != null) {
                        c41472a.f39725y = null;
                        c41472a.f39718E = null;
                        c41472a.f39719F = null;
                        c41472a.f39720G = null;
                        c41472a.f39721H = null;
                        c41472a.f39722I = 0;
                        c41472a.f39724x = 1;
                        if (interfaceC13062m.emit(interfaceC3232eM9355a, c41472a) == enumC31071a) {
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
            this.f39716w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f39716w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12009a(C3234g interactor, C12011c reducer, InterfaceC2994c0 coroutineScope, InterfaceC2994c0 stateInScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(stateInScope, "stateInScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.viewEvents = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM9372j = interactor.m9372j(new c(c13096w1M36592b));
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lM9372j, stateInScope, c13021b2, 1);
        this.domainStates = c13078q1M36586L;
        this.viewState = AbstractC13091v.m36586L(new d(c13078q1M36586L, this), stateInScope, c13021b2, 1);
        C11923h c11923hM92111d = AbstractC30060g.m92111d(-2, 6, null);
        this._effects = c11923hM92111d;
        this.effects = AbstractC13091v.m36585K(c11923hM92111d);
        AbstractC13091v.m36582H(new C13052j1(new e(c13078q1M36586L), new a(null), 0), stateInScope);
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC13058l getEffects() {
        return this.effects;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final InterfaceC13087t1 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: p */
    public final void m33127p(AbstractC3235h event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(event, null), 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C12009a(C3234g c3234g, C12011c c12011c, InterfaceC2994c0 interfaceC2994c0, InterfaceC2994c0 interfaceC2994c1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        interfaceC2994c0 = (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0;
        this(c3234g, c12011c, interfaceC2994c0, (i13 & 8) != 0 ? interfaceC2994c0 : interfaceC2994c1);
    }
}
