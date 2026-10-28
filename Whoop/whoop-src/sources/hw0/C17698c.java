package hw0;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import com.whoop.core.details.view.InterfaceC6471b;
import dw0.C12404c;
import dw0.C12405d;
import dw0.InterfaceC12403b;
import dw0.InterfaceC12408g;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import ew0.AbstractC13720a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
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

/* JADX INFO: renamed from: hw0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020(0!8\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&¨\u0006,"}, m65681d2 = {"Lhw0/c;", "Landroidx/lifecycle/w1;", "Lhw0/b;", "reducer", "Ldw0/d;", "interactor", "Lbc3/c0;", "scope", "<init>", "(Lhw0/b;Ldw0/d;Lbc3/c0;)V", "Lcom/whoop/core/details/view/b;", "viewEvent", "Ldw0/b;", "o", "(Lcom/whoop/core/details/view/b;)Ldw0/b;", "Lbc3/k1;", "p", "(Lcom/whoop/core/details/view/b;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lhw0/b;", "x", "Ldw0/d;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lec3/t1;", "Ldw0/c;", "E", "Lec3/t1;", "domainState", "Lec3/l;", "Lhw0/d;", "F", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "Lew0/a;", "G", "n", "navigationEvents", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17698c extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13087t1 domainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l navigationEvents;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C17697b reducer;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C12405d interactor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: hw0.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.presentation.CoreDetailsViewModel$sendViewEvent$1", m100430f = "CoreDetailsViewModel.kt", m100431l = {61}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f68666w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC6471b f68668y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6471b interfaceC6471b, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f68668y = interfaceC6471b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C17698c.this.new a(this.f68668y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f68666w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C17698c.this.eventFlow;
                InterfaceC6471b interfaceC6471b = this.f68668y;
                this.f68666w = 1;
                if (interfaceC13072o1.emit(interfaceC6471b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: hw0.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f68669w;

        /* JADX INFO: renamed from: hw0.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f68670w;

            /* JADX INFO: renamed from: hw0.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.core.details.presentation.CoreDetailsViewModel$special$$inlined$filter$1$2", m100430f = "CoreDetailsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41714a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f68672F;

                /* JADX INFO: renamed from: G */
                Object f68673G;

                /* JADX INFO: renamed from: H */
                int f68674H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f68675w;

                /* JADX INFO: renamed from: x */
                int f68676x;

                /* JADX INFO: renamed from: y */
                Object f68677y;

                /* JADX INFO: renamed from: z */
                Object f68678z;

                public C41714a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f68675w = obj;
                    this.f68676x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f68670w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41714a c41714a;
                if (interfaceC30057d instanceof C41714a) {
                    c41714a = (C41714a) interfaceC30057d;
                    int i13 = c41714a.f68676x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41714a.f68676x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41714a = new C41714a(interfaceC30057d);
                    }
                } else {
                    c41714a = new C41714a(interfaceC30057d);
                }
                Object obj2 = c41714a.f68675w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41714a.f68676x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f68670w;
                    if (((C12404c) obj).getCoreDetailsState() instanceof InterfaceC12408g.i) {
                        c41714a.f68677y = null;
                        c41714a.f68678z = null;
                        c41714a.f68672F = null;
                        c41714a.f68673G = null;
                        c41714a.f68674H = 0;
                        c41714a.f68676x = 1;
                        if (interfaceC13062m.emit(obj, c41714a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l) {
            this.f68669w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f68669w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: hw0.c$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f68679w;

        /* JADX INFO: renamed from: hw0.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f68680w;

            /* JADX INFO: renamed from: hw0.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.core.details.presentation.CoreDetailsViewModel$special$$inlined$filterNot$1$2", m100430f = "CoreDetailsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41715a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f68682F;

                /* JADX INFO: renamed from: G */
                Object f68683G;

                /* JADX INFO: renamed from: H */
                int f68684H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f68685w;

                /* JADX INFO: renamed from: x */
                int f68686x;

                /* JADX INFO: renamed from: y */
                Object f68687y;

                /* JADX INFO: renamed from: z */
                Object f68688z;

                public C41715a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f68685w = obj;
                    this.f68686x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f68680w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41715a c41715a;
                if (interfaceC30057d instanceof C41715a) {
                    c41715a = (C41715a) interfaceC30057d;
                    int i13 = c41715a.f68686x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41715a.f68686x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41715a = new C41715a(interfaceC30057d);
                    }
                } else {
                    c41715a = new C41715a(interfaceC30057d);
                }
                Object obj2 = c41715a.f68685w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41715a.f68686x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f68680w;
                    if (!(((C12404c) obj).getCoreDetailsState() instanceof InterfaceC12408g.i)) {
                        c41715a.f68687y = null;
                        c41715a.f68688z = null;
                        c41715a.f68682F = null;
                        c41715a.f68683G = null;
                        c41715a.f68684H = 0;
                        c41715a.f68686x = 1;
                        if (interfaceC13062m.emit(obj, c41715a) == enumC31071a) {
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
            this.f68679w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f68679w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: hw0.c$d */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f68689w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C17698c f68690x;

        /* JADX INFO: renamed from: hw0.c$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f68691w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C17698c f68692x;

            /* JADX INFO: renamed from: hw0.c$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.core.details.presentation.CoreDetailsViewModel$special$$inlined$map$1$2", m100430f = "CoreDetailsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41716a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f68693E;

                /* JADX INFO: renamed from: F */
                Object f68694F;

                /* JADX INFO: renamed from: G */
                Object f68695G;

                /* JADX INFO: renamed from: H */
                int f68696H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f68697w;

                /* JADX INFO: renamed from: x */
                int f68698x;

                /* JADX INFO: renamed from: y */
                Object f68699y;

                public C41716a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f68697w = obj;
                    this.f68698x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C17698c c17698c) {
                this.f68691w = interfaceC13062m;
                this.f68692x = c17698c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41716a c41716a;
                if (interfaceC30057d instanceof C41716a) {
                    c41716a = (C41716a) interfaceC30057d;
                    int i13 = c41716a.f68698x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41716a.f68698x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41716a = new C41716a(interfaceC30057d);
                    }
                } else {
                    c41716a = new C41716a(interfaceC30057d);
                }
                Object obj2 = c41716a.f68697w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41716a.f68698x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f68691w;
                    InterfaceC12403b interfaceC12403bM50611o = this.f68692x.m50611o((InterfaceC6471b) obj);
                    c41716a.f68699y = null;
                    c41716a.f68693E = null;
                    c41716a.f68694F = null;
                    c41716a.f68695G = null;
                    c41716a.f68696H = 0;
                    c41716a.f68698x = 1;
                    if (interfaceC13062m.emit(interfaceC12403bM50611o, c41716a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C17698c c17698c) {
            this.f68689w = interfaceC13058l;
            this.f68690x = c17698c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f68689w.collect(new a(interfaceC13062m, this.f68690x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: hw0.c$e */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f68701w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C17698c f68702x;

        /* JADX INFO: renamed from: hw0.c$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f68703w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C17698c f68704x;

            /* JADX INFO: renamed from: hw0.c$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.core.details.presentation.CoreDetailsViewModel$special$$inlined$map$2$2", m100430f = "CoreDetailsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41717a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f68705E;

                /* JADX INFO: renamed from: F */
                Object f68706F;

                /* JADX INFO: renamed from: G */
                Object f68707G;

                /* JADX INFO: renamed from: H */
                int f68708H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f68709w;

                /* JADX INFO: renamed from: x */
                int f68710x;

                /* JADX INFO: renamed from: y */
                Object f68711y;

                public C41717a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f68709w = obj;
                    this.f68710x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C17698c c17698c) {
                this.f68703w = interfaceC13062m;
                this.f68704x = c17698c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41717a c41717a;
                if (interfaceC30057d instanceof C41717a) {
                    c41717a = (C41717a) interfaceC30057d;
                    int i13 = c41717a.f68710x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41717a.f68710x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41717a = new C41717a(interfaceC30057d);
                    }
                } else {
                    c41717a = new C41717a(interfaceC30057d);
                }
                Object obj2 = c41717a.f68709w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41717a.f68710x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f68703w;
                    InterfaceC17699d interfaceC17699dM50607l = this.f68704x.reducer.m50607l((C12404c) obj);
                    c41717a.f68711y = null;
                    c41717a.f68705E = null;
                    c41717a.f68706F = null;
                    c41717a.f68707G = null;
                    c41717a.f68708H = 0;
                    c41717a.f68710x = 1;
                    if (interfaceC13062m.emit(interfaceC17699dM50607l, c41717a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l, C17698c c17698c) {
            this.f68701w = interfaceC13058l;
            this.f68702x = c17698c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f68701w.collect(new a(interfaceC13062m, this.f68702x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: hw0.c$f */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f68713w;

        /* JADX INFO: renamed from: hw0.c$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f68714w;

            /* JADX INFO: renamed from: hw0.c$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.core.details.presentation.CoreDetailsViewModel$special$$inlined$map$3$2", m100430f = "CoreDetailsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41718a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f68715E;

                /* JADX INFO: renamed from: F */
                Object f68716F;

                /* JADX INFO: renamed from: G */
                Object f68717G;

                /* JADX INFO: renamed from: H */
                int f68718H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f68719w;

                /* JADX INFO: renamed from: x */
                int f68720x;

                /* JADX INFO: renamed from: y */
                Object f68721y;

                public C41718a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f68719w = obj;
                    this.f68720x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f68714w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41718a c41718a;
                Object eVar;
                if (interfaceC30057d instanceof C41718a) {
                    c41718a = (C41718a) interfaceC30057d;
                    int i13 = c41718a.f68720x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41718a.f68720x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41718a = new C41718a(interfaceC30057d);
                    }
                } else {
                    c41718a = new C41718a(interfaceC30057d);
                }
                Object obj2 = c41718a.f68719w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41718a.f68720x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f68714w;
                    InterfaceC12408g coreDetailsState = ((C12404c) obj).getCoreDetailsState();
                    AbstractC22676k.m65748h(coreDetailsState, "null cannot be cast to non-null type com.whoop.core.details.domain.CoreDetailsState.NavigationState");
                    InterfaceC12408g.i iVar = (InterfaceC12408g.i) coreDetailsState;
                    if (iVar.equals(InterfaceC12408g.b.f42194a)) {
                        eVar = AbstractC13720a.a.f48702a;
                    } else {
                        if (!(iVar instanceof InterfaceC12408g.h)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        InterfaceC12408g.h hVar = (InterfaceC12408g.h) iVar;
                        eVar = new AbstractC13720a.e(hVar.getExerciseId(), hVar.getIsExerciseDetailsV2ExperimentEnabled());
                    }
                    c41718a.f68721y = null;
                    c41718a.f68715E = null;
                    c41718a.f68716F = null;
                    c41718a.f68717G = null;
                    c41718a.f68718H = 0;
                    c41718a.f68720x = 1;
                    if (interfaceC13062m.emit(eVar, c41718a) == enumC31071a) {
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
            this.f68713w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f68713w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17698c(C17697b reducer, C12405d interactor, InterfaceC2994c0 scope) {
        super(scope);
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(scope, "scope");
        this.reducer = reducer;
        this.interactor = interactor;
        this.scope = scope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM83945a = AbstractC27845h.m83945a(new d(c13096w1M36592b, this), interactor);
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lM83945a, scope, c13021b2, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = new e(new c(c13078q1M36586L), this);
        this.navigationEvents = AbstractC13091v.m36586L(new f(new b(c13078q1M36586L)), scope, c13021b2, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final InterfaceC12403b m50611o(InterfaceC6471b viewEvent) {
        if (viewEvent instanceof InterfaceC6471b.i) {
            InterfaceC6471b.i iVar = (InterfaceC6471b.i) viewEvent;
            return new InterfaceC12403b.h(iVar.getActivityId(), iVar.getEntryPoint(), EnumC17696a.INSTANCE.m50566b(iVar.getActivityType()), iVar.getNewHome());
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC6471b.r.f25375a)) {
            return InterfaceC12403b.s.f42025a;
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC6471b.o.f25372a)) {
            return InterfaceC12403b.p.f42022a;
        }
        if (viewEvent instanceof InterfaceC6471b.k) {
            InterfaceC6471b.k kVar = (InterfaceC6471b.k) viewEvent;
            return new InterfaceC12403b.j(kVar.getValueDisplay(), kVar.getUnitDisplay(), kVar.getTimeDisplay());
        }
        if (viewEvent instanceof InterfaceC6471b.j) {
            return new InterfaceC12403b.k(((InterfaceC6471b.j) viewEvent).getBarType());
        }
        if (viewEvent instanceof InterfaceC6471b.e) {
            return InterfaceC12403b.o.f42021a;
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC6471b.l.f25369a)) {
            return InterfaceC12403b.l.f42018a;
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC6471b.q.f25374a)) {
            return InterfaceC12403b.r.f42024a;
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC6471b.d.f25355a)) {
            return InterfaceC12403b.d.f42004a;
        }
        if (viewEvent instanceof InterfaceC6471b.m) {
            return new InterfaceC12403b.m(((InterfaceC6471b.m) viewEvent).getErrorCloseEvent());
        }
        if (viewEvent instanceof InterfaceC6471b.a) {
            return new InterfaceC12403b.a(((InterfaceC6471b.a) viewEvent).getIsDropDownSelected());
        }
        if (viewEvent instanceof InterfaceC6471b.g) {
            return new InterfaceC12403b.f(((InterfaceC6471b.g) viewEvent).getIndex());
        }
        if (viewEvent instanceof InterfaceC6471b.h) {
            return new InterfaceC12403b.g(((InterfaceC6471b.h) viewEvent).getShow());
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC6471b.p.f25373a)) {
            return InterfaceC12403b.q.f42023a;
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC6471b.c.f25354a)) {
            return InterfaceC12403b.b.f42003a;
        }
        if (viewEvent instanceof InterfaceC6471b.n) {
            return new InterfaceC12403b.n(((InterfaceC6471b.n) viewEvent).getExerciseId());
        }
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC6471b.f.f25357a)) {
            return InterfaceC12403b.e.f42005a;
        }
        if (viewEvent instanceof InterfaceC6471b.b) {
            return new InterfaceC12403b.i(((InterfaceC6471b.b) viewEvent).getForceShowCardioDetails());
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

    /* JADX INFO: renamed from: p */
    public final InterfaceC3027k1 m50613p(InterfaceC6471b viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(this.scope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C17698c(C17697b c17697b, C12405d c12405d, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c17697b, c12405d, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
