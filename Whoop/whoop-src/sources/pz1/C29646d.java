package pz1;

import ao2.C1876a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.SmartAlarmTriggerRepository;
import com.whoop.nativestore.home.domain.api.GetShopHomeRequest;
import com.whoop.nativestore.home.domain.model.CartIndicator;
import com.whoop.nativestore.home.domain.model.NativeStoreResponse;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import l83.C23454a0;
import m83.AbstractC25260n;
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
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import xm0.C38458b;

/* JADX INFO: renamed from: pz1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0016\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Lpz1/d;", "Lod1/g;", "Lpz1/a;", "Lpz1/b;", "Lnm0/e;", "cachedApiSource", "Lao2/a;", "cartIndicatorRepository", "Lxm0/b;", "cacheUpdater", "<init>", "(Lnm0/e;Lao2/a;Lxm0/b;)V", "", "country", "source", "", "showCachedWhileUpdating", "Lec3/l;", "f", "(Ljava/lang/String;Ljava/lang/String;Z)Lec3/l;", "Lpm0/a;", "Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lpm0/a;Ljava/lang/String;Z)Lpz1/b;", "response", "Ll83/a0;", "g", "(Lcom/whoop/nativestore/home/domain/model/NativeStoreResponse;)V", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Lao2/a;", "c", "Lxm0/b;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29646d implements InterfaceC27844g<AbstractC29643a, C29644b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C1876a cartIndicatorRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C38458b cacheUpdater;

    /* JADX INFO: renamed from: pz1.d$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.nativestore.home.domain.NativeStoreInteractor$fetchShopHome$$inlined$cacheAPI$1", m100430f = "NativeStoreInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f121048w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f121049x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f121050y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f121051z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f121051z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f121051z);
            aVar.f121049x = interfaceC13062m;
            aVar.f121050y = c26832c;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f121048w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f121049x;
                C26832c c26832c = (C26832c) this.f121050y;
                InterfaceC26834e interfaceC26834e = this.f121051z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(NativeStoreResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(NativeStoreResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f121049x = null;
                this.f121050y = null;
                this.f121048w = 1;
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

    /* JADX INFO: renamed from: pz1.d$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f121052w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C29646d f121053x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f121054y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f121055z;

        /* JADX INFO: renamed from: pz1.d$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f121056w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C29646d f121057x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f121058y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ boolean f121059z;

            /* JADX INFO: renamed from: pz1.d$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.nativestore.home.domain.NativeStoreInteractor$fetchShopHome$$inlined$map$1$2", m100430f = "NativeStoreInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42202a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f121060E;

                /* JADX INFO: renamed from: F */
                Object f121061F;

                /* JADX INFO: renamed from: G */
                Object f121062G;

                /* JADX INFO: renamed from: H */
                int f121063H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f121064w;

                /* JADX INFO: renamed from: x */
                int f121065x;

                /* JADX INFO: renamed from: y */
                Object f121066y;

                public C42202a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f121064w = obj;
                    this.f121065x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C29646d c29646d, String str, boolean z4) {
                this.f121056w = interfaceC13062m;
                this.f121057x = c29646d;
                this.f121058y = str;
                this.f121059z = z4;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42202a c42202a;
                if (interfaceC30057d instanceof C42202a) {
                    c42202a = (C42202a) interfaceC30057d;
                    int i13 = c42202a.f121065x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42202a.f121065x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42202a = new C42202a(interfaceC30057d);
                    }
                } else {
                    c42202a = new C42202a(interfaceC30057d);
                }
                Object obj2 = c42202a.f121064w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42202a.f121065x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f121056w;
                    C29644b c29644bM91062h = this.f121057x.m91062h((InterfaceC29354a) obj, this.f121058y, this.f121059z);
                    c42202a.f121066y = null;
                    c42202a.f121060E = null;
                    c42202a.f121061F = null;
                    c42202a.f121062G = null;
                    c42202a.f121063H = 0;
                    c42202a.f121065x = 1;
                    if (interfaceC13062m.emit(c29644bM91062h, c42202a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C29646d c29646d, String str, boolean z4) {
            this.f121052w = interfaceC13058l;
            this.f121053x = c29646d;
            this.f121054y = str;
            this.f121055z = z4;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f121052w.collect(new a(interfaceC13062m, this.f121053x, this.f121054y, this.f121055z), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pz1.d$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.nativestore.home.domain.NativeStoreInteractor$interact$$inlined$flatMapLatest$1", m100430f = "NativeStoreInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f121068w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f121069x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f121070y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C29646d f121071z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C29646d c29646d) {
            super(3, interfaceC30057d);
            this.f121071z = c29646d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC29643a abstractC29643a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f121071z);
            cVar.f121069x = interfaceC13062m;
            cVar.f121070y = abstractC29643a;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f121068w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f121069x;
                AbstractC29643a abstractC29643a = (AbstractC29643a) this.f121070y;
                if (abstractC29643a instanceof AbstractC29643a.b) {
                    c13084s1 = this.f121071z.m91060f(null, ((AbstractC29643a.b) abstractC29643a).getSource(), true);
                } else {
                    if (!(abstractC29643a instanceof AbstractC29643a.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c13084s1 = new C13084s1(this.f121071z.new d(abstractC29643a, null));
                }
                this.f121069x = null;
                this.f121070y = null;
                this.f121068w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC29643a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: pz1.d$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.nativestore.home.domain.NativeStoreInteractor$interact$1$1", m100430f = "NativeStoreInteractor.kt", m100431l = {34, 35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lpz1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f121072w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f121073x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC29643a f121075z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC29643a abstractC29643a, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f121075z = abstractC29643a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C29646d.this.new d(this.f121075z, interfaceC30057d);
            dVar.f121073x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r0, r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f121073x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f121072w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r7)
                goto L59
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L36
            L20:
                p505ts.AbstractC34132o.m107864I(r7)
                pz1.d r7 = pz1.C29646d.this
                xm0.b r7 = pz1.C29646d.m91058d(r7)
                r6.f121073x = r0
                r6.f121072w = r4
                java.lang.String r2 = "ShopHomeRefreshScope"
                java.lang.Object r7 = r7.m123247a(r2, r6)
                if (r7 != r1) goto L36
                goto L58
            L36:
                pz1.d r7 = pz1.C29646d.this
                pz1.a r2 = r6.f121075z
                pz1.a$a r2 = (pz1.AbstractC29643a.a) r2
                java.lang.String r2 = r2.getCountry()
                pz1.a r4 = r6.f121075z
                pz1.a$a r4 = (pz1.AbstractC29643a.a) r4
                java.lang.String r4 = r4.getSource()
                r5 = 0
                ec3.l r7 = pz1.C29646d.m91057c(r7, r2, r4, r5)
                r2 = 0
                r6.f121073x = r2
                r6.f121072w = r3
                java.lang.Object r7 = ec3.AbstractC13091v.m36613w(r0, r7, r6)
                if (r7 != r1) goto L59
            L58:
                return r1
            L59:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: pz1.C29646d.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C29646d(InterfaceC26834e cachedApiSource, C1876a cartIndicatorRepository, C38458b cacheUpdater) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(cartIndicatorRepository, "cartIndicatorRepository");
        AbstractC22676k.m65750j(cacheUpdater, "cacheUpdater");
        this.cachedApiSource = cachedApiSource;
        this.cartIndicatorRepository = cartIndicatorRepository;
        this.cacheUpdater = cacheUpdater;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final InterfaceC13058l m91060f(String country, String source, boolean showCachedWhileUpdating) {
        return new b(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetShopHomeRequest(country, source), 1), AbstractC25260n.m74059b1(new String[]{SmartAlarmTriggerRepository.DEFAULT_REFRESH_SCOPE, "ShopHomeRefreshScope"}), null, 2, null), new a(null, this.cachedApiSource)), this, country, showCachedWhileUpdating);
    }

    /* JADX INFO: renamed from: g */
    private final void m91061g(NativeStoreResponse response) {
        CartIndicator cart = response.getCart();
        if (cart != null) {
            this.cartIndicatorRepository.m5654j(cart.getCartIndicatorQuantity(), cart.getDestination());
        } else {
            this.cartIndicatorRepository.m5651f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final C29644b m91062h(InterfaceC29354a<NativeStoreResponse> interfaceC29354a, String str, boolean z4) {
        if (interfaceC29354a instanceof InterfaceC29354a.e) {
            return new C29644b(AbstractC29645c.c.f121044a, str);
        }
        if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
            if (!z4) {
                return new C29644b(AbstractC29645c.c.f121044a, str);
            }
            InterfaceC29354a.a.b bVar = (InterfaceC29354a.a.b) interfaceC29354a;
            m91061g((NativeStoreResponse) bVar.getData());
            return new C29644b(new AbstractC29645c.b((NativeStoreResponse) bVar.getData(), true), str);
        }
        if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
            InterfaceC29354a.a.C42173a c42173a = (InterfaceC29354a.a.C42173a) interfaceC29354a;
            m91061g((NativeStoreResponse) c42173a.getData());
            return new C29644b(new AbstractC29645c.b((NativeStoreResponse) c42173a.getData(), false, 2, null), str);
        }
        if (interfaceC29354a instanceof InterfaceC29354a.d) {
            if (z4) {
                m91061g((NativeStoreResponse) ((InterfaceC29354a.d) interfaceC29354a).getData());
            }
            return new C29644b(new AbstractC29645c.b((NativeStoreResponse) ((InterfaceC29354a.d) interfaceC29354a).getData(), false, 2, null), str);
        }
        if (interfaceC29354a instanceof InterfaceC29354a.c) {
            return new C29644b(AbstractC29645c.a.f121041a, str);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new c(null, this));
    }
}
