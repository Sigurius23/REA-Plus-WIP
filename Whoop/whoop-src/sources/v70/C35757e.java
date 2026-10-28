package v70;

import com.whoop.activation.feature.orderconfirmation.domain.GetOrderConfirmationRequest;
import com.whoop.activation.feature.orderconfirmation.domain.models.OrderConfirmationResponse;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import l83.C23454a0;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pm0.AbstractC29355b;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;

/* JADX INFO: renamed from: v70.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lv70/e;", "Lod1/g;", "Lv70/c;", "Lv70/d;", "Lnm0/e;", "cachedApiSource", "<init>", "(Lnm0/e;)V", "previousState", "action", "f", "(Lv70/d;Lv70/c;)Lv70/d;", "", "manualRefresh", "Lec3/l;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Z)Lec3/l;", "Lpm0/a$c;", "Lcom/whoop/activation/feature/orderconfirmation/domain/models/OrderConfirmationResponse;", "cacheResult", "g", "(Lpm0/a$c;)Lv70/d;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35757e implements InterfaceC27844g<AbstractC35755c, C35756d> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: v70.e$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.feature.orderconfirmation.domain.OrderConfirmationInteractor$interact$$inlined$flatMapLatest$1", m100430f = "OrderConfirmationInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f152060w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f152061x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f152062y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C35757e f152063z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C35757e c35757e) {
            super(3, interfaceC30057d);
            this.f152063z = c35757e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC35755c abstractC35755c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f152063z);
            aVar.f152061x = interfaceC13062m;
            aVar.f152062y = abstractC35755c;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f152060w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f152061x;
                AbstractC35755c abstractC35755c = (AbstractC35755c) this.f152062y;
                InterfaceC13058l cVar = abstractC35755c instanceof AbstractC35755c.b ? new c(this.f152063z.m113295h(((AbstractC35755c.b) abstractC35755c).getManualRefresh())) : new C0456u(new AbstractC35758f.b(abstractC35755c), 1);
                this.f152061x = null;
                this.f152062y = null;
                this.f152060w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, cVar, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC35755c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: v70.e$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.feature.orderconfirmation.domain.OrderConfirmationInteractor$interact$2", m100430f = "OrderConfirmationInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lv70/d;", "previousState", "Lv70/f;", "action", "<anonymous>", "(Lv70/d;Lv70/f;)Lv70/d;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f152064w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f152065x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f152066y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C35756d c35756d, AbstractC35758f abstractC35758f, InterfaceC30057d<? super C35756d> interfaceC30057d) {
            b bVar = C35757e.this.new b(interfaceC30057d);
            bVar.f152065x = c35756d;
            bVar.f152066y = abstractC35758f;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C35756d c35756d = (C35756d) this.f152065x;
            AbstractC35758f abstractC35758f = (AbstractC35758f) this.f152066y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f152064w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC35758f instanceof AbstractC35758f.b) {
                return C35757e.this.m113293f(c35756d, ((AbstractC35758f.b) abstractC35758f).getDomainAction());
            }
            if (abstractC35758f instanceof AbstractC35758f.a) {
                return ((AbstractC35758f.a) abstractC35758f).getDomainState();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: v70.e$c */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f152068w;

        /* JADX INFO: renamed from: v70.e$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f152069w;

            /* JADX INFO: renamed from: v70.e$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.activation.feature.orderconfirmation.domain.OrderConfirmationInteractor$interact$lambda$0$$inlined$map$1$2", m100430f = "OrderConfirmationInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42524a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f152070E;

                /* JADX INFO: renamed from: F */
                Object f152071F;

                /* JADX INFO: renamed from: G */
                Object f152072G;

                /* JADX INFO: renamed from: H */
                int f152073H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f152074w;

                /* JADX INFO: renamed from: x */
                int f152075x;

                /* JADX INFO: renamed from: y */
                Object f152076y;

                public C42524a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f152074w = obj;
                    this.f152075x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f152069w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42524a c42524a;
                if (interfaceC30057d instanceof C42524a) {
                    c42524a = (C42524a) interfaceC30057d;
                    int i13 = c42524a.f152075x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42524a.f152075x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42524a = new C42524a(interfaceC30057d);
                    }
                } else {
                    c42524a = new C42524a(interfaceC30057d);
                }
                Object obj2 = c42524a.f152074w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42524a.f152075x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f152069w;
                    AbstractC35758f.a aVar = new AbstractC35758f.a((C35756d) obj);
                    c42524a.f152076y = null;
                    c42524a.f152070E = null;
                    c42524a.f152071F = null;
                    c42524a.f152072G = null;
                    c42524a.f152073H = 0;
                    c42524a.f152075x = 1;
                    if (interfaceC13062m.emit(aVar, c42524a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l) {
            this.f152068w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f152068w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: v70.e$d */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.feature.orderconfirmation.domain.OrderConfirmationInteractor$loadOrderConfirmationCache$$inlined$cacheAPI$1", m100430f = "OrderConfirmationInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f152078w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f152079x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f152080y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f152081z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f152081z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d, this.f152081z);
            dVar.f152079x = interfaceC13062m;
            dVar.f152080y = c26832c;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f152078w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f152079x;
                C26832c c26832c = (C26832c) this.f152080y;
                InterfaceC26834e interfaceC26834e = this.f152081z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(OrderConfirmationResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(OrderConfirmationResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f152079x = null;
                this.f152080y = null;
                this.f152078w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: v70.e$e */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f152082w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f152083x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C35757e f152084y;

        /* JADX INFO: renamed from: v70.e$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f152085w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ boolean f152086x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C35757e f152087y;

            /* JADX INFO: renamed from: v70.e$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.activation.feature.orderconfirmation.domain.OrderConfirmationInteractor$loadOrderConfirmationCache$$inlined$map$1$2", m100430f = "OrderConfirmationInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42525a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f152088E;

                /* JADX INFO: renamed from: F */
                Object f152089F;

                /* JADX INFO: renamed from: G */
                Object f152090G;

                /* JADX INFO: renamed from: H */
                int f152091H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f152092w;

                /* JADX INFO: renamed from: x */
                int f152093x;

                /* JADX INFO: renamed from: y */
                Object f152094y;

                public C42525a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f152092w = obj;
                    this.f152093x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, boolean z4, C35757e c35757e) {
                this.f152085w = interfaceC13062m;
                this.f152086x = z4;
                this.f152087y = c35757e;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42525a c42525a;
                C35756d c35756dM113294g;
                if (interfaceC30057d instanceof C42525a) {
                    c42525a = (C42525a) interfaceC30057d;
                    int i13 = c42525a.f152093x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42525a.f152093x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42525a = new C42525a(interfaceC30057d);
                    }
                } else {
                    c42525a = new C42525a(interfaceC30057d);
                }
                Object obj2 = c42525a.f152092w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42525a.f152093x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f152085w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        c35756dM113294g = new C35756d(InterfaceC35754b.c.f152051a, null, false, false, 14, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                        c35756dM113294g = new C35756d(null, (OrderConfirmationResponse) ((InterfaceC29354a.a.b) interfaceC29354a).getData(), this.f152086x, true, 1, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        c35756dM113294g = new C35756d(null, (OrderConfirmationResponse) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData(), this.f152086x, false, 1, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                        c35756dM113294g = new C35756d(null, (OrderConfirmationResponse) ((InterfaceC29354a.d) interfaceC29354a).getData(), false, false, 13, null);
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c35756dM113294g = this.f152087y.m113294g((InterfaceC29354a.c) interfaceC29354a);
                    }
                    c42525a.f152094y = null;
                    c42525a.f152088E = null;
                    c42525a.f152089F = null;
                    c42525a.f152090G = null;
                    c42525a.f152091H = 0;
                    c42525a.f152093x = 1;
                    if (interfaceC13062m.emit(c35756dM113294g, c42525a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l, boolean z4, C35757e c35757e) {
            this.f152082w = interfaceC13058l;
            this.f152083x = z4;
            this.f152084y = c35757e;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f152082w.collect(new a(interfaceC13062m, this.f152083x, this.f152084y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C35757e(InterfaceC26834e cachedApiSource) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        this.cachedApiSource = cachedApiSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final C35756d m113293f(C35756d previousState, AbstractC35755c action) {
        if (!(action instanceof AbstractC35755c.b) && (action instanceof AbstractC35755c.a)) {
            return C35756d.m113285b(previousState, InterfaceC35754b.a.f152050a, null, false, false, 14, null);
        }
        return previousState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final C35756d m113294g(InterfaceC29354a.c<OrderConfirmationResponse> cacheResult) {
        return AbstractC29355b.m89462a(cacheResult) ? new C35756d(InterfaceC35754b.f.f152053a, null, false, false, 14, null) : new C35756d(InterfaceC35754b.d.f152052a, null, false, false, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final InterfaceC13058l m113295h(boolean manualRefresh) {
        return new e(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetOrderConfirmationRequest(), 1), null, null, 3, null), new d(null, this.cachedApiSource)), manualRefresh, this);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C35756d(InterfaceC35754b.c.f152051a, null, false, false, 14, null), AbstractC13091v.m36590P(upstream, new a(null, this)), new b(null));
    }
}
