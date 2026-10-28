package yv0;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.core.details.activitytargets.domain.AbstractC6449b;
import com.whoop.core.details.activitytargets.domain.C6450c;
import com.whoop.core.details.activitytargets.domain.InterfaceC6448a;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import l83.C23454a0;
import ld1.AbstractC23864c;
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
import zv0.C41163a;

/* JADX INFO: renamed from: yv0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m65681d2 = {"Lyv0/c;", "Lld1/c;", "Lyv0/d;", "Lyv0/b;", "Lcom/whoop/core/details/activitytargets/domain/c;", "interactor", "Lzv0/a;", "reducer", "Lor2/m;", "coroutineScope", "<init>", "(Lcom/whoop/core/details/activitytargets/domain/c;Lzv0/a;Lor2/m;)V", "Lcom/whoop/core/details/activitytargets/domain/a$a;", "p", "(Lyv0/b;)Lcom/whoop/core/details/activitytargets/domain/a$a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Lyv0/b;)V", "x", "Lzv0/a;", "y", "Lor2/m;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lec3/f2;", "E", "Lec3/f2;", "getViewState", "()Lec3/f2;", "viewState", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39800c extends AbstractC23864c<AbstractC39801d, InterfaceC39799b> {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13037f2 viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C41163a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C28180m coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: yv0.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.activitytargets.presentation.ActivityDetailsTargetsMiniArchViewModel$sendViewEvent$1", m100430f = "ActivityDetailsTargetsMiniArchViewModel.kt", m100431l = {33}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171495w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC39799b f171497y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC39799b interfaceC39799b, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f171497y = interfaceC39799b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39800c.this.new a(this.f171497y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f171495w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C39800c.this.eventFlow;
                InterfaceC39799b interfaceC39799b = this.f171497y;
                this.f171495w = 1;
                if (interfaceC13072o1.emit(interfaceC39799b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: yv0.c$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f171498w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C39800c f171499x;

        /* JADX INFO: renamed from: yv0.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f171500w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C39800c f171501x;

            /* JADX INFO: renamed from: yv0.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.core.details.activitytargets.presentation.ActivityDetailsTargetsMiniArchViewModel$special$$inlined$map$1$2", m100430f = "ActivityDetailsTargetsMiniArchViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42712a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f171502E;

                /* JADX INFO: renamed from: F */
                Object f171503F;

                /* JADX INFO: renamed from: G */
                Object f171504G;

                /* JADX INFO: renamed from: H */
                int f171505H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f171506w;

                /* JADX INFO: renamed from: x */
                int f171507x;

                /* JADX INFO: renamed from: y */
                Object f171508y;

                public C42712a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f171506w = obj;
                    this.f171507x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C39800c c39800c) {
                this.f171500w = interfaceC13062m;
                this.f171501x = c39800c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42712a c42712a;
                if (interfaceC30057d instanceof C42712a) {
                    c42712a = (C42712a) interfaceC30057d;
                    int i13 = c42712a.f171507x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42712a.f171507x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42712a = new C42712a(interfaceC30057d);
                    }
                } else {
                    c42712a = new C42712a(interfaceC30057d);
                }
                Object obj2 = c42712a.f171506w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42712a.f171507x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f171500w;
                    InterfaceC6448a.a aVarM127581p = this.f171501x.m127581p((InterfaceC39799b) obj);
                    c42712a.f171508y = null;
                    c42712a.f171502E = null;
                    c42712a.f171503F = null;
                    c42712a.f171504G = null;
                    c42712a.f171505H = 0;
                    c42712a.f171507x = 1;
                    if (interfaceC13062m.emit(aVarM127581p, c42712a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C39800c c39800c) {
            this.f171498w = interfaceC13058l;
            this.f171499x = c39800c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f171498w.collect(new a(interfaceC13062m, this.f171499x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yv0.c$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f171510w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C39800c f171511x;

        /* JADX INFO: renamed from: yv0.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f171512w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C39800c f171513x;

            /* JADX INFO: renamed from: yv0.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.core.details.activitytargets.presentation.ActivityDetailsTargetsMiniArchViewModel$special$$inlined$map$2$2", m100430f = "ActivityDetailsTargetsMiniArchViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42713a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f171514E;

                /* JADX INFO: renamed from: F */
                Object f171515F;

                /* JADX INFO: renamed from: G */
                Object f171516G;

                /* JADX INFO: renamed from: H */
                int f171517H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f171518w;

                /* JADX INFO: renamed from: x */
                int f171519x;

                /* JADX INFO: renamed from: y */
                Object f171520y;

                public C42713a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f171518w = obj;
                    this.f171519x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C39800c c39800c) {
                this.f171512w = interfaceC13062m;
                this.f171513x = c39800c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42713a c42713a;
                if (interfaceC30057d instanceof C42713a) {
                    c42713a = (C42713a) interfaceC30057d;
                    int i13 = c42713a.f171519x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42713a.f171519x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42713a = new C42713a(interfaceC30057d);
                    }
                } else {
                    c42713a = new C42713a(interfaceC30057d);
                }
                Object obj2 = c42713a.f171518w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42713a.f171519x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f171512w;
                    AbstractC39801d abstractC39801dM133713a = this.f171513x.reducer.m133713a((AbstractC6449b) obj);
                    c42713a.f171520y = null;
                    c42713a.f171514E = null;
                    c42713a.f171515F = null;
                    c42713a.f171516G = null;
                    c42713a.f171517H = 0;
                    c42713a.f171519x = 1;
                    if (interfaceC13062m.emit(abstractC39801dM133713a, c42713a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C39800c c39800c) {
            this.f171510w = interfaceC13058l;
            this.f171511x = c39800c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f171510w.collect(new a(interfaceC13062m, this.f171511x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39800c(C6450c interactor, C41163a reducer, C28180m coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36587M(new c(interactor.interact(new b(c13096w1M36592b, this)), this), coroutineScope, C13105z1.f45288a, AbstractC39801d.c.f171525a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final InterfaceC6448a.a m127581p(InterfaceC39799b interfaceC39799b) {
        if (interfaceC39799b instanceof InterfaceC39799b.a) {
            return new InterfaceC6448a.a(((InterfaceC39799b.a) interfaceC39799b).getPath());
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo1216g(InterfaceC39799b event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    @Override // ld1.AbstractC23864c
    public InterfaceC13037f2 getViewState() {
        return this.viewState;
    }

    public /* synthetic */ C39800c(C6450c c6450c, C41163a c41163a, C28180m c28180m, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c6450c, c41163a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : c28180m);
    }
}
