package gh1;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import dh1.AbstractC12044b;
import dh1.C12045c;
import dh1.C12046d;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import hh1.C17288a;
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

/* JADX INFO: renamed from: gh1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\n8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010&R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020(0\n8\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010&¨\u0006,"}, m65681d2 = {"Lgh1/c;", "Landroidx/lifecycle/w1;", "Ldh1/d;", "interactor", "Lhh1/a;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Ldh1/d;Lhh1/a;Lbc3/c0;)V", "Lec3/l;", "Ldh1/b;", "Ldh1/c;", "interact", "(Lec3/l;)Lec3/l;", "Lgh1/b$j;", "p", "(Lgh1/b$j;)Ldh1/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Lgh1/b$j;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ldh1/d;", "x", "Lhh1/a;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "E", "Lec3/l;", "domainState", "Lgh1/d;", "F", "getViewState", "()Lec3/l;", "viewState", "Lgh1/b$g;", "G", "n", "navigationEvents", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15853c extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l navigationEvents;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C12046d interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C17288a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: gh1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifted.presentation.GiftedViewModel$sendViewEvent$1", m100430f = "GiftedViewModel.kt", m100431l = {42}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f59887w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC15852b.j f59889y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC15852b.j jVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f59889y = jVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C15853c.this.new a(this.f59889y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f59887w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C15853c.this.eventFlow;
                InterfaceC15852b.j jVar = this.f59889y;
                this.f59887w = 1;
                if (interfaceC13072o1.emit(jVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: gh1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f59890w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15853c f59891x;

        /* JADX INFO: renamed from: gh1.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f59892w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C15853c f59893x;

            /* JADX INFO: renamed from: gh1.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifted.presentation.GiftedViewModel$special$$inlined$map$1$2", m100430f = "GiftedViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41652a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f59894E;

                /* JADX INFO: renamed from: F */
                Object f59895F;

                /* JADX INFO: renamed from: G */
                Object f59896G;

                /* JADX INFO: renamed from: H */
                int f59897H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f59898w;

                /* JADX INFO: renamed from: x */
                int f59899x;

                /* JADX INFO: renamed from: y */
                Object f59900y;

                public C41652a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f59898w = obj;
                    this.f59899x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C15853c c15853c) {
                this.f59892w = interfaceC13062m;
                this.f59893x = c15853c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41652a c41652a;
                if (interfaceC30057d instanceof C41652a) {
                    c41652a = (C41652a) interfaceC30057d;
                    int i13 = c41652a.f59899x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41652a.f59899x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41652a = new C41652a(interfaceC30057d);
                    }
                } else {
                    c41652a = new C41652a(interfaceC30057d);
                }
                Object obj2 = c41652a.f59898w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41652a.f59899x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f59892w;
                    AbstractC12044b abstractC12044bM44751p = this.f59893x.m44751p((InterfaceC15852b.j) obj);
                    c41652a.f59900y = null;
                    c41652a.f59894E = null;
                    c41652a.f59895F = null;
                    c41652a.f59896G = null;
                    c41652a.f59897H = 0;
                    c41652a.f59899x = 1;
                    if (interfaceC13062m.emit(abstractC12044bM44751p, c41652a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C15853c c15853c) {
            this.f59890w = interfaceC13058l;
            this.f59891x = c15853c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f59890w.collect(new a(interfaceC13062m, this.f59891x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: gh1.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f59902w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15853c f59903x;

        /* JADX INFO: renamed from: gh1.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f59904w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C15853c f59905x;

            /* JADX INFO: renamed from: gh1.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifted.presentation.GiftedViewModel$special$$inlined$map$2$2", m100430f = "GiftedViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41653a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f59906E;

                /* JADX INFO: renamed from: F */
                Object f59907F;

                /* JADX INFO: renamed from: G */
                Object f59908G;

                /* JADX INFO: renamed from: H */
                int f59909H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f59910w;

                /* JADX INFO: renamed from: x */
                int f59911x;

                /* JADX INFO: renamed from: y */
                Object f59912y;

                public C41653a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f59910w = obj;
                    this.f59911x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C15853c c15853c) {
                this.f59904w = interfaceC13062m;
                this.f59905x = c15853c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41653a c41653a;
                if (interfaceC30057d instanceof C41653a) {
                    c41653a = (C41653a) interfaceC30057d;
                    int i13 = c41653a.f59911x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41653a.f59911x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41653a = new C41653a(interfaceC30057d);
                    }
                } else {
                    c41653a = new C41653a(interfaceC30057d);
                }
                Object obj2 = c41653a.f59910w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41653a.f59911x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f59904w;
                    C15854d c15854dM48966a = this.f59905x.reducer.m48966a((C12045c) obj);
                    c41653a.f59912y = null;
                    c41653a.f59906E = null;
                    c41653a.f59907F = null;
                    c41653a.f59908G = null;
                    c41653a.f59909H = 0;
                    c41653a.f59911x = 1;
                    if (interfaceC13062m.emit(c15854dM48966a, c41653a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C15853c c15853c) {
            this.f59902w = interfaceC13058l;
            this.f59903x = c15853c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f59902w.collect(new a(interfaceC13062m, this.f59903x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: gh1.c$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f59914w;

        /* JADX INFO: renamed from: gh1.c$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f59915w;

            /* JADX INFO: renamed from: gh1.c$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.gifting.feature.gifted.presentation.GiftedViewModel$special$$inlined$mapNotNull$1$2", m100430f = "GiftedViewModel.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41654a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f59916E;

                /* JADX INFO: renamed from: F */
                Object f59917F;

                /* JADX INFO: renamed from: G */
                Object f59918G;

                /* JADX INFO: renamed from: H */
                Object f59919H;

                /* JADX INFO: renamed from: I */
                int f59920I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f59921w;

                /* JADX INFO: renamed from: x */
                int f59922x;

                /* JADX INFO: renamed from: y */
                Object f59923y;

                public C41654a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f59921w = obj;
                    this.f59922x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f59915w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41654a c41654a;
                if (interfaceC30057d instanceof C41654a) {
                    c41654a = (C41654a) interfaceC30057d;
                    int i13 = c41654a.f59922x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41654a.f59922x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41654a = new C41654a(interfaceC30057d);
                    }
                } else {
                    c41654a = new C41654a(interfaceC30057d);
                }
                Object obj2 = c41654a.f59921w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41654a.f59922x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f59915w;
                    InterfaceC15852b interfaceC15852b = ((C12045c) obj).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
                    InterfaceC15852b.g gVar = interfaceC15852b instanceof InterfaceC15852b.g ? (InterfaceC15852b.g) interfaceC15852b : null;
                    if (gVar != null) {
                        c41654a.f59923y = null;
                        c41654a.f59916E = null;
                        c41654a.f59917F = null;
                        c41654a.f59918G = null;
                        c41654a.f59919H = null;
                        c41654a.f59920I = 0;
                        c41654a.f59922x = 1;
                        if (interfaceC13062m.emit(gVar, c41654a) == enumC31071a) {
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
            this.f59914w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f59914w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15853c(C12046d interactor, C17288a reducer, InterfaceC2994c0 coroutineScope) {
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
    public final AbstractC12044b m44751p(InterfaceC15852b.j jVar) {
        if (jVar instanceof InterfaceC15852b.i) {
            return new AbstractC12044b.b(((InterfaceC15852b.i) jVar).getGiftCode());
        }
        if (jVar instanceof InterfaceC15852b.h) {
            return new AbstractC12044b.a(((InterfaceC15852b.h) jVar).getAction());
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
    public final void m44753o(InterfaceC15852b.j event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C15853c(C12046d c12046d, C17288a c17288a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12046d, c17288a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
