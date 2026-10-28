package sp2;

import com.whoop.universalcheckout.features.shippingmethod.domain.GetShippingMethodRequest;
import com.whoop.universalcheckout.features.shippingmethod.domain.SubmitShippingMethodRequest;
import com.whoop.universalcheckout.features.shippingmethod.domain.models.ShippingMethod;
import com.whoop.universalcheckout.features.shippingmethod.domain.models.ShippingMethodModels;
import com.whoop.universalcheckout.features.shippingmethod.domain.models.SubmitShippingMethodRequestBody;
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
import m83.AbstractC25265s;
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
import qp2.C30539a;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import vp2.InterfaceC36274a;

/* JADX INFO: renamed from: sp2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001e\u001a\u00020\u00032\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010!\u001a\u00020\u00032\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020 0\u001b2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\u001fJ#\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, m65681d2 = {"Lsp2/d;", "Lod1/g;", "Lsp2/b;", "Lsp2/c;", "Lnm0/e;", "cachedApiSource", "Lqp2/a;", "analyticsHelper", "<init>", "(Lnm0/e;Lqp2/a;)V", "previousState", "action", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lsp2/c;Lsp2/b;)Lsp2/c;", "", "shippingMethodId", "j", "(Lsp2/c;Ljava/lang/String;)Lsp2/c;", "cartId", "Lec3/l;", "n", "(Ljava/lang/String;Ljava/lang/String;)Lec3/l;", "source", "", "manualRefresh", "l", "(Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;", "Lpm0/a$c;", "Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/ShippingMethodModels;", "cacheResult", "i", "(Lpm0/a$c;Ljava/lang/String;)Lsp2/c;", "Ll83/a0;", "k", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Lqp2/a;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32876d implements InterfaceC27844g<AbstractC32874b, C32875c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C30539a analyticsHelper;

    /* JADX INFO: renamed from: sp2.d$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.shippingmethod.domain.ShippingMethodInteractor$interact$$inlined$flatMapLatest$1", m100430f = "ShippingMethodInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f136951w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f136952x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f136953y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C32876d f136954z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C32876d c32876d) {
            super(3, interfaceC30057d);
            this.f136954z = c32876d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC32874b abstractC32874b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f136954z);
            aVar.f136952x = interfaceC13062m;
            aVar.f136953y = abstractC32874b;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c0456u;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f136951w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f136952x;
                AbstractC32874b abstractC32874b = (AbstractC32874b) this.f136953y;
                if (abstractC32874b instanceof AbstractC32874b.a) {
                    AbstractC32874b.a aVar = (AbstractC32874b.a) abstractC32874b;
                    c0456u = new c(C32876d.m103176m(this.f136954z, aVar.getCartId(), aVar.getSource(), false, 4, null), abstractC32874b);
                } else if (abstractC32874b instanceof AbstractC32874b.c) {
                    AbstractC32874b.c cVar = (AbstractC32874b.c) abstractC32874b;
                    c0456u = new d(this.f136954z.m103177n(cVar.getCartId(), cVar.getShippingMethodId()));
                } else {
                    c0456u = new C0456u(new AbstractC32877e.b(abstractC32874b), 1);
                }
                this.f136952x = null;
                this.f136953y = null;
                this.f136951w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c0456u, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC32874b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: sp2.d$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.shippingmethod.domain.ShippingMethodInteractor$interact$2", m100430f = "ShippingMethodInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lsp2/c;", "previousState", "Lsp2/e;", "action", "<anonymous>", "(Lsp2/c;Lsp2/e;)Lsp2/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f136955w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f136956x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f136957y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C32875c c32875c, AbstractC32877e abstractC32877e, InterfaceC30057d<? super C32875c> interfaceC30057d) {
            b bVar = C32876d.this.new b(interfaceC30057d);
            bVar.f136956x = c32875c;
            bVar.f136957y = abstractC32877e;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C32875c c32875c = (C32875c) this.f136956x;
            AbstractC32877e abstractC32877e = (AbstractC32877e) this.f136957y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f136955w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC32877e instanceof AbstractC32877e.b) {
                return C32876d.this.m103171h(c32875c, ((AbstractC32877e.b) abstractC32877e).getDomainAction());
            }
            if (!(abstractC32877e instanceof AbstractC32877e.a)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC32877e.a aVar = (AbstractC32877e.a) abstractC32877e;
            C32875c domainState = aVar.getDomainState();
            String source = aVar.getSource();
            if (source == null) {
                source = c32875c.getSource();
            }
            return C32875c.m103156b(domainState, null, null, null, null, false, false, false, source, 127, null);
        }
    }

    /* JADX INFO: renamed from: sp2.d$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f136959w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC32874b f136960x;

        /* JADX INFO: renamed from: sp2.d$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f136961w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ AbstractC32874b f136962x;

            /* JADX INFO: renamed from: sp2.d$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.shippingmethod.domain.ShippingMethodInteractor$interact$lambda$0$$inlined$map$1$2", m100430f = "ShippingMethodInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42341a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f136963E;

                /* JADX INFO: renamed from: F */
                Object f136964F;

                /* JADX INFO: renamed from: G */
                Object f136965G;

                /* JADX INFO: renamed from: H */
                int f136966H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f136967w;

                /* JADX INFO: renamed from: x */
                int f136968x;

                /* JADX INFO: renamed from: y */
                Object f136969y;

                public C42341a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f136967w = obj;
                    this.f136968x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, AbstractC32874b abstractC32874b) {
                this.f136961w = interfaceC13062m;
                this.f136962x = abstractC32874b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42341a c42341a;
                if (interfaceC30057d instanceof C42341a) {
                    c42341a = (C42341a) interfaceC30057d;
                    int i13 = c42341a.f136968x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42341a.f136968x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42341a = new C42341a(interfaceC30057d);
                    }
                } else {
                    c42341a = new C42341a(interfaceC30057d);
                }
                Object obj2 = c42341a.f136967w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42341a.f136968x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f136961w;
                    AbstractC32877e.a aVar = new AbstractC32877e.a((C32875c) obj, ((AbstractC32874b.a) this.f136962x).getSource());
                    c42341a.f136969y = null;
                    c42341a.f136963E = null;
                    c42341a.f136964F = null;
                    c42341a.f136965G = null;
                    c42341a.f136966H = 0;
                    c42341a.f136968x = 1;
                    if (interfaceC13062m.emit(aVar, c42341a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, AbstractC32874b abstractC32874b) {
            this.f136959w = interfaceC13058l;
            this.f136960x = abstractC32874b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f136959w.collect(new a(interfaceC13062m, this.f136960x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sp2.d$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f136971w;

        /* JADX INFO: renamed from: sp2.d$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f136972w;

            /* JADX INFO: renamed from: sp2.d$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.shippingmethod.domain.ShippingMethodInteractor$interact$lambda$0$$inlined$map$2$2", m100430f = "ShippingMethodInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42342a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f136973E;

                /* JADX INFO: renamed from: F */
                Object f136974F;

                /* JADX INFO: renamed from: G */
                Object f136975G;

                /* JADX INFO: renamed from: H */
                int f136976H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f136977w;

                /* JADX INFO: renamed from: x */
                int f136978x;

                /* JADX INFO: renamed from: y */
                Object f136979y;

                public C42342a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f136977w = obj;
                    this.f136978x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f136972w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42342a c42342a;
                if (interfaceC30057d instanceof C42342a) {
                    c42342a = (C42342a) interfaceC30057d;
                    int i13 = c42342a.f136978x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42342a.f136978x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42342a = new C42342a(interfaceC30057d);
                    }
                } else {
                    c42342a = new C42342a(interfaceC30057d);
                }
                Object obj2 = c42342a.f136977w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42342a.f136978x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f136972w;
                    AbstractC32877e.a aVar = new AbstractC32877e.a((C32875c) obj, null);
                    c42342a.f136979y = null;
                    c42342a.f136973E = null;
                    c42342a.f136974F = null;
                    c42342a.f136975G = null;
                    c42342a.f136976H = 0;
                    c42342a.f136978x = 1;
                    if (interfaceC13062m.emit(aVar, c42342a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l) {
            this.f136971w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f136971w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sp2.d$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.shippingmethod.domain.ShippingMethodInteractor$loadShippingMethodCache$$inlined$cacheAPI$1", m100430f = "ShippingMethodInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f136981w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f136982x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f136983y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f136984z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f136984z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d, this.f136984z);
            eVar.f136982x = interfaceC13062m;
            eVar.f136983y = c26832c;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f136981w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f136982x;
                C26832c c26832c = (C26832c) this.f136983y;
                InterfaceC26834e interfaceC26834e = this.f136984z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(ShippingMethodModels.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(ShippingMethodModels.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f136982x = null;
                this.f136983y = null;
                this.f136981w = 1;
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

    /* JADX INFO: renamed from: sp2.d$f */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f136985E;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f136986w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f136987x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f136988y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C32876d f136989z;

        /* JADX INFO: renamed from: sp2.d$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ String f136990E;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f136991w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ String f136992x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ boolean f136993y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C32876d f136994z;

            /* JADX INFO: renamed from: sp2.d$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.shippingmethod.domain.ShippingMethodInteractor$loadShippingMethodCache$$inlined$map$1$2", m100430f = "ShippingMethodInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42343a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f136995E;

                /* JADX INFO: renamed from: F */
                Object f136996F;

                /* JADX INFO: renamed from: G */
                Object f136997G;

                /* JADX INFO: renamed from: H */
                int f136998H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f136999w;

                /* JADX INFO: renamed from: x */
                int f137000x;

                /* JADX INFO: renamed from: y */
                Object f137001y;

                public C42343a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f136999w = obj;
                    this.f137000x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, String str, boolean z4, C32876d c32876d, String str2) {
                this.f136991w = interfaceC13062m;
                this.f136992x = str;
                this.f136993y = z4;
                this.f136994z = c32876d;
                this.f136990E = str2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42343a c42343a;
                C32875c c32875cM103172i;
                if (interfaceC30057d instanceof C42343a) {
                    c42343a = (C42343a) interfaceC30057d;
                    int i13 = c42343a.f137000x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42343a.f137000x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42343a = new C42343a(interfaceC30057d);
                    }
                } else {
                    c42343a = new C42343a(interfaceC30057d);
                }
                Object obj2 = c42343a.f136999w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42343a.f137000x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f136991w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        c32875cM103172i = new C32875c(this.f136992x, InterfaceC32873a.b.f136931a, null, null, false, false, false, null, 252, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                        InterfaceC29354a.a.b bVar = (InterfaceC29354a.a.b) interfaceC29354a;
                        ShippingMethod shippingMethod = (ShippingMethod) AbstractC25265s.m74100H0(((ShippingMethodModels) bVar.getData()).getShippingMethods());
                        c32875cM103172i = new C32875c(this.f136992x, null, (ShippingMethodModels) bVar.getData(), shippingMethod != null ? shippingMethod.getId() : null, false, this.f136993y, true, null, 146, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        InterfaceC29354a.a.C42173a c42173a = (InterfaceC29354a.a.C42173a) interfaceC29354a;
                        this.f136994z.analyticsHelper.m93626a(new InterfaceC36274a.j(this.f136990E, ((ShippingMethodModels) c42173a.getData()).getAnalyticsPayload()));
                        ShippingMethod shippingMethod2 = (ShippingMethod) AbstractC25265s.m74100H0(((ShippingMethodModels) c42173a.getData()).getShippingMethods());
                        c32875cM103172i = new C32875c(this.f136992x, null, (ShippingMethodModels) c42173a.getData(), shippingMethod2 != null ? shippingMethod2.getId() : null, false, false, false, null, 242, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                        InterfaceC29354a.d dVar = (InterfaceC29354a.d) interfaceC29354a;
                        ShippingMethod shippingMethod3 = (ShippingMethod) AbstractC25265s.m74100H0(((ShippingMethodModels) dVar.getData()).getShippingMethods());
                        c32875cM103172i = new C32875c(this.f136992x, null, (ShippingMethodModels) dVar.getData(), shippingMethod3 != null ? shippingMethod3.getId() : null, false, false, false, null, 242, null);
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c32875cM103172i = this.f136994z.m103172i((InterfaceC29354a.c) interfaceC29354a, this.f136992x);
                    }
                    c42343a.f137001y = null;
                    c42343a.f136995E = null;
                    c42343a.f136996F = null;
                    c42343a.f136997G = null;
                    c42343a.f136998H = 0;
                    c42343a.f137000x = 1;
                    if (interfaceC13062m.emit(c32875cM103172i, c42343a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l, String str, boolean z4, C32876d c32876d, String str2) {
            this.f136986w = interfaceC13058l;
            this.f136987x = str;
            this.f136988y = z4;
            this.f136989z = c32876d;
            this.f136985E = str2;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f136986w.collect(new a(interfaceC13062m, this.f136987x, this.f136988y, this.f136989z, this.f136985E), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sp2.d$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.shippingmethod.domain.ShippingMethodInteractor$submitShippingMethod$$inlined$cacheAPI$1", m100430f = "ShippingMethodInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f137003w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f137004x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f137005y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f137006z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f137006z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<SubmitShippingMethodRequestBody> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            g gVar = new g(interfaceC30057d, this.f137006z);
            gVar.f137004x = interfaceC13062m;
            gVar.f137005y = c26832c;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f137003w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f137004x;
                C26832c c26832c = (C26832c) this.f137005y;
                InterfaceC26834e interfaceC26834e = this.f137006z;
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(SubmitShippingMethodRequestBody.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65691d);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(SubmitShippingMethodRequestBody.class), interfaceC21456a0M65691d, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d2 = AbstractC22671h0.m65691d(C23454a0.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65691d2, AbstractC21478l0.m60396B(interfaceC21456a0M65691d2)));
                this.f137004x = null;
                this.f137005y = null;
                this.f137003w = 1;
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
            return invoke((InterfaceC13062m) obj, (C26832c<SubmitShippingMethodRequestBody>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: sp2.d$h */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f137007w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f137008x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C32876d f137009y;

        /* JADX INFO: renamed from: sp2.d$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f137010w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ String f137011x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C32876d f137012y;

            /* JADX INFO: renamed from: sp2.d$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.shippingmethod.domain.ShippingMethodInteractor$submitShippingMethod$$inlined$map$1$2", m100430f = "ShippingMethodInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42344a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f137013E;

                /* JADX INFO: renamed from: F */
                Object f137014F;

                /* JADX INFO: renamed from: G */
                Object f137015G;

                /* JADX INFO: renamed from: H */
                int f137016H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f137017w;

                /* JADX INFO: renamed from: x */
                int f137018x;

                /* JADX INFO: renamed from: y */
                Object f137019y;

                public C42344a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f137017w = obj;
                    this.f137018x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, String str, C32876d c32876d) {
                this.f137010w = interfaceC13062m;
                this.f137011x = str;
                this.f137012y = c32876d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42344a c42344a;
                C32875c c32875cM103174k;
                if (interfaceC30057d instanceof C42344a) {
                    c42344a = (C42344a) interfaceC30057d;
                    int i13 = c42344a.f137018x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42344a.f137018x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42344a = new C42344a(interfaceC30057d);
                    }
                } else {
                    c42344a = new C42344a(interfaceC30057d);
                }
                Object obj2 = c42344a.f137017w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42344a.f137018x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f137010w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if ((interfaceC29354a instanceof InterfaceC29354a.e) || (interfaceC29354a instanceof InterfaceC29354a.a.b)) {
                        c32875cM103174k = new C32875c(this.f137011x, null, null, null, true, false, false, null, 238, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        c32875cM103174k = new C32875c(this.f137011x, InterfaceC32873a.f.f136935a, null, null, false, false, false, null, 236, null);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                        c32875cM103174k = new C32875c(this.f137011x, InterfaceC32873a.e.f136934a, null, null, false, false, false, null, 236, null);
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c32875cM103174k = this.f137012y.m103174k((InterfaceC29354a.c) interfaceC29354a, this.f137011x);
                    }
                    c42344a.f137019y = null;
                    c42344a.f137013E = null;
                    c42344a.f137014F = null;
                    c42344a.f137015G = null;
                    c42344a.f137016H = 0;
                    c42344a.f137018x = 1;
                    if (interfaceC13062m.emit(c32875cM103174k, c42344a) == enumC31071a) {
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

        public h(InterfaceC13058l interfaceC13058l, String str, C32876d c32876d) {
            this.f137007w = interfaceC13058l;
            this.f137008x = str;
            this.f137009y = c32876d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f137007w.collect(new a(interfaceC13062m, this.f137008x, this.f137009y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C32876d(InterfaceC26834e cachedApiSource, C30539a analyticsHelper) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.cachedApiSource = cachedApiSource;
        this.analyticsHelper = analyticsHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final C32875c m103171h(C32875c previousState, AbstractC32874b action) {
        return (!(action instanceof AbstractC32874b.a) && (action instanceof AbstractC32874b.b)) ? m103173j(previousState, ((AbstractC32874b.b) action).getShippingMethodId()) : previousState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final C32875c m103172i(InterfaceC29354a.c<ShippingMethodModels> cacheResult, String cartId) {
        return AbstractC29355b.m89462a(cacheResult) ? new C32875c(cartId, InterfaceC32873a.d.f136933a, null, null, false, false, false, null, 252, null) : new C32875c(cartId, InterfaceC32873a.c.f136932a, null, null, false, false, false, null, 252, null);
    }

    /* JADX INFO: renamed from: j */
    private final C32875c m103173j(C32875c previousState, String shippingMethodId) {
        return C32875c.m103156b(previousState, null, null, null, shippingMethodId, false, false, false, null, 247, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final C32875c m103174k(InterfaceC29354a.c<C23454a0> cacheResult, String cartId) {
        return AbstractC29355b.m89462a(cacheResult) ? new C32875c(cartId, InterfaceC32873a.e.f136934a, null, null, false, false, false, null, 236, null) : new C32875c(cartId, InterfaceC32873a.c.f136932a, null, null, false, false, false, null, 236, null);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m103175l(String cartId, String source, boolean manualRefresh) {
        return new f(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetShippingMethodRequest(cartId), 1), null, null, 3, null), new e(null, this.cachedApiSource)), cartId, manualRefresh, this, source);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ InterfaceC13058l m103176m(C32876d c32876d, String str, String str2, boolean z4, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        return c32876d.m103175l(str, str2, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final InterfaceC13058l m103177n(String cartId, String shippingMethodId) {
        return new h(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new SubmitShippingMethodRequest(cartId, new SubmitShippingMethodRequestBody(shippingMethodId)), 1), null, null, 3, null), new g(null, this.cachedApiSource)), cartId, this);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C32875c(null, InterfaceC32873a.b.f136931a, null, null, false, false, false, null, 253, null), AbstractC13091v.m36590P(upstream, new a(null, this)), new b(null));
    }
}
