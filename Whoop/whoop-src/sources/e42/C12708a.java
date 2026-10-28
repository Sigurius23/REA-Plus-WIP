package e42;

import androidx.lifecycle.AbstractC1637w1;
import b42.C2719a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import com.whoop.pregnancy.view.AbstractC9684a;
import ec3.AbstractC13091v;
import ec3.C13015a0;
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
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import y32.AbstractC39197a;
import z32.AbstractC40049a;
import z32.AbstractC40050b;
import z32.C40051c;

/* JADX INFO: renamed from: e42.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\b\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f*\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020(0\u000f8\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&¨\u0006,"}, m65681d2 = {"Le42/a;", "Landroidx/lifecycle/w1;", "Lz32/c;", "interactor", "Lb42/a;", "viewStateReducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lz32/c;Lb42/a;Lbc3/c0;)V", "Ly32/a;", "viewEvent", "Lz32/a;", "q", "(Ly32/a;)Lz32/a;", "Lec3/l;", "Lz32/b;", "n", "(Lec3/l;Lz32/c;)Lec3/l;", "Lc42/r;", "o", "(Lec3/l;Lb42/a;)Lec3/l;", "Lbc3/k1;", "p", "(Ly32/a;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Lec3/o1;", "x", "Lec3/o1;", "eventFlow", "Lec3/t1;", "y", "Lec3/t1;", "domainState", "z", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "Lcom/whoop/pregnancy/view/a;", "E", "l", "navigationEvent", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12708a extends AbstractC1637w1 {

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

    /* JADX INFO: renamed from: e42.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.pregnancy.viewmodel.PregnancySettingsViewModel$domainState$1", m100430f = "PregnancySettingsViewModel.kt", m100431l = {32}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ly32/a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f43455w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f43456x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f43456x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f43456x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f43455w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC39197a.a aVar = AbstractC39197a.a.f168464a;
                this.f43456x = null;
                this.f43455w = 1;
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

    /* JADX INFO: renamed from: e42.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.pregnancy.viewmodel.PregnancySettingsViewModel$sendViewEvent$1", m100430f = "PregnancySettingsViewModel.kt", m100431l = {60}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f43457w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC39197a f43459y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC39197a abstractC39197a, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f43459y = abstractC39197a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12708a.this.new b(this.f43459y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f43457w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C12708a.this.eventFlow;
                AbstractC39197a abstractC39197a = this.f43459y;
                this.f43457w = 1;
                if (interfaceC13072o1.emit(abstractC39197a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: e42.a$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f43460w;

        /* JADX INFO: renamed from: e42.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f43461w;

            /* JADX INFO: renamed from: e42.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.pregnancy.viewmodel.PregnancySettingsViewModel$special$$inlined$filter$1$2", m100430f = "PregnancySettingsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41508a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f43463F;

                /* JADX INFO: renamed from: G */
                Object f43464G;

                /* JADX INFO: renamed from: H */
                int f43465H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f43466w;

                /* JADX INFO: renamed from: x */
                int f43467x;

                /* JADX INFO: renamed from: y */
                Object f43468y;

                /* JADX INFO: renamed from: z */
                Object f43469z;

                public C41508a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f43466w = obj;
                    this.f43467x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f43461w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41508a c41508a;
                if (interfaceC30057d instanceof C41508a) {
                    c41508a = (C41508a) interfaceC30057d;
                    int i13 = c41508a.f43467x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41508a.f43467x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41508a = new C41508a(interfaceC30057d);
                    }
                } else {
                    c41508a = new C41508a(interfaceC30057d);
                }
                Object obj2 = c41508a.f43466w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41508a.f43467x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f43461w;
                    AbstractC40050b abstractC40050b = (AbstractC40050b) obj;
                    if ((abstractC40050b instanceof AbstractC40050b.f) || (abstractC40050b instanceof AbstractC40050b.b) || (abstractC40050b instanceof AbstractC40050b.a) || (abstractC40050b instanceof AbstractC40050b.d)) {
                        c41508a.f43468y = null;
                        c41508a.f43469z = null;
                        c41508a.f43463F = null;
                        c41508a.f43464G = null;
                        c41508a.f43465H = 0;
                        c41508a.f43467x = 1;
                        if (interfaceC13062m.emit(obj, c41508a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l) {
            this.f43460w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f43460w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: e42.a$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f43470w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12708a f43471x;

        /* JADX INFO: renamed from: e42.a$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f43472w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C12708a f43473x;

            /* JADX INFO: renamed from: e42.a$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.pregnancy.viewmodel.PregnancySettingsViewModel$special$$inlined$map$1$2", m100430f = "PregnancySettingsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41509a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f43474E;

                /* JADX INFO: renamed from: F */
                Object f43475F;

                /* JADX INFO: renamed from: G */
                Object f43476G;

                /* JADX INFO: renamed from: H */
                int f43477H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f43478w;

                /* JADX INFO: renamed from: x */
                int f43479x;

                /* JADX INFO: renamed from: y */
                Object f43480y;

                public C41509a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f43478w = obj;
                    this.f43479x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C12708a c12708a) {
                this.f43472w = interfaceC13062m;
                this.f43473x = c12708a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41509a c41509a;
                if (interfaceC30057d instanceof C41509a) {
                    c41509a = (C41509a) interfaceC30057d;
                    int i13 = c41509a.f43479x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41509a.f43479x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41509a = new C41509a(interfaceC30057d);
                    }
                } else {
                    c41509a = new C41509a(interfaceC30057d);
                }
                Object obj2 = c41509a.f43478w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41509a.f43479x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f43472w;
                    AbstractC40049a abstractC40049aM35555q = this.f43473x.m35555q((AbstractC39197a) obj);
                    c41509a.f43480y = null;
                    c41509a.f43474E = null;
                    c41509a.f43475F = null;
                    c41509a.f43476G = null;
                    c41509a.f43477H = 0;
                    c41509a.f43479x = 1;
                    if (interfaceC13062m.emit(abstractC40049aM35555q, c41509a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C12708a c12708a) {
            this.f43470w = interfaceC13058l;
            this.f43471x = c12708a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f43470w.collect(new a(interfaceC13062m, this.f43471x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: e42.a$e */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f43482w;

        /* JADX INFO: renamed from: e42.a$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f43483w;

            /* JADX INFO: renamed from: e42.a$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.pregnancy.viewmodel.PregnancySettingsViewModel$special$$inlined$map$2$2", m100430f = "PregnancySettingsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41510a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f43484E;

                /* JADX INFO: renamed from: F */
                Object f43485F;

                /* JADX INFO: renamed from: G */
                Object f43486G;

                /* JADX INFO: renamed from: H */
                int f43487H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f43488w;

                /* JADX INFO: renamed from: x */
                int f43489x;

                /* JADX INFO: renamed from: y */
                Object f43490y;

                public C41510a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f43488w = obj;
                    this.f43489x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f43483w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41510a c41510a;
                Object cVar;
                if (interfaceC30057d instanceof C41510a) {
                    c41510a = (C41510a) interfaceC30057d;
                    int i13 = c41510a.f43489x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41510a.f43489x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41510a = new C41510a(interfaceC30057d);
                    }
                } else {
                    c41510a = new C41510a(interfaceC30057d);
                }
                Object obj2 = c41510a.f43488w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41510a.f43489x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f43483w;
                    AbstractC40050b abstractC40050b = (AbstractC40050b) obj;
                    if (abstractC40050b instanceof AbstractC40050b.a) {
                        cVar = new AbstractC9684a.c("ONBOARDING_WELCOME", false, 2, null);
                    } else if (abstractC40050b instanceof AbstractC40050b.b) {
                        cVar = new AbstractC9684a.c("SETTINGS_EXIT", false, 2, null);
                    } else if (abstractC40050b instanceof AbstractC40050b.d) {
                        cVar = new AbstractC9684a.c("ONBOARDING_SAVED", false, 2, null);
                    } else {
                        if (!(abstractC40050b instanceof AbstractC40050b.f)) {
                            throw new IllegalStateException("Cannot navigate from domain state " + abstractC40050b);
                        }
                        cVar = AbstractC9684a.g.f28318a;
                    }
                    c41510a.f43490y = null;
                    c41510a.f43484E = null;
                    c41510a.f43485F = null;
                    c41510a.f43486G = null;
                    c41510a.f43487H = 0;
                    c41510a.f43489x = 1;
                    if (interfaceC13062m.emit(cVar, c41510a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l) {
            this.f43482w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f43482w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12708a(C40051c interactor, C2719a viewStateReducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(m35553n(new d(new C13015a0(new a(null), c13096w1M36592b), this), interactor), coroutineScope, C13105z1.f45288a, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = m35554o(c13078q1M36586L, viewStateReducer);
        this.navigationEvent = new e(new c(c13078q1M36586L));
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC13058l m35553n(InterfaceC13058l interfaceC13058l, C40051c c40051c) {
        return c40051c.m128393h(interfaceC13058l);
    }

    /* JADX INFO: renamed from: o */
    private final InterfaceC13058l m35554o(InterfaceC13058l interfaceC13058l, C2719a c2719a) {
        return c2719a.m7672e(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final AbstractC40049a m35555q(AbstractC39197a viewEvent) {
        if (viewEvent instanceof AbstractC39197a.a) {
            return AbstractC40049a.a.f172776a;
        }
        if (viewEvent instanceof AbstractC39197a.b) {
            return new AbstractC40049a.b(((AbstractC39197a.b) viewEvent).getIsCurrentlyEnabled());
        }
        if (!(viewEvent instanceof AbstractC39197a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC39197a.c cVar = (AbstractC39197a.c) viewEvent;
        return new AbstractC40049a.c(cVar.getDueDate(), cVar.getFromOnboarding());
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final InterfaceC13058l getNavigationEvent() {
        return this.navigationEvent;
    }

    /* JADX INFO: renamed from: p */
    public final InterfaceC3027k1 m35557p(AbstractC39197a viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(viewEvent, null), 3);
    }

    public /* synthetic */ C12708a(C40051c c40051c, C2719a c2719a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c40051c, c2719a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
