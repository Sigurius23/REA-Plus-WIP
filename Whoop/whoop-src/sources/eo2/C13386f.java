package eo2;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.universalcheckout.features.cart.domain.AbstractC10658a;
import com.whoop.universalcheckout.features.cart.domain.C10660c;
import com.whoop.universalcheckout.features.cart.domain.C10661d;
import ec3.AbstractC13091v;
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
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: eo2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m65681d2 = {"Leo2/f;", "Landroidx/lifecycle/w1;", "Lcom/whoop/universalcheckout/features/cart/domain/d;", "interactor", "Leo2/h;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lcom/whoop/universalcheckout/features/cart/domain/d;Leo2/h;Lbc3/c0;)V", "Leo2/c$h;", "Lcom/whoop/universalcheckout/features/cart/domain/a;", "o", "(Leo2/c$h;)Lcom/whoop/universalcheckout/features/cart/domain/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Leo2/c$h;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Leo2/h;", "x", "Lbc3/c0;", "Lec3/o1;", "y", "Lec3/o1;", "eventFlow", "Lec3/l;", "Leo2/g;", "z", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13386f extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C13388h reducer;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: eo2.f$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.cart.presentation.CartViewModel$sendViewEvent$1", m100430f = "CartViewModel.kt", m100431l = {32}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46861w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13383c.h f46863y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC13383c.h hVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f46863y = hVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C13386f.this.new a(this.f46863y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46861w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C13386f.this.eventFlow;
                InterfaceC13383c.h hVar = this.f46863y;
                this.f46861w = 1;
                if (interfaceC13072o1.emit(hVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: eo2.f$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f46864w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13386f f46865x;

        /* JADX INFO: renamed from: eo2.f$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f46866w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13386f f46867x;

            /* JADX INFO: renamed from: eo2.f$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.cart.presentation.CartViewModel$special$$inlined$map$1$2", m100430f = "CartViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41558a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f46868E;

                /* JADX INFO: renamed from: F */
                Object f46869F;

                /* JADX INFO: renamed from: G */
                Object f46870G;

                /* JADX INFO: renamed from: H */
                int f46871H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f46872w;

                /* JADX INFO: renamed from: x */
                int f46873x;

                /* JADX INFO: renamed from: y */
                Object f46874y;

                public C41558a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f46872w = obj;
                    this.f46873x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13386f c13386f) {
                this.f46866w = interfaceC13062m;
                this.f46867x = c13386f;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41558a c41558a;
                if (interfaceC30057d instanceof C41558a) {
                    c41558a = (C41558a) interfaceC30057d;
                    int i13 = c41558a.f46873x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41558a.f46873x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41558a = new C41558a(interfaceC30057d);
                    }
                } else {
                    c41558a = new C41558a(interfaceC30057d);
                }
                Object obj2 = c41558a.f46872w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41558a.f46873x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f46866w;
                    AbstractC10658a abstractC10658aM37787o = this.f46867x.m37787o((InterfaceC13383c.h) obj);
                    c41558a.f46874y = null;
                    c41558a.f46868E = null;
                    c41558a.f46869F = null;
                    c41558a.f46870G = null;
                    c41558a.f46871H = 0;
                    c41558a.f46873x = 1;
                    if (interfaceC13062m.emit(abstractC10658aM37787o, c41558a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C13386f c13386f) {
            this.f46864w = interfaceC13058l;
            this.f46865x = c13386f;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f46864w.collect(new a(interfaceC13062m, this.f46865x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: eo2.f$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f46876w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13386f f46877x;

        /* JADX INFO: renamed from: eo2.f$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f46878w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13386f f46879x;

            /* JADX INFO: renamed from: eo2.f$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.cart.presentation.CartViewModel$special$$inlined$map$2$2", m100430f = "CartViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41559a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f46880E;

                /* JADX INFO: renamed from: F */
                Object f46881F;

                /* JADX INFO: renamed from: G */
                Object f46882G;

                /* JADX INFO: renamed from: H */
                int f46883H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f46884w;

                /* JADX INFO: renamed from: x */
                int f46885x;

                /* JADX INFO: renamed from: y */
                Object f46886y;

                public C41559a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f46884w = obj;
                    this.f46885x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13386f c13386f) {
                this.f46878w = interfaceC13062m;
                this.f46879x = c13386f;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41559a c41559a;
                if (interfaceC30057d instanceof C41559a) {
                    c41559a = (C41559a) interfaceC30057d;
                    int i13 = c41559a.f46885x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41559a.f46885x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41559a = new C41559a(interfaceC30057d);
                    }
                } else {
                    c41559a = new C41559a(interfaceC30057d);
                }
                Object obj2 = c41559a.f46884w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41559a.f46885x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f46878w;
                    C13387g c13387gM37795a = this.f46879x.reducer.m37795a((C10660c) obj);
                    c41559a.f46886y = null;
                    c41559a.f46880E = null;
                    c41559a.f46881F = null;
                    c41559a.f46882G = null;
                    c41559a.f46883H = 0;
                    c41559a.f46885x = 1;
                    if (interfaceC13062m.emit(c13387gM37795a, c41559a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C13386f c13386f) {
            this.f46876w = interfaceC13058l;
            this.f46877x = c13386f;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f46876w.collect(new a(interfaceC13062m, this.f46877x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13386f(C10661d interactor, C13388h reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new c(AbstractC27845h.m83945a(new b(c13096w1M36592b, this), interactor), this), coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final AbstractC10658a m37787o(InterfaceC13383c.h hVar) {
        if (hVar instanceof InterfaceC13383c.e) {
            return new AbstractC10658a.a(((InterfaceC13383c.e) hVar).getCartId(), null, null, null, 14, null);
        }
        if (hVar instanceof InterfaceC13383c.b) {
            InterfaceC13383c.b bVar = (InterfaceC13383c.b) hVar;
            return new AbstractC10658a.a(bVar.getCartId(), bVar.getSku(), null, null, 12, null);
        }
        if (hVar instanceof InterfaceC13383c.a) {
            InterfaceC13383c.a aVar = (InterfaceC13383c.a) hVar;
            return new AbstractC10658a.a(aVar.getCartId(), null, null, aVar.getIntent(), 6, null);
        }
        if (hVar instanceof InterfaceC13383c.g) {
            InterfaceC13383c.g gVar = (InterfaceC13383c.g) hVar;
            return new AbstractC10658a.c(gVar.getLineItemId(), gVar.getQuantity());
        }
        if (hVar instanceof InterfaceC13383c.f) {
            return new AbstractC10658a.b(((InterfaceC13383c.f) hVar).getLineItemId());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m37788n(InterfaceC13383c.h event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C13386f(C10661d c10661d, C13388h c13388h, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c10661d, c13388h, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
