package np2;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kp2.AbstractC22759b;
import kp2.C22760c;
import kp2.C22762e;
import kp2.C22765h;
import l83.C23454a0;
import m83.AbstractC25267u;
import op2.C28100a;
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

/* JADX INFO: renamed from: np2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\r*\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u000e*\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00120&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020*0\r8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, m65681d2 = {"Lnp2/b;", "Landroidx/lifecycle/w1;", "Lkp2/e;", "interactor", "Lop2/a;", "reducer", "", "cartId", "source", "Lbc3/c0;", "coroutineScope", "<init>", "(Lkp2/e;Lop2/a;Ljava/lang/String;Ljava/lang/String;Lbc3/c0;)V", "Lec3/l;", "Lkp2/b;", "Lkp2/c;", "interact", "(Lec3/l;)Lec3/l;", "Lnp2/a$u;", "o", "(Lnp2/a$u;)Lkp2/b;", "Lnp2/c$e;", "Lkp2/h;", "p", "(Lnp2/c$e;)Lkp2/h;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Lnp2/a$u;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lkp2/e;", "x", "Lop2/a;", "y", "Ljava/lang/String;", "z", "E", "Lbc3/c0;", "Lec3/o1;", "F", "Lec3/o1;", "eventFlow", "Lnp2/c;", "G", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27035b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C22762e interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C28100a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String cartId;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: np2.b$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.shippingaddress.presentation.ShippingAddressViewModel$sendViewEvent$1", m100430f = "ShippingAddressViewModel.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f107879w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC27034a.u f107881y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC27034a.u uVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f107881y = uVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27035b.this.new a(this.f107881y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f107879w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C27035b.this.eventFlow;
                InterfaceC27034a.u uVar = this.f107881y;
                this.f107879w = 1;
                if (interfaceC13072o1.emit(uVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: np2.b$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f107882w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C27035b f107883x;

        /* JADX INFO: renamed from: np2.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f107884w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C27035b f107885x;

            /* JADX INFO: renamed from: np2.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.shippingaddress.presentation.ShippingAddressViewModel$special$$inlined$map$1$2", m100430f = "ShippingAddressViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42079a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f107886E;

                /* JADX INFO: renamed from: F */
                Object f107887F;

                /* JADX INFO: renamed from: G */
                Object f107888G;

                /* JADX INFO: renamed from: H */
                int f107889H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f107890w;

                /* JADX INFO: renamed from: x */
                int f107891x;

                /* JADX INFO: renamed from: y */
                Object f107892y;

                public C42079a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f107890w = obj;
                    this.f107891x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C27035b c27035b) {
                this.f107884w = interfaceC13062m;
                this.f107885x = c27035b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42079a c42079a;
                if (interfaceC30057d instanceof C42079a) {
                    c42079a = (C42079a) interfaceC30057d;
                    int i13 = c42079a.f107891x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42079a.f107891x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42079a = new C42079a(interfaceC30057d);
                    }
                } else {
                    c42079a = new C42079a(interfaceC30057d);
                }
                Object obj2 = c42079a.f107890w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42079a.f107891x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f107884w;
                    AbstractC22759b abstractC22759bM81111o = this.f107885x.m81111o((InterfaceC27034a.u) obj);
                    c42079a.f107892y = null;
                    c42079a.f107886E = null;
                    c42079a.f107887F = null;
                    c42079a.f107888G = null;
                    c42079a.f107889H = 0;
                    c42079a.f107891x = 1;
                    if (interfaceC13062m.emit(abstractC22759bM81111o, c42079a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C27035b c27035b) {
            this.f107882w = interfaceC13058l;
            this.f107883x = c27035b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f107882w.collect(new a(interfaceC13062m, this.f107883x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: np2.b$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f107894w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C27035b f107895x;

        /* JADX INFO: renamed from: np2.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f107896w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C27035b f107897x;

            /* JADX INFO: renamed from: np2.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.shippingaddress.presentation.ShippingAddressViewModel$special$$inlined$map$2$2", m100430f = "ShippingAddressViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42080a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f107898E;

                /* JADX INFO: renamed from: F */
                Object f107899F;

                /* JADX INFO: renamed from: G */
                Object f107900G;

                /* JADX INFO: renamed from: H */
                int f107901H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f107902w;

                /* JADX INFO: renamed from: x */
                int f107903x;

                /* JADX INFO: renamed from: y */
                Object f107904y;

                public C42080a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f107902w = obj;
                    this.f107903x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C27035b c27035b) {
                this.f107896w = interfaceC13062m;
                this.f107897x = c27035b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42080a c42080a;
                if (interfaceC30057d instanceof C42080a) {
                    c42080a = (C42080a) interfaceC30057d;
                    int i13 = c42080a.f107903x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42080a.f107903x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42080a = new C42080a(interfaceC30057d);
                    }
                } else {
                    c42080a = new C42080a(interfaceC30057d);
                }
                Object obj2 = c42080a.f107902w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42080a.f107903x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f107896w;
                    C27036c c27036cM84934j = this.f107897x.reducer.m84934j((C22760c) obj);
                    c42080a.f107904y = null;
                    c42080a.f107898E = null;
                    c42080a.f107899F = null;
                    c42080a.f107900G = null;
                    c42080a.f107901H = 0;
                    c42080a.f107903x = 1;
                    if (interfaceC13062m.emit(c27036cM84934j, c42080a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C27035b c27035b) {
            this.f107894w = interfaceC13058l;
            this.f107895x = c27035b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f107894w.collect(new a(interfaceC13062m, this.f107895x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27035b(C22762e interactor, C28100a reducer, String cartId, String source, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(cartId, "cartId");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.cartId = cartId;
        this.source = source;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new c(interact(new b(c13096w1M36592b, this)), this), coroutineScope, C13105z1.f45288a, 1);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final AbstractC22759b m81111o(InterfaceC27034a.u uVar) {
        if (uVar instanceof InterfaceC27034a.o) {
            return new AbstractC22759b.e(this.cartId, this.source, ((InterfaceC27034a.o) uVar).getManualRefresh());
        }
        if (uVar instanceof InterfaceC27034a.s) {
            InterfaceC27034a.s sVar = (InterfaceC27034a.s) uVar;
            return new AbstractC22759b.i(sVar.getFieldType(), sVar.getValue(), sVar.getMaxLength());
        }
        if (uVar instanceof InterfaceC27034a.t) {
            InterfaceC27034a.t tVar = (InterfaceC27034a.t) uVar;
            return new AbstractC22759b.j(tVar.getFieldType(), tVar.getValue(), tVar.getPattern(), tVar.getDisplayLabel(), tVar.getMinLength(), null, 32, null);
        }
        if (uVar instanceof InterfaceC27034a.k) {
            InterfaceC27034a.k kVar = (InterfaceC27034a.k) uVar;
            String fieldType = kVar.getFieldType();
            String value = kVar.getValue();
            if (value == null) {
                value = "";
            }
            return new AbstractC22759b.j(fieldType, value, kVar.getPattern(), kVar.getDisplayLabel(), kVar.getMinLength(), null, 32, null);
        }
        if (uVar instanceof InterfaceC27034a.q) {
            InterfaceC27034a.q qVar = (InterfaceC27034a.q) uVar;
            String fieldType2 = qVar.getFieldType();
            String title = qVar.getTitle();
            List<C27036c.e> listM81098b = qVar.m81098b();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM81098b, 10));
            Iterator<T> it = listM81098b.iterator();
            while (it.hasNext()) {
                arrayList.add(m81112p((C27036c.e) it.next()));
            }
            return new AbstractC22759b.g(fieldType2, title, arrayList);
        }
        if (uVar instanceof InterfaceC27034a.e) {
            InterfaceC27034a.e eVar = (InterfaceC27034a.e) uVar;
            return new AbstractC22759b.f(eVar.getFieldType(), eVar.getValue());
        }
        if (uVar instanceof InterfaceC27034a.d) {
            return AbstractC22759b.c.f89575a;
        }
        if (uVar instanceof InterfaceC27034a.r) {
            return new AbstractC22759b.h(this.cartId);
        }
        if (uVar instanceof InterfaceC27034a.f) {
            return new AbstractC22759b.a(((InterfaceC27034a.f) uVar).getSource());
        }
        if (uVar instanceof InterfaceC27034a.h) {
            return AbstractC22759b.b.f89574a;
        }
        if (uVar instanceof InterfaceC27034a.j) {
            return AbstractC22759b.d.f89576a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: p */
    private final C22765h m81112p(C27036c.e eVar) {
        return new C22765h(eVar.getValue(), eVar.getText(), eVar.getId(), eVar.getIsSelected());
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m81113n(InterfaceC27034a.u event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C27035b(C22762e c22762e, C28100a c28100a, String str, String str2, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c22762e, c28100a, str, str2, (i13 & 16) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
