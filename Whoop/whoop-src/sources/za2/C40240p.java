package za2;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13021b2;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import od1.AbstractC27845h;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: za2.p */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020$0\u001f8\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010'R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020)0\u001f8\u0006¢\u0006\f\n\u0004\b*\u0010\"\u001a\u0004\b+\u0010'¨\u0006-"}, m65681d2 = {"Lza2/p;", "Landroidx/lifecycle/w1;", "Lza2/d;", "combiner", "Lza2/r;", "viewStateReducer", "Lbc3/c0;", "scope", "<init>", "(Lza2/d;Lza2/r;Lbc3/c0;)V", "Lza2/o;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Lza2/o;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lza2/r;", "x", "Lbc3/c0;", "getScope", "()Lbc3/c0;", "Ltr2/n;", "y", "Ltr2/n;", "getLogger", "()Ltr2/n;", "logger", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lec3/l;", "Lza2/e;", "E", "Lec3/l;", "output", "Lza2/q;", "F", "getViewState", "()Lec3/l;", "viewState", "Lza2/g;", "G", "l", "effects", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40240p extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l output;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l effects;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C40242r viewStateReducer;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: za2.p$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerViewModel$output$1", m100430f = "SettingsBannerViewModel.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lza2/o;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f173976w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f173977x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f173977x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f173977x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f173976w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC40239o.g gVar = AbstractC40239o.g.f173968a;
                this.f173977x = null;
                this.f173976w = 1;
                if (interfaceC13062m.emit(gVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: za2.p$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerViewModel$sendEvent$1", m100430f = "SettingsBannerViewModel.kt", m100431l = {53}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f173978w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC40239o f173980y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC40239o abstractC40239o, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f173980y = abstractC40239o;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C40240p.this.new b(this.f173980y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f173978w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C40240p.this.eventFlow;
                AbstractC40239o abstractC40239o = this.f173980y;
                this.f173978w = 1;
                if (interfaceC13072o1.emit(abstractC40239o, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: za2.p$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f173981w;

        /* JADX INFO: renamed from: za2.p$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f173982w;

            /* JADX INFO: renamed from: za2.p$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerViewModel$special$$inlined$filterIsInstance$1$2", m100430f = "SettingsBannerViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42736a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f173984F;

                /* JADX INFO: renamed from: G */
                Object f173985G;

                /* JADX INFO: renamed from: H */
                int f173986H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f173987w;

                /* JADX INFO: renamed from: x */
                int f173988x;

                /* JADX INFO: renamed from: y */
                Object f173989y;

                /* JADX INFO: renamed from: z */
                Object f173990z;

                public C42736a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f173987w = obj;
                    this.f173988x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f173982w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42736a c42736a;
                if (interfaceC30057d instanceof C42736a) {
                    c42736a = (C42736a) interfaceC30057d;
                    int i13 = c42736a.f173988x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42736a.f173988x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42736a = new C42736a(interfaceC30057d);
                    }
                } else {
                    c42736a = new C42736a(interfaceC30057d);
                }
                Object obj2 = c42736a.f173987w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42736a.f173988x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f173982w;
                    if (obj instanceof InterfaceC40229e.b) {
                        c42736a.f173989y = null;
                        c42736a.f173990z = null;
                        c42736a.f173984F = null;
                        c42736a.f173985G = null;
                        c42736a.f173986H = 0;
                        c42736a.f173988x = 1;
                        if (interfaceC13062m.emit(obj, c42736a) == enumC31071a) {
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
            this.f173981w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f173981w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: za2.p$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f173991w;

        /* JADX INFO: renamed from: za2.p$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f173992w;

            /* JADX INFO: renamed from: za2.p$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerViewModel$special$$inlined$filterIsInstance$2$2", m100430f = "SettingsBannerViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42737a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f173994F;

                /* JADX INFO: renamed from: G */
                Object f173995G;

                /* JADX INFO: renamed from: H */
                int f173996H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f173997w;

                /* JADX INFO: renamed from: x */
                int f173998x;

                /* JADX INFO: renamed from: y */
                Object f173999y;

                /* JADX INFO: renamed from: z */
                Object f174000z;

                public C42737a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f173997w = obj;
                    this.f173998x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f173992w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42737a c42737a;
                if (interfaceC30057d instanceof C42737a) {
                    c42737a = (C42737a) interfaceC30057d;
                    int i13 = c42737a.f173998x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42737a.f173998x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42737a = new C42737a(interfaceC30057d);
                    }
                } else {
                    c42737a = new C42737a(interfaceC30057d);
                }
                Object obj2 = c42737a.f173997w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42737a.f173998x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f173992w;
                    if (obj instanceof InterfaceC40229e.a) {
                        c42737a.f173999y = null;
                        c42737a.f174000z = null;
                        c42737a.f173994F = null;
                        c42737a.f173995G = null;
                        c42737a.f173996H = 0;
                        c42737a.f173998x = 1;
                        if (interfaceC13062m.emit(obj, c42737a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l) {
            this.f173991w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f173991w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: za2.p$e */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f174001w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C40240p f174002x;

        /* JADX INFO: renamed from: za2.p$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f174003w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C40240p f174004x;

            /* JADX INFO: renamed from: za2.p$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerViewModel$special$$inlined$map$1$2", m100430f = "SettingsBannerViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42738a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f174005E;

                /* JADX INFO: renamed from: F */
                Object f174006F;

                /* JADX INFO: renamed from: G */
                Object f174007G;

                /* JADX INFO: renamed from: H */
                int f174008H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f174009w;

                /* JADX INFO: renamed from: x */
                int f174010x;

                /* JADX INFO: renamed from: y */
                Object f174011y;

                public C42738a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f174009w = obj;
                    this.f174010x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C40240p c40240p) {
                this.f174003w = interfaceC13062m;
                this.f174004x = c40240p;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42738a c42738a;
                if (interfaceC30057d instanceof C42738a) {
                    c42738a = (C42738a) interfaceC30057d;
                    int i13 = c42738a.f174010x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42738a.f174010x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42738a = new C42738a(interfaceC30057d);
                    }
                } else {
                    c42738a = new C42738a(interfaceC30057d);
                }
                Object obj2 = c42738a.f174009w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42738a.f174010x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f174003w;
                    C40241q c40241qM129244b = this.f174004x.viewStateReducer.m129244b(((InterfaceC40229e.b) obj).getState());
                    c42738a.f174011y = null;
                    c42738a.f174005E = null;
                    c42738a.f174006F = null;
                    c42738a.f174007G = null;
                    c42738a.f174008H = 0;
                    c42738a.f174010x = 1;
                    if (interfaceC13062m.emit(c40241qM129244b, c42738a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l, C40240p c40240p) {
            this.f174001w = interfaceC13058l;
            this.f174002x = c40240p;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f174001w.collect(new a(interfaceC13062m, this.f174002x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: za2.p$f */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f174013w;

        /* JADX INFO: renamed from: za2.p$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f174014w;

            /* JADX INFO: renamed from: za2.p$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.banner.SettingsBannerViewModel$special$$inlined$map$2$2", m100430f = "SettingsBannerViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42739a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f174015E;

                /* JADX INFO: renamed from: F */
                Object f174016F;

                /* JADX INFO: renamed from: G */
                Object f174017G;

                /* JADX INFO: renamed from: H */
                int f174018H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f174019w;

                /* JADX INFO: renamed from: x */
                int f174020x;

                /* JADX INFO: renamed from: y */
                Object f174021y;

                public C42739a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f174019w = obj;
                    this.f174020x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f174014w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42739a c42739a;
                if (interfaceC30057d instanceof C42739a) {
                    c42739a = (C42739a) interfaceC30057d;
                    int i13 = c42739a.f174020x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42739a.f174020x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42739a = new C42739a(interfaceC30057d);
                    }
                } else {
                    c42739a = new C42739a(interfaceC30057d);
                }
                Object obj2 = c42739a.f174019w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42739a.f174020x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f174014w;
                    InterfaceC40231g effect = ((InterfaceC40229e.a) obj).getEffect();
                    c42739a.f174021y = null;
                    c42739a.f174015E = null;
                    c42739a.f174016F = null;
                    c42739a.f174017G = null;
                    c42739a.f174018H = 0;
                    c42739a.f174020x = 1;
                    if (interfaceC13062m.emit(effect, c42739a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l) {
            this.f174013w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f174013w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40240p(C40228d combiner, C40242r viewStateReducer, InterfaceC2994c0 scope) {
        super(scope);
        AbstractC22676k.m65750j(combiner, "combiner");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(scope, "scope");
        this.viewStateReducer = viewStateReducer;
        this.scope = scope;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("SettingsBannerViewModel");
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM83945a = AbstractC27845h.m83945a(new C13015a0(new a(null), c13096w1M36592b), combiner);
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lM83945a, scope, c13021b2, 1);
        this.output = c13078q1M36586L;
        this.viewState = AbstractC13091v.m36586L(new e(new c(c13078q1M36586L), this), scope, c13021b2, 1);
        this.effects = AbstractC13091v.m36586L(new f(new d(c13078q1M36586L)), scope, c13021b2, 0);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final InterfaceC13058l getEffects() {
        return this.effects;
    }

    /* JADX INFO: renamed from: n */
    public final void m129236n(AbstractC40239o event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.scope, null, null, new b(event, null), 3);
    }

    public /* synthetic */ C40240p(C40228d c40228d, C40242r c40242r, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c40228d, c40242r, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
