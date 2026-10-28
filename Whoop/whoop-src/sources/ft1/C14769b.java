package ft1;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import dt1.C12366d;
import dt1.InterfaceC12367e;
import dt1.InterfaceC12369g;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
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

/* JADX INFO: renamed from: ft1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Lft1/b;", "Landroidx/lifecycle/w1;", "Ldt1/d;", "combiner", "Lft1/d;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Ldt1/d;Lft1/d;Lbc3/c0;)V", "Lft1/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "l", "(Lft1/a;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lft1/d;", "x", "Lbc3/c0;", "Lec3/o1;", "y", "Lec3/o1;", "events", "Lec3/l;", "Lft1/c;", "z", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14769b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C14771d reducer;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 events;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: ft1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.presentation.LabradorDetailsViewModel$sendViewEvent$1", m100430f = "LabradorDetailsViewModel.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f54689w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC14768a f54691y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC14768a interfaceC14768a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f54691y = interfaceC14768a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C14769b.this.new a(this.f54691y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f54689w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C14769b.this.events;
                InterfaceC14768a interfaceC14768a = this.f54691y;
                this.f54689w = 1;
                if (interfaceC13072o1.emit(interfaceC14768a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ft1.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f54692w;

        /* JADX INFO: renamed from: ft1.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f54693w;

            /* JADX INFO: renamed from: ft1.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.presentation.LabradorDetailsViewModel$special$$inlined$map$1$2", m100430f = "LabradorDetailsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41609a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f54694E;

                /* JADX INFO: renamed from: F */
                Object f54695F;

                /* JADX INFO: renamed from: G */
                Object f54696G;

                /* JADX INFO: renamed from: H */
                int f54697H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f54698w;

                /* JADX INFO: renamed from: x */
                int f54699x;

                /* JADX INFO: renamed from: y */
                Object f54700y;

                public C41609a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f54698w = obj;
                    this.f54699x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f54693w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41609a c41609a;
                Object hVar;
                if (interfaceC30057d instanceof C41609a) {
                    c41609a = (C41609a) interfaceC30057d;
                    int i13 = c41609a.f54699x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41609a.f54699x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41609a = new C41609a(interfaceC30057d);
                    }
                } else {
                    c41609a = new C41609a(interfaceC30057d);
                }
                Object obj2 = c41609a.f54698w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41609a.f54699x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f54693w;
                    InterfaceC14768a interfaceC14768a = (InterfaceC14768a) obj;
                    if (interfaceC14768a instanceof InterfaceC14768a.d) {
                        hVar = new InterfaceC12367e.e(((InterfaceC14768a.d) interfaceC14768a).getId());
                    } else if (interfaceC14768a instanceof InterfaceC14768a.b) {
                        InterfaceC14768a.b bVar = (InterfaceC14768a.b) interfaceC14768a;
                        hVar = new InterfaceC12367e.b(bVar.getId(), bVar.getTimestamp());
                    } else if (interfaceC14768a instanceof InterfaceC14768a.h) {
                        InterfaceC14768a.h hVar2 = (InterfaceC14768a.h) interfaceC14768a;
                        hVar = new InterfaceC12367e.h(hVar2.getId(), hVar2.getTimestamp(), hVar2.m42341c(), hVar2.getNotes());
                    } else if (AbstractC22676k.m65745e(interfaceC14768a, InterfaceC14768a.c.f54676a)) {
                        hVar = InterfaceC12367e.c.f41593a;
                    } else if (interfaceC14768a instanceof InterfaceC14768a.g) {
                        hVar = InterfaceC12367e.g.f41597a;
                    } else if (AbstractC22676k.m65745e(interfaceC14768a, InterfaceC14768a.e.f54678a)) {
                        hVar = InterfaceC12367e.d.f41594a;
                    } else if (interfaceC14768a instanceof InterfaceC14768a.f) {
                        hVar = InterfaceC12367e.f.f41596a;
                    } else {
                        if (!(interfaceC14768a instanceof InterfaceC14768a.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        hVar = InterfaceC12367e.a.f41590a;
                    }
                    c41609a.f54700y = null;
                    c41609a.f54694E = null;
                    c41609a.f54695F = null;
                    c41609a.f54696G = null;
                    c41609a.f54697H = 0;
                    c41609a.f54699x = 1;
                    if (interfaceC13062m.emit(hVar, c41609a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l) {
            this.f54692w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f54692w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ft1.b$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f54702w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C14769b f54703x;

        /* JADX INFO: renamed from: ft1.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f54704w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C14769b f54705x;

            /* JADX INFO: renamed from: ft1.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.details.presentation.LabradorDetailsViewModel$special$$inlined$map$2$2", m100430f = "LabradorDetailsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41610a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f54706E;

                /* JADX INFO: renamed from: F */
                Object f54707F;

                /* JADX INFO: renamed from: G */
                Object f54708G;

                /* JADX INFO: renamed from: H */
                int f54709H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f54710w;

                /* JADX INFO: renamed from: x */
                int f54711x;

                /* JADX INFO: renamed from: y */
                Object f54712y;

                public C41610a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f54710w = obj;
                    this.f54711x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C14769b c14769b) {
                this.f54704w = interfaceC13062m;
                this.f54705x = c14769b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41610a c41610a;
                if (interfaceC30057d instanceof C41610a) {
                    c41610a = (C41610a) interfaceC30057d;
                    int i13 = c41610a.f54711x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41610a.f54711x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41610a = new C41610a(interfaceC30057d);
                    }
                } else {
                    c41610a = new C41610a(interfaceC30057d);
                }
                Object obj2 = c41610a.f54710w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41610a.f54711x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f54704w;
                    InterfaceC14770c interfaceC14770cM42376a = this.f54705x.reducer.m42376a((InterfaceC12369g) obj);
                    c41610a.f54712y = null;
                    c41610a.f54706E = null;
                    c41610a.f54707F = null;
                    c41610a.f54708G = null;
                    c41610a.f54709H = 0;
                    c41610a.f54711x = 1;
                    if (interfaceC13062m.emit(interfaceC14770cM42376a, c41610a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C14769b c14769b) {
            this.f54702w = interfaceC13058l;
            this.f54703x = c14769b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f54702w.collect(new a(interfaceC13062m, this.f54703x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14769b(C12366d combiner, C14771d reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(combiner, "combiner");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(1, 0, null, 6);
        this.events = c13096w1M36592b;
        this.viewState = new c(AbstractC27845h.m83945a(new b(c13096w1M36592b), combiner), this);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: l */
    public final void m42345l(InterfaceC14768a event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C14769b(C12366d c12366d, C14771d c14771d, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12366d, c14771d, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
