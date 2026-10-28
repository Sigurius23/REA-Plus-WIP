package id1;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import g91.AbstractC15602a;
import g91.C15603b;
import g91.C15604c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import od1.AbstractC27845h;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: id1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B'\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, m65681d2 = {"Lid1/c;", "", "T", "Landroidx/lifecycle/w1;", "itemType", "Lid1/f;", "reducer", "Lg91/b;", "interactor", "Lbc3/c0;", "coroutineScope", "<init>", "(Ljava/lang/Object;Lid1/f;Lg91/b;Lbc3/c0;)V", "Lid1/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "l", "(Lid1/b;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "x", "Lid1/f;", "y", "Lg91/b;", "z", "Lbc3/c0;", "Lec3/o1;", "E", "Lec3/o1;", "eventFlow", "Lec3/f2;", "Lid1/e;", "F", "Lec3/f2;", "getViewState", "()Lec3/f2;", "viewState", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18412c<T> extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13037f2 viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final T itemType;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C18415f reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C15603b interactor;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: id1.c$a */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.design.showcase.shared.viewmodel.DesignShowcaseViewModel$sendViewEvent$1", m100430f = "DesignShowcaseViewModel.kt", m100431l = {27}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f71618w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C18412c<T> f71619x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC18411b f71620y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C18412c<T> c18412c, AbstractC18411b abstractC18411b, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f71619x = c18412c;
            this.f71620y = abstractC18411b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f71619x, this.f71620y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f71618w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = ((C18412c) this.f71619x).eventFlow;
                AbstractC18411b abstractC18411b = this.f71620y;
                this.f71618w = 1;
                if (interfaceC13072o1.emit(abstractC18411b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: id1.c$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f71621w;

        /* JADX INFO: renamed from: id1.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f71622w;

            /* JADX INFO: renamed from: id1.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.design.showcase.shared.viewmodel.DesignShowcaseViewModel$special$$inlined$map$1$2", m100430f = "DesignShowcaseViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41738a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f71623E;

                /* JADX INFO: renamed from: F */
                Object f71624F;

                /* JADX INFO: renamed from: G */
                Object f71625G;

                /* JADX INFO: renamed from: H */
                int f71626H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f71627w;

                /* JADX INFO: renamed from: x */
                int f71628x;

                /* JADX INFO: renamed from: y */
                Object f71629y;

                public C41738a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f71627w = obj;
                    this.f71628x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f71622w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41738a c41738a;
                if (interfaceC30057d instanceof C41738a) {
                    c41738a = (C41738a) interfaceC30057d;
                    int i13 = c41738a.f71628x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41738a.f71628x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41738a = new C41738a(interfaceC30057d);
                    }
                } else {
                    c41738a = new C41738a(interfaceC30057d);
                }
                Object obj2 = c41738a.f71627w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41738a.f71628x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f71622w;
                    AbstractC15602a abstractC15602aM52994a = AbstractC18413d.m52994a((AbstractC18411b) obj);
                    c41738a.f71629y = null;
                    c41738a.f71623E = null;
                    c41738a.f71624F = null;
                    c41738a.f71625G = null;
                    c41738a.f71626H = 0;
                    c41738a.f71628x = 1;
                    if (interfaceC13062m.emit(abstractC15602aM52994a, c41738a) == enumC31071a) {
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
            this.f71621w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f71621w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: id1.c$c */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f71631w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C18415f f71632x;

        /* JADX INFO: renamed from: id1.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f71633w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C18415f f71634x;

            /* JADX INFO: renamed from: id1.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.design.showcase.shared.viewmodel.DesignShowcaseViewModel$special$$inlined$map$2$2", m100430f = "DesignShowcaseViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41739a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f71635E;

                /* JADX INFO: renamed from: F */
                Object f71636F;

                /* JADX INFO: renamed from: G */
                Object f71637G;

                /* JADX INFO: renamed from: H */
                int f71638H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f71639w;

                /* JADX INFO: renamed from: x */
                int f71640x;

                /* JADX INFO: renamed from: y */
                Object f71641y;

                public C41739a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f71639w = obj;
                    this.f71640x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C18415f c18415f) {
                this.f71633w = interfaceC13062m;
                this.f71634x = c18415f;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41739a c41739a;
                if (interfaceC30057d instanceof C41739a) {
                    c41739a = (C41739a) interfaceC30057d;
                    int i13 = c41739a.f71640x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41739a.f71640x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41739a = new C41739a(interfaceC30057d);
                    }
                } else {
                    c41739a = new C41739a(interfaceC30057d);
                }
                Object obj2 = c41739a.f71639w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41739a.f71640x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f71633w;
                    C18414e c18414eM52999b = this.f71634x.m52999b((C15604c) obj);
                    c41739a.f71641y = null;
                    c41739a.f71635E = null;
                    c41739a.f71636F = null;
                    c41739a.f71637G = null;
                    c41739a.f71638H = 0;
                    c41739a.f71640x = 1;
                    if (interfaceC13062m.emit(c18414eM52999b, c41739a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C18415f c18415f) {
            this.f71631w = interfaceC13058l;
            this.f71632x = c18415f;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f71631w.collect(new a(interfaceC13062m, this.f71632x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: id1.c$d */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.design.showcase.shared.viewmodel.DesignShowcaseViewModel$viewState$1", m100430f = "DesignShowcaseViewModel.kt", m100431l = {32}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lid1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f71643w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f71644x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C18412c<T> f71645y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C18412c<T> c18412c, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f71645y = c18412c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(this.f71645y, interfaceC30057d);
            dVar.f71644x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f71644x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f71643w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC18411b.a aVar = new AbstractC18411b.a(((C18412c) this.f71645y).itemType);
                this.f71644x = null;
                this.f71643w = 1;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18412c(T itemType, C18415f reducer, C15603b interactor, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(itemType, "itemType");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.itemType = itemType;
        this.reducer = reducer;
        this.interactor = interactor;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36587M(new c(AbstractC27845h.m83945a(new b(new C13015a0(new d(this, null), c13096w1M36592b)), interactor), reducer), coroutineScope, C13105z1.f45288a, new C18414e(null, null, null, 7, null));
    }

    public final InterfaceC13037f2 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: l */
    public final void m52993l(AbstractC18411b event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(this, event, null), 3);
    }
}
