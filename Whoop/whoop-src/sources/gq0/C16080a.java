package gq0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.community.data.network.BadgingGetRequest;
import com.whoop.community.data.network.BadgingResponse;
import com.whoop.data.repositories.FeatureFlagChecker;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import hj0.C17345d;
import j02.InterfaceC21142g;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import java.util.Set;
import l83.C23454a0;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27837a0;
import p007a6.C0456u;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
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
import wm0.C37378a;
import yp0.InterfaceC39700a;

/* JADX INFO: renamed from: gq0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Lgq0/a;", "Lj02/g;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lnm0/e;", "cachedApiSource", "Lwm0/a;", "scopeCoordinator", "Lhj0/d;", "applicationLifecycle", "Lod1/a0;", "userSessionManager", "Lyp0/a;", "communityAccessChecker", "Lbc3/c0;", "scope", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;Lnm0/e;Lwm0/a;Lhj0/d;Lod1/a0;Lyp0/a;Lbc3/c0;)V", "Lpm0/a;", "Lcom/whoop/community/data/network/BadgingResponse;", "", "d", "(Lpm0/a;)Z", "a", "Lyp0/a;", "Lec3/f2;", "b", "Lec3/f2;", "()Lec3/f2;", "showCommunityBadge", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16080a implements InterfaceC21142g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC39700a communityAccessChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13037f2 showCommunityBadge;

    /* JADX INFO: renamed from: gq0.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.community.domain.BadgingInteractor$2", m100430f = "BadgingInteractor.kt", m100431l = {66}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"", "it", "Ll83/a0;", "<anonymous>", "(Ljava/lang/Object;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f60816w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C37378a f60817x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C37378a c37378a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f60817x = c37378a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f60817x, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f60816w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C37378a c37378a = this.f60817x;
                this.f60816w = 1;
                if (c37378a.m119657b("BadgingRefreshScope", this) == enumC31071a) {
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

        @Override // c93.InterfaceC4351m
        public final Object invoke(Object obj, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(obj, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: gq0.a$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.community.domain.BadgingInteractor$showCommunityBadge$lambda$1$$inlined$cacheAPI$1", m100430f = "BadgingInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f60818w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f60819x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f60820y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f60821z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f60821z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f60821z);
            bVar.f60819x = interfaceC13062m;
            bVar.f60820y = c26832c;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f60818w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f60819x;
                C26832c c26832c = (C26832c) this.f60820y;
                InterfaceC26834e interfaceC26834e = this.f60821z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(BadgingResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(BadgingResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f60819x = null;
                this.f60820y = null;
                this.f60818w = 1;
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

    /* JADX INFO: renamed from: gq0.a$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f60822w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C16080a f60823x;

        /* JADX INFO: renamed from: gq0.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f60824w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C16080a f60825x;

            /* JADX INFO: renamed from: gq0.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.community.domain.BadgingInteractor$showCommunityBadge$lambda$1$$inlined$map$1$2", m100430f = "BadgingInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41658a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f60826E;

                /* JADX INFO: renamed from: F */
                Object f60827F;

                /* JADX INFO: renamed from: G */
                Object f60828G;

                /* JADX INFO: renamed from: H */
                int f60829H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f60830w;

                /* JADX INFO: renamed from: x */
                int f60831x;

                /* JADX INFO: renamed from: y */
                Object f60832y;

                public C41658a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f60830w = obj;
                    this.f60831x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C16080a c16080a) {
                this.f60824w = interfaceC13062m;
                this.f60825x = c16080a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41658a c41658a;
                if (interfaceC30057d instanceof C41658a) {
                    c41658a = (C41658a) interfaceC30057d;
                    int i13 = c41658a.f60831x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41658a.f60831x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41658a = new C41658a(interfaceC30057d);
                    }
                } else {
                    c41658a = new C41658a(interfaceC30057d);
                }
                Object obj2 = c41658a.f60830w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41658a.f60831x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f60824w;
                    Boolean boolValueOf = Boolean.valueOf(this.f60825x.m45428d((InterfaceC29354a) obj) && !this.f60825x.communityAccessChecker.mo31687a());
                    c41658a.f60832y = null;
                    c41658a.f60826E = null;
                    c41658a.f60827F = null;
                    c41658a.f60828G = null;
                    c41658a.f60829H = 0;
                    c41658a.f60831x = 1;
                    if (interfaceC13062m.emit(boolValueOf, c41658a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C16080a c16080a) {
            this.f60822w = interfaceC13058l;
            this.f60823x = c16080a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f60822w.collect(new a(interfaceC13062m, this.f60823x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: gq0.a$d */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f60834w;

        /* JADX INFO: renamed from: gq0.a$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f60835w;

            /* JADX INFO: renamed from: gq0.a$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.community.domain.BadgingInteractor$special$$inlined$filter$1$2", m100430f = "BadgingInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41659a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f60837F;

                /* JADX INFO: renamed from: G */
                Object f60838G;

                /* JADX INFO: renamed from: H */
                int f60839H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f60840w;

                /* JADX INFO: renamed from: x */
                int f60841x;

                /* JADX INFO: renamed from: y */
                Object f60842y;

                /* JADX INFO: renamed from: z */
                Object f60843z;

                public C41659a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f60840w = obj;
                    this.f60841x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f60835w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41659a c41659a;
                if (interfaceC30057d instanceof C41659a) {
                    c41659a = (C41659a) interfaceC30057d;
                    int i13 = c41659a.f60841x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41659a.f60841x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41659a = new C41659a(interfaceC30057d);
                    }
                } else {
                    c41659a = new C41659a(interfaceC30057d);
                }
                Object obj2 = c41659a.f60840w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41659a.f60841x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f60835w;
                    if (((Boolean) obj).booleanValue()) {
                        c41659a.f60842y = null;
                        c41659a.f60843z = null;
                        c41659a.f60837F = null;
                        c41659a.f60838G = null;
                        c41659a.f60839H = 0;
                        c41659a.f60841x = 1;
                        if (interfaceC13062m.emit(obj, c41659a) == enumC31071a) {
                            return enumC31071a;
                        }
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
            this.f60834w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f60834w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: gq0.a$e */
    @InterfaceC32271e(m100429c = "com.whoop.community.domain.BadgingInteractor$special$$inlined$flatMapLatest$1", m100430f = "BadgingInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C16080a f60844E;

        /* JADX INFO: renamed from: w */
        int f60845w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f60846x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f60847y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f60848z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e, C16080a c16080a) {
            super(3, interfaceC30057d);
            this.f60848z = interfaceC26834e;
            this.f60844E = c16080a;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, Boolean bool, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            e eVar = new e(interfaceC30057d, this.f60848z, this.f60844E);
            eVar.f60846x = interfaceC13062m;
            eVar.f60847y = bool;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f60845w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f60846x;
                InterfaceC13058l c0456u = !((Boolean) this.f60847y).booleanValue() ? new C0456u(Boolean.FALSE, 1) : new c(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new BadgingGetRequest(), 1), AbstractC12350b.m34570S("BadgingRefreshScope"), null, 2, null), new b(null, this.f60848z)), this.f60844E);
                this.f60846x = null;
                this.f60847y = null;
                this.f60845w = 1;
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
            return invoke((InterfaceC13062m) obj, (Boolean) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: gq0.a$f */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f60849w;

        /* JADX INFO: renamed from: gq0.a$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f60850w;

            /* JADX INFO: renamed from: gq0.a$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.community.domain.BadgingInteractor$special$$inlined$map$1$2", m100430f = "BadgingInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41660a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f60851E;

                /* JADX INFO: renamed from: F */
                Object f60852F;

                /* JADX INFO: renamed from: G */
                Object f60853G;

                /* JADX INFO: renamed from: H */
                int f60854H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f60855w;

                /* JADX INFO: renamed from: x */
                int f60856x;

                /* JADX INFO: renamed from: y */
                Object f60857y;

                public C41660a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f60855w = obj;
                    this.f60856x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f60850w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41660a c41660a;
                if (interfaceC30057d instanceof C41660a) {
                    c41660a = (C41660a) interfaceC30057d;
                    int i13 = c41660a.f60856x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41660a.f60856x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41660a = new C41660a(interfaceC30057d);
                    }
                } else {
                    c41660a = new C41660a(interfaceC30057d);
                }
                Object obj2 = c41660a.f60855w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41660a.f60856x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f60850w;
                    Boolean boolValueOf = Boolean.valueOf(((Set) obj).contains("badging_community_tab"));
                    c41660a.f60857y = null;
                    c41660a.f60851E = null;
                    c41660a.f60852F = null;
                    c41660a.f60853G = null;
                    c41660a.f60854H = 0;
                    c41660a.f60856x = 1;
                    if (interfaceC13062m.emit(boolValueOf, c41660a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l) {
            this.f60849w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f60849w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C16080a(FeatureFlagChecker featureFlagChecker, InterfaceC26834e cachedApiSource, C37378a scopeCoordinator, C17345d applicationLifecycle, InterfaceC27837a0 userSessionManager, InterfaceC39700a communityAccessChecker, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        AbstractC22676k.m65750j(applicationLifecycle, "applicationLifecycle");
        AbstractC22676k.m65750j(userSessionManager, "userSessionManager");
        AbstractC22676k.m65750j(communityAccessChecker, "communityAccessChecker");
        AbstractC22676k.m65750j(scope, "scope");
        this.communityAccessChecker = communityAccessChecker;
        this.showCommunityBadge = AbstractC13091v.m36587M(AbstractC13091v.m36590P(AbstractC13091v.m36610t(new f(featureFlagChecker.getFeatureFlagsFlow())), new e(null, cachedApiSource, this)), scope, C13105z1.f45288a, Boolean.FALSE);
        AbstractC13091v.m36582H(new C13052j1(AbstractC13091v.m36584J(new d(AbstractC13091v.m36612v(applicationLifecycle.getAppForegroundFlow(), 1)), userSessionManager.getLoginFlow()), new a(scopeCoordinator, null), 0), scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final boolean m45428d(InterfaceC29354a<BadgingResponse> interfaceC29354a) {
        if (interfaceC29354a instanceof InterfaceC29354a.a) {
            return ((BadgingResponse) ((InterfaceC29354a.a) interfaceC29354a).getData()).getShowCommunityBadge();
        }
        if (interfaceC29354a instanceof InterfaceC29354a.d) {
            return ((BadgingResponse) ((InterfaceC29354a.d) interfaceC29354a).getData()).getShowCommunityBadge();
        }
        return false;
    }

    @Override // j02.InterfaceC21142g
    /* JADX INFO: renamed from: a, reason: from getter */
    public InterfaceC13037f2 getShowCommunityBadge() {
        return this.showCommunityBadge;
    }
}
