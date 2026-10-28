package nm0;

import com.whoop.data.repositories.FeatureFlagChecker;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.lang.reflect.Type;
import kotlinx.serialization.SerializationException;
import l83.C23454a0;
import mm0.C25683b;
import ne3.C26624l;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import qm0.C30478a;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vm0.InterfaceC36149g;
import xm0.C38458b;
import xm0.InterfaceC38457a;
import ym0.AbstractC39649b;

/* JADX INFO: renamed from: nm0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\f2\b\u0010\r\u001a\u0004\u0018\u00018\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018JI\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u001a\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0019\u001a\u00020\u00152\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001a¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010%¨\u0006&"}, m65681d2 = {"Lnm0/d;", "", "Lqm0/a;", "cacheDecoder", "Lxm0/b;", "cacheUpdater", "Lvm0/g;", "cacheReporter", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lqm0/a;Lxm0/b;Lvm0/g;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "ResponseT", "cachedData", "Lxm0/a;", "apiStreamResult", "Lpm0/a;", "d", "(Ljava/lang/Object;Lxm0/a;)Lpm0/a;", "Lmm0/b;", "entry", "Ls63/a;", "type", "e", "(Lmm0/b;Ls63/a;Lq83/d;)Ljava/lang/Object;", "responseTypeInfo", "Lec3/l;", "apiStreamResultFlow", "Lym0/b;", "cacheStreamResultFlow", "c", "(Ls63/a;Lec3/l;Lec3/l;)Lec3/l;", "a", "Lqm0/a;", "b", "Lxm0/b;", "Lvm0/g;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26833d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C30478a cacheDecoder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C38458b cacheUpdater;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC36149g cacheReporter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: nm0.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.cache.api.CacheResultCombiner$combine$$inlined$flatMapLatest$1", m100430f = "CacheResultCombiner.kt", m100431l = {190, 189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C26833d f107045E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C32236a f107046F;

        /* JADX INFO: renamed from: G */
        Object f107047G;

        /* JADX INFO: renamed from: H */
        Object f107048H;

        /* JADX INFO: renamed from: I */
        Object f107049I;

        /* JADX INFO: renamed from: J */
        Object f107050J;

        /* JADX INFO: renamed from: K */
        int f107051K;

        /* JADX INFO: renamed from: L */
        int f107052L;

        /* JADX INFO: renamed from: w */
        int f107053w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f107054x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f107055y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC13058l f107056z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, InterfaceC13058l interfaceC13058l, C26833d c26833d, C32236a c32236a) {
            super(3, interfaceC30057d);
            this.f107056z = interfaceC13058l;
            this.f107045E = c26833d;
            this.f107046F = c32236a;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC39649b abstractC39649b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f107056z, this.f107045E, this.f107046F);
            aVar.f107054x = interfaceC13062m;
            aVar.f107055y = abstractC39649b;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r1, r5, r8) == r0) goto L21;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r8.f107053w
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L36
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r8.f107054x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r9)
                goto L8d
            L16:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1e:
                java.lang.Object r1 = r8.f107050J
                ym0.b$a r1 = (ym0.AbstractC39649b.a) r1
                java.lang.Object r1 = r8.f107049I
                ym0.b r1 = (ym0.AbstractC39649b) r1
                java.lang.Object r1 = r8.f107048H
                q83.d r1 = (q83.InterfaceC30057d) r1
                java.lang.Object r1 = r8.f107047G
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r3 = r8.f107054x
                ec3.m r3 = (ec3.InterfaceC13062m) r3
                p505ts.AbstractC34132o.m107864I(r9)
                goto L6f
            L36:
                p505ts.AbstractC34132o.m107864I(r9)
                java.lang.Object r9 = r8.f107054x
                r1 = r9
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r9 = r8.f107055y
                ym0.b r9 = (ym0.AbstractC39649b) r9
                boolean r5 = r9 instanceof ym0.AbstractC39649b.a
                if (r5 == 0) goto L49
                ym0.b$a r9 = (ym0.AbstractC39649b.a) r9
                goto L4a
            L49:
                r9 = r4
            L4a:
                if (r9 == 0) goto L6e
                nm0.d r5 = r8.f107045E
                mm0.b r9 = r9.getEntry()
                s63.a r6 = r8.f107046F
                r8.f107054x = r4
                r8.f107055y = r4
                r8.f107047G = r1
                r8.f107048H = r4
                r8.f107049I = r4
                r8.f107050J = r4
                r7 = 0
                r8.f107051K = r7
                r8.f107052L = r7
                r8.f107053w = r3
                java.lang.Object r9 = nm0.C26833d.m80079b(r5, r9, r6, r8)
                if (r9 != r0) goto L6f
                goto L8c
            L6e:
                r9 = r4
            L6f:
                ec3.l r3 = r8.f107056z
                nm0.d$b r5 = new nm0.d$b
                nm0.d r6 = r8.f107045E
                r5.<init>(r3, r6, r9)
                r8.f107054x = r4
                r8.f107055y = r4
                r8.f107047G = r4
                r8.f107048H = r4
                r8.f107049I = r4
                r8.f107050J = r4
                r8.f107053w = r2
                java.lang.Object r9 = ec3.AbstractC13091v.m36613w(r1, r5, r8)
                if (r9 != r0) goto L8d
            L8c:
                return r0
            L8d:
                l83.a0 r9 = l83.C23454a0.f92919a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: nm0.C26833d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC39649b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: nm0.d$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f107057w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C26833d f107058x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Object f107059y;

        /* JADX INFO: renamed from: nm0.d$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f107060w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C26833d f107061x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ Object f107062y;

            /* JADX INFO: renamed from: nm0.d$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.cache.api.CacheResultCombiner$combine$lambda$0$$inlined$map$1$2", m100430f = "CacheResultCombiner.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42066a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f107063E;

                /* JADX INFO: renamed from: F */
                Object f107064F;

                /* JADX INFO: renamed from: G */
                Object f107065G;

                /* JADX INFO: renamed from: H */
                int f107066H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f107067w;

                /* JADX INFO: renamed from: x */
                int f107068x;

                /* JADX INFO: renamed from: y */
                Object f107069y;

                public C42066a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f107067w = obj;
                    this.f107068x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C26833d c26833d, Object obj) {
                this.f107060w = interfaceC13062m;
                this.f107061x = c26833d;
                this.f107062y = obj;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42066a c42066a;
                if (interfaceC30057d instanceof C42066a) {
                    c42066a = (C42066a) interfaceC30057d;
                    int i13 = c42066a.f107068x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42066a.f107068x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42066a = new C42066a(interfaceC30057d);
                    }
                } else {
                    c42066a = new C42066a(interfaceC30057d);
                }
                Object obj2 = c42066a.f107067w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42066a.f107068x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f107060w;
                    InterfaceC29354a interfaceC29354aM80080d = this.f107061x.m80080d(this.f107062y, (InterfaceC38457a) obj);
                    c42066a.f107069y = null;
                    c42066a.f107063E = null;
                    c42066a.f107064F = null;
                    c42066a.f107065G = null;
                    c42066a.f107066H = 0;
                    c42066a.f107068x = 1;
                    if (interfaceC13062m.emit(interfaceC29354aM80080d, c42066a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C26833d c26833d, Object obj) {
            this.f107057w = interfaceC13058l;
            this.f107058x = c26833d;
            this.f107059y = obj;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f107057w.collect(new a(interfaceC13062m, this.f107058x, this.f107059y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: nm0.d$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.cache.api.CacheResultCombiner", m100430f = "CacheResultCombiner.kt", m100431l = {67, 70, 73}, m100432m = "decodeOrEvict", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c<ResponseT> extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f107072F;

        /* JADX INFO: renamed from: w */
        Object f107073w;

        /* JADX INFO: renamed from: x */
        Object f107074x;

        /* JADX INFO: renamed from: y */
        Object f107075y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f107076z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f107076z = obj;
            this.f107072F |= Integer.MIN_VALUE;
            return C26833d.this.m80081e(null, null, this);
        }
    }

    public C26833d(C30478a cacheDecoder, C38458b cacheUpdater, InterfaceC36149g cacheReporter, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(cacheDecoder, "cacheDecoder");
        AbstractC22676k.m65750j(cacheUpdater, "cacheUpdater");
        AbstractC22676k.m65750j(cacheReporter, "cacheReporter");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.cacheDecoder = cacheDecoder;
        this.cacheUpdater = cacheUpdater;
        this.cacheReporter = cacheReporter;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final <ResponseT> InterfaceC29354a<ResponseT> m80080d(ResponseT cachedData, InterfaceC38457a<ResponseT> apiStreamResult) {
        if (apiStreamResult instanceof InterfaceC38457a.b) {
            return cachedData != null ? new InterfaceC29354a.a.b(cachedData) : new InterfaceC29354a.e(0);
        }
        if (!(apiStreamResult instanceof InterfaceC38457a.a)) {
            if (apiStreamResult instanceof InterfaceC38457a.c) {
                return new InterfaceC29354a.a.C42173a(((InterfaceC38457a.c) apiStreamResult).m123246a());
            }
            throw new IllegalStateException("Unaccounted ApiStreamResult: " + apiStreamResult);
        }
        InterfaceC38457a.a.b bVar = apiStreamResult instanceof InterfaceC38457a.a.b ? (InterfaceC38457a.a.b) apiStreamResult : null;
        int httpStatusCode = bVar != null ? bVar.getHttpStatusCode() : 0;
        if (cachedData != null) {
            return new InterfaceC29354a.d(((InterfaceC38457a.a) apiStreamResult).getErrorMessage(), httpStatusCode, cachedData);
        }
        if (apiStreamResult instanceof InterfaceC38457a.a.C42658a) {
            this.cacheReporter.mo114992e();
        } else {
            this.cacheReporter.mo114994g(httpStatusCode);
        }
        return new InterfaceC29354a.c(((InterfaceC38457a.a) apiStreamResult).getErrorMessage(), httpStatusCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final <ResponseT> Object m80081e(C25683b c25683b, C32236a c32236a, InterfaceC30057d<? super ResponseT> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f107072F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f107072F = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f107076z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f107072F;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                if (i14 == 2) {
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return null;
            }
            AbstractC34132o.m107864I(obj);
            if (this.featureFlagChecker.isFeatureEnabled("bff-cache-persistence")) {
                C30478a c30478a = this.cacheDecoder;
                C26624l data = c25683b.getData();
                Type type = c32236a.f133489b;
                cVar.f107073w = c25683b;
                cVar.f107074x = null;
                cVar.f107072F = 2;
                Object objM93288b = c30478a.m93288b(data, type, cVar);
                if (objM93288b != enumC31071a) {
                    return objM93288b;
                }
            } else {
                C30478a c30478a2 = this.cacheDecoder;
                C26624l data2 = c25683b.getData();
                Type type2 = c32236a.f133489b;
                cVar.f107073w = null;
                cVar.f107074x = null;
                cVar.f107072F = 1;
                Object objM93288b2 = c30478a2.m93288b(data2, type2, cVar);
                if (objM93288b2 != enumC31071a) {
                    return objM93288b2;
                }
            }
            return enumC31071a;
        } catch (SerializationException e5) {
            this.cacheReporter.mo114988a(c25683b.getUri(), e5);
            C38458b c38458b = this.cacheUpdater;
            String uri = c25683b.getUri();
            cVar.f107073w = null;
            cVar.f107074x = null;
            cVar.f107075y = null;
            cVar.f107072F = 3;
            if (c38458b.m123248b(uri, cVar) == enumC31071a) {
                return enumC31071a;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final <ResponseT> InterfaceC13058l m80082c(C32236a responseTypeInfo, InterfaceC13058l apiStreamResultFlow, InterfaceC13058l cacheStreamResultFlow) {
        AbstractC22676k.m65750j(responseTypeInfo, "responseTypeInfo");
        AbstractC22676k.m65750j(apiStreamResultFlow, "apiStreamResultFlow");
        AbstractC22676k.m65750j(cacheStreamResultFlow, "cacheStreamResultFlow");
        return AbstractC13091v.m36590P(cacheStreamResultFlow, new a(null, apiStreamResultFlow, this, responseTypeInfo));
    }
}
