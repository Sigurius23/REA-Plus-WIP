package gs0;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ds0.C12327f;
import ds0.C12329h;
import ds0.InterfaceC12325d;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import hs0.C17602c;
import is0.AbstractC20905r0;
import is0.C20907s0;
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

/* JADX INFO: renamed from: gs0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lgs0/a;", "Lld1/c;", "Lis0/s0;", "Lis0/r0;", "Lds0/h;", "interactor", "Lhs0/c;", "reducer", "Lor2/m;", "coroutineScope", "<init>", "(Lds0/h;Lhs0/c;Lor2/m;)V", "Lds0/d;", "p", "(Lis0/r0;)Lds0/d;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Lis0/r0;)V", "x", "Lhs0/c;", "y", "Lor2/m;", "Lec3/o1;", "z", "Lec3/o1;", "reactionsViewEventFlow", "Lec3/l;", "Lds0/f;", "E", "Lec3/l;", "domainState", "Lec3/f2;", "F", "Lec3/f2;", "getViewState", "()Lec3/f2;", "viewState", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16158a extends AbstractC23864c<C20907s0, AbstractC20905r0> {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13037f2 viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C17602c reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C28180m coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 reactionsViewEventFlow;

    /* JADX INFO: renamed from: gs0.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.communityreactions.presentation.ReactionsViewModel$sendViewEvent$1", m100430f = "ReactionsViewModel.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f61390w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC20905r0 f61392y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC20905r0 abstractC20905r0, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f61392y = abstractC20905r0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C16158a.this.new a(this.f61392y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f61390w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C16158a.this.reactionsViewEventFlow;
                AbstractC20905r0 abstractC20905r0 = this.f61392y;
                this.f61390w = 1;
                if (interfaceC13072o1.emit(abstractC20905r0, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: gs0.a$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f61393w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C16158a f61394x;

        /* JADX INFO: renamed from: gs0.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f61395w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C16158a f61396x;

            /* JADX INFO: renamed from: gs0.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.communityreactions.presentation.ReactionsViewModel$special$$inlined$map$1$2", m100430f = "ReactionsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41672a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f61397E;

                /* JADX INFO: renamed from: F */
                Object f61398F;

                /* JADX INFO: renamed from: G */
                Object f61399G;

                /* JADX INFO: renamed from: H */
                int f61400H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f61401w;

                /* JADX INFO: renamed from: x */
                int f61402x;

                /* JADX INFO: renamed from: y */
                Object f61403y;

                public C41672a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f61401w = obj;
                    this.f61402x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C16158a c16158a) {
                this.f61395w = interfaceC13062m;
                this.f61396x = c16158a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41672a c41672a;
                if (interfaceC30057d instanceof C41672a) {
                    c41672a = (C41672a) interfaceC30057d;
                    int i13 = c41672a.f61402x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41672a.f61402x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41672a = new C41672a(interfaceC30057d);
                    }
                } else {
                    c41672a = new C41672a(interfaceC30057d);
                }
                Object obj2 = c41672a.f61401w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41672a.f61402x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f61395w;
                    InterfaceC12325d interfaceC12325dM45700p = this.f61396x.m45700p((AbstractC20905r0) obj);
                    c41672a.f61403y = null;
                    c41672a.f61397E = null;
                    c41672a.f61398F = null;
                    c41672a.f61399G = null;
                    c41672a.f61400H = 0;
                    c41672a.f61402x = 1;
                    if (interfaceC13062m.emit(interfaceC12325dM45700p, c41672a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C16158a c16158a) {
            this.f61393w = interfaceC13058l;
            this.f61394x = c16158a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f61393w.collect(new a(interfaceC13062m, this.f61394x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: gs0.a$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f61405w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C16158a f61406x;

        /* JADX INFO: renamed from: gs0.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f61407w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C16158a f61408x;

            /* JADX INFO: renamed from: gs0.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.communityreactions.presentation.ReactionsViewModel$special$$inlined$map$2$2", m100430f = "ReactionsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41673a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f61409E;

                /* JADX INFO: renamed from: F */
                Object f61410F;

                /* JADX INFO: renamed from: G */
                Object f61411G;

                /* JADX INFO: renamed from: H */
                int f61412H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f61413w;

                /* JADX INFO: renamed from: x */
                int f61414x;

                /* JADX INFO: renamed from: y */
                Object f61415y;

                public C41673a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f61413w = obj;
                    this.f61414x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C16158a c16158a) {
                this.f61407w = interfaceC13062m;
                this.f61408x = c16158a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41673a c41673a;
                if (interfaceC30057d instanceof C41673a) {
                    c41673a = (C41673a) interfaceC30057d;
                    int i13 = c41673a.f61414x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41673a.f61414x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41673a = new C41673a(interfaceC30057d);
                    }
                } else {
                    c41673a = new C41673a(interfaceC30057d);
                }
                Object obj2 = c41673a.f61413w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41673a.f61414x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f61407w;
                    C20907s0 c20907s0M50134a = this.f61408x.reducer.m50134a((C12327f) obj);
                    c41673a.f61415y = null;
                    c41673a.f61409E = null;
                    c41673a.f61410F = null;
                    c41673a.f61411G = null;
                    c41673a.f61412H = 0;
                    c41673a.f61414x = 1;
                    if (interfaceC13062m.emit(c20907s0M50134a, c41673a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C16158a c16158a) {
            this.f61405w = interfaceC13058l;
            this.f61406x = c16158a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f61405w.collect(new a(interfaceC13062m, this.f61406x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16158a(C12329h interactor, C17602c reducer, C28180m coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.reactionsViewEventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM83945a = AbstractC27845h.m83945a(new b(c13096w1M36592b, this), interactor);
        this.domainState = interfaceC13058lM83945a;
        this.viewState = AbstractC13091v.m36587M(new c(interfaceC13058lM83945a, this), coroutineScope, C13105z1.f45288a, new C20907s0(true, false, null, null, null, null, null, null, null, null, 1022, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final InterfaceC12325d m45700p(AbstractC20905r0 abstractC20905r0) {
        if (abstractC20905r0 instanceof AbstractC20905r0.a) {
            return new InterfaceC12325d.a(((AbstractC20905r0.a) abstractC20905r0).getFetchDelayMs());
        }
        if (abstractC20905r0 instanceof AbstractC20905r0.h) {
            AbstractC20905r0.h hVar = (AbstractC20905r0.h) abstractC20905r0;
            return new InterfaceC12325d.k(hVar.getEmoji(), hVar.getInteraction());
        }
        if (abstractC20905r0 instanceof AbstractC20905r0.i) {
            return new InterfaceC12325d.l(((AbstractC20905r0.i) abstractC20905r0).getText());
        }
        if (abstractC20905r0 instanceof AbstractC20905r0.g) {
            return InterfaceC12325d.j.f41274a;
        }
        if (abstractC20905r0 instanceof AbstractC20905r0.b) {
            return new InterfaceC12325d.b(((AbstractC20905r0.b) abstractC20905r0).getInteraction());
        }
        if (abstractC20905r0 instanceof AbstractC20905r0.f) {
            return new InterfaceC12325d.i(((AbstractC20905r0.f) abstractC20905r0).getModal());
        }
        if (abstractC20905r0 instanceof AbstractC20905r0.d) {
            return InterfaceC12325d.d.f41270a;
        }
        if (abstractC20905r0 instanceof AbstractC20905r0.c) {
            return InterfaceC12325d.c.f41269a;
        }
        if (abstractC20905r0 instanceof AbstractC20905r0.e) {
            return new InterfaceC12325d.g(((AbstractC20905r0.e) abstractC20905r0).getAction());
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo1216g(AbstractC20905r0 event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    @Override // ld1.AbstractC23864c
    public InterfaceC13037f2 getViewState() {
        return this.viewState;
    }

    public /* synthetic */ C16158a(C12329h c12329h, C17602c c17602c, C28180m c28180m, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12329h, c17602c, (i13 & 4) != 0 ? new C28180m(null, 1, null) : c28180m);
    }
}
