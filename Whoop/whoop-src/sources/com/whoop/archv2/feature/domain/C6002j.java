package com.whoop.archv2.feature.domain;

import com.whoop.archv2.model.template.AnyScreenTemplate;
import com.whoop.archv2.model.template.ScreenTemplate;
import com.whoop.cache.api.prefetch.PrefetchList;
import com.whoop.design.models.modal.LifecycleInteractions;
import com.whoop.navigation.CachePolicyModel;
import com.whoop.network.request.GetApiRequest;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;
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
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pi0.C29249a;
import pm0.AbstractC29355b;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;

/* JADX INFO: renamed from: com.whoop.archv2.feature.domain.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/j;", "Lod1/g;", "Lpi0/a;", "Lcom/whoop/archv2/feature/domain/f;", "Lnm0/e;", "cachedApiSource", "Lcom/whoop/navigation/CachePolicyModel;", "cachePolicyModel", "", "requestName", "<init>", "(Lnm0/e;Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;)V", "request", "Lec3/l;", "e", "(Lpi0/a;)Lec3/l;", "Lpm0/a;", "Lcom/whoop/archv2/model/template/AnyScreenTemplate;", "g", "(Lpm0/a;)Lcom/whoop/archv2/feature/domain/f;", "Lpm0/a$c;", "cacheResult", "f", "(Lpm0/a$c;)Lcom/whoop/archv2/feature/domain/f;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Lcom/whoop/navigation/CachePolicyModel;", "c", "Ljava/lang/String;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C6002j implements InterfaceC27844g<C29249a, C5998f> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final CachePolicyModel cachePolicyModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String requestName;

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.j$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericScreenFetchCachedInteractor$fetchScreen$$inlined$cacheAPI$1", m100430f = "GenericScreenFetchCachedInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f23956w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f23957x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f23958y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f23959z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f23959z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f23959z);
            aVar.f23957x = interfaceC13062m;
            aVar.f23958y = c26832c;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f23956w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f23957x;
                C26832c c26832c = (C26832c) this.f23958y;
                InterfaceC26834e interfaceC26834e = this.f23959z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(AnyScreenTemplate.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(AnyScreenTemplate.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f23957x = null;
                this.f23958y = null;
                this.f23956w = 1;
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

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.j$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f23960w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C6002j f23961x;

        /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.j$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f23962w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C6002j f23963x;

            /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.j$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericScreenFetchCachedInteractor$fetchScreen$$inlined$map$1$2", m100430f = "GenericScreenFetchCachedInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41378a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f23964E;

                /* JADX INFO: renamed from: F */
                Object f23965F;

                /* JADX INFO: renamed from: G */
                Object f23966G;

                /* JADX INFO: renamed from: H */
                int f23967H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f23968w;

                /* JADX INFO: renamed from: x */
                int f23969x;

                /* JADX INFO: renamed from: y */
                Object f23970y;

                public C41378a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f23968w = obj;
                    this.f23969x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C6002j c6002j) {
                this.f23962w = interfaceC13062m;
                this.f23963x = c6002j;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41378a c41378a;
                if (interfaceC30057d instanceof C41378a) {
                    c41378a = (C41378a) interfaceC30057d;
                    int i13 = c41378a.f23969x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41378a.f23969x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41378a = new C41378a(interfaceC30057d);
                    }
                } else {
                    c41378a = new C41378a(interfaceC30057d);
                }
                Object obj2 = c41378a.f23968w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41378a.f23969x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f23962w;
                    C5998f c5998fM18022g = this.f23963x.m18022g((InterfaceC29354a) obj);
                    c41378a.f23970y = null;
                    c41378a.f23964E = null;
                    c41378a.f23965F = null;
                    c41378a.f23966G = null;
                    c41378a.f23967H = 0;
                    c41378a.f23969x = 1;
                    if (interfaceC13062m.emit(c5998fM18022g, c41378a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C6002j c6002j) {
            this.f23960w = interfaceC13058l;
            this.f23961x = c6002j;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f23960w.collect(new a(interfaceC13062m, this.f23961x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.j$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericScreenFetchCachedInteractor$interact$$inlined$flatMapLatest$1", m100430f = "GenericScreenFetchCachedInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f23972w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f23973x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f23974y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C6002j f23975z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C6002j c6002j) {
            super(3, interfaceC30057d);
            this.f23975z = c6002j;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C29249a c29249a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f23975z);
            cVar.f23973x = interfaceC13062m;
            cVar.f23974y = c29249a;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f23972w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f23973x;
                InterfaceC13058l interfaceC13058lM18020e = this.f23975z.m18020e((C29249a) this.f23974y);
                this.f23973x = null;
                this.f23974y = null;
                this.f23972w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM18020e, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (C29249a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    public C6002j(InterfaceC26834e cachedApiSource, CachePolicyModel cachePolicyModel, String requestName) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(cachePolicyModel, "cachePolicyModel");
        AbstractC22676k.m65750j(requestName, "requestName");
        this.cachedApiSource = cachedApiSource;
        this.cachePolicyModel = cachePolicyModel;
        this.requestName = requestName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public final InterfaceC13058l m18020e(C29249a request) {
        GetApiRequest getApiRequestM17877a = GenericScreenFetchInteractorKt.m17877a(request, this.requestName);
        Set<String> scopes = this.cachePolicyModel.getScopes();
        String cacheKey = request.getCacheKey();
        if (cacheKey == null) {
            cacheKey = this.cachePolicyModel.getCacheKey();
        }
        return new b(AbstractC13091v.m36590P(AbstractC32714a.m102669a(new C0456u(getApiRequestM17877a, 1), scopes, cacheKey), new a(null, this.cachedApiSource)), this);
    }

    /* JADX INFO: renamed from: f */
    private final C5998f m18021f(InterfaceC29354a.c<AnyScreenTemplate> cacheResult) {
        return AbstractC29355b.m89462a(cacheResult) ? new C5998f(new InterfaceC5994b.d(cacheResult.getHttpStatusCode()), null, false, false, false, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 524286, null) : new C5998f(InterfaceC5994b.c.f23690a, null, false, false, false, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 524286, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final C5998f m18022g(InterfaceC29354a<AnyScreenTemplate> interfaceC29354a) {
        int i13 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        if (interfaceC29354a instanceof InterfaceC29354a.e) {
            return new C5998f(new InterfaceC5994b.b(null, 1, null), null, false, false, false, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 524286, null);
        }
        if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
            InterfaceC29354a.a.b bVar = (InterfaceC29354a.a.b) interfaceC29354a;
            ScreenTemplate template = ((AnyScreenTemplate) bVar.getData()).getTemplate();
            LifecycleInteractions lifecycleInteractions = ((AnyScreenTemplate) bVar.getData()).getLifecycleInteractions();
            if (lifecycleInteractions == null) {
                lifecycleInteractions = template.getLifecycleInteractions();
            }
            PrefetchList prefetchList = ((AnyScreenTemplate) bVar.getData()).getPrefetchList();
            if (prefetchList == null) {
                prefetchList = new PrefetchList((List) (objArr6 == true ? 1 : 0), i13, (DefaultConstructorMarker) (objArr5 == true ? 1 : 0));
            }
            return new C5998f(null, template, false, true, true, null, null, null, null, lifecycleInteractions != null ? lifecycleInteractions.getSystemBackDisabled() : false, null, prefetchList, null, null, null, null, null, null, null, 521701, null);
        }
        if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
            InterfaceC29354a.a.C42173a c42173a = (InterfaceC29354a.a.C42173a) interfaceC29354a;
            ScreenTemplate template2 = ((AnyScreenTemplate) c42173a.getData()).getTemplate();
            LifecycleInteractions lifecycleInteractions2 = ((AnyScreenTemplate) c42173a.getData()).getLifecycleInteractions();
            if (lifecycleInteractions2 == null) {
                lifecycleInteractions2 = template2.getLifecycleInteractions();
            }
            PrefetchList prefetchList2 = ((AnyScreenTemplate) c42173a.getData()).getPrefetchList();
            if (prefetchList2 == null) {
                prefetchList2 = new PrefetchList((List) (objArr4 == true ? 1 : 0), i13, (DefaultConstructorMarker) (objArr3 == true ? 1 : 0));
            }
            return new C5998f(null, template2, false, false, false, null, null, null, lifecycleInteractions2 != null ? lifecycleInteractions2.getOnStart() : null, lifecycleInteractions2 != null ? lifecycleInteractions2.getSystemBackDisabled() : false, null, prefetchList2, null, null, null, null, null, null, null, 521469, null);
        }
        if (!(interfaceC29354a instanceof InterfaceC29354a.d)) {
            if (interfaceC29354a instanceof InterfaceC29354a.c) {
                return m18021f((InterfaceC29354a.c) interfaceC29354a);
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC29354a.d dVar = (InterfaceC29354a.d) interfaceC29354a;
        ScreenTemplate template3 = ((AnyScreenTemplate) dVar.getData()).getTemplate();
        PrefetchList prefetchList3 = ((AnyScreenTemplate) dVar.getData()).getPrefetchList();
        if (prefetchList3 == null) {
            prefetchList3 = new PrefetchList((List) (objArr2 == true ? 1 : 0), i13, (DefaultConstructorMarker) (objArr == true ? 1 : 0));
        }
        return new C5998f(null, template3, false, false, false, null, null, null, null, false, null, prefetchList3, null, null, null, null, null, null, null, 522237, null);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new c(null, this));
    }
}
