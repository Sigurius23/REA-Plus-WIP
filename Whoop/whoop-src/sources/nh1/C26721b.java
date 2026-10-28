package nh1;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kh1.AbstractC22481b;
import kh1.C22482c;
import kh1.C22483d;
import l83.C23454a0;
import oh1.C27936a;
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

/* JADX INFO: renamed from: nh1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\n8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010&R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020(0\n8\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010&¨\u0006,"}, m65681d2 = {"Lnh1/b;", "Landroidx/lifecycle/w1;", "Lkh1/d;", "interactor", "Loh1/a;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lkh1/d;Loh1/a;Lbc3/c0;)V", "Lec3/l;", "Lkh1/b;", "Lkh1/c;", "interact", "(Lec3/l;)Lec3/l;", "Lnh1/a$s;", "p", "(Lnh1/a$s;)Lkh1/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Lnh1/a$s;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lkh1/d;", "x", "Loh1/a;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "E", "Lec3/l;", "domainState", "Lnh1/c;", "F", "getViewState", "()Lec3/l;", "viewState", "Lnh1/a$n;", "G", "n", "navigationEvents", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26721b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l navigationEvents;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C22483d interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C27936a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: nh1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifting.presentation.GiftingViewModel$sendViewEvent$1", m100430f = "GiftingViewModel.kt", m100431l = {42}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f106257w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC26720a.s f106259y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC26720a.s sVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f106259y = sVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C26721b.this.new a(this.f106259y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f106257w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C26721b.this.eventFlow;
                InterfaceC26720a.s sVar = this.f106259y;
                this.f106257w = 1;
                if (interfaceC13072o1.emit(sVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: nh1.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f106260w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C26721b f106261x;

        /* JADX INFO: renamed from: nh1.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f106262w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C26721b f106263x;

            /* JADX INFO: renamed from: nh1.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifting.presentation.GiftingViewModel$special$$inlined$map$1$2", m100430f = "GiftingViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42051a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f106264E;

                /* JADX INFO: renamed from: F */
                Object f106265F;

                /* JADX INFO: renamed from: G */
                Object f106266G;

                /* JADX INFO: renamed from: H */
                int f106267H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f106268w;

                /* JADX INFO: renamed from: x */
                int f106269x;

                /* JADX INFO: renamed from: y */
                Object f106270y;

                public C42051a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f106268w = obj;
                    this.f106269x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C26721b c26721b) {
                this.f106262w = interfaceC13062m;
                this.f106263x = c26721b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42051a c42051a;
                if (interfaceC30057d instanceof C42051a) {
                    c42051a = (C42051a) interfaceC30057d;
                    int i13 = c42051a.f106269x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42051a.f106269x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42051a = new C42051a(interfaceC30057d);
                    }
                } else {
                    c42051a = new C42051a(interfaceC30057d);
                }
                Object obj2 = c42051a.f106268w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42051a.f106269x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f106262w;
                    AbstractC22481b abstractC22481bM79468p = this.f106263x.m79468p((InterfaceC26720a.s) obj);
                    c42051a.f106270y = null;
                    c42051a.f106264E = null;
                    c42051a.f106265F = null;
                    c42051a.f106266G = null;
                    c42051a.f106267H = 0;
                    c42051a.f106269x = 1;
                    if (interfaceC13062m.emit(abstractC22481bM79468p, c42051a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C26721b c26721b) {
            this.f106260w = interfaceC13058l;
            this.f106261x = c26721b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f106260w.collect(new a(interfaceC13062m, this.f106261x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: nh1.b$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f106272w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C26721b f106273x;

        /* JADX INFO: renamed from: nh1.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f106274w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C26721b f106275x;

            /* JADX INFO: renamed from: nh1.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifting.presentation.GiftingViewModel$special$$inlined$map$2$2", m100430f = "GiftingViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42052a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f106276E;

                /* JADX INFO: renamed from: F */
                Object f106277F;

                /* JADX INFO: renamed from: G */
                Object f106278G;

                /* JADX INFO: renamed from: H */
                int f106279H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f106280w;

                /* JADX INFO: renamed from: x */
                int f106281x;

                /* JADX INFO: renamed from: y */
                Object f106282y;

                public C42052a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f106280w = obj;
                    this.f106281x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C26721b c26721b) {
                this.f106274w = interfaceC13062m;
                this.f106275x = c26721b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42052a c42052a;
                if (interfaceC30057d instanceof C42052a) {
                    c42052a = (C42052a) interfaceC30057d;
                    int i13 = c42052a.f106281x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42052a.f106281x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42052a = new C42052a(interfaceC30057d);
                    }
                } else {
                    c42052a = new C42052a(interfaceC30057d);
                }
                Object obj2 = c42052a.f106280w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42052a.f106281x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f106274w;
                    C26722c c26722cM84289b = this.f106275x.reducer.m84289b((C22482c) obj);
                    c42052a.f106282y = null;
                    c42052a.f106276E = null;
                    c42052a.f106277F = null;
                    c42052a.f106278G = null;
                    c42052a.f106279H = 0;
                    c42052a.f106281x = 1;
                    if (interfaceC13062m.emit(c26722cM84289b, c42052a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C26721b c26721b) {
            this.f106272w = interfaceC13058l;
            this.f106273x = c26721b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f106272w.collect(new a(interfaceC13062m, this.f106273x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: nh1.b$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f106284w;

        /* JADX INFO: renamed from: nh1.b$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f106285w;

            /* JADX INFO: renamed from: nh1.b$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifting.presentation.GiftingViewModel$special$$inlined$mapNotNull$1$2", m100430f = "GiftingViewModel.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42053a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f106286E;

                /* JADX INFO: renamed from: F */
                Object f106287F;

                /* JADX INFO: renamed from: G */
                Object f106288G;

                /* JADX INFO: renamed from: H */
                Object f106289H;

                /* JADX INFO: renamed from: I */
                int f106290I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f106291w;

                /* JADX INFO: renamed from: x */
                int f106292x;

                /* JADX INFO: renamed from: y */
                Object f106293y;

                public C42053a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f106291w = obj;
                    this.f106292x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f106285w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42053a c42053a;
                if (interfaceC30057d instanceof C42053a) {
                    c42053a = (C42053a) interfaceC30057d;
                    int i13 = c42053a.f106292x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42053a.f106292x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42053a = new C42053a(interfaceC30057d);
                    }
                } else {
                    c42053a = new C42053a(interfaceC30057d);
                }
                Object obj2 = c42053a.f106291w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42053a.f106292x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f106285w;
                    InterfaceC26720a interfaceC26720a = ((C22482c) obj).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
                    InterfaceC26720a.n nVar = interfaceC26720a instanceof InterfaceC26720a.n ? (InterfaceC26720a.n) interfaceC26720a : null;
                    if (nVar != null) {
                        c42053a.f106293y = null;
                        c42053a.f106286E = null;
                        c42053a.f106287F = null;
                        c42053a.f106288G = null;
                        c42053a.f106289H = null;
                        c42053a.f106290I = 0;
                        c42053a.f106292x = 1;
                        if (interfaceC13062m.emit(nVar, c42053a) == enumC31071a) {
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
            this.f106284w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f106284w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26721b(C22483d interactor, C27936a reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lInteract = interact(new b(c13096w1M36592b, this));
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lInteract, coroutineScope, c13021b2, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = AbstractC13091v.m36586L(new c(c13078q1M36586L, this), coroutineScope, c13021b2, 1);
        this.navigationEvents = AbstractC13091v.m36586L(new d(c13078q1M36586L), coroutineScope, c13021b2, 0);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final AbstractC22481b m79468p(InterfaceC26720a.s sVar) {
        if (sVar instanceof InterfaceC26720a.q) {
            InterfaceC26720a.q qVar = (InterfaceC26720a.q) sVar;
            return new AbstractC22481b.g(qVar.getSource(), qVar.getGiftType(), qVar.getTestCount(), qVar.getSelectedTier());
        }
        if (sVar instanceof InterfaceC26720a.o) {
            return new AbstractC22481b.e(((InterfaceC26720a.o) sVar).getAction());
        }
        if (sVar instanceof InterfaceC26720a.r) {
            return new AbstractC22481b.h(((InterfaceC26720a.r) sVar).getSelectedSegmentId());
        }
        if (sVar instanceof InterfaceC26720a.p) {
            return new AbstractC22481b.f(((InterfaceC26720a.p) sVar).getQuantity());
        }
        if (sVar instanceof InterfaceC26720a.g) {
            return AbstractC22481b.b.f88056a;
        }
        if (sVar instanceof InterfaceC26720a.h) {
            return new AbstractC22481b.c(((InterfaceC26720a.h) sVar).getCountryCode());
        }
        if (sVar instanceof InterfaceC26720a.d) {
            return AbstractC22481b.a.f88055a;
        }
        if (sVar instanceof InterfaceC26720a.m) {
            return new AbstractC22481b.d(((InterfaceC26720a.m) sVar).getNavigationAction());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC13058l getNavigationEvents() {
        return this.navigationEvents;
    }

    /* JADX INFO: renamed from: o */
    public final void m79470o(InterfaceC26720a.s event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C26721b(C22483d c22483d, C27936a c27936a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c22483d, c27936a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
